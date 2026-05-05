package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(Braze braze, long j2) {
        super(0);
        this.f1168a = braze;
        this.f1169b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        ((ci0) this.f1168a.getUdm$android_sdk_base_release()).f403v.a(this.f1169b);
        return Unit.INSTANCE;
    }
}
