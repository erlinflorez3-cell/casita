package o.et;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends a {
    private static int C = 0;
    private static int D = 1;

    public h(String str, String str2, int i2, String str3) {
        super(str, str2, i2, str3);
    }

    @Override // o.et.a, o.et.c
    protected final c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        h hVar = new h(str, str2, i2, str3);
        int i4 = D;
        int i5 = (i4 & 35) + (i4 | 35);
        C = i5 % 128;
        int i6 = i5 % 2;
        return hVar;
    }
}
