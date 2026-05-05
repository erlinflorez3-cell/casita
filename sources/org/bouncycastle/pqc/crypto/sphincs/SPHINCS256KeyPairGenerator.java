package org.bouncycastle.pqc.crypto.sphincs;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class SPHINCS256KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom random;
    private Digest treeDigest;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws Throwable {
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        byte[] bArr = new byte[PhotoshopDirectory.TAG_PATH_SELECTION_STATE];
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr};
        Method method = Class.forName(Jg.Wd("Ge\u0019\u000b\u0016r3k| V(K7n\u0018t-IBn\u0018s!*O", (short) (C1580rY.Xd() ^ (-32151)), (short) (C1580rY.Xd() ^ (-1820)))).getMethod(ZO.xd("f`F'\u0017lH\u000b\u000f", (short) (C1633zX.Xd() ^ (-18182)), (short) (C1633zX.Xd() ^ (-14243))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            byte[] bArr2 = new byte[1056];
            System.arraycopy(bArr, 32, bArr2, 0, 1024);
            leafaddrVar.level = 11;
            leafaddrVar.subtree = 0L;
            leafaddrVar.subleaf = 0L;
            Tree.treehash(new HashFunctions(this.treeDigest), bArr2, 1024, 5, bArr, leafaddrVar, bArr2, 0);
            return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SPHINCSPublicKeyParameters(bArr2), (AsymmetricKeyParameter) new SPHINCSPrivateKeyParameters(bArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.treeDigest = ((SPHINCS256KeyGenerationParameters) keyGenerationParameters).getTreeDigest();
    }
}
