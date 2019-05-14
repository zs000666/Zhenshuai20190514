package com.bawei.zhenshuai20190514.mvp;

import com.bawei.zhenshuai20190514.net.HttpUtils;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class UserPresenter implements IMainController.Presenter {
     private IMainController.MainView view;
     private IMainController.MainModel model;
    @Override
    public void attach(IMainController.MainView view) {
            view=this.view;
            model=new UserModel();
    }

    @Override
    public void patach() {
            if (view!=null){
                view=null;
            }
            if (model!=null){
                model=null;
            }
    }

    @Override
    public void requestshow(String url) {
        model.http(url, new HttpUtils.CallBack() {
            @Override
            public void onSuccess(String result) {
                view.showList(result);
            }

            @Override
            public void onFail(String result) {

            }
        });
    }

}
