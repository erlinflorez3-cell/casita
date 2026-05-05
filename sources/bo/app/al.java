package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class al extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(String str, Object obj) {
        super(0);
        this.f216a = str;
        this.f217b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Primary key '" + this.f216a + "' had no identifier. No secondary key to read resource value. Returning default value: '" + this.f217b + '\'';
    }
}
