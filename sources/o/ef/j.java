package o.ef;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.facebook.imageutils.JfifUtil;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.a.o;
import o.dd.g;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23841a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23842c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23843d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23844f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f23845g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f23846h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f23847i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23848j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23849b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23850e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r7, int r8, int r9) {
        /*
            int r0 = r7 * 2
            int r7 = 3 - r0
            int r6 = r8 + 99
            byte[] r5 = o.ef.j.$$c
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L29
            r1 = r2
            r0 = r3
        L15:
            int r6 = r6 + r1
            r1 = r0
        L17:
            int r7 = r7 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r1 = r5[r7]
            goto L15
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.j.$$e(int, int, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f23843d = -396946777;
        f23841a = 863758767;
        f23842c = 2059239909;
        f23844f = 0;
        f23848j = 1;
        f23846h = 201927361166310082L;
        f23847i = new char[]{49300, 5795, 27789, 17061, 39118, 60987, 50265, 6780, 28767, 18013, 40380, 62353, 60746, 15187, 36977, 18006, 15464, 4629, 51238, 48837, 38117, 19086, 8357, 5804, 52569, 41844, 39252, 20269, 9695, 7139, 61829, 42888, 40377, 29712, 10855, TokenParser.CR, 63037, 44245, 33505, 30966, 11935, 1205, 10312, 65106, 33872, 43578, 28780, 1763, 11425, 62171, 39150, 44788, 29960, 6951, 8554, 63315, 38071, 17046, 14522, 5827, 52449, 47626, 36927, 20050, 9266, 4706, 51587, 42930, 40391, 19436, 8475, 7994, 62738, 41816, 39275, 28810, 11959, 1243, 56364, 2614, 28693, 24169, 8563, 63271, 12652, 59160, 38076, 17039, 14503, 5827, 52465, 47710, 36921, 20055, 9340, 4704, 51589, 42930, 40322, 19452, 8479, 8054, 62812, 41819, 39270, 28810, 64854, 11109, 20813, 32553, 42267, 54196, 63965, 10153, 19851, 31632, 40992, 52814, 62509, 8788, 18659, 30408, 40106, 51885, 61582, 6507, 18267, 28024, 39760, 49662, 61389, 5584, 17376, 38098, 17039, 14526, 5766, 52449, 47638, 36923, 20036, 9331, 4717, 51614, 42915, 40400, 19390, 38098, 17025, 14508, 5766, 38071, 17027, 14527, 5834, 52451, 47626, 36917, 20036, 9302, 4715, 51614, 42915, 40385, 19434, 8467, 7993, 62812, 13532, 58067, 39141, 46730, 27784, 6731, 12404, 60958, 33851, 45619, 27098, 2015, 15760, 60340, 33103, 49016, 21761, 796, 14651, 53471, 36592, 42134, 21122, 2127, 9850, 56439, 35349, 41006, 24539, 30182, 9158, 55783, 63246, 44356, 23423, 28936, 12074, 50903, 64743, 43654, 16523, 32444, 5184, 49779, 63500, 38445, 19912, 31719, 4491, 53148, 58786, 37753, 18801, 26374, 7459, 13456, 58030, 59043, 12462, 19082, 25843, 48860, 51242, 65398, 10609, 21353, 32034, 42752, 53735, 64452, 9633, 15205, 60778, 38748, 47411, 25393, 5618, 16333, 57767, 35714, 48522, 26211, 2150, 12841, 58381, 36598, 45249, 23224, 3237, 13954, 57190, 33097, 43823, 23867, 2038, 10691, 54222, 34220, 44951, 20578, 31327, 11391, 54878, 63671, 41692, 21710, 32431, 8331, 51582, 62283, 42355, 20249, 28932, 7163, 52611, 63406, 39317, 17014, 29767, 7742, 49194, 59907, 40170, 18141, 26814, 4763, 15155, 60760, 38745, 47471, 25361, 5618, 16341, 57777, 35738, 48249, 26220, 2051, 12899, 58388, 36592, 45270, 23203};
        f23845g = -7021872293232098578L;
    }

    public j(String str) throws Throwable {
        if (str != null) {
            Object[] objArr = new Object[1];
            k("䷟ᖿ䌖댠䌎", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            if (str.startsWith(((String) objArr[0]).intern())) {
                str = str.substring(1);
            }
        }
        this.f23850e = str;
    }

    private char a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23844f + 41;
        f23848j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f23850e;
        int i5 = this.f23849b;
        this.f23849b = i5 + 1;
        char cCharAt = str.charAt(i5);
        if (cCharAt == 'b') {
            return '\b';
        }
        if (cCharAt == 'f') {
            return '\f';
        }
        if (cCharAt == 'n') {
            return '\n';
        }
        if (cCharAt == 'r') {
            return TokenParser.CR;
        }
        if (cCharAt == 't') {
            return '\t';
        }
        if (cCharAt != 'u') {
            return cCharAt;
        }
        if (this.f23849b + 4 <= this.f23850e.length()) {
            String str2 = this.f23850e;
            int i6 = this.f23849b;
            String strSubstring = str2.substring(i6, i6 + 4);
            this.f23849b += 4;
            try {
                return (char) Integer.parseInt(strSubstring, 16);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                k("⢊᪻沲⣃牭붴밚虓訆ᅊᢆ愲洯뒰篡쎓쁚䮆횂麡ꍯ\ueef2〷秗ڄ跀錇풨離", AndroidCharacter.getMirror('0') - '0', objArr);
                throw d(sb.append(((String) objArr[0]).intern()).append(strSubstring).toString());
            }
        }
        int i7 = f23848j + 35;
        f23844f = i7 % 128;
        if (i7 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            l((char) (10273 / (ViewConfiguration.getScrollBarFadeDuration() >> 124)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) * 103, 100 >>> Color.blue(0), objArr2);
            throw d(((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        l((char) (1238 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.blue(0) + 28, objArr3);
        throw d(((String) objArr3[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.j.b():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
  0x002a: PHI (r1v7 char) = (r1v6 char), (r1v9 char) binds: [B:15:0x0046, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r6) {
        /*
            r5 = 0
            r2 = r6[r5]
            o.ef.j r2 = (o.ef.j) r2
            r4 = 2
            int r0 = r4 % r4
        L8:
            int r1 = r2.f23849b
            java.lang.String r0 = r2.f23850e
            int r0 = r0.length()
            r3 = 0
            if (r1 >= r0) goto L49
            int r0 = o.ef.j.f23848j
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.ef.j.f23844f = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L3c
            java.lang.String r1 = r2.f23850e
            int r0 = r2.f23849b
            char r1 = r1.charAt(r0)
            r0 = 88
            if (r1 == r0) goto L2e
        L2a:
            r0 = 10
            if (r1 != r0) goto L35
        L2e:
            int r0 = r2.f23849b
            int r0 = r0 + 1
            r2.f23849b = r0
            return r3
        L35:
            int r0 = r2.f23849b
            int r0 = r0 + 1
            r2.f23849b = r0
            goto L8
        L3c:
            java.lang.String r1 = r2.f23850e
            int r0 = r2.f23849b
            char r1 = r1.charAt(r0)
            r0 = 13
            if (r1 == r0) goto L2e
            goto L2a
        L49:
            int r0 = o.ef.j.f23844f
            int r1 = r0 + 81
            int r0 = r1 % 128
            o.ef.j.f23848j = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L57
            r0 = 80
            int r0 = r0 / r5
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.j.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = i8 | i9;
        int i11 = ~i2;
        int i12 = (-1) - (((-1) - (~((i10 + i11) - (i10 & i11)))) & ((-1) - (~(i4 | i2))));
        int i13 = ~((-1) - (((-1) - i8) & ((-1) - i11)));
        int i14 = i4 | i13;
        int i15 = ~((i9 + i5) - (i9 & i5));
        int i16 = (-1) - (((-1) - (~((i2 + i5) - (i2 & i5)))) & ((-1) - ((i13 + i15) - (i13 & i15))));
        int i17 = i5 + i4 + i3 + (296844165 * i6) + (1729652556 * i7);
        int i18 = i17 * i17;
        int i19 = ((i5 * 599922083) - 580124672) + (599922083 * i4) + (2088888926 * i12) + ((-117189444) * i14) + ((-2088888926) * i16) + ((-1606156288) * i3) + ((-279707648) * i6) + ((-265289728) * i7) + (2117271552 * i18);
        int i20 = (i5 * (-1181628991)) + 1322814002 + (i4 * (-1181628991)) + (i12 * (-118)) + (i14 * (-236)) + (i16 * 118) + (i3 * (-1181629109)) + (i6 * (-698251017)) + (i7 * 1773125444) + (i18 * 938541056);
        if (i19 + (i20 * i20 * (-109772800)) == 1) {
            return b(objArr);
        }
        j jVar = (j) objArr[0];
        int i21 = 2 % 2;
        a aVar = new a();
        int iE = jVar.e();
        if (iE == 125) {
            return aVar;
        }
        if (iE != -1) {
            int i22 = f23848j;
            int i23 = i22 + 13;
            f23844f = i23 % 128;
            int i24 = i23 % 2;
            jVar.f23849b--;
            int i25 = i22 + 117;
            f23844f = i25 % 128;
            int i26 = i25 % 2;
        }
        while (true) {
            Object objC = jVar.c();
            if (!(objC instanceof String)) {
                if (objC != null) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    l((char) (27114 - View.MeasureSpec.getMode(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 105, 'K' - AndroidCharacter.getMirror('0'), objArr2);
                    StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(objC);
                    Object[] objArr3 = new Object[1];
                    k("㻲\ue70f頰㻒连䤳䒕纝鱽\uecf1\uec40駩筋䤇轥㭝", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), objArr3);
                    throw jVar.d(sbAppend.append(((String) objArr3[0]).intern()).append(objC.getClass().getName()).toString());
                }
                int i27 = f23844f + 5;
                f23848j = i27 % 128;
                if (i27 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    l((char) Drawable.resolveOpacity(1, 1), 43 >>> TextUtils.indexOf((CharSequence) "", 'z', 0, 1), 106 >>> Color.alpha(0), objArr4);
                    throw jVar.d(((String) objArr4[0]).intern());
                }
                Object[] objArr5 = new Object[1];
                l((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 87, Color.alpha(0) + 20, objArr5);
                throw jVar.d(((String) objArr5[0]).intern());
            }
            int iE2 = jVar.e();
            if (iE2 != 58 && iE2 != 61) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                k("ᙫ쀚豃ᘮ\ua8da嵃忊文듨쯶\uf876芦压湅魉\u2005ﻫ鄣㘵絶鶎㑐킓", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr6);
                throw jVar.d(sb2.append(((String) objArr6[0]).intern()).append(objC).toString());
            }
            if (jVar.f23849b < jVar.f23850e.length() && jVar.f23850e.charAt(jVar.f23849b) == '>') {
                int i28 = f23848j + 121;
                f23844f = i28 % 128;
                int i29 = i28 % 2;
                jVar.f23849b++;
            }
            aVar.a((String) objC, jVar.c());
            int iE3 = jVar.e();
            if (iE3 != 44 && iE3 != 59) {
                if (iE3 == 125) {
                    return aVar;
                }
                Object[] objArr7 = new Object[1];
                k("悾秥ᆊ惫ᄳ삎⟊ᶇ숬爐斳窱┟ퟩ۟塆蠾⣒꯸ը\ueb5b趾䴎", ViewConfiguration.getTapTimeout() >> 16, objArr7);
                throw jVar.d(((String) objArr7[0]).intern());
            }
        }
    }

    private String c(String str) {
        int i2 = 2 % 2;
        int i3 = this.f23849b;
        while (this.f23849b < this.f23850e.length()) {
            int i4 = f23848j + 89;
            f23844f = i4 % 128;
            int i5 = i4 % 2;
            char cCharAt = this.f23850e.charAt(this.f23849b);
            if (cCharAt == '\r' || cCharAt == '\n' || str.indexOf(cCharAt) != -1) {
                String strSubstring = this.f23850e.substring(i3, this.f23849b);
                int i6 = f23848j + 109;
                f23844f = i6 % 128;
                int i7 = i6 % 2;
                return strSubstring;
            }
            this.f23849b++;
        }
        return this.f23850e.substring(i3);
    }

    public static void c(Context context, long j2, long j3) throws Throwable {
        Class[] clsArr;
        Object objInvoke;
        Object[] objArr;
        Method method;
        int i2 = 2 % 2;
        long j4 = j2 ^ (j3 << 32);
        try {
            Method method2 = f.class.getMethod("a", null);
            method2.setAccessible(true);
            if (((Boolean) method2.invoke(null, null)).booleanValue()) {
                int i3 = f23844f + 125;
                f23848j = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = new Object[1];
                l((char) (ViewConfiguration.getPressedStateDuration() >> 16), 151 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(null);
                Object[] objArr3 = new Object[1];
                l((char) (AndroidCharacter.getMirror('0') + 41004), 168 - KeyEvent.normalizeMetaState(0), 57 - TextUtils.getOffsetAfter("", 0), objArr3);
                Object[] objArr4 = {((String) objArr3[0]).intern()};
                Object[] objArr5 = new Object[1];
                l((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29231), Color.red(0) + JfifUtil.MARKER_APP1, KeyEvent.normalizeMetaState(0) + 6, objArr5);
                Method method3 = StringBuilder.class.getMethod(((String) objArr5[0]).intern(), String.class);
                method3.setAccessible(true);
                Object objInvoke2 = method3.invoke(objNewInstance, objArr4);
                Object[] objArr6 = {Long.valueOf(j4)};
                Object[] objArr7 = new Object[1];
                l((char) (KeyEvent.normalizeMetaState(0) + 29232), 224 - ((byte) KeyEvent.getModifierMetaStateMask()), '6' - AndroidCharacter.getMirror('0'), objArr7);
                Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), Long.TYPE);
                method4.setAccessible(true);
                Object objInvoke3 = method4.invoke(objInvoke2, objArr6);
                Object[] objArr8 = new Object[1];
                l((char) (27633 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 231 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, objArr8);
                Method method5 = StringBuilder.class.getMethod(((String) objArr8[0]).intern(), null);
                method5.setAccessible(true);
                Object[] objArr9 = {strIntern, method5.invoke(objInvoke3, null)};
                Method method6 = f.class.getMethod("c", String.class, Object.class);
                method6.setAccessible(true);
                method6.invoke(null, objArr9);
                int i5 = f23844f + 23;
                f23848j = i5 % 128;
                int i6 = i5 % 2;
            }
            byte b2 = (byte) 1;
            byte b3 = (byte) (b2 + 1);
            byte b4 = (byte) (b3 - 1);
            Object[] objArr10 = new Object[1];
            m(b2, b3, b4, objArr10);
            Class<?> cls = Class.forName((String) objArr10[0]);
            byte b5 = (byte) 0;
            byte[] bArr = $$a;
            Object[] objArr11 = new Object[1];
            m(b5, (byte) bArr.length, b5, objArr11);
            Method method7 = cls.getMethod((String) objArr11[0], null);
            method7.setAccessible(true);
            Object objInvoke4 = method7.invoke(null, null);
            int i7 = (int) j4;
            Object[] objArr12 = new Object[1];
            m(b2, b3, b4, objArr12);
            Class.forName((String) objArr12[0]).getField("b").setInt(objInvoke4, i7);
            Object[] objArr13 = new Object[1];
            m(b2, b3, b4, objArr13);
            Class<?> cls2 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            m(b5, (byte) bArr.length, b5, objArr14);
            Method method8 = cls2.getMethod((String) objArr14[0], null);
            method8.setAccessible(true);
            Object objInvoke5 = method8.invoke(null, null);
            Object[] objArr15 = new Object[1];
            m(b2, b3, b4, objArr15);
            Object objInvoke6 = context;
            if (Class.forName((String) objArr15[0]).getField("d").getBoolean(objInvoke5)) {
                return;
            }
            if (context == null) {
                int i8 = f23848j + 81;
                f23844f = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr16 = new Object[1];
                    m(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 8))), b5, objArr16);
                    Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                    method9.setAccessible(true);
                    objInvoke = method9.invoke(null, null);
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr17 = new Object[1];
                    m(b5, b6, (byte) (b6 - 1), objArr17);
                    objArr = null;
                    method = o.en.b.class.getMethod((String) objArr17[0], null);
                    method.setAccessible(true);
                } else {
                    Object[] objArr18 = new Object[1];
                    m(b5, (byte) (8 | b5), b5, objArr18);
                    Method method10 = o.en.b.class.getMethod((String) objArr18[0], null);
                    method10.setAccessible(true);
                    objInvoke = method10.invoke(null, null);
                    byte b7 = (byte) (b5 + 1);
                    Object[] objArr19 = new Object[1];
                    m(b5, b7, (byte) (b7 - 1), objArr19);
                    objArr = null;
                    method = o.en.b.class.getMethod((String) objArr19[0], null);
                    method.setAccessible(true);
                }
                objInvoke6 = method.invoke(objInvoke, objArr);
            }
            if (objInvoke6 != null) {
                int i9 = f23844f + 69;
                f23848j = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr20 = new Object[1];
                m(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 8))), b5, objArr20);
                Method method11 = o.en.b.class.getMethod((String) objArr20[0], null);
                method11.setAccessible(true);
                Object objInvoke7 = method11.invoke(null, null);
                Object[] objArr21 = new Object[1];
                m(b5, (byte) bArr.length, b5, objArr21);
                Method method12 = o.en.b.class.getMethod((String) objArr21[0], null);
                method12.setAccessible(true);
                if (((Boolean) method12.invoke(objInvoke7, null)).booleanValue()) {
                    int i11 = f23844f + 11;
                    f23848j = i11 % 128;
                    if (i11 % 2 != 0) {
                        byte b8 = b5;
                        Object[] objArr22 = new Object[1];
                        m(b5, b8, b8, objArr22);
                        String str = (String) objArr22[0];
                        clsArr = null;
                        Method method13 = o.en.b.class.getMethod(str, null);
                        method13.setAccessible(true);
                        if (!((Boolean) method13.invoke(objInvoke7, null)).booleanValue()) {
                        }
                        Method method14 = o.dc.d.class.getMethod("a", clsArr);
                        method14.setAccessible(true);
                        Object objInvoke8 = method14.invoke(clsArr, clsArr);
                        Object[] objArr23 = {o.az.a.class.getField("b").get(clsArr), g.class.getField("z").get(clsArr)};
                        Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, g.class);
                        declaredConstructor2.setAccessible(true);
                        Object[] objArr24 = {objInvoke6, declaredConstructor2.newInstance(objArr23), true};
                        Method method15 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                        method15.setAccessible(true);
                        method15.invoke(objInvoke8, objArr24);
                        Object[] objArr25 = new Object[1];
                        m(b2, b3, b4, objArr25);
                        Class<?> cls3 = Class.forName((String) objArr25[0]);
                        Object[] objArr26 = new Object[1];
                        m(b5, (byte) bArr.length, b5, objArr26);
                        Method method16 = cls3.getMethod((String) objArr26[0], null);
                        method16.setAccessible(true);
                        Object objInvoke9 = method16.invoke(null, null);
                        Object[] objArr27 = new Object[1];
                        m(b2, b3, b4, objArr27);
                        Class.forName((String) objArr27[0]).getField("d").setBoolean(objInvoke9, true);
                        return;
                    }
                    byte b9 = b5;
                    Object[] objArr28 = new Object[1];
                    m(b5, b9, b9, objArr28);
                    Method method17 = o.en.b.class.getMethod((String) objArr28[0], null);
                    method17.setAccessible(false);
                    if (((Boolean) method17.invoke(objInvoke7, null)).booleanValue()) {
                        clsArr = null;
                        Method method142 = o.dc.d.class.getMethod("a", clsArr);
                        method142.setAccessible(true);
                        Object objInvoke82 = method142.invoke(clsArr, clsArr);
                        Object[] objArr232 = {o.az.a.class.getField("b").get(clsArr), g.class.getField("z").get(clsArr)};
                        Constructor declaredConstructor22 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, g.class);
                        declaredConstructor22.setAccessible(true);
                        Object[] objArr242 = {objInvoke6, declaredConstructor22.newInstance(objArr232), true};
                        Method method152 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                        method152.setAccessible(true);
                        method152.invoke(objInvoke82, objArr242);
                        Object[] objArr252 = new Object[1];
                        m(b2, b3, b4, objArr252);
                        Class<?> cls32 = Class.forName((String) objArr252[0]);
                        Object[] objArr262 = new Object[1];
                        m(b5, (byte) bArr.length, b5, objArr262);
                        Method method162 = cls32.getMethod((String) objArr262[0], null);
                        method162.setAccessible(true);
                        Object objInvoke92 = method162.invoke(null, null);
                        Object[] objArr272 = new Object[1];
                        m(b2, b3, b4, objArr272);
                        Class.forName((String) objArr272[0]).getField("d").setBoolean(objInvoke92, true);
                        return;
                    }
                }
                Method method18 = f.class.getMethod("a", null);
                method18.setAccessible(true);
                if (((Boolean) method18.invoke(null, null)).booleanValue()) {
                    Object[] objArr29 = new Object[1];
                    l((char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 151, 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr29);
                    String strIntern2 = ((String) objArr29[0]).intern();
                    Object[] objArr30 = new Object[1];
                    l((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45028), 239 - (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 72, objArr30);
                    Object[] objArr31 = {strIntern2, ((String) objArr30[0]).intern()};
                    Method method19 = f.class.getMethod("c", String.class, Object.class);
                    method19.setAccessible(true);
                    method19.invoke(null, objArr31);
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private String d(char c2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = this.f23849b;
        int i4 = f23848j + 19;
        f23844f = i4 % 128;
        int i5 = i4 % 2;
        StringBuilder sb = null;
        while (this.f23849b < this.f23850e.length()) {
            String str = this.f23850e;
            int i6 = this.f23849b;
            this.f23849b = i6 + 1;
            char cCharAt = str.charAt(i6);
            if (cCharAt == c2) {
                if (sb == null) {
                    return new String(this.f23850e.substring(i3, this.f23849b - 1));
                }
                sb.append((CharSequence) this.f23850e, i3, this.f23849b - 1);
                return sb.toString();
            }
            if (cCharAt == '\\') {
                if (this.f23849b == this.f23850e.length()) {
                    int i7 = f23844f + 117;
                    f23848j = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = new Object[1];
                    l((char) (1238 - (ViewConfiguration.getTouchSlop() >> 8)), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
                    throw d(((String) objArr[0]).intern());
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) this.f23850e, i3, this.f23849b - 1);
                sb.append(a());
                i3 = this.f23849b;
            }
            int i9 = f23848j + 45;
            f23844f = i9 % 128;
            int i10 = i9 % 2;
        }
        Object[] objArr2 = new Object[1];
        k("驚楬鹸騏ƺ佼䛾粳㣈抙\uea41鮘\udffb읠褭㥲狚㡇␜摄ᆳ鴺싯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        throw d(((String) objArr2[0]).intern());
    }

    private b d(String str) {
        int i2 = 2 % 2;
        b bVar = new b(new StringBuilder().append(str).append(this).toString());
        int i3 = f23844f + 23;
        f23848j = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    private void d() throws Throwable {
        int i2 = f23843d * (-748764735);
        f23843d = i2;
        b(new Object[]{this}, i2, (int) Runtime.getRuntime().totalMemory(), -1841685553, 1841685554, (int) SystemClock.uptimeMillis(), new Random().nextInt());
    }

    private int e() throws Throwable {
        int i2 = 2 % 2;
        while (this.f23849b < this.f23850e.length()) {
            int i3 = f23844f + 69;
            f23848j = i3 % 128;
            int i4 = i3 % 2;
            String str = this.f23850e;
            int i5 = this.f23849b;
            this.f23849b = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                if (cCharAt == '#') {
                    int i6 = f23843d * (-748764735);
                    f23843d = i6;
                    b(new Object[]{this}, i6, (int) Runtime.getRuntime().totalMemory(), -1841685553, 1841685554, (int) SystemClock.uptimeMillis(), new Random().nextInt());
                } else {
                    if (cCharAt != '/' || this.f23849b == this.f23850e.length()) {
                        return cCharAt;
                    }
                    char cCharAt2 = this.f23850e.charAt(this.f23849b);
                    if (cCharAt2 == '*') {
                        this.f23849b++;
                        String str2 = this.f23850e;
                        Object[] objArr = new Object[1];
                        l((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31121), 12 - Color.green(0), (Process.myTid() >> 22) + 2, objArr);
                        int iIndexOf = str2.indexOf(((String) objArr[0]).intern(), this.f23849b);
                        if (iIndexOf == -1) {
                            int i7 = f23848j + 41;
                            f23844f = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr2 = new Object[1];
                            k("툙\udeae\ue7d0퉌뙸㛔ﱓ옞炋핛鏩ℵ鞸炢\uf085菟㪙辕嶯\udef6姴⫳뭎㦏", '0' - AndroidCharacter.getMirror('0'), objArr2);
                            throw d(((String) objArr2[0]).intern());
                        }
                        this.f23849b = iIndexOf + 2;
                        int i9 = f23844f + 105;
                        f23848j = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        if (cCharAt2 != '/') {
                            return cCharAt;
                        }
                        this.f23849b++;
                        int i11 = f23843d * (-748764735);
                        f23843d = i11;
                        b(new Object[]{this}, i11, (int) Runtime.getRuntime().totalMemory(), -1841685553, 1841685554, (int) SystemClock.uptimeMillis(), new Random().nextInt());
                    }
                }
            }
        }
        return -1;
    }

    private a g() throws b {
        int i2 = f23842c * (-2075377305);
        f23842c = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int priority = Thread.currentThread().getPriority();
        int i3 = f23841a * (-442646787);
        f23841a = i3;
        return (a) b(new Object[]{this}, i2, elapsedCpuTime, -1439302408, 1439302408, priority, i3);
    }

    private c h() throws Throwable {
        int i2 = 2 % 2;
        c cVar = new c();
        int i3 = f23844f + 81;
        f23848j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 4;
        }
        boolean z2 = false;
        while (true) {
            int iE = e();
            if (iE == -1) {
                Object[] objArr = new Object[1];
                k("䎢廒묳䏷鉔樷䒬绡\ue130\uf177켊駊\u0603咎걦㬠ꬢꮻő昖졃ໃ", ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
                throw d(((String) objArr[0]).intern());
            }
            if (iE == 44 || iE == 59) {
                cVar.a((Object) null);
            } else {
                if (iE == 93) {
                    if (z2) {
                        int i5 = f23848j + 25;
                        f23844f = i5 % 128;
                        int i6 = i5 % 2;
                        cVar.a((Object) null);
                    }
                    return cVar;
                }
                this.f23849b--;
                cVar.a(c());
                int iE2 = e();
                if (iE2 != 44 && iE2 != 59) {
                    if (iE2 == 93) {
                        return cVar;
                    }
                    Object[] objArr2 = new Object[1];
                    k("䎢廒묳䏷鉔樷䒬绡\ue130\uf177켊駊\u0603咎걦㬠ꬢꮻő昖졃ໃ", View.resolveSizeAndState(0, 0, 0), objArr2);
                    throw d(((String) objArr2[0]).intern());
                }
            }
            z2 = true;
        }
    }

    static void init$0() {
        $$a = new byte[]{45, 78, -5, 117, 60, MessagePack.Code.EXT8, -19, Base64.padSymbol, MessagePack.Code.BIN8};
        $$b = 72;
    }

    static void init$1() {
        $$c = new byte[]{100, 68, -66, 16};
        $$d = 14;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 15;
        $10 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f23846h ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i5 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23846h)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(229 - View.combineMeasuredStates(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 51005), Color.green(0) + 9, 1749983833, false, $$e(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 8))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(675 - KeyEvent.keyCodeFromString(""), (char) TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, 522683165, false, $$e(b3, (byte) (15 | b3), b3), new Class[]{Object.class, Object.class});
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
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i6 = $10 + 69;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    private static void l(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23847i[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 742, (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f23845g), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(766 - Color.blue(0), (char) (12470 - KeyEvent.normalizeMetaState(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 1946853218, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(388 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 18 - Drawable.resolveOpacity(0, 0), 39570797, false, $$e(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + 41;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 387, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 39570797, false, $$e(b7, (byte) (6 | b7), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void m(short s2, byte b2, short s3, Object[] objArr) {
        int i2 = s3 * 5;
        int i3 = 115 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = 8 - (s2 * 5);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i2)) - 5;
            i4 = i4;
        }
        while (true) {
            int i6 = i4 + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i6])) - 5;
                i4 = i6;
            }
        }
    }

    public final Object c() throws b {
        int i2 = 2 % 2;
        int iE = e();
        if (iE == -1) {
            Object[] objArr = new Object[1];
            l((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21539), ExpandableListView.getPackedPositionChild(0L) + 1, 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            throw d(((String) objArr[0]).intern());
        }
        if (iE == 34 || iE == 39) {
            String strD = d((char) iE);
            int i3 = f23844f + 105;
            f23848j = i3 % 128;
            if (i3 % 2 != 0) {
                return strD;
            }
            throw null;
        }
        if (iE == 91) {
            c cVarH = h();
            int i4 = f23848j + 17;
            f23844f = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return cVarH;
        }
        if (iE != 123) {
            this.f23849b--;
            return b();
        }
        int i6 = (-2075377305) * f23842c;
        f23842c = i6;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int priority = Thread.currentThread().getPriority();
        int i7 = f23841a * (-442646787);
        f23841a = i7;
        return (a) b(new Object[]{this}, i6, elapsedCpuTime, -1439302408, 1439302408, priority, i7);
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        l((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "", 0) + 133, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f23849b);
        Object[] objArr2 = new Object[1];
        l((char) KeyEvent.normalizeMetaState(0), 148 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr2);
        String string = sbAppend.append(((String) objArr2[0]).intern()).append(this.f23850e).toString();
        int i3 = f23844f + 121;
        f23848j = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
