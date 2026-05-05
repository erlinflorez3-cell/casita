package o.by;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.ea.a<AntelopError> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    private static char[] f21806c = null;

    /* JADX INFO: renamed from: d */
    private static char f21807d = 0;

    /* JADX INFO: renamed from: f */
    public static int f21808f = 0;

    /* JADX INFO: renamed from: g */
    private static int f21809g = 0;

    /* JADX INFO: renamed from: h */
    private static int f21810h = 0;

    /* JADX INFO: renamed from: i */
    public static int f21811i = 0;

    /* JADX INFO: renamed from: j */
    private static int[] f21812j = null;

    /* JADX INFO: renamed from: k */
    public static int f21813k = 0;

    /* JADX INFO: renamed from: l */
    public static int f21814l = 0;

    /* JADX INFO: renamed from: m */
    public static int f21815m = 0;

    /* JADX INFO: renamed from: a */
    private final String f21816a;

    /* JADX INFO: renamed from: b */
    private final AntelopErrorCode f21817b;

    /* JADX INFO: renamed from: e */
    private final int f21818e;

    private static String $$e(byte b2, short s2, int i2) {
        int i3 = b2 + 102;
        byte[] bArr = $$c;
        int i4 = i2 + 4;
        int i5 = s2 * 3;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += i5;
        }
        while (true) {
            i4++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f21815m = 842972806;
        f21814l = -1246282430;
        f21813k = -2142255901;
        f21811i = 94002099;
        f21808f = -1610157909;
        init$0();
        f21810h = 0;
        f21809g = 1;
        f21806c = new char[]{64629, 64588, 64606, 64622, 64605, 64628, 64520, 64630, 64586, 64523, 64592, 64626, 64577, 64625, 64595, 64609, 64587, 64589, 64521, 64590, 64536, 64579, 64578, 64514, 64614, 64580, 64627, 64598, 64619, 64599, 64576, 64517, 64584, 64624, 64593, 64582};
        f21807d = (char) 51641;
        f21812j = new int[]{340990628, 1308031107, 1452835012, -624062652, 911116569, 1839052456, -872541539, 1288508867, 1000821963, 308107876, -502505045, -1681780577, -46235461, 930392864, -236556782, 510162728, 489581124, 911684636};
    }

    public c(AntelopErrorCode antelopErrorCode) {
        this(antelopErrorCode, -1, "");
    }

    public c(AntelopErrorCode antelopErrorCode, int i2, String str) {
        this.f21817b = antelopErrorCode;
        this.f21818e = i2;
        this.f21816a = str;
    }

    public c(AntelopErrorCode antelopErrorCode, String str) {
        this(antelopErrorCode, -1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.by.c b(o.bg.c r6) throws java.lang.Throwable {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.by.c.f21810h
            int r1 = r0 + 13
            int r0 = r1 % 128
            o.by.c.f21809g = r0
            int r1 = r1 % r4
            r5 = 0
            if (r1 != 0) goto L7c
            java.lang.String r3 = r6.a()
            o.bg.a r2 = r6.c()
            o.bg.a r1 = o.bg.a.E
            r0 = 27
            int r0 = r0 / r5
            if (r2 != r1) goto L4c
        L1e:
            int r0 = o.by.c.f21810h
            int r1 = r0 + 57
            int r0 = r1 % 128
            o.by.c.f21809g = r0
            int r1 = r1 % r4
            r4 = 1
            java.lang.String r3 = "\u001a\n\u001e\u0001\t\u001c\r#\u001a\n\u001f\u0004\u0013\u0003\u001f\u001d\u001f\u0004\n\u000e\u001e\u0001\u001a\u000b\r\u0002\u0012\u0000\u0019#\u001a\u0006\u000f\u0016\u0004\u0013\u000b\u001c\u0000\u0012\u001e\u0007\u001e\u0019\f#\u001f\u0017\u0001\r\u0015\t \u001e\n\u000e\u0013\u0003\u001c\u0010\u0018\u001a\u001f\u0004\n\u000e"
            if (r1 != 0) goto L62
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r0 = r0 << 93
            int r2 = 10 - r0
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 92 - r0
            byte r1 = (byte) r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            n(r2, r3, r1, r0)
            r0 = r0[r5]
        L46:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
        L4c:
            o.by.c r2 = new o.by.c
            o.bg.a r0 = r6.c()
            fr.antelop.sdk.AntelopErrorCode r1 = r0.b()
            o.bg.a r0 = r6.c()
            int r0 = r0.e()
            r2.<init>(r1, r0, r3)
            return r2
        L62:
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r0 = r0 >> 8
            int r2 = r0 + 66
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 59 - r0
            byte r1 = (byte) r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            n(r2, r3, r1, r0)
            r0 = r0[r5]
            goto L46
        L7c:
            java.lang.String r3 = r6.a()
            o.bg.a r1 = r6.c()
            o.bg.a r0 = o.bg.a.E
            if (r1 != r0) goto L4c
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.c.b(o.bg.c):o.by.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x001b, code lost:
    
        if (r24 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x001d, code lost:
    
        r4 = new java.lang.Object[]{new int[1], new int[]{r25}, null, new int[]{r25}};
        r6 = java.lang.Thread.activeCount();
        r3 = ~((-1) - (((-1) - (-511945442)) & ((-1) - r6)));
        r27 = r27 + (((-1033184027) + (((r3 - 166202581) - (r3 & (-166202581))) * (-964))) + (((~((~r6) | (-511945442))) | 369336865) * (-964)));
        r27 = r27 ^ (r27 << 13);
        r27 = r27 ^ (r27 >>> 17);
        ((int[]) r4[0])[0] = r27 ^ (r27 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x006f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0070, code lost:
    
        if (r24 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0075, code lost:
    
        r5 = new java.lang.Object[1];
        n(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 24, "\u001c\r\u0011\u0018\u0007\u0002\u000f\u0006 \u000b\u0016\u0004\"\f!\n\u001a\u0006\u0016\u0004\"\u0000㙇", (byte) (89 - android.view.Gravity.getAbsoluteGravity(0, 0)), r5);
        r9 = java.lang.Class.forName(((java.lang.String) r5[0]).intern());
        r5 = new java.lang.Object[1];
        o(new int[]{1489360032, 51602691, -467315239, 74574514, 65833142, -129942803, 1775137426, -346438838, -1611328457, -492258448}, 18 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), r5);
        r8 = r9.getMethod(((java.lang.String) r5[0]).intern(), null).invoke(r24, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00b9, code lost:
    
        r5 = new java.lang.Object[1];
        o(new int[]{-406383435, 1418452953, 280297320, -615816682, 116036151, 898187506, -1891782410, -1853967852, 1337960474, -1429375859, -467315239, 74574514, 65833142, -129942803, 1775137426, -346438838, -1611328457, -492258448}, 34 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), r5);
        r9 = java.lang.Class.forName(((java.lang.String) r5[0]).intern());
        r5 = new java.lang.Object[1];
        o(new int[]{2109834709, 696255496, -1084241847, 54826476}, 5 - android.view.View.combineMeasuredStates(0, 0), r5);
        r7 = r9.getField(((java.lang.String) r5[0]).intern()).getInt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0108, code lost:
    
        if (((r7 + 2) - (r7 | 2)) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x010a, code lost:
    
        r7 = o.by.c.f21810h + 29;
        o.by.c.f21809g = r7 % 128;
        r7 = r7 % 2;
        r7 = new java.lang.Object[]{new int[1], new int[]{r25}, null, new int[]{r25 ^ 1}};
        r9 = java.lang.Thread.currentThread().getPriority();
        r8 = r27 + ((((((~((-1) - (((-1) - (-553132997)) & ((-1) - r9)))) | 545792004) * (-283)) + 518462497) + ((~(r9 | (-7340993))) * 283)) + 16);
        r8 = r8 ^ (r8 << 13);
        r8 = r8 ^ (r8 >>> 17);
        ((int[]) r7[0])[0] = r8 ^ (r8 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x016b, code lost:
    
        if (((int[]) r7[3])[0] == r25) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x016e, code lost:
    
        r7 = new java.lang.Object[]{new int[]{r8 ^ (r8 << 5)}, new int[]{r25}, null, new int[]{r25}};
        r12 = o.by.c.f21811i * 686550981;
        o.by.c.f21811i = r12;
        r5 = ~((-1) - (((-1) - (-215420673)) & ((-1) - (~r12))));
        r8 = r27 + (((((~((r13 + 462727349) - (r13 & 462727349))) | ((r5 + 71501568) - (r5 & 71501568))) * (-397)) - 1334673660) + (((-1) - (((-1) - r12) & ((-1) - 390309813))) * 397));
        r8 = r8 ^ (r8 << 13);
        r8 = r8 ^ (r8 >>> 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d0, code lost:
    
        r5 = o.d.d.a(866831627);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d6, code lost:
    
        if (r5 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d8, code lost:
    
        r13 = 617 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r8 = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
        r19 = 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
        r12 = (byte) 0;
        r9 = r12;
        r5 = new java.lang.Object[1];
        p(r12, r9, r9, r5);
        r5 = o.d.d.a(r13, r8, r19, -449892498, false, (java.lang.String) r5[0], new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0210, code lost:
    
        r5 = (java.util.Set) ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0218, code lost:
    
        r7 = o.d.d.a(-194175244);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021f, code lost:
    
        if (r7 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0221, code lost:
    
        r14 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + com.drew.metadata.iptc.IptcDirectory.TAG_HEADLINE;
        r13 = (char) android.text.TextUtils.getTrimmedLength("");
        r16 = 11 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
        r12 = (byte) o.by.c.$$a.length;
        r9 = (byte) (r12 - 4);
        r7 = new java.lang.Object[1];
        p(r12, r9, r9, r7);
        r7 = o.d.d.a(r14, r13, r16, 585694353, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0260, code lost:
    
        if (r5.contains(((java.lang.reflect.Field) r7).get(null)) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0262, code lost:
    
        r7 = o.d.d.a(-196022286);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0269, code lost:
    
        if (r7 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026b, code lost:
    
        r13 = (android.os.Process.myTid() >> 22) + 616;
        r14 = (char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0));
        r15 = (android.os.Process.myTid() >> 22) + 12;
        r9 = (byte) 2;
        r8 = (byte) (r9 - 2);
        r7 = new java.lang.Object[1];
        p(r9, r8, r8, r7);
        r7 = o.d.d.a(r13, r14, r15, 584387991, false, (java.lang.String) r7[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a7, code lost:
    
        if (r5.contains(((java.lang.reflect.Field) r7).get(null)) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ad, code lost:
    
        if (android.os.Build.VERSION.SDK_INT != 30) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02af, code lost:
    
        r5 = new java.lang.Object[]{new int[]{r27 ^ (r27 << 5)}, new int[]{r25}, null, new int[]{r25}};
        r7 = o.by.c.f21813k * 1407995731;
        o.by.c.f21813k = r7;
        r3 = ~((-47468031) | r7);
        r6 = ((-1581569811) + (((r3 + 9718198) - (r3 & 9718198)) * com.drew.metadata.iptc.IptcDirectory.TAG_TIME_SENT)) + (((~(r7 | 630679991)) | (-668429824)) * (-168));
        r2 = ~r7;
        r27 = r27 + (r6 + (((~((r2 + 630679991) - (r2 & 630679991))) | (-47468031)) * 168));
        r27 = r27 ^ (r27 << 13);
        r27 = r27 ^ (r27 >>> 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x030c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0311, code lost:
    
        if ((r26 & 32) != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0317, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0319, code lost:
    
        r2 = new java.lang.Object[1];
        o(new int[]{-1000535202, -1600419955, 433264057, 1864936773, 128598016, 1995544930, -821990126, -1346869043, -887058247, -1204139562, 1689823624, -1601332809, -1238723922, 2107123656}, 28 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0337, code lost:
    
        r5 = new java.lang.Object[]{((java.lang.String) r2[0]).intern()};
        r2 = o.d.d.a(-120123186);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0342, code lost:
    
        if (r2 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0344, code lost:
    
        r11 = android.text.TextUtils.indexOf("", "", 0, 0) + 847;
        r12 = (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6488);
        r13 = android.text.TextUtils.indexOf("", "", 0) + 12;
        r7 = (byte) 3;
        r6 = (byte) (r7 - 3);
        r2 = new java.lang.Object[1];
        p(r7, r6, r6, r2);
        r2 = o.d.d.a(r11, r12, r13, 777188011, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0378, code lost:
    
        r25 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r5)).longValue();
        r8 = -830098097;
        r11 = 614;
        r4 = r25;
        r2 = -1;
        r23 = r8 ^ r2;
        r17 = (r23 | r25) ^ r2;
        r21 = r25 ^ r2;
        r6 = ((((long) com.drew.metadata.iptc.IptcDirectory.TAG_ORIGINAL_TRANSMISSION_REFERENCE) * r8) + (((long) (-613)) * r25)) + ((((-1) - (((-1) - r4) & ((-1) - r17))) | ((r21 | r8) ^ r2)) * r11);
        r4 = r4 ^ r2;
        r15 = ((r23 + r4) - (r23 & r4)) ^ r2;
        r6 = ((r6 + (((long) (-1228)) * (((r15 + r17) - (r15 & r17)) | (((-1) - (((-1) - r4) & ((-1) - r25))) ^ r2)))) + (((((-1) - (((-1) - ((r4 + r8) - (r4 & r8))) & ((-1) - r25))) ^ r2) | (((-1) - (((-1) - ((-1) - (((-1) - r23) & ((-1) - r21)))) & ((-1) - r4))) ^ r2)) * r11)) + ((long) (-758065821));
        r4 = (int) (r6 >> 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03fa, code lost:
    
        r3 = o.by.c.f21808f * 245822564;
        o.by.c.f21808f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0404, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0405, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0409, code lost:
    
        if (r0 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x040b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x040c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x040d, code lost:
    
        r1 = new java.lang.Object[1];
        o(new int[]{186622862, 1200406920, -887058247, -1204139562, 1689823624, -1601332809, 1282589810, 1027060050}, 12 - android.os.Process.getGidForName(""), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0429, code lost:
    
        r5 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
        r1 = o.d.d.a(785142162);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0434, code lost:
    
        if (r1 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0436, code lost:
    
        r12 = 301 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        r13 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 52697);
        r14 = 10 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0');
        r6 = (byte) 2;
        r3 = (byte) (r6 - 2);
        r0 = new java.lang.Object[1];
        p(r6, r3, r3, r0);
        r1 = o.d.d.a(r12, r13, r14, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0476, code lost:
    
        r5 = ((java.lang.reflect.Method) r1).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0483, code lost:
    
        r1 = new java.lang.Object[1];
        o(new int[]{-1466824366, 1759838112}, android.text.TextUtils.getTrimmedLength("") + 1, r1);
        r0 = r5.equals(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04a1, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04a2, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a6, code lost:
    
        if (r0 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a9, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04aa, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04ad, code lost:
    
        r8 = ~(((-1186694297) + r3) - ((-1186694297) & r3));
        r4 = r4 & ((((-472386387) + (((-1) - (((-1) - 69304320) & ((-1) - r8))) * (-814))) + (((-1) - (((-1) - r8) & ((-1) - ((-1) - (((-1) - (~((~r3) | 1671046588))) & ((-1) - 553656612)))))) * cz.msebera.android.httpclient.HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)) + (((~((r3 - 1671046589) - (r3 & (-1671046589)))) | ((-1) - (((-1) - (~((-1) - (((-1) - 1186694296) & ((-1) - r3))))) & ((-1) - 553656612)))) * cz.msebera.android.httpclient.HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
        r3 = (int) r6;
        r6 = ~r25;
        r2 = ~((-1) - (((-1) - r6) & ((-1) - 651891801)));
        r5 = ((720666384 + (((r2 - 2089118212) - (r2 & (-2089118212))) * (-1042))) + ((651891801 | r25) * 521)) + (((~((r6 - 1476684291) - (r6 & (-1476684291)))) | ((-1) - (((-1) - (~((2089118211 + r25) - (2089118211 & r25)))) & ((-1) - 39457880)))) * 521);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0546, code lost:
    
        if (((-1) - (((-1) - r4) & ((-1) - ((r3 + r5) - (r3 | r5))))) != 1) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0548, code lost:
    
        r1 = 'M';
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x054c, code lost:
    
        if (r1 == '^') goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x054e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x054f, code lost:
    
        if (r0 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0551, code lost:
    
        r2 = new java.lang.Object[]{new int[]{r27 ^ (r27 << 5)}, new int[]{r25}, null, new int[]{r25 ^ 10}};
        r1 = o.by.c.f21814l * (-1463282379);
        o.by.c.f21814l = r1;
        r4 = ~r1;
        r7 = (-1) - (((-1) - (-562208190)) & ((-1) - r4));
        r6 = ((-115939833) + r4) - ((-115939833) & r4);
        r4 = 452963741 + (((-1) - (((-1) - (~((-1) - (((-1) - r4) & ((-1) - (-107544641)))))) & ((-1) - (~((-1) - (((-1) - (-553812998)) & ((-1) - r4))))))) * (-184));
        r0 = ~r7;
        r27 = r27 + ((r4 + ((((8395192 + r0) - (8395192 & r0)) | (~r6)) * 184)) - 1319531032);
        r27 = r27 ^ (r27 << 13);
        r27 = r27 ^ (r27 >>> 17);
        r1 = o.by.c.f21810h + 65;
        o.by.c.f21809g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x05dc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x05dd, code lost:
    
        r1 = '^';
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x05e1, code lost:
    
        r3 = new java.lang.Object[]{new int[]{r27 ^ (r27 << 5)}, new int[]{r25}, null, new int[]{r25}};
        r8 = o.by.c.f21815m * 1255149064;
        o.by.c.f21815m = r8;
        r6 = ~r8;
        r27 = r27 + (((1112379460 + (((-1) - (((-1) - (~(((-279741651) + r6) - ((-279741651) & r6)))) & ((-1) - (-398406372)))) * (-865))) + ((~(r8 | 279741650)) * 865)) + (((-1) - (((-1) - (~((-1) - (((-1) - (-398406372)) & ((-1) - r6))))) & ((-1) - (~(r6 | 279741650))))) * 865));
        r27 = r27 ^ (r27 << 13);
        r27 = r27 ^ (r27 >>> 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x064f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0650, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0651, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0655, code lost:
    
        if (r0 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0657, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0658, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0659, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x065a, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x065e, code lost:
    
        if (r0 != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0660, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0661, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] c(android.content.Context r24, int r25, int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.c.c(android.content.Context, int, int, int):java.lang.Object[]");
    }

    private AntelopError h() {
        int i2 = 2 % 2;
        int i3 = f21810h + 15;
        f21809g = i3 % 128;
        int i4 = i3 % 2;
        AntelopError antelopErrorA = a();
        int i5 = f21809g + 65;
        f21810h = i5 % 128;
        int i6 = i5 % 2;
        return antelopErrorA;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 89;
    }

    static void init$1() {
        $$c = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4};
        $$d = 16;
    }

    private static void n(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $11 + 31;
            $10 = i5 % 128;
            obj = charArray;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
                obj = charArray;
            }
        }
        char[] cArr = (char[]) obj;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f21806c;
        int i7 = 421932776;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(271 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), 12 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), -811348851, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i7 = 421932776;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f21807d)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\b';
        char c3 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - View.combineMeasuredStates(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -811348851, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
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
            int i9 = $10 + 97;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
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
                        objA3 = o.d.d.a(826 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 11 - Color.blue(0), -611683395, false, $$e((byte) 9, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            c3 = 11;
                            byte b8 = (byte) 0;
                            c2 = '\b';
                            objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + JfifUtil.MARKER_SOS, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 212688716, false, $$e((byte) 7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = 11;
                            c2 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i11 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i11];
                        int i12 = $10 + 101;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        c3 = 11;
                        c2 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i14];
                            cArr4[hVar.f19926b + 1] = cArr2[i15];
                        } else {
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i18 = 0; i18 < i2; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void o(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21812j;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 674, (char) ExpandableListView.getPackedPositionGroup(j2), (Process.myPid() >> 22) + 12, -328001469, false, $$e((byte) ($$d + 3), b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 989264422;
                    j2 = 0;
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
        int[] iArr5 = f21812j;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 83;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int iRgb = Color.rgb(i6, i6, i6) + 16777891;
                        char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i10 = 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b3 = (byte) i6;
                        String str$$e = $$e((byte) ($$d + 3), b3, (byte) (b3 - 1));
                        Class[] clsArr = new Class[i5];
                        clsArr[0] = Integer.TYPE;
                        objA2 = o.d.d.a(iRgb, c2, i10, -328001469, false, str$$e, clsArr);
                    }
                    iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i8 >>>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(675 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Color.blue(0), (ViewConfiguration.getTouchSlop() >> 8) + 12, -328001469, false, $$e((byte) ($$d + 3), b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i8++;
                    i5 = 1;
                }
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i11 = $10 + 101;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i13 = $10 + 79;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < 16; i15++) {
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(300 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (52696 - ImageFormat.getBitsPerPixel(0)), Color.rgb(0, 0, 0) + 16777227, -1416256172, false, $$e((byte) ($$d + 1), b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
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
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b6 = (byte) 0;
                objA5 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 229, (char) (51004 - Color.red(0)), TextUtils.indexOf((CharSequence) "", '0') + 10, -330018025, false, $$e((byte) ($$d - 1), b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            int r8 = r8 + 97
            int r0 = r10 * 3
            int r7 = 1 - r0
            byte[] r6 = o.by.c.$$a
            int r0 = r9 * 4
            int r5 = 4 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2c
            r1 = r5
            r8 = r7
            r2 = r3
        L14:
            int r8 = r8 + r5
            int r5 = r1 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L27:
            r0 = r6[r5]
            r1 = r5
            r5 = r0
            goto L14
        L2c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.c.p(short, byte, short, java.lang.Object[]):void");
    }

    public final AntelopError a() {
        int i2 = 2 % 2;
        AntelopError antelopError = new AntelopError(this);
        int i3 = f21809g + 27;
        f21810h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
        return antelopError;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f21810h + 73;
        int i4 = i3 % 128;
        f21809g = i4;
        int i5 = i3 % 2;
        int i6 = this.f21818e;
        int i7 = i4 + 23;
        f21810h = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final AntelopErrorCode c() {
        int i2 = 2 % 2;
        int i3 = f21809g;
        int i4 = i3 + 29;
        f21810h = i4 % 128;
        int i5 = i4 % 2;
        AntelopErrorCode antelopErrorCode = this.f21817b;
        int i6 = i3 + 13;
        f21810h = i6 % 128;
        if (i6 % 2 == 0) {
            return antelopErrorCode;
        }
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f21810h;
        int i4 = i3 + 35;
        f21809g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f21816a;
        int i6 = i3 + 7;
        f21809g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // o.ea.a
    public final /* synthetic */ AntelopError e() {
        int i2 = 2 % 2;
        int i3 = f21809g + 59;
        f21810h = i3 % 128;
        int i4 = i3 % 2;
        AntelopError antelopErrorH = h();
        int i5 = f21810h + 27;
        f21809g = i5 % 128;
        if (i5 % 2 != 0) {
            return antelopErrorH;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        n((ViewConfiguration.getFadingEdgeLength() >> 16) + 6, "\u0005 \u0006\u000e \u0012", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 26), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f21817b);
        Object[] objArr2 = new Object[1];
        o(new int[]{-2122382435, 1969118484, 1949459934, 659439298, -1589836813, -1878909610}, 9 - TextUtils.indexOf("", ""), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(this.f21818e);
        Object[] objArr3 = new Object[1];
        n(11 - ExpandableListView.getPackedPositionGroup(0L), "\u0013\u001e!\u001f㘐㘐\u001c\u0013 \u0012㗤", (byte) ('W' - AndroidCharacter.getMirror('0')), objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(this.f21816a).append("'}").toString();
        int i3 = f21809g + 17;
        f21810h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        return string;
    }
}
