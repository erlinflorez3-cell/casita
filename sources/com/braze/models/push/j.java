package com.braze.models.push;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Bundle bundle, String str) {
        super(0);
        this.f2691a = str;
        this.f2692b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to parse string as long with key " + this.f2691a + " and bundle: " + this.f2692b;
    }
}
