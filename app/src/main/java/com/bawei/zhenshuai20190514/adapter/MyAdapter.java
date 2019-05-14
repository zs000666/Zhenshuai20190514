package com.bawei.zhenshuai20190514.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.zhenshuai20190514.R;
import com.bawei.zhenshuai20190514.bean.Bean;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class MyAdapter extends BaseAdapter {
    private ArrayList<Bean> list;
    private Context context;

    public MyAdapter(ArrayList<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.item_layout,null);
            holder=new ViewHolder();
            holder.imageView.findViewById(R.id.img);
            holder.textView1.findViewById(R.id.tv);
            holder.textView2.findViewById(R.id.tvs);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
            Bean bean=list.get(position);
            Glide.with(context).load(bean.getLogo()).into(holder.imageView);
            holder.textView1.setText(bean.getAddress());
            holder.textView2.setText(bean.getName());
        }
        return convertView;
    }
class ViewHolder{
        ImageView imageView;
        TextView textView1;
        TextView textView2;
}
}
