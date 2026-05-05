package com.braze;

import android.content.Intent;
import bo.app.ci0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Intent intent, Braze braze) {
        super(0);
        this.f2658a = intent;
        this.f2659b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.f2658a, ((ci0) this.f2659b.getUdm$android_sdk_base_release()).f403v);
        return Unit.INSTANCE;
    }
}
