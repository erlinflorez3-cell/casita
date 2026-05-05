package com.braze;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f2647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(File file) {
        super(0);
        this.f2647a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Deleting shared prefs file at: " + this.f2647a.getAbsolutePath();
    }
}
