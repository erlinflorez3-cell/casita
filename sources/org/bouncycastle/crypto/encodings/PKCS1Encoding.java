package org.bouncycastle.crypto.encodings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private byte[] fallback;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private int pLen;
    private SecureRandom random;
    private boolean useStrictLength;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.encodings.PKCS1Encoding$1 */
    class AnonymousClass1 implements PrivilegedAction {
        AnonymousClass1() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.crypto.encodings.PKCS1Encoding$2 */
    class AnonymousClass2 implements PrivilegedAction {
        AnonymousClass2() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, int i2) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.pLen = i2;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.fallback = bArr;
        this.pLen = bArr.length;
    }

    private static int checkPkcs1Encoding(byte[] bArr, int i2) {
        int i3 = bArr[0] ^ 2;
        int i4 = i2 + 1;
        int length = bArr.length - i4;
        for (int i5 = 1; i5 < length; i5++) {
            byte b2 = bArr[i5];
            int i6 = b2 >> 1;
            int i7 = (b2 + i6) - (b2 & i6);
            int i8 = i7 >> 2;
            int i9 = (i7 + i8) - (i7 & i8);
            i3 = (-1) - (((-1) - i3) & ((-1) - (((-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - (i9 >> 4))))) | ((-1) - 1))) - 1)));
        }
        int i10 = (-1) - (((-1) - bArr[bArr.length - i4]) & ((-1) - i3));
        int i11 = (-1) - (((-1) - i10) & ((-1) - (i10 >> 1)));
        int i12 = i11 | (i11 >> 2);
        return ~(((-1) - (((-1) - ((-1) - (((-1) - i12) & ((-1) - (i12 >> 4))))) | ((-1) - 1))) - 1);
    }

    private byte[] decodeBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i2, i3);
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i2, i3);
        int i4 = (-1) - (((-1) - (this.useStrictLength ? 1 : 0)) | ((-1) - (bArrProcessBlock.length != this.engine.getOutputBlockSize() ? 1 : 0)));
        if (bArrProcessBlock.length < getOutputBlockSize()) {
            bArrProcessBlock = this.blockBuffer;
        }
        byte b2 = bArrProcessBlock[0];
        int i5 = (!this.forPrivateKey ? b2 != 1 : b2 != 2) ? 0 : 1;
        int iFindStart = findStart(b2, bArrProcessBlock) + 1;
        int i6 = iFindStart >= 10 ? 0 : 1;
        if ((i5 + i6) - (i5 & i6) != 0) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        }
        if (i4 != 0) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        }
        int length = bArrProcessBlock.length - iFindStart;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrProcessBlock, iFindStart, bArr2, 0, length);
        return bArr2;
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException(EO.Od("\u001fUF&\u0014{\f\u0010+0<B;9\\*n\u0002dFgkMH]\u0017Zj\u001aJ\u0014s\u001d8 `\u0007'%94\u0019@\u0015c|\u001d6Qs`a#1\u0003be<", (short) (C1607wl.Xd() ^ 8732)));
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i2, i3);
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[this.pLen];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr2};
            Method method = Class.forName(C1626yg.Ud("x\u0006a\u001c?N\u000f<*N!\u0019\u0013P\u001b\u00070tr$kk5n\u0011\"", (short) (FB.Xd() ^ 2844), (short) (FB.Xd() ^ 2914))).getMethod(Ig.wd("\u007f03\u000eqk\u0011\u007f^", (short) (C1633zX.Xd() ^ (-21509))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        boolean z2 = this.useStrictLength;
        int i4 = bArrProcessBlock.length != this.engine.getOutputBlockSize() ? 1 : 0;
        if (((z2 ? 1 : 0) + i4) - ((z2 ? 1 : 0) | i4) != 0) {
            bArrProcessBlock = this.blockBuffer;
        }
        int iCheckPkcs1Encoding = checkPkcs1Encoding(bArrProcessBlock, this.pLen);
        byte[] bArr3 = new byte[this.pLen];
        int i5 = 0;
        while (true) {
            int i6 = this.pLen;
            if (i5 >= i6) {
                Arrays.fill(bArrProcessBlock, (byte) 0);
                return bArr3;
            }
            byte b2 = bArrProcessBlock[(bArrProcessBlock.length - i6) + i5];
            int i7 = ~iCheckPkcs1Encoding;
            int i8 = (b2 + i7) - (b2 | i7);
            byte b3 = bArr2[i5];
            int i9 = (b3 + iCheckPkcs1Encoding) - (b3 | iCheckPkcs1Encoding);
            bArr3[i5] = (byte) ((i8 + i9) - (i8 & i9));
            i5++;
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i2, int i3) throws Throwable {
        if (i3 > getInputBlockSize()) {
            throw new IllegalArgumentException(C1561oA.od("\u0013\u0017\u0018\u001c\u001aD\b\u0004\u0016\u0002?\u0013\r\f;\u0007z\u000b~{", (short) (ZN.Xd() ^ 24604)));
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i4 = 1; i4 != (inputBlockSize - i3) - 1; i4++) {
                bArr2[i4] = -1;
            }
        } else {
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr2};
            Method method = Class.forName(C1561oA.Qd("^ThR\u001ebSPa]S]a\u00159JGXTF2@LAKH", (short) (ZN.Xd() ^ 7730))).getMethod(C1593ug.zd("1)=:\tA=/>", (short) (C1499aX.Xd() ^ (-13005)), (short) (C1499aX.Xd() ^ (-25789))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                bArr2[0] = 2;
                for (int i5 = 1; i5 != (inputBlockSize - i3) - 1; i5++) {
                    while (bArr2[i5] == 0) {
                        bArr2[i5] = (byte) this.random.nextInt();
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i6 = inputBlockSize - i3;
        bArr2[i6 - 1] = 0;
        System.arraycopy(bArr, i2, bArr2, i6, i3);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private int findStart(byte b2, byte[] bArr) throws InvalidCipherTextException {
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 1; i4 != bArr.length; i4++) {
            byte b3 = bArr[i4];
            int i5 = b3 == 0 ? 1 : 0;
            int i6 = i2 < 0 ? 1 : 0;
            if ((i5 + i6) - (i5 | i6) != 0) {
                i2 = i4;
            }
            int i7 = (b3 != -1 ? 1 : 0) & (b2 == 1 ? 1 : 0) & (i2 < 0 ? 1 : 0);
            i3 = (i3 + i7) - (i3 & i7);
        }
        if (i3 != 0) {
            return -1;
        }
        return i2;
    }

    private boolean useStrict() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.crypto.encodings.PKCS1Encoding.1
            AnonymousClass1() {
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
            }
        });
        return ((String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.crypto.encodings.PKCS1Encoding.2
            AnonymousClass2() {
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
            }
        })) != null ? !r2.equals("true") : str == null || str.equals("true");
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z2) {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(C1561oA.Kd("*\"8$q8+*=;3?Ez!43FD8&6D;GF", (short) (Od.Xd() ^ (-24929)))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    this.random = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        this.engine.init(z2, cipherParameters);
        this.forPrivateKey = asymmetricKeyParameter.isPrivate();
        this.forEncryption = z2;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
        if (this.pLen > 0 && this.fallback == null && this.random == null) {
            throw new IllegalArgumentException(Wg.Zd("8Z\u000e^\u0012S\u001f\u0011\"E\u0010X\u000bT\u0006XCFsEyE\u0002", (short) (Od.Xd() ^ (-13012)), (short) (Od.Xd() ^ (-29782))));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i2, i3) : decodeBlock(bArr, i2, i3);
    }
}
