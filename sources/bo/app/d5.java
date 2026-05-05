package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(Braze braze) {
        super(0);
        this.f460a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (((ci0) this.f460a.getUdm$android_sdk_base_release()).f389h.w()) {
            h00.a(((ci0) this.f460a.getUdm$android_sdk_base_release()).f403v, ((ci0) this.f460a.getUdm$android_sdk_base_release()).B.f1125c, ((ci0) this.f460a.getUdm$android_sdk_base_release()).B.f1126d);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f460a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) c5.f316a, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
