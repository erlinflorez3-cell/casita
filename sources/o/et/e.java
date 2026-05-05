package o.et;

import fr.antelop.sdk.card.emvapplication.EmvApplicationType;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25364h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25365j = 0;

    public e(String str, String str2, int i2, String str3) {
        super(str, o.dp.b.f23219h, str2, i2, str3);
    }

    @Override // o.et.l, o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25364h;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 109))) << 1) - (i3 ^ 109);
        f25365j = i4 % 128;
        int i5 = i4 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceIdemiaWise;
        if (i5 != 0) {
            int i6 = 6 / 0;
        }
        return emvApplicationType;
    }

    @Override // o.et.c
    protected final c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        e eVar = new e(str, str2, i2, str3);
        int i4 = f25365j + 59;
        f25364h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return eVar;
    }
}
