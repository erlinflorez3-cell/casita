package com.braze;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z2) {
        super(0);
        this.f2712a = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Braze SDK outbound network requests are now ".concat(this.f2712a ? "disabled" : "enabled");
    }
}
