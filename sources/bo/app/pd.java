package bo.app;

import android.widget.ImageView;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f1508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(float f2, ImageView imageView) {
        super(0);
        this.f1507a = f2;
        this.f1508b = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Resizing ImageView to aspect ratio " + this.f1507a + " based on width: " + this.f1508b.getWidth() + " trueWidth: " + this.f1508b.getLayoutParams().width + " height: " + this.f1508b.getLayoutParams().height + " layoutParams: " + this.f1508b.getLayoutParams() + TokenParser.SP + this.f1508b;
    }
}
