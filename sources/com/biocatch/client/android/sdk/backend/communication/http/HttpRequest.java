package com.biocatch.client.android.sdk.backend.communication.http;

import java.util.HashMap;
import java.util.Map;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4H\u0007\":\u0018\u007f\u0007lmA0R\tP.XW2\u000fy\u001e<řc$\u007fCCU ~(ޛeȞ\u0018g\u001dI\u001b\u001eS\u0013\u0014\u0016\u0011jZJe|k\u0014'2ppУ7M}@\u0002r\u0003L\u001d.B$Hy3\u0002*,X\u0010%{YJ:)xT~Rj\r{\u001eJ\u0016\u0014X8\u0001L]\u0018RDc\u0005]h0s\u001dwFf)u/+NcІ`ܮ\u0011\u0003iӜCB=:#+s\u0005\rYiGSW\u007fF\u001dhU1\u0002ɥ\u007fɱ:d\bϬ--U\u0018k~F^\u000b^n\u001awE]rc^\u001e*\bz*\u000eL\u0006\u001e\u0006UID,Hv^ԇ?ϢvSHАRmP\u0002\u0013ad\u0018Ӿ\u000493ݍ3hWrI\u001f\u001fO\n\u0017%\u001eQ\u000bEĖgڍ\u0012l\u001dÑlyWD_L]JT\u001egK>\u0013~b\u001a*21Ͻ\u00045\u0004߾F\u0019+Li?أ%\b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000eZ;\r\u0013h\u0017", "", "Cq[", "", ";dc5b+", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "0nSF", "5dc\u000fb+R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fb+R", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n];X*MW#\bib4|\u0013?t", "", "5dc\u0010b5GS\u0017\u000e~h5k\r7e\n8\u000b", "u(8", "Adc\u0010b5GS\u0017\u000e~h5k\r7e\n8\u000b", "uH\u0018#", "6dP1X9L", "", "5dc\u001aX;A]\u0018", "@db=b5LS\b\u0003\u0003^6\r\u0018", "5dc\u001fX:I]\"\rzM0\u0005\t9u\u000f", "Adc\u001fX:I]\"\rzM0\u0005\t9u\u000f", "5dc\"e3", "5dc\u0015X(=S&\r", "", "Adc\u0015X(=S&", "", "6dP1X9", "D`[BX", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HttpRequest {
    private String body;
    private int connectionTimeout;
    private Map<String, String> headers;
    private final String method;
    private int responseTimeout;
    private final String url;

    public HttpRequest(String url, String method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.url = url;
        this.method = method;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final int getResponseTimeout() {
        return this.responseTimeout;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setConnectionTimeout(int i2) {
        this.connectionTimeout = i2;
    }

    public final void setHeader(String header, String value) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        Map<String, String> map = this.headers;
        Intrinsics.checkNotNull(map);
        map.put(header, value);
    }

    public final void setResponseTimeout(int i2) {
        this.responseTimeout = i2;
    }
}
