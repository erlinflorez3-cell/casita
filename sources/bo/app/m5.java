package bo.app;

import com.braze.Braze;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f1255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(IBrazeLocation iBrazeLocation, Braze braze) {
        super(0);
        this.f1255a = iBrazeLocation;
        this.f1256b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f1255a == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1256b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) l5.f1165a, 7, (Object) null);
        } else {
            ((ci0) this.f1256b.getUdm$android_sdk_base_release()).f405x.requestGeofenceRefresh(this.f1255a);
        }
        return Unit.INSTANCE;
    }
}
