package bo.app;

import android.graphics.BitmapFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BitmapFactory.Options f1829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(BitmapFactory.Options options, int i2, int i3) {
        super(0);
        this.f1829a = options;
        this.f1830b = i2;
        this.f1831c = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Calculating sample size for source image bounds: (width " + this.f1829a.outWidth + " height " + this.f1829a.outHeight + ") and destination image bounds: (width " + this.f1830b + " height " + this.f1831c + ')';
    }
}
