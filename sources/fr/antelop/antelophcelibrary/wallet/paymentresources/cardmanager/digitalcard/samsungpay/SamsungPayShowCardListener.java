package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import java.lang.reflect.Method;
import o.a.h;
import o.ea.f;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayShowCardListener implements StatusListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18583a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f18584b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18585c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f18586d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18587e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18588g = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, short r11) {
        /*
            byte[] r8 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayShowCardListener.$$a
            int r0 = r9 * 4
            int r7 = 4 - r0
            int r1 = r11 * 2
            int r0 = 1 - r1
            int r6 = r10 + 102
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2c
            r2 = r4
            r1 = r7
        L15:
            int r7 = r7 + r6
            int r0 = r1 + 1
            r6 = r7
            r7 = r0
        L1a:
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r2 = r2 + 1
            r0 = r8[r7]
            r1 = r7
            r7 = r0
            goto L15
        L2c:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayShowCardListener.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18583a = 0;
        f18588g = 1;
        f18585c = 0;
        f18587e = 1;
        e();
        Process.myTid();
        KeyEvent.getDeadChar(0, 0);
        int i2 = f18588g + 45;
        f18583a = i2 % 128;
        int i3 = i2 % 2;
    }

    static void e() {
        f18584b = new char[]{64594, 64588, 64630, 64578, 64604, 64586, 64520, 64599, 64591, 64617, 64576, 64577, 64584, 64629, 64580, 64517, 64593, 64598, 64592, 64589, 64614, 64587, 64583, 64585, 64582};
        f18586d = (char) 51642;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f18584b;
        char c2 = '0';
        int i6 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(AndroidCharacter.getMirror(c2) + 222, (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - (ViewConfiguration.getTouchSlop() >> 8), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    c2 = '0';
                    i6 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f18586d)};
        Object objA2 = o.d.d.a(421932776);
        char c3 = '\f';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - TextUtils.indexOf("", ""), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 12, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
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
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    int i10 = $11 + 15;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    i4 = 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c3] = hVar;
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
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 824, (char) Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -611683395, false, $$c(b7, (byte) (9 | b7), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + JfifUtil.MARKER_SOS, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 212688716, false, $$c(b8, (byte) (7 | b8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        int i13 = $11 + 117;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i15 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i15];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                        int i17 = $11 + 113;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i19];
                        cArr4[hVar.f19926b + 1] = cArr2[i20];
                        int i21 = $11 + 55;
                        $10 = i21 % 128;
                        i4 = 2;
                        int i22 = i21 % 2;
                    }
                    i4 = 2;
                }
                hVar.f19926b += i4;
                c3 = '\f';
            }
        }
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 173;
    }

    public void onFail(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18585c + 111;
        f18587e = i4 % 128;
        if (i4 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i5 = f18585c + 95;
            f18587e = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f(26 - Color.blue(0), "\u0004\f\u0011\u0016\u0010\u0017\b\u0012\u0013\t\u0004\u0011\n\u0005\u0018\n\u0006\f\u0006\u0004\u0012\u0011\u000b\u0014\f\u0005", (byte) (ExpandableListView.getPackedPositionType(0L) + 100), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0012\u000f\n\u0005\u0018\n\u0006\f\u0010\u0005\u0010\u0012\n\r\u0012\u0013\u0017\u0001\u000e\n\u0000\u0013\u0002\u0010\u0010\u0013\u0018\u000b\u0017\u0018\u000f\u0014\u000f\u0006\u0010\u0012\u000f\t\u0005\u0014\u0011\u000f\u0002\u0010\u0013\u0014\f\t㙔", (byte) (85 - TextUtils.indexOf((CharSequence) "", '0')), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
    }

    public void onSuccess(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18587e + 85;
        f18585c = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            int i6 = f18587e + 103;
            f18585c = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, "\u0004\f\u0011\u0016\u0010\u0017\b\u0012\u0013\t\u0004\u0011\n\u0005\u0018\n\u0006\f\u0006\u0004\u0012\u0011\u000b\u0014\f\u0005", (byte) (99 - ImageFormat.getBitsPerPixel(0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, "\u0012\u000f\n\u0005\u0018\n\u0006\f\u0010\u0005\u0010\u0012\u0013\u0017\u0014\u000e㙜㙜", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 115), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
    }
}
