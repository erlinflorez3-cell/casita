package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes9.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f3360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f3360a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.f3360a.f3361a.trySetResult(3);
        } else if (i2 == 2) {
            this.f3360a.f3361a.trySetResult(2);
        } else {
            if (i2 != 3) {
                return;
            }
            this.f3360a.f3361a.trySetResult(1);
        }
    }
}
