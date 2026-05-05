package o.bz;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationIssuerPasscode;
import fr.antelop.sdk.authentication.CustomerAuthenticationPasscode;
import fr.antelop.sdk.authentication.CustomerConsentCredentials;
import fr.antelop.sdk.authentication.CustomerDeviceBiometricAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerScreenUnlockAuthenticationCredentials;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.o;
import o.d.d;
import o.g.a;
import o.g.e;
import o.g.f;
import o.g.g;
import o.g.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f21909a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21910b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21911d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f21912e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            byte[] r8 = o.bz.b.$$a
            int r7 = r11 + 4
            int r6 = r9 * 4
            int r1 = r6 + 1
            int r0 = 105 - r10
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r8 != 0) goto L2a
            r3 = r6
            r2 = r7
            r1 = r4
        L12:
            int r0 = -r3
            int r7 = r7 + r0
            r3 = r1
            r0 = r7
            r7 = r2
        L17:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r5[r3] = r1
            int r1 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r3 = r8[r2]
            r7 = r0
            goto L12
        L2a:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bz.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21911d = 0;
        f21910b = 1;
        f21909a = new char[]{59279, 52129, 49039, 25584, 22467, 15321, 61241, 54038, 34637, 27489, 24392, 684, 63113, 55962, 36584, 29389, 9775, 2613, 65032, 41581, 38467, 31322, 11679, 4502, 50665, 43504, 40409, 16682, 13592, 6429, 52605, 45384, 25791};
        f21912e = 2478796359458011370L;
    }

    public static CustomerAuthenticationCredentials b(a aVar) {
        int i2 = 2 % 2;
        c cVar = new c(aVar);
        int i3 = f21911d + 25;
        f21910b = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21909a[i2 + i5])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 741, (char) View.combineMeasuredStates(0, 0), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 632508977, false, $$c(b2, (byte) ((b2 + 6) - (6 & b2)), (byte) (-1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f21912e), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    objA2 = d.a(767 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 12470), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 1946853218, false, $$c((byte) 0, (byte) (-$$a[1]), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA3 = d.a(TextUtils.indexOf("", "") + 387, (char) (ViewConfiguration.getScrollBarSize() >> 8), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 39570797, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i6 = $11 + 97;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 2;
        }
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = d.a(-723636472);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objA4 = d.a(386 - Process.getGidForName(""), (char) Gravity.getAbsoluteGravity(0, 0), 18 - KeyEvent.keyCodeFromString(""), 39570797, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 115;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public static a d(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws WalletValidationException {
        int i2 = 2 % 2;
        if (customerAuthenticationCredentials == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            c((char) (KeyEvent.keyCodeFromString("") + 29502), TextUtils.getTrimmedLength(""), 33 - Color.red(0), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        Object obj = null;
        if (customerAuthenticationCredentials instanceof CustomerAuthenticationIssuerPasscode) {
            int i3 = f21910b + 63;
            f21911d = i3 % 128;
            if (i3 % 2 != 0) {
                CustomerAuthenticationIssuerPasscode customerAuthenticationIssuerPasscode = (CustomerAuthenticationIssuerPasscode) customerAuthenticationCredentials;
                customerAuthenticationIssuerPasscode.getPasscode();
                customerAuthenticationIssuerPasscode.getCryptogram();
                customerAuthenticationIssuerPasscode.isValid();
                throw null;
            }
            CustomerAuthenticationIssuerPasscode customerAuthenticationIssuerPasscode2 = (CustomerAuthenticationIssuerPasscode) customerAuthenticationCredentials;
            o.g.d passcode = customerAuthenticationIssuerPasscode2.getPasscode();
            o.g.d cryptogram = customerAuthenticationIssuerPasscode2.getCryptogram();
            if (customerAuthenticationIssuerPasscode2.isValid()) {
                return new i(a.b.f26176d, new Date(), passcode, cryptogram, customerAuthenticationIssuerPasscode2.getCryptogramExtraData());
            }
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr2 = new Object[1];
            c((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29502), (-1) - ImageFormat.getBitsPerPixel(0), (Process.myTid() >> 22) + 33, objArr2);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
        }
        if (customerAuthenticationCredentials instanceof CustomerAuthenticationPasscode) {
            int i4 = f21910b + 77;
            f21911d = i4 % 128;
            int i5 = i4 % 2;
            CustomerAuthenticationPasscode customerAuthenticationPasscode = (CustomerAuthenticationPasscode) customerAuthenticationCredentials;
            customerAuthenticationPasscode.getValue();
            if (customerAuthenticationPasscode.isValid()) {
                return new f(a.b.f26176d, new Date(), customerAuthenticationPasscode.getValue());
            }
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.InvalidFormat;
            Object[] objArr3 = new Object[1];
            c((char) (29502 - Color.green(0)), KeyEvent.keyCodeFromString(""), 33 - Color.green(0), objArr3);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr3[0]).intern());
        }
        if (customerAuthenticationCredentials instanceof CustomerConsentCredentials) {
            return new e(a.b.f26176d, new Date());
        }
        if (customerAuthenticationCredentials instanceof CustomerScreenUnlockAuthenticationCredentials) {
            g gVar = new g(a.b.f26176d, new Date(), new o.g.d(new byte[0]));
            int i6 = f21911d + 39;
            f21910b = i6 % 128;
            int i7 = i6 % 2;
            return gVar;
        }
        if (customerAuthenticationCredentials instanceof CustomerDeviceBiometricAuthenticationCredentials) {
            return new o.g.c(a.b.f26176d, new Date(), null, ((CustomerDeviceBiometricAuthenticationCredentials) customerAuthenticationCredentials).getCipher());
        }
        if (customerAuthenticationCredentials instanceof c) {
            int i8 = f21911d + 79;
            f21910b = i8 % 128;
            if (i8 % 2 != 0) {
                return ((c) customerAuthenticationCredentials).d();
            }
            ((c) customerAuthenticationCredentials).d();
            obj.hashCode();
            throw null;
        }
        WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.InvalidFormat;
        Object[] objArr4 = new Object[1];
        c((char) (Color.rgb(0, 0, 0) + 16806718), TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, objArr4);
        throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr4[0]).intern());
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, -5, 39, 97};
        $$b = 203;
    }
}
