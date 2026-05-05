package com.transmit.authentication.network.completereg;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007lsA0RnP.XS2\u000fy\u0002<$a$w٘Akڼ.\"7N\u000f\u0003wrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aQڱA9ny~\f.=:8(\u0006Gʤ+\u0011\u0017\u0005\u0007[K:\u0013vВq\u0003Y\u001bZ\u001d\u001a@\n\u0005ů\u0002f\u0002u\\NH\u001bҗj5)\u0003wBf'\u000e1-S\u0013Fb)%v\u0010\u001f[F=5#(k\u00035V\"ϱ\u0002\b\u0003K\u0014\u0001'U;yyeGp\u0002*\u0014YNSǵsnc\u0013cx\fU>\u0016ԁJ\u0019\u00156\f\u0013{;=Jّ\u0005wW<-2f6\u000f\u07baxx[óh\u0004dH\u000e\u00022E%(\u00183Y=ӸjWiݢ1P=\u0004\u0013\u0016n2\u000fp9[\u0003\u000f\u05ce\u0019!\\ȭi3WJKOݹ\u000en"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PA6V\u0002.G[N\u0019\\TvK#\u001fV\u001dR5\u0016oUU+x@6t", "", "/tc5R:>a'\u0003\u0005g&\u0001\b", "", "EdQ.h;A\\\u0013\rzl:\u0001\u00138_\u0004'", ">tQ9\\*8Y\u0019\u0013t\\9|\b/n\u000f,wG", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC5C+\u0011qoA\u000bruJ\u00076JLW;`PnL\u0018\u001ccWW+\u001c\u0017cN*8BA'\u00133I\u0011;u\u0001\u000e_|#WpDA D\u0001\u0019s')|$f_xGJTf&ka#\u000e", "5dc\u000eh;AM'~\tl0\u0007\u0012)i~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001dh)EW\u0017x\u0001^@v\u0007<e~(\u0005O\u0005\u0013\u001e", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017AEs?%\u0015waF\u0007eu=d\u0014GN9<YYv;y\u0012nk[+\f\u0005bP(jK\r", "5dc$X):c(\u0002\u0004X:|\u0017=i\n1uD\u007f", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class CompleteRegistrationPayload {
    private final String auth_session_id;
    private final TSRegPublicKeyCredential public_key_credential;
    private final String webauthn_session_id;

    public CompleteRegistrationPayload(String auth_session_id, String webauthn_session_id, TSRegPublicKeyCredential public_key_credential) {
        Intrinsics.checkNotNullParameter(auth_session_id, "auth_session_id");
        Intrinsics.checkNotNullParameter(webauthn_session_id, "webauthn_session_id");
        Intrinsics.checkNotNullParameter(public_key_credential, "public_key_credential");
        this.auth_session_id = auth_session_id;
        this.webauthn_session_id = webauthn_session_id;
        this.public_key_credential = public_key_credential;
    }

    public static /* synthetic */ CompleteRegistrationPayload copy$default(CompleteRegistrationPayload completeRegistrationPayload, String str, String str2, TSRegPublicKeyCredential tSRegPublicKeyCredential, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = completeRegistrationPayload.auth_session_id;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = completeRegistrationPayload.webauthn_session_id;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            tSRegPublicKeyCredential = completeRegistrationPayload.public_key_credential;
        }
        return completeRegistrationPayload.copy(str, str2, tSRegPublicKeyCredential);
    }

    public final String component1() {
        return this.auth_session_id;
    }

    public final String component2() {
        return this.webauthn_session_id;
    }

    public final TSRegPublicKeyCredential component3() {
        return this.public_key_credential;
    }

    public final CompleteRegistrationPayload copy(String auth_session_id, String webauthn_session_id, TSRegPublicKeyCredential public_key_credential) {
        Intrinsics.checkNotNullParameter(auth_session_id, "auth_session_id");
        Intrinsics.checkNotNullParameter(webauthn_session_id, "webauthn_session_id");
        Intrinsics.checkNotNullParameter(public_key_credential, "public_key_credential");
        return new CompleteRegistrationPayload(auth_session_id, webauthn_session_id, public_key_credential);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteRegistrationPayload)) {
            return false;
        }
        CompleteRegistrationPayload completeRegistrationPayload = (CompleteRegistrationPayload) obj;
        return Intrinsics.areEqual(this.auth_session_id, completeRegistrationPayload.auth_session_id) && Intrinsics.areEqual(this.webauthn_session_id, completeRegistrationPayload.webauthn_session_id) && Intrinsics.areEqual(this.public_key_credential, completeRegistrationPayload.public_key_credential);
    }

    public final String getAuth_session_id() {
        return this.auth_session_id;
    }

    public final TSRegPublicKeyCredential getPublic_key_credential() {
        return this.public_key_credential;
    }

    public final String getWebauthn_session_id() {
        return this.webauthn_session_id;
    }

    public int hashCode() {
        return (((this.auth_session_id.hashCode() * 31) + this.webauthn_session_id.hashCode()) * 31) + this.public_key_credential.hashCode();
    }

    public String toString() {
        return "CompleteRegistrationPayload(auth_session_id=" + this.auth_session_id + ", webauthn_session_id=" + this.webauthn_session_id + ", public_key_credential=" + this.public_key_credential + ")";
    }
}
