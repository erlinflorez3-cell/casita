package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(String str) {
        super(0);
        this.f288a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Failed to set custom float attribute "), this.f288a, '.');
    }
}
