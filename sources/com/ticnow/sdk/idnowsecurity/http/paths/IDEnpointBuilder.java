package com.ticnow.sdk.idnowsecurity.http.paths;

import com.google.firebase.sessions.settings.RemoteSettings;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r(4\u0012}\u0019|ʑi0rd\tYbW8\u000f\u0004{b%k(\u007fESUH\u00012\r]R\u007fg\u001dKj\u000fQ\u0014\u001e\u0016'k<Mc~u\u0012=3Բs?AT8AGv\r63!\u0003:F}\u001d\u0001H+\u001fƼ\u0003ټGW\u0014۵HBvB`\u0016m\u0007 \u001c\u0014Ip\u0019,a\u007fNdICҞFǥ'\u000fqĩf)e<\u000bV-HZ4\u001b\u0002269@O5C&*Ώ\u0013қ_K\u000bӊ\n?\u000bv50KKyfDcP,#1g\r\fs|؟\u0011Ōd\u0018/˃geQ`\u001c1\u0018|\u0002\u001eJ\u000f^\u001e5JF-Hi^ԋ?Ϣv_HА\u001a`H\u0012\ttV\u0019+\u0014A@ݶ\u001f}"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001x\u0012=PQ\u0005O\u0013}\u001esk=\u0010r\t^z.FL[\u0002", "", "@db<h9<S", "", "Dda@\\6G", "", "6tQ", "9h]1", "AdaC\\*>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b(", "5dc\u0015h)", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0015h)", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0018\\5=", "Adc\u0018\\5=", "5dc\u001fX:Hc&|z", "Adc\u001fX:Hc&|z", "5dc X9OW\u0017~", "Adc X9OW\u0017~", "5dc#X9LW#\b", "u(8", "Adc#X9LW#\b", "uH\u0018#", "0tX9W\fGR\u0004\t~g;", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDEnpointBuilder {
    private String hub;
    private String kind;
    private String resource;
    private String service;
    private int version;

    public IDEnpointBuilder(String resource, int i2, String hub, String kind, String service) {
        Intrinsics.checkParameterIsNotNull(resource, "resource");
        Intrinsics.checkParameterIsNotNull(hub, "hub");
        Intrinsics.checkParameterIsNotNull(kind, "kind");
        Intrinsics.checkParameterIsNotNull(service, "service");
        this.resource = resource;
        this.version = i2;
        this.hub = hub;
        this.kind = kind;
        this.service = service;
    }

    public final String buildEndPoint() {
        return RemoteSettings.FORWARD_SLASH_STRING + this.resource + "/v" + this.version + '/' + this.hub + '/' + this.kind + '/' + this.service;
    }

    public final String getHub() {
        return this.hub;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getResource() {
        return this.resource;
    }

    public final String getService() {
        return this.service;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setHub(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.hub = str;
    }

    public final void setKind(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.kind = str;
    }

    public final void setResource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.resource = str;
    }

    public final void setService(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.service = str;
    }

    public final void setVersion(int i2) {
        this.version = i2;
    }
}
