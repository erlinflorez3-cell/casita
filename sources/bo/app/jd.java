package bo.app;

import android.graphics.BitmapFactory;
import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f1004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BitmapFactory.Options f1005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(URL url, BitmapFactory.Options options) {
        super(0);
        this.f1004a = url;
        this.f1005b = options;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "The bitmap metadata with image url " + this.f1004a + " had bounds: (height " + this.f1005b.outHeight + " width " + this.f1005b.outWidth + "). Returning a bitmap with no sampling.";
    }
}
