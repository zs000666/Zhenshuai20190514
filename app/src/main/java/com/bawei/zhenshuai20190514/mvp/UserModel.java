package com.bawei.zhenshuai20190514.mvp;

import com.bawei.zhenshuai20190514.net.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class UserModel implements IMainController.MainModel {
private String url="http://172.17.8.100/movieApi/cinema/v1/findRecommendCinemas?page=1&count=10";
    private HttpUtils httpUtils;

    private IMainController.MainView view;
    private IMainController.Presenter presenter;

    public UserModel() {
       httpUtils=HttpUtils.utils();
    }

    @Override
    public void http(String url, HttpUtils.CallBack back) {
        httpUtils.doHttpGet(url,back);
    }
}
