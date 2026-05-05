package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sh0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh0(String str, Object obj) {
        super(0);
        this.f1771a = str;
        this.f1772b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not write to custom attributes json object with key: [" + this.f1771a + "] value: [" + this.f1772b + AbstractJsonLexerKt.END_LIST;
    }
}
