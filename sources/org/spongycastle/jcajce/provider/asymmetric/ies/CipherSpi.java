package org.spongycastle.jcajce.provider.asymmetric.ies;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.agreement.DHBasicAgreement;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.engines.IESEngine;
import org.spongycastle.crypto.engines.OldIESEngine;
import org.spongycastle.crypto.generators.KDF2BytesGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.IESParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.IESKey;
import org.spongycastle.jce.spec.IESParameterSpec;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class CipherSpi extends javax.crypto.CipherSpi {
    private IESEngine cipher;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private int state = -1;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private AlgorithmParameters engineParam = null;
    private IESParameterSpec engineParams = null;
    private Class[] availableSpecs = {IESParameterSpec.class};

    public static class IES extends CipherSpi {
        public IES() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    public static class OldIES extends CipherSpi {
        public OldIES() {
            super(new OldIESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    public CipherSpi(IESEngine iESEngine) {
        this.cipher = iESEngine;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws BadPaddingException, IllegalBlockSizeException {
        if (i3 != 0) {
            this.buffer.write(bArr, i2, i3);
        }
        try {
            byte[] byteArray = this.buffer.toByteArray();
            this.buffer.reset();
            byte[] bArrProcessBlock = this.cipher.processBlock(byteArray, 0, byteArray.length);
            System.arraycopy(bArrProcessBlock, 0, bArr2, i4, bArrProcessBlock.length);
            return bArrProcessBlock.length;
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        if (i3 != 0) {
            this.buffer.write(bArr, i2, i3);
        }
        try {
            byte[] byteArray = this.buffer.toByteArray();
            this.buffer.reset();
            return this.cipher.processBlock(byteArray, 0, byteArray.length);
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        if (!(key instanceof IESKey)) {
            throw new IllegalArgumentException("must be passed IE key");
        }
        IESKey iESKey = (IESKey) key;
        if (iESKey.getPrivate() instanceof DHPrivateKey) {
            return ((DHPrivateKey) iESKey.getPrivate()).getX().bitLength();
        }
        if (iESKey.getPrivate() instanceof ECPrivateKey) {
            return ((ECPrivateKey) iESKey.getPrivate()).getD().bitLength();
        }
        throw new IllegalArgumentException("not an IE key!");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i2) {
        int i3 = this.state;
        if (i3 == 1 || i3 == 3) {
            return this.buffer.size() + i2 + 20;
        }
        if (i3 == 2 || i3 == 4) {
            return (this.buffer.size() + i2) - 20;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineParams != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("IES");
                this.engineParam = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.engineParams);
            } catch (Exception e2) {
                throw new RuntimeException(e2.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
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
        this.engineParam = algorithmParameters;
        engineInit(i2, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, SecureRandom secureRandom) throws Throwable {
        if (i2 == 1 || i2 == 3) {
            try {
                engineInit(i2, key, (AlgorithmParameterSpec) null, secureRandom);
                return;
            } catch (InvalidAlgorithmParameterException unused) {
            }
        }
        throw new IllegalArgumentException("can't handle null parameter spec in IES");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i2, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws Throwable {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePublicKeyParameter;
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter;
        AlgorithmParameterSpec iESParameterSpec = algorithmParameterSpec;
        SecureRandom secureRandom2 = secureRandom;
        if (!(key instanceof IESKey)) {
            throw new InvalidKeyException(Xg.qd("s|{}*mq-~p\u0004\u0005ww4^[j8\u0005\u007f\u0015", (short) (C1499aX.Xd() ^ (-19683)), (short) (C1499aX.Xd() ^ (-17939))));
        }
        if (iESParameterSpec == null && (i2 == 1 || i2 == 3)) {
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            if (secureRandom2 == null) {
                short sXd = (short) (OY.Xd() ^ 13317);
                int[] iArr = new int["RJ`L\u001a`SRec[gm#I\\[nl`N^lcon".length()];
                QB qb = new QB("RJ`L\u001a`SRec[gm#I\\[nl`N^lcon");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                    i3++;
                }
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    secureRandom2 = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Object[] objArr2 = {bArr};
            Method method = Class.forName(Wg.vd("\u0014\n\"\f[ \u0015\u0012\u0017\u0013\r\u0017\u001fRz\f|\u000e\u000e\u007fo}\u000e\u0003\u0001}", (short) (C1499aX.Xd() ^ (-12470)))).getMethod(Qg.kd("4*<7\u0004:4$1", (short) (C1633zX.Xd() ^ (-31834)), (short) (C1633zX.Xd() ^ (-20028))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom2, objArr2);
                Class<?> cls = Class.forName(hg.Vd("f\\pZ&j[Xie[ei\u001dARO`\\N:HTISP", (short) (OY.Xd() ^ 12644), (short) (OY.Xd() ^ 24903)));
                Class<?>[] clsArr = {byte[].class};
                Object[] objArr3 = {bArr2};
                short sXd2 = (short) (C1633zX.Xd() ^ (-1018));
                int[] iArr2 = new int["PFXS VP@M".length()];
                QB qb2 = new QB("PFXS VP@M");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(secureRandom2, objArr3);
                    iESParameterSpec = new IESParameterSpec(bArr, bArr2, 128);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } else if (!(iESParameterSpec instanceof IESParameterSpec)) {
            throw new InvalidAlgorithmParameterException(C1561oA.Yd("JSRT\u0001DH\u0004UGZ[NN\u000b52A\u000f`RdTaZj\\jl", (short) (C1580rY.Xd() ^ (-24900))));
        }
        IESKey iESKey = (IESKey) key;
        if (iESKey.getPublic() instanceof DHPublicKey) {
            asymmetricKeyParameterGeneratePublicKeyParameter = DHUtil.generatePublicKeyParameter(iESKey.getPublic());
            asymmetricKeyParameterGeneratePrivateKeyParameter = DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
        } else {
            asymmetricKeyParameterGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(iESKey.getPublic());
            asymmetricKeyParameterGeneratePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(iESKey.getPrivate());
        }
        this.engineParams = (IESParameterSpec) iESParameterSpec;
        IESParameters iESParameters = new IESParameters(this.engineParams.getDerivationV(), this.engineParams.getEncodingV(), this.engineParams.getMacKeySize());
        this.state = i2;
        this.buffer.reset();
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        System.out.println(C1561oA.yd("fgdk&", (short) (C1499aX.Xd() ^ (-22546))));
                        return;
                    }
                }
            }
            this.cipher.init(false, asymmetricKeyParameterGeneratePrivateKeyParameter, asymmetricKeyParameterGeneratePublicKeyParameter, iESParameters);
            return;
        }
        this.cipher.init(true, asymmetricKeyParameterGeneratePrivateKeyParameter, asymmetricKeyParameterGeneratePublicKeyParameter, iESParameters);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        throw new IllegalArgumentException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(str + " unavailable with RSA.");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        this.buffer.write(bArr, i2, i3);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        this.buffer.write(bArr, i2, i3);
        return null;
    }
}
