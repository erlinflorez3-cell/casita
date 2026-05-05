package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cy extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gy f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(gy gyVar, long j2) {
        super(0);
        this.f442a = gyVar;
        this.f443b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((this.f442a.f784g.getLong("last_refresh", 0L) - this.f443b) + ((long) this.f442a.f780c.h())) + " seconds remaining until next available flush.";
    }
}
