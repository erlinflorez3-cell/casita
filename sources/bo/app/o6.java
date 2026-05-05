package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(String str, boolean z2) {
        super(0);
        this.f1422a = str;
        this.f1423b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting Google Advertising ID: " + this.f1422a + " and limit-ad-tracking: " + this.f1423b;
    }
}
