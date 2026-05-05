package com.transmit.authentication.network.startauth;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\u000enjG9LeN.ZS8\u0015s{:$aҗwYП\u0006\u001a,!Id^munb\\!B=\u0007&|x.aU'`ܫ\u00132Ps\b<[xU;vsd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014) ;Xphĥ=U\u000b\u001a \u0006V\"\u0017\u001d\u000bh~<Nlk<G#1l\tľ&(A\u000bY%F\u00034=|o,CBM4C$\u001aϟ\b\u001bbM\u0012Wqk\u0015/Ҿ&sP\u0002hNX.\u0015[ܗN]l\u0001(t\u0005\u007fcВ+1WҪcR\u0014-\u0006\u0001L\u001eJ\u0004&\b=G\\.բj\u000e\u0016ޗ\rtYG^\n\u07b2F\u0012"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+(tQ;J\u00046#\\]/\\[\u0002A\u0012\u000ei\u0012X4y\u0005gL.wR7t", "", "EdQ.h;A\\\u0013\rzl:\u0001\u00138_\u0004'", "", "1qT1X5MW\u0015\u0006tk,\t\u0019/s\u000f\"\u0006K\u0010\u001b!P}", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0017\u0014c+N\u007f6KHU\u0019\\^\u0003=\"!D\u0019]/\u0017\u000eg\u0017", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`V|\nE\u0005-9hG\u001cG|\u0019.VR?i0-\u0019rj\u0003\u0010c;`\u00014M\u0016\\;X_\u00029$!]W,8\r\u0004YJ3r@>\f\b8Y\u0002Iwj\u0017%\u0012?s~\u0018\u001a\u0001", "5dc\u0010e,=S\"\u000e~Z3v\u0016/q\u0010(\nOz!\"Vs\u0018E\u0005", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017QJgA-\u0011xp<PA9Nu'P[R(c?rI$\u0012h\u001d86\u001c\tcJ2D", "5dc$X):c(\u0002\u0004X:|\u0017=i\n1uD\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSStartAuthenticationResponse {
    private final CredentialRequestOptions credential_request_options;
    private final String webauthn_session_id;

    public TSStartAuthenticationResponse(String str, CredentialRequestOptions credential_request_options) {
        Intrinsics.checkNotNullParameter(credential_request_options, "credential_request_options");
        this.webauthn_session_id = str;
        this.credential_request_options = credential_request_options;
    }

    public static /* synthetic */ TSStartAuthenticationResponse copy$default(TSStartAuthenticationResponse tSStartAuthenticationResponse, String str, CredentialRequestOptions credentialRequestOptions, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = tSStartAuthenticationResponse.webauthn_session_id;
        }
        if ((i2 & 2) != 0) {
            credentialRequestOptions = tSStartAuthenticationResponse.credential_request_options;
        }
        return tSStartAuthenticationResponse.copy(str, credentialRequestOptions);
    }

    public final String component1() {
        return this.webauthn_session_id;
    }

    public final CredentialRequestOptions component2() {
        return this.credential_request_options;
    }

    public final TSStartAuthenticationResponse copy(String str, CredentialRequestOptions credential_request_options) {
        Intrinsics.checkNotNullParameter(credential_request_options, "credential_request_options");
        return new TSStartAuthenticationResponse(str, credential_request_options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSStartAuthenticationResponse)) {
            return false;
        }
        TSStartAuthenticationResponse tSStartAuthenticationResponse = (TSStartAuthenticationResponse) obj;
        return Intrinsics.areEqual(this.webauthn_session_id, tSStartAuthenticationResponse.webauthn_session_id) && Intrinsics.areEqual(this.credential_request_options, tSStartAuthenticationResponse.credential_request_options);
    }

    public final CredentialRequestOptions getCredential_request_options() {
        return this.credential_request_options;
    }

    public final String getWebauthn_session_id() {
        return this.webauthn_session_id;
    }

    public int hashCode() {
        String str = this.webauthn_session_id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.credential_request_options.hashCode();
    }

    public String toString() {
        return "TSStartAuthenticationResponse(webauthn_session_id=" + this.webauthn_session_id + ", credential_request_options=" + this.credential_request_options + ")";
    }
}
