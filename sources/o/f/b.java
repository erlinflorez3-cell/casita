package o.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.k;
import o.d.d;
import o.ea.f;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static boolean f25713a = false;

    /* JADX INFO: renamed from: b */
    private static long f25714b = 0;

    /* JADX INFO: renamed from: c */
    private static int f25715c = 0;

    /* JADX INFO: renamed from: d */
    private static int f25716d = 0;

    /* JADX INFO: renamed from: e */
    private static int f25717e = 0;

    /* JADX INFO: renamed from: h */
    private static int f25718h = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            int r0 = r8 * 7
            int r0 = 114 - r0
            byte[] r8 = o.f.b.$$a
            int r7 = r10 + 4
            int r1 = r9 * 2
            int r6 = 1 - r1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2b
            r2 = r6
            r1 = r7
            r3 = r4
        L14:
            int r7 = r7 + r2
            r2 = r3
            r0 = r7
            r7 = r1
        L18:
            int r3 = r2 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r3 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r1 = r7 + 1
            r2 = r8[r1]
            r7 = r0
            goto L14
        L2b:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.b.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25715c = 0;
        f25718h = 1;
        f25716d = 0;
        f25717e = 1;
        c();
        ViewConfiguration.getMaximumDrawingCacheSize();
        f25713a = false;
        int i2 = f25718h + 75;
        f25715c = i2 % 128;
        int i3 = i2 % 2;
    }

    public static boolean a() {
        int i2 = 2 % 2;
        int i3 = f25716d + 109;
        int i4 = i3 % 128;
        f25717e = i4;
        int i5 = i3 % 2;
        boolean z2 = f25713a;
        int i6 = i4 + 51;
        f25716d = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public static void b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25717e + 97;
        f25716d = i3 % 128;
        int i4 = i3 % 2;
        if (f25713a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f("졲젱䈷鄂\udf60ዯ듻攣簛됛葥㬾緣ᠹ\udf04ꅇ壮㌼ȋ乩ꏡ혨┦歊軋褊䠪ၞ", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("ᩄᨁ∯\uda02砱샒퓿Ԯ㜚ｎ⌳鱢꿆破鐒ح諂匭䤗\ue921燈똒湦찞峮\ue90c̫띐㯤찔㠤騁\ue6e3✝", (-1) - TextUtils.lastIndexOf("", '0', 0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            f25713a = false;
            int i5 = f25716d + 41;
            f25717e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    public static a c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25717e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25716d = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f25716d + 31;
            f25717e = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f(hg.Vd("褨裦\ufaeb况ꀒ쮠疫◒㳉瓈䔑\uf3e9㺍탢龬懮ᦔ\uebe1ظ༌撃雉\uddc6⯩佩䦧ࣆ죹", (short) (FB.Xd() ^ 19180), (short) (FB.Xd() ^ 30296)), (-1) - ExpandableListView.getPackedPositionChild(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i7 = 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            short sXd = (short) (OY.Xd() ^ 16233);
            int[] iArr = new int["蜊蝷̈搨泜Ⲕ류\ue184㼛蜜쟳࢝쮫⑵鸞ꋗ\uee75㾅줡\uf5ce鵵媗\ueff4탈삎閎૩㎲枋".length()];
            QB qb = new QB("蜊蝷̈搨泜Ⲕ류\ue184㼛蜜쟳࢝쮫⑵鸞ꋗ\uee75㾅줡\uf5ce鵵媗\ueff4탈삎閎૩㎲枋");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK(sXd + i8 + xuXd.CK(iKK));
                i8++;
            }
            f(new String(iArr, 0, i8), i7, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        f(C1561oA.yd("饄餧\ufe6d㕘썆\udfdb傥❨ᨏ娟\uee4dꜤ\u0eeb뒎潓ᥝ㇖춆쐔㑦ϝ牦\ue945坷吙䍶﹐芄竾桭᭗ꖅ뷷ॷ㡉좙\ue516ỡ䶁\uf2e3ྴ럐牼ᶸᛅ쳬인㣌ҵꗕ\udc82", (short) (FB.Xd() ^ 17457)), ViewConfiguration.getPressedStateDuration() >> 16, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Yd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (Od.Xd() ^ (-9229)))).getMethod(Jg.Wd("\bCfm/Pu\t{\u0010>Y\u000f6o\u000b\b\u001d3i", (short) (C1633zX.Xd() ^ (-15840)), (short) (C1633zX.Xd() ^ (-23377))), Class.forName(Xg.qd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (C1499aX.Xd() ^ (-31021)), (short) (C1499aX.Xd() ^ (-26337)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
            Object[] objArr5 = new Object[1];
            f(ZO.xd("\uec3e◀雵꣑똬\uf609囄劀標\udfee骜ἀ튴盿過ὖ狀\u07bc", (short) (C1633zX.Xd() ^ (-31497)), (short) (C1633zX.Xd() ^ (-30636))), KeyEvent.getMaxKeyCode() >> 16, objArr5);
            return a.e(sharedPreferences.getString(((String) objArr5[0]).intern(), ""));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void c() {
        f25714b = -2305848834346425148L;
    }

    private static void c(Context context, a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25716d + 93;
        int i4 = i3 % 128;
        f25717e = i4;
        int i5 = i3 % 2;
        if (aVar == null) {
            int i6 = i4 + 111;
            f25716d = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            f(C1626yg.Ud("\uf316প녈\uf049耑뤢㇐\ued02哶ꐈ䌶\uf35f傜㎂Ａ鋴尽蹏ː鑠훜紟넹ﭯᡌ\uf66d⮥\ud9d9", (short) (Od.Xd() ^ (-3333)), (short) (Od.Xd() ^ (-25885))), KeyEvent.getDeadChar(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(Ig.wd("\ud88f癈\u1aea眿릋ꌔݠ\uf5a2ퟡꈦ\ue8c0ꑎᲒ훴䉏᫄\uf413낎\uf6c5㥁ড㑃쀨\uf594\ue625\u0dc8俋≳䔈", (short) (OY.Xd() ^ 30468)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar.e()).toString());
        }
        Object[] objArr3 = new Object[1];
        f(EO.Od("㦤\u181a糦곱Ⱨ䥐덲讑繶릞商࿃濔᳹\udc28蕘鸡㭃ㄍ蛯κ뽟㿘꞊ꑚ鵓当\udeb9탙뵚燜ﰰ᰾惠ﮮ鏄뀗\ue33eỰ쏄\uda0d訑䒇\ue93d\ue1e8ꆃ枀꽇ȫ▚䖧", (short) (FB.Xd() ^ 30076)), Drawable.resolveOpacity(0, 0), objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Qd("jvkxtmg0domrbjo(<gejZlg", (short) (Od.Xd() ^ (-22963)))).getMethod(C1561oA.od("\f\t\u0017t\t\u0001\u0011\u0003\u0001k\r~~|\tz\u0003vw\u0005", (short) (C1633zX.Xd() ^ (-27881))), Class.forName(C1593ug.zd("3+A-z:0>8\u007f&HG?E?", (short) (FB.Xd() ^ 5508), (short) (FB.Xd() ^ 27554))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            Object[] objArr5 = new Object[1];
            f(C1561oA.Kd("囂圳\uf45a\ueeb6ഭ饞ญ흥\u0bc4쮵扁\ue8eb舘ꩪ꒿蝍\udf6fג", (short) (C1580rY.Xd() ^ (-21759))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr5);
            editorEdit.putString(((String) objArr5[0]).intern(), aVar.e()).commit();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25716d + 67;
        f25717e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (f25713a) {
            f25713a = false;
            if (!(!f.a())) {
                int i4 = f25716d + 57;
                f25717e = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    f("졲젱䈷鄂\udf60ዯ듻攣簛됛葥㬾緣ᠹ\udf04ꅇ壮㌼ȋ乩ꏡ혨┦歊軋褊䠪ၞ", 'X' << AndroidCharacter.getMirror('('), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    f("䲆䳃︠㶯∍阑ࣰ\ud920킷ᣣ祆옗滑ꐻ玿屘\udc00輢꺺더✊樝觋陫ਬ㔃\ue486\ued25洦ရ\udf89쁴뀡\ufb12", (-1) >> TextUtils.indexOf((CharSequence) "", 'v', 1), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                    return;
                }
                Object[] objArr3 = new Object[1];
                f("졲젱䈷鄂\udf60ዯ듻攣簛됛葥㬾緣ᠹ\udf04ꅇ壮㌼ȋ乩ꏡ혨┦歊軋褊䠪ၞ", '0' - AndroidCharacter.getMirror('0'), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f("䲆䳃︠㶯∍阑ࣰ\ud920킷ᣣ祆옗滑ꐻ玿屘\udc00輢꺺더✊樝觋陫ਬ㔃\ue486\ued25洦ရ\udf89쁴뀡\ufb12", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
        }
    }

    public static boolean d(Context context, a aVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f25717e;
        int i4 = i3 + 93;
        f25716d = i4 % 128;
        int i5 = i4 % 2;
        if (aVar == null) {
            int i6 = i3 + 7;
            f25716d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        a aVarC = c(context);
        c(context, aVar);
        if (aVar != a.f25702a || aVarC == a.f25702a) {
            return false;
        }
        if (f.a()) {
            int i8 = f25716d + 31;
            f25717e = i8 % 128;
            if (i8 % 2 == 0) {
                Object[] objArr = new Object[1];
                f("졲젱䈷鄂\udf60ዯ듻攣簛됛葥㬾緣ᠹ\udf04ꅇ壮㌼ȋ乩ꏡ혨┦歊軋褊䠪ၞ", ViewConfiguration.getMaximumFlingVelocity() << 10, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f("쭜쬩́冟걯ᇐ\uf5cf␜벇環\uf774䠴绉夅ᾎ퉰寀爀슂㵺ꃏ霂\ue5afᡏ跰젬袠挆\ueaa1\ued61뎻乛㟦د嚬ꥄᳱ㯘秕\uf3a9秄峚᳁\udea3䚈燄쟅㦪ꎝ\uaac8\ueacfҥ補쿣跾澝햡\ue0ed", (-1) << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                f("졲젱䈷鄂\udf60ዯ듻攣簛됛葥㬾緣ᠹ\udf04ꅇ壮㌼ȋ乩ꏡ혨┦歊軋褊䠪ၞ", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f("쭜쬩́冟걯ᇐ\uf5cf␜벇環\uf774䠴绉夅ᾎ퉰寀爀슂㵺ꃏ霂\ue5afᡏ跰젬袠挆\ueaa1\ued61뎻乛㟦د嚬ꥄᳱ㯘秕\uf3a9秄峚᳁\udea3䚈燄쟅㦪ꎝ\uaac8\ueacfҥ補쿣跾澝햡\ue0ed", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0014, code lost:
    
        if (o.f.b.f25713a != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0016, code lost:
    
        r1 = r2 + 57;
        o.f.b.f25717e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x001d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0020, code lost:
    
        if (o.f.b.f25713a != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0029, code lost:
    
        if ((!o.ea.f.a()) == true) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002b, code lost:
    
        r1 = o.f.b.f25716d + 3;
        o.f.b.f25717e = r1 % 128;
        r1 = r1 % 2;
        r4 = new java.lang.Object[1];
        f(yg.Wg.Zd("뜹击嬐擮䩛\ue87d⦘賓㫚൝䲶隢遖봿\ufb19塯뼥㑶ɉ坅䟌ㄦኳ쟪虺㞼襫\ue0b2", (short) (yg.OY.Xd() ^ 6609), (short) (yg.OY.Xd() ^ 28647)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1, r4);
        r5 = ((java.lang.String) r4[0]).intern();
        r3 = new java.lang.Object[1];
        f(yg.C1561oA.Xd("줽즋䟒샸䘰\u0ac6뚌漃⏠\ue3f8ᴪ駿搙ᇠ۰㠶䃑㣚姰켱뇘폺糞\uea24轍˟࿔脚\ue804鹑⫲鰦ⴓ䴖엡䌱", (short) (yg.Od.Xd() ^ (-7197))), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, r3);
        o.ea.f.c(r5, ((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0088, code lost:
    
        o.f.b.f25713a = true;
        o.ea.c.a();
        r6 = (short) (yg.C1633zX.Xd() ^ (-28717));
        r5 = new int["!-\"/+$\u001ef7:s\u0011322&B".length()];
        r4 = new yg.QB("!-\"/+$\u001ef7:s\u0011322&B");
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
    
        if (r4.YK() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        r0 = r4.KK();
        r2 = yg.Xu.Xd(r0);
        r5[r3] = r2.fK((r6 ^ r3) + r2.CK(r0));
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        r4 = new java.lang.Object[0];
        r1 = java.lang.Class.forName(new java.lang.String(r5, 0, r3)).getDeclaredMethod(yg.Qg.kd("tq\u007fWjquRtssgs", (short) (yg.FB.Xd() ^ 5899), (short) (yg.FB.Xd() ^ 10005)), new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        r1.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
    
        r7 = new o.ea.e((android.os.Looper) r1.invoke(null, r4));
        r12 = new o.f.b$$ExternalSyntheticLambda0();
        r8 = (short) (yg.C1607wl.Xd() ^ 30599);
        r6 = (short) (yg.C1607wl.Xd() ^ 13497);
        r5 = new int["\b\u0014\t\u0016\u0012\u000b\u0005M\u000e\u0011Jc{\b|\u0004{\b".length()];
        r4 = new yg.QB("\b\u0014\t\u0016\u0012\u000b\u0005M\u000e\u0011Jc{\b|\u0004{\b");
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        if (r4.YK() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r0 = r4.KK();
        r2 = yg.Xu.Xd(r0);
        r5[r3] = r2.fK(((r8 + r3) + r2.CK(r0)) + r6);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        r9 = java.lang.Class.forName(new java.lang.String(r5, 0, r3));
        r8 = new java.lang.Class[]{java.lang.Class.forName(yg.C1561oA.ud("mcwa-j^jb(KmedVV_W", (short) (yg.C1580rY.Xd() ^ (-5219)))), java.lang.Long.TYPE};
        r6 = new java.lang.Object[]{r12, java.lang.Long.valueOf(androidx.work.PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)};
        r10 = (short) (yg.C1499aX.Xd() ^ (-19311));
        r5 = new int["GELL\u00177A5H35".length()];
        r4 = new yg.QB("GELL\u00177A5H35");
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018e, code lost:
    
        if (r4.YK() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r0 = r4.KK();
        r2 = yg.Xu.Xd(r0);
        r5[r3] = r2.fK(r2.CK(r0) - (r10 ^ r3));
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a8, code lost:
    
        r1 = r9.getMethod(new java.lang.String(r5, 0, r3), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b3, code lost:
    
        r1.setAccessible(true);
        r1.invoke(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c0, code lost:
    
        throw r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c6, code lost:
    
        throw r0.getCause();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e() {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.b.e():void");
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f25714b ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25714b)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    int iAlpha = 229 - Color.alpha(0);
                    char cMyTid = (char) (51004 - (Process.myTid() >> 22));
                    int packedPositionChild = 8 - ExpandableListView.getPackedPositionChild(0L);
                    byte b2 = $$a[2];
                    byte b3 = (byte) (b2 + 1);
                    byte b4 = b2;
                    objA = d.a(iAlpha, cMyTid, packedPositionChild, 1749983833, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    int iLastIndexOf = 674 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iKeyCodeFromString = 12 - KeyEvent.keyCodeFromString("");
                    byte b5 = $$a[2];
                    byte b6 = b5;
                    objA2 = d.a(iLastIndexOf, tapTimeout, iKeyCodeFromString, 522683165, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
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

    static void init$0() {
        $$a = new byte[]{99, Ascii.EM, 0, 108};
        $$b = 202;
    }
}
