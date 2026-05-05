package com.braze.models.push;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Bundle bundle, String str) {
        super(0);
        this.f2677a = str;
        this.f2678b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to parse long with key " + this.f2677a + " and bundle: " + this.f2678b;
    }
}
