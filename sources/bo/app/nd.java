package bo.app;

import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f1356a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(ImageView imageView) {
        super(0);
        this.f1356a = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + this.f1356a;
    }
}
