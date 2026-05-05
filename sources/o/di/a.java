package o.di;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import o.dj.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23021a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23022c = 0;

    /* JADX INFO: renamed from: o.di.a$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f23023a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f23024d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f23025e;

        static {
            int[] iArr = new int[h.values().length];
            f23025e = iArr;
            try {
                iArr[h.f23138e.ordinal()] = 1;
                int i2 = f23024d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f23023a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23025e[h.f23136c.ordinal()] = 2;
                int i5 = f23023a;
                int i6 = (i5 ^ 19) + (((-1) - (((-1) - i5) | ((-1) - 19))) << 1);
                f23024d = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static d c(h hVar) {
        int i2 = 2 % 2;
        int i3 = f23021a;
        int i4 = (i3 ^ 101) + (((i3 + 101) - (i3 | 101)) << 1);
        f23022c = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (hVar == null) {
            g gVar = new g();
            int i5 = f23022c + 97;
            f23021a = i5 % 128;
            if (i5 % 2 != 0) {
                return gVar;
            }
            throw null;
        }
        int i6 = AnonymousClass4.f23025e[hVar.ordinal()];
        if (i6 == 1) {
            e eVar = new e();
            int i7 = f23021a + 41;
            f23022c = i7 % 128;
            int i8 = i7 % 2;
            return eVar;
        }
        if (i6 != 2) {
            throw new IllegalArgumentException();
        }
        c cVar = new c();
        int i9 = f23021a;
        int i10 = (i9 ^ 1) + (((-1) - (((-1) - i9) | ((-1) - 1))) << 1);
        f23022c = i10 % 128;
        int i11 = i10 % 2;
        return cVar;
    }
}
