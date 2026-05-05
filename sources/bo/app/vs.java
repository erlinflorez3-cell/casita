package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vs extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(boolean z2, String str, String str2) {
        super(0);
        this.f2062a = z2;
        this.f2063b = str;
        this.f2064c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Starting (resume = " + this.f2062a + ") DUST subscription for mite: " + this.f2063b + " to url: " + this.f2064c;
    }
}
