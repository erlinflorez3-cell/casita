package fr.antelop.sdk.transaction.hce;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.CardDisplay;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.o;
import o.d.d;
import o.dq.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class HceTransaction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f19548a = 0;

    /* JADX INFO: renamed from: b */
    public static int f19549b = 0;

    /* JADX INFO: renamed from: c */
    private static int f19550c = 0;

    /* JADX INFO: renamed from: d */
    private static long f19551d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f19552e = null;
    private final c innerTransaction;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r8, byte r9, short r10) {
        /*
            byte[] r7 = fr.antelop.sdk.transaction.hce.HceTransaction.$$c
            int r0 = r8 * 3
            int r6 = 1 - r0
            int r5 = r9 + 99
            int r4 = r10 + 4
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r7 != 0) goto L24
            r0 = r6
            r1 = r2
        L11:
            int r5 = r5 + r0
        L12:
            int r4 = r4 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L21:
            r0 = r7[r4]
            goto L11
        L24:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransaction.$$g(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19549b = 25465497;
        init$0();
        f19550c = 0;
        f19548a = 1;
        f19552e = new char[]{38035, 26422, 29634, 20094, 23093, 22217, 8554, 15738, 2509, 1147, 4216, 60655, 65395, 52003, 51146, 53857, 44607, 47867, 46442, 33027, 40409, 26731, 19123, 47376, 44515, 36952, 33805, 35041, 65358, 58146, 55267, 55885, 52766, 13036, 8519, 5401, 6655, 24722, 37683, 34778, 47719, 44670, 41670, 54629, 51504, 64975, 61484, 58383, 6351, 2931, 16174, 13265, 9827, 24562, 44117, 47274, 34059, 37191, 40352, 59923, 63044, 49795, 52992, 56140, 10173, 13344, 'V', 3251, 6408, 38035, 26422, 29634, 20094, 23093, 22217, 8554, 15738, 2499, 1144, 4134, 60562, 65355, 52019, 51146, 53869, 44580, 47825, 46450, 33045, 40430, 26728, 25628, 28881, 17251, 24332, 10189, 54385, 49288, 64802, 59747, 58770, 37414, 36425, 47758, 46884, 41830, 24457, 19509, 30829, 29846, 24881, 7521, 2442};
        f19551d = -7718710716396509352L;
    }

    public HceTransaction(c cVar) {
        this.innerTransaction = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r9, byte r10, int r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.transaction.hce.HceTransaction.$$a
            int r0 = r10 * 2
            int r7 = r0 + 4
            int r6 = 101 - r9
            int r0 = r11 * 4
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r8 != 0) goto L2a
            r0 = r7
            r2 = r3
        L13:
            int r7 = r7 + 1
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r8[r7]
            goto L13
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransaction.f(byte, byte, int, java.lang.Object[]):void");
    }

    private static void g(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 47;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f19552e[i2 - i7])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(741 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getTapTimeout() >> 16), 12 - TextUtils.getCapsMode("", 0, 0), 632508977, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f19551d), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(766 - TextUtils.getTrimmedLength(""), (char) (12470 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 1946853218, false, $$g(b4, b5, (byte) (-b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 387, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - MotionEvent.axisFromString(""), 39570797, false, $$g(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), (byte) (-1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f19552e[i2 + i8])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = d.a(742 - View.resolveSizeAndState(0, 0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, 632508977, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f19551d), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objA5 = d.a(766 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12470), TextUtils.indexOf("", "") + 12, 1946853218, false, $$g(b9, b10, (byte) (-b10)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 386, (char) TextUtils.getTrimmedLength(""), 18 - Color.alpha(0), 39570797, false, $$g(b11, (byte) (6 | b11), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i9 = $10 + 103;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i11 = $11 + 49;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = {oVar, oVar};
                Object objA7 = d.a(-723636472);
                if (objA7 == null) {
                    byte b12 = (byte) 0;
                    objA7 = d.a(387 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 18 - ExpandableListView.getPackedPositionGroup(0L), 39570797, false, $$g(b12, (byte) ((b12 + 6) - (6 & b12)), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA7).invoke(null, objArr8);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr9 = {oVar, oVar};
            Object objA8 = d.a(-723636472);
            if (objA8 == null) {
                byte b13 = (byte) 0;
                objA8 = d.a(388 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 39570797, false, $$g(b13, (byte) ((b13 + 6) - (6 & b13)), (byte) (-1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r7 = r9 + 4
            int r6 = r10 * 43
            int r1 = r6 + 1
            int r0 = r8 * 4
            int r0 = r0 + 98
            byte[] r5 = fr.antelop.sdk.transaction.hce.HceTransaction.$$d
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L2a
            r1 = r7
            r2 = r6
            r0 = r3
        L14:
            int r7 = r7 + r2
            r2 = r0
        L16:
            byte r0 = (byte) r7
            r4[r2] = r0
            int r1 = r1 + 1
            int r0 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L27:
            r2 = r5[r1]
            goto L14
        L2a:
            r2 = r3
            r1 = r7
            r7 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransaction.h(int, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{117, -10, 112, 71};
        $$b = 208;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.CR, MessagePack.Code.FALSE, -97, -84, Ascii.FF, -68, 51, Ascii.CR, 6, -15, 7, 3, 1, -66, 69, -15, 7, MessagePack.Code.TRUE, 54, 5, -2, 2, Ascii.VT, -19, Ascii.VT, -9, -2, 17, -14, MessagePack.Code.FLOAT32, 37, Ascii.DC2, -2, Ascii.DC2, -3, -13, -17, Ascii.ESC, -4, -6, 9, -28, 19, Ascii.SO, 2, -8, -8};
        $$e = 162;
    }

    static void init$2() {
        $$c = new byte[]{108, -10, -111, 117};
        $$f = 184;
    }

    public final String getAccountLabel() {
        int i2 = 2 % 2;
        int i3 = f19550c + 91;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        String strL = this.innerTransaction.l();
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return strL;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getAccountNumber() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.transaction.hce.HceTransaction.getAccountNumber():java.lang.String");
    }

    public final BigDecimal getAmount() {
        int i2 = 2 % 2;
        int i3 = f19550c + 43;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerTransaction.e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BigDecimal bigDecimalE = this.innerTransaction.e();
        int i4 = f19548a + 25;
        f19550c = i4 % 128;
        int i5 = i4 % 2;
        return bigDecimalE;
    }

    public final String getCardBin() {
        int i2 = 2 % 2;
        int i3 = f19550c + 35;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.innerTransaction.g();
        int i5 = f19550c + 55;
        f19548a = i5 % 128;
        if (i5 % 2 != 0) {
            return strG;
        }
        throw null;
    }

    public final CardDisplay getCardDisplay() {
        CardDisplay cardDisplayK;
        int i2 = 2 % 2;
        int i3 = f19550c + 79;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            cardDisplayK = this.innerTransaction.K();
            int i4 = 29 / 0;
        } else {
            cardDisplayK = this.innerTransaction.K();
        }
        int i5 = f19548a + 67;
        f19550c = i5 % 128;
        if (i5 % 2 == 0) {
            return cardDisplayK;
        }
        throw null;
    }

    public final String getCardGraphicResource() {
        int i2 = 2 % 2;
        int i3 = f19550c + 105;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = c.X * (-1846170485);
            c.X = i4;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerTransaction};
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i5 = c.X * (-1846170485);
        c.X = i5;
        String str = (String) c.e(Process.myPid(), Thread.currentThread().getPriority(), objArr2, 191638324, elapsedCpuTime2, -191638299, i5);
        int i6 = f19550c + 65;
        f19548a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 54 / 0;
        }
        return str;
    }

    public final String getCardId() {
        int i2 = 2 % 2;
        int i3 = f19548a + 55;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerTransaction};
        int i5 = c.ab * (-349012037);
        c.ab = i5;
        int iNextInt = new Random().nextInt(1939314254);
        int i6 = 1430505636 * c.Y;
        c.Y = i6;
        String str = (String) c.e(i6, new Random().nextInt(1203971282), objArr, 1142185313, i5, -1142185285, iNextInt);
        int i7 = f19550c + 103;
        f19548a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 72 / 0;
        }
        return str;
    }

    public final String getCardLabel() {
        int i2 = 2 % 2;
        int i3 = f19550c + 113;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int priority = Thread.currentThread().getPriority();
            int iNextInt = new Random().nextInt(1277365266);
            int iMyUid = Process.myUid();
            int i4 = c.af * (-682706040);
            c.af = i4;
            throw null;
        }
        Object[] objArr2 = {this.innerTransaction};
        int priority2 = Thread.currentThread().getPriority();
        int iNextInt2 = new Random().nextInt(1277365266);
        int iMyUid2 = Process.myUid();
        int i5 = c.af * (-682706040);
        c.af = i5;
        String str = (String) c.e(iMyUid2, i5, objArr2, 1073598465, priority2, -1073598435, iNextInt2);
        int i6 = f19548a + 75;
        f19550c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getCardLastDigits() {
        int i2 = 2 % 2;
        int i3 = f19550c + 85;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        c cVar = this.innerTransaction;
        if (i4 != 0) {
            return cVar.n();
        }
        cVar.n();
        throw null;
    }

    public final Currency getCurrency() {
        int i2 = 2 % 2;
        int i3 = f19548a + 11;
        f19550c = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int i4 = c.C * (-896593574);
            c.C = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt();
            int i5 = c.D * (-204835228);
            c.D = i5;
            return (Currency) c.e(iNextInt, i5, objArr, -2143875984, i4, 2143875997, iFreeMemory);
        }
        Object[] objArr2 = {this.innerTransaction};
        int i6 = c.C * (-896593574);
        c.C = i6;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int iNextInt2 = new Random().nextInt();
        int i7 = c.D * (-204835228);
        c.D = i7;
        int i8 = 95 / 0;
        return (Currency) c.e(iNextInt2, i7, objArr2, -2143875984, i6, 2143875997, iFreeMemory2);
    }

    public final Date getDate() {
        int i2 = 2 % 2;
        int i3 = f19550c + 103;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        Date dateS = this.innerTransaction.s();
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        return dateS;
    }

    public final String getEmvApplicationGroupId() {
        int i2 = 2 % 2;
        int i3 = f19550c + 7;
        f19548a = i3 % 128;
        if (i3 % 2 != 0) {
            return (String) c.e((int) SystemClock.uptimeMillis(), new Random().nextInt(300912412), new Object[]{this.innerTransaction}, 2098923982, (int) Thread.currentThread().getId(), -2098923965, (int) Runtime.getRuntime().freeMemory());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmvApplicationGroupLabel() {
        int i2 = 2 % 2;
        int i3 = f19548a + 97;
        f19550c = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerTransaction.t();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strT = this.innerTransaction.t();
        int i4 = f19548a + 65;
        f19550c = i4 % 128;
        int i5 = i4 % 2;
        return strT;
    }

    public final String getEmvApplicationId() {
        String strX;
        int i2 = 2 % 2;
        int i3 = f19550c + 77;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            strX = this.innerTransaction.x();
            int i4 = 94 / 0;
        } else {
            strX = this.innerTransaction.x();
        }
        int i5 = f19548a + 113;
        f19550c = i5 % 128;
        int i6 = i5 % 2;
        return strX;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f19548a + 3;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerTransaction};
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt(423703607);
        int i5 = 773153646 * c.f23266z;
        c.f23266z = i5;
        int i6 = (-1800485676) * c.B;
        c.B = i6;
        String str = (String) c.e(i5, i6, objArr, -1705658359, iNextInt, 1705658373, iNextInt2);
        int i7 = f19548a + 19;
        f19550c = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIssuerAccountId() {
        int i2 = 2 % 2;
        int i3 = f19548a + 99;
        f19550c = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerTransaction};
            int i4 = c.f23251k * (-1834325944);
            c.f23251k = i4;
            int i5 = c.f23259s * 1781278996;
            c.f23259s = i5;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerTransaction};
        int i6 = c.f23251k * (-1834325944);
        c.f23251k = i6;
        int i7 = c.f23259s * 1781278996;
        c.f23259s = i7;
        String str = (String) c.e((int) Runtime.getRuntime().freeMemory(), Process.myUid(), objArr2, 1671682430, i6, -1671682423, i7);
        int i8 = f19550c + 27;
        f19548a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    @Deprecated
    public final double getLatitude() {
        int i2 = 2 % 2;
        int i3 = f19550c + 7;
        f19548a = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerTransaction};
            int i4 = c.J * (-224016517);
            c.J = i4;
            int iMyPid = Process.myPid();
            int i5 = c.K * 1241218984;
            c.K = i5;
            int i6 = c.M * (-727703704);
            c.M = i6;
            return ((Double) c.e(i5, i6, objArr, 1215566857, i4, -1215566837, iMyPid)).doubleValue();
        }
        Object[] objArr2 = {this.innerTransaction};
        int i7 = c.J * (-224016517);
        c.J = i7;
        int iMyPid2 = Process.myPid();
        int i8 = c.K * 1241218984;
        c.K = i8;
        int i9 = c.M * (-727703704);
        c.M = i9;
        int i10 = 56 / 0;
        return ((Double) c.e(i8, i9, objArr2, 1215566857, i7, -1215566837, iMyPid2)).doubleValue();
    }

    @Deprecated
    public final double getLongitude() {
        int i2 = 2 % 2;
        int i3 = f19550c + 83;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        double dJ = this.innerTransaction.j();
        int i5 = f19548a + 21;
        f19550c = i5 % 128;
        int i6 = i5 % 2;
        return dJ;
    }

    public final String getMerchantCategoryCode() {
        int i2 = 2 % 2;
        int i3 = f19550c + 73;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        c cVar = this.innerTransaction;
        if (i4 != 0) {
            return cVar.u();
        }
        cVar.u();
        throw null;
    }

    public final String getMerchantName() {
        int i2 = 2 % 2;
        int i3 = f19548a + 117;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        String strD = this.innerTransaction.d();
        int i5 = f19550c + 99;
        f19548a = i5 % 128;
        int i6 = i5 % 2;
        return strD;
    }

    public final String getMerchantPostalCode() {
        int i2 = 2 % 2;
        int i3 = f19548a + 87;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        String strV = this.innerTransaction.v();
        int i5 = f19548a + 61;
        f19550c = i5 % 128;
        int i6 = i5 % 2;
        return strV;
    }

    public final HceTransactionStatus getStatus() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19550c + 35;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        HceTransactionStatus hceTransactionStatusB = this.innerTransaction.B();
        int i5 = f19548a + 53;
        f19550c = i5 % 128;
        int i6 = i5 % 2;
        return hceTransactionStatusB;
    }

    public final TransactionType getTransactionType() {
        int i2 = 2 % 2;
        int i3 = f19550c + 1;
        f19548a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerTransaction};
        int priority = Thread.currentThread().getPriority();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iNextInt = new Random().nextInt();
        int i5 = (-477267446) * c.f23262v;
        c.f23262v = i5;
        TransactionType transactionType = (TransactionType) c.e(iNextInt, i5, objArr, -752829482, priority, 752829492, elapsedCpuTime);
        int i6 = f19548a + 55;
        f19550c = i6 % 128;
        int i7 = i6 % 2;
        return transactionType;
    }

    @Deprecated
    public final boolean isGeolocated() {
        int i2 = 2 % 2;
        int i3 = f19550c + 87;
        f19548a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int i4 = c.O * (-1924594492);
            c.O = i4;
            int i5 = c.Q * (-1945472441);
            c.Q = i5;
            int i6 = c.P * (-1688934401);
            c.P = i6;
            ((Boolean) c.e(i6, Process.myPid(), objArr, -1111667539, i4, 1111667561, i5)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerTransaction};
        int i7 = c.O * (-1924594492);
        c.O = i7;
        int i8 = c.Q * (-1945472441);
        c.Q = i8;
        int i9 = c.P * (-1688934401);
        c.P = i9;
        boolean zBooleanValue = ((Boolean) c.e(i9, Process.myPid(), objArr2, -1111667539, i7, 1111667561, i8)).booleanValue();
        int i10 = f19548a + 41;
        f19550c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
        return zBooleanValue;
    }

    public final boolean isHighValueTransaction() {
        int i2 = 2 % 2;
        int i3 = f19548a + 25;
        f19550c = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int i4 = c.f23257q * 93949810;
            c.f23257q = i4;
            int i5 = c.f23260t * 1875310279;
            c.f23260t = i5;
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = c.f23256p * (-2084082294);
            c.f23256p = i6;
            return ((Boolean) c.e(iUptimeMillis, i6, objArr, -339688243, i4, 339688251, i5)).booleanValue();
        }
        Object[] objArr2 = {this.innerTransaction};
        int i7 = c.f23257q * 93949810;
        c.f23257q = i7;
        int i8 = c.f23260t * 1875310279;
        c.f23260t = i8;
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i9 = c.f23256p * (-2084082294);
        c.f23256p = i9;
        int i10 = 85 / 0;
        return ((Boolean) c.e(iUptimeMillis2, i9, objArr2, -339688243, i7, 339688251, i8)).booleanValue();
    }

    public final boolean isOfflineTransaction() {
        int i2 = 2 % 2;
        int i3 = f19548a + 105;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        boolean zG = this.innerTransaction.G();
        int i5 = f19550c + 17;
        f19548a = i5 % 128;
        if (i5 % 2 != 0) {
            return zG;
        }
        throw null;
    }

    public final boolean isOnlinePinRequired() {
        int i2 = 2 % 2;
        int i3 = f19548a + 53;
        f19550c = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerTransaction};
            int id = (int) Thread.currentThread().getId();
            int iMyUid = Process.myUid();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = c.f23258r * 1296178575;
            c.f23258r = i4;
            return ((Boolean) c.e(iUptimeMillis, i4, objArr, -623077117, id, 623077126, iMyUid)).booleanValue();
        }
        Object[] objArr2 = {this.innerTransaction};
        int id2 = (int) Thread.currentThread().getId();
        int iMyUid2 = Process.myUid();
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i5 = c.f23258r * 1296178575;
        c.f23258r = i5;
        ((Boolean) c.e(iUptimeMillis2, i5, objArr2, -623077117, id2, 623077126, iMyUid2)).booleanValue();
        throw null;
    }

    public final boolean isSignatureRequired() {
        int i2 = 2 % 2;
        int i3 = f19550c + 57;
        f19548a = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerTransaction};
            int iNextInt = new Random().nextInt(509633913);
            int iMyPid = Process.myPid();
            int i4 = c.f23241a * (-890089949);
            c.f23241a = i4;
            int i5 = c.f23245e * (-1519906128);
            c.f23245e = i5;
            return ((Boolean) c.e(i4, i5, objArr, -1160227292, iNextInt, 1160227292, iMyPid)).booleanValue();
        }
        Object[] objArr2 = {this.innerTransaction};
        int iNextInt2 = new Random().nextInt(509633913);
        int iMyPid2 = Process.myPid();
        int i6 = c.f23241a * (-890089949);
        c.f23241a = i6;
        int i7 = c.f23245e * (-1519906128);
        c.f23245e = i7;
        int i8 = 25 / 0;
        return ((Boolean) c.e(i6, i7, objArr2, -1160227292, iNextInt2, 1160227292, iMyPid2)).booleanValue();
    }

    public final boolean isTransit() {
        int i2 = 2 % 2;
        int i3 = f19548a + 113;
        f19550c = i3 % 128;
        int i4 = i3 % 2;
        c cVar = this.innerTransaction;
        if (i4 == 0) {
            return cVar.E();
        }
        cVar.E();
        throw null;
    }

    public final String toString() {
        String merchantCategoryCode;
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder("HceTransaction{id=").append(getId()).append(", currency=").append(getCurrency()).append(", amount=").append(getAmount()).append(", merchantName=").append(getMerchantName()).append(", merchantCategoryCode");
        String merchantPostalCode = "";
        if (getMerchantCategoryCode() == null) {
            int i3 = f19550c + 103;
            f19548a = i3 % 128;
            int i4 = i3 % 2;
            merchantCategoryCode = "";
        } else {
            merchantCategoryCode = getMerchantCategoryCode();
        }
        StringBuilder sbAppend2 = sbAppend.append(merchantCategoryCode).append(", longitude=").append(getLongitude()).append(", latitude=").append(getLatitude()).append(", isGeolocated=").append(isGeolocated()).append(", cardLabel=").append(getCardLabel()).append(", cardBin=").append(getCardBin()).append(", cardLastDigits=").append(getCardLastDigits()).append(", accountNumber=").append(getAccountNumber()).append(", issuerAccountId=").append(getIssuerAccountId()).append(", accountLabel=").append(getAccountLabel()).append(", cardId=").append(getCardId()).append(", emvApplicationGroupLabel=").append(getEmvApplicationGroupLabel()).append(", emvApplicationGroupId=").append(getEmvApplicationGroupId()).append(", date=").append(getDate()).append(", cardGraphicResource=").append(getCardGraphicResource()).append(", cardDisplay=").append(getCardDisplay()).append(", status=").append(getStatus()).append(", transactionType=").append(getTransactionType()).append(", typeTransit=").append(isTransit()).append(", isHighValueTransaction=").append(isHighValueTransaction()).append(", isOfflineTransaction=").append(isOfflineTransaction()).append(", isSignatureRequired=").append(isSignatureRequired()).append(", isOnlinePinRequired=").append(isOnlinePinRequired()).append(", merchantPostalCode=");
        if (getMerchantPostalCode() == null) {
            int i5 = f19548a + 63;
            f19550c = i5 % 128;
            int i6 = i5 % 2;
        } else {
            merchantPostalCode = getMerchantPostalCode();
        }
        return sbAppend2.append(merchantPostalCode).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
