package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(long j2) {
        super(0);
        this.f1010a = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Scheduling Push Delivery Events Flush in " + this.f1010a + " ms";
    }
}
