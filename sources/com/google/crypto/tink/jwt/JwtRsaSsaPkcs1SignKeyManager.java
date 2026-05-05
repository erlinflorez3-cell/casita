package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
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
import java.util.Optional;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public final class JwtRsaSsaPkcs1SignKeyManager extends PrivateKeyTypeManager<JwtRsaSsaPkcs1PrivateKey, JwtRsaSsaPkcs1PublicKey> {

    private static class JwtPublicKeySignFactory extends PrimitiveFactory<JwtPublicKeySignInternal, JwtRsaSsaPkcs1PrivateKey> {
        public JwtPublicKeySignFactory() {
            super(JwtPublicKeySignInternal.class);
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public JwtPublicKeySignInternal getPrimitive(JwtRsaSsaPkcs1PrivateKey keyProto) throws GeneralSecurityException {
            RSAPrivateCrtKey rSAPrivateCrtKeyCreatePrivateKey = JwtRsaSsaPkcs1SignKeyManager.createPrivateKey(keyProto);
            JwtRsaSsaPkcs1SignKeyManager.selfTestKey(rSAPrivateCrtKeyCreatePrivateKey, keyProto);
            JwtRsaSsaPkcs1Algorithm algorithm = keyProto.getPublicKey().getAlgorithm();
            final RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new RsaSsaPkcs1SignJce(rSAPrivateCrtKeyCreatePrivateKey, JwtRsaSsaPkcs1VerifyKeyManager.hashForPkcs1Algorithm(algorithm));
            final String strName = algorithm.name();
            final Optional optionalOf = keyProto.getPublicKey().hasCustomKid() ? Optional.of(keyProto.getPublicKey().getCustomKid().getValue()) : Optional.empty();
            return new JwtPublicKeySignInternal() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.JwtPublicKeySignFactory.1
                @Override // com.google.crypto.tink.jwt.JwtPublicKeySignInternal
                public String signAndEncodeWithKid(RawJwt rawJwt, Optional<String> kid) throws GeneralSecurityException {
                    if (optionalOf.isPresent()) {
                        if (kid.isPresent()) {
                            throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
                        }
                        kid = optionalOf;
                    }
                    String strCreateUnsignedCompact = JwtFormat.createUnsignedCompact(strName, kid, rawJwt);
                    return JwtFormat.createSignedCompact(strCreateUnsignedCompact, rsaSsaPkcs1SignJce.sign(strCreateUnsignedCompact.getBytes(StandardCharsets.US_ASCII)));
                }
            };
        }
    }

    JwtRsaSsaPkcs1SignKeyManager() {
        super(JwtRsaSsaPkcs1PrivateKey.class, JwtRsaSsaPkcs1PublicKey.class, new JwtPublicKeySignFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTypeManager.KeyFactory.KeyFormat<JwtRsaSsaPkcs1KeyFormat> createKeyFormat(JwtRsaSsaPkcs1Algorithm algorithm, int modulusSize, BigInteger publicExponent, KeyTemplate.OutputPrefixType prefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat<>((JwtRsaSsaPkcs1KeyFormat) JwtRsaSsaPkcs1KeyFormat.newBuilder().setAlgorithm(algorithm).setModulusSizeInBits(modulusSize).setPublicExponent(ByteString.copyFrom(publicExponent.toByteArray())).build(), prefixType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RSAPrivateCrtKey createPrivateKey(JwtRsaSsaPkcs1PrivateKey keyProto) throws GeneralSecurityException {
        return (RSAPrivateCrtKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray())));
    }

    public static void registerPair(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new JwtRsaSsaPkcs1SignKeyManager(), new JwtRsaSsaPkcs1VerifyKeyManager(), newKeyAllowed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selfTestKey(RSAPrivateCrtKey privateKey, JwtRsaSsaPkcs1PrivateKey keyProto) throws GeneralSecurityException {
        SelfKeyTestValidators.validateRsaSsaPkcs1(privateKey, (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()))), JwtRsaSsaPkcs1VerifyKeyManager.hashForPkcs1Algorithm(keyProto.getPublicKey().getAlgorithm()));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PrivateKey";
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public JwtRsaSsaPkcs1PublicKey getPublicKey(JwtRsaSsaPkcs1PrivateKey privKeyProto) {
        return privKeyProto.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<JwtRsaSsaPkcs1KeyFormat, JwtRsaSsaPkcs1PrivateKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<JwtRsaSsaPkcs1KeyFormat, JwtRsaSsaPkcs1PrivateKey>(JwtRsaSsaPkcs1KeyFormat.class) { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.1
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtRsaSsaPkcs1PrivateKey createKey(JwtRsaSsaPkcs1KeyFormat format) throws Throwable {
                JwtRsaSsaPkcs1Algorithm algorithm = format.getAlgorithm();
                EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> engineFactory = EngineFactory.KEY_PAIR_GENERATOR;
                short sXd = (short) (ZN.Xd() ^ 26);
                short sXd2 = (short) (ZN.Xd() ^ 6921);
                int[] iArr = new int["//\u001c".length()];
                QB qb = new QB("//\u001c");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                KeyPairGenerator engineFactory2 = engineFactory.getInstance(new String(iArr, 0, i2));
                RSAKeyGenParameterSpec rSAKeyGenParameterSpec = new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray()));
                short sXd3 = (short) (C1499aX.Xd() ^ (-709));
                short sXd4 = (short) (C1499aX.Xd() ^ (-19908));
                int[] iArr2 = new int[" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b".length()];
                QB qb2 = new QB(" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#Vr\f\u001ft\u0005\f\u0014g\u0005\r\u0003\u000f|\u000f\t\u000b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[1];
                short sXd5 = (short) (C1633zX.Xd() ^ (-3998));
                int[] iArr3 = new int["h^r\\(l]Zkg]gk\u001fc_SP\u001a,VPWYOYLP2BR@KBP@L,H<9".length()];
                QB qb3 = new QB("h^r\\(l]Zkg]gk\u001fc_SP\u001a,VPWYOYLP2BR@KBP@L,H<9");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd5 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr = {rSAKeyGenParameterSpec};
                Method method = cls.getMethod(C1561oA.yd("X^ZfTMYWaM", (short) (C1580rY.Xd() ^ (-1363))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(engineFactory2, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Yd("\u001f\u0017-\u0019f- \u001f20(4:o\u000e)>\u0016(1;\u00110:2@0D@D", (short) (C1499aX.Xd() ^ (-30417)))).getMethod(Xg.qd("vu\u007fw\u0006u\n{b}\u0013j|\u0006\u0010", (short) (C1607wl.Xd() ^ 16977), (short) (C1607wl.Xd() ^ 18739)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        KeyPair keyPair = (KeyPair) method2.invoke(engineFactory2, objArr2);
                        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPair.getPublic();
                        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPair.getPrivate();
                        return (JwtRsaSsaPkcs1PrivateKey) JwtRsaSsaPkcs1PrivateKey.newBuilder().setVersion(JwtRsaSsaPkcs1SignKeyManager.this.getVersion()).setPublicKey((JwtRsaSsaPkcs1PublicKey) JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(JwtRsaSsaPkcs1SignKeyManager.this.getVersion()).setAlgorithm(algorithm).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtRsaSsaPkcs1PrivateKey deriveKey(JwtRsaSsaPkcs1KeyFormat format, InputStream inputStream) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtRsaSsaPkcs1KeyFormat>> keyFormats() {
                HashMap map = new HashMap();
                map.put("JWT_RS256_2048_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS256, 2048, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW));
                map.put("JWT_RS256_2048_F4", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS256, 2048, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK));
                map.put("JWT_RS256_3072_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS256, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW));
                map.put("JWT_RS256_3072_F4", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS256, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK));
                map.put("JWT_RS384_3072_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS384, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW));
                map.put("JWT_RS384_3072_F4", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS384, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK));
                map.put("JWT_RS512_4096_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW));
                map.put("JWT_RS512_4096_F4", JwtRsaSsaPkcs1SignKeyManager.createKeyFormat(JwtRsaSsaPkcs1Algorithm.RS512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK));
                return Collections.unmodifiableMap(map);
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public JwtRsaSsaPkcs1KeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return JwtRsaSsaPkcs1KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(JwtRsaSsaPkcs1KeyFormat keyFormat) throws GeneralSecurityException {
                Validators.validateRsaModulusSize(keyFormat.getModulusSizeInBits());
                Validators.validateRsaPublicExponent(new BigInteger(1, keyFormat.getPublicExponent().toByteArray()));
            }
        };
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtRsaSsaPkcs1PrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtRsaSsaPkcs1PrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtRsaSsaPkcs1PrivateKey privKey) throws GeneralSecurityException {
        Validators.validateVersion(privKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, privKey.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, privKey.getPublicKey().getE().toByteArray()));
    }
}
