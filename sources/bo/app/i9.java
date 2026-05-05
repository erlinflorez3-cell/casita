package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(String str, String str2) {
        super(0);
        this.f885a = str;
        this.f886b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.INAPP_MESSAGE_IMPRESSION, ba.f257g.a(this.f885a, null, this.f886b), 0.0d, 12);
    }
}
