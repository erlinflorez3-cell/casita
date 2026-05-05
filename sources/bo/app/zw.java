package bo.app;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ex f2441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f2442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(ex exVar, Set set) {
        super(0);
        this.f2441a = exVar;
        this.f2442b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f2441a.f595a.a(this.f2442b);
        return Unit.INSTANCE;
    }
}
