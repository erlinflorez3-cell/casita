package o.dx;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.k;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23394a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23395b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23396c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f23397d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f23398e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23399f = 0;

    private static String $$c(short s2, short s3, short s4) {
        int i2 = s2 * 2;
        byte[] bArr = $$a;
        int i3 = (s4 * 2) + 4;
        int i4 = s3 + 69;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i5 + (-i3);
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i3];
            i3++;
            i4 += -b2;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23399f = -287121741;
        f23398e = -5459340704927151599L;
        f23397d = (char) 17572;
        f23396c = (char) 27768;
        f23394a = (char) 8186;
        f23395b = (char) 41584;
    }

    public a(String str) {
        super(str);
    }

    public static Object[] d(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = ~i2;
            int i5 = (-1) - (((-1) - (~(((-426865571) + i4) - ((-426865571) & i4)))) & ((-1) - 285291424));
            int i6 = ~((i2 - 109708306) - (i2 & (-109708306)));
            int i7 = i3 + 1314860284 + ((i5 | i6) * (-713)) + (i6 * 1426) + ((~((-251282452) | i4)) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION);
            int i8 = i7 ^ (i7 << 13);
            int i9 = i8 ^ (i8 >>> 17);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            g("熺〫燐雲⠡盘Ꙓ㿸ၮ䨒Ѓ\udc50늁\ueb9d抮稨哊ഽ쌆\u18fc\uf77f꽄ℜ뤇馞ベ述䝵㮜刀\uec19\ue5a1\uda3e\uf464䨊艄粴ᖃꢭ\u2009ỗ뜰", 1 - (Process.myPid() >> 22), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            g("萶뻧葵\uaafcꛂ\uf7e3騗뻣\ue5f4쒔㠌嵡䜇敀廲מּꅗ菪ｓ駁ʪ↳ᵇ㡓氄비뎼옑칗\udcf0퀎擩⾿窭瘥", -TextUtils.indexOf((CharSequence) "", '0'), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                g("熺〫燐雲⠡盘Ꙓ㿸ၮ䨒Ѓ\udc50늁\ueb9d抮稨哊ഽ쌆\u18fc\uf77f꽄ℜ뤇馞ベ述䝵㮜刀\uec19\ue5a1\uda3e\uf464䨊艄粴ᖃꢭ\u2009ỗ뜰", -TextUtils.indexOf((CharSequence) "", '0'), objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                g("\uf811ꐎ\uf852\udeda뱘ꕞ\uee59\uec4c馑\ude56䱥\u0ff2㬧義⪆ꦨ\udd7c餅謬쭘绯㬨椝櫁ဩ꒻잇钪뉽왝ꑀ㙲叇恤ȷ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    g("熺〫燐雲⠡盘Ꙓ㿸ၮ䨒Ѓ\udc50늁\ueb9d抮稨哊ഽ쌆\u18fc\uf77f꽄ℜ뤇馞ベ述䝵㮜刀\uec19\ue5a1\uda3e\uf464䨊艄粴ᖃꢭ\u2009ỗ뜰", 1 - Gravity.getAbsoluteGravity(0, 0), objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        h("\ueee4ѐꂘ囋폼썡쎩燘\ue993鏍验ꌡ婥\ueda4熧⋻\ue319떑验ꌡ䌲쮂㳭ᚙ", TextUtils.indexOf((CharSequence) "", '0', 0) + 24, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        g("䛙쳎䚾ಀ퓀햢㰢鲳✔뚺鹩缮藦ᝨ\uf8e3\ud95a掳\uf1c0夽뮂쀛", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            h("\ueee4ѐꂘ囋폼썡쎩燘\ue993鏍验ꌡ婥\ueda4熧⋻\ue319떑验ꌡ䌲쮂㳭ᚙ", TextUtils.lastIndexOf("", '0', 0) + 24, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            float f2 = 0.0f;
                            Object[] objArr13 = new Object[1];
                            h("弹ﲙﮓ앥芷好ꢌ쮀弹ﲙ鑪Ṁힸ烴", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                h("\ueee4ѐꂘ囋폼썡쎩燘\ue993鏍验ꌡ婥\ueda4熧⋻ꔍ\ud80e닓썣芷好ꢌ쮀弹ﲙ\ue72f⟉◴厃弹ﲙ䕘퉺", 32 - TextUtils.indexOf((CharSequence) "", '0'), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                h("弹ﲙﮓ앥芷好ꢌ쮀弹ﲙ➅뽩癖\ue8c1", 14 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                h("\ueee4ѐꂘ囋폼썡쎩燘\ue993鏍验ꌡ婥\ueda4熧⋻ꔍ\ud80e닓썣芷好ꢌ쮀弹ﲙ➅뽩癖\ue8c1", 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                h("钟붂趑띊\uf74f⊭隩朮鏮睥", View.MeasureSpec.getSize(0) + 10, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i10 = 0;
                                while (i10 < length) {
                                    Object obj = objArr19[i10];
                                    Object[] objArr20 = new Object[1];
                                    h("啿\ud802꺰筬紑룠", 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        h("\uf245笶缋蟋㌀✧犕\u0b3a隩朮몣飰⊍㨁ₗ立楀宱적\uf612餗䲇⭶ꄎ\uf564豲崻ꦂ괂㲝㬷츒\udab4發\ue168蠞㵽\ue4e0", (-16777179) - Color.rgb(0, 0, 0), objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        g("⭋箑⬬踾掟풁뺜鶉䪉ǵ\u1cc8縍\ue87dꀱ穵", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            g("⿑냲⾰뵡ꣷ먤跓\uf317丒쪌⾇ყ\uecea歞䤡뛉ર跳\ue8cf푏ꤑ⾄ૉ疆쟤끒ꐽ诘断틴쟍⤈", View.combineMeasuredStates(0, 0) + 1, objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            h("瓖ꈲ혼\uded9괂㲝ᖮ㨟\uf585篫㵽\ue4e0", 12 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                h("\uf245笶缋蟋㌀✧犕\u0b3a隩朮몣飰⊍㨁ₗ立楀宱적\uf612餗䲇⭶ꄎ\uf564豲崻ꦂ괂㲝㬷츒\udab4發\ue168蠞㵽\ue4e0", 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                h("弹ﲙ떠᳐\uf585篫괂㲝䍋揤楀宱깴䮣\ude07ϝ\uf74f⊭Đ捛", ((Process.getThreadPriority(0) + 20) >> 6) + 19, objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i11 = 0; i11 < 2; i11++) {
                                                    Object obj2 = objArr3[i11];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        g("둢\ue8a3됈鴿\uf0a9ᵲ궟呒헠鋇࿘럼睏㌒楸ᆟ鄟헢좆獒㊠矌⪗틛尋\ue854萴Ⲭ️誢\ue795蹒ᾰⳕ䇖\ue9e6륶촍", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        g("\ue1d9ꑧ\ue1beⴽ뱩줁ᶟ耓耀\ude12뿕掉⋢翐\ud94b얭쓭餸碷Ꜷ最㬒高ڙ৵꓁㑣", -ExpandableListView.getPackedPositionChild(0L), objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i12 = f23399f * (-1529260205);
                                                            f23399f = i12;
                                                            int i13 = 1665060595 + (((-9191609) | (~i12)) * (-490));
                                                            int i14 = ~(i12 | (-618554618));
                                                            int i15 = i3 + i13 + (((i14 + 609363009) - (i14 & 609363009)) * 490) + 864002638;
                                                            int i16 = i15 ^ (i15 << 13);
                                                            int i17 = i16 ^ (i16 >>> 17);
                                                            return objArr31;
                                                        }
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i10++;
                                                f2 = 0.0f;
                                            } catch (Throwable th2) {
                                                Throwable cause2 = th2.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                Throwable cause5 = th5.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            Throwable cause6 = th6.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        Throwable cause7 = th7.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th7;
                    }
                } catch (Throwable th8) {
                    Throwable cause8 = th8.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th8;
                }
            } catch (Throwable th9) {
                Throwable cause9 = th9.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th9;
            }
        } catch (Throwable unused) {
        }
        Object[] objArr32 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
        int i18 = ~i2;
        int i19 = i3 + 1364642877 + (((~((-1) - (((-1) - 644388262) & ((-1) - i18)))) | 205321) * 184) + (((i2 + 610833824) - (i2 & 610833824)) * (-184)) + ((~((-1) - (((-1) - (-33759760)) & ((-1) - i18)))) * 184);
        int i20 = i19 ^ (i19 << 13);
        int i21 = i20 ^ (i20 >>> 17);
        return objArr32;
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 1;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f23398e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $11 + 61;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23398e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(AndroidCharacter.getMirror('0') + 181, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51003), KeyEvent.getDeadChar(0, 0) + 9, 1749983833, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 38))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 674, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 12, 522683165, false, $$c(b3, (byte) ((b3 + 45) - (45 & b3)), b3), new Class[]{Object.class, Object.class});
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

    private static void h(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 81;
        $10 = i4 % 128;
        Object charArray = str2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 11;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) f23394a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23395b)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SI, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - Color.argb(0, 0, 0, 0), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f23397d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23396c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - View.MeasureSpec.getMode(0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
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
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 3);
                objA3 = o.d.d.a(270 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Process.getGidForName("") + 1), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2074123590, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i9 = $10 + 121;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 255;
    }
}
