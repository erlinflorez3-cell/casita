package bo.app;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fq extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(Uri uri) {
        super(0);
        this.f683a = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Image url specifies that it should not be cached. Not caching " + this.f683a;
    }
}
