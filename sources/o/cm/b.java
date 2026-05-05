package o.cm;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.g;
import o.a.h;
import o.cl.c;
import o.dl.d;
import o.ef.a;
import o.en.f;
import o.et.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c<e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f22479a = 0;

    /* JADX INFO: renamed from: b */
    private static char f22480b = 0;

    /* JADX INFO: renamed from: c */
    private static char f22481c = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f22482d = null;

    /* JADX INFO: renamed from: e */
    private static char f22483e = 0;

    /* JADX INFO: renamed from: f */
    private static int f22484f = 0;

    /* JADX INFO: renamed from: g */
    private static char f22485g = 0;

    /* JADX INFO: renamed from: h */
    private static int f22486h = 0;

    /* JADX INFO: renamed from: i */
    private static int f22487i = 0;

    /* JADX INFO: renamed from: j */
    private static int f22488j = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 4
            int r8 = 1 - r0
            byte[] r7 = o.cm.b.$$a
            int r6 = 111 - r10
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r5
            r2 = r3
        L13:
            int r5 = r5 + 1
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r5]
            goto L13
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cm.b.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22486h = 0;
        f22484f = 1;
        f22488j = 0;
        f22487i = 1;
        b();
        Process.myTid();
        int i2 = f22484f + 31;
        f22486h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static List<o.cl.b> a(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        new o.dh.e();
        int i3 = f22488j + 77;
        f22487i = i3 % 128;
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
            int i8 = f22488j + 11;
            f22487i = i8 % 128;
            int i9 = i8 % 2;
            a aVarD = cVar.d(i5);
            Object[] objArr = new Object[1];
            l(View.combineMeasuredStates(0, 0) + 2, "\u0007\u0001", (byte) (TextUtils.getTrimmedLength("") + 95), objArr);
            Object[] objArr2 = {aVarD, ((String) objArr[0]).intern()};
            int i10 = a.f23782p * (-1576737484);
            a.f23782p = i10;
            String str = (String) a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority());
            if (str.length() != 4) {
                Object[] objArr3 = new Object[1];
                l(38 - Gravity.getAbsoluteGravity(0, 0), "\u001b\f\u0012\"\u001a\u0005\u0019\u0017\u0010\u0014 \u001f\u0007\u000f\u0007\u0003\u0000\u0001\f\t\u0007\u0001\n\u0015\u0019\u0017\u0010\u0014#\u0013!\u0007\u000b\u0018\u0000\u0017\u0016\t", (byte) (50 - Color.alpha(0)), objArr3);
                throw new f(((String) objArr3[0]).intern());
            }
            Object[] objArr4 = {str.substring(0, 2)};
            int i11 = d.f23185c * 447039506;
            d.f23185c = i11;
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i12 = d.f23187e * 1037703823;
            d.f23187e = i12;
            byte bByteValue = ((Byte) d.c(708803393, iMyUid, i12, priority, i11, -708803392, objArr4)).byteValue();
            Object[] objArr5 = {str.substring(2, 4)};
            int i13 = d.f23185c * 447039506;
            d.f23185c = i13;
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid2 = Process.myUid();
            int i14 = d.f23187e * 1037703823;
            d.f23187e = i14;
            byte bByteValue2 = ((Byte) d.c(708803393, iMyUid2, i14, priority2, i13, -708803392, objArr5)).byteValue();
            Object[] objArr6 = new Object[1];
            k("섶\uf6a8ⷊ鏳踓⦆", TextUtils.getCapsMode("", 0, 0) + 5, objArr6);
            byte[] bArrD = aVarD.D(((String) objArr6[0]).intern());
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i15 = o.dh.a.f23009a * (-2093433746);
            o.dh.a.f23009a = i15;
            arrayList.add(new o.cl.b(bByteValue, bByteValue2, o.ei.d.b(bArrD, (byte[]) o.dh.a.a(195285494, iElapsedRealtime, new Random().nextInt(1524627709), new Object[0], i15, -195285492, (int) SystemClock.uptimeMillis()))));
            i5++;
        }
    }

    private static e b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        e eVar = new e(str, str2, i2, str3);
        int i4 = f22487i + 81;
        f22488j = i4 % 128;
        if (i4 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    private static e b(a aVar, String str, String str2, int i2, String str3) throws Throwable {
        int i3 = 2 % 2;
        e eVar = new e(str, str2, i2, str3);
        Object[] objArr = new Object[1];
        l(Drawable.resolveOpacity(0, 0) + 3, "\r\u0003㘈", (byte) (View.getDefaultSize(0, 0) + 10), objArr);
        eVar.e(aVar.D(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        k("ﺖ㖛壯樻", AndroidCharacter.getMirror('0') - '-', objArr2);
        byte[] bArrD = aVar.D(((String) objArr2[0]).intern());
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i4 = o.et.c.f25349r * 1770900040;
        o.et.c.f25349r = i4;
        int i5 = o.et.c.f25350s * 1440287991;
        o.et.c.f25350s = i5;
        int i6 = o.et.c.f25351t * 985966497;
        o.et.c.f25351t = i6;
        o.et.c.d(486595506, new Object[]{eVar, bArrD}, iUptimeMillis, -486595502, i4, i5, i6);
        ArrayList<o.ei.d> arrayListE = o.ei.d.e(bArrD, 0);
        Object[] objArr3 = new Object[1];
        k("\u1ae2ꆬ䞮ꀻ", 4 - TextUtils.indexOf("", "", 0, 0), objArr3);
        o.ei.d dVarA = o.ei.d.a(((String) objArr3[0]).intern(), arrayListE);
        if (dVarA != null) {
            int i7 = o.ei.d.f23914c * (-2027704125);
            o.ei.d.f23914c = i7;
            int iMyPid = Process.myPid();
            int i8 = o.ei.d.f23916e * (-546050812);
            o.ei.d.f23916e = i8;
            int i9 = o.ei.d.f23918g * (-973841360);
            o.ei.d.f23918g = i9;
            int i10 = f22488j + 85;
            f22487i = i10 % 128;
            int i11 = i10 % 2;
        }
        Object[] objArr4 = new Object[1];
        l(4 - (ViewConfiguration.getLongPressTimeout() >> 16), "\n\u000e\"\u001d", (byte) (Color.green(0) + 83), objArr4);
        eVar.a(o.ei.d.d(bArrD, ((String) objArr4[0]).intern()));
        int i12 = f22488j + 21;
        f22487i = i12 % 128;
        if (i12 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f22480b = (char) 30083;
        f22483e = (char) 56073;
        f22481c = (char) 36153;
        f22479a = (char) 60390;
        f22482d = new char[]{64595, 64588, 64631, 64583, 64579, 64587, 64585, 64532, 64528, 64517, 64589, 64594, 64604, 64520, 64586, 64580, 64611, 64612, 64578, 64582, 64559, 64593, 64599, 64620, 64597, 64614, 64634, 64533, 64609, 64576, 64598, 64577, 64617, 64592, 64584, 64535};
        f22485g = (char) 51641;
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
        $$b = 194;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i4 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f22481c) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f22479a)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - Color.argb(0, 0, 0, 0), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -1995022631, false, $$c(b2, b3, (byte) (42 | b3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f22480b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22483e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-16777205) - Color.rgb(0, 0, 0), -1995022631, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 42)))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 270, (char) (Process.myTid() >> 22), TextUtils.indexOf("", "", 0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) ((b7 + 39) - (39 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void l(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f22482d;
        int i6 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 27;
                $11 = i8 % 128;
                int i9 = i8 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(Color.red(0) + 270, (char) (ViewConfiguration.getEdgeSlop() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -811348851, false, $$c(b3, b4, (byte) ((b4 + 9) - (9 & b4))), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = 2;
                    i6 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f22485g)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.red(0) + 11, -811348851, false, $$c(b5, b6, (byte) (9 | b6)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                int i10 = $11 + 57;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    int i12 = $10 + 123;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c * b2);
                        cArr4[hVar.f19926b] = (char) (hVar.f19925a >> b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    }
                    int i13 = $10 + 1;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 3;
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(826 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -611683395, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c2 = 11;
                            objA4 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 217, (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, 212688716, false, $$c(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        } else {
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22487i + 41;
        f22488j = i4 % 128;
        if (i4 % 2 == 0) {
            return b(str, str2, i2, str3);
        }
        b(str, str2, i2, str3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.cl.c
    public final List<e> d(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        int i3;
        String strA;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = f22488j + 117;
        f22487i = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        Object[] objArr = new Object[1];
        k("寛韑ꭉ\ud9bf", 3 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        l(View.resolveSizeAndState(0, 0, 0) + 3, "\f\u0011㗯", (byte) (Color.rgb(0, 0, 0) + 16777241), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        try {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                k("阬芻ೊꐊᒘ澯Ìꨂ崂暀\ue676鏮皅\uf18dꎮ펮\uef58퓕☒虊鑲Ұ\ue3e6\uf328", 23 - Drawable.resolveOpacity(0, 0), objArr3);
                String strIntern3 = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                k("鷽蠓\uf169侵\ue676鏮皅\uf18dꎮ펮䞘竍쬰䳯鄡覹ꌱ⑳", 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
                StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(aVar.a());
                Object[] objArr5 = new Object[1];
                l(Process.getGidForName("") + 3, "㖯㖯", (byte) (30 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr5);
                o.ea.f.c(strIntern3, sbAppend.append(((String) objArr5[0]).intern()).toString());
            }
            ArrayList arrayList = new ArrayList();
            Object[] objArr6 = new Object[1];
            l(TextUtils.lastIndexOf("", '0') + 13, "\f\u001d\u001e\f\u0007\u0019\u0015\u001b\u0002\r\u0000#", (byte) (30 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr6);
            Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i9 = a.f23780n * (-1229108307);
            a.f23780n = i9;
            o.ef.c cVar = (o.ef.c) a.a(-1398121910, objArr7, iMyUid, i9, 1398121917, iUptimeMillis, iElapsedRealtime);
            Object[] objArr8 = new Object[1];
            k("쇸Ꮛ崂暀耂ৢ숆赅悇뱡", View.MeasureSpec.getMode(0) + 9, objArr8);
            Object[] objArr9 = {aVar, ((String) objArr8[0]).intern()};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int iMyUid2 = Process.myUid();
            int i10 = a.f23780n * (-1229108307);
            a.f23780n = i10;
            o.ef.c cVar2 = (o.ef.c) a.a(-1398121910, objArr9, iMyUid2, i10, 1398121917, iUptimeMillis2, iElapsedRealtime2);
            int i11 = f22487i + 29;
            f22488j = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i14 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i14;
                int i15 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i15;
                Object obj = null;
                if (i13 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i15, i14, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    Object[] objArr10 = new Object[1];
                    k("ꆫ政\ue362♢냡먨悇뱡", 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
                    Object[] objArr11 = {aVar, ((String) objArr10[0]).intern()};
                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                    int iMyUid3 = Process.myUid();
                    int i16 = a.f23780n * (-1229108307);
                    a.f23780n = i16;
                    List<o.cl.b> listA = a((o.ef.c) a.a(-1398121910, objArr11, iMyUid3, i16, 1398121917, iUptimeMillis3, iElapsedRealtime3));
                    Object[] objArr12 = new Object[1];
                    k("䅿ဵ\udafbᦩ杏ǂ쮪駤础Ⳣ粙足", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr12);
                    a aVarX = aVar.x(((String) objArr12[0]).intern());
                    Object[] objArr13 = new Object[1];
                    l(22 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0000\u001f\u001f\"\u001c\u0017\u001b\u000e㘭㘭\u0007\u0000\u0015\r\u0013\u0003\u0011\u0002\u0019 \u0015\u001b㘾", (byte) (67 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr13);
                    aVarX.D(((String) objArr13[0]).intern());
                    Object[] objArr14 = new Object[1];
                    k("희춾\udd5c셩ꂍﰱ⩱齚㽡脰", TextUtils.getOffsetAfter("", 0) + 10, objArr14);
                    Object[] objArr15 = {aVarX, ((String) objArr14[0]).intern()};
                    int i17 = a.f23778l * 493926616;
                    a.f23778l = i17;
                    int i18 = a.f23779m * 1131312688;
                    a.f23779m = i18;
                    Object[] objArr16 = new Object[1];
                    k("희춾\udd5c셩䞷贼\ud893倥籏\ud88e", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, objArr16);
                    aVarX.D(((String) objArr16[0]).intern());
                    Object[] objArr17 = new Object[1];
                    k("ϲ븾嗧斫\uf2e5뢘鷽蠓죫蘴뛴轕\ue362♢鑲Ұ", 16 - Color.green(0), objArr17);
                    aVarX.D(((String) objArr17[0]).intern());
                    Object[] objArr18 = new Object[1];
                    k("貆헏笻\ue244㓌䞞쨓袿崂暀籏\ud88e", 11 - (KeyEvent.getMaxKeyCode() >> 16), objArr18);
                    aVarX.D(((String) objArr18[0]).intern());
                    Object[] objArr19 = new Object[1];
                    l((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, "!\u0010\u0014\r", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 80), objArr19);
                    aVarX.D(((String) objArr19[0]).intern());
                    Object[] objArr20 = new Object[1];
                    k("꿏ﶇ忔龍螕᭾莸齸Ὴꔀ꜔\udf77䞷贼壝\u0ab4㵣쐩", TextUtils.getOffsetBefore("", 0) + 18, objArr20);
                    aVarX.D(((String) objArr20[0]).intern());
                    Object[] objArr21 = new Object[1];
                    k("崂暀\ue362♢ꚠᙵ姊쫫鷽蠓崂暀݊듨拫䇣݊듨歈ℿꚪ룽已ự", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, objArr21);
                    aVarX.A(((String) objArr21[0]).intern());
                    Object[] objArr22 = new Object[1];
                    k("꿏ﶇ忔龍螕᭾崂暀籄냌\ueccd봾濝൱壝\u0ab4拫䇣\ue3e6\uf328", TextUtils.getCapsMode("", 0, 0) + 19, objArr22);
                    aVarX.A(((String) objArr22[0]).intern());
                    Object[] objArr23 = new Object[1];
                    l(26 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0016\u0017\u0011\u0003!\f\u0014\u0016\u0002\r\u0002\u001d#\u0018㙙㙙\u0002\r\u0002\u001d\u0013\u0003#\u001c㙘", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), objArr23);
                    aVarX.A(((String) objArr23[0]).intern());
                    Object[] objArr24 = new Object[1];
                    k("ϲ븾嗧斫偺떥鍝ﱧꚪ룽⾃狱", 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr24);
                    aVarX.D(((String) objArr24[0]).intern());
                    Object[] objArr25 = new Object[1];
                    l(23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "!\u0010\u0019\u0014\u0004\u001e\u0019\u0014\"#\u001e\t\u0015\u001b\u0002\u0001\u0018\u001b\u0007\u0000\u001f\u0004㘑", (byte) (34 - ExpandableListView.getPackedPositionChild(0L)), objArr25);
                    aVarX.D(((String) objArr25[0]).intern());
                    Object[] objArr26 = new Object[1];
                    l((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, "!\u0010\u0019\u0014\u0004\u001e\u001b\u0014\u0015\u0010\u0000#\r\u0015\u0013\u0003\u0011\u0002\u0018\b\u0004\u001f\u0003\u0013", (byte) (40 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr26);
                    aVarX.D(((String) objArr26[0]).intern());
                    Object[] objArr27 = new Object[1];
                    l(25 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0015\u001f㘉㘉#\u000b\u0012\r\u0019\u0014\u0011\u0002\u0005\u0018\u0012\"\u0002\r\u0002\u001d\u001b\u0015\u0000\t㘠", (byte) (33 - View.resolveSize(0, 0)), objArr27);
                    aVarX.D(((String) objArr27[0]).intern());
                    Object[] objArr28 = new Object[1];
                    l(View.MeasureSpec.getSize(0) + 8, "\u001c\u0012\u0010\u0002\u0000\u0007\u0018#", (byte) (125 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr28);
                    a aVarX2 = aVarX.x(((String) objArr28[0]).intern());
                    Object[] objArr29 = new Object[1];
                    l(View.MeasureSpec.getSize(0) + 4, "\"\u0016\u0019\t", (byte) (80 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr29);
                    a aVarV = aVarX2.v(((String) objArr29[0]).intern());
                    if (aVarV != null) {
                        int i19 = f22487i + 91;
                        f22488j = i19 % 128;
                        int i20 = i19 % 2;
                        aVarV.D(strIntern);
                        aVarV.D(strIntern2);
                        int i21 = f22488j + 29;
                        f22487i = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    Object[] objArr30 = new Object[1];
                    k("\u1ae2ꆬ\uf1b2缮", TextUtils.getTrimmedLength("") + 4, objArr30);
                    a aVarV2 = aVarX2.v(((String) objArr30[0]).intern());
                    if (aVarV2 != null) {
                        aVarV2.D(strIntern);
                        aVarV2.D(strIntern2);
                    }
                    Object[] objArr31 = new Object[1];
                    k("\u1ae2ꆬ쏴ᗃ", 4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr31);
                    a aVarV3 = aVarX2.v(((String) objArr31[0]).intern());
                    if (aVarV3 != null) {
                        aVarV3.D(strIntern);
                        aVarV3.D(strIntern2);
                    }
                    Object[] objArr32 = new Object[1];
                    k("\u1ae2ꆬ\uf69e励", ((byte) KeyEvent.getModifierMetaStateMask()) + 5, objArr32);
                    a aVarV4 = aVarX2.v(((String) objArr32[0]).intern());
                    if (aVarV4 != null) {
                        int i23 = f22487i + 107;
                        f22488j = i23 % 128;
                        if (i23 % 2 != 0) {
                            aVarV4.D(strIntern);
                            aVarV4.D(strIntern2);
                            throw null;
                        }
                        aVarV4.D(strIntern);
                        aVarV4.D(strIntern2);
                    }
                    Object[] objArr33 = new Object[1];
                    l(4 - Color.alpha(0), "\"\u0016\r\u001f", (byte) (61 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr33);
                    a aVarV5 = aVarX2.v(((String) objArr33[0]).intern());
                    if (aVarV5 != null) {
                        int i24 = f22488j + 115;
                        f22487i = i24 % 128;
                        int i25 = i24 % 2;
                        aVarV5.D(strIntern);
                        aVarV5.D(strIntern2);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).a(listA);
                    }
                    return arrayList;
                }
                int i26 = f22487i + 101;
                f22488j = i26 % 128;
                if (i26 % i4 != 0) {
                    cVar.d(i13);
                    d.e(cVar2.e(i13));
                    obj.hashCode();
                    throw null;
                }
                a aVarD = cVar.d(i13);
                byte[] bArrE = d.e(cVar2.e(i13));
                if (i13 == 0) {
                    int i27 = f22487i;
                    int i28 = i27 + 57;
                    f22488j = i28 % 128;
                    int i29 = i28 % i4;
                    int i30 = i27 + 91;
                    f22488j = i30 % 128;
                    int i31 = i30 % i4;
                    i3 = 1;
                } else {
                    i3 = i8;
                }
                if (i3 != 0) {
                    strA = str;
                } else {
                    strA = e.a(str, i13);
                }
                e eVarB = b(aVarD, strA, str2, i2, str3);
                Object[] objArr34 = {eVarB, o.dl.b.c(bArrE)};
                int i32 = (int) Runtime.getRuntime().totalMemory();
                int id = (int) Thread.currentThread().getId();
                int i33 = o.et.c.f25341f * 1595628892;
                o.et.c.f25341f = i33;
                o.et.c.d(-1863692548, objArr34, i32, 1863692548, id, i33, Process.myUid());
                eVarB.d(i3 ^ 1);
                arrayList.add(eVarB);
                i13++;
                i4 = 2;
                i8 = 0;
            }
        } catch (o.ef.b e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr35 = new Object[1];
            k("貿\u20f9쿺똄༩磅\ueccd봾蘅㫳形辷\ue362♢Ζ\udc46빴\ue658鷽蠓⤨♾䨸伖ꎮ펮䞘竍鷽蠓\uf169侵䶅ꮀ甒ۥ阬芻ೊꐊᒘ澯፬⤜镝\uf295䞘竍듞턯숪똟쮪駤희춾\ueccd봾蘅㫳쬰䳯", 62 - TextUtils.getTrimmedLength(""), objArr35);
            throw new f(sb2.append(((String) objArr35[0]).intern()).append(e2.getMessage()).toString());
        }
    }
}
