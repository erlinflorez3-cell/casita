package o.fd;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import o.a.n;
import o.d.d;
import o.eu.a;
import o.eu.b;
import o.ff.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b<o.fi.a, c> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25793a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25794b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25795c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25796d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25797f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25798g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25799h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25800j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f25801l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25802n = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25803e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25804i;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(int r8, short r9, byte r10) {
        /*
            int r0 = r9 * 4
            int r7 = 4 - r0
            int r0 = r10 * 2
            int r6 = 1 - r0
            byte[] r5 = o.fd.a.$$k
            int r0 = r8 * 2
            int r4 = 115 - r0
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r5 != 0) goto L29
            r0 = r6
            r1 = r2
        L15:
            int r0 = -r0
            int r4 = r4 + r0
            int r7 = r7 + 1
        L19:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L26:
            r0 = r5[r7]
            goto L15
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.a.$$m(int, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f25801l = 879074332;
        init$0();
        f25793a = 1206099100;
        f25796d = -468005021;
        f25794b = -1937381795;
        f25795c = 1987898809;
        f25798g = 0;
        f25802n = 1;
        f25800j = 0;
        f25799h = 1;
        e();
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.getOffsetAfter("", 0);
        TextUtils.indexOf((CharSequence) "", '0');
        int i2 = f25802n + 1;
        f25798g = i2 % 128;
        int i3 = i2 % 2;
    }

    public a() throws Throwable {
        Object[] objArr = new Object[1];
        o((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, "\ufff9\u0005\b￼\u0001\u000b\ufffb\ufff9\n￼￬\u0001\u0005�\u000b\f", false, 139 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3, objArr);
        this.f25803e = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        o(20 - TextUtils.indexOf("", "", 0, 0), "\ufff9\u0001�￨\u0002\u0003�\b\u0004\u0001\t\u0007\u0002\u0003\ufff7\u0004\u0001\ufff5\b\u0007", true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 142, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr2);
        this.f25804i = ((String) objArr2[0]).intern();
    }

    private o.ef.a a(o.fi.a aVar) throws o.ef.b {
        int id = (int) Thread.currentThread().getId();
        int i2 = f25795c * (-1440187353);
        f25795c = i2;
        return (o.ef.a) c((int) Process.getElapsedCpuTime(), id, -646950546, 646950546, new Object[]{this, aVar}, (int) Process.getElapsedCpuTime(), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x05dd A[PHI: r16
  0x05dd: PHI (r16v2 o.fd.c) = (r16v1 o.fd.c), (r16v4 o.fd.c), (r16v6 o.fd.c) binds: [B:62:0x05d9, B:10:0x0113, B:8:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073 A[PHI: r16 r20
  0x0073: PHI (r16v4 o.fd.c) = (r16v1 o.fd.c), (r16v6 o.fd.c) binds: [B:62:0x05d9, B:8:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0073: PHI (r20v14 long) = (r20v0 long), (r20v16 long) binds: [B:62:0x05d9, B:8:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.a.b(java.lang.Object[]):java.lang.Object");
    }

    private o.ef.a b(c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25799h + 89;
        f25800j = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(cVar);
        Object[] objArr = new Object[1];
        o(19 - MotionEvent.axisFromString(""), "\t\u0001\u0006￭\u0006�\u0003\u0007\f�\ufffb\u0006�\n�\ufffe�￪�\r", true, 139 - ((Process.getThreadPriority(0) + 20) >> 6), 9 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        aVarA.a(((String) objArr[0]).intern(), (Object) cVar.s());
        int i5 = f25800j + 101;
        f25799h = i5 % 128;
        int i6 = i5 % 2;
        return aVarA;
    }

    private static o.fi.a b(boolean z2, o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        o.fi.a aVar = new o.fi.a(false, bVar, s2);
        int i3 = f25800j + 51;
        f25799h = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~((i8 + i5) - (i8 & i5));
        int i10 = ~((-1) - (((-1) - (~i3)) & ((-1) - i5)));
        int i11 = (-1) - (((-1) - i9) & ((-1) - i10));
        int i12 = ~((-1) - (((-1) - (~i5)) & ((-1) - i4)));
        int i13 = (i12 + i9) - (i12 & i9);
        int i14 = (i10 + i13) - (i10 & i13);
        int i15 = i5 + i4 + i7 + ((-1814252664) * i2) + (2073254503 * i6);
        int i16 = i15 * i15;
        int i17 = ((-223937157) * i5) + 1943797760 + (1745420935 * i4) + (i11 * 1162804602) + (1162804602 * i9) + ((-1162804602) * i14) + ((-1386741760) * i7) + ((-1631584256) * i2) + ((-1368915968) * i6) + ((-1053032448) * i16);
        int i18 = (i5 * (-1919122223)) + 1408767311 + (i4 * (-1919121035)) + (i11 * (-594)) + (i9 * (-594)) + (i14 * 594) + (i7 * (-1919121629)) + (i2 * (-390511720)) + (i6 * 1804971285) + (i16 * 255066112);
        int i19 = i17 + (i18 * i18 * 379846656);
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 != 2) {
            return d(objArr);
        }
        int i20 = 2 % 2;
        int i21 = f25800j + 67;
        f25799h = i21 % 128;
        int i22 = i21 % 2;
        a.d dVar = a.d.f25446e;
        int i23 = f25799h + 15;
        f25800j = i23 % 128;
        int i24 = i23 % 2;
        return dVar;
    }

    private static c c(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        c cVar = new c(str, str2, z2);
        int i3 = f25800j + 69;
        f25799h = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    private c c(o.ef.a aVar) throws o.ef.b {
        int i2 = f25794b * 1637934148;
        f25794b = i2;
        int i3 = f25796d * 1801537386;
        f25796d = i3;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = f25793a * (-1784972455);
        f25793a = i4;
        return (c) c(elapsedCpuTime, i2, 1266408626, -1266408625, new Object[]{this, aVar}, i4, i3);
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        o.fi.a aVar2 = (o.fi.a) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25800j + 69;
        f25799h = i3 % 128;
        if (i3 % 2 == 0) {
            super.a(aVar2);
            aVar2.m();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.ef.a aVarA = super.a(aVar2);
        if (aVar2.m() != null) {
            Object[] objArr2 = new Object[1];
            o((ViewConfiguration.getTapTimeout() >> 16) + 16, "\ufff9\u0005\b￼\u0001\u000b\ufffb\ufff9\n￼￬\u0001\u0005�\u000b\f", false, (-16777077) - Color.rgb(0, 0, 0), 3 - TextUtils.getOffsetBefore("", 0), objArr2);
            aVarA.c(((String) objArr2[0]).intern(), aVar2.m().getTime());
            int i4 = f25800j + 89;
            f25799h = i4 % 128;
            int i5 = i4 % 2;
        }
        if (aVar2.k() != null) {
            int i6 = f25799h + 81;
            f25800j = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            o(20 - Color.blue(0), "\ufff9\u0001�￨\u0002\u0003�\b\u0004\u0001\t\u0007\u0002\u0003\ufff7\u0004\u0001\ufff5\b\u0007", true, 143 - View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 15, objArr3);
            aVarA.c(((String) objArr3[0]).intern(), aVar2.k().getTime());
        }
        return aVarA;
    }

    static void e() {
        f25797f = -1270219464;
    }

    private o.fi.a g(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25799h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25800j = i3 % 128;
        int i4 = i3 % 2;
        o.fi.a aVar2 = (o.fi.a) super.b(aVar);
        Object[] objArr = new Object[1];
        o(16 - TextUtils.getTrimmedLength(""), "\ufff9\u0005\b￼\u0001\u000b\ufffb\ufff9\n￼￬\u0001\u0005�\u000b\f", false, 139 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, objArr);
        if (aVar.d(((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            o((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, "\ufff9\u0005\b￼\u0001\u000b\ufffb\ufff9\n￼￬\u0001\u0005�\u000b\f", false, 139 - (ViewConfiguration.getLongPressTimeout() >> 16), 3 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            aVar2.d(new Timestamp(aVar.n(((String) objArr2[0]).intern()).longValue()));
        }
        Object[] objArr3 = new Object[1];
        o((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, "\ufff9\u0001�￨\u0002\u0003�\b\u0004\u0001\t\u0007\u0002\u0003\ufff7\u0004\u0001\ufff5\b\u0007", true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 142, (KeyEvent.getMaxKeyCode() >> 16) + 15, objArr3);
        if (aVar.d(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            o(20 - TextUtils.getTrimmedLength(""), "\ufff9\u0001�￨\u0002\u0003�\b\u0004\u0001\t\u0007\u0002\u0003\ufff7\u0004\u0001\ufff5\b\u0007", true, 143 - View.MeasureSpec.getMode(0), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
            aVar2.e(new Timestamp(aVar.n(((String) objArr4[0]).intern()).longValue()));
        }
        int i5 = f25799h + 65;
        f25800j = i5 % 128;
        int i6 = i5 % 2;
        return aVar2;
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -87, -21};
        $$b = 116;
    }

    static void init$1() {
        $$d = new byte[]{53, 97, -95, 41, 65, MessagePack.Code.UINT8, -3, 55, MessagePack.Code.EXT32, 65, -75, 75, MessagePack.Code.FLOAT32, 64, -14};
        $$e = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    static void init$2() {
        $$k = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$l = 133;
    }

    private static void o(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 101;
        int i7 = i6 % 128;
        $11 = i7;
        int i8 = i6 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i9 = i7 + 21;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 90 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i11 = $11 + 85;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i13 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i13]), Integer.valueOf(f25797f)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 270, (char) ((Process.getThreadPriority(0) + 20) >> 6), 10 - ImageFormat.getBitsPerPixel(0), -2071844881, false, $$m(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 523;
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int offsetBefore = 12 - TextUtils.getOffsetBefore("", 0);
                    byte b4 = (byte) ((-1) - (((-1) - $$l) | ((-1) - 3)));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(iLastIndexOf, pressedStateDuration, offsetBefore, 627984172, false, $$m(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                int i14 = $10 + 77;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[i2 << nVar.f19944a];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 523;
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 12;
                        byte b6 = (byte) ((-1) - (((-1) - $$l) | ((-1) - 3)));
                        byte b7 = (byte) (b6 - 1);
                        objA3 = d.a(iIndexOf, packedPositionGroup, edgeSlop, 627984172, false, $$m(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        int trimmedLength = TextUtils.getTrimmedLength("") + 522;
                        char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                        int i15 = 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i16 = $$l;
                        byte b8 = (byte) ((i16 + 3) - (i16 | 3));
                        byte b9 = (byte) (b8 - 1);
                        objA4 = d.a(trimmedLength, offsetBefore2, i15, 627984172, false, $$m(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void p(byte b2, int i2, int i3, Object[] objArr) {
        int i4 = (i2 * 2) + 4;
        int i5 = (b2 * 3) + 98;
        byte[] bArr = $$a;
        int i6 = i3 * 3;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = (-i5) + i6;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (-bArr[i4]) + i5;
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(byte r9, byte r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 13
            int r8 = r0 + 98
            int r7 = r10 + 4
            byte[] r6 = o.fd.a.$$d
            int r5 = 7 - r9
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L28
            r0 = r5
            r2 = r3
        L11:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L14:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            int r7 = r7 + 1
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L25:
            r0 = r6[r7]
            goto L11
        L28:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.a.q(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.eu.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25800j + 43;
        f25799h = i3 % 128;
        c cVar = (c) dVar;
        if (i3 % 2 != 0) {
            return b(cVar);
        }
        b(cVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.b, o.eu.a
    public final /* synthetic */ o.ef.a a(o.ff.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f25799h + 87;
        f25800j = i3 % 128;
        int i4 = i3 % 2;
        int id = (int) Thread.currentThread().getId();
        int i5 = f25795c * (-1440187353);
        f25795c = i5;
        o.ef.a aVar2 = (o.ef.a) c((int) Process.getElapsedCpuTime(), id, -646950546, 646950546, new Object[]{this, (o.fi.a) aVar}, (int) Process.getElapsedCpuTime(), i5);
        int i6 = f25799h + 25;
        f25800j = i6 % 128;
        int i7 = i6 % 2;
        return aVar2;
    }

    @Override // o.eu.b
    public final /* synthetic */ o.ef.a a(e eVar) throws o.ef.b {
        o.ef.a aVar;
        int i2 = 2 % 2;
        int i3 = f25800j + 91;
        f25799h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, (o.fi.a) eVar};
        int id = (int) Thread.currentThread().getId();
        int i5 = f25795c * (-1440187353);
        f25795c = i5;
        if (i4 == 0) {
            aVar = (o.ef.a) c((int) Process.getElapsedCpuTime(), id, -646950546, 646950546, objArr, (int) Process.getElapsedCpuTime(), i5);
            int i6 = 30 / 0;
        } else {
            aVar = (o.ef.a) c((int) Process.getElapsedCpuTime(), id, -646950546, 646950546, objArr, (int) Process.getElapsedCpuTime(), i5);
        }
        int i7 = f25799h + 55;
        f25800j = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 50 / 0;
        }
        return aVar;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d a(o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f25799h + 113;
        f25800j = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = f25794b * 1637934148;
            f25794b = i4;
            int i5 = f25796d * 1801537386;
            f25796d = i5;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = f25793a * (-1784972455);
            f25793a = i6;
            throw null;
        }
        int i7 = f25794b * 1637934148;
        f25794b = i7;
        int i8 = f25796d * 1801537386;
        f25796d = i8;
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i9 = f25793a * (-1784972455);
        f25793a = i9;
        c cVar = (c) c(elapsedCpuTime2, i7, 1266408626, -1266408625, new Object[]{this, aVar}, i9, i8);
        int i10 = f25800j + 29;
        f25799h = i10 % 128;
        int i11 = i10 % 2;
        return cVar;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a a(o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25800j + 17;
        f25799h = i3 % 128;
        int i4 = i3 % 2;
        o.fi.a aVarB = b(false, bVar, s2);
        int i5 = f25799h + 15;
        f25800j = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final a.d b() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        return (a.d) c((int) Runtime.getRuntime().freeMemory(), i2, -393108903, 393108905, new Object[]{this}, Thread.activeCount(), iElapsedRealtime);
    }

    @Override // o.eu.b
    public final /* synthetic */ e b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25799h + 21;
        f25800j = i3 % 128;
        int i4 = i3 % 2;
        o.fi.a aVarG = g(aVar);
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        int i6 = f25799h + 23;
        f25800j = i6 % 128;
        if (i6 % 2 == 0) {
            return aVarG;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d d(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25800j + 5;
        f25799h = i3 % 128;
        if (i3 % 2 != 0) {
            return c(str, str2, z2);
        }
        c(str, str2, z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.b, o.eu.a
    public final /* synthetic */ o.ff.a d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25800j + 107;
        f25799h = i3 % 128;
        if (i3 % 2 == 0) {
            g(aVar);
            throw null;
        }
        o.fi.a aVarG = g(aVar);
        int i4 = f25799h + 99;
        f25800j = i4 % 128;
        int i5 = i4 % 2;
        return aVarG;
    }
}
