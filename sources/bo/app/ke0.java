package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ke0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(String str) {
        super(0);
        this.f1105a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Failed to store asset for remote path "), this.f1105a, ". Not storing local asset");
    }
}
