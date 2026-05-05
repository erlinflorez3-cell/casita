package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w00 f1327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f1328b;

    public n(l00 request, w00 connectionResult) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f1327a = connectionResult;
        String str = (String) connectionResult.c().get("retry-after");
        this.f1328b = str != null ? com.braze.support.i.a(str) : null;
    }
}
