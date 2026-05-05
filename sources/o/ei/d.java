package o.ei;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.a.g;
import o.ea.f;
import o.ea.m;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23912a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23913b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23914c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23915d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23916e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23917f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23918g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f23919m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f23920o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static char f23921p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f23922q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static short[] f23923r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static char f23924s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static byte[] f23925t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char f23926u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f23927v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f23928w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f23929x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static char f23930y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f23931z = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23933i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23934j = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23932h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f23935k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f23936l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23937n = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, int r11) {
        /*
            int r1 = 104 - r11
            byte[] r8 = o.ei.d.$$a
            int r0 = r9 * 4
            int r7 = 1 - r0
            int r0 = r10 * 4
            int r2 = 3 - r0
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2a
            r4 = r7
            r0 = r2
            r3 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L17:
            byte r0 = (byte) r1
            r6[r3] = r0
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            int r0 = r2 + 1
            r2 = r8[r0]
            r4 = r1
            goto L14
        L2a:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.d.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23917f = 1483261349;
        f23918g = 103890007;
        f23916e = -1934173726;
        f23914c = -1375300793;
        f23915d = 753781391;
        f23912a = -1646464231;
        f23913b = 1082473472;
        f23929x = 0;
        f23931z = 1;
        f23927v = 0;
        f23928w = 1;
        a();
        PointF.length(0.0f, 0.0f);
        int i2 = f23929x + 115;
        f23931z = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    d() {
    }

    private static void A(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 91;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i7] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = i7;
            while (i9 < 16) {
                int i10 = $10 + 99;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i7];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f23930y) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f23926u);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i7] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iMakeMeasureSpec = 270 - View.MeasureSpec.makeMeasureSpec(i7, i7);
                        char cResolveSize = (char) View.resolveSize(i7, i7);
                        int pressedStateDuration = 11 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, (byte) (35 | b3));
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iMakeMeasureSpec, cResolveSize, pressedStateDuration, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f23924s) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23921p)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(269 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.green(0) + 11, -1995022631, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 35)))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i14 = $10 + 69;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i3 = 2;
                    i7 = 0;
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
                int gidForName = 269 - Process.getGidForName("");
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 11;
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$c2 = $$c(b6, b7, (byte) (32 | b7));
                i3 = 2;
                objA3 = o.d.d.a(gidForName, cRgb, iKeyCodeFromString, -2074123590, false, str$$c2, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.d.B(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public static ArrayList<d> a(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f23928w + 9;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<d> arrayListD = d(bArr, 0, Integer.MAX_VALUE);
        int i5 = f23927v + 37;
        f23928w = i5 % 128;
        int i6 = i5 % 2;
        return arrayListD;
    }

    public static d a(String str, List<d> list) {
        int i2 = 2 % 2;
        Iterator<d> it = list.iterator();
        while (!(!it.hasNext())) {
            int i3 = f23928w + 11;
            f23927v = i3 % 128;
            int i4 = i3 % 2;
            d next = it.next();
            if (!(!next.d().equals(str))) {
                int i5 = f23927v + 113;
                f23928w = i5 % 128;
                int i6 = i5 % 2;
                return next;
            }
        }
        return null;
    }

    static void a() {
        f23920o = -1466214589;
        f23919m = 1150422440;
        f23922q = -1389498069;
        f23925t = new byte[]{-109, -127, -101, -84, -102, -103, MessagePack.Code.BIN16, 107, -81, -74, -86, -70, MessagePack.Code.FLOAT32, -126, 125, 122, 107, 120, 113, 126, 81, -87, 106, 122, -105, 105, 115, 101, 127, 57, 127, 107, 112, 107, -105, 77, 118, -124, 94, 115, 121, 37, 34, 19, 32, 57, 38, 57, 49, Ascii.DC2, 34, 95, 17, 59, 45, 39, -31, 39, 19, 88, -11, 60, 45, 38, 58, 49, Ascii.SUB, Ascii.DC2, Utf8.REPLACEMENT_BYTE, 19, 36, 53, -115, -115, -115, -115, -115};
        f23924s = (char) 43779;
        f23921p = (char) 18913;
        f23930y = (char) 63329;
        f23926u = (char) 11021;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object b(int r15, int r16, java.lang.Object[] r17, int r18, int r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.d.b(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23927v + 39;
        f23928w = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = dVar.f23936l;
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        return bArr;
    }

    public static LinkedHashMap<String, Integer> b(byte[] bArr) throws IOException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = f23927v + 121;
        f23928w = i5 % 128;
        int i6 = i5 % 2;
        if (bArr.length == 0) {
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            int i7 = f23928w + 85;
            f23927v = i7 % 128;
            int i8 = i7 % 2;
            return linkedHashMap;
        }
        LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>();
        int i9 = 0;
        while (i9 < bArr.length) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr[i9]);
            int i10 = i9 + 1;
            byte b2 = bArr[i9];
            int i11 = b2 & 255;
            if ((b2 + Ascii.US) - (b2 | Ascii.US) == 31 && i10 < bArr.length) {
                while (true) {
                    byteArrayOutputStream.write(bArr[i10]);
                    i3 = i10 + 1;
                    i11 = (-1) - (((-1) - (i11 << 8)) & ((-1) - (bArr[i10] & 255)));
                    if ((128 & i11) != 128 || i3 >= bArr.length) {
                        break;
                    }
                    i10 = i3;
                }
                i10 = i3;
            }
            if (i10 < bArr.length) {
                int i12 = f23928w + 31;
                f23927v = i12 % 128;
                int i13 = i12 % 2;
                i9 = i10 + 1;
                i2 = (-1) - (((-1) - bArr[i10]) | ((-1) - 255));
            } else {
                i9 = i10;
                i2 = 0;
            }
            linkedHashMap2.put(o.dl.d.e(byteArrayOutputStream.toByteArray()), Integer.valueOf(i2));
        }
        return linkedHashMap2;
    }

    public static byte[] b(LinkedHashMap<String, Integer> linkedHashMap) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i3 = f23927v + 113;
        f23928w = i3 % 128;
        int i4 = i3 % 2;
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            int i5 = f23927v + 71;
            f23928w = i5 % 128;
            int i6 = i5 % 2;
            sb.append(entry.getKey());
            Object[] objArr = new Object[1];
            A("臇ଐ\ude70⒏", 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            sb.append(String.format(((String) objArr[0]).intern(), Byte.valueOf(entry.getValue().byteValue())));
        }
        byte[] bArrE = o.dl.d.e(sb.toString());
        int i7 = f23927v + 87;
        f23928w = i7 % 128;
        if (i7 % 2 != 0) {
            return bArrE;
        }
        throw null;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i3 = f23927v + 45;
            f23928w = i3 % 128;
            if (i3 % 2 != 0) {
                return byteArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IOException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                A("읃\ue523鑳좩胾ᓥ㲧\ue4ba⽮ᱛ", Color.rgb(0, 0, 0) + 16777226, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                B((short) (87 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 334931291 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 373294011 + TextUtils.getTrimmedLength(""), (-5) - Gravity.getAbsoluteGravity(0, 0), (byte) Color.alpha(0), objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                int i4 = f23928w + 113;
                f23927v = i4 % 128;
                int i5 = i4 % 2;
            }
            return new byte[0];
        }
    }

    private static String c(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        B((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 4), 334931263 - (Process.myPid() >> 22), 373293951 - View.resolveSizeAndState(0, 0, 0), (-35) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-1) - MotionEvent.axisFromString("")), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(bArr.length << 1);
        Object[] objArr2 = new Object[1];
        A("\udcf5羬", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        String str = String.format(sbAppend.append(((String) objArr2[0]).intern()).toString(), bigInteger);
        int i3 = f23928w + 63;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static byte[] c(String str, byte b2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23928w + 97;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrE = e(o.dl.d.e(str), b2);
        int i5 = f23928w + 7;
        f23927v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return bArrE;
    }

    public static byte[] c(String str, byte[]... bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23927v + 65;
        f23928w = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrE = o.dl.d.e(str);
        if (i4 == 0) {
            e(bArrE, bArr);
            throw null;
        }
        byte[] bArrE2 = e(bArrE, bArr);
        int i5 = f23928w + 1;
        f23927v = i5 % 128;
        int i6 = i5 % 2;
        return bArrE2;
    }

    private static ArrayList<d> d(byte[] bArr) {
        Object[] objArr = {bArr};
        int i2 = f23917f * 447778918;
        f23917f = i2;
        return (ArrayList) b(Thread.activeCount(), 781093111, objArr, i2, -781093109, new Random().nextInt(2114074699), Thread.currentThread().getPriority());
    }

    private static ArrayList<d> d(byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        ArrayList<d> arrayList = new ArrayList<>();
        int i5 = f23917f * 447778918;
        f23917f = i5;
        ArrayList arrayList2 = (ArrayList) b(Thread.activeCount(), 781093111, new Object[]{bArr}, i5, -781093109, new Random().nextInt(2114074699), Thread.currentThread().getPriority());
        if (arrayList2 == null) {
            int i6 = f23927v + 65;
            f23928w = i6 % 128;
            int i7 = i6 % 2;
            return arrayList;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            ((d) arrayList2.get(i8)).f23937n = i2;
            if (((d) arrayList2.get(i8)).f23936l != null) {
                int i9 = f23928w + 87;
                f23927v = i9 % 128;
                int i10 = i9 % 2;
                if (((d) arrayList2.get(i8)).f23932h) {
                    int i11 = f23927v + 9;
                    f23928w = i11 % 128;
                    int i12 = i11 % 2;
                    arrayList.add((d) arrayList2.get(i8));
                    i3--;
                    if (i3 > 0) {
                        Object[] objArr = {(d) arrayList2.get(i8)};
                        int i13 = f23913b * (-1487198784);
                        f23913b = i13;
                        int iMyTid = Process.myTid();
                        int i14 = f23912a * (-767436786);
                        f23912a = i14;
                        int i15 = 1088204935 * f23915d;
                        f23915d = i15;
                        arrayList.addAll(d((byte[]) b(i15, -898244639, objArr, i13, 898244639, iMyTid, i14), i2 + 1, i3));
                    }
                } else {
                    arrayList.add((d) arrayList2.get(i8));
                }
            } else {
                arrayList.add((d) arrayList2.get(i8));
            }
        }
        int i16 = f23927v + 71;
        f23928w = i16 % 128;
        int i17 = i16 % 2;
        return arrayList;
    }

    public static byte[] d(byte[] bArr, String... strArr) {
        int i2 = 2 % 2;
        int i3 = f23928w + 99;
        f23927v = i3 % 128;
        if (i3 % 2 != 0) {
            a(bArr).iterator();
            throw null;
        }
        for (d dVar : a(bArr)) {
            if (!(!m.c.a(dVar.d(), strArr))) {
                int i4 = f23928w + 21;
                f23927v = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = {dVar};
                    int i5 = f23913b * (-1487198784);
                    f23913b = i5;
                    int iMyTid = Process.myTid();
                    int i6 = f23912a * (-767436786);
                    f23912a = i6;
                    int i7 = f23915d * 1088204935;
                    f23915d = i7;
                    return (byte[]) b(i7, -898244639, objArr, i5, 898244639, iMyTid, i6);
                }
                Object[] objArr2 = {dVar};
                int i8 = f23913b * (-1487198784);
                f23913b = i8;
                int iMyTid2 = Process.myTid();
                int i9 = f23912a * (-767436786);
                f23912a = i9;
                int i10 = f23915d * 1088204935;
                f23915d = i10;
                int i11 = 3 / 0;
                return (byte[]) b(i10, -898244639, objArr2, i8, 898244639, iMyTid2, i9);
            }
            int i12 = f23927v + 35;
            f23928w = i12 % 128;
            int i13 = i12 % 2;
        }
        return null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23928w + 93;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = dVar.f23935k;
        if (i4 == 0) {
            return bArr;
        }
        throw null;
    }

    public static ArrayList<d> e(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = f23928w + 51;
        f23927v = i4 % 128;
        int i5 = i4 % 2;
        ArrayList<d> arrayListD = d(bArr, 0, i2);
        int i6 = f23927v + 35;
        f23928w = i6 % 128;
        int i7 = i6 % 2;
        return arrayListD;
    }

    private static byte[] e(byte[] bArr, byte b2) throws Throwable {
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(b2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i3 = f23927v + 23;
            f23928w = i3 % 128;
            if (i3 % 2 != 0) {
                return byteArray;
            }
            throw null;
        } catch (IOException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                A("읃\ue523鑳좩胾ᓥ㲧\ue4ba⽮ᱛ", 10 - View.resolveSizeAndState(0, 0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                B((short) (Color.red(0) + 15), 334931264 - (ViewConfiguration.getTouchSlop() >> 8), 373294012 - KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") - 9, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
            }
            byte[] bArr2 = new byte[0];
            int i4 = f23928w + 17;
            f23927v = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
    }

    public static byte[] e(byte[] bArr, byte[]... bArr2) throws Throwable {
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        if (bArr2 != null) {
            try {
                int length = bArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = f23927v + 11;
                    f23928w = i4 % 128;
                    if (i4 % 2 == 0) {
                        byte[] bArr3 = bArr2[i3];
                        throw null;
                    }
                    byte[] bArr4 = bArr2[i3];
                    if (bArr4 != null) {
                        byteArrayOutputStream2.write(bArr4);
                        int i5 = f23927v + 15;
                        f23928w = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            } catch (IOException e2) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    A("읃\ue523鑳좩胾ᓥ㲧\ue4ba⽮ᱛ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    B((short) (TextUtils.lastIndexOf("", '0', 0) + 16), (Process.myPid() >> 22) + 334931264, 373294012 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 10, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                    f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                }
                return new byte[0];
            }
        }
        if (byteArrayOutputStream2.size() > 0) {
            int i7 = f23928w + 57;
            f23927v = i7 % 128;
            int i8 = i7 % 2;
            byteArrayOutputStream.write(bArr);
            if (byteArrayOutputStream2.size() > 127) {
                int i9 = f23927v + 107;
                f23928w = i9 % 128;
                int i10 = i9 % 2;
                byteArrayOutputStream.write(-127);
            }
            byteArrayOutputStream.write((byte) byteArrayOutputStream2.size());
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i11 = f23928w + 117;
        f23927v = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 25 / 0;
        }
        return byteArray;
    }

    static void init$0() {
        $$a = new byte[]{60, -92, 19, MessagePack.Code.MAP16};
        $$b = 131;
    }

    public final byte[] b() {
        int i2 = f23913b * (-1487198784);
        f23913b = i2;
        int iMyTid = Process.myTid();
        int i3 = f23912a * (-767436786);
        f23912a = i3;
        int i4 = f23915d * 1088204935;
        f23915d = i4;
        return (byte[]) b(i4, -898244639, new Object[]{this}, i2, 898244639, iMyTid, i3);
    }

    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23928w + 49;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.f23936l;
        if (bArr == null) {
            Object[] objArr = new Object[1];
            A("\uf31d눘»蠌", (-16777212) - Color.rgb(0, 0, 0), objArr);
            return ((String) objArr[0]).intern();
        }
        String strC = c(bArr);
        int i5 = f23927v + 67;
        f23928w = i5 % 128;
        int i6 = i5 % 2;
        return strC;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f23928w + 33;
        f23927v = i3 % 128;
        int i4 = i3 % 2;
        String upperCase = Integer.toHexString(this.f23933i).toUpperCase(o.ea.g.d());
        int i5 = f23928w + 109;
        f23927v = i5 % 128;
        int i6 = i5 % 2;
        return upperCase;
    }

    public final byte[] e() {
        int i2 = f23914c * (-2027704125);
        f23914c = i2;
        int iMyPid = Process.myPid();
        int i3 = f23916e * (-546050812);
        f23916e = i3;
        int i4 = f23918g * (-973841360);
        f23918g = i4;
        return (byte[]) b(i4, 1946836075, new Object[]{this}, i2, -1946836074, iMyPid, i3);
    }
}
