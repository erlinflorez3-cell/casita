package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class kc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f1099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(long j2, rc rcVar) {
        super(0);
        this.f1098a = j2;
        this.f1099b = rcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f1098a + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f1099b.f1672g + ").";
    }
}
