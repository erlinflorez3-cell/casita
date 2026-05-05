package o.cj;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.a.l;
import o.a.n;
import o.cl.c;
import o.dn.e;
import o.ea.f;
import o.ef.a;
import o.eq.b;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements c<o.et.d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f22411a = 0;

    /* JADX INFO: renamed from: b */
    private static int f22412b = 0;

    /* JADX INFO: renamed from: c */
    private static int f22413c = 0;

    /* JADX INFO: renamed from: d */
    private static int f22414d = 0;

    /* JADX INFO: renamed from: e */
    private static int[] f22415e = null;

    /* JADX INFO: renamed from: f */
    private static int f22416f = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, byte r8, byte r9) {
        /*
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 * 2
            int r6 = 121 - r0
            byte[] r5 = o.cj.d.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L2b
            r6 = r7
            r0 = r8
            r2 = r3
        L16:
            int r8 = r8 + r6
            r6 = r8
            r8 = r0
        L19:
            int r0 = r8 + 1
            byte r1 = (byte) r6
            r4[r2] = r1
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r8 = r5[r0]
            int r2 = r2 + 1
            goto L16
        L2b:
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cj.d.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22414d = 0;
        f22416f = 1;
        f22413c = 0;
        f22411a = 1;
        e();
        AndroidCharacter.getMirror('0');
        int i2 = f22416f + 123;
        f22414d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static o.et.d b(a aVar, String str, String str2, int i2, String str3) throws Throwable {
        int i3 = 2 % 2;
        o.et.d dVar = new o.et.d(str, str2, i2, str3);
        Object[] objArr = new Object[1];
        h(3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "�\u0005\u0000", false, Color.argb(0, 0, 0, 0) + 256, Color.green(0) + 3, objArr);
        dVar.e(aVar.D(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        g(new int[]{-830537862, 1506912283}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, objArr2);
        Object[] objArr3 = {dVar, aVar.D(((String) objArr2[0]).intern())};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i4 = o.et.c.f25349r * 1770900040;
        o.et.c.f25349r = i4;
        int i5 = o.et.c.f25350s * 1440287991;
        o.et.c.f25350s = i5;
        int i6 = o.et.c.f25351t * 985966497;
        o.et.c.f25351t = i6;
        o.et.c.d(486595506, objArr3, iUptimeMillis, -486595502, i4, i5, i6);
        byte[] bArrC = dVar.C();
        Object[] objArr4 = new Object[1];
        g(new int[]{-931334553, 751763756}, Color.alpha(0) + 4, objArr4);
        dVar.a(o.ei.d.d(bArrC, ((String) objArr4[0]).intern()));
        int i7 = f22411a + 45;
        f22413c = i7 % 128;
        if (i7 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        r0 = new java.lang.Object[1];
        g(new int[]{-1120718991, 1708449545, -1073795236, 204975324, -1672030820, 1083734180, -374349592, 1079673612, -1210062301, 870578228, 270109229, 1052285911, -718283079, 180323571, -331770412, 2042688120, 246847075, 968723226, 1069804873, 2079041152}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a9, code lost:
    
        throw new o.en.f(((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<o.cl.b> e(o.ef.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cj.d.e(o.ef.c):java.util.List");
    }

    private static o.et.d e(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        o.et.d dVar = new o.et.d(str, str2, i2, str3);
        int i4 = f22413c + 39;
        f22411a = i4 % 128;
        int i5 = i4 % 2;
        return dVar;
    }

    static void e() {
        f22415e = new int[]{1439264231, -531397865, -566293603, 217150304, 1518176589, -1410512096, 1959085472, -25866670, -803901917, -2136738032, 258711976, 1697695429, 700603733, -6315200, -889308411, 1006370238, 2120465956, 2116086142};
        f22412b = -1270219385;
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22415e;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
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
        int[] iArr5 = f22415e;
        int i7 = 3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + i7;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 12 - (ViewConfiguration.getTapTimeout() >> 16), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                i7 = 3;
            }
            int i11 = $11 + 49;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 / 4;
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
            int i13 = $11 + 1;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < 16; i15++) {
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(TextUtils.indexOf("", "", 0) + 301, (char) (Color.alpha(0) + 52697), Color.alpha(0) + 11, -1416256172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
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
                byte b9 = b8;
                objA4 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 230, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51003), 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -330018025, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            c2 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i19 = $10 + 25;
        $11 = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void h(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
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
        while (nVar.f19944a < i2) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f22412b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 270, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 11, -2071844881, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a(522 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), ImageFormat.getBitsPerPixel(0) + 13, 627984172, false, $$c(b4, b4, (byte) $$a.length), new Class[]{Object.class, Object.class});
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
                int i10 = $10 + 99;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    objA3 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 522, (char) ((Process.getThreadPriority(0) + 20) >> 6), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 627984172, false, $$c(b5, b5, (byte) $$a.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{96, -118, -108, -83};
        $$b = 23;
    }

    @Override // o.cl.c
    public final /* synthetic */ b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22411a + 5;
        f22413c = i4 % 128;
        int i5 = i4 % 2;
        o.et.d dVarE = e(str, str2, i2, str3);
        if (i5 != 0) {
            int i6 = 48 / 0;
        }
        return dVarE;
    }

    @Override // o.cl.c
    public final List<o.et.d> d(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22411a + 5;
        f22413c = i4 % 128;
        int i5 = i4 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                g(new int[]{-1757603588, 1053902840, 998303370, -1635671734, 1070691291, -2005278840, 414390468, -1443003039, 1139518634, 2049689784}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                h(TextUtils.getOffsetBefore("", 0) + 14, "\f\b\u000b\ufff7\u0019\u0016\r\u0010\u0013\fￇ￡ￇ\u0019", false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 244, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            }
            ArrayList<o.et.d> arrayList = new ArrayList();
            Object[] objArr3 = new Object[1];
            h(12 - (ViewConfiguration.getScrollBarSize() >> 8), "\b\b\uffd9\u000b\u0006\u0007\u0001\f\ufff9\ufffb\u0001\u0004", true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 259, Color.red(0) + 3, objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i6 = a.f23780n * (-1229108307);
            a.f23780n = i6;
            o.ef.c cVar = (o.ef.c) a.a(-1398121910, objArr4, iMyUid, i6, 1398121917, iUptimeMillis, iElapsedRealtime);
            int i7 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i8;
                int i9 = 1136425123 * o.ef.c.f23798a;
                o.ef.c.f23798a = i9;
                if (i7 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    break;
                }
                arrayList.add(b(cVar.d(i7), str, str2, i2, str3));
                i7++;
            }
            Object[] objArr5 = new Object[1];
            h((ViewConfiguration.getWindowTouchSlop() >> 8) + 9, "\ufff6\ufffb￼�\n\u0007\u0007\n￼", false, 260 - MotionEvent.axisFromString(""), 5 - View.resolveSize(0, 0), objArr5);
            byte[] bArrC = o.dl.b.c(aVar.D(((String) objArr5[0]).intern()));
            Object[] objArr6 = new Object[1];
            h((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, "￼\b\u000b�\f￫\ufffe", false, 259 - (Process.myPid() >> 22), 4 - TextUtils.lastIndexOf("", '0', 0, 0), objArr6);
            Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int iMyUid2 = Process.myUid();
            int i10 = a.f23780n * (-1229108307);
            a.f23780n = i10;
            List<o.cl.b> listE = e((o.ef.c) a.a(-1398121910, objArr7, iMyUid2, i10, 1398121917, iUptimeMillis2, iElapsedRealtime2));
            Iterator<o.cl.b> it = listE.iterator();
            String strA = null;
            while (it.hasNext() && (strA = it.next().a()) == null) {
            }
            Object[] objArr8 = new Object[1];
            h(View.MeasureSpec.getMode(0) + 12, "\u0012\uffff￢\u0001\u0007\u0004\u0007\u0001\u0003\u000e\ufff1\uffff", true, 254 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 11, objArr8);
            a aVarX = aVar.x(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            h((ViewConfiguration.getEdgeSlop() >> 16) + 9, "\uffd1\r\u0016\u0003\uffff\u0003\u0001\t\u0003", true, View.combineMeasuredStates(0, 0) + 252, TextUtils.indexOf("", "", 0, 0) + 9, objArr9);
            aVarX.D(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            h(View.MeasureSpec.makeMeasureSpec(0, 0) + 9, "\u0003ￒ\r\u0016\u0003\uffff\u0003\u0001\t", true, 252 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr10);
            aVarX.D(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            g(new int[]{122806035, -2143168611, -1790764024, -1745995237, 2112732043, -236384112}, 11 - ExpandableListView.getPackedPositionGroup(0L), objArr11);
            aVarX.D(((String) objArr11[0]).intern());
            Object[] objArr12 = new Object[1];
            h('<' - AndroidCharacter.getMirror('0'), "\ufff4\u0002\u0007\ufff8\u000e\ufff8\u0003\ufffa\u0007\u0007\n\ufff8", true, KeyEvent.keyCodeFromString("") + 263, KeyEvent.normalizeMetaState(0) + 4, objArr12);
            aVarX.D(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            h(12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\ufff4\u0002\u0007\ufff8\u000e\ufff8\u0003\ufffa\u0007\u0007\n\ufff8", true, 263 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - Color.red(0), objArr13);
            Object[] objArr14 = {aVarX, ((String) objArr13[0]).intern()};
            int i11 = a.f23782p * (-1576737484);
            a.f23782p = i11;
            o.ei.c cVarC = o.ei.c.c(Integer.parseInt((String) a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority()), 16));
            Object[] objArr15 = new Object[1];
            g(new int[]{1630585987, 1613484997, -266363553, 2120453981, -347149300, -977774779}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, objArr15);
            aVarX.D(((String) objArr15[0]).intern());
            Object[] objArr16 = new Object[1];
            h(View.MeasureSpec.getMode(0) + 17, "\u000e\ufffb\ufff7\f\u0001\u0005\u0001\u0004\ufff7\n�\r\u000b\u000b\u0001\uffc9\u0005", true, 260 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr16);
            aVarX.D(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            h(ImageFormat.getBitsPerPixel(0) + 18, "\u0001\u0005\u0001\u0004\ufff7\n�\r\u000b\u000b\u0001ￊ\u0005\u000e\ufffb\ufff7\f", true, 260 - Color.blue(0), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr17);
            aVarX.D(((String) objArr17[0]).intern());
            Object[] objArr18 = new Object[1];
            g(new int[]{-1872200692, -874599625, 739769832, 1374992162, -1386392274, -1005330829, 150586127, -805968639}, 13 - Color.green(0), objArr18);
            if (aVarX.d(((String) objArr18[0]).intern())) {
                Object[] objArr19 = new Object[1];
                g(new int[]{-1872200692, -874599625, 739769832, 1374992162, -1386392274, -1005330829, 150586127, -805968639}, 13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr19);
                o.ei.b.a(aVarX.D(((String) objArr19[0]).intern()), cVarC);
            }
            Object[] objArr20 = new Object[1];
            g(new int[]{-1872200692, -874599625, 1412443819, -379417540, -1964306008, -1644370267, 1352266254, 612187792, -1386392274, -1005330829, 150586127, -805968639}, (ViewConfiguration.getLongPressTimeout() >> 16) + 21, objArr20);
            if (aVarX.d(((String) objArr20[0]).intern())) {
                int i12 = f22413c + 97;
                f22411a = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr21 = new Object[1];
                    g(new int[]{-1872200692, -874599625, 2146654085, -1274774047, -1809791951, -1181019533, -628845466, 1161617476, 932192566, -1185516056}, 62 % View.MeasureSpec.getMode(0), objArr21);
                    if (aVarX.d(((String) objArr21[0]).intern())) {
                        Object[] objArr22 = new Object[1];
                        g(new int[]{-1872200692, -874599625, 1412443819, -379417540, -1964306008, -1644370267, 1352266254, 612187792, -1386392274, -1005330829, 150586127, -805968639}, View.MeasureSpec.getMode(0) + 21, objArr22);
                        o.ei.b.a(aVarX.D(((String) objArr22[0]).intern()), cVarC);
                        Object[] objArr23 = new Object[1];
                        g(new int[]{-1872200692, -874599625, 2146654085, -1274774047, -1809791951, -1181019533, -628845466, 1161617476, 932192566, -1185516056}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, objArr23);
                        Object[] objArr24 = {aVarX, ((String) objArr23[0]).intern()};
                        int i13 = a.f23782p * (-1576737484);
                        a.f23782p = i13;
                        Short.parseShort((String) a.a(-781664457, objArr24, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority()));
                    }
                } else {
                    Object[] objArr25 = new Object[1];
                    g(new int[]{-1872200692, -874599625, 2146654085, -1274774047, -1809791951, -1181019533, -628845466, 1161617476, 932192566, -1185516056}, View.MeasureSpec.getMode(0) + 18, objArr25);
                    if (aVarX.d(((String) objArr25[0]).intern())) {
                        Object[] objArr222 = new Object[1];
                        g(new int[]{-1872200692, -874599625, 1412443819, -379417540, -1964306008, -1644370267, 1352266254, 612187792, -1386392274, -1005330829, 150586127, -805968639}, View.MeasureSpec.getMode(0) + 21, objArr222);
                        o.ei.b.a(aVarX.D(((String) objArr222[0]).intern()), cVarC);
                        Object[] objArr232 = new Object[1];
                        g(new int[]{-1872200692, -874599625, 2146654085, -1274774047, -1809791951, -1181019533, -628845466, 1161617476, 932192566, -1185516056}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, objArr232);
                        Object[] objArr242 = {aVarX, ((String) objArr232[0]).intern()};
                        int i132 = a.f23782p * (-1576737484);
                        a.f23782p = i132;
                        Short.parseShort((String) a.a(-781664457, objArr242, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i132, Thread.currentThread().getPriority()));
                    }
                }
            }
            Object[] objArr26 = new Object[1];
            g(new int[]{1573658896, 101686587, 1082395800, -83820731, -1523296135, -1586241110, -1018806625, 403660310, -1020873183, -303927577}, 19 - (ViewConfiguration.getEdgeSlop() >> 16), objArr26);
            new e(aVarX.D(((String) objArr26[0]).intern()));
            Object[] objArr27 = new Object[1];
            h(View.resolveSizeAndState(0, 0, 0) + 3, "\u0007\ufffa\u0000", false, 261 - View.resolveSize(0, 0), 3 - TextUtils.indexOf("", "", 0, 0), objArr27);
            aVarX.z(((String) objArr27[0]).intern());
            Object[] objArr28 = new Object[1];
            g(new int[]{1102464463, -656021026}, 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr28);
            Object[] objArr29 = {aVarX, ((String) objArr28[0]).intern()};
            int i14 = a.f23778l * 493926616;
            a.f23778l = i14;
            int i15 = a.f23779m * 1131312688;
            a.f23779m = i15;
            Object[] objArr30 = new Object[1];
            h(TextUtils.getOffsetBefore("", 0) + 11, "\ufffa￫￮\ufff9\u0018\u0019\u0018\t\uffef￼\uffff", true, 241 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr30);
            a aVarX2 = aVarX.x(((String) objArr30[0]).intern());
            Object[] objArr31 = new Object[1];
            h(4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\ufff9\u0001\b", false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 260, 3 - Color.alpha(0), objArr31);
            aVarX2.D(((String) objArr31[0]).intern());
            Object[] objArr32 = new Object[1];
            h(3 - TextUtils.getOffsetAfter("", 0), "\ufffb\u0000\u0006", false, 258 - TextUtils.indexOf("", "", 0), Process.getGidForName("") + 4, objArr32);
            aVarX2.D(((String) objArr32[0]).intern());
            Object[] objArr33 = new Object[1];
            g(new int[]{1206424560, -585844086, 197515564, -1356598749}, 8 - TextUtils.getOffsetBefore("", 0), objArr33);
            if (aVarX.d(((String) objArr33[0]).intern())) {
                Object[] objArr34 = new Object[1];
                g(new int[]{1206424560, -585844086, 197515564, -1356598749}, 8 - (Process.myPid() >> 22), objArr34);
                a aVarX3 = aVarX.x(((String) objArr34[0]).intern());
                Object[] objArr35 = new Object[1];
                h((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, "\ufff9\u0001\b", false, 259 - MotionEvent.axisFromString(""), 3 - (Process.myTid() >> 22), objArr35);
                aVarX3.D(((String) objArr35[0]).intern());
                Object[] objArr36 = new Object[1];
                h(3 - View.MeasureSpec.getMode(0), "\ufffb\u0000\u0006", false, 257 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, objArr36);
                aVarX3.D(((String) objArr36[0]).intern());
            }
            for (o.et.d dVar : arrayList) {
                if (arrayList.size() > 1) {
                    int i16 = f22413c + 69;
                    f22411a = i16 % 128;
                    if (i16 % 2 == 0) {
                        int iMyPid = Process.myPid();
                        int i17 = o.et.c.f25353v * 1073314991;
                        o.et.c.f25353v = i17;
                        int iMyTid = Process.myTid();
                        int i18 = o.et.c.f25354w * 1986112249;
                        o.et.c.f25354w = i18;
                        Object[] objArr37 = {dVar, o.dl.b.e((byte[]) o.et.c.d(-1168717246, new Object[]{dVar}, iMyPid, 1168717251, i17, iMyTid, i18), bArrC)};
                        int i19 = (int) Runtime.getRuntime().totalMemory();
                        int id = (int) Thread.currentThread().getId();
                        int i20 = o.et.c.f25341f * 1595628892;
                        o.et.c.f25341f = i20;
                        o.et.c.d(-1863692548, objArr37, i19, 1863692548, id, i20, Process.myUid());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iMyPid2 = Process.myPid();
                    int i21 = o.et.c.f25353v * 1073314991;
                    o.et.c.f25353v = i21;
                    int iMyTid2 = Process.myTid();
                    int i22 = o.et.c.f25354w * 1986112249;
                    o.et.c.f25354w = i22;
                    Object[] objArr38 = {dVar, o.dl.b.e((byte[]) o.et.c.d(-1168717246, new Object[]{dVar}, iMyPid2, 1168717251, i21, iMyTid2, i22), bArrC)};
                    int i23 = (int) Runtime.getRuntime().totalMemory();
                    int id2 = (int) Thread.currentThread().getId();
                    int i24 = o.et.c.f25341f * 1595628892;
                    o.et.c.f25341f = i24;
                    o.et.c.d(-1863692548, objArr38, i23, 1863692548, id2, i24, Process.myUid());
                } else {
                    int i25 = (int) Runtime.getRuntime().totalMemory();
                    int id3 = (int) Thread.currentThread().getId();
                    int i26 = o.et.c.f25341f * 1595628892;
                    o.et.c.f25341f = i26;
                    o.et.c.d(-1863692548, new Object[]{dVar, bArrC}, i25, 1863692548, id3, i26, Process.myUid());
                }
                dVar.a(listE);
                if (strA != null) {
                    dVar.f(o.dl.d.d(strA));
                }
            }
            int i27 = f22413c + 1;
            f22411a = i27 % 128;
            if (i27 % 2 != 0) {
                return arrayList;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr39 = new Object[1];
            h(62 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0010\u0011\u000b\u0016\u0012\u0007\u0005\u001a\uffe7ￂￜￂ\u0010\u0011\u000b\u0016\u0003\u0005\u000b\u000e\u0012\u0012￣ￂ\u0007\u0014\u0017\ufff2ￂ\u0003\u000b\u000f\u0007\u0006￫ￂ\t\u0010\u000b\u0006\u0003\u0007\u0014ￂ\u0007\u000e\u000b\n\u0019ￂ\u0006\u0007\u0014\u0007\u0016\u0010\u0017\u0011\u0005\u0010\u0007ￂ", true, 251 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr39);
            throw new o.en.f(sb2.append(((String) objArr39[0]).intern()).append(e2.getMessage()).toString());
        }
    }
}
