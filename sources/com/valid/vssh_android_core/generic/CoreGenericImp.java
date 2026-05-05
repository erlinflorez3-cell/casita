package com.valid.vssh_android_core.generic;

import com.dynatrace.android.agent.Global;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.helpers.CommunicationConstants;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.communication.models.BaseModelResponse;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseResponse;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.utils.ValidationsHelper;
import com.valid.vssh_android_core.utils.VsshCoreConstants;
import java.io.PrintStream;
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
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CoreGenericImp<T extends BaseResponse> extends BaseVsshCore implements CoreGeneric<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f18348f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommunicationManager f18349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LambdaSuccess<T> f18350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LambdaSuccess<CoreGenericBridgeModelResponse> f18351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class<T> f18352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f18353e = Boolean.FALSE;

    public class NullPointerException extends RuntimeException {
    }

    static {
        try {
            f18348f = Wg.vd("\u001dHJ<!>N?\u001b>@", (short) (C1499aX.Xd() ^ ((1484614627 ^ 1928975513) ^ (-713326622))));
        } catch (NullPointerException unused) {
        }
    }

    public final void a(GenericModel genericModel) throws CommunicationException {
        char c2;
        int iXd;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        JsonParser jsonParser;
        Gson gson;
        int i11;
        int iIndexOf;
        int i12;
        String strLastIndexOf;
        int i13;
        int i14;
        int i15;
        char c3;
        String str2;
        int i16;
        int i17;
        int i18;
        int iIndexOf2;
        int i19;
        int i20;
        int iXd2;
        String str3;
        int i21;
        CoreGenericImp<T> coreGenericImp;
        CoreGenericImp<T> coreGenericImp2;
        boolean zBooleanValue;
        String str4;
        boolean zBooleanValue2;
        String str5;
        CoreGenericImp<T> coreGenericImp3;
        CommunicationManager communicationManager;
        Integer method;
        StringBuilder sb;
        Map<String, String> headers;
        String string;
        int iIndexOf3;
        int i22;
        String strIndexOf;
        int i23;
        int i24;
        String str6;
        int i25;
        JsonParser jsonParser2;
        int i26 = 1275770392 ^ 1275770394;
        boolean zBooleanValue3 = false;
        short sXd = (short) (C1499aX.Xd() ^ ((1904315858 ^ 1593933287) ^ (-780183785)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((2131660419 ^ 1369777356) ^ (-783006472)));
        int[] iArr = new int["+".length()];
        QB qb = new QB("+");
        int i27 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i27] = xuXd.fK(((sXd + i27) + xuXd.CK(iKK)) - sXd2);
            i27++;
        }
        String str7 = new String(iArr, 0, i27);
        if (genericModel == null || !ValidationsHelper.isValidGenericModel(genericModel)) {
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(str7) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
            coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf((iIndexOf4 * 2) % iIndexOf4 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1378519793 ^ 691201355) ^ 2065199099, C1593ug.zd("IKGKED\u0012_ca\"OO\u001ai\u000elhb&0Uq\u001e&ie,\\a^4*xy<l43", (short) (C1633zX.Xd() ^ (1957311417 ^ (-1957324904))), (short) (C1633zX.Xd() ^ (2112900255 ^ (-2112894559))))) : C1561oA.od("\u0003\u001c\u0006\u0017 \u001b\u0014N\u001c\u0018~{\u0001z\u0010~\u007f:sv\br", (short) (C1633zX.Xd() ^ ((1466538956 ^ 1253196610) ^ (-500942703)))), i26));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            return;
        }
        Map<String, Object> requestBody = genericModel.getRequestBody();
        char c4 = 11;
        int i28 = 13;
        if (Integer.parseInt(str7) != 0) {
            c2 = 11;
            requestBody = null;
        } else {
            this.body = requestBody;
            c2 = '\r';
        }
        int iIntValue = 1;
        int iIndexOf5 = c2 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int iXd3 = C1607wl.Xd() ^ 1849955294;
        String strLastIndexOf2 = (iIndexOf5 * iXd3) % iIndexOf5 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(Od.Xd() ^ (949285976 ^ 2137612336), hg.Vd(":\u0004:<_\u001ct\\", (short) (C1580rY.Xd() ^ (1434230566 ^ (-1434228365))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207808231))))) : C1561oA.ud("EAZUPR9FQ\u001fBK>", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (1007462991 ^ 1214119292))));
        int i29 = Integer.parseInt(str7);
        int i30 = 19;
        String strYd = C1561oA.yd("\u0018\u001d", (short) (ZN.Xd() ^ (212793992 ^ 212777631)));
        if (i29 != 0) {
            i2 = 0;
            str = str7;
            iXd = 1;
            i3 = 5;
        } else {
            iXd = ZN.Xd() ^ 864698070;
            i2 = 19;
            i3 = 8;
            str = strYd;
        }
        char c5 = 14;
        if (i3 != 0) {
            i5 = i2 << 2;
            i4 = 0;
            str = str7;
        } else {
            i4 = i3 + 14;
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = i4 + 14;
            i7 = 1;
        } else {
            iXd += i5;
            i6 = i4 + 5;
            i5 = iXd3;
            i7 = i5;
            str = strYd;
        }
        if (i6 != 0) {
            iXd += i5 + i7;
            i8 = 0;
            str = str7;
        } else {
            i8 = i6 + 11;
            i30 = 0;
        }
        if (Integer.parseInt(str) != 0) {
            i9 = i8 + 8;
        } else {
            iXd /= i30 + i30;
            i9 = i8 + 5;
            str = strYd;
        }
        if (i9 != 0) {
            strLastIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf2, iXd);
            jsonParser = new JsonParser();
            i10 = 0;
            str = str7;
        } else {
            i10 = i9 + 14;
            jsonParser = null;
        }
        int i31 = (1965876507 ^ 532306506) ^ 1788264279;
        if (Integer.parseInt(str) != 0) {
            i11 = i10 + 6;
            gson = null;
        } else {
            gson = new Gson();
            i11 = i10 + 2;
        }
        requestBody.put(strLastIndexOf2, jsonParser.parse(i11 != 0 ? gson.toJson(genericModel.getPrincipalData()) : null));
        int i32 = 3;
        if (genericModel.getAdditionalData() != null && !genericModel.getAdditionalData().isEmpty()) {
            Map<String, Object> map = this.body;
            if (Integer.parseInt(str7) != 0) {
                iIndexOf3 = 1;
                i22 = 1;
            } else {
                iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
                i22 = iXd3;
            }
            if ((i22 * iIndexOf3) % iIndexOf3 == 0) {
                strIndexOf = C1561oA.Yd("{\u0001x\u0006h\u0006\u0006\u0007{\tX}\t}", (short) (C1499aX.Xd() ^ (99849594 ^ (-99845395))));
            } else {
                short sXd3 = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1883816272 ^ (-1103202769))));
                short sXd4 = (short) (OY.Xd() ^ ((1188659375 ^ 1828655932) ^ 707181228));
                int[] iArr2 = new int["gmhACsJw{o{Lrr\u007f\u0001Fww\u0004N\u0013\u0016\u001b\u0014\u0019K\u001e\u001a JDFM \u001aJe\u0015".length()];
                QB qb2 = new QB("gmhACsJw{o{Lrr\u007f\u0001Fww\u0004N\u0013\u0016\u001b\u0014\u0019K\u001e\u001a JDFM \u001aJe\u0015");
                int i33 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i33] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i33)) + sXd4);
                    i33++;
                }
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i33), 15);
            }
            if (Integer.parseInt(str7) != 0) {
                str6 = str7;
                i23 = 1;
                i24 = 1;
            } else {
                i23 = 90;
                i24 = 3;
                str6 = strYd;
                c4 = 3;
            }
            if (c4 != 0) {
                i23 += i24 + i24;
                str6 = str7;
            }
            if (Integer.parseInt(str6) != 0) {
                i25 = iXd3;
            } else {
                i23 /= 20;
                i25 = 8;
                str6 = strYd;
            }
            if (i25 != 0) {
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i23);
                jsonParser2 = new JsonParser();
                str6 = str7;
            } else {
                jsonParser2 = null;
            }
            map.put(strIndexOf, jsonParser2.parse((Integer.parseInt(str6) != 0 ? null : new Gson()).toJson(genericModel.getAdditionalData())));
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        if (Integer.parseInt(str7) != 0) {
            iIndexOf = 1;
            i12 = 1;
        } else {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i12 = iXd3;
        }
        if ((i12 * iIndexOf) % iIndexOf == 0) {
            strLastIndexOf = Jg.Wd("\u001b=\u0003@Kǀi\u0010\\~Fvj\u0011N o,X\u0011AC^b$U\n9v-B\u001cHt&s\u001c\u001f\u0004#o\fLzs'\\=\f6t$U\rGCI", (short) (ZN.Xd() ^ ((1090396314 ^ 622325173) ^ 1709813405)), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951493480))));
        } else {
            int iXd4 = C1607wl.Xd() ^ 1849955213;
            int iXd5 = C1499aX.Xd() ^ (1344868414 ^ 330455248);
            short sXd5 = (short) (C1499aX.Xd() ^ ((770347567 ^ 1648417388) ^ (-1336562169)));
            short sXd6 = (short) (C1499aX.Xd() ^ iXd5);
            int[] iArr3 = new int["ܗz7bKy6".length()];
            QB qb3 = new QB("ܗz7bKy6");
            int i34 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i34] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i34 % C1561oA.Xd.length] ^ ((i34 * sXd6) + sXd5)));
                i34++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd4, new String(iArr3, 0, i34));
        }
        if (Integer.parseInt(str7) != 0) {
            str2 = str7;
            c3 = '\r';
            i13 = 1;
            i15 = 1;
            i14 = 1;
        } else {
            i13 = (1589088127 ^ 2139422260) ^ 557019611;
            i14 = i26;
            i15 = iXd3;
            c3 = '\b';
            str2 = strYd;
        }
        if (c3 != 0) {
            i13 += i15 << i14;
            str2 = str7;
        }
        if (Integer.parseInt(str2) != 0) {
            i16 = 5;
        } else {
            i13 /= 72;
            i16 = i26;
            str2 = strYd;
        }
        if (i16 != 0) {
            sb2 = sb2.append(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, i13));
            i17 = 0;
            str2 = str7;
        } else {
            i17 = i16 + iXd3;
        }
        if (Integer.parseInt(str2) != 0) {
            i18 = i17 + 8;
        } else {
            sb2 = sb2.append(genericModel.getApi());
            i18 = i17 + iXd3;
            str2 = strYd;
        }
        if (i18 != 0) {
            sb2 = sb2.append(genericModel.getEndPoint());
            str2 = str7;
        }
        if (Integer.parseInt(str2) != 0) {
            iIndexOf2 = 1;
            i19 = 1;
        } else {
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            i19 = i26;
        }
        String strUd = (i19 * iIndexOf2) % iIndexOf2 == 0 ? C1626yg.Ud("^&r( K\u001bi\u000fw\n2", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849982133))), (short) (Od.Xd() ^ (FB.Xd() ^ (97741991 ^ (-1513893478))))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1607wl.Xd() ^ 1849955262, Ig.wd("c\u0017\n}", (short) (Od.Xd() ^ ((902926506 ^ 1285522867) ^ (-2035178311)))));
        if (Integer.parseInt(str7) != 0) {
            i32 = 1;
            i20 = 1;
        } else {
            i20 = 120;
        }
        int i35 = i20 + i32 + i32;
        if (Integer.parseInt(str7) != 0) {
            str3 = str7;
            i21 = 13;
            iXd2 = 1;
        } else {
            iXd2 = C1607wl.Xd() ^ (1172754072 ^ 732093782);
            str3 = strYd;
            i21 = i31;
        }
        int i36 = 10;
        if (i21 != 0) {
            strUd = BuildConfig.AnonymousClass1.indexOf(strUd, i35 / (iXd2 + 10));
            str3 = str7;
        }
        if (Integer.parseInt(str3) != 0) {
            coreGenericImp = null;
        } else {
            sb2 = sb2.append(strUd);
            coreGenericImp = this;
        }
        StringBuilder sbAppend = sb2.append(coreGenericImp.body.toString());
        if (Integer.parseInt(str7) != 0) {
            coreGenericImp2 = null;
        } else {
            printStream.println(sbAppend.toString());
            coreGenericImp2 = this;
        }
        coreGenericImp2.f18349a = CommunicationHelper.getInstance().getCommunicationManager();
        CommunicationManager communicationManager2 = this.f18349a;
        if (communicationManager2 == null) {
            int iIndexOf6 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf6 * 2) % iIndexOf6 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1400684404 ^ 1948053759) ^ 660623338, EO.Od("%&'\u0018\u0010.>%V,nJ[\u0010\u0004a8\u001fyUn\u001ar,\u000e6Z\u0006v\t`n rT\u0019", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (547734285 ^ (-288155910)))))) : C1561oA.Qd("1k\\ Zfdd`EHRL_@FG\u0004HEJO8ERP\u0012H:\fG<IG", (short) (OY.Xd() ^ (Od.Xd() ^ (1522649248 ^ 490484050)))), i26));
        }
        if (Integer.parseInt(str7) != 0) {
            iXd3 = C1580rY.Xd() ^ (-831067155);
            zBooleanValue = false;
            str4 = str7;
        } else {
            zBooleanValue = genericModel.getSslPinning().booleanValue();
            str4 = strYd;
        }
        if (iXd3 != 0) {
            communicationManager2.setEnableRequestWithSSLPinning(zBooleanValue);
            communicationManager2 = this.f18349a;
            str4 = str7;
        }
        if (Integer.parseInt(str4) != 0) {
            zBooleanValue2 = false;
        } else {
            zBooleanValue2 = genericModel.getResponseEncrypted().booleanValue();
            str4 = strYd;
            i28 = i31;
        }
        if (i28 != 0) {
            communicationManager2.isResponseEncrypted(zBooleanValue2);
            communicationManager2 = this.f18349a;
            str4 = str7;
        }
        communicationManager2.disableSecureRequest(Integer.parseInt(str4) != 0 ? false : genericModel.getSecureRequest().booleanValue());
        CommunicationManager communicationManager3 = this.f18349a;
        if (Integer.parseInt(str7) != 0) {
            str5 = str7;
            i36 = 1351049362 ^ 1351049373;
        } else {
            zBooleanValue3 = genericModel.getAddSessionIdToRequest().booleanValue();
            str5 = strYd;
        }
        if (i36 != 0) {
            communicationManager3.addSessionIdInEncryptedData(zBooleanValue3);
            communicationManager3 = this.f18349a;
            str5 = str7;
        }
        if (Integer.parseInt(str5) != 0) {
            coreGenericImp3 = null;
        } else {
            communicationManager3.setCallback(this);
            coreGenericImp3 = this;
            i31 = i26;
            str5 = strYd;
        }
        if (i31 != 0) {
            communicationManager = coreGenericImp3.f18349a;
            method = genericModel.getMethod();
            str5 = str7;
        } else {
            communicationManager = null;
            method = null;
        }
        if (Integer.parseInt(str5) != 0) {
            strYd = str5;
            c5 = 5;
            sb = null;
        } else {
            iIntValue = method.intValue();
            sb = new StringBuilder();
        }
        if (c5 != 0) {
            sb = sb.append(genericModel.getApi());
        } else {
            str7 = strYd;
        }
        if (Integer.parseInt(str7) != 0) {
            i26 = 5;
        } else {
            sb = sb.append(genericModel.getEndPoint());
        }
        if (i26 != 0) {
            string = sb.toString();
            headers = genericModel.getHeaders();
        } else {
            headers = null;
            string = null;
        }
        communicationManager.consumeVsshService(iIntValue, string, headers, this.body);
    }

    @Override // com.valid.vssh_android_core.generic.CoreGeneric
    public void consumeGenericService(GenericModel genericModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        int i2;
        int i3;
        String str;
        int iXd;
        int i4;
        int i5;
        int i6;
        String strVd;
        int i7 = 1133802892 ^ 1133802885;
        short sXd = (short) (C1499aX.Xd() ^ (1692057152 ^ (-1692045161)));
        int[] iArr = new int["\u0003\u0007".length()];
        QB qb = new QB("\u0003\u0007");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i8));
            i8++;
        }
        String str2 = new String(iArr, 0, i8);
        String strZd = Wg.Zd(Global.QUESTION, (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134249698)), (short) (Od.Xd() ^ (ZN.Xd() ^ (-864698993))));
        if (lambdaSuccess != null && lambdaSuccess2 != null && lambdaError != null) {
            if (Integer.parseInt(strZd) != 0) {
                str2 = strZd;
            } else {
                this.f18353e = Boolean.TRUE;
                i7 = (1035094876 ^ 2044667846) ^ 1148021913;
            }
            if (i7 != 0) {
                this.f18351c = lambdaSuccess;
            } else {
                strZd = str2;
            }
            if (Integer.parseInt(strZd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess2;
            }
            this.lambdaError = lambdaError;
            a(genericModel);
            return;
        }
        String str3 = f18348f;
        int iLastIndexOf = 1;
        if (Integer.parseInt(strZd) != 0) {
            iXd = C1499aX.Xd() ^ (-1134257942);
            i2 = 1;
            i3 = 1;
            str = strZd;
        } else {
            i2 = 286;
            i3 = 4;
            str = str2;
            iXd = 10;
        }
        if (iXd != 0) {
            i4 = i3 + i3;
            str = strZd;
        } else {
            i4 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i5 = 0;
            str2 = str;
        } else {
            i2 += i3 + i4;
            i5 = 2105310189 ^ 2105310203;
            i7 = 10;
        }
        if (i7 != 0) {
            i6 = i5 + i5;
        } else {
            i6 = 1;
            strZd = str2;
        }
        if (Integer.parseInt(strZd) == 0) {
            i2 /= i5 + i6;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * 2) % iLastIndexOf != 0) {
            strVd = BuildConfig.AnonymousClass1.indexOf(C1561oA.Xd("y.'2e7\u001e)e!\u001f\u001f.2e%*1/4CB\u0006DK\u0004", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207797438))), (1292016575 ^ 1493189283) ^ 335730977);
        } else {
            strVd = Wg.vd("\u0004\u0015\u0016\u0016k-\\\\U\rgcdPVSC\u0012X \u000e\u0019\u0011\u001a\u0015", (short) (ZN.Xd() ^ ((826029070 ^ 517552279) ^ 803546702)));
        }
        VsshLogger.logError(str3, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, strVd));
    }

    @Override // com.valid.vssh_android_core.generic.CoreGeneric
    public void consumeGenericService(GenericModel genericModel, Class<T> cls, LambdaSuccess<T> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String strLastIndexOf;
        int iXd = C1607wl.Xd() ^ 1849961791;
        int iXd2 = OY.Xd() ^ (164435167 ^ 233193449);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int["\u0004".length()];
        QB qb = new QB("\u0004");
        int i11 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i11] = xuXd.fK(((sXd + i11) + xuXd.CK(iKK)) - sXd2);
            i11++;
        }
        String str2 = new String(iArr, 0, i11);
        if (lambdaSuccess != null && lambdaSuccess2 != null && lambdaError != null) {
            if (Integer.parseInt(str2) == 0) {
                this.f18353e = Boolean.FALSE;
            }
            this.lambdaError = lambdaError;
            if (Integer.parseInt(str2) == 0) {
                this.lambdaGenericResponse = lambdaSuccess2;
            }
            this.f18350b = lambdaSuccess;
            this.f18352d = cls;
            a(genericModel);
            return;
        }
        String str3 = f18348f;
        int i12 = Integer.parseInt(str2);
        String strVd = hg.Vd("yw", (short) (C1633zX.Xd() ^ (943531398 ^ (-943523154))), (short) (C1633zX.Xd() ^ ((1550738401 ^ 268656256) ^ (-1282238112))));
        int iLastIndexOf = 1;
        if (i12 != 0) {
            i3 = 2012011418 ^ 2012011421;
            i2 = 1;
            str = str2;
        } else {
            i2 = 22;
            i3 = 8;
            str = strVd;
        }
        int i13 = 0;
        if (i3 != 0) {
            i5 = i2 + i2;
            str = str2;
            i4 = 0;
        } else {
            i4 = i3 + 6;
            i5 = 1;
        }
        int i14 = 3;
        int i15 = 2078011560 ^ 2078011555;
        if (Integer.parseInt(str) != 0) {
            i7 = i4 + 13;
            i8 = 1;
            i6 = 1;
        } else {
            i6 = i2 + i5 + i15;
            i7 = i4 + 10;
            str = strVd;
            i8 = 3;
        }
        if (i7 != 0) {
            i6 += i8 + i8;
            str = str2;
            i9 = 0;
        } else {
            i9 = i7 + 10;
        }
        if (Integer.parseInt(str) != 0) {
            i10 = i9 + i15;
            i15 = 0;
            strVd = str;
        } else {
            i10 = i9 + 15;
            i13 = i15;
        }
        if (i10 != 0) {
            i6 /= i13 + (i15 + i13);
        } else {
            str2 = strVd;
        }
        if (Integer.parseInt(str2) != 0) {
            i14 = 1;
        } else {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * i14) % iLastIndexOf == 0) {
            strLastIndexOf = C1561oA.ud("\u0012%$}q5b`_\u001dyovX`W2&f\u0014 !\u0017\"\u001f", (short) (C1499aX.Xd() ^ (2105747943 ^ (-2105740354))));
        } else {
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(FB.Xd() ^ 1609527147, C1561oA.yd("D!f8G9Zj\u007fz\t)\u0011pl\u0011\u0010\u001dv&\u0015'~xb=Ӳhq_Dj7icM", (short) (Od.Xd() ^ (4650673 ^ (-4636535)))));
        }
        VsshLogger.logError(str3, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i6, strLastIndexOf));
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
        char c2;
        String strWd;
        int i2;
        String str;
        int i3;
        int i4;
        char c3;
        BaseModelResponse baseModelResponse;
        Integer num2;
        Class<CoreGenericBridgeModelResponse> cls;
        CommunicationHelper.getInstance().setCommunicationManager(this.f18349a);
        Integer num3 = null;
        String response = null;
        String strYd = C1561oA.Yd("|", (short) (FB.Xd() ^ (Od.Xd() ^ 1207797653)));
        if (baseSuccessEvent != null && baseSuccessEvent.getResponse() != null && !baseSuccessEvent.getResponse().isEmpty()) {
            Object typedResponse = baseSuccessEvent.getTypedResponse(BaseModelResponse.class);
            if (Integer.parseInt(strYd) != 0) {
                baseModelResponse = null;
                num2 = null;
            } else {
                baseModelResponse = (BaseModelResponse) typedResponse;
                num2 = CommunicationConstants.STATUS_CODE_SUCCESS;
            }
            if (!num2.equals(baseModelResponse.getStatusCode())) {
                super.successEvent(baseSuccessEvent);
                return;
            }
            if (!this.f18353e.booleanValue()) {
                BaseResponse baseResponse = (BaseResponse) (Integer.parseInt(strYd) == 0 ? baseSuccessEvent.getBaseResponseModel(this.f18352d).getResponse() : null);
                if (baseSuccessEvent.getHeader() != null) {
                    baseResponse.setHeaders(baseSuccessEvent.getHeader().toString());
                }
                this.f18350b.lambdaSuccessResponse(baseResponse);
                return;
            }
            Gson gson = new Gson();
            if (Integer.parseInt(strYd) != 0) {
                cls = null;
            } else {
                response = baseSuccessEvent.getResponse();
                cls = CoreGenericBridgeModelResponse.class;
            }
            CoreGenericBridgeModelResponse coreGenericBridgeModelResponse = (CoreGenericBridgeModelResponse) gson.fromJson(response, (Class) cls);
            if (baseSuccessEvent.getHeader() != null) {
                coreGenericBridgeModelResponse.setHeaders(baseSuccessEvent.getHeader().toString());
            }
            this.f18351c.lambdaSuccessResponse(coreGenericBridgeModelResponse);
            return;
        }
        BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
        char c4 = 11;
        int i5 = 0;
        if (Integer.parseInt(strYd) != 0) {
            c2 = '\t';
            num = null;
        } else {
            num3 = 0;
            num = VsshCoreConstants.INVALID_COMMUNICATION_LIBRARY_RESPONSE_CODE;
            c2 = 11;
        }
        int iIndexOf = c2 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int iXd = OY.Xd() ^ 69929195;
        if ((iIndexOf * iXd) % iIndexOf != 0) {
            short sXd = (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134263457)));
            short sXd2 = (short) (FB.Xd() ^ ((881056000 ^ 1390929465) ^ 1717834599));
            int[] iArr = new int["\u00076q#, \u001f.q50?>q<'q-(4=q6ҫԟq;6Q\u0001|\u000b~Q\u0018\u0013\u000b\u0015}ԋӯ]".length()];
            QB qb = new QB("\u00076q#, \u001f.q50?>q<'q-(4=q6ҫԟq;6Q\u0001|\u000b~Q\u0018\u0013\u000b\u0015}ԋӯ]");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK((xuXd.CK(iKK) - (sXd + i6)) + sXd2);
                i6++;
            }
            strWd = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i6), C1499aX.Xd() ^ (-1134258038));
        } else {
            strWd = Jg.Wd("kz7mB:qY:(<?,W\r{'hB\u0007e\u0011\u001c@Ky\u001b*\u0016J9s\nmv8G\u0004\nu%\u001dY:j", (short) (C1607wl.Xd() ^ (379688912 ^ 379702989)), (short) (C1607wl.Xd() ^ ((891589308 ^ 761529698) ^ 406883463)));
        }
        int i7 = Integer.parseInt(strYd);
        String strXd = ZO.xd("L\u001f", (short) (Od.Xd() ^ (1033084197 ^ (-1033097003))), (short) (Od.Xd() ^ (144418028 ^ (-144436113))));
        if (i7 != 0) {
            str = strYd;
            i2 = 1;
            i3 = ((479938522 ^ 1120312527) == true ? 1 : 0) ^ 1583209232;
        } else {
            i2 = 30;
            str = strXd;
            i3 = 12;
        }
        if (i3 != 0) {
            i2 += i2 + i2;
            str = strYd;
        }
        int i8 = 7;
        if (Integer.parseInt(str) != 0) {
            iXd = 1;
            i4 = 1;
            strXd = str;
            c3 = 7;
        } else {
            i4 = i2 + 15;
            c3 = '\f';
        }
        if (c3 != 0) {
            iXd += iXd + iXd;
        } else {
            strYd = strXd;
        }
        if (Integer.parseInt(strYd) != 0) {
            i8 = 0;
            c4 = '\f';
        } else {
            i4 += iXd;
            i5 = 7;
        }
        baseVsshCoreCallback.onCoreError(num3, num, BuildConfig.AnonymousClass1.indexOf(strWd, i4 / (c4 != 0 ? i5 + (i8 + i5) : 1)));
    }
}
