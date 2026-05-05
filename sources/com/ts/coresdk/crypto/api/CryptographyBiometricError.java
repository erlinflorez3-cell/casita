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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0006KLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS@\u000fs{J$c$\bCCU(Ԃ(~eȞ\u0018g\u001d[\u0013\u0012B\u000f\u0007\u0018{n1O\\ޏ\\\u0019\u0017;LzK@[~M"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|", "\u0010h^:X;KW\u0017^\bk6\nk!U\t$\r<\u0005\u001e\u0013Dv\u000e", "\u0010h^:X;KW\u0017^\bk6\nq9H{5zR|$\u0017", "\u0010h^:X;KW\u0017^\bk6\nq9n_1\tJ\b\u001e\u0017F", "\u0010h^:X;KW\u0017^\bk6\nv/c\u00105\u007fO\u0015\u0007\"Fk\u001d<c%Ai\u0002-7l", "\u0010h^:X;KW\u0017^\bk6\nv>a\u000f8\n0\n\u001d Q\u0002\u0017", "\u0010h^:X;KW\u0017^\bk6\nx8s\u00103\u0007J\u000e&\u0017F", "\u0015d]2e(MS~~\u000f?(\u0001\u0010/d", "\u0017mc2e5:Zx\f\bh9", "\u001anP1>,R4\u0015\u0003\u0002^+", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8ovIJ \u007f@;&\u0004)P\u0002\u0011", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8u\u000f<=1mV3,\b\u0002", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8u\u000fb!-{N>&\b+\u001f", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8z\u0005WQ1rSK\u000f\u0013+E\u0011;U\u0001\u0018&\u0012Bjo\u0018", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8z\u0014UP4|4@%\u00116[\u000b\u0011", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8|\u000egQ/yND.\b+\u001f", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e)LW,iN\u0002=y\u0012nnJ/\u0014\u0005X\u0017", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e+U],i[nDs\u001fg\u0018[\u0001", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e.VJ+BR\u0007\u001e\u0010\u0016a\u000eM\u0001", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface CryptographyBiometricError {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8ovIJ \u007f@;&\u0004)P\u0002\u0011", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorHWUnavailable implements CryptographyBiometricError {
        public static final BiometricErrorHWUnavailable INSTANCE = new BiometricErrorHWUnavailable();

        private BiometricErrorHWUnavailable() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8u\u000f<=1mV3,\b\u0002", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorNoHardware implements CryptographyBiometricError {
        public static final BiometricErrorNoHardware INSTANCE = new BiometricErrorNoHardware();

        private BiometricErrorNoHardware() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8u\u000fb!-{N>&\b+\u001f", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorNonEnrolled implements CryptographyBiometricError {
        public static final BiometricErrorNonEnrolled INSTANCE = new BiometricErrorNonEnrolled();

        private BiometricErrorNonEnrolled() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8z\u0005WQ1rSK\u000f\u0013+E\u0011;U\u0001\u0018&\u0012Bjo\u0018", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorSecurityUpdateRequired implements CryptographyBiometricError {
        public static final BiometricErrorSecurityUpdateRequired INSTANCE = new BiometricErrorSecurityUpdateRequired();

        private BiometricErrorSecurityUpdateRequired() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8z\u0014UP4|4@%\u00116[\u000b\u0011", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorStatusUnknown implements CryptographyBiometricError {
        public static final BiometricErrorStatusUnknown INSTANCE = new BiometricErrorStatusUnknown();

        private BiometricErrorStatusUnknown() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڒ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e$PX4\\a\u007fA\u0012qg\u001bX8|\u000egQ/yND.\b+\u001f", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class BiometricErrorUnsupported implements CryptographyBiometricError {
        public static final BiometricErrorUnsupported INSTANCE = new BiometricErrorUnsupported();

        private BiometricErrorUnsupported() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٭ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q\u001e%ѡ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\tGï\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e)LW,iN\u0002=y\u0012nnJ/\u0014\u0005X\u0017", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]^?r\t\f%\u001b9hPOc\u001aT8vuJ)uBh__GU&^.k\f^r", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class GenerateKeyFailed implements CryptographyBiometricError {
        private final String errorMessage;
        private final Throwable throwable;

        public GenerateKeyFailed(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ GenerateKeyFailed copy$default(GenerateKeyFailed generateKeyFailed, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = generateKeyFailed.errorMessage;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = generateKeyFailed.throwable;
            }
            return generateKeyFailed.copy(str, th);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Throwable component2() {
            return this.throwable;
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
            return Intrinsics.areEqual(this.errorMessage, generateKeyFailed.errorMessage) && Intrinsics.areEqual(this.throwable, generateKeyFailed.throwable);
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
            return "GenerateKeyFailed(errorMessage=" + this.errorMessage + ", throwable=" + this.throwable + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٭ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q\u001e%ѡ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\tGï\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e+U],i[nDs\u001fg\u0018[\u0001", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]^?r\t\f%\u001b9hPOc\u001aT8x~P)uOUfYTNOo\u007f", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class InternalError implements CryptographyBiometricError {
        private final String errorMessage;
        private final Throwable throwable;

        public InternalError(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, Throwable th, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = internalError.errorMessage;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = internalError.throwable;
            }
            return internalError.copy(str, th);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Throwable component2() {
            return this.throwable;
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
            return Intrinsics.areEqual(this.errorMessage, internalError.errorMessage) && Intrinsics.areEqual(this.throwable, internalError.throwable);
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
            return "InternalError(errorMessage=" + this.errorMessage + ", throwable=" + this.throwable + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٭ \u0014̝9O|\u0001(\u0006Z^\u0019N'\u0006Dwz2Wa\u0011_(\u000e`FņC5S\u0007KQ)\u0003D\u000e82P7@ۖ\u0002ʀ.J\u0016\u007f\tF\u0014\u001c :XrPQ;QKݍ\u0013ĂB\"\u0007(jo\u0017ZVyu:]݊3oHN5jH|{\fv\\-\r\u0005m6-V6c\u0019kڍ\u0002\u07baV]E\u0010M\u007f\u0006\u001dv8?+w\u0004\b<f\u000b,\u0017AN;l9ͽ]ԇUb\u001289a,Y^\"@w)\u000fSʴ\u0003؝\n)NB;//\u0016\u001cI\rr\u0002?\u0017ٴ]۰\u0004|gL%(PK993f\u007f`q\u001e%ѡ}˿\u0011(+\u0003t!iU&b\u001b\u001dbz\"K_EUJd\t\bA$\tGï\u0004ò\b:O\u00025\u0001\u001f4/'=bG+"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004e.VJ+BR\u0007\u001e\u0010\u0016a\u000eM\u0001", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "Bga<j(;Z\u0019", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtj\u0012mL3xFD\u001b\u0013/]^?r\t\f%\u001b9hPOc\u001aT8{\u007f=(NFm@uKHEa\u007f", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class LoadKeyFailed implements CryptographyBiometricError {
        private final String errorMessage;
        private final Throwable throwable;

        public LoadKeyFailed(String str, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.throwable = th;
        }

        public static /* synthetic */ LoadKeyFailed copy$default(LoadKeyFailed loadKeyFailed, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = loadKeyFailed.errorMessage;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = loadKeyFailed.throwable;
            }
            return loadKeyFailed.copy(str, th);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Throwable component2() {
            return this.throwable;
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
            return Intrinsics.areEqual(this.errorMessage, loadKeyFailed.errorMessage) && Intrinsics.areEqual(this.throwable, loadKeyFailed.throwable);
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
            return "LoadKeyFailed(errorMessage=" + this.errorMessage + ", throwable=" + this.throwable + ")";
        }
    }
}
