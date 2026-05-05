package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.as.e;
import o.ep.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends e {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static short[] f27222k = null;

    /* JADX INFO: renamed from: l */
    private static int f27223l = 0;

    /* JADX INFO: renamed from: m */
    private static int f27224m = 0;

    /* JADX INFO: renamed from: n */
    private static byte[] f27225n = null;

    /* JADX INFO: renamed from: o */
    private static int f27226o = 0;

    /* JADX INFO: renamed from: p */
    private static int f27227p = 0;

    /* JADX INFO: renamed from: q */
    private static int f27228q = 0;

    /* JADX INFO: renamed from: s */
    private static int f27229s = 0;

    /* JADX INFO: renamed from: t */
    private static int f27230t = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(byte r8, byte r9, int r10) {
        /*
            int r8 = r8 + 103
            int r0 = r10 * 2
            int r7 = 1 - r0
            int r0 = r9 * 2
            int r6 = r0 + 4
            byte[] r5 = o.y.k.$$k
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L29
            r8 = r6
            r0 = r7
            r2 = r3
        L14:
            int r6 = r6 + 1
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r5[r6]
            goto L14
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.k.$$m(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27230t = 0;
        f27229s = 1;
        f27228q = 0;
        f27227p = 1;
        o();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        int i2 = f27230t + 109;
        f27229s = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(boolean z2, o.ep.d dVar, o.ep.i iVar) throws Throwable {
        Object[] objArr = new Object[1];
        C((short) (TextUtils.indexOf((CharSequence) "", '0') - 124), View.MeasureSpec.makeMeasureSpec(0, 0) - 429775591, (-2129042327) + View.MeasureSpec.getSize(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 128, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        super(((String) objArr[0]).intern(), dVar, z2, iVar);
    }

    private static void C(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f27226o)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                int minimumFlingVelocity = 238 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                char cResolveOpacity = (char) (44531 - Drawable.resolveOpacity(0, 0));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12;
                byte b3 = (byte) ((-1) - (((-1) - $$l) | ((-1) - 5)));
                byte b4 = (byte) (b3 - 1);
                objA = o.d.d.a(minimumFlingVelocity, cResolveOpacity, iIndexOf, 35969549, false, $$m(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = f27225n;
                if (bArr2 != null) {
                    int i7 = $10 + 67;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (Process.myTid() >> 22)), 11 - Color.alpha(0), 1621469864, false, $$m(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr[i8] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = f27225n;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f27224m)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        int maximumDrawingCacheSize = 238 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 44531);
                        int i9 = 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i10 = $$l;
                        byte b7 = (byte) ((i10 + 5) - (i10 | 5));
                        byte b8 = (byte) (b7 - 1);
                        objA3 = o.d.d.a(maximumDrawingCacheSize, deadChar, i9, 35969549, false, $$m(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f27226o) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f27222k[i2 + ((int) (((long) f27224m) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f27226o) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) f27224m) ^ (-7649639543924978291L)));
                if (z2) {
                    int i12 = $11 + 55;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jVar.f19936d = i11 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f27223l), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((-1) - MotionEvent.axisFromString(""), (char) (5358 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f27225n;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = $10 + 71;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-7649639543924978291L));
                            i14 >>>= 1;
                        } else {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-7649639543924978291L));
                            i14++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z3 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    int i16 = $10 + 1;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z3) {
                        byte[] bArr6 = f27225n;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f27222k;
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

    static void init$0() {
        $$k = new byte[]{108, -115, 75, MessagePack.Code.EXT32};
        $$l = 67;
    }

    static void o() {
        f27224m = 1561319274;
        f27226o = 1150422515;
        f27223l = 980717960;
        f27225n = new byte[]{Ascii.RS, -15, Ascii.SO, -1, Ascii.GS, -10, -6, -1, Ascii.SO, Ascii.VT, -9, -4, -15, Ascii.FS, -14, MessagePack.Code.NEGFIXINT_PREFIX, -13, Ascii.EM, Ascii.NAK, 38, Ascii.SUB, Ascii.DC2, 45, 73, 10, 38, 17, 19, 48, Ascii.FS, Ascii.CAN, Ascii.DC2, 57, 45, 57, 41, MessagePack.Code.BIN8, MessagePack.Code.INT16, MessagePack.Code.BIN16, MessagePack.Code.ARRAY32, MessagePack.Code.ARRAY16, -8, -75, MessagePack.Code.INT16, MessagePack.Code.NIL, MessagePack.Code.FALSE, -29, MessagePack.Code.UINT32, MessagePack.Code.EXT16, -23, -4, -89, MessagePack.Code.INT64, MessagePack.Code.UINT16, MessagePack.Code.INT64, MessagePack.Code.FIXEXT16, MessagePack.Code.ARRAY16, -11, -65, MessagePack.Code.FLOAT64, MessagePack.Code.ARRAY32, -24, MessagePack.Code.ARRAY16, -24, -71, -19, MessagePack.Code.EXT8, MessagePack.Code.MAP16, -11, 4, -16, Ascii.GS, -15, 9, 8, 4, 10, -67, -84, -82, MessagePack.Code.UINT64};
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27228q + 61;
        f27227p = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        C((short) (94 - ExpandableListView.getPackedPositionGroup(0L)), (-429775574) - Color.blue(0), (-2129042354) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - 175, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f27228q + 37;
        f27227p = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final void e(Context context, o.x.f fVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f27228q + 29;
        f27227p = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f27228q + 107;
            f27227p = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            C((short) ((-83) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-429775556) - (ViewConfiguration.getEdgeSlop() >> 16), (-2129042364) + (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 127, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((short) (Color.rgb(0, 0, 0) + 16777337), (ViewConfiguration.getPressedStateDuration() >> 16) - 429775522, TextUtils.getTrimmedLength("") - 2129042322, (Process.myTid() >> 22) - 127, (byte) KeyEvent.keyCodeFromString(""), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (l().o() != i.b.f24655e) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            C((short) (TextUtils.lastIndexOf("", '0', 0) - 38), (-429775515) - TextUtils.getCapsMode("", 0, 0), View.resolveSize(0, 0) - 2129042353, (-127) - View.MeasureSpec.getMode(0), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        b(context, fVar);
        int i7 = f27227p + 55;
        f27228q = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.y.e
    public final e.c n() {
        int i2 = 2 % 2;
        int i3 = f27228q + 83;
        f27227p = i3 % 128;
        int i4 = i3 % 2;
        e.c cVar = e.c.f20619e;
        int i5 = f27228q + 25;
        f27227p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return cVar;
    }
}
