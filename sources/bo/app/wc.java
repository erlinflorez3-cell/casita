package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(int i2, int i3) {
        super(0);
        this.f2128a = i2;
        this.f2129b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Display width: " + this.f2128a + " and height " + this.f2129b;
    }
}
