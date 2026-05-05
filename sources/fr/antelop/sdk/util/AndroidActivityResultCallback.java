package fr.antelop.sdk.util;

import android.content.Intent;
import o.ea.j;

/* JADX INFO: loaded from: classes5.dex */
public final class AndroidActivityResultCallback {
    private final j innerAndroidActivityResultCallback;

    public AndroidActivityResultCallback(j jVar) {
        this.innerAndroidActivityResultCallback = jVar;
    }

    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return this.innerAndroidActivityResultCallback.b(i2, i3, intent);
    }
}
