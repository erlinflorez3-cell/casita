package com.ticnow.sdk.idnowsecurity.security.crypto;

import com.ticnow.sdk.idnowsecurity.api.IDNowSettings;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017AH\u007f?-\u001f2E\u0018bc:$", "", "u(E", "\u0011n\\=T5B]\"", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDAes {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0017nj?4JͣIDɟ\u0004*=j<9*[ҸuCIUb\u00160\ngP}f\u001dL\u000b\u000fQ\u0012\u001e\u0016'l\\Oc|u\u0014%1pq\bK[tU;vsd\u000bP80?\u0012\u0007\u0017\u0019XN@z\tKc\f@2\t\tH[%O\u001b\u0019@\fn$\u000f!tg|8xrkAG%\u0019hpTou>\u0007e\u000f\\SU\u000f'e,/X7c\u0017UW\u0011\u000fj[m\u0005\b\nK\u0010\u0001)=*wy\b<f\u0007,\u0017AN;c#*j\ri`:)ˬSo"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017AH\u007f?-\u001f2E\u0018bc:\rT1OWJ5`\\{\u0013", "", "u(E", "2dR?l7M", "", "9dh", "Asa", "2dR?l7M0-\u000ezl", "", "2`c.", "AdR?X;8Y\u0019\u0013", "2dR?l7M2\u0015\u000ev", "3mR?l7M", "3mR?l7M2\u0015\u000ev", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String decrypt(java.lang.String r17, java.lang.String r18) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowsecurity.security.crypto.IDAes.Companion.decrypt(java.lang.String, java.lang.String):java.lang.String");
        }

        public final byte[] decryptBytes(byte[] bArr, String secret_key) {
            byte[] bArrDoFinal;
            Intrinsics.checkParameterIsNotNull(secret_key, "secret_key");
            Security.addProvider(new BouncyCastleProvider());
            String vVar = IDNowSettings.Companion.getv();
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
            if (vVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = vVar.getBytes(charsetForName);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName2, "Charset.forName(charsetName)");
                byte[] bytes2 = secret_key.getBytes(charsetForName2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(bytes2), 16), "AES");
                synchronized (Cipher.class) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr);
                }
                return bArrDoFinal;
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return null;
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e6) {
                e6.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e7) {
                e7.printStackTrace();
                return null;
            } catch (ShortBufferException e8) {
                e8.printStackTrace();
                return null;
            }
        }

        public final byte[] decryptData(String key, byte[] bArr) {
            byte[] bArr2;
            Intrinsics.checkParameterIsNotNull(key, "key");
            Security.addProvider(new BouncyCastleProvider());
            try {
                Charset charsetForName = Charset.forName("UTF8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
                byte[] bytes = key.getBytes(charsetForName);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                synchronized (Cipher.class) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    cipher.init(2, secretKeySpec);
                    if (bArr == null) {
                        Intrinsics.throwNpe();
                    }
                    bArr2 = new byte[cipher.getOutputSize(bArr.length)];
                    cipher.doFinal(bArr2, cipher.update(bArr, 0, bArr.length, bArr2, 0));
                }
                return bArr2;
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return null;
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e6) {
                e6.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e7) {
                e7.printStackTrace();
                return null;
            } catch (ShortBufferException e8) {
                e8.printStackTrace();
                return null;
            }
        }

        public final String encrypt(String str, String secret_key) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "str");
            Intrinsics.checkParameterIsNotNull(secret_key, "secret_key");
            Security.addProvider(new BouncyCastleProvider());
            try {
                Charset charsetForName = Charset.forName("UTF8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
                byte[] bytes = secret_key.getBytes(charsetForName);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                Charset charsetForName2 = Charset.forName("UTF8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName2, "Charset.forName(charsetName)");
                byte[] bytes2 = str.getBytes(charsetForName2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                synchronized (Cipher.class) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    cipher.init(1, secretKeySpec);
                    byte[] bArr = new byte[cipher.getOutputSize(bytes2.length)];
                    cipher.doFinal(bArr, cipher.update(bytes2, 0, bytes2.length, bArr, 0));
                    byte[] bArrEncode = Base64.encode(bArr);
                    Intrinsics.checkExpressionValueIsNotNull(bArrEncode, "Base64.encode(cipherText)");
                    str2 = new String(bArrEncode, Charsets.UTF_8);
                }
                return str2;
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return null;
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e6) {
                e6.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e7) {
                e7.printStackTrace();
                return null;
            } catch (ShortBufferException e8) {
                e8.printStackTrace();
                return null;
            }
        }

        public final byte[] encryptData(byte[] bArr, String secret_key) {
            byte[] bArrDoFinal;
            Intrinsics.checkParameterIsNotNull(secret_key, "secret_key");
            Security.addProvider(new BouncyCastleProvider());
            String vVar = IDNowSettings.Companion.getv();
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
            if (vVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = vVar.getBytes(charsetForName);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName2, "Charset.forName(charsetName)");
                byte[] bytes2 = secret_key.getBytes(charsetForName2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(bytes2), 16), "AES");
                synchronized (Cipher.class) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr);
                }
                return bArrDoFinal;
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvalidKeyException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
                return null;
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e6) {
                e6.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e7) {
                e7.printStackTrace();
                return null;
            } catch (ShortBufferException e8) {
                e8.printStackTrace();
                return null;
            }
        }
    }
}
