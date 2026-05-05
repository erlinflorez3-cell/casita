package bo.app;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gq extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(Map.Entry entry, Uri uri) {
        super(0);
        this.f770a = entry;
        this.f771b = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Headers specify that this image should not be cached (" + this.f770a + "). Not caching " + this.f771b;
    }
}
