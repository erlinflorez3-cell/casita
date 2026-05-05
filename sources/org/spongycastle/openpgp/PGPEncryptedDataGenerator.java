package org.spongycastle.openpgp;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.bcpg.BCPGOutputStream;
import org.spongycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.spongycastle.openpgp.operator.PBEKeyEncryptionMethodGenerator;
import org.spongycastle.openpgp.operator.PGPDataEncryptor;
import org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.openpgp.operator.PGPKeyEncryptionMethodGenerator;
import org.spongycastle.util.io.TeeOutputStream;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class PGPEncryptedDataGenerator implements SymmetricKeyAlgorithmTags, StreamGenerator {
    public static final int S2K_SHA1 = 2;
    public static final int S2K_SHA224 = 11;
    public static final int S2K_SHA256 = 8;
    public static final int S2K_SHA384 = 9;
    public static final int S2K_SHA512 = 10;
    private OutputStream cOut;
    private PGPDataEncryptorBuilder dataEncryptorBuilder;
    private int defAlgorithm;
    private PGPDigestCalculator digestCalc;
    private OutputStream genOut;
    private List methods;
    private boolean oldFormat;
    private BCPGOutputStream pOut;
    private SecureRandom rand;

    private class ClosableBCPGOutputStream extends BCPGOutputStream {
        public ClosableBCPGOutputStream(OutputStream outputStream, int i2, long j2) throws IOException {
            super(outputStream, i2, j2);
        }

        public ClosableBCPGOutputStream(OutputStream outputStream, int i2, long j2, boolean z2) throws IOException {
            super(outputStream, i2, j2, z2);
        }

        public ClosableBCPGOutputStream(OutputStream outputStream, int i2, byte[] bArr) throws IOException {
            super(outputStream, i2, bArr);
        }

        @Override // org.spongycastle.bcpg.BCPGOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            finish();
        }
    }

    public PGPEncryptedDataGenerator(PGPDataEncryptorBuilder pGPDataEncryptorBuilder) {
        this(pGPDataEncryptorBuilder, false);
    }

    public PGPEncryptedDataGenerator(PGPDataEncryptorBuilder pGPDataEncryptorBuilder, boolean z2) {
        this.oldFormat = false;
        this.methods = new ArrayList();
        this.dataEncryptorBuilder = pGPDataEncryptorBuilder;
        this.oldFormat = z2;
        this.defAlgorithm = pGPDataEncryptorBuilder.getAlgorithm();
        this.rand = this.dataEncryptorBuilder.getSecureRandom();
    }

    private void addCheckSum(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 1; i3 != bArr.length - 2; i3++) {
            byte b2 = bArr[i3];
            i2 += (b2 + 255) - (b2 | 255);
        }
        bArr[bArr.length - 2] = (byte) (i2 >> 8);
        bArr[bArr.length - 1] = (byte) i2;
    }

    private byte[] createSessionInfo(int i2, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 3];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        addCheckSum(bArr2);
        return bArr2;
    }

    private OutputStream open(OutputStream outputStream, long j2, byte[] bArr) throws Throwable {
        byte[] bArrMakeRandomKey;
        if (this.cOut != null) {
            throw new IllegalStateException(hg.Vd("urzp|j|vx%eotfacw\u001dei\u001ahh\\d\u0015ggSeU", (short) (FB.Xd() ^ 20314), (short) (FB.Xd() ^ 17475)));
        }
        if (this.methods.size() == 0) {
            throw new IllegalStateException(Qg.kd("99h-5)7=36*/-]*!/\"(\u001c*U($\u0018\u0015\u001a\u0016\u0018\u0013\u0011", (short) (C1633zX.Xd() ^ (-909)), (short) (C1633zX.Xd() ^ (-32681))));
        }
        this.pOut = new BCPGOutputStream(outputStream);
        this.defAlgorithm = this.dataEncryptorBuilder.getAlgorithm();
        this.rand = this.dataEncryptorBuilder.getSecureRandom();
        if (this.methods.size() != 1) {
            bArrMakeRandomKey = PGPUtil.makeRandomKey(this.defAlgorithm, this.rand);
            byte[] bArrCreateSessionInfo = createSessionInfo(this.defAlgorithm, bArrMakeRandomKey);
            for (int i2 = 0; i2 != this.methods.size(); i2++) {
                this.pOut.writePacket(((PGPKeyEncryptionMethodGenerator) this.methods.get(i2)).generate(this.defAlgorithm, bArrCreateSessionInfo));
            }
        } else if (this.methods.get(0) instanceof PBEKeyEncryptionMethodGenerator) {
            bArrMakeRandomKey = ((PBEKeyEncryptionMethodGenerator) this.methods.get(0)).getKey(this.dataEncryptorBuilder.getAlgorithm());
            this.pOut.writePacket(((PGPKeyEncryptionMethodGenerator) this.methods.get(0)).generate(this.defAlgorithm, null));
        } else {
            bArrMakeRandomKey = PGPUtil.makeRandomKey(this.defAlgorithm, this.rand);
            this.pOut.writePacket(((PGPKeyEncryptionMethodGenerator) this.methods.get(0)).generate(this.defAlgorithm, createSessionInfo(this.defAlgorithm, bArrMakeRandomKey)));
        }
        try {
            PGPDataEncryptor pGPDataEncryptorBuild = this.dataEncryptorBuilder.build(bArrMakeRandomKey);
            PGPDigestCalculator integrityCalculator = pGPDataEncryptorBuild.getIntegrityCalculator();
            this.digestCalc = integrityCalculator;
            if (bArr == null) {
                if (integrityCalculator != null) {
                    ClosableBCPGOutputStream closableBCPGOutputStream = new ClosableBCPGOutputStream(outputStream, 18, j2 + ((long) pGPDataEncryptorBuild.getBlockSize()) + 25);
                    this.pOut = closableBCPGOutputStream;
                    closableBCPGOutputStream.write(1);
                } else {
                    this.pOut = new ClosableBCPGOutputStream(outputStream, 9, j2 + ((long) pGPDataEncryptorBuild.getBlockSize()) + 2, this.oldFormat);
                }
            } else if (integrityCalculator != null) {
                ClosableBCPGOutputStream closableBCPGOutputStream2 = new ClosableBCPGOutputStream(outputStream, 18, bArr);
                this.pOut = closableBCPGOutputStream2;
                closableBCPGOutputStream2.write(1);
            } else {
                this.pOut = new ClosableBCPGOutputStream(outputStream, 9, bArr);
            }
            OutputStream outputStream2 = pGPDataEncryptorBuild.getOutputStream(this.pOut);
            this.cOut = outputStream2;
            this.genOut = outputStream2;
            if (this.digestCalc != null) {
                this.genOut = new TeeOutputStream(this.digestCalc.getOutputStream(), this.cOut);
            }
            int blockSize = pGPDataEncryptorBuild.getBlockSize();
            byte[] bArr2 = new byte[blockSize + 2];
            SecureRandom secureRandom = this.rand;
            short sXd = (short) (OY.Xd() ^ 22879);
            short sXd2 = (short) (OY.Xd() ^ 29714);
            int[] iArr = new int["\u000f9`5\u0004Sv~\u0013y\u00039@~\u00162qm|YHa\u001e\u001e+\u0013".length()];
            QB qb = new QB("\u000f9`5\u0004Sv~\u0013y\u00039@~\u00162qm|YHa\u001e\u001e+\u0013");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Object[] objArr = {bArr2};
            Method method = cls.getMethod(C1561oA.Xd("\n\u0002\u0016\u0013a\u001a\u0016\b\u0017", (short) (Od.Xd() ^ (-28473))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                bArr2[blockSize + 1] = bArr2[blockSize - 1];
                bArr2[blockSize] = bArr2[blockSize - 2];
                this.genOut.write(bArr2);
                return new WrappedGeneratorStream(this.genOut, this);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            short sXd3 = (short) (C1607wl.Xd() ^ 4556);
            int[] iArr2 = new int["+]KLZ]UZL|CQGBXLd\\\u0018Zcid``".length()];
            QB qb2 = new QB("+]KLZ]UZL|CQGBXLd\\\u0018Zcid``");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
                i4++;
            }
            throw new PGPException(new String(iArr2, 0, i4), e3);
        }
    }

    public void addMethod(PGPKeyEncryptionMethodGenerator pGPKeyEncryptionMethodGenerator) {
        this.methods.add(pGPKeyEncryptionMethodGenerator);
    }

    @Override // org.spongycastle.openpgp.StreamGenerator
    public void close() throws IOException {
        if (this.cOut != null) {
            if (this.digestCalc != null) {
                new BCPGOutputStream(this.genOut, 19, 20L).flush();
                this.cOut.write(this.digestCalc.getDigest());
            }
            this.cOut.close();
            this.cOut = null;
            this.pOut = null;
        }
    }

    public OutputStream open(OutputStream outputStream, long j2) throws PGPException, IOException {
        return open(outputStream, j2, null);
    }

    public OutputStream open(OutputStream outputStream, byte[] bArr) throws PGPException, IOException {
        return open(outputStream, 0L, bArr);
    }
}
