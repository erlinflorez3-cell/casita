package o.et;

import fr.antelop.sdk.card.emvapplication.EmvApplicationType;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25426i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25427j = 0;

    public l(String str, o.dp.b bVar, String str2, int i2, String str3) {
        super(str, bVar, str2, i2, str3);
    }

    @Override // o.et.c
    public final byte[] F() {
        int i2 = 2 % 2;
        int i3 = f25426i + 103;
        f25427j = i3 % 128;
        return new byte[i3 % 2 != 0 ? 1 : 0];
    }

    @Override // o.et.c
    public EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25427j + 85;
        f25426i = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceIdemiaWise;
        if (i4 != 0) {
            return emvApplicationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.b
    public final o.eu.d<?> c(String str) {
        int i2 = 2 % 2;
        o.fb.c cVar = new o.fb.c(k(), str, false);
        int i3 = f25427j + 27;
        f25426i = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }
}
