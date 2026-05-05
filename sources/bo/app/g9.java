package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(String str) {
        super(0);
        this.f728a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.INAPP_MESSAGE_CLICK, z9.a(ba.f257g, this.f728a, null, 6), 0.0d, 12);
    }
}
