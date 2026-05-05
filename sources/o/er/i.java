package o.er;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25011f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25012g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25013j;

    public i(boolean z2, String str) {
        super(z2);
        this.f25013j = str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f25011f;
        int i4 = (i3 & 29) + (i3 | 29);
        int i5 = i4 % 128;
        f25012g = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f25013j;
        int i6 = i5 + 87;
        f25011f = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
