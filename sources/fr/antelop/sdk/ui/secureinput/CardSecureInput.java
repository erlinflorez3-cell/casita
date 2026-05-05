package fr.antelop.sdk.ui.secureinput;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationDomain;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.d.d;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CardSecureInput implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f19605c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19606d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19607e = 0;
    private final String TAG = WalletValidationDomain.CARD_SECURE_INPUT;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, int r9, short r10) {
        /*
            int r0 = r9 * 3
            int r7 = 3 - r0
            int r0 = r10 * 7
            int r6 = 114 - r0
            byte[] r5 = fr.antelop.sdk.ui.secureinput.CardSecureInput.$$c
            int r0 = r8 * 4
            int r4 = 1 - r0
            byte[] r3 = new byte[r4]
            r2 = 0
            if (r5 != 0) goto L28
            r0 = r4
            r1 = r2
        L15:
            int r6 = r6 + r0
        L16:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r7 = r7 + 1
            int r1 = r1 + 1
            if (r1 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r5[r7]
            goto L15
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.$$g(short, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f19605c = 0;
        f19606d = 1;
        f19607e = -4091464184296638181L;
    }

    public CardSecureInput(String str) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "CardSecureInput - Not supported : Feature SCA Disabled");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 5
            int r7 = 106 - r0
            int r0 = r6 * 4
            int r6 = 4 - r0
            byte[] r5 = fr.antelop.sdk.ui.secureinput.CardSecureInput.$$a
            int r1 = r8 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2e
            r7 = r6
            r0 = r2
            r1 = r3
        L18:
            int r0 = -r0
            int r6 = r6 + 1
            int r7 = r7 + r0
        L1c:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L29:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L18
        L2e:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void b(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 53;
        $11 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f19607e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i7 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19607e)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(TextUtils.lastIndexOf("", '0') + 230, (char) (51005 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 8 - TextUtils.lastIndexOf("", '0', 0, 0), 1749983833, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(676 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 522683165, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.ui.secureinput.CardSecureInput.$$d
            int r0 = r10 * 7
            int r7 = r0 + 1
            int r0 = r9 * 7
            int r6 = 11 - r0
            int r0 = r11 * 11
            int r5 = 111 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2d
            r0 = r7
            r2 = r3
        L15:
            int r5 = r5 + r0
            int r5 = r5 + (-6)
            int r6 = r6 + 1
            r1 = r2
        L1b:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r7) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2a:
            r0 = r8[r6]
            goto L15
        L2d:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.f(int, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
        $$b = 69;
    }

    static void init$1() {
        $$d = new byte[]{42, -91, MessagePack.Code.MAP16, 103, MessagePack.Code.BIN16, Base64.padSymbol, 19, MessagePack.Code.FALSE, 60, MessagePack.Code.BIN32, 19};
        $$e = 208;
    }

    static void init$2() {
        $$c = new byte[]{85, Ascii.RS, 127, 42};
        $$f = 156;
    }

    private void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 53;
        f19605c = i3 % 128;
        int i4 = i3 % 2;
        if (!(!f.a())) {
            int i5 = f19605c + 47;
            f19606d = i5 % 128;
            if (i5 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "launch - Not supported : Feature SCA Disabled");
            } else {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "launch - Not supported : Feature SCA Disabled");
                int i6 = 26 / 0;
            }
        }
    }

    @Deprecated
    public final CardSecureInput enableCameraScan(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (!(!f.a())) {
            int i3 = f19606d + 45;
            f19605c = i3 % 128;
            int i4 = i3 % 2;
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "enableCameraScan - Not supported : Feature SCA Disabled");
        }
        int i5 = f19605c + 53;
        f19606d = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final CardSecureInput enableNfcScan(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 29;
        f19605c = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f19606d + 73;
            f19605c = i4 % 128;
            if (i4 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "enableNfcScan - Not supported : Feature SCA Disabled");
                throw null;
            }
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "enableNfcScan - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<fr.antelop.sdk.authentication.CustomerAuthenticationMethodType> getAuthenticatedMethods() throws java.lang.Throwable {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = fr.antelop.sdk.ui.secureinput.CardSecureInput.f19606d
            int r1 = r0 + 75
            int r0 = r1 % 128
            fr.antelop.sdk.ui.secureinput.CardSecureInput.f19605c = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2a
            boolean r1 = o.ea.f.a()
            r0 = 66
            int r0 = r0 / 0
            if (r1 == 0) goto L1f
        L18:
            java.lang.String r1 = "CardSecureInput"
            java.lang.String r0 = "getAuthenticatedMethods - Not supported : Feature SCA Disabled"
            o.ea.f.d(r1, r0)
        L1f:
            int r0 = fr.antelop.sdk.ui.secureinput.CardSecureInput.f19606d
            int r1 = r0 + 105
            int r0 = r1 % 128
            fr.antelop.sdk.ui.secureinput.CardSecureInput.f19605c = r0
            int r1 = r1 % r2
            r0 = 0
            return r0
        L2a:
            boolean r1 = o.ea.f.a()
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L1f
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.getAuthenticatedMethods():java.util.List");
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 65;
        f19605c = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "getCustomerAuthenticationPatternName - Not supported : Feature SCA Disabled");
        }
        int i5 = f19605c + 7;
        f19606d = i5 % 128;
        if (i5 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 117;
        f19605c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "getMessage - Not supported : Feature SCA Disabled");
        }
        int i4 = f19606d + 49;
        f19605c = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String getResult() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 11;
        f19605c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (!(!f.a())) {
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "getResult - Not supported : Feature SCA Disabled");
        }
        int i4 = f19605c + 17;
        f19606d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0387  */
    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOnline() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.isOnline():boolean");
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19605c + 3;
        f19606d = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = f19605c + 55;
            f19606d = i4 % 128;
            int i5 = i4 % 2;
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "launch - Not supported : Feature SCA Disabled");
            int i6 = f19605c + 33;
            f19606d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 63;
        f19605c = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "launch - Not supported : Feature SCA Disabled");
            int i4 = f19605c + 123;
            f19606d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final CardSecureInput promptCvx2() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 19;
        f19605c = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (f.a()) {
            int i5 = f19606d + 91;
            f19605c = i5 % 128;
            if (i5 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "promptCvx2 - Not supported : Feature SCA Disabled");
                throw null;
            }
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "promptCvx2 - Not supported : Feature SCA Disabled");
        }
        int i6 = f19605c + 37;
        f19606d = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public final CardSecureInput promptExpiryDate() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19605c + 71;
        f19606d = i3 % 128;
        int i4 = i3 % 2;
        if (!(!f.a())) {
            int i5 = f19606d + 37;
            f19605c = i5 % 128;
            if (i5 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "promptExpiryDate - Not supported : Feature SCA Disabled");
                throw null;
            }
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "promptExpiryDate - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final CardSecureInput promptPan(int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f19606d + 25;
        f19605c = i5 % 128;
        int i6 = i5 % 2;
        if (f.a()) {
            int i7 = f19605c + 25;
            f19606d = i7 % 128;
            int i8 = i7 % 2;
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "promptPan - Not supported : Feature SCA Disabled");
            int i9 = f19605c + 27;
            f19606d = i9 % 128;
            int i10 = i9 % 2;
        }
        return this;
    }

    public final CardSecureInput setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f19605c + 57;
            f19606d = i3 % 128;
            int i4 = i3 % 2;
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "setActivityCallback - Not supported : Feature SCA Disabled");
            int i5 = f19606d + 117;
            f19605c = i5 % 128;
            int i6 = i5 % 2;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.ui.secureinput.CardSecureInput setAppHceServiceClass(java.lang.Class<?> r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = fr.antelop.sdk.ui.secureinput.CardSecureInput.f19606d
            int r1 = r0 + 63
            int r0 = r1 % 128
            fr.antelop.sdk.ui.secureinput.CardSecureInput.f19605c = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L19
            boolean r1 = o.ea.f.a()
            r0 = 53
            int r0 = r0 / 0
            if (r1 != 0) goto L1f
        L18:
            return r3
        L19:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L18
        L1f:
            java.lang.String r1 = "CardSecureInput"
            java.lang.String r0 = "setAppHceServiceClass - Not supported : Feature SCA Disabled"
            o.ea.f.d(r1, r0)
            int r0 = fr.antelop.sdk.ui.secureinput.CardSecureInput.f19605c
            int r1 = r0 + 109
            int r0 = r1 % 128
            fr.antelop.sdk.ui.secureinput.CardSecureInput.f19606d = r0
            int r1 = r1 % r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.secureinput.CardSecureInput.setAppHceServiceClass(java.lang.Class):fr.antelop.sdk.ui.secureinput.CardSecureInput");
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 75;
        f19605c = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19605c + 115;
            f19606d = i5 % 128;
            if (i5 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "setCustomerCredentials - Not supported : Feature SCA Disabled");
            } else {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "setCustomerCredentials - Not supported : Feature SCA Disabled");
                int i6 = 10 / 0;
            }
        }
    }

    public final void setOnlineAuthentication(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19606d + 39;
        f19605c = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19606d + 37;
            f19605c = i5 % 128;
            if (i5 % 2 != 0) {
                f.d(WalletValidationDomain.CARD_SECURE_INPUT, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f.d(WalletValidationDomain.CARD_SECURE_INPUT, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
        }
        int i6 = f19606d + 107;
        f19605c = i6 % 128;
        int i7 = i6 % 2;
    }
}
