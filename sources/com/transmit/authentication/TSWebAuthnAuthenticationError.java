package com.transmit.authentication;

import androidx.exifinterface.media.ExifInterface;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r#4\u0012}\u0018njO0Le^.ZS@\u000fs{J$c$\bCCU0}*\teNog\u0005Jb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012%2JoU3UoS9hҚ<:6݅R8(\u00049&3R\u001b\u0003\bQZ\u001c#BS\u0005OhMf\u000b\u001c\"\nL \u0019\u001e\u000bh^>Nlk<G%\u0019hpQϮc0\u000bQ]Ub'%v\u0010\u001fҋD==Ֆ=U\t\f`a\u0010\u0014MsU\u0007~&U.ʁw]>ݙ\u0018\u0016\u001b2]\u0015ơq2s\u001djz'CHm\u0003kq0K\u001cߧ\u007f2"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "", "3L", "", "Bv", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u0012@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!j", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "\u0011kX2a;'](_\u0005n5{", "\u0011qT1X5MW\u0015\u0006jg:\r\u0014:o\r7{?", "\u0011tbAb4\u001c`\u0019}zg;\u0001\u00056sh2\u000b.\u0011\"\"Q|\u001d<u", "\u0015d]2e(E>\u0015\r\td,\u0011h<r\n5", "\u0017mc2e5:Zx\f\bh9", "\u0017mc2e9N^(~y>9\n\u0013<", "\u001cdcDb9D3&\f\u0005k", "\u001cnA2Z0Lb\u0019\fz]\n\n\t.e\t7\u007f<\b%", "\u001e`b@j6KRv\fz],\u0006\u00183a\u00076dJ\u0010\u0005'Rz\u0018I\u0006%4", " d`BX:M1\u0015\b\u0004h;Y\t a\u0007,z<\u0010\u0017\u0016", "!C:\u001bb;\"\\\u001d\u000e~Z3\u0001\u001e/d", "#mTEc,<b\u0019}ir7|r0C\r(z@\n&\u001bCv", "#rT?6(GQ\u0019\u0006\u0002^+", "#rT?A6M4#\u000f\u0004]", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b@Q#|\u001ciqW/\u001c\tUH(\u0004D6t", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b;rL&\u001cg\u0014.8\u001a\u000ff\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b6{L\u0014\u001fc\nU\u000b\u001a\u0012cNy", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b4rF\u0014\u001fV\u00159'\u001b\u0013_A8NQD)\u0015\u0002", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b?rI$\u0012h\u001d,'\u0016\u000ecP\u0001n53&\f+E\u0011;gV", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB\u0001=!oV\u0017L+\u0014\fY@y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0\u0003K#\u001cbk[+\f\u0005bP(jKE\b\u0012;7\u0012Fs\u000b\u0019%\u000e4@", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b=nK\"$d\u001bM\t\u001a\u0005XA-}H3&\u0016\u0015S\u0011)x\f\u0017 \u001bDjo\u0018", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB{='\u001dZ\f]+\fsmL$XE\u0015,\b+I\u000bJl|\u0013k", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b;|*\u0014\u0014^\u001c]+\u001a\u0005X\u001f1nC7(\u00170E\tI>", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b6{L\u0014\u001fg\u001eY:\r\u00049N1xQ\r", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0\u007f=\u0013\u0012c\u001dR'\u0014tbO4yOA,\u0017,HW", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0yA\u0014\u001bivX:m\u000fiJ#D", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB\u0001=!zd\u001d/5\u001d\u000eX\u0017", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public abstract class TSWebAuthnAuthenticationError {
    private final String eM;
    private final Throwable tw;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0yA\u0014\u001bivX:m\u000fiJ#D", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class ClientNotFound extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientNotFound(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ ClientNotFound copy$default(ClientNotFound clientNotFound, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
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
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0\u007f=\u0013\u0012c\u001dR'\u0014tbO4yOA,\u0017,HW", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc ", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class CredentialUnsupported extends TSWebAuthnAuthenticationError {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final String f18226s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18227t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CredentialUnsupported(String s2, Throwable t2) {
            super(s2, t2, null);
            Intrinsics.checkNotNullParameter(s2, "s");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.f18226s = s2;
            this.f18227t = t2;
        }

        public static /* synthetic */ CredentialUnsupported copy$default(CredentialUnsupported credentialUnsupported, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = credentialUnsupported.f18226s;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = credentialUnsupported.f18227t;
            }
            return credentialUnsupported.copy(str, th);
        }

        public final String component1() {
            return this.f18226s;
        }

        public final Throwable component2() {
            return this.f18227t;
        }

        public final CredentialUnsupported copy(String s2, Throwable t2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new CredentialUnsupported(s2, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CredentialUnsupported)) {
                return false;
            }
            CredentialUnsupported credentialUnsupported = (CredentialUnsupported) obj;
            return Intrinsics.areEqual(this.f18226s, credentialUnsupported.f18226s) && Intrinsics.areEqual(this.f18227t, credentialUnsupported.f18227t);
        }

        public final String getS() {
            return this.f18226s;
        }

        public final Throwable getT() {
            return this.f18227t;
        }

        public int hashCode() {
            return (this.f18226s.hashCode() * 31) + this.f18227t.hashCode();
        }

        public String toString() {
            return "CredentialUnsupported(s=" + this.f18226s + ", t=" + this.f18227t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b0\u0003K#\u001cbk[+\f\u0005bP(jKE\b\u0012;7\u0012Fs\u000b\u0019%\u000e4@", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class CustomCredentialsNotSupported extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomCredentialsNotSupported(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ CustomCredentialsNotSupported copy$default(CustomCredentialsNotSupported customCredentialsNotSupported, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = customCredentialsNotSupported.message;
            }
            return customCredentialsNotSupported.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final CustomCredentialsNotSupported copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new CustomCredentialsNotSupported(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomCredentialsNotSupported) && Intrinsics.areEqual(this.message, ((CustomCredentialsNotSupported) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "CustomCredentialsNotSupported(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b4rF\u0014\u001fV\u00159'\u001b\u0013_A8NQD)\u0015\u0002", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class GeneralPasskeyError extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18228t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralPasskeyError(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18228t = t2;
        }

        public static /* synthetic */ GeneralPasskeyError copy$default(GeneralPasskeyError generalPasskeyError, String str, Throwable th, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = generalPasskeyError.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = generalPasskeyError.f18228t;
            }
            return generalPasskeyError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18228t;
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
            return Intrinsics.areEqual(this.message, generalPasskeyError.message) && Intrinsics.areEqual(this.f18228t, generalPasskeyError.f18228t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18228t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18228t.hashCode();
        }

        public String toString() {
            return "GeneralPasskeyError(message=" + this.message + ", t=" + this.f18228t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz4OU\u0007_*\u0011HA\u001eBݯQoK=){D\u000e82P9@ە\u0002b3V\u001a\u000f|YJ:\u0015vВq\u0003o\u001bX\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0003y\u001eYMg;#3k\u0005\u001dQ\nNIԡr\u0006\fv7?+w\u0005\u001e\u0383WH\u001b#=g\r\fslٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\t\u001c\fwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0002o>ж)\u0013"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b6{L\u0014\u001fc\nU\u000b\u001a\u0012cNy", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class InternalError extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18229t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.f18229t = th;
        }

        public /* synthetic */ InternalError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 + 2) - (i2 | 2) != 0 ? null : th);
        }

        public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = internalError.message;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = internalError.f18229t;
            }
            return internalError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18229t;
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
            return Intrinsics.areEqual(this.message, internalError.message) && Intrinsics.areEqual(this.f18229t, internalError.f18229t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18229t;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.f18229t;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "InternalError(message=" + this.message + ", t=" + this.f18229t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b6{L\u0014\u001fg\u001eY:\r\u00049N1xQ\r", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc ", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class InterruptedError extends TSWebAuthnAuthenticationError {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final String f18230s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18231t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterruptedError(String s2, Throwable t2) {
            super(s2, t2, null);
            Intrinsics.checkNotNullParameter(s2, "s");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.f18230s = s2;
            this.f18231t = t2;
        }

        public static /* synthetic */ InterruptedError copy$default(InterruptedError interruptedError, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = interruptedError.f18230s;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = interruptedError.f18231t;
            }
            return interruptedError.copy(str, th);
        }

        public final String component1() {
            return this.f18230s;
        }

        public final Throwable component2() {
            return this.f18231t;
        }

        public final InterruptedError copy(String s2, Throwable t2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            Intrinsics.checkNotNullParameter(t2, "t");
            return new InterruptedError(s2, t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterruptedError)) {
                return false;
            }
            InterruptedError interruptedError = (InterruptedError) obj;
            return Intrinsics.areEqual(this.f18230s, interruptedError.f18230s) && Intrinsics.areEqual(this.f18231t, interruptedError.f18231t);
        }

        public final String getS() {
            return this.f18230s;
        }

        public final Throwable getT() {
            return this.f18231t;
        }

        public int hashCode() {
            return (this.f18230s.hashCode() * 31) + this.f18231t.hashCode();
        }

        public String toString() {
            return "InterruptedError(s=" + this.f18230s + ", t=" + this.f18231t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz4OU\u0007_*\u0011HA\u001eBݯQoK=){D\u000e82P9@ە\u0002b3V\u001a\u000f|YJ:\u0015vВq\u0003o\u001bX\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0003y\u001eYMg;#3k\u0005\u001dQ\nNIԡr\u0006\fv7?+w\u0005\u001e\u0383WH\u001b#=g\r\fslٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\t\u001c\fwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0002o>ж)\u0013"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b;rL&\u001cg\u0014.8\u001a\u000ff\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class NetworkError extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18232t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.f18232t = th;
        }

        public /* synthetic */ NetworkError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : th);
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = networkError.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = networkError.f18232t;
            }
            return networkError.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18232t;
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
            return Intrinsics.areEqual(this.message, networkError.message) && Intrinsics.areEqual(this.f18232t, networkError.f18232t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18232t;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.f18232t;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "NetworkError(message=" + this.message + ", t=" + this.f18232t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b;|*\u0014\u0014^\u001c]+\u001a\u0005X\u001f1nC7(\u00170E\tI>", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class NoRegisteredCredentials extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoRegisteredCredentials(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ NoRegisteredCredentials copy$default(NoRegisteredCredentials noRegisteredCredentials, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = noRegisteredCredentials.message;
            }
            return noRegisteredCredentials.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final NoRegisteredCredentials copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new NoRegisteredCredentials(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoRegisteredCredentials) && Intrinsics.areEqual(this.message, ((NoRegisteredCredentials) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "NoRegisteredCredentials(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b=nK\"$d\u001bM\t\u001a\u0005XA-}H3&\u0016\u0015S\u0011)x\f\u0017 \u001bDjo\u0018", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class PasswordCredentialsNotSupported extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasswordCredentialsNotSupported(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ PasswordCredentialsNotSupported copy$default(PasswordCredentialsNotSupported passwordCredentialsNotSupported, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = passwordCredentialsNotSupported.message;
            }
            return passwordCredentialsNotSupported.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final PasswordCredentialsNotSupported copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new PasswordCredentialsNotSupported(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasswordCredentialsNotSupported) && Intrinsics.areEqual(this.message, ((PasswordCredentialsNotSupported) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "PasswordCredentialsNotSupported(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b?rI$\u0012h\u001d,'\u0016\u000ecP\u0001n53&\f+E\u0011;gV", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class RequestCannotBeValidated extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18233t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCannotBeValidated(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18233t = t2;
        }

        public static /* synthetic */ RequestCannotBeValidated copy$default(RequestCannotBeValidated requestCannotBeValidated, String str, Throwable th, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = requestCannotBeValidated.message;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = requestCannotBeValidated.f18233t;
            }
            return requestCannotBeValidated.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18233t;
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
            return Intrinsics.areEqual(this.message, requestCannotBeValidated.message) && Intrinsics.areEqual(this.f18233t, requestCannotBeValidated.f18233t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18233t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18233t.hashCode();
        }

        public String toString() {
            return "RequestCannotBeValidated(message=" + this.message + ", t=" + this.f18233t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001b@Q#|\u001ciqW/\u001c\tUH(\u0004D6t", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class SDKNotInitialized extends TSWebAuthnAuthenticationError {
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
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB{='\u001dZ\f]+\fsmL$XE\u0015,\b+I\u000bJl|\u0013k", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UnexpectedTypeOfCredential extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedTypeOfCredential(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ UnexpectedTypeOfCredential copy$default(UnexpectedTypeOfCredential unexpectedTypeOfCredential, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = unexpectedTypeOfCredential.message;
            }
            return unexpectedTypeOfCredential.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UnexpectedTypeOfCredential copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UnexpectedTypeOfCredential(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedTypeOfCredential) && Intrinsics.areEqual(this.message, ((UnexpectedTypeOfCredential) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UnexpectedTypeOfCredential(message=" + this.message + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r#4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCA٬ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?eD[ɃTK\u000e`kW\u0003m\u0003\u0004\u07b2go.9[\fWdYFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB\u0001=!oV\u0017L+\u0014\fY@y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "B", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UserCancelled extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18234t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCancelled(String message, Throwable t2) {
            super(message, t2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.message = message;
            this.f18234t = t2;
        }

        public static /* synthetic */ UserCancelled copy$default(UserCancelled userCancelled, String str, Throwable th, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = userCancelled.message;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                th = userCancelled.f18234t;
            }
            return userCancelled.copy(str, th);
        }

        public final String component1() {
            return this.message;
        }

        public final Throwable component2() {
            return this.f18234t;
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
            return Intrinsics.areEqual(this.message, userCancelled.message) && Intrinsics.areEqual(this.f18234t, userCancelled.f18234t);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getT() {
            return this.f18234t;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.f18234t.hashCode();
        }

        public String toString() {
            return "UserCancelled(message=" + this.message + ", t=" + this.f18234t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2\u000fq{:Ša:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Nmx\f\u0013U̷C8PAS\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tJc\f@8pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^}\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007ӳuK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX9\u001bB\u0001=!zd\u001d/5\u001d\u000eX\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class UserNotFound extends TSWebAuthnAuthenticationError {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserNotFound(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
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

    private TSWebAuthnAuthenticationError(String str, Throwable th) {
        this.eM = str;
        this.tw = th;
    }

    public /* synthetic */ TSWebAuthnAuthenticationError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 + 2) - (i2 | 2) != 0 ? null : th, null);
    }

    public /* synthetic */ TSWebAuthnAuthenticationError(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public final String getEM() {
        return this.eM;
    }

    public final Throwable getTw() {
        return this.tw;
    }
}
