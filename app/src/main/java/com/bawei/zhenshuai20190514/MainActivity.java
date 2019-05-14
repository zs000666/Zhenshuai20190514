package com.bawei.zhenshuai20190514;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bawei.zhenshuai20190514.adapter.MyAdapter;
import com.bawei.zhenshuai20190514.bean.Bean;
import com.bawei.zhenshuai20190514.mvp.IMainController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IMainController.MainView {

    private ListView lv;
private IMainController.Presenter presenter;
private IMainController.MainModel model;
    private ArrayList<Bean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
    }

    @Override
    public void showList(String result) {
        try {
            JSONObject object=new JSONObject();
            JSONArray results = object.getJSONArray("result");
            list = new ArrayList<>();
            for (int i = 0; i <results.length(); i++) {
                JSONObject obj= (JSONObject) results.get(i);
                String address = obj.getString("address");
                String logo = obj.getString("logo");
                String name = obj.getString("name");
                list.add(new Bean(address,logo,name));
            }
            MyAdapter adapter=new MyAdapter(list,MainActivity.this);
            lv.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
