package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(String str, boolean z2) {
        super(0);
        this.f1258a = str;
        this.f1259b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + this.f1258a + " and limit-ad-tracking: " + this.f1259b;
    }
}
