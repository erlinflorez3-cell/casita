package com.valid.vssh_android_core.utils;

import com.dynatrace.android.agent.Global;
import com.valid.security.entities.TransformRsa;
import com.valid.security.managers.RsaCrypto;
import com.valid.security.managers.VsshCryptoManager;
import com.valid.security.utils.SecurityUtils;
import java.security.Key;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class CoreSecurityHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VsshCryptoManager<TransformRsa> f18356a = new RsaCrypto();

    public class ParseException extends RuntimeException {
    }

    public String encryptRsa(String str, Key key) {
        VsshCryptoManager<TransformRsa> vsshCryptoManager = this.f18356a;
        int iXd = Od.Xd() ^ (390828860 ^ (-1354119312));
        int iXd2 = C1499aX.Xd() ^ 1134244193;
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int[Global.UNDERSCORE.length()];
        QB qb = new QB(Global.UNDERSCORE);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        return SecurityUtils.getHexStringFromByteArray(Integer.parseInt(new String(iArr, 0, i2)) != 0 ? null : vsshCryptoManager.encrypt(TransformRsa.PKCS1, str, key));
    }
}
