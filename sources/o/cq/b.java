package o.cq;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.a.g;
import o.a.k;
import o.cl.c;
import o.d.d;
import o.dn.e;
import o.ef.a;
import o.et.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c<f> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f22555a = 0;

    /* JADX INFO: renamed from: b */
    private static char f22556b = 0;

    /* JADX INFO: renamed from: c */
    private static char f22557c = 0;

    /* JADX INFO: renamed from: d */
    private static char f22558d = 0;

    /* JADX INFO: renamed from: e */
    private static char f22559e = 0;

    /* JADX INFO: renamed from: f */
    private static int f22560f = 0;

    /* JADX INFO: renamed from: g */
    private static int f22561g = 0;

    /* JADX INFO: renamed from: h */
    private static int f22562h = 0;

    /* JADX INFO: renamed from: i */
    private static int f22563i = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0020 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            byte[] r7 = o.cq.b.$$a
            int r6 = r10 + 4
            int r5 = r8 * 4
            int r0 = r5 + 1
            int r4 = r9 + 69
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r7 != 0) goto L25
            r0 = r4
            r1 = r2
            r4 = r5
        L12:
            int r4 = r4 + r0
        L13:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r6 = r6 + 1
            if (r1 != r5) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L20:
            r0 = r7[r6]
            int r1 = r1 + 1
            goto L12
        L25:
            r1 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cq.b.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22561g = 0;
        f22562h = 1;
        f22563i = 0;
        f22560f = 1;
        a();
        PointF.length(0.0f, 0.0f);
        int i2 = f22561g + 87;
        f22562h = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f22555a = 2557438156070182923L;
        f22559e = (char) 65283;
        f22558d = (char) 5835;
        f22556b = (char) 48148;
        f22557c = (char) 13366;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<o.cl.b> d(o.ef.c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cq.b.d(o.ef.c):java.util.List");
    }

    private static f d(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        f fVar = new f(str, str2, i2, str3);
        int i4 = f22560f + 99;
        f22563i = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return fVar;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = 9;
    }

    private static void j(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 81;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 53;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22555a ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i11 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22555a)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(229 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (51004 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, 1749983833, false, $$c(b2, (byte) ((b2 + 38) - (38 & b2)), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 676, (char) (KeyEvent.getMaxKeyCode() >> 16), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 522683165, false, $$c(b3, (byte) (45 | b3), (byte) (-1)), new Class[]{Object.class, Object.class});
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

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 105;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i5] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f22556b) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f22557c)};
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1995022631, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f22559e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22558d)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(Color.alpha(0) + 270, (char) Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, -1995022631, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i8 = $10 + 117;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
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
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 3);
                objA3 = d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 270, (char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "", 0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        String str3 = new String(cArr2, 0, i2);
        int i10 = $10 + 103;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str3;
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22563i + 43;
        f22560f = i4 % 128;
        int i5 = i4 % 2;
        f fVarD = d(str, str2, i2, str3);
        if (i5 == 0) {
            int i6 = 92 / 0;
        }
        return fVarD;
    }

    @Override // o.cl.c
    public final List<f> d(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        int i3 = 2 % 2;
        try {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                j("븦빶藁㯐\uf7c5\udf40众ᠡ瞲쮂熉湦\u2dc7\uf250ꝏꖞ\ue30f㠙鴊ﯭ饄", KeyEvent.keyCodeFromString("") + 1, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                j("옼왎\ue678崥鑬릦\udc66譑ྨ꠫ᝯﴗ嗝釹솩㚝魊寱", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            }
            ArrayList arrayList = new ArrayList();
            f fVar = new f(str, str2, i2, str3);
            Object[] objArr3 = new Object[1];
            k("躂\udd01学\ue4d0힞뺎돆\ue5c7\uec18켂", ImageFormat.getBitsPerPixel(0) + 11, objArr3);
            a aVarX = aVar.x(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            j("৾ঝ빛蟙책捕糂⯥쁛\uf013춇嶹験짏ᭌ陉哓\u0381№져⺀喰棣ˀ丹꽡", 1 - TextUtils.indexOf("", "", 0, 0), objArr4);
            a aVarX2 = aVarX.x(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            j("鶚鷛焍뵐̵姶맍", 1 - TextUtils.getOffsetAfter("", 0), objArr5);
            fVar.e(aVarX2.D(((String) objArr5[0]).intern()));
            Object[] objArr6 = new Object[1];
            j("㣳㢃嫋ᫍ⣛﹖\ue0b7랉\uf152ᒀ傄쇦ꬸ\u2d6b", Drawable.resolveOpacity(0, 0) + 1, objArr6);
            Object[] objArr7 = {fVar, aVarX2.D(((String) objArr6[0]).intern())};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = o.et.c.f25349r * 1770900040;
            o.et.c.f25349r = i4;
            int i5 = o.et.c.f25350s * 1440287991;
            o.et.c.f25350s = i5;
            int i6 = o.et.c.f25351t * 985966497;
            o.et.c.f25351t = i6;
            o.et.c.d(486595506, objArr7, iUptimeMillis, -486595502, i4, i5, i6);
            arrayList.add(fVar);
            Object[] objArr8 = new Object[1];
            j("년넅蚗泉\uf48a衂㒈掺磳죾⚭ᗛ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
            byte[] bArrZ = aVarX2.z(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            j("Ꮇ\u13f6\ued9b힕龆㌞ꓕ\uf3e7\uda00ꏬ鷈薣聆騒䬑习亏偽煳ဃ", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9);
            byte[] bArrZ2 = aVarX2.z(((String) objArr9[0]).intern());
            if (bArrZ != null && bArrZ2 != null) {
                int i7 = f22560f + 117;
                f22563i = i7 % 128;
                if (i7 % 2 != 0) {
                    o.ea.f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr10 = new Object[1];
                    j("븦빶藁㯐\uf7c5\udf40众ᠡ瞲쮂熉湦\u2dc7\uf250ꝏꖞ\ue30f㠙鴊ﯭ饄", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                    String strIntern2 = ((String) objArr10[0]).intern();
                    Object[] objArr11 = new Object[1];
                    j("둠됒碭᧫હﵨ\ue1d9뛮練㛾厡삨➁༬蕧ଢ\ue901씤뼧唪錄鍝\uf6e8鿔䓕榈⢻꧞ນ⟀扢\uf05eさﰗ鐷㨂﨩쩇츄䒊ꏠ肉ǚ躋喫廔㮇\ud946", -ExpandableListView.getPackedPositionChild(0L), objArr11);
                    o.ea.f.c(strIntern2, ((String) objArr11[0]).intern());
                }
                f fVar2 = new f(o.et.c.a(str), str2, i2, str3);
                fVar2.e(bArrZ);
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i8 = o.et.c.f25349r * 1770900040;
                o.et.c.f25349r = i8;
                int i9 = o.et.c.f25350s * 1440287991;
                o.et.c.f25350s = i9;
                int i10 = o.et.c.f25351t * 985966497;
                o.et.c.f25351t = i10;
                o.et.c.d(486595506, new Object[]{fVar2, bArrZ2}, iUptimeMillis2, -486595502, i8, i9, i10);
                fVar2.d(true);
                arrayList.add(fVar2);
            }
            Object[] objArr12 = new Object[1];
            k("쉓ἦ焊襯菷圔풞꾶", 8 - Color.alpha(0), objArr12);
            byte[] bArrD = aVarX2.D(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            k("\u0b7a㨖힞뺎澨ቹ\uf048䬑씏㽀덲枅", 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr13);
            aVarX2.D(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            k("\u0b7a㨖힞뺎壱鮜", 6 - TextUtils.getTrimmedLength(""), objArr14);
            aVarX2.D(((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            k("沿\ue787讷蠔澨ቹ\uf048䬑씏㽀덲枅", 10 - MotionEvent.axisFromString(""), objArr15);
            aVarX2.D(((String) objArr15[0]).intern());
            Object[] objArr16 = new Object[1];
            k("沿\ue787讷蠔壱鮜", 6 - View.resolveSizeAndState(0, 0, 0), objArr16);
            aVarX2.D(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            j("ⅼℿ䪴\uf6b4㢌ሗﳷꯧ\ue8e7Ӻ볧\uddad닅", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
            aVarX2.D(((String) objArr17[0]).intern());
            Object[] objArr18 = new Object[1];
            j("糏粌\uf862侣詚\uab00㆘暈땔똬װჂ\uef75", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr18);
            aVarX2.D(((String) objArr18[0]).intern());
            Object[] objArr19 = new Object[1];
            k("툿쎯\u1ae7묠⋘龓ం삔쟐솞쑼䠏썅\udd27㋌ꉠ뚒Ẫ씏㽀纪劧樋\uf175", View.MeasureSpec.getMode(0) + 23, objArr19);
            String strS = aVarX2.s(((String) objArr19[0]).intern());
            if (strS != null && !strS.isEmpty()) {
                try {
                    Integer.valueOf(strS);
                } catch (NumberFormatException unused) {
                    Object[] objArr20 = new Object[1];
                    k("⌒寳驪⫲껷뇚鬒壿ὅ䘷痩楆\uf044칣쇙愇識秏\ue367嗿䆈ﭞ욓롷빦蛋鄘悳횶\u0a80\u206c豤坥⟻௩蕮ㇾㅾ嵇⡆蜦ᇰ﮶縼㋌ꉠ", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46, objArr20);
                    throw new o.en.f(((String) objArr20[0]).intern());
                }
            }
            Object[] objArr21 = new Object[1];
            k("素땢\uf814︐␅璹쉿ต歲\udd54陵\ue84fᒊ柦퇯ໂ", ExpandableListView.getPackedPositionChild(0L) + 16, objArr21);
            aVarX2.D(((String) objArr21[0]).intern());
            Object[] objArr22 = new Object[1];
            k("素땢\uf814︐즼龸䦈㫚씏㽀埉昁␅璹ꖔ諺", 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr22);
            aVarX2.D(((String) objArr22[0]).intern());
            Object[] objArr23 = new Object[1];
            k("鹖寪㼏迅櫝䑢", 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr23);
            aVarX2.D(((String) objArr23[0]).intern());
            Object[] objArr24 = new Object[1];
            j("䟑䞕௹ᑽ秃\uf0d6㿮", Color.red(0) + 1, objArr24);
            aVarX2.B(((String) objArr24[0]).intern());
            Object[] objArr25 = new Object[1];
            k("ꯟቢ奧뺵꽷ᤩ学\ue4d0ꖽ鮠\ue6c1\ua8ca\ue9fd䨯뼙쑖", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr25);
            aVarX2.D(((String) objArr25[0]).intern());
            Object[] objArr26 = new Object[1];
            j("銻鋲讨\ua83f寧䲮퓛菽嬚역\ue257\uf58fťﰞ㒈㹩쾚㙾\u0ef4恶", 1 - View.getDefaultSize(0, 0), objArr26);
            aVarX2.D(((String) objArr26[0]).intern());
            Object[] objArr27 = new Object[1];
            j("\ud92a\ud96bഩ凹缨땫嫦ෙႇ䍾ᮬ箅䫋窾쵯끾萉냻\uf731\uee0b﹕\ue6c5", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr27);
            byte[] bArrD2 = aVarX2.D(((String) objArr27[0]).intern());
            Object[] objArr28 = new Object[1];
            j("ℝ⅍㬛\ueec1䤘ੌ࢘徻\ue8ab畄\ua48f⧻담䲓牟\ue21c簒蛊䠌뱣٤탭Ǘ皔톧⨼\udf96䃠鯌摿镐ᤜ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr28);
            aVarX2.D(((String) objArr28[0]).intern());
            Object[] objArr29 = new Object[1];
            j("䡒䠠ѯꆃ登䔂\uef63롟臤䨪\uebd7", Color.argb(0, 0, 0, 0) + 1, objArr29);
            Object[] objArr30 = {aVarX2, ((String) objArr29[0]).intern()};
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i11 = a.f23780n * (-1229108307);
            a.f23780n = i11;
            List<o.cl.b> listD = d((o.ef.c) a.a(-1398121910, objArr30, iMyUid, i11, 1398121917, iUptimeMillis3, iElapsedRealtime));
            Object[] objArr31 = new Object[1];
            j("顦頫膮\udac0\uf3be㹚㓹揾凐쿪邒ᖝஏ\uf624䙄\ude4b악㱭簫耨뼙橼㗾䫗", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr31);
            if (aVarX2.d(((String) objArr31[0]).intern())) {
                int i12 = f22563i + 77;
                f22560f = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr32 = new Object[1];
                j("굇괊礼睅蠈鏟ᷯ䫨擱둜㴗㲋㺮趒\uebc1\uf75d\uf064䟛톰ꤝ訸ᇼ顃揸巌\ueb03䘆喋ញꕌ", -TextUtils.indexOf((CharSequence) "", '0'), objArr32);
                if (aVarX2.d(((String) objArr32[0]).intern())) {
                    int i14 = f22560f + 95;
                    f22563i = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        Object[] objArr33 = new Object[1];
                        j("굇괊礼睅蠈鏟ᷯ䫨擱둜㴗㲋㺮趒\uebc1\uf75d\uf064䟛톰ꤝ訸ᇼ顃揸巌\ueb03䘆喋ញꕌ", Color.blue(0) + 1, objArr33);
                        byte[] bArrD3 = aVarX2.D(((String) objArr33[0]).intern());
                        Object[] objArr34 = new Object[1];
                        k("素땢\uf814︐즼龸䦈㫚씏㽀埉昁␅璹ꖔ諺", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr34);
                        Object[] objArr35 = {aVarX2, ((String) objArr34[0]).intern()};
                        int i16 = a.f23782p * (-1576737484);
                        a.f23782p = i16;
                        o.ei.c cVarC = o.ei.c.c(Integer.parseInt((String) a.a(-781664457, objArr35, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i16, Thread.currentThread().getPriority()), 16));
                        if (cVarC == null) {
                            Object[] objArr36 = new Object[1];
                            k("⌒寳驪⫲껷뇚鬒壿ὅ䘷痩楆\uf044칣쇙愇識秏\ue367嗿䆈ﭞ욓롷빦蛋鄘悳횶\u0a80\u206c豤坥⟻௩蕮ㇾㅾ嵇⡆蜦ᇰ﮶縼㋌ꉠ閖㡣⠩鴱粩抒ዕꃩퟔ驗떝駅﮶縼떝駅횶\u0a80㬒蚗⣄決彻䖈", (ViewConfiguration.getWindowTouchSlop() >> 8) + 69, objArr36);
                            throw new o.en.f(((String) objArr36[0]).intern());
                        }
                        o.ei.b.a(bArrD3, cVarC);
                        Object[] objArr37 = new Object[1];
                        j("顦頫膮\udac0\uf3be㹚㓹揾凐쿪邒ᖝஏ\uf624䙄\ude4b악㱭簫耨뼙橼㗾䫗", 1 - KeyEvent.getDeadChar(0, 0), objArr37);
                        o.dl.d.b(aVarX2.D(((String) objArr37[0]).intern())).shortValueExact();
                    } catch (ArithmeticException | NumberFormatException e2) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr38 = new Object[1];
                        j("\ueb02\ueb6b誇䪌\uf898긞嘾Ę⊲쒍ò睺磅ﴯ화벁똡㝀\uec43\ue2cf찵慭ꗌ⠯᮳鮮篘Ṽ凹헥ㅄ䞅漫ว읅趱ꕦ㡬鵺\uf324ﲈ犨劼㤩૬곮棦溨䀏\ue531㹰咬鸒", 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr38);
                        throw new o.en.f(sb2.append(((String) objArr38[0]).intern()).append(e2.getMessage()).toString());
                    }
                }
            }
            Object[] objArr39 = new Object[1];
            k("圁\ue0d2⬙픦", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr39);
            if (aVarX2.d(((String) objArr39[0]).intern())) {
                int i17 = f22563i + 71;
                f22560f = i17 % 128;
                int i18 = i17 % 2;
                try {
                    Object[] objArr40 = new Object[1];
                    k("圁\ue0d2⬙픦", 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr40);
                    byte[] bArrD4 = aVarX2.D(((String) objArr40[0]).intern());
                    Object[] objArr41 = new Object[1];
                    k("素땢\uf814︐즼龸䦈㫚씏㽀埉昁␅璹ꖔ諺", 15 - MotionEvent.axisFromString(""), objArr41);
                    Object[] objArr42 = {aVarX2, ((String) objArr41[0]).intern()};
                    int i19 = a.f23782p * (-1576737484);
                    a.f23782p = i19;
                    o.ei.c cVarC2 = o.ei.c.c(Integer.parseInt((String) a.a(-781664457, objArr42, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority()), 16));
                    if (cVarC2 == null) {
                        Object[] objArr43 = new Object[1];
                        k("⌒寳驪⫲껷뇚鬒壿ὅ䘷痩楆\uf044칣쇙愇識秏\ue367嗿䆈ﭞ욓롷빦蛋鄘悳횶\u0a80\u206c豤坥⟻௩蕮ㇾㅾ嵇⡆蜦ᇰ﮶縼㋌ꉠ閖㡣⠩鴱粩抒ዕꃩퟔ驗떝駅﮶縼떝駅횶\u0a80㬒蚗⣄決彻䖈", 69 - TextUtils.indexOf("", "", 0, 0), objArr43);
                        throw new o.en.f(((String) objArr43[0]).intern());
                    }
                    o.ei.b.a(bArrD4, cVarC2);
                } catch (NumberFormatException e3) {
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr44 = new Object[1];
                    j("\ueb02\ueb6b誇䪌\uf898긞嘾Ę⊲쒍ò睺磅ﴯ화벁똡㝀\uec43\ue2cf찵慭ꗌ⠯᮳鮮篘Ṽ凹헥ㅄ䞅漫ว읅趱ꕦ㡬鵺\uf324ﲈ犨劼㤩૬곮棦溨䀏\ue531㹰咬鸒", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr44);
                    throw new o.en.f(sb3.append(((String) objArr44[0]).intern()).append(e3.getMessage()).toString());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar3 = (f) ((o.et.c) it.next());
                if (arrayList.size() > 1) {
                    int iMyPid = Process.myPid();
                    int i20 = o.et.c.f25353v * 1073314991;
                    o.et.c.f25353v = i20;
                    int iMyTid = Process.myTid();
                    int i21 = o.et.c.f25354w * 1986112249;
                    o.et.c.f25354w = i21;
                    Object[] objArr45 = {fVar3, o.dl.b.e((byte[]) o.et.c.d(-1168717246, new Object[]{fVar3}, iMyPid, 1168717251, i20, iMyTid, i21), bArrD)};
                    int i22 = (int) Runtime.getRuntime().totalMemory();
                    int id = (int) Thread.currentThread().getId();
                    int i23 = o.et.c.f25341f * 1595628892;
                    o.et.c.f25341f = i23;
                    o.et.c.d(-1863692548, objArr45, i22, 1863692548, id, i23, Process.myUid());
                } else {
                    int i24 = (int) Runtime.getRuntime().totalMemory();
                    int id2 = (int) Thread.currentThread().getId();
                    int i25 = o.et.c.f25341f * 1595628892;
                    o.et.c.f25341f = i25;
                    o.et.c.d(-1863692548, new Object[]{fVar3, bArrD}, i24, 1863692548, id2, i25, Process.myUid());
                }
                new e(bArrD2);
                int iMyPid2 = Process.myPid();
                int i26 = o.et.c.f25353v * 1073314991;
                o.et.c.f25353v = i26;
                int iMyTid2 = Process.myTid();
                int i27 = o.et.c.f25354w * 1986112249;
                o.et.c.f25354w = i27;
                short sA = o.dl.b.a((byte[]) o.et.c.d(-1168717246, new Object[]{fVar3}, iMyPid2, 1168717251, i26, iMyTid2, i27), bArrD);
                if (sA == 0) {
                    Object[] objArr46 = new Object[1];
                    k("⌒寳驪⫲껷뇚鬒壿ὅ䘷痩楆\uf044칣쇙愇識秏\ue367嗿䆈ﭞ욓롷빦蛋鄘悳횶\u0a80\u206c豤坥⟻௩蕮ㇾㅾ嵇⡆蜦ᇰ﮶縼㋌ꉠ", (KeyEvent.getMaxKeyCode() >> 16) + 46, objArr46);
                    throw new o.en.f(((String) objArr46[0]).intern());
                }
                fVar3.b(sA);
                Iterator<o.cl.b> it2 = listD.iterator();
                int i28 = f22560f + 123;
                f22563i = i28 % 128;
                int i29 = i28 % 2;
                while (it2.hasNext()) {
                    int i30 = f22560f + 113;
                    f22563i = i30 % 128;
                    int i31 = i30 % 2;
                    fVar3.e(it2.next());
                }
            }
            return arrayList;
        } catch (o.ef.b e4) {
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr47 = new Object[1];
            j("铄钎柧潭ᗥ诠\ueb1c밡崠⦵┾쩨ܩၬ\uf3feƮ짧\uda36짮忦뎺谇聽锊摾盔帳ꍉ⸹㢈ᒺ婢ჰ\ue341\ue2b2ブ\udac4픆뢇与荄鿙睈葌界䆬䴟펕㿍࠘ᯯ\ue9d3\ue184\uf228톛⟼꩑ꓴꡟ紴鰒滬昶譾䛋兼㲞싩ࢤ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr47);
            throw new o.en.f(sb4.append(((String) objArr47[0]).intern()).append(e4.getMessage()).toString());
        }
    }
}
