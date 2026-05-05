package o.l;

import android.os.CancellationSignal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26327a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26328b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Long, c> f26329e = new HashMap();

    static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26330b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f26331e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f26332a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o.l.c f26333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final CancellationSignal f26334d;

        c(o.l.c cVar, a aVar, CancellationSignal cancellationSignal) {
            this.f26333c = cVar;
            this.f26332a = aVar;
            this.f26334d = cancellationSignal;
        }

        public final o.l.c a() {
            int i2 = 2 % 2;
            int i3 = f26331e;
            int i4 = i3 + 117;
            f26330b = i4 % 128;
            int i5 = i4 % 2;
            o.l.c cVar = this.f26333c;
            int i6 = i3 + 77;
            f26330b = i6 % 128;
            int i7 = i6 % 2;
            return cVar;
        }

        public final a d() {
            int i2 = 2 % 2;
            int i3 = f26330b + 59;
            int i4 = i3 % 128;
            f26331e = i4;
            int i5 = i3 % 2;
            a aVar = this.f26332a;
            int i6 = i4 + 37;
            f26330b = i6 % 128;
            int i7 = i6 % 2;
            return aVar;
        }
    }

    b() {
    }

    final synchronized a a(long j2) {
        int i2 = 2 % 2;
        int i3 = f26328b;
        int i4 = (i3 ^ 105) + ((i3 & 105) << 1);
        f26327a = i4 % 128;
        int i5 = i4 % 2;
        c cVar = this.f26329e.get(Long.valueOf(j2));
        if (cVar == null) {
            int i6 = f26328b + 57;
            f26327a = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = f26327a + 123;
        f26328b = i8 % 128;
        int i9 = i8 % 2;
        return cVar.f26332a;
    }

    final synchronized CancellationSignal b(long j2) {
        int i2 = 2 % 2;
        int i3 = f26327a + 57;
        f26328b = i3 % 128;
        int i4 = i3 % 2;
        c cVar = this.f26329e.get(Long.valueOf(j2));
        if (cVar == null) {
            int i5 = f26328b;
            int i6 = ((-1) - (((-1) - i5) | ((-1) - 65))) + ((i5 + 65) - (i5 & 65));
            f26327a = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            int i7 = 27 / 0;
            return null;
        }
        int i8 = f26327a;
        int i9 = ((i8 + 17) - (17 | i8)) + ((-1) - (((-1) - i8) & ((-1) - 17)));
        f26328b = i9 % 128;
        int i10 = i9 % 2;
        CancellationSignal cancellationSignal = cVar.f26334d;
        int i11 = f26328b + 51;
        f26327a = i11 % 128;
        if (i11 % 2 == 0) {
            return cancellationSignal;
        }
        int i12 = 28 / 0;
        return cancellationSignal;
    }

    final synchronized o.l.c d(long j2) {
        int i2 = 2 % 2;
        int i3 = f26327a + 23;
        f26328b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f26329e.get(Long.valueOf(j2));
            obj.hashCode();
            throw null;
        }
        c cVar = this.f26329e.get(Long.valueOf(j2));
        if (cVar == null) {
            int i4 = f26327a + 17;
            f26328b = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i5 = f26328b;
        int i6 = (((-1) - (((-1) - i5) & ((-1) - 103))) << 1) - (i5 ^ 103);
        f26327a = i6 % 128;
        if (i6 % 2 == 0) {
            return cVar.f26333c;
        }
        o.l.c cVar2 = cVar.f26333c;
        throw null;
    }

    final synchronized c e(long j2) {
        c cVarRemove;
        int i2 = 2 % 2;
        int i3 = f26328b;
        int i4 = (i3 & 59) + ((-1) - (((-1) - i3) & ((-1) - 59)));
        f26327a = i4 % 128;
        int i5 = i4 % 2;
        cVarRemove = this.f26329e.remove(Long.valueOf(j2));
        int i6 = f26328b + 59;
        f26327a = i6 % 128;
        int i7 = i6 % 2;
        return cVarRemove;
    }

    final synchronized void e(o.l.c cVar, a aVar, CancellationSignal cancellationSignal) {
        int i2 = 2 % 2;
        this.f26329e.put(Long.valueOf(cVar.b()), new c(cVar, aVar, cancellationSignal));
        int i3 = f26327a + 63;
        f26328b = i3 % 128;
        int i4 = i3 % 2;
    }
}
