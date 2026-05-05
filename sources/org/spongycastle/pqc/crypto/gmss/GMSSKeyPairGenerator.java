package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Vector;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() throws Throwable {
        int i2;
        int i3;
        if (!this.initialized) {
            initializeDefault();
        }
        int i4 = this.numLayer;
        byte[][][] bArr = new byte[i4][][];
        byte[][][] bArr2 = new byte[i4 - 1][][];
        Treehash[][] treehashArr = new Treehash[i4][];
        Treehash[][] treehashArr2 = new Treehash[i4 - 1][];
        Vector[] vectorArr = new Vector[i4];
        Vector[] vectorArr2 = new Vector[i4 - 1];
        Vector[][] vectorArr3 = new Vector[i4][];
        int i5 = 1;
        Vector[][] vectorArr4 = new Vector[i4 - 1][];
        int i6 = 0;
        while (true) {
            i2 = this.numLayer;
            if (i6 >= i2) {
                break;
            }
            bArr[i6] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTrees[i6], this.mdLength);
            int i7 = this.heightOfTrees[i6];
            treehashArr[i6] = new Treehash[i7 - this.K[i6]];
            if (i6 > 0) {
                int i8 = i6 - 1;
                bArr2[i8] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i7, this.mdLength);
                treehashArr2[i8] = new Treehash[this.heightOfTrees[i6] - this.K[i6]];
            }
            vectorArr[i6] = new Vector();
            if (i6 > 0) {
                vectorArr2[i6 - 1] = new Vector();
            }
            i6++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, this.mdLength);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.numLayer - 1, this.mdLength);
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.numLayer, this.mdLength);
        int i9 = 0;
        while (true) {
            i3 = this.numLayer;
            if (i9 >= i3) {
                break;
            }
            System.arraycopy(this.currentSeeds[i9], 0, bArr5[i9], 0, this.mdLength);
            i9++;
            i5 = 1;
        }
        int[] iArr = new int[2];
        iArr[i5] = this.mdLength;
        iArr[0] = i3 - i5;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr);
        int i10 = this.numLayer - i5;
        while (i10 >= 0) {
            GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i10], this.K[i10], this.digestProvider);
            try {
                gMSSRootCalc = i10 == this.numLayer - 1 ? generateCurrentAuthpathAndRoot(null, vectorArr[i10], bArr5[i10], i10) : generateCurrentAuthpathAndRoot(bArr3[i10 + 1], vectorArr[i10], bArr5[i10], i10);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            for (int i11 = 0; i11 < this.heightOfTrees[i10]; i11++) {
                System.arraycopy(gMSSRootCalc.getAuthPath()[i11], 0, bArr[i10][i11], 0, this.mdLength);
            }
            vectorArr3[i10] = gMSSRootCalc.getRetain();
            treehashArr[i10] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr3[i10], 0, this.mdLength);
            i10--;
        }
        for (int i12 = this.numLayer - 2; i12 >= 0; i12--) {
            int i13 = i12 + 1;
            GMSSRootCalc gMSSRootCalcGenerateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i12], bArr5[i13], i13);
            for (int i14 = 0; i14 < this.heightOfTrees[i13]; i14++) {
                System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getAuthPath()[i14], 0, bArr2[i12][i14], 0, this.mdLength);
            }
            vectorArr4[i12] = gMSSRootCalcGenerateNextAuthpathAndRoot.getRetain();
            treehashArr2[i12] = gMSSRootCalcGenerateNextAuthpathAndRoot.getTreehash();
            System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getRoot(), 0, bArr4[i12], 0, this.mdLength);
            System.arraycopy(bArr5[i13], 0, this.nextNextSeeds[i12], 0, this.mdLength);
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr3[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i2) {
        byte[] bArrVerify;
        int i3 = this.mdLength;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i2], this.K[i2], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i2 == this.numLayer - 1) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i2]).getPublicKey();
        } else {
            this.currentRootSigs[i2] = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i2]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i2]).Verify(bArr, this.currentRootSigs[i2]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = this.heightOfTrees[i2];
            if (i6 >= (1 << i7)) {
                break;
            }
            if (i6 == i4 && i5 < i7 - this.K[i2]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i5);
                i4 *= 2;
                i5++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i2]).getPublicKey());
            i6++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i2], this.K[i2], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i3 = 3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.heightOfTrees[i2];
            if (i4 >= (1 << i6)) {
                break;
            }
            if (i4 == i3 && i5 < i6 - this.K[i2]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i5);
                i3 *= 2;
                i5++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i2]).getPublicKey());
            i4++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() throws Throwable {
        int[] iArr = {10, 10, 10, 10};
        int[] iArr2 = {3, 3, 3, 3};
        int[] iArr3 = {2, 2, 2, 2};
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Jg.Wd("-`1\u001c&KYx'c8c\u0004t[)Gv4b\u0011<h\u001bg!", (short) (FB.Xd() ^ 18371), (short) (FB.Xd() ^ 15429))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initialize(new GMSSKeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new GMSSParameters(4, iArr, iArr2, iArr3)));
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

    public void initialize(int i2, SecureRandom secureRandom) throws Throwable {
        initialize(i2 <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i2 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) throws Throwable {
        this.gmssParams = (GMSSKeyGenerationParameters) keyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(this.gmssParams.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.numLayer, this.mdLength);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.numLayer - 1, this.mdLength);
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(ZO.xd("B*.&\u0012\u0013cq\u000eK+{u!PJ$#w#j\b#\bN]", (short) (FB.Xd() ^ 4458), (short) (FB.Xd() ^ 5405))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            for (int i2 = 0; i2 < this.numLayer; i2++) {
                Object[] objArr2 = {this.currentSeeds[i2]};
                Method method = Class.forName(C1626yg.Ud("_Y6\b\neq\u0013}8c+\u001f7oLa\u0013\u001aj[pN\u0001?=", (short) (Od.Xd() ^ (-20306)), (short) (Od.Xd() ^ (-10264)))).getMethod(Ig.wd("d\u0010\u000fx\u0004\u0017$*\u0002", (short) (FB.Xd() ^ 28486)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr2);
                    this.gmssRandom.nextSeed(this.currentSeeds[i2]);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.initialized = true;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
