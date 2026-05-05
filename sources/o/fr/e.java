package o.fr;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.k;
import o.a.m;
import o.d.d;
import o.ea.f;
import o.ef.a;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    private static long f26158c = 0;

    /* JADX INFO: renamed from: d */
    private static int f26159d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f26160e = null;

    /* JADX INFO: renamed from: g */
    private static int f26161g = 0;

    /* JADX INFO: renamed from: i */
    private static int f26162i = 0;

    /* JADX INFO: renamed from: j */
    private static int f26163j = 0;

    /* JADX INFO: renamed from: a */
    private final c f26164a = new c();

    /* JADX INFO: renamed from: b */
    private final b f26165b = new b();

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r1 = r8 + 107
            int r2 = r7 + 4
            byte[] r8 = o.fr.e.$$a
            int r0 = r9 * 3
            int r7 = 1 - r0
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L29
            r0 = r2
            r3 = r7
            r4 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L16:
            byte r0 = (byte) r1
            int r4 = r3 + 1
            r6[r3] = r0
            if (r4 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L23:
            int r0 = r2 + 1
            r2 = r8[r0]
            r3 = r1
            goto L12
        L29:
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.e.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26161g = 0;
        f26162i = 1;
        f26159d = 0;
        f26163j = 1;
        b();
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        int i2 = f26162i + 91;
        f26161g = i2 % 128;
        int i3 = i2 % 2;
    }

    static void b() {
        f26158c = -3556490996853199673L;
        f26160e = new char[]{56331, 56729, 56730, 56733, 56738, 56731, 56723, 56728, 56735, 56736, 56439, 56434, 56729, 56730, 56731, 56735, 56734, 56736, 56738, 56440, 56412, 56412, 56433, 56723, 56730, 56735, 56736, 56738, 56440, 56440, 56731, 56723, 56727, 56728, 56730, 56730, 56724, 56724, 56730, 56736, 56439, 56440, 56730, 56731, 56739, 56441, 56438, 56733, 56438, 56405, 56405, 56433, 56734, 56736, 56729, 56725, 56724, 56733, 56733, 56730, 56730, 56500, 56554, 56559, 56558, 56550, 56514, 56519, 56558, 56519, 56514, 56548, 56555, 56560, 56561, 56563, 56521, 56521, 56558, 56516, 56521, 56556, 56548, 56552, 56553, 56555, 56555, 56549, 56549, 56555, 56561, 56520, 56521, 56555, 56556, 56564, 56522, 56486, 56486, 56514, 56559, 56561, 56554, 56550, 56549, 56558, 56558, 56555, 56523, 56345, 56345, 56348, 56348, 56339, 56340, 56344, 56351, 56349, 56560, 56532, 56532, 56560, 56338, 56338, 56344, 56355, 56354, 56352, 56346, 56338, 56560, 56568, 56354, 56346, 56345, 56567, 56566, 56351, 56345, 56339, 56339, 56345, 56345, 56343, 56342, 56338, 56346, 56567, 56539, 56539, 56498, 56555, 56555, 56549, 56549, 56555, 56561, 56520, 56521, 56555, 56556, 56564, 56522, 56515, 56554, 56555, 56561, 56561, 56554, 56550, 56549, 56558, 56558, 56555, 56555, 56516, 56519, 56558, 56561, 56558, 56517, 56514, 56550, 56554, 56550, 56555, 56562, 56555, 56516, 56493, 56493, 56521, 56556, 56548, 56552, 56562, 56322, 56563, 56321, 56560, 56334, 56739, 56739, 56737, 56736, 56732, 56740, 56705, 56445, 56742, 56745, 56742, 56447, 56421, 56421, 56441, 56737, 56742, 56741, 56739, 56742, 56732, 56729, 56721, 56718, 56742, 56743, 56445, 56414, 56414, 56705, 56740, 56739, 56741, 56733, 56734, 56738, 56745, 56743, 56732, 56442, 56441, 56730, 56737, 56739, 56442, 56704, 56745, 56739, 56733, 56497, 56553, 56558, 56557, 56555, 56558, 56548, 56545, 56537, 56534, 56558, 56559, 56517, 56486, 56486, 56514, 56553, 56558, 56562, 56566, 56524, 56513, 56556, 56561, 56518, 56520, 56561, 56555, 56549, 56549, 56555, 56555, 56553, 56552, 56548, 56556, 56498, 56559, 56561, 56554, 56550, 56549, 56557, 56555, 56556, 56521, 56486, 56486, 56517, 56559, 56558, 56534, 56537, 56545, 56548, 56558, 56555, 56557, 56558, 56553, 56513, 56493, 56493, 56519, 56558, 56561, 56558, 56517, 56514};
    }

    private void c(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26163j + 19;
        f26159d = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        h(null, new int[]{195, 5, 15, 1}, true, objArr);
        if (aVar.d(((String) objArr[0]).intern())) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                f("\uf56c\uf539푟◲⋊\uea91壭麏࿈\ued9c巹閇á\ue088囵邻דﮣ䯗", TextUtils.indexOf("", "") + 1, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                f("ﵞﴫ\ueb4b\uf177\u0ffa햆豩뎬ߞ튟褹룼\u0896\udf9b艥북\u0de3쒦齈ꊇᛩ쇦類Ꞝᯨ캮镩굱Ე쭛긣鉰ↀ\uf047ꬿ靺⪛ﵥ", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            c cVar = this.f26164a;
            Object[] objArr4 = new Object[1];
            h(null, new int[]{195, 5, 15, 1}, true, objArr4);
            cVar.a(aVar.x(((String) objArr4[0]).intern()));
        }
        Object[] objArr5 = new Object[1];
        f("픎항澴䄙⾱兿㰎鏵", 1 - KeyEvent.normalizeMetaState(0), objArr5);
        if (aVar.d(((String) objArr5[0]).intern())) {
            int i5 = f26159d + 35;
            f26163j = i5 % 128;
            if (i5 % 2 == 0) {
                f.a();
                obj.hashCode();
                throw null;
            }
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                f("\uf56c\uf539푟◲⋊\uea91壭麏࿈\ued9c巹閇á\ue088囵邻דﮣ䯗", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                f("㫸㪍暳\ud995湄塾ꒋ툒쁸彧ꇛ\ud942켰剣ꪇ\udc3f쩅䥞랪쌹텏䰞낼옵\udc51䌒뷛쳍\udb25䚠蛂\uf3d9\ue631綴菐\uf6c2\ued2b", -ExpandableListView.getPackedPositionChild(0L), objArr7);
                f.c(strIntern2, ((String) objArr7[0]).intern());
            }
            b bVar = this.f26165b;
            Object[] objArr8 = new Object[1];
            f("픎항澴䄙⾱兿㰎鏵", (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr8);
            bVar.b(aVar.x(((String) objArr8[0]).intern()));
        }
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 37;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i4 + 107;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 81 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        k kVar = new k();
        char[] cArrC = k.c(f26158c ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        int i9 = $11 + 75;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        while (kVar.f19939c < cArrC.length) {
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i13 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26158c)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a(KeyEvent.keyCodeFromString("") + 229, (char) (51005 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 9 - Color.argb(0, 0, 0, 0), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    objA2 = d.a(675 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, 522683165, false, $$c(b4, (byte) (7 & b4), (byte) 0), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    private static void h(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f26160e;
        int i9 = -1;
        if (cArr2 != null) {
            int i10 = $10 + 83;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i11 = 0;
            while (i11 < length) {
                int i12 = $11 + 51;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i9;
                        objA = d.a(250 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getTapTimeout() >> 16) + 11, 1376582792, false, $$c(b2, (byte) ((-1) - (((-1) - b2) | ((-1) - 9))), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 2;
                    i9 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(TextUtils.lastIndexOf("", '0', 0) + 12, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - Color.red(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) (-1);
                        objA3 = d.a(835 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 27279), Drawable.resolveOpacity(0, 0) + 11, -1210801192, false, $$c(b3, (byte) ((b3 + Ascii.CR) - (13 | b3)), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a(21 - Color.alpha(0), (char) (35715 - View.getDefaultSize(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
            int i17 = $10 + 117;
            $11 = i17 % 128;
            i2 = 2;
            int i18 = i17 % 2;
        } else {
            i2 = 2;
        }
        if (z2) {
            int i19 = $11 + 37;
            $10 = i19 % 128;
            int i20 = i19 % i2;
            char[] cArr6 = new char[i6];
            mVar.f19943d = 0;
            while (mVar.f19943d < i6) {
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                mVar.f19943d++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i21 = $11 + 27;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            mVar.f19943d = 0;
            while (mVar.f19943d < i6) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{127, 52, 116, 98};
        $$b = 178;
    }

    public final c a() {
        int i2 = 2 % 2;
        int i3 = f26159d;
        int i4 = i3 + 65;
        f26163j = i4 % 128;
        int i5 = i4 % 2;
        c cVar = this.f26164a;
        int i6 = i3 + 55;
        f26163j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return cVar;
    }

    public final void a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26163j + 53;
        f26159d = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(Jg.Wd("\ue2edঠ豚樌쯫Ǆ螻ၼ桻Ԛ㉲먡︔㠀쟛岼꧋\ue1ac莂\ue851䢄蕠ㄕ觚\uda36㘄쒞㱃襯틑茯엤⌜艫ⳝ桤멯㠭쑱ᰎ敁힊痲궧\u0ade豂㒢儯긐㷽쫸", (short) (FB.Xd() ^ 29604), (short) (FB.Xd() ^ 18644)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(ZO.xd("\n0\u0012\tR\\e\u001fH\u00039I:{.\\s\\TWEyV", (short) (C1499aX.Xd() ^ (-19168)), (short) (C1499aX.Xd() ^ (-657)))).getMethod(Ig.wd("\u007f2-m\u0010\\\f\u00065Qu\u000b<A^{+2lR", (short) (Od.Xd() ^ (-25812))), Class.forName(C1626yg.Ud("y\u001akwJ@m\f=X|\u00049D3\u007f", (short) (C1607wl.Xd() ^ 22001), (short) (C1607wl.Xd() ^ 5800))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            short sXd = (short) (C1633zX.Xd() ^ (-32112));
            int[] iArr = new int["꽎鉏ꭽ錕豑唶".length()];
            QB qb = new QB("꽎鉏ꭽ錕豑唶");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + i5)) + xuXd.CK(iKK));
                i5++;
            }
            try {
                Object[] objArr3 = new Object[1];
                f(new String(iArr, 0, i5), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr3);
                String string = sharedPreferences.getString(((String) objArr3[0]).intern(), "");
                boolean zIsEmpty = string.isEmpty();
                String strQd = C1561oA.Qd("ڞ\u0018\u0017ڛښڙژڗ\u0011ڕڔ\u000e\r\f\u000bڏ\t\b\u0007\u0006ڊډڈ\u0002\u0001\u007f~}|{ڀٿxwvutsrٷٶٵnٳٲkjiٮgfedcba٦_^]\\", (short) (C1633zX.Xd() ^ (-22603)));
                short sXd2 = (short) (ZN.Xd() ^ 23638);
                short sXd3 = (short) (ZN.Xd() ^ 18804);
                int[] iArr2 = new int["힖흤뚋ࠟﳸ쳀㬝胀\ue9fa쿏䀭瞼ź슿㤭狴ٰ\uddde⸓".length()];
                QB qb2 = new QB("힖흤뚋ࠟﳸ쳀㬝胀\ue9fa쿏䀭瞼ź슿㤭狴ٰ\uddde⸓");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i6)) - sXd3);
                    i6++;
                }
                String str = new String(iArr2, 0, i6);
                if (zIsEmpty) {
                    if (f.a()) {
                        int i7 = f26163j + 73;
                        f26159d = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr4 = new Object[1];
                        f(str, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                        String strIntern = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        h(strQd, new int[]{0, 61, 175, 0}, true, objArr5);
                        f.c(strIntern, ((String) objArr5[0]).intern());
                        return;
                    }
                    return;
                }
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    f(str, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr6);
                    String strIntern2 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    h(C1561oA.od("\u0016ϝϜϛ\u0012ϙϘ\u000f\u000eϕ\f\u000b\n\t\b\u0007\u0006ύ\u0004\u0003ϊω\u007f~}|{zyρποuνμrqponmlkγihg", (short) (C1580rY.Xd() ^ (-1294))), new int[]{61, 47, 0, 1}, true, objArr7);
                    f.c(strIntern2, ((String) objArr7[0]).intern());
                }
                String strC = new o.dk.a(context).c(string);
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    f(str, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr8);
                    String strIntern3 = ((String) objArr8[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr9 = new Object[1];
                    h(C1561oA.Kd("\u0003\u0004\u0005\u0006\u0007ń\t\n\u000b\f\r\u000e\u000fŌ\u0011Ŏ\u0013\u0014\u0015Œ\u0017\u0018ŕ\u001aŗŘ\u001dŚśŜ!\"#$%&'Ťť*ŧŨ", (short) (C1580rY.Xd() ^ (-7037))), new int[]{108, 42, 46, 0}, false, objArr9);
                    f.c(strIntern3, sb.append(((String) objArr9[0]).intern()).append(strC).toString());
                }
                if (strC != null && !strC.isEmpty()) {
                    try {
                        c(new a(strC));
                        return;
                    } catch (o.ef.b e2) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr10 = new Object[1];
                        f(Wg.Zd("嬵ꢝ뾦\ueedb馑퐰䦴Ⱔ\u0ee5ਿ珆浽䋹䍻글魂盺膥\ue826핐訍ꮎ╕⭲\uee3e觔筊汭᪻묛禴妐结딻龬鎪닮\uf37d\ue4c2쥫\ue5a1", (short) (FB.Xd() ^ 8520), (short) (FB.Xd() ^ 8308)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr10);
                        throw new o.ef.b(sb2.append(((String) objArr10[0]).intern()).append(e2.getMessage()).toString());
                    }
                }
                if (f.a()) {
                    Object[] objArr11 = new Object[1];
                    f(str, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr11);
                    String strIntern4 = ((String) objArr11[0]).intern();
                    Object[] objArr12 = new Object[1];
                    h(strQd, new int[]{0, 61, 175, 0}, true, objArr12);
                    f.c(strIntern4, ((String) objArr12[0]).intern());
                }
            } catch (o.ef.b e3) {
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr13 = new Object[1];
                h(C1561oA.Xd(" !\"#$%ЍЎЏ)БВ,-./0123Л56789С;У=ХЦ@ABCЫEFЮЯIбвL", (short) (C1633zX.Xd() ^ (-28478))), new int[]{150, 45, 0, 38}, true, objArr13);
                throw new o.en.f(sb3.append(((String) objArr13[0]).intern()).append(e3.getMessage()).toString());
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final b c() {
        int i2 = 2 % 2;
        int i3 = f26159d + 107;
        f26163j = i3 % 128;
        int i4 = i3 % 2;
        b bVar = this.f26165b;
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        return bVar;
    }

    public final void c(Context context) {
        String strIntern;
        String strIntern2;
        String strE;
        String strVd = Wg.vd("揢摎緼桲篬䒫", (short) (C1580rY.Xd() ^ (-27197)));
        int i2 = 2 % 2;
        int iResolveSizeAndState = 1 - View.resolveSizeAndState(0, 0, 0);
        Object[] objArr = new Object[1];
        short sXd = (short) (C1580rY.Xd() ^ (-32135));
        short sXd2 = (short) (C1580rY.Xd() ^ (-6136));
        int[] iArr = new int["辽辉溮례딗蓝\ueb38㣙ꈑ蟤\uf040⿍д竌\ue938⫽ơ闣\ude16".length()];
        QB qb = new QB("辽辉溮례딗蓝\ueb38㣙ꈑ蟤\uf040⿍д竌\ue938⫽ơ闣\ude16");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        f(new String(iArr, 0, i3), iResolveSizeAndState, objArr);
        String strIntern3 = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f(hg.Vd("尿尘웨賐훅ۀ↡誘쪭ܳⓀ閅솮鮰ᮁ選쒽꓄⺰筵뮾ꇐ㖛癖껈ꪼ⢌聇땩ꛡ㽵歀ꡮ꿣䉫昨齉볽㥗焪ꉳ뗢㱀尋饸싲午囫鰂찕䤦", (short) (C1499aX.Xd() ^ (-19953)), (short) (C1499aX.Xd() ^ (-22568))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr2);
        String strIntern4 = ((String) objArr2[0]).intern();
        short sXd3 = (short) (OY.Xd() ^ 2941);
        int[] iArr2 = new int["EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB".length()];
        QB qb2 = new QB("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2));
            i4++;
        }
        Object[] objArr3 = {strIntern4, 0};
        Method method = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.Yd("feuUkewkkX{oqq\u007fs}sv\u0006", (short) (OY.Xd() ^ 19020)), Class.forName(C1561oA.yd("4,>*{;-;)p\u00135802,", (short) (FB.Xd() ^ 18505))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr3);
            try {
                a aVar = new a();
                a aVarA = this.f26164a.a();
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int i5 = a.f23768b * 408478217;
                a.f23768b = i5;
                Object obj = null;
                if (((Integer) a.a(-1670499501, new Object[]{aVarA}, i5, (int) Thread.currentThread().getId(), 1670499501, iActiveCount, priority)).intValue() != 0) {
                    if (f.a()) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        h(Xg.qd("<=>?@ӘәCӛEӝGӟӠӡKӣӤӥӦPӨRSTӬӭWXYZӲ\\]ӵ_`abcӻeӽgӿԀԁԂlm", (short) (Od.Xd() ^ (-26700)), (short) (Od.Xd() ^ (-8510))), new int[]{200, 50, 184, 15}, false, objArr4);
                        f.c(strIntern3, sb.append(((String) objArr4[0]).intern()).append(aVarA.e()).toString());
                    }
                    Object[] objArr5 = new Object[1];
                    h(null, new int[]{195, 5, 15, 1}, true, objArr5);
                    aVar.a(((String) objArr5[0]).intern(), aVarA);
                } else if (f.a()) {
                    int i6 = f26163j + 73;
                    f26159d = i6 % 128;
                    int i7 = i6 % 2;
                    String strWd = Jg.Wd("욼踝䆵\ua954˂赃綡椃쨯缲枾仩뀠崩䖣㓙ꇐ㽡⾂\u1ad7耏ⴚᶺ\uf8df懘༓\uef59\udf36䟰\uf4c2ᕖ셂稃훨ཕ款執들\ue57b唛㧙", (short) (C1607wl.Xd() ^ 28957), (short) (C1607wl.Xd() ^ 23450));
                    if (i7 != 0) {
                        Color.alpha(1);
                        Object[] objArr6 = new Object[1];
                        f(strWd, 0, objArr6);
                        strIntern = ((String) objArr6[0]).intern();
                    } else {
                        Object[] objArr7 = new Object[1];
                        f(strWd, Color.alpha(0) + 1, objArr7);
                        strIntern = ((String) objArr7[0]).intern();
                    }
                    f.c(strIntern3, strIntern);
                }
                a aVarE = this.f26165b.e();
                int iActiveCount2 = Thread.activeCount();
                int priority2 = Thread.currentThread().getPriority();
                int i8 = a.f23768b * 408478217;
                a.f23768b = i8;
                if (((Integer) a.a(-1670499501, new Object[]{aVarE}, i8, (int) Thread.currentThread().getId(), 1670499501, iActiveCount2, priority2)).intValue() != 0) {
                    int i9 = f26159d + 43;
                    f26163j = i9 % 128;
                    if (i9 % 2 == 0) {
                        f.a();
                        obj.hashCode();
                        throw null;
                    }
                    if (f.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr8 = new Object[1];
                        f(ZO.xd("ㆁ뉘黰衄\ue5ef䲽℄왐╵\uf18e孉䐤通蔝\ude0a줌䀘鎻疵\ueca2슉⋮\ueee6袾㾢넟ᅹ㕤五䌸醊얇\udc79䑜\ud929佃锣쎞䵞섹ဣ㰪䲈㬴禎陊踦缴뛁槆쉹헩Ʀ", (short) (OY.Xd() ^ 24821), (short) (OY.Xd() ^ 11087)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr8);
                        f.c(strIntern3, sb2.append(((String) objArr8[0]).intern()).append(aVarE.e()).toString());
                    }
                    Object[] objArr9 = new Object[1];
                    f(C1626yg.Ud("翤쨸厃䗎⼸攠ꊩ폢", (short) (C1633zX.Xd() ^ (-20130)), (short) (C1633zX.Xd() ^ (-28739))), 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                    aVar.a(((String) objArr9[0]).intern(), aVarE);
                } else if (f.a()) {
                    int i10 = f26159d + 25;
                    f26163j = i10 % 128;
                    int i11 = i10 % 2;
                    String strWd2 = Ig.wd("3ɕǦԅ¤Rߓ\u0002[\\\u05fb֠RJ8[ŋ\u0007Δ\u0003l\u0016\u0002\u0004mǒĳZ:\nkQ'\u000fՊҏ", (short) (ZN.Xd() ^ 19644));
                    if (i11 == 0) {
                        Object[] objArr10 = new Object[1];
                        h(strWd2, new int[]{250, 36, 0, 0}, true, objArr10);
                        strIntern2 = ((String) objArr10[0]).intern();
                    } else {
                        Object[] objArr11 = new Object[1];
                        h(strWd2, new int[]{250, 36, 0, 0}, false, objArr11);
                        strIntern2 = ((String) objArr11[0]).intern();
                    }
                    f.c(strIntern3, strIntern2);
                }
                int iActiveCount3 = Thread.activeCount();
                int priority3 = Thread.currentThread().getPriority();
                int i12 = a.f23768b * 408478217;
                a.f23768b = i12;
                if (((Integer) a.a(-1670499501, new Object[]{aVar}, i12, (int) Thread.currentThread().getId(), 1670499501, iActiveCount3, priority3)).intValue() != 0) {
                    if (f.a()) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr12 = new Object[1];
                        h(EO.Od("l\u001a\ncUšIRߓ\u007f{_\u000bϔߦ\u0019FNԮ\"˼֬ؗҘ0ɪʉǠ[؟1ۧވ", (short) (ZN.Xd() ^ 15860)), new int[]{286, 33, 0, 24}, true, objArr12);
                        f.c(strIntern3, sb3.append(((String) objArr12[0]).intern()).append(aVar.e()).toString());
                    }
                    strE = new o.dk.a(context).e(aVar.e());
                    if (f.a()) {
                        Object[] objArr13 = new Object[1];
                        f(C1561oA.Qd("ᔊᒪ痗珻儾掆ꛭ赥蚕岍\uabfe陳腢榐ꃟ魿簮ګ闂鲏睒Ͻ髰ꆁ牜塞迒ꮏ洽喹쒊겝桀纼즞뇠挰讚뺫몢幎蒍쎳뿰夂熐뢟삿", (short) (OY.Xd() ^ 12705)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr13);
                        f.c(strIntern3, ((String) objArr13[0]).intern());
                    }
                } else {
                    if (f.a()) {
                        short sXd4 = (short) (ZN.Xd() ^ 6011);
                        short sXd5 = (short) (ZN.Xd() ^ 18711);
                        int[] iArr3 = new int["άἏ簅蚺䢅閺䧊쓎㣜铏任질⧑远埔컼⺅ꚨ岷폷䟆ꇃ市\ud904㳨ꃭ拧\udf11㷃鰐⮡ځ劳猰ァЎ䯐湖㈗깅傞浻㛔댾憣衜㿆롽枌罵䉺".length()];
                        QB qb3 = new QB("άἏ簅蚺䢅閺䧊쓎㣜铏任질⧑远埔컼⺅ꚨ岷폷䟆ꇃ市\ud904㳨ꃭ拧\udf11㷃鰐⮡ځ劳猰ァЎ䯐湖㈗깅傞浻㛔댾憣衜㿆롽枌罵䉺");
                        int i13 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i13] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i13)) - sXd5);
                            i13++;
                        }
                        Object[] objArr14 = new Object[1];
                        f(new String(iArr3, 0, i13), -TextUtils.lastIndexOf("", '0'), objArr14);
                        f.c(strIntern3, ((String) objArr14[0]).intern());
                    }
                    strE = "";
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Object[] objArr15 = new Object[1];
                f(strVd, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                editorEdit.putString(((String) objArr15[0]).intern(), strE).commit();
                this.f26165b.b();
                this.f26164a.d();
            } catch (o.ef.b e2) {
                if (f.a()) {
                    int doubleTapTimeout = 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr16 = new Object[1];
                    short sXd6 = (short) (Od.Xd() ^ (-23985));
                    int[] iArr4 = new int["麈麪쯏ᨶ㘖ኞ轀꧙篥ඃ鈙ꃋ竐࢈褺鯷痼ﭬ篕髰賗\uf69e苿阞蟑\uf1af痢Ԑ蜤\uebb3泤쭻截\ue6f7濦왮夝\ue1db暸뵞叿\udcd4榳뢍狵ퟋ悤뜨湅틭垖뉶救췲婸焰䂌僧兓汁㼒䰄䑛欱㨪䛺䭘晇".length()];
                    QB qb4 = new QB("麈麪쯏ᨶ㘖ኞ轀꧙篥ඃ鈙ꃋ竐࢈褺鯷痼ﭬ篕髰賗\uf69e苿阞蟑\uf1af痢Ԑ蜤\uebb3泤쭻截\ue6f7濦왮夝\ue1db暸뵞叿\udcd4榳뢍狵ퟋ悤뜨湅틭垖뉶救췲婸焰䂌僧兓汁㼒䰄䑛欱㨪䛺䭘晇");
                    int i14 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i14] = xuXd4.fK(sXd6 + sXd6 + i14 + xuXd4.CK(iKK4));
                        i14++;
                    }
                    f(new String(iArr4, 0, i14), doubleTapTimeout, objArr16);
                    f.e(strIntern3, ((String) objArr16[0]).intern(), e2);
                }
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                Object[] objArr17 = new Object[1];
                f(strVd, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr17);
                editorEdit2.putString(((String) objArr17[0]).intern(), "").commit();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void d() {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f26163j + 117;
            f26159d = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                f("\uf56c\uf539푟◲⋊\uea91壭麏࿈\ued9c巹閇á\ue088囵邻דﮣ䯗", 1 / Drawable.resolveOpacity(0, 1), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("\ue24b\ue22d馁\ua637䟋Ꝑ\udb38ﮏᣗ", 1 - ExpandableListView.getPackedPositionGroup(1L), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                f("\uf56c\uf539푟◲⋊\uea91壭麏࿈\ued9c巹閇á\ue088囵邻דﮣ䯗", 1 - Drawable.resolveOpacity(0, 0), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f("\ue24b\ue22d馁\ua637䟋Ꝑ\udb38ﮏᣗ", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        this.f26164a.e();
        this.f26165b.c();
        int i4 = f26159d + 55;
        f26163j = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r10 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.fr.e.f26159d
            int r1 = r0 + 41
            int r0 = r1 % 128
            o.fr.e.f26163j = r0
            int r1 = r1 % r2
            o.fr.c r0 = r10.f26164a
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            long r0 = android.os.SystemClock.uptimeMillis()
            int r5 = (int) r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            int r8 = (int) r0
            int r4 = o.fr.c.f26140c
            r0 = 1682793917(0x644d65bd, float:1.5155654E22)
            int r4 = r4 * r0
            o.fr.c.f26140c = r4
            int r6 = android.os.Process.myUid()
            r3 = 520817126(0x1f0b09e6, float:2.9442583E-20)
            r9 = -520817126(0xffffffffe0f4f61a, float:-1.41210595E20)
            java.lang.Object r0 = o.fr.c.e(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == r3) goto L56
            int r0 = o.fr.e.f26159d
            int r1 = r0 + 41
            int r0 = r1 % 128
            o.fr.e.f26163j = r0
            int r1 = r1 % r2
            r2 = 0
            if (r1 != 0) goto L57
            o.fr.b r0 = r10.f26165b
            boolean r1 = r0.d()
            r0 = 32
            int r0 = r0 / r2
            if (r1 == 0) goto L60
        L56:
            return r3
        L57:
            o.fr.b r0 = r10.f26165b
            boolean r0 = r0.d()
            if (r0 == 0) goto L60
            goto L56
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.e.e():boolean");
    }
}
