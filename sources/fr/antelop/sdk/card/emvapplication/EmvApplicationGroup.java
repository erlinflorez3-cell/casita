package fr.antelop.sdk.card.emvapplication;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.o;
import o.d.d;
import o.ep.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class EmvApplicationGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f18955a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f18956b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f18957c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f18958d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18959e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18960f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18961g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18962h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18963i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18964j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18965k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f18966l = 0;
    private final a innerGroup;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r9, short r10, short r11) {
        /*
            int r0 = r11 * 4
            int r8 = 4 - r0
            int r7 = r9 + 99
            byte[] r6 = fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.$$c
            int r0 = r10 * 4
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L28
            r0 = r5
            r2 = r3
        L13:
            int r8 = r8 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r8]
            goto L13
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.$$e(short, short, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f18966l = -503831978;
        f18965k = 1438803971;
        f18963i = 165228167;
        f18961g = -1489569667;
        init$0();
        f18962h = 0;
        f18960f = 1;
        f18959e = 0;
        f18964j = 1;
        d();
        f18955a = new char[]{7624};
        f18956b = -2274611558204523172L;
        int i2 = f18960f + 25;
        f18962h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public EmvApplicationGroup(a aVar) {
        this.innerGroup = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(android.content.Context r29, int r30, int r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.a(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void d() {
        f18957c = new char[]{64590, 64597, 64587, 64599, 64582, 64592, 64579, 64584, 64593, 64588, 64576, 64586, 64612, 64520, 64578, 64523, 64522, 64614, 64620, 64598, 64580, 64585, 64605, 64577, 64583};
        f18958d = (char) 51642;
    }

    static void init$0() {
        $$a = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$b = 131;
    }

    static void init$1() {
        $$c = new byte[]{7, 42, -92, 85};
        $$d = 39;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(java.lang.String r29, int r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.m(java.lang.String, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(byte r8, byte r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 4
            int r7 = r10 * 4
            int r0 = r7 + 1
            byte[] r6 = fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.$$a
            int r5 = 101 - r9
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r3
            r1 = r8
        L13:
            int r8 = r8 + 1
            int r5 = r5 + r1
            r2 = r0
        L17:
            r1 = r5
            byte r0 = (byte) r1
            r4[r2] = r0
            int r0 = r2 + 1
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L27:
            r5 = r6[r8]
            goto L13
        L2a:
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.emvapplication.EmvApplicationGroup.n(byte, byte, int, java.lang.Object[]):void");
    }

    private static void o(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        int i5 = 0;
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f18955a[i2 / i7])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        int iMyPid = (Process.myPid() >> 22) + 742;
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i5, i5);
                        int packedPositionType = 12 - ExpandableListView.getPackedPositionType(0L);
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        String str$$e = $$e(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Integer.TYPE;
                        objA = d.a(iMyPid, absoluteGravity, packedPositionType, 632508977, false, str$$e, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                    long j2 = i7;
                    long j3 = f18956b;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[2] = Long.valueOf(j3);
                    objArr3[1] = Long.valueOf(j2);
                    objArr3[i5] = Long.valueOf(jLongValue);
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        int packedPositionType2 = 766 - ExpandableListView.getPackedPositionType(0L);
                        char maximumDrawingCacheSize = (char) (12470 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i5) + 13;
                        byte b4 = (byte) ($$d & 1);
                        byte b5 = (byte) (b4 - 1);
                        String str$$e2 = $$e(b4, b5, b5);
                        Class[] clsArr2 = new Class[4];
                        clsArr2[i5] = Long.TYPE;
                        clsArr2[1] = Long.TYPE;
                        clsArr2[2] = Long.TYPE;
                        clsArr2[3] = Integer.TYPE;
                        objA2 = d.a(packedPositionType2, maximumDrawingCacheSize, bitsPerPixel, 1946853218, false, str$$e2, clsArr2);
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = oVar;
                    objArr4[i5] = oVar;
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        int mode = 387 - View.MeasureSpec.getMode(i5);
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int deadChar = 18 - KeyEvent.getDeadChar(i5, i5);
                        byte b6 = (byte) i5;
                        String str$$e3 = $$e((byte) ($$d & 30), b6, b6);
                        Class[] clsArr3 = new Class[2];
                        clsArr3[i5] = Object.class;
                        clsArr3[1] = Object.class;
                        objA3 = d.a(mode, cMyPid, deadChar, 39570797, false, str$$e3, clsArr3);
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
                Object[] objArr5 = {Integer.valueOf(f18955a[i2 + i8])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    int iMakeMeasureSpec = 742 - View.MeasureSpec.makeMeasureSpec(i5, i5);
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12;
                    byte b7 = (byte) i5;
                    byte b8 = b7;
                    String str$$e4 = $$e(b7, b8, b8);
                    Class[] clsArr4 = new Class[1];
                    clsArr4[i5] = Integer.TYPE;
                    objA4 = d.a(iMakeMeasureSpec, cLastIndexOf, jumpTapTimeout, 632508977, false, str$$e4, clsArr4);
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f18956b), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    int defaultSize = View.getDefaultSize(0, 0) + 766;
                    char threadPriority = (char) (12470 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int mode2 = View.MeasureSpec.getMode(0) + 12;
                    byte b9 = (byte) ($$d & 1);
                    byte b10 = (byte) (b9 - 1);
                    objA5 = d.a(defaultSize, threadPriority, mode2, 1946853218, false, $$e(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = d.a(387 - (Process.myPid() >> 22), (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$e((byte) ((-1) - (((-1) - $$d) | ((-1) - 30))), b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
                i5 = 0;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = d.a(-723636472);
            if (objA7 == null) {
                int i9 = 388 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 18;
                int i10 = $$d;
                byte b12 = (byte) 0;
                objA7 = d.a(i9, trimmedLength, packedPositionType3, 39570797, false, $$e((byte) ((i10 + 30) - (i10 | 30)), b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i11 = $10 + 57;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Map<String, EmvApplication> emvApplications() {
        int i2 = 2 % 2;
        int i3 = f18959e + 41;
        f18964j = i3 % 128;
        int i4 = i3 % 2;
        a aVar = this.innerGroup;
        if (i4 != 0) {
            return aVar.b();
        }
        aVar.b();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCardId() {
        int i2 = 2 % 2;
        int i3 = f18959e + 95;
        f18964j = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerGroup};
        int i5 = a.f24406i * 404510432;
        a.f24406i = i5;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = a.f24405h * 1014692146;
        a.f24405h = i6;
        int i7 = a.f24403f * 285257847;
        a.f24403f = i7;
        String str = (String) a.e(-575235144, objArr, i7, 575235148, i5, i6, iElapsedRealtime);
        int i8 = f18959e + 77;
        f18964j = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDefaultEmvApplicationId() {
        int i2 = 2 % 2;
        int i3 = f18959e + 89;
        f18964j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerGroup};
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int iActiveCount = Thread.activeCount();
            int i5 = a.f24401d * 708244067;
            a.f24401d = i5;
            int i6 = a.f24404g * 300999422;
            a.f24404g = i6;
            return (String) a.e(1872929260, objArr, i6, -1872929258, i4, i5, iActiveCount);
        }
        Object[] objArr2 = {this.innerGroup};
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int iActiveCount2 = Thread.activeCount();
        int i8 = a.f24401d * 708244067;
        a.f24401d = i8;
        int i9 = a.f24404g * 300999422;
        a.f24404g = i9;
        int i10 = 46 / 0;
        return (String) a.e(1872929260, objArr2, i9, -1872929258, i7, i8, iActiveCount2);
    }

    public final EmvApplication getEmvApplication(String str) {
        int i2 = 2 % 2;
        int i3 = f18959e + 23;
        f18964j = i3 % 128;
        int i4 = i3 % 2;
        EmvApplication emvApplicationD = this.innerGroup.d(str);
        int i5 = f18964j + 111;
        f18959e = i5 % 128;
        if (i5 % 2 == 0) {
            return emvApplicationD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f18964j + 19;
        f18959e = i3 % 128;
        int i4 = i3 % 2;
        String strH = this.innerGroup.h();
        int i5 = f18959e + 87;
        f18964j = i5 % 128;
        if (i5 % 2 != 0) {
            return strH;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLabel() {
        int i2 = 2 % 2;
        int i3 = f18959e + 21;
        f18964j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerGroup};
            int i4 = a.f24399b * (-193681782);
            a.f24399b = i4;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = a.f24400c * (-1292223516);
            a.f24400c = i5;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerGroup};
        int i6 = a.f24399b * (-193681782);
        a.f24399b = i6;
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i7 = a.f24400c * (-1292223516);
        a.f24400c = i7;
        String str = (String) a.e(-579306999, objArr2, i7, 579307000, i6, elapsedCpuTime2, iElapsedRealtime2);
        int i8 = f18959e + 45;
        f18964j = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public final String getNextTransactionEmvApplicationId() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18964j + 61;
        f18959e = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerGroup.m();
            throw null;
        }
        String strM = this.innerGroup.m();
        int i4 = f18964j + 37;
        f18959e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return strM;
    }

    public final boolean isCredit() {
        boolean zD;
        int i2 = 2 % 2;
        int i3 = f18964j + 111;
        f18959e = i3 % 128;
        if (i3 % 2 != 0) {
            zD = this.innerGroup.d();
            int i4 = 62 / 0;
        } else {
            zD = this.innerGroup.d();
        }
        int i5 = f18964j + 59;
        f18959e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return zD;
    }

    public final void resetDefaultEmvApplication() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18964j + 123;
        f18959e = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerGroup.k();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.innerGroup.k();
        int i4 = f18959e + 65;
        f18964j = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void resetNextTransactionEmvApplication() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18959e + 101;
        f18964j = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerGroup.o();
        } else {
            this.innerGroup.o();
            throw null;
        }
    }

    public final void setDefaultEmvApplication(String str) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f18959e + 77;
        f18964j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerGroup, str};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i4 = a.f24407j * (-1188078458);
            a.f24407j = i4;
            a.e(2078061910, objArr, Process.myPid(), -2078061907, iUptimeMillis, i4, priority);
            int i5 = 6 / 0;
        } else {
            Object[] objArr2 = {this.innerGroup, str};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int priority2 = Thread.currentThread().getPriority();
            int i6 = a.f24407j * (-1188078458);
            a.f24407j = i6;
            a.e(2078061910, objArr2, Process.myPid(), -2078061907, iUptimeMillis2, i6, priority2);
        }
        int i7 = f18959e + 37;
        f18964j = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setNextTransactionEmvApplication(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18964j + 35;
        f18959e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerGroup.g(str);
            obj.hashCode();
            throw null;
        }
        this.innerGroup.g(str);
        int i4 = f18959e + 85;
        f18964j = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() throws Throwable {
        String cardId;
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder("EmvApplicationGroup{, id=").append(getId()).append(", label=").append(getLabel()).append(", cardId=");
        String nextTransactionEmvApplicationId = "";
        if (getCardId() == null) {
            int i3 = f18964j + 31;
            f18959e = i3 % 128;
            int i4 = i3 % 2;
            cardId = "";
        } else {
            cardId = getCardId();
        }
        StringBuilder sbAppend2 = sbAppend.append(cardId).append(", nextTransactionEmvApplicationId=");
        if (getNextTransactionEmvApplicationId() == null) {
            int i5 = f18959e + 101;
            f18964j = i5 % 128;
            int i6 = i5 % 2;
        } else {
            nextTransactionEmvApplicationId = getNextTransactionEmvApplicationId();
        }
        return sbAppend2.append(nextTransactionEmvApplicationId).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
