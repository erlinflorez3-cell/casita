package com.braze.models.push;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bundle bundle, String str) {
        super(0);
        this.f2679a = str;
        this.f2680b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to parse non blank string with key " + this.f2679a + " and bundle: " + this.f2680b;
    }
}
