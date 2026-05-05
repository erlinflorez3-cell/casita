package com.braze.configuration;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i2) {
        super(0);
        this.f2643a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: " + this.f2643a;
    }
}
