package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ko extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f1134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zo f1135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(long j2, zo zoVar) {
        super(0);
        this.f1134a = j2;
        this.f1135b = zoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Kicking off the Sync Job. initialDelaysMs: " + this.f1134a + ": currentIntervalMs " + this.f1135b.f2416g + " ms";
    }
}
