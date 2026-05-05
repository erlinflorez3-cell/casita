package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(int i2, int i3) {
        super(0);
        this.f269a = i2;
        this.f270b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Sampling bitmap with destination image bounds: (width " + this.f269a + " height " + this.f270b + ')';
    }
}
