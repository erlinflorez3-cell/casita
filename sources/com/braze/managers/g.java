package com.braze.managers;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(0);
        this.f2673a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Encountered Json exception while parsing stored geofence: " + this.f2673a;
    }
}
