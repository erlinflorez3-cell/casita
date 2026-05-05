package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(String str, Braze braze, boolean z2) {
        super(0);
        this.f1488a = str;
        this.f1489b = braze;
        this.f1490c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (StringsKt.isBlank(this.f1488a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1489b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) n6.f1343a, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1489b, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new o6(this.f1488a, this.f1490c), 6, (Object) null);
            ((hr) this.f1489b.getDeviceDataProvider()).a(this.f1488a);
            ((hr) this.f1489b.getDeviceDataProvider()).a(this.f1490c);
        }
        return Unit.INSTANCE;
    }
}
