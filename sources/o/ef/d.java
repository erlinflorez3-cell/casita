package o.ef;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.i;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f23809a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23810b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f23811c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23812d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23813e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23814i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            byte[] r8 = o.ef.d.$$a
            int r3 = r11 * 3
            int r1 = 1 - r3
            int r0 = r10 * 3
            int r2 = 3 - r0
            int r0 = r9 + 65
            byte[] r7 = new byte[r1]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2b
            r4 = r5
            r3 = r6
        L15:
            int r0 = -r0
            int r0 = r0 + r4
        L17:
            int r2 = r2 + 1
            byte r1 = (byte) r0
            r7[r3] = r1
            if (r3 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L24:
            int r3 = r3 + 1
            r1 = r8[r2]
            r4 = r0
            r0 = r1
            goto L15
        L2b:
            r3 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.d.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23812d = 0;
        f23814i = 1;
        f23811c = 740602047300126166L;
        f23810b = 1564493270;
        f23813e = (char) 64023;
        f23809a = new int[]{262972813, 1431840752, -1044565032, 1965337239, -2068258507, -1014054903, 981452311, 1982856479, 604332274, -1961471982, 966152943, 2049680728, -1215078542, -1013103844, 35943539, 319836913, -289915920, -437330223};
    }

    d() {
    }

    static Integer a(Object obj) {
        int i2 = 2 % 2;
        if (obj instanceof Integer) {
            int i3 = f23812d + 65;
            f23814i = i3 % 128;
            int i4 = i3 % 2;
            return (Integer) obj;
        }
        if (!(obj instanceof Number)) {
            if (obj instanceof String) {
                try {
                    return Integer.valueOf((int) Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        int i5 = f23814i + 73;
        f23812d = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        Integer.valueOf(((Number) obj).intValue());
        throw null;
    }

    static Double b(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23814i + 111;
        int i4 = i3 % 128;
        f23812d = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof Double)) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                try {
                    Double dValueOf = Double.valueOf((String) obj);
                    int i6 = f23814i + 35;
                    f23812d = i6 % 128;
                    int i7 = i6 % 2;
                    return dValueOf;
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        int i8 = i4 + 79;
        int i9 = i8 % 128;
        f23814i = i9;
        int i10 = i8 % 2;
        Double d2 = (Double) obj;
        int i11 = i9 + 13;
        f23812d = i11 % 128;
        if (i11 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    static Long c(Object obj) {
        int i2 = 2 % 2;
        if (obj instanceof Long) {
            int i3 = f23812d + 37;
            f23814i = i3 % 128;
            int i4 = i3 % 2;
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        int i5 = f23814i + 45;
        f23812d = i5 % 128;
        int i6 = i5 % 2;
        try {
            return Long.valueOf((long) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
    
        if (r15 == o.ef.a.f23770d) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        r7 = new java.lang.StringBuilder();
        r15 = new java.lang.Object[1];
        g((char) (16139 - android.view.View.getDefaultSize(0, 0)), "皔\uf7c9⋑ꊀ㨣传", "\u0000\u0000\u0000\u0000", "\uf5c5\uf73eோ⸿", android.text.TextUtils.getOffsetAfter("", 0), r15);
        r6 = r7.append(((java.lang.String) r15[0]).intern()).append(r15);
        r15 = new java.lang.Object[1];
        g((char) (35337 - android.text.TextUtils.getCapsMode("", 0, 0)), "淑䰎䪓㪽", "\u0000\u0000\u0000\u0000", "⧜厺ড䢊", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, r15);
        r8 = r6.append(((java.lang.String) r15[0]).intern()).append(r14);
        r2 = new java.lang.Object[1];
        h(new int[]{1642831721, 1417167167, -1265788572, 1141369048, 1791878604, -696617676}, android.widget.ExpandableListView.getPackedPositionType(0) + 9, r2);
        r5 = r8.append(((java.lang.String) r2[0]).intern()).append(r15.getClass().getName());
        r1 = new java.lang.Object[1];
        h(new int[]{364203193, 705461552, -1503512915, -322173237, 1357277539, 1185961611, 455222503, -145913291, 1826786766, 364055077, 131018871, -1048205371}, 24 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r1);
        r4 = new o.ef.b(r5.append(((java.lang.String) r1[0]).intern()).append(r16).toString());
        r1 = o.ef.d.f23812d + 107;
        o.ef.d.f23814i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0146, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0148, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0149, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x014d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r15 == o.ef.a.f23770d) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.ef.b c(java.lang.Object r14, java.lang.Object r15, java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.d.c(java.lang.Object, java.lang.Object, java.lang.String):o.ef.b");
    }

    static Short d(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23814i + 87;
        int i4 = i3 % 128;
        f23812d = i4;
        int i5 = i3 % 2;
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            int i6 = i4 + 39;
            f23814i = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    return Short.valueOf((String) obj);
                }
                Short.valueOf((String) obj);
                throw null;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static b d(Object obj, String str) throws Throwable {
        int i2 = 2 % 2;
        if (obj != null) {
            int i3 = f23814i + 77;
            f23812d = i3 % 128;
            int i4 = i3 % 2;
            if (obj != a.f23770d) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                g((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16139), "皔\uf7c9⋑ꊀ㨣传", "\u0000\u0000\u0000\u0000", "\uf5c5\uf73eோ⸿", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(obj);
                Object[] objArr2 = new Object[1];
                h(new int[]{1642831721, 1417167167, -1265788572, 1141369048, 1791878604, -696617676}, 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
                StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(obj.getClass().getName());
                Object[] objArr3 = new Object[1];
                h(new int[]{364203193, 705461552, -1503512915, -322173237, 1357277539, 1185961611, 455222503, -145913291, 1826786766, 364055077, 131018871, -1048205371}, 24 - TextUtils.indexOf("", ""), objArr3);
                b bVar = new b(sbAppend2.append(((String) objArr3[0]).intern()).append(str).toString());
                int i5 = f23812d + 47;
                f23814i = i5 % 128;
                int i6 = i5 % 2;
                return bVar;
            }
        }
        Object[] objArr4 = new Object[1];
        g((char) (15000 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\uf02e\ue812\u0b29ꚣ\ue955ￅ湸뗇ᩥ☩◗\ud834\uea1c䞰", "\u0000\u0000\u0000\u0000", "ۛͅ頖嘺", ViewConfiguration.getLongPressTimeout() >> 16, objArr4);
        return new b(((String) objArr4[0]).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (java.lang.Double.isNaN(r10) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (java.lang.Double.isNaN(r10) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static double e(double r10) throws o.ef.b {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ef.d.f23812d
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.ef.d.f23814i = r0
            int r1 = r1 % r2
            boolean r0 = java.lang.Double.isInfinite(r10)
            r3 = 0
            if (r0 != 0) goto L2f
            int r0 = o.ef.d.f23814i
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.ef.d.f23812d = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L28
            boolean r1 = java.lang.Double.isNaN(r10)
            r0 = 39
            int r0 = r0 / r3
            if (r1 != 0) goto L2f
        L27:
            return r10
        L28:
            boolean r0 = java.lang.Double.isNaN(r10)
            if (r0 != 0) goto L2f
            goto L27
        L2f:
            o.ef.b r1 = new o.ef.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r0 = r0 >> 16
            char r4 = (char) r0
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r8 = r0 >> 24
            r0 = 21788284(0x14c767c, float:3.755389E-38)
            int r8 = r8 + r0
            r0 = 1
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r5 = "\udcc6퐳杝쪤瞮胻\uab6dř䘜\ue0cd\u0e3dﶧ䟨饨坹\ue8f8ἡ읗転啤毣劣梋뒘\udbd8"
            java.lang.String r6 = "\u0000\u0000\u0000\u0000"
            java.lang.String r7 = "粂䱶⸁椣"
            g(r4, r5, r6, r7, r8, r9)
            r0 = r9[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.d.e(double):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (((java.lang.String) r0[0]).intern().equalsIgnoreCase(r8) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (((java.lang.String) r0[0]).intern().equalsIgnoreCase(r8) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        h(new int[]{34763086, 723541118, 407676640, -1276836506}, 5 - android.text.TextUtils.indexOf("", "", 0, 0), new java.lang.Object[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if ((!((java.lang.String) r0[0]).intern().equalsIgnoreCase(r8)) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Boolean e(java.lang.Object r8) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r1 = o.ef.d.f23812d
            int r0 = r1 + 109
            int r2 = r0 % 128
            o.ef.d.f23814i = r2
            int r0 = r0 % r3
            r7 = 0
            if (r0 == 0) goto Lae
            boolean r0 = r8 instanceof java.lang.Boolean
            if (r0 == 0) goto L24
            int r1 = r2 + 29
            int r0 = r1 % 128
            o.ef.d.f23812d = r0
            int r1 = r1 % r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            int r1 = r2 + 43
            int r0 = r1 % 128
            o.ef.d.f23812d = r0
            int r1 = r1 % r3
            return r8
        L24:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lad
            int r2 = r1 + 35
            int r0 = r2 % 128
            o.ef.d.f23814i = r0
            int r2 = r2 % r3
            r6 = 5
            r1 = -788107545(0xffffffffd1066ee7, float:-3.608664E10)
            r0 = 555674005(0x211ee995, float:5.3841626E-19)
            r5 = 0
            r4 = 1
            if (r2 != 0) goto L5e
            java.lang.String r8 = (java.lang.String) r8
            int[] r2 = new int[]{r0, r1}
            int r0 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r0 = r0 >>> 51
            int r1 = r6 >> r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            h(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 == 0) goto L7f
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L5e:
            java.lang.String r8 = (java.lang.String) r8
            int[] r2 = new int[]{r0, r1}
            int r0 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r0 = r0 >> 16
            int r1 = r0 + 4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            h(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 != 0) goto L5b
        L7f:
            r3 = 407676640(0x184ca6e0, float:2.6450632E-24)
            r2 = -1276836506(0xffffffffb3e50566, float:-1.06646254E-7)
            r1 = 34763086(0x212714e, float:1.0758903E-37)
            r0 = 723541118(0x2b205c7e, float:5.697178E-13)
            int[] r1 = new int[]{r1, r0, r3, r2}
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0, r5, r5)
            int r6 = r6 - r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            h(r1, r6, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equalsIgnoreCase(r8)
            r0 = r0 ^ r4
            if (r0 == r4) goto Lad
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lad:
            return r7
        Lae:
            boolean r0 = r8 instanceof java.lang.Boolean
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.d.e(java.lang.Object):java.lang.Boolean");
    }

    static String f(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23812d;
        int i4 = i3 + 49;
        f23814i = i4 % 128;
        int i5 = i4 % 2;
        if (!(obj instanceof String)) {
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        }
        String str = (String) obj;
        int i6 = i3 + 101;
        f23814i = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void g(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 85;
        $11 = i5 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (str6 != null) {
            int i6 = i4 + 41;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i7 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iRgb = (-16777110) - Color.rgb(i7, i7, i7);
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int absoluteGravity = Gravity.getAbsoluteGravity(i7, i7) + 11;
                    byte b2 = (byte) i7;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i7] = Object.class;
                    objA = o.d.d.a(iRgb, cLastIndexOf, absoluteGravity, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int i8 = 847 - (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1));
                    char c3 = (char) (6489 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int mode = View.MeasureSpec.getMode(i7) + 12;
                    int i9 = $$b;
                    byte b4 = (byte) ((i9 + 7) - (i9 | 7));
                    byte b5 = (byte) (b4 - 3);
                    String str$$c2 = $$c(b4, b5, b5);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i7] = Object.class;
                    objA2 = o.d.d.a(i8, c3, mode, -694521287, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i10 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i7] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int i11 = 458 - (TypedValue.complexToFloat(i7) > 0.0f ? 1 : (TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1));
                    char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1));
                    int threadPriority = ((Process.getThreadPriority(i7) + 20) >> 6) + 11;
                    byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(i11, c4, threadPriority, 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a(TextUtils.indexOf("", "", 0) + 639, (char) (65100 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "") + 12, 1636969060, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 125))), b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f23811c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23810b) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23813e) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
                i7 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f23809a;
        int i5 = 989264422;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 11;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> i6) + 675;
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int iMakeMeasureSpec = 12 - View.MeasureSpec.makeMeasureSpec(i7, i7);
                        int i11 = $$b;
                        byte b2 = (byte) i7;
                        objA = o.d.d.a(keyRepeatDelay, gidForName, iMakeMeasureSpec, -328001469, false, $$c((byte) ((i11 + 124) - (i11 | 124)), b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 2;
                    i5 = 989264422;
                    i6 = 16;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $11 + 79;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23809a;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $10 + 87;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i14])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(675 - View.MeasureSpec.getMode(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 11 - ExpandableListView.getPackedPositionChild(0L), -328001469, false, $$c((byte) ($$b & 124), b3, b3), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i14++;
                int i17 = $10 + 69;
                $11 = i17 % 128;
                int i18 = i17 % 2;
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
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                lVar.f19942e ^= iArr4[i19];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(Process.getGidForName("") + 302, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 52697), 11 - TextUtils.getOffsetBefore("", 0), -1416256172, false, $$c((byte) 54, b4, b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i19++;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
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
                byte b5 = (byte) 0;
                objA4 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 230, (char) (51004 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, -330018025, false, $$c((byte) 52, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i24 = $10 + 115;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
        $$b = 187;
    }
}
