package o.g;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends o.by.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26207b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26208g = 1;

    public d(byte[] bArr) {
        super(bArr);
    }

    public final o.by.b a() {
        int i2 = 2 % 2;
        int i3 = f26207b;
        int i4 = (i3 & 7) + ((i3 + 7) - (i3 & 7));
        f26208g = i4 % 128;
        int i5 = i4 % 2;
        o.by.b bVarD = super.d();
        int i6 = f26208g;
        int i7 = (i6 & 93) + ((i6 + 93) - (i6 & 93));
        f26207b = i7 % 128;
        int i8 = i7 % 2;
        return bVarD;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f26208g;
        int i4 = (i3 & 65) + ((-1) - (((-1) - i3) & ((-1) - 65)));
        f26207b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f21841a;
        int i6 = f26208g;
        int i7 = (i6 & 97) + ((i6 + 97) - (i6 & 97));
        f26207b = i7 % 128;
        int i8 = i7 % 2;
        return z2;
    }
}
