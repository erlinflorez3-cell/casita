package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class t30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KProperty f1809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(Object obj, KProperty kProperty) {
        super(0);
        this.f1808a = obj;
        this.f1809b = kProperty;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot assign " + this.f1808a + " to only-set-once property " + this.f1809b.getName();
    }
}
