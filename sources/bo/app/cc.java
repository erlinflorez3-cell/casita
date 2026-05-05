package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rc f332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(rc rcVar, String str) {
        super(0);
        this.f332a = rcVar;
        this.f333b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("Retrieving geofence id ");
        rc rcVar = this.f332a;
        String reEligibilityId = this.f333b;
        Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
        return sb.append(rcVar.a(reEligibilityId)).append(" eligibility information from local storage.").toString();
    }
}
