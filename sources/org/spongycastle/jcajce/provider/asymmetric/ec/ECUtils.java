package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.security.spec.ECGenParameterSpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes2.dex */
class ECUtils {
    ECUtils() {
    }

    static X9ECParameters getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec) {
        return getDomainParametersFromName(eCGenParameterSpec.getName());
    }

    static X9ECParameters getDomainParametersFromName(String str) {
        X9ECParameters namedCurveByName;
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                namedCurveByName = ECUtil.getNamedCurveByOid(new ASN1ObjectIdentifier(str));
            } else if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
                namedCurveByName = ECUtil.getNamedCurveByName(str);
            } else {
                namedCurveByName = ECUtil.getNamedCurveByName(str);
            }
            return namedCurveByName;
        } catch (IllegalArgumentException unused) {
            return ECUtil.getNamedCurveByName(str);
        }
    }
}
