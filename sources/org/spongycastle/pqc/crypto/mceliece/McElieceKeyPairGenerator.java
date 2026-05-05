package org.spongycastle.pqc.crypto.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2m;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28124m;
    private McElieceKeyGenerationParameters mcElieceParams;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28125n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28126t;

    private AsymmetricCipherKeyPair genKeyPair() throws Throwable {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f28124m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f28126t, 'I', this.random);
        PolynomialGF2mSmallM[] squareRootMatrix = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GF2Matrix gF2MatrixCreateCanonicalCheckMatrix = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(gF2MatrixCreateCanonicalCheckMatrix, this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        GF2Matrix gF2MatrixExtendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        GF2Matrix[] gF2MatrixArrCreateRandomRegularMatrixAndItsInverse = GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.random);
        Permutation permutation2 = new Permutation(this.f28125n, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McEliecePublicKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", this.f28125n, this.f28126t, (GF2Matrix) ((GF2Matrix) gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[0].rightMultiply(gF2MatrixExtendLeftCompactForm)).rightMultiply(permutation2), this.mcElieceParams.getParameters()), (AsymmetricKeyParameter) new McEliecePrivateKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", this.f28125n, numRows, gF2mField, polynomialGF2mSmallM, gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[1], permutation, permutation2, gF2MatrixCreateCanonicalCheckMatrix, squareRootMatrix, this.mcElieceParams.getParameters()));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.mcElieceParams = (McElieceKeyGenerationParameters) keyGenerationParameters;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.Zd("9\bPtt0u-r%\u000fs,\u0016/z,\u0014D2R\u0017we&[", (short) (C1580rY.Xd() ^ (-21440)), (short) (C1580rY.Xd() ^ (-2714)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.f28124m = this.mcElieceParams.getParameters().getM();
            this.f28125n = this.mcElieceParams.getParameters().getN();
            this.f28126t = this.mcElieceParams.getParameters().getT();
            this.fieldPoly = this.mcElieceParams.getParameters().getFieldPoly();
            this.initialized = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void initializeDefault() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Xd("A9O;\tOBATRJV\\\u00128KJ][O=M[R^]", (short) (C1607wl.Xd() ^ 1520))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initialize(new McElieceKeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceParameters()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        initialize(keyGenerationParameters);
    }
}
