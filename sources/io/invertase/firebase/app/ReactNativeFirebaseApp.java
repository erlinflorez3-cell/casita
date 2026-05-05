package io.invertase.firebase.app;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseApp {
    private static Context applicationContext = null;

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initializeSecondaryApp(String str) {
        FirebaseApp.initializeApp(applicationContext, FirebaseOptions.fromResource(applicationContext), str);
    }

    public static void initializeSecondaryApp(String str, Context context) {
        FirebaseApp.initializeApp(context, FirebaseOptions.fromResource(context), str);
    }

    public static void setApplicationContext(Context context) {
        applicationContext = context;
    }
}
