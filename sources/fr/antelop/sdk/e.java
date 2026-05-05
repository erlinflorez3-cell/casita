package fr.antelop.sdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.q;
import o.d.d;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f19456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f19457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f19458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f19459e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19460h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19461i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f19462j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, int r10) {
        /*
            int r0 = r8 * 7
            int r8 = 78 - r0
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.sdk.e.$$a
            int r0 = r10 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2a
            r2 = r5
            r1 = r3
        L15:
            int r8 = r8 + r5
            int r5 = r2 + 1
        L18:
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r1 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r6[r5]
            r2 = r5
            r5 = r0
            goto L15
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.e.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19461i = 0;
        f19460h = 1;
        a();
        Object[] objArr = new Object[1];
        f("嗞\ue02e㸧琤舺\ud82aᘸ갮僧〾个萁", Color.red(0) + 46589, objArr);
        f19455a = new String[]{((String) objArr[0]).intern()};
        f19456b = new String[0];
        f19458d = new String[]{"-----BEGIN CERTIFICATE-----$MIIFDjCCA/agAwIBAgIMDulMwwAAAABR03eFMA0GCSqGSIb3DQEBCwUAMIG+MQsw$CQYDVQQGEwJVUzEWMBQGA1UEChMNRW50cnVzdCwgSW5jLjEoMCYGA1UECxMfU2Vl$IHd3dy5lbnRydXN0Lm5ldC9sZWdhbC10ZXJtczE5MDcGA1UECxMwKGMpIDIwMDkg$RW50cnVzdCwgSW5jLiAtIGZvciBhdXRob3JpemVkIHVzZSBvbmx5MTIwMAYDVQQD$EylFbnRydXN0IFJvb3QgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkgLSBHMjAeFw0x$NTEwMDUxOTEzNTZaFw0zMDEyMDUxOTQzNTZaMIG6MQswCQYDVQQGEwJVUzEWMBQG$A1UEChMNRW50cnVzdCwgSW5jLjEoMCYGA1UECxMfU2VlIHd3dy5lbnRydXN0Lm5l$dC9sZWdhbC10ZXJtczE5MDcGA1UECxMwKGMpIDIwMTIgRW50cnVzdCwgSW5jLiAt$IGZvciBhdXRob3JpemVkIHVzZSBvbmx5MS4wLAYDVQQDEyVFbnRydXN0IENlcnRp$ZmljYXRpb24gQXV0aG9yaXR5IC0gTDFLMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A$MIIBCgKCAQEA2j+W0E25L0Tn2zlem1DuXKVh2kFnUwmqAJqOV38pa9vH4SEkqjrQ$jUcj0u1yFvCRIdJdt7hLqIOPt5EyaM/OJZMssn2XyP7BtBe6CZ4DkJN7fEmDImiK$m95HwzGYei59QAvS7z7Tsoyqj0ip/wDoKVgG97aTWpRzJiatWA7lQrjV6nN5ZGhT$JbiEz5R6rgZFDKNrTdDGvuoYpDbwkrK6HIiPOlJ/915tgxyd8B/lw9bdpXiSPbBt$LOrJz5RBGXFEaLpHPATpXbo+8DX3Fbae8i4VHj9HyMg4p3NFXU2wO7GOFyk36t0F$ASK7lDYqjVs1/lMZLwhGwSqzGmIdTivZGwIDAQABo4IBDDCCAQgwDgYDVR0PAQH/$BAQDAgEGMBIGA1UdEwEB/wQIMAYBAf8CAQAwMwYIKwYBBQUHAQEEJzAlMCMGCCsG$AQUFBzABhhdodHRwOi8vb2NzcC5lbnRydXN0Lm5ldDAwBgNVHR8EKTAnMCWgI6Ah$hh9odHRwOi8vY3JsLmVudHJ1c3QubmV0L2cyY2EuY3JsMDsGA1UdIAQ0MDIwMAYE$VR0gADAoMCYGCCsGAQUFBwIBFhpodHRwOi8vd3d3LmVudHJ1c3QubmV0L3JwYTAd$BgNVHQ4EFgQUgqJwdN28Uz/Pe9T3zX+nYMYKTL8wHwYDVR0jBBgwFoAUanImetAe$733nO2lR1GyNn5ASZqswDQYJKoZIhvcNAQELBQADggEBADnVjpiDYcgsY9NwHRkw$y/YJrMxp1cncN0HyMg/vdMNY9ngnCTQIlZIv19+4o/0OgemknNM/TWgrFTEKFcxS$BJPok1DD2bHi4Wi3Ogl08TRYCj93mEC45mj/XeTIRsXsgdfJghhcg85x2Ly/rJkC$k9uUmITSnKa1/ly78EqvIazCP0kkZ9Yujs+szGQVGHLlbHfTUqi53Y2sAEo1GdRv$c6N172tkw+CNgxKhiucOhk3YtCAbvmqljEtoZuMrx1gL+1YQ1JH7HdMxWBCMRON1$exCdtTix9qrKgWRs6PLigVWXUX/hwidQosk8WwBD9lu51aX8/wdQQGcHsFXwt35u$Lcw=$-----END CERTIFICATE-----$"};
        f19459e = new String[]{"*.antelop.io"};
        f19457c = new String[]{"Entrust"};
        int i2 = f19461i + 99;
        f19460h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void a() {
        f19462j = 6033041888453941461L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i6 = $11 + 25;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (qVar.f19948a < cArr.length) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = d.a(-1011865131);
                    if (objA == null) {
                        int pressedStateDuration = 731 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        char scrollBarFadeDuration = (char) (7933 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iAlpha = Color.alpha(0) + 11;
                        byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(pressedStateDuration, scrollBarFadeDuration, iAlpha, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i9] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() | (f19462j - 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(835 - Process.getGidForName(""), (char) (27279 - (ViewConfiguration.getEdgeSlop() >> 16)), View.combineMeasuredStates(0, 0) + 11, -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = d.a(-1011865131);
                if (objA3 == null) {
                    int iAxisFromString = MotionEvent.axisFromString("") + 732;
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7932);
                    int packedPositionType = 11 - ExpandableListView.getPackedPositionType(0L);
                    int i11 = $$b;
                    byte b6 = (byte) ((i11 + 5) - (i11 | 5));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(iAxisFromString, c2, packedPositionType, 355847088, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f19462j ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a(Drawable.resolveOpacity(0, 0) + 836, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27279), Drawable.resolveOpacity(0, 0) + 11, -2145994442, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        int i12 = $11 + 63;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = d.a(1452497747);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = d.a(Color.green(0) + 836, (char) (27280 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 11, -2145994442, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str3 = new String(cArr2);
        int i14 = $11 + 37;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i15 = 4 / 0;
            objArr[0] = str3;
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, -5, 39, 97};
        $$b = 251;
    }
}
