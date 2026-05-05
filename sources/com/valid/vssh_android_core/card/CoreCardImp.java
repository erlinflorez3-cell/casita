package com.valid.vssh_android_core.card;

import com.dynatrace.android.agent.Global;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.CardInformationModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.PayModel;
import com.valid.vssh_android_core.model.TransactionsModel;
import com.valid.vssh_android_core.model.response.CardAccountInfoResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.PayResponse;
import com.valid.vssh_android_core.model.response.TransactionsResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.utils.ValidationsHelper;
import com.valid.vssh_android_core.utils.VsshCoreConstants;
import cz.msebera.android.httpclient.message.TokenParser;
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
public class CoreCardImp extends BaseVsshCore implements CoreCard {

    /* JADX INFO: renamed from: f */
    public static final String f18338f = Wg.vd("%PVH!>RC#FL", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864713778))));

    /* JADX INFO: renamed from: a */
    public CoreCardCallback f18339a;

    /* JADX INFO: renamed from: b */
    public CommunicationManager f18340b;

    /* JADX INFO: renamed from: c */
    public LambdaSuccess<CardAccountInfoResponse> f18341c;

    /* JADX INFO: renamed from: d */
    public LambdaSuccess<TransactionsResponse> f18342d;

    /* JADX INFO: renamed from: e */
    public LambdaSuccess<PayResponse> f18343e;

    public class Exception extends RuntimeException {
    }

    public final void a(CardInformationModel cardInformationModel) throws CommunicationException {
        CoreCardImp coreCardImp;
        int iXd;
        String str;
        CoreCardImp coreCardImp2;
        String str2;
        CommunicationManager communicationManager;
        int i2;
        char c2;
        StringBuilder sbAppend;
        int iXd2;
        int iXd3;
        int i3;
        int i4;
        CommunicationManager communicationManager2 = CommunicationHelper.getInstance().getCommunicationManager();
        this.f18340b = communicationManager2;
        int iLastIndexOf = 1;
        if (communicationManager2 == null) {
            int iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            throw new CommunicationException(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1, (iLastIndexOf2 * 2) % iLastIndexOf2 != 0 ? BuildConfig.AnonymousClass1.indexOf(Qg.kd("\u0006~\u0007/\n\b\u001d/\u0012\b\u000f\u001a#k\u0014\u0018\u001c~\u0007\u000fig%\u000f\f\u001eb\n\u0002gf\u0006\u001c}r\u0007Z[j<\nWVuZVR\tzpewZW8gbG=yb\u0007\u0016%4\u0013']", (short) (C1607wl.Xd() ^ ((1210809685 ^ 864016376) ^ 2069144889)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (2144610411 ^ (-1011813694))))), (353292433 ^ 2127725930) ^ 1809601980) : hg.Vd("MSXo**\u0010\u0014\u001c\u0019\u001c\u001e\u0018\u001f\u0014\u0012W\u001b\\AZO\\QRP\u0005HJS\u000f{tv", (short) (ZN.Xd() ^ (1474926608 ^ 1474951669)), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831080834))))));
        }
        short sXd = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207806170)));
        int[] iArr = new int["L".length()];
        QB qb = new QB("L");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        String str3 = new String(iArr, 0, i5);
        int i6 = Integer.parseInt(str3);
        int iXd4 = (1526626976 ^ 813238935) ^ 1787260976;
        String strYd = C1561oA.yd("\u0002\t", (short) (ZN.Xd() ^ ((1193151537 ^ 1889095293) ^ 931601218)));
        if (i6 != 0) {
            iXd = FB.Xd() ^ 1609527095;
            str = str3;
            coreCardImp = null;
        } else {
            communicationManager2.setEnableRequestWithSSLPinning(true);
            coreCardImp = this;
            iXd = iXd4;
            str = strYd;
        }
        if (iXd != 0) {
            coreCardImp.f18340b.isResponseEncrypted(true);
            str = str3;
        }
        (Integer.parseInt(str) != 0 ? null : this.f18340b).disableSecureRequest(false);
        CommunicationManager communicationManager3 = this.f18340b;
        if (Integer.parseInt(str3) != 0) {
            str2 = str3;
            coreCardImp2 = null;
        } else {
            communicationManager3.addSessionIdInEncryptedData(true);
            iXd4 = OY.Xd() ^ 69929195;
            coreCardImp2 = this;
            str2 = strYd;
        }
        if (iXd4 != 0) {
            coreCardImp2.f18340b.setCallback(this);
            str2 = str3;
        }
        int i7 = 8;
        int i8 = 12;
        if (Integer.parseInt(str2) != 0) {
            i2 = 0;
            communicationManager = null;
            c2 = '\f';
        } else {
            communicationManager = this.f18340b;
            i2 = 1;
            c2 = '\b';
            str2 = strYd;
        }
        if (c2 != 0) {
            sbAppend = new StringBuilder();
            str2 = str3;
        } else {
            i2 = 1;
            sbAppend = null;
        }
        if (Integer.parseInt(str2) != 0) {
            iXd2 = ZN.Xd() ^ (1331655250 ^ 2094353575);
        } else {
            sbAppend = sbAppend.append(cardInformationModel.getApi());
            str2 = strYd;
            iXd2 = 12;
        }
        if (iXd2 != 0) {
            str2 = str3;
        }
        if (Integer.parseInt(str2) != 0) {
            i7 = 1482552582 ^ 1482552588;
            i8 = 0;
            iXd3 = 1;
        } else {
            iXd3 = C1607wl.Xd() ^ (403845879 ^ 1985356085);
            str2 = strYd;
        }
        if (i7 != 0) {
            iXd3 += i8 << 2;
            str2 = str3;
        }
        if (Integer.parseInt(str2) != 0) {
            i4 = (970710841 ^ 1950197202) ^ 1306950372;
            i3 = 1;
        } else {
            i3 = 6;
            i4 = 13;
            str2 = strYd;
        }
        if (i4 != 0) {
            iXd3 += i3;
        } else {
            str3 = str2;
        }
        if (Integer.parseInt(str3) == 0) {
            iXd3 /= 24;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        communicationManager.consumeVsshService(i2, sbAppend.append(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd3, (iLastIndexOf * 5) % iLastIndexOf != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1467884552 ^ 1467884646, C1561oA.Yd("o*\u007f\u0016\u000e", (short) (FB.Xd() ^ ((413751115 ^ 2107571978) ^ 1698165909)))) : Xg.qd("S\u001e\u001a)vOkicspj<imr @-;\u0012.,>.IG\u0010=\t\bxu\u007f\u0007\u007f\f\u0011", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (412228136 ^ (-1527346047)))), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134238275)))))).toString(), cardInformationModel.getHeaders(), null);
    }

    public final void a(PayModel payModel) throws CommunicationException {
        int i2;
        int i3;
        int i4;
        String str;
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
        HashMap map;
        int i16;
        CoreCardImp coreCardImp;
        Map<String, Object> map2;
        int iIndexOf;
        int i17;
        int iXd;
        int i18;
        String str2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        JsonParser jsonParser;
        int i24;
        int i25;
        Gson gson;
        String json;
        int i26;
        Map<String, Object> map3;
        int iIndexOf2;
        int iXd2;
        char c2;
        String str3;
        int i27;
        int iXd3;
        int i28;
        int i29;
        JsonParser jsonParser2;
        int i30;
        Gson gson2;
        String json2;
        int i31;
        int i32;
        PrintStream printStream;
        StringBuilder sb;
        int i33;
        int iIndexOf3;
        int i34;
        String strLastIndexOf;
        int i35;
        String str4;
        int i36;
        int i37;
        int i38;
        String str5;
        int i39;
        String string;
        CommunicationManager communicationManager;
        CoreCardImp coreCardImp2;
        CoreCardImp coreCardImp3;
        int i40;
        String str6;
        CommunicationManager communicationManager2;
        CoreCardImp coreCardImp4;
        CommunicationManager communicationManager3;
        Map<String, String> headers;
        String strVd;
        HashMap map4 = new HashMap();
        String strWd = Jg.Wd("a", (short) (C1499aX.Xd() ^ (93067382 ^ (-93075270))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (563494021 ^ (-1339187910)))));
        int i41 = 13;
        String api = null;
        if (Integer.parseInt(strWd) != 0) {
            map4 = null;
        } else {
            this.principalData = map4;
            i41 = 1332154458 ^ 1332154457;
        }
        int i42 = 1;
        int iIndexOf4 = i41 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int iXd4 = C1499aX.Xd() ^ (1469576640 ^ (-336368343));
        String strIndexOf = (iIndexOf4 * iXd4) % iIndexOf4 != 0 ? BuildConfig.AnonymousClass1.indexOf(ZO.xd("oiTTTV%@\u000f\u001acQ?I)\u0005=;DzU%F:", (short) (OY.Xd() ^ (54681070 ^ 54671150)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (605163289 ^ (-1346590098))))), C1607wl.Xd() ^ (1767614390 ^ 119518224)) : C1626yg.Ud("\u00066i\u0016\u0012G", (short) (C1607wl.Xd() ^ ((404499190 ^ 1075834652) ^ 1476641240)), (short) (C1607wl.Xd() ^ (303243199 ^ 303255685)));
        int i43 = Integer.parseInt(strWd);
        char c3 = '\t';
        int i44 = (2111035081 ^ 942307281) ^ 1173987606;
        int i45 = 7;
        int i46 = 1357126382 ^ 1357126380;
        int i47 = 0;
        String strWd2 = Ig.wd("a\u0010", (short) (C1580rY.Xd() ^ ((1765713333 ^ 1597204504) ^ (-906866928))));
        if (i43 != 0) {
            str = strWd;
            i2 = 1;
            i4 = 9;
            i3 = 0;
        } else {
            i2 = i44;
            i3 = 7;
            i4 = i46;
            str = strWd2;
        }
        if (i4 != 0) {
            i6 = i3 << 2;
            str = strWd;
            i5 = 0;
        } else {
            i5 = i4 + 6;
            i6 = 1;
        }
        char c4 = 4;
        if (Integer.parseInt(str) != 0) {
            i7 = i5 + 9;
            i8 = 1;
        } else {
            i2 += i6;
            i7 = i5 + 14;
            str = strWd2;
            i6 = 4;
            i8 = 4;
        }
        if (i7 != 0) {
            i6 = i6 + i8 + i8;
            str = strWd;
            i9 = 0;
        } else {
            i9 = i7 + 4;
        }
        int i48 = (2103904240 ^ 1710314418) ^ 412505161;
        if (Integer.parseInt(str) != 0) {
            i10 = i9 + 13;
            i11 = 0;
        } else {
            i2 += i6;
            i10 = i9 + 11;
            i11 = 7;
            str = strWd2;
        }
        int i49 = 67183673 ^ 67183667;
        if (i10 != 0) {
            i13 = i11 + i11 + i11;
            str = strWd;
            i12 = 0;
        } else {
            i12 = i10 + 10;
            i13 = 1;
        }
        int i50 = 15;
        if (Integer.parseInt(str) != 0) {
            i14 = i12 + 15;
        } else {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i2 / i13);
            i14 = i12 + 10;
            str = strWd2;
        }
        if (i14 != 0) {
            map4.put(strIndexOf, payModel.getAmount());
            str = strWd;
            i15 = 0;
        } else {
            i15 = i14 + 15;
        }
        if (Integer.parseInt(str) != 0) {
            i16 = i15 + 12;
            map = null;
            coreCardImp = null;
        } else {
            map = new HashMap();
            i16 = i15 + 14;
            coreCardImp = this;
            str = strWd2;
        }
        if (i16 != 0) {
            coreCardImp.body = map;
            map2 = this.body;
            str = strWd;
        } else {
            map2 = null;
        }
        if (Integer.parseInt(str) != 0) {
            iIndexOf = 1;
            i17 = 1;
        } else {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i17 = 1797343786 ^ 1797343785;
        }
        String strOd = (iIndexOf * i17) % iIndexOf == 0 ? EO.Od("])EiA!XK\u007fx\u0013C\u0004", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831069548)))) : BuildConfig.AnonymousClass1.indexOf(C1561oA.Qd("_\u0001\u007fj#-ij^s\u001f!^_W\u0019h^dVo&\u001ci\u0014\u001d&L", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207821137))), C1499aX.Xd() ^ (-1134257934));
        if (Integer.parseInt(strWd) != 0) {
            str2 = strWd;
            iXd = 1;
            i18 = 8;
        } else {
            iXd = FB.Xd() ^ 1609527044;
            i18 = 7;
            str2 = strWd2;
        }
        if (i18 != 0) {
            str2 = strWd;
            i19 = 0;
            i20 = 8;
        } else {
            i19 = i18 + 12;
            i20 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i21 = i19 + 12;
            i22 = 0;
        } else {
            iXd += i20;
            i21 = i19 + 13;
            str2 = strWd2;
            i22 = i48;
        }
        if (i21 != 0) {
            strOd = BuildConfig.AnonymousClass1.indexOf(strOd, iXd / (i22 + i22));
            str2 = strWd;
            i23 = 0;
        } else {
            i23 = i21 + 15;
        }
        if (Integer.parseInt(str2) != 0) {
            i24 = i23 + 6;
            jsonParser = null;
        } else {
            jsonParser = new JsonParser();
            i24 = i23 + 6;
            str2 = strWd2;
        }
        if (i24 != 0) {
            gson = new Gson();
            str2 = strWd;
            i25 = 0;
        } else {
            i25 = i24 + 13;
            gson = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i26 = i25 + 14;
            json = null;
        } else {
            json = gson.toJson(this.principalData);
            i26 = i25 + 7;
            str2 = strWd2;
        }
        if (i26 != 0) {
            map2.put(strOd, jsonParser.parse(json));
            str2 = strWd;
        }
        if (Integer.parseInt(str2) != 0) {
            map3 = null;
            iIndexOf2 = 1;
        } else {
            map3 = this.body;
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        }
        String strLastIndexOf2 = (iIndexOf2 * 5) % iIndexOf2 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((751107250 ^ 39710388) ^ 781783660, C1593ug.zd("vuu?n\b+}0xCKx\nv\u000f\u000b\t\bNI\u0018\u0014\nFM\u0010\r\t\bW\"I\u0019a\r", (short) (FB.Xd() ^ (1827685573 ^ 1827687502)), (short) (FB.Xd() ^ (Od.Xd() ^ 1207810654)))) : C1561oA.od(">?=>!:89.7\r&1\"", (short) (C1607wl.Xd() ^ ((1218327382 ^ 2040810938) ^ 825896449)));
        if (Integer.parseInt(strWd) != 0) {
            str3 = strWd;
            iXd2 = 1;
            i27 = 1;
            iXd3 = 1;
            c2 = '\b';
        } else {
            iXd2 = C1607wl.Xd() ^ (150852225 ^ 1723449841);
            c2 = '\t';
            str3 = strWd2;
            i27 = (343870521 ^ 1622627519) ^ 1959286917;
            iXd3 = C1633zX.Xd() ^ (-1951491128);
        }
        if (c2 != 0) {
            iXd2 += i27 + iXd3;
            str3 = strWd;
        }
        if (Integer.parseInt(str3) != 0) {
            i28 = 1;
            i29 = 6;
        } else {
            i28 = (1630192409 ^ 156948606) ^ 1752177523;
            str3 = strWd2;
            i29 = 1553711870 ^ 1553711869;
        }
        if (i29 != 0) {
            strLastIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf2, iXd2 / (i49 + i28));
            str3 = strWd;
        }
        if (Integer.parseInt(str3) != 0) {
            jsonParser2 = null;
            i30 = (3026885 ^ 1246190090) ^ 1248425411;
        } else {
            jsonParser2 = new JsonParser();
            str3 = strWd2;
            i30 = 15321468 ^ 15321457;
        }
        if (i30 != 0) {
            gson2 = new Gson();
            str3 = strWd;
        } else {
            gson2 = null;
        }
        if (Integer.parseInt(str3) != 0) {
            json2 = null;
            i31 = 6;
        } else {
            json2 = gson2.toJson(payModel.getAdditionalData());
            i31 = 9;
            str3 = strWd2;
        }
        if (i31 != 0) {
            map3.put(strLastIndexOf2, jsonParser2.parse(json2));
            str3 = strWd;
            i32 = 0;
        } else {
            i32 = i31 + 11;
        }
        if (Integer.parseInt(str3) != 0) {
            i33 = i32 + 11;
            printStream = null;
            sb = null;
        } else {
            printStream = System.out;
            sb = new StringBuilder();
            i33 = i32 + 6;
        }
        if (i33 != 0) {
            iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
            i34 = 4;
        } else {
            iIndexOf3 = 1;
            i34 = 1;
        }
        if ((i34 * iIndexOf3) % iIndexOf3 == 0) {
            short sXd = (short) (Od.Xd() ^ (1965046610 ^ (-1965053707)));
            int[] iArr = new int["!\n !{Ŧ>,F8LG{v{\u00186GCB?\u0012{KZD\u001c\u0013\u001c@Y_K^baO\u0012\u001c".length()];
            QB qb = new QB("!\n !{Ŧ>,F8LG{v{\u00186GCB?\u0012{KZD\u001c\u0013\u001c@Y_K^baO\u0012\u001c");
            int i51 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i51] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i51));
                i51++;
            }
            strLastIndexOf = new String(iArr, 0, i51);
        } else {
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(OY.Xd() ^ 69929104, Wg.Zd("\u000f\u000eI,ca(#V\\\u0003\u0004", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207816580))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134241928))));
        }
        if (Integer.parseInt(strWd) != 0) {
            str4 = strWd;
            i35 = 1;
            i36 = 1;
        } else {
            i35 = 1984823979 ^ 1984823991;
            str4 = strWd2;
            i44 = 8;
            i36 = 4;
        }
        if (i44 != 0) {
            i35 += i36 + i36;
            str4 = strWd;
        }
        if (Integer.parseInt(str4) != 0) {
            c3 = 7;
        } else {
            i35 /= 16;
            str4 = strWd2;
        }
        if (c3 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, i35));
            str4 = strWd;
        }
        if (Integer.parseInt(str4) == 0) {
            sb = sb.append(payModel.getApi());
            i48 = iXd4;
        }
        int iIndexOf5 = i48 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        String strXd = (iIndexOf5 * iXd4) % iIndexOf5 == 0 ? C1561oA.Xd("wtw\u00054&$:&+qw", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849959301)))) : BuildConfig.AnonymousClass1.indexOf(Wg.vd("PJ@BA\t\u0016\u0016TUAC465ILuoA", (short) (FB.Xd() ^ ((1292832074 ^ 786043111) ^ 1674919262))), Od.Xd() ^ (1014247740 ^ 2072618253));
        if (Integer.parseInt(strWd) != 0) {
            str5 = strWd;
            i37 = 1;
            i39 = 1;
            i38 = 1;
        } else {
            i37 = 1178363959 ^ 1178364163;
            i38 = i46;
            str5 = strWd2;
            i39 = 4;
            c4 = 7;
        }
        if (c4 != 0) {
            i37 += i39 << i38;
            str5 = strWd;
        }
        if (Integer.parseInt(str5) == 0) {
            i37 /= 56;
            str5 = strWd2;
            i45 = 2093497696 ^ 2093497708;
        }
        if (i45 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.indexOf(strXd, i37));
            str5 = strWd;
        }
        if (Integer.parseInt(str5) != 0) {
            string = null;
        } else {
            string = this.body.toString();
            str5 = strWd2;
            iXd4 = 15;
        }
        if (iXd4 != 0) {
            printStream.println(sb.append(string).toString());
            str5 = strWd;
        }
        if (Integer.parseInt(str5) != 0) {
            communicationManager = null;
            coreCardImp2 = null;
        } else {
            communicationManager = CommunicationHelper.getInstance().getCommunicationManager();
            coreCardImp2 = this;
        }
        coreCardImp2.f18340b = communicationManager;
        CommunicationManager communicationManager4 = this.f18340b;
        if (communicationManager4 == null) {
            int iIndexOf6 = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf6 * 2) % iIndexOf6 != 0) {
                int i52 = 2138999530 ^ 2138999541;
                int iXd5 = C1580rY.Xd() ^ (-831075502);
                int iXd6 = C1580rY.Xd() ^ (-831085000);
                short sXd2 = (short) (FB.Xd() ^ iXd5);
                short sXd3 = (short) (FB.Xd() ^ iXd6);
                int[] iArr2 = new int["}EA<\u0001\u007fss6nu5-js\"k2zq\"l(.\u001fc&,\u001c!\u001eb^ %*".length()];
                QB qb2 = new QB("}EA<\u0001\u007fss6nu5-js\"k2zq\"l(.\u001fc&,\u001c!\u001eb^ %*");
                int i53 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i53] = xuXd2.fK(((sXd2 + i53) + xuXd2.CK(iKK2)) - sXd3);
                    i53++;
                }
                strVd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i52, new String(iArr2, 0, i53));
            } else {
                strVd = hg.Vd("5o`$^jhhdILVPcDJK\bLINS<IVT\u0016L>\u0010K@MK", (short) (C1580rY.Xd() ^ (1155889703 ^ (-1155887735))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831091295)));
            }
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf(strVd, i46));
        }
        if (Integer.parseInt(strWd) != 0) {
            str6 = strWd;
            coreCardImp3 = null;
            i40 = 15;
        } else {
            communicationManager4.setEnableRequestWithSSLPinning(true);
            coreCardImp3 = this;
            i40 = i46;
            str6 = strWd2;
        }
        if (i40 != 0) {
            coreCardImp3.f18340b.isResponseEncrypted(true);
            str6 = strWd;
        }
        if (Integer.parseInt(str6) != 0) {
            strWd2 = str6;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18340b;
            i50 = i46;
        }
        if (i50 != 0) {
            communicationManager2.disableSecureRequest(false);
            communicationManager2 = this.f18340b;
            strWd2 = strWd;
        }
        if (Integer.parseInt(strWd2) != 0) {
            coreCardImp4 = null;
        } else {
            communicationManager2.addSessionIdInEncryptedData(true);
            coreCardImp4 = this;
        }
        coreCardImp4.f18340b.setCallback(this);
        if (Integer.parseInt(strWd) != 0) {
            communicationManager3 = null;
            i46 = 6;
        } else {
            communicationManager3 = this.f18340b;
            i47 = 1;
        }
        if (i46 != 0) {
            api = payModel.getApi();
            headers = payModel.getHeaders();
            i42 = i47;
        } else {
            headers = null;
        }
        communicationManager3.consumeVsshService(i42, api, headers, this.body);
    }

    public final void a(TransactionsModel transactionsModel) throws CommunicationException {
        char c2;
        int i2;
        char c3;
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
        int i12;
        int i13;
        Map<String, Object> map;
        int i14;
        int iIndexOf;
        int i15;
        int iXd;
        int i16;
        String str2;
        int i17;
        CoreCardImp coreCardImp;
        String str3;
        char c4;
        HashMap map2;
        Map<String, Object> map3;
        char c5;
        int i18;
        int i19;
        int i20;
        String str4;
        int i21;
        int i22;
        Gson gson;
        char c6;
        int iIndexOf2;
        int i23;
        int i24;
        int i25;
        char c7;
        String str5;
        int i26;
        char c8;
        int i27;
        int iIndexOf3;
        String strLastIndexOf;
        int iXd2;
        String str6;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int iIndexOf4;
        String strVd;
        int i33;
        int i34;
        String str7;
        char c9;
        String string;
        int iXd3;
        CommunicationManager communicationManager;
        CoreCardImp coreCardImp2;
        CoreCardImp coreCardImp3;
        String str8;
        int i35;
        CommunicationManager communicationManager2;
        int i36;
        int i37;
        int i38;
        CoreCardImp coreCardImp4;
        int i39;
        CommunicationManager communicationManager3;
        int i40;
        int i41;
        int i42;
        StringBuilder sbAppend;
        int i43;
        int iIndexOf5;
        int i44;
        int i45;
        String str9;
        Map<String, String> headers;
        String string2;
        String strLastIndexOf2;
        int iIndexOf6;
        int i46;
        String str10;
        int i47;
        String str11;
        int i48;
        int i49;
        char c10;
        HashMap map4 = new HashMap();
        String strUd = C1561oA.ud("U", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1429282710 ^ (-1689788128)))));
        char c11 = 6;
        int i50 = 4;
        if (Integer.parseInt(strUd) != 0) {
            c2 = 4;
            map4 = null;
        } else {
            this.principalData = map4;
            c2 = 6;
        }
        int i51 = 1;
        int iIndexOf7 = c2 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        int i52 = 421244588 ^ 421244585;
        String strIndexOf = (iIndexOf7 * i52) % iIndexOf7 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1561oA.yd("N`[d\u0012=[\\po{8k]2sBUW\\VW\\U\u0015", (short) (ZN.Xd() ^ (283136817 ^ 283145204))), (1423027150 ^ 1375605881) ^ 87015300) : C1561oA.Yd("(/-.)", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849963309))));
        int i53 = Integer.parseInt(strUd);
        char c12 = 11;
        char c13 = '\n';
        int i54 = 0;
        String strQd = Xg.qd("\u0012\u0012", (short) (OY.Xd() ^ (FB.Xd() ^ 1609498705)), (short) (OY.Xd() ^ (880012811 ^ 879990395)));
        if (i53 != 0) {
            str = strUd;
            i2 = 1;
            c3 = '\t';
            i3 = 0;
        } else {
            i2 = 20;
            c3 = 11;
            i3 = 10;
            str = strQd;
        }
        int i55 = 2;
        if (c3 != 0) {
            i4 = i3 << 2;
            str = strUd;
        } else {
            i4 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = 1;
            i5 = 10;
        } else {
            i2 += i4;
            i4 = 4;
            i5 = 4;
            i6 = 4;
            str = strQd;
        }
        int i56 = 8;
        if (i5 != 0) {
            i4 = i4 + i6 + i6;
            str = strUd;
            i7 = 0;
        } else {
            i7 = i5 + 8;
        }
        char c14 = 14;
        if (Integer.parseInt(str) != 0) {
            i8 = i7 + 7;
            i9 = 0;
        } else {
            i2 += i4;
            i8 = i7 + 14;
            i9 = 6;
            str = strQd;
        }
        char c15 = TokenParser.CR;
        if (i8 != 0) {
            i11 = i9 + i9 + i9;
            str = strUd;
            i10 = 0;
        } else {
            i10 = i8 + 13;
            i11 = 1;
        }
        char c16 = 15;
        if (Integer.parseInt(str) != 0) {
            i12 = i10 + 14;
        } else {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i2 / i11);
            i12 = i10 + 15;
            str = strQd;
        }
        if (i12 != 0) {
            map4.put(strIndexOf, transactionsModel.getIndex());
            str = strUd;
            i13 = 0;
        } else {
            i13 = i12 + 8;
        }
        if (Integer.parseInt(str) != 0) {
            i14 = i13 + 10;
            map = null;
        } else {
            map = this.principalData;
            i14 = i13 + 10;
        }
        if (i14 != 0) {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i15 = i52;
        } else {
            iIndexOf = 1;
            i15 = 1;
        }
        String strLastIndexOf3 = (i15 * iIndexOf) % iIndexOf != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1633zX.Xd() ^ (2101588255 ^ (-152229169)), Jg.Wd("\u0010U\rhv1,^81ku,^TV-\u0018\\  ao\b:\u0014-(Me<e\u0018}T\u001b", (short) (OY.Xd() ^ ((277613734 ^ 1949852264) ^ 1689532348)), (short) (OY.Xd() ^ ((1714997383 ^ 1192284842) ^ 556302152)))) : ZO.xd("\u000esy\f\u001au5H\u000b", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831089937))), (short) (FB.Xd() ^ (FB.Xd() ^ (419883669 ^ 1189715231))));
        if (Integer.parseInt(strUd) != 0) {
            str2 = strUd;
            c16 = 6;
            iXd = 1;
            i16 = 1;
            i17 = 1;
        } else {
            iXd = ZN.Xd() ^ (857753077 ^ 11172797);
            i16 = 4;
            str2 = strQd;
            i17 = 2;
        }
        if (c16 != 0) {
            iXd += i16 << i17;
            str2 = strUd;
        }
        if (Integer.parseInt(str2) == 0) {
            iXd /= 92;
        }
        String strIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf3, iXd);
        Integer sizeLimit = transactionsModel.getSizeLimit();
        if (Integer.parseInt(strUd) != 0) {
            str3 = strUd;
            c4 = 4;
            coreCardImp = null;
        } else {
            map.put(strIndexOf2, sizeLimit);
            coreCardImp = this;
            str3 = strQd;
            c4 = '\r';
        }
        if (c4 != 0) {
            map2 = new HashMap();
            str3 = strUd;
        } else {
            map2 = null;
        }
        if (Integer.parseInt(str3) != 0) {
            c5 = '\n';
            map3 = null;
        } else {
            coreCardImp.body = map2;
            map3 = this.body;
            c5 = 11;
        }
        int iIndexOf8 = c5 != 0 ? BuildConfig.AnonymousClass1.indexOf() : 1;
        String strUd2 = (iIndexOf8 * 2) % iIndexOf8 == 0 ? C1626yg.Ud("\u00145i\u00146*V4C k\t>", (short) (FB.Xd() ^ (OY.Xd() ^ (894289626 ^ 828804464))), (short) (FB.Xd() ^ (570077474 ^ 570091052))) : BuildConfig.AnonymousClass1.indexOf(Ig.wd("&|\\z/.. |EHk\u0018\u0019~T\u0004\u0019)@\\ZCy}\u001d>Y\u0015[8^AXQ6", (short) (C1607wl.Xd() ^ (OY.Xd() ^ (598977600 ^ 664319857)))), OY.Xd() ^ (1845275397 ^ 1775739890));
        if (Integer.parseInt(strUd) != 0) {
            i18 = 1;
            i19 = 1;
        } else {
            i18 = 273;
            i19 = 4;
        }
        int i57 = i19 + i19 + i19;
        int i58 = 21;
        if (Integer.parseInt(strUd) != 0) {
            str4 = strUd;
            i20 = 4;
            i21 = 0;
        } else {
            i18 += i57;
            i20 = i52;
            str4 = strQd;
            i21 = 21;
        }
        if (i20 != 0) {
            i22 = i21 + i21 + i21;
            str4 = strUd;
        } else {
            i22 = 1;
        }
        if (Integer.parseInt(str4) == 0) {
            strUd2 = BuildConfig.AnonymousClass1.indexOf(strUd2, i18 / i22);
        }
        JsonParser jsonParser = new JsonParser();
        char c17 = '\f';
        if (Integer.parseInt(strUd) != 0) {
            c6 = '\f';
            gson = null;
        } else {
            gson = new Gson();
            c6 = 14;
        }
        map3.put(strUd2, jsonParser.parse(c6 != 0 ? gson.toJson(this.principalData) : null));
        if (transactionsModel.getAdditionalData() != null && !transactionsModel.getAdditionalData().isEmpty()) {
            Map<String, Object> map5 = this.body;
            if (Integer.parseInt(strUd) != 0) {
                iIndexOf6 = 1;
                i46 = 1;
            } else {
                iIndexOf6 = BuildConfig.AnonymousClass1.indexOf();
                i46 = 2;
            }
            if ((i46 * iIndexOf6) % iIndexOf6 != 0) {
                str10 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1607wl.Xd() ^ 1849955306, EO.Od("\u000fX,\u0002Y\u000b\b)mBI\\_.gzj\u0006O\u0017$iBj|/\u007f Pm\u000e/\u00195hi\u0011{^", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (771878868 ^ 1778129878)))));
            } else {
                short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (1605761132 ^ (-5939475))));
                int[] iArr = new int["LECL/HJK<-\u00134?0".length()];
                QB qb = new QB("LECL/HJK<-\u00134?0");
                int i59 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i59] = xuXd.fK(sXd + sXd + sXd + i59 + xuXd.CK(iKK));
                    i59++;
                }
                str10 = new String(iArr, 0, i59);
            }
            if (Integer.parseInt(strUd) != 0) {
                str11 = strUd;
                i47 = 1;
            } else {
                i47 = 33;
                str11 = strQd;
                c15 = '\f';
            }
            if (c15 != 0) {
                str11 = strUd;
            }
            if (Integer.parseInt(str11) != 0) {
                i48 = 1;
                c10 = 11;
                i49 = 8;
            } else {
                i47 += 8;
                i48 = 4;
                i49 = 4;
                c10 = '\t';
                str11 = strQd;
            }
            if (c10 != 0) {
                i49 = i49 + i48 + i48;
                str11 = strUd;
            }
            if (Integer.parseInt(str11) == 0) {
                str10 = BuildConfig.AnonymousClass1.indexOf(str10, i47 / i49);
            }
            map5.put(str10, new JsonParser().parse((Integer.parseInt(strUd) != 0 ? null : new Gson()).toJson(transactionsModel.getAdditionalData())));
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        if (Integer.parseInt(strUd) != 0) {
            iIndexOf2 = 1;
            i23 = 1;
        } else {
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            i23 = 3;
        }
        String strZd = (i23 * iIndexOf2) % iIndexOf2 == 0 ? C1593ug.zd("ojx{Zk\u0017\t\u000f\u001d\r&ZOZt\u001f.\u0012\u001b\u0016tZ\u001b\u001f.\u000e(;0-99.3;<+z\u0004z\u001dH6J/34N\u0005z", (short) (Od.Xd() ^ ((227702770 ^ 620773501) ^ (-680685039))), (short) (Od.Xd() ^ (1897371291 ^ (-1897394849)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1499aX.Xd() ^ (1284787022 ^ (-252652589)), C1561oA.od("\u000f\u0011\u0002\u007f\u0017\u0010\u000e\u0004~|}\f", (short) (OY.Xd() ^ (2119975928 ^ 2119960131))));
        if (Integer.parseInt(strUd) != 0) {
            str5 = strUd;
            c7 = 6;
            i24 = 1;
            i25 = 1;
        } else {
            i24 = 352;
            i25 = 4;
            c7 = 11;
            str5 = strQd;
        }
        if (c7 != 0) {
            i25 += i25 + i25;
            str5 = strUd;
        }
        if (Integer.parseInt(str5) != 0) {
            i26 = 0;
            c8 = 7;
        } else {
            i24 += i25;
            i26 = 22;
            str5 = strQd;
            c8 = '\f';
        }
        if (c8 != 0) {
            i27 = i26 + i26 + i26;
            str5 = strUd;
        } else {
            i27 = 1;
        }
        if (Integer.parseInt(str5) != 0) {
            c13 = 14;
        } else {
            strZd = BuildConfig.AnonymousClass1.indexOf(strZd, i24 / i27);
            str5 = strQd;
        }
        if (c13 != 0) {
            sb = sb.append(strZd);
            strZd = transactionsModel.getApi();
            str5 = strUd;
        }
        if (Integer.parseInt(str5) != 0) {
            iIndexOf3 = 1;
        } else {
            sb = sb.append(strZd);
            iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
        }
        if ((iIndexOf3 * i52) % iIndexOf3 == 0) {
            strLastIndexOf = C1561oA.Kd("<gkwnF\u007f\u007fph\u000b{r\n}}\u0011\u0004\u007f\u0003\u0010", (short) (Od.Xd() ^ (OY.Xd() ^ (-69954754))));
        } else {
            int i60 = 1795853032 ^ 1795852994;
            int iXd4 = FB.Xd() ^ 1609509035;
            int iXd5 = C1633zX.Xd() ^ (1813692561 ^ (-407610407));
            short sXd2 = (short) (ZN.Xd() ^ iXd4);
            short sXd3 = (short) (ZN.Xd() ^ iXd5);
            int[] iArr2 = new int["廃雮".length()];
            QB qb2 = new QB("廃雮");
            int i61 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i61] = xuXd2.fK(((i61 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i61++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i60, new String(iArr2, 0, i61));
        }
        if (Integer.parseInt(strUd) != 0) {
            str6 = strUd;
            iXd2 = 1;
            i28 = 7;
        } else {
            iXd2 = C1499aX.Xd() ^ (-1134257934);
            str6 = strQd;
            i28 = 8;
        }
        if (i28 != 0) {
            str6 = strUd;
            i30 = 4;
            i29 = 0;
        } else {
            i29 = i28 + 5;
            i30 = 1;
        }
        if (Integer.parseInt(str6) != 0) {
            i31 = i29 + 8;
            i32 = 1;
        } else {
            iXd2 += i30;
            i31 = i29 + 4;
            i30 = i52;
            i32 = i30;
            str6 = strQd;
        }
        if (i31 != 0) {
            strLastIndexOf = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, iXd2 / (i30 + i32));
            str6 = strUd;
        }
        if (Integer.parseInt(str6) != 0) {
            iIndexOf4 = 1;
        } else {
            sb = sb.append(strLastIndexOf);
            iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
        }
        int i62 = (iIndexOf4 * 3) % iIndexOf4;
        int iXd6 = OY.Xd() ^ (82223071 ^ 13473613);
        if (i62 != 0) {
            short sXd4 = (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831073865)));
            int[] iArr3 = new int["2'G\u001c\u0017~be".length()];
            QB qb3 = new QB("2'G\u001c\u0017~be");
            int i63 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i63] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i63));
                i63++;
            }
            strVd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd6, new String(iArr3, 0, i63));
        } else {
            strVd = Wg.vd("A@AN{qs\u0006ad71", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1210214141 ^ (-1014197582)))));
        }
        if (Integer.parseInt(strUd) != 0) {
            str7 = strUd;
            i55 = 1;
            i33 = 1;
            i34 = 1;
            c14 = '\f';
        } else {
            i33 = (1995142812 ^ 162885859) ^ 2136868607;
            i34 = 4;
            str7 = strQd;
        }
        if (c14 != 0) {
            i33 += i34 << i55;
            str7 = strUd;
        }
        if (Integer.parseInt(str7) != 0) {
            c9 = 7;
        } else {
            i33 /= 32;
            str7 = strQd;
            c9 = 6;
        }
        if (c9 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.indexOf(strVd, i33));
            str7 = strUd;
        }
        if (Integer.parseInt(str7) != 0) {
            iXd3 = 8;
            string = null;
        } else {
            string = this.body.toString();
            str7 = strQd;
            iXd3 = C1607wl.Xd() ^ 1849955280;
        }
        if (iXd3 != 0) {
            printStream.println(sb.append(string).toString());
            str7 = strUd;
        }
        if (Integer.parseInt(str7) != 0) {
            communicationManager = null;
            coreCardImp2 = null;
        } else {
            communicationManager = CommunicationHelper.getInstance().getCommunicationManager();
            coreCardImp2 = this;
        }
        coreCardImp2.f18340b = communicationManager;
        CommunicationManager communicationManager4 = this.f18340b;
        if (communicationManager4 == null) {
            int iIndexOf9 = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf9 * 4) % iIndexOf9 == 0) {
                short sXd5 = (short) (Od.Xd() ^ (C1633zX.Xd() ^ (31009543 ^ 1971869242)));
                short sXd6 = (short) (Od.Xd() ^ (21999078 ^ (-22016292)));
                int[] iArr4 = new int["b\u0005\u0010I\u0006\n\b\fs\u000b\u0004uw\u0001kih-cjupcj]_\u001boe5hcjh".length()];
                QB qb4 = new QB("b\u0005\u0010I\u0006\n\b\fs\u000b\u0004uw\u0001kih-cjupcj]_\u001boe5hcjh");
                int i64 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i64] = xuXd4.fK(((sXd5 + i64) + xuXd4.CK(iKK4)) - sXd6);
                    i64++;
                }
                strLastIndexOf2 = new String(iArr4, 0, i64);
            } else {
                strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1846043763 ^ 384417540) ^ 2028067585, hg.Vd("X\t\u000e ! \u001c\u0010\t\u0004}\u007f\u0018\u0012", (short) (Od.Xd() ^ (1101102876 ^ (-1101084813))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849982032)))));
            }
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf2, i52));
        }
        if (Integer.parseInt(strUd) != 0) {
            str8 = strUd;
            coreCardImp3 = null;
        } else {
            communicationManager4.setEnableRequestWithSSLPinning(true);
            coreCardImp3 = this;
            i56 = 4;
            str8 = strQd;
        }
        if (i56 != 0) {
            coreCardImp3.f18340b.isResponseEncrypted(true);
            str8 = strUd;
            i35 = 0;
        } else {
            i35 = i56 + 4;
        }
        if (Integer.parseInt(str8) != 0) {
            i36 = i35 + 12;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18340b;
            i36 = i35 + 6;
            str8 = strQd;
        }
        if (i36 != 0) {
            communicationManager2.disableSecureRequest(false);
            communicationManager2 = this.f18340b;
            str8 = strUd;
            i37 = 0;
        } else {
            i37 = i36 + 15;
        }
        if (Integer.parseInt(str8) != 0) {
            i38 = i37 + 8;
            coreCardImp4 = null;
        } else {
            communicationManager2.addSessionIdInEncryptedData(true);
            i38 = i37 + 11;
            coreCardImp4 = this;
            str8 = strQd;
        }
        if (i38 != 0) {
            coreCardImp4.f18340b.setCallback(this);
            str8 = strUd;
            i39 = 0;
        } else {
            i39 = i38 + 9;
        }
        if (Integer.parseInt(str8) != 0) {
            i40 = i39 + 13;
            i41 = 0;
            communicationManager3 = null;
        } else {
            communicationManager3 = this.f18340b;
            i40 = i39 + 3;
            i41 = 1;
            str8 = strQd;
        }
        if (i40 != 0) {
            sbAppend = new StringBuilder();
            str8 = strUd;
            i42 = 0;
        } else {
            i42 = i40 + 12;
            sbAppend = null;
            i41 = 1;
        }
        if (Integer.parseInt(str8) != 0) {
            i43 = i42 + 14;
        } else {
            sbAppend = sbAppend.append(transactionsModel.getApi());
            i43 = i42 + 7;
        }
        if (i43 != 0) {
            iIndexOf5 = BuildConfig.AnonymousClass1.indexOf();
            i44 = 4;
        } else {
            iIndexOf5 = 1;
            i44 = 1;
        }
        String strUd3 = (i44 * iIndexOf5) % iIndexOf5 == 0 ? C1561oA.ud("@ukyl@wyfD|m`{ecvY_^k", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1966547944 ^ 1186800090)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd6, C1561oA.yd("\u007f\u001fa`XZRXu", (short) (ZN.Xd() ^ (1762852930 ^ 1762859605))));
        if (Integer.parseInt(strUd) != 0) {
            str9 = strUd;
            c12 = 6;
            i50 = 1;
            i45 = 1;
        } else {
            i45 = 294;
            str9 = strQd;
        }
        if (c12 != 0) {
            i50 = i50 + i50 + i50;
            str9 = strUd;
        }
        if (Integer.parseInt(str9) != 0) {
            c17 = 6;
            strQd = str9;
            i58 = 0;
        } else {
            i45 += i50;
            i54 = 21;
        }
        if (c17 != 0) {
            i51 = i54 + i58 + i54;
        } else {
            strUd = strQd;
        }
        if (Integer.parseInt(strUd) == 0) {
            strUd3 = BuildConfig.AnonymousClass1.indexOf(strUd3, i45 / i51);
            c11 = 7;
        }
        if (c11 != 0) {
            string2 = sbAppend.append(strUd3).toString();
            headers = transactionsModel.getHeaders();
        } else {
            headers = null;
            string2 = null;
        }
        communicationManager3.consumeVsshService(i41, string2, headers, this.body);
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void cardAccountInfo(CardInformationModel cardInformationModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        Integer num;
        Integer num2;
        char c2;
        int iIndexOf;
        int i2;
        String strIndexOf;
        int i3;
        String strIndexOf2;
        int iXd;
        String strYd = C1561oA.Yd("|\u0001", (short) (ZN.Xd() ^ ((1345260335 ^ 1534177839) ^ 190749100)));
        int i4 = 0;
        String strQd = Xg.qd("\u0011", (short) (C1633zX.Xd() ^ (887737334 ^ (-887721329))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609519971))));
        int i5 = 1;
        if (coreCardCallback == null) {
            String str = f18338f;
            int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf2 * 4) % iIndexOf2 == 0) {
                strIndexOf2 = Jg.Wd(")H\u001fuaAW1\u0018R6\bgMuI++E'\u0003xNm[", (short) (C1633zX.Xd() ^ (1743294122 ^ (-1743321032))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831093549)));
            } else {
                strIndexOf2 = BuildConfig.AnonymousClass1.indexOf(ZO.xd("'4{\u0007\u0013\u0014v\u001aTO\"\f!\u0004\u0014D{\u0007]\u00074[xcoKmc\\`89\u0018ZlOm78", (short) (OY.Xd() ^ (Od.Xd() ^ 1207818198)), (short) (OY.Xd() ^ ((809181116 ^ 1667837446) ^ 1397903162))), 1678512494 ^ 1678512419);
            }
            int i6 = 13;
            if (Integer.parseInt(strQd) != 0) {
                iXd = C1499aX.Xd() ^ (-1134257942);
                strYd = strQd;
            } else {
                i5 = 39;
                iXd = 13;
            }
            if (iXd == 0) {
                strQd = strYd;
            }
            if (Integer.parseInt(strQd) != 0) {
                i6 = 0;
            } else {
                i5 += 6;
                i4 = 13;
            }
            VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strIndexOf2, i5 / (i4 + i6)));
            return;
        }
        this.callback = coreCardCallback;
        this.f18339a = coreCardCallback;
        if (cardInformationModel != null && ValidationsHelper.isValidCardInformationModel(cardInformationModel)) {
            a(cardInformationModel);
            return;
        }
        BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
        int i7 = 3;
        if (Integer.parseInt(strQd) != 0) {
            num = null;
            c2 = 4;
            num2 = null;
        } else {
            num = 0;
            num2 = VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE;
            c2 = 3;
        }
        if (c2 != 0) {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i2 = 5;
        } else {
            iIndexOf = 1;
            i2 = 1;
        }
        if ((i2 * iIndexOf) % iIndexOf == 0) {
            strIndexOf = C1626yg.Ud("1F{S7CIe#.=z&ujCU$\u007f\u0006\u0014\\", (short) (ZN.Xd() ^ (Od.Xd() ^ (2003877502 ^ 814568058))), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207810579)));
        } else {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(Ig.wd("\u2d29ᒧ", (short) (C1607wl.Xd() ^ (1011380690 ^ 1011363528))), C1633zX.Xd() ^ (652440632 ^ (-1387401300)));
        }
        if (Integer.parseInt(strQd) != 0) {
            i3 = 901908889 ^ 901908880;
            i7 = 1;
            strYd = strQd;
        } else {
            i5 = 108;
            i3 = 2;
        }
        if (i3 != 0) {
            i5 += i7 + i7;
            i4 = (1142069895 ^ 346415359) ^ 1354201716;
        } else {
            strQd = strYd;
        }
        if (Integer.parseInt(strQd) == 0) {
            i5 /= i4 + i4;
        }
        baseVsshCoreCallback.onCoreError(num, num2, BuildConfig.AnonymousClass1.indexOf(strIndexOf, i5));
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void cardAccountInfo(CardInformationModel cardInformationModel, LambdaSuccess<CardAccountInfoResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        int i2;
        int i3;
        int iXd;
        String str;
        int i4 = 0;
        String strOd = EO.Od("G", (short) (OY.Xd() ^ (Od.Xd() ^ 1207803017)));
        if (lambdaSuccess != null && lambdaSuccess2 != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(strOd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess2;
            }
            this.f18341c = lambdaSuccess;
            if (cardInformationModel != null && ValidationsHelper.isValidCardInformationModel(cardInformationModel)) {
                a(cardInformationModel);
                return;
            }
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(strOd) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf((iIndexOf * 5) % iIndexOf == 0 ? C1561oA.Qd("x\u001c\u0012\u0019\u001c\u001d\u0010R\u007f\u007f\u0015{\u0007|\u0014\u0001{>\u007fx\u0004t", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1388242644 ^ (-653248932))))) : BuildConfig.AnonymousClass1.indexOf(C1593ug.zd("\u0012\u0010U]V]SU\rVdd]eb\r]\u0010ZR*^+*Vb(\\cf/.b`rx'~{", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1564295884 ^ 1857494866))), (short) (C1607wl.Xd() ^ ((1053095558 ^ 907618943) ^ 148765045))), (1312692767 ^ 2021372832) ^ 910535107), (1207989030 ^ 1982641215) ^ 1043121948));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            return;
        }
        String str2 = f18338f;
        int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        String strIndexOf = (iIndexOf2 * 5) % iIndexOf2 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1561oA.od("<\f?7..90H,)(o(=?43$/.2/$+-,Y\u001el\u0018 pkng", (short) (C1499aX.Xd() ^ (1414609375 ^ (-1414606848)))), ZN.Xd() ^ (1353439490 ^ 1663166452)) : C1561oA.Kd("\u0005\u001c\u001f#-d\u0018,'d!%\u0018\u0018\"%%\u001fd)\u001f0,/(", (short) (FB.Xd() ^ (223811357 ^ 223833381)));
        if (Integer.parseInt(strOd) != 0) {
            iXd = C1580rY.Xd() ^ (1987752628 ^ (-1207150242));
            i2 = 1;
            i3 = 1;
            str = strOd;
        } else {
            i2 = 140;
            i3 = 3;
            iXd = 4;
            short sXd = (short) (Od.Xd() ^ ((325631678 ^ 1123397916) ^ (-1369251234)));
            short sXd2 = (short) (Od.Xd() ^ ((1698766713 ^ 120968834) ^ (-1651806545)));
            int[] iArr = new int["\u0014x".length()];
            QB qb = new QB("\u0014x");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(((i5 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i5++;
            }
            str = new String(iArr, 0, i5);
        }
        if (iXd != 0) {
            i2 += i3 + i3;
            i4 = (261718665 ^ 665083779) ^ 675142912;
        } else {
            strOd = str;
        }
        VsshLogger.logError(str2, BuildConfig.AnonymousClass1.indexOf(strIndexOf, i2 / (i4 + (Integer.parseInt(strOd) == 0 ? i4 + i4 : 1))));
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void getTransactions(TransactionsModel transactionsModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        Integer num;
        Integer num2;
        String str;
        int iXd;
        int i2;
        int i3;
        int iXd2;
        int i4;
        int i5;
        String strVd;
        int iXd3 = 13;
        String strXd = C1561oA.Xd("l", (short) (Od.Xd() ^ (1984124174 ^ (-1984116481))));
        int iXd4 = C1580rY.Xd() ^ (167035597 ^ (-947771096));
        String strVd2 = Wg.vd(Global.BLANK, (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951472541)));
        int iLastIndexOf = 1;
        if (coreCardCallback != null) {
            this.callback = coreCardCallback;
            this.f18339a = coreCardCallback;
            if (transactionsModel != null && ValidationsHelper.isValidTransactionModel(transactionsModel)) {
                a(transactionsModel);
                return;
            }
            BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
            int i6 = 0;
            if (Integer.parseInt(strVd2) != 0) {
                num = null;
                str = strVd2;
                num2 = null;
            } else {
                num = 0;
                num2 = VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE;
                iXd3 = FB.Xd() ^ (1532554156 ^ 79135888);
                str = strXd;
            }
            if (iXd3 != 0) {
                str = strVd2;
            }
            int i7 = Integer.parseInt(str) != 0 ? 1 : iXd4;
            int iXd5 = (ZN.Xd() ^ 864697872) + i7 + i7 + i7;
            if (Integer.parseInt(strVd2) != 0) {
                strXd = strVd2;
            } else {
                i6 = 16;
                iXd4 = FB.Xd() ^ 1609527088;
            }
            int i8 = i6;
            if (iXd4 != 0) {
                iXd5 /= i6 + (i8 + i6);
            } else {
                strVd2 = strXd;
            }
            if (Integer.parseInt(strVd2) != 0) {
                iXd = 1;
                i2 = 1;
            } else {
                iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
                iXd = C1580rY.Xd() ^ (-831067164);
                i2 = iLastIndexOf;
            }
            baseVsshCoreCallback.onCoreError(num, num2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd5, (iLastIndexOf * iXd) % i2 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1607wl.Xd() ^ (803239571 ^ 1101292819), C1561oA.ud(".76M;':\u000ek}\rR", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134232533)))) : C1561oA.yd("MXbQ(5,b$\u001c! '\u0015(\u00110>tq\u0001m", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (225119280 ^ (-1251385339)))))));
            return;
        }
        String str2 = f18338f;
        if (Integer.parseInt(strVd2) != 0) {
            iXd2 = 13;
            strXd = strVd2;
            i3 = 1;
            i4 = 1;
        } else {
            i3 = 1652160490 ^ 1652160311;
            iXd2 = C1499aX.Xd() ^ (-1134257941);
            i4 = iXd4;
        }
        if (iXd2 != 0) {
            i3 += i4 << 2;
        } else {
            strVd2 = strXd;
        }
        if (Integer.parseInt(strVd2) != 0) {
            i5 = 1;
        } else {
            i5 = 68;
            iXd3 = 2;
        }
        if (iXd3 != 0) {
            i3 /= i5;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i5 = iLastIndexOf;
        }
        if ((iLastIndexOf * iXd4) % i5 != 0) {
            int iXd6 = Od.Xd() ^ 1207803013;
            int iXd7 = FB.Xd() ^ 1609516417;
            short sXd = (short) (FB.Xd() ^ iXd6);
            short sXd2 = (short) (FB.Xd() ^ iXd7);
            int[] iArr = new int["b\u0004}\u0005".length()];
            QB qb = new QB("b\u0004}\u0005");
            int i9 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i9] = xuXd.fK(((sXd + i9) + xuXd.CK(iKK)) - sXd2);
                i9++;
            }
            strVd = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i9), ZN.Xd() ^ (2008055247 ^ 1144669041));
        } else {
            strVd = hg.Vd("\u0017,)+v<igd$~x}_g`7+m5%(\u001e'&", (short) (FB.Xd() ^ (751683168 ^ 751685705)), (short) (FB.Xd() ^ (648038137 ^ 648050466)));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i3, strVd));
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void getTransactions(TransactionsModel transactionsModel, LambdaSuccess<TransactionsResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        String strIndexOf;
        int iXd;
        String strWd;
        int i2;
        String strLastIndexOf;
        int i3 = 0;
        String strYd = C1561oA.Yd("\u0013", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1989535745 ^ 1193078863))));
        if (lambdaSuccess == null || lambdaSuccess2 == null || lambdaError == null) {
            String str = f18338f;
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 4) % iIndexOf == 0) {
                strIndexOf = ZO.xd("\u0007Z\u001ccl[N!_ZirAb\u0003S\u001b(9K\u001fXw\u0012\\", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (839218957 ^ (-1547772362)))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (214375032 ^ (-1652755210)))));
            } else {
                strIndexOf = BuildConfig.AnonymousClass1.indexOf(C1626yg.Ud("\t$ES&HaN0K}~1\u00164F\u001a\u0016+m#-3xK\u00188(Z-sB8CtE", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1437303892 ^ (-172265152)))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (1837159656 ^ 1544147371)))), OY.Xd() ^ 69929213);
            }
            int i4 = 2;
            char c2 = 4;
            if (Integer.parseInt(strYd) != 0) {
                iXd = 1;
                i2 = 1;
                strWd = strYd;
                i4 = 1;
            } else {
                iXd = Od.Xd() ^ (497828079 ^ 1515312250);
                strWd = Ig.wd(")\u007f", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609514666))));
                i2 = 4;
                c2 = 2;
            }
            if (c2 != 0) {
                iXd += i2 << i4;
                i3 = (1099392467 ^ 162553059) ^ 1211578684;
            } else {
                strYd = strWd;
            }
            if (Integer.parseInt(strYd) == 0) {
                iXd /= i3 << 2;
            }
            VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strIndexOf, iXd));
            return;
        }
        this.lambdaError = lambdaError;
        if (Integer.parseInt(strYd) == 0) {
            this.lambdaGenericResponse = lambdaSuccess2;
        }
        this.f18342d = lambdaSuccess;
        if (transactionsModel != null && ValidationsHelper.isValidTransactionModel(transactionsModel)) {
            a(transactionsModel);
            return;
        }
        CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
        if (Integer.parseInt(strYd) != 0) {
            coreErrorModelResponse = null;
        } else {
            coreErrorModelResponse.setHttpErrorCode(0);
        }
        coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
        int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        if ((iIndexOf2 * 5) % iIndexOf2 == 0) {
            strLastIndexOf = Xg.qd("Af^glod)XZqZg_xgd)lgtg", (short) (C1580rY.Xd() ^ ((221669083 ^ 468178666) ^ (-382829535))), (short) (C1580rY.Xd() ^ ((1883432451 ^ 2134770849) ^ (-259844972))));
        } else {
            int i5 = 1923876977 ^ 1923876938;
            int iXd2 = FB.Xd() ^ (-1609502666);
            short sXd = (short) (C1499aX.Xd() ^ ((1723121788 ^ 882556423) ^ (-1378767266)));
            short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
            int[] iArr = new int["eU~\u0015znlMCxU7".length()];
            QB qb = new QB("eU~\u0015znlMCxU7");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(xuXd.CK(iKK) - ((i6 * sXd2) ^ sXd));
                i6++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i5, new String(iArr, 0, i6));
        }
        coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, (1840375802 ^ 1554318344) ^ 823452663));
        this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void pay(PayModel payModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        Integer num;
        Integer num2;
        String str;
        int i2;
        int i3;
        int iXd;
        String strZd;
        int i4;
        int i5;
        int i6;
        int i7;
        int iXd2;
        String str2;
        char c2 = 6;
        int i8 = 0;
        int iXd3 = C1499aX.Xd() ^ (1411264802 ^ (-394614324));
        String strOd = EO.Od("y)", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849973477))));
        String strQd = C1561oA.Qd(Global.QUESTION, (short) (C1607wl.Xd() ^ ((1871062882 ^ 2117093569) ^ 297146077)));
        int iLastIndexOf = 1;
        if (coreCardCallback != null) {
            this.callback = coreCardCallback;
            this.f18339a = coreCardCallback;
            if (payModel != null && payModel.getAmount() != null) {
                a(payModel);
                return;
            }
            BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
            int i9 = 10;
            if (Integer.parseInt(strQd) != 0) {
                num = null;
                str = strQd;
                num2 = null;
            } else {
                num = 0;
                num2 = VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE;
                str = strOd;
                c2 = '\n';
            }
            if (c2 != 0) {
                str = strQd;
            }
            char c3 = 5;
            if (Integer.parseInt(str) != 0) {
                strOd = str;
                i3 = 5;
                c3 = 11;
                i2 = 5;
            } else {
                i2 = (1874796920 ^ 408780650) ^ 2011323933;
                i3 = iXd3;
            }
            if (c3 != 0) {
                i2 += i3 + i3;
            } else {
                strQd = strOd;
            }
            if (Integer.parseInt(strQd) != 0) {
                iXd = ZN.Xd() ^ 864698105;
                i9 = 1;
            } else {
                iXd = C1580rY.Xd() ^ (-831067162);
            }
            if (iXd != 0) {
                i2 /= i9;
                iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
                i9 = iLastIndexOf;
            }
            if ((iLastIndexOf * iXd3) % i9 != 0) {
                strZd = BuildConfig.AnonymousClass1.indexOf(C1561oA.Kd("$%&'()*;", (short) (C1580rY.Xd() ^ (736679390 ^ (-736686236)))), (1214207760 ^ 95108477) ^ 1307863628);
            } else {
                strZd = Wg.Zd("C0\u007f_\u0016%[Yt~?\f\u0006\u0001*V3:zC\u0018H", (short) (Od.Xd() ^ ((1193409578 ^ 1916578216) ^ (-891120756))), (short) (Od.Xd() ^ (OY.Xd() ^ (207618813 ^ (-139139333)))));
            }
            baseVsshCoreCallback.onCoreError(num, num2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, strZd));
            return;
        }
        String str3 = f18338f;
        if (Integer.parseInt(strQd) != 0) {
            strOd = strQd;
            i6 = 1;
            i5 = 1;
            i4 = 8;
        } else {
            i4 = 4;
            i5 = 253;
            i6 = 4;
        }
        if (i4 != 0) {
            i5 += i6 << 2;
        } else {
            i8 = i4 + 14;
            strQd = strOd;
        }
        if (Integer.parseInt(strQd) != 0) {
            i7 = i8 + 8;
            iXd2 = 1;
        } else {
            i7 = i8 + 6;
            iXd2 = ZN.Xd() ^ 864698028;
        }
        if (i7 != 0) {
            i5 /= iXd2;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd2 = iLastIndexOf;
        }
        if ((iLastIndexOf * 3) % iXd2 != 0) {
            int iXd4 = C1633zX.Xd() ^ 1951485094;
            short sXd = (short) (Od.Xd() ^ ((2058854273 ^ 2147314252) ^ (-88790572)));
            short sXd2 = (short) (Od.Xd() ^ iXd4);
            int[] iArr = new int["殲爗".length()];
            QB qb = new QB("殲爗");
            int i10 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i10] = xuXd.fK((xuXd.CK(iKK) - (sXd + i10)) - sXd2);
                i10++;
            }
            str2 = BuildConfig.AnonymousClass1.indexOf(new String(iArr, 0, i10), ZN.Xd() ^ (1839365592 ^ 1579696918));
        } else {
            short sXd3 = (short) (C1580rY.Xd() ^ ((1418036153 ^ 584523723) ^ (-1985142032)));
            int[] iArr2 = new int["/BA\u001b\u000fR\u007f}|:\u0017\r\u0014u}tOC\u00041=>4?<".length()];
            QB qb2 = new QB("/BA\u001b\u000fR\u007f}|:\u0017\r\u0014u}tOC\u00041=>4?<");
            int i11 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i11] = xuXd2.fK(sXd3 + sXd3 + i11 + xuXd2.CK(iKK2));
                i11++;
            }
            str2 = new String(iArr2, 0, i11);
        }
        VsshLogger.logError(str3, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i5, str2));
    }

    @Override // com.valid.vssh_android_core.card.CoreCard
    public void pay(PayModel payModel, LambdaSuccess<PayResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        String strUd;
        int i2;
        String strYd;
        int i3;
        String strLastIndexOf;
        int i4 = 0;
        String strXd = C1561oA.Xd("5", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (2132879261 ^ (-2064254634)))));
        if (lambdaSuccess != null && lambdaSuccess2 != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(strXd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess2;
            }
            this.f18343e = lambdaSuccess;
            if (payModel != null && payModel.getAmount() != null) {
                a(payModel);
                return;
            }
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(strXd) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 5) % iIndexOf == 0) {
                short sXd = (short) (OY.Xd() ^ ((1316122516 ^ 297204202) ^ 1606729245));
                int[] iArr = new int["Fkclila&]_v_d\\udI\u000eQLQD".length()];
                QB qb = new QB("Fkclila&]_v_d\\udI\u000eQLQD");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
                    i5++;
                }
                strLastIndexOf = new String(iArr, 0, i5);
            } else {
                strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1441456800 ^ 312239298) ^ 1198949926, Qg.kd("/J<@p97.h*pld`{ r(5h2[0%p\u0017(ZOU* \u001feY\u000e", (short) (OY.Xd() ^ (OY.Xd() ^ (666355130 ^ 597477627))), (short) (OY.Xd() ^ (FB.Xd() ^ 1609516735))));
            }
            coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, C1499aX.Xd() ^ (-1134257943)));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            return;
        }
        String str = f18338f;
        int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        if ((iIndexOf2 * 4) % iIndexOf2 != 0) {
            short sXd2 = (short) (Od.Xd() ^ (1429214485 ^ (-1429237583)));
            short sXd3 = (short) (Od.Xd() ^ ((1995420586 ^ 255337927) ^ (-2044173609)));
            int[] iArr2 = new int["5-0\u001a-22\u001a(&\u001f\u001a  W".length()];
            QB qb2 = new QB("5-0\u001a-22\u001a(&\u001f\u001a  W");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(sXd2 + i6 + xuXd2.CK(iKK2) + sXd3);
                i6++;
            }
            strUd = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i6), OY.Xd() ^ (256514444 ^ 190910780));
        } else {
            strUd = C1561oA.ud("\u0010'2(0g\u0011+&_ \u001a\r\u000b\u0017\u0012\u0010\bM\u000e\u0006\u0013\r\f\u0005", (short) (OY.Xd() ^ (OY.Xd() ^ 69953210)));
        }
        int i7 = 2065621953 ^ 2065621957;
        if (Integer.parseInt(strXd) != 0) {
            i2 = 1;
            i3 = 1;
            strYd = strXd;
        } else {
            i2 = (482361459 ^ 289788229) ^ 226857412;
            strYd = C1561oA.yd("NN", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609514933))));
            i3 = i7;
            i7 = 3;
        }
        if (i7 != 0) {
            i2 += i3 + i3;
            i4 = 64986630 ^ 64986640;
        } else {
            strXd = strYd;
        }
        if (Integer.parseInt(strXd) == 0) {
            i2 /= i4 + i4;
        }
        VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strUd, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0176  */
    @Override // com.valid.vssh_android_core.basecore.BaseVsshCore, com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void successEvent(com.valid.communication.events.BaseSuccessEvent r18) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valid.vssh_android_core.card.CoreCardImp.successEvent(com.valid.communication.events.BaseSuccessEvent):void");
    }
}
