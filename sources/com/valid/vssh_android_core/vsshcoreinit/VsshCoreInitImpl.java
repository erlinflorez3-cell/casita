package com.valid.vssh_android_core.vsshcoreinit;

import com.dynatrace.android.agent.Global;
import com.google.gson.Gson;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.helpers.CommunicationConstants;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.communication.managers.communicationmanager.CommunicationManagerImp;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.ExchangeRequestData;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.ParametersModelResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.utils.ValidationsHelper;
import com.valid.vssh_android_core.utils.VsshCoreConstants;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Map;
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
public class VsshCoreInitImpl extends BaseVsshCore implements VsshCoreInit {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f18359g = C1561oA.Kd("o\u000e\u000f\u0005`\u000e\u0012\u0006j\u0011\r\u0019n\u0014\u0018\u0015", (short) (OY.Xd() ^ (ZN.Xd() ^ 864698565)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommunicationManager f18360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VsshCoreInitCallback f18361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SetupModel f18362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LambdaSuccess<Boolean> f18363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LambdaSuccess<CoreGenericBridgeModelResponse> f18364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f18365f = Boolean.FALSE;

    public class ParseException extends RuntimeException {
    }

    public final void a(SetupModel setupModel) {
        int iXd;
        VsshCoreInitImpl vsshCoreInitImpl;
        String str;
        CommunicationManager communicationManager;
        boolean z2;
        int iXd2;
        int i2;
        VsshCoreInitImpl vsshCoreInitImpl2;
        String apiGetCertificates;
        if (setupModel.getTransformAes() == null) {
            this.f18360a = new CommunicationManagerImp(setupModel.getContext(), setupModel.getUrlBase());
        } else {
            this.f18360a = new CommunicationManagerImp(setupModel.getContext(), setupModel.getUrlBase(), setupModel.getTransformAes());
        }
        CommunicationManager communicationManager2 = this.f18360a;
        String strZd = Wg.Zd("\u0006", (short) (FB.Xd() ^ (343589602 ^ 343600247)), (short) (FB.Xd() ^ (1419752766 ^ 1419743831)));
        int i3 = Integer.parseInt(strZd);
        String strXd = C1561oA.Xd("}\u0003", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (2009088802 ^ 1145702398))));
        CommunicationManager communicationManager3 = null;
        if (i3 != 0) {
            iXd = ZN.Xd() ^ 864698109;
            str = strZd;
            vsshCoreInitImpl = null;
        } else {
            communicationManager2.setEnableRequestWithSSLPinning(false);
            iXd = C1499aX.Xd() ^ (-1134257947);
            vsshCoreInitImpl = this;
            str = strXd;
        }
        if (iXd != 0) {
            vsshCoreInitImpl.f18360a.isResponseEncrypted(false);
            str = strZd;
        }
        if (Integer.parseInt(str) != 0) {
            iXd2 = C1633zX.Xd() ^ (1255257177 ^ (-1048629355));
            communicationManager = null;
            z2 = false;
        } else {
            communicationManager = this.f18360a;
            z2 = true;
            iXd2 = 10;
            str = strXd;
        }
        if (iXd2 != 0) {
            communicationManager.disableSecureRequest(z2);
            communicationManager = this.f18360a;
            str = strZd;
        }
        if (Integer.parseInt(str) != 0) {
            i2 = 682754875 ^ 682754871;
            vsshCoreInitImpl2 = null;
            strXd = str;
        } else {
            communicationManager.addSessionIdInEncryptedData(false);
            i2 = 293567070 ^ 293567064;
            vsshCoreInitImpl2 = this;
        }
        if (i2 != 0) {
            vsshCoreInitImpl2.f18360a.setCallback(this);
        } else {
            strZd = strXd;
        }
        if (Integer.parseInt(strZd) != 0) {
            apiGetCertificates = null;
        } else {
            communicationManager3 = this.f18360a;
            apiGetCertificates = setupModel.getApiGetCertificates();
        }
        communicationManager3.doGetCertificate(apiGetCertificates, setupModel.getPublicKey());
    }

