package com.braze.models.push;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Bundle bundle, String str) {
        super(0);
        this.f2681a = str;
        this.f2682b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to parse string as int with key " + this.f2681a + " and bundle: " + this.f2682b;
    }
}
