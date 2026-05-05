package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f2184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(Braze braze) {
        super(0);
        this.f2184a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2184a, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) w5.f2103a, 6, (Object) null);
        tf tfVar = ((ci0) this.f2184a.getUdm$android_sdk_base_release()).f403v;
        tfVar.getClass();
        tfVar.a(new j50());
        return Unit.INSTANCE;
    }
}
