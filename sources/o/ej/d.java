package o.ej;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23968a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23969c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f23970b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f23971e;

    public d(File file, c cVar) {
        this.f23970b = file;
        this.f23971e = cVar;
    }

    public final File a() {
        int i2 = 2 % 2;
        int i3 = f23968a;
        int i4 = ((i3 + 95) - (95 | i3)) + ((i3 + 95) - (95 & i3));
        f23969c = i4 % 128;
        int i5 = i4 % 2;
        File file = this.f23970b;
        int i6 = i3 + 7;
        f23969c = i6 % 128;
        if (i6 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public final c e() {
        int i2 = 2 % 2;
        int i3 = f23968a + 49;
        int i4 = i3 % 128;
        f23969c = i4;
        int i5 = i3 % 2;
        c cVar = this.f23971e;
        int i6 = (i4 ^ 47) + (((i4 + 47) - (i4 | 47)) << 1);
        f23968a = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }
}
