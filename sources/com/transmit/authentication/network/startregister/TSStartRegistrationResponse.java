package com.transmit.authentication.network.startregister;

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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\u000enjG9LeN.ZS8\u0015s{:$aҗwYП\u0006\u001a,!Id^munb\\!B=\u0007&|x.aU'`ܫ\u00132Ps\b<[xU;vsd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014) ;Xphĥ=U\u000b\u001a \u0006V\"\u0017\u001d\u000bh~<Nlk<G#1l\tľ&(A\u000bY%F\u00034=|o,CBM4C$\u001aϟ\b\u001bbM\u0012Wqk\u0015/Ҿ&sP\u0002hNX.\u0015[ܗN]l\u0001(t\u0005\u007fcВ+1WҪcR\u0014-\u0006\u0001L\u001eJ\u0004&\b=G\\.բj\u000e\u0016ޗ\rtYG^\n\u07b2F\u0012"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eFA2yN@-\b\u0002", "", "EdQ.h;A\\\u0013\rzl:\u0001\u00138_\u0004'", "", "1qT1X5MW\u0015\u0006t\\9|\u0005>i\n1uJ\f&\u001bQx\u001c", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`V|\nE\u0005-9hG\u001cG|\u0019.VR?i0-\u0019rj\u0003\u0010c;`\u00014M\u0016\\;X_\u0002J\u0014\u0014^\u001c]+\u001aN7N$mD@.\f(P_Hh|\u001b\u001a\u0018>T{QZ\u001aP\bj92", "5dc\u0010e,=S\"\u000e~Z3v\u0007<e{7\u007fJ\n\u0011!R~\u0012F\u007f3", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017QJgA-\"hc=\u0015r,[@\u0005TLM,eav9\u001bog\u000eJ:\u0011\u000fb+/}HA(\u0016\u0002", "5dc$X):c(\u0002\u0004X:|\u0017=i\n1uD\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSStartRegistrationResponse {
    private final CredentialCreationOptions credential_creation_options;
    private final String webauthn_session_id;

    public TSStartRegistrationResponse(String str, CredentialCreationOptions credential_creation_options) {
        Intrinsics.checkNotNullParameter(credential_creation_options, "credential_creation_options");
        this.webauthn_session_id = str;
        this.credential_creation_options = credential_creation_options;
    }

    public static /* synthetic */ TSStartRegistrationResponse copy$default(TSStartRegistrationResponse tSStartRegistrationResponse, String str, CredentialCreationOptions credentialCreationOptions, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = tSStartRegistrationResponse.webauthn_session_id;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            credentialCreationOptions = tSStartRegistrationResponse.credential_creation_options;
        }
        return tSStartRegistrationResponse.copy(str, credentialCreationOptions);
    }

    public final String component1() {
        return this.webauthn_session_id;
    }

    public final CredentialCreationOptions component2() {
        return this.credential_creation_options;
    }

    public final TSStartRegistrationResponse copy(String str, CredentialCreationOptions credential_creation_options) {
        Intrinsics.checkNotNullParameter(credential_creation_options, "credential_creation_options");
        return new TSStartRegistrationResponse(str, credential_creation_options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSStartRegistrationResponse)) {
            return false;
        }
        TSStartRegistrationResponse tSStartRegistrationResponse = (TSStartRegistrationResponse) obj;
        return Intrinsics.areEqual(this.webauthn_session_id, tSStartRegistrationResponse.webauthn_session_id) && Intrinsics.areEqual(this.credential_creation_options, tSStartRegistrationResponse.credential_creation_options);
    }

    public final CredentialCreationOptions getCredential_creation_options() {
        return this.credential_creation_options;
    }

    public final String getWebauthn_session_id() {
        return this.webauthn_session_id;
    }

    public int hashCode() {
        String str = this.webauthn_session_id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.credential_creation_options.hashCode();
    }

    public String toString() {
        return "TSStartRegistrationResponse(webauthn_session_id=" + this.webauthn_session_id + ", credential_creation_options=" + this.credential_creation_options + ")";
    }
}
