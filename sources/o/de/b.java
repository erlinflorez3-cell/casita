package o.de;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.BackoffPolicy;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.l;
import o.dd.g;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22909a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22910b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22911c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f22912d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22913e = 0;

    private static String $$c(int i2, byte b2, short s2) {
        byte[] bArr = $$a;
        int i3 = i2 * 4;
        int i4 = (s2 * 2) + 117;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4);
            i5 = i5;
        }
        while (true) {
            i7++;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i8];
            i5 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22909a = 0;
        f22910b = 1;
        f22913e = 0;
        f22911c = 1;
        e();
        ViewConfiguration.getScrollFriction();
        int i2 = f22910b + 27;
        f22909a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
    }

    static void e() {
        f22912d = new int[]{954428932, -1463256708, -410852394, -772239878, 1554143525, 690644160, 1285508548, 890554313, -261914713, 739622324, -1499087300, 1663673941, -1581617453, -669913266, -55834790, 146091886, -259178125, 1568309835};
    }

    public static boolean e(o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = 1232037242 * o.bg.c.f21082a;
        o.bg.c.f21082a = i3;
        int iMyUid = Process.myUid();
        int i4 = 1942342535 * o.bg.c.f21083c;
        o.bg.c.f21083c = i4;
        if (((Boolean) o.bg.c.a(i3, i4, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue()) {
            return false;
        }
        int i5 = f22911c + 69;
        f22913e = i5 % 128;
        int i6 = i5 % 2;
        if (cVar.c() != o.bg.a.f21050s) {
            return false;
        }
        int i7 = f22911c + 95;
        f22913e = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22912d;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(View.MeasureSpec.getMode(i5) + 675, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - Process.getGidForName(""), -328001469, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 989264422;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f22912d;
        if (iArr5 != null) {
            int i9 = $11 + 59;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i11 = 0; i11 < length3; i11++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(Color.argb(0, 0, 0, 0) + 675, (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12, -328001469, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c2] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                lVar.f19942e ^= iArr4[i12];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(301 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (52697 - View.resolveSizeAndState(0, 0, 0)), 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1416256172, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i12++;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
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
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 229, (char) (51003 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, -330018025, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            c2 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i17 = $10 + 89;
        $11 = i17 % 128;
        if (i17 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i18 = 65 / 0;
            objArr[0] = str;
        }
    }

    static void init$0() {
        $$a = new byte[]{7, -110, 9, 72};
        $$b = 55;
    }

    @Override // o.de.d
    public final int a() {
        int i2 = 2 % 2;
        int i3 = f22911c + 91;
        f22913e = i3 % 128;
        return i3 % 2 != 0 ? 0 : 30;
    }

    @Override // o.de.d
    public final String b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22911c + 13;
        f22913e = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            f(new int[]{100969668, 1246651266, -161792433, -61197255, -1432723278, 1997931486, -805310718, 1732370677, 536862624, 228181758, 241209037, 2084939489, -1792256780, -1922236492, 2128573621, 596034599, -2014394629, -1261432805}, 1 >> KeyEvent.getDeadChar(0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f(new int[]{100969668, 1246651266, -161792433, -61197255, -1432723278, 1997931486, -805310718, 1732370677, 536862624, 228181758, 241209037, 2084939489, -1792256780, -1922236492, 2128573621, 596034599, -2014394629, -1261432805}, KeyEvent.getDeadChar(0, 0) + 35, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f22911c + 27;
        f22913e = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.de.d
    public final BackoffPolicy c() {
        int i2 = 2 % 2;
        int i3 = f22913e + 55;
        f22911c = i3 % 128;
        int i4 = i3 % 2;
        BackoffPolicy backoffPolicy = BackoffPolicy.LINEAR;
        int i5 = f22911c + 23;
        f22913e = i5 % 128;
        int i6 = i5 % 2;
        return backoffPolicy;
    }

    @Override // o.de.d
    public final boolean c(g gVar) {
        int i2 = 2 % 2;
        int i3 = f22911c + 31;
        f22913e = i3 % 128;
        if (i3 % 2 != 0) {
            g gVar2 = g.f22872q;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (gVar != g.f22872q) {
            return false;
        }
        int i4 = f22913e + 63;
        f22911c = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // o.de.d
    public final g d(o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = f22913e + 61;
        f22911c = i3 % 128;
        int i4 = i3 % 2;
        g gVar = g.f22872q;
        int i5 = f22911c + 103;
        f22913e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return gVar;
    }

    @Override // o.de.d
    public final int e(int i2) {
        int i3 = 2 % 2;
        int i4 = f22913e;
        int i5 = i4 + 99;
        f22911c = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 95;
        f22911c = i7 % 128;
        int i8 = i7 % 2;
        return 30;
    }

    @Override // o.de.d
    public final boolean e(o.bg.c cVar, o.dd.c cVar2) {
        int i2 = 2 % 2;
        int i3 = f22913e + 51;
        f22911c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 1232037242 * o.bg.c.f21082a;
        o.bg.c.f21082a = i5;
        int iMyUid = Process.myUid();
        int i6 = 1942342535 * o.bg.c.f21083c;
        o.bg.c.f21083c = i6;
        if (((Boolean) o.bg.c.a(i5, i6, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue() || cVar.c() != o.bg.a.f21050s) {
            int i7 = f22911c + 73;
            f22913e = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = f22911c + 57;
        f22913e = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 51 / 0;
        }
        return true;
    }
}
