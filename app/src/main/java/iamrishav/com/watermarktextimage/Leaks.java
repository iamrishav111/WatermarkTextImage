package iamrishav.com.watermarktextimage;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class Leaks extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
