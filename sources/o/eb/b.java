package o.eb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.l;
import o.a.q;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f23594a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23595b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f23596c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23597d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23598e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r5 = r5 + 4
            byte[] r4 = o.eb.b.$$a
            int r0 = 121 - r7
            byte[] r3 = new byte[r1]
            r1 = -1
            if (r4 != 0) goto L24
            r2 = r5
        L10:
            int r5 = r5 + r0
        L11:
            int r1 = r1 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            int r2 = r2 + 1
            if (r1 != r6) goto L21
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L21:
            r0 = r4[r2]
            goto L10
        L24:
            r2 = r5
            r5 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.b.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23598e = 1883054168;
        f23595b = 0;
        f23597d = 1;
        f23596c = -2671626287605050963L;
        f23594a = new int[]{2124324163, 1455639911, -1176273849, -1505776433, -1654891601, -2073408230, 1958203668, -1123798225, -477897847, 530830573, -1999069831, 1514380837, 338811267, -291077617, 936197699, -1471674792, 2010254086, -906598015};
    }

    public static Object[] c(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int i4 = i3 + ((((-1) - (((-1) - (~(((-692800044) + r4) - ((-692800044) & r4)))) & ((-1) - 4915745))) * (-566)) - 834507605) + ((~((-1) - (((-1) - ((int) SystemClock.elapsedRealtime())) & ((-1) - (-687884299))))) * 566);
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            return objArr;
        }
        int i7 = 20;
        try {
            Object[] objArr2 = new Object[1];
            g(new int[]{1666053415, 1227703749, 800225532, 1508120767, 849306220, 1513696578, 448935880, -848248547, 1462699221, 1829760436, -1787870573, -1449087841, -693144566, 12250016, 1418882192, 1535053665, 818091456, 1307808634, 606692563, 834694312}, Process.getGidForName("") + 39, objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            g(new int[]{1179328969, 203062753, -1171352731, 337330608, 315854486, -1403337769, 1751804158, 1542988614, 1262789232, -1050521189, -1171352731, 337330608, 599409777, -610341856, -220121483, -405708701}, 30 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                g(new int[]{1666053415, 1227703749, 800225532, 1508120767, 849306220, 1513696578, 448935880, -848248547, 1462699221, 1829760436, -1787870573, -1449087841, -693144566, 12250016, 1418882192, 1535053665, 818091456, 1307808634, 606692563, 834694312}, Color.alpha(0) + 38, objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                f("鲡讂눍\udaa6솺\ue87cჱ㼨♤仃甲鱲蓗댿\udbd8싒\ue97cᇲ㠩❫係瘱鵳藐갾퓗쏔\uea48ኬ㤞\u2063", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5980, objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    g(new int[]{1666053415, 1227703749, 800225532, 1508120767, 849306220, 1513696578, 448935880, -848248547, 1462699221, 1829760436, -1787870573, -1449087841, -693144566, 12250016, 1418882192, 1535053665, 818091456, 1307808634, 606692563, 834694312}, KeyEvent.getDeadChar(0, 0) + 38, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        f("鲃㠡헜犗ูꯪ䂈ᱷ맩嚘\uf24e迹⒛쁅鷠㫯홱珰ࢦꑁ䄃ẫ멈", TextUtils.lastIndexOf("", '0', 0) + 42158, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        g(new int[]{1522614031, -1436843414, -1608946664, 1097182484, 345030148, -1169062292, -2021601752, -1910502264, -139898735, -1033334568}, 17 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            f("鲃㠡헜犗ูꯪ䂈ᱷ맩嚘\uf24e迹⒛쁅鷠㫯홱珰ࢦꑁ䄃ẫ멈", TextUtils.indexOf((CharSequence) "", '0') + 42158, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            f("鲅༒뮼☍틗絨\ue9f7閐-겺彾쯤癳\ue216", (ViewConfiguration.getTapTimeout() >> 16) + 37781, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                g(new int[]{-1688040417, -2133901297, 1442119820, 135335632, 1765627401, -562598020, -1720637418, 804812599, 1981040979, 2017008652, -1608946664, 1097182484, 345030148, -1169062292, -2021601752, -1910502264, -139898735, -1033334568}, 33 - KeyEvent.keyCodeFromString(""), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                f("鲅楾睤絙䭧兜彟╌㍍㥆ܑിᬨ\ue128", TextUtils.lastIndexOf("", '0', 0) + 62970, objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                g(new int[]{-1688040417, -2133901297, 1442119820, 135335632, 1765627401, -562598020, -1720637418, 804812599, 1981040979, 2017008652, -1608946664, 1097182484, -293037333, 624748752, 764758614, -459541592}, (ViewConfiguration.getEdgeSlop() >> 16) + 30, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                f("鲑掖抿懛惷朇昹敛摯撔", TextUtils.lastIndexOf("", '0', 0) + 65310, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i8 = 0;
                                while (i8 < length) {
                                    Object obj = objArr19[i8];
                                    Object[] objArr20 = new Object[1];
                                    f("鲺ⵥﾅ蠩婿", 45481 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        int[] iArr = new int[i7];
                                        // fill-array-data instruction
                                        iArr[0] = 1666053415;
                                        iArr[1] = 1227703749;
                                        iArr[2] = -1673054941;
                                        iArr[3] = 1726473150;
                                        iArr[4] = 2139311319;
                                        iArr[5] = -2051477142;
                                        iArr[6] = 1100695787;
                                        iArr[7] = 501195738;
                                        iArr[8] = -1327415427;
                                        iArr[9] = -873134343;
                                        iArr[10] = 815519428;
                                        iArr[11] = 1836319605;
                                        iArr[12] = -2091114071;
                                        iArr[13] = -455302238;
                                        iArr[14] = 1531028659;
                                        iArr[15] = 14943536;
                                        iArr[16] = 685878529;
                                        iArr[17] = 1223540215;
                                        iArr[18] = 932982153;
                                        iArr[19] = -261204738;
                                        Object[] objArr22 = new Object[1];
                                        g(iArr, 37 - ExpandableListView.getPackedPositionGroup(0L), objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        g(new int[]{-2072137097, 141033494, -787408307, -1711305840, 1641170586, -941943376}, Color.blue(0) + 11, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            g(new int[]{-1688040417, -2133901297, 1442119820, 135335632, 1765627401, -562598020, -1720637418, 804812599, -1587246571, -4674688, 1842288420, 751443499, 1422061970, 1238179657}, 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            g(new int[]{-508530169, -1945251610, 994686652, -189328989, -1026541460, -606256864}, 11 - View.resolveSizeAndState(0, 0, 0), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                g(new int[]{1666053415, 1227703749, -1673054941, 1726473150, 2139311319, -2051477142, 1100695787, 501195738, -1327415427, -873134343, 815519428, 1836319605, -2091114071, -455302238, 1531028659, 14943536, 685878529, 1223540215, 932982153, -261204738}, 36 - MotionEvent.axisFromString(""), objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                f("鲅ꌪ\ue3d6⎀戤ꋢ\ue298ℼ應ꆒ\ue052\u20f9悗ꝍ\ue7fd➢晓ꛫ\ue6ad", 16302 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i9 = 0; i9 < 2; i9++) {
                                                    Object obj2 = objArr3[i9];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        f("鲈鰖鶾鴼麘鹸鿹颒頿馭饙髱驧魝钧鐼闀镳隶鞵靳郫逕釂酿鈝鎴錼賈豪跷躈踶農", KeyEvent.getDeadChar(0, 0) + 149, objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        f("鲅ὸ魨ᝌ鍫ཻ譲ݾ荹㽡뭌㜢댦⼡ꭀ❡ꍻ彣\udb6f坦퍾佨쭤", TextUtils.getTrimmedLength("") + 33791, objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i10 = f23598e * 1364570085;
                                                            f23598e = i10;
                                                            int i11 = (-1) - (((-1) - (~((-327566840) | i10))) & ((-1) - 277103030));
                                                            int i12 = ~i10;
                                                            int i13 = ~((-1) - (((-1) - 401044991) & ((-1) - i12)));
                                                            int i14 = 971301379 + (((i11 + i13) - (i11 & i13)) * 886);
                                                            int i15 = ~(i12 | 327566839);
                                                            int i16 = i3 + i14 + (((i15 + 350581182) - (i15 & 350581182)) * (-1772)) + ((~(i12 | 350581182)) * 886) + 16;
                                                            int i17 = i16 ^ (i16 << 13);
                                                            int i18 = i17 ^ (i17 >>> 17);
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
                                                i7 = 20;
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
        int i19 = 301822994 + ((~(((-8396834) + i2) - ((-8396834) & i2))) * 623) + (((-1) - (((-1) - (~i2)) & ((-1) - 118096916))) * (-623));
        int i20 = ~((-284223970) | i2);
        int i21 = (i20 + 8396833) - (i20 & 8396833);
        int i22 = ~(i2 | 393924052);
        int i23 = i3 + i19 + (((i22 + i21) - (i22 & i21)) * 623);
        int i24 = i23 ^ (i23 << 13);
        int i25 = i24 ^ (i24 >>> 17);
        return objArr32;
    }

    public static Rect d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23595b + 89;
        f23597d = i3 % 128;
        int i4 = i3 % 2;
        if (!f.a()) {
            return null;
        }
        Object[] objArr = new Object[1];
        f("鲡쭦㍚鬩쌥⯾鏟ﯔ⎸變\uf254婜舭\uea33刈뫨\ue2cb䪁늑\u1978䅱ꥦᄣ礕ꇿ\u09d3燰\ud9a4Ɯ桲큙㠪", View.MeasureSpec.makeMeasureSpec(0, 0) + 22501, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f("鲅슊₌蚄\ue4b8䫀꣄໖泸틔、队\uf41a娝렽Ṅ籅ꉭm晶얒⯓觑\uefe9䶔돈ᇄ瞝헽㯮餔！崭茽\ue12c䝀ꕒଣ椶켹⺬貒\uf2a1傹뚫ᓙ竑\ud8a1㻁鳺숋\u2000蘴\ue436䨕ꡇ๎汢퉢ほ鞏\uf598审맱ῦ緆ꏋǤ柴씏⬉褝", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24076, objArr2);
        f.d(strIntern, ((String) objArr2[0]).intern());
        int i5 = f23597d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23595b = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 1;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $11 + 23;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 732;
                        char gidForName = (char) (7932 - Process.getGidForName(""));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 11;
                        byte b2 = $$a[2];
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(iLastIndexOf, gidForName, tapTimeout, 355847088, false, $$c(b2, b3, (byte) (50 | b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i9] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() * (f23596c | 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        int tapTimeout2 = 836 - (ViewConfiguration.getTapTimeout() >> 16);
                        char packedPositionGroup = (char) (27279 - ExpandableListView.getPackedPositionGroup(0L));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 11;
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(tapTimeout2, packedPositionGroup, pressedStateDuration, -2145994442, false, $$c(b4, b5, (byte) (43 | b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    int i11 = 732 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    char cGreen = (char) (Color.green(0) + 7933);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 11;
                    byte b6 = $$a[2];
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(i11, cGreen, jumpTapTimeout, 355847088, false, $$c(b6, b7, (byte) ((b7 + 50) - (50 & b7))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f23596c ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 837;
                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27279);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 11;
                    byte b8 = $$a[2];
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a(iIndexOf, pressedStateDuration2, scrollBarSize, -2145994442, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 43)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = o.d.d.a(1452497747);
            if (objA5 == null) {
                int mode = View.MeasureSpec.getMode(0) + 836;
                char cArgb = (char) (27279 - Color.argb(0, 0, 0, 0));
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 12;
                byte b10 = $$a[2];
                byte b11 = (byte) (b10 + 1);
                objA5 = o.d.d.a(mode, cArgb, iLastIndexOf2, -2145994442, false, $$c(b10, b11, (byte) ((b11 + 43) - (43 & b11))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        char c2 = 2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23594a;
        int i4 = 989264422;
        if (iArr3 != null) {
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        int touchSlop = 12 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b2 = $$a[c2];
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(675 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), touchSlop, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    c2 = 2;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f23594a;
        int i8 = 16;
        if (iArr6 != null) {
            int i9 = $10 + 57;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    int iMyPid = 675 - (Process.myPid() >> 22);
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int scrollBarFadeDuration = 12 - (ViewConfiguration.getScrollBarFadeDuration() >> i8);
                    byte b4 = $$a[2];
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(iMyPid, cIndexOf, scrollBarFadeDuration, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i10++;
                i8 = 16;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        lVar.f19941d = 0;
        int i11 = $10 + 43;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 57;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    lVar.f19942e ^= iArr5[i13];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 301;
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 52697);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11;
                        byte b6 = $$a[2];
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(maximumFlingVelocity, scrollBarSize, minimumFlingVelocity, -1416256172, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i13 += 9;
                } else {
                    lVar.f19942e ^= iArr5[i13];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 301;
                        char c3 = (char) (52698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int iMyPid2 = 11 - (Process.myPid() >> 22);
                        byte b8 = $$a[2];
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(scrollBarSize2, c3, iMyPid2, -1416256172, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i13++;
                }
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 229;
                char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51003);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 9;
                byte[] bArr = $$a;
                byte b10 = bArr[2];
                objA5 = o.d.d.a(jumpTapTimeout, c4, iKeyCodeFromString, -330018025, false, $$c(b10, (byte) (b10 + 1), (byte) bArr.length), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str = new String(cArr2, 0, i2);
        int i19 = $10 + 25;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8};
        $$b = 41;
    }
}
