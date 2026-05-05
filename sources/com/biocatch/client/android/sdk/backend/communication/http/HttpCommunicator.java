package com.biocatch.client.android.sdk.backend.communication.http;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.hash.HashService;
import com.biocatch.client.android.sdk.wrappers.URL;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007fјnjO0L͜P.`\\2\u000fq{<$q$yّCU0}*\teNo˧vJh\u000bKƤ\u000e\u0016\u000fj4I[\u007fe\u0012%2JoE3SڎSʠ~\u0012f\u0005N1Z7\u0017E2*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u000e]\t(\u0015\u001e>N\u0005.dmNDM\u0005_P.Q\tyHT'm7\u0015M;Nù+\r\u0005jfANFM\u0015Sc3\u000b`lW\u0003m\u0004m\tv:?+ww\u001e6!\f\")CO;m#*j\fi`:/s[q`h\u000eV{+\u007f\u001bO\u001c\u000e4+\u0011:;0~\b<C%vaBh\u0002\rCH\u0007oM/%.C[=)piai$\u0017C\n\u001d%\u001eQ\u0011\u001f%iT&`C\u001c\u001d\u0004_Ji@kX~\u000egI\u0006\u0004\u001fpJ8\u0012J_\u007f]\fA2%@O[g?gkRTRi\u000f\u0005\u000fi*֢^͕D\"vݫ\b6\u0017\u000frD\u0013\tB¯Vг0\u0011Uȼ%\u0013\f\u000f+ \u000b\u007f\u0013Ɯ1ŎROpȉ;[k\u000f=1|6\btBސYߍb3=ȡ4\u001eo\\\u000f\u0016U;\u0011\u0010/٫Nΐ\u0010Zd̥r>Vj(w*E%ۿ\u001f\u0558Cq$ع|C'h-N\u0013 RA+\u0017\u000eg?ɰ\u000bՁ7$\u000bǭˮx'"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }NDt", "", "@db=b5LS\b\u0003\u0003^6\r\u0018", "", "1n];X*MW#\bib4|\u0013?t", "1n]AX5MB-\nz", "", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "3mP/_,&S'\rv`,_\u0005=h\u00041}", "", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016g\u0015!O9\u000b@\u0001#1h{#\u0001k\u001d2MLJ50'\u0014uk=\u0006-:M|pEV[,&UnK\u0017[=\n\\.z\u0005fR(lD\r\u0014K\u001d", "6sc=63BS\"\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cV #!ekU/\r\u000eh\u0017", "Cq[", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5$\u000b{>", "/cS\u0015X(=S&\r", "", "6sc=E,Jc\u0019\r\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000eZ;\r\u0013h\u0017", ";db@T.>", "1n]3\\.N`\u0019", ">nbA", "Adc\u0010b5GS\u0017\u000e~h5k\r7e\n8\u000b", "Adc\u0015g;I1 \u0003zg;", "Adc\u001fX:I]\"\rzM0\u0005\t9u\u000f", "Adc\"e3", "D`[6W(MS\u0006~\ti6\u0006\u0017/", "6sc=E,L^#\b\t^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001dG\u000e\\6\u0017\u000egAy", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HttpCommunicator {
    public static final String CHECKSUM_HEADER = "X-h";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final Companion Companion = new Companion(null);
    private static final String POST_HEADER = "POST";
    private int connectionTimeout;
    private final String contentType;
    private boolean enableMessageHashing;
    private final HashService hashService;
    private IHttpClient httpClient;
    private int responseTimeout;
    private AtomicReference<URL> url;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }ND]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "\u0011G4\u0010>\u001a.;\u0013aZ:\u000b\\u", "", "\u0011N=!8\u0015-M\bre>&_h\u000bD_\u0015", "\u001eNB!R\u000f\u001e/w^g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HttpCommunicator(int i2, int i3, String contentType, HashService hashService, boolean z2) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.responseTimeout = i2;
        this.connectionTimeout = i3;
        this.contentType = contentType;
        this.hashService = hashService;
        this.enableMessageHashing = z2;
        this.url = new AtomicReference<>();
    }

    public /* synthetic */ HttpCommunicator(int i2, int i3, String str, HashService hashService, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, str, (8 & i4) != 0 ? null : hashService, (i4 + 16) - (i4 | 16) != 0 ? false : z2);
    }

    private final void addHeaders(HttpRequest httpRequest, String str) {
        HashService hashService;
        httpRequest.setHeader("Content-Type", this.contentType);
        if (!this.enableMessageHashing || (hashService = this.hashService) == null) {
            return;
        }
        httpRequest.setHeader(CHECKSUM_HEADER, hashService.hashSha256(str));
    }

    private final void validateResponse(HttpResponse httpResponse) throws IOException {
        int responseCode = httpResponse.getResponseCode();
        if (responseCode != 200 && responseCode != 204) {
            throw new IOException("Error in response code " + responseCode);
        }
    }

    public final void configure(boolean z2) {
        this.enableMessageHashing = z2;
    }

    public final String post(String message) throws IOException {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.httpClient == null) {
            throw new NullPointerException("HttpClient is null. Make sure you set the HttpClient");
        }
        String string = this.url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
        HttpRequest httpRequest = new HttpRequest(string, "POST");
        httpRequest.setBody(message);
        addHeaders(httpRequest, message);
        httpRequest.setConnectionTimeout(this.connectionTimeout);
        httpRequest.setResponseTimeout(this.responseTimeout);
        IHttpClient iHttpClient = this.httpClient;
        Intrinsics.checkNotNull(iHttpClient);
        HttpResponse httpResponseRequest = iHttpClient.request(httpRequest);
        Log.Companion.getLogger().debug("url: " + this.url + " response code: " + httpResponseRequest.getResponseCode());
        validateResponse(httpResponseRequest);
        return httpResponseRequest.getBody();
    }

    public final void setConnectionTimeout(int i2) {
        this.connectionTimeout = i2;
    }

    public final void setHttpClient(IHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    public final void setResponseTimeout(int i2) {
        this.responseTimeout = i2;
    }

    public final void setUrl(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url.set(url);
    }
}
