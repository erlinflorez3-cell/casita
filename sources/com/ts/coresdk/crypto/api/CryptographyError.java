package com.ts.coresdk.crypto.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005'4\u0012\u000e\u0007njO0Le^.ZS0\u0011s{BřaY\bّkUH\u0011Z\nXXr(\bP\\\u001bG\u001d\u0015.x\u0019+Y[\u0007m*\u0011HA\u001eCݯQqCJn\u0007\u0007\u001d.2:8(\u00047/\u0001В\u0012ͯ~MS\u000e\u00180NqRT\u0013O\u0013\u001db L%\u0019 rf|:~\u00024ƕ1ݭ\u0007sJP-d>\u0003e\u000fL[5\u0015ǻ`\u001f7ME"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "\u0015d]2e(MS~~\u000f?(\u0001\u0010/d", "\u0017mc2e5:Zx\f\bh9", "\u001anP1>,R4\u0015\u0003\u0002^+", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SJaB\u0007p(]v\rG`/(`Yr<i", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SLjH\u0007p5J}\u0007TYX92", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SOk5\u0006I,bW#KSN+2", ">/", ">0", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class CryptographyError {
    private final String errorMessage;
    private final Throwable throwable;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٬ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q.%ѱ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\u0019Gÿ\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SJaB\u0007p(]v\rG`/(`Yr<i", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]aHu\u000b\u0019To5spOR\u001fG_\u0015\n\"%lMY^O", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class GenerateKeyFailed extends CryptographyError {
        private final String errorMessage;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenerateKeyFailed(String str, Throwable th) {
            super(str, th, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ GenerateKeyFailed copy$default(GenerateKeyFailed generateKeyFailed, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = generateKeyFailed.getErrorMessage();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = generateKeyFailed.getThrowable();
            }
            return generateKeyFailed.copy(str, th);
        }

        public final String component1() {
            return getErrorMessage();
        }

        public final Throwable component2() {
            return getThrowable();
        }

        public final GenerateKeyFailed copy(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            return new GenerateKeyFailed(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateKeyFailed)) {
                return false;
            }
            GenerateKeyFailed generateKeyFailed = (GenerateKeyFailed) obj;
            return Intrinsics.areEqual(getErrorMessage(), generateKeyFailed.getErrorMessage()) && Intrinsics.areEqual(getThrowable(), generateKeyFailed.getThrowable());
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return (getErrorMessage().hashCode() * 31) + (getThrowable() == null ? 0 : getThrowable().hashCode());
        }

        public String toString() {
            return "GenerateKeyFailed(errorMessage=" + getErrorMessage() + ", throwable=" + getThrowable() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٬ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q.%ѱ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\u0019Gÿ\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SLjH\u0007p5J}\u0007TYX92", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]aHu\u000b\u0019Tq>ypO_\fNY\"\u0003K6>", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class InternalError extends CryptographyError {
        private final String errorMessage;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String str, Throwable th) {
            super(str, th, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = internalError.getErrorMessage();
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = internalError.getThrowable();
            }
            return internalError.copy(str, th);
        }

        public final String component1() {
            return getErrorMessage();
        }

        public final Throwable component2() {
            return getThrowable();
        }

        public final InternalError copy(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InternalError(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalError)) {
                return false;
            }
            InternalError internalError = (InternalError) obj;
            return Intrinsics.areEqual(getErrorMessage(), internalError.getErrorMessage()) && Intrinsics.areEqual(getThrowable(), internalError.getThrowable());
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return (getErrorMessage().hashCode() * 31) + (getThrowable() == null ? 0 : getThrowable().hashCode());
        }

        public String toString() {
            return "InternalError(errorMessage=" + getErrorMessage() + ", throwable=" + getThrowable() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٬ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q.%ѱ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\u0019Gÿ\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+SOk5\u0006I,bW#KSN+2", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]aHu\u000b\u0019Tt?fo(V$(u\u0019|A(>", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class LoadKeyFailed extends CryptographyError {
        private final String errorMessage;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadKeyFailed(String str, Throwable th) {
            super(str, th, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ LoadKeyFailed copy$default(LoadKeyFailed loadKeyFailed, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = loadKeyFailed.getErrorMessage();
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = loadKeyFailed.getThrowable();
            }
            return loadKeyFailed.copy(str, th);
        }

        public final String component1() {
            return getErrorMessage();
        }

        public final Throwable component2() {
            return getThrowable();
        }

        public final LoadKeyFailed copy(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoadKeyFailed(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadKeyFailed)) {
                return false;
            }
            LoadKeyFailed loadKeyFailed = (LoadKeyFailed) obj;
            return Intrinsics.areEqual(getErrorMessage(), loadKeyFailed.getErrorMessage()) && Intrinsics.areEqual(getThrowable(), loadKeyFailed.getThrowable());
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.ts.coresdk.crypto.api.CryptographyError
        public Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return (getErrorMessage().hashCode() * 31) + (getThrowable() == null ? 0 : getThrowable().hashCode());
        }

        public String toString() {
            return "LoadKeyFailed(errorMessage=" + getErrorMessage() + ", throwable=" + getThrowable() + ")";
        }
    }

    private CryptographyError(String str, Throwable th) {
        this.errorMessage = str;
        this.throwable = th;
    }

    public /* synthetic */ CryptographyError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }
}
