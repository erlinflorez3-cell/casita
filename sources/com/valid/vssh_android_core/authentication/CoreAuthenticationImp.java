package com.valid.vssh_android_core.authentication;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.security.helpers.KeyHelper;
import com.valid.utils.VsshLogger;
import com.valid.vssh_android_core.BuildConfig;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseVsshCore;
import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.ClientHelloModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.LoginModel;
import com.valid.vssh_android_core.model.RecoveryModel;
import com.valid.vssh_android_core.model.RegisterModel;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.utils.CoreSecurityHelper;
import com.valid.vssh_android_core.utils.EncodeHelper;
import com.valid.vssh_android_core.utils.ValidationsHelper;
import com.valid.vssh_android_core.utils.VsshCoreConstants;
import java.io.IOException;
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
public class CoreAuthenticationImp extends BaseVsshCore implements CoreAuthentication {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18332e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoreAuthenticationCallback f18333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoreSecurityHelper f18334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CommunicationManager f18335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LambdaSuccess<ClientHelloModelResponse> f18336d;

    public class Exception extends RuntimeException {
    }

    static {
        short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (-1609526250)));
        int[] iArr = new int["d\u0012\u0016\nf\u001c\u001c\u0011\u000f\u0019 \u0016\u0011\u0010$\u001a!!|\"&".length()];
        QB qb = new QB("d\u0012\u0016\nf\u001c\u001c\u0011\u000f\u0019 \u0016\u0011\u0010$\u001a!!|\"&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        f18332e = new String(iArr, 0, i2);
    }

    public final void a(ClientHelloModel clientHelloModel) throws Throwable {
        int i2;
        String str;
        int i3;
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
        int iLastIndexOf;
        String strLastIndexOf;
        String str2;
        char c2;
        Map<String, Object> map;
        int i17;
        int i18;
        char c3;
        char c4;
        String strUd;
        String str3;
        char c5;
        Map<String, Object> map2;
        int i19;
        char c6;
        char c7;
        String strYd;
        int iXd;
        String str4;
        int iXd2;
        int i20;
        int i21;
        int i22;
        int i23;
        int iLastIndexOf2;
        String str5;
        int i24;
        int iXd3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int iXd4;
        int i33;
        int iLastIndexOf3;
        String strUd2;
        CoreAuthenticationImp coreAuthenticationImp;
        String str6;
        char c8;
        Map<String, Object> map3;
        int i34;
        char c9;
        int i35;
        int i36;
        int i37;
        int i38;
        char c10;
        String fingerPrint;
        char c11;
        String str7;
        CoreAuthenticationImp coreAuthenticationImp2;
        Map<String, Object> map4;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int iLastIndexOf4;
        String str8;
        int i49;
        int i50;
        Map<String, Object> map5;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int iLastIndexOf5;
        String strLastIndexOf2;
        String str9;
        char c12;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int iLastIndexOf6;
        int i64;
        String str10;
        CoreAuthenticationImp coreAuthenticationImp3;
        String str11;
        int i65;
        Map<String, Object> map6;
        int iXd5;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        String str12;
        int i71;
        int i72;
        int i73;
        char c13;
        int i74;
        int iXd6;
        int iLastIndexOf7;
        int i75;
        String str13;
        CoreAuthenticationImp coreAuthenticationImp4;
        String str14;
        Map<String, Object> map7;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int iLastIndexOf8;
        CoreAuthenticationImp coreAuthenticationImp5;
        String str15;
        int i81;
        CommunicationManager communicationManager;
        int i82;
        int i83;
        int i84;
        int i85;
        CoreAuthenticationImp coreAuthenticationImp6;
        int i86;
        CommunicationManager communicationManager2;
        int i87;
        int i88;
        int i89;
        StringBuilder sbAppend;
        int i90;
        int iXd7;
        int i91;
        int i92;
        int i93;
        int i94;
        int i95;
        int i96;
        int i97;
        int i98;
        String string;
        Map<String, String> headers;
        HashMap map8 = new HashMap();
        String strZd = Wg.Zd(ExifInterface.GPS_MEASUREMENT_3D, (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (2077931443 ^ 260809412))), (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1780210293 ^ (-1848695571)))));
        int i99 = Integer.parseInt(strZd);
        int i100 = 4;
        int i101 = (153395353 ^ 1122330506) ^ 1270990619;
        String strXd = C1561oA.Xd(";<", (short) (C1607wl.Xd() ^ (1027353999 ^ 1027360068)));
        if (i99 != 0) {
            str = strZd;
            i2 = 4;
            map8 = null;
        } else {
            this.body = map8;
            i2 = i101;
            str = strXd;
        }
        if (i2 != 0) {
            str = strZd;
            i4 = 11;
            i5 = 11;
            i6 = 11;
            i3 = 0;
        } else {
            i3 = i2 + 6;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int iLastIndexOf9 = 1;
        if (Integer.parseInt(str) != 0) {
            i8 = i3 + 13;
            i7 = 1;
            i6 = 0;
        } else {
            i7 = i4 + i5;
            i8 = i3 + 6;
            str = strXd;
        }
        int iXd8 = ZN.Xd() ^ (653608638 ^ 360675404);
        if (i8 != 0) {
            i7 += i6 << 2;
            str = strZd;
            i9 = 0;
        } else {
            i9 = i8 + 12;
        }
        int iXd9 = 14;
        if (Integer.parseInt(str) != 0) {
            i10 = i9 + 13;
            i11 = 1;
        } else {
            i10 = i9 + 14;
            str = strXd;
            i11 = 6;
        }
        char c14 = 7;
        if (i10 != 0) {
            i7 += i11;
            str = strZd;
            i13 = 11;
            i14 = 11;
            i12 = 0;
        } else {
            i12 = i10 + 7;
            i13 = 0;
            i14 = 0;
        }
        if (Integer.parseInt(str) != 0) {
            i16 = i12 + i101;
            i15 = 1;
        } else {
            i15 = i13 + i14 + i13;
            i16 = i12 + iXd8;
        }
        if (i16 != 0) {
            i7 /= i15;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i15 = iLastIndexOf;
        } else {
            iLastIndexOf = 1;
        }
        int iXd10 = Od.Xd() ^ 1207800912;
        if ((iLastIndexOf * iXd10) % i15 == 0) {
            short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1797700184 ^ (-90356436))));
            int[] iArr = new int["CLJ\b\u0003\u0005\u0003\u0010zx\u007f`\u0005ov".length()];
            QB qb = new QB("CLJ\b\u0003\u0005\u0003\u0010zx\u007f`\u0005ov");
            int i102 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i102] = xuXd.fK((sXd ^ i102) + xuXd.CK(iKK));
                i102++;
            }
            strLastIndexOf = new String(iArr, 0, i102);
        } else {
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1607wl.Xd() ^ 1849955210, Qg.kd("\u001aM}E<\u001a\u0004z|Rx|", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207809238))), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69933632)))));
        }
        String strLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i7, strLastIndexOf);
        if (Integer.parseInt(strZd) != 0) {
            str2 = strZd;
            c2 = 14;
        } else {
            map8.put(strLastIndexOf3, clientHelloModel.getApplicationCode());
            str2 = strXd;
            c2 = 11;
        }
        if (c2 != 0) {
            map = this.body;
            str2 = strZd;
        } else {
            map = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i17 = 1;
            i18 = 15;
        } else {
            i17 = 198;
            str2 = strXd;
            i18 = iXd8;
        }
        if (i18 != 0) {
            str2 = strZd;
        }
        int i103 = 3;
        if (Integer.parseInt(str2) != 0) {
            c3 = 14;
        } else {
            i17 += 12;
            str2 = strXd;
            c3 = 3;
        }
        if (c3 != 0) {
            str2 = strZd;
        }
        if (Integer.parseInt(str2) != 0) {
            c4 = 6;
        } else {
            i17 /= 66;
            c4 = 15;
        }
        int iLastIndexOf10 = c4 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        if ((iLastIndexOf10 * 3) % iLastIndexOf10 != 0) {
            int i104 = (1025139711 ^ 1838839542) ^ 1350571322;
            int iXd11 = C1499aX.Xd() ^ (-1134242289);
            short sXd2 = (short) (C1607wl.Xd() ^ ((1038736194 ^ 438155887) ^ 670321798));
            short sXd3 = (short) (C1607wl.Xd() ^ iXd11);
            int[] iArr2 = new int["\u001bma9\u0001Y\u0005\u007fo3\b\u0010j{-4:\u0018\u0007CG\u001co%(8\"&".length()];
            QB qb2 = new QB("\u001bma9\u0001Y\u0005\u007fo3\b\u0010j{-4:\u0018\u0007CG\u001co%(8\"&");
            int i105 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i105] = xuXd2.fK(sXd2 + i105 + xuXd2.CK(iKK2) + sXd3);
                i105++;
            }
            strUd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i104, new String(iArr2, 0, i105));
        } else {
            strUd = C1561oA.ud("mxrh-/)0%#(\u0005*", (short) (FB.Xd() ^ ((457151766 ^ 183779230) ^ 298551518)));
        }
        String strLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i17, strUd);
        if (Integer.parseInt(strZd) != 0) {
            str3 = strZd;
            c5 = 7;
        } else {
            map.put(strLastIndexOf4, clientHelloModel.getApplicationId());
            str3 = strXd;
            c5 = 11;
        }
        if (c5 != 0) {
            map2 = this.body;
            str3 = strZd;
        } else {
            map2 = null;
        }
        if (Integer.parseInt(str3) != 0) {
            i19 = 1;
            c6 = '\r';
        } else {
            i19 = 60;
            str3 = strXd;
            c6 = '\f';
        }
        if (c6 != 0) {
            str3 = strZd;
        }
        if (Integer.parseInt(str3) == 0) {
            i19 += 12;
        }
        if (Integer.parseInt(strZd) != 0) {
            c7 = 11;
        } else {
            i19 /= 45;
            c7 = '\f';
        }
        int iLastIndexOf11 = c7 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        if ((iLastIndexOf11 * iXd10) % iLastIndexOf11 != 0) {
            short sXd4 = (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (427140287 ^ (-1525610872))));
            int[] iArr3 = new int["ZWkRbVsrcMfca".length()];
            QB qb3 = new QB("ZWkRbVsrcMfca");
            int i106 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i106] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i106));
                i106++;
            }
            strYd = BuildConfig.AnonymousClass1.indexOf(new String(iArr3, 0, i106), Od.Xd() ^ (1626106211 ^ 655490327));
        } else {
            strYd = C1561oA.Yd("\u001c)%dckctcgnӌozqi27", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (2065934260 ^ (-259173137)))));
        }
        String strLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i19, strYd);
        if (Integer.parseInt(strZd) == 0) {
            map2.put(strLastIndexOf5, clientHelloModel.getApplicationVersion());
        }
        Map<String, Object> map9 = this.body;
        if (Integer.parseInt(strZd) != 0) {
            str4 = strZd;
            iXd2 = 4;
            iXd = 1;
        } else {
            iXd = ZN.Xd() ^ 864697983;
            str4 = strXd;
            iXd2 = C1633zX.Xd() ^ (195051077 ^ (-2146523772));
        }
        if (iXd2 != 0) {
            str4 = strZd;
            i21 = 4;
            i20 = 0;
        } else {
            i20 = iXd2 + 14;
            i21 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i22 = i20 + iXd10;
        } else {
            iXd += i21 + i21 + i21;
            i22 = i20 + iXd8;
            str4 = strXd;
        }
        int i107 = 44;
        if (i22 != 0) {
            str4 = strZd;
            i23 = 44;
        } else {
            i23 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            iLastIndexOf2 = 1;
        } else {
            iXd /= i23;
            iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i23 = iLastIndexOf2;
        }
        String strLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd, (iLastIndexOf2 * 4) % i23 == 0 ? Xg.qd("\\SVa)(3\u000f6+2", (short) (OY.Xd() ^ (ZN.Xd() ^ (758344510 ^ 515462892))), (short) (OY.Xd() ^ (Od.Xd() ^ 1207800552))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1580rY.Xd() ^ (1200852946 ^ (-1981455346)), Jg.Wd("\tzWLi\u001a\u00156lNz}+Y;", (short) (ZN.Xd() ^ (454525291 ^ 454529194)), (short) (ZN.Xd() ^ (ZN.Xd() ^ (1672827092 ^ 1346308852))))));
        if (Integer.parseInt(strZd) != 0) {
            str5 = strZd;
            i24 = i101;
            iXd3 = 0;
            i25 = 0;
            i26 = 0;
        } else {
            str5 = strXd;
            i24 = 3;
            iXd3 = C1607wl.Xd() ^ (226820835 ^ 1673597235);
            i25 = 86399608 ^ 86399602;
            i26 = 10;
        }
        if (i24 != 0) {
            i28 = iXd3 + i25;
            str5 = strZd;
            i27 = 0;
        } else {
            i27 = i24 + 14;
            i28 = 1;
            i26 = 0;
        }
        if (Integer.parseInt(str5) != 0) {
            i29 = i27 + 4;
        } else {
            i28 += i26 << 2;
            i29 = i27 + i101;
            str5 = strXd;
        }
        if (i29 != 0) {
            str5 = strZd;
            i31 = 4;
            i30 = 0;
        } else {
            i30 = i29 + i101;
            i31 = 1;
        }
        if (Integer.parseInt(str5) != 0) {
            i32 = i30 + 15;
            iXd4 = 0;
            i33 = 0;
        } else {
            i28 += i31;
            i32 = i30 + 6;
            iXd4 = C1607wl.Xd() ^ 1849955280;
            i33 = (408396780 ^ 1939563057) ^ 1808581079;
        }
        if (i32 != 0) {
            i28 /= iXd4 + i33;
            iLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        } else {
            iLastIndexOf3 = 1;
        }
        if ((iLastIndexOf3 * 3) % iLastIndexOf3 != 0) {
            int i108 = (2032142270 ^ 745614562) ^ 1431382799;
            short sXd5 = (short) (ZN.Xd() ^ (190886619 ^ 190889334));
            short sXd6 = (short) (ZN.Xd() ^ ((133804051 ^ 1675295118) ^ 1680036431));
            int[] iArr4 = new int["y\u0013llG/i\u000fuWS\b{\u0003\u0012!ck\u0003q\u0007Bc,tq=8$HRi\u001f|b#?\\\u0013".length()];
            QB qb4 = new QB("y\u0013llG/i\u000fuWS\b{\u0003\u0012!ck\u0003q\u0007Bc,tq=8$HRi\u001f|b#?\\\u0013");
            int i109 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i109] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i109 % C1561oA.Xd.length] ^ ((i109 * sXd6) + sXd5)));
                i109++;
            }
            strUd2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i108, new String(iArr4, 0, i109));
        } else {
            strUd2 = C1626yg.Ud("V\u0016\u0019\u001b\u000fg", (short) (C1607wl.Xd() ^ (1603677772 ^ 1603675817)), (short) (C1607wl.Xd() ^ ((434299781 ^ 539355991) ^ 969357108)));
        }
        String strLastIndexOf7 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i28, strUd2);
        if (Integer.parseInt(strZd) != 0) {
            str6 = strZd;
            c8 = 7;
            coreAuthenticationImp = null;
        } else {
            map9.put(strLastIndexOf6, strLastIndexOf7);
            coreAuthenticationImp = this;
            str6 = strXd;
            c8 = '\r';
        }
        if (c8 != 0) {
            map3 = coreAuthenticationImp.body;
            str6 = strZd;
        } else {
            map3 = null;
        }
        int i110 = 24;
        if (Integer.parseInt(str6) != 0) {
            i34 = 1;
            c9 = '\r';
        } else {
            str6 = strXd;
            i34 = 24;
            c9 = 14;
        }
        if (c9 != 0) {
            i34 += i34 + i34;
            str6 = strZd;
        }
        if (Integer.parseInt(str6) != 0) {
            i36 = 1;
            i35 = 1;
            i37 = 1;
            i38 = 15;
        } else {
            i35 = 12 + i34;
            i36 = 4;
            i37 = 4;
            i38 = i101;
            str6 = strXd;
        }
        if (i38 != 0) {
            i35 += i36 + i37;
            str6 = strZd;
        }
        if (Integer.parseInt(str6) != 0) {
            c10 = 11;
        } else {
            i35 /= 24;
            c10 = 7;
        }
        int iLastIndexOf12 = c10 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        String strLastIndexOf8 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i35, (iLastIndexOf12 * 4) % iLastIndexOf12 == 0 ? Ig.wd("\u0019mC\u001eDiv/", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1910622709 ^ (-846911114))))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf((289024699 ^ 935447677) ^ 654042758, EO.Od("\u007fW.H\u0006L?^/NMk9!8X+\u000e\u0007", (short) (ZN.Xd() ^ ((706316122 ^ 1612856200) ^ 1245425679)))));
        if (Integer.parseInt(strZd) != 0) {
            str7 = strZd;
            c11 = '\f';
            fingerPrint = null;
        } else {
            fingerPrint = KeyHelper.getFingerPrint(clientHelloModel.getContext());
            c11 = 4;
            str7 = strXd;
        }
        if (c11 != 0) {
            map3.put(strLastIndexOf8, fingerPrint);
            coreAuthenticationImp2 = this;
            str7 = strZd;
        } else {
            coreAuthenticationImp2 = null;
        }
        if (Integer.parseInt(str7) != 0) {
            i41 = iXd10;
            map4 = null;
            i39 = 0;
            i40 = 0;
        } else {
            map4 = coreAuthenticationImp2.body;
            i39 = i101;
            i40 = i39;
            str7 = strXd;
            i41 = 71848214 ^ 71848220;
        }
        if (i41 != 0) {
            i43 = i39 + (i40 << 2);
            str7 = strZd;
            i42 = 0;
        } else {
            i42 = i41 + i101;
            i43 = 1;
        }
        if (Integer.parseInt(str7) != 0) {
            i44 = i42 + i101;
            i45 = 1;
        } else {
            i44 = i42 + 4;
            str7 = strXd;
            i45 = 366517114 ^ 366517116;
        }
        if (i44 != 0) {
            i43 += i45;
            str7 = strZd;
            i45 = iXd10;
            i47 = i45;
            i46 = 0;
        } else {
            i46 = i44 + 4;
            i47 = 1;
        }
        if (Integer.parseInt(str7) != 0) {
            i48 = i46 + 13;
        } else {
            i45 = i45 + i47 + i47;
            i48 = i46 + 12;
        }
        if (i48 != 0) {
            i43 /= i45;
            iLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i45 = iLastIndexOf4;
        } else {
            iLastIndexOf4 = 1;
        }
        String strLastIndexOf9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i43, (iLastIndexOf4 * 3) % i45 == 0 ? C1561oA.Qd("QX:a\u0012\u0019", (short) (Od.Xd() ^ (OY.Xd() ^ (-69946729)))) : BuildConfig.AnonymousClass1.indexOf(C1593ug.zd("\u0011$l?D\u001cqz", (short) (Od.Xd() ^ ((1865915331 ^ 1506211776) ^ (-921793277))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951484198))), i101));
        if (Integer.parseInt(strZd) != 0) {
            str8 = strZd;
            i49 = i101;
        } else {
            map4.put(strLastIndexOf9, clientHelloModel.getIdType());
            str8 = strXd;
            i49 = (1644703883 ^ 758605450) ^ 1329550855;
        }
        if (i49 != 0) {
            map5 = this.body;
            str8 = strZd;
            i50 = 0;
        } else {
            i50 = i49 + 11;
            map5 = null;
        }
        if (Integer.parseInt(str8) != 0) {
            i51 = i50 + 4;
            i52 = 0;
            i53 = 0;
            i54 = 0;
        } else {
            i51 = i50 + 12;
            str8 = strXd;
            i52 = 12;
            i53 = 12;
            i54 = 12;
        }
        if (i51 != 0) {
            i56 = i52 + i53 + i54;
            str8 = strZd;
            i57 = 3;
            i55 = 0;
        } else {
            i55 = i51 + 15;
            i56 = 1;
            i57 = 1;
        }
        if (Integer.parseInt(str8) != 0) {
            i58 = i55 + 13;
        } else {
            i56 += i57 + i57;
            i58 = i55 + i101;
            str8 = strXd;
        }
        if (i58 != 0) {
            str8 = strZd;
        } else {
            i110 = 1;
        }
        if (Integer.parseInt(str8) != 0) {
            iLastIndexOf5 = 1;
        } else {
            i56 /= i110;
            iLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i110 = iLastIndexOf5;
        }
        if ((iLastIndexOf5 * iXd10) % i110 == 0) {
            strLastIndexOf2 = C1561oA.od("i\u0002\\+,3", (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1017311617 ^ 1666034181))));
        } else {
            int i111 = 74159005 ^ 74158989;
            short sXd7 = (short) (ZN.Xd() ^ (1894483320 ^ 1894513470));
            int[] iArr5 = new int["Lpo^bg3#*()".length()];
            QB qb5 = new QB("Lpo^bg3#*()");
            int i112 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i112] = xuXd5.fK(xuXd5.CK(iKK5) - ((sXd7 + sXd7) + i112));
                i112++;
            }
            strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i111, new String(iArr5, 0, i112));
        }
        String strLastIndexOf10 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i56, strLastIndexOf2);
        int i113 = 9;
        if (Integer.parseInt(strZd) != 0) {
            str9 = strZd;
            c12 = '\t';
            i59 = 0;
            i60 = 0;
            i61 = 0;
        } else {
            str9 = strXd;
            c12 = 7;
            i59 = 7;
            i60 = 7;
            i61 = 7;
        }
        if (c12 != 0) {
            i62 = i59 + i60 + i61;
            str9 = strZd;
        } else {
            i62 = 1;
        }
        if (Integer.parseInt(str9) != 0) {
            i63 = i101;
        } else {
            i62 += 4;
            str9 = strXd;
            i63 = 13;
        }
        if (i63 != 0) {
            str9 = strZd;
        }
        if (Integer.parseInt(str9) != 0) {
            iLastIndexOf6 = 1;
            i64 = 14;
        } else {
            i62 /= 14;
            iLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i64 = iLastIndexOf6;
        }
        if ((iLastIndexOf6 * 4) % i64 != 0) {
            short sXd8 = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831062234)));
            short sXd9 = (short) (OY.Xd() ^ ((856529198 ^ 524058938) ^ 741433527));
            int[] iArr6 = new int["믷熱".length()];
            QB qb6 = new QB("믷熱");
            int i114 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i114] = xuXd6.fK(((i114 * sXd9) ^ sXd8) + xuXd6.CK(iKK6));
                i114++;
            }
            str10 = BuildConfig.AnonymousClass1.indexOf(new String(iArr6, 0, i114), Od.Xd() ^ (1599241673 ^ 414181818));
        } else {
            short sXd10 = (short) (C1499aX.Xd() ^ ((942408808 ^ 2086729235) ^ (-1145889149)));
            int[] iArr7 = new int["JEG\r\u0018 \u000f".length()];
            QB qb7 = new QB("JEG\r\u0018 \u000f");
            int i115 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr7[i115] = xuXd7.fK(xuXd7.CK(iKK7) - (sXd10 + i115));
                i115++;
            }
            str10 = new String(iArr7, 0, i115);
        }
        String strLastIndexOf11 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i62, str10);
        if (Integer.parseInt(strZd) != 0) {
            str11 = strZd;
            i65 = (1153504756 ^ 1941499257) ^ 930740354;
            coreAuthenticationImp3 = null;
        } else {
            map5.put(strLastIndexOf10, strLastIndexOf11);
            coreAuthenticationImp3 = this;
            str11 = strXd;
            i65 = iXd8;
        }
        if (i65 != 0) {
            map6 = coreAuthenticationImp3.body;
            str11 = strZd;
        } else {
            map6 = null;
        }
        if (Integer.parseInt(str11) != 0) {
            i107 = 1;
            iXd5 = 0;
            i66 = (1666063738 ^ 579743436) ^ 1103115196;
        } else {
            iXd5 = C1633zX.Xd() ^ (1080418695 ^ (-875857318));
            str11 = strXd;
            i66 = 12;
        }
        if (i66 != 0) {
            i67 = iXd5 << iXd8;
            str11 = strZd;
        } else {
            i67 = 1;
        }
        if (Integer.parseInt(str11) != 0) {
            i100 = i67;
            i68 = 1;
            i69 = 13;
        } else {
            i107 += i67;
            i68 = 4;
            str11 = strXd;
            i69 = (714109418 ^ 839637529) ^ 412855285;
        }
        if (i69 != 0) {
            i107 += i100 + i68;
            str11 = strZd;
        }
        if (Integer.parseInt(str11) != 0) {
            i70 = 12;
        } else {
            i107 /= 44;
            i70 = i101;
        }
        int iLastIndexOf13 = i70 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf() : 1;
        String strLastIndexOf12 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i107, (iLastIndexOf13 * iXd10) % iLastIndexOf13 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1131463185 ^ 705961094) ^ 1768218364, Wg.vd("苍襋", (short) (C1580rY.Xd() ^ ((1815667516 ^ 1984870544) ^ (-443947568))))) : Qg.kd("\u0015\u0006\u0005kR7468;", (short) (C1580rY.Xd() ^ ((2102265298 ^ 1471088461) ^ (-719409410))), (short) (C1580rY.Xd() ^ ((1728824218 ^ 492657317) ^ (-2052504347)))));
        int i116 = 17;
        if (Integer.parseInt(strZd) != 0) {
            str12 = strZd;
            c13 = 11;
            i71 = 0;
            i72 = 0;
            i73 = 0;
        } else {
            str12 = strXd;
            i71 = 17;
            i72 = 17;
            i73 = 17;
            c13 = '\r';
        }
        if (c13 != 0) {
            i74 = i71 + i72 + i73;
            str12 = strZd;
        } else {
            i74 = 1;
        }
        if (Integer.parseInt(str12) != 0) {
            iXd6 = 11;
        } else {
            i74 += 6;
            str12 = strXd;
            iXd6 = ZN.Xd() ^ 864698111;
        }
        if (iXd6 != 0) {
            str12 = strZd;
        }
        if (Integer.parseInt(str12) != 0) {
            i75 = 34;
            iLastIndexOf7 = 1;
        } else {
            i74 /= 34;
            iLastIndexOf7 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i75 = iLastIndexOf7;
        }
        if ((iLastIndexOf7 * iXd8) % i75 != 0) {
            str13 = BuildConfig.AnonymousClass1.indexOf(hg.Vd("ofsvoVc~", (short) (C1633zX.Xd() ^ (1106204854 ^ (-1106207877))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1278603982 ^ (-333099286))))), 1249436980 ^ 1249437010);
        } else {
            short sXd11 = (short) (OY.Xd() ^ ((1301701893 ^ 40617875) ^ 1342027983));
            int[] iArr8 = new int["hNY\u0017\u000e".length()];
            QB qb8 = new QB("hNY\u0017\u000e");
            int i117 = 0;
            while (qb8.YK()) {
                int iKK8 = qb8.KK();
                Xu xuXd8 = Xu.Xd(iKK8);
                iArr8[i117] = xuXd8.fK(sXd11 + i117 + xuXd8.CK(iKK8));
                i117++;
            }
            str13 = new String(iArr8, 0, i117);
        }
        String strLastIndexOf13 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i74, str13);
        if (Integer.parseInt(strZd) != 0) {
            str14 = strZd;
            coreAuthenticationImp4 = null;
        } else {
            map6.put(strLastIndexOf12, strLastIndexOf13);
            coreAuthenticationImp4 = this;
            str14 = strXd;
            c14 = '\r';
        }
        if (c14 != 0) {
            map7 = coreAuthenticationImp4.body;
            str14 = strZd;
        } else {
            map7 = null;
        }
        if (Integer.parseInt(str14) != 0) {
            i76 = 1;
            i77 = 1;
        } else {
            i76 = 136;
            str14 = strXd;
            i77 = 3;
            iXd9 = FB.Xd() ^ (1303535596 ^ 308097232);
        }
        if (iXd9 != 0) {
            i77 += i77 + i77;
            str14 = strZd;
        }
        if (Integer.parseInt(str14) != 0) {
            i116 = 0;
            i78 = 0;
            i79 = 244649539 ^ 244649541;
        } else {
            i76 += i77;
            str14 = strXd;
            i78 = 17;
            i79 = (130863917 ^ 135228387) ^ 264485057;
        }
        if (i79 != 0) {
            i80 = i116 + i78 + i116;
            str14 = strZd;
        } else {
            i80 = 1;
        }
        if (Integer.parseInt(str14) != 0) {
            iLastIndexOf8 = 1;
        } else {
            i76 /= i80;
            iLastIndexOf8 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i80 = iLastIndexOf8;
        }
        String strLastIndexOf14 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i76, (iLastIndexOf8 * iXd8) % i80 == 0 ? C1561oA.yd("\u0005\f_^OV", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134246412)))) : BuildConfig.AnonymousClass1.indexOf(C1561oA.Yd("%\u000bPT1=.\u00051\u000b&EWO:LAE.Q1=*bW^J`V9:)yUlk\u0530m&,", (short) (ZN.Xd() ^ ((1218038276 ^ 1711850531) ^ 781279576))), 9));
        if (Integer.parseInt(strZd) == 0) {
            map7.put(strLastIndexOf14, clientHelloModel.getIdData());
        }
        if (clientHelloModel.getAdditionalData() != null && !clientHelloModel.getAdditionalData().isEmpty()) {
            this.body.putAll(clientHelloModel.getAdditionalData());
        }
        CommunicationManager communicationManager3 = CommunicationHelper.getInstance().getCommunicationManager();
        this.f18335c = communicationManager3;
        if (communicationManager3 == null) {
            int iLastIndexOf14 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            throw new CommunicationException(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd10, (iLastIndexOf14 * 3) % iLastIndexOf14 == 0 ? Xg.qd("Tts4QKS9SBOSO@?GN\\ \u001f\"!\b\u0017\"\u001aX\u000e\"LbQlP", (short) (C1499aX.Xd() ^ (754688390 ^ (-754688798))), (short) (C1499aX.Xd() ^ ((1119776041 ^ 1101499290) ^ (-52017016)))) : BuildConfig.AnonymousClass1.indexOf(Jg.Wd("lGhZ@F8]&<5\u000bu\u0005", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864695792)), (short) (C1607wl.Xd() ^ ((440512282 ^ 144618665) ^ 316631262))), C1607wl.Xd() ^ 1849955206)));
        }
        if (Integer.parseInt(strZd) != 0) {
            str15 = strZd;
            iXd8 = i101;
            coreAuthenticationImp5 = null;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(true);
            coreAuthenticationImp5 = this;
            str15 = strXd;
        }
        if (iXd8 != 0) {
            coreAuthenticationImp5.f18335c.isResponseEncrypted(true);
            str15 = strZd;
            i81 = 0;
        } else {
            i81 = iXd8 + 12;
        }
        if (Integer.parseInt(str15) != 0) {
            i82 = i81 + iXd10;
            communicationManager = null;
        } else {
            communicationManager = this.f18335c;
            i82 = i81 + 14;
            str15 = strXd;
        }
        if (i82 != 0) {
            i83 = 0;
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18335c;
            str15 = strZd;
            i84 = 0;
        } else {
            i83 = 0;
            i84 = i82 + iXd10;
        }
        if (Integer.parseInt(str15) != 0) {
            i85 = i84 + 11;
            coreAuthenticationImp6 = null;
        } else {
            communicationManager.addSessionIdInEncryptedData(true);
            i85 = i84 + 9;
            coreAuthenticationImp6 = this;
            str15 = strXd;
        }
        if (i85 != 0) {
            coreAuthenticationImp6.f18335c.setCallback(this);
            str15 = strZd;
            i86 = i83;
        } else {
            i86 = i85 + i101;
        }
        if (Integer.parseInt(str15) != 0) {
            i87 = i86 + 12;
            i88 = i83;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18335c;
            i87 = i86 + 11;
            i88 = 1;
            str15 = strXd;
        }
        if (i87 != 0) {
            sbAppend = new StringBuilder();
            i89 = i83;
            str15 = strZd;
        } else {
            i89 = i87 + i101;
            i88 = 1;
            sbAppend = null;
        }
        if (Integer.parseInt(str15) != 0) {
            i90 = i89 + 12;
        } else {
            sbAppend = sbAppend.append(clientHelloModel.getApi());
            i90 = i89 + iXd10;
            str15 = strXd;
        }
        if (i90 != 0) {
            str15 = strZd;
            iXd7 = i83;
            i91 = 9;
        } else {
            iXd7 = i90 + (C1499aX.Xd() ^ (-1134257946));
            i91 = i83;
        }
        int i118 = i91;
        if (Integer.parseInt(str15) != 0) {
            i93 = iXd7 + 6;
            i92 = 1;
            i118 = i83;
        } else {
            i92 = i91 + i91;
            i93 = iXd7 + i101;
            str15 = strXd;
        }
        if (i93 != 0) {
            i92 += i118 << 2;
            str15 = strZd;
            i94 = i83;
        } else {
            i94 = i93 + 9;
        }
        if (Integer.parseInt(str15) != 0) {
            i95 = i94 + 9;
            i96 = 1;
        } else {
            i95 = i94 + i101;
            str15 = strXd;
            i96 = 3;
        }
        int i119 = i96;
        if (i95 != 0) {
            i92 += i96 + i119 + i96;
            str15 = strZd;
            i97 = i83;
        } else {
            i97 = i95 + 12;
        }
        if (Integer.parseInt(str15) != 0) {
            i98 = i97 + 13;
            strXd = str15;
            i113 = i83;
        } else {
            i98 = i97 + 3;
            i83 = 9;
        }
        if (i98 != 0) {
            i92 /= i113 + (i83 + i83);
            strXd = strZd;
        }
        if (Integer.parseInt(strXd) != 0) {
            i103 = 1;
        } else {
            iLastIndexOf9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        String strLastIndexOf15 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i92, (iLastIndexOf9 * i103) % iLastIndexOf9 == 0 ? ZO.xd("\f\u0006~\u001ew\u0003![\u0012\u001e\rAr\u0006\u0011\n9", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1592862615 ^ 817175034))), (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1173509533 ^ 438118172)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1604271635 ^ 943367174) ^ 1738906204, C1626yg.Ud("Z\u0016(\u0007KBe?G\u0012~\r\u001c\t/n\rO/\u00025;L+\u0006#>\u0013\u000eIC:aH~9/F\u0010", (short) (C1607wl.Xd() ^ (1461518576 ^ 1461529988)), (short) (C1607wl.Xd() ^ ((1153795659 ^ 768494878) ^ 1762384097)))));
        if (Integer.parseInt(strZd) != 0) {
            headers = null;
            string = null;
        } else {
            string = sbAppend.append(strLastIndexOf15).toString();
            headers = clientHelloModel.getHeaders();
        }
        communicationManager2.consumeVsshService(i88, string, headers, this.body);
    }

    public final void a(LoginModel loginModel) throws CommunicationException, IOException {
        HashMap map;
        int iIndexOf;
        int i2;
        int i3;
        String strLastIndexOf;
        int i4;
        int i5;
        String str;
        int iXd;
        int i6;
        char c2;
        int i7;
        char c3;
        int iIndexOf2;
        int i8;
        int i9;
        char c4;
        String str2;
        int i10;
        int iXd2;
        int i11;
        int i12;
        JsonParser jsonParser;
        int iXd3;
        Gson gson;
        int iIndexOf3;
        int i13;
        int iXd4;
        String strLastIndexOf2;
        int i14;
        int i15;
        String str3;
        int iXd5;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iXd6;
        int i24;
        int i25;
        int iIndexOf4;
        int i26;
        int i27;
        String str4;
        int iXd7;
        int iXd8;
        int i28;
        int i29;
        char c5;
        int i30;
        int i31;
        int iIndexOf5;
        int i32;
        String strIndexOf;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        String str5;
        int iXd9;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        CoreAuthenticationImp coreAuthenticationImp;
        CoreAuthenticationImp coreAuthenticationImp2;
        CoreAuthenticationImp coreAuthenticationImp3;
        String str6;
        int i44;
        CommunicationManager communicationManager;
        int i45;
        int iXd10;
        CoreAuthenticationImp coreAuthenticationImp4;
        CommunicationManager communicationManager2;
        int i46;
        StringBuilder sbAppend;
        String str7;
        int i47;
        int i48;
        String string;
        Map<String, String> headers;
        int iIndexOf6;
        int i49;
        int i50;
        String strKd;
        int i51;
        char c6;
        String str8;
        int i52;
        int i53;
        char c7;
        char c8;
        JsonParser jsonParser2;
        int iIndexOf7;
        int i54;
        int i55;
        String str9;
        int iXd11;
        char c9;
        String str10;
        int i56;
        int i57;
        int i58;
        CoreSecurityHelper coreSecurityHelper;
        int iXd12;
        String hexSha256FromString;
        CoreSecurityHelper coreSecurityHelper2 = new CoreSecurityHelper();
        String strWd = Ig.wd("6", (short) (OY.Xd() ^ ((1470700986 ^ 235170110) ^ 1504536887)));
        if (Integer.parseInt(strWd) != 0) {
            map = null;
        } else {
            this.f18334b = coreSecurityHelper2;
            map = new HashMap();
        }
        this.principalData = map;
        String publicKey = loginModel.getPublicKey();
        int i59 = 2;
        int i60 = 105364905 ^ 105364903;
        int i61 = 13;
        char c10 = 6;
        int iXd13 = Od.Xd() ^ (611193691 ^ 1670612749);
        String strOd = EO.Od("\u0014", (short) (FB.Xd() ^ ((2000421902 ^ 1035017483) ^ 1250786317)));
        if (publicKey == null || loginModel.getPublicKey().isEmpty()) {
            Map<String, Object> map2 = this.principalData;
            if (Integer.parseInt(strWd) != 0) {
                iIndexOf = 1;
                i2 = 1;
                i3 = 1;
            } else {
                iIndexOf = BuildConfig.AnonymousClass1.indexOf();
                i2 = iIndexOf;
                i3 = 5;
            }
            if ((iIndexOf * i3) % i2 == 0) {
                strLastIndexOf = C1561oA.od("/<**&>!5", (short) (ZN.Xd() ^ ((1194533998 ^ 30153091) ^ 1191122064)));
            } else {
                short sXd = (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (102823350 ^ 1751447712)));
                int[] iArr = new int["\u0017\u0011b\\K\u001aGgech\u001ad)\u001f#Wl\u001a\u001f-*(g[*yxrchag\u007f\u007fy14)".length()];
                QB qb = new QB("\u0017\u0011b\\K\u001aGgech\u001ad)\u001f#Wl\u001a\u001f-*(g[*yxrchag\u007f\u007fy14)");
                int i62 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i62] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i62));
                    i62++;
                }
                strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(100, new String(iArr, 0, i62));
            }
            if (Integer.parseInt(strWd) != 0) {
                str = strWd;
                i4 = 1;
                iXd = (820310590 ^ 1115280002) ^ 1922900155;
                i5 = 0;
            } else {
                i4 = (919568918 ^ 1754950533) ^ 1582688651;
                i5 = 12;
                str = strOd;
                iXd = Od.Xd() ^ 1207800923;
            }
            if (iXd != 0) {
                i6 = i5 << 2;
                str = strWd;
            } else {
                i6 = 1;
            }
            if (Integer.parseInt(str) != 0) {
                c2 = 5;
                i7 = 1;
            } else {
                i4 += i6;
                c2 = '\r';
                i6 = iXd13;
                i7 = i6;
                str = strOd;
            }
            if (c2 != 0) {
                i4 += i6 + i7;
                str = strWd;
            }
            if (Integer.parseInt(str) == 0) {
                i4 /= 24;
            }
            map2.put(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, i4), loginModel.getPassword());
        } else {
            Map<String, Object> map3 = this.principalData;
            if (Integer.parseInt(strWd) != 0) {
                iIndexOf7 = 1;
                i55 = 1;
                i54 = 1;
            } else {
                iIndexOf7 = BuildConfig.AnonymousClass1.indexOf();
                i54 = 5;
                i55 = iIndexOf7;
            }
            if ((iIndexOf7 * i54) % i55 != 0) {
                str9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i60, C1561oA.Qd("f]\u0011)\u001c KLdYS\u0004\u001cT?TZMHTI\u007f@\u007f\u000f\u0003sr\b\u000e\u007f\n\u00051}r", (short) (Od.Xd() ^ (1523627088 ^ (-1523630566)))));
            } else {
                int iXd14 = Od.Xd() ^ (-1207817268);
                short sXd2 = (short) (C1633zX.Xd() ^ ((1084945472 ^ 1274027854) ^ (-190497938)));
                short sXd3 = (short) (C1633zX.Xd() ^ iXd14);
                int[] iArr2 = new int["\u0005\u0014\b\u0002\b\"\u0007\u0011".length()];
                QB qb2 = new QB("\u0005\u0014\b\u0002\b\"\u0007\u0011");
                int i63 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i63] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i63)) - sXd3);
                    i63++;
                }
                str9 = new String(iArr2, 0, i63);
            }
            if (Integer.parseInt(strWd) != 0) {
                str10 = strWd;
                c9 = 6;
                iXd11 = 1;
            } else {
                iXd11 = Od.Xd() ^ 1207800945;
                c9 = 5;
                str10 = strOd;
            }
            if (c9 != 0) {
                str10 = strWd;
            }
            if (Integer.parseInt(str10) != 0) {
                i58 = 13;
                i56 = 0;
                i57 = 0;
            } else {
                iXd11 += 8;
                i56 = 12;
                i57 = 12;
                i58 = iXd13;
                str10 = strOd;
            }
            if (i58 != 0) {
                str9 = BuildConfig.AnonymousClass1.indexOf(str9, iXd11 / (i56 + i57));
                str10 = strWd;
            }
            if (Integer.parseInt(str10) != 0) {
                coreSecurityHelper = null;
                iXd12 = OY.Xd() ^ (977791378 ^ 1047323005);
            } else {
                coreSecurityHelper = this.f18334b;
                iXd12 = 6;
                str10 = strOd;
            }
            if (iXd12 != 0) {
                hexSha256FromString = EncodeHelper.getHexSha256FromString(loginModel.getPassword());
                str10 = strWd;
            } else {
                hexSha256FromString = null;
            }
            map3.put(str9, coreSecurityHelper.encryptRsa(hexSha256FromString, KeyHelper.getPublicKeyFromString(Integer.parseInt(str10) != 0 ? null : KeyHelper.buildPublicKeyAsString(loginModel.getPublicKey()))));
        }
        HashMap map4 = new HashMap();
        if (Integer.parseInt(strWd) != 0) {
            c3 = 6;
            map4 = null;
        } else {
            this.body = map4;
            c3 = '\r';
        }
        if (c3 != 0) {
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            i8 = iIndexOf2;
        } else {
            iIndexOf2 = 1;
            i8 = 1;
        }
        String strZd = (iIndexOf2 * iXd13) % i8 == 0 ? Wg.Zd("v\u0018\t\u001bt\f.\u0016<{*m<", (short) (C1499aX.Xd() ^ ((774986465 ^ 1514519995) ^ (-1953797712))), (short) (C1499aX.Xd() ^ (992757216 ^ (-992758629)))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1636355887 ^ 1913472165) ^ 327519161, C1561oA.Xd("\u0013I;\u000ePP\u0002N[\u0019\u0012TX\u001a\u0015\u0010T'\u0014N\u0017b\u0015\u0012R$^0\\!ho87]b", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831073346)))));
        if (Integer.parseInt(strWd) != 0) {
            str2 = strWd;
            c4 = '\f';
            i9 = 1;
            i10 = 1;
            iXd2 = 1;
        } else {
            i9 = 560484198 ^ 560484326;
            c4 = 6;
            str2 = strOd;
            i10 = 856474020 ^ 856474016;
            iXd2 = C1499aX.Xd() ^ (1456292840 ^ (-357967104));
        }
        if (c4 != 0) {
            iXd2 = iXd2 + i10 + i10;
            str2 = strWd;
        }
        int i64 = 15;
        if (Integer.parseInt(str2) != 0) {
            i12 = 547138518 ^ 547138513;
            i11 = 0;
            i59 = 1;
        } else {
            i9 += iXd2;
            i11 = 8;
            str2 = strOd;
            i12 = 15;
        }
        if (i12 != 0) {
            strZd = BuildConfig.AnonymousClass1.indexOf(strZd, i9 / (i11 << i59));
            str2 = strWd;
        }
        if (Integer.parseInt(str2) != 0) {
            iXd3 = 9;
            jsonParser = null;
        } else {
            jsonParser = new JsonParser();
            str2 = strOd;
            iXd3 = OY.Xd() ^ 69929190;
        }
        if (iXd3 != 0) {
            gson = new Gson();
            str2 = strWd;
        } else {
            gson = null;
        }
        map4.put(strZd, jsonParser.parse(Integer.parseInt(str2) != 0 ? null : gson.toJson(this.principalData)));
        char c11 = '\n';
        if (loginModel.getAdditionalData() != null && !loginModel.getAdditionalData().isEmpty()) {
            Map<String, Object> map5 = this.body;
            if (Integer.parseInt(strWd) != 0) {
                iIndexOf6 = 1;
                i49 = 1;
                i50 = 1;
            } else {
                iIndexOf6 = BuildConfig.AnonymousClass1.indexOf();
                i49 = iIndexOf6;
                i50 = iXd13;
            }
            if ((iIndexOf6 * i50) % i49 != 0) {
                short sXd4 = (short) (C1607wl.Xd() ^ (415569829 ^ 415593658));
                int[] iArr3 = new int["Z\u0004\u00079~\u0002XF96\tEDCD8|,@-E|.2#)#.>@~".length()];
                QB qb3 = new QB("Z\u0004\u00079~\u0002XF96\tEDCD8|,@-E|.2#)#.>@~");
                int i65 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i65] = xuXd3.fK((sXd4 ^ i65) + xuXd3.CK(iKK3));
                    i65++;
                }
                strKd = BuildConfig.AnonymousClass1.indexOf(new String(iArr3, 0, i65), C1499aX.Xd() ^ (566174825 ^ (-1646543659)));
            } else {
                strKd = Qg.kd("\f\u000f\u0005\u0010p\f\n\t{\u0007Tw\u0001s", (short) (C1633zX.Xd() ^ (1502447851 ^ (-1502459745))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (648709742 ^ 388217589))));
            }
            if (Integer.parseInt(strWd) != 0) {
                str8 = strWd;
                c6 = '\t';
                i51 = 1;
            } else {
                i51 = 65;
                c6 = 5;
                str8 = strOd;
            }
            if (c6 != 0) {
                str8 = strWd;
            }
            if (Integer.parseInt(str8) != 0) {
                i53 = 6;
                c7 = 15;
                i52 = 1;
            } else {
                i51 += 6;
                i52 = 5;
                i53 = 5;
                c7 = '\t';
                str8 = strOd;
            }
            if (c7 != 0) {
                i53 = i53 + i52 + i52;
                str8 = strWd;
            }
            if (Integer.parseInt(str8) != 0) {
                c8 = '\n';
            } else {
                strKd = BuildConfig.AnonymousClass1.indexOf(strKd, i51 / i53);
                c8 = '\f';
                str8 = strOd;
            }
            if (c8 != 0) {
                jsonParser2 = new JsonParser();
                str8 = strWd;
            } else {
                jsonParser2 = null;
            }
            map5.put(strKd, jsonParser2.parse((Integer.parseInt(str8) != 0 ? null : new Gson()).toJson(loginModel.getAdditionalData())));
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        if (Integer.parseInt(strWd) != 0) {
            iIndexOf3 = 1;
            iXd4 = 1;
            i13 = 1;
        } else {
            iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
            i13 = iIndexOf3;
            iXd4 = C1607wl.Xd() ^ (295058356 ^ 2144479340);
        }
        if ((iIndexOf3 * iXd4) % i13 == 0) {
            strLastIndexOf2 = hg.Vd("YBVW,;ltp\\rq\u001c\u0017\u00188P]WVO$\bYV^XW\u001c\u0017\u00180UM?VTW;\f\u0004", (short) (OY.Xd() ^ ((28835844 ^ 1507718516) ^ 1483071908)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (287724284 ^ (-1702329576)))));
        } else {
            int i66 = (2016262258 ^ 1460236376) ^ 790939653;
            short sXd5 = (short) (C1499aX.Xd() ^ (1964656474 ^ (-1964669059)));
            int[] iArr4 = new int["yzrlignfa".length()];
            QB qb4 = new QB("yzrlignfa");
            int i67 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i67] = xuXd4.fK(sXd5 + i67 + xuXd4.CK(iKK4));
                i67++;
            }
            strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i66, new String(iArr4, 0, i67));
        }
        char c12 = 11;
        if (Integer.parseInt(strWd) != 0) {
            str3 = strWd;
            iXd5 = 11;
            i14 = 1;
            i15 = 1;
        } else {
            i14 = 30;
            i15 = 30;
            str3 = strOd;
            iXd5 = Od.Xd() ^ 1207800913;
        }
        if (iXd5 != 0) {
            i15 = i15 + i14 + i14;
            str3 = strWd;
            i16 = 0;
        } else {
            i16 = iXd5 + 11;
        }
        if (Integer.parseInt(str3) != 0) {
            i18 = i16 + 6;
            i20 = 1;
            i19 = 1;
            i17 = 1;
        } else {
            i17 = i15 + 15;
            i18 = i16 + 3;
            str3 = strOd;
            i19 = 922074199 ^ 922074195;
            i20 = 1799637144 ^ 1799637148;
        }
        if (i18 != 0) {
            i19 = i19 + i20 + i20;
            str3 = strWd;
            i21 = 0;
        } else {
            i21 = i18 + 10;
        }
        if (Integer.parseInt(str3) != 0) {
            i22 = i21 + 15;
            i23 = 0;
            iXd6 = 1;
        } else {
            i17 += i19;
            i22 = i21 + 13;
            str3 = strOd;
            i23 = 15;
            iXd6 = C1499aX.Xd() ^ (1769892341 ^ (-719654629));
        }
        if (i22 != 0) {
            strLastIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strLastIndexOf2, i17 / (i23 << iXd6));
            str3 = strWd;
            i24 = 0;
        } else {
            i24 = i22 + 10;
        }
        if (Integer.parseInt(str3) != 0) {
            i25 = i24 + 9;
        } else {
            sb = sb.append(strLastIndexOf2);
            strLastIndexOf2 = loginModel.getApi();
            i25 = i24 + 8;
        }
        if (i25 != 0) {
            sb = sb.append(strLastIndexOf2);
            iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
            i26 = iIndexOf4;
        } else {
            iIndexOf4 = 1;
            i26 = 1;
        }
        String strYd = (iIndexOf4 * 5) % i26 == 0 ? C1561oA.yd("N\nw~\u000bP\u000fsuqpX{cw\u0001tqmm", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849965532))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1499aX.Xd() ^ (999427870 ^ (-2013882435)), C1561oA.Yd("A9<<ON\u0010\r\u0003\u007f\u0019\u0016\n", (short) (FB.Xd() ^ ((652698939 ^ 130903641) ^ 556431454))));
        if (Integer.parseInt(strWd) != 0) {
            str4 = strWd;
            iXd7 = 1;
            iXd8 = 1;
            i27 = 1;
        } else {
            i27 = 76;
            str4 = strOd;
            iXd7 = OY.Xd() ^ 69929196;
            iXd8 = ZN.Xd() ^ (796960063 ^ 470457291);
            i61 = (1353363317 ^ 2045639173) ^ 692540791;
        }
        if (i61 != 0) {
            iXd8 = iXd8 + iXd7 + iXd7;
            str4 = strWd;
        }
        if (Integer.parseInt(str4) != 0) {
            c5 = '\f';
            i28 = 0;
            i29 = 0;
        } else {
            i27 += iXd8;
            i28 = 19;
            i29 = 19;
            c5 = 6;
            str4 = strOd;
        }
        if (c5 != 0) {
            i30 = i28 + i29 + i28;
            str4 = strWd;
        } else {
            i30 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i31 = (1463622052 ^ 935866389) ^ 1626679743;
        } else {
            strYd = BuildConfig.AnonymousClass1.indexOf(strYd, i27 / i30);
            i31 = 8;
        }
        if (i31 != 0) {
            sb = sb.append(strYd);
            iIndexOf5 = BuildConfig.AnonymousClass1.indexOf();
            i32 = iIndexOf5;
        } else {
            iIndexOf5 = 1;
            i32 = 1;
        }
        if ((iIndexOf5 * 5) % i32 == 0) {
            strIndexOf = Xg.qd("XYXi\u0015\u0007\r\u001b\u000b$^X", (short) (ZN.Xd() ^ (6024891 ^ 6004125)), (short) (ZN.Xd() ^ (1945549356 ^ 1945557125)));
        } else {
            int iXd15 = C1633zX.Xd() ^ (-1951477110);
            short sXd6 = (short) (OY.Xd() ^ (823664216 ^ 823670675));
            short sXd7 = (short) (OY.Xd() ^ iXd15);
            int[] iArr5 = new int["旅䝠".length()];
            QB qb5 = new QB("旅䝠");
            int i68 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i68] = xuXd5.fK(xuXd5.CK(iKK5) - ((i68 * sXd7) ^ sXd6));
                i68++;
            }
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(new String(iArr5, 0, i68), 8);
        }
        if (Integer.parseInt(strWd) != 0) {
            i33 = 1;
            i34 = 1;
        } else {
            i33 = 22;
            i34 = 22;
        }
        int i69 = i33 + i34 + i33;
        if (Integer.parseInt(strWd) != 0) {
            str5 = strWd;
            i35 = 1;
            i36 = 1;
            i37 = 1;
            iXd9 = C1499aX.Xd() ^ (-1134257944);
        } else {
            i35 = i69 + 11;
            i36 = iXd13;
            i37 = i36;
            str5 = strOd;
            iXd9 = 11;
        }
        if (iXd9 != 0) {
            i35 += i36 + i37;
            str5 = strWd;
            i39 = (1686998930 ^ 743622313) ^ 1222592828;
            i38 = 0;
        } else {
            i38 = iXd9 + 11;
            i39 = 0;
        }
        if (Integer.parseInt(str5) != 0) {
            i41 = i38 + 12;
            i40 = 1;
        } else {
            i40 = i39 + i39;
            i41 = i38 + 8;
            str5 = strOd;
        }
        if (i41 != 0) {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, i35 / (i39 + i40));
            str5 = strWd;
            i42 = 0;
        } else {
            i42 = i41 + 10;
        }
        if (Integer.parseInt(str5) != 0) {
            i43 = i42 + 13;
            coreAuthenticationImp = null;
        } else {
            sb = sb.append(strIndexOf);
            i43 = i42 + 12;
            coreAuthenticationImp = this;
            str5 = strOd;
        }
        if (i43 != 0) {
            sb = sb.append(coreAuthenticationImp.body.toString());
            str5 = strWd;
        }
        if (Integer.parseInt(str5) != 0) {
            coreAuthenticationImp2 = null;
        } else {
            printStream.println(sb.toString());
            coreAuthenticationImp2 = this;
        }
        coreAuthenticationImp2.f18335c = CommunicationHelper.getInstance().getCommunicationManager();
        CommunicationManager communicationManager3 = this.f18335c;
        if (communicationManager3 == null) {
            int iIndexOf8 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf8 * 4) % iIndexOf8 == 0 ? ZO.xd("jN\u001d@'f40\u0004)6\\FC0u\u001c\u0003Yh\u001e?J_fN=E]'N\u00145_", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207819864)), (short) (ZN.Xd() ^ (862221398 ^ 862211027))) : BuildConfig.AnonymousClass1.indexOf(C1626yg.Ud("\u001f<A\u007f\u001a6+u'?xo};4\u0013*!v\u0017\u001fF!ZV\\5\u0004h]$UI\u0005\u001d(", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849963906))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1358366812 ^ 1635662483)))), (2072373792 ^ 118961168) ^ 2089999885), 1));
        }
        if (Integer.parseInt(strWd) != 0) {
            str6 = strWd;
            coreAuthenticationImp3 = null;
            i44 = 1590419821 ^ 1590419811;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(true);
            coreAuthenticationImp3 = this;
            str6 = strOd;
            i44 = 11;
        }
        if (i44 != 0) {
            coreAuthenticationImp3.f18335c.isResponseEncrypted(true);
            str6 = strWd;
        }
        if (Integer.parseInt(str6) != 0) {
            communicationManager = null;
        } else {
            communicationManager = this.f18335c;
            i64 = iXd13;
            str6 = strOd;
        }
        if (i64 != 0) {
            i45 = 0;
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18335c;
            str6 = strWd;
        } else {
            i45 = 0;
        }
        if (Integer.parseInt(str6) != 0) {
            c12 = '\t';
            iXd10 = 1;
            coreAuthenticationImp4 = null;
        } else {
            iXd10 = 1;
            communicationManager.addSessionIdInEncryptedData(true);
            coreAuthenticationImp4 = this;
            str6 = strOd;
        }
        if (c12 != 0) {
            coreAuthenticationImp4.f18335c.setCallback(this);
            str6 = strWd;
        }
        if (Integer.parseInt(str6) != 0) {
            i46 = 9;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18335c;
            i45 = iXd10;
            i46 = iXd13;
            str6 = strOd;
        }
        if (i46 != 0) {
            sbAppend = new StringBuilder();
            str6 = strWd;
        } else {
            i45 = iXd10;
            sbAppend = null;
        }
        if (Integer.parseInt(str6) != 0) {
            c11 = '\b';
        } else {
            sbAppend = sbAppend.append(loginModel.getApi());
        }
        int iIndexOf9 = c11 != 0 ? BuildConfig.AnonymousClass1.indexOf() : iXd10;
        String strWd2 = (iIndexOf9 * 5) % iIndexOf9 == 0 ? Ig.wd("GF+{$+\u0017\u0019n4>lcBC0y\u00066w", (short) (C1607wl.Xd() ^ ((128165767 ^ 74236111) ^ 63923645))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(12, EO.Od("J\"Zs=8!\u000f9P_", (short) (C1607wl.Xd() ^ ((2012989547 ^ 401873518) ^ 1611658889))));
        if (Integer.parseInt(strWd) != 0) {
            str7 = strWd;
            i47 = iXd10;
            i48 = i47;
            iXd13 = 9;
        } else {
            str7 = strOd;
            iXd10 = C1633zX.Xd() ^ (82497189 ^ (-1891347190));
            i47 = 626138697 ^ 626138701;
            i48 = (1902763235 ^ 1196131189) ^ 908222354;
        }
        if (iXd13 != 0) {
            iXd10 += i47 + i48;
            str7 = strWd;
        }
        if (Integer.parseInt(str7) != 0) {
            strOd = str7;
        } else {
            iXd10 /= 20;
            c10 = '\b';
        }
        if (c10 != 0) {
            sbAppend = sbAppend.append(BuildConfig.AnonymousClass1.indexOf(strWd2, iXd10));
        } else {
            strWd = strOd;
        }
        if (Integer.parseInt(strWd) != 0) {
            headers = null;
            string = null;
        } else {
            string = sbAppend.toString();
            headers = loginModel.getHeaders();
        }
        communicationManager2.consumeVsshService(i45, string, headers, this.body);
    }

    public final void a(RecoveryModel recoveryModel) throws CommunicationException, IOException {
        HashMap map;
        String str;
        int iXd;
        int iIndexOf;
        int i2;
        int i3;
        int iXd2;
        String str2;
        char c2;
        int iXd3;
        int iXd4;
        int i4;
        int i5;
        CoreAuthenticationImp coreAuthenticationImp;
        CoreSecurityHelper coreSecurityHelper;
        String password;
        int i6;
        int i7;
        String publicKey;
        String strEncryptRsa;
        int i8;
        int i9;
        CoreAuthenticationImp coreAuthenticationImp2;
        HashMap map2;
        int i10;
        Map<String, Object> map3;
        int iIndexOf2;
        int i11;
        int i12;
        int i13;
        String str3;
        int i14;
        int i15;
        int i16;
        char c3;
        char c4;
        JsonParser jsonParser;
        Gson gson;
        int i17;
        int iIndexOf3;
        int i18;
        int i19;
        int iXd5;
        String str4;
        int i20;
        int iXd6;
        int iXd7;
        int i21;
        int iIndexOf4;
        int i22;
        String strYd;
        int i23;
        String str5;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iIndexOf5;
        int iXd8;
        String str6;
        int i29;
        char c5;
        int i30;
        int i31;
        CoreAuthenticationImp coreAuthenticationImp3;
        char c6;
        CoreAuthenticationImp coreAuthenticationImp4;
        CoreAuthenticationImp coreAuthenticationImp5;
        String str7;
        CommunicationManager communicationManager;
        int iXd9;
        int i32;
        int i33;
        CoreAuthenticationImp coreAuthenticationImp6;
        int i34;
        CommunicationManager communicationManager2;
        int i35;
        int i36;
        int i37;
        StringBuilder sbAppend;
        int i38;
        int iIndexOf6;
        int i39;
        int i40;
        String str8;
        int iIndexOf7;
        int i41;
        int iXd10;
        String str9;
        int i42;
        String str10;
        char c7;
        int i43;
        int iXd11;
        char c8;
        int iXd12;
        char c9;
        int i44;
        CoreSecurityHelper coreSecurityHelper2 = new CoreSecurityHelper();
        String strQd = C1561oA.Qd("u", (short) (FB.Xd() ^ (FB.Xd() ^ (1941249469 ^ 744127398))));
        int i45 = Integer.parseInt(strQd);
        String strZd = C1593ug.zd("MQ", (short) (ZN.Xd() ^ (Od.Xd() ^ (1848496158 ^ 701502453))), (short) (ZN.Xd() ^ ((372056751 ^ 1640989797) ^ 2011360309)));
        if (i45 != 0) {
            str = strQd;
            iXd = 14;
            map = null;
        } else {
            this.f18334b = coreSecurityHelper2;
            map = new HashMap();
            str = strZd;
            iXd = FB.Xd() ^ 1609527088;
        }
        if (iXd != 0) {
            this.principalData = map;
            str = strQd;
        } else {
            map = null;
        }
        int i46 = Integer.parseInt(str);
        int i47 = 2;
        if (i46 != 0) {
            iIndexOf = 1;
            i2 = 1;
            i3 = 1;
        } else {
            iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            i2 = iIndexOf;
            i3 = 2;
        }
        String strIndexOf = (iIndexOf * i3) % i2 != 0 ? BuildConfig.AnonymousClass1.indexOf(C1561oA.od("R\u007ftr\f2Rkkt", (short) (OY.Xd() ^ ((1728103169 ^ 388852486) ^ 1882056520))), (1242892438 ^ 209547717) ^ 1181251909) : C1561oA.Kd("evbdb|cy", (short) (Od.Xd() ^ (646525085 ^ (-646539027))));
        int i48 = 6;
        if (Integer.parseInt(strQd) != 0) {
            str2 = strQd;
            c2 = 6;
            iXd2 = 1;
            iXd3 = 1;
            iXd4 = 1;
        } else {
            iXd2 = OY.Xd() ^ 69929088;
            str2 = strZd;
            c2 = 2;
            iXd3 = ZN.Xd() ^ 864698100;
            iXd4 = FB.Xd() ^ 1609527095;
        }
        if (c2 != 0) {
            iXd2 += iXd3 + iXd4;
            str2 = strQd;
        }
        if (Integer.parseInt(str2) != 0) {
            i4 = 8;
        } else {
            iXd2 /= 26;
            str2 = strZd;
            i4 = 2;
        }
        char c10 = '\f';
        int i49 = 0;
        if (i4 != 0) {
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(strIndexOf, iXd2);
            coreAuthenticationImp = this;
            str2 = strQd;
            i5 = 0;
        } else {
            i5 = i4 + 12;
            coreAuthenticationImp = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i6 = i5 + 8;
            coreSecurityHelper = null;
            password = null;
        } else {
            coreSecurityHelper = coreAuthenticationImp.f18334b;
            password = recoveryModel.getPassword();
            i6 = i5 + 8;
            str2 = strZd;
        }
        int iXd13 = C1499aX.Xd() ^ (14320194 ^ (-1128392023));
        if (i6 != 0) {
            password = EncodeHelper.getHexSha256FromString(password);
            publicKey = recoveryModel.getPublicKey();
            i7 = 0;
            str2 = strQd;
        } else {
            i7 = i6 + 7;
            publicKey = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i8 = i7 + 8;
            strEncryptRsa = null;
        } else {
            strEncryptRsa = coreSecurityHelper.encryptRsa(password, KeyHelper.getPublicKeyFromString(KeyHelper.buildPublicKeyAsString(publicKey)));
            i8 = i7 + 7;
            str2 = strZd;
        }
        int i50 = 1532153881 ^ 1532153876;
        if (i8 != 0) {
            map.put(strIndexOf, strEncryptRsa);
            coreAuthenticationImp2 = this;
            str2 = strQd;
            i9 = 0;
        } else {
            i9 = i8 + i50;
            coreAuthenticationImp2 = null;
        }
        int i51 = Integer.parseInt(str2);
        int iXd14 = C1633zX.Xd() ^ (1864201285 ^ (-457969781));
        if (i51 != 0) {
            i10 = i9 + iXd14;
            map2 = null;
        } else {
            map2 = new HashMap();
            i10 = i9 + 2;
            str2 = strZd;
        }
        if (i10 != 0) {
            coreAuthenticationImp2.body = map2;
            map3 = this.body;
            str2 = strQd;
        } else {
            map3 = null;
        }
        if (Integer.parseInt(str2) != 0) {
            iIndexOf2 = 1;
            i11 = 1;
            i12 = 1;
        } else {
            iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
            i11 = iIndexOf2;
            i12 = iXd14;
        }
        String strIndexOf2 = (iIndexOf2 * i12) % i11 != 0 ? BuildConfig.AnonymousClass1.indexOf(Wg.Zd("\u0019N-f-mF'G\b\fDl|{\u0005Nb\u0012q\u00175*O\u0002\u0018 X/h?<\u001a\u001dq#", (short) (FB.Xd() ^ ((1925743322 ^ 819274886) ^ 1109249982)), (short) (FB.Xd() ^ (FB.Xd() ^ (1617413910 ^ 1065915206)))), OY.Xd() ^ (773123142 ^ 708830423)) : C1561oA.Xd("y{\u0011\f\u000b\u0013y\u000b\u0016m\t\u0016\t", (short) (ZN.Xd() ^ (1177437190 ^ 1177421113)));
        char c11 = '\n';
        if (Integer.parseInt(strQd) != 0) {
            str3 = strQd;
            i14 = 10;
            i13 = 1;
        } else {
            i13 = 60;
            str3 = strZd;
            i14 = 673514151 ^ 673514148;
        }
        if (i14 != 0) {
            str3 = strQd;
        }
        int iXd15 = 15;
        if (Integer.parseInt(str3) != 0) {
            c3 = 6;
            i16 = 6;
            i15 = 1;
        } else {
            i13 += 6;
            i15 = iXd14;
            i16 = i15;
            str3 = strZd;
            c3 = 15;
        }
        if (c3 != 0) {
            i16 = i16 + i15 + i15;
            str3 = strQd;
        }
        if (Integer.parseInt(str3) != 0) {
            c4 = 14;
        } else {
            strIndexOf2 = BuildConfig.AnonymousClass1.indexOf(strIndexOf2, i13 / i16);
            str3 = strZd;
            c4 = 2;
        }
        if (c4 != 0) {
            jsonParser = new JsonParser();
            str3 = strQd;
        } else {
            jsonParser = null;
        }
        int iXd16 = 11;
        if (Integer.parseInt(str3) != 0) {
            i17 = 11;
            gson = null;
        } else {
            gson = new Gson();
            i17 = iXd14;
        }
        map3.put(strIndexOf2, jsonParser.parse(i17 != 0 ? gson.toJson(this.principalData) : null));
        Map<String, Object> additionalData = recoveryModel.getAdditionalData();
        int iXd17 = C1607wl.Xd() ^ 1849955283;
        if (additionalData != null && !recoveryModel.getAdditionalData().isEmpty()) {
            Map<String, Object> map4 = this.body;
            if (Integer.parseInt(strQd) != 0) {
                iIndexOf7 = 1;
                i41 = 1;
                iXd10 = 1;
            } else {
                iIndexOf7 = BuildConfig.AnonymousClass1.indexOf();
                i41 = iIndexOf7;
                iXd10 = C1607wl.Xd() ^ 1849955289;
            }
            if ((iIndexOf7 * iXd10) % i41 != 0) {
                str9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd17, Wg.vd("U[l\\]\u0019\u001f-87)'\u0017", (short) (Od.Xd() ^ (1728441250 ^ (-1728424308)))));
            } else {
                int iXd18 = C1633zX.Xd() ^ (1290712297 ^ 952088867);
                short sXd = (short) (Od.Xd() ^ ((988914949 ^ 2133202178) ^ (-1171756956)));
                short sXd2 = (short) (Od.Xd() ^ iXd18);
                int[] iArr = new int["B;9B%>@A2#\t*5&".length()];
                QB qb = new QB("B;9B%>@A2#\t*5&");
                int i52 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i52] = xuXd.fK(((sXd + i52) + xuXd.CK(iKK)) - sXd2);
                    i52++;
                }
                str9 = new String(iArr, 0, i52);
            }
            if (Integer.parseInt(strQd) != 0) {
                str10 = strQd;
                i43 = 0;
                c7 = 15;
                i42 = 1;
            } else {
                i42 = 337950630 ^ 337950646;
                str10 = strZd;
                c7 = 2;
                i43 = 8;
            }
            if (c7 != 0) {
                iXd11 = i43 << 2;
                str10 = strQd;
            } else {
                iXd11 = 1;
            }
            if (Integer.parseInt(str10) != 0) {
                c8 = 15;
                iXd12 = 1;
            } else {
                i42 += iXd11;
                str10 = strZd;
                c8 = 2;
                iXd11 = C1633zX.Xd() ^ (1385334705 ^ (-650371975));
                iXd12 = ZN.Xd() ^ (1358097038 ^ 1668863101);
            }
            if (c8 != 0) {
                i42 += iXd11 + iXd12;
                str10 = strQd;
            }
            if (Integer.parseInt(str10) != 0) {
                c9 = 14;
                i44 = 1;
            } else {
                str10 = strZd;
                c9 = 2;
                i44 = 12;
            }
            if (c9 != 0) {
                str9 = BuildConfig.AnonymousClass1.indexOf(str9, i42 / (i44 + 6));
                str10 = strQd;
            }
            map4.put(str9, (Integer.parseInt(str10) != 0 ? null : new JsonParser()).parse(new Gson().toJson(recoveryModel.getAdditionalData())));
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        if (Integer.parseInt(strQd) != 0) {
            iIndexOf3 = 1;
            i19 = 1;
            i18 = 1;
        } else {
            iIndexOf3 = BuildConfig.AnonymousClass1.indexOf();
            i18 = 2;
            i19 = iIndexOf3;
        }
        int i53 = 926849589 ^ 926849550;
        String strLastIndexOf = (iIndexOf3 * i18) % i19 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i53, hg.Vd(".2VJAaGgNRV", (short) (OY.Xd() ^ (1509420307 ^ 1509403429)), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (2032381352 ^ (-985179003)))))) : C1561oA.ud("\u0019\u007f\u0014\u0013kŅ*\u0016.\u001e0)[TWq\u000e\u001d\u0017\u0014\u000f_G\u0017\u001e \u0014\u000b\u001e\u0007}UTQi\u0013\u000fx\u0014\u000et\rI=", (short) (C1607wl.Xd() ^ (OY.Xd() ^ (1397114399 ^ 1466792343))));
        if (Integer.parseInt(strQd) != 0) {
            str4 = strQd;
            i20 = 14;
            iXd5 = 1;
            iXd6 = 1;
            iXd7 = 1;
        } else {
            iXd5 = FB.Xd() ^ (1115244297 ^ 496379914);
            str4 = strZd;
            i20 = iXd13;
            iXd6 = ZN.Xd() ^ (451090322 ^ 694757729);
            iXd7 = FB.Xd() ^ (1216263508 ^ 395434596);
        }
        if (i20 != 0) {
            iXd5 += iXd6 + iXd7;
            str4 = strQd;
        }
        if (Integer.parseInt(str4) == 0) {
            iXd5 /= 24;
        }
        StringBuilder sbAppend2 = sb.append(BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, iXd5));
        if (Integer.parseInt(strQd) != 0) {
            i21 = (1876346326 ^ 746174375) ^ 1135571576;
        } else {
            sbAppend2 = sbAppend2.append(recoveryModel.getApi());
            i21 = 15;
        }
        if (i21 != 0) {
            iIndexOf4 = BuildConfig.AnonymousClass1.indexOf();
            i22 = iIndexOf4;
        } else {
            iIndexOf4 = 1;
            i22 = 1;
        }
        if ((iIndexOf4 * iXd14) % i22 != 0) {
            short sXd3 = (short) (FB.Xd() ^ (164540441 ^ 164543400));
            int[] iArr2 = new int["{xrICBNN@HOJ~FK\u0003\\\u000b\f~\\\u0002X\u001aZ\f\u000fZ\u0013\u000b\u000b UVZY".length()];
            QB qb2 = new QB("{xrICBNN@HOJ~FK\u0003\\\u000b\f~\\\u0002X\u001aZ\f\u000fZ\u0013\u000b\u000b UVZY");
            int i54 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i54] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i54));
                i54++;
            }
            strYd = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i54), OY.Xd() ^ (611699601 ^ 543081248));
        } else {
            strYd = C1561oA.Yd("N\u0006}\u000e\u0003X\u000e\u0019\u0010\u001f\n\u000e\u0001\u0012\u001e &\u0010\u001f\r", (short) (C1633zX.Xd() ^ (621412951 ^ (-621415848))));
        }
        if (Integer.parseInt(strQd) != 0) {
            str5 = strQd;
            i23 = 1;
            i24 = 1;
        } else {
            i23 = 26;
            str5 = strZd;
            i24 = 26;
            c11 = 11;
        }
        if (c11 != 0) {
            i24 = i24 + i23 + i23;
            str5 = strQd;
        }
        if (Integer.parseInt(str5) != 0) {
            iXd16 = FB.Xd() ^ 1609527098;
            i25 = 1;
            i26 = 1;
            i27 = 1;
        } else {
            i25 = i24 + i50;
            str5 = strZd;
            i26 = 1914396054 ^ 1914396053;
            i27 = (1214917670 ^ 22258778) ^ 1228507263;
        }
        if (iXd16 != 0) {
            i25 += i26 + i27;
            str5 = strQd;
        }
        if (Integer.parseInt(str5) != 0) {
            i28 = 1;
        } else {
            i28 = 14;
            str5 = strZd;
            i50 = 8;
        }
        if (i50 != 0) {
            strYd = BuildConfig.AnonymousClass1.indexOf(strYd, i25 / (iXd13 + i28));
            str5 = strQd;
        }
        if (Integer.parseInt(str5) != 0) {
            iIndexOf5 = 1;
        } else {
            sbAppend2 = sbAppend2.append(strYd);
            iIndexOf5 = BuildConfig.AnonymousClass1.indexOf();
        }
        String strQd2 = (iIndexOf5 * 2) % iIndexOf5 == 0 ? Xg.qd("\u001a\u001f\u001a'^HNThe$\u001a", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831084836)), (short) (Od.Xd() ^ (1884162576 ^ (-1884174135)))) : BuildConfig.AnonymousClass1.indexOf(Jg.Wd("埀⩭", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1690051646 ^ 1429558184))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69937161)))), C1607wl.Xd() ^ (1306472294 ^ 597376158));
        if (Integer.parseInt(strQd) != 0) {
            str6 = strQd;
            i29 = 6;
            iXd8 = 1;
        } else {
            iXd8 = FB.Xd() ^ (1381170547 ^ 230527592);
            str6 = strZd;
            i29 = 2115686684 ^ 2115686687;
        }
        if (i29 != 0) {
            str6 = strQd;
        }
        if (Integer.parseInt(str6) != 0) {
            i31 = 0;
            c5 = 6;
            i30 = 1;
        } else {
            iXd8 += 8;
            c5 = 14;
            str6 = strZd;
            i30 = 2;
            i31 = 8;
        }
        if (c5 != 0) {
            strQd2 = BuildConfig.AnonymousClass1.indexOf(strQd2, iXd8 / (i31 << i30));
            str6 = strQd;
        }
        if (Integer.parseInt(str6) != 0) {
            c6 = 6;
            coreAuthenticationImp3 = null;
        } else {
            sbAppend2 = sbAppend2.append(strQd2);
            coreAuthenticationImp3 = this;
            str6 = strZd;
            c6 = 15;
        }
        if (c6 != 0) {
            sbAppend2 = sbAppend2.append(coreAuthenticationImp3.body.toString());
            str6 = strQd;
        }
        if (Integer.parseInt(str6) != 0) {
            coreAuthenticationImp4 = null;
        } else {
            printStream.println(sbAppend2.toString());
            coreAuthenticationImp4 = this;
        }
        coreAuthenticationImp4.f18335c = CommunicationHelper.getInstance().getCommunicationManager();
        CommunicationManager communicationManager3 = this.f18335c;
        if (communicationManager3 == null) {
            int iIndexOf8 = BuildConfig.AnonymousClass1.indexOf();
            throw new CommunicationException(BuildConfig.AnonymousClass1.indexOf((iIndexOf8 * 5) % iIndexOf8 == 0 ? ZO.xd("\u0002rW\t\u0001Q~f9-rv>\u0002j\u001e8&epn\u001bkS\u0003\u0007H\u0013tF\u0010\u000b_\n", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (928309564 ^ 1494256519))), (short) (FB.Xd() ^ (935845441 ^ 935834149))) : BuildConfig.AnonymousClass1.indexOf(C1626yg.Ud("㢣峥", (short) (FB.Xd() ^ (OY.Xd() ^ 69937182)), (short) (FB.Xd() ^ (ZN.Xd() ^ (1286086305 ^ 2132937539)))), i53), 2));
        }
        if (Integer.parseInt(strQd) != 0) {
            str7 = strQd;
            coreAuthenticationImp5 = null;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(false);
            coreAuthenticationImp5 = this;
            str7 = strZd;
            c10 = '\b';
        }
        if (c10 != 0) {
            coreAuthenticationImp5.f18335c.isResponseEncrypted(false);
            str7 = strQd;
        }
        if (Integer.parseInt(str7) != 0) {
            communicationManager = null;
            iXd9 = C1499aX.Xd() ^ (1659165259 ^ (-562019677));
        } else {
            communicationManager = this.f18335c;
            str7 = strZd;
            iXd9 = 8;
        }
        if (iXd9 != 0) {
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18335c;
            str7 = strQd;
            i32 = 0;
        } else {
            i32 = iXd9 + 14;
        }
        if (Integer.parseInt(str7) != 0) {
            i33 = i32 + 15;
            coreAuthenticationImp6 = null;
        } else {
            communicationManager.addSessionIdInEncryptedData(false);
            i33 = i32 + 6;
            coreAuthenticationImp6 = this;
            str7 = strZd;
        }
        if (i33 != 0) {
            coreAuthenticationImp6.f18335c.setCallback(this);
            str7 = strQd;
            i34 = 0;
        } else {
            i34 = i33 + 11;
        }
        if (Integer.parseInt(str7) != 0) {
            i35 = i34 + 12;
            i36 = 0;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18335c;
            i35 = i34 + 11;
            str7 = strZd;
            i36 = 1;
        }
        if (i35 != 0) {
            sbAppend = new StringBuilder();
            i37 = 0;
            str7 = strQd;
        } else {
            i37 = i35 + 8;
            i36 = 1;
            sbAppend = null;
        }
        if (Integer.parseInt(str7) != 0) {
            i38 = i37 + 14;
        } else {
            sbAppend = sbAppend.append(recoveryModel.getApi());
            i38 = i37 + 6;
        }
        if (i38 != 0) {
            iIndexOf6 = BuildConfig.AnonymousClass1.indexOf();
            i39 = iIndexOf6;
        } else {
            iIndexOf6 = 1;
            i39 = 1;
            i47 = 1;
        }
        String strIndexOf3 = (iIndexOf6 * i47) % i39 != 0 ? BuildConfig.AnonymousClass1.indexOf(Ig.wd("\u0011Y:\u0012FaC\u0011#kkF\u0014'tZ\u001c\u000f\u00137;&\u0013G\u0011G5X!#Rn\u000f)7j", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134261897))), 1771363410 ^ 1771363330) : EO.Od("eB7\u001fm'{\u0002R\u0005\rm.HoOho6K", (short) (FB.Xd() ^ (2137145737 ^ 2137152987)));
        if (Integer.parseInt(strQd) != 0) {
            str8 = strQd;
            i40 = 1;
        } else {
            i40 = (1477366334 ^ 422901596) ^ 1094329724;
            iXd13 = iXd14;
            str8 = strZd;
        }
        if (iXd13 != 0) {
            str8 = strQd;
        }
        if (Integer.parseInt(str8) != 0) {
            i48 = 0;
            strZd = str8;
        } else {
            i40 += 4;
            i49 = 6;
            iXd15 = OY.Xd() ^ (1335325545 ^ 1270643592);
        }
        if (iXd15 != 0) {
            strIndexOf3 = BuildConfig.AnonymousClass1.indexOf(strIndexOf3, i40 / (i48 + i49));
        } else {
            strQd = strZd;
        }
        communicationManager2.consumeVsshService(i36, Integer.parseInt(strQd) != 0 ? null : sbAppend.append(strIndexOf3).toString(), recoveryModel.getHeaders(), this.body);
    }

    public final void a(RegisterModel registerModel) throws CommunicationException, IOException {
        HashMap map;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iLastIndexOf;
        String str2;
        int i11;
        Map<String, Object> map2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iLastIndexOf2;
        CoreSecurityHelper coreSecurityHelper;
        String password;
        String str3;
        char c2;
        String publicKey;
        String strEncryptRsa;
        int iXd;
        CoreAuthenticationImp coreAuthenticationImp;
        HashMap map3;
        char c3;
        Map<String, Object> map4;
        int iXd2;
        int i20;
        int iLastIndexOf3;
        JsonParser jsonParser;
        String str4;
        int i21;
        Gson gson;
        String json;
        char c4;
        Map<String, Object> map5;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iLastIndexOf4;
        int iXd3;
        String json2;
        String str5;
        char c5;
        PrintStream printStream;
        StringBuilder sb;
        String str6;
        int i28;
        int i29;
        int iXd4;
        int i30;
        int i31;
        int i32;
        int iLastIndexOf5;
        int i33;
        int iXd5;
        String str7;
        int iXd6;
        int i34;
        int iXd7;
        int i35;
        int iLastIndexOf6;
        int iXd8;
        String str8;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int iLastIndexOf7;
        Map<String, Object> map6;
        String str9;
        int i43;
        String string;
        CommunicationHelper communicationHelper;
        CoreAuthenticationImp coreAuthenticationImp2;
        CoreAuthenticationImp coreAuthenticationImp3;
        String str10;
        int i44;
        int i45;
        CommunicationManager communicationManager;
        int i46;
        int i47;
        int i48;
        CoreAuthenticationImp coreAuthenticationImp4;
        int i49;
        CommunicationManager communicationManager2;
        int iXd9;
        int i50;
        int i51;
        StringBuilder sbAppend;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int iXd10;
        int iXd11;
        int iXd12;
        String strLastIndexOf;
        String string2;
        Map<String, String> headers;
        CoreSecurityHelper coreSecurityHelper2 = new CoreSecurityHelper();
        String strQd = C1561oA.Qd(ExifInterface.LONGITUDE_EAST, (short) (ZN.Xd() ^ (1228843845 ^ 1228841663)));
        int i57 = Integer.parseInt(strQd);
        int i58 = 4;
        String strZd = C1593ug.zd("+/", (short) (OY.Xd() ^ ((2016599473 ^ 492864692) ^ 1699889118)), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1663501996 ^ (-1387141436)))));
        if (i57 != 0) {
            str = strQd;
            i2 = 8;
            map = null;
        } else {
            this.f18334b = coreSecurityHelper2;
            map = new HashMap();
            i2 = 4;
            str = strZd;
        }
        int i59 = 0;
        if (i2 != 0) {
            this.principalData = map;
            str = strQd;
            i3 = 0;
        } else {
            i3 = i2 + 10;
            map = null;
        }
        int iLastIndexOf8 = 1;
        if (Integer.parseInt(str) != 0) {
            i4 = i3 + 8;
            i5 = 1;
        } else {
            i4 = i3 + 9;
            i5 = 120;
            str = strZd;
        }
        int iXd13 = C1580rY.Xd() ^ (2040873807 ^ (-1210865493));
        if (i4 != 0) {
            str = strQd;
            i6 = 0;
            i7 = 6;
        } else {
            i6 = i4 + iXd13;
            i7 = 1;
        }
        int iXd14 = 13;
        if (Integer.parseInt(str) != 0) {
            i8 = i6 + 15;
            i9 = 0;
        } else {
            i5 += i7;
            i8 = i6 + 13;
            i9 = 8;
            str = strZd;
        }
        if (i8 != 0) {
            i10 = i9 + i9 + i9;
            str = strQd;
        } else {
            i10 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            iLastIndexOf = 1;
        } else {
            i5 /= i10;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i10 = iLastIndexOf;
        }
        int iXd15 = C1499aX.Xd() ^ (247531900 ^ (-1297772142));
        String strLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i5, (iLastIndexOf * iXd15) % i10 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(FB.Xd() ^ (957837568 ^ 1727536753), C1561oA.od(":d,3bUYo]\u00190VNMh_if\"\u001fNI\u0019\u001a\u0007\u0006M\u0010D\u001cDA\u0005\u0007N@", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (379417225 ^ 1365297646))))) : C1561oA.Kd("FSOG\u000e\u0016\u000e\u0017}\n\u0011y\u001c\u0017\u0012", (short) (FB.Xd() ^ (1769036554 ^ 1769043548))));
        if (Integer.parseInt(strQd) != 0) {
            str2 = strQd;
            i11 = 1353229667 ^ 1353229669;
        } else {
            map.put(strLastIndexOf2, registerModel.getApplicationCode());
            str2 = strZd;
            i11 = iXd15;
        }
        if (i11 != 0) {
            map2 = this.principalData;
            str2 = strQd;
        } else {
            map2 = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i14 = 4;
            i12 = 0;
            i13 = 0;
        } else {
            i12 = 8;
            i13 = 8;
            str2 = strZd;
            i14 = iXd15;
        }
        char c6 = '\f';
        if (i14 != 0) {
            i16 = i12 + i13 + i12;
            str2 = strQd;
            i17 = 3;
            i15 = 0;
        } else {
            i15 = i14 + 12;
            i16 = 1;
            i17 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i18 = i15 + iXd13;
        } else {
            i16 += i17 + i17;
            i18 = i15 + 10;
            str2 = strZd;
        }
        int i60 = 16;
        if (i18 != 0) {
            str2 = strQd;
            i19 = 16;
        } else {
            i19 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            iLastIndexOf2 = 1;
        } else {
            i16 /= i19;
            iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i19 = iLastIndexOf2;
        }
        String strLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i16, (iLastIndexOf2 * 4) % i19 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1082977378 ^ 1082977322, Wg.Zd("K\n\u001diH\u001fkH\u0007\\\u0006&O[yE?p9LR^\u0018F%7\u001fK!\u000fc)9\u001d,S7\u0005C", (short) (C1607wl.Xd() ^ (542494082 ^ 542488141)), (short) (C1607wl.Xd() ^ (1217134604 ^ 1217145018)))) : C1561oA.Xd("wdl*,:=/", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (932632364 ^ (-1506967675))))));
        if (Integer.parseInt(strQd) != 0) {
            str3 = strQd;
            c2 = 7;
            coreSecurityHelper = null;
            password = null;
        } else {
            coreSecurityHelper = this.f18334b;
            password = registerModel.getPassword();
            str3 = strZd;
            c2 = '\f';
        }
        if (c2 != 0) {
            password = EncodeHelper.getHexSha256FromString(password);
            publicKey = registerModel.getPublicKey();
            str3 = strQd;
        } else {
            publicKey = null;
        }
        if (Integer.parseInt(str3) != 0) {
            strEncryptRsa = null;
            iXd = Od.Xd() ^ 1207800915;
        } else {
            strEncryptRsa = coreSecurityHelper.encryptRsa(password, KeyHelper.getPublicKeyFromString(KeyHelper.buildPublicKeyAsString(publicKey)));
            str3 = strZd;
            iXd = 3;
        }
        if (iXd != 0) {
            map2.put(strLastIndexOf3, strEncryptRsa);
            coreAuthenticationImp = this;
            str3 = strQd;
        } else {
            coreAuthenticationImp = null;
        }
        if (Integer.parseInt(str3) != 0) {
            c3 = '\r';
            map3 = null;
        } else {
            map3 = new HashMap();
            str3 = strZd;
            c3 = 7;
        }
        if (c3 != 0) {
            coreAuthenticationImp.body = map3;
            map4 = this.body;
            str3 = strQd;
        } else {
            map4 = null;
        }
        int iXd16 = Integer.parseInt(str3) != 0 ? 1 : OY.Xd() ^ 69929144;
        if (Integer.parseInt(strQd) != 0) {
            i20 = 0;
            iXd2 = OY.Xd() ^ 69929198;
        } else {
            iXd16 += 4;
            iXd2 = 4;
            i20 = 8;
        }
        if (iXd2 != 0) {
            iXd16 /= i20 + i20;
            iLastIndexOf3 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        } else {
            iLastIndexOf3 = 1;
        }
        String strLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd16, (iLastIndexOf3 * 2) % iLastIndexOf3 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ (1179899115 ^ 1977215594), Wg.vd("籠艚", (short) (OY.Xd() ^ ((1353405316 ^ 1952038116) ^ 619887496)))) : Qg.kd("\b$\u0013\u0010`RCNC۰ZIN", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1629345446 ^ 357337631))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (866482473 ^ (-1816790020))))));
        if (Integer.parseInt(strQd) != 0) {
            str4 = strQd;
            jsonParser = null;
            i21 = (1851338975 ^ 527651252) ^ 1898602848;
        } else {
            jsonParser = new JsonParser();
            str4 = strZd;
            i21 = (362966325 ^ 654084907) ^ 861857303;
        }
        if (i21 != 0) {
            gson = new Gson();
            str4 = strQd;
        } else {
            gson = null;
        }
        if (Integer.parseInt(str4) != 0) {
            c4 = 14;
            json = null;
        } else {
            json = gson.toJson(this.principalData);
            str4 = strZd;
            c4 = '\r';
        }
        if (c4 != 0) {
            map4.put(strLastIndexOf4, jsonParser.parse(json));
            str4 = strQd;
        }
        if (Integer.parseInt(str4) != 0) {
            i22 = 0;
            map5 = null;
        } else {
            map5 = this.body;
            i22 = 1979413330 ^ 1979413312;
            str4 = strZd;
            c6 = 7;
        }
        if (c6 != 0) {
            i23 = i22 << 4;
            str4 = strQd;
        } else {
            i23 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i25 = 1;
            i24 = (220532036 ^ 1602538099) ^ 1386334012;
        } else {
            i24 = 4;
            i25 = 8;
            str4 = strZd;
        }
        if (i24 != 0) {
            i23 += i25 + 4;
            str4 = strQd;
            i26 = 0;
        } else {
            i26 = i24 + 8;
            i60 = 0;
        }
        if (Integer.parseInt(str4) != 0) {
            i27 = i26 + 14;
        } else {
            i23 /= i60 << 2;
            i27 = i26 + 4;
        }
        if (i27 != 0) {
            iLastIndexOf4 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd3 = C1607wl.Xd() ^ 1849955295;
        } else {
            iLastIndexOf4 = 1;
            iXd3 = 1;
        }
        String strLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i23, (iLastIndexOf4 * iXd3) % iLastIndexOf4 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf((726977514 ^ 1536430508) ^ 1891686962, hg.Vd("\u0012\u001b\u0012ZR\u001b\u001a\u0014\u001bT\"\u0013\u0014RM\u0016\u0010OFzB<\b6\u007fy}\u007fs\u000e\b\u0005\u0002vkk", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (827664478 ^ (-1594956007)))), (short) (C1580rY.Xd() ^ (979084403 ^ (-979096435))))) : C1561oA.ud("HE7<z\u0010\u000erw|f\u0004jw", (short) (C1633zX.Xd() ^ (1909047503 ^ (-1909061654)))));
        JsonParser jsonParser2 = Integer.parseInt(strQd) != 0 ? null : new JsonParser();
        Gson gson2 = new Gson();
        if (Integer.parseInt(strQd) != 0) {
            str5 = strQd;
            c5 = '\b';
            json2 = null;
        } else {
            json2 = gson2.toJson(registerModel.getAdditionalData());
            str5 = strZd;
            c5 = 14;
        }
        if (c5 != 0) {
            map5.put(strLastIndexOf5, jsonParser2.parse(json2));
            str5 = strQd;
        }
        if (Integer.parseInt(str5) != 0) {
            printStream = null;
            sb = null;
        } else {
            printStream = System.out;
            sb = new StringBuilder();
        }
        if (Integer.parseInt(strQd) != 0) {
            str6 = strQd;
            i28 = 1;
            i29 = 1;
            iXd4 = (293094951 ^ 349125285) ^ 95911049;
        } else {
            str6 = strZd;
            i28 = 3;
            i29 = 3;
            iXd4 = OY.Xd() ^ 69929185;
        }
        int i61 = (1560731685 ^ 1832353759) ^ 808558450;
        if (iXd4 != 0) {
            i61 += i28 + i28 + i29;
            str6 = strQd;
        }
        if (Integer.parseInt(str6) != 0) {
            i30 = 0;
            i31 = 0;
            i32 = (1539854007 ^ 972262117) ^ 1648084052;
        } else {
            i30 = 8;
            i31 = 8;
            str6 = strZd;
            i32 = 1346128660 ^ 1346128657;
        }
        if (i32 != 0) {
            i61 /= i30 + (i30 + i31);
            str6 = strQd;
        }
        if (Integer.parseInt(str6) != 0) {
            iLastIndexOf5 = 1;
            i33 = 1;
        } else {
            iLastIndexOf5 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            i33 = iXd15;
        }
        String strLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i61, (i33 * iLastIndexOf5) % iLastIndexOf5 == 0 ? C1561oA.yd("\u0012\u0017~\u0004<Glx\u0001`rm<C0Lp28C8\u007fo8QCIGH9\u0002J\u0017\u0006$CWEV@EQ\u001aY", (short) (C1607wl.Xd() ^ ((1506010257 ^ 284600406) ^ 1228240382))) : VsshCoreManagerImp.AnonymousClass1.lastIndexOf(Od.Xd() ^ 1207800952, C1561oA.Yd("ievys&>g\u00024.\u007f\u0003@3GznB338F@FO|MCDC\u000b]Q\u001f\u001b", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (369228111 ^ (-663271818)))))));
        if (Integer.parseInt(strQd) != 0) {
            str7 = strQd;
            iXd5 = FB.Xd() ^ (1728793955 ^ 954475099);
        } else {
            sb = sb.append(strLastIndexOf6);
            strLastIndexOf6 = registerModel.getApi();
            iXd5 = 8;
            str7 = strZd;
        }
        if (iXd5 != 0) {
            sb = sb.append(strLastIndexOf6);
            str7 = strQd;
        }
        if (Integer.parseInt(str7) != 0) {
            iXd6 = 1;
            i34 = 1;
            iXd7 = OY.Xd() ^ (617034114 ^ 552352108);
        } else {
            iXd6 = C1499aX.Xd() ^ (-1134257976);
            str7 = strZd;
            i34 = 3;
            iXd7 = 13;
        }
        if (iXd7 != 0) {
            iXd6 += i34 + i34;
            str7 = strQd;
        }
        if (Integer.parseInt(str7) != 0) {
            i35 = 1;
            iXd14 = C1633zX.Xd() ^ (345955215 ^ (-1624227775));
        } else {
            i35 = 8;
        }
        if (iXd14 != 0) {
            iXd6 /= i35 + 4;
            iLastIndexOf6 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        } else {
            iLastIndexOf6 = 4;
        }
        String strLastIndexOf7 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd6, (iLastIndexOf6 * 3) % iLastIndexOf6 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(1194610170 ^ 1194610101, Xg.qd("TJ{\u0014\u0019\u0018\u001aLDTRR!FT\u001c\u0010X\n\u0011\fb+\\)\u001d\u0013b\\%\\-`[d%o!9", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1465613691 ^ 348131849))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831083408)))) : Jg.Wd("e\b\u0010\u0016\u0018\u000b(g[34\".|\u0010t\u0017\u00039([`", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1018222392 ^ 1391770451))), (short) (C1607wl.Xd() ^ ((873678878 ^ 1722166329) ^ 1387601172))));
        int i62 = Integer.parseInt(strQd);
        int iXd17 = C1580rY.Xd() ^ (-831067150);
        int i63 = 21;
        if (i62 != 0) {
            str8 = strQd;
            i37 = 0;
            i36 = 0;
            iXd8 = C1499aX.Xd() ^ (-1134257942);
        } else {
            sb = sb.append(strLastIndexOf7);
            iXd8 = 8;
            str8 = strZd;
            i36 = iXd17;
            i37 = 21;
        }
        if (iXd8 != 0) {
            i39 = i37 * i36;
            str8 = strQd;
            i40 = 4;
            i41 = iXd15;
            i38 = 0;
        } else {
            i38 = iXd8 + 12;
            i39 = 1;
            i40 = 1;
            i41 = 1;
        }
        if (Integer.parseInt(str8) != 0) {
            i42 = i38 + 14;
            i63 = 0;
        } else {
            i39 += i40 << i41;
            i42 = i38 + 13;
            str8 = strZd;
        }
        if (i42 != 0) {
            i39 /= i63 << 2;
            str8 = strQd;
        }
        if (Integer.parseInt(str8) != 0) {
            iXd15 = 1;
            iLastIndexOf7 = 1;
        } else {
            iLastIndexOf7 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        String strLastIndexOf8 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i39, (iLastIndexOf7 * iXd15) % iLastIndexOf7 != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(14, ZO.xd("Ὠ\udf51", (short) (C1580rY.Xd() ^ (2088371447 ^ (-2088382377))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (430171982 ^ (-495493281)))))) : C1626yg.Ud("\u001e\u001eW:2mc'&\u0016-\u001f", (short) (FB.Xd() ^ (166830027 ^ 166839512)), (short) (FB.Xd() ^ (640438671 ^ 640442832))));
        if (Integer.parseInt(strQd) != 0) {
            str9 = strQd;
            map6 = null;
            i43 = 213421714 ^ 213421716;
        } else {
            sb = sb.append(strLastIndexOf8);
            map6 = this.body;
            str9 = strZd;
            i43 = 1516604416 ^ 1516604421;
        }
        if (i43 != 0) {
            string = sb.append(map6.toString()).toString();
            str9 = strQd;
        } else {
            string = null;
        }
        if (Integer.parseInt(str9) != 0) {
            communicationHelper = null;
            coreAuthenticationImp2 = null;
        } else {
            printStream.println(string);
            communicationHelper = CommunicationHelper.getInstance();
            coreAuthenticationImp2 = this;
        }
        coreAuthenticationImp2.f18335c = communicationHelper.getCommunicationManager();
        CommunicationManager communicationManager3 = this.f18335c;
        if (communicationManager3 == null) {
            int iLastIndexOf9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            throw new CommunicationException(VsshCoreManagerImp.AnonymousClass1.lastIndexOf(3, (iLastIndexOf9 * 5) % iLastIndexOf9 == 0 ? Ig.wd("N0y\u0017\u0005)Nh\u001f\u000b\u0013y\"\u001e\u001e\t+_g/n.{\b_\\mqLF0:d\u0002", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (2123498568 ^ (-282491845))))) : BuildConfig.AnonymousClass1.indexOf(EO.Od("2[\u0001P9m\f@+\u0019\u0016\u00074uk\u0013\u0017FwV\u0015dg\nB,\u0011\u0014Y\u001eo\u007fe\u0015dZ", (short) (ZN.Xd() ^ (464243053 ^ 464240906))), iXd17)));
        }
        if (Integer.parseInt(strQd) != 0) {
            str10 = strQd;
            i44 = 4;
            coreAuthenticationImp3 = null;
        } else {
            communicationManager3.setEnableRequestWithSSLPinning(true);
            coreAuthenticationImp3 = this;
            str10 = strZd;
            i44 = 3;
        }
        if (i44 != 0) {
            coreAuthenticationImp3.f18335c.isResponseEncrypted(true);
            str10 = strQd;
            i45 = 0;
        } else {
            i45 = i44 + 15;
        }
        if (Integer.parseInt(str10) != 0) {
            i46 = i45 + 8;
            communicationManager = null;
        } else {
            communicationManager = this.f18335c;
            i46 = i45 + 7;
            str10 = strZd;
        }
        if (i46 != 0) {
            communicationManager.disableSecureRequest(false);
            communicationManager = this.f18335c;
            str10 = strQd;
            i47 = 0;
        } else {
            i47 = i46 + 7;
        }
        if (Integer.parseInt(str10) != 0) {
            i48 = i47 + ((1522202758 ^ 1594391443) ^ 95585043);
            coreAuthenticationImp4 = null;
        } else {
            communicationManager.addSessionIdInEncryptedData(true);
            i48 = i47 + 13;
            coreAuthenticationImp4 = this;
            str10 = strZd;
        }
        if (i48 != 0) {
            coreAuthenticationImp4.f18335c.setCallback(this);
            str10 = strQd;
            i49 = 0;
        } else {
            i49 = i48 + 13;
        }
        if (Integer.parseInt(str10) != 0) {
            iXd9 = i49 + (C1607wl.Xd() ^ (1825222728 ^ 42902425));
            i50 = 0;
            communicationManager2 = null;
        } else {
            communicationManager2 = this.f18335c;
            iXd9 = i49 + 3;
            str10 = strZd;
            i50 = 1;
        }
        if (iXd9 != 0) {
            sbAppend = new StringBuilder();
            str10 = strQd;
            i51 = 0;
        } else {
            i51 = iXd9 + 12;
            i50 = 1;
            sbAppend = null;
        }
        if (Integer.parseInt(str10) != 0) {
            i52 = i51 + 15;
        } else {
            sbAppend = sbAppend.append(registerModel.getApi());
            i52 = i51 + (1856915368 ^ 1856915374);
            str10 = strZd;
        }
        if (i52 != 0) {
            i54 = 23;
            str10 = strQd;
            i55 = 23;
            i53 = 0;
        } else {
            i53 = i52 + 14;
            i54 = 0;
            i55 = 0;
        }
        if (Integer.parseInt(str10) != 0) {
            iXd10 = i53 + 11;
            i58 = 1;
            i56 = 1;
            strZd = str10;
        } else {
            i56 = i54 + i55 + i55;
            iXd10 = i53 + (C1607wl.Xd() ^ 1849955283);
        }
        if (iXd10 != 0) {
            i56 += i58 + i58;
            strZd = strQd;
        } else {
            i59 = iXd10 + 7;
        }
        if (Integer.parseInt(strZd) != 0) {
            iXd11 = i59 + 8;
            iXd12 = 1;
        } else {
            iXd11 = i59 + (FB.Xd() ^ 1609527093);
            iXd12 = C1633zX.Xd() ^ (2128564139 ^ (-177089458));
        }
        if (iXd11 != 0) {
            i56 /= iXd12;
            iLastIndexOf8 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            iXd12 = iLastIndexOf8;
        }
        if ((iLastIndexOf8 * (294791758 ^ 294791755)) % iXd12 == 0) {
            short sXd = (short) (C1580rY.Xd() ^ (1246398378 ^ (-1246408787)));
            int[] iArr = new int["\u0017nY+!\u0017*\u001d$[\u0014\u001d\u001f\r\u001b\u001c]N)_MV".length()];
            QB qb = new QB("\u0017nY+!\u0017*\u001d$[\u0014\u001d\u001f\r\u001b\u001c]N)_MV");
            int i64 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i64] = xuXd.fK(sXd + sXd + sXd + i64 + xuXd.CK(iKK));
                i64++;
            }
            strLastIndexOf = new String(iArr, 0, i64);
        } else {
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1499aX.Xd() ^ (1828231341 ^ (-795082650)), C1593ug.zd("SI\u0018\u0015\u0007^\u000b\tP#O(X\"chc[P_ko\u0018h\u0017&l603 \u001d)=31=ej", (short) (C1607wl.Xd() ^ (1353868521 ^ 1353845083)), (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69942683))));
        }
        String strLastIndexOf9 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i56, strLastIndexOf);
        if (Integer.parseInt(strQd) != 0) {
            headers = null;
            string2 = null;
        } else {
            string2 = sbAppend.append(strLastIndexOf9).toString();
            headers = registerModel.getHeaders();
        }
        communicationManager2.consumeVsshService(i50, string2, headers, this.body);
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void clientHello(ClientHelloModel clientHelloModel, CoreAuthenticationCallback coreAuthenticationCallback) throws Throwable {
        int iXd;
        int i2;
        int i3;
        String strKd;
        int i4;
        String strLastIndexOf;
        String strOd = C1561oA.od("\u0013", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (505256401 ^ 798274112))));
        if (coreAuthenticationCallback != null) {
            this.callback = coreAuthenticationCallback;
            if (Integer.parseInt(strOd) == 0) {
                this.f18333a = coreAuthenticationCallback;
            }
            a(clientHelloModel);
            return;
        }
        String str = f18332e;
        int i5 = 12;
        int iLastIndexOf = 1;
        if (Integer.parseInt(strOd) != 0) {
            strKd = strOd;
            i3 = 12;
            iXd = 1;
            i2 = 1;
        } else {
            iXd = FB.Xd() ^ (238701519 ^ 1372922952);
            i2 = 916023844 ^ 916023840;
            i3 = (641639290 ^ 316571527) ^ 887151859;
            strKd = C1561oA.Kd("\u0017\u0018", (short) (ZN.Xd() ^ ((1255278971 ^ 1329675192) ^ 93520486)));
        }
        if (i3 != 0) {
            i4 = i2 + i2;
            strKd = strOd;
        } else {
            i4 = 1;
        }
        if (Integer.parseInt(strKd) != 0) {
            i5 = 0;
        } else {
            iXd += i2 + i4;
        }
        int i6 = i5 + i5;
        if (Integer.parseInt(strOd) == 0) {
            iXd /= i5 + i6;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * 3) % iLastIndexOf == 0) {
            strLastIndexOf = Wg.Zd("?~G\u00155~Y$x{Z\u0007O!\u001a^\u0006'5\t8y3H ", (short) (FB.Xd() ^ (FB.Xd() ^ (341283563 ^ 1270385547))), (short) (FB.Xd() ^ ((1795191265 ^ 178993357) ^ 1638600824)));
        } else {
            int iXd2 = C1499aX.Xd() ^ (1576408646 ^ (-510488869));
            short sXd = (short) (C1499aX.Xd() ^ ((2126983521 ^ 834433575) ^ (-1333483436)));
            int[] iArr = new int["#%Qb_\u0013'R![e\u0018\u0014$#\u001964[\u001f*r4<?:mge{(-uDs\u0006\f\u00046".length()];
            QB qb = new QB("#%Qb_\u0013'R![e\u0018\u0014$#\u001964[\u001f*r4<?:mge{(-uDs\u0006\f\u00046");
            int i7 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i7] = xuXd.fK(xuXd.CK(iKK) - (sXd + i7));
                i7++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd2, new String(iArr, 0, i7));
        }
        VsshLogger.logError(str, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd, strLastIndexOf));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void clientHello(ClientHelloModel clientHelloModel, LambdaSuccess<ClientHelloModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws Throwable {
        String strLastIndexOf;
        int i2;
        int iXd;
        int iXd2;
        String strUd;
        short sXd = (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1602490704 ^ 834690848)));
        int[] iArr = new int["1".length()];
        QB qb = new QB("1");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        if (lambdaSuccess != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(str) == 0) {
                this.f18336d = lambdaSuccess;
            }
            this.lambdaGenericResponse = lambdaSuccess2;
            a(clientHelloModel);
            return;
        }
        String str2 = f18332e;
        int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
        int i4 = 2;
        if ((iIndexOf * 2) % iIndexOf == 0) {
            strLastIndexOf = Qg.kd("\u007f\u0015\u0016\u0018 U\u0007\u0019\u0012M\b\nzx\u0001\u0002\u007fw;}q\u0001z{r", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (455654424 ^ (-1488162115)))), (short) (FB.Xd() ^ (1001430961 ^ 1001442395)));
        } else {
            short sXd2 = (short) (C1633zX.Xd() ^ ((549578748 ^ 1229850845) ^ (-1771014794)));
            short sXd3 = (short) (C1633zX.Xd() ^ (1512408130 ^ (-1512439023)));
            int[] iArr2 = new int["맿쁝".length()];
            QB qb2 = new QB("맿쁝");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(sXd2 + i5 + xuXd2.CK(iKK2) + sXd3);
                i5++;
            }
            strLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(2, new String(iArr2, 0, i5));
        }
        if (Integer.parseInt(str) != 0) {
            i2 = 1;
            iXd2 = 6;
            iXd = 1;
            strUd = str;
            i4 = 1;
        } else {
            i2 = 187;
            iXd = Od.Xd() ^ (495410899 ^ 1517996674);
            iXd2 = ZN.Xd() ^ (1258805759 ^ 2022565632);
            strUd = C1561oA.ud("\u000f\u0014", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (141279158 ^ (-1714406252)))));
        }
        if (iXd2 != 0) {
            i2 += iXd << i4;
        } else {
            str = strUd;
        }
        if (Integer.parseInt(str) == 0) {
            i2 /= 44;
        }
        VsshLogger.logError(str2, BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, i2));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void login(LoginModel loginModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException {
        Integer num;
        Integer num2;
        String str;
        int i2;
        String strIndexOf;
        int iXd;
        String str2;
        int iXd2;
        int i3;
        int iXd3 = 516367821 ^ 516367819;
        int i4 = 13;
        int iLastIndexOf = 1;
        short sXd = (short) (C1607wl.Xd() ^ ((1423725052 ^ 114294976) ^ 1376522513));
        int[] iArr = new int["QU".length()];
        QB qb = new QB("QU");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i5));
            i5++;
        }
        String str3 = new String(iArr, 0, i5);
        String strYd = C1561oA.Yd("P", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864682866)));
        if (coreAuthenticationCallback == null) {
            String str4 = f18332e;
            if (Integer.parseInt(strYd) != 0) {
                iXd = 1;
                str2 = strYd;
            } else {
                iXd3 = OY.Xd() ^ (1458811420 ^ 1389935351);
                iXd = C1607wl.Xd() ^ (268073411 ^ 1639868973);
                str2 = str3;
            }
            if (iXd3 != 0) {
                iLastIndexOf = iXd + 13;
                str2 = strYd;
            }
            if (Integer.parseInt(str2) != 0) {
                iXd2 = ZN.Xd() ^ 864698100;
                i3 = 1714151712 ^ 1714151721;
                str3 = str2;
            } else {
                iXd2 = 1739600967 ^ 1739600971;
                i3 = (1272266797 ^ 1383831479) ^ 430888861;
            }
            if (i3 != 0) {
                iLastIndexOf += iXd2;
            } else {
                strYd = str3;
            }
            int iXd4 = iLastIndexOf / (Integer.parseInt(strYd) != 0 ? 642028038 ^ 642028035 : ZN.Xd() ^ 864698111);
            int iLastIndexOf2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
            VsshLogger.logError(str4, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd4, (iLastIndexOf2 * 2) % iLastIndexOf2 == 0 ? Xg.qd("gzyyO\u0013BBI\u0003[[Z^LKG\u001e^(\u0012'\u0017\u001e+", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207821304)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134245980)))) : BuildConfig.AnonymousClass1.indexOf(Jg.Wd("}az^\f^\\8qCmV~.\b(f\fW!?n\u0014$\u0019c:\u0016nn\u0004DT/aL]Nw!O\"©㔸⊕\u0003/\u0019\t2L\"-", (short) (ZN.Xd() ^ (2096198510 ^ 2096184219)), (short) (ZN.Xd() ^ (1838788822 ^ 1838783170))), (205646088 ^ 1222325979) ^ 1151000490)));
            return;
        }
        this.callback = coreAuthenticationCallback;
        this.f18333a = coreAuthenticationCallback;
        if (ValidationsHelper.isValidLoginModel(loginModel)) {
            a(loginModel);
            return;
        }
        BaseVsshCoreCallback baseVsshCoreCallback = this.callback;
        if (Integer.parseInt(strYd) != 0) {
            num = null;
            str = strYd;
            num2 = null;
        } else {
            num = 0;
            num2 = VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE;
            i4 = (226260368 ^ 978490052) ^ 925820766;
            str = str3;
        }
        if (i4 != 0) {
            str = strYd;
        }
        if (Integer.parseInt(str) != 0) {
            i2 = 1;
        } else {
            i2 = 16;
            iXd3 = 11;
            str = str3;
        }
        int i6 = (547474136 ^ 1802046545) ^ 1271449561;
        if (iXd3 != 0) {
            i6 += i2;
        } else {
            strYd = str;
        }
        if (Integer.parseInt(strYd) == 0) {
            i6 /= 64;
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * 3) % iLastIndexOf == 0) {
            strIndexOf = ZO.xd(";\u0014\u001c\u0002;Q,6Ew&!G5;#<\n4\u001bt1", (short) (C1499aX.Xd() ^ ((177462436 ^ 795742083) ^ (-637390298))), (short) (C1499aX.Xd() ^ (966912182 ^ (-966891585))));
        } else {
            int iXd5 = C1580rY.Xd() ^ (-831063208);
            short sXd2 = (short) (C1607wl.Xd() ^ (2088580682 ^ 2088598225));
            short sXd3 = (short) (C1607wl.Xd() ^ iXd5);
            int[] iArr2 = new int["i//'\u0015Bh]'\u0006\u0005\b](P@'\u0016\u001b1R#+\tA0\u0001:qfg!\u001dK\u0002\u001f9j1".length()];
            QB qb2 = new QB("i//'\u0015Bh]'\u0006\u0005\b](P@'\u0016\u001b1R#+\tA0\u0001:qfg!\u001dK\u0002\u001f9j1");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i7 * sXd3))) + xuXd2.CK(iKK2));
                i7++;
            }
            strIndexOf = BuildConfig.AnonymousClass1.indexOf(new String(iArr2, 0, i7), ZN.Xd() ^ 864698056);
        }
        baseVsshCoreCallback.onCoreError(num, num2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i6, strIndexOf));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void login(LoginModel loginModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        String str;
        int i2;
        String str2;
        int i3;
        String strQd;
        String strWd = Ig.wd("C", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864691072))));
        if (lambdaSuccess != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            this.lambdaGenericResponse = lambdaSuccess;
            if (ValidationsHelper.isValidLoginModel(loginModel)) {
                a(loginModel);
                return;
            }
            CoreErrorModelResponse coreErrorModelResponse = new CoreErrorModelResponse();
            if (Integer.parseInt(strWd) != 0) {
                coreErrorModelResponse = null;
            } else {
                coreErrorModelResponse.setHttpErrorCode(0);
            }
            coreErrorModelResponse.setInternalErrorCode(VsshCoreConstants.INVALID_PRINCIPAL_DATA_CODE);
            int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
            if ((iIndexOf * 5) % iIndexOf != 0) {
                strQd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(C1499aX.Xd() ^ (2103946471 ^ (-1056754628)), EO.Od("~}p~\u0016`\n\u0012DA1/~U\u000eC\u001a4_*RPig1A[mj\u001e\u0004v\u000e..i Fg", (short) (ZN.Xd() ^ (1805685764 ^ 1805700144))));
            } else {
                strQd = C1561oA.Qd("]\u0003l\u0002\u0003\u0006~9ffiboezib%^aj]", (short) (C1633zX.Xd() ^ ((383548627 ^ 987056184) ^ (-738807263))));
            }
            coreErrorModelResponse.setErrorMessage(BuildConfig.AnonymousClass1.indexOf(strQd, (2025597875 ^ 733349276) ^ 1393176107));
            this.lambdaError.lambdaErrorResponse(coreErrorModelResponse);
            return;
        }
        String str3 = f18332e;
        int iIndexOf2 = BuildConfig.AnonymousClass1.indexOf();
        if ((iIndexOf2 * 5) % iIndexOf2 != 0) {
            str = VsshCoreManagerImp.AnonymousClass1.lastIndexOf((1464753798 ^ 902647679) ^ 1652756952, C1593ug.zd("0^+$\u001ela1\"-ia3`s|kc\u0003|1w7@+,JKp338~LO|", (short) (ZN.Xd() ^ (Od.Xd() ^ (727546049 ^ 1822488621))), (short) (ZN.Xd() ^ ((1837785758 ^ 747238008) ^ 1090774612))));
        } else {
            short sXd = (short) (ZN.Xd() ^ ((434557707 ^ 2109716826) ^ 1683558582));
            int[] iArr = new int["T{nlt,]_b$d^YW[VT\\\u0012ZR_QXa".length()];
            QB qb = new QB("T{nlt,]_b$d^YW[VT\\\u0012ZR_QXa");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
                i4++;
            }
            str = new String(iArr, 0, i4);
        }
        int i5 = Integer.parseInt(strWd);
        String strKd = C1561oA.Kd("~\u0006", (short) (OY.Xd() ^ ((1952054220 ^ 1421052970) ^ 552230442)));
        int iXd = OY.Xd() ^ 69929189;
        if (i5 != 0) {
            i3 = 101841350 ^ 101841352;
            i2 = 1;
            str2 = strWd;
        } else {
            i2 = 709379248 ^ 709379323;
            str2 = strKd;
            i3 = iXd;
        }
        if (i3 != 0) {
            str2 = strWd;
        }
        if (Integer.parseInt(str2) != 0) {
            strKd = str2;
        } else {
            i2 += 9;
            iXd = (1208073768 ^ 1712085961) ^ 772662763;
        }
        if (iXd == 0) {
            strWd = strKd;
        }
        if (Integer.parseInt(strWd) == 0) {
            i2 /= 45;
        }
        VsshLogger.logError(str3, BuildConfig.AnonymousClass1.indexOf(str, i2));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void recovery(RecoveryModel recoveryModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int iXd;
        String strKd;
        String strZd = Wg.Zd("R", (short) (C1499aX.Xd() ^ (231892384 ^ (-231878983))), (short) (C1499aX.Xd() ^ (1661767314 ^ (-1661769678))));
        if (coreAuthenticationCallback != null) {
            this.callback = coreAuthenticationCallback;
            if (Integer.parseInt(strZd) == 0) {
                this.f18333a = coreAuthenticationCallback;
            }
            a(recoveryModel);
            return;
        }
        String str2 = f18332e;
        int i7 = Integer.parseInt(strZd);
        short sXd = (short) (C1607wl.Xd() ^ ((525856024 ^ 632823375) ^ 988785173));
        int[] iArr = new int["ba".length()];
        QB qb = new QB("ba");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(xuXd.CK(iKK) - (sXd + i8));
            i8++;
        }
        String str3 = new String(iArr, 0, i8);
        int i9 = 4;
        int iLastIndexOf = 1;
        if (i7 != 0) {
            i3 = 263133328 ^ 263133343;
            str = strZd;
            i2 = 1;
            i4 = 1;
        } else {
            i2 = 80;
            i3 = 12;
            str = str3;
            i4 = 4;
        }
        if (i3 != 0) {
            i5 = i4 + i4;
            str = strZd;
        } else {
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            iXd = C1580rY.Xd() ^ (-831067160);
            i6 = 0;
        } else {
            i2 += i4 + i5;
            i6 = 10;
            iXd = 5;
            str = str3;
        }
        if (iXd != 0) {
            i2 /= i6 << 2;
        } else {
            strZd = str;
        }
        if (Integer.parseInt(strZd) != 0) {
            i9 = 1;
        } else {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * i9) % iLastIndexOf != 0) {
            int iXd2 = C1580rY.Xd() ^ (-831067258);
            short sXd2 = (short) (C1633zX.Xd() ^ (1015918112 ^ (-1015924912)));
            int[] iArr2 = new int["AVcrysՃuoV]F9\n\u001e60>(#DH7I\u0011>`\u0002w\u0004]\u0016\u0004[ziL65~d\u00197`TH]H[\u0006\u0005+\u0018ex(2\u0007\u0015\u001b\u0002yIkowL8@>\\hNiEk".length()];
            QB qb2 = new QB("AVcrysՃuoV]F9\n\u001e60>(#DH7I\u0011>`\u0002w\u0004]\u0016\u0004[ziL65~d\u00197`TH]H[\u0006\u0005+\u0018ex(2\u0007\u0015\u001b\u0002yIkowL8@>\\hNiEk");
            int i10 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i10] = xuXd2.fK((sXd2 ^ i10) + xuXd2.CK(iKK2));
                i10++;
            }
            strKd = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(iXd2, new String(iArr2, 0, i10));
        } else {
            strKd = Qg.kd("y\r\feY\u001dJHG\u0005aW^@H?\u001a\u000eN{\b\t~\n\u0007", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (396324907 ^ 1409578127))), (short) (C1580rY.Xd() ^ ((803212182 ^ 1393858909) ^ (-2096403787))));
        }
        VsshLogger.logError(str2, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, strKd));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void recovery(RecoveryModel recoveryModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        int i2;
        int i3;
        int iXd;
        String strYd;
        int i4;
        char c2;
        String strVd = hg.Vd("N", (short) (C1633zX.Xd() ^ (692723373 ^ (-692718314))), (short) (C1633zX.Xd() ^ (83438582 ^ (-83439955))));
        if (lambdaSuccess != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(strVd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess;
            }
            a(recoveryModel);
            return;
        }
        String str = f18332e;
        int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
        String strLastIndexOf = (iIndexOf * 3) % iIndexOf != 0 ? VsshCoreManagerImp.AnonymousClass1.lastIndexOf(FB.Xd() ^ (280162001 ^ 1331528153), C1561oA.ud("\u0006p@D<w8<$((,488\\c", (short) (C1499aX.Xd() ^ (822316672 ^ (-822319901))))) : C1561oA.yd("\u0014+6,4k\u0015/:s4.!\u001f+&4,q2*7109", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849963918)));
        if (Integer.parseInt(strVd) != 0) {
            iXd = C1633zX.Xd() ^ (-1951491123);
            strYd = strVd;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 3;
            i3 = 144;
            iXd = 11;
            strYd = C1561oA.Yd(",,", (short) (ZN.Xd() ^ (Od.Xd() ^ (255786792 ^ 1220758831))));
        }
        if (iXd != 0) {
            i2 += i2 + i2;
        } else {
            strVd = strYd;
        }
        if (Integer.parseInt(strVd) != 0) {
            i4 = 0;
            c2 = 7;
        } else {
            i3 += i2;
            i4 = 9;
            c2 = 14;
        }
        VsshLogger.logError(str, BuildConfig.AnonymousClass1.indexOf(strLastIndexOf, i3 / (c2 != 0 ? i4 + (i4 + i4) : 1)));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void register(RegisterModel registerModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException {
        String str;
        int i2;
        String strUd;
        int iXd;
        String strQd = Xg.qd("\u001b", (short) (C1607wl.Xd() ^ (1278358078 ^ 1278347861)), (short) (C1607wl.Xd() ^ ((160108627 ^ 469456887) ^ 309336705)));
        if (coreAuthenticationCallback != null) {
            this.callback = coreAuthenticationCallback;
            if (Integer.parseInt(strQd) == 0) {
                this.f18333a = coreAuthenticationCallback;
            }
            a(registerModel);
            return;
        }
        String str2 = f18332e;
        int iIndexOf = BuildConfig.AnonymousClass1.indexOf();
        if ((iIndexOf * 4) % iIndexOf != 0) {
            int i3 = (594163486 ^ 2023135503) ^ 1543286377;
            short sXd = (short) (Od.Xd() ^ (OY.Xd() ^ (897309786 ^ (-827359785))));
            short sXd2 = (short) (Od.Xd() ^ ((1001772630 ^ 1038439432) ^ (-105957197)));
            int[] iArr = new int["\u0012\u001dA3JN&Ux6\u0017Pa%;\u0002\nP`ww*\u001e$r'MH\"Nj5Ax#R".length()];
            QB qb = new QB("\u0012\u001dA3JN&Ux6\u0017Pa%;\u0002\nP`ww*\u001e$r'MH\"Nj5Ax#R");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
                i4++;
            }
            str = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i3, new String(iArr, 0, i4));
        } else {
            int iXd2 = C1580rY.Xd() ^ (423953906 ^ 684490684);
            int iXd3 = C1633zX.Xd() ^ (320975528 ^ 1735438838);
            short sXd3 = (short) (C1633zX.Xd() ^ iXd2);
            short sXd4 = (short) (C1633zX.Xd() ^ iXd3);
            int[] iArr2 = new int["\ru\u001f]q\u001996\u001c6a=l\u000bB/\u0016\u000bU;YD{*\t".length()];
            QB qb2 = new QB("\ru\u001f]q\u001996\u001c6a=l\u000bB/\u0016\u000bU;YD{*\t");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd4) + sXd3)));
                i5++;
            }
            str = new String(iArr2, 0, i5);
        }
        int i6 = Integer.parseInt(strQd);
        int iXd4 = C1633zX.Xd() ^ (1591624217 ^ (-714024492));
        int i7 = 5;
        if (i6 != 0) {
            iXd = Od.Xd() ^ 1207800927;
            strUd = strQd;
            i2 = 5;
        } else {
            i2 = 15;
            strUd = C1626yg.Ud("%", (short) (C1633zX.Xd() ^ ((1412841290 ^ 975559150) ^ (-1846773924))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864692298))));
            iXd = iXd4;
        }
        if (iXd == 0) {
            strQd = strUd;
        }
        if (Integer.parseInt(strQd) != 0) {
            i7 = 1;
        } else {
            i2 += 6;
            iXd4 = 5;
        }
        VsshLogger.logError(str2, BuildConfig.AnonymousClass1.indexOf(str, i2 / (iXd4 + i7)));
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthentication
    public void register(RegisterModel registerModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        int i2;
        int iXd;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        String strWd = Ig.wd("h", (short) (ZN.Xd() ^ ((781929249 ^ 2009501512) ^ 1499308956)));
        if (lambdaSuccess != null && lambdaError != null) {
            this.lambdaError = lambdaError;
            if (Integer.parseInt(strWd) == 0) {
                this.lambdaGenericResponse = lambdaSuccess;
            }
            a(registerModel);
            return;
        }
        String str3 = f18332e;
        int i6 = Integer.parseInt(strWd);
        int iXd2 = 14;
        String strOd = EO.Od("k4", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134254764)));
        int iLastIndexOf = 1;
        if (i6 != 0) {
            i3 = 14;
            str = strWd;
            i2 = 1;
            iXd = 1;
        } else {
            i2 = 1975711261 ^ 1975711233;
            iXd = ZN.Xd() ^ 864698099;
            i3 = 1503838972 ^ 1503838963;
            str = strOd;
        }
        if (i3 != 0) {
            i2 += iXd + iXd;
            str = strWd;
        }
        int i7 = 4;
        if (Integer.parseInt(str) != 0) {
            iXd2 = C1580rY.Xd() ^ (743043025 ^ (-499186634));
            i4 = 1;
            i5 = 1;
            strOd = str;
        } else {
            i4 = 4;
            i5 = 4;
        }
        if (iXd2 != 0) {
            i2 /= i4 + (i5 + i5);
        } else {
            strWd = strOd;
        }
        if (Integer.parseInt(strWd) != 0) {
            i7 = 1;
        } else {
            iLastIndexOf = VsshCoreManagerImp.AnonymousClass1.lastIndexOf();
        }
        if ((iLastIndexOf * i7) % iLastIndexOf != 0) {
            str2 = VsshCoreManagerImp.AnonymousClass1.lastIndexOf(ZN.Xd() ^ 864698067, C1561oA.Qd("3.\u001e$\u001a\u0011.+$!^TOe", (short) (OY.Xd() ^ (OY.Xd() ^ (2077107711 ^ 2145745807)))));
        } else {
            short sXd = (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609524540)));
            short sXd2 = (short) (C1633zX.Xd() ^ (311543913 ^ (-311545802)));
            int[] iArr = new int["DYZ6,q!!\"a@8A%/(\u0005z=lz}u\u0003\u0002".length()];
            QB qb = new QB("DYZ6,q!!\"a@8A%/(\u0005z=lz}u\u0003\u0002");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK((xuXd.CK(iKK) - (sXd + i8)) - sXd2);
                i8++;
            }
            str2 = new String(iArr, 0, i8);
        }
        VsshLogger.logError(str3, VsshCoreManagerImp.AnonymousClass1.lastIndexOf(i2, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    @Override // com.valid.vssh_android_core.basecore.BaseVsshCore, com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void successEvent(com.valid.communication.events.BaseSuccessEvent r14) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valid.vssh_android_core.authentication.CoreAuthenticationImp.successEvent(com.valid.communication.events.BaseSuccessEvent):void");
    }
}
