package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public static final int BASIS_TYPE_STANDARD = 0;
    public static final int BASIS_TYPE_TRANSPOSE = 1;
    public static final int KEY_GEN_ALG_FLOAT = 1;
    public static final int KEY_GEN_ALG_RESULTANT = 0;
    public int B;
    public int N;
    public int basisType;
    double beta;
    public double betaSq;
    int bitsF;

    /* JADX INFO: renamed from: d */
    public int f28153d;

    /* JADX INFO: renamed from: d1 */
    public int f28154d1;
    public int d2;
    public int d3;
    public Digest hashAlg;
    public int keyGenAlg;
    double keyNormBound;
    public double keyNormBoundSq;
    double normBound;
    public double normBoundSq;
    public int polyType;
    public boolean primeCheck;

    /* JADX INFO: renamed from: q */
    public int f28155q;
    public int signFailTolerance;
    public boolean sparse;
    public static final NTRUSigningKeyGenerationParameters APR2011_439 = new NTRUSigningKeyGenerationParameters(439, 2048, 146, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_439_PROD = new NTRUSigningKeyGenerationParameters(439, 2048, 9, 8, 5, 1, 1, 0.165d, 490.0d, 280.0d, false, true, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743 = new NTRUSigningKeyGenerationParameters(743, 2048, 248, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters APR2011_743_PROD = new NTRUSigningKeyGenerationParameters(743, 2048, 11, 11, 15, 1, 1, 0.127d, 560.0d, 360.0d, true, false, 0, new SHA512Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157 = new NTRUSigningKeyGenerationParameters(157, 256, 29, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());
    public static final NTRUSigningKeyGenerationParameters TEST157_PROD = new NTRUSigningKeyGenerationParameters(157, 256, 5, 5, 8, 1, 1, 0.38d, 200.0d, 80.0d, false, false, 0, new SHA256Digest());

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUSigningKeyGenerationParameters(int i2, int i3, int i4, int i5, int i6, double d2, double d3, double d4, boolean z2, boolean z3, int i7, Digest digest) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(hg.Vd("pfzd0tebsoeos'K\\YjfXDR^S]Z", (short) (FB.Xd() ^ 5925), (short) (FB.Xd() ^ 14965))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), i2);
            this.signFailTolerance = 100;
            this.bitsF = 6;
            this.N = i2;
            this.f28155q = i3;
            this.f28153d = i4;
            this.B = i5;
            this.basisType = i6;
            this.beta = d2;
            this.normBound = d3;
            this.keyNormBound = d4;
            this.primeCheck = z2;
            this.sparse = z3;
            this.keyGenAlg = i7;
            this.hashAlg = digest;
            this.polyType = 0;
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUSigningKeyGenerationParameters(int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d2, double d3, double d4, boolean z2, boolean z3, int i9, Digest digest) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.ud("E;O9\u0005I:7HD:DH{ 1.?;-\u0019'3(2/", (short) (Od.Xd() ^ (-12488)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), i2);
            this.signFailTolerance = 100;
            this.bitsF = 6;
            this.N = i2;
            this.f28155q = i3;
            this.f28154d1 = i4;
            this.d2 = i5;
            this.d3 = i6;
            this.B = i7;
            this.basisType = i8;
            this.beta = d2;
            this.normBound = d3;
            this.keyNormBound = d4;
            this.primeCheck = z2;
            this.sparse = z3;
            this.keyGenAlg = i9;
            this.hashAlg = digest;
            this.polyType = 1;
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUSigningKeyGenerationParameters(InputStream inputStream) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.yd("\u0013\u000b\u001d\tZ!\u0010\u000f\u0016\u0014\b\u0014\u001eSu\t{\u000f\t|n~\t\u007f\u007f~", (short) (C1633zX.Xd() ^ (-8879)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), 0);
            this.signFailTolerance = 100;
            this.bitsF = 6;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.N = dataInputStream.readInt();
            this.f28155q = dataInputStream.readInt();
            this.f28153d = dataInputStream.readInt();
            this.f28154d1 = dataInputStream.readInt();
            this.d2 = dataInputStream.readInt();
            this.d3 = dataInputStream.readInt();
            this.B = dataInputStream.readInt();
            this.basisType = dataInputStream.readInt();
            this.beta = dataInputStream.readDouble();
            this.normBound = dataInputStream.readDouble();
            this.keyNormBound = dataInputStream.readDouble();
            this.signFailTolerance = dataInputStream.readInt();
            this.primeCheck = dataInputStream.readBoolean();
            this.sparse = dataInputStream.readBoolean();
            this.bitsF = dataInputStream.readInt();
            this.keyGenAlg = dataInputStream.read();
            String utf = dataInputStream.readUTF();
            if (C1561oA.Yd("ND>+413", (short) (OY.Xd() ^ 4424)).equals(utf)) {
                this.hashAlg = new SHA512Digest();
            } else if (Xg.qd("\n\u007fyflpr", (short) (OY.Xd() ^ 26892), (short) (OY.Xd() ^ 23983)).equals(utf)) {
                this.hashAlg = new SHA256Digest();
            }
            this.polyType = dataInputStream.read();
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void init() {
        double d2 = this.beta;
        this.betaSq = d2 * d2;
        double d3 = this.normBound;
        this.normBoundSq = d3 * d3;
        double d4 = this.keyNormBound;
        this.keyNormBoundSq = d4 * d4;
    }

    public NTRUSigningKeyGenerationParameters clone() {
        return this.polyType == 0 ? new NTRUSigningKeyGenerationParameters(this.N, this.f28155q, this.f28153d, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg) : new NTRUSigningKeyGenerationParameters(this.N, this.f28155q, this.f28154d1, this.d2, this.d3, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningKeyGenerationParameters)) {
            return false;
        }
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = (NTRUSigningKeyGenerationParameters) obj;
        if (this.B != nTRUSigningKeyGenerationParameters.B || this.N != nTRUSigningKeyGenerationParameters.N || this.basisType != nTRUSigningKeyGenerationParameters.basisType || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.betaSq) || this.bitsF != nTRUSigningKeyGenerationParameters.bitsF || this.f28153d != nTRUSigningKeyGenerationParameters.f28153d || this.f28154d1 != nTRUSigningKeyGenerationParameters.f28154d1 || this.d2 != nTRUSigningKeyGenerationParameters.d2 || this.d3 != nTRUSigningKeyGenerationParameters.d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.keyGenAlg == nTRUSigningKeyGenerationParameters.keyGenAlg && Double.doubleToLongBits(this.keyNormBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBound) && Double.doubleToLongBits(this.keyNormBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBoundSq) && Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBoundSq) && this.polyType == nTRUSigningKeyGenerationParameters.polyType && this.primeCheck == nTRUSigningKeyGenerationParameters.primeCheck && this.f28155q == nTRUSigningKeyGenerationParameters.f28155q && this.signFailTolerance == nTRUSigningKeyGenerationParameters.signFailTolerance && this.sparse == nTRUSigningKeyGenerationParameters.sparse;
    }

    public NTRUSigningParameters getSigningParameters() {
        return new NTRUSigningParameters(this.N, this.f28155q, this.f28153d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public int hashCode() {
        int i2 = ((((this.B + 31) * 31) + this.N) * 31) + this.basisType;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i4 = ((((((((((((i3 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f28153d) * 31) + this.f28154d1) * 31) + this.d2) * 31) + this.d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = ((i4 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + this.keyGenAlg;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.keyNormBound);
        int i5 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.keyNormBoundSq);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.normBound);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.normBoundSq);
        return (((((((((((i7 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31) + this.polyType) * 31) + (this.primeCheck ? 1231 : 1237)) * 31) + this.f28155q) * 31) + this.signFailTolerance) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f28155q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE d=" + this.f28153d);
        } else {
            sb.append(" polyType=PRODUCT d1=" + this.f28154d1 + " d2=" + this.d2 + " d3=" + this.d3);
        }
        sb.append(" B=" + this.B + " basisType=" + this.basisType + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " keyNormBound=" + decimalFormat.format(this.keyNormBound) + " prime=" + this.primeCheck + " sparse=" + this.sparse + " keyGenAlg=" + this.keyGenAlg + " hashAlg=" + this.hashAlg + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f28155q);
        dataOutputStream.writeInt(this.f28153d);
        dataOutputStream.writeInt(this.f28154d1);
        dataOutputStream.writeInt(this.d2);
        dataOutputStream.writeInt(this.d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeInt(this.basisType);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeDouble(this.keyNormBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeBoolean(this.primeCheck);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.write(this.keyGenAlg);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
        dataOutputStream.write(this.polyType);
    }
}
