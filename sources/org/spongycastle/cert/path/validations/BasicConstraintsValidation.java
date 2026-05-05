package org.spongycastle.cert.path.validations;

import java.math.BigInteger;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class BasicConstraintsValidation implements CertPathValidation {
    private BasicConstraints bc;
    private boolean isMandatory;
    private int maxPathLength;

    public BasicConstraintsValidation() {
        this(true);
    }

    public BasicConstraintsValidation(boolean z2) {
        this.isMandatory = z2;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        BasicConstraintsValidation basicConstraintsValidation = new BasicConstraintsValidation(this.isMandatory);
        basicConstraintsValidation.bc = this.bc;
        basicConstraintsValidation.maxPathLength = this.maxPathLength;
        return basicConstraintsValidation;
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        BasicConstraintsValidation basicConstraintsValidation = (BasicConstraintsValidation) memoable;
        this.isMandatory = basicConstraintsValidation.isMandatory;
        this.bc = basicConstraintsValidation.bc;
        this.maxPathLength = basicConstraintsValidation.maxPathLength;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        BigInteger pathLenConstraint;
        int iIntValue;
        if (this.maxPathLength < 0) {
            throw new CertPathValidationException("BasicConstraints path length exceeded");
        }
        certPathValidationContext.addHandledExtension(Extension.basicConstraints);
        BasicConstraints basicConstraintsFromExtensions = BasicConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (basicConstraintsFromExtensions != null) {
            if (this.bc == null) {
                this.bc = basicConstraintsFromExtensions;
                if (basicConstraintsFromExtensions.isCA()) {
                    this.maxPathLength = basicConstraintsFromExtensions.getPathLenConstraint().intValue();
                }
            } else if (basicConstraintsFromExtensions.isCA() && (pathLenConstraint = basicConstraintsFromExtensions.getPathLenConstraint()) != null && (iIntValue = pathLenConstraint.intValue()) < this.maxPathLength) {
                this.maxPathLength = iIntValue;
                this.bc = basicConstraintsFromExtensions;
            }
        } else if (this.bc != null) {
            this.maxPathLength--;
        }
        if (this.isMandatory && this.bc == null) {
            throw new CertPathValidationException("BasicConstraints not present in path");
        }
    }
}
