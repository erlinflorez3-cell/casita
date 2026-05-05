package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.Address;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.a.q;
import o.d.d;
import o.ea.m;
import o.x.j;
import o.y.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCardPushToSamsungPay implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f19167a = 0;

    /* JADX INFO: renamed from: b */
    private static long f19168b = 0;

    /* JADX INFO: renamed from: c */
    public static int f19169c = 0;

    /* JADX INFO: renamed from: e */
    private static int f19170e = 0;
    private final f innerSecureDigitalCardPushToSamsungPayProcess;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, short r8, int r9) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            int r0 = r9 * 7
            int r2 = r0 + 71
            int r1 = r7 * 4
            int r0 = 1 - r1
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.$$c
            byte[] r6 = new byte[r0]
            r5 = 0
            int r4 = 0 - r1
            if (r7 != 0) goto L2d
            r0 = r4
            r3 = r8
            r2 = r5
        L18:
            int r0 = -r0
            int r8 = r8 + r0
            int r3 = r3 + 1
            r1 = r2
        L1d:
            byte r0 = (byte) r8
            r6[r1] = r0
            int r2 = r1 + 1
            if (r1 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r0 = r7[r3]
            goto L18
        L2d:
            r1 = r5
            r3 = r8
            r8 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.$$g(int, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19169c = 720860110;
        init$0();
        f19170e = 0;
        f19167a = 1;
        f19168b = 3985986616166252554L;
    }

    public SecureCardPushToSamsungPay(f fVar) {
        this.innerSecureDigitalCardPushToSamsungPayProcess = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r2 = r8 * 4
            int r0 = 1 - r2
            int r8 = r10 + 4
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.$$a
            int r1 = r9 + 99
            byte[] r6 = new byte[r0]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2b
            r2 = r8
            r0 = r5
        L13:
            int r1 = -r1
            int r1 = r1 + r2
        L15:
            byte r2 = (byte) r1
            r6[r0] = r2
            int r8 = r8 + 1
            if (r0 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r11[r5] = r0
            return
        L24:
            int r0 = r0 + 1
            r3 = r7[r8]
            r2 = r1
            r1 = r3
            goto L13
        L2b:
            r0 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.d(short, int, int, java.lang.Object[]):void");
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(Color.red(0) + 731, (char) (7933 - KeyEvent.normalizeMetaState(0)), TextUtils.lastIndexOf("", '0', 0) + 12, 355847088, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19168b ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(836 - Drawable.resolveOpacity(0, 0), (char) (27279 - (ViewConfiguration.getTapTimeout() >> 16)), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2145994442, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 83;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 % 3;
        }
        while (qVar.f19948a < cArr.length) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(836 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27279), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -2145994442, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 4
            int r1 = r6 * 10
            int r8 = r1 + 101
            int r2 = r7 * 8
            int r1 = 9 - r2
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.$$d
            byte[] r6 = new byte[r1]
            int r5 = 8 - r2
            r4 = 0
            if (r7 != 0) goto L2d
            r1 = r0
            r3 = r4
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L19:
            int r1 = r0 + 1
            byte r0 = (byte) r8
            r6[r2] = r0
            int r3 = r2 + 1
            if (r2 != r5) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r9[r4] = r0
            return
        L2a:
            r0 = r7[r1]
            goto L15
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.g(short, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{96, -118, -108, -83};
        $$b = 49;
    }

    static void init$1() {
        $$d = new byte[]{65, 52, MessagePack.Code.UINT64, -121, 65, -75, 75, MessagePack.Code.UINT16, Base64.padSymbol, -15, Ascii.SI, -13};
        $$e = 128;
    }

    static void init$2() {
        $$c = new byte[]{83, -90, 91, 36};
        $$f = 238;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        int i2 = 2 % 2;
        int i3 = f19167a + 7;
        f19170e = i3 % 128;
        int i4 = i3 % 2;
        List<CustomerAuthenticationMethodType> listB = m.b(this.innerSecureDigitalCardPushToSamsungPayProcess.d());
        int i5 = f19170e + 43;
        f19167a = i5 % 128;
        int i6 = i5 % 2;
        return listB;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19170e + 121;
        f19167a = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.innerSecureDigitalCardPushToSamsungPayProcess.g();
        int i5 = f19167a + 31;
        f19170e = i5 % 128;
        int i6 = i5 % 2;
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19170e;
        int i4 = i3 + 99;
        f19167a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i3 + 73;
        f19167a = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOnline() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToSamsungPay.isOnline():boolean");
    }

    public final void launch(Activity activity, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardPushToSamsungPayProcess.c(activity, new o.x.d(activity, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToSamsungPayProcess));
        int i3 = f19170e + 81;
        f19167a = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void launch(Activity activity, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardPushToSamsungPayProcess.c(activity, new j(activity, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToSamsungPayProcess));
        int i3 = f19167a + 51;
        f19170e = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19170e + 59;
        f19167a = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecureDigitalCardPushToSamsungPayProcess.e(context, customerAuthenticationCredentials);
        } else {
            this.innerSecureDigitalCardPushToSamsungPayProcess.e(context, customerAuthenticationCredentials);
            throw null;
        }
    }

    public final void setUserAddress(Address address) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19167a + 75;
        f19170e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerSecureDigitalCardPushToSamsungPayProcess, address};
        int iMyPid = Process.myPid();
        int iMyPid2 = Process.myPid();
        int id = (int) Thread.currentThread().getId();
        int i5 = o.y.d.f27092p * 1897016743;
        o.y.d.f27092p = i5;
        o.y.d.c(-1198808467, objArr, iMyPid2, id, i5, 1198808468, iMyPid);
        int i6 = f19170e + 19;
        f19167a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }
}
