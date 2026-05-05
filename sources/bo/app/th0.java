package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class th0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th0(String str, Object obj) {
        super(0);
        this.f1871a = str;
        this.f1872b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to write to user object json from prefs with key: [" + this.f1871a + "] value: [" + this.f1872b + AbstractJsonLexerKt.END_LIST;
    }
}
