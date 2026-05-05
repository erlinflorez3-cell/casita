package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f555b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(String str, String str2) {
        super(0);
        this.f554a = str;
        this.f555b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.INAPP_MESSAGE_BUTTON_CLICK, z9.a(ba.f257g, this.f554a, this.f555b, 4), 0.0d, 12);
    }
}
