package o.dd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.k;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f22830f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22831g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f22832h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f22833i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22834j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f22835k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o.de.d f22837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f22838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.az.a f22839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f22840e;

    private static String $$c(short s2, byte b2, byte b3) {
        int i2 = b2 + 99;
        byte[] bArr = $$a;
        int i3 = 3 - (b3 * 3);
        int i4 = s2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3++;
            i2 = (-bArr[i3]) + i2;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22835k = -1538042171;
        f22834j = 0;
        f22831g = 1;
        f22832h = new char[]{38040, 63581, 19736, 54009, 10162, 46298, 6229, 27957, 62177, 18361, 54412, 14401, 36142, 4861, 26520, 62593, 22631, 44328, 13030, 34710, 5266, 30753, 52598, 21056, 42892, 13492, 38955, 60792, 29258, 51188, 21668, 47209, 3420, 37407, 59335, 29864, 55403, 11608, 38065, 63602, 19795, 53977, 10148, 46224, 6228, 27967, 62187, 18344, 54494, 14444, 36159, 4838, 26563, 62599, 22590, 44307, 12979, 34809, 5252, 30832, 52532, 21023, 42955, 13448, 38962, 60683, 29255, 51185, 21637, 41548, 52877, 31701, 58421, 4474, 33346, 11933, 23457, 50238, 29052, 57935, 3715, 48096, 9269, 20765, 49681, 28349, 39918, 1151, 45367, 8788, 20136, 64498, 25806, 37146, 598, 44684, 56310, 17611, 61722, 25198, 36538, 15263, 38037, 63577, 19738, 53960, 10155, 46231, 6221, 27953, 62181, 18345, 54455, 14406, 36156, 4843, 30790, 5255, 41439, 15935, 52080, 22600, 62615, 33195, 7732, 43894, 14405, 54409, 25066, 65087, 35607, 6171, 46263, 16868, 56949, 27453, 63582, 38050, 8696, 48836, 19216, 55388, 29826, 499, 40649, 11038, 56495, 45179, 1319, 39640, 28549, 64686, 20605, 9484, 47817, 3985, 53283, 48283, 2514, 38433, 25466, 58215, 36779, 15090, 42255, 20554, 50023, 28576, 6855, 34099, 12379, 41854, 20398, 64193, 25872, 4141, 33649, 12161, 56026, 17689, 16465, 11412, 39377, 1584, 62253, 24654, 52362, 47610, 9790, 37751, '^', 60565, 23018, 50787, 45852, 8268, 36009, 31201, 58985, 21289, 49174, 44269, 6582, 34554, 29454, 57431, 19619, 14824, 42709, 4868, 32892, 27816, 55695, 18128, 31298, 5774, 41933, 15388, 51560, 23105, 63131, 33762, 7222, 43375, 14961, 54986, 25533, 64611, 35121, 6725, 46764, 17381, 56378, 26886, 64077, 38562, 9213};
        f22830f = -3990770346172024772L;
        f22833i = 4696069205511771143L;
    }

    public c(Date date, o.az.a aVar, o.de.d dVar, g gVar, boolean z2) {
        this.f22838c = date;
        this.f22839d = aVar;
        this.f22837b = dVar;
        this.f22840e = gVar;
        this.f22836a = z2;
    }

    public c(c cVar) {
        this.f22838c = new Date(cVar.f22838c.getTime());
        this.f22839d = cVar.f22839d;
        this.f22837b = cVar.f22837b;
        this.f22840e = cVar.f22840e;
        this.f22836a = cVar.f22836a;
    }

    public static Object[] b(Context context, int i2, int i3) {
        Class<?>[] clsArr = null;
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = f22835k * (-1178799547);
            f22835k = i4;
            int i5 = i3 + ((((608249472 + r6) - (608249472 & r6)) * (-196)) - 2008208491) + (((-1) - (((-1) - (~(i4 | 616638088))) & ((-1) - 8388616))) * 196);
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >>> 17);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            l((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, TextUtils.lastIndexOf("", '0', 0, 0) + 39, objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            l((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37, 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                l((char) (Process.myPid() >> 22), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                m("澜濟ꇘꧼ佲➘ꕓ\udc56癄Ǧ輯\ue258尚ᯙ\ue96c衂∩痥\uf306깢ࠂ侨\udd77둛\uee3cꧫ✭娠\uf440菍Ċ怸\uda52鶄欽", ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    l((char) (ViewConfiguration.getFadingEdgeLength() >> 16), MotionEvent.axisFromString("") + 1, KeyEvent.getDeadChar(0, 0) + 38, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        m("✯❎噶昚攃큥檄\uf606㺴\uf66e䂐졆ᒤ\uec7c⚖ꈨ檖艁㲸葾䂼롔ኾ鸰Ꚏ幏\ue8d0", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        m("鑘鐿럓ᩆг㇋ᛈ霔跍េ㳃ꤹꟗී嫩쌍\ud9ea揫䃷\ue505\uf3fa", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            m("✯❎噶昚攃큥檄\uf606㺴\uf66e䂐졆ᒤ\uec7c⚖ꈨ檖艁㲸葾䂼롔ኾ鸰Ꚏ幏\ue8d0", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            m("\uf21a\uf27d謌䊊\ue882ഔ丄箥\ueb8f⬞搏䖈솕ㄌȦ⾼뾫弰", 1 - TextUtils.getOffsetBefore("", 0), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                l((char) (14047 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 69 - Color.red(0), TextUtils.indexOf("", "", 0) + 33, objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                l((char) (ViewConfiguration.getEdgeSlop() >> 16), 102 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 14, objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                l((char) (ExpandableListView.getPackedPositionGroup(0L) + 60629), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 116, MotionEvent.axisFromString("") + 31, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                l((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 18478), (Process.myTid() >> 22) + 146, 9 - TextUtils.indexOf((CharSequence) "", '0'), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i8 = 0;
                                while (i8 < length) {
                                    Object obj = objArr19[i8];
                                    Object[] objArr20 = new Object[1];
                                    l((char) (View.getDefaultSize(0, 0) + 17545), 156 - TextUtils.getOffsetAfter("", 0), View.getDefaultSize(0, 0) + 5, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        m("뉷눝ᓱ猟暤鋭羓\uf5b2ꮭ듳喔쮬自껦㎔ꆏￒ삆⦪螒헕靖\u07fb鶠㏖᳂\ufdd5珶⦩㚭\udbce䧪ޯ⢽뇿\u2fe6綴䊘꿪ׁ定", TextUtils.indexOf("", "") + 1, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        m("돼뎛倛㺎᎐혃㈀肮ꩦ\uf019᠔뺚聺\uea1d縉", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(clsArr, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            m("\uea18\uea79㻃芭\uee9a룐踳綟\uf383黛ꐧ䏟\ud993蓉숡⦱ꞡ\ueaf4\ud80f\u0fe7趸탣\uf649ᖎ段㛥౽﯀燔ᲃ⩭쇐", 1 - View.resolveSizeAndState(0, 0, 0), objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            m("䙅䘱㛞蓯찬냌街弢必雊ꉀ愵痟賚쑴", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), clsArr).invoke(obj, clsArr))};
                                                Object[] objArr27 = new Object[1];
                                                m("뉷눝ᓱ猟暤鋭羓\uf5b2ꮭ듳喔쮬自껦㎔ꆏￒ삆⦪螒헕靖\u07fb鶠㏖᳂\ufdd5珶⦩㚭\udbce䧪ޯ⢽뇿\u2fe6綴䊘꿪ׁ定", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                l((char) (30706 - Color.alpha(0)), 161 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i9 = 0; i9 < 2; i9++) {
                                                    Object obj2 = objArr3[i9];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        l((char) (Gravity.getAbsoluteGravity(0, 0) + 54473), TextUtils.lastIndexOf("", '0', 0, 0) + 181, View.MeasureSpec.makeMeasureSpec(0, 0) + 34, objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        l((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 61143), 214 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 23, objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int id = (int) Thread.currentThread().getId();
                                                            int i10 = ~((-560416980) | id);
                                                            int i11 = ~id;
                                                            int i12 = (-1) - (((-1) - i10) & ((-1) - (~((117731042 + i11) - (117731042 & i11)))));
                                                            int i13 = ~((560416979 + i11) - (560416979 & i11));
                                                            int i14 = ~((-1) - (((-1) - id) & ((-1) - (-17057987))));
                                                            int i15 = ~((-100673057) | i11);
                                                            int i16 = i3 + 1470824825 + (((-1) - (((-1) - i12) & ((-1) - i13))) * (-516)) + (((i14 + i15) - (i14 & i15)) * 516) + (((-1) - (((-1) - 100673056) & ((-1) - i13))) * 516) + 16;
                                                            int i17 = i16 ^ (i16 << 13);
                                                            int i18 = i17 ^ (i17 >>> 17);
                                                            ((int[]) objArr31[0])[0] = i18 ^ (i18 << 5);
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
                                                i8++;
                                                clsArr = null;
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
        Object[] objArr32 = {new int[1], new int[]{i2}, null, new int[]{i2}};
        int iMyUid = Process.myUid();
        int i19 = ~iMyUid;
        int i20 = 9196676 + (((~((i19 + 232031755) - (i19 & 232031755))) | (-1070907340)) * (-245));
        int i21 = ~(iMyUid | 232031755);
        int i22 = i3 + i20 + (i21 * (-245)) + (((-1) - (((-1) - i21) & ((-1) - 910179777))) * 245);
        int i23 = i22 ^ (i22 << 13);
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr32[0])[0] = i24 ^ (i24 << 5);
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$b = 86;
    }

    private static void l(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22832h[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((Process.myTid() >> 22) + 742, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f22830f), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 766, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12470), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(Color.blue(0) + 387, (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$c(b6, (byte) ((b6 + 6) - (6 & b6)), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 93;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 387, (char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 18, 39570797, false, $$c(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6))), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $10 + 27;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void m(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 13;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $10 + 69;
            $11 = i5 % 128;
            obj = charArray;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22833i ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        int i7 = $10 + 63;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22833i)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(228 - ImageFormat.getBitsPerPixel(0), (char) (51004 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 9 - TextUtils.getOffsetBefore("", 0), 1749983833, false, $$c(b2, (byte) (8 | b2), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(675 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, 522683165, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 15))), b3), new Class[]{Object.class, Object.class});
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

    public final o.de.d a() {
        int i2 = 2 % 2;
        int i3 = f22831g + 5;
        int i4 = i3 % 128;
        f22834j = i4;
        int i5 = i3 % 2;
        o.de.d dVar = this.f22837b;
        int i6 = i4 + 93;
        f22831g = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f22831g;
        int i4 = i3 + 3;
        f22834j = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f22836a;
        int i6 = i3 + 29;
        f22834j = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final Date c() {
        int i2 = 2 % 2;
        int i3 = f22831g + 9;
        int i4 = i3 % 128;
        f22834j = i4;
        int i5 = i3 % 2;
        Date date = this.f22838c;
        int i6 = i4 + 105;
        f22831g = i6 % 128;
        if (i6 % 2 != 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(Date date) {
        int i2 = 2 % 2;
        int i3 = f22834j + 17;
        f22831g = i3 % 128;
        if (i3 % 2 != 0) {
            this.f22838c = date;
        } else {
            this.f22838c = date;
            int i4 = 1 / 0;
        }
    }

    public final g d() {
        int i2 = 2 % 2;
        int i3 = f22831g + 43;
        f22834j = i3 % 128;
        int i4 = i3 % 2;
        g gVar = this.f22840e;
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        return gVar;
    }

    public final boolean d(c cVar) {
        boolean z2;
        int i2 = 2 % 2;
        if (cVar.c().before(c())) {
            int i3 = f22834j + 87;
            f22831g = i3 % 128;
            int i4 = i3 % 2;
            c(cVar.c());
            this.f22837b = cVar.f22837b;
            this.f22840e = cVar.f22840e;
            this.f22839d = cVar.f22839d;
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = f22831g + 17;
        f22834j = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return z2;
    }

    public final o.az.a e() {
        int i2 = 2 % 2;
        int i3 = f22831g;
        int i4 = i3 + 41;
        f22834j = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        o.az.a aVar = this.f22839d;
        int i5 = i3 + 41;
        f22834j = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        throw null;
    }
}
