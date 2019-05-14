package com.bawei.zhenshuai20190514.mvp;

import com.bawei.zhenshuai20190514.net.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public interface IMainController {
     //M
    public interface MainModel{
        void http(String url, HttpUtils.CallBack back);
     }
     //V
    public interface MainView{

         void showList(String result);
     }
     //p
    public interface Presenter{
        void attach(MainView view);
        void patach();

        void requestshow(String url);
     }
}
