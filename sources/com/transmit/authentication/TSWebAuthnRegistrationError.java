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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r#4\u0012}\u0016njO0Le^.ZS@\u000fs{J$c$\bCCU0}*\teNog\u0005Jb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012%2JģEhcڎm9\u000fsn\u000f)<-D\u0007\u0013\u0010*;Z#\u000b;ZQ\u000e\"4NpRR;N\u0015  \bV\"\u0017\u001d\u000bjߑ:Hza\u000b>1\u0003\u0002B|(ۢ4\u0003Uε^V-\u0012\u0005gn<N9M\u0017;R1\nқ_E\u000bӊ\n?\u000bo5/ǥH}lLo\u0018-/Fk*{\u0012Fف\tr"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "", "3L", "", "Bv", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u0012@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!j", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "\u0011kX2a;'](_\u0005n5{", "\u0011qT.g,\u001c`\u0019}zg;\u0001\u00056sc1\u000b@\u000e$'R~\u000e;", "\u0015d]2e(E>\u0015\r\td,\u0011h<r\n5", "\u0017mc2e5:Zx\f\bh9", "\u001cdcDb9D3&\f\u0005k", "\u001eq^C\\+>`v\t\u0004_0~\u0019<a\u000f,\u0006I`$$Q|", " dV6f;KO(\u0003\u0005g\u001c\u000b\t<n{0{(\u0005%\u001fC~\f?", " d`BX:M1\u0015\b\u0004h;Y\t a\u0007,z<\u0010\u0017\u0016", "!C:\u001bb;\"\\\u001d\u000e~Z3\u0001\u001e/d", "#rT?6(GQ\u0019\u0006\u0002^+", "#rT?<+&W'\u0007vm*\u007f", "#rT?A6M4#\u000f\u0004]", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001a;8[G#uc\u0012]/\t\f]V$m\u001a", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0015\\a\u0005G!\u0018:\u001b[5\u001aZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0010earJ\u001d\u000eam[8\u0017\u0012/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u000e\\[rJ\u0010\u0019E\n\\9\u0013\u0005m!1{NDt", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0019\\^\u0003=\"!8\nW4\u0017\u00146A\u0015jK;\u001e\u0004;I\u0001\u0011", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f\u001b\u0010\u001bX\u000eU2\r\u0004/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\niRnL\u0014og\u000eM+\u0016\u0014]=+|(@.\b9V\u0012Fw\u0001\u000bk", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0017i\\\u0004A\u0013\u0012gkX4\u000e\t[Q1jS;)\u0011\fV\u000fEuV", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\ncVrF#zd\u001d/5\u001d\u000eX\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f&\u001e!;\u0018^4\fZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0019\\TvK#\u001fV\u001dR5\u0016tgA1w@?\u001fo0W\n7w~\u000fk", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f!\u0013y^\u001cV'\u001c\u0003\\\u0017", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public abstract class TSWebAuthnRegistrationError {
    private final String eM;
    private final Throwable tw;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\ncVrF#zd\u001d/5\u001d\u000eX\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class ClientNotFound extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientNotFound(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ ClientNotFound copy$default(ClientNotFound clientNotFound, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = clientNotFound.message;
            }
            return clientNotFound.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ClientNotFound copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ClientNotFound(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientNotFound) && Intrinsics.areEqual(this.message, ((ClientNotFound) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ClientNotFound(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\niRnL\u0014og\u000eM+\u0016\u0014]=+|(@.\b9V\u0012Fw\u0001\u000bk", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class CreateCredentialsInterrupted extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18235t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateCredentialsInterrupted(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18235t = t2;
        }

        public static /* synthetic */ CreateCredentialsInterrupted copy$default(CreateCredentialsInterrupted createCredentialsInterrupted, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = createCredentialsInterrupted.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = createCredentialsInterrupted.f18235t;
            }
            return createCredentialsInterrupted.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18235t;
        }

        public final CreateCredentialsInterrupted copy(String message, Throwable t2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new CreateCredentialsInterrupted(message, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateCredentialsInterrupted)) {
                return false;
            }
            CreateCredentialsInterrupted createCredentialsInterrupted = (CreateCredentialsInterrupted) obj;
            return Intrinsics.areEqual(this.message, createCredentialsInterrupted.message) && Intrinsics.areEqual(this.f18235t, createCredentialsInterrupted.f18235t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18235t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18235t.hashCode();
        }

        public String toString() {
            return "CreateCredentialsInterrupted(message=" + this.message + ", t=" + this.f18235t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u000e\\[rJ\u0010\u0019E\n\\9\u0013\u0005m!1{NDt", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class GeneralPasskeyError extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18236t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralPasskeyError(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18236t = t2;
        }

        public static /* synthetic */ GeneralPasskeyError copy$default(GeneralPasskeyError generalPasskeyError, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = generalPasskeyError.message;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = generalPasskeyError.f18236t;
            }
            return generalPasskeyError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18236t;
        }

        public final GeneralPasskeyError copy(String message, Throwable t2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new GeneralPasskeyError(message, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralPasskeyError)) {
                return false;
            }
            GeneralPasskeyError generalPasskeyError = (GeneralPasskeyError) obj;
            return Intrinsics.areEqual(this.message, generalPasskeyError.message) && Intrinsics.areEqual(this.f18236t, generalPasskeyError.f18236t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18236t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18236t.hashCode();
        }

        public String toString() {
            return "GeneralPasskeyError(message=" + this.message + ", t=" + this.f18236t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz4OU\u0007_*\u0011HA\u001eBݯQoK=){D\u000e82P9@ە\u0002b3V\u001a\u000f|YJ:\u0015vВq\u0003o\u001bX\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0003y\u001eYMg;#3k\u0005\u001dQ\nNIԡr\u0006\fv7?+w\u0005\u001e\u0383WH\u001b#=g\r\fslٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\t\u001c\fwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0002o>ж)\u0013"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0010earJ\u001d\u000eam[8\u0017\u0012/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class InternalError extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18237t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.f18237t = th;
        }

        public /* synthetic */ InternalError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 + 2) - (i2 | 2) != 0 ? null : th);
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, Throwable th, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = internalError.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = internalError.f18237t;
            }
            return internalError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18237t;
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
            return Intrinsics.areEqual(this.message, internalError.message) && Intrinsics.areEqual(this.f18237t, internalError.f18237t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18237t;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.f18237t;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "InternalError(message=" + this.message + ", t=" + this.f18237t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz4OU\u0007_*\u0011HA\u001eBݯQoK=){D\u000e82P9@ە\u0002b3V\u001a\u000f|YJ:\u0015vВq\u0003o\u001bX\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0003y\u001eYMg;#3k\u0005\u001dQ\nNIԡr\u0006\fv7?+w\u0005\u001e\u0383WH\u001b#=g\r\fslٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\t\u001c\fwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0002o>ж)\u0013"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0015\\a\u0005G!\u0018:\u001b[5\u001aZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class NetworkError extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18238t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.f18238t = th;
        }

        public /* synthetic */ NetworkError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : th);
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = networkError.message;
            }
            if ((i2 & 2) != 0) {
                th = networkError.f18238t;
            }
            return networkError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18238t;
        }

        public final NetworkError copy(String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new NetworkError(message, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkError)) {
                return false;
            }
            NetworkError networkError = (NetworkError) obj;
            return Intrinsics.areEqual(this.message, networkError.message) && Intrinsics.areEqual(this.f18238t, networkError.f18238t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18238t;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.f18238t;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "NetworkError(message=" + this.message + ", t=" + this.f18238t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0017i\\\u0004A\u0013\u0012gkX4\u000e\t[Q1jS;)\u0011\fV\u000fEuV", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class ProviderConfigurationError extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18239t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderConfigurationError(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18239t = t2;
        }

        public static /* synthetic */ ProviderConfigurationError copy$default(ProviderConfigurationError providerConfigurationError, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = providerConfigurationError.message;
            }
            if ((i2 & 2) != 0) {
                th = providerConfigurationError.f18239t;
            }
            return providerConfigurationError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18239t;
        }

        public final ProviderConfigurationError copy(String message, Throwable t2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new ProviderConfigurationError(message, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderConfigurationError)) {
                return false;
            }
            ProviderConfigurationError providerConfigurationError = (ProviderConfigurationError) obj;
            return Intrinsics.areEqual(this.message, providerConfigurationError.message) && Intrinsics.areEqual(this.f18239t, providerConfigurationError.f18239t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18239t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18239t.hashCode();
        }

        public String toString() {
            return "ProviderConfigurationError(message=" + this.message + ", t=" + this.f18239t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0019\\TvK#\u001fV\u001dR5\u0016tgA1w@?\u001fo0W\n7w~\u000fk", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class RegistrationUsernameMismatch extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegistrationUsernameMismatch(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ RegistrationUsernameMismatch copy$default(RegistrationUsernameMismatch registrationUsernameMismatch, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = registrationUsernameMismatch.message;
            }
            return registrationUsernameMismatch.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final RegistrationUsernameMismatch copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new RegistrationUsernameMismatch(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegistrationUsernameMismatch) && Intrinsics.areEqual(this.message, ((RegistrationUsernameMismatch) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "RegistrationUsernameMismatch(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u0019\\^\u0003=\"!8\nW4\u0017\u00146A\u0015jK;\u001e\u0004;I\u0001\u0011", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class RequestCannotBeValidated extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18240t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCannotBeValidated(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18240t = t2;
        }

        public static /* synthetic */ RequestCannotBeValidated copy$default(RequestCannotBeValidated requestCannotBeValidated, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = requestCannotBeValidated.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = requestCannotBeValidated.f18240t;
            }
            return requestCannotBeValidated.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18240t;
        }

        public final RequestCannotBeValidated copy(String message, Throwable t2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new RequestCannotBeValidated(message, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestCannotBeValidated)) {
                return false;
            }
            RequestCannotBeValidated requestCannotBeValidated = (RequestCannotBeValidated) obj;
            return Intrinsics.areEqual(this.message, requestCannotBeValidated.message) && Intrinsics.areEqual(this.f18240t, requestCannotBeValidated.f18240t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18240t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18240t.hashCode();
        }

        public String toString() {
            return "RequestCannotBeValidated(message=" + this.message + ", t=" + this.f18240t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001a;8[G#uc\u0012]/\t\f]V$m\u001a", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class SDKNotInitialized extends TSWebAuthnRegistrationError {
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

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f\u001b\u0010\u001bX\u000eU2\r\u0004/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UserCancelled extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18241t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCancelled(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18241t = t2;
        }

        public static /* synthetic */ UserCancelled copy$default(UserCancelled userCancelled, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = userCancelled.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = userCancelled.f18241t;
            }
            return userCancelled.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18241t;
        }

        public final UserCancelled copy(String message, Throwable t2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new UserCancelled(message, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserCancelled)) {
                return false;
            }
            UserCancelled userCancelled = (UserCancelled) obj;
            return Intrinsics.areEqual(this.message, userCancelled.message) && Intrinsics.areEqual(this.f18241t, userCancelled.f18241t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18241t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18241t.hashCode();
        }

        public String toString() {
            return "UserCancelled(message=" + this.message + ", t=" + this.f18241t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f!\u0013y^\u001cV'\u001c\u0003\\\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UserIdMismatch extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserIdMismatch(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ UserIdMismatch copy$default(UserIdMismatch userIdMismatch, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = userIdMismatch.message;
            }
            return userIdMismatch.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UserIdMismatch copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UserIdMismatch(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserIdMismatch) && Intrinsics.areEqual(this.message, ((UserIdMismatch) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UserIdMismatch(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY\r\u001cjR\u007f&\u001e!;\u0018^4\fZ", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UserNotFound extends TSWebAuthnRegistrationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserNotFound(String message) {
            super(message, null, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ UserNotFound copy$default(UserNotFound userNotFound, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = userNotFound.message;
            }
            return userNotFound.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UserNotFound copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UserNotFound(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserNotFound) && Intrinsics.areEqual(this.message, ((UserNotFound) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UserNotFound(message=" + this.message + ")";
        }
    }

    private TSWebAuthnRegistrationError(String str, Throwable th) {
        this.eM = str;
        this.tw = th;
    }

    public /* synthetic */ TSWebAuthnRegistrationError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public final String getEM() {
        return this.eM;
    }

    public final Throwable getTw() {
        return this.tw;
    }
}
