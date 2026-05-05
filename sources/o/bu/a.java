package o.bu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.ea.f;
import o.ea.m;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f21655a = 0;

    /* JADX INFO: renamed from: b */
    private static int f21656b = 0;

    /* JADX INFO: renamed from: c */
    private static int f21657c = 0;

    /* JADX INFO: renamed from: d */
    private static int f21658d = 0;

    /* JADX INFO: renamed from: e */
    private static int f21659e = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, byte r10, short r11) {
        /*
            int r2 = r11 + 4
            byte[] r8 = o.bu.a.$$d
            int r7 = r9 * 2
            int r1 = r7 + 1
            int r0 = r10 * 7
            int r0 = 114 - r0
            byte[] r6 = new byte[r1]
            r5 = 0
            if (r8 != 0) goto L29
            r4 = r5
            r3 = r7
        L13:
            int r0 = -r0
            int r0 = r0 + r3
        L15:
            byte r1 = (byte) r0
            int r2 = r2 + 1
            r6[r4] = r1
            if (r4 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            int r4 = r4 + 1
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L13
        L29:
            r4 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.a.$$j(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21656b = 0;
        f21658d = 1;
        f21657c = 0;
        f21659e = 1;
        e();
        Color.green(0);
        int i2 = f21656b + 123;
        f21658d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    private static String b(Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21657c + 95;
        f21659e = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = f.a();
        String strYd = C1561oA.Yd("䆅䇈Ԭݑ\u1ad2㳪䧺衦𢡄ẳ亗擧燐ꂄ૾೦\uf1e3렣狌\ued06", (short) (C1499aX.Xd() ^ (-17606)));
        if (zA) {
            Object[] objArr = new Object[1];
            f(strYd, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(Xg.qd("ᬢᬂ찉엪糖䁈㋭Č铸祁䷱格૬헞곹逹\udae6﹉䔵矝ٜ⸗峝", (short) (C1580rY.Xd() ^ (-14887)), (short) (C1580rY.Xd() ^ (-28013))), 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            f.c(strIntern2, ((String) objArr2[0]).intern());
            int i5 = f21657c + 59;
            f21659e = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr3 = new Object[1];
        f(Jg.Wd("䌏\ue05c鼳Ⓧ맆ꀫ耎㶐⇁", (short) (FB.Xd() ^ 532), (short) (FB.Xd() ^ 4304)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern()};
        Method method = Class.forName(ZO.xd("\rN!\u0019\u001cm\u001fYG_\u0015;}\u0007\u001b=dXE*_0\u0016", (short) (C1580rY.Xd() ^ (-18671)), (short) (C1580rY.Xd() ^ (-14526)))).getMethod(Ig.wd("3Z&)h\ruO\u0014*Fi\u001e\u000f\t%", (short) (C1607wl.Xd() ^ 13732)), Class.forName(C1626yg.Ud("S\u0005<k\b+i3uQ\n19&?s", (short) (ZN.Xd() ^ 2222), (short) (ZN.Xd() ^ 12787))));
        try {
            method.setAccessible(true);
            TelephonyManager telephonyManager = (TelephonyManager) method.invoke(context, objArr4);
            if (telephonyManager != null) {
                if (Build.VERSION.SDK_INT < 29) {
                    return "";
                }
                int i7 = f21659e + 63;
                f21657c = i7 % 128;
                if (i7 % 2 == 0) {
                    return telephonyManager.getTypeAllocationCode();
                }
                telephonyManager.getTypeAllocationCode();
                throw null;
            }
            if (f.a()) {
                int i8 = f21659e + 83;
                f21657c = i8 % 128;
                int i9 = i8 % 2;
                String strOd = EO.Od("杯䒴ચዛ朜䴰壅ᙻ羼悭夁\u31ea⺺\uf255轕陁茦냮⌥獗儆酜ㆫ婇朋镰뺎떲깖脄퉅飋蒝䫄熂۔掂급\uf7a0攪烛꭪ᗮ侄䮋闫", (short) (FB.Xd() ^ 29063));
                if (i9 != 0) {
                    Object[] objArr5 = new Object[1];
                    f(strYd, -(ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)), objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    f(strOd, -((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
                    obj = objArr6[0];
                } else {
                    Object[] objArr7 = new Object[1];
                    f(strYd, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr7);
                    strIntern = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    f(strOd, -((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
                    obj = objArr8[0];
                }
                f.c(strIntern, ((String) obj).intern());
            }
            int i10 = f21657c + 51;
            f21659e = i10 % 128;
            int i11 = i10 % 2;
            return "";
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void e() {
        f21655a = -5658322355546057601L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 43;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i5 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f21655a ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21655a)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 229, (char) (51005 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 9, 1749983833, false, $$j(b2, b3, (byte) (-b3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getOffsetAfter("", 0), 12 - TextUtils.getTrimmedLength(""), 522683165, false, $$j(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i10 = $11 + 35;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    static void init$0() {
        $$d = new byte[]{121, Base64.padSymbol, 92, -93};
        $$e = 10;
    }

    @Override // o.bu.b
    public final String a(Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21657c + 27;
        f21659e = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = f21659e + 45;
            f21657c = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                f("츃칅ʶӚꝌ쥣홲᳝轆ꬨ\udb0b\uf15a﹂㓵靮饕虑䲐Ｘ腱", -TextUtils.indexOf((CharSequence) "", '\f', 1), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("ᵞᴹ躴裔ḏ\uea26չቱ\uf86f", -ImageFormat.getBitsPerPixel(1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                f("츃칅ʶӚꝌ쥣홲᳝轆ꬨ\udb0b\uf15a﹂㓵靮饕虑䲐Ｘ腱", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f("ᵞᴹ躴裔ḏ\uea26չቱ\uf86f", -ImageFormat.getBitsPerPixel(0), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        o.ea.c.a();
        int i5 = o.ea.b.f23483d * (-465297448);
        o.ea.b.f23483d = i5;
        int i6 = o.ea.b.f23480a * (-1596292587);
        o.ea.b.f23480a = i6;
        return m.c((String) o.ea.b.a(i6, 1544988355, i5, new Object[]{context}, (int) Runtime.getRuntime().freeMemory(), Thread.activeCount(), -1544988354));
    }

    @Override // o.bu.b
    public final int d() {
        int i2 = 2 % 2;
        int i3 = f21657c + 111;
        f21659e = i3 % 128;
        return i3 % 2 == 0 ? 0 : 1;
    }

    @Override // o.bu.b
    public final String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21659e + 43;
            f21657c = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f("츃칅ʶӚꝌ쥣홲᳝轆ꬨ\udb0b\uf15a﹂㓵靮饕虑䲐Ｘ腱", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f("\ude4e\ude29ᮛ᷻嘍ꅷ왨婳댾", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        String strD = d(context);
        if (strD == null) {
            return "";
        }
        int i5 = f21657c;
        int i6 = i5 + 123;
        f21659e = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 19;
        f21659e = i8 % 128;
        int i9 = i8 % 2;
        return strD;
    }

    @Override // o.bu.b
    public final String e(Context context, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21657c + 15;
            f21659e = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f("츃칅ʶӚꝌ쥣홲᳝轆ꬨ\udb0b\uf15a﹂㓵靮饕虑䲐Ｘ腱", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f("⠡⡆汋樫〝᱘〄㱣ฑ", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f21659e + 5;
            f21657c = i5 % 128;
            int i6 = i5 % 2;
        }
        return b(context);
    }
}
