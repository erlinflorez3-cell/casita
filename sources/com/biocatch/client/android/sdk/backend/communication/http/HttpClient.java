package com.biocatch.client.android.sdk.backend.communication.http;

import android.net.TrafficStats;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.wrappers.URL;
import com.dynatrace.android.callback.Callback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{B-cҕyCQU\"Ԃ*\t]TogtJb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172PoG\u074cSڎSʠ\u0011td\u0004`O2<\b\u0005\u0019\u001aXI z\tEc\f@3PvHV%O\u001b\u0019@\u000b̧$\u0001,b0tDO\u0005]h7S\u0007wKf'\u000e:-Q\u001bQl';\u0003\u0012\"9MO5C3\u0004\u0007\u0015as?1M8=Mv57CI\"hf\\\u000e&-+} $\u0007nj\u0013ex\fU<\u007fgYb&(&\u000eB\r\u0005\u0012\u001c\u001b?H\\CJj\u0016 Kt!f\u0007PRlP\u0004\u0013cL\u0016S\u0005\nڂ;ӸjQiݢiZE}\u001d\rL&W͜#ƟX\u000ehٽk`\u0006QIQn>\u001fݓ\fՒAm\f͏Đ\u0006A"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0015R+\u0016\u0014/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cV #!ekU/\r\u000eh\u0017", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "Cq[\u0013T*M]&\u0013", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cb*zrV\f]5\u001a\u0019/", "AnR8X;\u001fO\u0017\u000e\u0005k@", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u0005(G\b;q\u007fU\u0014\u0018=r\u0001KZ\u000eC\t\u0019\u007fJrkUhjC7.,C&b\u001bi*p\u0010!)\u0010\u0003\u0015.2Y.\u0019Ea\u001fy\u001cgUN5#x>$MNWDTybPJj\u0010", "1n];X*M", "\u001aiPCTuGS(H]m;\bx\u001cL]2\u0005I\u0001\u0015&Ky\u0017\u0012", ">h]", "", "Cq[", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5$\u000b{>", "1n];X*MW#\bib4|\u0013?t", "", "@db=b5LS\b\u0003\u0003^6\r\u0018", "@d`BX:M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000e\\6\u0017\u000egAy", "6sc=E,Jc\u0019\r\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000eZ;\r\u0013h\u0017", "Ad]1E,Jc\u0019\r\n", "D`[6W(MS\u0006~\u0007n,\u000b\u0018", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HttpClient implements IHttpClient {
    private final SSLSocketFactory socketFactory;
    private final URLFactory urlFactory;
    private final Utils utils;

    public HttpClient(Utils utils, URLFactory urlFactory, SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        this.utils = utils;
        this.urlFactory = urlFactory;
        this.socketFactory = sSLSocketFactory;
    }

    private final HttpURLConnection connect(boolean z2, URL url, int i2, int i3) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i3);
        if ((httpURLConnection instanceof HttpsURLConnection) && z2 && (sSLSocketFactory = this.socketFactory) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }

    private final HttpResponse sendRequest(HttpRequest httpRequest) throws Exception {
        validateRequest(httpRequest);
        URL urlCreate = this.urlFactory.create(httpRequest.getUrl());
        HttpURLConnection httpURLConnectionConnect = connect(true, urlCreate, httpRequest.getConnectionTimeout(), httpRequest.getResponseTimeout());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("posting message to URL %1$s", Arrays.copyOf(new Object[]{urlCreate.toString()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.debug(str);
        if (httpRequest.getHeaders() != null) {
            Map<String, String> headers = httpRequest.getHeaders();
            Intrinsics.checkNotNull(headers);
            for (String str2 : headers.keySet()) {
                Map<String, String> headers2 = httpRequest.getHeaders();
                Intrinsics.checkNotNull(headers2);
                httpURLConnectionConnect.setRequestProperty(str2, headers2.get(str2));
            }
        }
        httpURLConnectionConnect.setRequestMethod(httpRequest.getMethod());
        httpURLConnectionConnect.setDoOutput(httpRequest.getBody() != null);
        httpURLConnectionConnect.setDoInput(true);
        if (httpRequest.getBody() != null) {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            OutputStream outputStream = Callback.getOutputStream(httpURLConnectionConnect);
            String body = httpRequest.getBody();
            Intrinsics.checkNotNull(body);
            byte[] bytes = body.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        }
        InputStream inputStream = Callback.getInputStream(httpURLConnectionConnect);
        Utils utils = this.utils;
        Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
        utils.pipe(inputStream, byteArrayOutputStream);
        inputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
        return new HttpResponse(new String(byteArray, Charsets.UTF_8), Callback.getResponseCode(httpURLConnectionConnect), Callback.getResponseMessage(httpURLConnectionConnect));
    }

    private final void validateRequest(HttpRequest httpRequest) {
        if (httpRequest.getMethod().length() == 0) {
            throw new InvalidOperationException("Invalid http request method");
        }
        if (httpRequest.getUrl().length() == 0) {
            throw new InvalidOperationException("Invalid http request URL");
        }
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.http.IHttpClient
    public HttpResponse request(HttpRequest httpRequest) throws IOException {
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        return sendRequest(httpRequest);
    }
}
