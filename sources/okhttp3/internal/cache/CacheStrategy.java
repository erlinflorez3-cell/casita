package okhttp3.internal.cache;

import androidx.compose.material3.internal.CalendarModelKt;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\r|ʑW9tev-\u000bS3\u0019,\u0015:řk*\u007fCSW0|P\n_Tui\u0007Lp\nq\u0012و\u001axx0\u001af\u0007_*\u0011HA\u001eBݯQuEʠxv<\n.8rI\b\u0005\u0019\u001c@G>wټGQ\u0014۵HBvA`\u0015̈\t%"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u0013Dfy/7o*\u0004", "", "<dcDb9D@\u0019\u000b\u000b^:\f", "\u001anZ5g;I!bkzj<|\u0017>;", "1`R5X\u0019>a$\t\u0004l,", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "uK^8[;M^fHg^8\r\t=tU\u000f\u0006F\u0004&&R=W)v3@c\u0007.7CY\u001f", "5dc\u0010T*AS\u0006~\ti6\u0006\u0017/", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(Q", "5dc\u001bX;P]&\u0005g^8\r\t=t", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "\u0011n\\=T5B]\"", "\u0014`RAb9R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CacheStrategy {
    public static final Companion Companion = new Companion(null);
    private final Response cacheResponse;
    private final Request networkRequest;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001d]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8ԸsF"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u0013Dfy/7o*l+MCv0'\u0019rj\u000f", "", "u(E", "7r2.V/>O\u0016\u0006z", "", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean isCacheable(okhttp3.Response r5, okhttp3.Request r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r1 = r5.code()
                r0 = 200(0xc8, float:2.8E-43)
                r3 = 0
                if (r1 == r0) goto L65
                r0 = 410(0x19a, float:5.75E-43)
                if (r1 == r0) goto L65
                r0 = 414(0x19e, float:5.8E-43)
                if (r1 == r0) goto L65
                r0 = 501(0x1f5, float:7.02E-43)
                if (r1 == r0) goto L65
                r0 = 203(0xcb, float:2.84E-43)
                if (r1 == r0) goto L65
                r0 = 204(0xcc, float:2.86E-43)
                if (r1 == r0) goto L65
                r0 = 307(0x133, float:4.3E-43)
                if (r1 == r0) goto L3b
                r0 = 308(0x134, float:4.32E-43)
                if (r1 == r0) goto L65
                r0 = 404(0x194, float:5.66E-43)
                if (r1 == r0) goto L65
                r0 = 405(0x195, float:5.68E-43)
                if (r1 == r0) goto L65
                switch(r1) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r3
            L3b:
                java.lang.String r2 = "Expires"
                r1 = 2
                r0 = 0
                java.lang.String r0 = okhttp3.Response.header$default(r5, r2, r0, r1, r0)
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r0 = -1
                if (r1 != r0) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L65
                return r3
            L65:
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.noStore()
                if (r0 != 0) goto L7a
                okhttp3.CacheControl r0 = r6.cacheControl()
                boolean r0 = r0.noStore()
                if (r0 != 0) goto L7a
                r3 = 1
            L7a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.isCacheable(okhttp3.Response, okhttp3.Request):boolean");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`Y2şs{B0cҕyCQU\"}(\u0011WN}gvJ`\fK\u000f\u0014\u001f\u0001j2Ikތ\u000e\u0012=1\u0003\rO7[oU9\u000fuF\t.4:8(\b\u0011 8L(x\u0011By\u0011ܘ4@~@\u001b\u0013[\u001a2\u00124?f\u0001f`udNH\u001bt\u000351\u001b\u0002B|>&0ES\u001b_l';w(\u001esNEO-%\u0002\u001e7ViA\u001b? @Kho-9e\fWdsF\u0014e7]\u0014urTd[ĬlВ++WҪ\u001c^\u001c,\u0010|\u0012\fj\tdͽ)ρ2-\"ǑX\u001cA}\u000bUVO0h\u0019Ș\u0007ˋ:\u0017-Į\u00049G&~Sw:GZ\u000eީ\u0011ڟ\"#\t͙qib\u001bx\u00171S&]\b҈LףLN\u0012ԯ\u000e{\u0012~z\u0004@\u0003^QV߿\b 2\u0017-ڛ,E1!\u0004\u0002vE>ϻ\u0007¾lSqɭ\u0019L0}.7X\nbɱP\u0081\tkXӹ)>\u001fO4T5\u0001^ʷ\"Ϣ{B)ط(PUxw{\u001ei\u00187GfeZE\u008b\u001aĆ=^;̐\"q\u001etjx*>jn[֝r͞W\fb٢x0@\\\u0003\u0012\u000ezrXbƑ>Ɛu\u001c<ι֤\u001dy"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u0013Dfy/7o*l.?9z>+)>", "", "<nf\u001a\\3EW'", "", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "1`R5X\u0019>a$\t\u0004l,", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "uI;<^/Mb$LDK,\t\u0019/s\u000f}bJ\u0007\u001a&Vz[\u0006c%Cd\b)Emkq>", "/fT X*H\\\u0018\r", "", "3sP4", "", "3w_6e,L", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", ":`bA@6=W\u001a\u0003z]", ":`bA@6=W\u001a\u0003z]\u001a\f\u00163n\u0002", "@dR2\\=>R\u0006~\ti6\u0006\u0017/M\u0004/\u0003D\u000f", "5dc\u001fX8NS'\u000e9h2\u007f\u0018>p", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "Ad]AE,Jc\u0019\r\nF0\u0004\u00103s", "AdaCX+\u001dO(~", "AdaCX+\u001dO(~hm9\u0001\u00121", "1`R5X\u0019>a$\t\u0004l,X\u000b/", "1n\\=h;>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u0013Dfy/7o*\u0004", "1n\\=h;>1\u0015\byb+x\u0018/", "1n\\=h;>4&~\ta5|\u0017=L\u0004){O\u0005\u001f\u0017", "6`b\u0010b5=W(\u0003\u0005g:", "", "7r5?X:A\\\u0019\r\tE0}\t>i\b(^@\u0011$\u001bU~\u0012:", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j2, Request request, Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.nowMillis = j2;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strName = headers.name(i2);
                    String strValue = headers.value(i2);
                    if (StringsKt.equals(strName, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(strValue);
                        this.servedDateString = strValue;
                    } else if (StringsKt.equals(strName, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(strValue);
                    } else if (StringsKt.equals(strName, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(strValue);
                        this.lastModifiedString = strValue;
                    } else if (StringsKt.equals(strName, "ETag", true)) {
                        this.etag = strValue;
                    } else if (StringsKt.equals(strName, "Age", true)) {
                        this.ageSeconds = Util.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            if (this.ageSeconds != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(this.ageSeconds));
            }
            long j2 = this.receivedResponseMillis;
            return jMax + (j2 - this.sentRequestMillis) + (this.nowMillis - j2);
        }

        private final CacheStrategy computeCandidate() {
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if ((!this.request.isHttps() || this.cacheResponse.handshake() != null) && CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                CacheControl cacheControl = this.request.cacheControl();
                if (cacheControl.noCache() || hasConditions(this.request)) {
                    return new CacheStrategy(this.request, null);
                }
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long jCacheResponseAge = cacheResponseAge();
                long jComputeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    jComputeFreshnessLifetime = Math.min(jComputeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long millis = 0;
                long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j2 = millis2 + jCacheResponseAge;
                    if (j2 < millis + jComputeFreshnessLifetime) {
                        Response.Builder builderNewBuilder = this.cacheResponse.newBuilder();
                        if (j2 >= jComputeFreshnessLifetime) {
                            builderNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jCacheResponseAge > CalendarModelKt.MillisecondsIn24Hours && isFreshnessLifetimeHeuristic()) {
                            builderNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builderNewBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    str = "If-Modified-Since";
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else {
                        if (this.servedDate == null) {
                            return new CacheStrategy(this.request, null);
                        }
                        str2 = this.servedDateString;
                    }
                }
                Headers.Builder builderNewBuilder2 = this.request.headers().newBuilder();
                Intrinsics.checkNotNull(str2);
                builderNewBuilder2.addLenient$okhttp(str, str2);
                return new CacheStrategy(this.request.newBuilder().headers(builderNewBuilder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            Response response = this.cacheResponse;
            Intrinsics.checkNotNull(response);
            if (response.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r3.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            Intrinsics.checkNotNull(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final CacheStrategy compute() {
            CacheStrategy cacheStrategyComputeCandidate = computeCandidate();
            return (cacheStrategyComputeCandidate.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? cacheStrategyComputeCandidate : new CacheStrategy(null, null);
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
