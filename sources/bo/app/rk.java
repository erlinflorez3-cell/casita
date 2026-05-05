package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(String str) {
        super(0);
        this.f1698a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Failed to unset custom attribute "), this.f1698a, '.');
    }
}
