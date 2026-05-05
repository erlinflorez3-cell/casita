package com.valid.communication.managers.certificatemanager;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.valid.communication.a;
import com.valid.communication.e;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.VolleyManager;
import com.valid.communication.managers.httprequestmanager.HttpRequestManager;
import com.valid.communication.models.CertificateModel;
import com.valid.communication.models.ErrorData;
import com.valid.communication.models.GetCertificatesResponse;
import com.valid.communication.models.KeyEntity;
import com.valid.communication.models.StringCertificateModel;
import com.valid.security.entities.TransformRsa;
import com.valid.security.managers.RsaCrypto;
import com.valid.security.managers.VsshCryptoLargeManager;
import com.valid.utils.VsshLogger;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes5.dex */
public class CertificateManagerImp implements CertificateManager {
    private static final String TAG = Jg.Wd("a L7.G|(QE)c\u0014Bx\u001cEm\u0016Wz+XF8Z\u00163g\u0010Kz_Cs3c\u0007._\b0q\u0011Ce!Fz'^H\fX\u0014Dc\u000f<l\u0019Vu\fJ\u0006'W\u0004?H\u001bL", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1618535966 ^ (-663033942)))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1770493725 ^ 706525124))));
    private List<CertificateModel> certificates;
    private VsshCryptoLargeManager cryptoLargeRsa;
    private Context mContext;
    private KeyEntity mKeyEntity;
    private HttpRequestManager requestManager;

    public class IOException extends RuntimeException {
    }

    public CertificateManagerImp(Context context, HttpRequestManager httpRequestManager) {
        this(context, httpRequestManager, null);
    }

    public CertificateManagerImp(Context context, HttpRequestManager httpRequestManager, KeyEntity keyEntity) {
        this.requestManager = httpRequestManager;
        this.mContext = context;
        this.mKeyEntity = keyEntity;
        this.cryptoLargeRsa = new RsaCrypto();
    }

    private final void generateCertificateList(List<CertificateModel> list, List<StringCertificateModel> list2, StringBuilder sb) throws CertificateException {
        StringCertificateModel stringCertificateModel;
        StringBuilder sbAppend;
        int iXd;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        for (StringCertificateModel stringCertificateModel2 : list2) {
            String strXd = ZO.xd("F", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1011233013 ^ (-1209478455)))), (short) (ZN.Xd() ^ ((1035789725 ^ 1755548899) ^ 1428116271)));
            int i8 = Integer.parseInt(strXd);
            char cCharAt = 1;
            short sXd = (short) (C1607wl.Xd() ^ (2143863105 ^ 2143854241));
            short sXd2 = (short) (C1607wl.Xd() ^ ((1435751962 ^ 904617274) ^ 1618526090));
            int[] iArr = new int["\u000b".length()];
            QB qb = new QB("\u000b");
            int i9 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i9] = xuXd.fK((C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i9 * sXd2))) + xuXd.CK(iKK));
                i9++;
            }
            String str2 = new String(iArr, 0, i9);
            CertificateModel certificateModel = null;
            if (i8 != 0) {
                iXd = ZN.Xd() ^ (1855584873 ^ 1561576596);
                str = strXd;
                stringCertificateModel = null;
                sbAppend = null;
            } else {
                stringCertificateModel = stringCertificateModel2;
                sbAppend = sb.append(a.startsWith(Ig.wd("\u0011Y6\fPv\r<V\"$k\u0016P1", (short) (OY.Xd() ^ (237709794 ^ 237730592))), 1));
                iXd = 6;
                str = str2;
            }
            if (iXd != 0) {
                sbAppend = sbAppend.append(stringCertificateModel.getDomainServer());
                str = strXd;
                i2 = 0;
            } else {
                i2 = iXd + 6;
            }
            if (Integer.parseInt(str) != 0) {
                i3 = i2 + 4;
            } else {
                int iXd2 = C1633zX.Xd() ^ (-1951491128);
                short sXd3 = (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951498057));
                int[] iArr2 = new int["]\u001c\u007fi2\u000fdkM\u0004\u001e4'".length()];
                QB qb2 = new QB("]\u001c\u007fi2\u000fdkM\u0004\u001e4'");
                int i10 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i10] = xuXd2.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i10)) + xuXd2.CK(iKK2));
                    i10++;
                }
                sbAppend = sb.append(e.concat(iXd2, new String(iArr2, 0, i10)));
                i3 = i2 + 11;
                str = str2;
            }
            if (i3 != 0) {
                sbAppend = sbAppend.append(stringCertificateModel.getCertificate());
                str = strXd;
                i4 = 0;
            } else {
                i4 = i3 + 7;
                int iXd3 = (OY.Xd() ^ (1428855995 ^ 1359058010)) / 42;
            }
            int i11 = Integer.parseInt(str);
            String strQd = C1561oA.Qd("8", (short) (C1499aX.Xd() ^ (1190218219 ^ (-1190216003))));
            if (i11 != 0) {
                i5 = i4 + 5;
                str2 = str;
            } else {
                cCharAt = strQd.charAt(0);
                i5 = i4 + 4;
            }
            if (i5 != 0) {
                sbAppend = sbAppend.append(cCharAt);
                i6 = 0;
            } else {
                i6 = i5 + 6;
                strXd = str2;
                strQd = null;
            }
            if (Integer.parseInt(strXd) != 0) {
                i7 = i6 + 10;
            } else {
                sbAppend.append(strQd.charAt(0));
                i7 = i6 + 9;
            }
            if (i7 != 0) {
                certificateModel = new CertificateModel(generateCertificates(stringCertificateModel), stringCertificateModel.getDomainServer());
            }
            list.add(certificateModel);
        }
    }

    private final Certificate generateCertificates(StringCertificateModel stringCertificateModel) throws Throwable {
        TransformRsa transformRsa;
        List<String> certificate;
        int i2;
        String str;
        int i3;
        PublicKey publicKey;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        VsshCryptoLargeManager vsshCryptoLargeManager = this.cryptoLargeRsa;
        short sXd = (short) (FB.Xd() ^ ((1804907169 ^ 374079767) ^ 2111340928));
        short sXd2 = (short) (FB.Xd() ^ ((677045576 ^ 526298249) ^ 923022797));
        int[] iArr = new int[ExifInterface.GPS_MEASUREMENT_INTERRUPTED.length()];
        QB qb = new QB(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        int i17 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i17] = xuXd.fK((xuXd.CK(iKK) - (sXd + i17)) - sXd2);
            i17++;
        }
        String str3 = new String(iArr, 0, i17);
        int i18 = Integer.parseInt(str3);
        String str4 = null;
        String strOd = C1561oA.od("\\]", (short) (OY.Xd() ^ (ZN.Xd() ^ (146425856 ^ 993023887))));
        if (i18 != 0) {
            str = str3;
            i2 = 6;
            certificate = null;
            transformRsa = null;
        } else {
            transformRsa = TransformRsa.PKCS1;
            certificate = stringCertificateModel.getCertificate();
            i2 = 1810933106 ^ 1810933117;
            str = strOd;
        }
        int i19 = 0;
        if (i2 != 0) {
            publicKey = this.mKeyEntity.getmServerPubKey();
            str = str3;
            i3 = 0;
        } else {
            i3 = i2 + 6;
            publicKey = null;
        }
        int i20 = (1288884358 ^ 424703429) ^ 1434625354;
        if (Integer.parseInt(str) != 0) {
            i4 = i3 + i20;
            str2 = null;
        } else {
            byte[] bArrDecryptLargeRsa = vsshCryptoLargeManager.decryptLargeRsa(transformRsa, certificate, publicKey);
            int i21 = 977081392 ^ 977081394;
            short sXd3 = (short) (C1580rY.Xd() ^ (1684665948 ^ (-1684651007)));
            int[] iArr2 = new int["6;5\u0014\u001b".length()];
            QB qb2 = new QB("6;5\u0014\u001b");
            int i22 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i22] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i22));
                i22++;
            }
            str2 = new String(bArrDecryptLargeRsa, Charset.forName(e.concat(i21, new String(iArr2, 0, i22))));
            i4 = i3 + i20;
            str = strOd;
        }
        if (i4 != 0) {
            str4 = str2;
            str = str3;
            i5 = 0;
            str2 = Wg.Zd("Jw\u0018\u0014\u0019", (short) (C1499aX.Xd() ^ ((1971385193 ^ 824769221) ^ (-1151883498))), (short) (C1499aX.Xd() ^ (446238836 ^ (-446253167))));
            i6 = i20;
        } else {
            i5 = i4 + 13;
            i6 = 0;
        }
        int i23 = (2036728523 ^ 146883658) ^ 1906787973;
        int i24 = 1;
        if (Integer.parseInt(str) != 0) {
            i8 = i5 + 12;
            i7 = 1;
        } else {
            i7 = i6 + i6;
            i8 = i5 + i23;
            str = strOd;
        }
        if (i8 != 0) {
            i10 = i7 + i7;
            str = str3;
            i9 = 0;
        } else {
            i9 = i8 + 6;
            i10 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i12 = i9 + 6;
            i11 = 1;
            i13 = 1;
        } else {
            i11 = i6 + i7 + i10;
            i12 = i9 + 13;
            i13 = 641833957 ^ 641833958;
            str = strOd;
        }
        if (i12 != 0) {
            i15 = i13 + i13;
            str = str3;
            i14 = 0;
        } else {
            i14 = i12 + i23;
            i15 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i16 = i14 + i20;
            strOd = str;
        } else {
            i11 += i13 + i15;
            i16 = i14 + 8;
            i19 = i20;
        }
        if (i16 != 0) {
            i24 = i19 + i19;
        } else {
            str3 = strOd;
        }
        if (Integer.parseInt(str3) == 0) {
            str2 = a.startsWith(str2, i11 / (i19 + i24));
        }
        short sXd4 = (short) (C1607wl.Xd() ^ ((1043829863 ^ 852046525) ^ 218027623));
        int[] iArr3 = new int["\u001a\u0012(\u0014a(\u001b\u001a-+#/5j!$25o\u0006)7:0.2-,@2\u001403EAEM".length()];
        QB qb3 = new QB("\u001a\u0012(\u0014a(\u001b\u001a-+#/5j!$25o\u0006)7:0.2-,@2\u001403EAEM");
        int i25 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i25] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i25));
            i25++;
        }
        Object[] objArr = {str2};
        Method declaredMethod = Class.forName(new String(iArr3, 0, i25)).getDeclaredMethod(Qg.kd("khvJnrr^j^_", (short) (OY.Xd() ^ (Od.Xd() ^ (352902154 ^ 1391792111))), (short) (OY.Xd() ^ ((1424308092 ^ 1521370190) ^ 239824148))), Class.forName(Wg.vd("KCUA\u0013RDRP\u0018:\\_WYS", (short) (FB.Xd() ^ ((1724624993 ^ 1448183525) ^ 815415642)))));
        try {
            declaredMethod.setAccessible(true);
            CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str4.getBytes(Charset.forName(a.startsWith(hg.Vd("2A?\tE", (short) (OY.Xd() ^ (1966289995 ^ 1966299411)), (short) (OY.Xd() ^ (1626006377 ^ 1625995963))), i23))));
            short sXd5 = (short) (FB.Xd() ^ ((1693605430 ^ 233264042) ^ 1762987677));
            int[] iArr4 = new int["^ThR\u001ebSPa]S]a\u0015IJVW\u0010$EQRFBD=:L<\u001c67GACI".length()];
            QB qb4 = new QB("^ThR\u001ebSPa]S]a\u0015IJVW\u0010$EQRFBD=:L<\u001c67GACI");
            int i26 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i26] = xuXd4.fK(sXd5 + i26 + xuXd4.CK(iKK4));
                i26++;
            }
            Object[] objArr2 = {byteArrayInputStream};
            Method method = Class.forName(new String(iArr4, 0, i26)).getMethod(C1561oA.Yd("\u0014\u0013\u001d\u0015#\u0013'\u0019w\u001b),\" $\u001f\u001e2$", (short) (OY.Xd() ^ (596609881 ^ 596608896))), Class.forName(C1561oA.yd("\r\u0003\u001b\u0005T\u000f\u0018Uc\b\r\u0011\u0013p\u0015\u0012\u0018\u0013\"", (short) (C1607wl.Xd() ^ (362127895 ^ 362146340)))));
            try {
                method.setAccessible(true);
                return (Certificate) method.invoke(certificateFactory, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final void publishError() {
        ErrorData errorData;
        int iXd;
        String strWd;
        int i2;
        int i3;
        BaseErrorEvent baseErrorEvent = new BaseErrorEvent();
        short sXd = (short) (C1633zX.Xd() ^ ((345889865 ^ 94505995) ^ (-289381688)));
        short sXd2 = (short) (C1633zX.Xd() ^ ((2096756799 ^ 1331404054) ^ (-866259700)));
        int[] iArr = new int[".".length()];
        QB qb = new QB(".");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
            i4++;
        }
        String str = new String(iArr, 0, i4);
        if (Integer.parseInt(str) != 0) {
            strWd = str;
            iXd = 9;
            baseErrorEvent = null;
            errorData = null;
        } else {
            errorData = new ErrorData();
            iXd = C1580rY.Xd() ^ (12511039 ^ (-825750315));
            strWd = Jg.Wd("\u0002N", (short) (Od.Xd() ^ (1314411348 ^ (-1314422335))), (short) (Od.Xd() ^ ((1400325732 ^ 1692975881) ^ (-933207350))));
        }
        if (iXd != 0) {
            errorData.setErrorType((1673034803 ^ 793546142) ^ (-1291121248));
            i2 = 0;
        } else {
            i2 = iXd + 9;
            errorData = null;
            str = strWd;
        }
        if (Integer.parseInt(str) != 0) {
            i3 = i2 + 9;
        } else {
            errorData.setMessage(a.startsWith(ZO.xd(")eW-RQ,P(fV\u001a&m%\u0006T1^\u000e{.wuB\u001el}H\u007f6*`e\u0018\u0005\u0017x4\u0011$", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1776920777 ^ (-906418420)))), (short) (C1499aX.Xd() ^ (88999847 ^ (-89002824)))), 338399704 ^ 338399710));
            i3 = i2 + 10;
        }
        if (i3 != 0) {
            baseErrorEvent.setErrorData(errorData);
        }
        this.requestManager.publishEvent(null, baseErrorEvent);
    }

    private final void setCertificates(List<CertificateModel> list) {
        try {
            this.certificates = list;
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.certificatemanager.CertificateManager
    public void enableSslPinning(boolean z2) throws Throwable {
        List<CertificateModel> list;
        if (!z2 || (list = this.certificates) == null) {
            VolleyManager.getInstance(this.mContext).newRequestQueue();
            return;
        }
        try {
            setSslContext(list);
        } catch (java.io.IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
    }

    public List<CertificateModel> getCertificates() {
        return this.certificates;
    }

    @Override // com.valid.communication.managers.certificatemanager.CertificateManager
    public void getCertificates(String str) {
        int iXd;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        StringBuilder sb = new StringBuilder();
        String strUd = C1626yg.Ud("'", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1728301339 ^ 614004350))), (short) (Od.Xd() ^ (962816275 ^ (-962803382))));
        int i9 = Integer.parseInt(strUd);
        String strWd = Ig.wd("\u000fS", (short) (Od.Xd() ^ (1017024842 ^ (-1017040999))));
        int iXd2 = C1580rY.Xd() ^ (431507838 ^ (-674323824));
        if (i9 != 0) {
            str2 = strUd;
            iXd = 4;
            i2 = 0;
        } else {
            sb = sb.append(str);
            iXd = Od.Xd() ^ (820756154 ^ 1997941480);
            str2 = strWd;
            i2 = iXd2;
        }
        int i10 = (1846677085 ^ 1841911034) ^ 64707246;
        int i11 = 1;
        if (iXd != 0) {
            i4 = i2 * i10;
            str2 = strUd;
            i5 = 4;
            i3 = 0;
        } else {
            i3 = iXd + 8;
            i4 = 1;
            i5 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i6 = i3 + 10;
            strWd = str2;
        } else {
            i11 = i5 + i5;
            i6 = i3 + iXd2;
        }
        if (i6 != 0) {
            i4 += i5 + i11;
            i7 = 0;
        } else {
            i7 = i6 + 10;
            strUd = strWd;
            i10 = 0;
        }
        if (Integer.parseInt(strUd) != 0) {
            i8 = i7 + 4;
        } else {
            i4 /= i10 << 2;
            i8 = i7 + 12;
        }
        if (i8 != 0) {
            sb = sb.append(e.concat(i4, EO.Od("Go>\u0007#6$=r\u001clGmC|\u001aTPau,dz=W", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609520916))))));
        }
        String string = sb.toString();
        HttpRequestManager httpRequestManager = this.requestManager;
        if (httpRequestManager != null) {
            httpRequestManager.consumeWebService(0, string, null, null);
        }
    }

    @Override // com.valid.communication.managers.certificatemanager.CertificateManager
    public void processPinningCertificate(String str) {
        Gson gson;
        ArrayList arrayList = new ArrayList();
        short sXd = (short) (Od.Xd() ^ ((1634868073 ^ 1174722788) ^ (-662078252)));
        int[] iArr = new int["\b".length()];
        QB qb = new QB("\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        if (Integer.parseInt(new String(iArr, 0, i2)) != 0) {
            gson = null;
            arrayList = null;
        } else {
            gson = new Gson();
        }
        GetCertificatesResponse getCertificatesResponse = (GetCertificatesResponse) gson.fromJson(str, GetCertificatesResponse.class);
        if (getCertificatesResponse == null) {
            publishError();
            return;
        }
        try {
            generateCertificateList(arrayList, getCertificatesResponse.getCertificates(), new StringBuilder());
            setCertificates(arrayList);
            setSslContext(arrayList);
        } catch (java.io.IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            publishError();
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
    }

    @Override // com.valid.communication.managers.certificatemanager.CertificateManager
    public void publishSuccess() {
        BaseSuccessEvent baseSuccessEvent = new BaseSuccessEvent();
        if (Integer.parseInt(C1593ug.zd(ExifInterface.LONGITUDE_WEST, (short) (C1607wl.Xd() ^ ((1366453205 ^ 1297853461) ^ 472511716)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849959200)))) != 0) {
            baseSuccessEvent = null;
        } else {
            baseSuccessEvent.setResponse(a.startsWith(C1561oA.od("G\u000fKO\u000f\u001b\u0016\n\u0002:=W9NRJ\u0004OP)9~\t\u0004\u0003s;+('k*8.+@=8iy?y`/^fl0\u001ega\u0019/+\u0017g\u001e&f_ \u0010`JNOK\\\u0013\u0002\u000b\u0007>\u0006F?@\u0010\u0011", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609524896)))), (334170881 ^ 1021897104) ^ 788783765));
        }
        this.requestManager.publishEvent(baseSuccessEvent, null);
    }

    @Override // com.valid.communication.managers.certificatemanager.CertificateManager
    public void setSslContext(List<CertificateModel> list) throws Throwable {
        KeyStore keyStore;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        String strConcat;
        int i7;
        Class<?> cls = Class.forName(C1561oA.Kd("\n\u0002\u0018\u0004Q\u0018\u000b\n\u001d\u001b\u0013\u001f%Zx\u0014)\u0004&\"&\u001a", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849975687))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = ZN.Xd() ^ (914754962 ^ 84679660);
        int iXd2 = C1633zX.Xd() ^ (2112031120 ^ (-162660903));
        short sXd = (short) (OY.Xd() ^ iXd);
        short sXd2 = (short) (OY.Xd() ^ iXd2);
        int[] iArr = new int["@Ja;\u0015\u001f&\u0003s\u0005-\\M\f".length()];
        QB qb = new QB("@Ja;\u0015\u001f&\u0003s\u0005-\\M\f");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(((i8 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i8++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i8), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            String strXd = C1561oA.Xd("r", (short) (FB.Xd() ^ (667556147 ^ 667566546)));
            SSLContext sSLContext = null;
            if (Integer.parseInt(strXd) != 0) {
                keyStore = null;
            } else {
                short sXd3 = (short) (Od.Xd() ^ ((631182715 ^ 1318228042) ^ (-1796078967)));
                int[] iArr2 = new int["UM_K\u001dcRQhfZfp&@[T/MIQE".length()];
                QB qb2 = new QB("UM_K\u001dcRQhfZfp&@[T/MIQE");
                int i9 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i9] = xuXd2.fK((sXd3 ^ i9) + xuXd2.CK(iKK2));
                    i9++;
                }
                Object[] objArr2 = {str2};
                Method declaredMethod2 = Class.forName(new String(iArr2, 0, i9)).getDeclaredMethod(hg.Vd("wt\u0003Vz~~jvjk", (short) (C1607wl.Xd() ^ ((1143606503 ^ 1499295364) ^ 494343149)), (short) (C1607wl.Xd() ^ (1565949504 ^ 1565928156))), Class.forName(Qg.kd(",\"6 k)\u001d)!f\u000b+(\u001e\"\u001a", (short) (C1607wl.Xd() ^ ((2055284047 ^ 66599898) ^ 2037989673)), (short) (C1607wl.Xd() ^ (1134091949 ^ 1134085446)))));
                try {
                    declaredMethod2.setAccessible(true);
                    keyStore = (KeyStore) declaredMethod2.invoke(null, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            short sXd4 = (short) (C1633zX.Xd() ^ ((80710891 ^ 808669684) ^ (-888991063)));
            int[] iArr3 = new int["C9M7\u0003G85FB8BFy\u0016/B\u001b;57)".length()];
            QB qb3 = new QB("C9M7\u0003G85FB8BFy\u0016/B\u001b;57)");
            int i10 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i10] = xuXd3.fK(sXd4 + i10 + xuXd3.CK(iKK3));
                i10++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i10));
            Class<?>[] clsArr2 = new Class[479626219 ^ 479626217];
            short sXd5 = (short) (Od.Xd() ^ (1303709292 ^ (-1303722259)));
            int[] iArr4 = new int["iawc)el,Pvy\u007fwWyxTQ^".length()];
            QB qb4 = new QB("iawc)el,Pvy\u007fwWyxTQ^");
            int i11 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i11] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i11));
                i11++;
            }
            clsArr2[0] = Class.forName(new String(iArr4, 0, i11));
            clsArr2[1] = char[].class;
            Object[] objArr3 = new Object[888986305 ^ 888986307];
            objArr3[0] = null;
            objArr3[1] = null;
            Method method = cls2.getMethod(C1561oA.Yd("\n\u000e\u0001\u0005", (short) (C1607wl.Xd() ^ (2113930266 ^ 2113947603))), clsArr2);
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr3);
                for (CertificateModel certificateModel : list) {
                    String domainServer = certificateModel.getDomainServer();
                    Certificate certificate = certificateModel.getCertificate();
                    Class<?> cls3 = Class.forName(Xg.qd("'\u001f5!n5(':80<Bw\u00161F!C?C7", (short) (C1607wl.Xd() ^ ((662158812 ^ 125859052) ^ 553121900)), (short) (C1607wl.Xd() ^ (2055196348 ^ 2055179277))));
                    Class<?>[] clsArr3 = new Class[(1976903145 ^ 982953062) ^ 1329826189];
                    clsArr3[0] = Class.forName(Jg.Wd("\u007f\u0004l@\u0001\u001ej\\\r1;V7\u007fi\u0018", (short) (C1580rY.Xd() ^ (691768857 ^ (-691785325))), (short) (C1580rY.Xd() ^ ((1825438262 ^ 904305920) ^ (-1496006936)))));
                    clsArr3[1] = Class.forName(ZO.xd("^)~L\u0012\u0005~]\u0013\u0006|\u00048\\('L\u000e\u0004h zDC\u0010b[s%8", (short) (Od.Xd() ^ (824509049 ^ (-824509898))), (short) (Od.Xd() ^ (1204937307 ^ (-1204924537)))));
                    Object[] objArr4 = new Object[2047626202 ^ 2047626200];
                    objArr4[0] = domainServer;
                    objArr4[1] = certificate;
                    Method method2 = cls3.getMethod(C1626yg.Ud("T\u001a\u0005)\f,Hx\u007fF@4D&6J\u0015m)", (short) (C1580rY.Xd() ^ (2132429856 ^ (-2132433395))), (short) (C1580rY.Xd() ^ ((915726624 ^ 386262579) ^ (-563168190)))), clsArr3);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(keyStore, objArr4);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                try {
                    int i12 = Integer.parseInt(strXd);
                    String strWd = Ig.wd("\u001dV", (short) (FB.Xd() ^ (1160456331 ^ 1160477513)));
                    int i13 = 6;
                    int i14 = (2029379998 ^ 1625882450) ^ 404561608;
                    int i15 = 1;
                    if (i12 != 0) {
                        str = strXd;
                        i3 = 6;
                        i2 = 1;
                        i4 = 1;
                    } else {
                        i2 = 24;
                        str = strWd;
                        i3 = i14;
                        i4 = i3;
                    }
                    int i16 = 0;
                    if (i3 != 0) {
                        i4 += i4 + i4;
                        str = strXd;
                        i5 = 0;
                    } else {
                        i5 = i3 + 15;
                    }
                    if (Integer.parseInt(str) != 0) {
                        i6 = i5 + 9;
                        strWd = str;
                        i13 = 0;
                    } else {
                        i2 += i4;
                        i6 = i5 + 11;
                    }
                    if (i6 != 0) {
                        i15 = i13 + i13 + i13;
                    } else {
                        i16 = i6 + 10;
                        strXd = strWd;
                    }
                    if (Integer.parseInt(strXd) != 0) {
                        i7 = i16 + i14;
                        strConcat = null;
                    } else {
                        int i17 = i2 / i15;
                        short sXd6 = (short) (ZN.Xd() ^ (279030841 ^ 279021191));
                        int[] iArr5 = new int["g#t".length()];
                        QB qb5 = new QB("g#t");
                        int i18 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i18] = xuXd5.fK((C1561oA.Xd[i18 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i18)) + xuXd5.CK(iKK5));
                            i18++;
                        }
                        strConcat = e.concat(i17, new String(iArr5, 0, i18));
                        i7 = i16 + 10;
                    }
                    if (i7 != 0) {
                        SSLContext sSLContext2 = SSLContext.getInstance(strConcat);
                        sSLContext2.init(null, trustManagerFactory.getTrustManagers(), null);
                        sSLContext = sSLContext2;
                    }
                    VolleyManager.getInstance(this.mContext).setSslSocketFactory(sSLContext.getSocketFactory());
                } catch (KeyManagementException | NoSuchAlgorithmException e4) {
                    publishError();
                    VsshLogger.logError(TAG, e4.getMessage(), e4);
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }
}
