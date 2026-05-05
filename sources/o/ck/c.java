package o.ck;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import o.a.g;
import o.a.k;
import o.d.d;
import o.ea.f;
import o.ef.b;
import o.eq.e;
import o.er.a;
import o.er.ac;
import o.er.i;
import o.er.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.cl.c<e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f22417a = 0;

    /* JADX INFO: renamed from: b */
    public static int f22418b = 0;

    /* JADX INFO: renamed from: c */
    public static int f22419c = 0;

    /* JADX INFO: renamed from: d */
    public static int f22420d = 0;

    /* JADX INFO: renamed from: e */
    public static int f22421e = 0;

    /* JADX INFO: renamed from: g */
    private static char f22422g = 0;

    /* JADX INFO: renamed from: h */
    private static char f22423h = 0;

    /* JADX INFO: renamed from: i */
    private static char f22424i = 0;

    /* JADX INFO: renamed from: j */
    private static char f22425j = 0;

    /* JADX INFO: renamed from: k */
    private static long f22426k = 0;

    /* JADX INFO: renamed from: l */
    private static int f22427l = 0;

    /* JADX INFO: renamed from: m */
    private static int f22428m = 0;

    /* JADX INFO: renamed from: n */
    private static int f22429n = 0;

    /* JADX INFO: renamed from: o */
    private static int f22430o = 0;

    /* JADX INFO: renamed from: p */
    public static int f22431p = 0;

    /* JADX INFO: renamed from: f */
    private final String f22432f;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, short r9, byte r10) {
        /*
            int r0 = r9 * 3
            int r7 = r0 + 1
            int r0 = r10 * 4
            int r6 = 4 - r0
            byte[] r5 = o.ck.c.$$c
            int r2 = 114 - r8
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r7
            r2 = r6
            r1 = r3
        L14:
            int r0 = -r0
            int r6 = r6 + 1
            int r2 = r2 + r0
        L18:
            byte r0 = (byte) r2
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r6]
            goto L14
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ck.c.$$g(short, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f22431p = 1211401070;
        init$0();
        f22420d = -876337323;
        f22421e = -1036557324;
        f22417a = -1681394686;
        f22418b = 162811396;
        f22419c = -1716830512;
        f22429n = 0;
        f22430o = 1;
        f22428m = 0;
        f22427l = 1;
        e();
        TextUtils.indexOf("", "", 0, 0);
        Process.getThreadPriority(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        int i2 = f22430o + 107;
        f22429n = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(String str) {
        this.f22432f = str;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        String str = (String) objArr[1];
        ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = f22428m + 101;
        f22427l = i3 % 128;
        int i4 = i3 % 2;
        a aVarB = b(str);
        int i5 = f22427l + 47;
        f22428m = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarB;
        }
        throw null;
    }

    private static i a(String str, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22428m + 29;
        f22427l = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", KeyEvent.normalizeMetaState(0) + 20, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                r("핃烗픱讆特蹱\uf534ﴱ\ude3b絏鬯\ue6dc썵榹选\uebe3\uf4a6哿곹\udcbc練忂릴쁣\ue2fa䨑뚀땼阹㕡썗븭鬃⁁\ud823ꏏ调Ⳇ핐", KeyEvent.getDeadChar(0, 0) + 1, objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
                int i5 = f22427l + 21;
                f22428m = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 5;
                }
            }
            o.ef.a aVarX = aVar.x(str);
            Object[] objArr3 = new Object[1];
            q("搗鱃쁦鐟멜\uda1e㰫ﵚ쩻Ꭼ", 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
            boolean zBooleanValue = aVarX.h(((String) objArr3[0]).intern()).booleanValue();
            Object[] objArr4 = new Object[1];
            r("쀸꯶쁊\ue1c7\ua958\ue422ำا쭹Ꙥ\uf155ᷟ혔늡社ჸ\ue1d2", Color.alpha(0) + 1, objArr4);
            return new i(zBooleanValue, aVarX.s(((String) objArr4[0]).intern()));
        } catch (b e2) {
            throw new o.en.f(e2.getMessage());
        }
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~i7;
        int i12 = (-1) - (((-1) - i10) & ((-1) - (~((i9 + i11) - (i9 & i11)))));
        int i13 = ~((-1) - (((-1) - i7) & ((-1) - (i3 | i6))));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = (-1) - (((-1) - i11) & ((-1) - i3));
        int i16 = i3 + i6 + i5 + (112060874 * i4) + ((-1891258303) * i2);
        int i17 = i16 * i16;
        int i18 = (i3 * 1286644997) + 1783103488 + (1286644997 * i6) + (i14 * (-1821943044)) + ((-651081208) * i13) + ((-1821943044) * i15) + ((-535298048) * i5) + ((-1427111936) * i4) + (1712848896 * i2) + (159514624 * i17);
        int i19 = ((i3 * (-1669307009)) - 1771304782) + (i6 * (-1669307009)) + (i14 * 564) + (i13 * (-1128)) + (i15 * 564) + (i5 * (-1669306445)) + (i4 * (-1582645698)) + (i2 * (-198941581)) + (i17 * (-203030528));
        return i18 + ((i19 * i19) * (-2008154112)) != 1 ? a(objArr) : e(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x042b A[PHI: r0
  0x042b: PHI (r0v74 java.lang.Boolean) = (r0v49 java.lang.Boolean), (r0v83 java.lang.Boolean) binds: [B:357:0x04c1, B:336:0x0429] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<o.ex.c> b(o.ef.a r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ck.c.b(o.ef.a):java.util.List");
    }

    private static a b(String str) {
        int i2 = 2 % 2;
        a aVar = new a(str);
        int i3 = f22427l + 117;
        f22428m = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    private static ac b(String str, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22428m + 69;
        f22427l = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", 19 - MotionEvent.axisFromString(""), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q("參ꢤ쳫뮄叽΄᧭⛸쪻妢᱆埡鋨檔ậﶯ參ꢤ骅ੇ쁦鐟頕苳꾝Ἡ滄梐", 27 - TextUtils.indexOf("", "", 0, 0), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
                int i5 = f22428m + 49;
                f22427l = i5 % 128;
                int i6 = i5 % 2;
            }
            o.ef.a aVarX = aVar.x(str);
            List<o.ex.c> listB = b(aVarX);
            Object[] objArr3 = new Object[1];
            q("搗鱃쁦鐟멜\uda1e㰫ﵚ쩻Ꭼ", 8 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            boolean zBooleanValue = aVarX.h(((String) objArr3[0]).intern()).booleanValue();
            Object[] objArr4 = new Object[1];
            r("\ue49f蛸\ue4ef埪葒刈鿵韠\uefd6譽䝆", 1 - KeyEvent.keyCodeFromString(""), objArr4);
            return new ac(zBooleanValue, aVarX.s(((String) objArr4[0]).intern()), listB);
        } catch (b e2) {
            throw new o.en.f(e2.getMessage());
        }
    }

    private o.ep.e d(o.ef.a aVar) throws b {
        int i2 = f22417a * (-1771178812);
        f22417a = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = f22421e * (-1817576429);
        f22421e = i3;
        int i4 = (-1886760791) * f22420d;
        f22420d = i4;
        return (o.ep.e) b(i4, -1297122563, i3, priority, new Object[]{this, aVar}, 1297122564, i2);
    }

    private static o.er.e d(String str, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22428m + 63;
        f22427l = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", Color.alpha(0) + 20, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q("參ꢤ쳫뮄䀮㻵얫猪鋨檔ậﶯ參ꢤ骅ੇ쁦鐟頕苳꾝Ἡ滄梐", 23 - (Process.myTid() >> 22), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
                int i5 = f22428m + 7;
                f22427l = i5 % 128;
                int i6 = i5 % 2;
            }
            o.ef.a aVarX = aVar.x(str);
            Object[] objArr3 = new Object[1];
            q("搗鱃쁦鐟멜\uda1e㰫ﵚ쩻Ꭼ", TextUtils.lastIndexOf("", '0') + 10, objArr3);
            boolean zBooleanValue = aVarX.h(((String) objArr3[0]).intern()).booleanValue();
            Object[] objArr4 = new Object[1];
            r("\ue49f蛸\ue4ef埪葒刈鿵韠\uefd6譽䝆", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            String strS = aVarX.s(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            r("ᛝ獧ᚮ艖燉螴ܕ༤ᶘ绾", ExpandableListView.getPackedPositionType(0L) + 1, objArr5);
            Object[] objArr6 = {aVarX, ((String) objArr5[0]).intern(), Boolean.FALSE};
            int iNextInt = new Random().nextInt();
            int i7 = o.ef.a.f23781o * (-1229447468);
            o.ef.a.f23781o = i7;
            int iMyUid = Process.myUid();
            int i8 = o.ef.a.f23784r * 1570495625;
            o.ef.a.f23784r = i8;
            return new o.er.e(zBooleanValue, strS, ((Boolean) o.ef.a.a(821341192, objArr6, iMyUid, i8, -821341184, iNextInt, i7)).booleanValue());
        } catch (b e2) {
            throw new o.en.f(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0504  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ck.c.e(java.lang.Object[]):java.lang.Object");
    }

    private o.ep.e e(o.ef.a aVar) throws Throwable {
        o.ef.a aVarV;
        int i2 = 2 % 2;
        try {
            if (f.a()) {
                int i3 = f22427l + 25;
                f22428m = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", AndroidCharacter.getMirror('0') - 28, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q("參ꢤ쳫뮄媐킭\ued8e檏唡\ud858\uf188࢜Ủꇂ貦칆ꧬ␣剀䚹", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC4, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            if (aVar != null) {
                int i5 = f22427l + 57;
                f22428m = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    q("ꤦ䝃\ued8e檏唡\ud858\uf188࢜Ủꇂ貦칆ꧬ␣剀䚹", 11 >>> (ViewConfiguration.getTouchSlop() / 62), objArr3);
                    aVarV = aVar.v(((String) objArr3[0]).intern());
                } else {
                    Object[] objArr4 = new Object[1];
                    q("ꤦ䝃\ued8e檏唡\ud858\uf188࢜Ủꇂ貦칆ꧬ␣剀䚹", (ViewConfiguration.getTouchSlop() >> 8) + 15, objArr4);
                    aVarV = aVar.v(((String) objArr4[0]).intern());
                }
            } else {
                aVarV = null;
            }
            Object[] objArr5 = {this, aVarV};
            int i6 = f22417a * (-1771178812);
            f22417a = i6;
            int priority = Thread.currentThread().getPriority();
            int i7 = f22421e * (-1817576429);
            f22421e = i7;
            int i8 = (-1886760791) * f22420d;
            f22420d = i8;
            return (o.ep.e) b(i8, -1297122563, i7, priority, objArr5, 1297122564, i6);
        } catch (b e2) {
            throw new o.en.f(e2.getMessage());
        }
    }

    private static j e(String str, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22428m + 95;
        f22427l = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", 20 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                q("參ꢤ쳫뮄叽΄᧭⛸쪻妢᱆埡鋨檔ậﶯ參ꢤ骅ੇ쁦鐟頕苳꾝Ἡ滄梐", 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
                int i5 = f22428m + 109;
                f22427l = i5 % 128;
                int i6 = i5 % 2;
            }
            o.ef.a aVarX = aVar.x(str);
            Object[] objArr3 = new Object[1];
            q("搗鱃쁦鐟멜\uda1e㰫ﵚ쩻Ꭼ", TextUtils.getOffsetAfter("", 0) + 9, objArr3);
            boolean zBooleanValue = aVarX.h(((String) objArr3[0]).intern()).booleanValue();
            Object[] objArr4 = new Object[1];
            r("\ue49f蛸\ue4ef埪葒刈鿵韠\uefd6譽䝆", KeyEvent.keyCodeFromString("") + 1, objArr4);
            return new j(zBooleanValue, aVarX.s(((String) objArr4[0]).intern()));
        } catch (b e2) {
            throw new o.en.f(e2.getMessage());
        }
    }

    static void e() {
        f22422g = (char) 47717;
        f22424i = (char) 10583;
        f22423h = (char) 63020;
        f22425j = (char) 7170;
        f22426k = 3703551793536405681L;
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 79;
    }

    static void init$1() {
        $$d = new byte[]{7, 42, -92, 85, 60, MessagePack.Code.BIN16, -5, 49, MessagePack.Code.BIN32};
        $$e = 9;
    }

    static void init$2() {
        $$c = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
        $$f = 240;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = 0;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 77 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = 58224;
            if (i8 % i3 == 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d >> 1];
            } else {
                cArr3[i5] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i10 = i5;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f22423h) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22425j);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int defaultSize = 270 - View.getDefaultSize(i5, i5);
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i5));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i5) + 12;
                        byte b2 = (byte) i5;
                        String str$$g = $$g((byte) 45, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(defaultSize, cIndexOf, bitsPerPixel, -1995022631, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f22422g) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22424i)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 271, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1995022631, false, $$g((byte) 45, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i3 = 2;
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
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                i3 = 2;
                objA3 = d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 270, (char) View.MeasureSpec.getSize(0), 11 - (Process.myPid() >> 22), -2074123590, false, $$g((byte) (-$$c[3]), b4, b4), new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void r(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 121;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 111;
            $11 = i6 % 128;
            obj = charArray;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22426k ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22426k)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(229 - View.MeasureSpec.getSize(0), (char) (51005 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 9 - (KeyEvent.getMaxKeyCode() >> 16), 1749983833, false, $$g((byte) 7, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = d.a(674 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 522683165, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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

    private static void s(short s2, int i2, short s3, Object[] objArr) {
        int i3 = 3 - (s3 * 2);
        byte[] bArr = $$a;
        int i4 = s2 * 4;
        int i5 = i2 + 99;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + i5;
        }
        while (true) {
            i7++;
            i3++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 += bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 5
            int r7 = r0 + 4
            int r0 = r6 * 5
            int r6 = 6 - r0
            byte[] r5 = o.ck.c.$$d
            int r0 = r8 * 13
            int r0 = r0 + 98
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2d
            r2 = r3
            r1 = r7
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            int r1 = r1 + 1
            int r7 = r7 + (-5)
        L1b:
            byte r0 = (byte) r7
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r6) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L2a:
            r0 = r5[r1]
            goto L15
        L2d:
            r2 = r3
            r1 = r7
            r7 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ck.c.t(byte, short, int, java.lang.Object[]):void");
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        Object[] objArr = {this, str, str2, Integer.valueOf(i2), str3};
        int i3 = f22419c * (-982349521);
        f22419c = i3;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = f22418b * (-1142321735);
        f22418b = i4;
        return (o.eq.b) b((int) Runtime.getRuntime().freeMemory(), -1151397332, i4, elapsedCpuTime, objArr, 1151397332, i3);
    }

    @Override // o.cl.c
    public final List<e> d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        Object bVar;
        int i3 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            q("禳秧쏫⑮ﶃ塝귣\ueea3致툈흩쵚뽸⊡\u09ca\uf57c쳫뮄䝍롇", 20 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q("參ꢤ쳫뮄윀ᬣ\u1776溗॒慪⪉铣ꭌ欅", (Process.myTid() >> 22) + 14, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            int i4 = f22428m + 105;
            f22427l = i4 % 128;
            int i5 = i4 % 2;
        }
        String str4 = this.f22432f;
        Object[] objArr3 = new Object[1];
        r("ꩼ娣ꨘ蕢墁肓枫澣ꄤ垵闌瑥뱅䍲黨", 1 - TextUtils.getOffsetAfter("", 0), objArr3);
        if (Objects.equals(str4, ((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            q("龝㿏嗜ࣣꂭᤗ쭟㎃⣦\udd75쩻Ꭼ", Gravity.getAbsoluteGravity(0, 0) + 11, objArr4);
            j jVarE = e(((String) objArr4[0]).intern(), aVar);
            Object[] objArr5 = new Object[1];
            q("龝㿏嗜ࣣꂭᤗ㣙깏帓Ձ", 9 - MotionEvent.axisFromString(""), objArr5);
            j jVarE2 = e(((String) objArr5[0]).intern(), aVar);
            Object[] objArr6 = new Object[1];
            q("\ufe1f\ud8bf玘\udd8a貦칆쨈\u2d2c渖䓤뽸⊡\ueaa0쐐菚ᷙ", 14 - ExpandableListView.getPackedPositionChild(0L), objArr6);
            j jVarE3 = e(((String) objArr6[0]).intern(), aVar);
            Object[] objArr7 = new Object[1];
            q("\ufe1f\ud8bf玘\udd8a貦칆껓⾙ϕᏤ䝍롇َȯ쥈䅻鹳\ue933뽸⊡懗讬", 21 - View.resolveSizeAndState(0, 0, 0), objArr7);
            j jVarE4 = e(((String) objArr7[0]).intern(), aVar);
            Object[] objArr8 = new Object[1];
            r("椪텅楚䀿폻䗚\uf1b7料扒\udcdd傩\ue255缙젃宿\uef5c䣋\uf57b材\ud837䗩﹊爖쓔", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
            j jVarE5 = e(((String) objArr8[0]).intern(), aVar);
            Object[] objArr9 = new Object[1];
            r("믓炁뮧㟇爥㈺䧚䇞낑紻❤娹귪槅ⱌ圎騲咠Ⴉ", TextUtils.getOffsetBefore("", 0) + 1, objArr9);
            i iVarA = a(((String) objArr9[0]).intern(), aVar);
            Object[] objArr10 = new Object[1];
            r("ᅴ難ᄂ⿻鑋⨃鏤鯈ᨹ魺㽘耎݉辭㑰贳や", 1 - View.resolveSizeAndState(0, 0, 0), objArr10);
            i iVarA2 = a(((String) objArr10[0]).intern(), aVar);
            Object[] objArr11 = new Object[1];
            q("휳蘣鋨檔㰫ﵚῆ\uf364禳秧嗜ࣣꂭᤗ䤮轳硴䑉", 18 - View.resolveSize(0, 0), objArr11);
            j jVarE6 = e(((String) objArr11[0]).intern(), aVar);
            Object[] objArr12 = new Object[1];
            r("쯟宮쮾櫠夆漂饲酺삅嘸穖誚\uddc4䋠煽", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
            o.er.e eVarD = d(((String) objArr12[0]).intern(), aVar);
            Object[] objArr13 = new Object[1];
            q("參ꢤ떴棆뇐ꎣ⣦\udd75쩻Ꭼ", TextUtils.indexOf("", "", 0, 0) + 9, objArr13);
            j jVarE7 = e(((String) objArr13[0]).intern(), aVar);
            Object[] objArr14 = new Object[1];
            q("罟⢿ꁱ䤪䐊㊧䇡唡致툈\ue905⸲", 10 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr14);
            ac acVarB = b(((String) objArr14[0]).intern(), aVar);
            Object[] objArr15 = new Object[1];
            r("⥥㍎⤕ꪚㇰ꽿矔翝∝㻖먋搸㽐⨞넁椃ࢆᝑ跡幈", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr15);
            j jVarE8 = e(((String) objArr15[0]).intern(), aVar);
            Object[] objArr16 = new Object[1];
            r("峠伌岃瘷䶫珈彬坮垧䊯暚䲱䫙噖", -TextUtils.lastIndexOf("", '0', 0, 0), objArr16);
            bVar = new a(str, jVarE, jVarE2, jVarE3, jVarE4, jVarE5, iVarA, iVarA2, jVarE6, eVarD, jVarE7, acVarB, jVarE8, e(((String) objArr16[0]).intern(), aVar));
            int i6 = f22428m + 13;
            f22427l = i6 % 128;
            int i7 = i6 % 2;
        } else {
            String str5 = this.f22432f;
            Object[] objArr17 = new Object[1];
            r("亂⸐勵ꆳⲲꑂ쀫젣\uf243⎆넝폧\uef20㝐먲\udee7\ud8f1ਫ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr17);
            if (Objects.equals(str5, ((String) objArr17[0]).intern())) {
                Object[] objArr18 = new Object[1];
                q("龝㿏嗜ࣣꂭᤗ쭟㎃⣦\udd75쩻Ꭼ", 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr18);
                j jVarE9 = e(((String) objArr18[0]).intern(), aVar);
                Object[] objArr19 = new Object[1];
                q("\ufe1f\ud8bf玘\udd8a貦칆껓⾙ϕᏤ䝍롇َȯ쥈䅻鹳\ue933뽸⊡懗讬", 21 - Drawable.resolveOpacity(0, 0), objArr19);
                j jVarE10 = e(((String) objArr19[0]).intern(), aVar);
                Object[] objArr20 = new Object[1];
                r("믓炁뮧㟇爥㈺䧚䇞낑紻❤娹귪槅ⱌ圎騲咠Ⴉ", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr20);
                bVar = new o.er.b(str, jVarE9, jVarE10, a(((String) objArr20[0]).intern(), aVar), e(aVar));
            } else {
                bVar = null;
            }
        }
        return Collections.singletonList(bVar);
    }
}
