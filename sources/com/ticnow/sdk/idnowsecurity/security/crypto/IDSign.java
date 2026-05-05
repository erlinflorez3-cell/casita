package com.ticnow.sdk.idnowsecurity.security.crypto;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDSignResponse;
import com.ticnow.sdk.idnowsecurity.security.commonstore.IDCommonStorage;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class IDSign {
    public static IDSignResponse sign(String str, Context context) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = str.replace("\n", "").replace("\r", "").replace(Global.BLANK, "") + jCurrentTimeMillis;
            IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(((String) Objects.requireNonNull(iDCommonStorage.getSHSSign())).getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            IDSignResponse iDSignResponse = new IDSignResponse();
            iDSignResponse.setTrxSign(new String(Hex.encode(mac.doFinal(str2.getBytes(StandardCharsets.UTF_8)))));
            iDSignResponse.setTimeStamp(Long.toString(jCurrentTimeMillis));
            return iDSignResponse;
        } catch (Exception unused) {
            return null;
        }
    }
}
