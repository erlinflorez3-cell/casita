package o.z;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.g;
import o.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f27406b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f27407c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f27408d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f27409e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f27410f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f27411g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f27412h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int[] f27413j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27414a;

    private static String $$c(short s2, byte b2, short s3) {
        int i2 = s2 * 3;
        int i3 = 4 - (s3 * 2);
        int i4 = b2 + 69;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (-i4) + i2;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4 = (-bArr[i3]) + i4;
            i3++;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27410f = 259302073;
        f27412h = 0;
        f27411g = 1;
        f27406b = (char) 9966;
        f27408d = (char) 35255;
        f27407c = (char) 32931;
        f27409e = (char) 34572;
        f27413j = new int[]{13955023, -1333778391, -1469491232, -676599166, 1894667258, 1501726533, -1245774701, 2128918158, -478400698, 1444102545, 62260743, -1061127727, 1807616469, -1232134402, 971570327, -232279466, -1510877621, 604696075};
    }

    public b(String str) {
        this.f27414a = str;
    }

    public static Object[] c(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = i3 + 1898852084 + ((~((-1) - (((-1) - (-9719891)) & ((-1) - i2)))) * (-301)) + (((~(379482455 | i2)) | (~((-1) - (((-1) - (~i2)) & ((-1) - 1057630477))))) * (-301)) + (((-1) - (((-1) - (~((-1) - (((-1) - i2) & ((-1) - (-1057630478)))))) & ((-1) - 379482455))) * 301);
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >>> 17);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            k(new int[]{1244461039, 1785169260, 1739129144, 919448574, 2004791593, 822681263, -1410210793, -889978309, 1468159330, 1274703704, -189220148, 27311172, 1244097896, 848596697, -306872012, 1607563894, 313376899, 1949794632, -943909504, -1924347509}, KeyEvent.keyCodeFromString("") + 38, objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            long j2 = 0;
            Object[] objArr4 = new Object[1];
            i("룈巧⬊䁧\ue065앁늸↽Ӛ쑬≅䬪⿒ᗽ흾ꏺ괣烌⬊䁧\ue065앁늸↽Ӛ쑬ښ衹\ude54볿ꉒ殕", 30 - ExpandableListView.getPackedPositionChild(0L), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                k(new int[]{1244461039, 1785169260, 1739129144, 919448574, 2004791593, 822681263, -1410210793, -889978309, 1468159330, 1274703704, -189220148, 27311172, 1244097896, 848596697, -306872012, 1607563894, 313376899, 1949794632, -943909504, -1924347509}, 37 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                i("\udbfcꑦ\ue362㓰괣烌⬊䁧\ue065앁늸↽Ӛ쑬ښ衹龭庭ᯡ꾪㒯䷚鴠礡㫡㾇\ue583꿃᫅蠛迭癎", ((byte) KeyEvent.getModifierMetaStateMask()) + 32, objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    k(new int[]{1244461039, 1785169260, 1739129144, 919448574, 2004791593, 822681263, -1410210793, -889978309, 1468159330, 1274703704, -189220148, 27311172, 1244097896, 848596697, -306872012, 1607563894, 313376899, 1949794632, -943909504, -1924347509}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        k(new int[]{-1374232403, -1846752253, -1967677882, -1701237841, -1700157244, -1083291404, 1975277389, -1883901646, -701832038, 641968168, 346492859, -1521596837}, Gravity.getAbsoluteGravity(0, 0) + 23, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        int i7 = 10;
                        Object[] objArr11 = new Object[1];
                        k(new int[]{400824991, 1028828877, -1429684001, 1917175862, -838621047, 1345143115, 639291113, -838785789, -175249270, 1272675493}, 17 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            k(new int[]{-1374232403, -1846752253, -1967677882, -1701237841, -1700157244, -1083291404, 1975277389, -1883901646, -701832038, 641968168, 346492859, -1521596837}, ExpandableListView.getPackedPositionType(0L) + 23, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            k(new int[]{400824991, 1028828877, -1429684001, 1917175862, -1142522476, 1133839596, 1621221468, 1975076543}, 13 - MotionEvent.axisFromString(""), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                k(new int[]{-1374232403, -1846752253, -1967677882, -1701237841, -1700157244, -1083291404, 1975277389, -1883901646, 762493027, 191297401, -1429684001, 1917175862, -838621047, 1345143115, 639291113, -838785789, -175249270, 1272675493}, 33 - Drawable.resolveOpacity(0, 0), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                i("拹便ￊ穩\uf6f4\uee62湈韁拹便設㫧\ua63b˝", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                i("鼋ⴒ㒯䷚鴠礡曨ȼ䮱㈫⛇\uf1acꦁႈ톓ﳨ斈얔幵껗\uf6f4\uee62湈韁拹便設㫧\ua63b˝", Color.blue(0) + 30, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                k(new int[]{530442364, -518132962, -638758166, -1890162193, -921389077, 1993611738}, 10 - Color.alpha(0), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i8 = 0;
                                while (i8 < length) {
                                    Object obj = objArr19[i8];
                                    Object[] objArr20 = new Object[1];
                                    k(new int[]{-163355526, 1389061139, -720500632, 919082925}, KeyEvent.normalizeMetaState(0) + 5, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        i("\udb81\ue377쭼兤܈\u0b4e\uf52f馘럼\ud9c0綌倄\udfde믮褵沩\ue53b㴝ퟀ짢뼟ᅻ끭薥\uf3e0泖ྙ㷯黺艬\ue159룫洠慊䑋娶鞝鷊", TextUtils.indexOf("", "") + 37, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        k(new int[]{1212083888, 624746765, -1354299730, -1087388575, -1860271599, -873383343}, (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + i7, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            i("鼋ⴒ㒯䷚鴠礡曨ȼ䮱㈫⛇\uf1acꦁႈ톓ﳨ斈얔霆\uf592稁剽\u2d69聧ᝁ씾욌쿌", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            i("觟螐赶줧黺艬ꈌ\uf654暝⌖鞝鷊", Color.alpha(0) + 11, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                i("\udb81\ue377쭼兤܈\u0b4e\uf52f馘럼\ud9c0綌倄\udfde믮褵沩\ue53b㴝ퟀ짢뼟ᅻ끭薥\uf3e0泖ྙ㷯黺艬\ue159룫洠慊䑋娶鞝鷊", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                int[] iArr = new int[i7];
                                                // fill-array-data instruction
                                                iArr[0] = -302647153;
                                                iArr[1] = 650808214;
                                                iArr[2] = 1690967560;
                                                iArr[3] = 1128197781;
                                                iArr[4] = -1245326975;
                                                iArr[5] = 629976212;
                                                iArr[6] = -1229441676;
                                                iArr[7] = 1233406852;
                                                iArr[8] = -1516481971;
                                                iArr[9] = -792492636;
                                                Object[] objArr28 = new Object[1];
                                                k(iArr, 19 - TextUtils.getOffsetBefore("", 0), objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i9 = 0; i9 < 2; i9++) {
                                                    Object obj2 = objArr3[i9];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        k(new int[]{1244461039, 1785169260, 1759155824, -99431913, 1139139157, -1789226987, 1929336094, -917288320, 1879806824, 34339697, -1714338032, 548895910, 1557463694, -2110507592, 207667400, -1971598891, 32251335, -922811840}, 34 - KeyEvent.keyCodeFromString(""), objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        i("拹便\u2457\uf467ఝ㇊᙮⧃洠慊氼艴㑵ꍎ⟧ꩍ壆㼹账✕ⓛ庤\u0b84ม", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int iNextInt = new Random().nextInt();
                                                            int i10 = (((-1) - (((-1) - (~((iNextInt + 910554591) - (iNextInt & 910554591)))) & ((-1) - (-232406570)))) * 56) + 925454621;
                                                            int i11 = ~((~iNextInt) | (-232406570));
                                                            int i12 = i3 + i10 + (((i11 + 910554591) - (i11 & 910554591)) * 56) + 16;
                                                            int i13 = i12 ^ (i12 << 13);
                                                            int i14 = i13 ^ (i13 >>> 17);
                                                            ((int[]) objArr31[0])[0] = i14 ^ (i14 << 5);
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
                                                j2 = 0;
                                                i8++;
                                                i7 = 10;
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
        int i15 = f27410f * 981607590;
        f27410f = i15;
        int i16 = ~i15;
        int i17 = (~((-39683132) | i16)) | 34340922;
        int i18 = ~((i15 + 643807099) - (i15 & 643807099));
        int i19 = ~((-1) - (((-1) - i16) & ((-1) - (-5342210))));
        int i20 = i3 + 737421681 + ((i17 | i18) * (-502)) + (((i18 + i19) - (i18 & i19)) * 502);
        int i21 = i20 ^ (i20 << 13);
        int i22 = i21 ^ (i21 >>> 17);
        return objArr32;
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 79;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i5 = $10 + 7;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 5;
            }
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = $10 + 13;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) f27407c) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27409e)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 271, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f27406b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27408d)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) View.MeasureSpec.getSize(0), 11 - View.MeasureSpec.getMode(0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
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
                objA3 = o.d.d.a(271 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, -2074123590, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{39, 50, 101, -97};
        $$b = 122;
    }

    private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f27413j;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ExpandableListView.getPackedPositionGroup(j2), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -328001469, false, $$c(b2, (byte) ((b2 + 52) - (52 & b2)), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f27413j;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) i5;
                    objA2 = o.d.d.a(676 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)), -328001469, false, $$c(b3, (byte) (52 | b3), b3), new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i7++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        int i8 = $11 + 77;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 115;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    lVar.f19942e ^= iArr4[i10];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 301, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 52697), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -1416256172, false, $$c(b4, $$a[1], b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i10 += 17;
                } else {
                    lVar.f19942e ^= iArr4[i10];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 301, (char) (52697 - KeyEvent.normalizeMetaState(0)), Color.argb(0, 0, 0, 0) + 11, -1416256172, false, $$c(b5, $$a[1], b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i10++;
                }
                int i13 = $11 + 69;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
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
                byte b6 = (byte) 0;
                objA5 = o.d.d.a(Process.getGidForName("") + 230, (char) ((Process.myPid() >> 22) + 51004), 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -330018025, false, $$c(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 48))), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f27412h + 97;
        int i4 = i3 % 128;
        f27411g = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f27414a;
        int i5 = i4 + 95;
        f27412h = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void e() throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f27412h + 41;
        f27411g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f27414a;
        Object[] objArr = new Object[1];
        i("⡁ᛍ駕毵↸\u083f껔㓒ꦁႈ〻\ue134汰\ueb1a䄴뾓왴ۧ녤鶚虆寋䮱㈫⛇\uf1ac騟礣\u0bdb拪⼘鷫㕗섍䣫眀\u0bdb拪ᔿ棯鼋ⴒ㫡㾇殽쌦騟醴ⱒ\udfac웒\u0a46蓼ὁ", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 52, objArr);
        c(str, 1, 8192, ((String) objArr[0]).intern());
        int i5 = f27411g + 49;
        f27412h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
    }
}
