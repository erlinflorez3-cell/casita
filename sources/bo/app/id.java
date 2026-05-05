package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class id extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(int i2, int i3) {
        super(0);
        this.f897a = i2;
        this.f898b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Sampling bitmap with destination image bounds: (height " + this.f897a + " width " + this.f898b + ')';
    }
}
