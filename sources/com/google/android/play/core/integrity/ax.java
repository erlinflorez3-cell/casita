package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f3371a = null;

    static synchronized aw a(Context context) {
        if (f3371a == null) {
            u uVar = new u(null);
            uVar.a(com.google.android.play.integrity.internal.ag.a(context));
            f3371a = uVar.b();
        }
        return f3371a;
    }
}
