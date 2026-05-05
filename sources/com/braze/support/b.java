package com.braze.support;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f2699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function0 function0) {
        super(0);
        this.f2699a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BrazeLogger.INSTANCE.toStringSafe(this.f2699a);
    }
}
