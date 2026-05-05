package org.bouncycastle.pqc.crypto.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Xg;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27760m;
    private McElieceKeyGenerationParameters mcElieceParams;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27761n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27762t;

    private AsymmetricCipherKeyPair genKeyPair() throws Throwable {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f27760m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f27762t, 'I', this.random);
        new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        GF2Matrix gF2MatrixExtendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        GF2Matrix[] gF2MatrixArrCreateRandomRegularMatrixAndItsInverse = GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.random);
        Permutation permutation2 = new Permutation(this.f27761n, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McEliecePublicKeyParameters(this.f27761n, this.f27762t, (GF2Matrix) ((GF2Matrix) gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[0].rightMultiply(gF2MatrixExtendLeftCompactForm)).rightMultiply(permutation2)), (AsymmetricKeyParameter) new McEliecePrivateKeyParameters(this.f27761n, numRows, gF2mField, polynomialGF2mSmallM, permutation, permutation2, gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[1]));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.mcElieceParams = (McElieceKeyGenerationParameters) keyGenerationParameters;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Yd("\u0005|\u0013~L\u0013\u0006\u0005\u0018\u0016\u000e\u001a U{\u000f\u000e!\u001f\u0013\u0001\u0011\u001f\u0016\"!", (short) (OY.Xd() ^ 29014))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.f27760m = this.mcElieceParams.getParameters().getM();
            this.f27761n = this.mcElieceParams.getParameters().getN();
            this.f27762t = this.mcElieceParams.getParameters().getT();
            this.fieldPoly = this.mcElieceParams.getParameters().getFieldPoly();
            this.initialized = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void initializeDefault() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Xg.qd("+#9%r9,+><4@F{\"54GE9'7E<HG", (short) (FB.Xd() ^ 27953), (short) (FB.Xd() ^ 19916))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initialize(new McElieceKeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceParameters()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        initialize(keyGenerationParameters);
    }
}
