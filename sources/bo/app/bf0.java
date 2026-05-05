package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(long j2, long j3) {
        super(0);
        this.f275a = j2;
        this.f276b = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Minimum time interval requirement met for matched trigger. Action display time: " + this.f275a + " . Next viable display time: " + this.f276b;
    }
}
