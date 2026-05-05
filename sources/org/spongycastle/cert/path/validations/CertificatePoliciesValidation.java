package org.spongycastle.cert.path.validations;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.PolicyConstraints;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class CertificatePoliciesValidation implements CertPathValidation {
    private int explicitPolicy;
    private int inhibitAnyPolicy;
    private int policyMapping;

    CertificatePoliciesValidation(int i2) {
        this(i2, false, false, false);
    }

    CertificatePoliciesValidation(int i2, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            this.explicitPolicy = 0;
        } else {
            this.explicitPolicy = i2 + 1;
        }
        if (z3) {
            this.inhibitAnyPolicy = 0;
        } else {
            this.inhibitAnyPolicy = i2 + 1;
        }
        if (z4) {
            this.policyMapping = 0;
        } else {
            this.policyMapping = i2 + 1;
        }
    }

    private int countDown(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        return 0;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new CertificatePoliciesValidation(0);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        int iIntValue;
        certPathValidationContext.addHandledExtension(Extension.policyConstraints);
        certPathValidationContext.addHandledExtension(Extension.inhibitAnyPolicy);
        if (certPathValidationContext.isEndEntity() || ValidationUtils.isSelfIssued(x509CertificateHolder)) {
            return;
        }
        this.explicitPolicy = countDown(this.explicitPolicy);
        this.policyMapping = countDown(this.policyMapping);
        this.inhibitAnyPolicy = countDown(this.inhibitAnyPolicy);
        PolicyConstraints policyConstraintsFromExtensions = PolicyConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (policyConstraintsFromExtensions != null) {
            BigInteger requireExplicitPolicyMapping = policyConstraintsFromExtensions.getRequireExplicitPolicyMapping();
            if (requireExplicitPolicyMapping != null && requireExplicitPolicyMapping.intValue() < this.explicitPolicy) {
                this.explicitPolicy = requireExplicitPolicyMapping.intValue();
            }
            BigInteger inhibitPolicyMapping = policyConstraintsFromExtensions.getInhibitPolicyMapping();
            if (inhibitPolicyMapping != null && inhibitPolicyMapping.intValue() < this.policyMapping) {
                this.policyMapping = inhibitPolicyMapping.intValue();
            }
        }
        Extension extension = x509CertificateHolder.getExtension(Extension.inhibitAnyPolicy);
        if (extension == null || (iIntValue = ASN1Integer.getInstance(extension.getParsedValue()).getValue().intValue()) >= this.inhibitAnyPolicy) {
            return;
        }
        this.inhibitAnyPolicy = iIntValue;
    }
}
