package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private short[] f27778b1;
    private short[] b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int[] vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                for (int i5 = i4; i5 < length2; i5++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i5 == i4) {
                        sArr2[i2][i3] = sArr[i2][i4][i5];
                    } else {
                        short[] sArr3 = sArr2[i2];
                        short[][] sArr4 = sArr[i2];
                        sArr3[i3] = GF2Field.addElem(sArr4[i4][i5], sArr4[i5][i4]);
                    }
                    i3++;
                }
            }
        }
    }

    private void computePublicKey() {
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.vi;
        int i2 = 0;
        int i3 = iArr[iArr.length - 1] - iArr[0];
        int i4 = iArr[iArr.length - 1];
        int i5 = 3;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4, i4);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
        this.pub_scalar = new short[i3];
        short[] sArr2 = new short[i4];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i6 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i6].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i6].getCoeffBeta();
            short[][] coeffGamma = this.layers[i6].getCoeffGamma();
            short[] coeffEta = this.layers[i6].getCoeffEta();
            int length = coeffAlpha[i2].length;
            int length2 = coeffBeta[i2].length;
            while (i2 < length) {
                for (int i8 = 0; i8 < length; i8++) {
                    for (int i9 = 0; i9 < length2; i9++) {
                        int i10 = i8 + length2;
                        short[] sArrMultVect = computeInField.multVect(coeffAlpha[i2][i8][i9], this.A2[i10]);
                        int i11 = i7 + i2;
                        sArr[i11] = computeInField.addSquareMatrix(sArr[i11], computeInField.multVects(sArrMultVect, this.A2[i9]));
                        short[] sArrMultVect2 = computeInField.multVect(this.b2[i9], sArrMultVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i11] = computeInField.addVect(sArrMultVect2, sArr3[i11]);
                        short[] sArrMultVect3 = computeInField.multVect(this.b2[i10], computeInField.multVect(coeffAlpha[i2][i8][i9], this.A2[i9]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i11] = computeInField.addVect(sArrMultVect3, sArr4[i11]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i2][i8][i9], this.b2[i10]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i11] = GF2Field.addElem(sArr5[i11], GF2Field.multElem(sMultElem, this.b2[i9]));
                    }
                }
                for (int i12 = 0; i12 < length2; i12++) {
                    for (int i13 = 0; i13 < length2; i13++) {
                        short[] sArrMultVect4 = computeInField.multVect(coeffBeta[i2][i12][i13], this.A2[i12]);
                        int i14 = i7 + i2;
                        sArr[i14] = computeInField.addSquareMatrix(sArr[i14], computeInField.multVects(sArrMultVect4, this.A2[i13]));
                        short[] sArrMultVect5 = computeInField.multVect(this.b2[i13], sArrMultVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i14] = computeInField.addVect(sArrMultVect5, sArr6[i14]);
                        short[] sArrMultVect6 = computeInField.multVect(this.b2[i12], computeInField.multVect(coeffBeta[i2][i12][i13], this.A2[i13]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i14] = computeInField.addVect(sArrMultVect6, sArr7[i14]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i2][i12][i13], this.b2[i12]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i14] = GF2Field.addElem(sArr8[i14], GF2Field.multElem(sMultElem2, this.b2[i13]));
                    }
                }
                for (int i15 = 0; i15 < length2 + length; i15++) {
                    short[] sArrMultVect7 = computeInField.multVect(coeffGamma[i2][i15], this.A2[i15]);
                    short[][] sArr9 = this.pub_singular;
                    int i16 = i7 + i2;
                    sArr9[i16] = computeInField.addVect(sArrMultVect7, sArr9[i16]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i16] = GF2Field.addElem(sArr10[i16], GF2Field.multElem(coeffGamma[i2][i15], this.b2[i15]));
                }
                short[] sArr11 = this.pub_scalar;
                int i17 = i7 + i2;
                sArr11[i17] = GF2Field.addElem(sArr11[i17], coeffEta[i2]);
                i2++;
            }
            i7 += length;
            i6++;
            i2 = 0;
            i5 = 3;
        }
        int[] iArr2 = new int[i5];
        iArr2[2] = i4;
        iArr2[1] = i4;
        iArr2[0] = i3;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, iArr2);
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
        short[] sArr14 = new short[i3];
        for (int i18 = 0; i18 < i3; i18++) {
            int i19 = 0;
            while (true) {
                short[][] sArr15 = this.A1;
                if (i19 < sArr15.length) {
                    sArr12[i18] = computeInField.addSquareMatrix(sArr12[i18], computeInField.multMatrix(sArr15[i18][i19], sArr[i19]));
                    sArr13[i18] = computeInField.addVect(sArr13[i18], computeInField.multVect(this.A1[i18][i19], this.pub_singular[i19]));
                    sArr14[i18] = GF2Field.addElem(sArr14[i18], GF2Field.multElem(this.A1[i18][i19], this.pub_scalar[i19]));
                    i19++;
                }
            }
            sArr14[i18] = GF2Field.addElem(sArr14[i18], this.f27778b1[i18]);
        }
        this.pub_singular = sArr13;
        this.pub_scalar = sArr14;
        compactPublicKey(sArr12);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i2 = 0;
        while (i2 < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.vi;
            int i3 = i2 + 1;
            layerArr[i2] = new Layer(iArr[i2], iArr[i3], this.sr);
            i2 = i3;
        }
    }

    private void generateL1() {
        int[] iArr = this.vi;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i2);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    short[] sArr = this.A1[i3];
                    int iNextInt = this.sr.nextInt();
                    sArr[i4] = (short) ((iNextInt + 255) - (iNextInt | 255));
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.f27778b1 = new short[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.f27778b1[i5] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.vi;
        int i2 = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i2);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    this.A2[i3][i4] = (short) ((-1) - (((-1) - this.sr.nextInt()) | ((-1) - 255)));
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.b2 = new short[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.b2[i5] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void initializeDefault() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.yd("rj|h:\u0001on\u0006\u0004w\u0004\u000eCex{\u000f\t|n~\t\u007f\u0010\u000f", (short) (C1633zX.Xd() ^ (-30423)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initialize(new RainbowKeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new RainbowParameters()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() throws Throwable {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f27778b1, this.A2inv, this.b2, this.vi, this.layers);
        int[] iArr = this.vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Yd("\u0002y\u0010{I\u0010\u0003\u0002\u0015\u0013\u000b\u0017\u001dRx\f\u000b\u001e\u001c\u0010}\u000e\u001c\u0013\u001f\u001e", (short) (Od.Xd() ^ (-2886)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.sr = (SecureRandom) constructor.newInstance(objArr);
            this.vi = this.rainbowParams.getParameters().getVi();
            this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
            this.initialized = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
