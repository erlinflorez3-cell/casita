package com.ts.coresdk.crypto.api;

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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\rӬ2\b\u000eј\u0017jg3|eG.ɢR*\u0010m"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u00169", "\u0014`X9h9>", "!tR0X:L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u0016\"\rJz.WYN\u0002", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u0016\"\u001a^t%GZ\\\u0002", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface CryptographySignResult {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٭ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q\u001e%ѡ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\tGï\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u0016\"\rJz.WYN\u0002", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]o?j\nx\u0016\u001cEq\u007f\u00017\fK\u0001%\u0003A~", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u00169"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Failure implements CryptographySignResult {
        private final String errorMessage;
        private final Throwable throwable;

        public Failure(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = failure.errorMessage;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = failure.throwable;
            }
            return failure.copy(str, th);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Throwable component2() {
            return this.throwable;
        }

        public final Failure copy(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Failure(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.errorMessage, failure.errorMessage) && Intrinsics.areEqual(this.throwable, failure.throwable);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = this.errorMessage.hashCode() * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Failure(errorMessage=" + this.errorMessage + ", throwable=" + this.throwable + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bebʴ-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u0016\"\u001a^t%GZ\\\u0002", "", "AhV;X+,b&\u0003\u0004`", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc \\.GS\u0018l\nk0\u0006\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+\u0017\u0014w7]\u0001)THY/p@v?\u001d~Z\u001c^2\u001cCGQ\"lDE-]", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u00169"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Success implements CryptographySignResult {
        private final String signedString;

        public Success(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.signedString = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = success.signedString;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.signedString;
        }

        public final Success copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.signedString, ((Success) obj).signedString);
        }

        public final String getSignedString() {
            return this.signedString;
        }

        public int hashCode() {
            return this.signedString.hashCode();
        }

        public String toString() {
            return "Success(signedString=" + this.signedString + ")";
        }
    }
}
