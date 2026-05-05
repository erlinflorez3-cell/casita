package com.valid.communication.managers.exchangemanager;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.valid.communication.a;
import com.valid.communication.e;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.httprequestmanager.HttpRequestManager;
import com.valid.communication.managers.httprequestmanager.HttpRequestManagerImp;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.ChainModel;
import com.valid.communication.models.ErrorData;
import com.valid.communication.models.ExchangeKey;
import com.valid.communication.models.KeyEntity;
import com.valid.security.entities.RsaOaepKey;
import com.valid.security.entities.TransformAes;
import com.valid.security.entities.TransformRsa;
import com.valid.security.helpers.KeyHelper;
import com.valid.security.managers.AesCrypto;
import com.valid.security.managers.RsaCrypto;
import com.valid.security.managers.VsshCryptoLargeManager;
import com.valid.security.managers.VsshCryptoManager;
import com.valid.security.utils.SecurityUtils;
import com.valid.utils.VsshLogger;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ExchangeManagerImp implements ExchangeManager {
    private static final String TAG;
    private ExchangeManagerCallback callback;
    private VsshCryptoManager<TransformAes> cryptoAes;
    private VsshCryptoLargeManager cryptoLargeRsa;
    private VsshCryptoManager<TransformRsa> cryptoRsa;
    private KeyEntity mKeyEntity;
    private HttpRequestManager requestManager;
    private TransformAes transformAes;

    public class ParseException extends RuntimeException {
    }

    static {
        int iXd = Od.Xd() ^ (-1207802547);
        TAG = Jg.Wd("(p\u001a,pP'\u0017;X;\u001bREX\u0007m9b\r|6~q^&\u001ebcW0b\bR\u0013QP6\u0019\r.\u007f'q8)8\u0001\"\u0005i\u000fg\u000en#Dy\u0001IM?\u0013[\u0015Bx", (short) (C1580rY.Xd() ^ (1189886491 ^ (-1189903262))), (short) (C1580rY.Xd() ^ iXd));
    }

    public ExchangeManagerImp(KeyEntity keyEntity, RsaOaepKey rsaOaepKey, TransformAes transformAes) {
        this.mKeyEntity = keyEntity;
        KeyPair keyPairGenerateRsaKeyPair = KeyHelper.generateRsaKeyPair(rsaOaepKey);
        this.mKeyEntity.setmClientPrivateKey(keyPairGenerateRsaKeyPair.getPrivate());
        this.mKeyEntity.setmClientPubKey(keyPairGenerateRsaKeyPair.getPublic());
        this.transformAes = transformAes;
        this.cryptoAes = new AesCrypto();
        this.cryptoRsa = new RsaCrypto();
        this.cryptoLargeRsa = new RsaCrypto();
    }

    private final void errorExchangeKey(String str) {
        BaseErrorEvent baseErrorEvent;
        String strUd;
        int i2;
        int i3;
        int i4;
        ErrorData errorData = new ErrorData();
        String strXd = ZO.xd("\u0011", (short) (C1580rY.Xd() ^ ((802112823 ^ 2118498598) ^ (-1368061355))), (short) (C1580rY.Xd() ^ (1155588907 ^ (-1155587777))));
        int i5 = Integer.parseInt(strXd);
        int iXd = C1580rY.Xd() ^ (1460414093 ^ (-1720005266));
        if (i5 != 0) {
            i2 = 962778045 ^ 962778036;
            strUd = strXd;
            errorData = null;
            baseErrorEvent = null;
        } else {
            baseErrorEvent = new BaseErrorEvent();
            strUd = C1626yg.Ud("N\u0018", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69943881))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951495167)));
            i2 = iXd;
        }
        if (i2 != 0) {
            errorData.setErrorType(C1580rY.Xd() ^ 831068143);
            i3 = 0;
        } else {
            i3 = i2 + 4;
            baseErrorEvent = null;
            strXd = strUd;
        }
        if (Integer.parseInt(strXd) != 0) {
            int i6 = 159071252 ^ 159071250;
            i4 = i3 + i6;
            int i7 = i6 / iXd;
        } else {
            errorData.setMessage(str);
            i4 = i3 + iXd;
        }
        if (i4 != 0) {
            baseErrorEvent.setErrorData(errorData);
        }
        this.callback.exchangeKeyCompletion(null, baseErrorEvent);
    }

    private final String exchangeKey(String str) {
        Object objFromJson;
        int i2;
        String str2;
        int i3;
        int i4;
        ChainModel chainModel;
        String str3;
        char c2;
        byte[] byteArrayFromHexString;
        TransformRsa transformRsa;
        String key;
        PrivateKey privateKey;
        byte[] bArrDecrypt;
        int i5;
        int i6;
        String str4;
        int i7;
        int i8;
        int i9;
        int iXd;
        int i10;
        int i11;
        int i12;
        String strConcat;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str5;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String strOd;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Gson gson = new Gson();
        String strWd = Ig.wd("O", (short) (FB.Xd() ^ (ZN.Xd() ^ (430507205 ^ 706950864))));
        ExchangeManagerImp exchangeManagerImp = null;
        if (Integer.parseInt(strWd) != 0) {
            gson = null;
            objFromJson = null;
        } else {
            objFromJson = gson.fromJson(str, (Class<Object>) JsonObject.class);
        }
        JsonObject jsonObject = (JsonObject) objFromJson;
        int i36 = Integer.parseInt(strWd);
        String strOd2 = EO.Od("l6", (short) (C1499aX.Xd() ^ (783516808 ^ (-783538083))));
        if (i36 != 0) {
            str2 = strWd;
            i3 = 11;
            i2 = 1;
            i4 = 1;
        } else {
            i2 = (946155956 ^ 963410976) ^ 17386964;
            str2 = strOd2;
            i3 = 1968550803 ^ 1968550807;
            i4 = 513212148 ^ 513212144;
        }
        if (i3 != 0) {
            i2 += i4 + i4;
            str2 = strWd;
        }
        JsonElement jsonElement = jsonObject.get(a.startsWith(C1561oA.Qd("=:BO\u000by\u0003z", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1727517364 ^ (-627877472))))), i2 / (Integer.parseInt(str2) != 0 ? 1 : (1957824906 ^ 308665192) ^ 1725420226)));
        ExchangeKey exchangeKey = (ExchangeKey) (jsonElement == null ? gson.fromJson(str, ExchangeKey.class) : gson.fromJson(jsonElement.toString(), ExchangeKey.class));
        List<ChainModel> chains = exchangeKey.getChains();
        int i37 = 10;
        int i38 = 0;
        if (Integer.parseInt(strWd) != 0) {
            str3 = strWd;
            chainModel = null;
            c2 = 15;
        } else {
            chainModel = chains.get(0);
            str3 = strOd2;
            c2 = '\n';
        }
        if (c2 != 0) {
            byteArrayFromHexString = SecurityUtils.getByteArrayFromHexString(chainModel.getChainContent());
            str3 = strWd;
        } else {
            byteArrayFromHexString = null;
        }
        boolean zVerifySignature = KeyHelper.verifySignature(byteArrayFromHexString, this.mKeyEntity.getmServerPubKey(), Integer.parseInt(str3) != 0 ? null : SecurityUtils.getByteArrayFromHexString(exchangeKey.getSign()));
        int iXd2 = FB.Xd() ^ 1609527099;
        int i39 = 882307676 ^ 882307673;
        int i40 = 9;
        int i41 = 12;
        int i42 = 2;
        if (!zVerifySignature) {
            if (Integer.parseInt(strWd) != 0) {
                str5 = strWd;
                i21 = 1;
            } else {
                i21 = (1658562845 ^ 1599301184) ^ 1032376139;
                iXd2 = 11;
                str5 = strOd2;
            }
            if (iXd2 != 0) {
                str5 = strWd;
                i24 = 11;
                i22 = 0;
                i23 = 2;
            } else {
                i22 = iXd2 + 12;
                i21 = 1;
                i23 = 1;
                i24 = 0;
            }
            if (Integer.parseInt(str5) != 0) {
                i25 = i22 + i39;
                i42 = 1;
            } else {
                i21 += i24 << i23;
                i25 = i22 + 11;
                str5 = strOd2;
            }
            if (i25 != 0) {
                i21 += i42 + i42;
                str5 = strWd;
                i26 = 0;
            } else {
                i26 = i25 + 14;
            }
            if (Integer.parseInt(str5) != 0) {
                i27 = i26 + 13;
                i41 = 1;
            } else {
                i27 = i26 + 11;
                str5 = strOd2;
            }
            int iXd3 = OY.Xd() ^ 69928151;
            short sXd = (short) (OY.Xd() ^ ((1003774132 ^ 679768446) ^ 324011292));
            short sXd2 = (short) (OY.Xd() ^ iXd3);
            int[] iArr = new int["\u0014\u0011\u0003}K(ERI\u0014\u000f\u0016\u0004BHHb".length()];
            QB qb = new QB("\u0014\u0011\u0003}K(ERI\u0014\u000f\u0016\u0004BHHb");
            int i43 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i43] = xuXd.fK((xuXd.CK(iKK) - (sXd + i43)) - sXd2);
                i43++;
            }
            String str6 = new String(iArr, 0, i43);
            if (i27 != 0) {
                str6 = a.startsWith(str6, i21 / i41);
                strOd = C1561oA.od("FclS+\u0012)\u0019,fNTXUKx\u001aMHI\u0012[|\u0015\u0005\nJO>M\u0007;\u0013yA<G4\b-", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (502058811 ^ (-1774027076)))));
                str5 = strWd;
                i28 = 0;
            } else {
                i28 = i27 + 9;
                strOd = null;
            }
            if (Integer.parseInt(str5) != 0) {
                i29 = i28 + 13;
                i30 = 0;
            } else {
                i29 = i28 + 14;
                str5 = strOd2;
                i30 = 10;
            }
            int i44 = i30;
            if (i29 != 0) {
                i32 = i30 + i30;
                str5 = strWd;
                i33 = i32;
                i31 = 0;
            } else {
                i31 = i29 + 12;
                i32 = 1;
                i33 = 1;
            }
            if (Integer.parseInt(str5) != 0) {
                i35 = i31 + 14;
                strOd2 = str5;
                i34 = 1;
            } else {
                i34 = i44 + i33 + i32 + i32;
                i35 = i31 + 15;
            }
            if (i35 != 0) {
                iXd = C1607wl.Xd() ^ 1849955294;
            } else {
                strWd = strOd2;
            }
            if (Integer.parseInt(strWd) != 0) {
                i37 = 0;
            } else {
                i34 += iXd;
                i38 = 10;
            }
            VsshLogger.logError(str6, a.startsWith(strOd, i34 / (i37 + i38)));
            return null;
        }
        ArrayList arrayList = new ArrayList(exchangeKey.getChains().size());
        Iterator<ChainModel> it = exchangeKey.getChains().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getChainContent());
        }
        boolean zInitServerPublicKeyFromChain = initServerPublicKeyFromChain(arrayList);
        int iXd4 = Od.Xd() ^ 1207800915;
        if (zInitServerPublicKeyFromChain) {
            VsshCryptoManager<TransformRsa> vsshCryptoManager = this.cryptoRsa;
            if (Integer.parseInt(strWd) != 0) {
                strOd2 = strWd;
                key = null;
                transformRsa = null;
                iXd4 = FB.Xd() ^ 1609527095;
            } else {
                transformRsa = TransformRsa.OAEP;
                key = exchangeKey.getKey();
            }
            if (iXd4 != 0) {
                privateKey = this.mKeyEntity.getmClientPrivateKey();
            } else {
                privateKey = null;
                strWd = strOd2;
            }
            if (Integer.parseInt(strWd) != 0) {
                bArrDecrypt = null;
            } else {
                bArrDecrypt = vsshCryptoManager.decrypt(transformRsa, key, privateKey);
                exchangeManagerImp = this;
            }
            KeyEntity keyEntity = exchangeManagerImp.mKeyEntity;
            int length = bArrDecrypt.length;
            short sXd3 = (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1053097858 ^ 1251338727)));
            int[] iArr2 = new int["G?9".length()];
            QB qb2 = new QB("G?9");
            int i45 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i45] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i45));
                i45++;
            }
            keyEntity.setmSymKey(new SecretKeySpec(bArrDecrypt, 0, length, a.startsWith(new String(iArr2, 0, i45), i39)));
            return str;
        }
        int i46 = 7;
        if (Integer.parseInt(strWd) != 0) {
            str4 = strWd;
            i5 = 1;
            i6 = 9;
        } else {
            i5 = 38;
            i6 = 7;
            str4 = strOd2;
        }
        if (i6 != 0) {
            i5 += i5 + i5;
            str4 = strWd;
            i7 = 0;
        } else {
            i7 = i6 + iXd2;
        }
        if (Integer.parseInt(str4) != 0) {
            i9 = i7 + i39;
            iXd = 1;
            i8 = 1;
            i42 = 1;
        } else {
            i8 = i5 + 19;
            i9 = i7 + iXd4;
            str4 = strOd2;
            iXd = C1580rY.Xd() ^ (-831067163);
        }
        if (i9 != 0) {
            i8 += iXd << i42;
            str4 = strWd;
            i10 = 0;
        } else {
            i10 = i9 + 7;
            i46 = 0;
        }
        if (Integer.parseInt(str4) != 0) {
            i11 = i10 + iXd4;
        } else {
            i8 /= i46 << 2;
            i11 = i10 + 2;
            str4 = strOd2;
        }
        if (i11 != 0) {
            strConcat = e.concat(i8, C1561oA.Kd("0M9<52\u0013\b\u000b}\u0015\u0014H4XNF", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (364442620 ^ (-607245598))))));
            str4 = strWd;
            i12 = 0;
            i13 = 9;
        } else {
            i12 = i11 + 12;
            strConcat = null;
            i13 = 0;
        }
        if (Integer.parseInt(str4) != 0) {
            i15 = i12 + 15;
            i14 = 1;
        } else {
            i14 = i13 << 2;
            i15 = i12 + 10;
            str4 = strOd2;
        }
        if (i15 != 0) {
            i17 = i13 + i14;
            str4 = strWd;
            i16 = 0;
            i18 = (2113690400 ^ 585482405) ^ 1595513729;
            i19 = 1426713234 ^ 1426713238;
        } else {
            i16 = i15 + i39;
            i17 = 1;
            i18 = 1;
            i19 = 1;
        }
        if (Integer.parseInt(str4) != 0) {
            i20 = i16 + iXd2;
            strOd2 = str4;
        } else {
            i19 = i19 + i18 + i18;
            i20 = i16 + 14;
        }
        if (i20 != 0) {
            i17 += i19;
            i38 = 9;
        } else {
            strWd = strOd2;
            i40 = 0;
        }
        int i47 = i17 / (Integer.parseInt(strWd) == 0 ? i38 + (i40 + i38) : 1);
        short sXd4 = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134231862)));
        short sXd5 = (short) (C1607wl.Xd() ^ (1819305571 ^ 1819288615));
        int[] iArr3 = new int["h>tJx\u001d\\i\"R:\u0005v\u0003\u0002\u0017^h\u0018\\LvC\u000e".length()];
        QB qb3 = new QB("h>tJx\u001d\\i\"R:\u0005v\u0003\u0002\u0017^h\u0018\\LvC\u000e");
        int i48 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i48] = xuXd3.fK(((i48 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
            i48++;
        }
        VsshLogger.logError(strConcat, e.concat(i47, new String(iArr3, 0, i48)));
        return null;
    }

    private final boolean initServerPublicKeyFromChain(List<String> list) {
        int iXd;
        ExchangeManagerImp exchangeManagerImp;
        String str;
        int i2;
        byte[] bArrDecryptLargeRsa;
        int i3;
        int iXd2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        KeyEntity keyEntity = this.mKeyEntity;
        short sXd = (short) (ZN.Xd() ^ ((1354776346 ^ 1788900390) ^ 979396392));
        int[] iArr = new int["&".length()];
        QB qb = new QB("&");
        int i9 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i9] = xuXd.fK((sXd ^ i9) + xuXd.CK(iKK));
            i9++;
        }
        String str2 = new String(iArr, 0, i9);
        int i10 = Integer.parseInt(str2);
        String strKd = Qg.kd("\u0007\u0005", (short) (C1499aX.Xd() ^ (228956 ^ (-229134))), (short) (C1499aX.Xd() ^ (839250250 ^ (-839236682))));
        String strVd = null;
        if (i10 != 0) {
            iXd = (2092195442 ^ 2038375658) ^ 97221278;
            str = str2;
            exchangeManagerImp = null;
        } else {
            keyEntity.setmServerPubKey("");
            iXd = C1580rY.Xd() ^ (2003884593 ^ (-1190776361));
            exchangeManagerImp = this;
            str = strKd;
        }
        if (iXd != 0) {
            bArrDecryptLargeRsa = exchangeManagerImp.cryptoLargeRsa.decryptLargeRsa(TransformRsa.ECB, list, this.mKeyEntity.getmClientPrivateKey());
            str = str2;
            i2 = 0;
        } else {
            i2 = iXd + 11;
            bArrDecryptLargeRsa = null;
        }
        if (Integer.parseInt(str) != 0) {
            i3 = i2 + 5;
            bArrDecryptLargeRsa = null;
            iXd2 = 0;
        } else {
            i3 = i2 + 12;
            strVd = hg.Vd("5\u001a3\u0019h>o_d\u0019\"\u0016\u000f^", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207820923)), (short) (C1607wl.Xd() ^ ((11835393 ^ 1323135387) ^ 1315568760)));
            iXd2 = C1607wl.Xd() ^ (419333390 ^ 1991939781);
            str = strKd;
        }
        int i11 = 1601488600 ^ 1601488594;
        if (i3 != 0) {
            i5 = iXd2 * i11;
            str = str2;
            i4 = 0;
            i6 = 4;
        } else {
            i4 = i3 + 11;
            i5 = 1;
            i6 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i8 = i4 + 14;
            strKd = str;
            i7 = 1;
        } else {
            i7 = i6 + i6;
            i8 = i4 + i11;
        }
        if (i8 != 0) {
            i5 += i6 + i7;
        } else {
            str2 = strKd;
            i11 = 0;
        }
        if (Integer.parseInt(str2) == 0) {
            i5 /= i11 << 2;
        }
        VsshLogger.logDebug(a.startsWith(strVd, i5), Arrays.toString(bArrDecryptLargeRsa));
        if (bArrDecryptLargeRsa == null) {
            return false;
        }
        try {
            this.mKeyEntity.setmServerPubKey(KeyHelper.getPublicKeyFromString(new String(bArrDecryptLargeRsa, Charset.forName(e.concat(4, C1561oA.ud("\u001a\u001d!iv", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1541423471 ^ (-800145837))))))))));
        } catch (IOException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        return this.mKeyEntity.getmServerPubKey() != null;
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManager
    public void getExchangeKeyServiceWithURL(String str, String str2) {
        try {
            getExchangeKeyServiceWithURL(str, str2, null, null);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManager
    public void getExchangeKeyServiceWithURL(String str, String str2, Map<String, Object> map) {
        try {
            getExchangeKeyServiceWithURL(str, str2, map, null);
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManager
    public void getExchangeKeyServiceWithURL(String str, String str2, Map<String, Object> map, Map<String, String> map2) {
        HashMap map3;
        HashMap map4 = new HashMap();
        if (Integer.parseInt(C1561oA.yd("\u000e", (short) (Od.Xd() ^ ((413546756 ^ 1623205351) ^ (-2019978722))))) != 0) {
            map3 = null;
        } else {
            map3 = map4;
            map4 = new HashMap();
        }
        if (this.requestManager == null) {
            this.requestManager = new HttpRequestManagerImp(BaseSuccessEvent.class, BaseErrorEvent.class);
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        EventBus.getDefault().register(this);
        if (str2 != null) {
            map3.put(e.concat(OY.Xd() ^ (2141181847 ^ 2075451260), C1561oA.Yd("ovyoh|\u0012.(", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134241584)))), str2);
        }
        if (map != null && !map.isEmpty()) {
            map3.putAll(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            map4.putAll(map2);
        }
        this.requestManager.consumeWebService(1, str, map4, map3);
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(BaseErrorEvent baseErrorEvent) {
        ExchangeManagerCallback exchangeManagerCallback = this.callback;
        if (Integer.parseInt(Xg.qd("\u007f", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849976496))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (542319014 ^ (-611870714)))))) == 0) {
            exchangeManagerCallback.exchangeKeyCompletion(null, baseErrorEvent);
        }
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(BaseSuccessEvent baseSuccessEvent) {
        int i2;
        int iXd;
        int i3;
        String strZd;
        int i4;
        Object objFromJson;
        TransformAes transformAes;
        String uniqueIdSigned;
        String str;
        int i5;
        Key key;
        int iXd2;
        int i6;
        int i7;
        int iXd3;
        String str2;
        int i8;
        int i9;
        int iXd4;
        EventBus.getDefault().unregister(this);
        BaseModelResponse baseModelResponse = (BaseModelResponse) baseSuccessEvent.getTypedResponse(BaseModelResponse.class);
        String strWd = Jg.Wd("J", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1772788144 ^ (-133098238)))), (short) (C1499aX.Xd() ^ (1390829592 ^ (-1390808508))));
        int i10 = 4;
        int iXd5 = C1633zX.Xd() ^ 1951471393;
        short sXd = (short) (C1499aX.Xd() ^ (1853157839 ^ (-1853148886)));
        short sXd2 = (short) (C1499aX.Xd() ^ iXd5);
        int[] iArr = new int["j".length()];
        QB qb = new QB("j");
        int i11 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i11] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((i11 * sXd2) + sXd)));
            i11++;
        }
        String str3 = new String(iArr, 0, i11);
        if (baseModelResponse != null) {
            Gson gson = new Gson();
            String strExchangeKey = exchangeKey(baseSuccessEvent.getResponse());
            int i12 = 2;
            int iXd6 = 9;
            if (strExchangeKey != null) {
                int i13 = (635432388 ^ 255336226) ^ 719844067;
                if (baseModelResponse.getResponse() != null) {
                    String str4 = TAG;
                    int i14 = 8;
                    if (Integer.parseInt(str3) != 0) {
                        str2 = str3;
                        iXd3 = 1;
                        i14 = 13;
                    } else {
                        iXd3 = C1633zX.Xd() ^ (850437256 ^ (-1189200291));
                        str2 = strWd;
                    }
                    if (i14 != 0) {
                        str2 = str3;
                        i8 = 0;
                    } else {
                        i8 = i14 + 4;
                        i = 1;
                    }
                    if (Integer.parseInt(str2) != 0) {
                        i9 = i8 + 8;
                        i12 = 1;
                        iXd4 = 0;
                    } else {
                        iXd3 += i;
                        i9 = i8 + 5;
                        iXd4 = C1499aX.Xd() ^ (-1134257926);
                    }
                    String strUd = C1626yg.Ud("^$J;.V9O.\u001d\u0014\u0018p\tu>#E\u0016s\u0001u\u0010M\u000es\u0004\u007f70I\u0002T`!T);!\u000eJ", (short) (C1607wl.Xd() ^ (75279638 ^ 75276630)), (short) (C1607wl.Xd() ^ (FB.Xd() ^ (2145792280 ^ 537470536))));
                    if (i9 != 0) {
                        strUd = a.startsWith(strUd, iXd3 / (iXd4 << i12));
                    }
                    VsshLogger.logInfo(str4, strUd);
                    objFromJson = gson.fromJson(gson.toJson(baseModelResponse.getResponse()), (Class<Object>) ExchangeKey.class);
                } else {
                    objFromJson = gson.fromJson(strExchangeKey, (Class<Object>) ExchangeKey.class);
                }
                ExchangeKey exchangeKey = (ExchangeKey) objFromJson;
                if (exchangeKey != null && exchangeKey.getUniqueIdSigned() != null) {
                    VsshCryptoManager<TransformAes> vsshCryptoManager = this.cryptoAes;
                    int i15 = Integer.parseInt(str3);
                    int iXd7 = C1580rY.Xd() ^ (443846922 ^ (-738034972));
                    if (i15 != 0) {
                        transformAes = null;
                        uniqueIdSigned = null;
                        str = str3;
                        i5 = 408918028 ^ 408918016;
                    } else {
                        transformAes = this.transformAes;
                        uniqueIdSigned = exchangeKey.getUniqueIdSigned();
                        str = strWd;
                        i5 = iXd7;
                    }
                    if (i5 != 0) {
                        key = this.mKeyEntity.getmSymKey();
                        str = str3;
                    } else {
                        key = null;
                    }
                    String str5 = Integer.parseInt(str) != 0 ? null : new String(vsshCryptoManager.decrypt(transformAes, uniqueIdSigned, key), Charset.forName(e.concat(i13, Ig.wd("!{\u000fq\u001a", (short) (FB.Xd() ^ ((1797209201 ^ 1044669614) ^ 1432056367))))));
                    if ("".equals(str5)) {
                        if (Integer.parseInt(str3) != 0) {
                            strWd = str3;
                            iXd2 = 1;
                        } else {
                            iXd2 = Od.Xd() ^ 1207800891;
                            iXd6 = (1808194230 ^ 50047495) ^ 1765634237;
                        }
                        if (iXd6 != 0) {
                            i = 4;
                            i6 = 0;
                        } else {
                            i6 = iXd6 + iXd7;
                            str3 = strWd;
                            i10 = 1;
                        }
                        if (Integer.parseInt(str3) != 0) {
                            i7 = i6 + 13;
                        } else {
                            iXd2 += i10 + i10 + i;
                            i7 = i6 + i13;
                        }
                        int i16 = i7 != 0 ? 11 : 0;
                        int i17 = iXd2 / (i16 + (i16 + i16));
                        short sXd3 = (short) (FB.Xd() ^ (1939831634 ^ 1939816400));
                        int[] iArr2 = new int["\u007fM\f\u0012M\u0012\u00047:]`7\u0002S\u0016:oA\u007f%\u0007\u0006\\\u0018?\u007f0\nPNYQ\u0011\b\u001b]A\\\u0007~zXS".length()];
                        QB qb2 = new QB("\u007fM\f\u0012M\u0012\u00047:]`7\u0002S\u0016:oA\u007f%\u0007\u0006\\\u0018?\u007f0\nPNYQ\u0011\b\u001b]A\\\u0007~zXS");
                        int i18 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i18] = xuXd2.fK((C1561oA.Xd[i18 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i18)) + xuXd2.CK(iKK2));
                            i18++;
                        }
                        errorExchangeKey(a.startsWith(new String(iArr2, 0, i18), i17));
                        return;
                    }
                    exchangeKey.setUniqueIdSigned(String.valueOf(Integer.valueOf(Integer.parseInt(str5) - 1)));
                }
                this.callback.exchangeKeyCompletion(exchangeKey, null);
                return;
            }
            if (Integer.parseInt(str3) != 0) {
                strWd = str3;
                i4 = 1;
                i10 = 1;
            } else {
                i4 = 625462875 ^ 625463023;
                iXd6 = FB.Xd() ^ 1609527103;
            }
            if (iXd6 != 0) {
                i4 += i10 << 2;
            } else {
                str3 = strWd;
            }
            i3 = i4 / (Integer.parseInt(str3) == 0 ? 1867737604 ^ 1867737676 : 1);
            strZd = C1561oA.Qd("Futijs &\f\u001a.q\u001e%rqde\u0016+(\u001a\u0004&Z\u001d^`\u001b\u0013\"\u001d\u000f", (short) (Od.Xd() ^ (869676496 ^ (-869681501))));
        } else {
            if (Integer.parseInt(str3) != 0) {
                iXd = 4;
                strWd = str3;
                i2 = 1;
                i10 = 1;
            } else {
                i2 = 746602333 ^ 746602253;
                iXd = C1633zX.Xd() ^ (-1951491129);
            }
            if (iXd != 0) {
                i2 += i10 + i10;
            } else {
                str3 = strWd;
            }
            i3 = i2 / (Integer.parseInt(str3) != 0 ? 1 : 16);
            strZd = C1593ug.zd("w/2',1]qUak?gvA..BO\u0004ny\u0007!84C4I\u0004\u007fO\u0004\u0014SE@SG", (short) (C1607wl.Xd() ^ (2027646911 ^ 2027622283)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951492940))));
        }
        errorExchangeKey(e.concat(i3, strZd));
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManager
    public void setCallback(ExchangeManagerCallback exchangeManagerCallback) {
        try {
            this.callback = exchangeManagerCallback;
        } catch (ParseException unused) {
        }
    }

    @Override // com.valid.communication.managers.exchangemanager.ExchangeManager
    public void setHttRequestManager(HttpRequestManager httpRequestManager) {
        try {
            this.requestManager = httpRequestManager;
        } catch (ParseException unused) {
        }
    }
}
