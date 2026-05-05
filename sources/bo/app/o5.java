package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(Braze braze, boolean z2) {
        super(0);
        this.f1419a = braze;
        this.f1420b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ci0) this.f1419a.getUdm$android_sdk_base_release()).f405x.requestGeofenceRefresh(this.f1420b);
        return Unit.INSTANCE;
    }
}
