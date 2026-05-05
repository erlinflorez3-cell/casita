package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import yg.C1633zX;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowSigner implements MessageSigner {
    private ComputeInField cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[] f27780x;

    private short[] initSign(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] sArrMultiplyMatrix = this.cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i2 = 0; i2 < layerArr[0].getVi(); i2++) {
            this.f27780x[i2] = (short) this.random.nextInt();
            short[] sArr3 = this.f27780x;
            short s2 = sArr3[i2];
            sArr3[i2] = (short) ((s2 + 255) - (s2 | 255));
        }
        return sArrMultiplyMatrix;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i2 = this.signableDocumentLength;
        short[] sArr = new short[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            short s2 = bArr[i4];
            sArr[i3] = s2;
            sArr[i3] = (short) ((-1) - (((-1) - s2) | ((-1) - 255)));
            i4++;
            i3++;
            if (i3 >= i2) {
                break;
            }
        }
        return sArr;
    }

    private short[] verifySignatureIntern(short[] sArr) {
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.key).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.key).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.key).getCoeffScalar();
        short[] sArr2 = new short[coeffQuadratic.length];
        int length = coeffSingular[0].length;
        for (int i2 = 0; i2 < coeffQuadratic.length; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                for (int i5 = i4; i5 < length; i5++) {
                    sArr2[i2] = GF2Field.addElem(sArr2[i2], GF2Field.multElem(coeffQuadratic[i2][i3], GF2Field.multElem(sArr[i4], sArr[i5])));
                    i3++;
                }
                sArr2[i2] = GF2Field.addElem(sArr2[i2], GF2Field.multElem(coeffSingular[i2][i4], sArr[i4]));
            }
            sArr2[i2] = GF2Field.addElem(sArr2[i2], coeffScalar[i2]);
        }
        return sArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        short[] sArrInitSign;
        int i2;
        int i3;
        int i4;
        Layer[] layers = ((RainbowPrivateKeyParameters) this.key).getLayers();
        int length = layers.length;
        this.f27780x = new short[((RainbowPrivateKeyParameters) this.key).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        while (true) {
            try {
                sArrInitSign = initSign(layers, makeMessageRepresentative(bArr));
                i4 = 0;
                break;
            } catch (Exception unused) {
            }
        }
        for (i3 = 0; i3 < length; i3++) {
            short[] sArr = new short[layers[i3].getOi()];
            short[] sArr2 = new short[layers[i3].getOi()];
            for (int i5 = 0; i5 < layers[i3].getOi(); i5++) {
                sArr[i5] = sArrInitSign[i4];
                i4++;
            }
            short[] sArrSolveEquation = this.cf.solveEquation(layers[i3].plugInVinegars(this.f27780x), sArr);
            if (sArrSolveEquation == null) {
                throw new Exception("LES is not solveable!");
            }
            for (int i6 = 0; i6 < sArrSolveEquation.length; i6++) {
                this.f27780x[layers[i3].getVi() + i6] = sArrSolveEquation[i6];
            }
        }
        short[] sArrMultiplyMatrix = this.cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA2(), this.cf.addVect(((RainbowPrivateKeyParameters) this.key).getB2(), this.f27780x));
        for (i2 = 0; i2 < viNext; i2++) {
            bArr2[i2] = (byte) sArrMultiplyMatrix[i2];
        }
        return bArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        RainbowKeyParameters rainbowKeyParameters;
        if (!z2) {
            rainbowKeyParameters = (RainbowPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
                this.signableDocumentLength = this.key.getDocLength();
            }
            short sXd = (short) (C1633zX.Xd() ^ (-24411));
            short sXd2 = (short) (C1633zX.Xd() ^ (-20293));
            int[] iArr = new int["\t\u0001\u0017\u0003P\u0017\n\t\u001c\u001a\u0012\u001e$Y\u007f\u0013\u0012%#\u0017\u0005\u0015#\u001a&%".length()];
            QB qb = new QB("\t\u0001\u0017\u0003P\u0017\n\t\u001c\u001a\u0012\u001e$Y\u007f\u0013\u0012%#\u0017\u0005\u0015#\u001a&%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
                rainbowKeyParameters = (RainbowPrivateKeyParameters) cipherParameters;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.key = rainbowKeyParameters;
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            sArr[i2] = (short) (bArr2[i2] & 255);
        }
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        short[] sArrVerifySignatureIntern = verifySignatureIntern(sArr);
        if (sArrMakeMessageRepresentative.length != sArrVerifySignatureIntern.length) {
            return false;
        }
        boolean z2 = true;
        for (int i3 = 0; i3 < sArrMakeMessageRepresentative.length; i3++) {
            z2 = z2 && sArrMakeMessageRepresentative[i3] == sArrVerifySignatureIntern[i3];
        }
        return z2;
    }
}
