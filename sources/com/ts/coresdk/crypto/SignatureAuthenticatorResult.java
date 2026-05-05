package com.ts.coresdk.crypto;

import com.ts.coresdk.crypto.logic.CryptographyActionError;
import java.security.Signature;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\rӬ2\b\u000eј\u0017jg3|eG.ɢR*\u0010m"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;$", "\u0014`X9h9>", "!tR0X:L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;\rW#KS^9\\(", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;\rd7EJN:j(", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface SignatureAuthenticatorResult {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;\rW#KS^9\\(", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0003Bm\t/Ao#*XFOG2-\u0019rj\u0019\u0014p6[L", "3qa<e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0003Bm\t/Ao#*XFOG2-\u0019rj\u0019\u0014p6[L", "5dc\u0012e9H`", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011v\u0018>z#~7\u000b4B| 0Z?FnHy\u0013weC\u0010C9[\u00014\u001d", "1n\\=b5>\\(J", ">/", "1n_F", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ny\u0010@tn\u0013f\u0012+Fw\u0018;IN>\u007f\u0010\u001c$lkBfp9X\u0004|\u000b3L6d\u001c\u0002K]\u0010d\u001bN9\f\u000b#?1\u0003OF)Q\u001aM\u0004Dd\u0010\u001c#\u000e\u0011z\u007fEV\u0019V}\u0013qP3u3Ym\nNP\u0004C&h\u0013o*\\\u0010", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ny\u0010@tn\u0013f\u0012+Fw\u0018;IN>\u007f\u0010\u001c$lkBfp9X\u0004|\u000b=", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;$"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Failure implements SignatureAuthenticatorResult {
        private final CryptographyActionError error;

        public Failure(CryptographyActionError cryptographyActionError) {
            Intrinsics.checkNotNullParameter(cryptographyActionError, "");
            this.error = cryptographyActionError;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CryptographyActionError cryptographyActionError, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                cryptographyActionError = failure.error;
            }
            return failure.copy(cryptographyActionError);
        }

        public final CryptographyActionError component1() {
            return this.error;
        }

        public final Failure copy(CryptographyActionError cryptographyActionError) {
            Intrinsics.checkNotNullParameter(cryptographyActionError, "");
            return new Failure(cryptographyActionError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
        }

        public final CryptographyActionError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;\rd7EJN:j(", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001di\u00021wO\u0011$\u0017\u001d", "/tc5X5MW\u0017z\n^+j\r1n{7\fM\u0001", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001di\u00021wO\u0011$\u0017\u001d", "5dc\u000eh;AS\"\u000e~\\(\f\t.S\u0004*\u0005<\u0010'$G", "u(;7T=:\u001d'~xn9\u0001\u0018C/m,}I|&'Toc", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\ba\u0019|\u000bk0\f\u001dxS\u0004*\u0005<\u0010'$GEQ#t/=#\r.\u0001k ;MQ:q}\u001c\"|lH\u0011-\u001aRx0C[^9\\.\u0003L\u0017\u0012c\u001dR)\t\u0014cN\u0011nRG&\u0017j7\u00129f\u0001\u001a$c", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKY.i(\ba\u0019|\u000bk0\f\u001dxS\u0004*\u0005<\u0010'$GEQ-", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;$"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Success implements SignatureAuthenticatorResult {
        private final Signature authenticatedSignature;

        public Success(Signature signature) {
            Intrinsics.checkNotNullParameter(signature, "");
            this.authenticatedSignature = signature;
        }

        public static /* synthetic */ Success copy$default(Success success, Signature signature, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                signature = success.authenticatedSignature;
            }
            return success.copy(signature);
        }

        public final Signature component1() {
            return this.authenticatedSignature;
        }

        public final Success copy(Signature signature) {
            Intrinsics.checkNotNullParameter(signature, "");
            return new Success(signature);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.authenticatedSignature, ((Success) obj).authenticatedSignature);
        }

        public final Signature getAuthenticatedSignature() {
            return this.authenticatedSignature;
        }

        public int hashCode() {
            return this.authenticatedSignature.hashCode();
        }

        public String toString() {
            return "Success(authenticatedSignature=" + this.authenticatedSignature + ")";
        }
    }
}
