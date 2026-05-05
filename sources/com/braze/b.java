package com.braze;

import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumSet f2635a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EnumSet enumSet) {
        super(0);
        this.f2635a = enumSet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to add SDK Metadata of: " + this.f2635a;
    }
}
