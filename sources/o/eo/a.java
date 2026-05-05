package o.eo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Random;
import o.a.k;
import o.a.o;
import o.aj.b;
import o.eo.b;
import o.ep.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b<i> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f24215a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24216b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f24217c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f24218d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f24219e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24220g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f24221i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24222j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(short r8, byte r9, int r10) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r7 = o.eo.a.$$d
            int r0 = r9 + 65
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2b
            r3 = r4
            r1 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r3
            int r8 = r8 + 1
        L19:
            byte r2 = (byte) r0
            r6[r1] = r2
            if (r1 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            r2 = r7[r8]
            int r1 = r1 + 1
            r3 = r0
            r0 = r2
            goto L15
        L2b:
            r1 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.a.$$f(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24222j = 0;
        f24221i = 1;
        f24216b = 0;
        f24220g = 1;
        g();
        ViewConfiguration.getScrollBarFadeDuration();
        SystemClock.uptimeMillis();
        int i2 = f24222j + 89;
        f24221i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: e, reason: avoid collision after fix types in other method */
    private static o.ef.a e2(i iVar) throws Throwable {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        h((char) (769 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "钢姠痖", "\u0000\u0000\u0000\u0000", "\ue440忒ɴ묃", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1952436964, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (iVar.d() != null) {
            int i3 = f24216b + 101;
            f24220g = i3 % 128;
            int i4 = i3 % 2;
            strA = iVar.d().a();
        } else {
            strA = null;
        }
        aVar.a(strIntern, (Object) strA);
        Object[] objArr2 = new Object[1];
        l("\u0c3a\u0c4eꟻ\u0ef2瘥찖\ud9beꈭ홫屯㒫얗傃Ӽ", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        int iNextInt = new Random().nextInt(829335317);
        i.f24595m = i.f24595m * 1091325868;
        aVar.a(strIntern2, i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), r16, new Object[]{iVar}, 2118374413));
        Object[] objArr3 = new Object[1];
        l("쒤쓐픝뎚嘁뻰擖檳\ua48d\ue107ᒏ\ue5b3頄瘌傕謳쾥즅蘛媢紪鯧\uf5a4\ue852겵浢", TextUtils.indexOf("", "", 0), objArr3);
        aVar.a(((String) objArr3[0]).intern(), (Object) iVar.c());
        Object[] objArr4 = new Object[1];
        h((char) Color.green(0), "\uf6bc華䄵隂\ue679딬\udde4賓ꭲ", "\u0000\u0000\u0000\u0000", "턉❤㥧⚔", 1730634961 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        int iNextInt2 = new Random().nextInt();
        i.f24592j = i.f24592j * 1317344399;
        i.f24588f = i.f24588f * (-400471327);
        i.f24590h = i.f24590h * (-1076688547);
        aVar.a(strIntern3, i.d(r12, 1600156906, iNextInt2, r15, r16, new Object[]{iVar}, -1600156903));
        Object[] objArr5 = new Object[1];
        h((char) (View.MeasureSpec.getMode(0) + 59525), "䭰蓦䙍囦顐\uea31ͣ尴뭔혀㧋ន舿\ueb9f뒋ꢍ\ue97a͎锼", "\u0000\u0000\u0000\u0000", "쥗뽎蕑ᇨ", 1371492041 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        aVar.a(((String) objArr5[0]).intern(), (Object) iVar.e());
        Object[] objArr6 = new Object[1];
        l("뛓뚧鞥淊搱ﱔ몝ᣅ\ue610㽌⚎\ud7ad\uea56㒿軂뤰뷔謠塷梭ཞ\ud94f", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
        aVar.a(((String) objArr6[0]).intern(), (Object) iVar.f());
        Object[] objArr7 = new Object[1];
        h((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "･쯄덣㲇捅狗眄\uee1d\ue9a5펥鬙ꌶ屒→轺郦殔䌚\udfad啴\ufbca", "\u0000\u0000\u0000\u0000", "ᇨﯧ⡔\uf323", 1425794833 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        int id = (int) Thread.currentThread().getId();
        int iMyPid = Process.myPid();
        i.f24597o = i.f24597o * (-1717583902);
        i.f24596n = (-154475842) * i.f24596n;
        aVar.a(strIntern4, i.d(r12, 539787049, id, r15, iMyPid, new Object[]{iVar}, -539787043));
        Object[] objArr8 = new Object[1];
        l("ဲ၆꿾沭坂쐏믺븤\ude4b㸫ᗽ\ue4de䲷\u0ce4辥詃ᬵ덻夊密ꦢ\ue114", Color.alpha(0), objArr8);
        String strIntern5 = ((String) objArr8[0]).intern();
        int i5 = i.f24594l * (-1627566601);
        i.f24594l = i5;
        if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i5, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), new Object[]{iVar}, -1662058970)) != null) {
            int i6 = f24216b + 55;
            f24220g = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i.f24594l * (-1627566601);
            i.f24594l = i8;
            strA2 = ((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i8, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), new Object[]{iVar}, -1662058970)).a();
        } else {
            strA2 = null;
        }
        aVar.a(strIntern5, (Object) strA2);
        Object[] objArr9 = new Object[1];
        l("㕣㔗ퟔ༉툗밳\ud845邨", TextUtils.getOffsetBefore("", 0), objArr9);
        String strIntern6 = ((String) objArr9[0]).intern();
        int i9 = i.f24600s * (-948551921);
        i.f24600s = i9;
        int i10 = i.f24599r * (-1934953559);
        i.f24599r = i10;
        int id2 = (int) Thread.currentThread().getId();
        int i11 = i.f24598p * 1898373301;
        i.f24598p = i11;
        if (((i.d) i.d(id2, -38470119, i9, i11, i10, new Object[]{iVar}, 38470128)) != null) {
            int i12 = f24216b + 55;
            f24220g = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i.f24600s * (-948551921);
            i.f24600s = i14;
            int i15 = i.f24599r * (-1934953559);
            i.f24599r = i15;
            int id3 = (int) Thread.currentThread().getId();
            int i16 = i.f24598p * 1898373301;
            i.f24598p = i16;
            strA3 = ((i.d) i.d(id3, -38470119, i14, i16, i15, new Object[]{iVar}, 38470128)).a();
        } else {
            strA3 = null;
        }
        aVar.a(strIntern6, (Object) strA3);
        Object[] objArr10 = new Object[1];
        h((char) (View.getDefaultSize(0, 0) + 42939), "砒䱹\ud9a0\uf5fdࢀ䡽", "\u0000\u0000\u0000\u0000", "鑙씇뮋릧", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
        String strIntern7 = ((String) objArr10[0]).intern();
        if (iVar.o() != null) {
            strA4 = iVar.o().a();
        } else {
            int i17 = f24220g + 23;
            f24216b = i17 % 128;
            int i18 = i17 % 2;
            strA4 = null;
        }
        aVar.a(strIntern7, (Object) strA4);
        Object[] objArr11 = new Object[1];
        h((char) (26345 - AndroidCharacter.getMirror('0')), "ꏛ诋聗쇑魴餃\ue86b՝콤璐ヹ㲊ꕊꄫ", "\u0000\u0000\u0000\u0000", "齖ꨳ맍\uda66", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
        String strIntern8 = ((String) objArr11[0]).intern();
        int iNextInt3 = new Random().nextInt();
        int i19 = i.f24587e * 565616564;
        i.f24587e = i19;
        int i20 = (-1875702751) * i.f24583a;
        i.f24583a = i20;
        aVar.a(strIntern8, (Long) i.d(i20, 1542329947, iNextInt3, (int) Thread.currentThread().getId(), i19, new Object[]{iVar}, -1542329946));
        Object[] objArr12 = new Object[1];
        h((char) View.getDefaultSize(0, 0), "颣⇷韣\u0fe0뽱틱œ긑㘉\uf1b0", "\u0000\u0000\u0000\u0000", "ȝఐ뻢ڛ", TextUtils.indexOf("", "", 0), objArr12);
        aVar.a(((String) objArr12[0]).intern(), (Object) iVar.l());
        Object[] objArr13 = new Object[1];
        h((char) (Process.myPid() >> 22), "౬\ued35䇒\uebad\ue190\ue87b쥧\u0014", "\u0000\u0000\u0000\u0000", "㭦몢⌹\uf33f", Process.myTid() >> 22, objArr13);
        aVar.a(((String) objArr13[0]).intern(), (Object) iVar.m());
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01c6, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02fd, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x033c, code lost:
    
        r2 = new java.lang.Object[1];
        l("詀訉鮠詰岰\uf050崺\u2454\uea2f\ud8eaḋ\uef79훐㢪楹膪腍蜸뿌倬㏑핛챃\ue2c2\ue26c⏉拜땭鳩牎덓䟁伨샀쇟ᙅ淋⽫", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0358, code lost:
    
        throw new o.ef.b(((java.lang.String) r2[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.ep.i e(o.ef.a r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.a.e(o.ef.a):o.ep.i");
    }

    static void g() {
        f24219e = 740602047300126166L;
        f24218d = 1564493270;
        f24217c = (char) 51829;
        f24215a = 3872347312802560484L;
    }

    private static void h(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 11;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj = null;
        Object charArray2 = str5;
        if (str5 != null) {
            int i7 = $10 + 81;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str5.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                str4.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i9 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i10 = $10 + 29;
            $11 = i10 % 128;
            int i11 = i10 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iLastIndexOf = 105 - TextUtils.lastIndexOf("", '0');
                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(i9, i9, i9));
                    int packedPositionType = 11 - ExpandableListView.getPackedPositionType(0L);
                    byte b2 = (byte) i9;
                    byte b3 = b2;
                    String str$$f = $$f(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i9] = Object.class;
                    objA = o.d.d.a(iLastIndexOf, cRgb, packedPositionType, -155898465, false, str$$f, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) i9;
                    byte b5 = (byte) (b4 + 3);
                    objA2 = o.d.d.a(847 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (6488 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, -694521287, false, $$f(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(458 - KeyEvent.keyCodeFromString(""), (char) Gravity.getAbsoluteGravity(0, 0), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1804962841, false, $$f(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 638, (char) (65100 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, 1636969060, false, $$f(b8, (byte) (57 | b8), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f24219e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24218d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24217c) ^ 740602047300126166L))));
                iVar.f19932b++;
                i3 = 2;
                i9 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i12 = $11 + 65;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str7;
        } else {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static void init$0() {
        $$d = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
        $$e = 219;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 123;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 19;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f24215a ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        int i8 = $10 + 27;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f24215a)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(229 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 51004), ExpandableListView.getPackedPositionGroup(0L) + 9, 1749983833, false, $$f(b2, (byte) (-$$d[3]), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 675, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 12, 522683165, false, $$f(b3, (byte) ((b3 + 49) - (49 & b3)), b3), new Class[]{Object.class, Object.class});
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

    @Override // o.eo.b
    protected final /* synthetic */ i b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24220g + 87;
        f24216b = i3 % 128;
        int i4 = i3 % 2;
        i iVarE = e(aVar);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return iVarE;
    }

    public final void b(Context context, String str, final b.d<i> dVar) throws WalletValidationException {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24216b + 47;
            f24220g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            h((char) View.resolveSizeAndState(0, 0, 0), "麯挙䭫瞡噏ച懣\udc89⠼滧굪瓵\ua95e⾽潾镶瑧꼦\ua8cc줘", "\u0000\u0000\u0000\u0000", "ᦂ꘠䧜ᡖ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            l("ט֪\u0bab쮩熶恐ᳳꯅ稵餯㌞", (Process.getThreadPriority(0) + 20) >> 6, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24216b + 29;
            f24220g = i5 % 128;
            int i6 = i5 % 2;
        }
        o.en.b bVarC = o.en.b.c();
        if (bVarC.s()) {
            new o.aj.b(context, new b.e() { // from class: o.eo.a.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static char[] f24223a = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static long f24224b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f24225c = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static int f24226f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static int f24227g = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f24228h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static int f24229i = 0;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public static int f24230j = 0;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static int f24231k = 0;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public static int f24232l = 0;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public static int f24233m = 0;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static int f24234n = 0;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public static int f24235o = 0;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public static int f24236p = 0;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public static int f24237q = 0;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public static int f24238r = 0;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public static int f24239s = 0;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public static int f24240t = 0;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public static int f24241u = 0;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public static int f24242v = 0;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public static int f24243w = 0;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public static int f24244x = 0;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public static int f24245y = 0;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public static int f24246z = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(short r8, int r9, int r10) {
                    /*
                        byte[] r7 = o.eo.a.AnonymousClass4.$$c
                        int r6 = 105 - r9
                        int r0 = r8 * 2
                        int r5 = r0 + 4
                        int r0 = r10 * 4
                        int r4 = r0 + 1
                        byte[] r3 = new byte[r4]
                        r2 = 0
                        if (r7 != 0) goto L27
                        r0 = r6
                        r1 = r2
                        r6 = r5
                    L14:
                        int r5 = r5 + 1
                        int r6 = r6 + r0
                    L17:
                        byte r0 = (byte) r6
                        r3[r1] = r0
                        int r1 = r1 + 1
                        if (r1 != r4) goto L24
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        return r0
                    L24:
                        r0 = r7[r5]
                        goto L14
                    L27:
                        r1 = r2
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.a.AnonymousClass4.$$e(short, int, int):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    f24246z = -823058533;
                    f24245y = -1723551751;
                    f24244x = -2095811682;
                    f24243w = -2085360103;
                    f24242v = -951005529;
                    f24241u = -1906087108;
                    f24240t = -759615199;
                    f24239s = -1859690519;
                    f24238r = 1785448049;
                    f24237q = -1265923106;
                    f24236p = -513934296;
                    f24235o = -1165362815;
                    f24234n = -967079201;
                    f24233m = -1349997334;
                    f24232l = 291582186;
                    f24231k = -673364477;
                    f24230j = 822289676;
                    f24229i = 1189201615;
                    f24227g = 479394827;
                    f24226f = -1728084030;
                    init$0();
                    f24225c = 0;
                    f24228h = 1;
                    char[] cArr = new char[1897];
                    ByteBuffer.wrap("\u0094Ý¥\u000f÷¥\u0000OR¹ch½\u000bÏ±\u0018^*õ{aµ\u0012Ç¶\u0010h\"Ísa\u008d\u0006ß©èU:ÚKu\u0085 ×§à=2ËC`\u009d\u001dËyú«¨\u0001_ë\r\u001d<Ìâ¯\u0090\u0015GúuQ$Åê¶\u0098\u0012OÌ}x,ÈÒ¶\u0080\u001a·Ëei\u0014ÒÚ©\u0088\u0013¿\u009dmj¯\u007f\u009e\u00adÌ\u0007;íi\u001bXÊ\u0086©ô\u0013#ü\u0011W@Ã\u008e°ü\u0014+Ê\u0019}HÞ¶®ä\u001a\u0094Ý¥\u0018÷¹\u0000JR¹cb½\u000bÏ¹\u0018O*ÿ{mµNÇ¹\u0010X\"Àsa\u008d\u0004ß²èC:ÁKY\u0085\u001d×µà92ÞCf\u009d\n¯¨[ãj08\u008aÏd\u009d\u0087¬Ur=\u0000Í×tåß´Yz/\u0094Ý¥\u000e÷´\u0000ZR¹c|½\rÏ°\u0018\u0014*ã{zµ\u000eÇ®º\u0082\u008bGÙû.\u0005|¨M\"\u0093_á\u00ad67\u0004\u008aU\u001a\u009bQé÷>\r\f·];£Iñåí0Üõ\u008eTy§+\u000f\u001a\u0087Ää¶\u001fa»S\u0017\u0002\u0087Ì£¾_i³[#\n\u0086ôí¦\u0018\u0091®C+þUÏÇ\u009dbj\u00928<\t²\u0094®¥*\u0094Ý¥\u0018÷¹\u0000JRâcj½\tÏò\u0018X*ú{fµNÇ°\u0010R\"Ásp\u008d4ß\u0096è\u001d:ÇKc\u0085\u0012×¡à`2ÉCl\u009d\u0016¯¥ø<\nÈ[pèÜÙ\u0019\u008b¸|K.ã\u001fkÁ\b³ódYVû\u0007gÉO»±lS^À\u000fqñ5£\u0097\u0094\u001cFØ7uù\u0011«¥\u0094Ý¥\u0018÷¹\u0000JRâcj½\tÏò\u0018V*ú{jµNÇ²\u0010^\"Îsk\u008d\u0007ß¶èE:ÿKK\u0085\u000f×¦à\"2ÚC-\u009d\u000b¯¾\u0094Ý¥\u000f÷¥\u0000OR¹ca½\u0001Ï°\u0018O*ô{}µ\u0004Ç\u00ad\u0010C\u0094\u0080¥\u0004÷î\u0000[Rãcf½\bÏ¹\u0018\u0014*û{gµ\u0012Çªv\u000fG\u009d\u00152âÙ°`\u0081²_\u0099-+úÝ\u0094Ý¥\u001b÷²\u0000VRõc ½\u0002Ï´\u0018V*ö{{µ\u0018Ç\u00ad\u0010C\"Ésh\u008d\u0011VÒg@5ãÂ\u0002\u0090«¡'\u0094\u0080¥\u0004÷î\u0000IRäc`½\u0000Ï¨\u0018Y*ç{&µ\fÇ¿\u0010Y\"Ùsc\u008d\u0003ß¸èD:ÜKt\u0085\u001a×¦:Ò\u000bIYé®\u0007h&Yª\u000b\u0016üî®[\u009fØA´3WäíÖN\u0087ßIë;\u0018ì÷Þ&\u008fÅq£#\u001d\u0014áÆj·\u008cy¼+\u0000\u001c\u009cÎ ¿Áa½S\u001e\u0004\u008fö\\§ßi¡[\u0003\f°þv¯Ø\u0091¼C/4\u0085æk×Û\u0099¥\u0094\u0082¥\u000e÷²\u0000JRÿc|½\u0010Ïó\u0018I*ê{{µOÇ¼\u0010S\"\u0082sa\u008d\u0007ß¹èE:ÎK(\u0085\u0018×¤à82\u0084Ce\u009d\u0019¯ºø+\nø[{\u0095\u0005§§ð\u0014\u0002ÖS|m\u0018¿\u008bÈ+\u001aÏÇ\\öÐ¤lS\u0094\u0001!0¢îÎ\u009c-K\u0097y4(¥æ\u0091\u0094bC\u008dq\\ ¿ÞÙ\u008cg»\u009bi\u0010\u0018öÖÓ\u0084e³½a\u0017\u0010¬ÎÏ\u0017\u0086&\nt¶\u0083NÑûàx>\u0014L÷\u009bM©îø\u007f6KD¸\u0093W¡\u0086ðe\u000e\u0003\\½kA¹ÊÈ,\u0006\tT¿cg±ÂÀf\u001e\u001fÓïâc°ßG'\u0015\u0092$\u0011ú}\u0088\u009e_$m\u0087<\u0016ò\"\u0080ÑW>eï4\fÊj\u0098Ô¯(}£\fEÂ`\u0090Ö§\u000euª\u0004\rÚvH\u0099y\u0015+©ÜQ\u008eä¿ga\u000b\u0013èÄRöñ§`iT\u001b§ÌHþ\u0099¯zQ\u001c\u0003¢4^æÕ\u00973Y\u0016\u000b <xîÜ\u009fvA\u0000\u0094\u0084¥\t÷¯\u0000ARåciVZg\u009c55ÂÑ\u0090r¡§\u007f\u008e\r5ÚÙèa¹ãw\u0083\u0005*\u0094\u0084¥\t÷¯\u0000ARñcz½\u0001Ï®\u0018N¨\t\u0099²Ë\u0012<ünG_Ü\u0081¬ó\b$é\u0016A4\u0087\u0005\u0005W« WòùÃx\u001d\n\u0094\u0091¥\u0003÷²\u0000VRûcf½\u0011Ï°2J\u0003ÎQ$¦\u0083ô.Åª\u001bÊib¾\u0093\u008c-Ýì\u0013Ïaq¶\u008b\u0084\u000fÕ¬+Í\u0094\u0084¥\t÷¯\u0000AR®c9½\u0014\u0094\u0095¥\u000e÷®\u0000\\Räcf½\u0007$\u001d\u0015\u0086G&°ÔâlÓî\r\u008f\u007f\n¨Ê\u009a#Ë¶\u0094\u0095¥\u000e÷®\u0000\\Räcf½\u0007Ï\u0082\u0018B*«{>µ>Çè\u0010\u0003¦t\u0097ðÅ\u001a2½`\u0010Q\u0094\u008fôý\\*\u00ad\u0018\u0013IÒ\u0087øõE\"§\u0010=A\u009d\u0094\u0081¥\u000f÷«E\u001bt\u008a&9ÑÙ\u0083{²÷l\u0087\u001e#\u0094³¥\u001b÷°\u0000\u0019RÄcz½\nÏ©\u0018S*þ{mµAÇ¸\u0010X\"Þs%\u008d!ß³èB:ÆKk\u0085\u001a³%\u0082\u0093Ð2'ÝuoDð\u009a\u0096èk?ÿ\rA\\Õ\u0092×à*7Ô\u0005STÿª\u0080ømÏÀ\u001dPlâ¢Éð:Çã\u0015\n\u0094³¥\u0005÷¤\u0000KRùcf½\u0000Ïý\u0018i*×{CµAÇ¼\u0010B\"Åsi\u008d\u0016ßûèV:ÆKt\u0085_×¬àu2\u009cC\\\u009dN¯å\u0094\u0080¥\u0004÷î\u0000QR÷c}½\u0000Ïª\u0018[*á{m[ýjl8ÄÏ5\u009d\u0098¬\u000er\u007f\u0000Ý\u0094\u0084¥\t÷¯\u0000AR®c9\u0094\u0080¥\n÷®\u0000ZRþcz\u0094\u0080¥\u0004÷î\u0000IRäc`½\u0000Ï¨\u0018Y*ç{&µ\u0003Ç¬\u0010V\"ÂsaJ\b{\u008c)fÞÚ\u008c{½õc\u0082\u00110ÆÞô5¥ñk\u008c\u0019;ÎÊ\u0094Ã,\u009f\u001d\u001bOñ¸UêìÛs\u0005\u000ew° @ÈVÕ\u0004ä\u0080¶jAß\u0013g\"âü\u008c\u008e=Y\u0090kg:þô\u008a\u0086>QÆcK2õ-§\u001c-N\u009f¹fëúÚD\u0004ovØäxÕü\u0087\u0016p£\"\u001b\u0013\u009eÍð¿AhìZ\r\u000b\u0099Å÷·A`ªR&\u0003\u008dýè¯J\u0098¦J%\u0013ù\"bpÂ\u00870Õ\u0088ä\n:kH\u009e\u009f%\u00ad\u009bü\u000f2\"@Õ\u0097>¥®ô\f\n|XÞo?/í\u001evLÖ»$é\u009cØ\u001e\u0006\u007ftú£:\u0091ÓÀF\u000e6|Õ«+\u0099¿È\"6bd\u009bS~\u0081þð\u0019>blÂ[P\u0089 ø\u0012&c\u0014öCN±çàR\u0094\u0095¥\u000e÷®\u0000\\Räcf½\u0007Ïò\u0018]*ü{gµ\u0006Ç²\u0010R\"ósv\u008d\u0006ß°è\u001f:ÎKc\u0085\u0011×±à?2ÃC`\u0094\u0095¥\u000e÷®\u0000\\Räcf½\u0007Ïò\u0018L*ñ{gµ\u0019Çæ\u0010\u0001\"Üs*\u008d\u0014ß¹è_:ÑK>\u0085I×¤\u0094\u0095¥\u0004÷¯\u0000^Rúcj½KÏ®\u0018^*ø{Wµ\u0006Ç®\u0010_\"Ãsk\u008d\u0007ß\u0084èH:\u0091K0\u0085P×³à(2ÄCf\u009d\n¯¸ø-\nø[d\u0095M§äájÐî\u0082\u0004u±'\u0013\u0016\u008aÈúº[m¿_\u0018\u000e\u0086Àî²F\u0094\u0080¥\u0004÷î\u0000[Rùc`½\u0010Ï´\u0018W*ò{oµ\u0004Çð\u0010U\"Ùsl\u008d\u000eß¿è\u001e:ÏKo\u0085\u0011×³à(2ØCs\u009d\n¯¸ø \nÓ\u0094³¥\u0005÷¤\u0000KRùcf½\u0000Ïð\u0018B*«{>Èºù>«Ô\\a\u000eÙ?\\á2\u0093\u0083D.vÍ'[é(\u009b\u0094La~÷/FÑv\u0083\u0088´n\u000100¸b\u0005\u0095ûÇ\r\f\u0097=\to¥\u0098AÊ´ûp%\u001eW²\u0080\u0018²îãa-\u0000_§\u0088\u0016ºÐë{\u0015\u0001G§pOÊmûà©C^¢\fV=\u0089ãý\u0091\u001dF¹t\u001c%\u008fëá\u0099[N¼|;-\u0098\u0094\u0083¥\u000e÷\u00ad\u0000LR¸c|½\u0002Ïó\u0018\\*ò{cµ\u0004Ç\u0081\u0010T\"Ísh\u008d\u0007ß©èQ\u0094\u0083¥\u000e÷\u00ad\u0000LR¸c|½\u0002Ïó\u0018V*ð{lµ>Çº\u0010R\"Âsv\u008d\u000bß¯èI\u0088í¹ië\u0083\u001c?N\u009e\u007f\u0010¡gÓÕ\u0004;6Ðg\u0004©bÛ×\f(>®o\u0001\u0091kÃ\u0098ô,&¡W\u0006\u0099gËÝ\u0094\u0080¥\u0004÷î\u0000[Rùc`½\u0010Ïó\u0018K*ö{eµ\u0014Çð\u0010V\"Úsa\u008d=ßµèQ:ÄKcñ¶À2\u0092Øe`7Ä\u0006TØ|ª\u0089}yOÌ\u001eRÐ3¢ÆugGó\u0016]è3º\u0088\u008dt_ï.Bà ²\u008c\u0085\u000f\u0094\u0080¥\u0004÷î\u0000IRäc`½\u0000Ï¨\u0018Y*ç{&µ\u0003Ç«\u0010^\"Àsa\u008dLß½èY:ÇKa\u0085\u001a×¦à=2ØCj\u009d\u0016¯¥\u0094\u0080¥\u0004÷î\u0000JRïc|½\u0010Ï¸\u0018W*½{jµ\u0014Ç·\u0010[\"Ès+\u008d\u0004ß²è^:ÎKc\u0085\r×¤à?2ÃCm\u009d\f\u0094\u0080¥\u0004÷î\u0000JRïc|½\u0010Ï¸\u0018W*Ì{mµ\u0019Çª\u0010\u0019\"Îsp\u008d\u000bß·èT:\u0087K`\u0085\u0016×ºà*2ÏCq\u009d\b¯£ø'\nÉ[h\u0094\u0080¥\u0004÷î\u0000ORóca½\u0000Ï²\u0018H*½{jµ\u0014Ç·\u0010[\"Ès+\u008d\u0004ß²è^:ÎKc\u0085\r×¤à?2ÃCm\u009d\f³¼\u00828ÐÒ'suÏD]\u009a<è\u008e?t\rð\\P\u00921à\u00897f\u0005¾T[ª+ø\u008eÏ`\u001dñl\u0014¢%ð\u0081Ç\u001f\u0015ñdZº6\u0088\u009dß\u0000-ò|N²=¿Ey¼Hn\u001aÄí.¿Ø\u008e\u001fP`\"Ñõ.Ç\u00ad\u0096\u0019Xi*Ïý32Õ\u0003\u0007Q\u00ad¦Gô±Åt\u001b\u0003i¶¾Y\u008cþÝt\u0013Fa´¶^\u0084×Õh+\by²NV\u009cÅíQ#\u0010q¹F+\u0094Ûåo\u0094Ý¥\u000f÷¥\u0000OR¹c|½\u000bÏ¾\u0018Q*ö{|µNÇ¹\u0010R\"Âs|\u008d\u0006ö5Çç\u0095Mb§0Q\u0001\u0094ßã\u00adVz¹H\u001e\u0019\u0094×¦¥Grº@)\u0011\u0098ïîê;Ûþ\u0089_~¬,_\u001d\u0098Ãç±Vf©T*\u0005\u009aËõ¹Yn²\\/t'Eâ\u0017Cà°²\u0018\u0083\u0090]ó/\bø¬Ê\u0000\u009b\u0090U´'Hð¤Â4\u0093\u009cmÇ?L\b«Ú?«\u0090eê7M\u0000èÒ4£\u009c}àO^\u0018Óê\u0002»\u0097uêGE\u0010Äât³\u0090\u008dãÈ\u0005ù×«}\\\u0097\u000ea?µáÏ\u0093qD½v,' éÊÖ\u0005ç×µ}B\u0097\u0010a!µÿÏ\u008dqZ½h?9¹÷Ô\u0085cxÐI\u0002\u001b¨ìB¾´\u008fqQ\u0006#³ô\\Æû\u0097qYC+±üIÎÕ\u009fna\u00003º\u0004YÖÁ§yi\u0016\u0094Ý¥\u0018÷¹\u0000JRâcj½\tÏò\u0018V*ú{jµNÇ²\u0010^\"Îsg\u008d\u0011ß¯èV:ÆKj\u0085\u001b×±à?2õCi\u009d\u0016¯¸ø`\nÔ[s\u0094Ý¥\u000f÷¥\u0000OR¹cm½\u0017Ï©\u0018[*ð{kµ\u0004\u0094Ý¥\u000f÷¥\u0000OR¹cm½\u0017Ï©\u0018]*ê{zµ\u000e\u0003ø2*`\u0080\u0097jÅ\u009côH*2X\u008c\u008fr½ÓìJ\"*\u0094Ý¥\u000f÷¥\u0000OR¹cm½\u0017Ï©\u0018U*á{aµ\u0004(5\u0019çKM¼§îQß\u0085\u0001ÿsA¤¤\u0096\u0016Ç\u0093\tî\u0006b7°e\u001a\u0092ðÀ\u0006ñÒ/¨]\u0016\u008aõ¸KéÖ'·U\u0011\u0082ë\u008d\u008f¼]î÷\u0019\u001dKëz?¤EÖû\u000173¨b7¬V\u0094Ý¥\u000f÷¡\u0000MR÷c ½\u0000Ï²\u0018M*ý{dµ\u000eÇ¿\u0010S\"ßs*\u008dLß£èR:\u0086Kd\u0085\f× à&\u001aä+?y\u0097\u008etÜ\u0080íA34A\u008a\u0096g¤ÅõF;+IÈ\u009eL¬æýH\u0003\bQ\u008afh´âÅZ\u000b\"Y«n\u001b¼ÿÍ^\u0013$!\u009a\u0094Ý¥\u001b÷²\u0000VRõc ½\rÏ²\u0018J*ü{zµ\u0015Ç\u00ad\u0094Â¥\r÷¦\u0000\u0019R¬\u0094Ý¥\u001b÷²\u0000VRõc ½\u0017Ï¸\u0018V*õ{'µ\fÇ¿\u0010G\"ß\u0094\u0095¥\u0019÷¡\u0000URúc`½\u0007Ïó\u0018]*ü{dµ\u0005Ç¸\u0010^\"ßsm\u008dLß¨è_}\u0003L\u009f\u001e?éã»G\u008a×Tª&\u001fñÅÃ}\u0092á\\Ò.0ùÅ1k\u0000¸R\u0002¥ì÷\u000fÆÔ\u0018·j\u000f½å\u008fDÞá\u0010´b\u0007µå\u0087\u007fÖÐ(§zCMþ\u009frîÜ\u0002g3ðaB\u0096«Ä\u0012õ\u008c+òYI\u008e¦¼\u0017\u0094Ý¥\u000e÷´\u0000ZR¹cb½\u000bÏ¨\u0018T*ç{{\u0094Ý¥\u000f÷¡\u0000MR÷c ½\u0000Ï²\u0018M*ý{dµ\u000eÇ¿\u0010S\"ßs*\u008dLß¿è@:\u0086Kg\u0085\u000f×¤à>2\u0084C{\u009d\u0015¯½ãêÒ,\u0080\u0085wa%Â\u0014\u0017Ê0¸\u009aox]Í\fQÂ0°\u0086\u0094µ¥\u0004÷¬\u0000]Rðcf½\u0017Ïµf\u001cWÎ\u0005`ò\u008c 6\u0091áOÈ=uê\u0088Ø1\u0089æGÐ5mâ\u0099Ð\u000b\u0081\u00ad\u007fÏ-\u007f\u001a\u0082ÈG¹¤wË%g\u0012£À[±íoÚ]\u007f\nâøH©°gÝUp\u0002øð\u000e¡®\u009fÞM\\:ñèRÙ¶\u0097×ED2õà\u0016Ñ»\u008f(".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1897);
                    f24223a = cArr;
                    f24224b = 3279247979397555563L;
                }

                private static void A(char c2, int i7, int i8, Object[] objArr3) throws Throwable {
                    int i9 = 2 % 2;
                    o oVar = new o();
                    long[] jArr = new long[i8];
                    oVar.f19947b = 0;
                    while (oVar.f19947b < i8) {
                        int i10 = $10 + 33;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = oVar.f19947b;
                        try {
                            Object[] objArr4 = {Integer.valueOf(f24223a[i7 + i12])};
                            Object objA = o.d.d.a(-214519724);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(View.combineMeasuredStates(0, 0) + 742, (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 632508977, false, $$e(b2, (byte) ((b2 + 6) - (6 & b2)), b2), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr5 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr4)).longValue()), Long.valueOf(i12), Long.valueOf(f24224b), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(-1567654649);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 + 5);
                                objA2 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 766, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12470), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$e(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i12] = ((Long) ((Method) objA2).invoke(null, objArr5)).longValue();
                            Object[] objArr6 = {oVar, oVar};
                            Object objA3 = o.d.d.a(-723636472);
                            if (objA3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA3 = o.d.d.a(387 - Color.argb(0, 0, 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr6);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr = new char[i8];
                    oVar.f19947b = 0;
                    while (oVar.f19947b < i8) {
                        int i13 = $11 + 83;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                        Object[] objArr7 = {oVar, oVar};
                        Object objA4 = o.d.d.a(-723636472);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA4 = o.d.d.a(AndroidCharacter.getMirror('0') + 339, (char) View.combineMeasuredStates(0, 0), 16777234 + Color.rgb(0, 0, 0), 39570797, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr7);
                    }
                    objArr3[0] = new String(cArr);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void B(int r8, short r9, byte r10, java.lang.Object[] r11) {
                    /*
                        int r7 = r10 + 97
                        int r0 = r8 * 2
                        int r1 = 3 - r0
                        byte[] r6 = o.eo.a.AnonymousClass4.$$a
                        int r2 = r9 * 2
                        int r0 = 1 - r2
                        byte[] r5 = new byte[r0]
                        r4 = 0
                        int r3 = 0 - r2
                        if (r6 != 0) goto L2d
                        r2 = r4
                        r0 = r1
                    L15:
                        int r1 = -r1
                        int r1 = r1 + r7
                        r7 = r1
                        r1 = r0
                    L19:
                        int r0 = r1 + 1
                        byte r1 = (byte) r7
                        r5[r2] = r1
                        if (r2 != r3) goto L28
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        r11[r4] = r0
                        return
                    L28:
                        int r2 = r2 + 1
                        r1 = r6[r0]
                        goto L15
                    L2d:
                        r2 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.a.AnonymousClass4.B(int, short, byte, java.lang.Object[]):void");
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(Unknown Source)
                    	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                    */
                public static java.lang.Object[] c(android.content.Context r44, int r45, int r46, int r47) {
                    /*
                        Method dump skipped, instruction units count: 13748
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.a.AnonymousClass4.c(android.content.Context, int, int, int):java.lang.Object[]");
                }

                static void init$0() {
                    $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
                    $$b = 11;
                }

                static void init$1() {
                    $$c = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
                    $$d = 21;
                }

                @Override // o.aj.b.e
                public final void b(List<i> list) {
                    int i7 = 2 % 2;
                    a.this.d(list, Long.valueOf(new Date().getTime()));
                    dVar.c(list);
                    int i8 = f24225c + 85;
                    f24228h = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 28 / 0;
                    }
                }

                @Override // o.aj.b.e
                public final void c(o.bg.c cVar) {
                    int i7 = 2 % 2;
                    int i8 = f24228h + 101;
                    f24225c = i8 % 128;
                    int i9 = i8 % 2;
                    dVar.a(o.by.c.b(cVar));
                    int i10 = f24225c + 17;
                    f24228h = i10 % 128;
                    int i11 = i10 % 2;
                }
            }, bVarC).a(str);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        l("觬覻맅豨ค툺嬸⟱졘䲲", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        l("༤ཱི\u08e2춷걢挝\u1ae7ꄹ祿齳\ueed4`厧ꮳ⺥煱иᐻ\uf831ꃣ뚪䘍讒ሀ望냇╓䖅ᦛ\ue11d\uf485뜛쨏厏蘊\ue699粊뱣偩堫\u2d6d\ueebe\ue3fa讴\udff1強", TextUtils.getOffsetAfter("", 0), objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    @Override // o.eo.b
    public final /* synthetic */ long c() {
        int i2 = 2 % 2;
        int i3 = f24220g + 19;
        f24216b = i3 % 128;
        if (i3 % 2 == 0) {
            return super.c();
        }
        super.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ List<i> d() {
        int i2 = 2 % 2;
        int i3 = f24220g + 55;
        f24216b = i3 % 128;
        int i4 = i3 % 2;
        List<i> listD = super.d();
        int i5 = f24220g + 113;
        f24216b = i5 % 128;
        int i6 = i5 % 2;
        return listD;
    }

    @Override // o.eo.b
    protected final /* synthetic */ o.ef.a e(i iVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24216b + 63;
        f24220g = i3 % 128;
        i iVar2 = iVar;
        if (i3 % 2 != 0) {
            return e2(iVar2);
        }
        e2(iVar2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ void e() {
        int i2 = 2 % 2;
        int i3 = f24220g + 107;
        f24216b = i3 % 128;
        int i4 = i3 % 2;
        super.e();
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
    }
}
