package o.er;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25014g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25015h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25016j;

    public j(boolean z2, String str) {
        super(z2);
        this.f25016j = str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f25015h;
        int i4 = (i3 ^ 9) + ((9 & i3) << 1);
        f25014g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25016j;
        int i6 = i3 + 83;
        f25014g = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
