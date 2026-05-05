package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a00 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b90 f161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(b90 b90Var) {
        super(0);
        this.f161a = b90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed request to [" + this.f161a + AbstractJsonLexerKt.END_LIST;
    }
}
