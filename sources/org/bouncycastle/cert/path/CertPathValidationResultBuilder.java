package org.bouncycastle.cert.path;

/* JADX INFO: loaded from: classes6.dex */
class CertPathValidationResultBuilder {
    CertPathValidationResultBuilder() {
    }

    public void addException(CertPathValidationException certPathValidationException) {
    }

    public CertPathValidationResult build() {
        return new CertPathValidationResult((CertPathValidationContext) null, 0, 0, (CertPathValidationException) null);
    }
}
