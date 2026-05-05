package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes9.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        SplitCompat.install(this);
    }

    @Override // android.app.Application
    public /* synthetic */ void onCreate() {
        Callback.onCreate(this);
        super.onCreate();
    }
}