    @Override // com.valid.vssh_android_core.vsshcoreinit.VsshCoreInit
    public void exchangeKey() {
        CommunicationManager communicationManager;
        char c2;
        String str;
        VsshCoreInitImpl vsshCoreInitImpl;
        char c3;
        CommunicationManager communicationManager2;
        int iXd;
        VsshCoreInitImpl vsshCoreInitImpl2;
        VsshCoreInitImpl vsshCoreInitImpl3;
        CommunicationManager communicationManager3;
        String apiExchange;
        ExchangeRequestData exchangeRequestData = new ExchangeRequestData(this.f18362c.getPublicKey());
        String strVd = Wg.vd(Global.COLON, (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (192154084 ^ 2133158686))));
        int i2 = Integer.parseInt(strVd);
        char c4 = TokenParser.CR;
        String strKd = Qg.kd("\u001c!", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951473954)), (short) (C1499aX.Xd() ^ (1572651632 ^ (-1572660944))));
        VsshCoreInitImpl vsshCoreInitImpl4 = null;
        if (i2 != 0) {
            str = strVd;
            c2 = '\r';
            communicationManager = null;
            exchangeRequestData = null;
        } else {
            communicationManager = this.f18360a;
            c2 = 3;
            str = strKd;
        }
        if (c2 != 0) {
            communicationManager.setEnableRequestWithSSLPinning(true);
            vsshCoreInitImpl = this;
            str = strVd;
        } else {
            vsshCoreInitImpl = null;
        }
        if (Integer.parseInt(str) != 0) {
            c3 = '\r';
        } else {
            vsshCoreInitImpl.f18360a.isResponseEncrypted(true);
            c3 = 3;
            str = strKd;
        }
        if (c3 != 0) {
            communicationManager2 = this.f18360a;
            str = strVd;
        } else {
            communicationManager2 = null;
        }
        if (Integer.parseInt(str) != 0) {
            iXd = 434902620 ^ 434902615;
        } else {
            communicationManager2.disableSecureRequest(false);
            communicationManager2 = this.f18360a;
            iXd = Od.Xd() ^ 1207800924;
            str = strKd;
        }
        if (iXd != 0) {
            communicationManager2.addSessionIdInEncryptedData(false);
            vsshCoreInitImpl2 = this;
            str = strVd;
        } else {
            vsshCoreInitImpl2 = null;
        }
        if (Integer.parseInt(str) != 0) {
            strKd = str;
        } else {
            vsshCoreInitImpl2.f18360a.setCallback(this);
            c4 = 3;
        }
        if (c4 != 0) {
            communicationManager3 = this.f18360a;
            vsshCoreInitImpl3 = this;
        } else {
            strVd = strKd;
            vsshCoreInitImpl3 = null;
            communicationManager3 = null;
        }
        if (Integer.parseInt(strVd) != 0) {
            apiExchange = null;
        } else {
            apiExchange = vsshCoreInitImpl3.f18362c.getApiExchange();
            vsshCoreInitImpl4 = this;
        }
        communicationManager3.initExchangeKey(apiExchange, vsshCoreInitImpl4.f18362c.getExchangeEndPoint(), exchangeRequestData, this.f18362c.getExchangeAdditionalData(), this.f18362c.getExchangeHeaders());
    }

    @Override // com.valid.vssh_android_core.vsshcoreinit.VsshCoreInit
    public void setup(SetupModel setupModel, LambdaSuccess<Boolean> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) {
        int iXd;
        int i2;
        char c2;
        String strWd;
        String strYd;
        int iXd2 = Od.Xd() ^ (-1207803104);
        short sXd = (short) (C1633zX.Xd() ^ (1074119355 ^ (-1074131196)));
        short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
        int[] iArr = new int["t".length()];
        QB qb = new QB("t");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
            i3++;
        }
        String str = new String(iArr, 0, i3);
        if (lambdaSuccess == null || lambdaError == null) {
            String str2 = f18359g;
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            String strYd2 = (iIndexOf * 2) % iIndexOf == 0 ? C1561oA.Yd("^\u0004x|\u0007<o\u0004\u0001<zzowyz~\u0001<~x\u0010\u0004\t\u007f", (short) (C1633zX.Xd() ^ (2047258390 ^ (-2047266840)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1499aX.Xd() ^ (1980208318 ^ (-899478496)), Xg.qd("x~#A5i76|5EKAupy\f=9xwx{@\u0015\u0011\u0013KGU\nZ NQ\u0011\u000eX\\", (short) (C1580rY.Xd() ^ (1667538285 ^ (-1667550970))), (short) (C1580rY.Xd() ^ (153794814 ^ (-153812818)))));
            int i4 = 4;
            if (Integer.parseInt(str) != 0) {
                strWd = str;
                c2 = 4;
                iXd = 1;
                i2 = 1;
            } else {
                iXd = C1499aX.Xd() ^ (728335470 ^ (-1760748374));
                i2 = 3;
                c2 = '\n';
                strWd = Jg.Wd("w", (short) (C1580rY.Xd() ^ (902345561 ^ (-902361428))), (short) (C1580rY.Xd() ^ ((1312733247 ^ 746088694) ^ (-1648809799))));
            }
            if (c2 != 0) {
                iXd += i2 + i2;
            } else {
                i4 = i2;
                str = strWd;
            }
            VsshLogger.logError(str2, BuildConfig.AnonymousClass1.indexOf(strYd2, iXd / (i4 + (Integer.parseInt(str) == 0 ? i4 + i4 : 1))));
            return;
        }
        if (Integer.parseInt(str) == 0) {
            this.f18365f = Boolean.FALSE;
        }
        this.lambdaError = lambdaError;
        this.f18363d = lambdaSuccess;
        this.f18362c = setupModel;
        if (setupModel != null && ValidationsHelper.isValidSetupModel(setupModel)) {
            a(setupModel);
            return;
        }
        CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
        if (Integer.parseInt(str) != 0) {
            coreErrorModelResponse = null;
        } else {
            coreErrorModelResponse.setHttpErrorCode(0);
        }
        coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
        int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        if ((iIndexOf2 * 4) % iIndexOf2 != 0) {
            short sXd3 = (short) (C1633zX.Xd() ^ ((375916434 ^ 1390359160) ^ (-1152853792)));
            int[] iArr2 = new int["ys{\b\u0003".length()];
            QB qb2 = new QB("ys{\b\u0003");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(sXd3 + i5 + xuXd2.CK(iKK2));
                i5++;
            }
            strYd = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i5), ZN.Xd() ^ 864698077);
        } else {
            strYd = C1561oA.yd(".SKTQTI\u000e57N7<4M<1u949,", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (295361843 ^ 538176635))));
        }
        coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf(strYd, C1607wl.Xd() ^ (1952918843 ^ 438517476)));
        if (Integer.parseInt(str) == 0) {
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
        }
        this.lambdaError = null;
    }

    @Override // com.valid.vssh_android_core.vsshcoreinit.VsshCoreInit
    public void setup(SetupModel setupModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        String strZd;
        String strOd;
        int iXd = C1580rY.Xd() ^ (-831067166);
        int iXd2 = ZN.Xd() ^ 864698101;
        int i7 = 0;
        String strXd = ZO.xd("k\u001a", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1930618934 ^ 1117487700))), (short) (C1580rY.Xd() ^ (21664183 ^ (-21686694))));
        String strUd = C1626yg.Ud(",", (short) (Od.Xd() ^ (444176569 ^ (-444190229))), (short) (Od.Xd() ^ (Od.Xd() ^ (1361606450 ^ (-383113917)))));
        if (lambdaSuccess != null && lambdaSuccess2 != null && lambdaError != null) {
            if (Integer.parseInt(strUd) != 0) {
                strXd = strUd;
            } else {
                this.f18365f = Boolean.TRUE;
                iXd2 = 10;
            }
            if (iXd2 != 0) {
                this.f18364e = lambdaSuccess;
                strXd = strUd;
            }
            if (Integer.parseInt(strXd) == 0) {
                this.lambdaError = lambdaError;
            }
            this.lambdaGenericResponse = lambdaSuccess2;
            this.f18362c = setupModel;
            if (setupModel != null && ValidationsHelper.isValidSetupModel(setupModel)) {
                a(setupModel);
                return;
            }
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(strUd) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            if ((iLastIndexOf * 2) % iLastIndexOf != 0) {
                strOd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1110436393 ^ 869873955) ^ 1912001359, Ig.wd("l]\u0015\u0018W", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831080641)))));
            } else {
                strOd = EO.Od("\u0010V\u001a*)}Ash\u0010\u00146^Q\n\u0016\u0019cEo8J", (short) (C1580rY.Xd() ^ ((709940229 ^ 2081854756) ^ (-1447438091))));
            }
            coreErrorModelResponse.setErrorMessage(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd, strOd));
            if (Integer.parseInt(strUd) == 0) {
                this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            }
            this.lambdaError = null;
            return;
        }
        String str2 = f18359g;
        int iLastIndexOf2 = 1;
        if (Integer.parseInt(strUd) != 0) {
            i2 = 1;
            str = strUd;
        } else {
            i2 = 1794125655 ^ 1794125643;
            str = strXd;
            iXd2 = 10;
        }
        int i8 = 2;
        int i9 = 178332974 ^ 178332969;
        if (iXd2 != 0) {
            i4 = i2 + i9;
            i3 = 0;
            str = strUd;
            i5 = 2;
        } else {
            i3 = iXd2 + 10;
            i4 = 1;
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = i3 + i9;
            strXd = str;
        } else {
            i4 += i5 + i5;
            i6 = i3 + iXd;
            i7 = i9;
        }
        if (i6 != 0) {
            i4 /= i7 + i7;
        } else {
            strUd = strXd;
        }
        if (Integer.parseInt(strUd) != 0) {
            i8 = 1;
        } else {
            iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf2 * i8) % iLastIndexOf2 != 0) {
            strZd = BuildConfig.AnonymousClass1.indexOf(C1561oA.Qd("\f\n\u0005\u0003\u0005~\u0001{rz\u0001vtl", (short) (C1607wl.Xd() ^ (1347902393 ^ 1347889597))), C1633zX.Xd() ^ (-1951491164));
        } else {
            strZd = C1593ug.zd("bwxTJ\u0010??@\u007f^V_CMF#\u0019[\u000b\u0019\u001c\u0014! ", (short) (OY.Xd() ^ (726289315 ^ 726279798)), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1959895008 ^ (-1163429651)))));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i4, strZd));
    }

    @Override // com.valid.vssh_android_core.vsshcoreinit.VsshCoreInit
    public void setup(SetupModel setupModel, VsshCoreInitCallback vsshCoreInitCallback) {
        Integer num;
        Integer num2;
        String strKd;
        int i2;
        int i3;
        String strIndexOf;
        int i4;
        String strOd = C1561oA.od("\u0017\u001c", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1054032892 ^ (-1250047611)))));
        int iXd = FB.Xd() ^ (691767574 ^ 1993664045);
        int iXd2 = Od.Xd() ^ 1207800924;
        int i5 = 4;
        int i6 = (393170233 ^ 1562015257) ^ 1249196834;
        int i7 = 0;
        String strKd2 = C1561oA.Kd("I", (short) (ZN.Xd() ^ (1085087147 ^ 1085083561)));
        int i8 = 1;
        if (vsshCoreInitCallback == null) {
            String str = f18359g;
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 4) % iIndexOf == 0) {
                int iXd3 = C1499aX.Xd() ^ 1134241013;
                int iXd4 = C1499aX.Xd() ^ (1880940180 ^ 864529425);
                short sXd = (short) (C1633zX.Xd() ^ iXd3);
                short sXd2 = (short) (C1633zX.Xd() ^ iXd4);
                int[] iArr = new int["r\u001f\u000f\u0010\u00151_d\u0005Khf]_a@\u001a'Y'z\fy\u0007,".length()];
                QB qb = new QB("r\u001f\u000f\u0010\u00151_d\u0005Khf]_a@\u001a'Y'z\fy\u0007,");
                int i9 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i9] = xuXd.fK(((i9 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i9++;
                }
                strIndexOf = new String(iArr, 0, i9);
            } else {
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(C1561oA.Xd("8\u001c6PJ_(*", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609519994)))), (1814566124 ^ 1569971541) ^ 834390507);
            }
            int i10 = Integer.parseInt(strKd2) != 0 ? 1 : 18;
            int i11 = i10 + i10 + i10;
            if (Integer.parseInt(strKd2) != 0) {
                strOd = strKd2;
                i5 = 1;
                i4 = 1;
            } else {
                i4 = i11 + 9;
                iXd = C1499aX.Xd() ^ (452435610 ^ (-1500314000));
                i8 = 4;
            }
            if (iXd != 0) {
                i4 += i5 + i8;
            } else {
                strKd2 = strOd;
                iXd2 = 0;
            }
            if (Integer.parseInt(strKd2) == 0) {
                i4 /= iXd2 << 2;
            }
            VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strIndexOf, i4));
            return;
        }
        if (Integer.parseInt(strKd2) == 0) {
            this.f18365f = Boolean.TRUE;
        }
        this.callback = vsshCoreInitCallback;
        this.f18361b = vsshCoreInitCallback;
        this.f18362c = setupModel;
        if (setupModel != null && ValidationsHelper.isValidSetupModel(setupModel)) {
            a(setupModel);
            return;
        }
        BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
        if (Integer.parseInt(strKd2) != 0) {
            num = null;
            num2 = null;
        } else {
            num = 0;
            num2 = VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE;
            i5 = 13;
        }
        int iIndexOf2 = i5 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        if ((iIndexOf2 * i6) % iIndexOf2 != 0) {
            short sXd3 = (short) (Od.Xd() ^ (1808043555 ^ (-1808063674)));
            int[] iArr2 = new int["MM\u007f\u0005\u0001x~\u0014\u0011\u000b\u0010\u000b\t\r\u0001\u0001,#M#O\u0019Ka\t\u0011\u0010\\\f\u0003\u000e\u0002\u001d#)\u001d\u001e \u001f".length()];
            QB qb2 = new QB("MM\u007f\u0005\u0001x~\u0014\u0011\u000b\u0010\u000b\t\r\u0001\u0001,#M#O\u0019Ka\t\u0011\u0010\\\f\u0003\u000e\u0002\u001d#)\u001d\u001e \u001f");
            int i12 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i12] = xuXd2.fK((sXd3 ^ i12) + xuXd2.CK(iKK2));
                i12++;
            }
            strKd = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i12), (1448622728 ^ 1362216814) ^ 124386727);
        } else {
            strKd = Qg.kd("/T>STWP\u000b88;4A7L;4v03</", (short) (ZN.Xd() ^ (1407277181 ^ 1407268917)), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951477884))));
        }
        if (Integer.parseInt(strKd2) != 0) {
            i6 = iXd;
            strOd = strKd2;
            i2 = 1;
        } else {
            i2 = 72;
            i8 = i6;
        }
        if (i6 != 0) {
            i2 += i8 + i8;
        } else {
            strKd2 = strOd;
            iXd2 = 0;
            i7 = i6 + 5;
        }
        if (Integer.parseInt(strKd2) != 0) {
            i3 = i7 + iXd;
        } else {
            i2 /= iXd2 + iXd2;
            i3 = i7 + 14;
        }
        if (i3 != 0) {
            baseVsshCoreCallback.onCoreError(num, num2, BuildConfig.AnonymousClass1.indexOf(strKd, i2));
        }
        this.callback = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.valid.vssh_android_core.basecore.BaseVsshCore, com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void successEvent(BaseSuccessEvent baseSuccessEvent) {
        Integer num;
        String str;
        int iXd;
        BaseModelResponse baseModelResponse;
        Integer num2;
        int iXd2;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        int i5;
        byte b2;
        int i6;
        int i7;
        int i8;
        int iLastIndexOf;
        Gson gson;
        String string;
        Object objFromJson;
        Map<String, Object> map;
        char c2 = 15;
        char c3 = '\b';
        int i9 = (1135523793 ^ 1907838688) ^ 840563003;
        int i10 = 0;
        String strVd = hg.Vd("\u0007", (short) (OY.Xd() ^ (1598599384 ^ 1598592573)), (short) (OY.Xd() ^ ((1696840034 ^ 648811068) ^ 1133489566)));
        Integer num3 = null;
        CoreGenericBridgeModelResponse coreGenericBridgeModelResponse = null;
        String strUd = C1561oA.ud("^", (short) (Od.Xd() ^ (356262313 ^ (-356268137))));
        int iLastIndexOf2 = 1;
        if (baseSuccessEvent == null || baseSuccessEvent.getResponse() == null || baseSuccessEvent.getResponse().isEmpty()) {
            BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
            if (Integer.parseInt(strUd) != 0) {
                i9 = 8;
                num = null;
                str = strUd;
            } else {
                num3 = 0;
                num = VsshCoreConstants.INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE;
                str = strVd;
            }
            if (i9 != 0) {
                str = strUd;
            }
            if (Integer.parseInt(str) != 0) {
                c2 = '\b';
                iXd = 1;
                strVd = str;
            } else {
                iXd = C1607wl.Xd() ^ (544274108 ^ 1312089462);
            }
            int i11 = (2046756761 ^ 988816044) ^ 1125066061;
            if (c2 != 0) {
                i11 += iXd;
            } else {
                strUd = strVd;
            }
            if (Integer.parseInt(strUd) == 0) {
                i11 /= 48;
                iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            }
            baseVsshCoreCallback.onCoreError(num3, num, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i11, (iLastIndexOf2 * 5) % iLastIndexOf2 != 0 ? BuildConfig.AnonymousClass1.indexOf(ZO.xd("w\u0006!M\u000fp\"E?+bJMrbf\bbSHHalWB\u0002#*\u001cS[7&Jk4G\u007f9", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69948866))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831084635))), FB.Xd() ^ 1609527103) : C1626yg.Ud("*,\r\t\u001a\u0011vsE=s^+\u000bD\u0004]7\u001eT\u0002\u001cr#=O\u001dkN\u0006C1W{>\u0017i\u0014.I\u0010\nRJ6", (short) (ZN.Xd() ^ (FB.Xd() ^ (1011557067 ^ 1671716147))), (short) (ZN.Xd() ^ ((1417967668 ^ 1993838552) ^ 575924837)))));
            return;
        }
        Object typedResponse = baseSuccessEvent.getTypedResponse(BaseModelResponse.class);
        if (Integer.parseInt(strUd) != 0) {
            baseModelResponse = null;
            num2 = null;
        } else {
            baseModelResponse = (BaseModelResponse) typedResponse;
            num2 = CommunicationConstants.STATUS_CODE_SUCCESS;
        }
        if (!num2.equals(baseModelResponse.getStatusCode())) {
            VsshCoreInitCallback vsshCoreInitCallback = this.f18361b;
            if (vsshCoreInitCallback == null) {
                this.f18363d.lambdaSuccessResponse(Boolean.FALSE);
                return;
            } else {
                vsshCoreInitCallback.initResponse(false);
                return;
            }
        }
        int i12 = 3;
        int i13 = (654895893 ^ 2127785000) ^ 1507559224;
        if (Integer.parseInt(strUd) != 0) {
            str2 = strUd;
            iXd2 = 1;
            i2 = 1;
            i3 = 9;
        } else {
            iXd2 = Od.Xd() ^ (1824850675 ^ 725128898);
            str2 = strVd;
            i2 = 3;
            i3 = i13;
        }
        if (i3 != 0) {
            iXd2 += i2 + i2;
            str2 = strUd;
        }
        if (Integer.parseInt(str2) != 0) {
            c3 = 15;
        } else {
            iXd2 /= 20;
        }
        int iLastIndexOf3 = c3 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        if (VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd2, (iLastIndexOf3 * 2) % iLastIndexOf3 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1561oA.yd("^SVqc[J)", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849968206)))), (1322654693 ^ 2016752298) ^ 920856842) : C1561oA.Yd(";/:\t\u0001sqr{z\u000b\u000bq\u0007\u000b", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (42911544 ^ (-1825213653)))))).equals(baseModelResponse.getServiceName())) {
            exchangeKey();
            return;
        }
        if (Integer.parseInt(strUd) != 0) {
            i5 = 0;
            str3 = strUd;
            i4 = 1;
            b2 = 14;
        } else {
            i4 = (1357365934 ^ 1575576453) ^ 219062585;
            str3 = strVd;
            i5 = 9;
            b2 = 11;
        }
        if (b2 != 0) {
            i6 = i5 << 2;
            str3 = strUd;
        } else {
            i6 = 1;
        }
        int i14 = 4;
        if (Integer.parseInt(str3) != 0) {
            i12 = 4;
            i14 = 1;
        } else {
            i4 += i6;
            str3 = strVd;
            i6 = 4;
        }
        if (i12 != 0) {
            i4 += i6 + i14;
            i7 = 6;
            str3 = strUd;
        } else {
            i7 = 0;
            i10 = i12 + 11;
        }
        if (Integer.parseInt(str3) != 0) {
            i8 = i10 + i9;
        } else {
            i4 /= i7 << 2;
            i8 = i10 + 7;
        }
        if (i8 != 0) {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        } else {
            iLastIndexOf = 1;
            i13 = 1;
        }
        if (VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i4, (iLastIndexOf * i13) % iLastIndexOf != 0 ? BuildConfig.AnonymousClass1.indexOf(Xg.qd("\u0012\u0011\u0014\u000f\u0016\u0015\u0018\u000b", (short) (FB.Xd() ^ (1486596719 ^ 1486589429)), (short) (FB.Xd() ^ ((556374312 ^ 1606124134) ^ 2123518566))), (1237121648 ^ 2122523551) ^ 926931413) : Jg.Wd("@:\nJ\u000eU\u0018-4)\u0017U,$mQ\u0017e9~HK\u001f", (short) (Od.Xd() ^ (OY.Xd() ^ (1601640106 ^ (-1532767303)))), (short) (Od.Xd() ^ (1788105334 ^ (-1788099068))))).equals(baseModelResponse.getServiceName())) {
            ParametersModelResponse parametersModelResponse = (ParametersModelResponse) (Integer.parseInt(strUd) != 0 ? null : baseSuccessEvent.getBaseResponseModel(ParametersModelResponse.class).getResponse());
            if (baseSuccessEvent.getHeader() == null) {
                throw null;
            }
            parametersModelResponse.setHeaders(baseSuccessEvent.getHeader().toString());
            throw null;
        }
        if (!this.f18365f.booleanValue()) {
            CommunicationHelper.getInstance().setCommunicationManager(this.f18360a);
            VsshCoreInitCallback vsshCoreInitCallback2 = this.f18361b;
            if (vsshCoreInitCallback2 == null) {
                this.f18363d.lambdaSuccessResponse(Boolean.TRUE);
                return;
            } else {
                vsshCoreInitCallback2.initResponse(true);
                return;
            }
        }
        CommunicationHelper communicationHelper = CommunicationHelper.getInstance();
        if (Integer.parseInt(strUd) != 0) {
            gson = null;
            strVd = strUd;
            i9 = 14;
        } else {
            communicationHelper.setCommunicationManager(this.f18360a);
            gson = new Gson();
        }
        if (i9 != 0) {
            string = baseModelResponse.getResponse().toString();
        } else {
            strUd = strVd;
            string = null;
        }
        if (Integer.parseInt(strUd) != 0) {
            objFromJson = null;
            c2 = '\t';
        } else {
            objFromJson = gson.fromJson(string, (Class<Object>) Map.class);
        }
        if (c2 != 0) {
            map = (Map) objFromJson;
            coreGenericBridgeModelResponse = new CoreGenericBridgeModelResponse();
        } else {
            map = null;
        }
        coreGenericBridgeModelResponse.setResponse(map);
        if (baseSuccessEvent.getHeader() != null) {
            coreGenericBridgeModelResponse.setHeaders(baseSuccessEvent.getHeader().toString());
        }
        this.f18364e.lambdaSuccessResponse(coreGenericBridgeModelResponse);
    }
}
