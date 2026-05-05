package fr.antelop.sdk.authentication.prompt;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import kotlin.text.Typography;
import o.a.h;
import o.a.o;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class ScreenUnlockCustomerAuthenticationPromptBuilder extends CustomerAuthenticationPromptBuilder {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f18847a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f18848b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f18849c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f18850d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18851e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18852f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18853g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18854h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18855i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18856j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18857k = 0;
    private String subtitle;
    private String title;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, byte r10, byte r11) {
        /*
            int r0 = r11 * 2
            int r8 = 3 - r0
            int r7 = r10 * 3
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPromptBuilder.$$g
            int r0 = 111 - r9
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2b
            r1 = r7
            r2 = r8
            r3 = r4
        L14:
            int r0 = -r1
            int r8 = r8 + r0
            r0 = r8
            r8 = r2
        L18:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r5[r3] = r1
            if (r3 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r3 = r3 + 1
            r1 = r6[r2]
            r8 = r0
            goto L14
        L2b:
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPromptBuilder.$$j(int, byte, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f18857k = 1365488068;
        f18856j = 1025741138;
        f18853g = -216574157;
        init$0();
        f18855i = 0;
        f18854h = 1;
        f18851e = 0;
        f18852f = 1;
        d();
        f18850d = new char[]{64532};
        f18849c = (char) 51646;
        int i2 = f18855i + 57;
        f18854h = i2 % 128;
        int i3 = i2 % 2;
    }

    static void d() {
        f18848b = new char[]{38035, 16363, 49784, 38629, 14657, 52680, 36956, 9373, 53033, 37810, 9786, 51867, 40195, 8599, 62468, 40741, 9153, 63098, 39618, 11603, 61915, 33865, 10428, 38037, 16352, 49768, 38614, 14686, 52689, 36948, 9434, 53033, 37820, 9760, 51846, 40201, 8599, 62521, 40805, 9188, 63098, 38035, 16363, 49784, 38629, 14657, 52680, 36956, 9373, 53033, 37810, 9786, 51867, 40195, 8599, 62468, 40741, 9202, 63096, 39554, 11622, 61902, 33857, 10404, 62250, 34745, 10764, 65168, 33046, 21913, 63719, 33609, 22517, 64116, 36554, 4686, 47411, 17575, 4138, 49031, 2311, 41530, 24498, 2862, 42203, 20498, 3468, 47360, 21220, 3624, 48098, 22361, Typography.times, 48199, 27015, 693, 48701, 27565, 1795, 45210, 27651, 6538, 46448, 28405, 6757, 47001, 25420, 7366, 26160, 52570, 12418, 25667, 52219, 16243, 25341, 54884, 15773, 24844, 54406, 14387, 28595};
        f18847a = -8075067559956889723L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(android.content.Context r23, int r24, int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPromptBuilder.e(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{108, -115, 75, MessagePack.Code.EXT32};
        $$b = 173;
    }

    static void init$1() {
        $$g = new byte[]{34, -117, -98, -86};
        $$h = 185;
    }

    private static void l(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f18848b[i2 + i7])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a(TextUtils.indexOf("", "", 0, 0) + 742, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 12, 632508977, false, $$j((byte) 12, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f18847a), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(765 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (12469 - TextUtils.lastIndexOf("", '0', 0)), 12 - View.resolveSize(0, 0), 1946853218, false, $$j((byte) 11, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 387, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - TextUtils.indexOf("", "", 0), 39570797, false, $$j((byte) 6, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f18848b[i2 + i8])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = d.a(741 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, 632508977, false, $$j((byte) 12, b5, b5), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f18847a), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    byte b6 = (byte) 0;
                    objA5 = d.a(766 - (Process.myTid() >> 22), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12470), Gravity.getAbsoluteGravity(0, 0) + 12, 1946853218, false, $$j((byte) 11, b6, b6), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b7 = (byte) 0;
                    objA6 = d.a(387 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$j((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i9 = $10 + 7;
            $11 = i9 % 128;
            i4 = 2;
            if (i9 % 2 == 0) {
                int i10 = 2 % 5;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = d.a(-723636472);
            if (objA7 == null) {
                byte b8 = (byte) 0;
                objA7 = d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 388, (char) Color.green(0), 18 - TextUtils.getOffsetBefore("", 0), 39570797, false, $$j((byte) 6, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
            int i11 = $10 + 37;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(short r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPromptBuilder.$$a
            int r0 = r10 * 4
            int r7 = 3 - r0
            int r6 = 101 - r9
            int r5 = r11 * 2
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r8 != 0) goto L2a
            r0 = r5
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r7 = r7 + 1
            int r2 = r1 + 1
            if (r1 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r8[r7]
            goto L13
        L2a:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPromptBuilder.m(short, int, byte, java.lang.Object[]):void");
    }

    private static void n(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        h hVar = new h();
        char[] cArr2 = f18850d;
        long j2 = 0;
        int i7 = 421932776;
        int i8 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = d.a(i7);
                    if (objA == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 270;
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(j2) + 1);
                        int pressedStateDuration = 11 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i10 = $$h;
                        byte b3 = (byte) 0;
                        objA = d.a(keyRepeatDelay, packedPositionChild, pressedStateDuration, -811348851, false, $$j((byte) ((i10 + 15) - (i10 | 15)), b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    j2 = 0;
                    i7 = 421932776;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f18849c)};
        Object objA2 = d.a(421932776);
        if (objA2 == null) {
            byte b4 = (byte) 0;
            objA2 = d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 271, (char) KeyEvent.normalizeMetaState(0), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -811348851, false, $$j((byte) ($$h & 15), b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i11 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i8];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = d.a(825 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.indexOf("", ""), ImageFormat.getBitsPerPixel(0) + 12, -611683395, false, $$j(b5, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i13 = $10 + 1;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            byte b7 = (byte) 2;
                            byte b8 = (byte) (b7 - 2);
                            objA4 = d.a(217 - TextUtils.lastIndexOf("", '0'), (char) Color.red(0), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 212688716, false, $$j(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        int i16 = $11 + 113;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i18 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i18];
                        cArr4[hVar.f19926b + 1] = cArr2[i19];
                    } else {
                        int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i20];
                        i8 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i21];
                    }
                    i8 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i22 = 0; i22 < i2; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder
    public final /* synthetic */ CustomerAuthenticationPrompt build() {
        int i2 = 2 % 2;
        int i3 = f18851e + 97;
        f18852f = i3 % 128;
        if (i3 % 2 == 0) {
            build();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenUnlockCustomerAuthenticationPrompt screenUnlockCustomerAuthenticationPromptBuild = build();
        int i4 = f18851e + 67;
        f18852f = i4 % 128;
        int i5 = i4 % 2;
        return screenUnlockCustomerAuthenticationPromptBuild;
    }

    @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder
    public final ScreenUnlockCustomerAuthenticationPrompt build() {
        int i2 = 2 % 2;
        ScreenUnlockCustomerAuthenticationPrompt screenUnlockCustomerAuthenticationPrompt = new ScreenUnlockCustomerAuthenticationPrompt(this.title, this.subtitle);
        int i3 = f18852f + 5;
        f18851e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return screenUnlockCustomerAuthenticationPrompt;
    }

    public final ScreenUnlockCustomerAuthenticationPromptBuilder setSubtitle(String str) {
        int i2 = 2 % 2;
        int i3 = f18851e + 123;
        int i4 = i3 % 128;
        f18852f = i4;
        int i5 = i3 % 2;
        this.subtitle = str;
        int i6 = i4 + 19;
        f18851e = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final ScreenUnlockCustomerAuthenticationPromptBuilder setTitle(String str) {
        int i2 = 2 % 2;
        int i3 = f18851e;
        int i4 = i3 + 97;
        f18852f = i4 % 128;
        if (i4 % 2 == 0) {
            this.title = str;
            int i5 = 98 / 0;
        } else {
            this.title = str;
        }
        int i6 = i3 + 83;
        f18852f = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }
}
