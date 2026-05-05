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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjO0LeN:ZS8\u0018s{:$c$\u007fICU }(ޢUdʴ\u0018nxYKf\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#:\u0015$@'Py3\u0007ʀ.H\u001e}CJY\u001b*0nq\u0001Ŭ\u000e\u0016\f(\"\u001e>N\u0002dָh\u0017=V}u:]'IފC\u0017.mB\u0015M;L\u001bݒ\u000e?\u0011,>X7cՖUY\t\u0007`[W\u0003mrm\u000bn'5-as\u00067\t\u0006\u001a\u00159R%]!*\r\u000bW`\u001a,CO\u0012Q\u0017˲'@\f\n!T\u0004<\u001bWN<C2h\u001e\ras9նA\u0019\tlY\u0018z\u0010N]Բ~{2G4~Q\u0010<_آ6L\u0014\u001b#;\u0001\u001d'ƟX\u0014hٽ3V}Y?Z\u0011LVQ\"Ykqձth\nÏ\u001c2M\n=\u0007a=%%O[g$\u074co\bPֳ\u007fx\u000blv`:aVB:nD8Ҋ\r\u0012bե|\u0007q^beµ\u0015g"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PA6V\u0002.G[N\u0019\\TvK#\u001fV\u001dR5\u0016qYO4uS\r", "", "CrT?4.>\\(", "", "EdQ.h;A\\\u0007~\tl0\u0007\u0012\u0013d", ">tQ9\\*$S-\\\b^+|\u0012>i{/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "2de6V,\"\\\u001a\t", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PB,_z%G0W-f(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC5C+\u0011qoA\u000bruJ\u00076JLW;`PnL\u0018\u001ccWW+\u001c\u0017cN*8BA'\u00133I\u0011;u\u0001\u000e_|#WpDA D\u0001\u0019s')|$f_xGJTf&kaF\u001bfB\u00043!m\")pT=Swc uR\u0003vkE\u0015\n<.G7dFT\u0002_Izp\u001dU\u0004\u0003\u00192gt8t/M\u0013*Gh\u0003KK!?hNX\u001d", "5dc\u0011X=BQ\u0019b\u0004_6", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017AEs?%\u0015waF\u0007eu-v8KJN\u0010eS|\u0013", "5dc\u001dh)EW\u0017dzr\n\n\t.e\t7\u007f<\b", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017AEs?%\u0015waF\u0007eu=d\u0014GN9<YYv;y\u0012nk[+\f\u0005bP(jK\r", "5dc\"f,K/\u001b~\u0004m", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc$X):c(\u0002\u0004L,\u000b\u00173o\t\fz", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class CompleteRegistrationResult {
    private final DeviceInfo deviceInfo;
    private final TSRegPublicKeyCredential publicKeyCredential;
    private final String userAgent;
    private final String webauthnSessionId;

    public CompleteRegistrationResult(String userAgent, String webauthnSessionId, TSRegPublicKeyCredential publicKeyCredential, DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(webauthnSessionId, "webauthnSessionId");
        Intrinsics.checkNotNullParameter(publicKeyCredential, "publicKeyCredential");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.userAgent = userAgent;
        this.webauthnSessionId = webauthnSessionId;
        this.publicKeyCredential = publicKeyCredential;
        this.deviceInfo = deviceInfo;
    }

    public static /* synthetic */ CompleteRegistrationResult copy$default(CompleteRegistrationResult completeRegistrationResult, String str, String str2, TSRegPublicKeyCredential tSRegPublicKeyCredential, DeviceInfo deviceInfo, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = completeRegistrationResult.userAgent;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = completeRegistrationResult.webauthnSessionId;
        }
        if ((4 & i2) != 0) {
            tSRegPublicKeyCredential = completeRegistrationResult.publicKeyCredential;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            deviceInfo = completeRegistrationResult.deviceInfo;
        }
        return completeRegistrationResult.copy(str, str2, tSRegPublicKeyCredential, deviceInfo);
    }

    public final String component1() {
        return this.userAgent;
    }

    public final String component2() {
        return this.webauthnSessionId;
    }

    public final TSRegPublicKeyCredential component3() {
        return this.publicKeyCredential;
    }

    public final DeviceInfo component4() {
        return this.deviceInfo;
    }

    public final CompleteRegistrationResult copy(String userAgent, String webauthnSessionId, TSRegPublicKeyCredential publicKeyCredential, DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(webauthnSessionId, "webauthnSessionId");
        Intrinsics.checkNotNullParameter(publicKeyCredential, "publicKeyCredential");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new CompleteRegistrationResult(userAgent, webauthnSessionId, publicKeyCredential, deviceInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteRegistrationResult)) {
            return false;
        }
        CompleteRegistrationResult completeRegistrationResult = (CompleteRegistrationResult) obj;
        return Intrinsics.areEqual(this.userAgent, completeRegistrationResult.userAgent) && Intrinsics.areEqual(this.webauthnSessionId, completeRegistrationResult.webauthnSessionId) && Intrinsics.areEqual(this.publicKeyCredential, completeRegistrationResult.publicKeyCredential) && Intrinsics.areEqual(this.deviceInfo, completeRegistrationResult.deviceInfo);
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final TSRegPublicKeyCredential getPublicKeyCredential() {
        return this.publicKeyCredential;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getWebauthnSessionId() {
        return this.webauthnSessionId;
    }

    public int hashCode() {
        return (((((this.userAgent.hashCode() * 31) + this.webauthnSessionId.hashCode()) * 31) + this.publicKeyCredential.hashCode()) * 31) + this.deviceInfo.hashCode();
    }

    public String toString() {
        return "CompleteRegistrationResult(userAgent=" + this.userAgent + ", webauthnSessionId=" + this.webauthnSessionId + ", publicKeyCredential=" + this.publicKeyCredential + ", deviceInfo=" + this.deviceInfo + ")";
    }
}
