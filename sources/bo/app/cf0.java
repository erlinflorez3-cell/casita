package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(long j2, long j3, long j4) {
        super(0);
        this.f342a = j2;
        this.f343b = j3;
        this.f344c = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Minimum time interval requirement and triggered action override time interval requirement of " + this.f342a + " not met for matched trigger. Returning null. Next viable display time: " + this.f343b + ". Action display time: " + this.f344c;
    }
}
