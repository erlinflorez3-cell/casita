package com.valid.vssh_android_core.utils;

import android.content.Context;
import com.valid.vssh_android_core.model.CardInformationModel;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LoginModel;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.TransactionsModel;
import com.valid.vssh_android_core.model.UploadImageModel;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class ValidationsHelper {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public static boolean isValidCardInformationModel(CardInformationModel cardInformationModel) {
        try {
            return cardInformationModel.getApi() != null;
        } catch (ArrayOutOfBoundsException unused) {
            return false;
        }
    }

    public static boolean isValidGenericModel(GenericModel genericModel) {
        return (genericModel.getApi() == null || genericModel.getEndPoint() == null || genericModel.getRequestBody() == null) ? false : true;
    }

    public static boolean isValidLoginModel(LoginModel loginModel) {
        try {
            String password = loginModel.getPassword();
            String publicKey = loginModel.getPublicKey();
            if (password != null && publicKey != null) {
                return !password.isEmpty();
            }
        } catch (ArrayOutOfBoundsException unused) {
        }
        return false;
    }

    public static boolean isValidSetupModel(SetupModel setupModel) {
        String urlBase;
        int iXd;
        String strXd;
        String str;
        Context context = setupModel.getContext();
        short sXd = (short) (C1607wl.Xd() ^ (OY.Xd() ^ (587611641 ^ 657261799)));
        short sXd2 = (short) (C1607wl.Xd() ^ (1684977735 ^ 1684972465));
        int[] iArr = new int["!".length()];
        QB qb = new QB("!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        String str3 = null;
        if (Integer.parseInt(str2) != 0) {
            iXd = FB.Xd() ^ (1910806220 ^ 772536826);
            strXd = str2;
            context = null;
            urlBase = null;
        } else {
            urlBase = setupModel.getUrlBase();
            iXd = 14;
            strXd = ZO.xd("L", (short) (C1580rY.Xd() ^ ((1693424902 ^ 1214263344) ^ (-747616829))), (short) (C1580rY.Xd() ^ ((1360830349 ^ 923309556) ^ (-1712612834))));
        }
        if (iXd != 0) {
            str = urlBase;
            urlBase = setupModel.getPublicKey();
        } else {
            str = null;
            str2 = strXd;
        }
        if (Integer.parseInt(str2) == 0) {
            str3 = urlBase;
            urlBase = setupModel.getApiExchange();
        }
        String apiGetCertificates = setupModel.getApiGetCertificates();
        return (context == null || str == null || str3 == null || urlBase == null || apiGetCertificates == null || str.isEmpty() || str3.isEmpty() || urlBase.isEmpty() || apiGetCertificates.isEmpty()) ? false : true;
    }

    public static boolean isValidTransactionModel(TransactionsModel transactionsModel) {
        return (transactionsModel.getIndex() == null || transactionsModel.getSizeLimit() == null || transactionsModel.getApi() == null) ? false : true;
    }

    public static boolean isValidUploadImageModel(UploadImageModel uploadImageModel) {
        return (uploadImageModel.getSegmentLength() == null || uploadImageModel.getImage() == null || uploadImageModel.getApi() == null || uploadImageModel.getPublicKey() == null) ? false : true;
    }
}
