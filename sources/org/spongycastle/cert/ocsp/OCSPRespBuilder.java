package org.spongycastle.cert.ocsp;

import java.io.IOException;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import org.spongycastle.asn1.ocsp.OCSPResponseStatus;
import org.spongycastle.asn1.ocsp.ResponseBytes;

/* JADX INFO: loaded from: classes2.dex */
public class OCSPRespBuilder {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;

    public OCSPResp build(int i2, Object obj) throws OCSPException {
        if (obj == null) {
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i2), null));
        }
        if (!(obj instanceof BasicOCSPResp)) {
            throw new OCSPException("unknown response object");
        }
        try {
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i2), new ResponseBytes(OCSPObjectIdentifiers.id_pkix_ocsp_basic, new DEROctetString(((BasicOCSPResp) obj).getEncoded()))));
        } catch (IOException e2) {
            throw new OCSPException("can't encode object.", e2);
        }
    }
}
