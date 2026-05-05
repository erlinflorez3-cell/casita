package o.ex;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import o.a.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    private static long f25534c = 0;

    /* JADX INFO: renamed from: f */
    public static int f25535f = 0;

    /* JADX INFO: renamed from: g */
    private static int f25536g = 0;

    /* JADX INFO: renamed from: h */
    private static int f25537h = 0;

    /* JADX INFO: renamed from: i */
    private static char f25538i = 0;

    /* JADX INFO: renamed from: j */
    private static int f25539j = 0;

    /* JADX INFO: renamed from: k */
    public static int f25540k = 0;

    /* JADX INFO: renamed from: l */
    public static int f25541l = 0;

    /* JADX INFO: renamed from: a */
    private final T f25542a;

    /* JADX INFO: renamed from: b */
    private final c f25543b;

    /* JADX INFO: renamed from: d */
    private final Boolean f25544d;

    /* JADX INFO: renamed from: e */
    private final o.ep.d f25545e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, byte r9, byte r10) {
        /*
            int r8 = 122 - r8
            int r7 = r9 * 4
            int r1 = r7 + 1
            int r0 = r10 * 4
            int r6 = 3 - r0
            byte[] r5 = o.ex.b.$$c
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r7
            r2 = r3
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r6 = r6 + 1
            int r2 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r6]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ex.b.$$e(int, byte, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f25541l = 789175662;
        f25540k = 19011647;
        f25535f = -942885917;
        init$0();
        f25537h = 0;
        f25536g = 1;
        f25534c = 740602047300126166L;
        f25539j = 1564493270;
        f25538i = (char) 39020;
    }

    public b(T t2, c cVar, Boolean bool, o.ep.d dVar) {
        this.f25542a = t2;
        this.f25543b = cVar;
        this.f25544d = bool;
        this.f25545e = dVar;
    }

    public static Object[] a(int i2, int i3) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c2;
        String line;
        boolean zEquals;
        boolean zEquals2;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        File file2;
        File file3;
        int i4 = 2 % 2;
        try {
            Object[] objArr3 = new Object[1];
            m((char) (TextUtils.getTrimmedLength("") + 16516), "舌등装쩝㐍\ue92b甂깭ౄ邶昰酸\ue001䓷\u0ef2㓝퐨ᑞ\ue3df", "\u0000\u0000\u0000\u0000", "믹䊀蒱詀", (ViewConfiguration.getTapTimeout() >> 16) - 1321041733, objArr3);
            Object[] objArr4 = new Object[1];
            m((char) (12677 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "ᣔ聠沢ꠅ罯伾㨮㳠ྦ⩜ᾼ龸䳌ӧ量蹜\ufe1e漪", "\u0000\u0000\u0000\u0000", "\uee17⒜蔢\ue431", TextUtils.indexOf("", ""), objArr4);
            String[] strArr = {((String) objArr3[0]).intern(), ((String) objArr4[0]).intern()};
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    objArr = new Object[]{new int[1], new int[]{i2}, null, new int[]{i2}};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i6 = ~iElapsedRealtime;
                    int i7 = 906643394 + (((-1) - (((-1) - (~((-456171194) | i6))) & ((-1) - 221976828))) * 519) + (((~((i6 - 302024194) - (i6 & (-302024194)))) | (~((-1) - (((-1) - 524001021) & ((-1) - iElapsedRealtime))))) * (-519));
                    int i8 = ~((iElapsedRealtime + 221976828) - (iElapsedRealtime & 221976828));
                    int i9 = i3 + i7 + (((i8 + 456171193) - (i8 & 456171193)) * 519);
                    int i10 = i9 ^ (i9 << 13);
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                    break;
                }
                String str = strArr[i5];
                Object[] objArr5 = new Object[1];
                m((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65362), "簍㿂텀쨃강㷨諄\uda03\ued99볻ꖪा\ue553ן탲鄷", "\u0000\u0000\u0000\u0000", "\u0002엢剻䫿", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr5);
                Class<?> cls = Class.forName(((String) objArr5[0]).intern());
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i12 = f25536g + 29;
                    f25537h = i12 % 128;
                    int i13 = i12 % 2;
                    objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                    int i14 = f25535f * (-167552520);
                    f25535f = i14;
                    int i15 = i3 + (-1354685240) + ((142919766 | (~((-1) - (((-1) - (-231139927)) & ((-1) - i14))))) * 345) + (((~((-1) - (((-1) - (-231139927)) & ((-1) - (~i14))))) | 304088329) * 345) + ((~(i14 | (-142919767))) * 345) + 16;
                    int i16 = i15 ^ (i15 << 13);
                    int i17 = i16 ^ (i16 >>> 17);
                    break;
                }
                i5++;
            }
        } catch (Exception unused) {
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 2}};
            int i18 = i3 + 73375594 + (((~((-1) - (((-1) - (~i2)) & ((-1) - (-11534393))))) | (-666613630)) * (-591)) + (((-1) - (((-1) - i2) & ((-1) - (-11534393)))) * 591) + 16;
            int i19 = i18 ^ (i18 << 13);
            int i20 = i19 ^ (i19 >>> 17);
        }
        if (i2 != ((int[]) objArr[3])[0]) {
            int i21 = f25537h + 35;
            f25536g = i21 % 128;
            int i22 = i21 % 2;
            return objArr;
        }
        try {
            Object objA = o.d.d.a(26976634);
            if (objA == null) {
                int capsMode = 323 - TextUtils.getCapsMode("", 0, 0);
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int size = 11 - View.MeasureSpec.getSize(0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                n(b2, b3, b3, objArr6);
                objA = o.d.d.a(capsMode, longPressTimeout, size, -685882593, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objA).invoke(null, null)).longValue();
            long j2 = 1476759673;
            long j3 = -1;
            long j4 = j2 ^ j3;
            long j5 = jLongValue ^ j3;
            long j6 = j4 | j5;
            long j7 = i2;
            long j8 = j7 ^ j3;
            long j9 = ((j6 + j8) - (j6 & j8)) ^ j3;
            long j10 = ((jLongValue + j2) - (jLongValue & j2)) ^ j3;
            long j11 = (((long) IptcDirectory.TAG_BY_LINE) * j2) + (((long) (-590)) * jLongValue) + (((long) (-1182)) * (((j4 + jLongValue) - (j4 & jLongValue)) ^ j3)) + (((long) (-591)) * ((j9 + j10) - (j9 & j10))) + (((long) 591) * ((-1) - (((-1) - (j7 | j4)) & ((-1) - j5)))) + ((long) (-2015040831));
            int i23 = (int) (j11 >> 32);
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i24 = ~((2143264042 + iFreeMemory) - (2143264042 & iFreeMemory));
            int i25 = ~iFreeMemory;
            int i26 = ~((i25 - 714476843) - (i25 & (-714476843)));
            int i27 = 509965738 + (((i24 + i26) - (i24 & i26)) * (-318)) + (((~(((-731843883) + iFreeMemory) - ((-731843883) & iFreeMemory))) | R.layout.activity_list_item) * (-318)) + (((~((iFreeMemory + 731843882) - (iFreeMemory & 731843882))) | 2125897002) * 318);
            int i28 = (i23 + i27) - (i23 | i27);
            int i29 = (int) j11;
            int i30 = ~i2;
            int i31 = ~((-1) - (((-1) - 1209088651) & ((-1) - i30)));
            int i32 = ~((228137758 + i2) - (228137758 & i2));
            int i33 = ~((-1) - (((-1) - 228137758) & ((-1) - i30)));
            int i34 = ~((1209088651 + i2) - (1209088651 & i2));
            int i35 = (((-635053777) + (((i31 + i32) - (i31 & i32)) * (-370))) + ((((i34 + i33) - (i34 & i33)) | 135338506) * (-370))) - 1464360332;
            if ((-1) - (((-1) - i28) & ((-1) - ((i29 + i35) - (i29 | i35)))) == 1) {
                objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 10}};
                int i36 = f25540k * (-1009177125);
                f25540k = i36;
                int i37 = ~i36;
                int i38 = (~((-646962058) | i37)) | 637797249;
                int i39 = ~(i36 | (-22021157));
                int i40 = i3 + 1639838138 + (((-1) - (((-1) - i38) & ((-1) - i39))) * (-713)) + (i39 * 1426) + ((~((-31185965) | i37)) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION) + 16;
                int i41 = i40 ^ (i40 << 13);
                int i42 = i41 ^ (i41 >>> 17);
                c2 = 0;
            } else {
                objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                int i43 = i3 + (-481618362) + ((((-272868609) + i2) - ((-272868609) & i2)) * (-381)) + (((~(((-299365715) + i30) - ((-299365715) & i30))) | 731142234) * 381) + 883724544;
                int i44 = i43 ^ (i43 << 13);
                int i45 = i44 ^ (i44 >>> 17);
                c2 = 0;
            }
            if (i2 != ((int[]) objArr2[3])[c2]) {
                return objArr2;
            }
            try {
                Object[] objArr7 = new Object[1];
                m((char) (59920 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "鵁\ua630\uf867ך卻ӎ⯒뉡ⷢ\uee77裴햭\ue767\udc16弬鉠\uf661᚜얰ᆵ뢸蒪蛙ⱕ䞔䖈⟞\u05f8匐ꦴ\u20fb'㠯襌\u12b1囻䷊๔戓퇺", "\u0000\u0000\u0000\u0000", "훏슈ཞ㋪", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
                file3 = new File(((String) objArr7[0]).intern());
            } catch (Exception unused2) {
            }
            if ((!file3.canRead() ? (char) 29 : 'R') != 'R') {
                line = null;
            } else {
                fileReader = new FileReader(file3);
                bufferedReader = new BufferedReader(fileReader);
                try {
                    line = bufferedReader.readLine();
                    Object[] objArr8 = new Object[1];
                    m((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62550), "䕀⑳\u0fdd", "\u0000\u0000\u0000\u0000", "\ud97e꽓嚷샴", View.MeasureSpec.makeMeasureSpec(0, 0) - 1213246503, objArr8);
                    if (line.equals(((String) objArr8[0]).intern())) {
                        fileReader.close();
                        bufferedReader.close();
                        line = null;
                    } else {
                        fileReader.close();
                        bufferedReader.close();
                    }
                } finally {
                }
            }
            try {
                Object[] objArr9 = new Object[1];
                m((char) (7565 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "疒쁓彘ꗬ탬쥧鉣\ueeaf\uf2ff䊼쓙\udb14໗鵔ꋬ搁圂购洲\u2efb\uebc5톌簂㱦䬧鍾㛼쉦\ue77e軸\ud9dd", "\u0000\u0000\u0000\u0000", "愠\uebc3賗栝", Drawable.resolveOpacity(0, 0) - 672414879, objArr9);
                file2 = new File(((String) objArr9[0]).intern());
            } catch (Exception unused3) {
            }
            if ((!file2.canRead() ? '#' : '7') != '#') {
                fileReader = new FileReader(file2);
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String line2 = bufferedReader.readLine();
                    Object[] objArr10 = new Object[1];
                    m((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36243), "\uf5f3", "\u0000\u0000\u0000\u0000", "ꗖ觱鋢ꚍ", KeyEvent.keyCodeFromString("") - 494276187, objArr10);
                    zEquals = line2.equals(((String) objArr10[0]).intern());
                    fileReader.close();
                    bufferedReader.close();
                } finally {
                }
            } else {
                zEquals = false;
            }
            if (zEquals) {
                try {
                    Object[] objArr11 = new Object[1];
                    m((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), "懲绢쵿剙갡\u0af8勝혿\uf0c1䰚䛰퉘讛쭕杇싂燲䢻埸䰻\ueb25䆳䰲缌힝믃\u0cfc邺婌䰓\ue4ae海⠣砟糷嘲", "\u0000\u0000\u0000\u0000", "㪯㿣ﶪﮛ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr11);
                    file = new File(((String) objArr11[0]).intern());
                } catch (Exception unused4) {
                    zEquals2 = false;
                }
                if (file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line3 = bufferedReader.readLine();
                        Object[] objArr12 = new Object[1];
                        m((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36242), "\uf5f3", "\u0000\u0000\u0000\u0000", "ꗖ觱鋢ꚍ", (-494276187) + (ViewConfiguration.getPressedStateDuration() >> 16), objArr12);
                        zEquals2 = line3.equals(((String) objArr12[0]).intern());
                        fileReader.close();
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    zEquals2 = false;
                }
                if (zEquals2 && line != null) {
                    Object[] objArr13 = {new int[1], new int[]{i2}, line, new int[]{i2 ^ 20}};
                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    int i46 = 982931789 + ((~((iFreeMemory2 + 1749695) - (iFreeMemory2 & 1749695))) * JfifUtil.MARKER_SOI);
                    int i47 = ~iFreeMemory2;
                    int i48 = i3 + i46 + ((((-675349569) + i47) - ((-675349569) & i47)) * (-216)) + (((-1) - (((-1) - (~((i47 + 1749695) - (i47 & 1749695)))) & ((-1) - 676398326))) * JfifUtil.MARKER_SOI) + 16;
                    int i49 = i48 ^ (i48 << 13);
                    int i50 = i49 ^ (i49 >>> 17);
                    ((int[]) objArr13[0])[0] = i50 ^ (i50 << 5);
                    return objArr13;
                }
            }
            Object[] objArr14 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i51 = f25541l * 1319024835;
            f25541l = i51;
            int i52 = ~i51;
            int i53 = i3 + ((((~(i52 | (-43670152))) | ((-1) - (((-1) - (~((-721818174) | i52))) & ((-1) - 33690117)))) * (-397)) - 855739531) + (((-1) - (((-1) - i51) & ((-1) - (-698108091)))) * 397);
            int i54 = i53 ^ (i53 << 13);
            int i55 = i54 ^ (i54 >>> 17);
            return objArr14;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        $$a = new byte[]{106, 120, -13, -92};
        $$b = Mp4VideoDirectory.TAG_FRAME_RATE;
    }

    static void init$1() {
        $$c = new byte[]{64, -9, -71, 106};
        $$d = 161;
    }

    private static void m(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        int i4 = 57;
        Object obj = str4;
        if (str4 != null) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            char[] charArray3 = str4.toCharArray();
            int i7 = $10 + 109;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            obj = charArray3;
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) obj).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) i4;
                    byte b3 = (byte) 0;
                    objA = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 106, (char) View.getDefaultSize(0, 0), 11 - Drawable.resolveOpacity(0, 0), -155898465, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a(Color.rgb(0, 0, 0) + 16778063, (char) (View.combineMeasuredStates(0, 0) + 6488), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, -694521287, false, $$e((byte) 54, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    objA3 = o.d.d.a(458 - KeyEvent.getDeadChar(0, 0), (char) View.getDefaultSize(0, 0), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), 1804962841, false, $$e((byte) 56, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 639, (char) (65100 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.green(0) + 12, 1636969060, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f25534c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25539j) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25538i) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i9 = $10 + 95;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 57;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(short r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 4
            int r8 = 100 - r0
            byte[] r7 = o.ex.b.$$a
            int r0 = r9 * 4
            int r6 = 4 - r0
            int r0 = r10 * 2
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2d
            r8 = r6
            r0 = r5
            r2 = r3
        L16:
            int r0 = -r0
            int r6 = r6 + 1
            int r8 = r8 + r0
            r1 = r2
        L1b:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r5) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2a:
            r0 = r7[r6]
            goto L16
        L2d:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ex.b.n(short, int, int, java.lang.Object[]):void");
    }

    public final T a() {
        int i2 = 2 % 2;
        int i3 = f25537h;
        int i4 = i3 + 43;
        f25536g = i4 % 128;
        int i5 = i4 % 2;
        T t2 = this.f25542a;
        int i6 = i3 + 113;
        f25536g = i6 % 128;
        int i7 = i6 % 2;
        return t2;
    }

    public final Boolean b() {
        int i2 = 2 % 2;
        int i3 = f25537h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25536g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f25544d;
        }
        throw null;
    }

    public final c c() {
        int i2 = 2 % 2;
        int i3 = f25536g;
        int i4 = i3 + 93;
        f25537h = i4 % 128;
        int i5 = i4 % 2;
        c cVar = this.f25543b;
        int i6 = i3 + 53;
        f25537h = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    public final o.ep.d d() {
        int i2 = 2 % 2;
        int i3 = f25537h;
        int i4 = i3 + 35;
        f25536g = i4 % 128;
        int i5 = i4 % 2;
        o.ep.d dVar = this.f25545e;
        int i6 = i3 + 83;
        f25536g = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }
}
