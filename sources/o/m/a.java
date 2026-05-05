package o.m;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int[] f26393a = null;

    /* JADX INFO: renamed from: c */
    private static int f26394c = 0;

    /* JADX INFO: renamed from: d */
    private static int f26395d = 0;

    /* JADX INFO: renamed from: f */
    private static int f26396f = 0;

    /* JADX INFO: renamed from: h */
    private static int f26397h = 0;

    /* JADX INFO: renamed from: b */
    private final c f26398b;

    /* JADX INFO: renamed from: e */
    private final i f26399e;

    private static String $$c(int i2, byte b2, int i3) {
        byte[] bArr = $$a;
        int i4 = 3 - (b2 * 2);
        int i5 = i3 * 3;
        int i6 = 121 - (i2 * 2);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i6 += -i7;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i6;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i6 += -bArr[i4];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26396f = 0;
        f26397h = 1;
        f26395d = 0;
        f26394c = 1;
        a();
        Process.myTid();
        int i2 = f26396f + 93;
        f26397h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
    }

    public a(c cVar, i iVar) {
        this.f26398b = cVar;
        this.f26399e = iVar;
    }

    static void a() {
        f26393a = new int[]{1853887883, 556718160, -1648732399, 947692088, -1606751341, 1314410400, -52884812, 1020509714, 1874644434, -2135378928, -454159992, 1410273016, -494509774, -921125096, 1480129185, 1752636175, -901608941, 1893555710};
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f26393a;
        long j2 = 0;
        int i4 = 989264422;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = $11 + 93;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 3;
            }
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ExpandableListView.getPackedPositionChild(j2) + 1), 12 - View.resolveSizeAndState(0, 0, 0), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    j2 = 0;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f26393a;
        char c2 = '0';
        if (iArr6 != null) {
            int i8 = $10 + 55;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 81;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i9])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 675;
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iIndexOf = TextUtils.indexOf("", c2, 0, 0) + 13;
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(scrollBarSize, cIndexOf, iIndexOf, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i9 = 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i9])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(675 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.getSize(0), MotionEvent.axisFromString("") + 13, -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                c2 = '0';
            }
            iArr6 = iArr2;
        }
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 61;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    lVar.f19942e ^= iArr5[i11];
                    Object[] objArr5 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int scrollBarSize2 = 301 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char modifierMetaStateMask = (char) (52696 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 11;
                        byte b8 = (byte) ($$b & 1);
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(scrollBarSize2, modifierMetaStateMask, threadPriority, -1416256172, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i11 += 92;
                } else {
                    lVar.f19942e ^= iArr5[i11];
                    Object[] objArr6 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        int scrollBarSize3 = 301 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 52697);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 12;
                        int i14 = $$b;
                        byte b10 = (byte) ((i14 + 1) - (i14 | 1));
                        byte b11 = (byte) (b10 - 1);
                        objA5 = o.d.d.a(scrollBarSize3, absoluteGravity, iIndexOf2, -1416256172, false, $$c(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i11++;
                }
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                int mode = 229 - View.MeasureSpec.getMode(0);
                char c4 = (char) (51004 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int iNormalizeMetaState = 9 - KeyEvent.normalizeMetaState(0);
                int i18 = $$b;
                byte b12 = (byte) ((i18 + 2) - (i18 | 2));
                byte b13 = (byte) (b12 - 2);
                objA6 = o.d.d.a(mode, c4, iNormalizeMetaState, -330018025, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 15;
    }

    public final void c(Context context, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26395d + 49;
        f26394c = i3 % 128;
        int i4 = i3 % 2;
        if (aVar == null) {
            return;
        }
        Object[] objArr = {this.f26398b, context};
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        o.ef.a aVar2 = (o.ef.a) c.d((int) Process.getElapsedCpuTime(), Thread.currentThread().getPriority(), -1764130032, 1764130032, iActiveCount, elapsedCpuTime, objArr);
        try {
            aVar2.a(this.f26399e.toString(), aVar);
            int i5 = f26395d + 91;
            f26394c = i5 % 128;
            int i6 = i5 % 2;
            this.f26398b.e(context, aVar2);
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr2 = new Object[1];
                g(new int[]{303256007, 1541394691, 251625818, -1530836649, 1790094432, -1720318259, -962847699, 2033067253, 1074578618, -1628449358, -816798679, -2112501338, -241212272, -1280068064, -857156075, -240633845, -645398464, -1937296771, 1924209277, 273803279}, TextUtils.getCapsMode("", 0, 0) + 40, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                g(new int[]{1927124545, 1092059651, 976251725, 766810742, 443109356, 1357987966, -20728538, -1445789951, -648033248, -1047818799, -1329388293, 363199940, -316366878, -1068311381}, 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                o.ea.f.e(strIntern, ((String) objArr3[0]).intern(), e2);
                int i7 = f26394c + 111;
                f26395d = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }
}
