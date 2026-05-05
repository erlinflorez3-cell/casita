package com.ts.coresdk.crypto.api;

import com.ts.coresdk.crypto.biometrcis.TSBiometricKeyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\rӬ2\b\u000eј\u0017jg3|eG.ɢR*\u0010m"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u00169", "\u0013qa<e", "!tR0X:L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u0016\"\f[\u00041T\"", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u0016\"\u001a^t%GZ\\\u0002", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface BiometricKeyPairResult {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u0016\"\f[\u00041T\"", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|", "3qa<e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|", "5dc\u0012e9H`", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011k\u0019@@\u0003Bm\t/Ao#*XFOH8(\u001dhpF\u000ba\f[\u00041T\"", "1n\\=b5>\\(J", ">/", "1n_F", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005C9[\u00014\u001d\u00105*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012uE\r?2]\u0010 \u00165y}FTuG\u000e\u007fqE6UFgo\u0001V\u007f%o7n\u00195", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005C9[\u00014\u001d\u0010?", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u00169"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Error implements BiometricKeyPairResult {
        private final CryptographyBiometricError error;

        public Error(CryptographyBiometricError cryptographyBiometricError) {
            Intrinsics.checkNotNullParameter(cryptographyBiometricError, "");
            this.error = cryptographyBiometricError;
        }

        public static /* synthetic */ Error copy$default(Error error, CryptographyBiometricError cryptographyBiometricError, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cryptographyBiometricError = error.error;
            }
            return error.copy(cryptographyBiometricError);
        }

        public final CryptographyBiometricError component1() {
            return this.error;
        }

        public final Error copy(CryptographyBiometricError cryptographyBiometricError) {
            Intrinsics.checkNotNullParameter(cryptographyBiometricError, "");
            return new Error(cryptographyBiometricError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        public final CryptographyBiometricError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u0016\"\u001a^t%GZ\\\u0002", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013NaMq_0[L", "9dh\u001dT0K", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013NaMq_0[L", "5dc\u0018X@)O\u001d\f", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011l\u0012F~%Df{$E7\u0005\u001c*GEs4-\"l_\u001f\u0007w\u0017Jz4\u001d", "1n\\=b5>\\(J", ">/", "1n_F", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ds\u0018Dv4BW\u0002.\u0001\\\u0004\u000bQMCkC+\u0019fG9\u001bN(R\u0004|\u000b3L6d\u001c\u0002K]\u0010d\u001bN9\f\u000b#?1\u0003OF)Q(T\u0006\u0005E\u0005\u0016\u001e\u000eDwt@<\u0010[d\u0011yN\u0016hTif\t\u0006/U`(d\u001amr", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ds\u0018Dv4BW\u0002.\u0001\\\u0004\u000bQMCkC+\u0019fG9\u001bN(R\u0004|\u000b=", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u0019z/=Y\r-;k{.a.7oA\u000b\u0015vq@\u00169"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Success implements BiometricKeyPairResult {
        private final TSBiometricKeyPair keyPair;

        public Success(TSBiometricKeyPair tSBiometricKeyPair) {
            Intrinsics.checkNotNullParameter(tSBiometricKeyPair, "");
            this.keyPair = tSBiometricKeyPair;
        }

        public static /* synthetic */ Success copy$default(Success success, TSBiometricKeyPair tSBiometricKeyPair, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                tSBiometricKeyPair = success.keyPair;
            }
            return success.copy(tSBiometricKeyPair);
        }

        public final TSBiometricKeyPair component1() {
            return this.keyPair;
        }

        public final Success copy(TSBiometricKeyPair tSBiometricKeyPair) {
            Intrinsics.checkNotNullParameter(tSBiometricKeyPair, "");
            return new Success(tSBiometricKeyPair);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.keyPair, ((Success) obj).keyPair);
        }

        public final TSBiometricKeyPair getKeyPair() {
            return this.keyPair;
        }

        public int hashCode() {
            return this.keyPair.hashCode();
        }

        public String toString() {
            return "Success(keyPair=" + this.keyPair + ")";
        }
    }
}
