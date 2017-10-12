package com.nice.wlg.nicereo;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by wulige on 2017/10/12.
 */

public class NiceReoApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		OkGo.getInstance().init(this);
	}
}
