package org.spongycastle.jcajce.provider.symmetric.util;

import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.asn1.cms.GCMParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CCMBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.CTSBlockCipher;
import org.spongycastle.crypto.modes.EAXBlockCipher;
import org.spongycastle.crypto.modes.GCFBBlockCipher;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.modes.GOFBBlockCipher;
import org.spongycastle.crypto.modes.OCBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.spongycastle.crypto.modes.PGPCFBBlockCipher;
import org.spongycastle.crypto.modes.SICBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.ISO10126d2Padding;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.paddings.TBCPadding;
import org.spongycastle.crypto.paddings.X923Padding;
import org.spongycastle.crypto.paddings.ZeroBytePadding;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.params.RC5Parameters;
import org.spongycastle.jcajce.PBKDF1Key;
import org.spongycastle.jcajce.PBKDF1KeyWithParameters;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12KeyWithParameters;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.spec.GOST28147ParameterSpec;
import org.spongycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.spongycastle.util.Strings;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final Class gcmSpecClass = lookup("javax.crypto.spec.GCMParameterSpec");
    private AEADParameters aeadParams;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    private static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADBlockCipher cipher;

        static {
            Class clsLookup = BaseBlockCipher.lookup("javax.crypto.AEADBadTagException");
            if (clsLookup != null) {
                aeadBadTagConstructor = findExceptionConstructor(clsLookup);
            } else {
                aeadBadTagConstructor = null;
            }
        }

        AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i2) throws IllegalStateException, BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i2);
            } catch (InvalidCipherTextException e2) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e2.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e2.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i2) {
            return this.cipher.getOutputSize(i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i2) {
            return this.cipher.getUpdateOutputSize(i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z2, cipherParameters);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
            return this.cipher.processByte(b2, bArr, i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
            return this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i2, int i3) {
            this.cipher.processAADBytes(bArr, i2, i3);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    private static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i2) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i2);
            } catch (InvalidCipherTextException e2) {
                throw new BadPaddingException(e2.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i2) {
            return this.cipher.getOutputSize(i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i2) {
            return this.cipher.getUpdateOutputSize(i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z2, cipherParameters);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
            return this.cipher.processByte(b2, bArr, i2);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
            return this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i2, int i3) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }
    }

    private interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i2) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i2);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i2);

        void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException;

        int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException;

        void updateAAD(byte[] bArr, int i2, int i3);

        boolean wrapOnNoPadding();
    }

    protected BaseBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i2) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i2 / 8;
    }

    protected BaseBlockCipher(BlockCipher blockCipher, int i2, int i3, int i4, int i5) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i2;
        this.digest = i3;
        this.keySizeInBits = i4;
        this.ivLength = i5;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    protected BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i2) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.ivLength = i2 / 8;
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        BlockCipher underlyingCipher = aEADBlockCipher.getUnderlyingCipher();
        this.baseEngine = underlyingCipher;
        this.ivLength = underlyingCipher.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z2, int i2) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z2;
        this.ivLength = i2;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        CipherParameters cipherParameters2;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV;
                cipherParameters2 = parametersWithIV;
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    return cipherParameters;
                }
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec.getSbox());
                cipherParameters2 = parametersWithSBox;
                if (gOST28147ParameterSpec.getIV() != null) {
                    cipherParameters2 = parametersWithSBox;
                    if (this.ivLength != 0) {
                        return new ParametersWithIV(parametersWithSBox, gOST28147ParameterSpec.getIV());
                    }
                }
            }
            return cipherParameters2;
        }
        CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            ParametersWithIV parametersWithIV2 = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = parametersWithIV2;
            return parametersWithIV2;
        }
        if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
            return cipherParameters;
        }
        GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
        ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec2.getSbox());
        if (gOST28147ParameterSpec2.getIV() == null || this.ivLength == 0) {
            return parametersWithSBox2;
        }
        ParametersWithIV parametersWithIV3 = new ParametersWithIV(parameters, gOST28147ParameterSpec2.getIV());
        this.ivParam = parametersWithIV3;
        return parametersWithIV3;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "OCB".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iProcessBytes;
        if (engineGetOutputSize(i3) + i4 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i3 != 0) {
            try {
                iProcessBytes = this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
            } catch (OutputLengthException e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            } catch (DataLengthException e3) {
                throw new IllegalBlockSizeException(e3.getMessage());
            }
        } else {
            iProcessBytes = 0;
        }
        return iProcessBytes + this.cipher.doFinal(bArr2, i4 + iProcessBytes);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        int iEngineGetOutputSize = engineGetOutputSize(i3);
        byte[] bArr2 = new byte[iEngineGetOutputSize];
        int iProcessBytes = i3 != 0 ? this.cipher.processBytes(bArr, i2, i3, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.cipher.doFinal(bArr2, iProcessBytes);
            if (iDoFinal == iEngineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (DataLengthException e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i2) {
        return this.cipher.getOutputSize(i2);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    this.engineParams = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    this.engineParams = createParametersInstance(algorithmName);
                    this.engineParams.init(this.ivParam.getIV());
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
            } else if (this.aeadParams != null) {
                try {
                    this.engineParams = createParametersInstance(CodePackage.GCM);
                    this.engineParams.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws Throwable {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i3 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i3 == clsArr.length) {
                    break;
                }
                Class cls = clsArr[i3];
                if (cls != null) {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(cls);
                        break;
                    } catch (Exception unused) {
                        continue;
                        i3++;
                    }
                }
                i3++;
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i2, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, SecureRandom secureRandom) throws Throwable {
        try {
            engineInit(i2, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new InvalidKeyException(e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher] */
    /* JADX WARN: Type inference failed for: r1v38, types: [org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19, types: [org.spongycastle.crypto.CipherParameters, org.spongycastle.crypto.params.RC5Parameters] */
    /* JADX WARN: Type inference failed for: r7v21, types: [org.spongycastle.crypto.CipherParameters, org.spongycastle.crypto.params.RC2Parameters] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [org.spongycastle.crypto.CipherParameters, org.spongycastle.crypto.params.ParametersWithSBox] */
    /* JADX WARN: Type inference failed for: r7v26, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r7v27, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r7v28, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [org.spongycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws Throwable {
        CipherParameters cipherParametersMakePBEParameters;
        ParametersWithIV parametersWithIV;
        SecureRandom secureRandom2;
        CipherParameters cipherParametersMakePBEParameters2;
        String strXd = C1561oA.Xd("rljnpyq$tvtwmo+", (short) (C1633zX.Xd() ^ (-11860)));
        ?? rC5Parameters = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException(ZO.xd("C'yS^3RlB0fZ\u0001\u0006\u0004\f:j", (short) (FB.Xd() ^ 18458), (short) (FB.Xd() ^ 28323)) + key.getAlgorithm() + C1626yg.Ud("H(\u0004m\u0019h,\u000f\u0002t2ew_W&m\u0019M\u0001qg#Q\nJ9\u0005\u0016+}k\u0006@{t\tc", (short) (C1499aX.Xd() ^ (-14299)), (short) (C1499aX.Xd() ^ (-512))));
        }
        String strVd = Wg.vd("0\"\u0015\u000e\u0018\u0017", (short) (C1580rY.Xd() ^ (-8490)));
        if (algorithmParameterSpec == null && this.baseEngine.getAlgorithmName().startsWith(strVd)) {
            throw new InvalidAlgorithmParameterException(Qg.kd("[K<&witwjrdq\u001d]i\u001aK;,FVfT_VdT``?[OL\b[U\u0005FH\u0002QARQB@zCG\u0006", (short) (C1499aX.Xd() ^ (-31124)), (short) (C1499aX.Xd() ^ (-16614))));
        }
        int i3 = this.scheme;
        short sXd = (short) (Od.Xd() ^ (-19656));
        short sXd2 = (short) (Od.Xd() ^ (-2171));
        int[] iArr = new int["k\u0016\u0010\u0017\u0019\u000f\u0019\f\u0010A\u0013\u0005\u0010\u0013\u0006\u000e\u007f\r8x6eVX2|u\t".length()];
        QB qb = new QB("k\u0016\u0010\u0017\u0019\u000f\u0019\f\u0010A\u0013\u0005\u0010\u0013\u0006\u000e\u007f\r8x6eVX2|u\t");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
            i4++;
        }
        String str = new String(iArr, 0, i4);
        if (i3 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z2 = secretKey instanceof PBEKey;
                if (z2 && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z2) {
                    throw new InvalidKeyException(str);
                }
                if (key instanceof BCPBEKey) {
                    BCPBEKey bCPBEKey = (BCPBEKey) key;
                    cipherParametersMakePBEParameters = bCPBEKey.getParam() != null ? bCPBEKey.getParam() : PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                } else {
                    cipherParametersMakePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                boolean z3 = cipherParametersMakePBEParameters instanceof ParametersWithIV;
                rC5Parameters = cipherParametersMakePBEParameters;
                if (z3) {
                    this.ivParam = (ParametersWithIV) cipherParametersMakePBEParameters;
                    rC5Parameters = cipherParametersMakePBEParameters;
                }
            } catch (Exception unused) {
                short sXd3 = (short) (ZN.Xd() ^ 2909);
                short sXd4 = (short) (ZN.Xd() ^ 13692);
                int[] iArr2 = new int["ii>\u000b\u0006[h8\bXY)1`#lkhA\u0010jV%+\u001e\u0015F!A0oJ 1".length()];
                QB qb2 = new QB("ii>\u000b\u0006[h8\bXY)1`#lkhA\u0010jV%+\u001e\u0015F!A0oJ 1");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((i5 * sXd4) ^ sXd3));
                    i5++;
                }
                throw new InvalidKeyException(new String(iArr2, 0, i5));
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters3 = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z4 = cipherParametersMakePBEParameters3 instanceof ParametersWithIV;
            rC5Parameters = cipherParametersMakePBEParameters3;
            if (z4) {
                this.ivParam = (ParametersWithIV) cipherParametersMakePBEParameters3;
                rC5Parameters = cipherParametersMakePBEParameters3;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey2 = (BCPBEKey) key;
            if (bCPBEKey2.getOID() != null) {
                this.pbeAlgorithm = bCPBEKey2.getOID().getId();
            } else {
                this.pbeAlgorithm = bCPBEKey2.getAlgorithm();
            }
            if (bCPBEKey2.getParam() != null) {
                cipherParametersMakePBEParameters2 = adjustParameters(algorithmParameterSpec, bCPBEKey2.getParam());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    short sXd5 = (short) (ZN.Xd() ^ 18893);
                    int[] iArr3 = new int["#\u0014\u0016oA3>A4<.;f\u0016\u0007\tb2\"2 +\"0 ,,W+%T\u0016\u0018Q$\u0015#[".length()];
                    QB qb3 = new QB("#\u0014\u0016oA3>A4<.;f\u0016\u0007\tb2\"2 +\"0 ,,W+%T\u0016\u0018Q$\u0015#[");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(sXd5 + i6 + xuXd3.CK(iKK3));
                        i6++;
                    }
                    throw new InvalidAlgorithmParameterException(new String(iArr3, 0, i6));
                }
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                cipherParametersMakePBEParameters2 = PBE.Util.makePBEParameters(bCPBEKey2, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z5 = cipherParametersMakePBEParameters2 instanceof ParametersWithIV;
            rC5Parameters = cipherParametersMakePBEParameters2;
            if (z5) {
                this.ivParam = (ParametersWithIV) cipherParametersMakePBEParameters2;
                rC5Parameters = cipherParametersMakePBEParameters2;
            }
        } else if (key instanceof PBEKey) {
            PBEKey pBEKey2 = (PBEKey) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.pbeSpec = pBEParameterSpec;
            if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters4 = PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z6 = cipherParametersMakePBEParameters4 instanceof ParametersWithIV;
            rC5Parameters = cipherParametersMakePBEParameters4;
            if (z6) {
                this.ivParam = (ParametersWithIV) cipherParametersMakePBEParameters4;
                rC5Parameters = cipherParametersMakePBEParameters4;
            }
        } else if (!(key instanceof RepeatedSecretKeySpec)) {
            if (i3 == 0 || i3 == 4 || i3 == 1 || i3 == 5) {
                throw new InvalidKeyException(str);
            }
            rC5Parameters = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            if (this.ivLength != 0) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                    throw new InvalidAlgorithmParameterException(C1561oA.yd("_k4\u0001\b\u0005\u0005/\u0001\u0003<", (short) (OY.Xd() ^ 24079)) + this.ivLength + C1561oA.Yd("\u0016Yqm_n\u001cimmg/", (short) (FB.Xd() ^ 16890)));
                }
                rC5Parameters = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), ivParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, ivParameterSpec.getIV());
                this.ivParam = rC5Parameters;
            } else {
                String str2 = this.modeName;
                if (str2 != null && str2.equals(Xg.qd("\f\u000b\u000b", (short) (FB.Xd() ^ 16598), (short) (FB.Xd() ^ 19721)))) {
                    throw new InvalidAlgorithmParameterException(Jg.Wd("6\u001a_\u001di9\u0015Uo\u0003\u0014p6\ng.\n=aEv\u0010\u00195D,`", (short) (C1633zX.Xd() ^ (-28265)), (short) (C1633zX.Xd() ^ (-24786))));
                }
            }
        } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
            GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec.getSbox());
            if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), gOST28147ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, gOST28147ParameterSpec.getIV());
                this.ivParam = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
            if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), rC2ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, rC2ParameterSpec.getIV());
                this.ivParam = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
            RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
            String algorithmName = this.baseEngine.getAlgorithmName();
            short sXd6 = (short) (OY.Xd() ^ 8090);
            short sXd7 = (short) (OY.Xd() ^ 26493);
            int[] iArr4 = new int["s$\u001c".length()];
            QB qb4 = new QB("s$\u001c");
            int i7 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i7] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd7) + sXd6)));
                i7++;
            }
            if (!algorithmName.startsWith(new String(iArr4, 0, i7))) {
                throw new InvalidAlgorithmParameterException(C1593ug.zd("\u0005viU'\u0019+\u001b(!1#13`2$78++g=9j-l18@97EsI>8LxCN{KMS\u007f3%\u0018\u0012", (short) (C1580rY.Xd() ^ (-16894)), (short) (C1580rY.Xd() ^ (-23453))));
            }
            boolean zEquals = this.baseEngine.getAlgorithmName().equals(C1626yg.Ud("\u000e&4MM\u0005", (short) (FB.Xd() ^ 23044), (short) (FB.Xd() ^ 15826)));
            short sXd8 = (short) (FB.Xd() ^ 11352);
            int[] iArr5 = new int["!".length()];
            QB qb5 = new QB("!");
            int i8 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i8] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd8 + i8)));
                i8++;
            }
            String str3 = new String(iArr5, 0, i8);
            if (zEquals) {
                if (rC5ParameterSpec.getWordSize() != 32) {
                    throw new InvalidAlgorithmParameterException(EO.Od("&^`mJ\u0002mS-\u0010\u001f+J:%2UB9[$z\u0016[y\t^\u001f\u0003\fG!\u0012^12\u00112\u001a/%\u001bg^\u007f", (short) (C1499aX.Xd() ^ (-2864))) + rC5ParameterSpec.getWordSize() + str3);
                }
            } else if (this.baseEngine.getAlgorithmName().equals(strVd) && rC5ParameterSpec.getWordSize() != 64) {
                throw new InvalidAlgorithmParameterException(C1561oA.Qd("O?0\u001aZdi[VXl\u0012dUc\u000eb\\\u000bPXZ\u0007G\u0005[RTE\u007fRGWAzI?w\r\ntBBFp", (short) (FB.Xd() ^ 32232)) + rC5ParameterSpec.getWordSize() + str3);
            }
            if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), rC5ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                this.ivParam = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else {
            Class cls = gcmSpecClass;
            if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    short sXd9 = (short) (C1499aX.Xd() ^ (-9834));
                    int[] iArr6 = new int["wooqmtn\u001fzj~lsj|l\u00051\t\r~r>".length()];
                    QB qb6 = new QB("wooqmtn\u001fzj~lsj|l\u00051\t\r~r>");
                    int i9 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i9] = xuXd6.fK((sXd9 ^ i9) + xuXd6.CK(iKK6));
                        i9++;
                    }
                    throw new InvalidAlgorithmParameterException(new String(iArr6, 0, i9));
                }
            } else {
                if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                    throw new InvalidAlgorithmParameterException(C1561oA.od("\u001b\u0016\u001f!1A/:1?/;\u001b7+(c&#/_.,)5Z\u001c\u001eW,)\u001a\u0018R)\u001a$\u0017MmpkmH\u0015\u0016\n\n\u0017P", (short) (C1607wl.Xd() ^ 3213)));
                }
                try {
                    Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("#\"2\u0013\f&0", (short) (C1633zX.Xd() ^ (-17212))), new Class[0]);
                    short sXd10 = (short) (C1499aX.Xd() ^ (-12388));
                    short sXd11 = (short) (C1499aX.Xd() ^ (-1539));
                    int[] iArr7 = new int["G\u0017u\u0018t".length()];
                    QB qb7 = new QB("G\u0017u\u0018t");
                    int i10 = 0;
                    while (qb7.YK()) {
                        int iKK7 = qb7.KK();
                        Xu xuXd7 = Xu.Xd(iKK7);
                        iArr7[i10] = xuXd7.fK(((i10 * sXd11) ^ sXd10) + xuXd7.CK(iKK7));
                        i10++;
                    }
                    AEADParameters aEADParameters = new AEADParameters(rC5Parameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) rC5Parameters).getParameters() : (KeyParameter) rC5Parameters, ((Integer) declaredMethod.invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) cls.getDeclaredMethod(new String(iArr7, 0, i10), new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
                    this.aeadParams = aEADParameters;
                    rC5Parameters = aEADParameters;
                } catch (Exception unused2) {
                    throw new InvalidAlgorithmParameterException(C1561oA.Xd("j\n\u0018\u0019\u001b!M\u001f\" \u0015\u0018'(U}z\u0006\n\u001c.\u001e+$4&4\u00164*)t", (short) (C1633zX.Xd() ^ (-4749))));
                }
            }
        }
        ?? parametersWithRandom = rC5Parameters;
        if (this.ivLength != 0) {
            boolean z7 = rC5Parameters instanceof ParametersWithIV;
            parametersWithRandom = rC5Parameters;
            if (!z7) {
                boolean z8 = rC5Parameters instanceof AEADParameters;
                parametersWithRandom = rC5Parameters;
                if (!z8) {
                    if (secureRandom == null) {
                        short sXd12 = (short) (OY.Xd() ^ 32627);
                        short sXd13 = (short) (OY.Xd() ^ 20930);
                        int[] iArr8 = new int["<2F0{@1.?;1;?r\u0017(%62$\u0010\u001e*\u001f)&".length()];
                        QB qb8 = new QB("<2F0{@1.?;1;?r\u0017(%62$\u0010\u001e*\u001f)&");
                        int i11 = 0;
                        while (qb8.YK()) {
                            int iKK8 = qb8.KK();
                            Xu xuXd8 = Xu.Xd(iKK8);
                            iArr8[i11] = xuXd8.fK(((sXd12 + i11) + xuXd8.CK(iKK8)) - sXd13);
                            i11++;
                        }
                        Object[] objArr = new Object[0];
                        Constructor<?> constructor = Class.forName(new String(iArr8, 0, i11)).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            secureRandom2 = (SecureRandom) constructor.newInstance(objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        secureRandom2 = secureRandom;
                    }
                    if (i2 == 1 || i2 == 3) {
                        byte[] bArr = new byte[this.ivLength];
                        Object[] objArr2 = {bArr};
                        Method method = Class.forName(C1561oA.yd("\u001a\u0012$\u0010a(\u0017\u0016\u001d\u001b\u000f\u001b%Z|\u0010\u0003\u0016\u0010\u0004u\u0006\u0010\u0007\u0007\u0006", (short) (C1633zX.Xd() ^ (-11823)))).getMethod(C1561oA.Yd("KCWT#[WIX", (short) (FB.Xd() ^ 9479)), byte[].class);
                        try {
                            method.setAccessible(true);
                            method.invoke(secureRandom2, objArr2);
                            ParametersWithIV parametersWithIV2 = new ParametersWithIV(rC5Parameters, bArr);
                            this.ivParam = parametersWithIV2;
                            parametersWithRandom = parametersWithIV2;
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } else {
                        String algorithmName2 = this.cipher.getUnderlyingCipher().getAlgorithmName();
                        short sXd14 = (short) (C1607wl.Xd() ^ 3353);
                        short sXd15 = (short) (C1607wl.Xd() ^ 24756);
                        int[] iArr9 = new int["xnvhje".length()];
                        QB qb9 = new QB("xnvhje");
                        int i12 = 0;
                        while (qb9.YK()) {
                            int iKK9 = qb9.KK();
                            Xu xuXd9 = Xu.Xd(iKK9);
                            iArr9[i12] = xuXd9.fK(sXd14 + i12 + xuXd9.CK(iKK9) + sXd15);
                            i12++;
                        }
                        parametersWithRandom = rC5Parameters;
                        if (algorithmName2.indexOf(new String(iArr9, 0, i12)) < 0) {
                            throw new InvalidAlgorithmParameterException(C1561oA.ud("tt$LX!sdr\u001dsc_g\u0018fdZ\u0014XjaURbRP", (short) (C1499aX.Xd() ^ (-8443))));
                        }
                    }
                }
            }
        }
        if (secureRandom != null && this.padded) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new InvalidParameterException(strXd + i2 + Xg.qd("\u0018i[nobb", (short) (FB.Xd() ^ 26249), (short) (FB.Xd() ^ 1485)));
                        }
                    }
                }
                this.cipher.init(false, parametersWithRandom);
                return;
            }
            this.cipher.init(true, parametersWithRandom);
        } catch (Exception e4) {
            throw new InvalidKeyException(e4.getMessage()) { // from class: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e4;
                }
            };
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CBCBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher2 = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(blockCipher2, blockCipher2.getBlockSize() * 8));
                return;
            }
        }
        if (this.modeName.startsWith("PGP")) {
            boolean zEqualsIgnoreCase = this.modeName.equalsIgnoreCase("PGPCFBwithIV");
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new PGPCFBBlockCipher(this.baseEngine, zEqualsIgnoreCase));
            return;
        }
        if (this.modeName.equalsIgnoreCase("OpenPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(new OpenPGPCFBBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.fixedIv = false;
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(new CBCBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.startsWith("CCM")) {
            this.ivLength = 13;
            this.cipher = new AEADGenericBlockCipher(new CCMBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OCB")) {
            if (this.engineProvider == null) {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
            this.ivLength = 15;
            this.cipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
            return;
        }
        if (this.modeName.startsWith("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
        } else {
            if (!this.modeName.startsWith(CodePackage.GCM)) {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new GCMBlockCipher(this.baseEngine));
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(this.cipher.getUnderlyingCipher()));
                return;
            }
            return;
        }
        if (upperCase.equals("WITHCTS")) {
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
            return;
        }
        this.padded = true;
        if (isAEADModeName(this.modeName)) {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals("ZEROBYTEPADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
            return;
        }
        if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
            return;
        }
        if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
            return;
        }
        if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
        } else {
            if (!upperCase.equals("TBCPADDING")) {
                throw new NoSuchPaddingException("Padding " + str + " unknown.");
            }
            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i3) + i4 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
        } catch (DataLengthException e2) {
            throw new IllegalStateException(e2.toString());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i3);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i2, i3, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int iProcessBytes = this.cipher.processBytes(bArr, i2, i3, bArr2, 0);
        if (iProcessBytes == 0) {
            return null;
        }
        if (iProcessBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iProcessBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, iProcessBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i2, int i3) {
        this.cipher.updateAAD(bArr, i2, i3);
    }
}
