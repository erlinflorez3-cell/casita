package o.df;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import o.a.m;
import o.a.n;
import o.en.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22929a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22930b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22931c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22932d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22933e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22934g = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, byte r11) {
        /*
            int r0 = r10 * 4
            int r8 = r0 + 1
            byte[] r7 = o.df.b.$$a
            int r6 = r11 + 113
            int r1 = r9 + 4
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L27
            r3 = r4
            r0 = r1
        L11:
            int r1 = r1 + r6
            r2 = r3
            r6 = r1
            r1 = r0
        L15:
            int r0 = r1 + 1
            int r3 = r2 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r1 = r7[r0]
            goto L11
        L27:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.b.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22931c = 0;
        f22934g = 1;
        f22933e = 0;
        f22929a = 1;
        a();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getEdgeSlop();
        KeyEvent.getDeadChar(0, 0);
        int i2 = f22934g + 31;
        f22931c = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.dq.d a(java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.b.a(java.lang.String):o.dq.d");
    }

    static void a() {
        f22932d = new char[]{56506, 56555, 56546, 56554, 56560, 56551, 56553, 56563, 56540, 56518, 56539, 56558, 56556, 56513, 56336, 56336, 56365, 56397, 56394, 56402, 56403, 56397, 56358, 56357, 56399, 56397, 56389, 56357, 56357, 56393, 56397, 56393, 56398, 56405, 56398, 56359, 56329, 56368, 56401, 56399, 56401, 56398, 56389, 56397, 56403, 56394, 56396, 56406, 56365, 56358, 56397, 56398, 56393, 56389, 56390, 56398, 56364, 56357, 56395, 56397, 56395, 56402, 56366, 56357, 56391, 56398, 56398, 56399, 56404, 56404, 56405, 56396, 56395, 56396, 56357, 56362, 56401, 56399, 56401, 56405, 56397, 56391, 56400, 56385, 56559, 56416, 56416, 56406, 56406, 56399, 56396, 56410, 56408, 56410, 56407, 56398, 56406, 56412, 56403, 56405, 56415, 56563, 56432, 56433, 56534, 56474, 56503, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56563, 56522, 56519, 56562, 56563, 56558, 56556, 56556, 56561, 56564, 56564, 56564, 56554, 56554, 56563, 56521, 56543, 56376, 56377, 56382, 56378, 56382, 56378, 56361, 56371, 56385, 56375, 56335, 56563, 56563, 56343, 56382, 56377, 56377, 56379, 56384, 56383, 56340, 56343, 56387, 56385, 56375, 56335, 56570, 56570, 56552, 56405, 56415, 56417, 56373, 56370, 56409, 56407, 56409, 56406, 56397, 56405, 56411, 56402, 56404, 56414, 56373, 56370, 56413, 56414, 56409, 56407, 56407, 56412};
        f22930b = -1270219336;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.dq.e d(java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.b.d(java.lang.String):o.dq.e");
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f22932d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 71;
                $11 = i10 % 128;
                if (i10 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            int iIndexOf = TextUtils.indexOf("", "", i4) + 249;
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int iIndexOf2 = TextUtils.indexOf("", "", i4) + 11;
                            byte b2 = $$a[i2];
                            byte b3 = b2;
                            objA = o.d.d.a(iIndexOf, trimmedLength, iIndexOf2, 1376582792, false, $$c((byte) (b2 - 1), b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        int threadPriority = 249 - ((Process.getThreadPriority(0) + 20) >> 6);
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11;
                        byte b4 = $$a[2];
                        byte b5 = b4;
                        objA2 = o.d.d.a(threadPriority, jumpTapTimeout, i11, 1376582792, false, $$c((byte) (b4 - 1), b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i2 = 2;
                i4 = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i12 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a(';' - AndroidCharacter.getMirror('0'), (char) TextUtils.indexOf("", "", 0, 0), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 836;
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 27279);
                        int threadPriority2 = 11 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b6 = $$a[2];
                        byte b7 = b6;
                        objA4 = o.d.d.a(iResolveOpacity, cResolveSize, threadPriority2, -1210801192, false, $$c((byte) (b6 - 1), b7, (byte) ((b7 + 7) - (7 & b7))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a(Color.blue(0) + 21, (char) (35715 - KeyEvent.normalizeMetaState(0)), ExpandableListView.getPackedPositionGroup(0L) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        }
        if (z2) {
            int i15 = $10 + 63;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i6];
            int i17 = 0;
            while (true) {
                mVar.f19943d = i17;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i18 = $10 + 39;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[mVar.f19943d] = cArr3[i6 << mVar.f19943d];
                    i17 = mVar.f19943d;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                    i17 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i19 = $11 + 107;
            $10 = i19 % 128;
            char c3 = 2;
            mVar.f19943d = i19 % 2 != 0 ? 1 : 0;
            while (mVar.f19943d < i6) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[c3]);
                mVar.f19943d++;
                int i20 = $10 + 25;
                $11 = i20 % 128;
                c3 = 2;
                int i21 = i20 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void h(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i7 = $11 + 13;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f22930b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    int threadPriority = 270 - ((Process.getThreadPriority(0) + 20) >> 6);
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int bitsPerPixel = 10 - ImageFormat.getBitsPerPixel(0);
                    byte b2 = $$a[2];
                    byte b3 = b2;
                    objA = o.d.d.a(threadPriority, offsetAfter, bitsPerPixel, -2071844881, false, $$c((byte) (b2 - 1), b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 523;
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iAlpha = 12 - Color.alpha(0);
                    byte b4 = $$a[2];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    objA2 = o.d.d.a(i10, cKeyCodeFromString, iAlpha, 627984172, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 1;
            $10 = i11 % 128;
            int i12 = i11 % 2;
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    int scrollBarSize = 522 - (ViewConfiguration.getScrollBarSize() >> 8);
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int i13 = 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b7 = $$a[2];
                    byte b8 = (byte) (b7 - 1);
                    byte b9 = b7;
                    objA3 = o.d.d.a(scrollBarSize, cNormalizeMetaState, i13, 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{123, MessagePack.Code.FLOAT32, 0, -17};
        $$b = 39;
    }

    @Override // o.df.a
    public final o.dq.c d(String str, String str2) throws Throwable {
        int iIntValue;
        Date dateD;
        int i2 = 2 % 2;
        o.dq.c cVar = new o.dq.c();
        try {
            o.ef.a aVar = new o.ef.a(str2);
            int i3 = o.dq.c.f23255o * (-1462558457);
            o.dq.c.f23255o = i3;
            int i4 = o.dq.c.f23252l * (-431129044);
            o.dq.c.f23252l = i4;
            o.dq.c.e(Thread.currentThread().getPriority(), (int) Runtime.getRuntime().maxMemory(), new Object[]{cVar, str}, 561374006, i3, -561374001, i4);
            Object[] objArr = new Object[1];
            f("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 13, 0, 8}, true, objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            Object[] objArr3 = {cVar, (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority())};
            int i6 = o.dq.c.f23261u * (-248101015);
            o.dq.c.f23261u = i6;
            int i7 = o.dq.c.f23264x * (-1173840984);
            o.dq.c.f23264x = i7;
            int iMyTid = Process.myTid();
            int i8 = o.dq.c.f23263w * (-23964688);
            o.dq.c.f23263w = i8;
            o.dq.c.e(iMyTid, i8, objArr3, 497708874, i6, -497708862, i7);
            String strB = o.dq.a.b(str, cVar.w());
            int iMyTid2 = Process.myTid();
            int iMyUid = Process.myUid();
            int i9 = o.dq.c.V * 2054036048;
            o.dq.c.V = i9;
            int i10 = o.dq.c.W * 702719824;
            o.dq.c.W = i10;
            o.dq.c.e(i9, i10, new Object[]{cVar, strB}, -1624624042, iMyTid2, 1624624066, iMyUid);
            int i11 = o.dq.c.R * 165990070;
            o.dq.c.R = i11;
            int iMyUid2 = Process.myUid();
            int i12 = o.dq.c.T * 56027633;
            o.dq.c.T = i12;
            o.dq.c.e(i12, Process.myTid(), new Object[]{cVar, strB}, -872378002, i11, 872378025, iMyUid2);
            Object[] objArr4 = new Object[1];
            h(15 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0003￩\u000e\u0005\ufffa\t\u0007\ufff6\u0003\b\ufff6\ufff8\t\ufffe\u0004", false, 271 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, objArr4);
            if (aVar.d(((String) objArr4[0]).intern())) {
                Object[] objArr5 = new Object[1];
                h(Process.getGidForName("") + 16, "\u0003￩\u000e\u0005\ufffa\t\u0007\ufff6\u0003\b\ufff6\ufff8\t\ufffe\u0004", false, 270 - (ViewConfiguration.getEdgeSlop() >> 16), 5 - View.resolveSizeAndState(0, 0, 0), objArr5);
                Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
                int i13 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i13;
                Object[] objArr7 = {cVar, a((String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority()))};
                int iNextInt = new Random().nextInt(1759596137);
                int iMyTid3 = Process.myTid();
                int i14 = o.dq.c.ag * 1555996728;
                o.dq.c.ag = i14;
                int i15 = o.dq.c.ah * (-805012015);
                o.dq.c.ah = i15;
                o.dq.c.e(i14, i15, objArr7, 1891140439, iNextInt, -1891140408, iMyTid3);
                int i16 = f22933e + 115;
                f22929a = i16 % 128;
                int i17 = i16 % 2;
            }
            Object[] objArr8 = new Object[1];
            h(View.resolveSizeAndState(0, 0, 0) + 15, "\u0006ￜ\ufff9\f�\f\n\ufff9\u0006\u000b\ufff9\ufffb\f\u0001\u0007", false, 268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
            if (aVar.d(((String) objArr8[0]).intern())) {
                Object[] objArr9 = new Object[1];
                h(TextUtils.indexOf((CharSequence) "", '0') + 16, "\u0006ￜ\ufff9\f�\f\n\ufff9\u0006\u000b\ufff9\ufffb\f\u0001\u0007", false, TextUtils.indexOf("", "", 0) + 267, Color.argb(0, 0, 0, 0) + 5, objArr9);
                Object objA = aVar.a(((String) objArr9[0]).intern());
                if (objA instanceof Long) {
                    dateD = new Date(((Long) objA).longValue() * 1000);
                } else {
                    if (!(objA instanceof String)) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr10 = new Object[1];
                        f("\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{13, 71, 99, 0}, true, objArr10);
                        throw new f(sb.append(((String) objArr10[0]).intern()).append(objA.toString()).toString());
                    }
                    dateD = o.eg.a.d((String) objA);
                }
                Object[] objArr11 = {cVar, dateD};
                int id = (int) Thread.currentThread().getId();
                int priority = Thread.currentThread().getPriority();
                int iMyUid3 = Process.myUid();
                int i18 = o.dq.c.F * 1706170942;
                o.dq.c.F = i18;
                o.dq.c.e(iMyUid3, i18, objArr11, -2081493663, id, 2081493681, priority);
            }
            Object[] objArr12 = new Object[1];
            h(6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0007\u0000\u0006\ufff3\uffff\u0001", false, 273 - ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0') + 4, objArr12);
            if (aVar.d(((String) objArr12[0]).intern())) {
                Object[] objArr13 = new Object[1];
                h(6 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0007\u0000\u0006\ufff3\uffff\u0001", false, TextUtils.indexOf((CharSequence) "", '0', 0) + 274, 2 - MotionEvent.axisFromString(""), objArr13);
                Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
                int i19 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i19;
                cVar.d(new BigDecimal((String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority())).abs());
            }
            Object[] objArr15 = new Object[1];
            h(Gravity.getAbsoluteGravity(0, 0) + 12, "\ufffb\u0011ￛ\u0007￼�\ufffb\r\n\n�\u0006", false, 267 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 6, objArr15);
            if (aVar.d(((String) objArr15[0]).intern())) {
                int i20 = f22929a + 77;
                f22933e = i20 % 128;
                int i21 = i20 % 2;
                Object[] objArr16 = new Object[1];
                h(Color.red(0) + 12, "\ufffb\u0011ￛ\u0007￼�\ufffb\r\n\n�\u0006", false, 267 - Color.argb(0, 0, 0, 0), 6 - ExpandableListView.getPackedPositionType(0L), objArr16);
                Object[] objArr17 = {aVar, ((String) objArr16[0]).intern()};
                int i22 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i22;
                Object[] objArr18 = {cVar, o.ei.c.e((String) o.ef.a.a(-781664457, objArr17, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i22, Thread.currentThread().getPriority()))};
                int iNextInt2 = new Random().nextInt();
                int priority2 = Thread.currentThread().getPriority();
                int iNextInt3 = new Random().nextInt(394647635);
                int i23 = o.dq.c.f23265y * (-1625678718);
                o.dq.c.f23265y = i23;
                o.dq.c.e(iNextInt3, i23, objArr18, 2100515447, iNextInt2, -2100515436, priority2);
            }
            Object[] objArr19 = new Object[1];
            f("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{84, 17, 108, 0}, true, objArr19);
            if (aVar.d(((String) objArr19[0]).intern())) {
                Object[] objArr20 = new Object[1];
                f("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{84, 17, 108, 0}, true, objArr20);
                Object[] objArr21 = {aVar, ((String) objArr20[0]).intern()};
                int i24 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i24;
                cVar.e(d((String) o.ef.a.a(-781664457, objArr21, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i24, Thread.currentThread().getPriority())));
            }
            Object[] objArr22 = new Object[1];
            h(Color.red(0) + 12, "\uffff\u0007\ufffb￨\u000e\b\ufffb\u0002�\f\uffff\u0007", true, 265 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, objArr22);
            cVar.c(aVar.s(((String) objArr22[0]).intern()));
            Object[] objArr23 = new Object[1];
            h(14 - ((byte) KeyEvent.getModifierMetaStateMask()), "\uffff\ufffe\t\uffdd\n\u0003\ufff4\u000e\b\ufffb\u0002�\f\uffff\u0007", true, 265 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr23);
            cVar.m(aVar.s(((String) objArr23[0]).intern()));
            Object[] objArr24 = new Object[1];
            h(TextUtils.getOffsetAfter("", 0) + 12, "\uffd9\u0005\ufffa\ufffb\uffff\u0004\ufffa\u000b\t\n\b\u000f", false, 269 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 4, objArr24);
            Object[] objArr25 = {cVar, aVar.s(((String) objArr24[0]).intern())};
            int i25 = o.dq.c.ac * 1323193544;
            o.dq.c.ac = i25;
            int iNextInt4 = new Random().nextInt();
            int id2 = (int) Thread.currentThread().getId();
            int i26 = o.dq.c.Z * (-636728898);
            o.dq.c.Z = i26;
            o.dq.c.e(id2, i26, objArr25, 295617363, i25, -295617336, iNextInt4);
            Object[] objArr26 = new Object[1];
            f("\u0001\u0001\u0001", new int[]{101, 3, 134, 0}, false, objArr26);
            if (aVar.d(((String) objArr26[0]).intern())) {
                int i27 = f22933e + 11;
                f22929a = i27 % 128;
                if (i27 % 2 == 0) {
                    Object[] objArr27 = new Object[1];
                    f("\u0001\u0001\u0001", new int[]{101, 3, 134, 0}, true, objArr27);
                    Object[] objArr28 = {aVar, ((String) objArr27[0]).intern()};
                    int i28 = o.ef.a.f23778l * 493926616;
                    o.ef.a.f23778l = i28;
                    int i29 = o.ef.a.f23779m * 1131312688;
                    o.ef.a.f23779m = i29;
                    iIntValue = ((Integer) o.ef.a.a(1122077797, objArr28, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i28, i29)).intValue();
                } else {
                    Object[] objArr29 = new Object[1];
                    f("\u0001\u0001\u0001", new int[]{101, 3, 134, 0}, false, objArr29);
                    Object[] objArr30 = {aVar, ((String) objArr29[0]).intern()};
                    int i30 = o.ef.a.f23778l * 493926616;
                    o.ef.a.f23778l = i30;
                    int i31 = o.ef.a.f23779m * 1131312688;
                    o.ef.a.f23779m = i31;
                    iIntValue = ((Integer) o.ef.a.a(1122077797, objArr30, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i30, i31)).intValue();
                }
                cVar.b(iIntValue);
            }
            return cVar;
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr31 = new Object[1];
            h(Drawable.resolveOpacity(0, 0) + 55, "\u000f\uffc1ￛ\uffc1￫\u0014\u0010\u000f\uffc1￦\u0019\u0004\u0006\u0011\u0015\n\u0010\u000f\uffc1\u0006\u000f\u0004\u0010\u0016\u000f\u0015\u0006\u0013\u0006\u0005\uffc1\u0018\t\n\r\u0006\uffc1\u0013\u0006\u0002\u0005\n\u000f\b\uffc1\u0015\u0013\u0002\u000f\u0014\u0002\u0004\u0015\n\u0010", false, 259 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr31);
            throw new f(sb2.append(((String) objArr31[0]).intern()).append(e2.getMessage()).toString());
        }
    }
}
