package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class RsaSsaPssSignKeyManager extends PrivateKeyTypeManager<RsaSsaPssPrivateKey, RsaSsaPssPublicKey> {

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$1 */
    class AnonymousClass1 extends PrimitiveFactory<PublicKeySign, RsaSsaPssPrivateKey> {
        AnonymousClass1(Class clazz) {
            super(clazz);
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public PublicKeySign getPrimitive(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
            KeyFactory engineFactory = EngineFactory.KEY_FACTORY.getInstance("RSA");
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) engineFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray())));
            RsaSsaPssParams params = keyProto.getPublicKey().getParams();
            SelfKeyTestValidators.validateRsaSsaPss(rSAPrivateCrtKey, (RSAPublicKey) engineFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()))), SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
            return new RsaSsaPssSignJce(rSAPrivateCrtKey, SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$2 */
    class AnonymousClass2 extends KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> {
        AnonymousClass2(Class clazz) {
            super(clazz);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public RsaSsaPssPrivateKey createKey(RsaSsaPssKeyFormat format) throws Throwable {
            RsaSsaPssParams params = format.getParams();
            Validators.validateRsaModulusSize(format.getModulusSizeInBits());
            Validators.validateSignatureHash(SigUtil.toHashType(params.getSigHash()));
            KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance(Qg.kd("\u0018\u0018\u0005", (short) (C1633zX.Xd() ^ (-13872)), (short) (C1633zX.Xd() ^ (-17156))));
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray()));
            short sXd = (short) (FB.Xd() ^ 13353);
            short sXd2 = (short) (FB.Xd() ^ 13197);
            int[] iArr = new int[" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b".length()];
            QB qb = new QB(" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object[] objArr = {rSAKeyGenParameterSpec};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("NRLVRISOWA", (short) (C1580rY.Xd() ^ (-2230))), Class.forName(C1561oA.ud("\u0006{\u0010yE\nzw\t\u0005z\u0005\t<\u0001|pm7IsmtvlvimO_o]h_m]iIeYV", (short) (OY.Xd() ^ 26351))));
            try {
                method.setAccessible(true);
                method.invoke(engineFactory, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("ph~j8~qp\u0004\u0002y\u0006\fA_z\u0010gy\u0003\rb\u0002\f\u0004\u0012\u0002\u0016\u0012\u0016", (short) (OY.Xd() ^ 26316))).getMethod(Xg.qd("\u001f\u001e( .\u001e2$\u000b&;\u0013%.8", (short) (C1499aX.Xd() ^ (-22671)), (short) (C1499aX.Xd() ^ (-31680))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    KeyPair keyPair = (KeyPair) method2.invoke(engineFactory, objArr2);
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPair.getPublic();
                    RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPair.getPrivate();
                    return (RsaSsaPssPrivateKey) RsaSsaPssPrivateKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setPublicKey((RsaSsaPssPublicKey) RsaSsaPssPublicKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setParams(params).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public Map<String, KeyTypeManager.KeyFactory.KeyFormat<RsaSsaPssKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("RSA_SSA_PSS_3072_SHA256_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
            map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
            map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
            map.put("RSA_SSA_PSS_4096_SHA512_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
            map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
            map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public RsaSsaPssKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return RsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public void validateKeyFormat(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
            SigUtil.validateRsaSsaPssParams(format.getParams());
            Validators.validateRsaModulusSize(format.getModulusSizeInBits());
            Validators.validateRsaPublicExponent(new BigInteger(1, format.getPublicExponent().toByteArray()));
        }
    }

    RsaSsaPssSignKeyManager() {
        super(RsaSsaPssPrivateKey.class, RsaSsaPssPublicKey.class, new PrimitiveFactory<PublicKeySign, RsaSsaPssPrivateKey>(PublicKeySign.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.1
            AnonymousClass1(Class clazz) {
                super(clazz);
            }

            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public PublicKeySign getPrimitive(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
                KeyFactory engineFactory = EngineFactory.KEY_FACTORY.getInstance("RSA");
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) engineFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray())));
                RsaSsaPssParams params = keyProto.getPublicKey().getParams();
                SelfKeyTestValidators.validateRsaSsaPss(rSAPrivateCrtKey, (RSAPublicKey) engineFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()))), SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
                return new RsaSsaPssSignJce(rSAPrivateCrtKey, SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
            }
        });
    }

    public static RsaSsaPssKeyFormat createKeyFormat(HashType sigHash, HashType mgf1Hash, int saltLength, int modulusSize, BigInteger publicExponent) {
        return (RsaSsaPssKeyFormat) RsaSsaPssKeyFormat.newBuilder().setParams((RsaSsaPssParams) RsaSsaPssParams.newBuilder().setSigHash(sigHash).setMgf1Hash(mgf1Hash).setSaltLength(saltLength).build()).setModulusSizeInBits(modulusSize).setPublicExponent(ByteString.copyFrom(publicExponent.toByteArray())).build();
    }

    private static KeyTemplate createKeyTemplate(HashType sigHash, HashType mgf1Hash, int saltLength, int modulusSize, BigInteger publicExponent, KeyTemplate.OutputPrefixType prefixType) {
        return KeyTemplate.create(new RsaSsaPssSignKeyManager().getKeyType(), createKeyFormat(sigHash, mgf1Hash, saltLength, modulusSize, publicExponent).toByteArray(), prefixType);
    }

    public static final KeyTemplate rawRsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rawRsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void registerPair(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new RsaSsaPssSignKeyManager(), new RsaSsaPssVerifyKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate rsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public RsaSsaPssPublicKey getPublicKey(RsaSsaPssPrivateKey privKeyProto) throws GeneralSecurityException {
        return privKeyProto.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey>(RsaSsaPssKeyFormat.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.2
            AnonymousClass2(Class clazz) {
                super(clazz);
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public RsaSsaPssPrivateKey createKey(RsaSsaPssKeyFormat format) throws Throwable {
                RsaSsaPssParams params = format.getParams();
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateSignatureHash(SigUtil.toHashType(params.getSigHash()));
                KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance(Qg.kd("\u0018\u0018\u0005", (short) (C1633zX.Xd() ^ (-13872)), (short) (C1633zX.Xd() ^ (-17156))));
                RSAKeyGenParameterSpec rSAKeyGenParameterSpec = new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray()));
                short sXd = (short) (FB.Xd() ^ 13353);
                short sXd2 = (short) (FB.Xd() ^ 13197);
                int[] iArr = new int[" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b".length()];
                QB qb = new QB(" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Object[] objArr = {rSAKeyGenParameterSpec};
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("NRLVRISOWA", (short) (C1580rY.Xd() ^ (-2230))), Class.forName(C1561oA.ud("\u0006{\u0010yE\nzw\t\u0005z\u0005\t<\u0001|pm7IsmtvlvimO_o]h_m]iIeYV", (short) (OY.Xd() ^ 26351))));
                try {
                    method.setAccessible(true);
                    method.invoke(engineFactory, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Yd("ph~j8~qp\u0004\u0002y\u0006\fA_z\u0010gy\u0003\rb\u0002\f\u0004\u0012\u0002\u0016\u0012\u0016", (short) (OY.Xd() ^ 26316))).getMethod(Xg.qd("\u001f\u001e( .\u001e2$\u000b&;\u0013%.8", (short) (C1499aX.Xd() ^ (-22671)), (short) (C1499aX.Xd() ^ (-31680))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        KeyPair keyPair = (KeyPair) method2.invoke(engineFactory, objArr2);
                        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPair.getPublic();
                        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPair.getPrivate();
                        return (RsaSsaPssPrivateKey) RsaSsaPssPrivateKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setPublicKey((RsaSsaPssPublicKey) RsaSsaPssPublicKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setParams(params).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<RsaSsaPssKeyFormat>> keyFormats() throws GeneralSecurityException {
                HashMap map = new HashMap();
                map.put("RSA_SSA_PSS_3072_SHA256_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
                map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA256, HashType.SHA256, 32, 3072, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                map.put("RSA_SSA_PSS_4096_SHA512_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.RAW));
                map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPssSignKeyManager.createKeyFormat(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4), KeyTemplate.OutputPrefixType.TINK));
                return Collections.unmodifiableMap(map);
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public RsaSsaPssKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return RsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
                SigUtil.validateRsaSsaPssParams(format.getParams());
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateRsaPublicExponent(new BigInteger(1, format.getPublicExponent().toByteArray()));
            }
        };
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public RsaSsaPssPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPssPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
        Validators.validateVersion(keyProto.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()));
        SigUtil.validateRsaSsaPssParams(keyProto.getPublicKey().getParams());
    }
}
