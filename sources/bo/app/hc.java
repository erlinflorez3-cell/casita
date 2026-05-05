package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rc f820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(long j2, rc rcVar, String str) {
        super(0);
        this.f819a = j2;
        this.f820b = rcVar;
        this.f821c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofence report eligible since " + this.f819a + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f820b.f1673h + "). id:" + this.f821c;
    }
}
