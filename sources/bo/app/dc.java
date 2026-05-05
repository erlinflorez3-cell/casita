package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rc f478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(long j2, rc rcVar, String str) {
        super(0);
        this.f477a = j2;
        this.f478b = rcVar;
        this.f479c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofence report suppressed since only " + this.f477a + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f478b.f1673h + "). id:" + this.f479c;
    }
}
