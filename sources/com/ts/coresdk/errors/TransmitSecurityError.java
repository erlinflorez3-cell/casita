package com.ts.coresdk.errors;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0006FLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?0LeV\u008cX\t@ş\u001c{b-\u0014&pC<WZ\u0005(\u000bҊRimuXbŒB\u0011\t\u001a}p"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+j", "\u0011n];X*MW#\bZk9\u0007\u0016", "\u0012hb.U3>R", "\u0017mc2e5:Zx\f\bh9", "\u001cnc h7I]&\u000ez]\bz\u00183o\t\b\tM\u000b$", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SFkB\u0010c*]z1P,[9f_H", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SGeG\u0003`3Nu|", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SLjH\u0007p5J}\u0007TYX92", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SQkHts7Y\u00014VLM\bZavG\u001dqg\u001bX8b", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class TransmitSecurityError {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bebʴ-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SFkB\u0010c*]z1P,[9f_H", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019kX4\u0016\u0005WP(xM\u0017,\u00156VW", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class ConnectionError extends TransmitSecurityError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionError(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public static /* synthetic */ ConnectionError copy$default(ConnectionError connectionError, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = connectionError.errorMessage;
            }
            return connectionError.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final ConnectionError copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ConnectionError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectionError) && Intrinsics.areEqual(this.errorMessage, ((ConnectionError) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "ConnectionError(errorMessage=" + this.errorMessage + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bebʴ-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SGeG\u0003`3Nu|", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019lR9\t\u0002`A#D", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Disabled extends TransmitSecurityError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disabled(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public static /* synthetic */ Disabled copy$default(Disabled disabled, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = disabled.errorMessage;
            }
            return disabled.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Disabled copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Disabled(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Disabled) && Intrinsics.areEqual(this.errorMessage, ((Disabled) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Disabled(errorMessage=" + this.errorMessage + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bebʴ-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SLjH\u0007p5J}\u0007TYX92", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019qW:\r\u0012b=+NQD)\u0015\u0002", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class InternalError extends TransmitSecurityError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = internalError.errorMessage;
            }
            return internalError.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final InternalError copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InternalError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternalError) && Intrinsics.areEqual(this.errorMessage, ((InternalError) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "InternalError(errorMessage=" + this.errorMessage + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bebʴ-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SQkHts7Y\u00014VLM\bZavG\u001dqg\u001bX8b", "", "3qa<e\u0014>a'z|^", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019vX:z\u0015dL.{S7\u001ec*X\u0006Eq`\u0019#\u0018B@", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+j"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class NotSupportedActionError extends TransmitSecurityError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotSupportedActionError(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public static /* synthetic */ NotSupportedActionError copy$default(NotSupportedActionError notSupportedActionError, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = notSupportedActionError.errorMessage;
            }
            return notSupportedActionError.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final NotSupportedActionError copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NotSupportedActionError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotSupportedActionError) && Intrinsics.areEqual(this.errorMessage, ((NotSupportedActionError) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "NotSupportedActionError(errorMessage=" + this.errorMessage + ")";
        }
    }

    private TransmitSecurityError() {
    }

    public /* synthetic */ TransmitSecurityError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
