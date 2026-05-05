package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class og extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tg f1443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(tg tgVar) {
        super(0);
        this.f1443a = tgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ">> API key    : " + this.f1443a.f1864f;
    }
}
