package com.valid.vssh_android_core.document;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.security.helpers.KeyHelper;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.DocumentTypeModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.ScanDocumentModel;
import com.valid.vssh_android_core.model.UploadImageModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import com.valid.vssh_android_core.model.response.ProcessImageResponse;
import com.valid.vssh_android_core.model.response.ScanDocumentModelResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.utils.CoreSecurityHelper;
import com.valid.vssh_android_core.utils.EncodeHelper;
import com.valid.vssh_android_core.utils.ValidationsHelper;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.HashMap;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CoreDocumentImp extends BaseVsshCore implements CoreDocument {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18344d = C1561oA.Kd("\n7;/\u000f;0C<5?F\u001cAE", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951475010))));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommunicationManager f18345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LambdaSuccess<ScanDocumentModelResponse> f18346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LambdaSuccess<DocumentTypeResponse> f18347c;

    public class ParseException extends RuntimeException {
    }

    @Override // com.valid.vssh_android_core.document.CoreDocument
    public void getDocumentType(DocumentTypeModel documentTypeModel, LambdaSuccess<DocumentTypeResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        String str2;
        JsonParser jsonParser;
        Gson gson;
        String json;
        CoreDocumentImp coreDocumentImp;
        String str3;
        int i6;
        int i7;
        CommunicationManager communicationManager;
        int i8;
        boolean z2;
        int i9;
        int i10;
        CoreDocumentImp coreDocumentImp2;
        CommunicationManager communicationManager2;
        int i11;
        int iIndexOf;
        int i12;
        String strYd;
        int i13;
        int i14 = 7;
        int i15 = (498581630 ^ 2737513) ^ 496895252;
        int i16 = 4;
        String strZd = Wg.Zd("\t^", (short) (FB.Xd() ^ (1179291989 ^ 1179303616)), (short) (FB.Xd() ^ (Od.Xd() ^ (1773713103 ^ 776296482))));
        String strXd = C1561oA.Xd("Y", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849952470)));
        int i17 = 1;
        if (lambdaSuccess == null || lambdaSuccess2 == null || lambdaError == null) {
            String str4 = f18344d;
            int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf2 * 2) % iIndexOf2 != 0) {
                short sXd = (short) (OY.Xd() ^ (177421112 ^ 177433592));
                short sXd2 = (short) (OY.Xd() ^ (130252379 ^ 130241756));
                int[] iArr = new int["\"$P\u001cUVPQ%YRip!in\u001f!run!o#utwjiim=pfi==wC".length()];
                QB qb = new QB("\"$P\u001cUVPQ%YRip!in\u001f!run!o#utwjiim=pfi==wC");
                int i18 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i18] = xuXd.fK((xuXd.CK(iKK) - (sXd + i18)) + sXd2);
                    i18++;
                }
                str = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i18), C1607wl.Xd() ^ (567382686 ^ 1335197953));
            } else {
                int iXd = ZN.Xd() ^ (1016537422 ^ 253568128);
                int iXd2 = Od.Xd() ^ 1207810652;
                short sXd3 = (short) (ZN.Xd() ^ iXd);
                short sXd4 = (short) (ZN.Xd() ^ iXd2);
                int[] iArr2 = new int["r\u0013BHt,y$C=\u0003-$BR} 8\"s\u0010\u001d;Jg".length()];
                QB qb2 = new QB("r\u0013BHt,y$C=\u0003-$BR} 8\"s\u0010\u001d;Jg");
                int i19 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i19] = xuXd2.fK(xuXd2.CK(iKK2) - ((i19 * sXd4) ^ sXd3));
                    i19++;
                }
                str = new String(iArr2, 0, i19);
            }
            if (Integer.parseInt(strXd) != 0) {
                strZd = strXd;
                i2 = 1;
                i16 = 1;
            } else {
                i2 = 132;
                i14 = 37251916 ^ 37251919;
                i17 = 4;
            }
            if (i14 != 0) {
                i2 += i16 + i17;
            } else {
                strXd = strZd;
            }
            if (Integer.parseInt(strXd) == 0) {
                i2 /= 24;
            }
            VsshLogger.logError(str4, BuildConfig.AnonymousClass1.indexOf(str, i2));
            return;
        }
        this.lambdaError = lambdaError;
        if (Integer.parseInt(strXd) == 0) {
            this.lambdaGenericResponse = lambdaSuccess2;
        }
        this.f18347c = lambdaSuccess;
        if (documentTypeModel == null || documentTypeModel.getApi() == null) {
            requestParamsError();
            return;
        }
        HashMap map = new HashMap();
        StringBuilder sbAppend = null;
        if (Integer.parseInt(strXd) != 0) {
            i3 = 11;
            map = null;
        } else {
            this.body = map;
            i3 = i15;
        }
        int iIndexOf3 = i3 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        String strIndexOf = (iIndexOf3 * i15) % iIndexOf3 != 0 ? BuildConfig.AnonymousClass1.indexOf(Wg.vd("\u0003vr%\u000f\u0018r^\u0010q\u0004\u0016v\u0007~\"\u000fmr\u000bgfz>\u0010mr\u001a\r\\~\"nQl\u0004f\u0005uC", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (786313182 ^ 1519344058)))), C1499aX.Xd() ^ (1372459771 ^ (-307590623))) : Qg.kd("^aWbC^\\[NY'JSF", (short) (ZN.Xd() ^ (OY.Xd() ^ 69946478)), (short) (ZN.Xd() ^ (OY.Xd() ^ (1607954793 ^ 1543262612))));
        if (Integer.parseInt(strXd) != 0) {
            i4 = 1;
            i5 = 1;
        } else {
            i4 = 937897371 ^ 937897435;
            i5 = 4;
        }
        int i20 = i4 + i5 + i5;
        if (Integer.parseInt(strXd) != 0) {
            str2 = strXd;
            c2 = 14;
        } else {
            i20 /= 16;
            c2 = 7;
            str2 = strZd;
        }
        if (c2 != 0) {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i20);
            jsonParser = new JsonParser();
            str2 = strXd;
        } else {
            jsonParser = null;
        }
        int i21 = 1913354863 ^ 1913354848;
        int i22 = 5;
        if (Integer.parseInt(str2) != 0) {
            gson = null;
        } else {
            gson = new Gson();
            str2 = strZd;
            i22 = i21;
        }
        if (i22 != 0) {
            json = gson.toJson(documentTypeModel.getAdditionalData());
            str2 = strXd;
        } else {
            json = null;
        }
        if (Integer.parseInt(str2) == 0) {
            map.put(strIndexOf, jsonParser.parse(json));
        }
        CommunicationManager communicationManager3 = CommunicationHelper.getInstance().getCommunicationManager();
        this.f18345a = communicationManager3;
        int iXd3 = C1607wl.Xd() ^ 1849955243;
        if (communicationManager3 == null) {
            int iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf4 * 2) % iIndexOf4 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd3, hg.Vd("#%\u0016\u0014+/\"\u001e\u0015,'\u001d\u001c", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951481662)), (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849978632))))) : C1561oA.ud("D~o3mywwsX[e_rSYZ\u0017[X]bKXec%[M\u001fZO\\Z", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831087807))), C1633zX.Xd() ^ (337423355 ^ (-1615712206))));
        }
        int i23 = Integer.parseInt(strXd);
        int iXd4 = OY.Xd() ^ (738032890 ^ 802583579);
        if (i23 != 0) {
            i6 = 4;
            str3 = strXd;
            coreDocumentImp = null;
        } else {
            communicationManager3.isResponseEncrypted(true);
            coreDocumentImp = this;
            str3 = strZd;
            i6 = iXd4;
        }
        int i24 = 0;
        if (i6 != 0) {
            coreDocumentImp.f18345a.disableSecureRequest(false);
            i7 = 0;
            str3 = strXd;
        } else {
            i7 = i6 + 7;
        }
        if (Integer.parseInt(str3) != 0) {
            i8 = i7 + 11;
            z2 = false;
            communicationManager = null;
        } else {
            communicationManager = this.f18345a;
            i8 = i7 + 5;
            str3 = strZd;
            z2 = true;
        }
        if (i8 != 0) {
            communicationManager.addSessionIdInEncryptedData(z2);
            communicationManager = this.f18345a;
            i9 = 0;
            str3 = strXd;
        } else {
            i9 = i8 + iXd4;
        }
        if (Integer.parseInt(str3) != 0) {
            i10 = i9 + 14;
            coreDocumentImp2 = null;
            strZd = str3;
        } else {
            communicationManager.setCallback(this);
            i10 = i9 + i21;
            coreDocumentImp2 = this;
        }
        if (i10 != 0) {
            communicationManager2 = coreDocumentImp2.f18345a;
            sbAppend = new StringBuilder();
            strZd = strXd;
        } else {
            i24 = i10 + 4;
            communicationManager2 = null;
        }
        if (Integer.parseInt(strZd) != 0) {
            i11 = i24 + 11;
        } else {
            sbAppend = sbAppend.append(documentTypeModel.getApi());
            i11 = i24 + 5;
        }
        if (i11 != 0) {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i12 = 1599495202 ^ 1599495201;
        } else {
            iIndexOf = 1;
            i12 = 1;
        }
        if ((iIndexOf * i12) % iIndexOf != 0) {
            short sXd5 = (short) (ZN.Xd() ^ (Od.Xd() ^ 1207801100));
            int[] iArr3 = new int["de\u0010%Z\u001f\u001a\u001d\u001a\u0002M\u001aHUJ\u001a)hi:fbzecfk\u0014\u001d*[YxBr\u0005".length()];
            QB qb3 = new QB("de\u0010%Z\u001f\u001a\u001d\u001a\u0002M\u001aHUJ\u001a)hi:fbzecfk\u0014\u001d*[YxBr\u0005");
            int i25 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i25] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 ^ i25));
                i25++;
            }
            strYd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd3, new String(iArr3, 0, i25));
        } else {
            strYd = C1561oA.Yd("B\t\u0006\u0004o\n\b\u000fxX\f\u0015\u007f<\u0006\n\u0019", (short) (ZN.Xd() ^ (1728619919 ^ 1728634227)));
        }
        int i26 = Integer.parseInt(strXd) != 0 ? 1 : 51;
        if (Integer.parseInt(strXd) != 0) {
            i13 = 8;
            i16 = 1;
        } else {
            i26 += 8;
            i13 = 4;
        }
        int i27 = i16 + i13 + i16;
        if (Integer.parseInt(strXd) == 0) {
            strYd = BuildConfig.AnonymousClass1.indexOf(strYd, i26 / i27);
        }
        communicationManager2.consumeVsshService(1, sbAppend.append(strYd).toString(), documentTypeModel.getHeaders(), this.body);
    }

    @Override // com.valid.vssh_android_core.document.CoreDocument
    public void scanDocument(ScanDocumentModel scanDocumentModel, LambdaSuccess<ScanDocumentModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        String str;
        int i2;
        String strLastIndexOf;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int iXd;
        int iLastIndexOf;
        String strIndexOf;
        JsonParser jsonParser;
        int i7;
        String str3;
        Gson gson;
        String json;
        char c2;
        CommunicationManager communicationManager;
        CoreDocumentImp coreDocumentImp;
        CoreDocumentImp coreDocumentImp2;
        String str4;
        CommunicationManager communicationManager2;
        CoreDocumentImp coreDocumentImp3;
        String api;
        String strZd;
        int iXd2 = 12;
        int i8 = 7;
        int i9 = 1679659184 ^ 1679659168;
        int i10 = 8;
        int iXd3 = ZN.Xd() ^ 864698099;
        int i11 = 6;
        String strXd = ZO.xd("Wv", (short) (C1580rY.Xd() ^ (415562736 ^ (-415562266))), (short) (C1580rY.Xd() ^ ((585166329 ^ 294354439) ^ (-862710593))));
        String strUd = C1626yg.Ud("6", (short) (C1633zX.Xd() ^ (554626721 ^ (-554626108))), (short) (C1633zX.Xd() ^ (1523697384 ^ (-1523690492))));
        if (lambdaSuccess == null || lambdaSuccess2 == null || lambdaError == null) {
            String str5 = f18344d;
            if (Integer.parseInt(strUd) != 0) {
                i9 = 1;
                str = strUd;
            } else {
                i8 = 452043772 ^ 452043767;
                str = strXd;
            }
            if (i8 != 0) {
                i2 = i9 + 8;
                str = strUd;
            } else {
                i2 = 1;
            }
            if (Integer.parseInt(str) != 0) {
                strXd = str;
            } else {
                i2 += 6;
                iXd2 = iXd3;
            }
            if (iXd2 == 0) {
                strUd = strXd;
                i11 = 1;
            }
            if (Integer.parseInt(strUd) == 0) {
                i2 /= iXd3 + i11;
                iXd3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            }
            if ((iXd3 * 2) % iXd3 == 0) {
                short sXd = (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951479419)));
                int[] iArr = new int["\u0013(%'r8ec` zty[c\\3'i1!$\u001a#\"".length()];
                QB qb = new QB("\u0013(%'r8ec` zty[c\\3'i1!$\u001a#\"");
                int i12 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i12] = xuXd.fK(sXd + sXd + i12 + xuXd.CK(iKK));
                    i12++;
                }
                strLastIndexOf = new String(iArr, 0, i12);
            } else {
                int i13 = (2054459778 ^ 195415024) ^ 1909545542;
                short sXd2 = (short) (C1580rY.Xd() ^ (1586351775 ^ (-1586336293)));
                int[] iArr2 = new int["\u0003L q`D+\u0016".length()];
                QB qb2 = new QB("\u0003L q`D+\u0016");
                int i14 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i14] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i14));
                    i14++;
                }
                strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i13, new String(iArr2, 0, i14));
            }
            VsshLogger.logError(str5, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, strLastIndexOf));
            return;
        }
        this.lambdaError = lambdaError;
        if (Integer.parseInt(strUd) == 0) {
            this.lambdaGenericResponse = lambdaSuccess2;
        }
        this.f18346b = lambdaSuccess;
        if (scanDocumentModel == null || scanDocumentModel.getApi() == null) {
            requestParamsError();
            return;
        }
        HashMap map = new HashMap();
        CommunicationManager communicationManager3 = null;
        if (Integer.parseInt(strUd) != 0) {
            map = null;
        } else {
            this.body = map;
        }
        if (Integer.parseInt(strUd) != 0) {
            i3 = 1;
            i4 = 1;
            str2 = strUd;
            i5 = 13;
        } else {
            i3 = 32;
            i4 = 32;
            i5 = iXd3;
            str2 = strXd;
        }
        if (i5 != 0) {
            i6 = i3 + i3 + i4 + i9;
            str2 = strUd;
        } else {
            i6 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            iXd = Od.Xd() ^ (717626941 ^ 1832618593);
            i10 = 1;
        } else {
            iXd = C1607wl.Xd() ^ (260908672 ^ 1640576336);
            str2 = strXd;
        }
        if (iXd != 0) {
            i6 += i10;
            str2 = strUd;
        }
        if (Integer.parseInt(str2) != 0) {
            iLastIndexOf = 1;
        } else {
            i6 /= 28;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * 5) % iLastIndexOf == 0) {
            strIndexOf = Ig.wd("o&\u0005diS\u0007U\u00102\u001f_w\f", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951485668)));
        } else {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(EO.Od("T\u001aeHbCli\u0007\\Z2\u0002\u0015Vx\u000fPyd\u001eut`\f\u0004S\u000f\u0012!|j\u00179\u007f/", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (394038763 ^ 620143757)))), (299581312 ^ 963742288) ^ 682276346);
        }
        String strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i6, strIndexOf);
        if (Integer.parseInt(strUd) != 0) {
            jsonParser = null;
            i7 = 6;
            str3 = strUd;
        } else {
            jsonParser = new JsonParser();
            i7 = (2037715277 ^ 4649594) ^ 2033443635;
            str3 = strXd;
        }
        if (i7 != 0) {
            gson = new Gson();
            str3 = strUd;
        } else {
            gson = null;
        }
        if (Integer.parseInt(str3) != 0) {
            json = null;
            c2 = '\r';
        } else {
            json = gson.toJson(scanDocumentModel.getAdditionalData());
            c2 = 6;
            str3 = strXd;
        }
        if (c2 != 0) {
            map.put(strLastIndexOf2, jsonParser.parse(json));
            str3 = strUd;
        }
        if (Integer.parseInt(str3) != 0) {
            communicationManager = null;
            coreDocumentImp = null;
        } else {
            communicationManager = CommunicationHelper.getInstance().getCommunicationManager();
            coreDocumentImp = this;
        }
        coreDocumentImp.f18345a = communicationManager;
        CommunicationManager communicationManager4 = this.f18345a;
        if (communicationManager4 == null) {
            int iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            if ((iLastIndexOf2 * 2) % iLastIndexOf2 != 0) {
                strZd = BuildConfig.AnonymousClass1.indexOf(C1561oA.Qd("\u000b~LMFIGJGHm=9=>jg2}(+'!w\u001enmji lje]&\\/)V", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207822687)))), ZN.Xd() ^ 864698059);
            } else {
                strZd = C1593ug.zd("'/.n\b\n\u000es\u0006\u0001\n\u0012\n\u0013y\u0006M\u0017Z]XSBUX\\\u0013HXg!\f\u000f\u0013", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1803647096 ^ (-1510499574)))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1426068688 ^ (-558966072)))));
            }
            throw new CommunicationException(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd3, strZd));
        }
        if (Integer.parseInt(strUd) != 0) {
            coreDocumentImp2 = null;
            str4 = strUd;
            i8 = 13;
        } else {
            communicationManager4.isResponseEncrypted(true);
            coreDocumentImp2 = this;
            str4 = strXd;
        }
        boolean z2 = false;
        if (i8 != 0) {
            coreDocumentImp2.f18345a.disableSecureRequest(false);
            str4 = strUd;
        }
        if (Integer.parseInt(str4) != 0) {
            strXd = str4;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18345a;
            i11 = 711163028 ^ 711163030;
            z2 = true;
        }
        if (i11 != 0) {
            communicationManager2.addSessionIdInEncryptedData(z2);
            communicationManager2 = this.f18345a;
        } else {
            strUd = strXd;
        }
        if (Integer.parseInt(strUd) != 0) {
            iXd2 = C1499aX.Xd() ^ (-1134257949);
            coreDocumentImp3 = null;
        } else {
            communicationManager2.setCallback(this);
            coreDocumentImp3 = this;
        }
        if (iXd2 != 0) {
            communicationManager3 = coreDocumentImp3.f18345a;
            api = scanDocumentModel.getApi();
        } else {
            api = null;
        }
        communicationManager3.consumeVsshService(1, api, scanDocumentModel.getHeaders(), this.body);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5 A[Catch: ParseException -> 0x0302, TryCatch #0 {ParseException -> 0x0302, blocks: (B:2:0x0000, B:5:0x0047, B:7:0x004d, B:43:0x0149, B:47:0x015c, B:49:0x0166, B:60:0x01cb, B:62:0x01d8, B:64:0x01e5, B:84:0x02a6, B:85:0x02aa, B:87:0x02b6, B:89:0x02be, B:90:0x02c9, B:91:0x02cf, B:92:0x02d4, B:94:0x02e0, B:96:0x02e8, B:97:0x02f3, B:98:0x02f9, B:68:0x01f2, B:72:0x0228, B:73:0x0233, B:76:0x023f, B:81:0x0299, B:80:0x0295, B:52:0x0178, B:57:0x01c0, B:56:0x01b1, B:99:0x02fe, B:46:0x0158, B:9:0x0057, B:13:0x0067, B:20:0x0090, B:24:0x009c, B:28:0x00ae, B:29:0x00b1, B:33:0x00bd, B:42:0x0140, B:41:0x013c, B:32:0x00b9, B:12:0x0061), top: B:103:0x0000 }] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void successEvent(com.valid.communication.events.BaseSuccessEvent r14) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valid.vssh_android_core.document.CoreDocumentImp.successEvent(com.valid.communication.events.BaseSuccessEvent):void");
    }

    @Override // com.valid.vssh_android_core.document.CoreDocument
    public void uploadImage(UploadImageModel uploadImageModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws Throwable {
        String strIndexOf;
        int i2;
        int i3;
        int i4;
        int i5;
        String strEncryptRsa;
        String str;
        char c2;
        HashMap map;
        CoreDocumentImp coreDocumentImp;
        Map<String, Object> map2;
        int i6;
        int i7;
        String str2;
        char c3;
        char c4;
        Map<String, Object> map3;
        char c5;
        int i8;
        String str3;
        int i9;
        int i10;
        int i11;
        CoreDocumentImp coreDocumentImp2;
        CommunicationManager communicationManager;
        CoreDocumentImp coreDocumentImp3;
        String api;
        char c6 = TokenParser.CR;
        int iXd = C1633zX.Xd() ^ (-1951491121);
        int i12 = 0;
        boolean z2 = false;
        char c7 = 14;
        String strXd = ZO.xd("OD", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1907233925 ^ 100610903))), (short) (Od.Xd() ^ ((2091390042 ^ 472273474) ^ (-1619930799))));
        String strUd = C1626yg.Ud("\n", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1524739154 ^ (-1768670747)))), (short) (C1499aX.Xd() ^ ((2076441878 ^ 17746258) ^ (-2060273149))));
        if (lambdaSuccess == null || lambdaError == null) {
            String str4 = f18344d;
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 5) % iIndexOf == 0) {
                strIndexOf = Wg.Zd("EgqF=\f\u00156,@\u0014\u0001Gh;-J\"R&p\u001d\u0006\\h", (short) (C1580rY.Xd() ^ ((1121639577 ^ 1527440276) ^ (-433078802))), (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951487381)));
            } else {
                short sXd = (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849972460)));
                int[] iArr = new int["~|uBCuFJyCIGHQOJIRG?HJ\u001bHCIEQFSJ\u001bJ\u001e_\u001a\u0014i\u001b".length()];
                QB qb = new QB("~|uBCuFJyCIGHQOJIRG?HJ\u001bHCIEQFSJ\u001bJ\u001e_\u001a\u0014i\u001b");
                int i13 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i13] = xuXd.fK(xuXd.CK(iKK) - (sXd + i13));
                    i13++;
                }
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i13), (158165462 ^ 1943798147) ^ 2058446889);
            }
            if (Integer.parseInt(strUd) != 0) {
                i3 = (490393788 ^ 1030820080) ^ 541835333;
                strXd = strUd;
                i2 = 1;
            } else {
                i2 = 30;
                i3 = 6;
            }
            if (i3 != 0) {
                i4 = 903131373 ^ 903131365;
            } else {
                i12 = i3 + 14;
                i4 = 1;
                strUd = strXd;
            }
            if (Integer.parseInt(strUd) != 0) {
                i5 = i12 + 14;
                iXd = 1;
            } else {
                i2 += i4;
                i5 = i12 + 13;
                i4 = iXd;
            }
            if (i5 != 0) {
                i4 = i4 + iXd + iXd;
            }
            VsshLogger.logError(str4, BuildConfig.AnonymousClass1.indexOf(strIndexOf, i2 / i4));
            return;
        }
        this.lambdaError = lambdaError;
        this.lambdaGenericResponse = lambdaSuccess;
        if (uploadImageModel == null || !ValidationsHelper.isValidUploadImageModel(uploadImageModel)) {
            requestParamsError();
            return;
        }
        ProcessImageResponse processImageResponseSegmentImage = EncodeHelper.segmentImage(EncodeHelper.bitmapToBase64(uploadImageModel.getImage()), uploadImageModel.getSegmentLength());
        if (processImageResponseSegmentImage == null) {
            requestParamsError();
            return;
        }
        CoreSecurityHelper coreSecurityHelper = new CoreSecurityHelper();
        int i14 = Integer.parseInt(strUd);
        char c8 = '\f';
        int i15 = ((464020218 ^ 202130285) == true ? 1 : 0) ^ 396632472;
        CommunicationManager communicationManager2 = null;
        if (i14 != 0) {
            str = strUd;
            c2 = '\f';
            strEncryptRsa = null;
        } else {
            strEncryptRsa = coreSecurityHelper.encryptRsa(processImageResponseSegmentImage.getFirstPart(), KeyHelper.getPublicKeyFromString(KeyHelper.buildPublicKeyAsString(uploadImageModel.getPublicKey())));
            str = strXd;
            c2 = i15 == true ? 1 : 0;
        }
        if (c2 != 0) {
            map = new HashMap();
            coreDocumentImp = this;
            str = strUd;
        } else {
            strEncryptRsa = null;
            map = null;
            coreDocumentImp = null;
        }
        if (Integer.parseInt(str) != 0) {
            map2 = null;
        } else {
            coreDocumentImp.body = map;
            map2 = this.body;
            c8 = 11;
        }
        int iIndexOf2 = c8 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int iXd2 = C1633zX.Xd() ^ (-1951491127);
        String strWd = (iIndexOf2 * iXd2) % iIndexOf2 == 0 ? Ig.wd("\u0019q\f\u0019z>+xL", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1770848538 ^ 706088563)))) : BuildConfig.AnonymousClass1.indexOf(EO.Od("\r=<P:\u001cL<m!)Ea%\u000e!\u00144m)i!s?`yO;z\u001ag;\u0019$k:;s.", (short) (OY.Xd() ^ (313938023 ^ 313939422))), 1085874759 ^ 1085874794);
        if (Integer.parseInt(strUd) != 0) {
            c3 = 14;
            str2 = strUd;
            i6 = 1;
            i7 = 1;
        } else {
            i6 = (1620591838 ^ 436134237) ^ 2036770203;
            i7 = iXd;
            str2 = strXd;
            c3 = 11;
        }
        if (c3 != 0) {
            i6 += i7 + i7;
            str2 = strUd;
        }
        if (Integer.parseInt(str2) != 0) {
            c4 = 11;
        } else {
            i6 /= 16;
            str2 = strXd;
            c4 = i15 == true ? 1 : 0;
        }
        if (c4 != 0) {
            map2.put(BuildConfig.AnonymousClass1.indexOf(strWd, i6), strEncryptRsa);
            str2 = strUd;
        }
        if (Integer.parseInt(str2) != 0) {
            c5 = 14;
            map3 = null;
        } else {
            map3 = this.body;
            c5 = '\r';
        }
        int iIndexOf3 = c5 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int iXd3 = C1607wl.Xd() ^ 1849955289;
        String strQd = (iIndexOf3 * iXd3) % iIndexOf3 == 0 ? C1561oA.Qd("dvqur", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69948454)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(2064302531 ^ 2064302498, C1593ug.zd("o)\u0016\"", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1524753723 ^ (-1802038994)))), (short) (OY.Xd() ^ ((2020302387 ^ 1034271718) ^ 1171191877))));
        if (Integer.parseInt(strUd) != 0) {
            str3 = strUd;
            i8 = 1;
            iXd3 = 1;
            iXd2 = 11;
        } else {
            i8 = 1665221478 ^ 1665221597;
            str3 = strXd;
        }
        if (iXd2 != 0) {
            iXd3 += iXd3 + iXd3;
            str3 = strUd;
        }
        if (Integer.parseInt(str3) != 0) {
            i9 = 0;
            i10 = i15;
        } else {
            i8 += iXd3;
            i9 = 17;
            str3 = strXd;
            i10 = 10;
        }
        if (i10 != 0) {
            i11 = i9 + i9 + i9;
            str3 = strUd;
        } else {
            i11 = 1;
        }
        if (Integer.parseInt(str3) == 0) {
            strQd = BuildConfig.AnonymousClass1.indexOf(strQd, i8 / i11);
        }
        map3.put(strQd, processImageResponseSegmentImage.getSecondPart());
        if (uploadImageModel.getAdditionalData() != null && !uploadImageModel.getAdditionalData().isEmpty()) {
            this.body.putAll(uploadImageModel.getAdditionalData());
        }
        CommunicationManager communicationManager3 = CommunicationHelper.getInstance().getCommunicationManager();
        this.f18345a = communicationManager3;
        if (communicationManager3 == null) {
            int iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf4 * 4) % iIndexOf4 == 0 ? C1561oA.od(" BC\u0007EIKK/H/53>')*j/(5.\u001f(\u001d\u001fx/%r*#(&", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (1164011847 ^ (-1095369464))))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(Od.Xd() ^ (658541766 ^ 1623005368), C1561oA.Kd("TF\u0016\u0017\u000fSUOO\u001e\u0014e!.\u00191ZZ(\u001a!3f&<g34{x{?fi4y", (short) (C1499aX.Xd() ^ ((2051783940 ^ 291077543) ^ (-1796404896))))), iXd));
        }
        if (Integer.parseInt(strUd) != 0) {
            strXd = strUd;
            coreDocumentImp2 = null;
        } else {
            communicationManager3.isResponseEncrypted(false);
            coreDocumentImp2 = this;
            c7 = 11;
        }
        if (c7 != 0) {
            coreDocumentImp2.f18345a.disableSecureRequest(true);
            strXd = strUd;
        }
        if (Integer.parseInt(strXd) != 0) {
            communicationManager = null;
        } else {
            communicationManager = this.f18345a;
            z2 = true;
        }
        communicationManager.addSessionIdInEncryptedData(z2);
        CommunicationManager communicationManager4 = this.f18345a;
        if (Integer.parseInt(strUd) != 0) {
            coreDocumentImp3 = null;
            c6 = '\n';
        } else {
            communicationManager4.setCallback(this);
            coreDocumentImp3 = this;
        }
        if (c6 != 0) {
            communicationManager2 = coreDocumentImp3.f18345a;
            api = uploadImageModel.getApi();
        } else {
            api = null;
        }
        communicationManager2.consumeVsshService(1, api, uploadImageModel.getHeaders(), this.body);
    }
}
