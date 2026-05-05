package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes9.dex */
abstract class y {

    /* JADX INFO: renamed from: b */
    private final String f3451b;

    /* JADX INFO: renamed from: c */
    private final long f3452c;

    /* JADX INFO: renamed from: e */
    private boolean f3454e;

    /* JADX INFO: renamed from: a */
    private final com.google.android.play.integrity.internal.s f3450a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d */
    private final Object f3453d = new Object();

    y(String str, long j2) {
        this.f3451b = str;
        this.f3452c = j2;
    }

    public final Task a(Activity activity, int i2) {
        synchronized (this.f3453d) {
            if (this.f3454e) {
                return Tasks.forResult(0);
            }
            this.f3454e = true;
            this.f3450a.a("checkAndShowDialog(%s)", Integer.valueOf(i2));
            Bundle bundle = new Bundle();
            bundle.putInt("dialog.intent.type", i2);
            bundle.putString("package.name", this.f3451b);
            bundle.putInt("playcore.integrity.version.major", 1);
            bundle.putInt("playcore.integrity.version.minor", 3);
            bundle.putInt("playcore.integrity.version.patch", 0);
            bundle.putLong("request.token.sid", this.f3452c);
            return b(activity, bundle);
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
