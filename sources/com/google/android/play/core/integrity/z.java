package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f3455a = null;

    static synchronized s a(Context context) {
        if (f3455a == null) {
            q qVar = new q(null);
            qVar.a(com.google.android.play.integrity.internal.ag.a(context));
            f3455a = qVar.b();
        }
        return f3455a;
    }
}
