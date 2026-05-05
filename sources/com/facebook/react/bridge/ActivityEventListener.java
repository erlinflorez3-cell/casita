package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i2, int i3, Intent intent);

    void onNewIntent(Intent intent);

    default void onUserLeaveHint(Activity activity) {
    }
}
