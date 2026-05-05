package o.ex;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.a.k;
import o.er.y;
import o.y.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f25528a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25529c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f25530d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25531e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f25532f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f25533b;

    private static String $$e(int i2, int i3, short s2) {
        int i4 = (i3 * 7) + 107;
        int i5 = 3 - (i2 * 4);
        int i6 = s2 * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4 = (-i4) + i7;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i5++;
            i4 = (-bArr[i5]) + i4;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f25532f = -1678946153;
        f25531e = -694808807;
        init$0();
        f25529c = 0;
        f25528a = 1;
        f25530d = 6249983309966754625L;
    }

    public a(T t2, b<T> bVar) {
        this.f25533b = new b<>(t2, bVar.c(), bVar.b(), bVar.d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:95|29|(1:31)(4:33|91|34|(8:36|(2:40|45)(1:39)|89|46|(2:48|55)(4:49|87|50|51)|(4:90|57|(2:59|66)(4:60|85|61|62)|(2:68|(1:(2:71|72))(2:73|74)))|75|76)(1:41))|32|89|46|(0)(0)|(0)|75|76) */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0465 A[Catch: Exception -> 0x049c, TRY_LEAVE, TryCatch #2 {Exception -> 0x049c, blocks: (B:46:0x0442, B:49:0x0465, B:51:0x048d, B:53:0x0495, B:54:0x049b, B:50:0x046f), top: B:89:0x0442, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x049f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ex.a.a(int, int):java.lang.Object[]");
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 45;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        k kVar = new k();
        char[] cArrC = k.c(f25530d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25530d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - Color.blue(0), (char) (AndroidCharacter.getMirror('0') + 50956), 9 - KeyEvent.normalizeMetaState(0), 1749983833, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 676, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 522683165, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = o.ex.a.$$a
            int r0 = r8 * 3
            int r6 = 100 - r0
            int r5 = r10 + 4
            int r4 = r9 * 3
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r7 != 0) goto L29
            r0 = r6
            r6 = r4
            r1 = r2
        L14:
            int r6 = r6 + r0
        L15:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r5 = r5 + 1
            if (r1 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r11[r2] = r0
            return
        L24:
            int r1 = r1 + 1
            r0 = r7[r5]
            goto L14
        L29:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ex.a.h(int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{116, 109, 87, -103};
        $$b = 65;
    }

    static void init$1() {
        $$c = new byte[]{45, 113, 111, 122};
        $$d = 117;
    }

    public final c b() {
        int i2 = 2 % 2;
        int i3 = f25528a + 79;
        f25529c = i3 % 128;
        int i4 = i3 % 2;
        c cVarC = this.f25533b.c();
        int i5 = f25528a + 69;
        f25529c = i5 % 128;
        if (i5 % 2 == 0) {
            return cVarC;
        }
        throw null;
    }

    public final T c() {
        int i2 = 2 % 2;
        int i3 = f25529c + 21;
        f25528a = i3 % 128;
        int i4 = i3 % 2;
        T tA = this.f25533b.a();
        int i5 = f25529c + 113;
        f25528a = i5 % 128;
        int i6 = i5 % 2;
        return tA;
    }

    public final n d() throws WalletValidationException {
        int i2 = 2 % 2;
        o.ep.d dVarD = this.f25533b.d();
        y yVar = new y(dVarD, (o.er.a) dVarD.G());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        n nVar = new n(yVar.a(), dVarD, yVar.c(), yVar, arrayList);
        int i3 = f25529c + 105;
        f25528a = i3 % 128;
        int i4 = i3 % 2;
        return nVar;
    }
}
