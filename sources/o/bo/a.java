package o.bo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.m;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static Handler f21426a = null;

    /* JADX INFO: renamed from: b */
    private static char f21427b = 0;

    /* JADX INFO: renamed from: c */
    private static char f21428c = 0;

    /* JADX INFO: renamed from: d */
    private static char f21429d = 0;

    /* JADX INFO: renamed from: e */
    private static char f21430e = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f21431f = null;

    /* JADX INFO: renamed from: g */
    private static int f21432g = 0;

    /* JADX INFO: renamed from: h */
    private static int f21433h = 0;

    /* JADX INFO: renamed from: i */
    private static int f21434i = 0;

    /* JADX INFO: renamed from: j */
    private static int f21435j = 0;

    private static String $$c(byte b2, short s2, byte b3) {
        int i2 = b3 * 4;
        byte[] bArr = $$a;
        int i3 = b2 + 69;
        int i4 = 4 - (s2 * 4);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = -i4;
            i4++;
            i3 = i2 + i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4++;
            i3 += -bArr[i4];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21435j = 0;
        f21433h = 1;
        f21432g = 0;
        f21434i = 1;
        b();
        ViewConfiguration.getScrollDefaultDelay();
        int i2 = f21433h + 27;
        f21435j = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void a(final Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        boolean zA = o.ea.f.a();
        short sXd = (short) (C1580rY.Xd() ^ (-13304));
        int[] iArr = new int["鳖兎닳수鉌\u245bﶊ醹㿉บ羄鷆㚍鍯ヤ꽋껄䵻童쵌쿯鿀䲄ﵤ䴭뎷앖痃⒱푽싷꿢".length()];
        QB qb = new QB("鳖兎닳수鉌\u245bﶊ醹㿉บ羄鷆㚍鍯ヤ꽋껄䵻童쵌쿯鿀䲄ﵤ䴭뎷앖痃⒱푽싷꿢");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        if (zA) {
            int i4 = f21432g + 91;
            f21434i = i4 % 128;
            int i5 = i4 % 2;
            String strQd = Xg.qd("鱰䲓⊓葮雙贁⮱ᖪ玪ェ疞爡곉㌰", (short) (C1633zX.Xd() ^ (-31686)), (short) (C1633zX.Xd() ^ (-16508)));
            if (i5 == 0) {
                Object[] objArr = new Object[1];
                k(str, 27 - Color.blue(1), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k(strQd, 116 % (ViewConfiguration.getMaximumDrawingCacheSize() / 86), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                k(str, Color.blue(0) + 32, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k(strQd, 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr5 = new Object[1];
            k(str, TextUtils.lastIndexOf("", '0') + 33, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            int offsetBefore = 50 - TextUtils.getOffsetBefore("", 0);
            Object[] objArr6 = new Object[1];
            short sXd2 = (short) (C1633zX.Xd() ^ (-19219));
            short sXd3 = (short) (C1633zX.Xd() ^ (-3064));
            int[] iArr2 = new int["쿴釕ᾏ\uf138㭝ꍃ\uf1bd却\ue13e៹ᒪ肻\ueb1d\ue342շ莾ᘒꇋ⏣㷽뫞잼\ue77f聇ﭾ抣꽷岰쯒ꓒḏ芼춣ᷣ㩜꺯즌縼\ue761肕悠㉰\uf239ㆄ럙揩掄긖\ud9c6䃫".length()];
            QB qb2 = new QB("쿴釕ᾏ\uf138㭝ꍃ\uf1bd却\ue13e៹ᒪ肻\ueb1d\ue342շ莾ᘒꇋ⏣㷽뫞잼\ue77f聇ﭾ抣꽷岰쯒ꓒḏ芼춣ᷣ㩜꺯즌縼\ue761肕悠㉰\uf239ㆄ럙揩掄긖\ud9c6䃫");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd3) ^ sXd2));
                i6++;
            }
            k(new String(iArr2, 0, i6), offsetBefore, objArr6);
            o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
        }
        if (o.en.b.c().a()) {
            Handler handlerD = d();
            Object[] objArr7 = {new Runnable() { // from class: o.bo.a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    a.b(context);
                }
            }};
            Method method = Class.forName(C1626yg.Ud("k5*\u001em{Ll\u0003?gk\u007f%\u0001@l\u007f", (short) (Od.Xd() ^ (-23219)), (short) (Od.Xd() ^ (-5597)))).getMethod(EO.Od("|+Qz", (short) (C1607wl.Xd() ^ 20777)), Class.forName(Ig.wd("o8\u001dfaj\u0002\u0015f\u007f 'tl]C\u0010\t", (short) (FB.Xd() ^ 17183))));
            try {
                method.setAccessible(true);
                method.invoke(handlerD, objArr7);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (o.ea.f.a()) {
            int i7 = f21432g + 65;
            f21434i = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr8 = new Object[1];
            k(str, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32, objArr8);
            String strIntern3 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            k(ZO.xd("쇖迊⒠䏣\uf492꾦ᩂඏ⽩둒늋葘稚쬏ڰ雗礞⁂ᑻ牲쇒ꁇ慚\uf4b0ꀫ글囮\ue63a蟆吟佄퓐\ud874䩶ꘊ땤瑏\uf5a0ᦤ痰땸䧛兔\uee48긑豚䉒疶䁓隺꤬減\uf378橓\u20f1⍯繺\uf8b8\uea27࡞", (short) (C1580rY.Xd() ^ (-13591)), (short) (C1580rY.Xd() ^ (-12122))), Color.alpha(0) + 59, objArr9);
            o.ea.f.c(strIntern3, ((String) objArr9[0]).intern());
        }
        o.dc.d.a().b(context, new o.dd.e(o.az.a.f20791b, o.dd.g.D), false);
    }

    private static void a(Context context, String str, String str2, String str3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21434i + 21;
        f21432g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k("┛톒㬶䩚\u1a8d꒛藉᧷쀆蹖\uffbf☀뛆ᮧ넛㞁㛹춯\ufb18啾堠⟰첳薒쵚㯣䶁\uf5edꓚ岥䬞㠈", 32 - (Process.myPid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            k("睂텓\udf61ꚝﴷ㦈ꌂ㔃哩\ud92b홹ᴯ寚穿\ue4df久ľꡳ\ue28e豜ﴷ㦈腘娫ꃎ僰\ue878郢鍞鴐쌛ⶄ", TextUtils.indexOf((CharSequence) "", '0', 0) + 32, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            l("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{234, 29, 0, 0}, true, objArr3);
            o.ea.f.c(strIntern, sb2.append(((String) objArr3[0]).intern()).append(str3).toString());
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            k("睂텓\udf61ꚝﴷ㦈ꌂ㔃哩\ud92b홹ᴯ寚穿\ue4df久ľꡳ닆㛗哩\ud92b홹ᴯ寚穿\ue5d5谪\uec03䤙셦ൖ廳婍ꃎ僰鍞鴐쌛ⶄ", (ViewConfiguration.getScrollBarSize() >> 8) + 39, objArr4);
            o.ea.f.c(strIntern, sb3.append(((String) objArr4[0]).intern()).append(str2).toString());
        }
        if (str3 == null || str3.isEmpty()) {
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                k("睂텓\udf61ꚝﴷ㦈ꌂ㔃哩\ud92b홹ᴯ寚穿\ue4df久ľꡳ鍐醛熗쮛퐢⾤羟鼒ᵿ\uf22bᒩ線ᵹ잇갧깝昛츾첳薒ꉪ︖", 38 - ExpandableListView.getPackedPositionChild(0L), objArr5);
                o.ea.f.d(strIntern, ((String) objArr5[0]).intern());
                return;
            }
            return;
        }
        if (str != null && !str.isEmpty()) {
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i5 = o.dj.a.f23072e * 2034601121;
            o.dj.a.f23072e = i5;
            int i6 = o.dj.a.f23074g * 661142827;
            o.dj.a.f23074g = i6;
            o.dj.a.c(new Object[]{str3, str}, 1652035770, -1652035769, Process.myTid(), iFreeMemory, i6, i5);
            return;
        }
        Object[] objArr6 = new Object[1];
        l("\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{263, 6, 36, 0}, false, objArr6);
        if (!((String) objArr6[0]).intern().equals(str2)) {
            if (!(!o.ea.f.a())) {
                Object[] objArr7 = new Object[1];
                k("睂텓\udf61ꚝﴷ㦈ꌂ㔃哩\ud92b홹ᴯ寚穿\ue4df久ľꡳ쭷묖ꁐ㐚촺胘䓴䉑닆㛗哩\ud92b홹ᴯ寚穿ꭢ쒂\udec4秣䏽悖镶뮓ㄱ\ue59f㮸ᬤ", 45 - KeyEvent.getDeadChar(0, 0), objArr7);
                o.ea.f.d(strIntern, ((String) objArr7[0]).intern());
                return;
            }
            return;
        }
        if (o.ea.f.a()) {
            int i7 = f21432g + 63;
            f21434i = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr8 = new Object[1];
            l("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{269, 35, 195, 0}, true, objArr8);
            o.ea.f.c(strIntern, ((String) objArr8[0]).intern());
            int i9 = f21432g + 125;
            f21434i = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 5;
            }
        }
        o.dj.a.e(context, str3);
        int i11 = f21432g + 71;
        f21434i = i11 % 128;
        int i12 = i11 % 2;
    }

    static void b() {
        f21427b = (char) 33403;
        f21430e = (char) 9776;
        f21428c = (char) 52554;
        f21429d = (char) 5939;
        f21431f = new char[]{56514, 56323, 56562, 56558, 56321, 56328, 56575, 56569, 56571, 56560, 56560, 56569, 56569, 56572, 56324, 56322, 56569, 56503, 56558, 56519, 56514, 56556, 56562, 56553, 56552, 56520, 56522, 56561, 56558, 56558, 56551, 56546, 56513, 56486, 56486, 56514, 56548, 56557, 56559, 56551, 56548, 56548, 56539, 56539, 56550, 56548, 56554, 56563, 56556, 56537, 56541, 56558, 56561, 56558, 56516, 56515, 56554, 56555, 56555, 56561, 56564, 56560, 56558, 56553, 56513, 56522, 56561, 56558, 56519, 56486, 56486, 56519, 56558, 56556, 56558, 56554, 56546, 56550, 56551, 56551, 56558, 56501, 56551, 56555, 56521, 56514, 56550, 56558, 56522, 56521, 56563, 56556, 56550, 56556, 56553, 56554, 56522, 56522, 56558, 56516, 56515, 56554, 56555, 56557, 56555, 56548, 56550, 56558, 56560, 56558, 56553, 56513, 56522, 56561, 56558, 56519, 56486, 56527, 56555, 56552, 56552, 56551, 56551, 56515, 56513, 56550, 56551, 56551, 56550, 56548, 56554, 56561, 56521, 56520, 56559, 56557, 56552, 56556, 56561, 56551, 56512, 56514, 56548, 56556, 56560, 56551, 56552, 56555, 56516, 56522, 56561, 56558, 56519, 56521, 56556, 56554, 56553, 56514, 56519, 56558, 56556, 56558, 56554, 56546, 56550, 56551, 56551, 56558, 56561, 56558, 56519, 56486, 56486, 56514, 56548, 56557, 56559, 56551, 56548, 56548, 56539, 56539, 56550, 56548, 56554, 56563, 56556, 56537, 56541, 56558, 56503, 56558, 56541, 56537, 56556, 56563, 56554, 56548, 56550, 56539, 56539, 56548, 56548, 56551, 56559, 56557, 56548, 56514, 56486, 56486, 56518, 56551, 56551, 56553, 56546, 56554, 56561, 56560, 56565, 56524, 56515, 56551, 56551, 56552, 56552, 56555, 56521, 56518, 56555, 56558, 56563, 56558, 56555, 56554, 56464, 56493, 56493, 56514, 56546, 56552, 56557, 56562, 56557, 56552, 56520, 56486, 56486, 56484, 56488, 56518, 56546, 56552, 56557, 56562, 56557, 56536, 56545, 56563, 56556, 56548, 56553, 56560, 56561, 56507, 56564, 56555, 56556, 56566, 56563, 56345, 56757, 56717, 56440, 56722, 56725, 56715, 56714, 56723, 56444, 56425, 56425, 56711, 56752, 56759, 56741, 56443, 56425, 56425, 56423, 56427, 56713, 56741, 56747, 56752, 56757, 56752, 56731, 56740, 56758, 56751, 56743, 56748, 56755, 56756, 56521, 56337, 56324, 56324, 56336, 56331, 56332, 56323, 56574, 56328, 56335, 56334, 56335, 56336, 56551, 56521, 56521, 56556, 56334, 56328, 56332, 56331, 56327, 56334, 56327, 56324, 56336, 56331, 56332, 56324, 56325, 56333, 56325, 56333, 56335};
    }

    public static /* synthetic */ void b(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            new e();
            e.d(context);
            int i3 = f21432g + 113;
            f21434i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
            }
        } catch (f e2) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                k("┛톒㬶䩚\u1a8d꒛藉᧷쀆蹖\uffbf☀뛆ᮧ넛㞁㛹춯\ufb18啾堠⟰첳薒쵚㯣䶁\uf5edꓚ岥䬞㠈", 32 - (Process.myTid() >> 22), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{304, 35, 35, 0}, false, objArr2);
                o.ea.f.e(strIntern, ((String) objArr2[0]).intern(), e2);
            }
            int i5 = f21434i + 85;
            f21432g = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ void c(Context context, String str, String str2, String str3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21432g + 27;
        f21434i = i3 % 128;
        int i4 = i3 % 2;
        a(context, str, str2, str3);
        int i5 = f21434i + 75;
        f21432g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static boolean c(final Context context, h hVar) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        k(C1561oA.Qd("켌莂\ue525\uf448쑺嚇㞴쏡燯䀾놦쿦梫얋拾\ue163\ue0da羏곷｜৽퇌纎㝬缳\ue5bb\uf758ꟃ嚯\u0e79\uf4f1\ue1da", (short) (C1499aX.Xd() ^ (-32023))), TextUtils.indexOf("", "", 0, 0) + 32, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            int[] iArr = {0, 17, 21, 0};
            Object[] objArr2 = new Object[1];
            short sXd = (short) (ZN.Xd() ^ 4694);
            short sXd2 = (short) (ZN.Xd() ^ 5319);
            int[] iArr2 = new int["ӑ\u000e\u000fӔӕӖӗӘә\u0016\u0017ӜӝӞ\u001b\u001c\u001d".length()];
            QB qb = new QB("ӑ\u000e\u000fӔӕӖӗӘә\u0016\u0017ӜӝӞ\u001b\u001c\u001d");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            l(new String(iArr2, 0, i3), iArr, false, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (hVar == null) {
            int i4 = f21434i + 25;
            f21432g = i4 % 128;
            int i5 = i4 % 2;
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                l(C1561oA.od("HGƶEƴCBAưƯ>=Ƭ;ƪ987Ʀ543ƢơƠ/.ƝƜƛƚƙƘ'&%$#\"! ƏƎƍ\u001c\u001bƊ\u0019ƈ\u0017\u0016ƅ\u0014\u0013Ƃ\u0011ƀ\u000f\u000eŽż\u000b\n\t", (short) (Od.Xd() ^ (-6170))), new int[]{17, 64, 0, 35}, true, objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return false;
        }
        d dVarE = new g().e(context);
        if (dVarE == null) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                k(C1561oA.Kd("൬떏鮙㩐枺먡별貕휃闟丩凉檍\uddb6궣ퟤ\ue497舏椶ꑴƣ엱ὺ鮌\ud953꾚ᆒ셞⡧諂妠ꚃ⡫諆㗫됃鿸꼝祭\ue29f濂覽ꓪ삽ǜ餁䕛竆\ua8cb앥䕟竊황㡮⢁諜壙귰⸾爯⩥\uf587牲\ude35\ue2cb\udd1b막䘌", (short) (Od.Xd() ^ (-23014))), 68 - (Process.myTid() >> 22), objArr4);
                o.ea.f.c(strIntern, ((String) objArr4[0]).intern());
            }
            if (hVar.d() == null || hVar.c() == null) {
                if (!(!o.ea.f.a())) {
                    int i6 = f21432g + 73;
                    f21434i = i6 % 128;
                    int i7 = i6 % 2;
                    int[] iArr3 = {81, 109, 0, 0};
                    Object[] objArr5 = new Object[1];
                    short sXd3 = (short) (C1607wl.Xd() ^ 17466);
                    int[] iArr4 = new int["\u0012\u0013\u0014\u0015\u0016\u0017ךכ\u001a\u001b\u001cן\u001e\u001f ףפ#$%&'()*+\u05ee-.ױ0׳23\u05f6\u05f767\u05fa9\u05fc;\u05fe=\u0600?@\u0603\u0604CDE؈GHIJ؍LMNOPQRSTUؘWX؛Z؝؞]ؠء`أbcئاfghijحlmذopqشصضuvعغػؼؽؾ}~".length()];
                    QB qb2 = new QB("\u0012\u0013\u0014\u0015\u0016\u0017ךכ\u001a\u001b\u001cן\u001e\u001f ףפ#$%&'()*+\u05ee-.ױ0׳23\u05f6\u05f767\u05fa9\u05fc;\u05fe=\u0600?@\u0603\u0604CDE؈GHIJ؍LMNOPQRSTUؘWX؛Z؝؞]ؠء`أbcئاfghijحlmذopqشصضuvعغػؼؽؾ}~");
                    int i8 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr4[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i8));
                        i8++;
                    }
                    l(new String(iArr4, 0, i8), iArr3, true, objArr5);
                    o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
                }
                return false;
            }
            if (o.ea.f.a()) {
                int i9 = f21432g + 9;
                f21434i = i9 % 128;
                int i10 = i9 % 2;
                String strZd = Wg.Zd("䙶⤁跃ꈲ䚔ᚳ頎\udd97驽\ud801ฃか\u1717ჸ嚝㍖뻁퇡\u3000\ue0f6끴癝漑\ue924햻쪻曇쵃咗穪䞤浿㙴\ueb00溮羆ꯕ蚕〻ॎ龡홥挸腳㹿劉冿\u0e6e承듽꿏⧋㸍怕솒뎻歵\uf721⨵뭖ힲ㖟囈筨ᝌ眖\uee9c\uf661刊胥⼆늒骍窐ఔ\ue634Ḅ茣厒\u18ae樣꯭⫦튌♱\uf5c0缀ᢋ熱龵䢥랺뗱巟㵦즀郺닙", (short) (Od.Xd() ^ (-12787)), (short) (Od.Xd() ^ (-5662)));
                if (i10 == 0) {
                    Object[] objArr6 = new Object[1];
                    k(strZd, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) * 68, objArr6);
                    obj = objArr6[0];
                } else {
                    Object[] objArr7 = new Object[1];
                    k(strZd, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 96, objArr7);
                    obj = objArr7[0];
                }
                o.ea.f.c(strIntern, ((String) obj).intern());
            }
        } else if (!dVarE.b(hVar)) {
            int i11 = f21434i + 41;
            f21432g = i11 % 128;
            if (i11 % 2 != 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56;
                Object[] objArr8 = new Object[1];
                short sXd4 = (short) (C1607wl.Xd() ^ 22731);
                int[] iArr5 = new int["喽\ufde0\ue3e6芝뀃੪ഉ퓚❄\ude20陦䦶닆ⷯ\uf5d8⠙㓨쩠놃\uecc1\u0604ᘺᏬཇ縢ﰺ⊊\u0a4eᏦཁ喿\ufde2赞싉죙鋁涎릑搮꠬쩀籏㵍蕾쵶웓既ꪯ靭䄼艹\uaacb妵ᆁ\uf7f7\ue4e2".length()];
                QB qb3 = new QB("喽\ufde0\ue3e6芝뀃੪ഉ퓚❄\ude20陦䦶닆ⷯ\uf5d8⠙㓨쩠놃\uecc1\u0604ᘺᏬཇ縢ﰺ⊊\u0a4eᏦཁ喿\ufde2赞싉죙鋁涎릑搮꠬쩀籏㵍蕾쵶웓既ꪯ靭䄼艹\uaacb妵ᆁ\uf7f7\ue4e2");
                int i12 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr5[i12] = xuXd3.fK((sXd4 ^ i12) + xuXd3.CK(iKK3));
                    i12++;
                }
                k(new String(iArr5, 0, i12), scrollDefaultDelay, objArr8);
                o.ea.f.d(strIntern, ((String) objArr8[0]).intern());
            }
            return false;
        }
        final String strD = hVar.d();
        final String strC = hVar.c();
        final String strA = hVar.a();
        if (strD != null) {
            int i13 = f21434i + 109;
            f21432g = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            if (strC != null) {
                if (o.ea.f.a()) {
                    int i14 = f21434i + 89;
                    f21432g = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = 48 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    short sXd5 = (short) (ZN.Xd() ^ 4270);
                    short sXd6 = (short) (ZN.Xd() ^ 29439);
                    int[] iArr6 = new int["빿溠咨\ueb5d\u20c5猪痋䖚逆仠Ｈ뉶⎈隯暚郙鶊㬀∥嵡㒔ഃ钎\uf46c᳙⹘\uea4aꌨ챔뀟\uf1b5䴶鴰벢㬎ឹ鵶㫬铍\ueeddﳪ쐥⊾圎黝瞯玓拸".length()];
                    QB qb4 = new QB("빿溠咨\ueb5d\u20c5猪痋䖚逆仠Ｈ뉶⎈隯暚郙鶊㬀∥嵡㒔ഃ钎\uf46c᳙⹘\uea4aꌨ챔뀟\uf1b5䴶鴰벢㬎ឹ鵶㫬铍\ueeddﳪ쐥⊾圎黝瞯玓拸");
                    int i17 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr6[i17] = xuXd4.fK(((sXd5 + i17) + xuXd4.CK(iKK4)) - sXd6);
                        i17++;
                    }
                    k(new String(iArr6, 0, i17), i16, objArr9);
                    o.ea.f.c(strIntern, ((String) objArr9[0]).intern());
                    int i18 = f21434i + 13;
                    f21432g = i18 % 128;
                    int i19 = i18 % 2;
                }
                Handler handlerD = d();
                Object[] objArr10 = {new Runnable() { // from class: o.bo.a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        a.c(context, strA, strD, strC);
                    }
                }};
                Method method = Class.forName(hg.Vd(",8-:6/)q25n\b ,!( ,", (short) (C1580rY.Xd() ^ (-11582)), (short) (C1580rY.Xd() ^ (-26942)))).getMethod(C1561oA.yd("TRUU", (short) (ZN.Xd() ^ 30527)), Class.forName(C1561oA.ud("LBV@\fI=IA\u0007*LDC55>6", (short) (C1607wl.Xd() ^ 29973))));
                try {
                    method.setAccessible(true);
                    method.invoke(handlerD, objArr10);
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        if (o.ea.f.a()) {
            int i20 = f21432g + 41;
            f21434i = i20 % 128;
            int i21 = i20 % 2;
            Object[] objArr11 = new Object[1];
            l(C1561oA.Yd("IJKҾҿӀӁӂӃRSӆӇӈWXYӌ[\\]Ӑ_ӒabcdefәhӛjӝlmnӡӢӣӤst", (short) (Od.Xd() ^ (-15071))), new int[]{190, 44, 0, 0}, false, objArr11);
            o.ea.f.d(strIntern, ((String) objArr11[0]).intern());
        }
        return true;
    }

    private static Handler d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21432g + 55;
        f21434i = i3 % 128;
        int i4 = i3 % 2;
        if (f21426a == null) {
            Object[] objArr = new Object[1];
            k("ඖ祘꾫䷼홹ᴯ\uf668䃐扁\u0bd3넛㞁㛹춯\ufb18啾堠⟰첳薒쵚㯣䶁\uf5edꓚ岥䬞㠈", 27 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
            handlerThread.start();
            f21426a = new o.ea.e(handlerThread.getLooper());
        }
        Handler handler = f21426a;
        int i5 = f21432g + 71;
        f21434i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return handler;
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = 234;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i4] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $10 + 109;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) f21428c) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f21429d)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 271, (char) ((-1) - Process.getGidForName("")), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f21427b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f21430e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - Color.argb(0, 0, 0, 0), (char) ExpandableListView.getPackedPositionType(0L), 11 - Color.alpha(0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    i4 = 0;
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
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 3);
                objA3 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 270, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 11, -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            i4 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i11 = $10 + 9;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str3;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void l(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f21431f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 25;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            int touchSlop = 249 - (ViewConfiguration.getTouchSlop() >> 8);
                            char threadPriority = (char) ((Process.getThreadPriority(i5) + 20) >> 6);
                            int offsetAfter = 11 - TextUtils.getOffsetAfter("", i5);
                            byte b2 = (byte) i5;
                            objA = o.d.d.a(touchSlop, threadPriority, offsetAfter, 1376582792, false, $$c((byte) 47, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i10 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 249, (char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 1376582792, false, $$c((byte) 47, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i3 = 2;
                i5 = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                if (bArr[mVar.f19943d] == 1) {
                    int i12 = $10 + 9;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a(12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        int i14 = 4 / 0;
                    } else {
                        int i15 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA4 = o.d.d.a(120026474);
                        if (objA4 == null) {
                            objA4 = o.d.d.a(11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.resolveSize(0, 0), 10 - Color.blue(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                } else {
                    int i16 = mVar.f19943d;
                    Object[] objArr6 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA5 = o.d.d.a(1632715197);
                    if (objA5 == null) {
                        byte b4 = (byte) 0;
                        objA5 = o.d.d.a(836 - Color.red(0), (char) (27278 - ExpandableListView.getPackedPositionChild(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1210801192, false, $$c((byte) 51, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA5).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr7 = {mVar, mVar};
                Object objA6 = o.d.d.a(-1041906996);
                if (objA6 == null) {
                    objA6 = o.d.d.a(21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 35715), Color.blue(0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
                int i17 = $11 + 89;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i19 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i19, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i19);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i7];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i20 = $11 + 83;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            int i22 = $11 + 1;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i25 = $10 + 57;
                $11 = i25 % 128;
                int i26 = i25 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i24 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
