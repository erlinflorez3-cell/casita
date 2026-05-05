package bo.app;

import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(k10 k10Var) {
        super(0);
        this.f1513a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Registering triggered action id "), ((bh0) this.f1513a).f280a, TokenParser.SP);
    }
}
