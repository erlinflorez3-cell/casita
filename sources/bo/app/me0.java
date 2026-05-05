package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class me0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(String str, String str2) {
        super(0);
        this.f1283a = str;
        this.f1284b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Found local asset at path " + this.f1283a + " for remote asset at path: " + this.f1284b;
    }
}
