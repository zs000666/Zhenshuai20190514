package com.bawei.zhenshuai20190514.net;

import android.os.AsyncTask;

import com.google.common.io.CharStreams;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class HttpUtils {
     //单例
     private static HttpUtils httpUtils=new HttpUtils();

     public static HttpUtils utils(){
         return httpUtils;
     }

    private HttpUtils() {
    }
    //数据请求
    public void  doHttpGet(String url, final CallBack back){
         new AsyncTask<String,Void,String>(){
             @Override
             protected String doInBackground(String... strings) {
                 HttpURLConnection connection=null;
                 try {
                     URL url1=new URL(strings[0]);
                     connection= (HttpURLConnection) url1.openConnection();
                     connection.setRequestMethod("GET");
                     connection.setConnectTimeout(5000);
                     connection.setReadTimeout(5000);
                     if (connection.getResponseCode()==200){
                         return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
                     }
                 } catch (Exception e) {
                     e.printStackTrace();
                     back.onFail(e.getMessage());
                 }
                 return null;
             }
             @Override
             protected void onPostExecute(String s) {
                 super.onPostExecute(s);
                 back.onSuccess(s);
             }
         }.execute(url);
    }
    public interface CallBack{
         void onSuccess(String result);
         void onFail(String result);
    }
}
