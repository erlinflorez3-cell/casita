package o.m;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements o.ea.d<CustomerAuthenticationMethodType>, o.en.a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f26493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f26494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f26495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f26496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f26497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ i[] f26498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f26499g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f26500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26501j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f26502k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26503l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26504m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26505n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int[] f26506o = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f26507r = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f26508h;

    /* JADX INFO: renamed from: o.m.i$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26509b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f26510c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f26511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f26512e;

        static {
            int[] iArr = new int[CustomerAuthenticationMethodType.values().length];
            f26512e = iArr;
            try {
                iArr[CustomerAuthenticationMethodType.Pin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26512e[CustomerAuthenticationMethodType.DeviceBiometric.ordinal()] = 2;
                int i2 = f26509b;
                int i3 = (((i2 + 61) - (61 & i2)) << 1) - (i2 ^ 61);
                f26510c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26512e[CustomerAuthenticationMethodType.ScreenUnlock.ordinal()] = 3;
                int i6 = f26510c;
                int i7 = ((i6 + 73) - (73 | i6)) + ((i6 + 73) - (i6 & 73));
                f26509b = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26512e[CustomerAuthenticationMethodType.Consent.ordinal()] = 4;
                int i9 = f26510c + 73;
                f26509b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26512e[CustomerAuthenticationMethodType.None.ordinal()] = 5;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[i.values().length];
            f26511d = iArr2;
            try {
                iArr2[i.f26495c.ordinal()] = 1;
                int i12 = ~Thread.activeCount();
                int i13 = ((-1) - (((-1) - ((-1) - (((-1) - (-271161349)) | ((-1) - i12)))) & ((-1) - ((-271161349) ^ i12)))) * 494;
                int i14 = ((-1) - (((-1) - 1780584887) | ((-1) - i13))) + ((i13 + 1780584887) - (i13 & 1780584887));
                int i15 = ~((-1) - (((-1) - ((i12 - 942660743) - (i12 | (-942660743)))) & ((-1) - (i12 ^ (-942660743)))));
                int i16 = (-1) - (((-1) - ((-1) - (((-1) - i15) | ((-1) - (-947904200))))) & ((-1) - ((-947904200) ^ i15)));
                int i17 = ((-1) - (((-1) - ((-1) - (((-1) - i16) | ((-1) - 671499394)))) & ((-1) - (i16 ^ 671499394)))) * 494;
                int i18 = ((-1) - (((-1) - i14) | ((-1) - i17))) + (i17 | i14);
                int priority = Thread.currentThread().getPriority();
                int i19 = ~priority;
                int i20 = ~(((-1) - (((-1) - i19) | ((-1) - (-817124031)))) | ((-817124031) ^ i19));
                int i21 = ~priority;
                int i22 = (-1) - (((-1) - ((-1) - (((-1) - ((i20 + 268697728) - (i20 | 268697728))) & ((-1) - (268697728 ^ i20))))) & ((-1) - (~(((-1430555073) ^ i21) | (((-1430555073) + i21) - ((-1430555073) | i21))))));
                int i23 = 1978981374 ^ priority;
                int i24 = (1978981374 + priority) - (1978981374 | priority);
                int i25 = ~((i24 + i23) - (i24 & i23));
                int i26 = i22 ^ i25;
                int i27 = i22 & i25;
                int i28 = 2074162645 - (~(-(-(((i27 + i26) - (i27 & i26)) * (-84)))));
                int i29 = ~((-1) - (((-1) - ((-1) - (((-1) - priority) | ((-1) - (-1430555073))))) & ((-1) - ((-1430555073) ^ priority))));
                int i30 = 817124030 ^ i29;
                int i31 = (i29 + 817124030) - (i29 | 817124030);
                int i32 = (i31 + i30) - (i31 & i30);
                int i33 = i21 ^ 1430555072;
                int i34 = (1430555072 + i21) - (1430555072 | i21);
                int i35 = ~((i34 + i33) - (i34 & i33));
                int i36 = i32 ^ i35;
                int i37 = (-1) - (((-1) - i32) | ((-1) - i35));
                int i38 = ((i37 + i36) - (i37 & i36)) * (-84);
                if (i18 > ((((i28 + i38) - (i28 | i38)) + (i38 | i28)) - (~(-(-(((-1978981375) | i35) * 84))))) - 1) {
                    int i39 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26511d[i.f26496d.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26511d[i.f26494b.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26511d[i.f26493a.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26511d[i.f26497e.ordinal()] = 5;
                int i40 = f26510c;
                int i41 = ((i40 + 117) - (117 | i40)) + (i40 | 117);
                f26509b = i41 % 128;
                int i42 = i41 % 2;
                int i43 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26511d[i.f26500i.ordinal()] = 6;
                int i44 = f26510c;
                int i45 = (i44 ^ 75) + ((i44 & 75) << 1);
                f26509b = i45 % 128;
                int i46 = i45 % 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, short r11) {
        /*
            byte[] r8 = o.m.i.$$a
            int r7 = r11 + 65
            int r1 = r9 * 3
            int r0 = 1 - r1
            int r6 = r10 + 4
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2a
            r7 = r3
            r0 = r6
            r1 = r4
        L14:
            int r6 = r6 + r7
            r2 = r1
            r7 = r6
            r6 = r0
        L18:
            int r0 = r6 + 1
            byte r1 = (byte) r7
            r5[r2] = r1
            int r1 = r2 + 1
            if (r2 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r6 = r8[r0]
            goto L14
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.i.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26505n = 0;
        f26507r = 1;
        f26503l = 0;
        f26504m = 1;
        b();
        Object[] objArr = new Object[1];
        q(new int[]{-1787501037, 1875780976, -1806985943, -171312244}, ExpandableListView.getPackedPositionType(0L) + 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        p((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "ઙ戾壏휂ᝠ\ude37ᙨ뉏♅", "\uf67d먇ၲ쏉", "㉢\uf7aaһ\uef99", KeyEvent.getDeadChar(0, 0) - 1141396942, objArr2);
        f26495c = new i(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        p((char) View.getDefaultSize(0, 0), "\uf690⋫뱻〆〺毴楇┌꽿", "\uf67d먇ၲ쏉", "兿찲\ue575ꇃ", 1976316497 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        p((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\ue1e8䖒\udc9b펇䠬㬒\ue797ꖬყ著", "\uf67d먇ၲ쏉", "\ue0d1蘃ﰻ㫢", Color.red(0), objArr4);
        f26496d = new i(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        p((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44814), "꾏g빗ߙ\u2b74\ud8e9쾁ꗢጆ뉒ⵕ❁Ė糛屡", "\uf67d먇ၲ쏉", "돟镛๘꾯", (ViewConfiguration.getTouchSlop() >> 8) + 1486183347, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        p((char) (Color.argb(0, 0, 0, 0) + 16010), "ꍌ\uf786죦\ude79ᣠ珂䏐ᤁ\uda19뻠\uf608꘢铡ﴕ兰ၢ", "\uf67d먇ၲ쏉", "㣗崞詮ؾ", TextUtils.indexOf("", "", 0, 0), objArr6);
        f26494b = new i(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        p((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "㧽䱜蓧瓅\uda0c\ud9dc礀䕤瓔醻ሦ衑", "\uf67d먇ၲ쏉", "გ擌怜澼", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        q(new int[]{419626862, -1691418673, -916202794, 1447400495, 1170936627, -999264831, -1206375072, -1094115411}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr8);
        f26493a = new i(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        p((char) Color.argb(0, 0, 0, 0), "諑鎾赻蒇䞯鞸笧", "\uf67d먇ၲ쏉", "ᮦ㗅땡雕", 1630913819 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        q(new int[]{255920312, 1102093407, 1976336, -1652805095}, AndroidCharacter.getMirror('0') - ')', objArr10);
        f26497e = new i(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        p((char) (12451 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "贴陳ᩮ썑", "\uf67d먇ၲ쏉", "熷ﻙꏵ估", View.combineMeasuredStates(0, 0), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        p((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15537), "泌훏⭨㯕", "\uf67d먇ၲ쏉", "\udc4f豈닎舼", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr12);
        f26500i = new i(strIntern6, 5, ((String) objArr12[0]).intern());
        f26498f = c();
        int i2 = f26505n + 123;
        f26507r = i2 % 128;
        int i3 = i2 % 2;
    }

    private i(String str, int i2, String str2) {
        this.f26508h = str2;
    }

    public static i b(CustomerAuthenticationMethodType customerAuthenticationMethodType) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AnonymousClass2.f26512e[customerAuthenticationMethodType.ordinal()];
        if (i3 == 1) {
            return c.d().g();
        }
        if (i3 == 2) {
            return f26494b;
        }
        if (i3 == 3) {
            i iVar = f26493a;
            int i4 = f26504m + 83;
            f26503l = i4 % 128;
            int i5 = i4 % 2;
            return iVar;
        }
        if (i3 == 4) {
            return f26497e;
        }
        if (i3 != 5) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            p((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 40953), "\uf5ec万⦸櫜ኍ㉝燌뚰Ⳉ\ud8c6꡷ɇ昴츝≜뤲嗮쿌", "\uf67d먇ၲ쏉", "꺚껅磻ڟ", KeyEvent.normalizeMetaState(0), objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(customerAuthenticationMethodType.name()).toString());
        }
        i iVar2 = f26500i;
        int i6 = f26503l + 65;
        f26504m = i6 % 128;
        if (i6 % 2 != 0) {
            return iVar2;
        }
        throw null;
    }

    public static i b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26504m + 11;
        f26503l = i3 % 128;
        int i4 = i3 % 2;
        for (i iVar : values()) {
            int i5 = f26504m + 57;
            f26503l = i5 % 128;
            int i6 = i5 % 2;
            if (iVar.f26508h.equalsIgnoreCase(str)) {
                return iVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        q(new int[]{110853117, 1021919606, 356094134, -17752591, 735444842, 488678348, -1229303596, -664625524, -60941275, -604870345, 832494160, 378739779, 570429498, 1362469470, -929956639, -50190843, -1636503272, 2133337120, 149754989, -465639404, -606254294, -373741341, 1367822786, -1289338054, -699452891, -1244462245}, 52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void b() {
        f26499g = -3923139049748450389L;
        f26501j = 1564493270;
        f26502k = (char) 17878;
        f26506o = new int[]{1805190471, 430308983, -1465571895, -904801409, 1104365964, 422972084, -513297408, -2074095530, 958966207, -937820489, 1773021582, 533786263, -2067361495, -231178738, 1007489511, 1475220611, 760940219, 172933327};
    }

    private static /* synthetic */ i[] c() {
        i[] iVarArr;
        int i2 = 2 % 2;
        int i3 = f26503l;
        int i4 = i3 + 23;
        f26504m = i4 % 128;
        if (i4 % 2 == 0) {
            iVarArr = new i[46];
            iVarArr[1] = f26495c;
            iVarArr[0] = f26496d;
            iVarArr[5] = f26494b;
            iVarArr[4] = f26493a;
            iVarArr[4] = f26497e;
            iVarArr[5] = f26500i;
        } else {
            iVarArr = new i[]{f26495c, f26496d, f26494b, f26493a, f26497e, f26500i};
        }
        int i5 = i3 + 39;
        f26504m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return iVarArr;
    }

    static void init$0() {
        $$a = new byte[]{88, 0, 126, -69};
        $$b = 3;
    }

    private static void p(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object obj = str6;
        if (str6 != null) {
            char[] charArray = str6.toCharArray();
            int i5 = $11 + 75;
            $10 = i5 % 128;
            obj = charArray;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
                obj = charArray;
            }
        }
        char[] cArr = (char[]) obj;
        Object obj2 = null;
        Object charArray2 = str5;
        if (str5 != null) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str5.toCharArray();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i8 = $10 + 63;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i10 = $11 + 33;
            $10 = i10 % 128;
            int i11 = i10 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int minimumFlingVelocity = 106 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11;
                    byte b2 = $$a[1];
                    byte b3 = b2;
                    objA = o.d.d.a(minimumFlingVelocity, threadPriority, doubleTapTimeout, -155898465, false, $$c(b3, (byte) (b3 - 1), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj2, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 847;
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6488);
                    int iAlpha = Color.alpha(0) + 12;
                    byte b4 = $$a[1];
                    objA2 = o.d.d.a(pressedStateDuration, keyRepeatDelay, iAlpha, -694521287, false, $$c(b4, (byte) (b4 - 1), (byte) $$b), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int iBlue = 458 - Color.blue(0);
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int touchSlop = 11 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b5 = $$a[1];
                    byte b6 = (byte) (b5 - 1);
                    objA3 = o.d.d.a(iBlue, windowTouchSlop, touchSlop, 1804962841, false, $$c(b5, b6, (byte) (-b6)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iBlue2 = Color.blue(0) + 639;
                    char modifierMetaStateMask = (char) (65099 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int scrollBarSize = 12 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b7 = $$a[1];
                    byte b8 = (byte) (b7 - 1);
                    objA4 = o.d.d.a(iBlue2, modifierMetaStateMask, scrollBarSize, 1636969060, false, $$c(b7, b8, (byte) ((b8 + 57) - (57 | b8))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj2 = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f26501j) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r10[iVar.f19932b])) ^ (f26499g ^ 740602047300126166L))) ^ ((long) ((char) (((long) f26502k) ^ 740602047300126166L))));
                iVar.f19932b++;
                i3 = 2;
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

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int length2;
        int[] iArr3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = f26506o;
        int i7 = 989264422;
        long j2 = 0;
        int i8 = 0;
        if (iArr4 != null) {
            int i9 = $11 + 67;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i4 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i4 = 0;
            }
            while (i4 < length2) {
                int i10 = $11 + 17;
                $10 = i10 % 128;
                int i11 = i10 % i5;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i4])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        int i12 = 674 - (ExpandableListView.getPackedPositionForChild(i8, i8) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(i8, i8) == j2 ? 0 : -1));
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i8, i8) + 1);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR;
                        byte b2 = $$a[1];
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(i12, cIndexOf, modifierMetaStateMask, -328001469, false, $$c(b2, b3, (byte) ((b3 + 56) - (b3 | 56))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i4++;
                    i5 = 2;
                    i7 = 989264422;
                    j2 = 0;
                    i8 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f26506o;
        if (iArr6 != null) {
            int i13 = $10 + 113;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i14 = $10 + 87;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i3])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int iRed = 675 - Color.red(0);
                        char cIndexOf2 = (char) TextUtils.indexOf("", "");
                        int iAlpha = Color.alpha(0) + 12;
                        byte b4 = $$a[1];
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(iRed, cIndexOf2, iAlpha, -328001469, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 56)))), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i3 = 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i3])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 676;
                        char cRed = (char) Color.red(0);
                        int packedPositionChild = 11 - ExpandableListView.getPackedPositionChild(0L);
                        byte b6 = $$a[1];
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(iIndexOf, cRed, packedPositionChild, -328001469, false, $$c(b6, b7, (byte) (56 & b7)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i3++;
                }
            }
            int i15 = $10 + 13;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        lVar.f19941d = 0;
        int i17 = $11 + 25;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr5);
            for (int i19 = 0; i19 < 16; i19++) {
                int i20 = $10 + 121;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                lVar.f19942e ^= iArr5[i19];
                Object[] objArr5 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 301;
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 52696);
                    int iIndexOf2 = 10 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b8 = $$a[1];
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(packedPositionGroup, c2, iIndexOf2, -1416256172, false, $$c(b8, b9, (byte) ((b9 + 54) - (54 | b9))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i22 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i22;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i23 = lVar.f19942e;
            int i24 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                int iRgb = Color.rgb(0, 0, 0) + 16777445;
                char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 51004);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 9;
                byte b10 = $$a[1];
                byte b11 = (byte) (b10 - 1);
                objA5 = o.d.d.a(iRgb, packedPositionGroup2, deadChar, -330018025, false, $$c(b10, b11, (byte) (52 & b11)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static i valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26504m + 125;
        f26503l = i3 % 128;
        int i4 = i3 % 2;
        i iVar = (i) Enum.valueOf(i.class, str);
        if (i4 == 0) {
            return iVar;
        }
        throw null;
    }

    public static i[] values() {
        int i2 = 2 % 2;
        int i3 = f26504m + 31;
        f26503l = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i[] iVarArr = (i[]) f26498f.clone();
        int i4 = f26503l + 51;
        f26504m = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return iVarArr;
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f26503l + 89;
        f26504m = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26508h;
        }
        throw null;
    }

    public final CustomerAuthenticationMethodType d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26503l + 81;
        f26504m = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = AnonymousClass2.f26511d[ordinal()];
            throw null;
        }
        switch (AnonymousClass2.f26511d[ordinal()]) {
            case 1:
            case 2:
                return CustomerAuthenticationMethodType.Pin;
            case 3:
                return CustomerAuthenticationMethodType.DeviceBiometric;
            case 4:
                return CustomerAuthenticationMethodType.ScreenUnlock;
            case 5:
                CustomerAuthenticationMethodType customerAuthenticationMethodType = CustomerAuthenticationMethodType.Consent;
                int i5 = f26503l + 59;
                f26504m = i5 % 128;
                int i6 = i5 % 2;
                return customerAuthenticationMethodType;
            case 6:
                return CustomerAuthenticationMethodType.None;
            default:
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                p((char) (40953 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\uf5ec万⦸櫜ኍ㉝燌뚰Ⳉ\ud8c6꡷ɇ昴츝≜뤲嗮쿌", "\uf67d먇ၲ쏉", "꺚껅磻ڟ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26503l + 47;
        f26504m = i3 % 128;
        if (i3 % 2 != 0) {
            return d();
        }
        d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26504m + 81;
        int i4 = i3 % 128;
        f26503l = i4;
        int i5 = i3 % 2;
        String str = this.f26508h;
        int i6 = i4 + 61;
        f26504m = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
