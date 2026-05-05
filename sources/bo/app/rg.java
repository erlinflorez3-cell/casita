package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tg f1689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(tg tgVar) {
        super(0);
        this.f1689a = tgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f1689a + " for " + this.f1689a.c() + " executed successfully.";
    }
}
