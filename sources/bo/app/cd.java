package bo.app;

import android.graphics.BitmapFactory;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BitmapFactory.Options f337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(Uri uri, BitmapFactory.Options options) {
        super(0);
        this.f336a = uri;
        this.f337b = options;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "The bitmap metadata with image uri " + this.f336a + " had bounds: (height " + this.f337b.outHeight + " width " + this.f337b.outWidth + "). Returning a bitmap with no sampling.";
    }
}
