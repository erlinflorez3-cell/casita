package org.spongycastle.crypto.encodings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.spongycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.spongycastle.pkcs1.strict";
    private AsymmetricBlockCipher engine;
    private byte[] fallback;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private int pLen;
    private SecureRandom random;
    private boolean useStrictLength;

    /* JADX INFO: renamed from: org.spongycastle.crypto.encodings.PKCS1Encoding$1 */
    class AnonymousClass1 implements PrivilegedAction {
        AnonymousClass1() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    /* JADX INFO: renamed from: org.spongycastle.crypto.encodings.PKCS1Encoding$2 */
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
            int i6 = (-1) - (((-1) - b2) & ((-1) - (b2 >> 1)));
            int i7 = i6 | (i6 >> 2);
            int i8 = i7 >> 4;
            i3 = (-1) - (((-1) - i3) & ((-1) - (((-1) - (((-1) - ((i7 + i8) - (i7 & i8))) | ((-1) - 1))) - 1)));
        }
        int i9 = bArr[bArr.length - i4] | i3;
        int i10 = i9 >> 1;
        int i11 = (i9 + i10) - (i9 & i10);
        int i12 = i11 >> 2;
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = i13 | (i13 >> 4);
        return ~(((i14 + 1) - (i14 | 1)) - 1);
    }

    private byte[] decodeBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte b2;
        if (this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i2, i3);
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i2, i3);
        if (bArrProcessBlock.length < getOutputBlockSize()) {
            throw new InvalidCipherTextException("block truncated");
        }
        byte b3 = bArrProcessBlock[0];
        if (this.forPrivateKey) {
            if (b3 != 2) {
                throw new InvalidCipherTextException("unknown block type");
            }
        } else if (b3 != 1) {
            throw new InvalidCipherTextException("unknown block type");
        }
        if (this.useStrictLength && bArrProcessBlock.length != this.engine.getOutputBlockSize()) {
            throw new InvalidCipherTextException("block incorrect size");
        }
        int i4 = 1;
        while (i4 != bArrProcessBlock.length && (b2 = bArrProcessBlock[i4]) != 0) {
            if (b3 == 1 && b2 != -1) {
                throw new InvalidCipherTextException("block padding incorrect");
            }
            i4++;
        }
        int i5 = i4 + 1;
        if (i5 > bArrProcessBlock.length || i5 < 10) {
            throw new InvalidCipherTextException("no data in block");
        }
        int length = bArrProcessBlock.length - i5;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrProcessBlock, i5, bArr2, 0, length);
        return bArr2;
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException(Xg.qd("|y}~\u0007:/\u0005y{\u00074\u0003{\f\u0001\t~;\u0006\u0011>\u000f\u000f\u000e\u001cC\u000b\u0015\u0019G\r\u000f\u000e\u001e&\u001e#\u0019  ^S#%+W\u001f)-[0'&.*0*", (short) (ZN.Xd() ^ 8169), (short) (ZN.Xd() ^ 12740)));
        }
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i2, i3);
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[this.pLen];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr2};
            Method method = Class.forName(hg.Vd("C9M7\u0003G85FB8BFy\u001e/,=9+\u0017%1&0-", (short) (C1607wl.Xd() ^ 25446), (short) (C1607wl.Xd() ^ 10959))).getMethod(C1561oA.ud("?5GB\u000fE?/<", (short) (C1499aX.Xd() ^ (-6689))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (bArrProcessBlock.length < getOutputBlockSize()) {
            throw new InvalidCipherTextException(C1561oA.Yd("\r\u0018\u001c\u0011\u001aO%$(\"\u0018\u0017+\u001d\u001d", (short) (OY.Xd() ^ 11945)));
        }
        if (this.useStrictLength && bArrProcessBlock.length != this.engine.getOutputBlockSize()) {
            throw new InvalidCipherTextException(C1561oA.yd("kvvkp&lrdqqrbao\u001c\r\u0004\u0012}", (short) (OY.Xd() ^ 17414)));
        }
        int iCheckPkcs1Encoding = checkPkcs1Encoding(bArrProcessBlock, this.pLen);
        byte[] bArr3 = new byte[this.pLen];
        int i4 = 0;
        while (true) {
            int i5 = this.pLen;
            if (i4 >= i5) {
                return bArr3;
            }
            int i6 = (-1) - (((-1) - bArrProcessBlock[(bArrProcessBlock.length - i5) + i4]) | ((-1) - (~iCheckPkcs1Encoding)));
            int i7 = bArr2[i4] & iCheckPkcs1Encoding;
            bArr3[i4] = (byte) ((i6 + i7) - (i6 & i7));
            i4++;
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i2, int i3) throws Throwable {
        if (i3 > getInputBlockSize()) {
            short sXd = (short) (FB.Xd() ^ 3771);
            short sXd2 = (short) (FB.Xd() ^ 14189);
            int[] iArr = new int["Py]&\u007f\u000fs\u001b\b5CF\u0002\u000fhE\u0012 \f2".length()];
            QB qb = new QB("Py]&\u007f\u000fs\u001b\b5CF\u0002\u000fhE\u0012 \f2");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i4 * sXd2))) + xuXd.CK(iKK));
                i4++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i4));
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i5 = 1; i5 != (inputBlockSize - i3) - 1; i5++) {
                bArr2[i5] = -1;
            }
        } else {
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr2};
            Method method = Class.forName(Jg.Wd("`\u001c\u0016\u0004uE\u001b\u001fRV6\u00061fr\u000e2H' 7\f|t%.", (short) (FB.Xd() ^ 32352), (short) (FB.Xd() ^ 16731))).getMethod(ZO.xd("[\u0011\u001b\u0012sD\u0001{I", (short) (C1580rY.Xd() ^ (-25443)), (short) (C1580rY.Xd() ^ (-20427))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                bArr2[0] = 2;
                for (int i6 = 1; i6 != (inputBlockSize - i3) - 1; i6++) {
                    while (bArr2[i6] == 0) {
                        bArr2[i6] = (byte) this.random.nextInt();
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i7 = inputBlockSize - i3;
        bArr2[i7 - 1] = 0;
        System.arraycopy(bArr, i2, bArr2, i7, i3);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private boolean useStrict() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.spongycastle.crypto.encodings.PKCS1Encoding.1
            AnonymousClass1() {
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
            }
        });
        return ((String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.spongycastle.crypto.encodings.PKCS1Encoding.2
            AnonymousClass2() {
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
            }
        })) != null ? !r2.equals("true") : str == null || str.equals("true");
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z2) {
                short sXd = (short) (C1580rY.Xd() ^ (-14654));
                int[] iArr = new int["h3\u0018]php%[[NAr7JA\u0016 c\u0010A+\u0014\bcG".length()];
                QB qb = new QB("h3\u0018]php%[[NAr7JA\u0016 c\u0010A+\u0014\bcG");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
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
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i2, i3) : decodeBlock(bArr, i2, i3);
    }
}
