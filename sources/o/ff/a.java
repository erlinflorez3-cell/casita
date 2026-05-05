package o.ff;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: c */
    private static char[] f25835c = null;

    /* JADX INFO: renamed from: d */
    private static int f25836d = 0;

    /* JADX INFO: renamed from: f */
    private static int f25837f = 0;

    /* JADX INFO: renamed from: i */
    private static int f25838i = 1;

    /* JADX INFO: renamed from: j */
    private static int f25839j = 1;

    /* JADX INFO: renamed from: a */
    private b f25840a;

    /* JADX INFO: renamed from: b */
    private final boolean f25841b;

    /* JADX INFO: renamed from: e */
    private final short f25842e;

    static {
        f();
        int i2 = f25837f + 37;
        f25838i = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(boolean z2, b bVar, short s2) {
        this.f25841b = z2;
        this.f25840a = bVar;
        this.f25842e = s2;
    }

    static void f() {
        f25835c = new char[]{56575, 56712, 56722, 56722, 56721, 56721, 56497, 56546, 56554};
    }

    public final short a() {
        int i2 = 2 % 2;
        int i3 = f25836d + 85;
        f25839j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f25842e;
        }
        throw null;
    }

    public final b b() {
        int i2 = 2 % 2;
        int i3 = f25839j;
        int i4 = i3 + 1;
        f25836d = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        b bVar = this.f25840a;
        int i5 = i3 + 59;
        f25836d = i5 % 128;
        if (i5 % 2 == 0) {
            return bVar;
        }
        obj.hashCode();
        throw null;
    }

    public final void c(b bVar) {
        int i2 = 2 % 2;
        int i3 = f25836d;
        int i4 = i3 + 77;
        f25839j = i4 % 128;
        int i5 = i4 % 2;
        this.f25840a = bVar;
        int i6 = i3 + 27;
        f25839j = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.f25841b) {
            int i3 = f25839j + 95;
            f25836d = i3 % 128;
            if (i3 % 2 != 0) {
                b bVar = b.f25845c;
                throw null;
            }
            if (this.f25840a == b.f25845c) {
                return true;
            }
        }
        int i4 = f25836d + 75;
        f25839j = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public abstract void d();

    public abstract boolean d(String str, o.dk.a aVar);

    public final boolean e() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f25836d;
        int i4 = i3 + 51;
        f25839j = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f25841b;
            int i5 = 13 / 0;
        } else {
            z2 = this.f25841b;
        }
        int i6 = i3 + 51;
        f25839j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f25836d + 83;
        f25839j = i3 % 128;
        if (i3 % 2 == 0) {
            super.equals(obj);
            throw null;
        }
        boolean zEquals = super.equals(obj);
        int i4 = f25839j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25836d = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    protected void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25836d + 79;
        f25839j = i3 % 128;
        if (i3 % 2 != 0) {
            super.finalize();
            return;
        }
        super.finalize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract short h();

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f25839j + 123;
        f25836d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f25836d + 61;
        f25839j = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f25839j + 95;
        f25836d = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
