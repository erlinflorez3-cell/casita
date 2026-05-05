package bo.app;

import java.io.File;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class td0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File[] f1834a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(File[] fileArr) {
        super(0);
        this.f1834a = fileArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Local triggered asset directory contains files: " + ArraysKt.joinToString$default(this.f1834a, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, sd0.f1761a, 30, (Object) null);
    }
}
