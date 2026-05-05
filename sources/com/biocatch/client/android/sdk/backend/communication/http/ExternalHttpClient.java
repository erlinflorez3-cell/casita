package com.biocatch.client.android.sdk.backend.communication.http;

import com.biocatch.client.android.sdk.contract.http.CustomHttpRequest;
import com.biocatch.client.android.sdk.contract.http.ICustomHttpClient;
import com.biocatch.client.android.sdk.contract.http.IHttpRequest;
import com.biocatch.client.android.sdk.contract.http.IHttpResponse;
import java.io.IOException;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCA٥0ԂR\t}M(r~Nh\u000b[\u000f4\u0017ѱn,WWAk \u0012JB\u001eCcQ}BQ`#<K z0F\u0001\u001d\u0001H2x\u0014\u0005\u0004[K:\u001cv@9H`\u0018e\u0005H\u001a6B.\u00066\\\u0016T|\\=iH/;\u0003\u0018C%ώa݁\u0001M\u0015Ͽÿ+\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cRP#\u0012g\u0017J2o\u0014hL\u0002uH7(\u0017\u0002", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cV #!ekU/\r\u000eh\u0017", "1tbAb4!b(\nXe0|\u0012>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ57-$s+\u001dds:]\u0001/*[]7:Yv=\u001d!0", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001f=Z?9z}!$wl\u0003jA<\\\u00061O/];g0yA\u0014\u001bic\u0012\u001c", "1qT.g,\u001cc'\u000e\u0005f\u000f\f\u0018:R\u007f4\f@\u000f&", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ57-$s+\u001dir;Yc'S\\N:k(", "6sc=E,Jc\u0019\r\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000eZ;\r\u0013h\u0017", "1qT.g,!b(\ng^:\b\u00138s\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000e\\6\u0017\u000egAy", "6sc=E,L^#\b\t^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ57-$s+\u001dir;Yc'UWX5jRH", "@d`BX:M", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExternalHttpClient implements IHttpClient {
    private final ICustomHttpClient customHttpClient;

    public ExternalHttpClient(ICustomHttpClient customHttpClient) {
        Intrinsics.checkNotNullParameter(customHttpClient, "customHttpClient");
        this.customHttpClient = customHttpClient;
    }

    private final IHttpRequest createCustomHttpRequest(HttpRequest httpRequest) {
        CustomHttpRequest customHttpRequest = new CustomHttpRequest();
        customHttpRequest.setURL(httpRequest.getUrl());
        customHttpRequest.setMethod(httpRequest.getMethod());
        customHttpRequest.setBody(httpRequest.getBody());
        customHttpRequest.setConnectionTimeout(httpRequest.getConnectionTimeout());
        customHttpRequest.setResponseTimeout(httpRequest.getResponseTimeout());
        if (httpRequest.getHeaders() != null) {
            Map<String, String> headers = httpRequest.getHeaders();
            Intrinsics.checkNotNull(headers);
            for (String str : headers.keySet()) {
                Map<String, String> headers2 = httpRequest.getHeaders();
                Intrinsics.checkNotNull(headers2);
                customHttpRequest.setHeader(str, headers2.get(str));
            }
        }
        return customHttpRequest;
    }

    private final HttpResponse createHttpResponse(IHttpResponse iHttpResponse) {
        String body = iHttpResponse.getBody();
        if (body == null) {
            body = "";
        }
        return new HttpResponse(body, iHttpResponse.getResponseCode(), iHttpResponse.getResponseMessage());
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.http.IHttpClient
    public HttpResponse request(HttpRequest httpRequest) throws IOException {
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        IHttpResponse httpResponse = this.customHttpClient.request(createCustomHttpRequest(httpRequest));
        Intrinsics.checkNotNullExpressionValue(httpResponse, "httpResponse");
        return createHttpResponse(httpResponse);
    }
}
