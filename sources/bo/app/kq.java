package bo.app;

import com.braze.enums.DeviceKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class kq extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceKey f1137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(DeviceKey deviceKey) {
        super(0);
        this.f1137a = deviceKey;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not adding device key <" + this.f1137a + "> to export due to allowlist restrictions.";
    }
}
