package org.spongycastle.pqc.crypto.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.prng.DigestRandomGenerator;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.ByteUtils;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import yg.C1561oA;
import yg.C1607wl;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28136k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28137n;
    private SecureRandom sr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28138t;

    protected int decryptOutputSize(int i2) {
        return 0;
    }

    protected int encryptOutputSize(int i2) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        if (!z2) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
            return;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Yd("'\u001f5!n5(':80<Bw\u001e10CA5#3A8DC", (short) (ZN.Xd() ^ 2904))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.sr = (SecureRandom) constructor.newInstance(objArr);
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = mcElieceCCA2PrivateKeyParameters.getParameters().getDigest();
        this.f28137n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f28136k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f28138t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    public void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) throws Throwable {
        SecureRandom secureRandom = this.sr;
        if (secureRandom == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Xg.qd("%\u001d3\u001fl3&%86.:@u\u001c/.A?3!1?6BA", (short) (C1607wl.Xd() ^ 30520), (short) (C1607wl.Xd() ^ 25950))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                secureRandom = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.sr = secureRandom;
        this.messDigest = mcElieceCCA2PublicKeyParameters.getParameters().getDigest();
        this.f28137n = mcElieceCCA2PublicKeyParameters.getN();
        this.f28136k = mcElieceCCA2PublicKeyParameters.getK();
        this.f28138t = mcElieceCCA2PublicKeyParameters.getT();
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws Exception {
        int i2 = (this.f28137n + 7) >> 3;
        int length = bArr.length - i2;
        byte[][] bArrSplit = ByteUtils.split(bArr, i2);
        byte[] bArr2 = bArrSplit[0];
        byte[] bArr3 = bArrSplit[1];
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f28137n, bArr2));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i3 = 0; i3 < length; i3++) {
            bArr4[i3] = (byte) (bArr4[i3] ^ bArr3[i3]);
        }
        this.messDigest.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr5, 0);
        if (Conversions.encode(this.f28137n, this.f28138t, bArr5).equals(gF2Vector)) {
            return ByteUtils.split(bArr4, length - (this.f28136k >> 3))[0];
        }
        throw new Exception("Bad Padding: Invalid ciphertext.");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) throws Exception {
        int i2 = this.f28136k >> 3;
        byte[] bArr2 = new byte[i2];
        SecureRandom secureRandom = this.sr;
        Object[] objArr = {bArr2};
        Method method = Class.forName(Jg.Wd("\nqv\u0015JC%\u0013QAlhX=R\u0019}\u00055\u001c001VN{", (short) (Od.Xd() ^ (-2935)), (short) (Od.Xd() ^ (-26056)))).getMethod(ZO.xd("c\u0018]'ba0>5", (short) (Od.Xd() ^ (-438)), (short) (Od.Xd() ^ (-17723))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            GF2Vector gF2Vector = new GF2Vector(this.f28136k, this.sr);
            byte[] encoded = gF2Vector.getEncoded();
            byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
            this.messDigest.update(bArrConcatenate, 0, bArrConcatenate.length);
            byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.doFinal(bArr3, 0);
            byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f28137n, this.f28138t, bArr3)).getEncoded();
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(encoded);
            byte[] bArr4 = new byte[bArr.length + i2];
            digestRandomGenerator.nextBytes(bArr4);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                int length = bArr.length + i4;
                bArr4[length] = (byte) (bArr4[length] ^ bArr2[i4]);
            }
            return ByteUtils.concatenate(encoded2, bArr4);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
