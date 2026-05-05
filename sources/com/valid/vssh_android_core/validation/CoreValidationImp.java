package com.valid.vssh_android_core.validation;

import com.dynatrace.android.agent.Global;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.GenerateOtpModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.ValidateOtpModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.PrintStream;
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
public class CoreValidationImp extends BaseVsshCore implements CoreValidation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f18357b = C1561oA.od("\t46(\u0018\",(\"\u001e0$)'\u0001$&", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849962612)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommunicationManager f18358a;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public final void a(GenerateOtpModel generateOtpModel) throws CommunicationException {
        int iIndexOf;
        int iXd;
        int iXd2;
        int i2;
        String str;
        int i3;
        int iXd3;
        int i4;
        String email;
        char c2;
        int iIndexOf2;
        int i5;
        int i6;
        String str2;
        int i7;
        char c3;
        char c4;
        String cellphone;
        CoreValidationImp coreValidationImp;
        char c5;
        HashMap map;
        Map<String, Object> map2;
        char c6;
        int i8;
        char c7;
        String str3;
        int iXd4;
        int i9;
        int i10;
        JsonParser jsonParser;
        Gson gson;
        String json;
        String str4;
        int i11;
        int i12;
        int iXd5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        JsonParser jsonParser2;
        Gson gson2;
        int i21;
        int i22;
        String json2;
        int i23;
        PrintStream printStream;
        StringBuilder sbAppend;
        int iIndexOf3;
        int i24;
        int i25;
        char c8;
        String str5;
        int iXd6;
        int i26;
        int i27;
        int iXd7;
        int i28;
        int i29;
        int iIndexOf4;
        String str6;
        int i30;
        String str7;
        int iXd8;
        int i31;
        int iXd9;
        int i32;
        int iIndexOf5;
        int iXd10;
        int iXd11;
        int i33;
        String str8;
        int i34;
        int i35;
        int i36;
        Map<String, Object> map3;
        String string;
        int i37;
        CommunicationHelper communicationHelper;
        CoreValidationImp coreValidationImp2;
        CoreValidationImp coreValidationImp3;
        int i38;
        String str9;
        CommunicationManager communicationManager;
        CoreValidationImp coreValidationImp4;
        CommunicationManager communicationManager2;
        StringBuilder sbAppend2;
        char c9;
        int i39;
        int iXd12;
        Map<String, Object> additionalData = generateOtpModel.getAdditionalData();
        String strKd = C1561oA.Kd("\u000b", (short) (ZN.Xd() ^ (2136766757 ^ 2136755267)));
        if (Integer.parseInt(strKd) != 0) {
            iIndexOf = 1;
            iXd = 1;
        } else {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            iXd = C1580rY.Xd() ^ (687280349 ^ (-427689153));
        }
        String strLastIndexOf = (iIndexOf * iXd) % iIndexOf != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1854968092 ^ 1229071611) ^ 668120522, Wg.Zd("栣睳", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (823309080 ^ 1162064691))), (short) (C1580rY.Xd() ^ ((2110941716 ^ 1562369721) ^ (-550352802))))) : C1561oA.Xd("\u001f%#).", (short) (ZN.Xd() ^ ((294781323 ^ 1123746088) ^ 1399412813)));
        int i40 = Integer.parseInt(strKd);
        int i41 = (1327617439 ^ 672232308) ^ 1731241709;
        String strVd = Wg.vd("<@", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864699518))));
        if (i40 != 0) {
            str = strKd;
            iXd2 = 1;
            i2 = 13;
        } else {
            iXd2 = C1499aX.Xd() ^ (984833724 ^ (-2032679316));
            i2 = i41;
            str = strVd;
        }
        if (i2 != 0) {
            str = strKd;
        }
        int i42 = 0;
        if (Integer.parseInt(str) != 0) {
            i3 = 13;
            iXd3 = 0;
            i4 = 0;
        } else {
            iXd2 += 8;
            str = strVd;
            i3 = (1913671649 ^ 777752042) ^ 1548468744;
            iXd3 = ZN.Xd() ^ (1934552175 ^ 1086640779);
            i4 = 210469563 ^ 210469551;
        }
        if (i3 != 0) {
            strLastIndexOf = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, iXd2 / (iXd3 + i4));
            str = strKd;
        }
        char c10 = 7;
        char c11 = 14;
        if (Integer.parseInt(str) != 0) {
            c2 = 14;
            email = null;
        } else {
            email = generateOtpModel.getEmail();
            str = strVd;
            c2 = 7;
        }
        if (c2 != 0) {
            additionalData.put(strLastIndexOf, email);
            additionalData = generateOtpModel.getAdditionalData();
            str = strKd;
        }
        int i43 = 1279938959 ^ 1279938957;
        if (Integer.parseInt(str) != 0) {
            iIndexOf2 = 1;
            i5 = 1;
        } else {
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            i5 = i43;
        }
        String strIndexOf = (i5 * iIndexOf2) % iIndexOf2 != 0 ? BuildConfig.AnonymousClass1.indexOf(Qg.kd("\u000f\t\f\u0012\u0004\t\u0010~{}\u0010usw", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1391384065 ^ 353576218))), (short) (C1607wl.Xd() ^ ((1961987391 ^ 943524709) ^ 1288489057))), FB.Xd() ^ (731391111 ^ 1953975261)) : hg.Vd("\u001f!\u001e\u001c\u0006\u001c\u001b\u001a\u0011", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849952855))), (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (630177293 ^ (-1271630543)))));
        char c12 = '\t';
        int i44 = 28;
        int iXd13 = 12;
        if (Integer.parseInt(strKd) != 0) {
            str2 = strKd;
            i7 = 1;
            i6 = 1;
            c3 = '\t';
        } else {
            i6 = i43;
            str2 = strVd;
            i7 = 28;
            c3 = '\f';
        }
        if (c3 != 0) {
            i7 += i6 + i6;
            str2 = strKd;
        }
        if (Integer.parseInt(str2) != 0) {
            c4 = '\b';
        } else {
            i7 /= 8;
            str2 = strVd;
            c4 = '\r';
        }
        if (c4 != 0) {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i7);
            cellphone = generateOtpModel.getCellphone();
            str2 = strKd;
        } else {
            cellphone = null;
        }
        char c13 = 15;
        if (Integer.parseInt(str2) != 0) {
            coreValidationImp = null;
            c5 = '\t';
        } else {
            additionalData.put(strIndexOf, cellphone);
            coreValidationImp = this;
            str2 = strVd;
            c5 = 15;
        }
        if (c5 != 0) {
            map = new HashMap();
            str2 = strKd;
        } else {
            map = null;
        }
        if (Integer.parseInt(str2) != 0) {
            c6 = '\r';
            map2 = null;
        } else {
            coreValidationImp.body = map;
            map2 = this.body;
            c6 = '\n';
        }
        int iIndexOf6 = c6 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        String strIndexOf2 = (iIndexOf6 * i43) % iIndexOf6 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1561oA.ud("\u0010\u000f<T~~|~8AHCB4;?>84\u00034/.8\u007f-'r+)j\u001d \u0019\u001e^", (short) (FB.Xd() ^ (233602607 ^ 233581874))), C1580rY.Xd() ^ (-831067236)) : C1561oA.yd("tt\f\u0005\u0006\ft\u0004\u0001Vs~s", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69948299)));
        if (Integer.parseInt(strKd) != 0) {
            str3 = strKd;
            i8 = 1;
            iXd4 = 1;
            i9 = 1;
            c7 = '\f';
        } else {
            i8 = (101545252 ^ 375315384) ^ 273919724;
            c7 = '\r';
            str3 = strVd;
            iXd4 = C1607wl.Xd() ^ (139897603 ^ 1712503002);
            i9 = (1733128086 ^ 427145212) ^ 2117654633;
        }
        if (c7 != 0) {
            i8 += iXd4 + i9;
            str3 = strKd;
        }
        if (Integer.parseInt(str3) != 0) {
            i10 = 10;
        } else {
            i8 /= 28;
            str3 = strVd;
            i10 = 1816122702 ^ 1816122701;
        }
        if (i10 != 0) {
            strIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strIndexOf2, i8);
            jsonParser = new JsonParser();
            str3 = strKd;
        } else {
            jsonParser = null;
        }
        char c14 = 5;
        if (Integer.parseInt(str3) != 0) {
            gson = null;
            c10 = 5;
        } else {
            gson = new Gson();
            str3 = strVd;
        }
        if (c10 != 0) {
            json = gson.toJson(generateOtpModel.getAdditionalData());
            str3 = strKd;
        } else {
            json = null;
        }
        if (Integer.parseInt(str3) == 0) {
            map2.put(strIndexOf2, jsonParser.parse(json));
        }
        Map<String, Object> map4 = this.body;
        int iIndexOf7 = BuildConfig.AnonymousClass1.indexOf();
        String strYd = (iIndexOf7 * 4) % iIndexOf7 == 0 ? C1561oA.Yd("\u0017\u0012\u0012\u001d\n\u001d%\b\u0017\nq\u0015*\u0015", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207828087)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ 864698043, Xg.qd("\u0011&73;rqW\u0007v\u0018M\u0017^r\u000b\u0007{2b-;GU-6WNV>#\"\t\u0017bh", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (985889861 ^ (-189430632)))), (short) (FB.Xd() ^ (109819951 ^ 109826801))));
        if (Integer.parseInt(strKd) != 0) {
            str4 = strKd;
            i12 = 1;
            iXd5 = 4;
            i11 = 0;
        } else {
            str4 = strVd;
            i11 = 14;
            i12 = 28;
            iXd5 = C1580rY.Xd() ^ (-831067158);
        }
        if (iXd5 != 0) {
            i14 = i11 << 2;
            str4 = strKd;
            i13 = 0;
        } else {
            i13 = iXd5 + 10;
            i14 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i15 = i13 + 12;
            i16 = 1;
        } else {
            i12 += i14;
            i15 = i13 + 14;
            i16 = i43;
            str4 = strVd;
            i14 = 4;
        }
        if (i15 != 0) {
            i12 += i14 << i16;
            str4 = strKd;
            i17 = 0;
            i18 = 14;
        } else {
            i17 = i15 + 10;
            i18 = 0;
        }
        if (Integer.parseInt(str4) != 0) {
            i19 = i17 + 14;
        } else {
            i12 /= i18 << i43;
            i19 = i17 + 2;
            str4 = strVd;
        }
        if (i19 != 0) {
            strYd = BuildConfig.AnonymousClass1.indexOf(strYd, i12);
            jsonParser2 = new JsonParser();
            str4 = strKd;
            i20 = 0;
        } else {
            i20 = i19 + 7;
            jsonParser2 = null;
        }
        if (Integer.parseInt(str4) != 0) {
            i21 = i20 + 6;
            gson2 = null;
        } else {
            gson2 = new Gson();
            i21 = i20 + 5;
            str4 = strVd;
        }
        if (i21 != 0) {
            json2 = gson2.toJson(generateOtpModel.getAdditionalData());
            str4 = strKd;
            i22 = 0;
        } else {
            i22 = i21 + 6;
            json2 = null;
        }
        if (Integer.parseInt(str4) != 0) {
            i23 = i22 + 14;
        } else {
            map4.put(strYd, jsonParser2.parse(json2));
            i23 = i22 + 5;
            str4 = strVd;
        }
        if (i23 != 0) {
            printStream = System.out;
            sbAppend = new StringBuilder();
            str4 = strKd;
        } else {
            printStream = null;
            sbAppend = null;
        }
        if (Integer.parseInt(str4) != 0) {
            iIndexOf3 = 1;
            i24 = 1;
        } else {
            iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
            i24 = 5;
        }
        String strLastIndexOf2 = (i24 * iIndexOf3) % iIndexOf3 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1607wl.Xd() ^ 1849955253, Jg.Wd("䉉ྉ", (short) (OY.Xd() ^ (1212873627 ^ 1212846736)), (short) (OY.Xd() ^ (Od.Xd() ^ 1207817592)))) : ZO.xd("\tr@t@\u0005\r\t6\u0005\u001a\u0012ZXJ\u000b*\u001fJHW\u000bR2\u0007tzfZ_6Y w\\\u0013C\u001e*\u000fSx\u0007~\u0005F8", (short) (Od.Xd() ^ (299142516 ^ (-299170661))), (short) (Od.Xd() ^ ((1110966720 ^ 190867493) ^ (-1230524361))));
        if (Integer.parseInt(strKd) != 0) {
            str5 = strKd;
            i25 = 1;
            iXd6 = 1;
            i26 = 1;
            c8 = 5;
        } else {
            i25 = 154;
            c8 = '\r';
            str5 = strVd;
            iXd6 = OY.Xd() ^ 69929195;
            i26 = 202317571 ^ 202317568;
        }
        if (c8 != 0) {
            i26 = i26 + iXd6 + iXd6;
            str5 = strKd;
        }
        if (Integer.parseInt(str5) != 0) {
            i27 = 0;
            iXd7 = 0;
        } else {
            i25 += i26;
            str5 = strVd;
            c12 = 5;
            i27 = 652506932 ^ 652506943;
            iXd7 = C1607wl.Xd() ^ (2041471558 ^ 401240471);
        }
        if (c12 != 0) {
            i28 = i27 + iXd7 + i27;
            str5 = strKd;
        } else {
            i28 = 1;
        }
        if (Integer.parseInt(str5) != 0) {
            i29 = 12;
        } else {
            strLastIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf2, i25 / i28);
            str5 = strVd;
            i29 = (879962448 ^ 1036376947) ^ 162984488;
        }
        if (i29 != 0) {
            sbAppend = sbAppend.append(strLastIndexOf2);
            strLastIndexOf2 = generateOtpModel.getApi();
            str5 = strKd;
        }
        if (Integer.parseInt(str5) != 0) {
            iIndexOf4 = 1;
        } else {
            sbAppend = sbAppend.append(strLastIndexOf2);
            iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
        }
        if ((iIndexOf4 * 4) % iIndexOf4 != 0) {
            str6 = BuildConfig.AnonymousClass1.indexOf(C1626yg.Ud("Ce[\f\u001f!|*~_>\u0001\u001cMCV\u0011\u00036`:[Kv\u0012p\u000bk\u000fnY^E\u0017\u001c\u001e,\u001dL", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1161107484 ^ (-728831507)))), (short) (C1633zX.Xd() ^ ((1772490840 ^ 428701356) ^ (-1881890696)))), 2074429811 ^ 2074429760);
        } else {
            short sXd = (short) (C1499aX.Xd() ^ (84082983 ^ (-84110122)));
            int[] iArr = new int["-*U{3Q\u0006\u001ef".length()];
            QB qb = new QB("-*U{3Q\u0006\u001ef");
            int i45 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i45] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i45 % C1561oA.Xd.length] ^ (sXd + i45)));
                i45++;
            }
            str6 = new String(iArr, 0, i45);
        }
        if (Integer.parseInt(strKd) != 0) {
            str7 = strKd;
            i30 = 1;
            i31 = 1;
            iXd9 = 1;
            iXd8 = Od.Xd() ^ 1207800926;
        } else {
            i30 = (1559701834 ^ 275861877) ^ 1283881129;
            str7 = strVd;
            iXd8 = 12;
            i31 = (1880098850 ^ 1937008742) ^ 56909895;
            iXd9 = C1580rY.Xd() ^ (-831067166);
        }
        if (iXd8 != 0) {
            i30 += i31 + iXd9;
            str7 = strKd;
        }
        if (Integer.parseInt(str7) != 0) {
            i32 = 1;
            c14 = 15;
        } else {
            str7 = strVd;
            i32 = (1956352417 ^ 584784908) ^ 1447071161;
        }
        if (c14 != 0) {
            str6 = BuildConfig.AnonymousClass1.indexOf(str6, i30 / (10 + i32));
            str7 = strKd;
        }
        if (Integer.parseInt(str7) != 0) {
            iIndexOf5 = 1;
        } else {
            sbAppend = sbAppend.append(str6);
            iIndexOf5 = BuildConfig.AnonymousClass1.indexOf();
        }
        String strOd = (iIndexOf5 * 3) % iIndexOf5 == 0 ? EO.Od("\u000f6\"\u0017Y'Dq/\b;\u001a", (short) (C1499aX.Xd() ^ (1836498902 ^ (-1836503718)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ (671966646 ^ 461855543), C1561oA.Qd("c\nX\u0010|\\\u0004\fQ\nhxlDqu", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (507213018 ^ (-1506209923))))));
        if (Integer.parseInt(strKd) != 0) {
            iXd10 = 1;
            iXd11 = 1;
            i44 = 1;
        } else {
            iXd10 = C1607wl.Xd() ^ (195045216 ^ 1709454521);
            iXd11 = Od.Xd() ^ 1207800918;
        }
        int i46 = iXd10 + iXd11 + iXd10;
        if (Integer.parseInt(strKd) != 0) {
            str8 = strKd;
            i34 = 1;
            i33 = (1589217187 ^ 711289487) ^ 1960635687;
        } else {
            i44 += i46;
            i33 = 13;
            str8 = strVd;
            i46 = 4;
            i34 = 4;
        }
        if (i33 != 0) {
            i46 = i46 + i34 + i34;
            str8 = strKd;
        }
        if (Integer.parseInt(str8) != 0) {
            i35 = 8;
        } else {
            strOd = BuildConfig.AnonymousClass1.indexOf(strOd, i44 / i46);
            i35 = i43;
            str8 = strVd;
        }
        if (i35 != 0) {
            sbAppend = sbAppend.append(strOd);
            map3 = this.body;
            str8 = strKd;
            i36 = 0;
        } else {
            i36 = i35 + 14;
            map3 = null;
        }
        if (Integer.parseInt(str8) != 0) {
            i37 = i36 + i41;
            string = null;
        } else {
            string = sbAppend.append(map3.toString()).toString();
            i37 = i36 + 13;
        }
        if (i37 != 0) {
            printStream.println(string);
            communicationHelper = CommunicationHelper.getInstance();
            coreValidationImp2 = this;
        } else {
            communicationHelper = null;
            coreValidationImp2 = null;
        }
        coreValidationImp2.f18358a = communicationHelper.getCommunicationManager();
        CommunicationManager communicationManager3 = this.f18358a;
        if (communicationManager3 == null) {
            int iIndexOf8 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf8 * 2) % iIndexOf8 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1593ug.zd("뎡멲", (short) (Od.Xd() ^ ((1622100043 ^ 932679493) ^ (-1463351308))), (short) (Od.Xd() ^ (Od.Xd() ^ (417767181 ^ (-1595612749))))), ZN.Xd() ^ 864698052) : C1561oA.od("K\u0006v:t\u0001~~z_blfyZ`a\u001eb_diR_lj,bT&aVca", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849964587)))), i43));
        }
        if (Integer.parseInt(strKd) != 0) {
            str9 = strKd;
            i38 = 14;
            coreValidationImp3 = null;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(true);
            coreValidationImp3 = this;
            i38 = i43;
            str9 = strVd;
        }
        if (i38 != 0) {
            coreValidationImp3.f18358a.isResponseEncrypted(true);
            str9 = strKd;
        }
        if (Integer.parseInt(str9) != 0) {
            i41 = 4;
            communicationManager = null;
        } else {
            communicationManager = this.f18358a;
            str9 = strVd;
        }
        if (i41 != 0) {
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18358a;
            str9 = strKd;
        }
        if (Integer.parseInt(str9) != 0) {
            c13 = 4;
            coreValidationImp4 = null;
        } else {
            communicationManager.addSessionIdInEncryptedData(true);
            coreValidationImp4 = this;
            str9 = strVd;
        }
        if (c13 != 0) {
            coreValidationImp4.f18358a.setCallback(this);
            str9 = strKd;
        }
        if (Integer.parseInt(str9) != 0) {
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18358a;
            i42 = 1;
            str9 = strVd;
            c11 = '\n';
        }
        if (c11 != 0) {
            sbAppend2 = new StringBuilder();
            str9 = strKd;
        } else {
            i42 = 1;
            sbAppend2 = null;
        }
        if (Integer.parseInt(str9) != 0) {
            c9 = '\f';
        } else {
            sbAppend2 = sbAppend2.append(generateOtpModel.getApi());
            c9 = 4;
        }
        int iIndexOf9 = c9 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        String strLastIndexOf3 = (iIndexOf9 * 4) % iIndexOf9 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ (769613182 ^ 508912559), C1561oA.Kd("(+Ey-C,", (short) (FB.Xd() ^ ((480864085 ^ 799753865) ^ 855795584)))) : Wg.Zd("vBJsvg~$\u001f", (short) (C1499aX.Xd() ^ ((715084841 ^ 490000243) ^ (-934004675))), (short) (C1499aX.Xd() ^ (1969971192 ^ (-1969954517))));
        if (Integer.parseInt(strKd) != 0) {
            strVd = strKd;
            iXd12 = 1;
            i39 = 4;
            iXd13 = OY.Xd() ^ (1272003374 ^ 1341797325);
        } else {
            i39 = 16;
            i43 = (707764118 ^ 520988525) ^ 891435256;
            iXd12 = OY.Xd() ^ 69929195;
        }
        if (iXd13 != 0) {
            i39 += i43 + iXd12;
            strVd = strKd;
        }
        communicationManager2.consumeVsshService(i42, Integer.parseInt(strKd) == 0 ? sbAppend2.append(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf3, i39 / (4 + (Integer.parseInt(strVd) == 0 ? 8 : 1)))).toString() : null, generateOtpModel.getHeaders(), this.body);
    }

    public final void a(ValidateOtpModel validateOtpModel) throws CommunicationException {
        char c2;
        String str;
        int i2;
        int i3;
        char c3;
        int iLastIndexOf;
        String str2;
        int i4;
        int i5;
        CoreValidationImp coreValidationImp;
        HashMap map;
        Map<String, Object> map2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iLastIndexOf2;
        JsonParser jsonParser;
        String str3;
        int i13;
        Gson gson;
        String json;
        int iXd;
        Map<String, Object> map3;
        int i14;
        int i15;
        int i16;
        int iLastIndexOf3;
        int i17;
        String json2;
        String str4;
        int i18;
        int i19;
        PrintStream printStream;
        StringBuilder sb;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iLastIndexOf4;
        String str5;
        int i26;
        int i27;
        int i28;
        int i29;
        String strIndexOf;
        int i30;
        String str6;
        int i31;
        int i32;
        int i33;
        int i34;
        int iLastIndexOf5;
        Map<String, Object> map4;
        String str7;
        String string;
        CommunicationHelper communicationHelper;
        CoreValidationImp coreValidationImp2;
        CoreValidationImp coreValidationImp3;
        String str8;
        CommunicationManager communicationManager;
        CoreValidationImp coreValidationImp4;
        CommunicationManager communicationManager2;
        int i35;
        StringBuilder sbAppend;
        int i36;
        int iXd2;
        String strZd;
        String string2;
        Map<String, String> headers;
        Map<String, Object> additionalData = validateOtpModel.getAdditionalData();
        String strXd = C1561oA.Xd("u", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (387656784 ^ 647113702))));
        int i37 = Integer.parseInt(strXd);
        short sXd = (short) (C1499aX.Xd() ^ ((409332783 ^ 675611839) ^ (-807461850)));
        int[] iArr = new int["}\u0004".length()];
        QB qb = new QB("}\u0004");
        int i38 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i38] = xuXd.fK((sXd ^ i38) + xuXd.CK(iKK));
            i38++;
        }
        String str9 = new String(iArr, 0, i38);
        int iLastIndexOf6 = 1;
        if (i37 != 0) {
            str = strXd;
            c2 = 14;
            i2 = 1;
        } else {
            c2 = 2;
            str = str9;
            i2 = 68;
        }
        if (c2 != 0) {
            str = strXd;
        }
        int i39 = 6;
        int i40 = 0;
        if (Integer.parseInt(str) != 0) {
            c3 = 6;
            i3 = 0;
        } else {
            i2 += 8;
            i3 = 17;
            c3 = 2;
        }
        if (c3 != 0) {
            i2 /= i3 + i3;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        } else {
            iLastIndexOf = 1;
        }
        String strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, (iLastIndexOf * 3) % iLastIndexOf != 0 ? BuildConfig.AnonymousClass1.indexOf(Qg.kd("&\u001a#)\u001e!\u0011)\u0013\u0012\u000e)\u000e\u000b\u000f", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207825640))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609520671)))), C1633zX.Xd() ^ (439393877 ^ (-1851914793))) : hg.Vd("\u000f* ", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1764283174 ^ (-494532990)))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831077273)))));
        int i41 = Integer.parseInt(strXd);
        int iXd3 = C1499aX.Xd() ^ (-1134257944);
        if (i41 != 0) {
            str2 = strXd;
            i4 = 8;
        } else {
            additionalData.put(strLastIndexOf, validateOtpModel.getOtp());
            str2 = str9;
            i4 = iXd3;
        }
        if (i4 != 0) {
            map = new HashMap();
            coreValidationImp = this;
            str2 = strXd;
            i5 = 0;
        } else {
            i5 = i4 + 14;
            coreValidationImp = null;
            map = null;
        }
        int i42 = 10;
        int i43 = 9;
        if (Integer.parseInt(str2) != 0) {
            i6 = i5 + 9;
            map2 = null;
        } else {
            coreValidationImp.body = map;
            map2 = this.body;
            i6 = i5 + 10;
            str2 = str9;
        }
        char c4 = 15;
        if (i6 != 0) {
            i8 = HttpStatus.SC_REQUEST_URI_TOO_LONG;
            str2 = strXd;
            i7 = 0;
        } else {
            i7 = i6 + 15;
            i8 = 1;
        }
        int i44 = 16;
        if (Integer.parseInt(str2) != 0) {
            i9 = i7 + iXd3;
            i10 = 1;
        } else {
            i9 = i7 + 9;
            str2 = str9;
            i10 = 16;
        }
        if (i9 != 0) {
            i8 += i10;
            i12 = 18;
            str2 = strXd;
            i11 = 2;
        } else {
            i11 = 1;
            i12 = 0;
        }
        if (Integer.parseInt(str2) != 0) {
            iLastIndexOf2 = 1;
        } else {
            i8 /= i12 << i11;
            iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        String strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i8, (iLastIndexOf2 * 2) % iLastIndexOf2 == 0 ? C1561oA.ud("Rn]Z+\u001d\u000e\u0019\u000e؝%\u0014\u0019", (short) (ZN.Xd() ^ (OY.Xd() ^ (1360242409 ^ 1429783700)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1633zX.Xd() ^ (985997107 ^ (-1318353730)), C1561oA.yd(":POA\ny\u0013\u0016\u0002~zuyx", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1394895703 ^ 1622031996))))));
        if (Integer.parseInt(strXd) != 0) {
            str3 = strXd;
            i13 = iXd3;
            jsonParser = null;
        } else {
            jsonParser = new JsonParser();
            str3 = str9;
            i13 = 6;
        }
        if (i13 != 0) {
            gson = new Gson();
            str3 = strXd;
        } else {
            gson = null;
        }
        int i45 = 7;
        if (Integer.parseInt(str3) != 0) {
            iXd = 7;
            json = null;
        } else {
            json = gson.toJson(validateOtpModel.getAdditionalData());
            str3 = str9;
            iXd = ZN.Xd() ^ (748229337 ^ 521350183);
        }
        if (iXd != 0) {
            map2.put(strLastIndexOf2, jsonParser.parse(json));
            str3 = strXd;
        }
        if (Integer.parseInt(str3) != 0) {
            i14 = 0;
            i15 = iXd3;
            map3 = null;
        } else {
            map3 = this.body;
            i14 = 2120207139 ^ 2120207158;
            str3 = str9;
            i15 = 7;
        }
        int i46 = 654491753 ^ 654491746;
        if (i15 != 0) {
            i16 = i14 * i46;
            str3 = strXd;
        } else {
            i16 = 1;
        }
        if (Integer.parseInt(str3) != 0) {
            i46 = 15;
        } else {
            i16 += 8;
            str3 = str9;
        }
        if (i46 != 0) {
            str3 = strXd;
        }
        int i47 = 44;
        if (Integer.parseInt(str3) != 0) {
            iLastIndexOf3 = 1;
            i17 = 44;
        } else {
            i16 /= 44;
            iLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i17 = iLastIndexOf3;
        }
        String strLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i16, (iLastIndexOf3 * iXd3) % i17 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1669916051 ^ 1669916071, C1561oA.Yd("䬭刃", (short) (OY.Xd() ^ (2039391764 ^ 2039385452)))) : Xg.qd("LEAJ\t\u0012\u001e\u0003\f\r\u0001\"\t\u001a", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864694331))), (short) (C1633zX.Xd() ^ (1494609951 ^ (-1494594974)))));
        JsonParser jsonParser2 = Integer.parseInt(strXd) != 0 ? null : new JsonParser();
        Gson gson2 = new Gson();
        if (Integer.parseInt(strXd) != 0) {
            str4 = strXd;
            i18 = 9;
            json2 = null;
        } else {
            json2 = gson2.toJson(validateOtpModel.getAdditionalData());
            str4 = str9;
            i18 = 6;
        }
        int i48 = 13;
        if (i18 != 0) {
            map3.put(strLastIndexOf3, jsonParser2.parse(json2));
            str4 = strXd;
            i19 = 0;
        } else {
            i19 = i18 + 13;
        }
        if (Integer.parseInt(str4) != 0) {
            i20 = i19 + 12;
            printStream = null;
            sb = null;
        } else {
            printStream = System.out;
            sb = new StringBuilder();
            i20 = i19 + 5;
            str4 = str9;
        }
        if (i20 != 0) {
            i22 = 1966721656 ^ 1966722012;
            str4 = strXd;
            i21 = 0;
        } else {
            i21 = i20 + 8;
            i22 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i23 = i21 + iXd3;
            i44 = 1;
        } else {
            i23 = i21 + 15;
            str4 = str9;
        }
        if (i23 != 0) {
            i22 += i44;
            i25 = 20;
            str4 = strXd;
            i24 = 2;
        } else {
            i24 = 1;
            i25 = 0;
        }
        if (Integer.parseInt(str4) != 0) {
            iLastIndexOf4 = 1;
        } else {
            i22 /= i25 << i24;
            iLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        String strLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i22, (iLastIndexOf4 * 2) % iLastIndexOf4 == 0 ? Jg.Wd("\frF1KFYK3zn[\n\u0001W]a\u000b\tqFyU\u0004za8'\b\u00035zmi\u007fleszPJ\u001fU<\u0010G1", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134251412)), (short) (Od.Xd() ^ (2073972515 ^ (-2073982794)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1731091198 ^ 1731091105, ZO.xd("\n,p\u001f=", (short) (C1580rY.Xd() ^ ((2036953194 ^ 1688842955) ^ (-499182401))), (short) (C1580rY.Xd() ^ ((1801497557 ^ 1013158685) ^ (-1459816353))))));
        if (Integer.parseInt(strXd) != 0) {
            str5 = strXd;
            i26 = 9;
        } else {
            sb = sb.append(strLastIndexOf4);
            strLastIndexOf4 = validateOtpModel.getApi();
            str5 = str9;
            i26 = (1495775457 ^ 352545654) ^ 1277481874;
        }
        if (i26 != 0) {
            sb = sb.append(strLastIndexOf4);
            str5 = strXd;
        }
        int i49 = 3;
        if (Integer.parseInt(str5) != 0) {
            i47 = 1;
            i27 = 1;
            i28 = (247940046 ^ 1898692447) ^ 2146237599;
        } else {
            i27 = 3;
            str5 = str9;
            i28 = iXd3;
        }
        if (i28 != 0) {
            i47 += i27 + i27;
            str5 = strXd;
        }
        if (Integer.parseInt(str5) != 0) {
            i29 = (2097672473 ^ 1211014320) ^ 891907490;
        } else {
            i47 /= 22;
            i29 = 3;
        }
        int iLastIndexOf7 = i29 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        if ((iLastIndexOf7 * 2) % iLastIndexOf7 == 0) {
            short sXd2 = (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951490587)));
            short sXd3 = (short) (OY.Xd() ^ (1204821942 ^ 1204814820));
            int[] iArr2 = new int["Y\ns@Ep<\u0001l".length()];
            QB qb2 = new QB("Y\ns@Ep<\u0001l");
            int i50 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i50] = xuXd2.fK((C1561oA.Xd[i50 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i50 * sXd3))) + xuXd2.CK(iKK2));
                i50++;
            }
            strIndexOf = new String(iArr2, 0, i50);
        } else {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(Ig.wd("ᰅ䂟", (short) (Od.Xd() ^ (FB.Xd() ^ (1369236355 ^ (-242474240))))), (245375635 ^ 1737098323) ^ 1764370152);
        }
        String strLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i47, strIndexOf);
        if (Integer.parseInt(strXd) != 0) {
            str6 = strXd;
            i31 = 0;
            i30 = 632139863 ^ 632139858;
        } else {
            sb = sb.append(strLastIndexOf5);
            i30 = 3;
            str6 = str9;
            i31 = 6;
        }
        if (i30 != 0) {
            i32 = i31 + (i31 << 2);
            str6 = strXd;
        } else {
            i32 = 1;
        }
        if (Integer.parseInt(str6) != 0) {
            i33 = 1;
            i34 = 1106933962 ^ 1106933956;
        } else {
            str6 = str9;
            i33 = 8;
            i34 = iXd3;
        }
        if (i34 != 0) {
            i32 += i33;
            str6 = strXd;
        }
        if (Integer.parseInt(str6) != 0) {
            iLastIndexOf5 = (431873815 ^ 867873419) ^ 705129881;
        } else {
            i32 /= 20;
            iLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        String strLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i32, (iLastIndexOf5 * 3) % iLastIndexOf5 == 0 ? EO.Od("h\u001bGJDqt,\n\u00067h", (short) (C1580rY.Xd() ^ (1984279158 ^ (-1984287067)))) : BuildConfig.AnonymousClass1.indexOf(C1561oA.Qd("K\u0019KK\u0014IG?O95\b5OLxN{3wCvH3jCl453:gnk5^", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1473344382 ^ (-340416188))))), (204236167 ^ 1517808967) ^ 1448839400));
        if (Integer.parseInt(strXd) != 0) {
            str7 = strXd;
            i42 = iXd3;
            map4 = null;
        } else {
            sb = sb.append(strLastIndexOf6);
            map4 = this.body;
            str7 = str9;
        }
        if (i42 != 0) {
            string = sb.append(map4.toString()).toString();
            str7 = strXd;
        } else {
            string = null;
        }
        if (Integer.parseInt(str7) != 0) {
            communicationHelper = null;
            coreValidationImp2 = null;
        } else {
            printStream.println(string);
            communicationHelper = CommunicationHelper.getInstance();
            coreValidationImp2 = this;
        }
        coreValidationImp2.f18358a = communicationHelper.getCommunicationManager();
        CommunicationManager communicationManager3 = this.f18358a;
        if (communicationManager3 == null) {
            int iLastIndexOf8 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            throw new CommunicationException(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(6, (iLastIndexOf8 * 4) % iLastIndexOf8 == 0 ? C1593ug.zd("=]f\u001d826 >+*::)*.3Ez\b\t\nr\u007f\t\u0001At\t5G8U9", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951495701))), (short) (ZN.Xd() ^ (193389824 ^ 193367406))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(8, C1561oA.od("\u0001+4&#mh", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951494842))))));
        }
        if (Integer.parseInt(strXd) != 0) {
            str8 = strXd;
            coreValidationImp3 = null;
            i48 = (355691054 ^ 1481926459) ^ 1298599195;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(true);
            coreValidationImp3 = this;
            str8 = str9;
        }
        if (i48 != 0) {
            coreValidationImp3.f18358a.isResponseEncrypted(true);
            str8 = strXd;
        }
        if (Integer.parseInt(str8) != 0) {
            communicationManager = null;
            i49 = 1109858590 ^ 1109858581;
        } else {
            communicationManager = this.f18358a;
            str8 = str9;
        }
        if (i49 != 0) {
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18358a;
            str8 = strXd;
        }
        if (Integer.parseInt(str8) != 0) {
            coreValidationImp4 = null;
            i43 = 1985632583 ^ 1985632578;
        } else {
            communicationManager.addSessionIdInEncryptedData(true);
            coreValidationImp4 = this;
            str8 = str9;
        }
        if (i43 != 0) {
            coreValidationImp4.f18358a.setCallback(this);
            str8 = strXd;
        }
        if (Integer.parseInt(str8) != 0) {
            i35 = 6;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18358a;
            str8 = str9;
            i40 = 1;
            i35 = iXd3;
        }
        if (i35 != 0) {
            sbAppend = new StringBuilder();
            str8 = strXd;
        } else {
            i40 = 1;
            sbAppend = null;
        }
        if (Integer.parseInt(str8) != 0) {
            i45 = iXd3;
        } else {
            sbAppend = sbAppend.append(validateOtpModel.getApi());
            str8 = str9;
        }
        if (i45 != 0) {
            str8 = strXd;
        }
        if (Integer.parseInt(str8) != 0) {
            str9 = str8;
            i36 = 1;
        } else {
            c4 = 6;
            i36 = iXd3;
        }
        int i51 = i36;
        int i52 = (579063883 ^ 1051110289) ^ 472218254;
        if (c4 != 0) {
            i52 += i36 + i36 + i51;
            str9 = strXd;
        }
        if (Integer.parseInt(str9) != 0) {
            iXd2 = 1;
            i39 = iXd3;
        } else {
            iXd2 = FB.Xd() ^ 1609527159;
        }
        if (i39 != 0) {
            i52 /= iXd2;
            iLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd2 = iLastIndexOf6;
        }
        if ((iLastIndexOf6 * iXd3) % iXd2 != 0) {
            int i53 = (675195333 ^ 887522810) ^ 483929185;
            short sXd4 = (short) (C1580rY.Xd() ^ (466776819 ^ (-466776303)));
            int[] iArr3 = new int["\u000b\u0001V\u001aO\u0014\rVW\u000f\u0018[)W+\u0017\u0019fg#S,Y+_!ulj_j|+s{/(,n".length()];
            QB qb3 = new QB("\u000b\u0001V\u001aO\u0014\rVW\u000f\u0018[)W+\u0017\u0019fg#S,Y+_!ulj_j|+s{/(,n");
            int i54 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i54] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i54));
                i54++;
            }
            strZd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i53, new String(iArr3, 0, i54));
        } else {
            strZd = Wg.Zd("c%\u0006|i\u007f\n\u001d5", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (746904502 ^ 487453100))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1138134615 ^ 931631905))));
        }
        String strLastIndexOf7 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i52, strZd);
        if (Integer.parseInt(strXd) != 0) {
            headers = null;
            string2 = null;
        } else {
            string2 = sbAppend.append(strLastIndexOf7).toString();
            headers = validateOtpModel.getHeaders();
        }
        communicationManager2.consumeVsshService(i40, string2, headers, this.body);
    }

    @Override // com.valid.vssh_android_core.validation.CoreValidation
    public void generateOtp(GenerateOtpModel generateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        String strKd;
        int i2;
        int i3;
        int i4;
        String strVd;
        int i5;
        String strXd = C1561oA.Xd("q", (short) (C1633zX.Xd() ^ (543724962 ^ (-543746202))));
        try {
            if (lambdaSuccess != null && lambdaError != null) {
                this.lambdaError = lambdaError;
                if (Integer.parseInt(strXd) == 0) {
                    this.lambdaGenericResponse = lambdaSuccess;
                }
                a(generateOtpModel);
                return;
            }
            String str = f18357b;
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 2) % iIndexOf != 0) {
                strKd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(125082563 ^ 125082526, Wg.vd("翪虆", (short) (OY.Xd() ^ ((949841161 ^ 136862396) ^ 817194967))));
            } else {
                strKd = Qg.kd("[\u0005u{{5fxi-kib`da[c\u001b]YhZ_j", (short) (C1499aX.Xd() ^ (1959134871 ^ (-1959144968))), (short) (C1499aX.Xd() ^ (486048634 ^ (-486048833))));
            }
            int i6 = Integer.parseInt(strXd) != 0 ? 1 : 36;
            int i7 = i6 + i6 + i6;
            int i8 = 18;
            if (Integer.parseInt(strXd) != 0) {
                i3 = 1723935277 ^ 1723935271;
                strVd = strXd;
                i2 = 1;
                i4 = 1;
            } else {
                i2 = i7 + 18;
                i3 = 2;
                i4 = 4;
                strVd = hg.Vd("*)", (short) (C1633zX.Xd() ^ ((1889976023 ^ 925697038) ^ (-1200340831))), (short) (C1633zX.Xd() ^ (423295066 ^ (-423281843))));
            }
            if (i3 != 0) {
                i4 += i4 + i4;
            } else {
                strXd = strVd;
            }
            if (Integer.parseInt(strXd) != 0) {
                i8 = 0;
                i5 = (2106958729 ^ 1804011168) ^ 370320677;
            } else {
                i2 += i4;
                i5 = 2945119 ^ 2945112;
            }
            VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strKd, i2 / (i5 != 0 ? i8 + (i8 + i8) : 1)));
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.validation.CoreValidation
    public void generateOtp(GenerateOtpModel generateOtpModel, CoreValidationCallback coreValidationCallback) throws CommunicationException {
        int i2;
        int iXd;
        String str;
        int i3;
        int iXd2;
        int iXd3;
        int i4;
        String strQd;
        if (coreValidationCallback != null) {
            this.callback = coreValidationCallback;
            a(generateOtpModel);
            return;
        }
        String str2 = f18357b;
        short sXd = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831067842));
        int[] iArr = new int["@".length()];
        QB qb = new QB("@");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        String str3 = new String(iArr, 0, i5);
        int i6 = Integer.parseInt(str3);
        String strYd = C1561oA.yd("CI", (short) (FB.Xd() ^ (806979598 ^ 806983063)));
        int iLastIndexOf = 1;
        if (i6 != 0) {
            iXd = FB.Xd() ^ (1096397397 ^ 515300716);
            str = str3;
            i2 = 1;
        } else {
            i2 = 88;
            iXd = 6;
            str = strYd;
        }
        int i7 = 1364823263 ^ 1364823241;
        if (iXd != 0) {
            i3 = i2 + i7;
            str = str3;
        } else {
            i3 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            iXd2 = (2012632977 ^ 561154182) ^ 1451548441;
            i7 = 0;
            strYd = str;
        } else {
            i3 += 16;
            iXd2 = C1580rY.Xd() ^ (-831067158);
        }
        if (iXd2 != 0) {
            i3 /= i7 << 2;
        } else {
            str3 = strYd;
        }
        if (Integer.parseInt(str3) != 0) {
            iXd3 = 1;
            i4 = 1;
        } else {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd3 = C1580rY.Xd() ^ (-831067166);
            i4 = iLastIndexOf;
        }
        if ((iLastIndexOf * iXd3) % i4 != 0) {
            strQd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(FB.Xd() ^ 1609527043, C1561oA.Yd("72HIJI@<44OLK", (short) (FB.Xd() ^ ((1997035964 ^ 996358140) ^ 1282112680))));
        } else {
            strQd = Xg.qd("\u001b.5\r\u0003F\u000eut6\u000f\u000f\u0016y\u007f~[Q\u0012CMRZYV", (short) (C1607wl.Xd() ^ ((889518650 ^ 1876467482) ^ 1524375840)), (short) (C1607wl.Xd() ^ (481745374 ^ 481737693)));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i3, strQd));
    }

    @Override // com.valid.vssh_android_core.basecore.BaseVsshCore, com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void successEvent(BaseSuccessEvent baseSuccessEvent) {
        try {
            CommunicationHelper.getInstance().setCommunicationManager(this.f18358a);
            super.successEvent(baseSuccessEvent);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.validation.CoreValidation
    public void validateOtp(ValidateOtpModel validateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
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
        int i11;
        String strLastIndexOf;
        String strWd = Jg.Wd(Global.UNDERSCORE, (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1538617555 ^ (-474523878)))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609527519))));
        if (lambdaSuccess != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(strWd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess;
            }
            a(validateOtpModel);
            return;
        }
        String str2 = f18357b;
        int i12 = Integer.parseInt(strWd);
        String strXd = ZO.xd("@T", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69938174))), (short) (C1499aX.Xd() ^ ((2034576843 ^ 1395021330) ^ (-711145782))));
        int i13 = 4;
        int iLastIndexOf = 1;
        if (i12 != 0) {
            str = strWd;
            i3 = 4;
            i2 = 1;
        } else {
            i2 = (1914204269 ^ 699835631) ^ 1538184344;
            i3 = (335447452 ^ 2067350713) ^ 1757921582;
            str = strXd;
        }
        int i14 = 0;
        if (i3 != 0) {
            i5 = i2 + i2;
            str = strWd;
            i4 = 0;
        } else {
            i4 = i3 + 4;
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i7 = i4 + 10;
            i6 = 1;
            i13 = 1;
        } else {
            i6 = i2 + i5 + 13;
            i7 = i4 + 14;
            str = strXd;
        }
        if (i7 != 0) {
            i9 = i13 + i13;
            str = strWd;
            i8 = 0;
        } else {
            i8 = i7 + 15;
            i9 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i10 = i8 + 10;
            strXd = str;
        } else {
            i6 += i13 + i9;
            i10 = i8 + 9;
            i14 = 13;
        }
        if (i10 != 0) {
            i11 = i14 + i14;
        } else {
            strWd = strXd;
            i11 = 1;
        }
        if (Integer.parseInt(strWd) == 0) {
            i6 /= i14 + i11;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * 4) % iLastIndexOf == 0) {
            strLastIndexOf = C1626yg.Ud("nk`E8|m3fK\b(}\u000e\u000bv\u007fs:igY\u0010-V", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1319184562 ^ (-221928962)))), (short) (ZN.Xd() ^ (ZN.Xd() ^ (70990600 ^ 934349424))));
        } else {
            int iXd = OY.Xd() ^ (1848083032 ^ 1779206810);
            short sXd = (short) (C1580rY.Xd() ^ (444070150 ^ (-444055931)));
            int[] iArr = new int[",\u000b\u001do=Lt*\u0015ZW@#\\!\u0015\u0017e#V\u0010\u0002^TW\u0016\u001f4\u0011O#\r-D\u0018Jq\u0018\u0015".length()];
            QB qb = new QB(",\u000b\u001do=Lt*\u0015ZW@#\\!\u0015\u0017e#V\u0010\u0002^TW\u0016\u001f4\u0011O#\r-D\u0018Jq\u0018\u0015");
            int i15 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i15] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i15 % C1561oA.Xd.length] ^ (sXd + i15)));
                i15++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd, new String(iArr, 0, i15));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i6, strLastIndexOf));
    }

    @Override // com.valid.vssh_android_core.validation.CoreValidation
    public void validateOtp(ValidateOtpModel validateOtpModel, CoreValidationCallback coreValidationCallback) throws CommunicationException {
        int i2;
        int i3;
        String str;
        int i4;
        int iXd;
        int iXd2;
        int i5;
        String strOd;
        if (coreValidationCallback != null) {
            this.callback = coreValidationCallback;
            a(validateOtpModel);
            return;
        }
        String str2 = f18357b;
        short sXd = (short) (C1607wl.Xd() ^ ((1509035235 ^ 1220396105) ^ 290424858));
        int[] iArr = new int["\f".length()];
        QB qb = new QB("\f");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd + sXd) + i6)) + xuXd.CK(iKK));
            i6++;
        }
        String str3 = new String(iArr, 0, i6);
        int i7 = Integer.parseInt(str3);
        String strQd = C1561oA.Qd("\r", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1924576374 ^ 1128250131))));
        int iLastIndexOf = 1;
        if (i7 != 0) {
            i3 = 1601602318 ^ 1601602308;
            str = str3;
            i2 = 1;
        } else {
            i2 = 32;
            i3 = 11;
            str = strQd;
        }
        int i8 = 1733331345 ^ 1733331329;
        if (i3 != 0) {
            i4 = i2 + i8;
            str = str3;
        } else {
            i4 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            iXd = C1607wl.Xd() ^ (2134097784 ^ 293055659);
            i8 = 0;
            strQd = str;
        } else {
            i4 += 6;
            iXd = OY.Xd() ^ (1164107145 ^ 1095357795);
        }
        if (iXd != 0) {
            i4 /= i8 + i8;
        } else {
            str3 = strQd;
        }
        if (Integer.parseInt(str3) != 0) {
            iXd2 = 1;
            i5 = 1;
        } else {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd2 = C1607wl.Xd() ^ (740653319 ^ 1113680606);
            i5 = iLastIndexOf;
        }
        if ((iLastIndexOf * iXd2) % i5 != 0) {
            short sXd2 = (short) (OY.Xd() ^ ((2091577673 ^ 1099264865) ^ 1026535176));
            short sXd3 = (short) (OY.Xd() ^ (960511330 ^ 960509385));
            int[] iArr2 = new int["ﺇಈ".length()];
            QB qb2 = new QB("ﺇಈ");
            int i9 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i9] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i9)) - sXd3);
                i9++;
            }
            strOd = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i9), C1499aX.Xd() ^ (1519604969 ^ (-419967895)));
        } else {
            strOd = C1561oA.od("\u0007\u0018\u001drf(mSP\u0010fdiKOL'\u001bY\t\u0011\u0014\u001a\u0017\u0012", (short) (ZN.Xd() ^ ((938246815 ^ 927772041) ^ 10493357)));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i4, strOd));
    }
}
