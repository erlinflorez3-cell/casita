package co.com.rbm.sdkqrcode.utils;

import co.com.rbm.sdkqrcode.BuildConfig;
import co.com.rbm.sdkqrcode.data.DataAmount;
import co.com.rbm.sdkqrcode.data.MerchantAUnreservedC;
import co.com.rbm.sdkqrcode.data.MerchantAccountInformationC;
import co.com.rbm.sdkqrcode.data.MerchantAdditionalDataC;
import co.com.rbm.sdkqrcode.data.MerchantInformationLanguageC;
import co.com.rbm.sdkqrcode.data.QrEntity;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;

/* JADX INFO: loaded from: classes4.dex */
public class PrinterData {

    public class IOException extends RuntimeException {
    }

    public static String checkNull(String str) {
        return str == null ? "" : str;
    }

    public static String concatResponse(QrEntity qrEntity) {
        MerchantAccountInformationC merchantAccountInformationC;
        String str;
        char c2;
        String str2;
        MerchantAUnreservedC merchantAUnreservedC;
        MerchantInformationLanguageC merchantInformationLanguageC;
        char c3;
        MerchantAdditionalDataC merchantAdditionalDataC;
        StringBuilder sb;
        char c4;
        int i2;
        String str3;
        char c5;
        int i3;
        int i4;
        char c6;
        char c7;
        int iConcat;
        int i5;
        int i6;
        char c8;
        String str4;
        int i7;
        int i8;
        char c9;
        String strCheckNull;
        char c10;
        int iConcat2;
        int i9;
        int i10;
        int i11;
        String str5;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String strCheckNull2;
        int i21;
        int iConcat3;
        int i22;
        int i23;
        String str6;
        int i24;
        char c11;
        char c12;
        String strCheckNull3;
        char c13;
        int iConcat4;
        int i25;
        int i26;
        String str7;
        char c14;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        String strCheckNull4;
        int i33;
        int iConcat5;
        int i34;
        int i35;
        char c15;
        String str8;
        int i36;
        int i37;
        char c16;
        String strCheckNull5;
        char c17;
        int iConcat6;
        int i38;
        int i39;
        String str9;
        int i40;
        char c18;
        int i41;
        int i42;
        String strCheckNull6;
        int i43;
        int iConcat7;
        int i44;
        int i45;
        String str10;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int iConcat8;
        int i53;
        int i54;
        String str11;
        int i55;
        char c19;
        char c20;
        int i56;
        char c21;
        int iConcat9;
        int i57;
        int i58;
        String str12;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int iConcat10;
        int i66;
        int i67;
        String str13;
        int i68;
        int i69;
        char c22;
        int i70;
        int i71;
        String strCheckNull7;
        int i72;
        int iConcat11;
        int i73;
        String str14;
        int i74;
        char c23;
        int i75;
        int i76;
        int i77;
        char c24;
        char c25;
        int i78;
        int i79;
        char c26;
        char c27;
        int i80;
        String str15;
        char c28;
        int i81;
        int i82;
        char c29;
        int i83;
        int i84;
        int i85;
        int i86;
        int iConcat12;
        int i87;
        int i88;
        String str16;
        int i89;
        char c30;
        char c31;
        String strCheckNull8;
        char c32;
        int iConcat13;
        int i90;
        int i91;
        String str17;
        char c33;
        char c34;
        int i92;
        int i93;
        char c35;
        int iConcat14;
        int i94;
        int i95;
        String str18;
        char c36;
        int i96;
        int i97;
        char c37;
        int i98;
        char c38;
        int iConcat15;
        int i99;
        int i100;
        String str19;
        int i101;
        char c39;
        int i102;
        char c40;
        int i103;
        char c41;
        int iConcat16;
        int i104;
        int i105;
        String str20;
        int i106;
        char c42;
        char c43;
        String strCheckNull9;
        char c44;
        int iConcat17;
        int i107;
        int i108;
        String str21;
        int i109;
        int i110;
        char c45;
        String strCheckNull10;
        char c46;
        int iConcat18;
        int i111;
        int i112;
        String str22;
        char c47;
        int i113;
        int i114;
        int i115;
        int i116;
        int i117;
        int iConcat19;
        int i118;
        String str23;
        int i119;
        int i120;
        int i121;
        int i122;
        int i123;
        int i124;
        int i125;
        int i126;
        int i127;
        int i128;
        String strCheckNull11;
        int i129;
        int iConcat20;
        int i130;
        int i131;
        String str24;
        char c48;
        char c49;
        char c50;
        String strCheckNull12;
        char c51;
        int iConcat21;
        int i132;
        int i133;
        String str25;
        char c52;
        int i134;
        int i135;
        char c53;
        int i136;
        int i137;
        String strCheckNull13;
        int i138;
        int iConcat22;
        int i139;
        String str26;
        int i140;
        char c54;
        int i141;
        char c55;
        int i142;
        char c56;
        String strCheckNull14;
        char c57;
        int iConcat23;
        int i143;
        String str27;
        int i144;
        char c58;
        int i145;
        int i146;
        char c59;
        char c60;
        String strCheckNull15;
        char c61;
        int iConcat24;
        int i147;
        int i148;
        String str28;
        int i149;
        char c62;
        int i150;
        char c63;
        int i151;
        char c64;
        char c65;
        int i152;
        String str29;
        char c66;
        int i153;
        char c67;
        String strCheckNull16;
        char c68;
        int iConcat25;
        int i154;
        int i155;
        int i156;
        String str30;
        char c69;
        int i157;
        int i158;
        char c70;
        char c71;
        String strCheckNull17;
        char c72;
        int iConcat26;
        int i159;
        int i160;
        String strEndsWith;
        int i161;
        String str31;
        int i162;
        int i163;
        int i164;
        int i165;
        int i166;
        int i167;
        String strCheckNull18;
        int i168;
        int iConcat27;
        int i169;
        int i170;
        String str32;
        char c73;
        int i171;
        char c74;
        int i172;
        char c75;
        char c76;
        int i173;
        String str33;
        char c77;
        int i174;
        String strCheckNull19;
        String str34;
        char c78;
        int iConcat28;
        int i175;
        int i176;
        String str35;
        int i177;
        char c79;
        char c80;
        String strCheckNull20;
        char c81;
        int iConcat29;
        int i178;
        int i179;
        String str36;
        char c82;
        int i180;
        int i181;
        int i182;
        int i183;
        int i184;
        int i185;
        int i186;
        int iConcat30;
        int i187;
        int i188;
        String str37;
        int i189;
        char c83;
        char c84;
        int iConcat31;
        int i190;
        int i191;
        String str38;
        int i192;
        char c85;
        String strCheckNull21;
        int iConcat32;
        int i193;
        int i194;
        String str39;
        int i195;
        int i196;
        int i197;
        int i198;
        int i199;
        int i200;
        int i201;
        int i202;
        int i203;
        int i204;
        String strCheckNull22;
        int i205;
        int iConcat33;
        int i206;
        int i207;
        String str40;
        char c86;
        char c87;
        int i208;
        int i209;
        char c88;
        int iConcat34;
        int i210;
        int i211;
        String str41;
        char c89;
        int i212;
        int i213;
        int i214;
        char c90;
        int iConcat35;
        int i215;
        int i216;
        String str42;
        int i217;
        char c91;
        char c92;
        String strCheckNull23;
        char c93;
        int iConcat36;
        int i218;
        int i219;
        String str43;
        int i220;
        int i221;
        char c94;
        int iConcat37;
        int i222;
        int i223;
        String str44;
        int i224;
        char c95;
        int i225;
        int i226;
        int i227;
        int i228;
        int iConcat38;
        String str45;
        int i229;
        String str46 = AdkSettings.PLATFORM_TYPE_MOBILE;
        char c96 = 15;
        char c97 = 5;
        String str47 = "17";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c2 = 5;
            merchantAccountInformationC = null;
            str = null;
        } else {
            merchantAccountInformationC = qrEntity.getMerchantAccountInformationC();
            str = "\n";
            c2 = 15;
            str2 = "17";
        }
        if (c2 != 0) {
            merchantAUnreservedC = qrEntity.getMerchantAUnreservedC();
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            merchantAccountInformationC = null;
            merchantAUnreservedC = null;
        }
        int i230 = 8;
        if (Integer.parseInt(str2) != 0) {
            c3 = '\r';
            merchantAUnreservedC = null;
            merchantInformationLanguageC = null;
        } else {
            merchantInformationLanguageC = qrEntity.getMerchantInformationLanguageC();
            c3 = '\b';
            str2 = "17";
        }
        if (c3 != 0) {
            merchantAdditionalDataC = qrEntity.getMerchantAdditionalDataC();
            str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            merchantAdditionalDataC = null;
            merchantInformationLanguageC = null;
        }
        char c98 = 14;
        if (Integer.parseInt(str2) != 0) {
            c4 = 14;
            sb = null;
            merchantAdditionalDataC = null;
        } else {
            sb = new StringBuilder();
            c4 = 11;
        }
        int i231 = 1;
        int iConcat39 = c4 != 0 ? BuildConfig.AnonymousClass1.concat() : 1;
        int i232 = 2;
        String strEndsWith2 = (iConcat39 * 2) % iConcat39 == 0 ? "`~wq#:.\u001fgekt0\u001a,5il\u007fys9`i" : DataAmount.AnonymousClass1.endsWith(27, "jenzzl\u007f~&3,#<oh%i4w!uf|7>=~w>wt#mc,=13)");
        int i233 = 3;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i2 = 1;
            i3 = 1;
            c5 = 11;
        } else {
            i2 = 64;
            str3 = "17";
            c5 = '\b';
            i3 = 3;
        }
        if (c5 != 0) {
            i2 += i3 + i3;
            str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        int i234 = 16;
        if (Integer.parseInt(str3) != 0) {
            c6 = 15;
            i4 = 1;
        } else {
            str3 = "17";
            i4 = 16;
            c6 = '\t';
        }
        if (c6 != 0) {
            strEndsWith2 = BuildConfig.AnonymousClass1.concat(strEndsWith2, i2 / (i4 + 8));
            str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        int i235 = 6;
        if (Integer.parseInt(str3) != 0) {
            c7 = '\r';
        } else {
            sb = sb.append(strEndsWith2);
            strEndsWith2 = qrEntity.getPayloadFormatIndicator();
            str3 = "17";
            c7 = 6;
        }
        if (c7 != 0) {
            sb = sb.append(checkNull(strEndsWith2)).append(str);
            str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str3) != 0) {
            iConcat = 1;
            i5 = 1;
        } else {
            iConcat = BuildConfig.AnonymousClass1.concat();
            i5 = 3;
        }
        String strConcat = (i5 * iConcat) % iConcat == 0 ? "aofp9\u0013-\u0013gqs\u007f$ *=o]zzu#?py" : BuildConfig.AnonymousClass1.concat("\u2fec7", 84);
        int i236 = 10;
        int i237 = 4;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i6 = 1;
            i7 = 1;
            i8 = 1;
            c8 = '\n';
        } else {
            i6 = 176;
            c8 = 15;
            str4 = "17";
            i7 = 4;
            i8 = 2;
        }
        if (c8 != 0) {
            i6 += i7 << i8;
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        char c99 = '\f';
        if (Integer.parseInt(str4) != 0) {
            c9 = '\t';
        } else {
            i6 /= 64;
            str4 = "17";
            c9 = '\f';
        }
        if (c9 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat, i6));
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str4) != 0) {
            c10 = 15;
            strCheckNull = null;
        } else {
            strCheckNull = checkNull(qrEntity.getPointOfInitiationMethod());
            str4 = "17";
            c10 = 14;
        }
        if (c10 != 0) {
            sb = sb.append(strCheckNull).append(str);
            str4 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str4) != 0) {
            iConcat2 = 1;
            i9 = 1;
        } else {
            iConcat2 = BuildConfig.AnonymousClass1.concat();
            i9 = 3;
        }
        String strEndsWith3 = (i9 * iConcat2) % iConcat2 == 0 ? "qSS%n" : DataAmount.AnonymousClass1.endsWith(30, "BP\u00104\u000e\f\u00048");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str5 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i11 = 8;
            i10 = 1;
        } else {
            i10 = 60;
            i11 = 5;
            str5 = "17";
        }
        int i238 = 0;
        if (i11 != 0) {
            str5 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i13 = 3;
            i14 = 3;
            i12 = 0;
        } else {
            i12 = i11 + 9;
            i13 = 1;
            i14 = 1;
        }
        if (Integer.parseInt(str5) != 0) {
            i15 = i12 + 12;
        } else {
            i10 = i13 + i13 + i14 + i10;
            i15 = i12 + 4;
            str5 = "17";
        }
        if (i15 != 0) {
            str5 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i17 = 5;
            i18 = 5;
            i16 = 0;
        } else {
            i16 = i15 + 6;
            i17 = 1;
            i18 = 1;
        }
        char c100 = 7;
        if (Integer.parseInt(str5) != 0) {
            i19 = i16 + 5;
        } else {
            i10 /= (i17 + i17) + i18;
            i19 = i16 + 7;
            str5 = "17";
        }
        if (i19 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith3, i10));
            str5 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i20 = 0;
        } else {
            i20 = i19 + 12;
        }
        if (Integer.parseInt(str5) != 0) {
            i21 = i20 + 5;
            strCheckNull2 = null;
        } else {
            strCheckNull2 = checkNull(qrEntity.getCrc());
            i21 = i20 + 9;
            str5 = "17";
        }
        if (i21 != 0) {
            sb = sb.append(strCheckNull2).append(str);
            str5 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str5) != 0) {
            iConcat3 = 1;
            i22 = 1;
        } else {
            iConcat3 = BuildConfig.AnonymousClass1.concat();
            i22 = 2;
        }
        String strEndsWith4 = (i22 * iConcat3) % iConcat3 != 0 ? DataAmount.AnonymousClass1.endsWith(51, "5 <-i{zy~s\"%1!") : "y{O~=.#+me<5";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str6 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i23 = 1;
            i24 = 1;
            c11 = '\t';
        } else {
            i23 = 40;
            str6 = "17";
            i24 = 2;
            c11 = '\f';
        }
        if (c11 != 0) {
            i23 = i24 + i24 + i23;
            str6 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str6) != 0) {
            c12 = '\f';
        } else {
            i23 /= 20;
            str6 = "17";
            c12 = 14;
        }
        if (c12 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith4, i23));
            str6 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str6) != 0) {
            c13 = '\t';
            strCheckNull3 = null;
        } else {
            strCheckNull3 = checkNull(merchantAccountInformationC.getIdAcquirer());
            str6 = "17";
            c13 = 6;
        }
        if (c13 != 0) {
            sb = sb.append(strCheckNull3).append(str);
            str6 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str6) != 0) {
            iConcat4 = 1;
            i25 = 1;
        } else {
            iConcat4 = BuildConfig.AnonymousClass1.concat();
            i25 = 2;
        }
        String strEndsWith5 = (i25 * iConcat4) % iConcat4 == 0 ? "eqgl9>\t6lrKp60*0n{$-" : DataAmount.AnonymousClass1.endsWith(4, "dzqe~-=:(!)mas");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str7 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c14 = '\r';
            i26 = 1;
        } else {
            i26 = 45;
            str7 = "17";
            c14 = '\f';
        }
        if (c14 != 0) {
            str7 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str7) != 0) {
            i27 = 9;
        } else {
            i26 += 9;
            str7 = "17";
            i27 = 4;
        }
        if (i27 != 0) {
            str7 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i29 = 9;
            i30 = 9;
            i28 = 0;
        } else {
            i28 = i27 + 10;
            i29 = 0;
            i30 = 0;
        }
        if (Integer.parseInt(str7) != 0) {
            i31 = i28 + 13;
        } else {
            i26 /= (i29 + i29) + i30;
            i31 = i28 + 8;
            str7 = "17";
        }
        if (i31 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith5, i26));
            str7 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i32 = 0;
        } else {
            i32 = i31 + 12;
        }
        if (Integer.parseInt(str7) != 0) {
            i33 = i32 + 14;
            strCheckNull4 = null;
        } else {
            strCheckNull4 = checkNull(merchantAccountInformationC.getUniqueCodeMerchant());
            i33 = i32 + 12;
            str7 = "17";
        }
        if (i33 != 0) {
            sb = sb.append(strCheckNull4).append(str);
            str7 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str7) != 0) {
            iConcat5 = 1;
            i34 = 1;
        } else {
            iConcat5 = BuildConfig.AnonymousClass1.concat();
            i34 = 5;
        }
        String strConcat2 = (i34 * iConcat5) % iConcat5 != 0 ? BuildConfig.AnonymousClass1.concat(".7/bj|a&%7;|d", 17) : "eqgl9>\t6lrKp60*0n{_j{9?sx";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str8 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i35 = 1;
            i36 = 1;
            i37 = 1;
            c15 = '\n';
        } else {
            i35 = 200;
            c15 = 15;
            str8 = "17";
            i36 = 4;
            i37 = 2;
        }
        if (c15 != 0) {
            i35 += i36 << i37;
            str8 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str8) != 0) {
            c16 = 6;
        } else {
            i35 /= 80;
            str8 = "17";
            c16 = 2;
        }
        if (c16 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat2, i35));
            str8 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str8) != 0) {
            c17 = 6;
            strCheckNull5 = null;
        } else {
            strCheckNull5 = checkNull(merchantAccountInformationC.getUniqueCodeMerchantAggre());
            c17 = 15;
            str8 = "17";
        }
        if (c17 != 0) {
            sb = sb.append(strCheckNull5).append(str);
            str8 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str8) != 0) {
            iConcat6 = 1;
            i38 = 1;
        } else {
            iConcat6 = BuildConfig.AnonymousClass1.concat();
            i38 = 3;
        }
        String strConcat3 = (i38 * iConcat6) % iConcat6 == 0 ? "|e}}%=%.Jyss\";1+B\u007f{k'l" : BuildConfig.AnonymousClass1.concat("(9;z0 .d$o=!gtz+f~h1x9.sl&m`$;q+*hvk9{;", 96);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str9 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i39 = 1;
            i40 = 1;
            c18 = 11;
        } else {
            i39 = 40;
            str9 = "17";
            i40 = 4;
            c18 = '\n';
        }
        if (c18 != 0) {
            i39 = i40 + i40 + i39;
            str9 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str9) != 0) {
            i41 = 8;
        } else {
            i39 /= 16;
            str9 = "17";
            i41 = 7;
        }
        if (i41 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat3, i39));
            str9 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i42 = 0;
        } else {
            i42 = i41 + 9;
        }
        if (Integer.parseInt(str9) != 0) {
            i43 = i42 + 13;
            strCheckNull6 = null;
        } else {
            strCheckNull6 = checkNull(qrEntity.getMerchantCategoryCode());
            i43 = i42 + 13;
            str9 = "17";
        }
        if (i43 != 0) {
            sb = sb.append(strCheckNull6).append(str);
            str9 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str9) != 0) {
            iConcat7 = 1;
            i44 = 1;
        } else {
            iConcat7 = BuildConfig.AnonymousClass1.concat();
            i44 = 2;
        }
        String strEndsWith6 = (i44 * iConcat7) % iConcat7 == 0 ? "sp{s8)3\u001agsc/d" : DataAmount.AnonymousClass1.endsWith(PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, "payn'>1-=pbzl");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str10 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i45 = 1;
            i46 = 9;
        } else {
            i45 = 50;
            str10 = "17";
            i46 = 4;
        }
        if (i46 != 0) {
            str10 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i48 = 4;
            i47 = 0;
        } else {
            i47 = i46 + 13;
            i48 = 1;
        }
        if (Integer.parseInt(str10) != 0) {
            i49 = i47 + 8;
            i50 = 0;
        } else {
            i45 += i48;
            i49 = i47 + 15;
            str10 = "17";
            i50 = 10;
        }
        if (i49 != 0) {
            strEndsWith6 = BuildConfig.AnonymousClass1.concat(strEndsWith6, i45 / (i50 + i50));
            str10 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i51 = 0;
        } else {
            i51 = i49 + 12;
        }
        if (Integer.parseInt(str10) != 0) {
            i52 = i51 + 6;
        } else {
            sb = sb.append(strEndsWith6);
            strEndsWith6 = qrEntity.getCountryCode();
            i52 = i51 + 13;
            str10 = "17";
        }
        if (i52 != 0) {
            sb = sb.append(checkNull(strEndsWith6)).append(str);
            str10 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str10) != 0) {
            iConcat8 = 1;
            i53 = 1;
        } else {
            iConcat8 = BuildConfig.AnonymousClass1.concat();
            i53 = 5;
        }
        String strConcat4 = (i53 * iConcat8) % iConcat8 == 0 ? "\u007fdb|&<\"/Dxer|u" : BuildConfig.AnonymousClass1.concat("7,6=sgxag829+~", 120);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str11 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i54 = 1;
            i55 = 1;
            c19 = 6;
        } else {
            i54 = 60;
            str11 = "17";
            i55 = 4;
            c19 = 7;
        }
        if (c19 != 0) {
            i55 = i55 + i55 + i55;
            str11 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str11) != 0) {
            i56 = 1;
            c20 = 6;
        } else {
            i54 += i55;
            str11 = "17";
            c20 = 4;
            i55 = 4;
            i56 = 2;
        }
        if (c20 != 0) {
            strConcat4 = BuildConfig.AnonymousClass1.concat(strConcat4, i54 / (i55 << i56));
            str11 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str11) != 0) {
            c21 = 7;
        } else {
            sb = sb.append(strConcat4);
            strConcat4 = qrEntity.getMerchantName();
            str11 = "17";
            c21 = 2;
        }
        if (c21 != 0) {
            sb = sb.append(checkNull(strConcat4)).append(str);
            str11 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str11) != 0) {
            iConcat9 = 1;
            i57 = 1;
        } else {
            iConcat9 = BuildConfig.AnonymousClass1.concat();
            i57 = 4;
        }
        String strConcat5 = (i57 * iConcat9) % iConcat9 != 0 ? BuildConfig.AnonymousClass1.concat("\u1a751", 38) : "}z|~$:$-K~rl~s";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str12 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i58 = 1;
            i59 = 12;
        } else {
            i58 = 40;
            str12 = "17";
            i59 = 2;
        }
        if (i59 != 0) {
            str12 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i61 = 4;
            i60 = 0;
        } else {
            i60 = i59 + 11;
            i61 = 1;
        }
        if (Integer.parseInt(str12) != 0) {
            i62 = i60 + 4;
            i63 = 0;
        } else {
            i58 += i61;
            i62 = i60 + 7;
            str12 = "17";
            i63 = 8;
        }
        if (i62 != 0) {
            strConcat5 = BuildConfig.AnonymousClass1.concat(strConcat5, i58 / (i63 + i63));
            str12 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i64 = 0;
        } else {
            i64 = i62 + 4;
        }
        if (Integer.parseInt(str12) != 0) {
            i65 = i64 + 15;
        } else {
            sb = sb.append(strConcat5);
            strConcat5 = qrEntity.getMerchantCity();
            i65 = i64 + 12;
            str12 = "17";
        }
        if (i65 != 0) {
            sb = sb.append(checkNull(strConcat5)).append(str);
            str12 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str12) != 0) {
            iConcat10 = 1;
            i66 = 1;
        } else {
            iConcat10 = BuildConfig.AnonymousClass1.concat();
            i66 = 5;
        }
        String strConcat6 = (i66 * iConcat10) % iConcat10 == 0 ? "ao|j,0\b5m}=6" : BuildConfig.AnonymousClass1.concat("\t\u0019h`RM( 6\u0011acrE(9,'\u000f7QBD\u007f\u001d\u001e\u000f<`ZLcV\t\u0013#\u0001RPoF+\u0013u\tE(pmw:;<nY[hU\u0007#\u0019\u0005meE_ q", 81);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str13 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i67 = 1;
            i68 = 1;
            i69 = 1;
            c22 = 11;
        } else {
            i67 = 345;
            str13 = "17";
            i68 = 4;
            i69 = 2;
            c22 = '\n';
        }
        if (c22 != 0) {
            i67 += i68 << i69;
            str13 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str13) != 0) {
            i70 = 5;
        } else {
            i67 /= 92;
            str13 = "17";
            i70 = 8;
        }
        if (i70 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat6, i67));
            str13 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i71 = 0;
        } else {
            i71 = i70 + 6;
        }
        if (Integer.parseInt(str13) != 0) {
            i72 = i71 + 8;
            strCheckNull7 = null;
        } else {
            strCheckNull7 = checkNull(qrEntity.getPostalCode());
            i72 = i71 + 3;
            str13 = "17";
        }
        if (i72 != 0) {
            sb = sb.append(strCheckNull7).append(str);
            str13 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str13) != 0) {
            iConcat11 = 1;
            i73 = 1;
        } else {
            iConcat11 = BuildConfig.AnonymousClass1.concat();
            i73 = 4;
        }
        String strEndsWith7 = (i73 * iConcat11) % iConcat11 == 0 ? "swos\">&c(" : DataAmount.AnonymousClass1.endsWith(47, "UM\\3\u001d\u000e.?\u0001Z\\~~\"m<3\u001d\f#\r^vo{t@>-\u0016\u0000>#lHkNZ\u001ca)\n\u00042FYLmrk\u000b(\u001e\u000ez$BJ;nnV\u0010>$\u0016=\"");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str14 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c23 = 14;
            i75 = 1;
            i74 = 0;
        } else {
            str14 = "17";
            i74 = 6;
            c23 = '\f';
            i75 = 12;
        }
        if (c23 != 0) {
            i76 = i74 << 2;
            str14 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i76 = 1;
        }
        if (Integer.parseInt(str14) != 0) {
            i77 = 1;
            c24 = 11;
        } else {
            i75 += i76;
            str14 = "17";
            i76 = 4;
            i77 = 4;
            c24 = 6;
        }
        if (c24 != 0) {
            i76 = i76 + i77 + i77;
            str14 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str14) != 0) {
            i78 = 0;
            c25 = 11;
        } else {
            i75 += i76;
            str14 = "17";
            c25 = 2;
            i78 = 6;
        }
        if (c25 != 0) {
            i79 = i78 + i78 + i78;
            str14 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i79 = 1;
        }
        if (Integer.parseInt(str14) != 0) {
            c26 = 6;
        } else {
            strEndsWith7 = BuildConfig.AnonymousClass1.concat(strEndsWith7, i75 / i79);
            str14 = "17";
            c26 = 7;
        }
        if (c26 != 0) {
            sb = sb.append(strEndsWith7);
            strEndsWith7 = merchantAUnreservedC.getChannel();
            str14 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str14) != 0) {
            c27 = '\f';
        } else {
            sb = sb.append(checkNull(strEndsWith7)).append(str);
            c27 = '\t';
        }
        int iConcat40 = c27 != 0 ? BuildConfig.AnonymousClass1.concat() : 1;
        String strConcat7 = (iConcat40 * 5) % iConcat40 == 0 ? "roaz$(\"5gQQW\u007ft" : BuildConfig.AnonymousClass1.concat("|{i\"31!b?y`9~p8(;/e5pa5>6!%,m(??);-~", 44);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str15 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i80 = 1;
            c28 = 11;
        } else {
            i80 = 20;
            str15 = "17";
            c28 = 6;
        }
        if (c28 != 0) {
            i80 = i80 + i80 + i80;
            str15 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str15) != 0) {
            i81 = 1;
            i82 = 1;
            c29 = 6;
        } else {
            i81 = i80 + 10;
            str15 = "17";
            i82 = 3;
            c29 = 7;
        }
        if (c29 != 0) {
            i81 = i82 + i82 + i81;
            str15 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str15) != 0) {
            i84 = 8;
            i83 = 1;
        } else {
            str15 = "17";
            i83 = 14;
            i84 = 4;
        }
        if (i84 != 0) {
            strConcat7 = BuildConfig.AnonymousClass1.concat(strConcat7, i81 / (7 + i83));
            str15 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i85 = 0;
        } else {
            i85 = i84 + 12;
        }
        if (Integer.parseInt(str15) != 0) {
            i86 = i85 + 12;
        } else {
            sb = sb.append(strConcat7);
            strConcat7 = merchantAUnreservedC.getConditionIVA();
            i86 = i85 + 2;
            str15 = "17";
        }
        if (i86 != 0) {
            sb = sb.append(checkNull(strConcat7)).append(str);
            str15 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str15) != 0) {
            iConcat12 = 1;
            i87 = 1;
        } else {
            iConcat12 = BuildConfig.AnonymousClass1.concat();
            i87 = 3;
        }
        String strConcat8 = (i87 * iConcat12) % iConcat12 == 0 ? "d`|j+\u0014::09" : BuildConfig.AnonymousClass1.concat("o\u007fxi,n0r+$'6z|4k.o1smz<*%7-\"atbghyo/", 32);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str16 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c30 = 15;
            i88 = 1;
            i89 = 1;
        } else {
            i88 = 117;
            str16 = "17";
            i89 = 4;
            c30 = 7;
        }
        if (c30 != 0) {
            i88 = i89 + i89 + i88;
            str16 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str16) != 0) {
            c31 = '\r';
        } else {
            i88 /= 26;
            str16 = "17";
            c31 = 14;
        }
        if (c31 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat8, i88));
            str16 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str16) != 0) {
            c32 = 7;
            strCheckNull8 = null;
        } else {
            strCheckNull8 = checkNull(merchantAUnreservedC.getValueIva());
            str16 = "17";
            c32 = 14;
        }
        if (c32 != 0) {
            sb = sb.append(strCheckNull8).append(str);
            str16 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str16) != 0) {
            iConcat13 = 1;
            i90 = 1;
        } else {
            iConcat13 = BuildConfig.AnonymousClass1.concat();
            i90 = 3;
        }
        String strConcat9 = (i90 * iConcat13) % iConcat13 == 0 ? "m\u007f~y\u0002,(b'" : BuildConfig.AnonymousClass1.concat("Rb'tU\f\u0010%\u0001_@5q\u0010\u001021\u0007Tqob\bj)\u000fTzMT6!\"\"\fxFST3\u0017 k8", 114);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str17 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c33 = '\b';
            i91 = 1;
        } else {
            i91 = 51;
            str17 = "17";
            c33 = '\f';
        }
        if (c33 != 0) {
            str17 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str17) != 0) {
            c34 = '\b';
            i92 = 0;
            i93 = 0;
        } else {
            i91 += 8;
            c34 = 15;
            str17 = "17";
            i92 = 17;
            i93 = 17;
        }
        if (c34 != 0) {
            strConcat9 = BuildConfig.AnonymousClass1.concat(strConcat9, i91 / (i92 + i93));
            str17 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str17) != 0) {
            c35 = '\b';
        } else {
            sb = sb.append(strConcat9);
            strConcat9 = merchantAUnreservedC.getBaseIva();
            str17 = "17";
            c35 = '\f';
        }
        if (c35 != 0) {
            sb = sb.append(checkNull(strConcat9)).append(str);
            str17 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str17) != 0) {
            iConcat14 = 1;
            i94 = 1;
        } else {
            iConcat14 = BuildConfig.AnonymousClass1.concat();
            i94 = 5;
        }
        String strEndsWith8 = (i94 * iConcat14) % iConcat14 != 0 ? DataAmount.AnonymousClass1.endsWith(92, "𬉣") : "qn~{')%4dPFT|u";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str18 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c36 = '\r';
            i95 = 1;
            i96 = 1;
        } else {
            i95 = 289;
            str18 = "17";
            c36 = 14;
            i96 = 4;
        }
        if (c36 != 0) {
            i96 = i96 + i96 + i96;
            str18 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str18) != 0) {
            c37 = 5;
            i97 = 1;
            i98 = 0;
        } else {
            i95 += i96;
            str18 = "17";
            i97 = 2;
            c37 = 11;
            i98 = 17;
        }
        if (c37 != 0) {
            strEndsWith8 = BuildConfig.AnonymousClass1.concat(strEndsWith8, i95 / (i98 << i97));
            str18 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str18) != 0) {
            c38 = '\n';
        } else {
            sb = sb.append(strEndsWith8);
            strEndsWith8 = merchantAUnreservedC.getConditionINC();
            str18 = "17";
            c38 = 11;
        }
        if (c38 != 0) {
            sb = sb.append(checkNull(strEndsWith8)).append(str);
            str18 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str18) != 0) {
            iConcat15 = 1;
            i99 = 1;
        } else {
            iConcat15 = BuildConfig.AnonymousClass1.concat();
            i99 = 3;
        }
        String strEndsWith9 = (i99 * iConcat15) % iConcat15 == 0 ? "gack(\u0015\u0005\u001938" : DataAmount.AnonymousClass1.endsWith(74, "* +)6*o{mk}");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str19 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i100 = 1;
            i101 = 1;
            c39 = 11;
        } else {
            i100 = 195;
            str19 = "17";
            i101 = 4;
            c39 = '\f';
        }
        if (c39 != 0) {
            i101 = i101 + i101 + i101;
            str19 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str19) != 0) {
            i103 = 1;
            c40 = '\t';
            i102 = 0;
        } else {
            i100 += i101;
            i102 = 15;
            str19 = "17";
            c40 = '\r';
            i103 = 2;
        }
        if (c40 != 0) {
            strEndsWith9 = BuildConfig.AnonymousClass1.concat(strEndsWith9, i100 / (i102 << i103));
            str19 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str19) != 0) {
            c41 = 6;
        } else {
            sb = sb.append(strEndsWith9);
            strEndsWith9 = merchantAUnreservedC.getValueINC();
            str19 = "17";
            c41 = 2;
        }
        if (c41 != 0) {
            sb = sb.append(checkNull(strEndsWith9)).append(str);
            str19 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str19) != 0) {
            iConcat16 = 1;
            i104 = 1;
        } else {
            iConcat16 = BuildConfig.AnonymousClass1.concat();
            i104 = 2;
        }
        String strEndsWith10 = (i104 * iConcat16) % iConcat16 != 0 ? DataAmount.AnonymousClass1.endsWith(56, "ozq1g4ueg|-vf*5f<vpbuz!?;u=76pl1z\u007f)n*pd") : "pm\u007f$&*$3eNh`\b8 n#";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str20 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i105 = 1;
            i106 = 1;
            c42 = 6;
        } else {
            i105 = 99;
            str20 = "17";
            i106 = 2;
            c42 = 3;
        }
        if (c42 != 0) {
            i105 = i106 + i106 + i105;
            str20 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str20) != 0) {
            c43 = '\b';
        } else {
            i105 /= 18;
            str20 = "17";
            c43 = '\r';
        }
        if (c43 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith10, i105));
            str20 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str20) != 0) {
            c44 = 6;
            strCheckNull9 = null;
        } else {
            strCheckNull9 = checkNull(merchantAUnreservedC.getConditionTaxOne());
            str20 = "17";
            c44 = '\n';
        }
        if (c44 != 0) {
            sb = sb.append(strCheckNull9).append(str);
            str20 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str20) != 0) {
            iConcat17 = 1;
            i107 = 1;
        } else {
            iConcat17 = BuildConfig.AnonymousClass1.concat();
            i107 = 3;
        }
        String strEndsWith11 = (i107 * iConcat17) % iConcat17 != 0 ? DataAmount.AnonymousClass1.endsWith(87, "|{wf(u29}u9, 4:1-:/n)x7fpwh(w8m7y>bq") : "d~vR\">py";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str21 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c97 = '\r';
            i108 = 1;
            i109 = 1;
            i110 = 1;
        } else {
            i108 = 130;
            str21 = "17";
            i109 = 4;
            i110 = 2;
        }
        if (c97 != 0) {
            i108 += i109 << i110;
            str21 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str21) != 0) {
            c45 = '\t';
        } else {
            i108 /= 52;
            str21 = "17";
            c45 = '\n';
        }
        if (c45 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith11, i108));
            str21 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str21) != 0) {
            c46 = 7;
            strCheckNull10 = null;
        } else {
            strCheckNull10 = checkNull(merchantAUnreservedC.getTaxOne());
            str21 = "17";
            c46 = '\t';
        }
        if (c46 != 0) {
            sb = sb.append(strCheckNull10).append(str);
            str21 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str21) != 0) {
            iConcat18 = 1;
            i111 = 1;
        } else {
            iConcat18 = BuildConfig.AnonymousClass1.concat();
            i111 = 3;
        }
        String strConcat10 = (i111 * iConcat18) % iConcat18 == 0 ? "lqcx\". 7iBdl\u0017%.j\u007f" : BuildConfig.AnonymousClass1.concat("m~1 }7'a5(e\"z\u007fg/ch|2#t3ui5&c8$xjx<3!e#v", 125);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str22 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i112 = 1;
            c47 = 7;
        } else {
            i112 = 30;
            str22 = "17";
            c47 = 6;
        }
        if (c47 != 0) {
            str22 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str22) != 0) {
            i114 = 1;
            i113 = 9;
            i115 = 0;
        } else {
            i112 += 8;
            str22 = "17";
            i113 = 4;
            i114 = 2;
            i115 = 6;
        }
        if (i113 != 0) {
            strConcat10 = BuildConfig.AnonymousClass1.concat(strConcat10, i112 / (i115 << i114));
            str22 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i116 = 0;
        } else {
            i116 = i113 + 8;
        }
        if (Integer.parseInt(str22) != 0) {
            i117 = i116 + 12;
        } else {
            sb = sb.append(strConcat10);
            strConcat10 = merchantAUnreservedC.getConditionTaxTwo();
            i117 = i116 + 14;
            str22 = "17";
        }
        if (i117 != 0) {
            sb = sb.append(checkNull(strConcat10)).append(str);
            str22 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str22) != 0) {
            iConcat19 = 1;
            i118 = 1;
        } else {
            iConcat19 = BuildConfig.AnonymousClass1.concat();
            i118 = 4;
        }
        String strConcat11 = (i118 * iConcat19) % iConcat19 == 0 ? "f`hK92v{" : BuildConfig.AnonymousClass1.concat("\u0005/o6hn+v,,g#v4ds3<> 9\u007f;hk!9!{", 67);
        int i239 = 18;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str23 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i120 = 1;
            i119 = 6;
        } else {
            str23 = "17";
            i119 = 8;
            i120 = 18;
        }
        if (i119 != 0) {
            i120 = i120 + i120 + i120;
            str23 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i121 = 0;
        } else {
            i121 = i119 + 6;
        }
        if (Integer.parseInt(str23) != 0) {
            i123 = i121 + 12;
            i122 = 1;
            i124 = 1;
        } else {
            i122 = i120 + 9;
            i123 = i121 + 6;
            str23 = "17";
            i124 = 2;
        }
        if (i123 != 0) {
            i122 = i124 + i124 + i122;
            str23 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i125 = 0;
            i126 = 7;
        } else {
            i125 = i123 + 14;
            i126 = 0;
        }
        if (Integer.parseInt(str23) != 0) {
            i127 = i125 + 7;
        } else {
            i122 /= i126 + i126;
            i127 = i125 + 6;
            str23 = "17";
        }
        if (i127 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat11, i122));
            str23 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i128 = 0;
        } else {
            i128 = i127 + 8;
        }
        if (Integer.parseInt(str23) != 0) {
            i129 = i128 + 11;
            strCheckNull11 = null;
        } else {
            strCheckNull11 = checkNull(merchantAUnreservedC.getTaxTwo());
            i129 = i128 + 2;
            str23 = "17";
        }
        if (i129 != 0) {
            sb = sb.append(strCheckNull11).append(str);
            str23 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str23) != 0) {
            iConcat20 = 1;
            i130 = 1;
        } else {
            iConcat20 = BuildConfig.AnonymousClass1.concat();
            i130 = 2;
        }
        String strEndsWith12 = (i130 * iConcat20) % iConcat20 != 0 ? DataAmount.AnonymousClass1.endsWith(67, "rm.r2e6\u007fek%z%` ?7<\u007fyo. $6c\"?8osm5{$ul/&") : "pm\u007f3*=8(bllL57+'bquyp gl";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str24 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c48 = '\b';
            i131 = 1;
        } else {
            i131 = 75;
            str24 = "17";
            c48 = 14;
        }
        if (c48 != 0) {
            str24 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str24) != 0) {
            c49 = 5;
        } else {
            i131 += 12;
            c49 = 15;
            str24 = "17";
        }
        if (c49 != 0) {
            str24 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str24) != 0) {
            c50 = '\r';
        } else {
            i131 /= 15;
            str24 = "17";
            c50 = 14;
        }
        if (c50 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith12, i131));
            str24 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str24) != 0) {
            c51 = 15;
            strCheckNull12 = null;
        } else {
            strCheckNull12 = checkNull(merchantAUnreservedC.getConsecutiveTransaction());
            str24 = "17";
            c51 = 7;
        }
        if (c51 != 0) {
            sb = sb.append(strCheckNull12).append(str);
            str24 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str24) != 0) {
            iConcat21 = 1;
            i132 = 1;
        } else {
            iConcat21 = BuildConfig.AnonymousClass1.concat();
            i132 = 2;
        }
        String strConcat12 = (i132 * iConcat21) % iConcat21 != 0 ? BuildConfig.AnonymousClass1.concat("bwsbzwm5x1\"(aslg%5*{hk\u007f?6*o,}m%4fw8\"%w8", 22) : "`gr5=79%Mslt#le";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str25 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c52 = 4;
            i133 = 1;
        } else {
            i133 = 20;
            str25 = "17";
            c52 = 6;
        }
        if (c52 != 0) {
            i133 = i133 + i133 + i133;
            str25 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str25) != 0) {
            i134 = 1;
            i135 = 1;
            c53 = 11;
        } else {
            i134 = i133 + 10;
            str25 = "17";
            i135 = 2;
            c53 = 7;
        }
        if (c53 != 0) {
            i134 = i135 + i135 + i134;
            str25 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str25) != 0) {
            i136 = 4;
        } else {
            i134 /= 14;
            str25 = "17";
            i136 = 3;
        }
        if (i136 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat12, i134));
            str25 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i137 = 0;
        } else {
            i137 = i136 + 10;
        }
        if (Integer.parseInt(str25) != 0) {
            i138 = i137 + 6;
            strCheckNull13 = null;
        } else {
            strCheckNull13 = checkNull(merchantAUnreservedC.getSecurityField());
            i138 = i137 + 15;
            str25 = "17";
        }
        if (i138 != 0) {
            sb = sb.append(strCheckNull13).append(str);
            str25 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str25) != 0) {
            iConcat22 = 1;
            i139 = 1;
        } else {
            iConcat22 = BuildConfig.AnonymousClass1.concat();
            i139 = 5;
        }
        String strEndsWith13 = (i139 * iConcat22) % iConcat22 == 0 ? "}aay8=,?Yjbp &&<bu%." : DataAmount.AnonymousClass1.endsWith(17, "3gbpcrn'>-:8mf");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str26 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c54 = 15;
            i234 = 1;
            i140 = 0;
        } else {
            str26 = "17";
            i140 = 8;
            c54 = 3;
        }
        if (c54 != 0) {
            i141 = i140 << 2;
            str26 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i141 = 1;
        }
        if (Integer.parseInt(str26) != 0) {
            i142 = 1;
            c55 = '\n';
        } else {
            i234 += i141;
            str26 = "17";
            c55 = 14;
            i141 = 3;
            i142 = 3;
        }
        if (c55 != 0) {
            i234 = i141 + i142 + i234;
            str26 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str26) != 0) {
            c56 = '\r';
        } else {
            i234 /= 16;
            str26 = "17";
            c56 = 5;
        }
        if (c56 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith13, i234));
            str26 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str26) != 0) {
            c57 = 4;
            strCheckNull14 = null;
        } else {
            strCheckNull14 = checkNull(merchantInformationLanguageC.getLanguagePreference());
            str26 = "17";
            c57 = 3;
        }
        if (c57 != 0) {
            sb = sb.append(strCheckNull14).append(str);
            str26 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str26) != 0) {
            iConcat23 = 1;
            i143 = 1;
        } else {
            iConcat23 = BuildConfig.AnonymousClass1.concat();
            i143 = 3;
        }
        String strEndsWith14 = (i143 * iConcat23) % iConcat23 != 0 ? DataAmount.AnonymousClass1.endsWith(63, "\u1b64a") : "}z|~$:$-Fvkp\u0005?64ra\u007fyy\u0007;'?rwbqyr";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str27 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i144 = 1;
            c58 = 6;
        } else {
            str27 = "17";
            i144 = 18;
            c58 = 3;
        }
        if (c58 != 0) {
            i144 += i144 + i144;
            str27 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str27) != 0) {
            i145 = 1;
            i146 = 1;
            c59 = '\t';
        } else {
            i145 = i144 + 9;
            str27 = "17";
            i146 = 4;
            c59 = '\f';
        }
        if (c59 != 0) {
            i145 += i146 + i146;
            str27 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str27) != 0) {
            c60 = 14;
        } else {
            i145 /= 28;
            str27 = "17";
            c60 = 11;
        }
        if (c60 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith14, i145));
            str27 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str27) != 0) {
            c61 = '\n';
            strCheckNull15 = null;
        } else {
            strCheckNull15 = checkNull(merchantInformationLanguageC.getMerchantNameAlternateLanguage());
            str27 = "17";
            c61 = 3;
        }
        if (c61 != 0) {
            sb = sb.append(strCheckNull15).append(str);
            str27 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str27) != 0) {
            iConcat24 = 1;
            i147 = 1;
        } else {
            iConcat24 = BuildConfig.AnonymousClass1.concat();
            i147 = 5;
        }
        String strEndsWith15 = (i147 * iConcat24) % iConcat24 == 0 ? "~gc#'?#(Hs}a\u0006:11q|`dz\u0002<\"<\u007fxor|u" : DataAmount.AnonymousClass1.endsWith(100, "my'$:(v1pepjbk/$7{\"emw u|! ?c\">8e.<l");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str28 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c62 = '\r';
            i148 = 1;
            i149 = 1;
        } else {
            i148 = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
            str28 = "17";
            i149 = 3;
            c62 = 6;
        }
        if (c62 != 0) {
            i149 = i149 + i149 + i149;
            str28 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str28) != 0) {
            i150 = 0;
            c63 = 7;
        } else {
            i148 += i149;
            str28 = "17";
            i150 = 14;
            c63 = '\n';
        }
        if (c63 != 0) {
            i151 = i150 + i150 + i150;
            str28 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i151 = 1;
        }
        if (Integer.parseInt(str28) != 0) {
            c64 = '\t';
        } else {
            strEndsWith15 = BuildConfig.AnonymousClass1.concat(strEndsWith15, i148 / i151);
            str28 = "17";
            c64 = 14;
        }
        if (c64 != 0) {
            sb = sb.append(strEndsWith15);
            strEndsWith15 = merchantInformationLanguageC.getMerchantCityAlternateLanguage();
            str28 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str28) != 0) {
            c65 = '\f';
        } else {
            sb = sb.append(checkNull(strEndsWith15)).append(str);
            c65 = 7;
        }
        int iConcat41 = c65 != 0 ? BuildConfig.AnonymousClass1.concat() : 1;
        String strConcat13 = (iConcat41 * 2) % iConcat41 == 0 ? "ph|s\u0000(!9ok27" : BuildConfig.AnonymousClass1.concat(">.ck\u007ft;*18pe", 33);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str29 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i152 = 1;
            i153 = 1;
            c66 = 6;
        } else {
            i152 = 72;
            str29 = "17";
            c66 = '\r';
            i153 = 2;
        }
        if (c66 != 0) {
            i152 += i153 + i153;
            str29 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str29) != 0) {
            c67 = '\b';
        } else {
            i152 /= 18;
            str29 = "17";
            c67 = '\n';
        }
        if (c67 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strConcat13, i152));
            str29 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str29) != 0) {
            c68 = 14;
            strCheckNull16 = null;
        } else {
            strCheckNull16 = checkNull(merchantAdditionalDataC.getBillNumber());
            str29 = "17";
            c68 = '\f';
        }
        if (c68 != 0) {
            sb = sb.append(strCheckNull16).append(str);
            str29 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str29) != 0) {
            iConcat25 = 1;
            i154 = 1;
        } else {
            iConcat25 = BuildConfig.AnonymousClass1.concat();
            i154 = 5;
        }
        String strEndsWith16 = (i154 * iConcat25) % iConcat25 != 0 ? DataAmount.AnonymousClass1.endsWith(51, "5) ;icpd~o.?") : "ylp(<:\u0000(ayokrw";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str30 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c69 = 15;
            i156 = 1;
            i155 = 0;
        } else {
            i155 = 23;
            i156 = 46;
            str30 = "17";
            c69 = 6;
        }
        if (c69 != 0) {
            i157 = i155 << 2;
            str30 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i157 = 1;
        }
        if (Integer.parseInt(str30) != 0) {
            i158 = 1;
            c70 = 5;
        } else {
            i156 += i157;
            str30 = "17";
            i157 = 4;
            i158 = 2;
            c70 = 6;
        }
        if (c70 != 0) {
            i156 += i157 << i158;
            str30 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str30) != 0) {
            c71 = 15;
        } else {
            i156 /= 24;
            str30 = "17";
            c71 = 11;
        }
        if (c71 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith16, i156));
            str30 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str30) != 0) {
            c72 = '\t';
            strCheckNull17 = null;
        } else {
            strCheckNull17 = checkNull(merchantAdditionalDataC.getMobileNumber());
            c72 = 15;
            str30 = "17";
        }
        if (c72 != 0) {
            sb = sb.append(strCheckNull17).append(str);
            str30 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str30) != 0) {
            iConcat26 = 1;
            i159 = 1;
        } else {
            iConcat26 = BuildConfig.AnonymousClass1.concat();
            i159 = 3;
        }
        if ((i159 * iConcat26) % iConcat26 == 0) {
            strEndsWith = "au\u007fm+\u0011-9ou27";
            i160 = 17;
        } else {
            i160 = 17;
            strEndsWith = DataAmount.AnonymousClass1.endsWith(17, "Vd\u0006-4<}(");
        }
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str31 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i162 = 8;
            i161 = 1;
            i163 = 1;
        } else {
            i161 = 99;
            str31 = "17";
            i162 = 4;
            i163 = 3;
        }
        if (i162 != 0) {
            i161 += i163 + i163;
            str31 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i164 = 0;
            i165 = 11;
        } else {
            i164 = i162 + 10;
            i165 = 0;
        }
        if (Integer.parseInt(str31) != 0) {
            i166 = i164 + 6;
        } else {
            i161 /= i165 + i165;
            i166 = i164 + 7;
            str31 = "17";
        }
        if (i166 != 0) {
            sb = sb.append(BuildConfig.AnonymousClass1.concat(strEndsWith, i161));
            str31 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i167 = 0;
        } else {
            i167 = i166 + 10;
        }
        if (Integer.parseInt(str31) != 0) {
            i168 = i167 + 9;
            strCheckNull18 = null;
        } else {
            strCheckNull18 = checkNull(merchantAdditionalDataC.getStoreLabel());
            i168 = i167 + 3;
            str31 = "17";
        }
        if (i168 != 0) {
            sb = sb.append(strCheckNull18).append(str);
            str31 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str31) != 0) {
            iConcat27 = 1;
            i169 = 1;
        } else {
            iConcat27 = BuildConfig.AnonymousClass1.concat();
            i169 = 2;
        }
        String strEndsWith17 = (i169 * iConcat27) % iConcat27 == 0 ? "}ov\u007f!(2\u0014|ues7nc" : DataAmount.AnonymousClass1.endsWith(72, "(>-)92y~uaeu!");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str32 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c73 = 4;
            i170 = 1;
            i171 = 1;
        } else {
            i170 = 187;
            str32 = "17";
            c73 = 14;
            i171 = 3;
        }
        if (c73 != 0) {
            i171 = i171 + i171 + i171;
            str32 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str32) != 0) {
            c74 = '\n';
            i160 = 0;
        } else {
            i170 += i171;
            str32 = "17";
            c74 = 3;
        }
        if (c74 != 0) {
            i172 = i160 + i160 + i160;
            str32 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i172 = 1;
        }
        if (Integer.parseInt(str32) != 0) {
            c75 = 7;
        } else {
            strEndsWith17 = BuildConfig.AnonymousClass1.concat(strEndsWith17, i170 / i172);
            str32 = "17";
            c75 = 3;
        }
        if (c75 != 0) {
            sb = sb.append(strEndsWith17);
            strEndsWith17 = merchantAdditionalDataC.getLoyaltyNumber();
            str32 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str32) != 0) {
            c76 = 5;
        } else {
            sb = sb.append(checkNull(strEndsWith17)).append(str);
            c76 = 11;
        }
        int iConcat42 = c76 != 0 ? BuildConfig.AnonymousClass1.concat() : 1;
        String strConcat14 = (iConcat42 * 2) % iConcat42 != 0 ? BuildConfig.AnonymousClass1.concat("\nb<c\u007f;x+3q4vaa7><1munjh54<jt,", PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) : "`dvz<8\"8oUiu#9~s";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str33 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i173 = 1;
            i174 = 1;
            c77 = 6;
        } else {
            i173 = 144;
            str33 = "17";
            c77 = 2;
            i174 = 3;
        }
        if (c77 != 0) {
            i173 += i174 + i174;
            str33 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str33) == 0) {
            i173 /= 32;
        }
        StringBuilder sbAppend = sb.append(BuildConfig.AnonymousClass1.concat(strConcat14, i173));
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str34 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c78 = 4;
            strCheckNull19 = null;
        } else {
            strCheckNull19 = checkNull(merchantAdditionalDataC.getReferenceLabel());
            str34 = "17";
            c78 = '\b';
        }
        if (c78 != 0) {
            sbAppend = sbAppend.append(strCheckNull19).append(str);
            str34 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str34) != 0) {
            iConcat28 = 1;
            i175 = 1;
        } else {
            iConcat28 = BuildConfig.AnonymousClass1.concat();
            i175 = 2;
        }
        String strConcat15 = (i175 * iConcat28) % iConcat28 != 0 ? BuildConfig.AnonymousClass1.concat("I?Q&;?j;", 15) : "pwb4 3(.G{k}+le";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str35 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i176 = 1;
            i177 = 1;
            c79 = '\t';
        } else {
            i176 = 165;
            str35 = "17";
            i177 = 4;
            c79 = '\f';
        }
        if (c79 != 0) {
            i176 += i177 + i177;
            str35 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str35) != 0) {
            c80 = 14;
        } else {
            i176 /= 30;
            str35 = "17";
            c80 = 7;
        }
        if (c80 != 0) {
            sbAppend = sbAppend.append(BuildConfig.AnonymousClass1.concat(strConcat15, i176));
            str35 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str35) != 0) {
            c81 = '\n';
            strCheckNull20 = null;
        } else {
            strCheckNull20 = checkNull(merchantAdditionalDataC.getCustomerLabel());
            str35 = "17";
            c81 = 11;
        }
        if (c81 != 0) {
            sbAppend = sbAppend.append(strCheckNull20).append(str);
            str35 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str35) != 0) {
            iConcat29 = 1;
            i178 = 1;
        } else {
            iConcat29 = BuildConfig.AnonymousClass1.concat();
            i178 = 5;
        }
        String strConcat16 = (i178 * iConcat29) % iConcat29 == 0 ? "`f`,91/1@zh|$mf" : BuildConfig.AnonymousClass1.concat("&{duh:={!,/h,z2&5!oh$.h /m*qn~45#:  ", 38);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str36 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i179 = 1;
            c82 = 6;
        } else {
            i179 = 85;
            str36 = "17";
            c82 = 7;
        }
        if (c82 != 0) {
            str36 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str36) != 0) {
            i180 = 8;
            i182 = 1;
            i181 = 6;
        } else {
            i179 += 6;
            str36 = "17";
            i180 = 4;
            i181 = 5;
            i182 = 5;
        }
        if (i180 != 0) {
            i181 = i181 + i182 + i182;
            str36 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i183 = 0;
        } else {
            i183 = i180 + 7;
        }
        if (Integer.parseInt(str36) != 0) {
            i184 = i183 + 13;
        } else {
            strConcat16 = BuildConfig.AnonymousClass1.concat(strConcat16, i179 / i181);
            i184 = i183 + 12;
            str36 = "17";
        }
        if (i184 != 0) {
            sbAppend = sbAppend.append(strConcat16);
            strConcat16 = merchantAdditionalDataC.getTerminalLabel();
            str36 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i185 = 0;
        } else {
            i185 = i184 + 12;
        }
        if (Integer.parseInt(str36) != 0) {
            i186 = i185 + 4;
        } else {
            sbAppend = sbAppend.append(checkNull(strConcat16)).append(str);
            i186 = i185 + 15;
        }
        if (i186 != 0) {
            iConcat30 = BuildConfig.AnonymousClass1.concat();
            i187 = 3;
        } else {
            iConcat30 = 1;
            i187 = 1;
        }
        String strConcat17 = (i187 * iConcat30) % iConcat30 != 0 ? BuildConfig.AnonymousClass1.concat("Wzd0w+<:>d9{b%=d4ppcj>)5/ze}ire<& -", 117) : "Cwc0 -(\u0013mN{y)%$7w{n~%n";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str37 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i188 = 1;
            i189 = 1;
            c83 = 6;
        } else {
            i188 = 154;
            str37 = "17";
            i189 = 3;
            c83 = '\f';
        }
        if (c83 != 0) {
            i188 += i189 + i189;
            str37 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str37) != 0) {
            c84 = '\r';
        } else {
            i188 /= 28;
            str37 = "17";
            c84 = 11;
        }
        if (c84 != 0) {
            sbAppend = sbAppend.append(BuildConfig.AnonymousClass1.concat(strConcat17, i188));
            str37 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        StringBuilder sbAppend2 = sbAppend.append(Integer.parseInt(str37) != 0 ? null : checkNull(merchantAdditionalDataC.getPurposeOfTransaction())).append(str);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            iConcat31 = 1;
            i190 = 1;
        } else {
            iConcat31 = BuildConfig.AnonymousClass1.concat();
            i190 = 4;
        }
        String strEndsWith18 = (i190 * iConcat31) % iConcat31 != 0 ? DataAmount.AnonymousClass1.endsWith(106, "jgw4>37?7mcse|") : "q{jt82%7i{Ez* 7<e}Zlh*\b,)rsv`yr";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str38 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i191 = 1;
            i192 = 1;
            c85 = '\n';
        } else {
            i191 = 32;
            str38 = "17";
            i192 = 4;
            c85 = 6;
        }
        if (c85 != 0) {
            i191 += i192 + i192;
            str38 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str38) != 0) {
            c96 = 4;
        } else {
            i191 /= 16;
            str38 = "17";
        }
        if (c96 != 0) {
            sbAppend2 = sbAppend2.append(BuildConfig.AnonymousClass1.concat(strEndsWith18, i191));
            str38 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str38) != 0) {
            c100 = '\b';
            strCheckNull21 = null;
        } else {
            strCheckNull21 = checkNull(merchantAdditionalDataC.getAdditionalConsumerDataRequest());
            str38 = "17";
        }
        if (c100 != 0) {
            sbAppend2 = sbAppend2.append(strCheckNull21).append(str);
            str38 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str38) != 0) {
            iConcat32 = 1;
            i193 = 1;
        } else {
            iConcat32 = BuildConfig.AnonymousClass1.concat();
            i193 = 4;
        }
        String strConcat18 = (i193 * iConcat32) % iConcat32 != 0 ? BuildConfig.AnonymousClass1.concat("ao`h458*~yr", 66) : "{llr8;*,nykW6 351md6;";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str39 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i195 = 4;
            i194 = 1;
        } else {
            i194 = 36;
            str39 = "17";
            i195 = 11;
        }
        if (i195 != 0) {
            i194 += i194 + i194;
            str39 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i196 = 0;
        } else {
            i196 = i195 + 12;
        }
        if (Integer.parseInt(str39) != 0) {
            i198 = i196 + 6;
            i197 = 1;
            i199 = 1;
            i200 = 1;
        } else {
            i197 = i194 + 18;
            i198 = i196 + 12;
            str39 = "17";
            i199 = 4;
            i200 = 2;
        }
        if (i198 != 0) {
            i197 += i199 << i200;
            str39 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i202 = 0;
            i201 = 11;
        } else {
            i201 = 11;
            i202 = i198 + 11;
            i239 = 0;
        }
        if (Integer.parseInt(str39) != 0) {
            i203 = i202 + i201;
        } else {
            i197 /= i239 << 2;
            i203 = i202 + 6;
            str39 = "17";
        }
        if (i203 != 0) {
            sbAppend2 = sbAppend2.append(BuildConfig.AnonymousClass1.concat(strConcat18, i197));
            str39 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i204 = 0;
        } else {
            i204 = i203 + 9;
        }
        if (Integer.parseInt(str39) != 0) {
            i205 = i204 + 9;
            strCheckNull22 = null;
        } else {
            strCheckNull22 = checkNull(qrEntity.getTransactionCurrency());
            i205 = i204 + 11;
            str39 = "17";
        }
        if (i205 != 0) {
            sbAppend2 = sbAppend2.append(strCheckNull22).append(str);
            str39 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str39) != 0) {
            iConcat33 = 1;
            i206 = 1;
        } else {
            iConcat33 = BuildConfig.AnonymousClass1.concat();
            i206 = 5;
        }
        String strConcat19 = (i206 * iConcat33) % iConcat33 == 0 ? "gpp.<?.(bugY*90:w(!" : BuildConfig.AnonymousClass1.concat("p!gvh6'~l'u:,n2scw|izc27$<}/9sa4$c.{7r`", 40);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str40 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i207 = 1;
            c86 = '\f';
        } else {
            i207 = 105;
            str40 = "17";
            c86 = 14;
        }
        if (c86 != 0) {
            str40 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str40) != 0) {
            i209 = 8;
            i208 = 1;
            c87 = 6;
        } else {
            i207 += 8;
            str40 = "17";
            c87 = 14;
            i208 = 2;
            i209 = 5;
        }
        if (c87 != 0) {
            strConcat19 = BuildConfig.AnonymousClass1.concat(strConcat19, i207 / (i209 << i208));
            str40 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str40) != 0) {
            c88 = 5;
        } else {
            sbAppend2 = sbAppend2.append(strConcat19);
            strConcat19 = qrEntity.getTransactionAmount();
            str40 = "17";
            c88 = '\t';
        }
        if (c88 != 0) {
            sbAppend2 = sbAppend2.append(checkNull(strConcat19)).append(str);
            str40 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str40) != 0) {
            iConcat34 = 1;
            i210 = 1;
        } else {
            iConcat34 = BuildConfig.AnonymousClass1.concat();
            i210 = 2;
        }
        String strConcat20 = (i210 * iConcat34) % iConcat34 != 0 ? BuildConfig.AnonymousClass1.concat("𝨳", 125) : "dv~R>\u0018%7~rh|!=!4Iazd\u007f*.&*=6";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str41 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i213 = 1;
            i212 = 2;
            c89 = '\f';
            i211 = 5;
        } else {
            i211 = 20;
            str41 = "17";
            c89 = '\r';
            i212 = 3;
            i213 = 3;
        }
        if (c89 != 0) {
            i211 += i212 + i213;
            str41 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str41) != 0) {
            i214 = 1;
            c90 = 6;
        } else {
            str41 = "17";
            i214 = 8;
            c90 = 5;
        }
        if (c90 != 0) {
            strConcat20 = BuildConfig.AnonymousClass1.concat(strConcat20, i211 / (i214 + 4));
            str41 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str41) == 0) {
            sbAppend2 = sbAppend2.append(strConcat20);
            strConcat20 = qrEntity.getTipOrConvenienceIndicator();
        }
        StringBuilder sbAppend3 = sbAppend2.append(checkNull(strConcat20)).append(str);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            iConcat35 = 1;
            i215 = 1;
        } else {
            iConcat35 = BuildConfig.AnonymousClass1.concat();
            i215 = 3;
        }
        String strEndsWith19 = (i215 * iConcat35) % iConcat35 == 0 ? "d`|j+\u0012*\u0018ew~r(<!=atFj{\u000b53?m\"'" : DataAmount.AnonymousClass1.endsWith(114, "\"\u0010\u001frtHn`G2-<\u0006f\u000fmrO$hc\u001fi*8'x'");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str42 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i216 = 1;
            i217 = 1;
            c91 = '\n';
        } else {
            i216 = 81;
            str42 = "17";
            i217 = 2;
            c91 = 11;
        }
        if (c91 != 0) {
            i216 += i217 + i217;
            str42 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str42) != 0) {
            c92 = '\r';
        } else {
            i216 /= 18;
            str42 = "17";
            c92 = 3;
        }
        if (c92 != 0) {
            sbAppend3 = sbAppend3.append(BuildConfig.AnonymousClass1.concat(strEndsWith19, i216));
            str42 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str42) != 0) {
            c93 = '\t';
            strCheckNull23 = null;
        } else {
            strCheckNull23 = checkNull(qrEntity.getValueOfConvenienceFeeFixed());
            str42 = "17";
            c93 = '\b';
        }
        if (c93 != 0) {
            sbAppend3 = sbAppend3.append(strCheckNull23).append(str);
            str42 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str42) != 0) {
            iConcat36 = 1;
            i218 = 1;
        } else {
            iConcat36 = BuildConfig.AnonymousClass1.concat();
            i218 = 3;
        }
        String strConcat21 = (i218 * iConcat36) % iConcat36 != 0 ? BuildConfig.AnonymousClass1.concat("}.o}m6'6 xiw}h7zj{{b~cc\"9*v5hti;*n#.gtd", 45) : "f~bh)\u0014,\u001agypp*:'?cjXhy\u001b?;;bxqu$7{p";
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str43 = AdkSettings.PLATFORM_TYPE_MOBILE;
            c99 = '\r';
            i219 = 1;
            i220 = 1;
            i221 = 1;
        } else {
            i219 = 136;
            str43 = "17";
            i220 = 4;
            i221 = 2;
        }
        if (c99 != 0) {
            i219 += i220 << i221;
            str43 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str43) != 0) {
            c94 = 14;
        } else {
            i219 /= 68;
            str43 = "17";
            c94 = '\n';
        }
        if (c94 != 0) {
            sbAppend3 = sbAppend3.append(BuildConfig.AnonymousClass1.concat(strConcat21, i219));
            str43 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        StringBuilder sbAppend4 = sbAppend3.append(Integer.parseInt(str43) != 0 ? null : checkNull(qrEntity.getValueOfConvenienceFeePercentage())).append(str);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            iConcat37 = 1;
            i222 = 1;
        } else {
            iConcat37 = BuildConfig.AnonymousClass1.concat();
            i222 = 5;
        }
        String strEndsWith20 = (i222 * iConcat37) % iConcat37 == 0 ? "AP_zo" : DataAmount.AnonymousClass1.endsWith(54, "UTDa\u0002b|.+\u0003LiV_Kq\u000e\u0014\u0013&))bm}zb9\t\u000f\b5$.Tax}<o\u0016\u001c\u000f~4,]Af_vk");
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str44 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i223 = 1;
            i224 = 1;
            c95 = 11;
        } else {
            i223 = 140;
            str44 = "17";
            i224 = 4;
            c95 = 2;
        }
        if (c95 != 0) {
            i224 += i224 + i224;
            str44 = AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (Integer.parseInt(str44) != 0) {
            i225 = 0;
        } else {
            i223 += i224;
            str44 = "17";
            i225 = 10;
            c98 = 5;
        }
        if (c98 != 0) {
            i226 = i225 + i225 + i225;
            str44 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i226 = 1;
        }
        if (Integer.parseInt(str44) == 0) {
            strEndsWith20 = BuildConfig.AnonymousClass1.concat(strEndsWith20, i223 / i226);
            str44 = "17";
            i235 = 9;
        }
        if (i235 != 0) {
            sbAppend4 = sbAppend4.append(strEndsWith20);
            strEndsWith20 = qrEntity.getRrn();
            str44 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i227 = 0;
        } else {
            i227 = i235 + 13;
        }
        if (Integer.parseInt(str44) != 0) {
            i228 = i227 + 8;
        } else {
            sbAppend4 = sbAppend4.append(checkNull(strEndsWith20)).append(str);
            i228 = i227 + 13;
        }
        if (i228 != 0) {
            iConcat38 = BuildConfig.AnonymousClass1.concat();
        } else {
            iConcat38 = 1;
            i233 = 1;
        }
        String strConcat22 = (iConcat38 * i233) % iConcat38 == 0 ? "Sq`m!+-7Dleu#'~s" : BuildConfig.AnonymousClass1.concat(".|jbk$)&&", 49);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            str45 = AdkSettings.PLATFORM_TYPE_MOBILE;
            i232 = 1;
            i237 = 1;
            i236 = 5;
        } else {
            i231 = 128;
            str45 = "17";
        }
        if (i236 != 0) {
            i231 += i237 << i232;
            str45 = AdkSettings.PLATFORM_TYPE_MOBILE;
        } else {
            i230 = 0;
            i238 = i236 + 11;
        }
        if (Integer.parseInt(str45) != 0) {
            i229 = i238 + 9;
            str47 = str45;
        } else {
            i231 /= i230 << 2;
            i229 = i238 + 10;
        }
        if (i229 != 0) {
            sbAppend4 = sbAppend4.append(BuildConfig.AnonymousClass1.concat(strConcat22, i231));
        } else {
            str46 = str47;
        }
        return sbAppend4.append(Integer.parseInt(str46) != 0 ? null : checkNull(qrEntity.getApprovalNumber())).append(str).toString();
    }
}
