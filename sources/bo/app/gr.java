package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class gr extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f772a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(String str) {
        super(0);
        this.f772a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Unable to inspect package ["), this.f772a, AbstractJsonLexerKt.END_LIST);
    }
}
