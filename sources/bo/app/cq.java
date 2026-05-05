package bo.app;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cq implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f427c;

    public cq(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f425a = brazeViewBounds;
        this.f426b = imageView;
        this.f427c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "$imageView");
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(v2, "v");
        if (this.f425a == BrazeViewBounds.BASE_CARD_VIEW) {
            final ImageView imageView = this.f426b;
            final Bitmap bitmap = this.f427c;
            imageView.post(new Runnable() { // from class: bo.app.cq$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    cq.a(bitmap, imageView);
                }
            });
        }
        v2.removeOnLayoutChangeListener(this);
    }
}
