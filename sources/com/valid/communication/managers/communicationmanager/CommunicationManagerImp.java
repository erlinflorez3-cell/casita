package com.valid.communication.managers.communicationmanager;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.valid.communication.a;
import com.valid.communication.e;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.helpers.CommunicationConstants;
import com.valid.communication.helpers.ConvertDataHelper;
import com.valid.communication.managers.certificatemanager.CertificateManager;
import com.valid.communication.managers.certificatemanager.CertificateManagerImp;
import com.valid.communication.managers.exchangemanager.ExchangeManager;
import com.valid.communication.managers.exchangemanager.ExchangeManagerCallback;
import com.valid.communication.managers.exchangemanager.ExchangeManagerImp;
import com.valid.communication.managers.httprequestmanager.HttpRequestManager;
import com.valid.communication.managers.httprequestmanager.HttpRequestManagerImp;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.CertificateModel;
import com.valid.communication.models.ErrorData;
import com.valid.communication.models.ExchangeKey;
import com.valid.communication.models.ExchangeRequestData;
import com.valid.communication.models.GenericDavResponseEntity;
import com.valid.communication.models.KeyEntity;
import com.valid.communication.models.Session;
import com.valid.security.entities.RsaOaepKey;
import com.valid.security.entities.TransformAes;
import com.valid.security.helpers.KeyHelper;
import com.valid.security.managers.AesCrypto;
import com.valid.security.managers.VsshCryptoManager;
import com.valid.security.utils.SecurityUtils;
import com.valid.utils.VsshLogger;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
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
public class CommunicationManagerImp implements CommunicationManager, ExchangeManagerCallback {
    private static final Integer SESSION_EXPIRED;
    private static final String TAG = C1561oA.Qd("\\gd$kU_[U\u001eR]ZY`XRKHZNSQ\u0010NAM?DAMM\u0007;FCBIA;41C7<:8+7).+7q\u00061.-4,&\u001f\u001c.\"'%\u0003\u0016\"\u0014\u0019\u0016\"w\u001b\u001d", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951488038)));
    private String baseUrl;
    private CommunicationManagerCallback callback;
    private CertificateManager certificateManager;
    private VsshCryptoManager<TransformAes> cryptoAes;
    private Map<String, String> encryptedData;
    private ExchangeManager exchangeManager;
    private boolean isRequestSecure;
    private boolean isResponseEncrypted;
    private Context mContext;
    private boolean mEnableRequestWithSSLPinning;
    private boolean mIsSessionIdInEncryptedData;
    private KeyEntity mKeyEntity;
    private TransformAes mTransformAes;
    private HttpRequestManager requestManager;
    private Session sessionData;

    public class ParseException extends RuntimeException {
    }

    static {
        try {
            SESSION_EXPIRED = Integer.valueOf(Od.Xd() ^ (941881798 ^ 2145283483));
        } catch (ParseException unused) {
        }
    }

    public CommunicationManagerImp(Context context, String str) {
        this.mContext = context;
        this.baseUrl = str;
        this.isRequestSecure = true;
        this.isResponseEncrypted = false;
        this.mEnableRequestWithSSLPinning = false;
        this.mIsSessionIdInEncryptedData = false;
        this.mTransformAes = TransformAes.GCM;
        generateRequestManager();
        this.mKeyEntity = new KeyEntity();
        this.cryptoAes = new AesCrypto();
    }

    public CommunicationManagerImp(Context context, String str, TransformAes transformAes) {
        this.mContext = context;
        this.baseUrl = str;
        this.isRequestSecure = true;
        this.isResponseEncrypted = false;
        this.mEnableRequestWithSSLPinning = false;
        this.mIsSessionIdInEncryptedData = false;
        this.mTransformAes = transformAes;
        generateRequestManager();
        this.mKeyEntity = new KeyEntity();
        this.cryptoAes = new AesCrypto();
    }

    private final String encryptData(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        VsshCryptoManager<TransformAes> vsshCryptoManager = this.cryptoAes;
        int iXd = ZN.Xd() ^ 864711589;
        short sXd = (short) (OY.Xd() ^ ((619097339 ^ 1216858901) ^ 1818318604));
        short sXd2 = (short) (OY.Xd() ^ iXd);
        int[] iArr = new int["t".length()];
        QB qb = new QB("t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        return SecurityUtils.getHexStringFromByteArray(Integer.parseInt(new String(iArr, 0, i2)) != 0 ? null : vsshCryptoManager.encrypt(this.mTransformAes, str, this.mKeyEntity.getmSymKey()));
    }

    private final void generateRequestManager() {
        try {
            HttpRequestManagerImp httpRequestManagerImp = new HttpRequestManagerImp(BaseSuccessEvent.class, BaseErrorEvent.class);
            this.requestManager = httpRequestManagerImp;
            String str = this.baseUrl;
            if (str != null) {
                httpRequestManagerImp.setBaseURL(str);
            }
            Context context = this.mContext;
            if (context != null) {
                this.requestManager.setContext(context);
            }
        } catch (ParseException unused) {
        }
    }

    private final String getEncryptedDataToRequest(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return encryptData(new Gson().toJson(map));
    }

    private final void processResponse(JSONObject jSONObject, BaseSuccessEvent baseSuccessEvent) {
        ErrorData errorData;
        BaseErrorEvent baseErrorEvent;
        String strKd;
        int i2;
        int i3;
        int i4;
        int i5;
        String strZd;
        HttpRequestManager httpRequestManager;
        String strOd = C1561oA.od("J", (short) (Od.Xd() ^ (235797357 ^ (-235780441))));
        int i6 = (1457876235 ^ 955368176) ^ 1846849523;
        try {
            BaseModelResponse baseModelResponse = (BaseModelResponse) baseSuccessEvent.getTypedResponse(BaseModelResponse.class);
            int i7 = 5;
            if (baseModelResponse != null && baseModelResponse.getServiceName() != null) {
                int i8 = 1;
                if (Integer.parseInt(strOd) != 0) {
                    strKd = strOd;
                    i3 = i6;
                    i2 = 1;
                } else {
                    strKd = C1561oA.Kd("\u0001\u0006", (short) (OY.Xd() ^ (2042836626 ^ 2042827316)));
                    i2 = 837396044 ^ 837395987;
                    i3 = 5;
                }
                int i9 = 0;
                if (i3 != 0) {
                    strKd = strOd;
                    i8 = i6;
                    i4 = 0;
                } else {
                    i4 = i3 + 10;
                }
                int i10 = 1042825359 ^ 1042825357;
                if (Integer.parseInt(strKd) != 0) {
                    i5 = i4 + 6;
                } else {
                    i2 += i8;
                    i5 = i4 + i10;
                    i9 = 19;
                }
                if (i5 != 0) {
                    i2 /= i9 + i9;
                    strZd = Wg.Zd("\u0010,\u0001/\b\\\u0002,\u000fU\u0006ov-z", (short) (ZN.Xd() ^ ((1775452122 ^ 1265196318) ^ 582634887)), (short) (ZN.Xd() ^ (301894981 ^ 301893984)));
                } else {
                    strZd = null;
                }
                if (e.concat(i2, strZd).equals(baseModelResponse.getServiceName())) {
                    if (baseModelResponse.getServiceName() != null && baseModelResponse.getStatusCode().intValue() == 0) {
                        this.certificateManager.processPinningCertificate(Integer.parseInt(strOd) != 0 ? null : baseModelResponse.getResponse().toString());
                        this.certificateManager.publishSuccess();
                        return;
                    }
                    BaseErrorEvent baseErrorEvent2 = new BaseErrorEvent(a.startsWith(C1561oA.Xd("0BM,#\u001e\u000e\u000b_NLZa#%cZ(`nq\r\u001f&2nobl^\u001e\u001f%gr|>i/(:", (short) (ZN.Xd() ^ ((1165964468 ^ 1215675977) ^ 218801122))), i10), Integer.valueOf(312959192 ^ (-312959787)));
                    if (Integer.parseInt(strOd) != 0) {
                        baseErrorEvent2 = null;
                        httpRequestManager = null;
                    } else {
                        httpRequestManager = this.requestManager;
                    }
                    httpRequestManager.publishEvent(null, baseErrorEvent2);
                    return;
                }
            }
            if (baseModelResponse == null || baseModelResponse.getResponse() != null || baseModelResponse.getErrCode() == null || baseModelResponse.getErrCode().intValue() >= 0) {
                BaseSuccessEvent baseSuccessEvent2 = new BaseSuccessEvent();
                if (Integer.parseInt(strOd) != 0) {
                    baseSuccessEvent2 = null;
                } else {
                    baseSuccessEvent2.setHeader(jSONObject);
                }
                baseSuccessEvent2.setResponse(baseSuccessEvent.getResponse());
                this.requestManager.publishEvent(baseSuccessEvent2, null);
                return;
            }
            Object typedResponse = baseSuccessEvent.getTypedResponse(ErrorData.class);
            if (Integer.parseInt(strOd) != 0) {
                i7 = 1808857274 ^ 1808857271;
                errorData = null;
                baseErrorEvent = null;
            } else {
                errorData = (ErrorData) typedResponse;
                baseErrorEvent = new BaseErrorEvent();
            }
            if (i7 != 0) {
                baseErrorEvent.setErrorData(errorData);
            } else {
                baseErrorEvent = null;
            }
            this.requestManager.publishEvent(null, baseErrorEvent);
        } catch (JsonSyntaxException e2) {
            if (baseSuccessEvent.getResponse() == null) {
                VsshLogger.logError(TAG, e2.getMessage(), e2);
                return;
            }
            BaseSuccessEvent baseSuccessEvent3 = new BaseSuccessEvent();
            if (Integer.parseInt(strOd) != 0) {
                baseSuccessEvent3 = null;
            } else {
                baseSuccessEvent3.setHeader(jSONObject);
                i6 = 593694124 ^ 593694114;
            }
            if (i6 != 0) {
                baseSuccessEvent3.setResponse(baseSuccessEvent.getResponse());
            }
            this.requestManager.publishEvent(baseSuccessEvent3, null);
        }
    }

    private final void setAuthorizationToken(String str) {
        try {
            Session session = this.sessionData;
            if (session == null || str == null) {
                return;
            }
            session.setTokenAuth(str);
        } catch (ParseException unused) {
        }
    }

    private final String validateSessionId() {
        Session session = this.sessionData;
        if (session == null || session.getExchangeKey() == null || this.sessionData.getExchangeKey().getSessionId() == null || this.sessionData.getExchangeKey().getSessionId().isEmpty()) {
            return null;
        }
        return this.sessionData.getExchangeKey().getSessionId();
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void addSessionIdInEncryptedData(boolean z2) {
        try {
            this.mIsSessionIdInEncryptedData = z2;
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void clearSession() {
        try {
            this.sessionData = null;
            generateRequestManager();
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void consumeVsshService(int i2, String str, Map<String, String> map, Map<String, Object> map2) {
        HashMap map3;
        String strQd;
        int i3;
        BaseErrorEvent baseErrorEvent;
        int i4;
        byte[] bArrEncrypt;
        char c2;
        Map<String, Object> map4 = map2;
        HashMap map5 = new HashMap();
        String strVd = Wg.vd("O", (short) (Od.Xd() ^ (1622300590 ^ (-1622291398))));
        if (Integer.parseInt(strVd) != 0) {
            map3 = null;
        } else {
            map3 = map5;
            map5 = new HashMap();
        }
        if (map != null && !map.isEmpty()) {
            map3.putAll(map);
        }
        Session session = this.sessionData;
        int i5 = 10;
        String tokenAuth = "";
        if (session != null) {
            int i6 = 1013270857 ^ 1013270859;
            if (session.getTokenAuth() != null && !this.sessionData.getTokenAuth().isEmpty() && this.isRequestSecure) {
                tokenAuth = this.sessionData.getTokenAuth();
                map3.put(a.startsWith(Qg.kd("^xqe9<78~yfzg", (short) (FB.Xd() ^ ((1324837263 ^ 373625985) ^ 1488084244)), (short) (FB.Xd() ^ (C1580rY.Xd() ^ (723483384 ^ (-446048489))))), i6), tokenAuth);
            }
            String uniqueIdSigned = this.sessionData.getUniqueIdSigned();
            if (uniqueIdSigned != null && !uniqueIdSigned.isEmpty()) {
                VsshCryptoManager<TransformAes> vsshCryptoManager = this.cryptoAes;
                if (Integer.parseInt(strVd) != 0) {
                    bArrEncrypt = null;
                    c2 = 15;
                } else {
                    bArrEncrypt = vsshCryptoManager.encrypt(this.mTransformAes, uniqueIdSigned, this.mKeyEntity.getmSymKey());
                    c2 = '\n';
                }
                map3.put(a.startsWith(hg.Vd("49@F|z`s\u0016..E,{", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1363278646 ^ 1623767742))), (short) (C1499aX.Xd() ^ (800213255 ^ (-800207059)))), i6), c2 != 0 ? SecurityUtils.getHexStringFromByteArray(bArrEncrypt) : null);
            }
        }
        if (this.mIsSessionIdInEncryptedData) {
            if (map4 == null) {
                map4 = new HashMap<>();
            }
            map4.put(e.concat(ZN.Xd() ^ (1829354749 ^ 1585676808), C1561oA.ud("?1/;=7iXw", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207813644))))), validateSessionId());
        }
        if (this.isRequestSecure) {
            boolean zIsEmpty = tokenAuth.isEmpty();
            int i7 = 583553999 ^ 583553996;
            if (zIsEmpty) {
                map5.put(e.concat(i7, C1561oA.yd("\u0015\r\u0011\u0017\u000f\u001fS0i", (short) (Od.Xd() ^ (2127531440 ^ (-2127558555))))), validateSessionId());
            }
            Map<String, String> map6 = this.encryptedData;
            if (map6 != null && !map6.isEmpty()) {
                if (map4 == null) {
                    map4 = new HashMap<>();
                }
                for (Map.Entry<String, String> entry : this.encryptedData.entrySet()) {
                    entry.setValue(encryptData(entry.getValue()));
                }
                map4.putAll(this.encryptedData);
                this.encryptedData = null;
            }
            String encryptedDataToRequest = getEncryptedDataToRequest(map4);
            if (encryptedDataToRequest == null) {
                ErrorData errorData = new ErrorData();
                if (Integer.parseInt(strVd) != 0) {
                    strQd = strVd;
                    errorData = null;
                } else {
                    errorData.setErrorType(CommunicationConstants.BAD_REQUEST_CODE);
                    strQd = Xg.qd(ExifInterface.GPS_MEASUREMENT_3D, (short) (OY.Xd() ^ ((622499966 ^ 711671808) ^ 259109626)), (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849951025)));
                    i5 = 15;
                }
                if (i5 != 0) {
                    errorData.setMessage(a.startsWith(Jg.Wd("\u000fb\\\u0003%nV&Ak)", (short) (C1580rY.Xd() ^ ((1123300135 ^ 1661294771) ^ (-569454047))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (401643305 ^ (-1343050683))))), i7));
                    i3 = 0;
                } else {
                    i3 = i5 + 13;
                    strVd = strQd;
                }
                if (Integer.parseInt(strVd) != 0) {
                    i4 = i3 + 14;
                    baseErrorEvent = null;
                } else {
                    baseErrorEvent = new BaseErrorEvent();
                    i4 = i3 + 11;
                }
                if (i4 != 0) {
                    baseErrorEvent.setErrorData(errorData);
                } else {
                    baseErrorEvent = null;
                }
                this.requestManager.publishEvent(null, baseErrorEvent);
                return;
            }
            map5.put(e.concat(i7, C1561oA.Yd("+23*", (short) (C1607wl.Xd() ^ ((741577437 ^ 630770163) ^ 162230847)))), encryptedDataToRequest);
        } else if (map4 != null) {
            map5.putAll(map4);
        }
        consumeWebServiceWithTypeMethod(i2, str, map3, map5);
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void consumeWebServiceWithTypeMethod(int i2, String str, Map<String, String> map, Map<String, Object> map2) {
        int iXd;
        HttpRequestManager httpRequestManager;
        if (this.requestManager == null) {
            generateRequestManager();
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        EventBus.getDefault().register(this);
        if (this.certificateManager == null) {
            this.certificateManager = new CertificateManagerImp(this.mContext, this.requestManager, this.mKeyEntity);
        }
        CommunicationManagerCallback communicationManagerCallback = this.callback;
        if (communicationManagerCallback != null) {
            this.requestManager.setCallback(communicationManagerCallback);
        }
        CertificateManager certificateManager = this.certificateManager;
        if (Integer.parseInt(ZO.xd("$", (short) (FB.Xd() ^ (1130248267 ^ 1130258815)), (short) (FB.Xd() ^ (471805665 ^ 471816435)))) != 0) {
            iXd = Od.Xd() ^ (919385076 ^ 1899046831);
        } else {
            certificateManager.enableSslPinning(this.mEnableRequestWithSSLPinning);
            iXd = 1529231445 ^ 1529231441;
        }
        if (iXd != 0) {
            httpRequestManager = this.requestManager;
        } else {
            httpRequestManager = null;
            i2 = 1;
        }
        httpRequestManager.consumeWebService(i2, str, map, map2);
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void disableSecureRequest(boolean z2) {
        try {
            this.isRequestSecure = !z2;
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void doGetCertificate(String str, String str2) {
        try {
            if (this.exchangeManager == null) {
                this.exchangeManager = new ExchangeManagerImp(this.mKeyEntity, RsaOaepKey.RSA_1024_SHA_1, this.mTransformAes);
            }
            if (str2 != null) {
                this.mKeyEntity.setmServerPubKey(str2);
            }
            if (this.certificateManager == null) {
                this.certificateManager = new CertificateManagerImp(this.mContext, this.requestManager, this.mKeyEntity);
            }
            CommunicationManagerCallback communicationManagerCallback = this.callback;
            if (communicationManagerCallback != null) {
                this.requestManager.setCallback(communicationManagerCallback);
            }
            if (!EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this);
            }
            this.certificateManager.getCertificates(str);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManagerCallback
    public void exchangeKeyCompletion(ExchangeKey exchangeKey, BaseErrorEvent baseErrorEvent) {
        CommunicationManagerImp communicationManagerImp;
        int iXd;
        this.requestManager.setCallback(this.callback);
        if (baseErrorEvent != null) {
            this.requestManager.publishEvent(null, baseErrorEvent);
            return;
        }
        if (this.sessionData == null) {
            this.sessionData = new Session();
        }
        Session session = this.sessionData;
        String strUd = C1626yg.Ud("\r", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849958544)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (1389509311 ^ (-646139832)))));
        int i2 = 6;
        if (Integer.parseInt(strUd) != 0) {
            iXd = C1580rY.Xd() ^ (-831067157);
            communicationManagerImp = null;
        } else {
            session.setTokenAuth(null);
            communicationManagerImp = this;
            iXd = 6;
        }
        if (iXd != 0) {
            communicationManagerImp.sessionData.setExchangeKey(exchangeKey);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int i3 = 1023416930 ^ 1023416934;
            jSONObject.put(e.concat(i3, Ig.wd("\u000eI7\u0016\u0016O\u0016U2l", (short) (C1633zX.Xd() ^ ((564386163 ^ 1451108844) ^ (-2011030149))))), CommunicationConstants.STATUS_CODE_SUCCESS);
            if (Integer.parseInt(strUd) == 0) {
                i2 = (98633702 ^ 1370638968) ^ 1414745499;
                jSONObject.put(e.concat(i2, EO.Od("\u0019<j\u0010\u0018ssJ7\"+", (short) (OY.Xd() ^ (136654671 ^ 136648855)))), e.concat(1, C1561oA.Qd("\u0002\u000f\u0010\u0003\u0006\u0011;='9I", (short) (ZN.Xd() ^ ((1606636779 ^ 1552834722) ^ 55380902)))));
            }
            if (i2 != 0) {
                jSONObject.put(a.startsWith(C1593ug.zd("f^\\l3!3", (short) (C1607wl.Xd() ^ (795883135 ^ 795875885)), (short) (C1607wl.Xd() ^ (1440545787 ^ 1440542268))), i3), (Object) null);
            }
            jSONObject.put(e.concat((216609744 ^ 1727446328) ^ 1780453098, C1561oA.od("ZOIVEX\u0011\u000b", (short) (OY.Xd() ^ (246027839 ^ 246022617)))), exchangeKey);
        } catch (JSONException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        BaseSuccessEvent baseSuccessEvent = new BaseSuccessEvent();
        if (Integer.parseInt(strUd) != 0) {
            baseSuccessEvent = null;
        } else {
            baseSuccessEvent.setResponse(jSONObject.toString());
        }
        this.requestManager.publishEvent(baseSuccessEvent, null);
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public String getSessionId() {
        try {
            Session session = this.sessionData;
            if (session == null || session.getExchangeKey() == null) {
                return null;
            }
            return encryptData(this.sessionData.getExchangeKey().getSessionId());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void initExchangeKey(String str, ExchangeRequestData exchangeRequestData) {
        try {
            initExchangeKey(str, null, exchangeRequestData, null, null);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData) {
        try {
            initExchangeKey(str, str2, exchangeRequestData, null, null);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData, Map<String, Object> map) {
        try {
            initExchangeKey(str, str2, exchangeRequestData, map, null);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void initExchangeKey(String str, String str2, ExchangeRequestData exchangeRequestData, Map<String, Object> map, Map<String, String> map2) {
        int i2;
        String str3;
        CommunicationManagerImp communicationManagerImp;
        ExchangeManager exchangeManager;
        HttpRequestManager httpRequestManager;
        KeyEntity keyEntity;
        clearSession();
        if (this.exchangeManager == null) {
            this.exchangeManager = new ExchangeManagerImp(this.mKeyEntity, RsaOaepKey.RSA_1024_SHA_1, this.mTransformAes);
        }
        ExchangeManager exchangeManager2 = this.exchangeManager;
        short sXd = (short) (C1499aX.Xd() ^ (Od.Xd() ^ (693979656 ^ (-1856037421))));
        int[] iArr = new int["d".length()];
        QB qb = new QB("d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        String str4 = new String(iArr, 0, i3);
        String strConcatenateWithSlash = null;
        if (Integer.parseInt(str4) != 0) {
            str3 = str4;
            i2 = 5;
            communicationManagerImp = null;
        } else {
            exchangeManager2.setCallback(this);
            i2 = (1946841995 ^ 1745938211) ^ 471504039;
            int iXd = FB.Xd() ^ 1609503666;
            short sXd2 = (short) (ZN.Xd() ^ (305390485 ^ 305394167));
            short sXd3 = (short) (ZN.Xd() ^ iXd);
            int[] iArr2 = new int["Ft".length()];
            QB qb2 = new QB("Ft");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i4++;
            }
            str3 = new String(iArr2, 0, i4);
            communicationManagerImp = this;
        }
        if (i2 != 0) {
            exchangeManager = communicationManagerImp.exchangeManager;
            httpRequestManager = this.requestManager;
            str3 = str4;
        } else {
            exchangeManager = null;
            httpRequestManager = null;
        }
        if (Integer.parseInt(str3) != 0) {
            keyEntity = null;
        } else {
            exchangeManager.setHttRequestManager(httpRequestManager);
            keyEntity = this.mKeyEntity;
        }
        keyEntity.setmServerPubKey(exchangeRequestData.getPublicKey());
        if (exchangeRequestData.getBankPublicKey() != null) {
            this.mKeyEntity.setmBankPubKey(exchangeRequestData.getBankPublicKey());
        }
        try {
            exchangeRequestData.setPublicKey(KeyHelper.getStringFromPublicKey(this.mKeyEntity.getmServerPubKey()));
            String stringFromPublicKey = KeyHelper.getStringFromPublicKey(this.mKeyEntity.getmClientPubKey());
            if (this.certificateManager == null) {
                this.certificateManager = new CertificateManagerImp(this.mContext, this.requestManager, this.mKeyEntity);
            }
            this.certificateManager.enableSslPinning(this.mEnableRequestWithSSLPinning);
            if (str2 != null && !str2.isEmpty()) {
                this.exchangeManager.getExchangeKeyServiceWithURL(ConvertDataHelper.concatenateWithSlash(str, str2), stringFromPublicKey, map, map2);
                return;
            }
            ExchangeManager exchangeManager3 = this.exchangeManager;
            if (Integer.parseInt(str4) == 0) {
                strConcatenateWithSlash = ConvertDataHelper.concatenateWithSlash(str, a.startsWith(C1561oA.Xd("Dy}\tGsN=8\u0011y\u0013{N(ZN", (short) (C1607wl.Xd() ^ ((870872236 ^ 635174665) ^ 372496338))), 5));
            }
            exchangeManager3.getExchangeKeyServiceWithURL(strConcatenateWithSlash, stringFromPublicKey, map, map2);
        } catch (IOException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void isResponseEncrypted(boolean z2) {
        try {
            this.isResponseEncrypted = z2;
        } catch (ParseException unused) {
        }
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(BaseErrorEvent baseErrorEvent) {
        if (baseErrorEvent.getErrorData().getErrorType().equals(SESSION_EXPIRED)) {
            clearSession();
        }
        HttpRequestManager httpRequestManager = this.requestManager;
        if (Integer.parseInt(Wg.vd("d", (short) (C1499aX.Xd() ^ (1679779543 ^ (-1679770748))))) == 0) {
            httpRequestManager.publishEvent(null, baseErrorEvent);
        }
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(BaseSuccessEvent baseSuccessEvent) {
        HttpRequestManager httpRequestManager;
        BaseErrorEvent baseErrorEvent;
        byte[] bArrDecrypt;
        String str;
        int i2;
        String str2;
        BaseSuccessEvent baseSuccessEvent2;
        JSONObject header = baseSuccessEvent.getHeader();
        int iXd = C1499aX.Xd() ^ (-1134257938);
        if (header != null) {
            if (header.has(a.startsWith(Qg.kd("\\voc7:56|wdxe", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (2017719858 ^ 202563239))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951475488))), iXd))) {
                short sXd = (short) (C1607wl.Xd() ^ ((963426382 ^ 868057034) ^ 181514587));
                short sXd2 = (short) (C1607wl.Xd() ^ (1073116647 ^ 1073115542));
                int[] iArr = new int["\u0018L?=2;{\u0003\b|\u0004}1".length()];
                QB qb = new QB("\u0018L?=2;{\u0003\b|\u0004}1");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                    i3++;
                }
                try {
                    setAuthorizationToken(header.getString(e.concat((1200742176 ^ 532519521) ^ 1479296322, new String(iArr, 0, i3))));
                } catch (JSONException e2) {
                    VsshLogger.logError(TAG, e2.getMessage(), e2);
                }
            }
        }
        EventBus eventBus = EventBus.getDefault();
        String strUd = C1561oA.ud("h", (short) (ZN.Xd() ^ ((1232851022 ^ 904990918) ^ 2089461485)));
        if (Integer.parseInt(strUd) != 0) {
            httpRequestManager = null;
        } else {
            eventBus.unregister(this);
            httpRequestManager = this.requestManager;
        }
        httpRequestManager.setCallback(this.callback);
        if (!this.isResponseEncrypted) {
            processResponse(header, baseSuccessEvent);
            return;
        }
        String response = baseSuccessEvent.getResponse();
        try {
            GenericDavResponseEntity genericDavResponseEntity = (GenericDavResponseEntity) new Gson().fromJson(response, GenericDavResponseEntity.class);
            if (genericDavResponseEntity != null && genericDavResponseEntity.getData() != null) {
                response = genericDavResponseEntity.getData();
            }
        } catch (JsonSyntaxException e3) {
            VsshLogger.logInfo(TAG, e3.getMessage(), e3);
        }
        try {
            VsshCryptoManager<TransformAes> vsshCryptoManager = this.cryptoAes;
            if (Integer.parseInt(strUd) != 0) {
                i2 = 9;
                str = strUd;
                bArrDecrypt = null;
            } else {
                bArrDecrypt = vsshCryptoManager.decrypt(this.mTransformAes, response, this.mKeyEntity.getmSymKey());
                short sXd3 = (short) (C1499aX.Xd() ^ (1076922191 ^ (-1076941777)));
                int[] iArr2 = new int["+".length()];
                QB qb2 = new QB("+");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                    i4++;
                }
                str = new String(iArr2, 0, i4);
                i2 = 1466495837 ^ 1466495832;
            }
            if (i2 != 0) {
                str2 = new String(bArrDecrypt, Charset.forName(a.startsWith(C1561oA.Yd("\f\u001d)p/", (short) (ZN.Xd() ^ (1398534475 ^ 1398514705))), iXd)));
                str = strUd;
            } else {
                str2 = null;
            }
            if (Integer.parseInt(str) != 0) {
                str2 = null;
                baseSuccessEvent2 = null;
            } else {
                baseSuccessEvent2 = new BaseSuccessEvent();
            }
            baseSuccessEvent2.setHeader(header);
            if (str2.isEmpty()) {
                baseSuccessEvent2.setResponse(response);
            } else {
                baseSuccessEvent2.setResponse(str2);
            }
            this.requestManager.publishEvent(baseSuccessEvent2, null);
        } catch (Exception e4) {
            String str3 = TAG;
            if (Integer.parseInt(strUd) != 0) {
                iXd = 9;
            } else {
                VsshLogger.logInfo(str3, e4.getMessage());
            }
            if (iXd != 0) {
                baseErrorEvent = new BaseErrorEvent(a.startsWith(Xg.qd("\u0005v\na@\u001eT?\u0015\u0014~ǖ\u0010", (short) (OY.Xd() ^ (658318591 ^ 658310092)), (short) (OY.Xd() ^ ((542141206 ^ 2007944781) ^ 1476309566))), 1), Integer.valueOf(968925096 ^ (-968924253)));
            } else {
                baseErrorEvent = null;
            }
            this.requestManager.publishEvent(null, baseErrorEvent);
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void setAdditionalEncryptedData(Map<String, String> map) {
        try {
            this.encryptedData = map;
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void setBaseUrl(String str) {
        this.baseUrl = str;
        if (str != null) {
            this.requestManager.setBaseURL(str);
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void setCallback(CommunicationManagerCallback communicationManagerCallback) {
        try {
            this.callback = communicationManagerCallback;
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void setCertificates(List<CertificateModel> list) {
        try {
            this.certificateManager.setSslContext(list);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManager
    public void setEnableRequestWithSSLPinning(boolean z2) {
        try {
            this.mEnableRequestWithSSLPinning = z2;
        } catch (ParseException unused) {
        }
    }
}
