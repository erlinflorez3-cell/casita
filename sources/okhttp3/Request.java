package okhttp3;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u001e<$q$yCAV\"}8\tWNmhvJh\u0014K\u000f\f\u001f\u0001j:g]xc\u0012\u00172XoG3SuSʠ\u0011td\u0004X1Jx9\u000bЏ*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u0010]\t(\u0016\u001e>N\u0006.buTNJ\u0003\\h63\u0017wJf7o6\rQ\u001dFZ(;\u0001q ;@e4C.٨\u0007\u0007`f\b\u0010MwU\u0007~&U2\u0010xɱ:X\u0006-]6]\u001aurTjKVԃ\u0010'1i,Y^)@y\u0011z;?4\u0012\u0014C`.[\u001d/\u0013\u001c7\rr\u0002E\u0017\u0007ެF\u007f\u0001~~)3\u0004K1I\u001dvQ\u0010>Glg\u007f\u0013)6#/qifb\u0010x\u0015IW>VśU@Cg\u0017\u000eg]\u0006\u0004\u001f\u0004J0\u0012R_\u0002Ez?-_FE}Q%7jHkdi|ݓn\f\u0004u`lX*~\u001a=)\u0019\f!g\u0013\u000f\u07fbTTfQYS*z\u001f}6\u0016fp@G/%(N}i0oܷa\n+V7Jgt\u0004\u0010m8\r:kVӒ\u0014gZΘ,ABh\u0013d7Qa\u0019r\\V0h\u000eн\u0014{\u0014FT\u0019!A\u0010\u0003*8D1GaKMҴ\"HIґ!a`l\u001e\u000f%B2\u0014\u0002$#\u001b7\u0015ʷts\u007fzO=\u000bsr;OeM\u001b<TPv\u000bí/ȷ\u0003s\bø8]UN\u0005\u0016$X2%ک\u001e?YǽU\u0015\u0015\u00017GROST\u000buaS\"+\u000b|\u007f\u0010ir>i\u0018j\u001f+\u000fs!֣VЂ&|fа;\nj\u0016\bx\u0017\fUcl\u000b\n?\u007fwè]BV˻\u0015\u0007%\u001e3\u0019Ȥ&&"}, d2 = {"\u001anZ5g;I!bkzj<|\u0017>;", "", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", ";dc5b+", "", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "0nSF", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "B`V@", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uK^8[;M^fH]m;\bx<lU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9C|8SFJz?k^Ka5\u0006c9\\L\u000eQRQ;k]@\u0007\u0001\u0012f\u001eN9\u001cac@8D+<\u001b\u0019(\u0013\u0012Jl\bU}\n@@43", "u(;<^/Mb$LDK,\t\u0019/s\u000f\u0005\u0006?\u0015l", "1`R5X\nH\\(\f\u0005e", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "u(;<^/Mb$LD<(z\f/C\n1\u000bM\u000b\u001el", "u(;<^/Mb$LDA,x\b/r\u000e}", "7r7Ag7L", "", "u(I", ":`iF6(<V\u0019\\\u0005g;\n\u00136", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!T.L\u0012#\u0005}m;\b", "u(;7T=:\u001d)\u000e~eud\u0005:;", "u(;<^/Mb$LDA;\f\u0014\u001fr\u0007}", "zcT=e,<O(~yX)\u0007\bC", "zcT=e,<O(~yX*x\u00072e]2\u0005O\u000e!\u001e", "6dP1X9", "<`\\2", "zcT=e,<O(~yX/|\u0005.e\r6", "", "zcT=e,<O(~yX4|\u00182o~", "<df\u000fh0ER\u0019\f", "\u001anZ5g;I!bkzj<|\u0017>$\\8\u007fG\u007f\u0017$\u001d", "B`V", "\"", "Bx_2", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkbE|(\u0013\u0011v\nExn\u001fV\u0003 5|k", "BnBAe0GU", "zcT=e,<O(~yX<\n\u0010", "\u0010tX9W,K", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{B0c$wFCU(!*\teNogtMb\u000bY\u000f\u000e\u0016~q4Ikxe\u0012\u00154JoU3UoC?htL\u0005(݅(L\u0010ڎ1\u001aXGP{\u0001Wƚ\u0010\u0012>@1GX\u001b]\t(\u0013\u001e>N\u0003ɉ`g\\9\u0011\u0003k]G#1݃rR5\u0004H|{\u001evX52\u000faL<\u0007K}\u001b3y\u001b\u0007\u0001]\u0006\u0017\b\u007fK,\u0001'UǢywe]p\u007fB=qcUo\u0001Ot\u0005\u007fӠ</1OqOh\u0010>v)\u0001SQL\u0014\u0014Q`.[Կ-\u001cV9\u0003\u001ek@~\u061c%VH\u0011ob/%.đ[=)\u000biai*~;\n*%\u001eQ\u001255$b\u001cj-\u001b\u0003ȭ\u00025_JUH|7 Q6\u001c~r\u001a*2\u0382w\u0004=\f).E6gaG'9m\u0018Grl=\u0019)va\u0018jHn̎\u001f\u001aE.!\f\tI+\u00194^b\bD\u0011{ȼ\u0005\u000b\f\f+ \u000b|\u00035m\u001e\\\u007f\u0001i\u0019ܔ\u000e\u000e33~7\bs2\" GldMQ\u0012߄\u0012V\u00058W<\u0011\u0016\u001fz\u000b~\u001a\rt(Põhl\u0016Ǯ\nw~\u0018!fWy,82ջ)\\[{16rG\u000b;w\\~\u000fE\by8ғm$\u0003>I`j#\bg'̢\\\u0003nTECg4G%\u001c61B\u000b@\u001f~\"ÒwkZddlD,\u001c\u0010h$(Vi/kП?\u00037O\u001a-s]9y\u001a[ D\u0013|(Ҹkl<\u0005 j\u001fJ'~\u001bib\u001b:xtqQ\r;с\u0006ӶJ\u0007Oϊl\raDWy#[BVF\u0006U7,/\u0019oP\b\fԇOے!\"\u007fҡG\u0017giw|N{h\u001d4\u00046\u001c:s.o\u0011b4ЧGΒMe\u0007Ж:&r\u0015P[\u000by\u000eV\u0017I][VW|\u0001f>]\u000f?}l\bZ%\u0001Xk:An,K\u0005ɿ6ϵG\n\u001c٫['\u0017fa\u0002\u000eoQw\u0019f_$\u0019\u0019Ip(\u001bk>-̱nס4\u0012{̸NCA\u0002\u0013\\)&:MJ*ժG\f"}, d2 = {"\u001anZ5g;I!bkzj<|\u0017>$\\8\u007fG\u007f\u0017$\u001d", "", "u(E", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "uK^8[;M^fHg^8\r\t=tUkl", "0nSF", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "5dc\u000fb+R\u0012#\u0005}m;\b", "u(;<^/Mb$LDK,\t\u0019/s\u000f\u0005\u0006?\u0015l", "Adc\u000fb+R\u0012#\u0005}m;\b", "uK^8[;M^fHg^8\r\t=t\\2zTVZ\b", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=$\\8\u007fG\u007f\u0017$\u001d", "5dc\u0015X(=S&\r9h2\u007f\u0018>p", "u(;<^/Mb$LDA,x\b/r\u000efXP\u0005\u001e\u0016G|c", "Adc\u0015X(=S&\r9h2\u007f\u0018>p", "uK^8[;M^fH]^({\t<s>\u0005\fD\b\u0016\u0017TEQ-", ";dc5b+", "", "5dc\u001aX;A]\u0018=\u0005d/\f\u0018:", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001aX;A]\u0018=\u0005d/\f\u0018:", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "B`V@", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc!T.L\u0012#\u0005}m;\b", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc!T.L\u0012#\u0005}m;\b", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "5dc\"e3|]\u001f\u0002\nm7", "u(;<^/Mb$LDA;\f\u0014\u001fr\u0007}", "Adc\"e3|]\u001f\u0002\nm7", "uK^8[;M^fH]m;\bx<lUkl", "/cS\u0015X(=S&", "<`\\2", "D`[BX", "0tX9W", "1`R5X\nH\\(\f\u0005e", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "2d[2g,", "5dc", "6dP1", "6dP1X9", "\u001anZ5g;I!bazZ+|\u0016=;", ">`c0[", ">nbA", ">tc", "@d\\<i,!S\u0015}zk", "B`V", "\"", "Bx_2", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u000f2^}\u001eFCY\u0015WI>zC)b2N9\u0013s,\\\u0006e$\\R3[R\u007f\u0013", "\u001aiPCTuGS(HjK\u0013R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp().isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.getTags$okhttp());
            this.headers = request.headers().newBuilder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i2 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String method, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method(HttpPost.METHOD_NAME, body);
        }

        public Builder put(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        public Builder removeHeader(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public <T> Builder tag(Class<? super T> type, T t2) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t2 == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(t2);
                Intrinsics.checkNotNull(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = sb.append(strSubstring).toString();
            } else if (StringsKt.startsWith(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = sb2.append(strSubstring2).toString();
            }
            return url(HttpUrl.Companion.get(url));
        }

        public Builder url(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return url(companion.get(string));
        }

        public Builder url(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_body */
    public final RequestBody m10772deprecated_body() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cacheControl */
    public final CacheControl m10773deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_headers */
    public final Headers m10774deprecated_headers() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_method */
    public final String m10775deprecated_method() {
        return this.method;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_url */
    public final HttpUrl m10776deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    public final List<String> headers(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final <T> T tag(Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(strComponent2);
                i2 = i3;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }
}
