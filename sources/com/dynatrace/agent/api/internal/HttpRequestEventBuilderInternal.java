package com.dynatrace.agent.api.internal;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import io.sentry.HttpStatusCodeRange;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\":\u0019\u007fјnjG6LeN1ZS8\u0010s{:$c$\u007ffC٥\"}0\u0012WNmqvJh\u000fK\u000f\f\u0016\u0001jBI]ތe\u0012\u001d2JģG3coEʠhtL\u0005(2(@\u007fڎ\u0017ɝHy@v)B\u0004\fCb\u0001\u0006JV\u001bM\u001d\u001a@\u0007N$\u000f tg|7Ղp_@21\u00072N\\=w0+ձ=Jb>%v\u0010$sLEM-%\u0002Έ7ViF\u001b? EMv5@CI\"Ɏf^\u000e\u001e--e\f\fsnh\u0013kx\fU˃\u007fgY]&(&\tD\u0019J\u001f&\u0006UΞ^1(r \u000ea|;_Nl\u001a^pȕ+eD\"=\u007fa3\u00021tny;G\u05cbg\u007f\u0013+6#/oQab-x\u00171S&RyeNZ`N8ԯmq\u0012\u000fz\u0002X\u0005`K\u000eN\u0014\u0011\\\u001fmKiV;!\u001aȵxHu\u0015\u001d`\u0017T\u001aVV_:nD=r\u001d\u001aw\\d3ߘ\u0001XfJ)MJU7\u0002\u001628\\&\\i9\u001ekgh\u0018Ҕ}a\u0018CGfeZ\u001fo\u001cvQ^aH\u001ao\u001e\u0003jvB̳lf\u0013g~B\u0002\r#b6DJJ\u0001\u000f&\u001f\rT\u001a7J? Az,y5j;`\u0003Lgi|7\u0007\u000bn\u001e'l5:\u0002\u0018M%\r\u000fbtp\u001ez?It\u001bnLECg4GM}\"\u0017[-'\u0015\u001d\f\u007fuh|MZ\f.wkzN\u0015`9\u001aIK>'~WW*-ss#i_k*')}*\u0013I\bFg6}7,)\u0007X{l\u0017P\u001c\u0007rQ/\u0015\u0004\b\u007f^zud\u0005\u0011i]at\u0019XjM~|M%,R\u0019oP\u0010{-\f-+D\u0010\u0014]:(]2u<)z\u000fT\u001a,\u0004tm$ zQ\fEc8wZE>r0z\u0003ZH\u0019x^Ⱥ\u000bΌ\u00113PШ5|d:e\u000b]~=\u00818ޛtVcƥc{\f9F_Xy\u001a͢ ڎG%\u0019\u07bd$w{tc^!I=\u0012a֍=ߎ\u0016\u001eE d`3\u0017>\u0010\f\u001aL@ic[¸\u0015Ӻ8,Dފ[Sbt\u001e\u0012\u0011~tgeĢ>¡w=^\u000eb\u0002-fV\u0011xGv X\tU۳?\u038b|79\u0005{O%=q?\u0019U3\bIx&Ʈrު/D\\ڣk6f\u0010#GsBw\u0003\rߧSԆqkwȯ\t2\u000b-Z&+;a\u0011\u000ew@b\u001bWzM\u0013u@w)ƌ$Ĺ\u0003z\u0005ɚ\r\u0016\u001d\u001d1O!\u00039ΥXϸ{7K\u05ceQ#R=\u001f\f+v\u001dɔ9ޅ9-EƖ; 5\u0011oSi\u0011^¹,ڗ\bt)Ƹߏ\u0012\u001a"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i\u001a|%9:CG{4,$Hr9\u0010r\t^z.FL[\u0010earJ\u001d\u000eac", "", "Cq[", "", "@d`BX:M;\u0019\u000e}h+", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "2ta.g0H\\", "", "AsPAh:\u001c]\u0018~", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "@dP@b5)V&z\t^", "0xc2f\u0019>Q\u0019\u0003\f^+", "0xc2f\u001a>\\(", "Bga<j(;Z\u0019", "", "BqP0X7:`\u0019\b\nA,x\b/r", "@`f\u0012i,Gb\u0004\f\u0005i,\n\u00183e\u000e", "", "6`b\u0011e6I^\u0019}ik(z\t:a\r(\u0005O", "", "6`b\u0011e6I^\u0019}Xn:\f\u00137P\r2\u0007@\u000e&\u001bG}", "6`b\u001bY5/O \u000fzl", "Ehc57<KO(\u0003\u0005g", "2ta.g0H\\\u0001\u0003\u0002e0\u000b\t-o\t'\n", "Ehc5F;:b)\rXh+|", "Ehc5E,:a#\bea9x\u0017/", "Ehc5G/K]+zwe,", "Ehc55@MS'lzg;", "Ehc55@MS'kz\\,\u0001\u001a/d", "/cS\u0012i,Gb\u0004\f\u0005i,\n\u0018C", "9dh", "D`[BX", "", "Ehc5G9:Q\u0019\nvk,\u0006\u0018\u0012e{'{M", "0tX9W", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i\u001a|%9:CG{4,$Hr9\u0010r\t^z.FL[\u0010earJ\u001d\u000eaL1:\u001c\u0010FA0~DE.g=I\u000bJ>", "A`]6g0SSw\u000f\bZ;\u0001\u00138", "", ">tc!e(<S$z\b^5\fl8f\n5\u0004<\u0010\u001b!P", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "BqP0X7:`\u0019\b\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i&z\u0012,MN7x4'$Ka5\u0006c9$", ">tc\u0016Y\u001d:Z)~ch;e\u00196l", ">tc\u0016Y\u001bKc\u0019", ">tc T->3*~\u0004m\u0017\n\u0013:e\r7\u0010", "6`b#T3BR\u0001z\u0004](\f\u0013<y[7\u000bM\u0005\u0014'Vo\u001c", "A`]6g0SS\b\fvg:\u0005\r>t\u007f'XT\u0010\u0017%", "A`]6g0SS\u0007\u000evm<\u000bf9d\u007f\u0004\u0005?m\u0017\u0013Uy\u0017", "7r8;i(EW\u0018n\be", "\u0011n\\=T5B]\"", "\u0016sc=E,Jc\u0019\r\n>=|\u0012>", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class HttpRequestEventBuilderInternal {
    private static final int MAX_REASON_PHRASE_LENGTH = 5000;
    private static final String TC_HINT_INVALID = "invalid";
    private static final String TC_HINT_SET = "api_set";
    private static final String TC_HINT_UNUSED = "api_unused";
    private Integer bytesReceived;
    private Integer bytesSent;
    private long duration;
    private boolean hasDroppedCustomProperties;
    private boolean hasDroppedTraceparent;
    private boolean hasNfnValues;
    private final Map<String, Object> rawEventProperties;
    private String reasonPhrase;
    private String requestMethod;
    private Integer statusCode;
    private Throwable throwable;
    private String traceparentHeader;
    private final String url;
    private static final Companion Companion = new Companion(null);
    private static final Set<String> ALLOWED_REQUEST_METHODS = SetsKt.setOf((Object[]) new String[]{"GET", "HEAD", HttpPost.METHOD_NAME, "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH"});
    private static final Regex STRICT_HTTP_URL_REGEX = new Regex("^(https?)://[^\\s/$.?#].[^\\s]*$", RegexOption.IGNORE_CASE);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0005I\u0006>+6B\r.4ߚ\u007f\u0007|jAӄLeV4ZS0\u0011qڗ5:ӋTqq:\u0016!\u0004\"\u07beSPmg|K+\u001dQ\u0011\u001e\u001c\tl<I\u0004|\f\u0015e˳DņC3Uڎ\u000eEnyN\u0005N8x\u0603{ڱ\u0005\u001a2Ϻ`\u0003\tJc\f@8\u0017\u0084\rň\u0011M\r܅b\u0012L)\u0019\u001e\u000bk%ȧ\u001bǰa:7݊SuPX?_^\u0001$θ\u0019ù+\r~ѭn7NBM\u0015SWYޚ%ÜC\u0003Gмݞ\tt"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i\u001a|%9:CG{4,$Hr9\u0010r\t^z.FL[\u0010earJ\u001d\u000eaL,5\u0015\u0010UJ(xM\r", "", "\nh]6g\u0005", "u(E", "\u000fK;\u001cJ\f\u001dM\u0006^fN\fjw)M_\u0017^*_\u0005", "", "", "!SA\u00166\u001b86\bmeX\u001cio)R_\n[3", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "\u001b@G,E\f\u001aA\u0003gtI\u000fid\u001dEy\u000f[)b\u0006y", "", "\"BN\u0015<\u0015-M\u0007^i", "\"BN\u0015<\u0015-M|gk:\u0013`g", "\"BN\u0015<\u0015-M\tgjL\f[", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4G\u0015Ӭ\\\u0012&\u0006'\u0002?ӄTiV.jSX\u0010{\u007fB&s$ DтY\u001c\u0004%\u0017S\u001fvunbZ9DǇ\n\u001c\u0001̓DK[}k\u0018_APqW3{pެ=f|Ȃ\u001d\"8)F\u007fڷ\u0005\""}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011s\u0017Kv2>U\u0005i\u001a|%9:CG{4,$Hr9\u0010r\t^z.FL[\u0010earJ\u001d\u000eaL1:\u001c\u0010FA0~DE.g=I\u000bJ>", "", "@d`BX:M", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "3uT;g\u0017K]$~\bm0|\u0017", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\na\u0006", "5dc\u001fX8NS'\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc\u0012i,Gb\u0004\f\u0005i,\n\u00183e\u000e", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class HttpRequestEvent {
        private final JSONObject eventProperties;
        private final JSONObject request;

        public HttpRequestEvent(JSONObject request, JSONObject eventProperties) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(eventProperties, "eventProperties");
            this.request = request;
            this.eventProperties = eventProperties;
        }

        public final JSONObject getEventProperties() {
            return this.eventProperties;
        }

        public final JSONObject getRequest() {
            return this.request;
        }
    }

    public HttpRequestEventBuilderInternal(String url, String requestMethod) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        this.url = url;
        String upperCase = StringsKt.trim((CharSequence) requestMethod).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.requestMethod = upperCase;
        this.rawEventProperties = new LinkedHashMap();
    }

    private final boolean hasValidMandatoryAttributes() {
        boolean z2;
        if (isInvalidUrl(this.url)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event since given URL is malformed: '" + this.url + '\'');
            z2 = false;
        } else {
            z2 = true;
        }
        if (ALLOWED_REQUEST_METHODS.contains(this.requestMethod)) {
            return z2;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event since given Request Method is invalid: '" + this.requestMethod + '\'');
        return false;
    }

    private final boolean isInvalidUrl(String str) {
        return !STRICT_HTTP_URL_REGEX.matches(str) || HttpUrl.Companion.parse(str) == null;
    }

    private final void putIfTrue(JSONObject jSONObject, String str, boolean z2) throws JSONException {
        if (z2) {
            jSONObject.put(str, z2);
        }
    }

    private final JSONObject putIfValueNotNull(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            return jSONObject.put(str, obj);
        }
        return null;
    }

    private final void putSafeEventProperty(JSONObject jSONObject, String str, Object obj) {
        if (!StringsKt.startsWith$default(str, EventKeys.EVENT_PROPERTIES.NAMESPACE, false, 2, (Object) null)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event property '" + str + "' as it did not start with prefix 'event_properties.'");
            this.hasDroppedCustomProperties = true;
            return;
        }
        try {
            if (obj == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else if (!(obj instanceof Double)) {
                jSONObject.put(str, obj);
            } else if (Double.isNaN(((Number) obj).doubleValue()) || Double.isInfinite(((Number) obj).doubleValue())) {
                jSONObject.put(str, JSONObject.NULL);
                this.hasNfnValues = true;
                Unit unit = Unit.INSTANCE;
            } else {
                jSONObject.put(str, ((Number) obj).doubleValue());
            }
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropped event property '" + str + "' as it could not be parsed into JSON");
            this.hasDroppedCustomProperties = true;
        }
    }

    private final void putTraceparentInformation(JSONObject jSONObject, TraceparentHeader traceparentHeader, boolean z2) throws JSONException {
        if (traceparentHeader != null) {
            jSONObject.put(EventKeys.TRACE_ID, traceparentHeader.getTraceId());
            jSONObject.put(EventKeys.SPAN_ID, traceparentHeader.getParentId());
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, TC_HINT_SET);
        } else if (z2) {
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, "invalid");
        } else {
            jSONObject.put(EventKeys.REQUEST.TRACE_CONTEXT_HINT, TC_HINT_UNUSED);
        }
    }

    private final void sanitizeDuration() {
        if (this.duration < 0) {
            this.duration = 0L;
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: Duration is negative, default value 0 is used instead");
        }
    }

    private final void sanitizeStatusCodeAndReason() {
        if (this.statusCode == null && this.throwable == null) {
            this.statusCode = 0;
        }
        Integer num = this.statusCode;
        if (num != null && num.intValue() < 0) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: overriding invalid Status Code with 0");
            this.statusCode = 0;
            this.hasDroppedCustomProperties = true;
        }
        String str = this.reasonPhrase;
        if (str == null || str.length() <= 5000) {
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: trimming too long Reason Phrase to a length of 5000");
        this.reasonPhrase = StringsKt.take(str, 5000);
    }

    private final void sanitizeTransmittedBytes() {
        Integer num = this.bytesSent;
        if (num != null && num.intValue() < 0) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropping invalid value for Bytes Sent: '" + this.bytesSent + '\'');
            this.bytesSent = null;
            this.hasDroppedCustomProperties = true;
        }
        Integer num2 = this.bytesReceived;
        if (num2 == null || num2.intValue() >= 0) {
            return;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder: dropping invalid value for Bytes Received: '" + this.bytesReceived + '\'');
        this.bytesReceived = null;
        this.hasDroppedCustomProperties = true;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.rawEventProperties.put(key, Double.valueOf(d2));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.rawEventProperties.put(key, Integer.valueOf(i2));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.rawEventProperties.put(key, Long.valueOf(j2));
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.rawEventProperties.put(key, str);
        return this;
    }

    public final HttpRequestEventBuilderInternal addEventProperty(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.rawEventProperties.put(key, Boolean.valueOf(z2));
        return this;
    }

    public final HttpRequestEvent build() throws JSONException {
        TraceparentHeader traceparentHeader = null;
        if (!hasValidMandatoryAttributes()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "HttpRequestEventBuilder dropped invalid event");
            return null;
        }
        sanitizeStatusCodeAndReason();
        sanitizeTransmittedBytes();
        sanitizeDuration();
        String str = this.traceparentHeader;
        boolean z2 = true;
        if (str != null && (traceparentHeader = TraceparentHeader.Companion.parse(str)) == null) {
            this.hasDroppedTraceparent = true;
        }
        IntRange intRange = new IntRange(400, HttpStatusCodeRange.DEFAULT_MAX);
        Integer num = this.statusCode;
        boolean z3 = (num != null && intRange.contains(num.intValue())) || this.throwable != null;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : this.rawEventProperties.entrySet()) {
            putSafeEventProperty(jSONObject, entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(EventKeys.URL.FULL, this.url);
        jSONObject2.put(EventKeys.NETWORK.PROTOCOL_NAME, "http");
        jSONObject2.put("http.request.method", this.requestMethod);
        jSONObject2.put("duration", this.duration);
        putIfValueNotNull(jSONObject2, "http.response.status_code", this.statusCode);
        putIfValueNotNull(jSONObject2, EventKeys.HTTP.RESPONSE_REASON_PHRASE, this.reasonPhrase);
        putIfValueNotNull(jSONObject2, EventKeys.REQUEST.BYTES_SENT, this.bytesSent);
        putIfValueNotNull(jSONObject2, EventKeys.REQUEST.BYTES_RECEIVED, this.bytesReceived);
        jSONObject2.put(EventKeys.Characteristics.HAS_REQUEST, true);
        jSONObject2.put(EventKeys.Characteristics.IS_API_REPORTED, true);
        putIfTrue(jSONObject2, EventKeys.Characteristics.HAS_FAILED_REQUEST, z3);
        putIfTrue(jSONObject2, EventKeys.Characteristics.HAS_ERROR, z3);
        if (this.throwable != null) {
            jSONObject2.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            ErrorEvent.ExceptionInfo throwable = ErrorEvent.parseThrowable(this.throwable);
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.STACK_TRACE, throwable.getStacktrace());
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.TYPE, throwable.getClassName());
            putIfValueNotNull(jSONObject2, EventKeys.EXCEPTION.MESSAGE, throwable.getMessage());
        }
        putTraceparentInformation(jSONObject2, traceparentHeader, this.hasDroppedTraceparent);
        if (!this.hasDroppedCustomProperties && !this.hasDroppedTraceparent) {
            z2 = false;
        }
        putIfTrue(jSONObject2, EventKeys.DT.SUPPORT.API_HAS_DROPPED_CUSTOM_PROPERTIES, z2);
        putIfTrue(jSONObject2, EventKeys.DT.SUPPORT.HAS_NFN_VALUES, this.hasNfnValues);
        return new HttpRequestEvent(jSONObject2, jSONObject);
    }

    public final HttpRequestEventBuilderInternal withBytesReceived(int i2) {
        this.bytesReceived = Integer.valueOf(i2);
        return this;
    }

    public final HttpRequestEventBuilderInternal withBytesSent(int i2) {
        this.bytesSent = Integer.valueOf(i2);
        return this;
    }

    public final HttpRequestEventBuilderInternal withDuration(long j2) {
        this.duration = j2;
        return this;
    }

    public final HttpRequestEventBuilderInternal withReasonPhrase(String str) {
        this.reasonPhrase = str;
        return this;
    }

    public final HttpRequestEventBuilderInternal withStatusCode(int i2) {
        this.statusCode = Integer.valueOf(i2);
        return this;
    }

    public final HttpRequestEventBuilderInternal withThrowable(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
        return this;
    }

    public final HttpRequestEventBuilderInternal withTraceparentHeader(String traceparentHeader) {
        Intrinsics.checkNotNullParameter(traceparentHeader, "traceparentHeader");
        this.traceparentHeader = traceparentHeader;
        return this;
    }
}
