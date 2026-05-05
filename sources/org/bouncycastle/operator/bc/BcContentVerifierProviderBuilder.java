package org.bouncycastle.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BcContentVerifierProviderBuilder {
    protected BcDigestProvider digestProvider = BcDefaultDigestProvider.INSTANCE;

    /* JADX INFO: renamed from: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder$1 */
    class AnonymousClass1 implements ContentVerifierProvider {
        final /* synthetic */ X509CertificateHolder val$certHolder;

        AnonymousClass1(X509CertificateHolder x509CertificateHolder) {
            x509CertificateHolder = x509CertificateHolder;
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
            try {
                return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
            } catch (IOException e2) {
                throw new OperatorCreationException("exception on setup: " + e2, e2);
            }
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public X509CertificateHolder getAssociatedCertificate() {
            return x509CertificateHolder;
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public boolean hasAssociatedCertificate() {
            return true;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder$2 */
    class AnonymousClass2 implements ContentVerifierProvider {
        final /* synthetic */ AsymmetricKeyParameter val$publicKey;

        AnonymousClass2(AsymmetricKeyParameter asymmetricKeyParameter) {
            asymmetricKeyParameter = asymmetricKeyParameter;
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
            return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, asymmetricKeyParameter));
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public X509CertificateHolder getAssociatedCertificate() {
            return null;
        }

        @Override // org.bouncycastle.operator.ContentVerifierProvider
        public boolean hasAssociatedCertificate() {
            return false;
        }
    }

    private class SigVerifier implements ContentVerifier {
        private AlgorithmIdentifier algorithm;
        private BcSignerOutputStream stream;

        SigVerifier(AlgorithmIdentifier algorithmIdentifier, BcSignerOutputStream bcSignerOutputStream) {
            this.algorithm = algorithmIdentifier;
            this.stream = bcSignerOutputStream;
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public OutputStream getOutputStream() {
            BcSignerOutputStream bcSignerOutputStream = this.stream;
            if (bcSignerOutputStream != null) {
                return bcSignerOutputStream;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            return this.stream.verify(bArr);
        }
    }

    public BcSignerOutputStream createSignatureStream(AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        Signer signerCreateSigner = createSigner(algorithmIdentifier);
        signerCreateSigner.init(false, asymmetricKeyParameter);
        return new BcSignerOutputStream(signerCreateSigner);
    }

    public ContentVerifierProvider build(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.1
            final /* synthetic */ X509CertificateHolder val$certHolder;

            AnonymousClass1(X509CertificateHolder x509CertificateHolder2) {
                x509CertificateHolder = x509CertificateHolder2;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                try {
                    return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
                } catch (IOException e2) {
                    throw new OperatorCreationException("exception on setup: " + e2, e2);
                }
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return x509CertificateHolder;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return true;
            }
        };
    }

    public ContentVerifierProvider build(AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.2
            final /* synthetic */ AsymmetricKeyParameter val$publicKey;

            AnonymousClass2(AsymmetricKeyParameter asymmetricKeyParameter2) {
                asymmetricKeyParameter = asymmetricKeyParameter2;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                return BcContentVerifierProviderBuilder.this.new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, asymmetricKeyParameter));
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return false;
            }
        };
    }

    protected abstract Signer createSigner(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;

    protected abstract AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;
}
