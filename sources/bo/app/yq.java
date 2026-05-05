package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yq extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(boolean z2, boolean z3) {
        super(0);
        this.f2325a = z2;
        this.f2326b = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + this.f2325a + ", shouldReportPushPermissionsAsGranted: " + this.f2326b;
    }
}
