package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(boolean z2) {
        super(0);
        this.f2002a = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting the image loader deny network downloads to " + this.f2002a;
    }
}
