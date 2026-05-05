package org.spongycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12KeyWithParameters;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private Class[] availableSpecs;
    private StreamCipher cipher;
    private int digest;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    protected BaseStreamCipher(StreamCipher streamCipher, int i2) {
        this(streamCipher, i2, -1, -1);
    }

    protected BaseStreamCipher(StreamCipher streamCipher, int i2, int i3, int i4) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = streamCipher;
        this.ivLength = i2;
        this.keySizeInBits = i3;
        this.digest = i4;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws ShortBufferException {
        if (i4 + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i3 != 0) {
            this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
        }
        this.cipher.reset();
        return i3;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            this.cipher.reset();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i2, i3);
        this.cipher.reset();
        return bArrEngineUpdate;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
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
        return i2;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams != null || this.pbeSpec == null) {
            return this.engineParams;
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.pbeAlgorithm);
            algorithmParametersCreateParametersInstance.init(this.pbeSpec);
            return algorithmParametersCreateParametersInstance;
        } catch (Exception unused) {
            return null;
        }
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
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i3]);
                    break;
                } catch (Exception unused) {
                    i3++;
                }
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
        CipherParameters cipherParameters;
        CipherParameters keyParameter;
        SecureRandom secureRandom2 = secureRandom;
        short sXd = (short) (ZN.Xd() ^ 14656);
        int[] iArr = new int["5^M1q<_\u00199\u0017\u001ayC6T".length()];
        QB qb = new QB("5^M1q<_\u00199\u0017\u001ayC6T");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        if (!(key instanceof SecretKey)) {
            short sXd2 = (short) (C1580rY.Xd() ^ (-29855));
            short sXd3 = (short) (C1580rY.Xd() ^ (-28996));
            int[] iArr2 = new int["2K^\u0004IQS\u007f@JDKMCM@Du".length()];
            QB qb2 = new QB("2K^\u0004IQS\u007f@JDKMCM@Du");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                i4++;
            }
            throw new InvalidKeyException(new String(iArr2, 0, i4) + key.getAlgorithm() + hg.Vd("_--1[./\",\u0018\u0018!\u0019R\u0018 \"N!&\u0019\u0018\u000f\u001d\u001a\u0010\tD\t\u0011\u0014\u001a\u0010\u0013\u0007\f\nH", (short) (C1607wl.Xd() ^ 32670), (short) (C1607wl.Xd() ^ 7644)));
        }
        if (key instanceof PKCS12Key) {
            PKCS12Key pKCS12Key = (PKCS12Key) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.pbeSpec = pBEParameterSpec;
            if ((pKCS12Key instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                PKCS12KeyWithParameters pKCS12KeyWithParameters = (PKCS12KeyWithParameters) pKCS12Key;
                this.pbeSpec = new PBEParameterSpec(pKCS12KeyWithParameters.getSalt(), pKCS12KeyWithParameters.getIterationCount());
            }
            keyParameter = PBE.Util.makePBEParameters(pKCS12Key.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getOID() != null) {
                this.pbeAlgorithm = bCPBEKey.getOID().getId();
            } else {
                this.pbeAlgorithm = bCPBEKey.getAlgorithm();
            }
            if (bCPBEKey.getParam() != null) {
                CipherParameters param = bCPBEKey.getParam();
                this.pbeSpec = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                cipherParameters = param;
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    short sXd4 = (short) (Od.Xd() ^ (-2713));
                    int[] iArr3 = new int["d\u000eA6#ZT\u001be|s\u001e\u0015=Qpw`\f7\\\u001f;H_#D\u001d3\u001c<Z5I4o^w".length()];
                    QB qb3 = new QB("d\u000eA6#ZT\u001be|s\u001e\u0015=Qpw`\f7\\\u001f;H_#D\u001d3\u001c<Z5I4o^w");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i5)) + xuXd3.CK(iKK3));
                        i5++;
                    }
                    throw new InvalidAlgorithmParameterException(new String(iArr3, 0, i5));
                }
                CipherParameters cipherParametersMakePBEParameters = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getAlgorithmName());
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                cipherParameters = cipherParametersMakePBEParameters;
            }
            keyParameter = cipherParameters;
            if (bCPBEKey.getIvSize() != 0) {
                this.ivParam = (ParametersWithIV) cipherParameters;
                keyParameter = cipherParameters;
            }
        } else if (algorithmParameterSpec == null) {
            if (this.digest > 0) {
                short sXd5 = (short) (Od.Xd() ^ (-17927));
                int[] iArr4 = new int[")SMTVLVIM~PBMPCK=Ju6s#\u0014\u0016o:3F".length()];
                QB qb4 = new QB(")SMTVLVIM~PBMPCK=Ju6s#\u0014\u0016o:3F");
                int i6 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i6] = xuXd4.fK(sXd5 + sXd5 + sXd5 + i6 + xuXd4.CK(iKK4));
                    i6++;
                }
                throw new InvalidKeyException(new String(iArr4, 0, i6));
            }
            keyParameter = new KeyParameter(key.getEncoded());
        } else {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidAlgorithmParameterException(Wg.vd("1+)-'0(Z$\u0016(\u0018\u001d\u0016&\u0018>lBH8.w", (short) (FB.Xd() ^ 6368)));
            }
            ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = parametersWithIV;
            keyParameter = parametersWithIV;
        }
        CipherParameters cipherParameters2 = keyParameter;
        if (this.ivLength != 0) {
            boolean z2 = keyParameter instanceof ParametersWithIV;
            cipherParameters2 = keyParameter;
            if (!z2) {
                if (secureRandom2 == null) {
                    Object[] objArr = new Object[0];
                    Constructor<?> constructor = Class.forName(C1593ug.zd("5-C/|C65HF>JP\u0006,?>QOC1AOFRQ", (short) (C1607wl.Xd() ^ 9366), (short) (C1607wl.Xd() ^ 8317))).getConstructor(new Class[0]);
                    try {
                        constructor.setAccessible(true);
                        secureRandom2 = (SecureRandom) constructor.newInstance(objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (i2 != 1 && i2 != 3) {
                    throw new InvalidAlgorithmParameterException(C1561oA.od("DDs\u001c(pC4BlC3/7g64*c(:1%\"2\" ", (short) (Od.Xd() ^ (-22068))));
                }
                byte[] bArr = new byte[this.ivLength];
                Object[] objArr2 = {bArr};
                Method method = Class.forName(C1561oA.Kd(")!7#p7*)<:2>Dy 32EC7%5C:FE", (short) (C1633zX.Xd() ^ (-5892)))).getMethod(Wg.Zd("\fu{M,4\u001fB?", (short) (ZN.Xd() ^ 30655), (short) (ZN.Xd() ^ 7335)), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom2, objArr2);
                    ParametersWithIV parametersWithIV2 = new ParametersWithIV(keyParameter, bArr);
                    this.ivParam = parametersWithIV2;
                    cipherParameters2 = parametersWithIV2;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            StringBuilder sbAppend = new StringBuilder(str).append(i2);
                            short sXd6 = (short) (C1580rY.Xd() ^ (-20807));
                            int[] iArr5 = new int["\u0004UGZ[NN".length()];
                            QB qb5 = new QB("\u0004UGZ[NN");
                            int i7 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd6 + i7));
                                i7++;
                            }
                            throw new InvalidParameterException(sbAppend.append(new String(iArr5, 0, i7)).toString());
                        }
                    }
                }
                this.cipher.init(false, cipherParameters2);
                return;
            }
            this.cipher.init(true, cipherParameters2);
        } catch (Exception e4) {
            throw new InvalidKeyException(e4.getMessage());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        if (!str.equalsIgnoreCase("ECB")) {
            throw new IllegalArgumentException("can't support mode " + str);
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws ShortBufferException {
        if (i4 + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            this.cipher.processBytes(bArr, i2, i3, bArr2, i4);
            return i3;
        } catch (DataLengthException e2) {
            throw new IllegalStateException(e2.getMessage());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.cipher.processBytes(bArr, i2, i3, bArr2, 0);
        return bArr2;
    }
}
