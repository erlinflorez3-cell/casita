package o.a;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19940a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19942e;

    public static void a(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int e(int i2) {
        e eVar = e.f19918d;
        int i3 = i2 >>> 24;
        return ((eVar.f19920c[0][(i3 + 255) - (i3 | 255)] + eVar.f19920c[1][(-1) - (((-1) - (i2 >>> 16)) | ((-1) - 255))]) ^ eVar.f19920c[2][(-1) - (((-1) - (i2 >>> 8)) | ((-1) - 255))]) + eVar.f19920c[3][(i2 + 255) - (i2 | 255)];
    }
}
