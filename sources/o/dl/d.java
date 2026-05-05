package o.dl;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import o.a.g;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f23183a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23184b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23185c = 0;

    /* JADX INFO: renamed from: d */
    private static char f23186d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23187e = 0;

    /* JADX INFO: renamed from: f */
    private static int f23188f = 0;

    /* JADX INFO: renamed from: g */
    private static int f23189g = 0;

    /* JADX INFO: renamed from: h */
    private static int f23190h = 0;

    /* JADX INFO: renamed from: i */
    private static char f23191i = 0;

    /* JADX INFO: renamed from: j */
    private static char f23192j = 0;

    /* JADX INFO: renamed from: m */
    private static int f23193m = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, short r11) {
        /*
            int r0 = r10 * 2
            int r7 = 1 - r0
            byte[] r8 = o.dl.d.$$a
            int r0 = r11 * 3
            int r6 = 72 - r0
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2f
            r1 = r5
            r0 = r7
            r2 = r3
        L16:
            int r0 = -r0
            int r5 = r5 + r0
            int r0 = r1 + 1
            r1 = r2
            r6 = r5
            r5 = r0
        L1d:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r7) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L2a:
            r0 = r8[r5]
            r1 = r5
            r5 = r6
            goto L16
        L2f:
            r1 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.d.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23187e = 223911009;
        f23185c = -1922575400;
        f23184b = -653015668;
        f23188f = 0;
        f23193m = 1;
        f23189g = 0;
        f23190h = 1;
        b();
        TextUtils.getCapsMode("", 0, 0);
        int i2 = f23188f + 89;
        f23193m = i2 % 128;
        int i3 = i2 % 2;
    }

    public static int a(List<int[]> list, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = f23189g + 69;
        f23190h = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (Arrays.equals(list.get(i5), iArr)) {
                int i6 = f23190h + 33;
                f23189g = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }
        }
        int i7 = f23190h + 41;
        f23189g = i7 % 128;
        if (i7 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        byte[] bArr = (byte[]) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            Object[] objArr2 = new Object[1];
            k("ꍺ䨁蛺뫁", Gravity.getAbsoluteGravity(0, 0) + 4, objArr2);
            sb.append(String.format(((String) objArr2[0]).intern(), Byte.valueOf(bArr[i3])));
            i3++;
            if (i3 < length) {
                int i4 = f23190h + 105;
                f23189g = i4 % 128;
                int i5 = i4 % 2;
                sb.append(str);
            }
        }
        String string = sb.toString();
        int i6 = f23189g + 5;
        f23190h = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static String b(int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i3, i2 - 1, 1);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.getTime();
        Object[] objArr = new Object[1];
        k("㷊互㢠슛\udb5e䣠", 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        String str = new SimpleDateFormat(((String) objArr[0]).intern(), Locale.ENGLISH).format(calendar.getTime());
        int i5 = f23190h + 15;
        f23189g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static BigDecimal b(byte[] bArr) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = f23190h + 87;
        f23189g = i3 % 128;
        int i4 = i3 % 2;
        String strE = e(bArr);
        if ("".equals(strE)) {
            throw new NumberFormatException();
        }
        BigDecimal bigDecimal = new BigDecimal(strE);
        int i5 = f23189g + 71;
        f23190h = i5 % 128;
        if (i5 % 2 != 0) {
            return bigDecimal;
        }
        throw null;
    }

    static void b() {
        f23183a = (char) 44844;
        f23186d = (char) 3719;
        f23191i = (char) 2725;
        f23192j = (char) 4453;
    }

    public static byte c(String str) {
        int i2 = f23185c * 447039506;
        f23185c = i2;
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i3 = f23187e * 1037703823;
        f23187e = i3;
        return ((Byte) c(708803393, iMyUid, i3, priority, i2, -708803392, new Object[]{str})).byteValue();
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~((-1) - (((-1) - (~i6)) & ((-1) - i8)));
        int i10 = i7 | i9 | (~(i2 | i6));
        int i11 = (~(i8 | i6)) | (~((-1) - (((-1) - i8) & ((-1) - i7))));
        int i12 = ~(i6 | i7);
        int i13 = (i12 + i11) - (i12 & i11);
        int i14 = i7 + i2 + i5 + (1351532378 * i3) + (1237199896 * i4);
        int i15 = i14 * i14;
        int i16 = ((-211156802) * i7) + 1314914304 + ((-491389116) * i2) + (2007367491 * i10) + (i13 * (-2007367491)) + ((-2007367491) * i9) + (1796210688 * i5) + ((-1818230784) * i3) + ((-914358272) * i4) + ((-2051670016) * i15);
        int i17 = ((i7 * 406040238) - 634933780) + (i2 * 406038884) + (i10 * (-677)) + (i13 * 677) + (i9 * 677) + (i5 * 406039561) + (i3 * 1283666474) + (i4 * 1712827608) + (i15 * (-77201408));
        return i16 + ((i17 * i17) * 1831469056) != 1 ? a(objArr) : e(objArr);
    }

    private static String c(byte[] bArr, String str) {
        int iMyUid = Process.myUid();
        int i2 = f23184b * 1919545774;
        f23184b = i2;
        return (String) c(255099915, Process.myPid(), (int) SystemClock.elapsedRealtime(), i2, iMyUid, -255099915, new Object[]{bArr, str});
    }

    public static String d(String str) {
        int i2 = 2 % 2;
        int i3 = f23189g + 81;
        int i4 = i3 % 128;
        f23190h = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            return m.e(str);
        }
        int i5 = i4 + 5;
        f23189g = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static int e(char c2) {
        int i2 = 2 % 2;
        int i3 = f23190h;
        int i4 = i3 + 95;
        f23189g = i4 % 128;
        int i5 = i4 % 2;
        if ('0' <= c2) {
            int i6 = i3 + 55;
            f23189g = i6 % 128;
            if (i6 % 2 == 0 ? c2 <= '9' : c2 <= '8') {
                return c2 - '0';
            }
        }
        if ('A' <= c2 && c2 <= 'F') {
            return c2 - '7';
        }
        if ('a' <= c2 && c2 <= 'f') {
            return c2 - 'W';
        }
        int i7 = f23189g + 37;
        f23190h = i7 % 128;
        int i8 = i7 % 2;
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r3 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        return java.lang.Byte.valueOf((byte) ((r4 << 4) + r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r3 != (-1)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r8) throws java.lang.Throwable {
        /*
            r6 = 0
            r5 = r8[r6]
            java.lang.String r5 = (java.lang.String) r5
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.dl.d.f23189g
            int r1 = r0 + 53
            int r0 = r1 % 128
            o.dl.d.f23190h = r0
            int r1 = r1 % r8
            int r0 = r5.length()
            r7 = 1
            if (r0 != r8) goto L75
            char r0 = r5.charAt(r6)
            int r4 = e(r0)
            char r0 = r5.charAt(r7)
            int r3 = e(r0)
            r2 = -1
            if (r4 == r2) goto L47
            int r0 = o.dl.d.f23189g
            int r1 = r0 + 81
            int r0 = r1 % 128
            o.dl.d.f23190h = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L44
            r0 = 29
            int r0 = r0 / r6
            if (r3 == r2) goto L47
        L3b:
            int r0 = r4 << 4
            int r0 = r0 + r3
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L44:
            if (r3 == r2) goto L47
            goto L3b
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r0 = r0 >> 16
            int r2 = r0 + 38
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "栝卙펁陂ﹲ卩氞吖㹁贯甝᳆棪\ue4c0缥츙ᭂ\ue8ea\ud83aᑾ淉舘右돗⏕軒廳켕둚씡ﭘ\udd04ᣮ兿畳\uf73f\uf6ff￫"
            k(r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 >> 8
            int r2 = r0 + 39
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "栝卙펁陂ﹲ卩氞吖㹁贯⌁䇤\ud83aᑾש㭔ꦇ뺩⭡\ue010涶ꌔԜ柩\uea80쥵妗蝽䝌鯎\udc90혻鿑⽧⭦ⶁ\uec04힉\u181f帺"
            k(r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.d.e(java.lang.Object[]):java.lang.Object");
    }

    public static String e(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f23190h + 33;
        f23189g = i3 % 128;
        if (i3 % 2 == 0) {
            int iMyUid = Process.myUid();
            int i4 = f23184b * 1919545774;
            f23184b = i4;
            return (String) c(255099915, Process.myPid(), (int) SystemClock.elapsedRealtime(), i4, iMyUid, -255099915, new Object[]{bArr, ""});
        }
        int iMyUid2 = Process.myUid();
        int i5 = f23184b * 1919545774;
        f23184b = i5;
        throw null;
    }

    public static byte[] e(String str) throws Throwable {
        int i2 = 2 % 2;
        if (str != null && str.length() != 0) {
            int i3 = f23190h + 29;
            f23189g = i3 % 128;
            int i4 = i3 % 2;
            if (str.length() % 2 == 0) {
                int length = str.length();
                byte[] bArr = new byte[length / 2];
                int i5 = f23189g + 29;
                f23190h = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 < length; i7 += 2) {
                    int i8 = f23189g + 1;
                    f23190h = i8 % 128;
                    int i9 = i8 % 2;
                    int iE = e(str.charAt(i7));
                    int iE2 = e(str.charAt(i7 + 1));
                    if (iE == -1 || iE2 == -1) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        k("栝卙펁陂ﹲ卩氞吖㹁贯甝᳆棪\ue4c0缥츙ᭂ\ue8ea\ud83aᑾ淉舘右돗⏕軒廳켕둚씡ﭘ\udd04ᣮ兿畳\uf73f\uf6ff￫", KeyEvent.keyCodeFromString("") + 38, objArr);
                        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
                    }
                    bArr[i7 / 2] = (byte) ((iE << 4) + iE2);
                }
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        k("栝卙펁陂ﹲ卩氞吖㹁贯⌁䇤\ud83aᑾש㭔ꦇ뺩⭡\ue010涶ꌔԜ柩\uea80쥵妗蝽䝌鯎\udc90혻鿑⽧⭦ⶁ\uec04힉\u181f帺", 38 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        throw new IllegalArgumentException(sb2.append(((String) objArr2[0]).intern()).append(str).toString());
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23190h + 3;
        f23189g = i3 % 128;
        int i4 = i3 % 2;
        int length = bArr.length;
        int i5 = 0;
        if (bArr2.length != length) {
            Object[] objArr = new Object[1];
            k("\uaa3e䅤ഉ㪸㹁贯\ue591᭚䨗ꊃ␢锲즩♼ﭘ\udd04⡍굁꺩駲係䂴聓趀怺稰熩㖇┏\ue45cԜ柩\uec40欧ꦇ뺩齶奔讆䖑ﲶ⽑", ExpandableListView.getPackedPositionChild(0L) + 42, objArr);
            throw new RuntimeException(((String) objArr[0]).intern());
        }
        byte[] bArr3 = new byte[length];
        while (i5 < length) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
            i5++;
            int i6 = f23189g + 9;
            f23190h = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 3;
            }
        }
        return bArr3;
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 48;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i5] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                int i8 = $11 + 31;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f23191i) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23192j)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 269, (char) Color.red(0), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1995022631, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f23183a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23186d)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - TextUtils.indexOf("", "", 0, 0), (char) ExpandableListView.getPackedPositionType(0L), 11 - View.resolveSize(0, 0), -1995022631, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    i5 = 0;
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
                objA3 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 270, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), Color.alpha(0) + 11, -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i10 = $11 + 69;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str3;
    }
}
