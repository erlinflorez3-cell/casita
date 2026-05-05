package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yl extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(String str) {
        super(0);
        this.f2320a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Unexpected system broadcast received ["), this.f2320a, AbstractJsonLexerKt.END_LIST);
    }
}
