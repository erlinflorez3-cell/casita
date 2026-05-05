package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(Class cls, Object obj) {
        super(0);
        this.f1711a = cls;
        this.f1712b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f1711a.getName() + " fired:\n" + this.f1712b;
    }
}
