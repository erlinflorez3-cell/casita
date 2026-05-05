package o.et;

import fr.antelop.sdk.card.emvapplication.EmvApplicationType;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25362g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25363i = 0;

    public d(String str, String str2, int i2, String str3) {
        super(str, str2, i2, str3);
        e(o.dp.b.f23213a);
    }

    @Override // o.et.f, o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25362g;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 75))) + ((-1) - (((-1) - i3) & ((-1) - 75)));
        f25363i = i4 % 128;
        int i5 = i4 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceIdemiaPure;
        int i6 = f25362g + 9;
        f25363i = i6 % 128;
        if (i6 % 2 == 0) {
            return emvApplicationType;
        }
        throw null;
    }
}
