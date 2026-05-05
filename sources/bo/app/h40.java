package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class h40 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(String str) {
        super(0);
        this.f798a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Caught exception merging JSON for new key " + this.f798a;
    }
}
