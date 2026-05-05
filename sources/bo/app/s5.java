package bo.app;

import com.braze.Braze;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class s5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f1726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f1727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f1728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(double d2, double d3, Braze braze) {
        super(0);
        this.f1726a = d2;
        this.f1727b = d3;
        this.f1728c = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (ValidationUtils.isValidLocation(this.f1726a, this.f1727b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1728c, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r5(this.f1726a, this.f1727b), 6, (Object) null);
            ((ci0) this.f1728c.getUdm$android_sdk_base_release()).f405x.requestGeofenceRefresh(new BrazeLocation(this.f1726a, this.f1727b, null, null, null, 28, null));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1728c, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new q5(this.f1726a, this.f1727b), 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
