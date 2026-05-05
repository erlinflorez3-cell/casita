package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f3422a;

    bt(bn bnVar) {
        this.f3422a = bnVar;
    }

    final /* synthetic */ Task a(long j2, long j3, int i2, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f3422a.d(standardIntegrityTokenRequest.a(), j2, j3, 0);
    }
}
