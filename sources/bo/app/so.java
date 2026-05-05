package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class so extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f1783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zo f1784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(long j2, zo zoVar) {
        super(0);
        this.f1783a = j2;
        this.f1784b = zoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Data flush interval has changed from " + this.f1783a + " ms to " + this.f1784b.f2416g + " ms after connectivity state change to: " + this.f1784b.f2419j + " and session state: " + fc0.a(this.f1784b.f2415f);
    }
}
