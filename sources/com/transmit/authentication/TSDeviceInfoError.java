package com.transmit.authentication;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r#4\u0012}\u000enjO0Le^.ZS@\u000fs{J$cҕwxQ٥J}P\b\bPpqyV\u001b\"I\u0011\u0016\u001a\u0007jDI\u0004ym\u0018\u001d4ZqU2{rެ=`\u0003:U/@\"Py3\u0002ʀ.N\u0018͌\u0013EQ\u0011 6\u0011\u0002HT%O\u001b\u0019@\ţ$\u0007&ձ\u007fP<Ozeƀ.%\u0010wQ^ϴcA"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", "", "3qa<e\u0014>a'z|^", "", "Bga<j(;Z\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc![9He\u0015{\u0002^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "\u0015d]2e(MSw~\fb*|n/y_5\tJ\u000e", "\u0017mc2e5:Zx\f\bh9", "\u001anP17,OW\u0017~`^@\\\u0016<o\r", "!C:\u001bb;\"\\\u001d\u000e~Z3\u0001\u001e/d", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu \u001d\u0010r,[\u007f#N,[9f_H", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu \u001b\u0007l,[r6G+N=`Pr#\u0014&:\u001b[5\u001aZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu  \u0011_+-v8KJN\u0012\\fRJ!\u001cgc", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu 'eI\u0015X\u0006\u000bPP]0XYvR\u0014\u00110", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public abstract class TSDeviceInfoError {
    private final String errorMessage;
    private final Throwable throwable;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu \u001b\u0007l,[r6G+N=`Pr#\u0014&:\u001b[5\u001aZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class GenerateDeviceKeyError extends TSDeviceInfoError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenerateDeviceKeyError(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ GenerateDeviceKeyError copy$default(GenerateDeviceKeyError generateDeviceKeyError, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = generateDeviceKeyError.message;
            }
            return generateDeviceKeyError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final GenerateDeviceKeyError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new GenerateDeviceKeyError(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenerateDeviceKeyError) && Intrinsics.areEqual(this.message, ((GenerateDeviceKeyError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "GenerateDeviceKeyError(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0004Z^\u0019C'\u0006Dyz2WW\u0011_(\u000e`EņC3[s\u0006@n}N\u0005N3hهzM\n(4`\u0012\ryqNRܼ1\t\u000eH]%M3܅B\fD \u000f\u001etg|7xtc:=%\u001bkXMUbvƮLUWb3%v\u0010+[FEC-'i\u00025a\"Ё\u0004\bxK\u0015\u0001'U<\u0010\u05ecV~_\u000e&-+}\u000e$ō%-\u0014_`$'YPӍOV\u0016ߊ\u0010|\u0002\u0012J\n^\u00175JF/0e6\u0011\u07baxx[óh\u0004dI\u000e\u0003ˑ:*"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu \u001d\u0010r,[\u007f#N,[9f_H", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class InternalError extends TSDeviceInfoError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18225t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.f18225t = th;
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = internalError.message;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = internalError.f18225t;
            }
            return internalError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18225t;
        }

        public final InternalError copy(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new InternalError(message, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalError)) {
                return false;
            }
            InternalError internalError = (InternalError) obj;
            return Intrinsics.areEqual(this.message, internalError.message) && Intrinsics.areEqual(this.f18225t, internalError.f18225t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18225t;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.f18225t;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "InternalError(message=" + this.message + ", t=" + this.f18225t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu  \u0011_+-v8KJN\u0012\\fRJ!\u001cgc", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class LoadDeviceKeyError extends TSDeviceInfoError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDeviceKeyError(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ LoadDeviceKeyError copy$default(LoadDeviceKeyError loadDeviceKeyError, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loadDeviceKeyError.message;
            }
            return loadDeviceKeyError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final LoadDeviceKeyError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new LoadDeviceKeyError(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadDeviceKeyError) && Intrinsics.areEqual(this.message, ((LoadDeviceKeyError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "LoadDeviceKeyError(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu 'eI\u0015X\u0006\u000bPP]0XYvR\u0014\u00110", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class SDKNotInitialized extends TSDeviceInfoError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SDKNotInitialized(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ SDKNotInitialized copy$default(SDKNotInitialized sDKNotInitialized, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = sDKNotInitialized.message;
            }
            return sDKNotInitialized.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final SDKNotInitialized copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new SDKNotInitialized(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SDKNotInitialized) && Intrinsics.areEqual(this.message, ((SDKNotInitialized) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "SDKNotInitialized(message=" + this.message + ")";
        }
    }

    private TSDeviceInfoError(String str, Throwable th) {
        this.errorMessage = str;
        this.throwable = th;
    }

    public /* synthetic */ TSDeviceInfoError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
