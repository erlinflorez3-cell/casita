package o.cp;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import o.a.f;
import o.a.o;
import o.d.d;
import o.ef.a;
import o.et.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.cl.c<j> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f22534a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22535b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f22536c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22537d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22538e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22539f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22540g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22541h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22542i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f22543j = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, byte r10) {
        /*
            int r8 = r8 + 4
            byte[] r7 = o.cp.c.$$a
            int r6 = r9 * 3
            int r1 = r6 + 1
            int r0 = r10 + 67
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L27
            r3 = r6
            r1 = r4
        L11:
            int r0 = -r0
            int r0 = r0 + r3
        L13:
            byte r2 = (byte) r0
            r5[r1] = r2
            int r8 = r8 + 1
            if (r1 != r6) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L20:
            r2 = r7[r8]
            int r1 = r1 + 1
            r3 = r0
            r0 = r2
            goto L11
        L27:
            r1 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.c.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22539f = 0;
        f22540g = 1;
        f22541h = 0;
        f22542i = 1;
        a();
        TextUtils.lastIndexOf("", '0', 0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getWindowTouchSlop();
        int i2 = f22540g + 85;
        f22539f = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        f22537d = new char[]{38022, 2516, 44555, 17228, 57784, 34495, 15137, 55413, 32462, 4870, 45146, 22207, 52223, 26667, 3372, 41948, 16390, 58635, 39869, 14576, 56629, 29308, 4317, 46355, 10829, 38047, 2507, 44560, 17253, 57791, 34539, 15137, 55360, 32469, 4871, 45149, 22205, 52219, 38079, 2527, 44549, 17242, 57732, 34544, 15147, 55417, 32490, 4881, 45127, 22199, 52215, 26667, 3433, 41959, 16391, 58698, 39860, 14588, 56628, 38055, 2517, 44545, 17227, 57786, 34554, 15204, 55417, 32469, 4931, 45146, 22196, 52223, 26659, 3372, 41923, 16391, 58713, 39843, 14576, 56617, 29281, 4244, 46363, 10840, 51388, 28149, 609, 42852, 17860, 64019, 40779, 23882, 49183, 26586};
        f22538e = -3983957965311243845L;
        f22536c = new char[]{2048, 2079, 2067, 2078, 2082, 2053, 2076, 2075, 2054, 2138, 2139, 2130, 2119, 2060, 2049, 2052, 2115, 2116, 2114, 2063, 2112, 2095, 2064, 2062, 2087, 2080, 2120};
        f22535b = 2040399986;
        f22534a = true;
        f22543j = true;
    }

    private static j d(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        j jVar = new j(str, str2, i2, str3);
        int i4 = f22541h + 23;
        f22542i = i4 % 128;
        if (i4 % 2 != 0) {
            return jVar;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$b = 193;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 79;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22537d[i2 + i7])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a(741 - TextUtils.lastIndexOf("", '0', 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 13, 632508977, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 32)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22538e), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = d.a(767 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (12470 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 12 - Color.blue(0), 1946853218, false, $$c(b4, b5, (byte) ((b5 + 33) - (33 & b5))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.getGidForName("") + 1), TextUtils.getOffsetBefore("", 0) + 18, 39570797, false, $$c(b6, b7, (byte) (38 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objA4 = d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 388, (char) (ViewConfiguration.getTouchSlop() >> 8), 18 - (Process.myPid() >> 22), 39570797, false, $$c(b8, b9, (byte) (38 | b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 61 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = d.a(-723636472);
                if (objA5 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    objA5 = d.a(386 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 39570797, false, $$c(b10, b11, (byte) ((b11 + 38) - (38 & b11))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void l(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11 + 101;
        $10 = i4 % 128;
        Object bytes = str4;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i5 = $10 + 71;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f22536c;
        long j2 = 0;
        int i7 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 + 1);
                        objA = d.a(593 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (13182 - (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1))), 10 - TextUtils.lastIndexOf("", '0', 0), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    j2 = 0;
                    i7 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f22535b)};
        Object objA2 = d.a(-1503702982);
        if (objA2 == null) {
            objA2 = d.a(32 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 11 - KeyEvent.getDeadChar(0, 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f22543j) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i9 = $10 + 59;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA3 = d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 458, (char) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1923924106, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str5 = new String(cArr4);
            int i11 = $11 + 99;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            objArr[0] = str5;
            return;
        }
        if (!f22534a) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA4 = d.a(458 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22542i + 33;
        f22541h = i4 % 128;
        int i5 = i4 % 2;
        j jVarD = d(str, str2, i2, str3);
        int i6 = f22542i + 21;
        f22541h = i6 % 128;
        if (i6 % 2 == 0) {
            return jVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cl.c
    public final List<j> d(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        o.cl.c eVar;
        int i3 = 2 % 2;
        if (str2 == null) {
            Object[] objArr = new Object[1];
            k((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, ExpandableListView.getPackedPositionChild(0L) + 26, objArr);
            throw new o.en.f(((String) objArr[0]).intern());
        }
        k((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 25 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 14, new Object[1]);
        if (!aVar.d(((String) r0[0]).intern())) {
            try {
                Object[] objArr2 = new Object[1];
                l(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, null, "\u0090\u0086\u0088\u008f\u0081\u0082\u008e", objArr2);
                Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
                int i4 = a.f23782p * (-1576737484);
                a.f23782p = i4;
                String str4 = (String) a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
                if (str4.hashCode() == 49524) {
                    Object[] objArr4 = new Object[1];
                    k((char) (51594 - ((Process.getThreadPriority(0) + 20) >> 6)), 91 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, objArr4);
                    if (str4.equals(((String) objArr4[0]).intern())) {
                        int i5 = f22541h + 75;
                        f22542i = i5 % 128;
                        int i6 = i5 % 2;
                        eVar = new e();
                        if (o.ea.f.a()) {
                            int i7 = f22542i + 35;
                            f22541h = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = new Object[1];
                            k((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 38, (ViewConfiguration.getTouchSlop() >> 8) + 21, objArr5);
                            String strIntern = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            l(128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, null, "\u0084\u0090\u0094\u0086\u0087\u008c\u0093\u0092\u0095\u008c\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u008c\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr6);
                            o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                Object[] objArr7 = new Object[1];
                l(128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u008c\u009b\u0090\u0086\u0088\u008f\u0081\u0082\u008e\u008c\u0081\u0086\u0087\u008c\u0081\u0082\u0084\u0083\u0082\u009a\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u008f\u0082\u0084\u0099\u008c\u0084\u0090\u0088\u0087\u008c\u0086\u0098\u008c\u0082\u0089\u0097\u0083\u0090\u0096", objArr7);
                throw new o.en.f(sb.append(((String) objArr7[0]).intern()).append(str4).toString());
            } catch (Exception e2) {
                if (o.ea.f.a()) {
                    Object[] objArr8 = new Object[1];
                    k((char) View.combineMeasuredStates(0, 0), 38 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 22, objArr8);
                    String strIntern2 = ((String) objArr8[0]).intern();
                    Object[] objArr9 = new Object[1];
                    l(127 - View.resolveSizeAndState(0, 0, 0), null, null, "\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr9);
                    o.ea.f.e(strIntern2, ((String) objArr9[0]).intern(), e2);
                }
                Object[] objArr10 = new Object[1];
                k((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, 32 - TextUtils.getOffsetBefore("", 0), objArr10);
                throw new o.en.f(((String) objArr10[0]).intern());
            }
        }
        if (o.ea.f.a()) {
            Object[] objArr11 = new Object[1];
            k((char) (Process.myPid() >> 22), Color.alpha(0) + 38, 21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
            String strIntern3 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            l(127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u0084\u0090\u0094\u0086\u0087\u008c\u0093\u0092\u0091\u008c\u0090\u0086\u0088\u008f\u0081\u0082\u008e\u008c\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u008c\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr12);
            o.ea.f.c(strIntern3, ((String) objArr12[0]).intern());
        }
        eVar = new b();
        return eVar.d(str, str2, i2, str3, aVar);
    }
}
