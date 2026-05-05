package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pe0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(String str, String str2) {
        super(0);
        this.f1510a = str;
        this.f1511b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Adding new local path '").append(this.f1510a).append("' for remote path '"), this.f1511b, "' to cache.");
    }
}
