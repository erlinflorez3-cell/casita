package com.incode.welcome_sdk.commons.extensions;

import android.os.Build;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5118a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5119e = 1;

    public static final void a(AppCompatActivity appCompatActivity) {
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT < 27) {
            Window window = appCompatActivity.getWindow();
            if (window != null) {
                int i3 = f5119e + 85;
                f5118a = i3 % 128;
                int i4 = i3 % 2;
                window.addFlags(524288);
                int i5 = f5118a + 51;
                f5119e = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        int i7 = f5118a + 35;
        f5119e = i7 % 128;
        appCompatActivity.setShowWhenLocked(i7 % 2 != 0);
    }
}
