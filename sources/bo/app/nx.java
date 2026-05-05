package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox f1400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ox oxVar, int i2, int i3) {
        super(0);
        this.f1400a = oxVar;
        this.f1401b = i2;
        this.f1402c = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "New sleep duration: " + this.f1400a.f1471f + " ms. Default sleep duration: " + this.f1401b + " ms. Max sleep: " + this.f1400a.f1466a + " ms. Min sleep: " + this.f1400a.f1468c + " ms. Scale factor: " + this.f1400a.f1469d + " randomValueBetweenSleepIntervals: " + this.f1402c;
    }
}
