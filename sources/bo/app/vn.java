package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(String str) {
        super(0);
        this.f2057a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Custom attribute key cannot be blocklisted attribute: "), this.f2057a, '.');
    }
}
