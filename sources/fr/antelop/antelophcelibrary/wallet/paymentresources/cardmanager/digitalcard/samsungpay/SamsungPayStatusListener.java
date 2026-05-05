package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.g;
import o.a.l;
import o.ea.f;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayStatusListener implements StatusListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f18589a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f18590b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f18591c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f18592e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18593f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18594g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f18595h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18596i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18597j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a<c.e> f18598d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            int r0 = 121 - r8
            byte[] r8 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayStatusListener.$$a
            int r2 = r9 + 4
            int r1 = r10 * 2
            int r7 = 1 - r1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L28
            r3 = r7
            r4 = r5
        L11:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L14:
            int r4 = r3 + 1
            int r2 = r2 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r4 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L23:
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L11
        L28:
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayStatusListener.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18596i = 0;
        f18597j = 1;
        f18593f = 0;
        f18594g = 1;
        c();
        ViewConfiguration.getEdgeSlop();
        int i2 = f18596i + 9;
        f18597j = i2 % 128;
        int i3 = i2 % 2;
    }

    protected SamsungPayStatusListener(c.a<c.e> aVar) {
        this.f18598d = aVar;
    }

    static void c() {
        f18592e = new int[]{1954056282, 709710887, 1281681823, -437219799, 217554783, -915483247, -964942091, 1836244249, -1179924073, -1806420190, -1867053034, -1757500462, -1664622159, 1854768859, -455700909, 1211602337, 1993711631, 1282141991};
        f18589a = (char) 31504;
        f18590b = (char) 7094;
        f18591c = (char) 16132;
        f18595h = (char) 27692;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 153;
    }

    private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f18592e;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $11 + 25;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i10 % 128;
                if (i10 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + 676, (char) Color.green(i6), 11 - ((byte) KeyEvent.getModifierMetaStateMask()), -328001469, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i9 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(674 - Process.getGidForName(""), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, -328001469, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i3 = 2;
                i5 = 989264422;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f18592e;
        int i11 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> i11) + 675, (char) Color.red(0), View.getDefaultSize(0, 0) + 12, -328001469, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i12++;
                i11 = 16;
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
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 2;
                    byte b9 = (byte) (b8 - 3);
                    objA4 = o.d.d.a(TextUtils.indexOf("", "", 0) + 301, (char) (52697 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - Drawable.resolveOpacity(0, 0), -1416256172, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
                int i15 = $10 + 55;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
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
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 229;
                char cRed = (char) (51004 - Color.red(0));
                int iGreen = 9 - Color.green(0);
                byte length4 = (byte) $$a.length;
                byte b10 = (byte) (length4 - 5);
                objA5 = o.d.d.a(offsetBefore, cRed, iGreen, -330018025, false, $$c(length4, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        if (str2 != null) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
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
                int i10 = $11 + 79;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i7];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f18591c) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f18595h);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i7] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iIndexOf = 269 - TextUtils.indexOf((CharSequence) "", '0');
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i14 = 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        byte b2 = (byte) (-1);
                        String str$$c = $$c((byte) 52, b2, (byte) (b2 + 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iIndexOf, tapTimeout, i14, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f18589a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18590b)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) (-1);
                        objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0'), (char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, -1995022631, false, $$c((byte) 52, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                byte b4 = (byte) (-1);
                i3 = 2;
                objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 271, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2074123590, false, $$c((byte) 49, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public void onFail(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18594g + 23;
        f18593f = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            k(new int[]{-681346119, -1879715407, 1742193792, 147992468, -1014229340, 730657116, 678934950, -1064032335, 205670257, 864987286, 1030939183, 152480272}, 'H' - AndroidCharacter.getMirror('0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            k(new int[]{1895625204, 1152447553, -1514403686, 1825352644, 1603637797, 842068498, 1589347014, 993181892, 2019629134, -1433030995}, TextUtils.indexOf((CharSequence) "", '0', 0) + 21, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            l("ఁ偿⫎増ሕǨ趄뫈줛猭䴩䬀კ\uea7e桍ᨥ\udd0e勵", TextUtils.indexOf((CharSequence) "", '0') + 19, objArr3);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            k(new int[]{987104573, -1272226206, -1977094662, 2044537377, -743119993, -2097656331}, (ViewConfiguration.getTouchSlop() >> 8) + 11, objArr4);
            StringBuilder sbAppend3 = sbAppend2.append(bundle.getInt(((String) objArr4[0]).intern(), -999));
            Object[] objArr5 = new Object[1];
            k(new int[]{-167991525, -285802973}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr5);
            f.c(strIntern, sbAppend3.append(((String) objArr5[0]).intern()).toString());
            Object[] objArr6 = new Object[1];
            l("ሕǨ趄뫈㱉쟾\udfdf喣䜩῏혡ﾦ昀軂\udbf1瓌ᒏ\ue15e", MotionEvent.axisFromString("") + 19, objArr6);
            if (bundle.containsKey(((String) objArr6[0]).intern())) {
                Object[] objArr7 = new Object[1];
                k(new int[]{-681346119, -1879715407, 1742193792, 147992468, -1014229340, 730657116, 678934950, -1064032335, 205670257, 864987286, 1030939183, 152480272}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, objArr7);
                String strIntern2 = ((String) objArr7[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr8 = new Object[1];
                k(new int[]{1895625204, 1152447553, 1916475757, 1041700766, 1678092704, -3070877, -869854956, 1344465264, 1373281297, 933977806, -1170465293, 784192275, -1980527876, -1131823770, 963675647, -1249596524}, TextUtils.getOffsetBefore("", 0) + 29, objArr8);
                StringBuilder sbAppend4 = sb2.append(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                l("ሕǨ趄뫈㱉쟾\udfdf喣䜩῏혡ﾦ昀軂\udbf1瓌ᒏ\ue15e", TextUtils.getOffsetAfter("", 0) + 18, objArr9);
                f.d(strIntern2, sbAppend4.append(bundle.getString(((String) objArr9[0]).intern())).toString());
            }
        }
        this.f18598d.d(new o.by.c(AntelopErrorCode.SamsungPayWalletNotAvailable));
        int i6 = f18593f + 87;
        f18594g = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void onSuccess(int i2, Bundle bundle) throws Throwable {
        Object obj;
        Object obj2;
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        k(new int[]{-681346119, -1879715407, 1742193792, 147992468, -1014229340, 730657116, 678934950, -1064032335, 205670257, 864987286, 1030939183, 152480272}, Gravity.getAbsoluteGravity(0, 0) + 24, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            k(new int[]{1139779212, -1910793496, -1039690526, -955263473, -787671109, -533907543, -277341382, -290600786, -266599946, 623608793}, ImageFormat.getBitsPerPixel(0) + 21, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            l("ᕿꇂ㚊磊繣ᒍ팎\udf2d嗩귉\ua8c8ݟ", 11 - View.getDefaultSize(0, 0), objArr3);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr3[0]).intern()).append(bundle.toString());
            Object[] objArr4 = new Object[1];
            k(new int[]{-167991525, -285802973}, KeyEvent.keyCodeFromString("") + 1, objArr4);
            f.c(strIntern, sbAppend2.append(((String) objArr4[0]).intern()).toString());
        }
        if (i2 == 0) {
            if (f.a()) {
                int i4 = f18593f + 87;
                f18594g = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr5 = new Object[1];
                    l("ᒏ\ue15e欋ᩄ涁\uf27f옌烢鵡堣犅䓛ଢ଼圹\uec5a\udd9b汷䮣芢凋扫\ue135\ue729\ueecd憮ﮠ䙲퐍蹣뽰竄厂樓뫖푣櫌憮ﮠꇝ毀㕲辠\ua4c8㊊囟⑆綾ᓅ䝖꣭愺桊㑊矹\ue26d衲魍⟜泂쥧틭西䶘꣘㲍ꔪ", 47 - View.getDefaultSize(1, 1), objArr5);
                    obj2 = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    l("ᒏ\ue15e欋ᩄ涁\uf27f옌烢鵡堣犅䓛ଢ଼圹\uec5a\udd9b汷䮣芢凋扫\ue135\ue729\ueecd憮ﮠ䙲퐍蹣뽰竄厂樓뫖푣櫌憮ﮠꇝ毀㕲辠\ua4c8㊊囟⑆綾ᓅ䝖꣭愺桊㑊矹\ue26d衲魍⟜泂쥧틭西䶘꣘㲍ꔪ", 66 - View.getDefaultSize(0, 0), objArr6);
                    obj2 = objArr6[0];
                }
                f.c(strIntern, ((String) obj2).intern());
            }
            this.f18598d.a(c.e.f25298b);
            int i5 = f18593f + 107;
            f18594g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
                return;
            }
            return;
        }
        if (i2 == 1) {
            int i7 = f18594g + 5;
            f18593f = i7 % 128;
            if (i7 % 2 != 0) {
                f.a();
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                l("ᒏ\ue15e欋ᩄ涁\uf27f옌烢鵡堣犅䓛ଢ଼圹\uec5a\udd9b汷䮣芢凋扫\ue135\ue729\ueecd憮ﮠ䙲퐍蹣뽰竄厂樓뫖푣櫌憮ﮠꇝ毀㕲辠\ua4c8㊊囟⑆綾ᓅ䝖꣭愺桊㑊矹\ue26d衲\uf6a4䢮\u1bf8媠鸿簢", 62 - Drawable.resolveOpacity(0, 0), objArr7);
                f.c(strIntern, ((String) objArr7[0]).intern());
            }
            this.f18598d.a(c.e.f25299c);
            return;
        }
        if (i2 == 3) {
            if (f.a()) {
                Object[] objArr8 = new Object[1];
                k(new int[]{1229931521, -1106797102, 993088068, -660555020, 1079681700, -363115150, -1225923379, 483651373, -992836274, 1110043995, 678934950, -1064032335, -734020968, -264736147, 608271930, 1761452963, -478065666, 693066532, -1860104120, -1162911534, 335161524, -1823746721, -787671109, -533907543, 288696047, -424227403, -684654526, 57686548, -1128331427, 100200594, 680875026, 1565315159, -1070430420, -952183637, 70910874, -1856599822, 627402629, -1132242421}, Color.argb(0, 0, 0, 0) + 75, objArr8);
                f.c(strIntern, ((String) objArr8[0]).intern());
            }
            this.f18598d.a(c.e.f25299c);
            return;
        }
        if (i2 != 2) {
            if (!(!f.a())) {
                Object[] objArr9 = new Object[1];
                k(new int[]{1229931521, -1106797102, 993088068, -660555020, 1079681700, -363115150, -1225923379, 483651373, -992836274, 1110043995, 678934950, -1064032335, -734020968, -264736147, 608271930, 1761452963, -478065666, 693066532, -1860104120, -1162911534, 335161524, -1823746721, -787671109, -533907543, -1595387551, -486694688, 1202310665, 193370802}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 53, objArr9);
                f.c(strIntern, ((String) objArr9[0]).intern());
            }
            this.f18598d.a(c.e.f25298b);
            return;
        }
        if (f.a()) {
            int i8 = f18593f + 9;
            f18594g = i8 % 128;
            if (i8 % 2 == 0) {
                Object[] objArr10 = new Object[1];
                l("ᒏ\ue15e欋ᩄ涁\uf27f옌烢鵡堣犅䓛ଢ଼圹\uec5a\udd9b汷䮣芢凋扫\ue135\ue729\ueecd憮ﮠ䙲퐍蹣뽰竄厂樓뫖푣櫌憮ﮠꇝ毀㕲辠\ua4c8㊊囟⑆綾ᓅ䝖꣭愺桊\uf6a4䢮\u1bf8媠鸿簢", 108 - View.MeasureSpec.getMode(0), objArr10);
                obj = objArr10[0];
            } else {
                Object[] objArr11 = new Object[1];
                l("ᒏ\ue15e欋ᩄ涁\uf27f옌烢鵡堣犅䓛ଢ଼圹\uec5a\udd9b汷䮣芢凋扫\ue135\ue729\ueecd憮ﮠ䙲퐍蹣뽰竄厂樓뫖푣櫌憮ﮠꇝ毀㕲辠\ua4c8㊊囟⑆綾ᓅ䝖꣭愺桊\uf6a4䢮\u1bf8媠鸿簢", View.MeasureSpec.getMode(0) + 58, objArr11);
                obj = objArr11[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        this.f18598d.a(c.e.f25300d);
    }
}
