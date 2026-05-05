package org.spongycastle.eac;

import java.io.OutputStream;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.eac.CVCertificate;
import org.spongycastle.asn1.eac.CertificateBody;
import org.spongycastle.asn1.eac.CertificateHolderAuthorization;
import org.spongycastle.asn1.eac.CertificateHolderReference;
import org.spongycastle.asn1.eac.CertificationAuthorityReference;
import org.spongycastle.asn1.eac.PackedDate;
import org.spongycastle.asn1.eac.PublicKeyDataObject;
import org.spongycastle.eac.operator.EACSigner;

/* JADX INFO: loaded from: classes2.dex */
public class EACCertificateBuilder {
    private static final byte[] ZeroArray = {0};
    private PackedDate certificateEffectiveDate;
    private PackedDate certificateExpirationDate;
    private CertificateHolderAuthorization certificateHolderAuthorization;
    private CertificateHolderReference certificateHolderReference;
    private CertificationAuthorityReference certificationAuthorityReference;
    private PublicKeyDataObject publicKey;

    public EACCertificateBuilder(CertificationAuthorityReference certificationAuthorityReference, PublicKeyDataObject publicKeyDataObject, CertificateHolderReference certificateHolderReference, CertificateHolderAuthorization certificateHolderAuthorization, PackedDate packedDate, PackedDate packedDate2) {
        this.certificationAuthorityReference = certificationAuthorityReference;
        this.publicKey = publicKeyDataObject;
        this.certificateHolderReference = certificateHolderReference;
        this.certificateHolderAuthorization = certificateHolderAuthorization;
        this.certificateEffectiveDate = packedDate;
        this.certificateExpirationDate = packedDate2;
    }

    private CertificateBody buildBody() {
        return new CertificateBody(new DERApplicationSpecific(41, ZeroArray), this.certificationAuthorityReference, this.publicKey, this.certificateHolderReference, this.certificateHolderAuthorization, this.certificateEffectiveDate, this.certificateExpirationDate);
    }

    public EACCertificateHolder build(EACSigner eACSigner) throws EACException {
        try {
            CertificateBody certificateBodyBuildBody = buildBody();
            OutputStream outputStream = eACSigner.getOutputStream();
            outputStream.write(certificateBodyBuildBody.getEncoded("DER"));
            outputStream.close();
            return new EACCertificateHolder(new CVCertificate(certificateBodyBuildBody, eACSigner.getSignature()));
        } catch (Exception e2) {
            throw new EACException("unable to process signature: " + e2.getMessage(), e2);
        }
    }
}
