package o.er;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24981f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24982g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24983h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f24984j;

    public e(boolean z2, String str, boolean z3) {
        super(z2);
        this.f24983h = str;
        this.f24984j = z3;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24981f;
        int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
        f24982g = i4 % 128;
        if (i4 % 2 != 0) {
            return this.f24983h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f24981f;
        int i4 = (i3 ^ 15) + (((i3 + 15) - (i3 | 15)) << 1);
        int i5 = i4 % 128;
        f24982g = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f24984j;
        int i6 = i5 + 113;
        f24981f = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }
}
