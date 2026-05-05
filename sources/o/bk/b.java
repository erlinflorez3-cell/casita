package o.bk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.EntrustSdkConfigurationException;
import fr.antelop.sdk.exception.EntrustSdkErrorCode;
import java.lang.reflect.Method;
import o.a.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21299a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21300b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21301c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21302d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f21303e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21304f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static short[] f21305g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21306h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21307i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21308j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, byte r10, byte r11) {
        /*
            int r8 = r10 + 103
            int r0 = r11 * 3
            int r7 = 1 - r0
            byte[] r6 = o.bk.b.$$a
            int r0 = r9 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2b
            r2 = r3
            r1 = r5
        L13:
            int r5 = r5 + r8
            int r0 = r1 + 1
            r1 = r2
            r8 = r5
            r5 = r0
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r6[r5]
            r1 = r5
            r5 = r0
            goto L13
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bk.b.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21306h = 0;
        f21307i = 1;
        f21304f = 0;
        f21308j = 1;
        c();
        ViewConfiguration.getPressedStateDuration();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getLongPressTimeout();
        f21300b = true;
        int i2 = f21306h + 107;
        f21307i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void a() throws Throwable {
        int i2 = 2 % 2;
        EntrustSdkErrorCode entrustSdkErrorCode = EntrustSdkErrorCode.NotSuitableForProduction;
        Object[] objArr = new Object[1];
        k((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-964200300) - View.MeasureSpec.getMode(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 2034248427, (-23) - TextUtils.getOffsetBefore("", 0), (byte) (122 - TextUtils.indexOf((CharSequence) "", '0')), objArr);
        throw new EntrustSdkConfigurationException(entrustSdkErrorCode, ((String) objArr[0]).intern());
    }

    static void c() {
        f21302d = 2112522977;
        f21301c = 1150422427;
        f21299a = 1037182624;
        f21303e = new byte[]{-110, 60, Ascii.SO, -11, 2, -27, -76, 67, -15, 7, -91, 91, -4, -9, 2, -94, 68, 9, -71, 68, 9, -16, 3, -16, -1, Ascii.EM, -25, 5, MessagePack.Code.FIXEXT1, 42, -13, -15, 3, -13, -1, -10, 5, -7, 6, -91, 77, Ascii.SI, -4, -9, Ascii.CAN, -4, -13, -78, 90, -69, 79, -5, -24, -116, MessagePack.Code.ARRAY32, 36, MessagePack.Code.FIXEXT8, 49, MessagePack.Code.UINT16, MessagePack.Code.MAP32, 44, MessagePack.Code.ARRAY16, 33, MessagePack.Code.STR16, MessagePack.Code.ARRAY32, Ascii.SO, -6, 37, 51, -3, 35, MessagePack.Code.ARRAY16, 33, MessagePack.Code.ARRAY16, 36, Ascii.VT};
    }

    public static boolean e() {
        int i2 = 2 % 2;
        int i3 = f21304f + 103;
        int i4 = i3 % 128;
        f21308j = i4;
        int i5 = i3 % 2;
        boolean z2 = f21300b;
        int i6 = i4 + 11;
        f21304f = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 36;
    }

    private static void k(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f21301c)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                objA = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 238, (char) (View.combineMeasuredStates(0, 0) + 44531), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 35969549, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 123;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 41;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                z2 = true;
            } else {
                int i13 = $11 + 51;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                z2 = false;
            }
            if (z2) {
                byte[] bArr = f21303e;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        int i16 = $10 + 31;
                        $11 = i16 % 128;
                        int i17 = i16 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(676 - AndroidCharacter.getMirror(c2), (char) (28649 - Color.green(0)), TextUtils.indexOf("", "", 0) + 11, 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i15] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i15++;
                        i6 = 2;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f21303e;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f21302d)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objA3 = o.d.d.a(238 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (44530 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getTrimmedLength("") + 11, 35969549, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21301c) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f21305g[i2 + ((int) (((long) f21302d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21301c) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                int i18 = ((i2 + iIntValue) - 2) + ((int) (((long) f21302d) ^ (-7649639543924978291L)));
                if (z2) {
                    int i19 = $10 + 59;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jVar.f19936d = i18 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21299a), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0), (char) (5357 - MotionEvent.axisFromString("")), Color.red(0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f21303e;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i21 = 0; i21 < length2; i21++) {
                        bArr5[i21] = (byte) (((long) bArr4[i21]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z3 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f21303e;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f21305g;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
