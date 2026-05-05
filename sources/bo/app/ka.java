package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ka extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(String str, int i2) {
        super(0);
        this.f1093a = i2;
        this.f1094b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("HTTP response code was ").append(this.f1093a).append(". File with url "), this.f1094b, " could not be downloaded.");
    }
}
