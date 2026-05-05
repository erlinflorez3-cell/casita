package o.dd;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22852b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22853c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f22854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.az.a f22855e;

    public e(o.az.a aVar, g gVar) {
        this.f22855e = aVar;
        this.f22854d = gVar;
    }

    public final o.az.a a() {
        o.az.a aVar;
        int i2 = 2 % 2;
        int i3 = f22853c;
        int i4 = (i3 ^ 109) + (((i3 + 109) - (i3 | 109)) << 1);
        int i5 = i4 % 128;
        f22852b = i5;
        if (i4 % 2 == 0) {
            aVar = this.f22855e;
            int i6 = 60 / 0;
        } else {
            aVar = this.f22855e;
        }
        int i7 = (((-1) - (((-1) - i5) & ((-1) - 35))) << 1) - (i5 ^ 35);
        f22853c = i7 % 128;
        int i8 = i7 % 2;
        return aVar;
    }

    public final g e() {
        int i2 = 2 % 2;
        int i3 = f22852b;
        int i4 = (((i3 + 85) - (85 & i3)) << 1) - (i3 ^ 85);
        f22853c = i4 % 128;
        int i5 = i4 % 2;
        g gVar = this.f22854d;
        if (i5 != 0) {
            int i6 = 46 / 0;
        }
        return gVar;
    }
}
