package o.dq;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.transaction.hce.TransactionType;
import java.lang.reflect.Method;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Enum<d> implements o.ea.d<TransactionType> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static final d f23267a;

    /* JADX INFO: renamed from: b */
    public static final d f23268b;

    /* JADX INFO: renamed from: c */
    public static final d f23269c;

    /* JADX INFO: renamed from: d */
    public static final d f23270d;

    /* JADX INFO: renamed from: e */
    public static final d f23271e;

    /* JADX INFO: renamed from: f */
    private static int f23272f = 0;

    /* JADX INFO: renamed from: g */
    private static int[] f23273g = null;

    /* JADX INFO: renamed from: h */
    private static int f23274h = 0;

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ d[] f23275i;

    /* JADX INFO: renamed from: n */
    private static int f23276n = 0;

    /* JADX INFO: renamed from: o */
    private static int f23277o = 0;

    /* JADX INFO: renamed from: j */
    private final int f23278j;

    /* JADX INFO: renamed from: o.dq.d$1 */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        private static int f23279a = 0;

        /* JADX INFO: renamed from: b */
        private static int f23280b = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f23281e;

        static {
            int[] iArr = new int[d.values().length];
            f23281e = iArr;
            try {
                iArr[d.f23268b.ordinal()] = 1;
                int i2 = f23280b;
                int i3 = (i2 ^ 31) + (((-1) - (((-1) - i2) | ((-1) - 31))) << 1);
                f23279a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23281e[d.f23267a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23281e[d.f23271e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23281e[d.f23270d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23281e[d.f23269c.ordinal()] = 5;
                int i6 = f23279a;
                int i7 = ((i6 + 117) - (117 | i6)) + ((-1) - (((-1) - i6) & ((-1) - 117)));
                f23280b = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 92 / 0;
                }
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = 1 - r0
            byte[] r7 = o.dq.d.$$a
            int r6 = r9 + 4
            int r0 = r10 * 2
            int r5 = r0 + 117
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r5
            r2 = r3
            r5 = r8
        L14:
            int r5 = r5 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r6 = r6 + 1
            r0 = r7[r6]
            goto L14
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dq.d.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23277o = 0;
        f23276n = 1;
        f23272f = 0;
        f23274h = 1;
        d();
        Object[] objArr = new Object[1];
        k(new int[]{-935213973, -1221105316, 315498168, 1164105849}, 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        f23268b = new d(((String) objArr[0]).intern(), 0, 1);
        Object[] objArr2 = new Object[1];
        k(new int[]{-259995215, 1566445212, 514056631, -1752018494}, (ViewConfiguration.getTouchSlop() >> 8) + 8, objArr2);
        f23267a = new d(((String) objArr2[0]).intern(), 1, 2);
        Object[] objArr3 = new Object[1];
        k(new int[]{-1245248696, -377875729, 563011212, 1269652944}, 6 - Color.blue(0), objArr3);
        f23271e = new d(((String) objArr3[0]).intern(), 2, 3);
        Object[] objArr4 = new Object[1];
        k(new int[]{-1503760253, 596044954}, 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
        f23270d = new d(((String) objArr4[0]).intern(), 3, 4);
        Object[] objArr5 = new Object[1];
        k(new int[]{-635900002, -926358502, 605447628, -1496924775}, 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
        f23269c = new d(((String) objArr5[0]).intern(), 4, 5);
        f23275i = a();
        int i2 = f23276n + 55;
        f23277o = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, int i2, int i3) {
        super(str, i2);
        this.f23278j = i3;
    }

    public static d a(int i2) {
        int i3 = 2 % 2;
        for (d dVar : values()) {
            int i4 = f23274h + 43;
            f23272f = i4 % 128;
            int i5 = i4 % 2;
            if (dVar.f23278j == i2) {
                return dVar;
            }
        }
        int i6 = f23272f + 65;
        f23274h = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ d[] a() {
        int i2 = 2 % 2;
        int i3 = f23274h + 31;
        f23272f = i3 % 128;
        if (i3 % 2 == 0) {
            return new d[]{f23268b, f23267a, f23271e, f23270d, f23269c};
        }
        d[] dVarArr = new d[3];
        dVarArr[0] = f23268b;
        dVarArr[0] = f23267a;
        dVarArr[5] = f23271e;
        dVarArr[3] = f23270d;
        dVarArr[2] = f23269c;
        return dVarArr;
    }

    static void d() {
        f23273g = new int[]{769789742, 1140563823, 294905632, -1645980549, -1269277304, 343350214, 627032708, -1194186899, -240883398, 1137152601, -1071766050, -2083558384, -1615799073, 806721220, -1100121453, 1347609010, -1343007509, 1168569788};
    }

    static void init$0() {
        $$a = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
        $$b = 223;
    }

    private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23273g;
        int i5 = 989264422;
        char c2 = 3;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        int windowTouchSlop = 675 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char size = (char) View.MeasureSpec.getSize(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12;
                        byte b2 = $$a[c2];
                        byte b3 = (byte) (-b2);
                        objA = o.d.d.a(windowTouchSlop, size, longPressTimeout, -328001469, false, $$c((byte) (b2 - 1), b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = 989264422;
                    c2 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23273g;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 97;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 675;
                    char c3 = (char) (1 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)));
                    int iIndexOf = 12 - TextUtils.indexOf("", "");
                    byte b4 = $$a[3];
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a(touchSlop, c3, iIndexOf, -328001469, false, $$c((byte) (b4 - 1), b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                j2 = 0;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i11 = $10 + 125;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 35;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int i17 = 302 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    char maximumDrawingCacheSize = (char) (52697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i18 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10;
                    byte b6 = $$a[3];
                    objA3 = o.d.d.a(i17, maximumDrawingCacheSize, i18, -1416256172, false, $$c((byte) (b6 - 1), (byte) (-b6), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int bitsPerPixel = 228 - ImageFormat.getBitsPerPixel(0);
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 51005);
                int iAlpha = Color.alpha(0) + 9;
                byte b7 = $$a[3];
                byte b8 = (byte) (b7 - 1);
                byte b9 = (byte) (-b7);
                objA4 = o.d.d.a(bitsPerPixel, cLastIndexOf, iAlpha, -330018025, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23274h + 55;
        f23272f = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        int i5 = f23274h + 59;
        f23272f = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f23272f + 55;
        f23274h = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = f23275i;
        if (i4 != 0) {
            return (d[]) dVarArr.clone();
        }
        throw null;
    }

    public final TransactionType b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23274h + 33;
        f23272f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass1.f23281e[ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = AnonymousClass1.f23281e[ordinal()];
        if (i5 == 1) {
            TransactionType transactionType = TransactionType.Unknown;
            int i6 = f23274h + 47;
            f23272f = i6 % 128;
            int i7 = i6 % 2;
            return transactionType;
        }
        if (i5 == 2) {
            return TransactionType.Purchase;
        }
        if (i5 == 3) {
            return TransactionType.Refund;
        }
        if (i5 == 4) {
            return TransactionType.ATM;
        }
        if (i5 == 5) {
            return TransactionType.CashBack;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        k(new int[]{-2112815993, -1333319651, 859637397, -1189504673, -1396561451, -1967053781, -340514185, -747818556, 290114328, 1511898510}, 17 - TextUtils.lastIndexOf("", '0', 0), objArr);
        throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f23274h;
        int i4 = i3 + 9;
        f23272f = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.f23278j;
        int i6 = i3 + 105;
        f23272f = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        TransactionType transactionTypeB;
        int i2 = 2 % 2;
        int i3 = f23274h + 43;
        f23272f = i3 % 128;
        if (i3 % 2 != 0) {
            transactionTypeB = b();
            int i4 = 80 / 0;
        } else {
            transactionTypeB = b();
        }
        int i5 = f23272f + 55;
        f23274h = i5 % 128;
        int i6 = i5 % 2;
        return transactionTypeB;
    }
}
