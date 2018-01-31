package leifu.customtoast;

import android.app.Application;

import leifu.toastlibrary.CustomToast;

/**
 * 创建人: 雷富
 * 创建时间: 2018/1/31 17:01
 * 描述:
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CustomToast.init(this);
    }
}
