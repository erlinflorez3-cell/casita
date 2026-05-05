package o.bz;

import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import o.g.a;

/* JADX INFO: loaded from: classes6.dex */
final class c extends CustomerAuthenticationCredentials {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21913a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21914b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f21915e;

    c(a aVar) {
        this.f21915e = aVar;
    }

    final a d() {
        int i2 = 2 % 2;
        int i3 = f21913a;
        int i4 = i3 + 107;
        f21914b = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.f21915e;
        int i6 = i3 + 39;
        f21914b = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }
}
