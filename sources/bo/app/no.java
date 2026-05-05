package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class no extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zo f1375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(zo zoVar) {
        super(0);
        this.f1375a = zoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Data flush interval is " + this.f1375a.f2416g + " ms. Not scheduling a proceeding data flush.";
    }
}
