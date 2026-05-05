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
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int fieldPoly;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27745m;
    private McElieceCCA2KeyGenerationParameters mcElieceCCA2Params;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27746n;
    private SecureRandom random;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27747t;

    private void initializeDefault() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Xd("c[q]+qdcvtlx~4Zml\u007f}q_o}t\u0001\u007f", (short) (Od.Xd() ^ (-14842)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            init(new McElieceCCA2KeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceCCA2Parameters()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws Throwable {
        if (!this.initialized) {
            initializeDefault();
        }
        GF2mField gF2mField = new GF2mField(this.f27745m, this.fieldPoly);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f27747t, 'I', this.random);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.random);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McElieceCCA2PublicKeyParameters(this.f27746n, this.f27747t, gF2Matrix, this.mcElieceCCA2Params.getParameters().getDigest()), (AsymmetricKeyParameter) new McElieceCCA2PrivateKeyParameters(this.f27746n, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, this.mcElieceCCA2Params.getParameters().getDigest()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.mcElieceCCA2Params = (McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        short sXd = (short) (C1580rY.Xd() ^ (-16494));
        int[] iArr = new int["ME[G\rSFEPNFRP\u0006,?Vig[AQ_VZY".length()];
        QB qb = new QB("ME[G\rSFEPNFRP\u0006,?Vig[AQ_VZY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.f27745m = this.mcElieceCCA2Params.getParameters().getM();
            this.f27746n = this.mcElieceCCA2Params.getParameters().getN();
            this.f27747t = this.mcElieceCCA2Params.getParameters().getT();
            this.fieldPoly = this.mcElieceCCA2Params.getParameters().getFieldPoly();
            this.initialized = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
