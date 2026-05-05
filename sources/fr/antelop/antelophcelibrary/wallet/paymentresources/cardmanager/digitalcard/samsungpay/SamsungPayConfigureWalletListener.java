package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.samsung.android.sdk.samsungpay.v2.SamsungPay;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import java.lang.reflect.Method;
import o.a.l;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayConfigureWalletListener implements StatusListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18557b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f18558c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18559d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18560e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18561i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SamsungPay f18562a;

    private static String $$c(byte b2, int i2, byte b3) {
        int i3 = b2 * 3;
        int i4 = (b3 * 2) + 117;
        byte[] bArr = $$a;
        int i5 = 3 - (i2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i5 + (-i6);
            i5 = i5;
        }
        while (true) {
            i7++;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i8];
            i5 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18560e = 0;
        f18561i = 1;
        f18557b = 0;
        f18559d = 1;
        b();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f18561i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18560e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    protected SamsungPayConfigureWalletListener(SamsungPay samsungPay) {
        this.f18562a = samsungPay;
    }

    static void b() {
        f18558c = new int[]{1931445622, 1943688549, -1332234042, -2143128053, -2076205430, -940889298, -2015339203, 1913533877, 164260896, -1129011809, 410625283, -298888886, -1160867146, -194764682, -1963580445, 399068095, 194500578, -791057694};
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f18558c;
        int i6 = 989264422;
        byte b2 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = $11 + 83;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = $10 + 57;
                $11 = i11 % 128;
                int i12 = i11 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        int modifierMetaStateMask = 674 - ((byte) KeyEvent.getModifierMetaStateMask());
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iResolveSize = 12 - View.resolveSize(0, 0);
                        byte b3 = (byte) ($$a[i4] + 1);
                        byte b4 = b3;
                        objA = o.d.d.a(modifierMetaStateMask, doubleTapTimeout, iResolveSize, -328001469, false, $$c(b3, b4, (byte) (b4 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i10] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i10++;
                    i4 = 2;
                    i6 = 989264422;
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
        int[] iArr6 = f18558c;
        if (iArr6 != null) {
            int i13 = $10 + 41;
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
                int i14 = $11 + 73;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i3])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int iArgb = Color.argb(i7, i7, i7, i7) + 675;
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int mirror = '<' - AndroidCharacter.getMirror('0');
                        byte b5 = (byte) ($$a[2] + b2);
                        byte b6 = b5;
                        objA2 = o.d.d.a(iArgb, maximumFlingVelocity, mirror, -328001469, false, $$c(b5, b6, (byte) (b6 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    b2 = 1;
                    i7 = 0;
                    i3 = 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i3])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 675;
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11;
                        byte b7 = (byte) ($$a[2] + 1);
                        byte b8 = b7;
                        objA3 = o.d.d.a(packedPositionType, cMyPid, i15, -328001469, false, $$c(b7, b8, (byte) (b8 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i3++;
                    b2 = 1;
                    i7 = 0;
                }
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, i7, iArr5, i7, length3);
        lVar.f19941d = i7;
        while (lVar.f19941d < iArr.length) {
            cArr[i7] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $11 + 17;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    lVar.f19942e ^= iArr5[i16];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int iRgb = (-16776915) - Color.rgb(0, 0, 0);
                        char fadingEdgeLength = (char) (52697 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 11;
                        byte b9 = $$a[2];
                        byte b10 = (byte) (b9 + 1);
                        objA4 = o.d.d.a(iRgb, fadingEdgeLength, threadPriority, -1416256172, false, $$c(b10, b10, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i16 += 52;
                } else {
                    lVar.f19942e ^= iArr5[i16];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 301;
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 52697);
                        int i19 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11;
                        byte b11 = $$a[2];
                        byte b12 = (byte) (b11 + 1);
                        objA5 = o.d.d.a(threadPriority2, cResolveSizeAndState, i19, -1416256172, false, $$c(b12, b12, (byte) (-b11)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i16++;
                }
            }
            int i20 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i20;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i21 = lVar.f19942e;
            int i22 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 229;
                char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51004);
                int i23 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10;
                byte b13 = (byte) ($$a[2] + 1);
                byte b14 = b13;
                objA6 = o.d.d.a(offsetBefore, c2, i23, -330018025, false, $$c(b13, b14, b14), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8};
        $$b = 219;
    }

    public void onFail(int i2, Bundle bundle) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18557b + 15;
        f18559d = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            int i6 = f18557b + 17;
            f18559d = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            f(new int[]{-1233724125, 1327629109, 1485501552, -1459678708, 264930911, -136111442, -1467069396, 2005050169, 1100688781, -302897276, -435800273, 1092564375, 679027740, 339371854, 1370685692, 245302228, 979406804, 511627735}, 33 - View.MeasureSpec.getSize(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(new int[]{-1774968254, -854147359, -1016550260, 301663735, -2031557031, -299117316, -1538997228, -1733278266, 82833198, -1703771251, 1737105169, 819376010}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i8 = f18557b + 103;
            f18559d = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(int r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayConfigureWalletListener.onSuccess(int, android.os.Bundle):void");
    }
}
