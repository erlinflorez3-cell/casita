package com.ts.coresdk.crypto.api;

import com.ts.coresdk.crypto.logic.TSRegularKeyPair;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\rӬ2\b\u000eј\u0017jg3|eG.ɢR*\u0010m"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%op\u000f", "\u0013qa<e", "!tR0X:L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%opwfp9X\u0004|", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%opwts*Lv5U\"", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface RegularKeyPairResult {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%opwfp9X\u0004|", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j", "3qa<e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j", "5dc\u0012e9H`", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011k\u0019@@\u0003Bm\t/Ao#*XFOKA+\u001fu7", "1n\\=b5>\\(J", ">/", "1n_F", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u001bxA(\">% \u0005m4\u0018\u00065\u0011JX9\\`qC]\u0010g\"Y:\u0017NUL(817!\u00183E\u000f!h\u0015v\u0012\u0012BWpPf\u0017V8t\u0003N3u\u001c", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u001bxA(\">%*", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%op\u000f"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Error implements RegularKeyPairResult {
        private final CryptographyError error;

        public Error(CryptographyError cryptographyError) {
            Intrinsics.checkNotNullParameter(cryptographyError, "");
            this.error = cryptographyError;
        }

        public static /* synthetic */ Error copy$default(Error error, CryptographyError cryptographyError, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                cryptographyError = error.error;
            }
            return error.copy(cryptographyError);
        }

        public final CryptographyError component1() {
            return this.error;
        }

        public final Error copy(CryptographyError cryptographyError) {
            Intrinsics.checkNotNullParameter(cryptographyError, "");
            return new Error(cryptographyError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        public final CryptographyError getError() {
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
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCA٭ \u0014̝9O|{({Z^\u0019H'\u0006Dw̶0K[\u000bk%W@PsW3{n\u0004˨aҽ:\u0007&60;B\u001d\u000f BH>͌+IQ\f 5XphQŞ\u0004ܨ\u0016\bD&\u000f%%\u007f\\@`l\fC_)\u0011nZP=^^\u0005\u0014ЌGù+\u000f|k,6\tEC\"=S1\u0013\u0019Đ>ƄCsC\u0012v5o9W\u0004o6\u0007\u000fZǛ*̠\u0011_x6j\u0016\"x\u001a'CO\u0012J\u0007\u0013~Ã|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%opwts*Lv5U\"", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#F}\"Gt\u0012;3COV0\"\">", "9dh\u001dT0K", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#F}\"Gt\u0012;3COV0\"\">", "5dc\u0018X@)O\u001d\f", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011v\u0018>z#~Hk\r7o&5IP!kH\t\u0011ln\u000f", "1n\\=b5>\\(J", ">/", "1n_F", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ny\u0010@tn$Gj 9}\u001d*Z);\u007f\u001f\u001a\u0019u7|ma6V@6U\u0016L6iR\u0001<\u001a[X\u001bb6\u001c\u000f#=/r\u000e$\u001f\n<P}HN\u0001 \u0001\n9w]Bd N\tScQ'fFgmO", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ny\u0010@tn$Gj 9}\u001d*Z);\u007f\u001f\u001a\u0019u7|w", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW)v'E`y-\u001dm*\u0019IGHX4,%op\u000f"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Success implements RegularKeyPairResult {
        private final TSRegularKeyPair keyPair;

        public Success(TSRegularKeyPair tSRegularKeyPair) {
            Intrinsics.checkNotNullParameter(tSRegularKeyPair, "");
            this.keyPair = tSRegularKeyPair;
        }

        public static /* synthetic */ Success copy$default(Success success, TSRegularKeyPair tSRegularKeyPair, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                tSRegularKeyPair = success.keyPair;
            }
            return success.copy(tSRegularKeyPair);
        }

        public final TSRegularKeyPair component1() {
            return this.keyPair;
        }

        public final Success copy(TSRegularKeyPair tSRegularKeyPair) {
            Intrinsics.checkNotNullParameter(tSRegularKeyPair, "");
            return new Success(tSRegularKeyPair);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.keyPair, ((Success) obj).keyPair);
        }

        public final TSRegularKeyPair getKeyPair() {
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
