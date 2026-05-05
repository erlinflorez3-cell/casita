package o.er;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25007d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25008e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.ep.d f25009a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.eq.e f25010g;

    h(o.ep.d dVar, o.eq.e eVar) {
        this.f25009a = dVar;
        this.f25010g = eVar;
    }

    public boolean c() {
        c[] cVarArrH;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = f25008e + 39;
        f25007d = i4 % 128;
        if (i4 % 2 == 0) {
            cVarArrH = h();
            length = cVarArrH.length;
            i2 = 1;
        } else {
            cVarArrH = h();
            length = cVarArrH.length;
            i2 = 0;
        }
        while (i2 < length) {
            int i5 = f25008e;
            int i6 = (((-1) - (((-1) - i5) & ((-1) - 41))) << 1) - (i5 ^ 41);
            f25007d = i6 % 128;
            if (i6 % 2 == 0) {
                cVarArrH[i2].c();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cVarArrH[i2].c()) {
                int i7 = f25008e;
                int i8 = (i7 ^ 17) + ((i7 & 17) << 1);
                f25007d = i8 % 128;
                return i8 % 2 != 0;
            }
            int i9 = (i2 ^ 53) + ((i2 & 53) << 1);
            i2 = (((i9 - 52) - ((-52) & i9)) << 1) - (i9 ^ (-52));
            int i10 = f25008e;
            int i11 = (i10 ^ 107) + (((-1) - (((-1) - i10) | ((-1) - 107))) << 1);
            f25007d = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = f25008e;
        int i14 = (i13 ^ 111) + (((i13 + 111) - (i13 | 111)) << 1);
        f25007d = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public abstract c[] h();
}
