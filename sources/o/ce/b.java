package o.ce;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import fr.antelop.sdk.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o.a.g;
import o.ea.f;
import o.ea.m;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f22175a = 0;

    /* JADX INFO: renamed from: b */
    private static char[] f22176b = null;

    /* JADX INFO: renamed from: c */
    private static char f22177c = 0;

    /* JADX INFO: renamed from: d */
    private static char f22178d = 0;

    /* JADX INFO: renamed from: e */
    private static char f22179e = 0;

    /* JADX INFO: renamed from: f */
    private static int f22180f = 0;

    /* JADX INFO: renamed from: g */
    private static int f22181g = 0;

    /* JADX INFO: renamed from: h */
    private static int f22182h = 0;

    /* JADX INFO: renamed from: i */
    private static boolean f22183i = false;

    /* JADX INFO: renamed from: j */
    private static boolean f22184j = false;

    /* JADX INFO: renamed from: l */
    private static int f22185l = 0;

    /* JADX INFO: renamed from: n */
    private static int f22186n = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            byte[] r7 = o.ce.b.$$a
            int r0 = r8 * 2
            int r6 = 3 - r0
            int r0 = r9 * 4
            int r5 = 1 - r0
            int r4 = 73 - r10
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r7 != 0) goto L27
            r0 = r5
            r1 = r2
        L13:
            int r0 = -r0
            int r4 = r4 + r0
        L15:
            int r6 = r6 + 1
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            r0 = r7[r6]
            goto L13
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ce.b.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22186n = 0;
        f22185l = 1;
        f22182h = 0;
        f22180f = 1;
        e();
        ExpandableListView.getPackedPositionForGroup(0);
        int i2 = f22185l + 113;
        f22186n = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static boolean b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22182h + 59;
        f22180f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        m((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "\u0089\u008d\u009e\u0083\u0089\u0087\u008b\u0082\u008a\u008f\u009e\u008b\u0087\u008d\u0091\u0089\u0094", objArr);
        if (((String) objArr[0]).intern().isEmpty()) {
            return false;
        }
        int i5 = f22180f + 75;
        f22182h = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static HttpsURLConnection c() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        m(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "  \u009f\u0084\u0083\u0082\u0082\u009c", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        m((ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u0089\u008d\u009e\u0083\u0089\u0087\u008b\u0082\u008a\u008f\u009e\u008b\u0087\u008d\u0091\u0089\u0094", objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        k("煃ȴ忑貁㢤㊩姁鶭迼퐩輫ꇃ覢墥έ遴\udd0c뎡", 18 - TextUtils.indexOf("", ""), objArr3);
        String string = new StringBuilder().append(strIntern).append(strIntern2).append(((String) objArr3[0]).intern()).toString();
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            m((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, null, "\u0090\u0086\u0089\u0082\u008c\u008f\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr4);
            String strIntern3 = ((String) objArr4[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            m(127 - Color.alpha(0), null, null, "\u0097\u009f\u0097\u0096\u0095\u0085\u0097\u0098\u0097\u009d\u008d¢\u008a\u0089\u0088\u0087\u008f\u008a\u0086\u008b\u0082\u008a¡\u0094\u0089\u0086\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0083\u0085\u0082\u008b\u0084", objArr5);
            f.c(strIntern3, sb.append(((String) objArr5[0]).intern()).append(string).toString());
            int i3 = f22182h + 103;
            f22180f = i3 % 128;
            int i4 = i3 % 2;
        }
        return d(new URL(string), true);
    }

    public static HttpsURLConnection c(URL url) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22182h + 121;
        f22180f = i3 % 128;
        int i4 = i3 % 2;
        try {
            return d(url, false);
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                m(127 - (Process.myPid() >> 22), null, null, "\u0090\u0086\u0089\u0082\u008c\u008f\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                k("⬲⊡څ宸輦ꟛ\ua83cᜏ탯\ud91e件쒳馾p䥖鈠餸㫋웓넞藎뀤꥟礚䛻縻혇鹚躒ﭼ剐\udfc5Ｋ攩蘵紁휹䠔䐨月䥖鈠椋ೢ\uf654睠묶֎憰褣\ua83cᜏꜱ魌济⏤ꭌ꓿\uf3cd椩ቻ찿\uf1c7ᱫ䥖鈠餸㫋웓넞藎뀤묶֎Ḥ춨\uedb8煺剐\udfc5翗\uf739\uf092丫", 83 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                f.d(strIntern, String.format(((String) objArr2[0]).intern(), e2.getClass().getSimpleName(), e2.getMessage()));
                Object[] objArr3 = new Object[1];
                m(View.MeasureSpec.getMode(0) + 127, null, null, "\u0090\u0086\u0089\u0082\u008c\u008f\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                m(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u008c\u0097\u0087\u0084\u0084\u0097\u0083\u0092\u0097\u009d\u008a\u008d\u0082\u0082\u008b\u0084\u0097\u008a\u008b\u009c\u009b\u0097\u008a\u0089\u008d\u0082\u0083\u008b\u008c\u009a\u0099\u0097\u0098\u0097\u0096\u0095\u0085\u0094\u0089\u0086\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081\u0093\u0087\u008d\u0092\u0091", objArr4);
                f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
                int i5 = f22182h + 53;
                f22180f = i5 % 128;
                int i6 = i5 % 2;
            }
            throw new d(e2.getMessage());
        }
    }

    private static HttpsURLConnection d(URL url, boolean z2) throws Throwable {
        String[] strArr;
        int length;
        int i2 = 2 % 2;
        int i3 = f22182h + 83;
        f22180f = i3 % 128;
        int i4 = i3 % 2;
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128;
        Object[] objArr = new Object[1];
        short sXd = (short) (C1607wl.Xd() ^ 30316);
        int[] iArr = new int["ϣϼϣϜϸϖϝϜϳϭϑϏώϧ".length()];
        QB qb = new QB("ϣϼϣϜϸϖϝϜϳϭϑϏώϧ");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        m(iIndexOf, null, null, new String(iArr, 0, i5), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(C1561oA.yd("津藍鎹䘙\ue986쾇", (short) (FB.Xd() ^ 24506)), KeyEvent.getDeadChar(0, 0) + 5, objArr2);
        System.setProperty(strIntern, ((String) objArr2[0]).intern());
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        if (z2) {
            int i6 = f22180f + 83;
            f22182h = i6 % 128;
            if (i6 % 2 != 0) {
                strArr = e.f19458d;
                length = strArr.length;
            } else {
                strArr = e.f19458d;
                length = strArr.length;
            }
            TrustManager[] trustManagerArr = new TrustManager[length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                Object[] objArr3 = new Object[1];
                k(C1561oA.Yd("汱茿餗뻔㢁ﶋ", (short) (Od.Xd() ^ (-17220))), View.MeasureSpec.makeMeasureSpec(0, 0) + 5, objArr3);
                Object[] objArr4 = {((String) objArr3[0]).intern()};
                Method declaredMethod = Class.forName(Xg.qd("WOeQ\u001feXWjh`lr(^aor-Cftwmkoji}oQmp\u0003~\u0003\u000b", (short) (C1580rY.Xd() ^ (-29198)), (short) (C1580rY.Xd() ^ (-22728)))).getDeclaredMethod(ZO.xd("\u0004U;Jy80\u0006\u0015\u000eu", (short) (ZN.Xd() ^ 24105), (short) (ZN.Xd() ^ 15210)), Class.forName(Jg.Wd("$7Sa5\u0006\u00122B\u0019I\n\u0013(8@", (short) (C1580rY.Xd() ^ (-26785)), (short) (C1580rY.Xd() ^ (-10864)))));
                try {
                    declaredMethod.setAccessible(true);
                    CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr4);
                    String str = strArr[i7];
                    Object[] objArr5 = new Object[1];
                    m(Process.getGidForName("") + 128, null, null, C1626yg.Ud("θ", (short) (ZN.Xd() ^ 22901), (short) (ZN.Xd() ^ 22147)), objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    k(Ig.wd("糤晴", (short) (C1580rY.Xd() ^ (-10676))), 1 - KeyEvent.keyCodeFromString(""), objArr6);
                    Object[] objArr7 = {new ByteArrayInputStream(str.replace(strIntern2, ((String) objArr6[0]).intern()).getBytes(StandardCharsets.UTF_8))};
                    Method method = Class.forName(EO.Od("`|\u0002Nt\b /\u0001{n]\u000eB\u0012w2D'V8zhc 9R.Qqx7[\f`\u0017E", (short) (FB.Xd() ^ 12087))).getMethod(C1593ug.zd("#\",$2\"6(\u0007*8;1/3.-A3", (short) (Od.Xd() ^ (-31320)), (short) (Od.Xd() ^ (-8878))), Class.forName(C1561oA.Qd("2(<&q,1n\t-.20\u000e.+\u001d\u0018#", (short) (Od.Xd() ^ (-21528)))));
                    try {
                        method.setAccessible(true);
                        X509Certificate x509Certificate = (X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr7));
                        Object[] objArr8 = new Object[0];
                        Method declaredMethod2 = Class.forName(C1561oA.od("rh|f2vgduqgqu)E^qJjdfX", (short) (Od.Xd() ^ (-19846)))).getDeclaredMethod(C1561oA.Kd("\u0016\u0015%u\u0018\u001a\u0016+#,\r3+!", (short) (C1499aX.Xd() ^ (-31566))), new Class[0]);
                        try {
                            declaredMethod2.setAccessible(true);
                            Object[] objArr9 = {(String) declaredMethod2.invoke(null, objArr8)};
                            Method declaredMethod3 = Class.forName(Wg.Zd("52L>\u0010[PSloky\u0004Fj\n!\u0001')1*", (short) (ZN.Xd() ^ 25840), (short) (ZN.Xd() ^ 9946))).getDeclaredMethod(Wg.vd("qp|Rtzxf\u0001vu", (short) (FB.Xd() ^ 8938)), Class.forName(C1561oA.Xd(".&<(u5+93z!CB:@:", (short) (C1580rY.Xd() ^ (-7730)))));
                            try {
                                declaredMethod3.setAccessible(true);
                                KeyStore keyStore = (KeyStore) declaredMethod3.invoke(null, objArr9);
                                Object[] objArr10 = {null, null};
                                Method method2 = Class.forName(Qg.kd("yo\u0004m9}nk|xnx|0LexQqkm_", (short) (ZN.Xd() ^ 24281), (short) (ZN.Xd() ^ 11))).getMethod(C1561oA.ud("\u001a\u001c\r\u000f", (short) (C1499aX.Xd() ^ (-20984))), Class.forName(hg.Vd("bXlV\"\\a\u001f9]^b`>^[MHS", (short) (C1580rY.Xd() ^ (-13996)), (short) (C1580rY.Xd() ^ (-15526)))), char[].class);
                                try {
                                    method2.setAccessible(true);
                                    method2.invoke(keyStore, objArr10);
                                    Object[] objArr11 = new Object[1];
                                    m(126 - TextUtils.indexOf((CharSequence) "", '0'), null, null, C1561oA.yd("˫˧", (short) (C1499aX.Xd() ^ (-5625))), objArr11);
                                    Object[] objArr12 = {((String) objArr11[0]).intern(), x509Certificate};
                                    Method method3 = Class.forName(C1561oA.Yd("!\u0019/\u001bh/\"!42*6<q\u0010+@\u001b=9=1", (short) (FB.Xd() ^ 29030))).getMethod(ZO.xd("S\u0003\u0004` c@Y\u0015rqDu)o\u001d\bRF", (short) (ZN.Xd() ^ 18432), (short) (ZN.Xd() ^ 9415)), Class.forName(Xg.qd("LDZF\u0014SIWQ\u0019?a`X^X", (short) (OY.Xd() ^ 2596), (short) (OY.Xd() ^ 2816))), Class.forName(Jg.Wd("\u000f;FE\u000bfpgo!\r\u0012/x(>Ax.9p\u0016\u000e\u0018\r*9+8^", (short) (C1580rY.Xd() ^ (-27824)), (short) (C1580rY.Xd() ^ (-12595)))));
                                    try {
                                        method3.setAccessible(true);
                                        method3.invoke(keyStore, objArr12);
                                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                                        trustManagerFactory.init(keyStore);
                                        trustManagerArr[i7] = new c((X509TrustManager) trustManagerFactory.getTrustManagers()[0], e.f19459e[i7], e.f19457c[i7]);
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
            httpsURLConnection.setSSLSocketFactory(new a(trustManagerArr));
        }
        Object[] objArr13 = new Object[1];
        k(C1626yg.Ud("鏁魢䷵”삚៶蝹潮틎鐁\u0cd2䳒\udae0劜", (short) (Od.Xd() ^ (-30872)), (short) (Od.Xd() ^ (-28081))), 13 - Color.green(0), objArr13);
        String strIntern3 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        k(Ig.wd("粁\ue3af\uf065쁶譯뿺療磰", (short) (ZN.Xd() ^ 25360)), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr14);
        httpsURLConnection.setRequestProperty(strIntern3, ((String) objArr14[0]).intern());
        httpsURLConnection.setUseCaches(false);
        return httpsURLConnection;
    }

    private static HttpsURLConnection e(Context context) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        m(127 - TextUtils.getTrimmedLength(""), null, null, EO.Od("ÐөЫױӲҖػ\u0081", (short) (C1607wl.Xd() ^ 1457)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(C1561oA.Qd("蚹⽚횧劉깇棋ܾ⓿쟫靦ḃ嚢悗릂\u2066難\uf8b9Ⳍ毃☻蒸Âজ\ue10a", (short) (C1580rY.Xd() ^ (-30397))), 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        String strD = m.d(context, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        m(TextUtils.indexOf("", "", 0, 0) + 127, null, null, C1593ug.zd("ͼ΅ΉΆΥΒΊΌΠΆ\u038dΌΑΉΒΘΨΑή", (short) (C1607wl.Xd() ^ 8633), (short) (C1607wl.Xd() ^ 10879)), objArr3);
        String string = new StringBuilder().append(strIntern).append(strD).append(m.d(context, ((String) objArr3[0]).intern())).toString();
        if (f.a()) {
            Object[] objArr4 = new Object[1];
            m(127 - (Process.myTid() >> 22), null, null, C1561oA.od("̠̗̘̘̏̓̑̔̈̑̏̍̌̊̈̆̄̂̀̕̚˾˼˻˹", (short) (FB.Xd() ^ 17549)), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            StringBuilder sb = new StringBuilder();
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126;
            Object[] objArr5 = new Object[1];
            short sXd = (short) (ZN.Xd() ^ 7853);
            int[] iArr = new int["ՉՒՋՋՋԼՏՑՑ\u0558Չ՟ՈՈՈՈՑՍՊՐՈաա՝ՓՑ՚\u0557\u0557՜Ւ՝՝՝՞՞՞՚՝՛ե՟".length()];
            QB qb = new QB("ՉՒՋՋՋԼՏՑՑ\u0558Չ՟ՈՈՈՈՑՍՊՐՈաա՝ՓՑ՚\u0557\u0557՜Ւ՝՝՝՞՞՞՚՝՛ե՟");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
                i4++;
            }
            m(i3, null, null, new String(iArr, 0, i4), objArr5);
            f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(string).toString());
            int i5 = f22180f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22182h = i5 % 128;
            int i6 = i5 % 2;
        }
        URL url = new URL(string);
        int scrollDefaultDelay = 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
        Object[] objArr6 = new Object[1];
        short sXd2 = (short) (Od.Xd() ^ (-1299));
        short sXd3 = (short) (Od.Xd() ^ (-24429));
        int[] iArr2 = new int["ɢ\u07b4Úܾ؞ێޝՠǘ܋ۑƒӚń".length()];
        QB qb2 = new QB("ɢ\u07b4Úܾ؞ێޝՠǘ܋ۑƒӚń");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK(((i7 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i7++;
        }
        m(scrollDefaultDelay, null, null, new String(iArr2, 0, i7), objArr6);
        String strIntern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        k(C1561oA.Xd("噶漠紊⽬틗룚", (short) (C1607wl.Xd() ^ 2560)), 5 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
        System.setProperty(strIntern3, ((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        k(Wg.vd("ᄔϛ强慟", (short) (Od.Xd() ^ (-17082))), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
        String strIntern4 = ((String) objArr8[0]).intern();
        Class<?> cls = Class.forName(Qg.kd("\u001a\u0010$\u000eY\u001e\u000f\f\u001d\u0019\u000f\u0019\u001dPl\u0006\u0019q\u0012\f\u000e\u007f", (short) (C1607wl.Xd() ^ 4882), (short) (C1607wl.Xd() ^ 4264)));
        Class<?>[] clsArr = {Class.forName(hg.Vd("&\u001c0\u001ae#\u0017#\u001b`\u0005%\"\u0018\u001c\u0014", (short) (C1607wl.Xd() ^ 31502), (short) (C1607wl.Xd() ^ 31250)))};
        Object[] objArr9 = {strIntern4};
        short sXd4 = (short) (FB.Xd() ^ 19148);
        int[] iArr3 = new int["\u001c\u0019'z\u001f##\u000f\u001b\u000f\u0010".length()];
        QB qb3 = new QB("\u001c\u0019'z\u001f##\u000f\u001b\u000f\u0010");
        int i8 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i8] = xuXd3.fK(sXd4 + i8 + xuXd3.CK(iKK3));
            i8++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i8), clsArr);
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr9);
            Object[] objArr10 = new Object[1];
            k(C1561oA.yd("\ueebe绱᭳衫", (short) (C1499aX.Xd() ^ (-2159))), (Process.myTid() >> 22) + 4, objArr10);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(((String) objArr10[0]).intern());
            trustManagerFactory.init(keyStore);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setSSLSocketFactory(new a(trustManagerFactory.getTrustManagers()));
            Object[] objArr11 = new Object[1];
            k(C1561oA.Yd("\ueacc⇵켑꧀嫈摧춭굍ᛊ쥐瞖껗䪎넛", (short) (FB.Xd() ^ 3560)), (ViewConfiguration.getTouchSlop() >> 8) + 13, objArr11);
            String strIntern5 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            k(Xg.qd("ﱒ觭陓樆溅ꋮ\udc0b崘", (short) (C1607wl.Xd() ^ 2804), (short) (C1607wl.Xd() ^ 8359)), TextUtils.indexOf((CharSequence) "", '0') + 9, objArr12);
            httpsURLConnection.setRequestProperty(strIntern5, ((String) objArr12[0]).intern());
            httpsURLConnection.setUseCaches(false);
            return httpsURLConnection;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void e() {
        f22175a = (char) 13764;
        f22179e = (char) 24706;
        f22177c = (char) 60008;
        f22178d = (char) 31941;
        f22176b = new char[]{2517, 2489, 2493, 2488, 2502, 2491, 2481, 2536, 2492, 2495, 2486, 2504, 2482, 2519, 2506, 2466, 2507, 2470, 2505, 2494, 2523, 2513, 2317, 2558, 2518, 2469, 2468, 2485, 2484, 2559, 2531, 2556, 2514, 2487, 2480, 2538, 2471, 2313, 2525};
        f22181g = 2040400173;
        f22184j = true;
        f22183i = true;
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = 114;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 37;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        if (str2 != null) {
            int i8 = i6 + 115;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i10 = $10 + 51;
            $11 = i10 % 128;
            int i11 = i10 % i3;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i12 = 58224;
            int i13 = 0;
            while (i13 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i14 = (c3 + i12) ^ ((c3 << 4) + ((char) (((long) f22177c) ^ (-7511683281764982996L))));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22178d);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 270, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), Color.argb(0, 0, 0, 0) + 11, -1995022631, false, $$c(b2, b2, (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f22175a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22179e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 270, (char) TextUtils.getTrimmedLength(""), 11 - TextUtils.indexOf("", ""), -1995022631, false, $$c(b3, b3, (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i12 -= 40503;
                    i13++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                int i16 = 271 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11;
                byte b4 = (byte) 0;
                byte b5 = b4;
                String str$$c = $$c(b4, b5, (byte) (b5 + 1));
                i3 = 2;
                objA3 = o.d.d.a(i16, threadPriority, doubleTapTimeout, -2074123590, false, str$$c, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void m(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
                bytes = str4.getBytes("ISO-8859-1");
            } else {
                bytes = str4.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f22176b;
        long j2 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.rgb(0, 0, 0) + 16777809, (char) ((Process.myTid() >> 22) + 13181), 12 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)), -1225586509, false, $$c(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $11 + 33;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f22181g)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(31 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 11 - (Process.myPid() >> 22), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f22183i) {
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i9 = $11 + 51;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 11 - TextUtils.getCapsMode("", 0, 0), -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!f22184j) {
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i11 = $11 + 1;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 1;
        } else {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 0;
        }
        while (fVar.f19922a < fVar.f19923e) {
            int i12 = $10 + 15;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a(458 - Color.argb(0, 0, 0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public final HttpsURLConnection b(Context context) throws Throwable {
        HttpsURLConnection httpsURLConnectionE;
        int i2 = 2 % 2;
        int i3 = f22180f + 115;
        f22182h = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
                if (b()) {
                    httpsURLConnectionE = c();
                }
                httpsURLConnectionE = e(context);
                int i5 = f22182h + 7;
                f22180f = i5 % 128;
                int i6 = i5 % 2;
            } else if (b()) {
                httpsURLConnectionE = c();
            } else {
                httpsURLConnectionE = e(context);
                int i52 = f22182h + 7;
                f22180f = i52 % 128;
                int i62 = i52 % 2;
            }
            Object[] objArr = new Object[1];
            k("먻\ue963鹾礬⨳㏑鴖粵\ude31颶䛻縻᧱聽", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k("ạꐻ날葒裐봸\uf654睠", 7 - MotionEvent.axisFromString(""), objArr2);
            httpsURLConnectionE.setRequestProperty(strIntern, ((String) objArr2[0]).intern());
            httpsURLConnectionE.setUseCaches(false);
            return httpsURLConnectionE;
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                m(TextUtils.indexOf("", "") + 127, null, null, "\u0090\u0086\u0089\u0082\u008c\u008f\u008e\u008a\u0089\u008d\u0082\u008c\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k("⬲⊡څ宸輦ꟛ\ua83cᜏ탯\ud91e件쒳馾p䥖鈠餸㫋웓넞藎뀤묶֎昶ᡨ᱉鉂⧱\uee52\uefa5ܒ藎뀤묶֎齽驇ж䨙\uf3cd椩洬⏤䐨月럙㹲盎땐屇瘘飘꣯幻傌\udb4fቡ\udc9d\u2456\ue402\ud988䐨月䥖鈠", 66 - TextUtils.indexOf("", "", 0, 0), objArr4);
                f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
            }
            throw new d(e2.getMessage());
        }
    }
}
