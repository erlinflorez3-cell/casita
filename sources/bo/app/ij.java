package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ij extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(String str, long j2) {
        super(0);
        this.f918a = str;
        this.f919b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set custom attribute " + this.f918a + " to " + this.f919b + " seconds from epoch.";
    }
}
