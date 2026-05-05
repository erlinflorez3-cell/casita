package o.m;

import android.content.Context;
import android.graphics.Color;
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
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPrompt;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.q;
import o.n.d;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class m extends h {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$o = null;
    private static final int $$p = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int C = 0;

    /* JADX INFO: renamed from: d */
    private static int f26536d = 0;

    /* JADX INFO: renamed from: e */
    private static int f26537e = 0;

    /* JADX INFO: renamed from: f */
    private static int f26538f = 0;

    /* JADX INFO: renamed from: j */
    private static byte[] f26539j = null;

    /* JADX INFO: renamed from: m */
    public static int f26540m = 0;

    /* JADX INFO: renamed from: o */
    public static int f26541o = 0;

    /* JADX INFO: renamed from: p */
    private static short[] f26542p = null;

    /* JADX INFO: renamed from: q */
    private static int f26543q = 0;

    /* JADX INFO: renamed from: r */
    private static int f26544r = 0;

    /* JADX INFO: renamed from: s */
    private static int f26545s = 0;

    /* JADX INFO: renamed from: t */
    private static long f26546t = 0;

    /* JADX INFO: renamed from: y */
    private static int f26547y = 0;

    /* JADX INFO: renamed from: a */
    private short f26548a;

    /* JADX INFO: renamed from: b */
    private boolean f26549b;

    /* JADX INFO: renamed from: c */
    private short f26550c;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$q(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 71
            int r2 = r8 * 4
            int r1 = 1 - r2
            int r0 = r6 * 4
            int r6 = r0 + 4
            byte[] r5 = o.m.m.$$o
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r5 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r6 = r6 + 1
            int r0 = -r0
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.m.$$q(short, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        C = -84491392;
        init$0();
        f26541o = -215308227;
        f26540m = -1697375230;
        f26543q = 0;
        f26547y = 1;
        f26544r = 0;
        f26545s = 1;
        t();
        Process.getGidForName("");
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getTapTimeout();
        SystemClock.currentThreadTimeMillis();
        KeyEvent.keyCodeFromString("");
        int i2 = f26543q + 101;
        f26547y = i2 % 128;
        int i3 = i2 % 2;
    }

    public m(i iVar) {
        super(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void I(short r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r8 = 98 - r8
            int r0 = r9 + 4
            byte[] r7 = o.m.m.$$d
            int r6 = r10 * 3
            int r1 = r6 + 1
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2a
            r1 = r0
            r8 = r6
            r3 = r4
        L12:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L16:
            int r1 = r0 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L27:
            r0 = r7[r1]
            goto L12
        L2a:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.m.I(short, short, short, java.lang.Object[]):void");
    }

    private static void J(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        long j2;
        int i6;
        int i7 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f26537e)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                objA = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 238, (char) (KeyEvent.keyCodeFromString("") + 44531), 11 - View.resolveSize(0, 0), 35969549, false, $$q(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 33))), b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i5 = 1;
            } else {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i5 = 0;
            }
            long j3 = 0;
            if (i5 == 0) {
                j2 = -7649639543924978291L;
            } else {
                byte[] bArr = f26539j;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(628 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 28650), 11 - ExpandableListView.getPackedPositionGroup(j3), 1621469864, false, $$q(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 32))), b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i10++;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $10 + 33;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        byte[] bArr3 = f26539j;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f26536d)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            objA3 = o.d.d.a(238 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 44531), 11 - (ViewConfiguration.getTouchSlop() >> 8), 35969549, false, $$q(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 33))), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        byte b6 = (byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L));
                        long j4 = f26537e;
                        i6 = b6 >>> ((int) ((j4 - 7649639543924978291L) - (j4 | (-7649639543924978291L))));
                    } else {
                        byte[] bArr4 = f26539j;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f26536d)};
                        Object objA4 = o.d.d.a(-727631768);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            objA4 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 238, (char) (Drawable.resolveOpacity(0, 0) + 44531), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, 35969549, false, $$q(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 33))), b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f26537e) ^ (-7649639543924978291L)));
                    }
                    iIntValue = (byte) i6;
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f26542p[i2 + ((int) (((long) f26536d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f26537e) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f26536d) ^ j2)) + i5;
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f26538f), sb};
                Object objA5 = o.d.d.a(1819197256);
                if (objA5 == null) {
                    objA5 = o.d.d.a(View.getDefaultSize(0, 0), (char) (5358 - (KeyEvent.getMaxKeyCode() >> 16)), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f26539j;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i12 = $10 + 39;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr6[i14] = (byte) (((long) bArr5[i14]) ^ (-7649639543924978291L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    int i15 = $10 + 7;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    if (!z2) {
                        short[] sArr = f26542p;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        byte[] bArr7 = f26539j;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

    private static void K(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 23;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i4 + 81;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 25 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = $11 + 33;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(731 - (Process.myTid() >> 22), (char) (7933 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), AndroidCharacter.getMirror('0') - '%', 355847088, false, $$q(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i11] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f26546t ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a(836 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27279), (KeyEvent.getMaxKeyCode() >> 16) + 11, -2145994442, false, $$q(b4, (byte) ((b4 + 7) - (7 & b4)), b4), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b5 = (byte) 0;
                objA3 = o.d.d.a(835 - Process.getGidForName(""), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27279), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2145994442, false, $$q(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 7))), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void L(short r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 11
            int r8 = 111 - r0
            int r0 = r9 * 5
            int r7 = 9 - r0
            int r0 = r10 * 5
            int r6 = 6 - r0
            byte[] r5 = o.m.m.$$j
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2e
            r0 = r8
            r2 = r3
            r8 = r6
        L16:
            int r8 = r8 + r0
            int r7 = r7 + 1
            int r8 = r8 + (-6)
            r1 = r2
        L1c:
            byte r0 = (byte) r8
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r6) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2b:
            r0 = r5[r7]
            goto L16
        L2e:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.m.L(short, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i6;
        int i9 = ~i7;
        int i10 = (~((-1) - (((-1) - i8) & ((-1) - i9)))) | (~((-1) - (((-1) - i9) & ((-1) - i3))));
        int i11 = ~i3;
        int i12 = (-1) - (((-1) - i10) & ((-1) - (~((-1) - (((-1) - (i11 | i6)) & ((-1) - i7))))));
        int i13 = (i6 + i7) - (i6 & i7);
        int i14 = (i11 + i13) - (i11 & i13);
        int i15 = (~((i3 + i6) - (i3 & i6))) | (~i13);
        int i16 = i6 + i7 + i5 + (1068639271 * i4) + ((-1919980423) * i2);
        int i17 = i16 * i16;
        int i18 = ((i6 * 1648758371) - 594280448) + (1648758371 * i7) + (i12 * (-226102882)) + ((-226102882) * i14) + (226102882 * i15) + (1422655488 * i5) + ((-1693188096) * i4) + (611057664 * i2) + ((-810221568) * i17);
        int i19 = (i6 * 982247175) + 1844138806 + (i7 * 982247175) + (i12 * (-762)) + (i14 * (-762)) + (i15 * 762) + (i5 * 982246413) + (i4 * 1533776379) + (i2 * 1016546853) + (i17 * (-1070530560));
        return i18 + ((i19 * i19) * 1708326912) != 1 ? a(objArr) : b(objArr);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        m mVar = (m) objArr[0];
        short sShortValue = ((Short) objArr[1]).shortValue();
        int i2 = 2 % 2;
        int i3 = f26545s;
        int i4 = i3 + 1;
        f26544r = i4 % 128;
        int i5 = i4 % 2;
        mVar.f26548a = sShortValue;
        int i6 = i3 + 27;
        f26544r = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        m mVar = (m) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f26545s + 51;
        f26544r = i3 % 128;
        if (i3 % 2 == 0) {
            mVar.f26549b = zBooleanValue;
            return null;
        }
        mVar.f26549b = zBooleanValue;
        throw null;
    }

    public static /* synthetic */ String b(PinCustomerAuthenticationPrompt pinCustomerAuthenticationPrompt, int i2) {
        int i3 = 2 % 2;
        int i4 = f26545s + 47;
        f26544r = i4 % 128;
        int i5 = i4 % 2;
        String message = pinCustomerAuthenticationPrompt.getInvalidPinMessageProvider().getMessage(i2);
        int i6 = f26544r + 45;
        f26545s = i6 % 128;
        int i7 = i6 % 2;
        return message;
    }

    static void init$0() {
        $$d = new byte[]{60, -17, 3, Ascii.NAK};
        $$e = 66;
    }

    static void init$1() {
        $$j = new byte[]{106, -29, 108, MessagePack.Code.MAP32, MessagePack.Code.BIN16, Base64.padSymbol, Ascii.DC2, MessagePack.Code.TRUE, 58};
        $$k = 166;
    }

    static void init$2() {
        $$o = new byte[]{40, 101, 74, -30};
        $$p = 127;
    }

    static void t() {
        f26536d = -1219376754;
        f26537e = 1150422477;
        f26538f = -655992988;
        f26539j = new byte[]{91, MessagePack.Code.STR16, 38, MessagePack.Code.INT16, -5, 4, MessagePack.Code.STR16, 35, MessagePack.Code.INT64, 40, -12, -9, 105, MessagePack.Code.FIXEXT4, -109, Ascii.CAN, 41, 40, 47, MessagePack.Code.ARRAY16, 36, MessagePack.Code.MAP32, 95, 9, -16, 3, -27, 8, Ascii.FF, Ascii.VT, 10, -10, MessagePack.Code.STR8, 59, -16, -1, 5, -10, Ascii.VT, -28, 82, Ascii.ESC, -23, Ascii.SUB, -31, -10, 49, 17, -24, Ascii.ESC, -3, 16, Ascii.DC4, Ascii.ESC, -24, -25, 19, Ascii.SUB, 17, MessagePack.Code.STR16, 33, -29, Ascii.SYN, 16, Ascii.NAK, -17, 16, MessagePack.Code.ARRAY16, 59, -21, -9, 113, 106, 104, MessagePack.Code.FIXARRAY_PREFIX, -105, 105, 102, MessagePack.Code.EXT8, 57, -109, 108, -109, -103, MessagePack.Code.FIXEXT4, 57, -111, -106, -99, 100, -107, -122, MessagePack.Code.FIXEXT1, 102, -104, 39, -100, -108, -107, 110, -110, 101, -106, -100, MessagePack.Code.INT64, 102, -104, 46, 107, -109, 123, -117, 119, -110, -98, 109, 96, -109, -100, -108, 106, 102, -70, 75, 100, -122, 104, 110, 104, -98, 126, 118, -14, Ascii.FF, -10, -2, 10, -16, Ascii.SI, 93, -95, 9, Ascii.SO, -13, -16, 47, -17, -14, Ascii.VT, -8, Ascii.RS, -13, -9, -8, Ascii.VT, 4, -16, -7, -14, 57, MessagePack.Code.FALSE, 0, -11, -13, -10, Ascii.FF, -13, Utf8.REPLACEMENT_BYTE, 46, -79, -10, -16, 6, -26, 5, 8, 68, -2, 0, -95, 9, Ascii.SO, -13, -16, 47, -31, -11, Ascii.SO, -7, Ascii.RS, 81, Ascii.ESC, Ascii.FS, -31, -30, Base64.padSymbol, -3, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.EM, -22, Ascii.FF, -31, -27, -22, Ascii.EM, Ascii.SYN, -30, -21, MessagePack.Code.NEGFIXINT_PREFIX, 43, MessagePack.Code.INT8, Ascii.DC2, -25, -31, -28, Ascii.RS, -31, 45};
        f26546t = 7716942517250719456L;
    }

    final boolean a(Short sh) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f26545s + 39;
        f26544r = i3 % 128;
        int i4 = i3 % 2;
        if (this.f26550c != sh.shortValue()) {
            int i5 = f26545s + 73;
            f26544r = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26550c = sh.shortValue();
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.g.b b(o.g.a r18, o.m.f r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.m.b(o.g.a, o.m.f, boolean):o.g.b");
    }

    public short b() {
        int i2 = 2 % 2;
        int i3 = f26545s + 37;
        int i4 = i3 % 128;
        f26544r = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        short s2 = this.f26550c;
        int i5 = i4 + 55;
        f26545s = i5 % 128;
        int i6 = i5 % 2;
        return s2;
    }

    public final void b(short s2) {
        Object[] objArr = {this, Short.valueOf(s2)};
        int i2 = f26540m * (-1181685237);
        f26540m = i2;
        int iMyUid = Process.myUid();
        int i3 = f26541o * 56969163;
        f26541o = i3;
        a(new Random().nextInt(), i2, i3, iMyUid, -1180611036, objArr, 1180611036);
    }

    public final void b(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int iMyTid = Process.myTid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        a((int) Process.getElapsedCpuTime(), iMyTid, Thread.currentThread().getPriority(), iElapsedRealtime, 1664058493, objArr, -1664058492);
    }

    @Override // o.m.h
    protected final o.l.c e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt) throws Throwable {
        if (!(customerAuthenticationPrompt instanceof PinCustomerAuthenticationPrompt)) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                J((short) View.resolveSize(0, 0), 205274149 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 1670096231, (-65) - (KeyEvent.getMaxKeyCode() >> 16), (byte) (99 - ExpandableListView.getPackedPositionGroup(0L)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                J((short) View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 205274240, KeyEvent.getDeadChar(0, 0) + 1670096249, Drawable.resolveOpacity(0, 0) - 65, (byte) ((-128) - View.resolveSize(0, 0)), objArr2);
                o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
            }
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr3 = new Object[1];
            J((short) KeyEvent.normalizeMetaState(0), 205274300 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 1670096218, Color.blue(0) - 65, (byte) (Process.getGidForName("") - 109), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (!p()) {
            final PinCustomerAuthenticationPrompt pinCustomerAuthenticationPrompt = (PinCustomerAuthenticationPrompt) customerAuthenticationPrompt;
            return new o.n.d(context, pinCustomerAuthenticationPrompt.getTitle(), pinCustomerAuthenticationPrompt.getSubtitle(), pinCustomerAuthenticationPrompt.getCloseAccessibilityLabel(), pinCustomerAuthenticationPrompt.getDeleteAccessibilityLabel(), pinCustomerAuthenticationPrompt.getDeleteAccessibilityHint(), pinCustomerAuthenticationPrompt.getDigitsCounterAccessibilityLabel(), pinCustomerAuthenticationPrompt.getDigitsCounterAccessibilityValueFormat(), pinCustomerAuthenticationPrompt.getBiometryFallbackAccessibilityLabel(), pinCustomerAuthenticationPrompt.getBiometryFallbackAccessibilityHint(), pinCustomerAuthenticationPrompt.getInvalidPinMessageProvider() == null ? null : new d.c() { // from class: o.m.m$$ExternalSyntheticLambda0
                @Override // o.n.d.c
                public final String getMessage(int i2) {
                    return m.b(pinCustomerAuthenticationPrompt, i2);
                }
            }, this, pinCustomerAuthenticationPrompt.isPinCheckDisabled());
        }
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            J((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), 205274149 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1670096231 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-66) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (99 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            K("珍\ue623場눨\u242f鸢\uf00b樏\udc0a㘞ꡡȼ琮\uee2a䁒멙ⱑ虈\uf842加쓻㺲邻ટ粚횎䢑ꋌᓲ躺\ue0f1嫡쳡⚖飞\uf2cc擎\udf31ㄲꬥᴣ睮\ue917䌅땃⼃腢ﭫ浪읣㥿", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38393, objArr5);
            o.ea.f.d(strIntern2, ((String) objArr5[0]).intern());
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unexpected;
        Object[] objArr6 = new Object[1];
        J((short) (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) + 205274299, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1670096218, TextUtils.indexOf((CharSequence) "", '0', 0) - 64, (byte) ((-110) - TextUtils.getCapsMode("", 0, 0)), objArr6);
        throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr6[0]).intern());
    }

    @Override // o.m.h
    final void e(Context context, h hVar) {
        int i2 = 2 % 2;
        int i3 = f26545s + 91;
        f26544r = i3 % 128;
        int i4 = i3 % 2;
        super.e(context, hVar);
        this.f26548a = ((m) hVar).f26548a;
        int i5 = f26545s + 67;
        f26544r = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.m.h
    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f26545s;
            int i4 = i3 + 51;
            f26544r = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 107;
            f26544r = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj != null) {
            int i8 = f26544r + 103;
            f26545s = i8 % 128;
            if (i8 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            m mVar = (m) obj;
            if (!(!Objects.equals(Short.valueOf(this.f26550c), Short.valueOf(mVar.f26550c)))) {
                int i9 = f26544r + 103;
                f26545s = i9 % 128;
                int i10 = i9 % 2;
                if (Objects.equals(Short.valueOf(this.f26548a), Short.valueOf(mVar.f26548a))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0065 A[PHI: r12
  0x0065: PHI (r12v4 long) = (r12v0 long), (r12v8 long) binds: [B:101:0x030a, B:83:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.m.k():boolean");
    }

    public final short l() {
        int i2 = 2 % 2;
        int i3 = f26545s;
        int i4 = i3 + 65;
        f26544r = i4 % 128;
        int i5 = i4 % 2;
        short s2 = this.f26548a;
        int i6 = i3 + 33;
        f26544r = i6 % 128;
        int i7 = i6 % 2;
        return s2;
    }

    public final void o() {
        int i2 = 2 % 2;
        int i3 = f26544r + 55;
        int i4 = i3 % 128;
        f26545s = i4;
        int i5 = i3 % 2;
        this.f26550c = (short) 0;
        int i6 = i4 + 3;
        f26544r = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean p() {
        int i2 = 2 % 2;
        int i3 = f26544r + 49;
        f26545s = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26549b;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(super.toString());
        Object[] objArr = new Object[1];
        K("玏\ueb6c䉭릝ქ蠁\ue76c庣떓ⳑ萘\ue369媱뇛⤤耜ｗ嚓췣┰鱲ﮱ劈짔℞顡\uf7ab滑옶㴞鑉\uf397櫫숽㥾邡ྙ曐\ude1c㕞겳\u0bdf挡\uda18ㅆꢗ߁缼홬䶕ꒂϑ笕퉆䧴", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39112, objArr);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern()).append((int) this.f26550c);
        Object[] objArr2 = new Object[1];
        K("玃曎奀䰍⛓ᦫౝ\ue71c\ud9c2첋ꝕ騐賐枡婎䴕⟑\u1a8aഀ", 5441 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        String string = sbAppend2.append(((String) objArr2[0]).intern()).append((int) this.f26548a).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f26545s + 53;
        f26544r = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return string;
    }
}
