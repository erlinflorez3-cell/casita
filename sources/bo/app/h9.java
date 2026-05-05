package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class h9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(String str, String str2) {
        super(0);
        this.f812a = str;
        this.f813b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.INAPP_MESSAGE_CONTROL_IMPRESSION, ba.f257g.a(this.f812a, null, this.f813b), 0.0d, 12);
    }
}
