package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(Braze braze) {
        super(0);
        this.f1914a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ci0) this.f1914a.getUdm$android_sdk_base_release()).f405x.initializeGeofences();
        return Unit.INSTANCE;
    }
}
