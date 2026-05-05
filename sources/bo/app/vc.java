package bo.app;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f2037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(Uri uri) {
        super(0);
        this.f2037a = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Uri with unknown scheme received. Not getting image. Uri: " + this.f2037a;
    }
}
