package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class us extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xs f1964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(String str, xs xsVar) {
        super(0);
        this.f1963a = str;
        this.f1964b = xsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot start a dust subscription with mite " + this.f1963a + " and enabled " + this.f1964b.f2238a.x();
    }
}
