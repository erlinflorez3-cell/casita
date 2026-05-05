package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class h5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(Braze braze) {
        super(0);
        this.f799a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tf tfVar = ((ci0) this.f799a.getUdm$android_sdk_base_release()).f403v;
        j50 j50Var = new j50();
        j50Var.f977b = Boolean.TRUE;
        tfVar.a(j50Var);
        return Unit.INSTANCE;
    }
}
