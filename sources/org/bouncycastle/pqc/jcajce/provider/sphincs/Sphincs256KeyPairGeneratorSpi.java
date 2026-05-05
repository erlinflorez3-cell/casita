package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyPairGenerator;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;

/* JADX INFO: loaded from: classes2.dex */
public class Sphincs256KeyPairGeneratorSpi extends KeyPairGenerator {
    SPHINCS256KeyPairGenerator engine;
    boolean initialised;
    SPHINCS256KeyGenerationParameters param;
    SecureRandom random;
    ASN1ObjectIdentifier treeDigest;

    public Sphincs256KeyPairGeneratorSpi() throws Throwable {
        super(C1561oA.ud("LH??C7F$&&", (short) (C1607wl.Xd() ^ 23342)));
        this.treeDigest = NISTObjectIdentifiers.id_sha512_256;
        this.engine = new SPHINCS256KeyPairGenerator();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.yd("PF^H\u0010TIFc_Ycc\u0017?PYjj\\DRbWmj", (short) (C1633zX.Xd() ^ (-25682)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.initialised = false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() throws Throwable {
        if (!this.initialised) {
            SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(this.random, new SHA512tDigest(256));
            this.param = sPHINCS256KeyGenerationParameters;
            this.engine.init(sPHINCS256KeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCSphincs256PublicKey(this.treeDigest, (SPHINCSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCSphincs256PrivateKey(this.treeDigest, (SPHINCSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof SPHINCS256KeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a SPHINCS256KeyGenParameterSpec");
        }
        SPHINCS256KeyGenParameterSpec sPHINCS256KeyGenParameterSpec = (SPHINCS256KeyGenParameterSpec) algorithmParameterSpec;
        if (!sPHINCS256KeyGenParameterSpec.getTreeDigest().equals(SPHINCS256KeyGenParameterSpec.SHA512_256)) {
            if (sPHINCS256KeyGenParameterSpec.getTreeDigest().equals("SHA3-256")) {
                this.treeDigest = NISTObjectIdentifiers.id_sha3_256;
                sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(secureRandom, new SHA3Digest(256));
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        this.treeDigest = NISTObjectIdentifiers.id_sha512_256;
        sPHINCS256KeyGenerationParameters = new SPHINCS256KeyGenerationParameters(secureRandom, new SHA512tDigest(256));
        this.param = sPHINCS256KeyGenerationParameters;
        this.engine.init(this.param);
        this.initialised = true;
    }
}
