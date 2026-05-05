package com.incode.welcome_sdk.commons.utils;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkUtils {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f6320a = 0;

    /* JADX INFO: renamed from: b */
    private static int f6321b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6322c = 0;

    /* JADX INFO: renamed from: d */
    private static int f6323d = 0;

    /* JADX INFO: renamed from: e */
    private static long f6324e = 0;
    private static boolean isCertificateValid = false;
    public static boolean isSSLPinningFailedCallbackTriggered = false;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, short r8, int r9) {
        /*
            int r0 = r7 * 2
            int r7 = 119 - r0
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r0 = r9 + 4
            byte[] r6 = com.incode.welcome_sdk.commons.utils.NetworkUtils.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2b
            r7 = r3
            r2 = r0
            r1 = r4
        L16:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r2
        L19:
            int r2 = r0 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r2]
            int r1 = r1 + 1
            goto L16
        L2b:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.NetworkUtils.$$c(byte, short, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{32, MessagePack.Code.BIN32, -29, Ascii.ETB};
        $$b = 227;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f6321b = 0;
        f6320a = 1;
        f6322c = 0;
        f6323d = 1;
        a();
        isCertificateValid = true;
        isSSLPinningFailedCallbackTriggered = false;
        int i2 = f6320a + 27;
        f6321b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static boolean hasToUseSecuredNetwork() {
        int i2 = 2 % 2;
        IncodeWelcome incodeWelcome = IncodeWelcome.getInstance();
        if (incodeWelcome.isSSLPinningEnabled()) {
            int i3 = f6323d + 33;
            f6322c = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsForceSSLPinning = incodeWelcome.isForceSSLPinning();
            if (i4 != 0) {
                int i5 = 48 / 0;
                if (zIsForceSSLPinning) {
                    return true;
                }
            } else if (zIsForceSSLPinning) {
                return true;
            }
            if (isCertificateValid) {
                return true;
            }
        }
        int i6 = f6322c + 41;
        f6323d = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean hasToTriggerCallback() {
        int i2 = 2 % 2;
        if (!IncodeWelcome.getInstance().isSSLPinningEnabled()) {
            return false;
        }
        int i3 = f6323d + 87;
        int i4 = i3 % 128;
        f6322c = i4;
        int i5 = i3 % 2;
        if (isCertificateValid) {
            return false;
        }
        int i6 = i4 + 123;
        f6323d = i6 % 128;
        if (i6 % 2 != 0) {
            return !isSSLPinningFailedCallbackTriggered;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean hasToTriggerCallbackAndProceedWithError() {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.utils.NetworkUtils.f6322c
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.NetworkUtils.f6323d = r0
            int r1 = r1 % r4
            r3 = 0
            r2 = 1
            if (r1 != 0) goto L2f
            boolean r1 = hasToTriggerCallback()
            r0 = 37
            int r0 = r0 / r3
            if (r1 == 0) goto L39
        L19:
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r0 = r0.isForceSSLPinning()
            if (r0 == 0) goto L39
            int r0 = com.incode.welcome_sdk.commons.utils.NetworkUtils.f6323d
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.NetworkUtils.f6322c = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L37
            return r2
        L2f:
            boolean r0 = hasToTriggerCallback()
            r0 = r0 ^ r2
            if (r0 == r2) goto L39
            goto L19
        L37:
            r0 = 0
            throw r0
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.NetworkUtils.hasToTriggerCallbackAndProceedWithError():boolean");
    }

    public static void enableSSLPinning(OkHttpClient.Builder builder, String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            String host = new URL(str).getHost();
            CertificatePinner.Builder builder2 = new CertificatePinner.Builder();
            Object[] objArr = new Object[1];
            f("䒉䓺Ꭰㆎ鯧ᰫ\udf0a立춤髦噬\uf383园ֈ촵敍\udfab豫䑼ṁ悜睤\uf324靳\ue9c1﹘榠ࠌ牞椽\ue0bd脣ﭕ퀷龱㨇మ媾ᛒ돈锴엛跷ⓕḴ䳈ӗ\udd99ꃠ㞉댂嚙⧮뺱⩶", Process.myPid() >> 22, objArr);
            builder.certificatePinner(builder2.add(host, ((String) objArr[0]).intern()).build());
            int i3 = f6322c + 51;
            f6323d = i3 % 128;
            int i4 = i3 % 2;
        } catch (MalformedURLException e2) {
            Timber.e(e2);
        }
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 51;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = str2;
        if (str2 != null) {
            int i7 = i5 + 107;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str2.toCharArray();
            int i9 = $11 + 11;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            obj = charArray;
        }
        com.c.a.k kVar = new com.c.a.k();
        char[] cArrE = com.c.a.k.e(f6324e ^ (-3501477462694648052L), (char[]) obj, i2);
        kVar.f2772b = 4;
        while (kVar.f2772b < cArrE.length) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            kVar.f2773d = kVar.f2772b - 4;
            int i13 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f6324e)};
                Object objC = com.c.a.e.e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = com.c.a.e.e.e((char) (91 - ((byte) KeyEvent.getModifierMetaStateMask())), 20 - Drawable.resolveOpacity(0, 0), 1107 - TextUtils.getTrimmedLength(""), 1223194345, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i13] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = com.c.a.e.e.c(-727400358);
                if (objC2 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iRed = Color.red(0) + 20;
                    int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1282;
                    byte b4 = (byte) ($$b & 5);
                    byte b5 = (byte) (b4 - 1);
                    objC2 = com.c.a.e.e.e(cKeyCodeFromString, iRed, i14, -734084573, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
                int i15 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrE, 4, cArrE.length - 4);
    }

    static /* synthetic */ void lambda$validateSslCertificate$0(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6323d + 11;
        f6322c = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                isCertificateValid = validateSslCertificateWithExceptions(str);
                int i4 = f6323d + 121;
                f6322c = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            isCertificateValid = validateSslCertificateWithExceptions(str);
            throw null;
        } catch (Exception e2) {
            isCertificateValid = false;
            Object[] objArr = new Object[1];
            f("⠬⡺챨\uee4f㣵ྟ簕椤ꅐ䕰\uf525\ue010㩟\uda5c渻盩덄召\ue701වఴꢊ偼蓝蔠↘쪞ᮻẆ뚹䏌銎鞨ཱྀ㲬⦀悟蔺뗘ꁪ撚ᩫ⺱㜐犯", ViewConfiguration.getScrollBarSize() >> 8, objArr);
            Timber.i(((String) objArr[0]).intern(), e2.getClass().getCanonicalName(), e2.getMessage());
        }
    }

    public static void validateSslCertificate(final String str) {
        int i2 = 2 % 2;
        new Thread(new Runnable() { // from class: com.incode.welcome_sdk.commons.utils.NetworkUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                NetworkUtils.lambda$validateSslCertificate$0(str);
            }
        }).start();
        int i3 = f6323d + 5;
        f6322c = i3 % 128;
        int i4 = i3 % 2;
    }

    private static boolean validateSslCertificateWithExceptions(String str) throws Exception {
        int i2 = 2 % 2;
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        Object[] objArr = new Object[1];
        f("\udaf5\udab2苐ꃓ〃\u07b3瓛", Process.myTid() >> 22, objArr);
        httpsURLConnection.setRequestMethod(((String) objArr[0]).intern());
        httpsURLConnection.setConnectTimeout(5000);
        Callback.connect((URLConnection) httpsURLConnection);
        Certificate certificate = httpsURLConnection.getServerCertificates()[0];
        if (!(!(certificate instanceof X509Certificate))) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            String strBase64 = CertificatePinner.sha256Hash(x509Certificate).base64();
            Object[] objArr2 = new Object[1];
            f("䒉䓺Ꭰㆎ鯧ᰫ\udf0a立춤髦噬\uf383园ֈ촵敍\udfab豫䑼ṁ悜睤\uf324靳\ue9c1﹘榠ࠌ牞椽\ue0bd脣ﭕ퀷龱㨇మ媾ᛒ돈锴엛跷ⓕḴ䳈ӗ\udd99ꃠ㞉댂嚙⧮뺱⩶", ViewConfiguration.getLongPressTimeout() >> 16, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            f("ൊഹ湸䱖眿葉㏒龎葧\ue73e몴", (-1) - ImageFormat.getBitsPerPixel(0), objArr3);
            if (strBase64.equals(strIntern.replace(((String) objArr3[0]).intern(), ""))) {
                x509Certificate.checkValidity();
                printX509CertificateDetail(x509Certificate);
                int i3 = f6323d + 3;
                f6322c = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = f6322c + 101;
            f6323d = i5 % 128;
            int i6 = i5 % 2;
        }
        return false;
    }

    public static void printX509CertificateDetail(X509Certificate x509Certificate) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6323d + 79;
        f6322c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("呗吁뾂鶥⸿᪹櫟簂\udd2b㚚\ue3ef\uf536䘤ꦶ磱描켿\u2006\uf1cbᣰ灂\udb61䚹釮樓副\udc1bື抉앉唃蟾\ueb8c", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr);
        Timber.i(((String) objArr[0]).intern(), x509Certificate.getSubjectX500Principal().toString());
        Object[] objArr2 = new Object[1];
        f("⦀⧖\ue336섑荞啋잾㏰ꃼ樮于뫄㯳\uf502햐ⰽ단粲岪團ඓ蟄\uebc7\ude1c蒊ຏ焞䅏Ἢ駧\uf867졚", Color.red(0), objArr2);
        Timber.i(((String) objArr2[0]).intern(), x509Certificate.getIssuerDN().toString());
        Object[] objArr3 = new Object[1];
        f("\ue4cd\ue49b铠뛇\ue6bc蜙ꉜ\ue1a2涱᷸⭬梖\uf6be苔끲\ufe6f羥\u0b64㥈蕍샂\uf015蹰౪䧓礍ᓝ錡퉧\uee31鶅ᨈ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr3);
        Timber.i(((String) objArr3[0]).intern(), x509Certificate.getNotAfter().toString());
        Object[] objArr4 = new Object[1];
        f("瞬矺㷏Ῠ繡另㪁㕝ﻐ듗뎱뱩旟⯻⢯⪐\uecc4ꉋꆕ冲厣夺ᚭ\ud896\udab1퀰谊䟞䅙䜄՝캡졷", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr4);
        Timber.i(((String) objArr4[0]).intern(), x509Certificate.getNotBefore().toString());
        int i5 = f6322c + 91;
        f6323d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void a() {
        f6324e = -1301448054535060150L;
    }
}
