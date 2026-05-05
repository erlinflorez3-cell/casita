package o.fm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import o.a.k;
import o.ea.f;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    public static int f26082b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26083c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26084d = 0;

    /* JADX INFO: renamed from: g */
    private static int f26085g = 0;

    /* JADX INFO: renamed from: h */
    private static int f26086h = 0;

    /* JADX INFO: renamed from: i */
    private static long f26087i = 0;

    /* JADX INFO: renamed from: j */
    private static int f26088j = 0;

    /* JADX INFO: renamed from: n */
    private static int f26089n = 0;

    /* JADX INFO: renamed from: f */
    private boolean f26092f;

    /* JADX INFO: renamed from: e */
    private final Set<o.en.e> f26091e = new HashSet();

    /* JADX INFO: renamed from: a */
    private List<o.en.d> f26090a = new ArrayList();

    /* JADX INFO: renamed from: o.fm.h$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        private static int f26093a = 0;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f26094b;

        /* JADX INFO: renamed from: d */
        private static int f26095d = 1;

        static {
            int[] iArr = new int[o.en.e.values().length];
            f26094b = iArr;
            try {
                iArr[o.en.e.f24189b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26094b[o.en.e.f24190c.ordinal()] = 2;
                int i2 = f26095d + 79;
                f26093a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26094b[o.en.e.f24191e.ordinal()] = 3;
                int i4 = f26093a;
                int i5 = ((i4 + 103) - (103 | i4)) + ((i4 + 103) - (i4 & 103));
                f26095d = i5 % 128;
                int i6 = i5 % 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, int r11) {
        /*
            int r0 = r11 * 7
            int r8 = r0 + 107
            int r7 = r9 + 4
            byte[] r6 = o.fm.h.$$a
            int r1 = r10 * 4
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2d
            r0 = r8
            r2 = r4
            r1 = r7
        L16:
            int r0 = -r0
            int r7 = r7 + r0
            r8 = r7
            r7 = r1
        L1a:
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r2 = r2 + 1
            int r1 = r7 + 1
            r0 = r6[r1]
            r7 = r8
            goto L16
        L2d:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.h.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26084d = 434116371;
        f26083c = 1346255620;
        f26082b = -1648070287;
        f26086h = 0;
        f26089n = 1;
        f26088j = 0;
        f26085g = 1;
        b();
        ViewConfiguration.getTouchSlop();
        TextUtils.lastIndexOf("", '0', 0, 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        int i2 = f26089n + 85;
        f26086h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    h() {
    }

    static void b() {
        f26087i = 2390220821848213731L;
    }

    private static void b(Context context, o.en.e eVar) throws Throwable {
        int i2 = 2 % 2;
        Class<?> clsB = eVar.b();
        if (clsB != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (C1633zX.Xd() ^ (-577)), (short) (C1633zX.Xd() ^ (-15363)))).getMethod(C1561oA.od("}z\tcst{purYlxjolx", (short) (ZN.Xd() ^ 7130)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {new ComponentName(context, clsB), 2, 1};
                Method method2 = Class.forName(C1561oA.Kd("Yg^mkfb-cppwisz5xv8[mpypwv_t\u0003v}|\u000b", (short) (ZN.Xd() ^ 23875))).getMethod(C1561oA.Xd("\u0007y\nY\u0007\u0006\n\n\n\u0002\f\u0013d\u000f\u0003\u0005\u0010\n\ny\r\u001d\u001e\u0014\u001a\u0014", (short) (FB.Xd() ^ 14162)), Class.forName(Wg.Zd("ZO\u001d\u0014hK\u001eP]J)\u0010`J0J?K\"\rdK\u001b\fj,\u0018\u0004\\", (short) (C1633zX.Xd() ^ (-17912)), (short) (C1633zX.Xd() ^ (-25899)))), Integer.TYPE, Integer.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr2);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int i3 = f26085g + 35;
        f26088j = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            k(EO.Od("ĿÖᝏ\ud9c7ﲾ穆鄿Ꮿ䌽购ኆ鵳땝㢗甋た\u0df9쉩듀뿱痷䂁䏮", (short) (C1580rY.Xd() ^ (-10510))), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            int minimumFlingVelocity = 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            Object[] objArr4 = new Object[1];
            short sXd = (short) (FB.Xd() ^ 11622);
            int[] iArr = new int["ꉐꈫﴪ䟙뽉氉\uf62a筿䱂荂슶\ue1ef훗\ueabcύ影绱䁫ꭃ딋ᆚ쎎১꒛鏈ㄋ矰∴䀜绫\ueec9疸쩢ແ䒥捕勩毲뜙\ud925\ufd91뾾㕩Λ螩䕎萋㘫\u1bf4\uab1d都馮빖\uf2c7炘\uf765䝄蟊쌬\ued40턘\ueb67㥘屩箲Н꿦".length()];
            QB qb = new QB("ꉐꈫﴪ䟙뽉氉\uf62a筿䱂荂슶\ue1ef훗\ueabcύ影绱䁫ꭃ딋ᆚ쎎১꒛鏈ㄋ矰∴䀜绫\ueec9疸쩢ແ䒥捕勩毲뜙\ud925\ufd91뾾㕩Λ螩䕎萋㘫\u1bf4\uab1d都馮빖\uf2c7炘\uf765䝄蟊쌬\ued40턘\ueb67㥘屩箲Н꿦");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(sXd + sXd + sXd + i5 + xuXd.CK(iKK));
                i5++;
            }
            k(new String(iArr, 0, i5), minimumFlingVelocity, objArr4);
            f.c(strIntern, String.format(((String) objArr4[0]).intern(), eVar));
        }
        int i6 = f26085g + 73;
        f26088j = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if ((!r4.equals(r6.f26091e)) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r4.equals(r6.f26091e) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r1 = o.fm.h.f26088j + 15;
        o.fm.h.f26085g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(android.content.Context r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            java.util.HashSet r4 = new java.util.HashSet
            java.util.Set<o.en.e> r0 = r6.f26091e
            r4.<init>(r0)
            o.en.e r1 = o.en.e.f24190c
            java.util.List<o.en.d> r0 = r6.f26090a
            r6.d(r7, r1, r0)
            o.en.e r1 = o.en.e.f24189b
            java.util.List<o.en.d> r0 = r6.f26090a
            r6.d(r7, r1, r0)
            o.en.e r1 = o.en.e.f24191e
            java.util.List<o.en.d> r0 = r6.f26090a
            r6.d(r7, r1, r0)
            int r0 = r4.size()
            r3 = 0
            if (r0 == 0) goto L3e
            int r0 = o.fm.h.f26088j
            int r1 = r0 + 97
            int r0 = r1 % 128
            o.fm.h.f26085g = r0
            int r1 = r1 % r5
            r2 = 1
            if (r1 != 0) goto L3f
            java.util.Set<o.en.e> r0 = r6.f26091e
            boolean r1 = r4.equals(r0)
            r0 = 9
            int r0 = r0 / r3
            r1 = r1 ^ r2
            if (r1 == r2) goto L47
        L3e:
            return r3
        L3f:
            java.util.Set<o.en.e> r0 = r6.f26091e
            boolean r0 = r4.equals(r0)
            if (r0 == r2) goto L3e
        L47:
            int r0 = o.fm.h.f26088j
            int r1 = r0 + 15
            int r0 = r1 % 128
            o.fm.h.f26085g = r0
            int r1 = r1 % r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.h.b(android.content.Context):boolean");
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i4 | i2 | i5;
        int i9 = ~i5;
        int i10 = ~((i9 + i2) - (i9 & i2));
        int i11 = (i10 + i4) - (i10 & i4);
        int i12 = ~((~i4) | i2);
        int i13 = i4 + i2 + i7 + (1132004924 * i6) + ((-2047965933) * i3);
        int i14 = i13 * i13;
        int i15 = ((1650805025 * i4) - 289800192) + ((-1513965855) * i2) + ((-565098208) * i8) + (i11 * 565098208) + (565098208 * i12) + ((-2079064064) * i7) + (1823473664 * i6) + (830210048 * i3) + ((-1143341056) * i14);
        int i16 = ((i4 * (-767560105)) - 1188649921) + (i2 * (-767559017)) + (i8 * (-544)) + (i11 * 544) + (i12 * 544) + (i7 * (-767559561)) + (i6 * 1544553956) + (i3 * (-1468578859)) + (i14 * (-2108293120));
        return i15 + ((i16 * i16) * (-2075787264)) != 1 ? e(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        h hVar = (h) objArr[0];
        o.en.e eVar = (o.en.e) objArr[1];
        int i2 = 2 % 2;
        int i3 = f26085g + 77;
        f26088j = i3 % 128;
        int i4 = i3 % 2;
        Set<o.en.e> set = hVar.f26091e;
        if (i4 != 0) {
            set.contains(eVar);
            throw null;
        }
        boolean zContains = set.contains(eVar);
        int i5 = f26088j + 59;
        f26085g = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zContains);
    }

    private static void c(Context context, o.en.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26088j + 99;
        f26085g = i3 % 128;
        int i4 = i3 % 2;
        Class<?> clsB = eVar.b();
        if (clsB != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\".#0,%\u001fg\u001c'%*\u001a\"'_s\u001f\u001d\"\u0012$\u001f", (short) (C1633zX.Xd() ^ (-10281)), (short) (C1633zX.Xd() ^ (-12651)))).getMethod(C1561oA.ud("# .\t\u0019\u001a!\u0016\u001b\u0018~\u0012\u001e\u0010\u0015\u0012\u001e", (short) (FB.Xd() ^ 15789)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {new ComponentName(context, clsB), 1, 1};
                Method method2 = Class.forName(C1561oA.yd(".<3B@;7\u0002(55<.8?y-+l\u0010\"%.%\u001c\u001b\u0004\u0019'\u001b\"!\u001f", (short) (C1499aX.Xd() ^ (-27948)))).getMethod(Xg.qd("eXh8edhhh`jqCmacnhhXk{|rxr", (short) (C1607wl.Xd() ^ 12324), (short) (C1607wl.Xd() ^ 7904)), Class.forName(C1561oA.Yd("LZQ`^YU Vccj\\fm(>kjnnnfpwRfsl", (short) (ZN.Xd() ^ 17905))), Integer.TYPE, Integer.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr2);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int i5 = f26085g + 5;
        f26088j = i5 % 128;
        if (i5 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            k(Wg.vd("ه\u05f6\uee4a베\ue8fd昿糖露〦砌\uf4d1蜖黔↚橺▦אַ댊ꔻ믚熠㣶㮿", (short) (Od.Xd() ^ (-21181))), TextUtils.indexOf("", "") + 1, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            int absoluteGravity = 1 - Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr4 = new Object[1];
            short sXd = (short) (OY.Xd() ^ 9182);
            short sXd2 = (short) (OY.Xd() ^ 25334);
            int[] iArr = new int["ਕਯ競ⷌศ냺⇺鎒\ue805\ue15eὟ\uedd8噳裋趱漚䌼䘻牋\ud909꧁ꆏ\ud8bb걟\u177c䛘䳤㷻ﰤﴁ㮈馩櫆撝馥欚켽ቁᗵ\uf4ea뵉뵑\uf451塊⮡⫃士⧛迊줞뻾떅纨炀땵ᾛ\ue2fd\ue5d4⇐\ue0b8僧襂耶瑇㼼".length()];
            QB qb = new QB("ਕਯ競ⷌศ냺⇺鎒\ue805\ue15eὟ\uedd8噳裋趱漚䌼䘻牋\ud909꧁ꆏ\ud8bb걟\u177c䛘䳤㷻ﰤﴁ㮈馩櫆撝馥欚켽ቁᗵ\uf4ea뵉뵑\uf451塊⮡⫃士⧛迊줞뻾떅纨炀땵ᾛ\ue2fd\ue5d4⇐\ue0b8僧襂耶瑇㼼");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(((sXd + i6) + xuXd.CK(iKK)) - sXd2);
                i6++;
            }
            k(new String(iArr, 0, i6), absoluteGravity, objArr4);
            f.c(strIntern, String.format(((String) objArr4[0]).intern(), eVar));
        }
        int i7 = f26085g + 79;
        f26088j = i7 % 128;
        int i8 = i7 % 2;
    }

    private void d(Context context, o.en.e eVar, List<o.en.d> list) throws Throwable {
        int i2 = 2 % 2;
        if (eVar.c(list)) {
            int i3 = f26085g + 105;
            f26088j = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                k("͕̅⽞\uf5b5⨏齒뗦㩉楄넫㗭쀳ퟮ媵ꎒ庿㰴\uec11\ude3f\uf4dfꪢ燹璿", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sbAppend = new StringBuilder().append(eVar.name());
                Object[] objArr2 = new Object[1];
                k("㈖㈶찾ᛂᇉ꒕쑽䯗堐剓ฺ놜", View.MeasureSpec.getSize(0) + 1, objArr2);
                f.c(strIntern, sbAppend.append(((String) objArr2[0]).intern()).toString());
            }
            this.f26091e.add(eVar);
            c(context, eVar);
            return;
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            k("͕̅⽞\uf5b5⨏齒뗦㩉楄넫㗭쀳ퟮ媵ꎒ庿㰴\uec11\ude3f\uf4dfꪢ燹璿", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sbAppend2 = new StringBuilder().append(eVar.name());
            Object[] objArr4 = new Object[1];
            k("璻璛\ue0e1㨜\udc61椺蘐নẾ纃쎛\uf3e2ꀗ", View.resolveSizeAndState(0, 0, 0) + 1, objArr4);
            f.c(strIntern2, sbAppend2.append(((String) objArr4[0]).intern()).toString());
        }
        this.f26091e.remove(eVar);
        b(context, eVar);
        int i5 = f26088j + 31;
        f26085g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        h hVar = (h) objArr[0];
        Context context = (Context) objArr[1];
        o.en.d[] dVarArr = (o.en.d[]) objArr[2];
        int i2 = 2 % 2;
        int i3 = f26085g + 121;
        f26088j = i3 % 128;
        int i4 = i3 % 2;
        hVar.f26092f = false;
        hVar.f26090a = Arrays.asList(dVarArr);
        boolean zB = hVar.b(context);
        int i5 = f26085g + 85;
        f26088j = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zB);
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{7, 42, -92, 85};
        $$b = 221;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 13;
        $10 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f26087i ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26087i)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 229, (char) (51004 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 9, 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(675 - View.resolveSize(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 522683165, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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

    public final Set<o.en.e> a() {
        int i2 = 2 % 2;
        int i3 = f26088j;
        int i4 = i3 + 31;
        f26085g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Set<o.en.e> set = this.f26091e;
        int i5 = i3 + 11;
        f26085g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            java.util.Set<o.en.e> r0 = r5.f26091e
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            int r0 = o.fm.h.f26088j
            int r1 = r0 + 13
            int r0 = r1 % 128
            o.fm.h.f26085g = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L5a
            return
        L1b:
            int r0 = o.fm.h.f26088j
            int r1 = r0 + 65
            int r0 = r1 % 128
            o.fm.h.f26085g = r0
            int r1 = r1 % r4
            r2 = 1
            if (r1 != 0) goto L45
            java.lang.Object r0 = r3.next()
            o.en.e r0 = (o.en.e) r0
            int[] r1 = o.fm.h.AnonymousClass2.f26094b
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 54
            int r0 = r0 / 0
            if (r1 == r2) goto L56
        L3b:
            int r0 = o.fm.h.f26085g
            int r1 = r0 + 43
            int r0 = r1 % 128
            o.fm.h.f26088j = r0
            int r1 = r1 % r4
            goto L9
        L45:
            java.lang.Object r0 = r3.next()
            o.en.e r0 = (o.en.e) r0
            int[] r1 = o.fm.h.AnonymousClass2.f26094b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L56
            goto L3b
        L56:
            o.dj.a.a(r6)
            goto L3b
        L5a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.h.a(android.content.Context):void");
    }

    final boolean a(Context context, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        this.f26092f = false;
        ArrayList arrayList = new ArrayList();
        int i3 = o.ef.a.f23769c * (-1989011043);
        o.ef.a.f23769c = i3;
        int i4 = o.ef.a.f23776j * 720337855;
        o.ef.a.f23776j = i4;
        int i5 = 253749855 * o.ef.a.f23775i;
        o.ef.a.f23775i = i5;
        int i6 = 1380085454 * o.ef.a.f23774h;
        o.ef.a.f23774h = i6;
        Iterator it = (Iterator) o.ef.a.a(1890943914, new Object[]{aVar}, i5, i6, -1890943912, i3, i4);
        int i7 = f26085g + 103;
        f26088j = i7 % 128;
        int i8 = i7 % 2;
        while (it.hasNext()) {
            String str = (String) it.next();
            int i9 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i9;
            String str2 = (String) o.ef.a.a(-781664457, new Object[]{aVar, str}, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority());
            Object[] objArr = new Object[1];
            k("\ua8cbꢂ◡Ｖ끚ԡ镺\u1ae5싦뮊꾀\ue083籙倒㧤", TextUtils.getOffsetAfter("", 0) + 1, objArr);
            Object obj = null;
            if (str2.equals(((String) objArr[0]).intern())) {
                int i10 = f26085g + 89;
                f26088j = i10 % 128;
                if (i10 % 2 != 0) {
                    f.a();
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    int i11 = f26088j + 37;
                    f26085g = i11 % 128;
                    int i12 = i11 % 2;
                    Object[] objArr2 = new Object[1];
                    k("͕̅⽞\uf5b5⨏齒뗦㩉楄넫㗭쀳ퟮ媵ꎒ庿㰴\uec11\ude3f\uf4dfꪢ燹璿", TextUtils.getOffsetBefore("", 0) + 1, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    k("\u0af2ઇힷ൞뮽\u0eeb땩㫃惢䧆ꐋ상\ude1aꉏ㈵帿㖺ᓮ侀\uf440ꍂ襒\ue50cθ\u196f\ue3a0犻餕瓄嗆衃㒉\ue22f칧☺䈾妷₃", -ExpandableListView.getPackedPositionChild(0L), objArr3);
                    f.c(strIntern, String.format(((String) objArr3[0]).intern(), str));
                }
                o.en.d dVarE = o.en.d.e(str);
                if (dVarE != null) {
                    int i13 = f26088j + 107;
                    f26085g = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList.add(dVarE);
                        int i14 = 54 / 0;
                    } else {
                        arrayList.add(dVarE);
                    }
                }
            } else {
                int i15 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i15;
                String str3 = (String) o.ef.a.a(-781664457, new Object[]{aVar, str}, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority());
                Object[] objArr4 = new Object[1];
                k("Ⳗⲟᐛ컌杧툜佄샛䛻詰碽㪽\uf844懤\ueed3ꐏ", View.resolveSize(0, 0) + 1, objArr4);
                if (!str3.equals(((String) objArr4[0]).intern())) {
                    continue;
                } else {
                    int i16 = f26088j + 87;
                    f26085g = i16 % 128;
                    if (i16 % 2 == 0) {
                        f.a();
                        throw null;
                    }
                    if (f.a()) {
                        Object[] objArr5 = new Object[1];
                        k("͕̅⽞\uf5b5⨏齒뗦㩉楄넫㗭쀳ퟮ媵ꎒ庿㰴\uec11\ude3f\uf4dfꪢ燹璿", (Process.myPid() >> 22) + 1, objArr5);
                        String strIntern2 = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        k("绖纣࠰틙໖뮀ჯ齅ᓆ陁ᅠ敇\uaa3e緈蝞﮹䆞쭩\ufaeb准흦囕偧\ua63e测㰧쟐㲓à詁㴨鄏阋ᇠ鍑\ue7b8\u2d9f．ۣ", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
                        f.c(strIntern2, String.format(((String) objArr6[0]).intern(), str));
                    }
                    this.f26092f = true;
                }
            }
        }
        this.f26090a = arrayList;
        return b(context);
    }

    final boolean b(Context context, o.en.d[] dVarArr) {
        int iNextInt = new Random().nextInt();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int iMyPid = Process.myPid();
        int i2 = f26082b * 256666426;
        f26082b = i2;
        return ((Boolean) c(-1231103960, new Object[]{this, context, dVarArr}, i2, 1231103960, iNextInt, iMyPid, iMaxMemory)).booleanValue();
    }

    public final boolean c(o.en.e eVar) {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f26083c * (-966280673);
        f26083c = i2;
        int i3 = f26084d * 1253296810;
        f26084d = i3;
        return ((Boolean) c(-1003639645, new Object[]{this, eVar}, Process.myTid(), 1003639646, iMaxMemory, i3, i2)).booleanValue();
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f26088j + 19;
        f26085g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26092f;
        }
        throw null;
    }
}
