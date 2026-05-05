package bo.app;

import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a10 f1691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(long j2, k70 k70Var) {
        super(0);
        this.f1690a = j2;
        this.f1691b = k70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbAppend = new StringBuilder("Trigger action is re-eligible for display since ").append(DateTimeUtils.nowInSeconds() - this.f1690a).append(" seconds have passed since the last time it was triggered (minimum interval: ");
        int i2 = ((k70) this.f1691b).f1082a;
        return sbAppend.append(i2 > 0 ? Integer.valueOf(i2) : null).append(").").toString();
    }
}
