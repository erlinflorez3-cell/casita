package org.bouncycastle.cert.crmf;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class PKMACBuilder {
    private PKMACValuesCalculator calculator;
    private int iterationCount;
    private AlgorithmIdentifier mac;
    private int maxIterations;
    private AlgorithmIdentifier owf;
    private PBMParameter parameters;
    private SecureRandom random;
    private int saltLength;

    /* JADX INFO: renamed from: org.bouncycastle.cert.crmf.PKMACBuilder$1 */
    class AnonymousClass1 implements MacCalculator {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        final /* synthetic */ byte[] val$key;
        final /* synthetic */ PBMParameter val$params;

        AnonymousClass1(PBMParameter pBMParameter, byte[] bArr) {
            pBMParameter = pBMParameter;
            bArr = bArr;
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public GenericKey getKey() {
            return new GenericKey(getAlgorithmIdentifier(), bArr);
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public byte[] getMac() {
            try {
                return PKMACBuilder.this.calculator.calculateMac(bArr, this.bOut.toByteArray());
            } catch (CRMFException e2) {
                throw new RuntimeOperatorException("exception calculating mac: " + e2.getMessage(), e2);
            }
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public OutputStream getOutputStream() {
            return this.bOut;
        }
    }

    private PKMACBuilder(AlgorithmIdentifier algorithmIdentifier, int i2, AlgorithmIdentifier algorithmIdentifier2, PKMACValuesCalculator pKMACValuesCalculator) {
        this.saltLength = 20;
        this.owf = algorithmIdentifier;
        this.iterationCount = i2;
        this.mac = algorithmIdentifier2;
        this.calculator = pKMACValuesCalculator;
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator) {
        this(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1), 1000, new AlgorithmIdentifier(IANAObjectIdentifiers.hmacSHA1, DERNull.INSTANCE), pKMACValuesCalculator);
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator, int i2) {
        this.saltLength = 20;
        this.maxIterations = i2;
        this.calculator = pKMACValuesCalculator;
    }

    private void checkIterationCountCeiling(int i2) {
        int i3 = this.maxIterations;
        if (i3 > 0 && i2 > i3) {
            throw new IllegalArgumentException("iteration count exceeds limit (" + i2 + " > " + this.maxIterations + ")");
        }
    }

    private MacCalculator genCalculator(PBMParameter pBMParameter, char[] cArr) throws CRMFException {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        byte[] bArrCalculateDigest = new byte[uTF8ByteArray.length + octets.length];
        System.arraycopy(uTF8ByteArray, 0, bArrCalculateDigest, 0, uTF8ByteArray.length);
        System.arraycopy(octets, 0, bArrCalculateDigest, uTF8ByteArray.length, octets.length);
        this.calculator.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int iIntValue = pBMParameter.getIterationCount().getValue().intValue();
        do {
            bArrCalculateDigest = this.calculator.calculateDigest(bArrCalculateDigest);
            iIntValue--;
        } while (iIntValue > 0);
        return new MacCalculator() { // from class: org.bouncycastle.cert.crmf.PKMACBuilder.1
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            final /* synthetic */ byte[] val$key;
            final /* synthetic */ PBMParameter val$params;

            AnonymousClass1(PBMParameter pBMParameter2, byte[] bArrCalculateDigest2) {
                pBMParameter = pBMParameter2;
                bArr = bArrCalculateDigest2;
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), bArr);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return PKMACBuilder.this.calculator.calculateMac(bArr, this.bOut.toByteArray());
                } catch (CRMFException e2) {
                    throw new RuntimeOperatorException("exception calculating mac: " + e2.getMessage(), e2);
                }
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return this.bOut;
            }
        };
    }

    public MacCalculator build(char[] cArr) throws Throwable {
        PBMParameter pBMParameter = this.parameters;
        if (pBMParameter != null) {
            return genCalculator(pBMParameter, cArr);
        }
        byte[] bArr = new byte[this.saltLength];
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Kd("bZp\\*pcbuskw}3Ylk~|p^n|s\u007f~", (short) (C1607wl.Xd() ^ 29039))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        short sXd = (short) (C1499aX.Xd() ^ (-24432));
        short sXd2 = (short) (C1499aX.Xd() ^ (-7820));
        int[] iArr = new int["|x\u0011~N\u0017*+@@<hp(Pe\u0005\u001a\u001a\u0010\u00024B;IJ".length()];
        QB qb = new QB("|x\u0011~N\u0017*+@@<hp(Pe\u0005\u001a\u001a\u0010\u00024B;IJ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr2 = {bArr};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Xd("yq\u0006\u0003Q\n\u0006w\u0007", (short) (Od.Xd() ^ (-14409))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            return genCalculator(new PBMParameter(bArr, this.owf, this.iterationCount, this.mac), cArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public PKMACBuilder setIterationCount(int i2) {
        if (i2 < 100) {
            throw new IllegalArgumentException("iteration count must be at least 100");
        }
        checkIterationCountCeiling(i2);
        this.iterationCount = i2;
        return this;
    }

    public PKMACBuilder setParameters(PBMParameter pBMParameter) {
        checkIterationCountCeiling(pBMParameter.getIterationCount().getValue().intValue());
        this.parameters = pBMParameter;
        return this;
    }

    public PKMACBuilder setSaltLength(int i2) {
        if (i2 < 8) {
            throw new IllegalArgumentException("salt length must be at least 8 bytes");
        }
        this.saltLength = i2;
        return this;
    }

    public PKMACBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
