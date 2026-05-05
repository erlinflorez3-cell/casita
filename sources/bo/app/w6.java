package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f2105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(Braze braze, boolean z2) {
        super(0);
        this.f2105a = braze;
        this.f2106b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ci0) this.f2105a.getUdm$android_sdk_base_release()).f403v.getClass();
        ((ci0) this.f2105a.getUdm$android_sdk_base_release()).f395n.a(this.f2106b);
        Braze braze = this.f2105a;
        if (braze.imageLoader != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new v6(this.f2106b), 7, (Object) null);
            this.f2105a.getImageLoader().setOffline(this.f2106b);
        }
        return Unit.INSTANCE;
    }
}
