package o.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f26530a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26531b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26532c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f26533d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26534e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26535j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            int r0 = r6 * 3
            int r7 = 3 - r0
            byte[] r6 = o.m.l.$$a
            int r5 = r8 + 102
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L29
            r0 = r5
            r1 = r3
            r5 = r2
        L16:
            int r5 = r5 + r0
        L17:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r7 = r7 + 1
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L16
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.l.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26532c = 0;
        f26535j = 1;
        f26534e = 0;
        f26531b = 1;
        a();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getTapTimeout();
        int i2 = f26535j + 93;
        f26532c = i2 % 128;
        int i3 = i2 % 2;
    }

    public l() {
        super(i.f26500i);
    }

    static void a() {
        f26533d = new char[]{64582, 64517, 64584, 64592, 64586, 64581, 64585, 64587, 64612, 64583, 64576, 64599, 64593, 64597, 64614, 64580, 64589, 64616, 64619, 64520, 64629, 64598, 64577, 64579, 64588};
        f26530a = (char) 51642;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = 243;
    }

    private static void p(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = i5 + 47;
        $10 = i6 % 128;
        Object obj = null;
        Object charArray = str2;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            int i7 = i5 + 67;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f26533d;
        char c2 = '0';
        int i8 = 421932776;
        long j2 = 0;
        int i9 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(i8);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", c2, 0) + 271, (char) (1 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1))), 12 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    c2 = '0';
                    i8 = 421932776;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f26530a)};
        Object objA2 = o.d.d.a(421932776);
        float f2 = 0.0f;
        char c3 = 11;
        char c4 = '\b';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
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
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i9];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i9] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c4] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i9] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)) + 824, (char) TextUtils.indexOf("", "", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, -611683395, false, $$c(b7, b8, (byte) ((b8 + 9) - (9 & b8))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i11 = $10 + 91;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            c3 = 11;
                            byte b9 = (byte) 0;
                            c4 = '\b';
                            objA4 = o.d.d.a(218 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 11, 212688716, false, $$c(b9, b9, $$a[3]), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = 11;
                            c4 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else {
                        c3 = 11;
                        c4 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i14];
                            cArr4[hVar.f19926b + 1] = cArr2[i15];
                            int i16 = $10 + 97;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                        } else {
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            i9 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        }
                    }
                    i9 = 1;
                }
                hVar.f19926b += 2;
                f2 = 0.0f;
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // o.m.h
    protected final o.l.c e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26531b + 51;
        f26534e = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p(32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0013\u0003\u0005\f\r\u0004\u0016\u000b\u0000\u0003\u000b\f\r\b\u000b\u0011\f\u0005\u000e\u0016\u0005\u0014\u000e\u0016\u0002\t\u000f\f\u000b\u0011\u0002\u0018", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 94), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p(23 - Color.alpha(0), "\b\u0004\u0015\t\u0017\u0015\u000e\u0001\u0003\f\u000b\u0002\u0010\u0004\u0018\u0003\u000e\u0006\u0014\u0017\u0014\f㗷", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f26534e + 7;
            f26531b = i5 % 128;
            int i6 = i5 % 2;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Unexpected;
        Object[] objArr3 = new Object[1];
        p(28 - ExpandableListView.getPackedPositionType(0L), "\r\u0004\u0016\u000b\u0000\u0003\u000b\f\r\b\u000b\u0011\f\u0005\u000e\u0016\u0005\u0014\u000e\u0016\u0002\t\u0015\n\u0000\u0003\u000e\r", (byte) Color.alpha(0), objArr3);
        throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
    }
}
