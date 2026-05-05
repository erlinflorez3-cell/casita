package bo.app;

import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pu extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f1549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd0 f1552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(z80 z80Var, long j2, long j3, rd0 rd0Var) {
        super(0);
        this.f1549a = z80Var;
        this.f1550b = j2;
        this.f1551c = j3;
        this.f1552d = rd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Delaying next request after '" + this.f1549a.a(this.f1550b) + "' until next token is available in " + this.f1551c + "ms - '" + DateTimeUtils.formatDateFromMillis$default(this.f1550b + this.f1551c, null, null, 3, null) + "'\n" + this.f1552d;
    }
}
