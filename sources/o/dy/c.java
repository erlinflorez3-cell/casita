package o.dy;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.n;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f23448a = 0;

    /* JADX INFO: renamed from: b */
    private static int f23449b = 0;

    /* JADX INFO: renamed from: c */
    private static int f23450c = 0;

    /* JADX INFO: renamed from: d */
    public static final c f23451d;

    /* JADX INFO: renamed from: e */
    private static int f23452e = 0;

    /* JADX INFO: renamed from: f */
    private static int f23453f = 0;

    /* JADX INFO: renamed from: g */
    public static int f23454g = 0;

    /* JADX INFO: renamed from: h */
    public static int f23455h = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            int r0 = r8 * 2
            int r0 = r0 + 113
            byte[] r8 = o.dy.c.$$c
            int r2 = r9 * 2
            int r1 = 1 - r2
            int r7 = r7 + 4
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2c
            r2 = r4
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            r2 = r3
        L18:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            int r7 = r7 + 1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r7]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dy.c.$$g(byte, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23455h = 1281782585;
        f23454g = 1064917594;
        init$0();
        f23452e = 0;
        f23453f = 1;
        f23449b = 0;
        f23448a = 1;
        d();
        f23451d = new c();
        int i2 = f23453f + 35;
        f23452e = i2 % 128;
        int i3 = i2 % 2;
    }

    private c() {
    }

    static void d() {
        f23450c = -1270219344;
    }

    private static void i(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 23;
        $10 = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i7 = $10 + 93;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f23450c)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objA = o.d.d.a(270 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 11, -2071844881, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 522, (char) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getSize(0) + 12, 627984172, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i10 = $11 + 65;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a((Process.myPid() >> 22) + 522, (char) TextUtils.getOffsetBefore("", 0), AndroidCharacter.getMirror('0') - '$', 627984172, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i12 = $10 + 41;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{45, 113, 111, 122};
        $$b = 115;
    }

    static void init$1() {
        $$d = new byte[]{53, 97, -95, 41, 60, MessagePack.Code.BIN8, -18, Utf8.REPLACEMENT_BYTE, -67, 67, -20};
        $$e = 55;
    }

    static void init$2() {
        $$c = new byte[]{7, 42, -92, 85};
        $$f = 245;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r2 = r7 * 4
            int r0 = 1 - r2
            byte[] r7 = o.dy.c.$$a
            int r1 = r6 + 4
            int r6 = 100 - r8
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2b
            r0 = r1
            r6 = r3
            r2 = r4
        L14:
            int r1 = r1 + r6
            r6 = r1
            r1 = r0
        L17:
            int r0 = r1 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L26:
            int r2 = r2 + 1
            r1 = r7[r0]
            goto L14
        L2b:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dy.c.j(short, int, short, java.lang.Object[]):void");
    }

    private static void k(byte b2, int i2, short s2, Object[] objArr) {
        int i3 = 111 - (b2 * 12);
        byte[] bArr = $$d;
        int i4 = i2 * 7;
        int i5 = 10 - (s2 * 7);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = (i5 + (-i4)) - 5;
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i5 + 1;
            i3 = (i3 + (-bArr[i7])) - 5;
            i5 = i7;
        }
    }

    @Override // o.dy.d
    public final String a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23449b + 27;
        f23448a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        i((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, "\ufffb\f\ufffe�", false, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 274, View.MeasureSpec.makeMeasureSpec(0, 0) + 3, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f23449b + 71;
        f23448a = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0065 A[PHI: r17
  0x0065: PHI (r17v3 long) = (r17v0 long), (r17v5 long) binds: [B:115:0x00fc, B:106:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0100  */
    /* JADX WARN: Type inference failed for: r0v47, types: [char, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dy.c.toString():java.lang.String");
    }
}
