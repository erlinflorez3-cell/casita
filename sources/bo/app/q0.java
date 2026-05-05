package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String str, String str2) {
        super(0);
        this.f1560a = str;
        this.f1561b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot add null or blank card json to storage. Returning. User id: " + this.f1560a + " Serialized json: " + this.f1561b;
    }
}
