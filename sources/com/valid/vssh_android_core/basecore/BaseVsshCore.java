package com.valid.vssh_android_core.basecore;

import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.communicationmanager.CommunicationManagerCallback;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.ErrorData;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.utils.VsshCoreConstants;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class BaseVsshCore implements CommunicationManagerCallback {
    public Map<String, Object> body;
    public BaseVsshCoreCallback callback;
    public LambdaError<CoreErrorModelResponse> lambdaError;
    public LambdaSuccess<CoreGenericModelResponse> lambdaGenericResponse;
    public Map<String, Object> principalData;

    public class Exception extends RuntimeException {
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void errorEvent(BaseErrorEvent baseErrorEvent) {
        Integer numValueOf;
        int i2;
        int i3;
        String strYd;
        ErrorData errorData = baseErrorEvent.getErrorData();
        String strYd2 = C1561oA.yd("\u0013", (short) (C1580rY.Xd() ^ (31755702 ^ (-31763793))));
        if (errorData == null) {
            BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
            if (baseVsshCoreCallback == null) {
                CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
                if (Integer.parseInt(strYd2) != 0) {
                    coreErrorModelResponse = null;
                } else {
                    coreErrorModelResponse.setHttpErrorCode(Integer.valueOf(baseErrorEvent.getHttpStatusCode()));
                }
                this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            } else {
                baseVsshCoreCallback.onCoreError(Integer.parseInt(strYd2) != 0 ? null : Integer.valueOf(baseErrorEvent.getHttpStatusCode()), null, null);
            }
        } else {
            BaseVsshCoreCallback baseVsshCoreCallback2 = this.callback;
            if (baseVsshCoreCallback2 == null) {
                CoreErrorModelResponse coreErrorModelResponse2 = new CoreErrorModelResponse();
                if (Integer.parseInt(strYd2) != 0) {
                    i3 = 424153044 ^ 424153051;
                    strYd = strYd2;
                    coreErrorModelResponse2 = null;
                } else {
                    coreErrorModelResponse2.setHttpErrorCode(Integer.valueOf(baseErrorEvent.getHttpStatusCode()));
                    i3 = 12;
                    strYd = C1561oA.Yd("SY", (short) (ZN.Xd() ^ (2076962156 ^ 2076955053)));
                }
                if (i3 != 0) {
                    coreErrorModelResponse2.setInternalErrorCode(baseErrorEvent.getErrorData().getErrorType());
                } else {
                    strYd2 = strYd;
                }
                if (Integer.parseInt(strYd2) == 0) {
                    coreErrorModelResponse2.setErrorMessage(baseErrorEvent.getErrorData().getMessage());
                }
                this.lambdaError.lambdaErrorResponse(coreErrorModelResponse2);
            } else {
                if (Integer.parseInt(strYd2) != 0) {
                    i2 = 1313355252 ^ 1313355251;
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(baseErrorEvent.getHttpStatusCode());
                    i2 = 6;
                }
                baseVsshCoreCallback2.onCoreError(numValueOf, i2 != 0 ? baseErrorEvent.getErrorData().getErrorType() : null, baseErrorEvent.getErrorData().getMessage());
            }
        }
        this.callback = null;
    }

    public void requestParamsError() {
        String strIndexOf;
        try {
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(Xg.qd("c", (short) (ZN.Xd() ^ (184528087 ^ 184536501)), (short) (ZN.Xd() ^ ((651418766 ^ 1201257776) ^ 1632243761)))) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            if ((iLastIndexOf * 2) % iLastIndexOf == 0) {
                strIndexOf = Jg.Wd("f/E62Q&l]\u0002\tuu\u007f9,`N\u00153HG", (short) (ZN.Xd() ^ ((1125260347 ^ 478544690) ^ 1603550608)), (short) (ZN.Xd() ^ ((1605944371 ^ 1216002196) ^ 398603729)));
            } else {
                short sXd = (short) (C1580rY.Xd() ^ ((821550297 ^ 345482784) ^ (-610291173)));
                short sXd2 = (short) (C1580rY.Xd() ^ (555710489 ^ (-555684594)));
                int[] iArr = new int["6b>Y_;?IgEG\u0007LSKP\t')r9\u000ei%\u001dn\u000b9\u001b\"#z.6Y\u0012".length()];
                QB qb = new QB("6b>Y_;?IgEG\u0007LSKP\t')r9\u000ei%\u001dn\u000b9\u001b\"#z.6Y\u0012");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i2), (557658092 ^ 1907185554) ^ 1351645291);
            }
            coreErrorModelResponse.setErrorMessage(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1, strIndexOf));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
        } catch (Exception unused) {
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void successEvent(BaseSuccessEvent baseSuccessEvent) {
        Integer num;
        Integer num2;
        int iXd;
        String serviceName;
        Integer statusCode;
        String strUd = C1626yg.Ud("gJ", (short) (FB.Xd() ^ (350721124 ^ 350727855)), (short) (FB.Xd() ^ ((1650637646 ^ 384830847) ^ 1955768150)));
        int i2 = 6;
        String strWd = Ig.wd("=", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951497526))));
        CoreGenericModelResponse coreGenericModelResponse = null;
        if (baseSuccessEvent != null && baseSuccessEvent.getResponse() != null && !baseSuccessEvent.getResponse().isEmpty()) {
            BaseModelResponse baseResponseModel = baseSuccessEvent.getBaseResponseModel(BaseModelResponse.class);
            String string = baseSuccessEvent.getHeader() != null ? baseSuccessEvent.getHeader().toString() : null;
            BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
            if (baseVsshCoreCallback != null) {
                if (Integer.parseInt(strWd) != 0) {
                    serviceName = null;
                    statusCode = null;
                } else {
                    serviceName = baseResponseModel.getServiceName();
                    statusCode = baseResponseModel.getStatusCode();
                }
                baseVsshCoreCallback.onGenericResponse(serviceName, statusCode, baseResponseModel.getMessage(), string);
                this.callback = null;
                return;
            }
            CoreGenericModelResponse coreGenericModelResponse2 = new CoreGenericModelResponse();
            if (Integer.parseInt(strWd) != 0) {
                i2 = 4;
                strUd = strWd;
            } else {
                coreGenericModelResponse2.setServiceName(baseResponseModel.getServiceName());
                coreGenericModelResponse = coreGenericModelResponse2;
            }
            if (i2 != 0) {
                coreGenericModelResponse.setStatusCode(baseResponseModel.getStatusCode());
            } else {
                strWd = strUd;
            }
            if (Integer.parseInt(strWd) == 0) {
                coreGenericModelResponse.setMessage(baseResponseModel.getMessage());
            }
            coreGenericModelResponse.setHeaders(string);
            this.lambdaGenericResponse.lambdaSuccessResponse(coreGenericModelResponse);
            return;
        }
        BaseVsshCoreCallback baseVsshCoreCallback2 = this.callback;
        int i3 = 0;
        if (baseVsshCoreCallback2 == null) {
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(strWd) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE);
            int iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            coreErrorModelResponse.setErrorMessage(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(4, (iLastIndexOf * 4) % iLastIndexOf != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1633zX.Xd() ^ (-1951491165), EO.Od("\u001f}QG/cDc\u0010\u0014Ow \u001a\u000bbz{F\u0005{\u0006;bwDYb", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951480557)))) : C1561oA.Qd("e\u0004\u0003?KN<W@EDR\n@8:>~\b\u0007|r\u0002~\u0001\u00065krA+6#2e&,s6\u001d7\u001aife", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1322247652 ^ 223642991))))));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
        } else {
            if (Integer.parseInt(strWd) != 0) {
                num = null;
                num2 = null;
            } else {
                num = 0;
                num2 = VsshCoreConstants.INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE;
            }
            int iLastIndexOf2 = 1;
            if (Integer.parseInt(strWd) != 0) {
                iXd = C1633zX.Xd() ^ (-1951491133);
                strUd = strWd;
                i2 = 1;
            } else {
                iXd = 3;
            }
            int i4 = (390522734 ^ 1802820945) ^ 2083666439;
            if (iXd != 0) {
                i4 += i2;
                i3 = 14;
            } else {
                strWd = strUd;
            }
            if (Integer.parseInt(strWd) == 0) {
                i4 /= i3 + i3;
                iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            }
            baseVsshCoreCallback2.onCoreError(num, num2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i4, (iLastIndexOf2 * 5) % iLastIndexOf2 == 0 ? C1593ug.zd("\u0011\u0019\u001a9bk_xgnos5qks:4C040A@HO|=>\u0013~\b\u0013\b=\u0010\u0004Q\u0016\u0003\u000f\u007fQ`Y", (short) (C1499aX.Xd() ^ (1419192435 ^ (-1419197946))), (short) (C1499aX.Xd() ^ (577501545 ^ (-577491044)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ (1073063004 ^ 209689293), C1561oA.od("XX\u001ei\r\u000e\"\"\u001d\u001f\"PHT\\\u0006\u001aJ>NQx}~\u0005u\u001394vvy\u0006\n\u00050\u0005~D", (short) (C1580rY.Xd() ^ ((1832007878 ^ 328383929) ^ (-2124463785)))))));
        }
        this.callback = null;
    }
}
