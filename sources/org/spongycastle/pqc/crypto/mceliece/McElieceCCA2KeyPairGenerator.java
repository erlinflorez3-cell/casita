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
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28112m;
    private McElieceCCA2KeyGenerationParameters mcElieceCCA2Params;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28113n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28114t;

    private void initializeDefault() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Qd("3)='r7(%62(26i\u000e\u001f\u001c-)\u001b\u0007\u0015!\u0016 \u001d", (short) (C1633zX.Xd() ^ (-15252)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            init(new McElieceCCA2KeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceCCA2Parameters()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws Throwable {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f28112m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f28114t, 'I', this.random);
        PolynomialGF2mSmallM[] squareRootMatrix = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GF2Matrix gF2MatrixCreateCanonicalCheckMatrix = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(gF2MatrixCreateCanonicalCheckMatrix, this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McElieceCCA2PublicKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.2", this.f28113n, this.f28114t, gF2Matrix, this.mcElieceCCA2Params.getParameters()), (AsymmetricKeyParameter) new McElieceCCA2PrivateKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.2", this.f28113n, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, gF2MatrixCreateCanonicalCheckMatrix, squareRootMatrix, this.mcElieceCCA2Params.getParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.mcElieceCCA2Params = (McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1593ug.zd("( 6\"o6)(;91=Cx\u001f21DB6$4B9ED", (short) (C1607wl.Xd() ^ 3181), (short) (C1607wl.Xd() ^ 1472))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.f28112m = this.mcElieceCCA2Params.getParameters().getM();
            this.f28113n = this.mcElieceCCA2Params.getParameters().getN();
            this.f28114t = this.mcElieceCCA2Params.getParameters().getT();
            this.fieldPoly = this.mcElieceCCA2Params.getParameters().getFieldPoly();
            this.initialized = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
