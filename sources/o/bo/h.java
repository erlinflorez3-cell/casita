package o.bo;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Map;
import o.a.l;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21488a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f21489b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21490c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f21491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f21492e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r0 = r7 * 2
            int r7 = 121 - r0
            int r1 = r6 * 3
            int r0 = 1 - r1
            int r6 = r8 + 4
            byte[] r5 = o.bo.h.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r0 = -r0
            int r7 = r7 + r0
        L17:
            int r6 = r6 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L15
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.h.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21488a = 0;
        f21490c = 1;
        f21489b = new int[]{-476262243, -1076896543, -2028153730, 2110731196, 718282987, -1827607585, -1297189645, -1363779027, -610611664, -1037212113, -1464140790, 684259944, -1633269794, 2017299079, 676320701, -1123000210, -150285195, -1309116739};
    }

    public h(Map<String, String> map, Object obj) {
        this.f21491d = map;
        this.f21492e = obj;
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21489b;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(ExpandableListView.getPackedPositionType(j2) + 675, (char) View.resolveSizeAndState(0, 0, 0), 12 - (Process.myPid() >> 22), -328001469, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 675, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 12 - View.getDefaultSize(0, 0), -328001469, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                i5 = 989264422;
                j2 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f21489b;
        int i9 = 16;
        if (iArr5 != null) {
            int i10 = $10 + 57;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) i6;
                    byte b7 = b6;
                    objA3 = o.d.d.a(675 - (KeyEvent.getMaxKeyCode() >> i9), (char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, -328001469, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i12++;
                i9 = 16;
                i6 = 0;
            }
            int i13 = $11 + 103;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            iArr5 = iArr6;
            i6 = 0;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        int i15 = $10 + 71;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        while (lVar.f19941d < iArr.length) {
            int i17 = $10 + 37;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                int i21 = $11 + 19;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    lVar.f19942e ^= iArr4[i19];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(301 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52697), 11 - View.resolveSizeAndState(0, 0, 0), -1416256172, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i19 += 91;
                } else {
                    lVar.f19942e ^= iArr4[i19];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        objA5 = o.d.d.a(301 - Gravity.getAbsoluteGravity(0, 0), (char) (52698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1416256172, false, $$c(b10, b11, (byte) (-b11)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i19++;
                }
            }
            int i22 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i22;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i23 = lVar.f19942e;
            int i24 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 2);
                objA6 = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 229, (char) (51004 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 9 - Color.red(0), -330018025, false, $$c(b12, b13, (byte) (b13 - 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$b = 75;
    }

    public final String a() throws Throwable {
        Object objC;
        int i2 = 2 % 2;
        int i3 = f21488a + 19;
        f21490c = i3 % 128;
        if (i3 % 2 == 0) {
            Map<String, String> map = this.f21491d;
            Object[] objArr = new Object[1];
            f(new int[]{1492448280, 779729007, -2056069969, -1463765114, -1740262713, -695389309}, 101 % (ViewConfiguration.getFadingEdgeLength() + 81), objArr);
            Object[] objArr2 = {map.get(((String) objArr[0]).intern())};
            int i4 = m.f23563d * 691068131;
            m.f23563d = i4;
            int i5 = m.f23561b * (-1916120846);
            m.f23561b = i5;
            objC = m.c(objArr2, (int) SystemClock.uptimeMillis(), i5, -327535505, i4, 327535505, Process.myUid());
        } else {
            Map<String, String> map2 = this.f21491d;
            Object[] objArr3 = new Object[1];
            f(new int[]{1492448280, 779729007, -2056069969, -1463765114, -1740262713, -695389309}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, objArr3);
            Object[] objArr4 = {map2.get(((String) objArr3[0]).intern())};
            int i6 = m.f23563d * 691068131;
            m.f23563d = i6;
            int i7 = m.f23561b * (-1916120846);
            m.f23561b = i7;
            objC = m.c(objArr4, (int) SystemClock.uptimeMillis(), i7, -327535505, i6, 327535505, Process.myUid());
        }
        return (String) objC;
    }

    public final String c() throws Throwable {
        Object objC;
        int i2 = 2 % 2;
        int i3 = f21488a + 23;
        f21490c = i3 % 128;
        if (i3 % 2 == 0) {
            Map<String, String> map = this.f21491d;
            Object[] objArr = new Object[1];
            f(new int[]{2142687733, 179920920, 1481379030, -964639666}, 20 / Gravity.getAbsoluteGravity(0, 0), objArr);
            Object[] objArr2 = {map.get(((String) objArr[0]).intern())};
            int i4 = m.f23563d * 691068131;
            m.f23563d = i4;
            int i5 = m.f23561b * (-1916120846);
            m.f23561b = i5;
            objC = m.c(objArr2, (int) SystemClock.uptimeMillis(), i5, -327535505, i4, 327535505, Process.myUid());
        } else {
            Map<String, String> map2 = this.f21491d;
            Object[] objArr3 = new Object[1];
            f(new int[]{2142687733, 179920920, 1481379030, -964639666}, 7 - Gravity.getAbsoluteGravity(0, 0), objArr3);
            Object[] objArr4 = {map2.get(((String) objArr3[0]).intern())};
            int i6 = m.f23563d * 691068131;
            m.f23563d = i6;
            int i7 = m.f23561b * (-1916120846);
            m.f23561b = i7;
            objC = m.c(objArr4, (int) SystemClock.uptimeMillis(), i7, -327535505, i6, 327535505, Process.myUid());
        }
        String str = (String) objC;
        int i8 = f21488a + 47;
        f21490c = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public final String d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21490c + 109;
        f21488a = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.f21491d;
        Object[] objArr = new Object[1];
        f(new int[]{2142687733, 179920920, -1384050454, 290631044, 1999185018, 1314153092, 746425664, -2077012823, -1411790926, -1250575080}, 16 - ExpandableListView.getPackedPositionChild(0L), objArr);
        Object[] objArr2 = {map.get(((String) objArr[0]).intern())};
        int i5 = m.f23563d * 691068131;
        m.f23563d = i5;
        int i6 = m.f23561b * (-1916120846);
        m.f23561b = i6;
        String str = (String) m.c(objArr2, (int) SystemClock.uptimeMillis(), i6, -327535505, i5, 327535505, Process.myUid());
        int i7 = f21488a + 97;
        f21490c = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Object e() {
        int i2 = 2 % 2;
        int i3 = f21488a + 85;
        int i4 = i3 % 128;
        f21490c = i4;
        int i5 = i3 % 2;
        Object obj = this.f21492e;
        int i6 = i4 + 3;
        f21488a = i6 % 128;
        int i7 = i6 % 2;
        return obj;
    }
}
