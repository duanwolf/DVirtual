package com.dvirtual;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by duanbiwei on 2017/6/3.
 */

public class DVirtualApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
//        FontsOverride.setDefaultFont(this, "DEFAULT", "font/HYQiHei-45S.otf");
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("font/HYQiHei-45S.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
