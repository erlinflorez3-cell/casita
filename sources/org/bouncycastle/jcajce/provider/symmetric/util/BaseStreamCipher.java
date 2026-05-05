package org.bouncycastle.jcajce.provider.symmetric.util;

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
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            this.cipher.reset();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i2, i3);
        this.cipher.reset();
        return bArrEngineUpdate;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i2) {
        return i2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws Throwable {
        CipherParameters cipherParameters;
        CipherParameters keyParameter;
        SecureRandom secureRandom2 = secureRandom;
        String strXd = C1561oA.Xd("a[Y]_h`\u0013cecf\\^\u001a", (short) (OY.Xd() ^ 11894));
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        if (!(key instanceof SecretKey)) {
            short sXd = (short) (Od.Xd() ^ (-14282));
            short sXd2 = (short) (Od.Xd() ^ (-27030));
            int[] iArr = new int["h\u0016E\r\u007f\u001b8l9\u000bM5Gh:~wR".length()];
            QB qb = new QB("h\u0016E\r\u007f\u001b8l9\u000bM5Gh:~wR");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            throw new InvalidKeyException(new String(iArr, 0, i3) + key.getAlgorithm() + C1626yg.Ud("Ph\u001et_\u0011|9\u001aI7tK\u0018iXz<tap\u000e!E6MSF9\u001dsT\u0019i\u0011X\ro", (short) (OY.Xd() ^ 26592), (short) (OY.Xd() ^ 27692)));
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
            this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                CipherParameters param = bCPBEKey.getParam();
                this.pbeSpec = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                cipherParameters = param;
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException(Wg.vd("D57\u0011j\\gjem_l O@B$scsitkyq}})\u0005~.o9rE6L\u0005", (short) (C1607wl.Xd() ^ 1030)));
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
                throw new InvalidKeyException(Qg.kd("h\u0013\r\u0014\u0016\f\u0016\t\r>\u0010\u0002\r\u0010\u0003\u000b|\n5u3bSU/yr\u0006", (short) (C1607wl.Xd() ^ 20549), (short) (C1607wl.Xd() ^ 26171)));
            }
            keyParameter = new KeyParameter(key.getEncoded());
        } else {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidAlgorithmParameterException(Jg.Wd("\u000b\u0005\u0003\u0007\u000b\u0014\f>\u0012\u0004\u0016\u0006\u0015\u000e\u001e\u0010\u0018F\u001c\"\u001c\u0012[", (short) (ZN.Xd() ^ 8360), (short) (ZN.Xd() ^ 28368)));
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
                    short sXd3 = (short) (C1607wl.Xd() ^ 9857);
                    short sXd4 = (short) (C1607wl.Xd() ^ 17599);
                    int[] iArr2 = new int["\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eizw\t\u0005vbp|q{x".length()];
                    QB qb2 = new QB("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eizw\t\u0005vbp|q{x");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
                        i4++;
                    }
                    Object[] objArr = new Object[0];
                    Constructor<?> constructor = Class.forName(new String(iArr2, 0, i4)).getConstructor(new Class[0]);
                    try {
                        constructor.setAccessible(true);
                        secureRandom2 = (SecureRandom) constructor.newInstance(objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (i2 != 1 && i2 != 3) {
                    throw new InvalidAlgorithmParameterException(C1561oA.ud("OO~'3{N?MwN>:BrA?5n3E<0-=-+", (short) (C1499aX.Xd() ^ (-14320))));
                }
                byte[] bArr = new byte[this.ivLength];
                Object[] objArr2 = {bArr};
                Method method = Class.forName(C1561oA.yd("\u0007~\u0015\u0001N\u0015\b\u0007\u001a\u0018\u0010\u001c\"W}\u0011\u0010#!\u0015\u0003\u0013!\u0018$#", (short) (FB.Xd() ^ 29395))).getMethod(C1561oA.Yd("%\u001d1.|51#2", (short) (C1633zX.Xd() ^ (-10175))), byte[].class);
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
                            throw new InvalidParameterException(strXd + i2 + Xg.qd("!rdwxkk", (short) (OY.Xd() ^ 22009), (short) (OY.Xd() ^ 29627)));
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        if (!str.equalsIgnoreCase("ECB")) {
            throw new IllegalArgumentException("can't support mode " + str);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.cipher.processBytes(bArr, i2, i3, bArr2, 0);
        return bArr2;
    }
}
