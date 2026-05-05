package o.cn;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.a.l;
import o.a.n;
import o.cl.c;
import o.ea.f;
import o.ei.d;
import o.et.g;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e<T extends g> implements c<T> {
    private static final byte[] $$f = null;
    private static final int $$g = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f22508a = 0;

    /* JADX INFO: renamed from: b */
    private static int[] f22509b = null;

    /* JADX INFO: renamed from: c */
    private static int f22510c = 0;

    /* JADX INFO: renamed from: d */
    private static int f22511d = 0;

    /* JADX INFO: renamed from: e */
    private static int f22512e = 0;

    /* JADX INFO: renamed from: h */
    private static int f22513h = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$h(byte r8, byte r9, byte r10) {
        /*
            byte[] r7 = o.cn.e.$$f
            int r6 = r8 + 4
            int r0 = r10 * 2
            int r0 = r0 + 113
            int r2 = r9 * 4
            int r1 = 1 - r2
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L29
            r2 = r6
            r1 = r4
        L15:
            int r0 = -r0
            int r6 = r6 + r0
        L17:
            byte r0 = (byte) r6
            r5[r1] = r0
            int r2 = r2 + 1
            if (r1 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L15
        L29:
            r1 = r4
            r2 = r6
            r6 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cn.e.$$h(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22512e = 0;
        f22513h = 1;
        f22511d = 0;
        f22508a = 1;
        a();
        Process.myTid();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.currentThreadTimeMillis();
        int i2 = f22513h + 35;
        f22512e = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f22509b = new int[]{-289281818, 1565525901, 877716800, 682210063, -42225901, 924836841, -1199973951, -530168163, 1617827191, -2085716811, 926990386, -2069073889, 1599888822, -118279672, 488116780, -461003002, -553685449, 1311821299};
        f22510c = -1270219434;
    }

    private static void b(T t2, boolean z2) throws Throwable {
        boolean z3;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22508a + 103;
        f22511d = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            o((Process.myPid() >> 22) + 26, "�\u0001￮\u0001\b\u0005\u0002\u000b\u000e￬\u000f\ufffe\uffdd\u0000\u000e�\uffff\u000e\u0001\u0010\u000f�￩\u000e\u0001\u0000", true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 177, 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            o(ExpandableListView.getPackedPositionChild(0L) + 33, "\u000e\u0019\u0006\b\u000e\u0011\u0015\u0015\u0006ￅￅￎￍ\u0011\u0014\t\ufff5\u001d\u000e￫\t\u0013￦\n\u0018\u0017\u0006\u0015ￅ\uffdf\u0013\u0014", true, 168 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 28, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(t2);
            Object[] objArr3 = new Object[1];
            o(24 - ExpandableListView.getPackedPositionType(0L), "ￆￆￆￆ\u0016\n\u0015\u0012\ufff5\u001c\u000b\u0018\u0018\u000f\n\u000b\uffe7\u0012\u0012\u0015\u001d\u000b\n￠", false, 168 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1 - ExpandableListView.getPackedPositionType(0L), objArr3);
            f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(z2).toString());
            int i4 = f22511d + 37;
            f22508a = i4 % 128;
            int i5 = i4 % 2;
        }
        ArrayList<d> arrayListE = d.e(t2.C(), 0);
        Object[] objArr4 = new Object[1];
        o((ViewConfiguration.getFadingEdgeLength() >> 16) + 2, "\b\ufff8", true, 139 - (ViewConfiguration.getTapTimeout() >> 16), 2 - TextUtils.indexOf("", "", 0), objArr4);
        d dVarA = d.a(((String) objArr4[0]).intern(), arrayListE);
        if (dVarA == null) {
            Object[] objArr5 = new Object[1];
            m(new int[]{129365107, 855137769, -1960643701, -1456507515, -1805194680, 2052938785}, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
            throw new o.en.f(((String) objArr5[0]).intern());
        }
        int i6 = d.f23913b * (-1487198784);
        d.f23913b = i6;
        int iMyTid = Process.myTid();
        int i7 = d.f23912a * (-767436786);
        d.f23912a = i7;
        int i8 = d.f23915d * 1088204935;
        d.f23915d = i8;
        ArrayList<d> arrayListE2 = d.e((byte[]) d.b(i8, -898244639, new Object[]{dVarA}, i6, 898244639, iMyTid, i7), 0);
        Object[] objArr6 = new Object[1];
        o(2 - ((Process.getThreadPriority(0) + 20) >> 6), "\ufffa\u0006", false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 135, 1 - TextUtils.indexOf("", ""), objArr6);
        d dVarA2 = d.a(((String) objArr6[0]).intern(), arrayListE2);
        if (dVarA2 == null) {
            Object[] objArr7 = new Object[1];
            o(12 - (ViewConfiguration.getEdgeSlop() >> 16), "\u001c\u0017\u0016\uffc8\uffdd￩\f\u0016\u001d\u0017\u000e\uffc8", true, 165 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
            throw new o.en.f(((String) objArr7[0]).intern());
        }
        arrayListE2.remove(dVarA2);
        int i9 = d.f23913b * (-1487198784);
        d.f23913b = i9;
        int iMyTid2 = Process.myTid();
        int i10 = d.f23912a * (-767436786);
        d.f23912a = i10;
        int i11 = d.f23915d * 1088204935;
        d.f23915d = i11;
        ArrayList<d> arrayListE3 = d.e((byte[]) d.b(i11, -898244639, new Object[]{dVarA2}, i9, 898244639, iMyTid2, i10), 0);
        Object[] objArr8 = new Object[1];
        m(new int[]{479376425, 686212130}, Color.blue(0) + 4, objArr8);
        d dVarA3 = d.a(((String) objArr8[0]).intern(), arrayListE3);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (dVarA3 != null) {
            int i12 = f22511d + 63;
            f22508a = i12 % 128;
            if (i12 % 2 == 0) {
                arrayListE3.remove(dVarA3);
                int i13 = d.f23913b * (-1487198784);
                d.f23913b = i13;
                int iMyTid3 = Process.myTid();
                int i14 = d.f23912a * (-767436786);
                d.f23912a = i14;
                int i15 = d.f23915d * 1088204935;
                d.f23915d = i15;
                d.b((byte[]) d.b(i15, -898244639, new Object[]{dVarA3}, i13, 898244639, iMyTid3, i14));
                obj2.hashCode();
                throw null;
            }
            arrayListE3.remove(dVarA3);
            int i16 = d.f23913b * (-1487198784);
            d.f23913b = i16;
            int iMyTid4 = Process.myTid();
            int i17 = d.f23912a * (-767436786);
            d.f23912a = i17;
            int i18 = d.f23915d * 1088204935;
            d.f23915d = i18;
            linkedHashMap = d.b((byte[]) d.b(i18, -898244639, new Object[]{dVarA3}, i16, 898244639, iMyTid4, i17));
        }
        SystemClock.elapsedRealtime();
        ViewConfiguration.getScrollBarFadeDuration();
        View.resolveSize(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        ImageFormat.getBitsPerPixel(0);
        int i19 = -178701294;
        if (z2) {
            Object[] objArr9 = new Object[1];
            m(new int[]{-178701294, -435435720}, (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr9);
            if (linkedHashMap.containsKey(((String) objArr9[0]).intern())) {
                z3 = false;
            } else {
                Object[] objArr10 = new Object[1];
                m(new int[]{-178701294, -435435720}, 4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
                linkedHashMap.put(((String) objArr10[0]).intern(), 2);
                z3 = true;
            }
            Object[] objArr11 = new Object[1];
            o((ViewConfiguration.getScrollBarSize() >> 8) + 4, "￼\t\ufff4\u0007", false, View.resolveSizeAndState(0, 0, 0) + 138, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr11);
            if (!linkedHashMap.containsKey(((String) objArr11[0]).intern())) {
                Object[] objArr12 = new Object[1];
                o(4 - (ViewConfiguration.getScrollBarSize() >> 8), "￼\t\ufff4\u0007", false, 139 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr12);
                linkedHashMap.put(((String) objArr12[0]).intern(), 8);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            int i20 = f22511d + 31;
            f22508a = i20 % 128;
            if (i20 % 2 == 0) {
                it.next().getKey().hashCode();
                throw null;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 1766941) {
                if (iHashCode == 1766944) {
                    Object[] objArr13 = new Object[1];
                    o(4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "￼\t\ufff4\u0007", false, 138 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 4, objArr13);
                    if (key.equals(((String) objArr13[0]).intern())) {
                        int i21 = f22511d + 5;
                        f22508a = i21 % 128;
                        int i22 = i21 % 2;
                        next.getValue();
                        int i23 = f22511d + 81;
                        f22508a = i23 % 128;
                        int i24 = i23 % 2;
                    }
                } else if (iHashCode == 1766991) {
                    Object[] objArr14 = new Object[1];
                    o(4 - KeyEvent.keyCodeFromString(""), "\r\u0000￼\ufffa", true, Color.argb(0, 0, 0, 0) + 134, 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr14);
                    obj = objArr14[0];
                }
                next.getValue();
                iIntValue += next.getValue().intValue();
                i19 = -178701294;
            } else {
                Object[] objArr15 = new Object[1];
                m(new int[]{i19, -435435720}, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr15);
                obj = objArr15[0];
            }
            key.equals(((String) obj).intern());
            next.getValue();
            iIntValue += next.getValue().intValue();
            i19 = -178701294;
        }
        Object[] objArr16 = {t2, Integer.valueOf(iIntValue)};
        int iMyPid = Process.myPid();
        int i25 = g.f25371z * 380718461;
        g.f25371z = i25;
        int i26 = g.E * 328893739;
        g.E = i26;
        g.b(1497116191, new Random().nextInt(), i25, objArr16, iMyPid, i26, -1497116189);
        if (z3) {
            byte[] bArrB = d.b(linkedHashMap);
            byte[][] bArr = new byte[arrayListE3.size() + 1][];
            int i27 = 0;
            while (i27 < arrayListE3.size()) {
                Object[] objArr17 = {arrayListE3.get(i27)};
                int i28 = d.f23914c * (-2027704125);
                d.f23914c = i28;
                int iMyPid2 = Process.myPid();
                int i29 = d.f23916e * (-546050812);
                d.f23916e = i29;
                int i30 = d.f23918g * (-973841360);
                d.f23918g = i30;
                bArr[i27] = (byte[]) d.b(i30, 1946836075, objArr17, i28, -1946836074, iMyPid2, i29);
                i27++;
            }
            Object[] objArr18 = new Object[1];
            m(new int[]{479376425, 686212130}, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr18);
            bArr[i27] = (byte[]) o.dm.b.c(-1072592980, 1072592981, Process.myUid(), new Object[]{new o.dm.b(((String) objArr18[0]).intern(), bArrB)}, new Random().nextInt(2131832686), (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId());
            Object[] objArr19 = new Object[1];
            o((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, "\ufffa\u0006", false, ((Process.getThreadPriority(0) + 20) >> 6) + 136, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr19);
            byte[] bArrC = d.c(((String) objArr19[0]).intern(), bArr);
            if (f.a()) {
                Object[] objArr20 = new Object[1];
                o(25 - TextUtils.lastIndexOf("", '0'), "�\u0001￮\u0001\b\u0005\u0002\u000b\u000e￬\u000f\ufffe\uffdd\u0000\u000e�\uffff\u000e\u0001\u0010\u000f�￩\u000e\u0001\u0000", true, 177 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr20);
                String strIntern2 = ((String) objArr20[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr21 = new Object[1];
                o((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, "\u0019\"ￔ￮￩\ufff5+", true, 153 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2 - (ViewConfiguration.getEdgeSlop() >> 16), objArr21);
                f.c(strIntern2, sb2.append(((String) objArr21[0]).intern()).append(o.dl.d.e(bArrC)).toString());
            }
            byte[][] bArr2 = new byte[arrayListE2.size() + 1][];
            int i31 = 0;
            while (i31 < arrayListE2.size()) {
                Object[] objArr22 = {arrayListE2.get(i31)};
                int i32 = d.f23914c * (-2027704125);
                d.f23914c = i32;
                int iMyPid3 = Process.myPid();
                int i33 = d.f23916e * (-546050812);
                d.f23916e = i33;
                int i34 = d.f23918g * (-973841360);
                d.f23918g = i34;
                bArr2[i31] = (byte[]) d.b(i34, 1946836075, objArr22, i32, -1946836074, iMyPid3, i33);
                i31++;
            }
            bArr2[i31] = bArrC;
            Object[] objArr23 = new Object[1];
            o(2 - (KeyEvent.getMaxKeyCode() >> 16), "\b\ufff8", true, 138 - TextUtils.lastIndexOf("", '0', 0, 0), Color.blue(0) + 2, objArr23);
            byte[] bArrC2 = d.c(((String) objArr23[0]).intern(), bArr2);
            if (f.a()) {
                Object[] objArr24 = new Object[1];
                o(26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "�\u0001￮\u0001\b\u0005\u0002\u000b\u000e￬\u000f\ufffe\uffdd\u0000\u000e�\uffff\u000e\u0001\u0010\u000f�￩\u000e\u0001\u0000", true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 176, View.MeasureSpec.getMode(0) + 23, objArr24);
                String strIntern3 = ((String) objArr24[0]).intern();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr25 = new Object[1];
                o(TextUtils.getOffsetBefore("", 0) + 7, "!\u0018*￩\ufff9￭ￓ", false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 154, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, objArr25);
                f.c(strIntern3, sb3.append(((String) objArr25[0]).intern()).append(o.dl.d.e(bArrC2)).toString());
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i35 = o.et.c.f25349r * 1770900040;
            o.et.c.f25349r = i35;
            int i36 = o.et.c.f25350s * 1440287991;
            o.et.c.f25350s = i36;
            int i37 = o.et.c.f25351t * 985966497;
            o.et.c.f25351t = i37;
            o.et.c.d(486595506, new Object[]{t2, bArrC2}, iUptimeMillis, -486595502, i35, i36, i37);
        }
    }

    static void init$0() {
        $$f = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
        $$g = 27;
    }

    private static void m(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f22509b;
        double d2 = 0.0d;
        int i4 = 989264422;
        int i5 = -1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(675 - (CdmaCellLocation.convertQuartSecToDecDegrees(i6) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == d2 ? 0 : -1)), (char) View.resolveSize(i6, i6), TextUtils.lastIndexOf("", '0') + 13, -328001469, false, $$h(b2, (byte) (b2 + 1), (byte) $$f.length), new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    d2 = 0.0d;
                    i4 = 989264422;
                    i5 = -1;
                    i6 = 0;
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
        int[] iArr5 = f22509b;
        int i9 = 16;
        if (iArr5 != null) {
            int i10 = $11 + 25;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> i9) + 675, (char) KeyEvent.getDeadChar(0, 0), 12 - TextUtils.getOffsetBefore("", 0), -328001469, false, $$h(b3, (byte) (b3 + 1), (byte) $$f.length), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i12++;
                i9 = 16;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i13 = $11 + 83;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $10 + 87;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA3 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 300, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52697), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), -1416256172, false, $$h(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i15++;
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
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA4 = o.d.d.a(229 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (51004 - Color.green(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, -330018025, false, $$h(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void o(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22510c)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(270 - View.combineMeasuredStates(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 11 - View.resolveSize(0, 0), -2071844881, false, $$h(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(523 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 12 - Gravity.getAbsoluteGravity(0, 0), 627984172, false, $$h(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 521, (char) Color.green(0), (Process.myPid() >> 22) + 12, 627984172, false, $$h(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public abstract T a(T t2, o.ef.a aVar, int i2, String str, o.ef.a aVar2) throws o.en.f, o.ef.b;

    public abstract T b(String str, String str2, int i2, String str3, o.ef.a aVar) throws o.en.f, o.ef.b;

    public abstract boolean b(int i2, o.ef.a aVar) throws o.ef.b;

    public abstract o.ef.a c(int i2, o.ef.a aVar) throws o.ef.b;

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    @Override // o.cl.c
    public final List<T> d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        String strA;
        int i3;
        e<T> eVar = this;
        int i4 = 2;
        int i5 = 2 % 2;
        ArrayList<g> arrayList = new ArrayList();
        try {
            String str4 = str3;
            g gVarB = eVar.b(str, str2, i2, str4, aVar);
            b(gVarB, eVar.e());
            arrayList.add(gVarB);
            int i6 = 0;
            while (eVar.b(i6, aVar)) {
                int i7 = f22511d + 11;
                f22508a = i7 % 128;
                int i8 = i7 % i4;
                o.ef.a aVarC = eVar.c(i6, aVar);
                if (aVarC == null) {
                    Object[] objArr = new Object[1];
                    m(new int[]{1324147945, -1879081196, -2131857336, 83127862, -599115122, -740770929, -131959826, -2145902603, 1543447308, 2091509836, 1355850229, 1572485699, -2083129469, -831632595, -668204615, 238263580, -722175924, 1033013350}, 36 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                    throw new o.en.f(((String) objArr[0]).intern());
                }
                eVar = eVar;
                str4 = str4;
                g gVarA = eVar.a(gVarB, aVarC, i6, str4, aVar);
                if (gVarA == null) {
                    Object[] objArr2 = new Object[1];
                    m(new int[]{327744697, -1064817593, -2131857336, 83127862, -599115122, -740770929, -131959826, -2145902603, 1543447308, 2091509836, -94359671, -498628108, 1676770431, 516934989}, TextUtils.indexOf((CharSequence) "", '0') + 28, objArr2);
                    throw new o.en.f(((String) objArr2[0]).intern());
                }
                b(gVarA, eVar.e());
                arrayList.add(gVarA);
                i6++;
                i4 = 2;
            }
            boolean z2 = false;
            for (o.cl.b bVar : eVar.d(eVar.d(aVar))) {
                if (z2) {
                    strA = null;
                } else {
                    int i9 = f22508a + 31;
                    f22511d = i9 % 128;
                    int i10 = i9 % 2;
                    strA = bVar.a();
                }
                for (g gVar : arrayList) {
                    int i11 = f22508a + 121;
                    f22511d = i11 % 128;
                    int i12 = i11 % 2;
                    gVar.e(bVar);
                    if (strA != null) {
                        gVar.i(strA);
                    }
                }
                if (strA != null) {
                    int i13 = f22508a + 27;
                    f22511d = i13 % 128;
                    i3 = 2;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    i3 = 2;
                }
                int i15 = f22511d + 3;
                f22508a = i15 % 128;
                int i16 = i15 % i3;
            }
            if (z2) {
                return arrayList;
            }
            Object[] objArr3 = new Object[1];
            o(39 - TextUtils.indexOf((CharSequence) "", '0'), "\u0012\u0005\u0003\u000f\u0012\u0004\u0013\u0015\u000e\u0001\u0002\f\u0005\uffc0\u0014\u000f\uffc0\u0005\u0018\u0014\u0012\u0001\u0003\u0014\uffc0\u0014\u000f\u000b\u0005\u000e\uffc0\u0010\u0001\u000e\uffc0\u0006\u0012\u000f\r\uffc0", false, 173 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
            throw new o.en.f(((String) objArr3[0]).intern());
        } catch (o.ef.b e2) {
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                o((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, "�\u0001￮\u0001\b\u0005\u0002\u000b\u000e￬\u000f\ufffe\uffdd\u0000\u000e�\uffff\u000e\u0001\u0010\u000f�￩\u000e\u0001\u0000", true, 177 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                m(new int[]{2059836803, 408282510, -1320354086, -1456303577, 575541103, 666963386, -202482902, 492589192}, (ViewConfiguration.getLongPressTimeout() >> 16) + 13, objArr5);
                f.e(strIntern, ((String) objArr5[0]).intern(), e2);
            }
            throw new o.en.f(e2.getMessage());
        }
    }

    protected List<o.cl.b> d(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new o.dh.e();
        int i3 = f22508a + 121;
        f22511d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i6;
            int i7 = 1136425123 * o.ef.c.f23798a;
            o.ef.c.f23798a = i7;
            if (i5 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i7, i6, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                return arrayList;
            }
            int i8 = f22511d + 91;
            f22508a = i8 % 128;
            int i9 = i8 % 2;
            o.ef.a aVarD = cVar.d(i5);
            Object[] objArr = new Object[1];
            o(12 - (ViewConfiguration.getEdgeSlop() >> 16), "\r￦￼\n\u0007\ufffb�\n\n�\ufffa\u0005", true, 181 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 9, objArr);
            Object[] objArr2 = {aVarD, ((String) objArr[0]).intern()};
            int i10 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i10;
            String string = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority());
            if (string.length() % 2 != 0) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                o((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 124, -TextUtils.lastIndexOf("", '0', 0), objArr3);
                string = sb.append(((String) objArr3[0]).intern()).append(string).toString();
            }
            Object[] objArr4 = new Object[1];
            o(3 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\ufffe\ufffb\b", true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 185, TextUtils.indexOf("", "", 0) + 3, objArr4);
            Object[] objArr5 = {aVarD, ((String) objArr4[0]).intern()};
            int i11 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i11;
            String string2 = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority());
            if (string2.length() % 2 != 0) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                o((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, 125 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr6);
                string2 = sb2.append(((String) objArr6[0]).intern()).append(string2).toString();
            }
            int i12 = o.dl.d.f23185c * 447039506;
            o.dl.d.f23185c = i12;
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i13 = o.dl.d.f23187e * 1037703823;
            o.dl.d.f23187e = i13;
            int iByteValue = ((Byte) o.dl.d.c(708803393, iMyUid, i13, priority, i12, -708803392, new Object[]{string})).byteValue();
            int i14 = o.dl.d.f23185c * 447039506;
            o.dl.d.f23185c = i14;
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid2 = Process.myUid();
            int i15 = o.dl.d.f23187e * 1037703823;
            o.dl.d.f23187e = i15;
            int iByteValue2 = (byte) (((Byte) o.dl.d.c(708803393, iMyUid2, i15, priority2, i14, -708803392, new Object[]{string2})).byteValue() >>> 3);
            Object[] objArr7 = new Object[1];
            m(new int[]{-1883150751, -1774944913, -1949567781, 1866632920, -1871291594, 855160472}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, objArr7);
            byte[] bArrD = aVarD.D(((String) objArr7[0]).intern());
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i16 = o.dh.a.f23009a * (-2093433746);
            o.dh.a.f23009a = i16;
            arrayList.add(new o.cl.b(iByteValue2, iByteValue, d.b(bArrD, (byte[]) o.dh.a.a(195285494, iElapsedRealtime, new Random().nextInt(1524627709), new Object[0], i16, -195285492, (int) SystemClock.uptimeMillis()))));
            int[] iArr = {iByteValue2, iByteValue};
            if (o.dl.d.a(arrayList2, iArr) != -1) {
                Object[] objArr8 = new Object[1];
                o(Drawable.resolveOpacity(0, 0) + 45, "\u0012\bￄ\u0017\n\rￖￄ\u0016\t\u0007\u0013\u0016\b\u0017ￄ\f\u0005\u001a\tￄ\u0018\f\tￄ\u0017\u0005\u0011\tￄ\u0016\t\u0007\u0013\u0016\bￄ\u0012\u0019\u0011\u0006\t\u0016ￄ\u0005", false, (Process.myTid() >> 22) + 169, 6 - (Process.myPid() >> 22), objArr8);
                throw new o.en.f(((String) objArr8[0]).intern());
            }
            int i17 = f22508a + 99;
            f22511d = i17 % 128;
            if (i17 % 2 != 0) {
                arrayList2.add(iArr);
                f.a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayList2.add(iArr);
            if (f.a()) {
                Object[] objArr9 = new Object[1];
                o(26 - Color.alpha(0), "�\u0001￮\u0001\b\u0005\u0002\u000b\u000e￬\u000f\ufffe\uffdd\u0000\u000e�\uffff\u000e\u0001\u0010\u000f�￩\u000e\u0001\u0000", true, 177 - (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22, objArr9);
                String strIntern = ((String) objArr9[0]).intern();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                o(TextUtils.indexOf((CharSequence) "", '0', 0) + 16, "\ufff5\u001c\u0014\t\f\u0019ￇ￡\ufff9\f\n\u0016\u0019\u000bￇ", false, 166 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr10);
                StringBuilder sbAppend = sb3.append(((String) objArr10[0]).intern()).append(iByteValue);
                Object[] objArr11 = new Object[1];
                m(new int[]{2095539726, -499828975, 1330975584, -1139694868}, 7 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11);
                StringBuilder sbAppend2 = sbAppend.append(((String) objArr11[0]).intern()).append(iByteValue2);
                Object[] objArr12 = new Object[1];
                m(new int[]{855376696, 1226823356, -1594950891, -1072199563, 1465721675, 259916669, -49097769, -914553602, -549196240, -234542857, 1383557900, -751265209, 1273659503, -1792203992, 1245155011, 920754212}, 29 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                f.c(strIntern, sbAppend2.append(((String) objArr12[0]).intern()).toString());
            }
            i5++;
        }
    }

    public abstract o.ef.c d(o.ef.a aVar) throws o.ef.b;

    public abstract boolean e();
}
