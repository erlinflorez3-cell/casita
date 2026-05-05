package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.samsung.android.sdk.samsungpay.v2.PartnerInfo;
import com.samsung.android.sdk.samsungpay.v2.SamsungPay;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.WatchManager;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;
import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.l;
import o.a.m;
import o.ea.f;
import o.ea.j;
import o.es.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements o.es.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static CardManager f18605b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static WatchManager f18606e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18607f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18608g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18609h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18610k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char[] f18611l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int[] f18612m = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f18613p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f18614r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected PartnerInfo f18615a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f18616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SamsungPay f18617d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f18618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<o.es.e> f18619j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f18620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f18621o;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, byte r10, short r11) {
        /*
            byte[] r8 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.$$c
            int r3 = r11 * 3
            int r2 = 1 - r3
            int r0 = r9 + 116
            int r1 = r10 * 2
            int r7 = 4 - r1
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r8 != 0) goto L2f
            r1 = r7
            r2 = r4
            r3 = r5
        L16:
            int r0 = -r2
            int r7 = r7 + r0
            int r1 = r1 + 1
            r2 = r3
            r0 = r7
            r7 = r1
        L1d:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r2 = r8[r7]
            r1 = r7
            r7 = r0
            goto L16
        L2f:
            r2 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.$$g(short, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18613p = -1574557222;
        init$0();
        f18609h = 1921347209;
        f18608g = -1409102854;
        f18607f = -941188164;
        f18610k = 0;
        f18614r = 1;
        f18612m = new int[]{-645598112, 88153113, 779676125, 546723941, -1208461428, -2030684297, -949276455, -755942934, -1023066997, 989790325, -865015909, 1652425512, -190279794, 673538262, 563227004, -1200778969, -1020956717, 1699775124};
        f18611l = new char[]{56506, 56558, 56555, 56555, 56575, 56711, 56728, 56738, 56736, 56728, 56730, 56721, 56715, 56730, 56739, 56734, 56725, 56723, 56715, 56725, 56739, 56729, 56519, 56346, 56341, 56329, 56339, 56345, 56341, 56345, 56331, 56323, 56338, 56339, 56345, 56329, 56321, 56346, 56348, 56339, 56337, 56327, 56497, 56548, 56538, 56536, 56557, 56542, 56532, 56557, 56559, 56550, 56548, 56535, 56534, 56549, 56550, 56556, 56540, 56532, 56557, 56559, 56506, 56568, 56570, 56573, 56575, 56565, 56562, 56554, 56554, 56563, 56571, CharCompanionObject.MIN_LOW_SURROGATE, 56567, 56565, 56567, 56500, 56558, 56555, 56530, 56503, 56527, 56560, 56552, 56519, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56546, 56546, 56547, 56555, 56557, 56542, 56550, 56566, 56558, 56559, 56496, 56554, 56557, 56533, 56537, 56553, 56548, 56551, 56550, 56548, 56553, 56561, 56558, 56558, 56566, 56544, 56575, 56439, 56435, 56439, 56433, 56423, 56425, 56438, 56446, 56441, 56435, 56434, 56437, 56441, 56436, 56530, 56363, 56370, 56369, 56371, 56368, 56367, 56367, 56365, 56367, 56352, 56345, 56366, 56371, 56366, 56361, 56334, 56714, 56714, 56732, 56715, 56714, 56737, 56739, 56718, 56723, 56738, 56738, 56447, 56414, 56414, 56704, 56745, 56744, 56746, 56743, 56734, 56732, 56739, 56705, 56421, 56421, 56441, 56739, 56743, 56738, 56490, 56529, 56525, 56520, 56521, 56534, 56535, 56529, 56528, 56530, 56527, 56518, 56516, 56523, 56536, 56534, 56519, 56522, 56531, 56524, 56523, 56522, 56514, 56521, 56523, 56496, 56550, 56561, 56559, 56546, 56539, 56541, 56550, 56553, 56551, 56552, 56558, 56557, 56544, 56543, 56548, 56552, 56545, 56545, 56566, 56421, 56423, 56428, 56419, 56421, 56424, 56416, 56427, 56434, 56421, 56414, 56416, 56425, 56428, 56426, 56427, 56433, 56432, 56419, 56418, 56423, 56427, 56537, 56363, 56519, 56332, 56324, 56324, 56334, 56328, 56323, 56500, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56563, 56556, 56554, 56564, 56550, 56545, 56558, 56499, 56556, 56528, 56519, 56551, 56561, 56556, 56552, 56557, 56559, 56527, 56519, 56551, 56561, 56556, 56552, 56557, 56559, 56556, 56549, 56548, 56552, 56554, 56549, 56554, 56553, 56553, 56565, 56556, 56553, 56557, 56548, 56553, 56555, 56548, 56545, 56551, 56561, 56555, 56549, 56549, 56555, 56555, 56553, 56552, 56548, 56556};
    }

    public b() throws Throwable {
        Object[] objArr = new Object[1];
        q(new int[]{-1886116824, -1480123013, -1161056598, 1019001607, -2125478539, -1269641112, 1475156130, 706015027, 1173531985, 739612965, 1058183859, 1671509367, -174036221, -1259257907, -1555151443, 1905489932, 1292522416, -1348975227}, 32 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        this.f18618i = ((String) objArr[0]).intern();
        this.f18621o = "";
        this.f18620n = "";
        this.f18619j = new ArrayList();
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        String strB;
        Object obj;
        b bVar = (b) objArr[0];
        c.a<String> aVar = (c.a) objArr[1];
        int i2 = 2 % 2;
        int i3 = f18614r + 37;
        f18610k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f18614r + 73;
            f18610k = i5 % 128;
            if (i5 % 2 != 0) {
                strB = bVar.b();
                Object[] objArr2 = new Object[1];
                s("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{22, 20, 45, 10}, true, objArr2);
                obj = objArr2[0];
            } else {
                strB = bVar.b();
                Object[] objArr3 = new Object[1];
                s("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{22, 20, 45, 10}, false, objArr3);
                obj = objArr3[0];
            }
            f.c(strB, ((String) obj).intern());
        }
        Object obj2 = null;
        if (!bVar.f18620n.equals("")) {
            int i6 = f18610k + 125;
            f18614r = i6 % 128;
            if (i6 % 2 != 0) {
                aVar.a(bVar.f18620n);
                return null;
            }
            aVar.a(bVar.f18620n);
            obj2.hashCode();
            throw null;
        }
        Boolean bool = Boolean.TRUE;
        Object[] objArr4 = new Object[1];
        q(new int[]{672458944, 2049048615, -419889940, 526940069, 552466046, 481810158}, 12 - Color.blue(0), objArr4);
        bVar.a(aVar, bool, ((String) objArr4[0]).intern());
        int i7 = f18614r + 49;
        f18610k = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(android.content.Context r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.b(android.content.Context, java.lang.String):void");
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (-1) - (((-1) - ((~((-1) - (((-1) - i8) & ((-1) - i9)))) | (~(i8 | i6)))) & ((-1) - (~(i9 | i6))));
        int i11 = ~i6;
        int i12 = (~(i11 | i3)) | (~((i9 + i3) - (i9 & i3)));
        int i13 = (i8 + i11) - (i8 & i11);
        int i14 = ~((i9 + i13) - (i9 & i13));
        int i15 = i6 + i3 + i5 + ((-2109949842) * i4) + (2078889904 * i7);
        int i16 = i15 * i15;
        int i17 = ((-1963971821) * i6) + 932184064 + (61854959 * i3) + (1134570258 * i10) + (i12 * (-1134570258)) + ((-1134570258) * i14) + (1196425216 * i5) + (610271232 * i4) + (922746880 * i7) + (671350784 * i16);
        int i18 = (i6 * (-573803825)) + 196542130 + (i3 * (-573802789)) + (i10 * (-518)) + (i12 * 518) + (i14 * 518) + (i5 * (-573803307)) + (i4 * (-843101306)) + (i7 * (-1524517520)) + (i16 * 458489856);
        if (i17 + (i18 * i18 * 64749568) == 1) {
            return a(objArr);
        }
        b bVar = (b) objArr[0];
        int i19 = 2 % 2;
        if (f.a()) {
            int i20 = f18610k + 63;
            f18614r = i20 % 128;
            int i21 = i20 % 2;
            String strB = bVar.b();
            Object[] objArr2 = new Object[1];
            s("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{PanasonicMakernoteDirectory.TAG_BURST_SPEED, 15, 139, 0}, true, objArr2);
            f.c(strB, ((String) objArr2[0]).intern());
            int i22 = f18614r + 1;
            f18610k = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 3 % 4;
            }
        }
        bVar.f18617d.getSamsungPayStatus(new SamsungPayConfigureWalletListener(bVar.f18617d));
        return null;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.NAK, 117, 119, 110};
        $$b = 183;
    }

    static void init$1() {
        $$d = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32, MessagePack.Code.BIN8, 60, 2, MessagePack.Code.INT16, 57};
        $$e = 128;
    }

    static void init$2() {
        $$c = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$f = 132;
    }

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f18612m;
        int i4 = 989264422;
        int i5 = 5;
        if (iArr3 != null) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 5);
                        objA = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 675, (char) TextUtils.getTrimmedLength(""), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -328001469, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 77;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 989264422;
                    i5 = 5;
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
        int[] iArr5 = f18612m;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i10 = 0; i10 < length3; i10++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 5;
                    byte b5 = (byte) (b4 - 5);
                    objA2 = o.d.d.a(675 - TextUtils.indexOf("", ""), (char) Color.red(0), ImageFormat.getBitsPerPixel(0) + 13, -328001469, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
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
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 105;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                lVar.f19942e ^= iArr4[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 3;
                    byte b7 = (byte) (b6 - 3);
                    objA3 = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 301, (char) (View.MeasureSpec.getSize(0) + 52697), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -1416256172, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i11++;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
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
                byte b8 = (byte) 1;
                byte b9 = (byte) (b8 - 1);
                objA4 = o.d.d.a(229 - View.combineMeasuredStates(0, 0), (char) (51005 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 10, -330018025, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void s(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 115;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i8 = 0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        char[] cArr = f18611l;
        float f2 = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objA = o.d.d.a(249 - (TypedValue.complexToFraction(i8, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i8, f2, f2) == f2 ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0') + 12, 1376582792, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i13++;
                    i8 = 0;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr, i9, cArr3, 0, i10);
        if (bArr != null) {
            char[] cArr4 = new char[i10];
            mVar.f19943d = 0;
            int i14 = $10 + 21;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char c2 = 0;
            while (mVar.f19943d < i10) {
                if (bArr[mVar.f19943d] == 1) {
                    int i16 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a((Process.myTid() >> 22) + 11, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    int i17 = $10 + 33;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    int i19 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        int i20 = 836 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char packedPositionChild = (char) (27278 - ExpandableListView.getPackedPositionChild(0L));
                        int i21 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10;
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 4);
                        objA3 = o.d.d.a(i20, packedPositionChild, i21, -1210801192, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (35715 - ExpandableListView.getPackedPositionGroup(0L)), 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i12 > 0) {
            char[] cArr5 = new char[i10];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i10);
            int i22 = i10 - i12;
            System.arraycopy(cArr5, 0, cArr3, i22, i12);
            System.arraycopy(cArr5, i12, cArr3, 0, i22);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i10];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i10) {
                    break;
                }
                int i23 = $11 + 1;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr6[mVar.f19943d] = cArr3[mVar.f19943d * i10];
                    i4 = mVar.f19943d;
                    i3 = 1;
                } else {
                    i3 = 1;
                    cArr6[mVar.f19943d] = cArr3[(i10 - mVar.f19943d) - 1];
                    i4 = mVar.f19943d;
                }
                i2 = i4 + i3;
            }
            cArr3 = cArr6;
        }
        if (i11 > 0) {
            int i24 = $11 + 19;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (true) {
                mVar.f19943d = i26;
                if (mVar.f19943d >= i10) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i26 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r0 = r7 * 3
            int r7 = 4 - r0
            int r0 = r9 * 3
            int r6 = r0 + 1
            byte[] r5 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.$$a
            int r4 = 100 - r8
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r5 != 0) goto L28
            r0 = r6
            r1 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r4 + r0
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L25:
            r0 = r5[r7]
            goto L13
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.t(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r0 = r8 * 12
            int r6 = r0 + 99
            int r5 = r9 * 5
            int r0 = r5 + 1
            byte[] r4 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.$$d
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L2b
            r1 = r5
            r0 = r2
        L13:
            int r6 = r6 + r1
            int r6 = r6 + (-5)
            r1 = r0
        L17:
            byte r0 = (byte) r6
            int r7 = r7 + 1
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L28:
            r1 = r4[r7]
            goto L13
        L2b:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.u(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo a(o.ap.h.e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.a(o.ap.h$e):com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo");
    }

    @Override // o.es.b
    public final void a(Activity activity, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18610k + 59;
        f18614r = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f18614r + 109;
            f18610k = i5 % 128;
            int i6 = i5 % 2;
            String strB = b();
            Object[] objArr = new Object[1];
            q(new int[]{578434008, 403241328, 1222411818, -258371815}, 8 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            f.c(strB, ((String) objArr[0]).intern());
        }
        Bundle bundle = new Bundle();
        Object[] objArr2 = new Object[1];
        q(new int[]{-217076860, 1510636246, 1115822245, 1880957314, 1424185552, 1748185458, -376385436, 303449460}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        s("\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{249, 7, 27, 0}, true, objArr3);
        bundle.putString(strIntern, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        s("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{256, 15, 0, 9}, true, objArr4);
        bundle.putInt(((String) objArr4[0]).intern(), 3);
        if (f.a()) {
            String strB2 = b();
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            q(new int[]{578434008, 403241328, 1222411818, -258371815, 1254702737, 150807920, -1341650587, 449659038, 1290430291, 1541972350}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, objArr5);
            StringBuilder sbAppend = sb.append(((String) objArr5[0]).intern()).append(str);
            Object[] objArr6 = new Object[1];
            q(new int[]{682398483, 2127544359, 488313646, 1805486679, 1898009863, 613149388, 1995061050, -494656219}, 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
            f.c(strB2, sbAppend.append(((String) objArr6[0]).intern()).append(bundle).toString());
            int i7 = f18610k + 57;
            f18614r = i7 % 128;
            int i8 = i7 % 2;
        }
        new PaymentManager(activity, this.f18615a).startSimplePay(new CardInfo.Builder().setCardId(str).setCardMetaData(bundle).build(), new SamsungPayShowCardListener());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011e  */
    /* JADX WARN: Type inference failed for: r2v72, types: [boolean, int] */
    @Override // o.es.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.es.c.a<java.lang.String> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.a(o.es.c$a):void");
    }

    abstract void a(c.a<String> aVar, Boolean bool, String str);

    abstract String b();

    @Override // o.es.c
    public final void b(Activity activity) throws Throwable {
        int iMyPid = Process.myPid();
        int i2 = f18607f * 1315622870;
        f18607f = i2;
        int i3 = f18608g * (-821990553);
        f18608g = i3;
        e(iMyPid, new Object[]{this, activity}, 229526347, i3, i2, -229526347, (int) Thread.currentThread().getId());
    }

    protected void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18614r + 49;
        f18610k = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f18610k + 49;
            f18614r = i4 % 128;
            int i5 = i4 % 2;
            String strB = b();
            Object[] objArr = new Object[1];
            s("\u0000\u0001\u0001\u0001", new int[]{0, 4, 0, 0}, true, objArr);
            f.c(strB, ((String) objArr[0]).intern());
        }
        this.f18616c = context;
        try {
            Object[] objArr2 = new Object[1];
            q(new int[]{-1886116824, -1480123013, -1161056598, 1019001607, -2125478539, -1269641112, 1475156130, 706015027, 1173531985, 739612965, 1058183859, 1671509367, -174036221, -1259257907, -1555151443, 1905489932, 1292522416, -1348975227}, ExpandableListView.getPackedPositionChild(0L) + 34, objArr2);
            String strD = o.ea.m.d(context, ((String) objArr2[0]).intern());
            Bundle bundle = new Bundle();
            Object[] objArr3 = new Object[1];
            s("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{4, 18, 175, 18}, false, objArr3);
            bundle.putString(((String) objArr3[0]).intern(), SpaySdk.ServiceType.APP2APP.toString());
            this.f18615a = new PartnerInfo(strD, bundle);
        } catch (PackageManager.NameNotFoundException e2) {
            if (f.a()) {
                String strB2 = b();
                Object[] objArr4 = new Object[1];
                q(new int[]{-451616582, -208186686, 618187380, 769086219, 576454722, -2003827319, 1037998816, 374381328, 386630824, 730868622, 1286081379, -194550171, 1743904853, -1922541465, 1724238268, 2063862000, -1266925052, -1758596559, -141721319, 307469827, -2099807064, 261147781, -88214217, -220022133}, 47 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                f.e(strB2, ((String) objArr4[0]).intern(), e2);
            }
        }
        this.f18617d = new SamsungPay(context, this.f18615a);
        b(context, e());
    }

    protected final void c(String str) {
        int i2 = 2 % 2;
        int i3 = f18610k + 5;
        int i4 = i3 % 128;
        f18614r = i4;
        if (i3 % 2 == 0) {
            int i5 = 90 / 0;
            if (str == null) {
                return;
            }
        } else if (str == null) {
            return;
        }
        this.f18621o = str;
        int i6 = i4 + 121;
        f18610k = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.es.e d(android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, o.es.d r18) throws java.lang.Throwable {
        /*
            r13 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.f18614r
            int r1 = r0 + 113
            int r0 = r1 % 128
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.f18610k = r0
            int r1 = r1 % r6
            r5 = 0
            r10 = r17
            if (r1 == 0) goto L7f
            boolean r1 = o.ea.f.a()
            r0 = 47
            int r0 = r0 / r5
            if (r1 == 0) goto L4f
        L1a:
            java.lang.String r3 = r13.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r0 = 16
            int[] r2 = new int[r0]
            r2 = {x0086: FILL_ARRAY_DATA , data: [743394385, 972680668, -35736304, 1661511640, 515545616, -1647585249, 55950496, 734939094, 251754967, 1582491257, -1207571410, -675447768, 1173366508, 710478861, 1995061050, -494656219} // fill-array
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r1 = 30 - r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            q(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            o.ea.f.d(r3, r0)
        L4f:
            o.es.e r7 = new o.es.e
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r11 = 0
            r12 = r18
            r8 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List<o.es.e> r0 = r13.f18619j
            r0.add(r7)
            java.util.List<o.es.e> r0 = r13.f18619j
            r13.e(r14, r0, r15)
            int r0 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.f18610k
            int r1 = r0 + 9
            int r0 = r1 % 128
            fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.f18614r = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L7e
            r0 = 15
            int r0 = r0 / r5
        L7e:
            return r7
        L7f:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L4f
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.b.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, o.es.d):o.es.e");
    }

    @Override // o.es.c
    public final void d(Activity activity, c.a<Object> aVar, j jVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18610k + 109;
        f18614r = i3 % 128;
        int i4 = i3 % 2;
        int iMyPid = Process.myPid();
        int i5 = f18607f * 1315622870;
        f18607f = i5;
        int i6 = f18608g * (-821990553);
        f18608g = i6;
        e(iMyPid, new Object[]{this, activity}, 229526347, i6, i5, -229526347, (int) Thread.currentThread().getId());
        int i7 = f18614r + 7;
        f18610k = i7 % 128;
        int i8 = i7 % 2;
    }

    abstract String e();

    protected final void e(String str) {
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = f18614r + 89;
            f18610k = i3 % 128;
            int i4 = i3 % 2;
            this.f18620n = str;
        }
        int i5 = f18614r + 89;
        f18610k = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.es.c
    public final void e(c.a<String> aVar) throws Throwable {
        int i2 = 500077584 * f18609h;
        f18609h = i2;
        e(i2, new Object[]{this, aVar}, -986287289, Thread.currentThread().getPriority(), (int) Thread.currentThread().getId(), 986287290, Process.myPid());
    }
}
