package org.spongycastle.pqc.crypto.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePKCSCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public int cipherTextSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28130k;
    McElieceKeyParameters key;
    public int maxPlainTextSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28131n;
    private SecureRandom sr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28132t;

    private byte[] computeMessage(GF2Vector gF2Vector) throws Exception {
        byte[] encoded = gF2Vector.getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            throw new Exception("Bad Padding: invalid ciphertext");
        }
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, 0, bArr, 0, length);
        return bArr;
    }

    private GF2Vector computeMessageRepresentative(byte[] bArr) {
        int i2 = this.maxPlainTextSize;
        int i3 = this.f28130k;
        byte[] bArr2 = new byte[i2 + ((i3 + 7) - (i3 | 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return GF2Vector.OS2VP(this.f28130k, bArr2);
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        if (!z2) {
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
            this.key = mcEliecePrivateKeyParameters;
            initCipherDecrypt(mcEliecePrivateKeyParameters);
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcEliecePublicKeyParameters;
            initCipherEncrypt(mcEliecePublicKeyParameters);
            return;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.ud("\u001c\u0012&\u0010[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fRv\b\u0005\u0016\u0012\u0004o}\n~\t\u0006", (short) (C1607wl.Xd() ^ 21399))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.sr = (SecureRandom) constructor.newInstance(objArr);
            McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) cipherParameters;
            this.key = mcEliecePublicKeyParameters2;
            initCipherEncrypt(mcEliecePublicKeyParameters2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void initCipherDecrypt(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f28131n = mcEliecePrivateKeyParameters.getN();
        int k2 = mcEliecePrivateKeyParameters.getK();
        this.f28130k = k2;
        this.maxPlainTextSize = k2 >> 3;
        this.cipherTextSize = this.f28131n >> 3;
    }

    public void initCipherEncrypt(McEliecePublicKeyParameters mcEliecePublicKeyParameters) throws Throwable {
        SecureRandom secureRandom = this.sr;
        if (secureRandom == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.yd("RJ`L\u001a`SRec[gm#I\\[nl`N^lcon", (short) (FB.Xd() ^ 15475))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                secureRandom = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.sr = secureRandom;
        this.f28131n = mcEliecePublicKeyParameters.getN();
        this.f28130k = mcEliecePublicKeyParameters.getK();
        this.f28132t = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f28131n >> 3;
        this.maxPlainTextSize = this.f28130k >> 3;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws Exception {
        GF2Vector gF2VectorOS2VP = GF2Vector.OS2VP(this.f28131n, bArr);
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.key;
        GF2mField field = mcEliecePrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        Permutation p1 = mcEliecePrivateKeyParameters.getP1();
        Permutation p2 = mcEliecePrivateKeyParameters.getP2();
        GF2Matrix h2 = mcEliecePrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        Permutation permutationRightMultiply = p1.rightMultiply(p2);
        GF2Vector gF2Vector = (GF2Vector) gF2VectorOS2VP.multiply(permutationRightMultiply.computeInverse());
        GF2Vector gF2VectorSyndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h2.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        GF2Vector gF2Vector2 = (GF2Vector) ((GF2Vector) gF2Vector.add(gF2VectorSyndromeDecode)).multiply(p1);
        return computeMessage((GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.f28130k)));
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        GF2Vector gF2VectorComputeMessageRepresentative = computeMessageRepresentative(bArr);
        return ((GF2Vector) ((McEliecePublicKeyParameters) this.key).getG().leftMultiply(gF2VectorComputeMessageRepresentative).add(new GF2Vector(this.f28131n, this.f28132t, this.sr))).getEncoded();
    }
}
