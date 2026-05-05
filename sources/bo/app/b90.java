package bo.app;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f256d;

    public b90(Uri uri, boolean z2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f254b = uri;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        this.f253a = string;
        this.f255c = new URL(string);
        this.f256d = z2;
    }

    public /* synthetic */ b90(String str) {
        this(str, false);
    }

    public b90(String urlString, boolean z2) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri uri = Uri.parse(urlString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(urlString)");
        this.f254b = uri;
        this.f253a = urlString;
        this.f255c = new URL(urlString);
        this.f256d = z2;
    }

    public final String a() {
        return this.f253a;
    }

    public final String toString() {
        return this.f253a;
    }
}
