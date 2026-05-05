package androidx.multidex;

import android.app.Application;
import android.content.Context;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes4.dex */
public class MultiDexApplication extends Application {
    @Override // android.app.Application
    public /* synthetic */ void onCreate() {
        Callback.onCreate(this);
        super.onCreate();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
