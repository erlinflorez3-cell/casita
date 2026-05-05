package bo.app;

import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class k80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z80 f1084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f1085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f1086c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v80 f1087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(z80 z80Var, long j2, long j3, v80 v80Var) {
        super(0);
        this.f1084a = z80Var;
        this.f1085b = j2;
        this.f1086c = j3;
        this.f1087d = v80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Delaying next request after " + this.f1084a.a(this.f1085b) + " until next token is available in " + this.f1086c + "ms - '" + DateTimeUtils.formatDateFromMillis$default(this.f1085b + this.f1086c, null, null, 3, null) + "'\n" + this.f1087d.f2022l;
    }
}
