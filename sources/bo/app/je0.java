package bo.app;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class je0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f1008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(String str, Uri uri) {
        super(0);
        this.f1008a = uri;
        this.f1009b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Storing local triggered action asset at local path " + this.f1008a.getPath() + " for remote path " + this.f1009b;
    }
}
