package o.bp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.a.i;
import o.dd.g;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f21515a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f21516f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f21517g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f21518h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f21519i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f21520j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21521k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21522l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21523m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char f21524n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21525o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f21526q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21530e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21528c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21527b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21529d = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r10, short r11, int r12) {
        /*
            byte[] r9 = o.bp.e.$$c
            int r0 = 122 - r10
            int r8 = r11 * 2
            int r2 = r8 + 1
            int r1 = r12 * 3
            int r7 = 3 - r1
            byte[] r6 = new byte[r2]
            r5 = 0
            if (r9 != 0) goto L2b
            r2 = r7
            r4 = r5
        L13:
            int r0 = -r0
            int r0 = r0 + r7
            r7 = r2
            r3 = r4
        L17:
            byte r1 = (byte) r0
            r6[r3] = r1
            int r2 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r1 = r9[r2]
            r7 = r0
            r0 = r1
            goto L13
        L2b:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.e.$$g(int, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f21523m = 0;
        f21526q = 1;
        f21522l = 0;
        f21525o = 1;
        c();
        ViewConfiguration.getScrollDefaultDelay();
        f21515a = new e();
        int i2 = f21526q + 65;
        f21523m = i2 % 128;
        int i3 = i2 % 2;
    }

    private e() {
    }

    public static e a() {
        int i2 = 2 % 2;
        int i3 = f21525o;
        int i4 = i3 + 13;
        f21522l = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        e eVar = f21515a;
        int i5 = i3 + 115;
        f21522l = i5 % 128;
        if (i5 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    private static void b(Context context, long j2, long j3) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21522l + 85;
        f21525o = i3 % 128;
        int i4 = i3 % 2;
        long j4 = j2 ^ (j3 << 32);
        try {
            Method method = f.class.getMethod("a", null);
            method.setAccessible(true);
            if (((Boolean) method.invoke(null, null)).booleanValue()) {
                int i5 = f21522l + 17;
                f21525o = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                r("䒯壝㋶㏅麞鉂穔壂䞚㐤뼱㢝딷娾\ue114ᶯ\udeb7ᕦ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(null);
                Object[] objArr2 = new Object[1];
                s((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "䞃ꟹ쌆셀쿯\u09ff\ue673\ued30璡멳錢굿ૐ돕ᯨ诈쒅\ue30b误ফ㴟嬎ﺗꃢ헺\ueaee놅敪艒琶鿖类þሎݳ翫糉", "\u0000\u0000\u0000\u0000", "諫땣䧁\uf31a", (-1045077110) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                Object[] objArr3 = {((String) objArr2[0]).intern()};
                Object[] objArr4 = new Object[1];
                s((char) (23297 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "핉\u2e71\ue1fa᳙䘂Ļ", "\u0000\u0000\u0000\u0000", "뙼ٓƽ偛", (-1) - Process.getGidForName(""), objArr4);
                Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(objNewInstance, objArr3);
                Object[] objArr5 = {Long.valueOf(j4)};
                Object[] objArr6 = new Object[1];
                s((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23296), "핉\u2e71\ue1fa᳙䘂Ļ", "\u0000\u0000\u0000\u0000", "뙼ٓƽ偛", TextUtils.indexOf("", "", 0), objArr6);
                Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                method3.setAccessible(true);
                Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                Object[] objArr7 = new Object[1];
                r("ও崊㐗졻\ueb44\ua8c8\uf778壊", 8 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
                Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                method4.setAccessible(true);
                Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                Method method5 = f.class.getMethod("c", String.class, Object.class);
                method5.setAccessible(true);
                method5.invoke(null, objArr8);
            }
            a().f21528c = (int) j4;
            if (a().f21529d) {
                return;
            }
            if (context == null) {
                int i7 = f21522l + 11;
                f21525o = i7 % 128;
                int i8 = i7 % 2;
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 + 1);
                Object[] objArr9 = new Object[1];
                t(b2, b3, (byte) (b3 - 1), objArr9);
                Method method6 = o.en.b.class.getMethod((String) objArr9[0], null);
                method6.setAccessible(true);
                Object objInvoke3 = method6.invoke(null, null);
                Object[] objArr10 = new Object[1];
                t(b2, (byte) (8 | b2), b2, objArr10);
                Method method7 = o.en.b.class.getMethod((String) objArr10[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(objInvoke3, null);
                int i9 = f21522l + 9;
                f21525o = i9 % 128;
                int i10 = i9 % 2;
                obj = objInvoke4;
            } else {
                obj = context;
            }
            if (obj != null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 + 1);
                Object[] objArr11 = new Object[1];
                t(b4, b5, (byte) (b5 - 1), objArr11);
                Method method8 = o.en.b.class.getMethod((String) objArr11[0], null);
                method8.setAccessible(true);
                Object objInvoke5 = method8.invoke(null, null);
                byte b6 = b4;
                Object[] objArr12 = new Object[1];
                t(b4, b6, b6, objArr12);
                Method method9 = o.en.b.class.getMethod((String) objArr12[0], null);
                method9.setAccessible(true);
                if (((Boolean) method9.invoke(objInvoke5, null)).booleanValue()) {
                    Object[] objArr13 = new Object[1];
                    t(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 9))), b4, objArr13);
                    Method method10 = o.en.b.class.getMethod((String) objArr13[0], null);
                    method10.setAccessible(true);
                    if (((Boolean) method10.invoke(objInvoke5, null)).booleanValue()) {
                        Method method11 = o.dc.d.class.getMethod("a", null);
                        method11.setAccessible(true);
                        Object objInvoke6 = method11.invoke(null, null);
                        Object[] objArr14 = {o.az.a.class.getField("b").get(null), g.class.getField("z").get(null)};
                        Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, g.class);
                        declaredConstructor2.setAccessible(true);
                        Object[] objArr15 = {obj, declaredConstructor2.newInstance(objArr14), true};
                        Method method12 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                        method12.setAccessible(true);
                        method12.invoke(objInvoke6, objArr15);
                        a().f21529d = true;
                        return;
                    }
                }
                Method method13 = f.class.getMethod("a", null);
                method13.setAccessible(true);
                if (((Boolean) method13.invoke(null, null)).booleanValue()) {
                    Object[] objArr16 = new Object[1];
                    r("䒯壝㋶㏅麞鉂穔壂䞚㐤뼱㢝딷娾\ue114ᶯ\udeb7ᕦ", Color.alpha(0) + 17, objArr16);
                    String strIntern2 = ((String) objArr16[0]).intern();
                    Object[] objArr17 = new Object[1];
                    s((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "㎧쩷䱴Ჶ\u008f畴扈\u0e6d\udd3b錋ᇪ陉뜿穰൝䄌㳀\b주ᦒᦵ拒궈\ue3fe\uf825⢗忥\ue359ᔺ둎饻薭鿃ꆃⶏ鮓㇆℺\udb63깈醾\u3130゠ꭚ缗⒜⸎\ue2e0诂剚캀뮸\udcb1佌짺ʰ绊ꗆ⧭ꦬ龱Ꚅ", "\u0000\u0000\u0000\u0000", "匃♽並\uf8f8", ViewConfiguration.getLongPressTimeout() >> 16, objArr17);
                    Object[] objArr18 = {strIntern2, ((String) objArr17[0]).intern()};
                    Method method14 = f.class.getMethod("c", String.class, Object.class);
                    method14.setAccessible(true);
                    method14.invoke(null, objArr18);
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

    static void c() {
        f21520j = (char) 9382;
        f21517g = (char) 28975;
        f21519i = (char) 39853;
        f21516f = (char) 22419;
        f21518h = 740602047300126166L;
        f21521k = -2053503784;
        f21524n = (char) 17878;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(android.content.Context r23, long r24, long r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.e.c(android.content.Context, long, long):void");
    }

    static void init$0() {
        $$a = new byte[]{91, 84, -6, Ascii.ETB};
        $$b = 60;
    }

    static void init$1() {
        $$d = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
        $$e = 176;
    }

    static void init$2() {
        $$c = new byte[]{108, -100, -109, 80};
        $$f = 239;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 4
            int r8 = r0 + 1
            byte[] r7 = o.bp.e.$$a
            int r1 = 98 - r11
            int r2 = r9 + 4
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2a
            r0 = r2
            r4 = r8
            r3 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L15:
            byte r0 = (byte) r1
            r6[r3] = r0
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L24:
            int r0 = r2 + 1
            r2 = r7[r0]
            r4 = r1
            goto L12
        L2a:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.e.p(int, int, byte, java.lang.Object[]):void");
    }

    private static void r(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 27;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else if (str2 != null) {
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i6 = $11 + 43;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = $10 + 117;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 58224;
            for (int i11 = 0; i11 < 16; i11++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i10) ^ ((c3 << 4) + ((char) (((long) f21519i) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f21516f)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 270, (char) KeyEvent.normalizeMetaState(0), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1995022631, false, $$g((byte) 53, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f21520j) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f21517g)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1995022631, false, $$g((byte) 53, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
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
                byte b4 = (byte) 0;
                objA3 = o.d.d.a(270 - Color.red(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - Process.getGidForName(""), -2074123590, false, $$g((byte) 50, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void s(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        char[] charArray;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10 + 125;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray2 = str6;
        if (str6 != null) {
            charArray2 = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray2;
        Object charArray3 = str5;
        if (str5 != null) {
            charArray3 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray3;
        int i6 = 57;
        Object obj = str4;
        if (str4 != null) {
            int i7 = $11 + 57;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 25 / 0;
                charArray = str4.toCharArray();
            } else {
                charArray = str4.toCharArray();
            }
            int i9 = $10 + 91;
            $11 = i9 % 128;
            obj = charArray;
            if (i9 % 2 == 0) {
                int i10 = 4 / 3;
                obj = charArray;
            }
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
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(106 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, -155898465, false, $$g((byte) i6, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(847 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (6488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, -694521287, false, $$g((byte) 54, b3, b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 458, (char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1804962841, false, $$g((byte) 56, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 639, (char) (65100 - Drawable.resolveOpacity(0, 0)), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1636969060, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f21518h ^ 740602047300126166L)) ^ ((long) ((int) (((long) f21521k) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f21524n) ^ 740602047300126166L))));
                iVar.f19932b++;
                i6 = 57;
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

    private static void t(byte b2, byte b3, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = (b3 * 2) + 97;
        int i3 = (b2 * 4) + 4;
        int i4 = s2 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i3];
                i3++;
                i2 += i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.e.a(android.content.Context):boolean");
    }
}
