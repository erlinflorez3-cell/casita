package com.ts.coresdk;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006GLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0LeV\u008cZݷ0\u0005\u0002ڔ\\(aҕ\u007fMYTJ}P\u0012\bQfgoL]ŒB\u0012\n\u001b~q4"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "\u000foX\u0012e9H`", "!tR0X:L", "\"R4Eg,K\\\u0015\u0006c^;\u000f\u0013<k_5\tJ\u000e", "\"R=2g>H`\u001f^\bk6\n", "#mZ;b>G3&\f\u0005k", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^\u0013x\u001a\u000eZPEx\n", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^%}\u0014,MQIA", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[uA\\CHt0%}hpK\u0011p2.\u00044QY$", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[~.\\UEx:}\"ukF\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^'v\u001c7WUDKA+\u001fu7", "", "\""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface TSNetworkResponse<T> {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLcz\u0006I\u0006>\u00116B\u0005*4\u0012\u0006јnjG9LeN/ZS8\u001bs{:&c$\bCCU(|(ޣUdʴ\u0018tZ\\\u001bC= D\u0012+AYY\u0007h*\u000f`A\u007fCAY\b=gdҽ:\u0007&I0PB\u0013\u000f#BH>uAƗLë\u00162FyHUU[\u0013$*\u0006l$Gɭ]ʄR8NvkBwE\u0011vZNUڿ`\u0003S\rT_?\r%`N1F7C!=S1\u000b\u0019ā>ƄCsC\u0012v5oCW\u0005o6\u0007\u0010D\u001b9Z%_\t%\u000b\u0014\u0018Է\rˏ/Qi\\^ p\u0006\t\u000f%<2\u0012LЀGͶ1\u001cl\u001b\u001c;=\u0001aUh\u0002\rVF҅`ي\u001b'\u0006H9Ok~_aS\u0019|62\nc̜%ъr+cV\u0014`#\u001clyW3_C\u000e`\\\u000fq=\u001c\b'gX×\u0006ΥK\n7}\u00173%+O]?*/s"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^\u0013x\u001a\u000eZPEx\n", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "5dc\u000fb+R", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(XJ\u007f+l", "", "1nS2", "\u0017", "5dc\u0010b+>", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uK^8[;M^fHg^:\b\u00138s\u007f\u0005\u0006?\u0015lz\u000bV\fF~nDgG\u001eAz\u0016<LI\u0005Z\"\u0007\u0015wsC\u0014i\u0019N\u00052QU\\,\u001b.}As\u001fg\u0018[\u0001", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uK^8[;M^fHg^:\b\u00138s\u007f\u0005\u0006?\u0015lz\u000b`", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class ApiError implements TSNetworkResponse {
        private final ResponseBody body;
        private final int code;

        public ApiError(ResponseBody responseBody, int i2) {
            Intrinsics.checkNotNullParameter(responseBody, "");
            this.body = responseBody;
            this.code = i2;
        }

        public static /* synthetic */ ApiError copy$default(ApiError apiError, ResponseBody responseBody, int i2, int i3, Object obj) {
            if ((i3 + 1) - (1 | i3) != 0) {
                responseBody = apiError.body;
            }
            if ((i3 & 2) != 0) {
                i2 = apiError.code;
            }
            return apiError.copy(responseBody, i2);
        }

        public final ResponseBody component1() {
            return this.body;
        }

        public final int component2() {
            return this.code;
        }

        public final ApiError copy(ResponseBody responseBody, int i2) {
            Intrinsics.checkNotNullParameter(responseBody, "");
            return new ApiError(responseBody, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiError)) {
                return false;
            }
            ApiError apiError = (ApiError) obj;
            return Intrinsics.areEqual(this.body, apiError.body) && this.code == apiError.code;
        }

        public final ResponseBody getBody() {
            return this.body;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return (this.body.hashCode() * 31) + Integer.hashCode(this.code);
        }

        public String toString() {
            return "ApiError(body=" + this.body + ", code=" + this.code + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0006FLc\u0003\u000bI\u00066\r6B\rD4\u0012\u0006\u0013njGNLeN8ZS8şs{B-c$wCCU(\u0004*\tURog\u0005JbŏIƬ\f,ю\u0013.OT\u0007\u0001B\u0015BD\u007f?iL\u001e_y\u0016\u0005<\u00132J$Nx;\u007f*DN\u0010\u0005\u000e[_\u001c\u0014@@\u001fCb\u0015]\u000b*\u0014\u0016>N\nLf}MdP|aHC;\u0003\u0018EĚ+a6\u001d[.\u000fd5\u001c\u000fc4*v6{֞&٨\u0007\tXjM\u0005\b\u0014K\u0015\u0001;7-Ys\u0006?h\b$\u001b;Q\u001d]!/\u000b\u000fg_:/q֚dׂT\u0010.\b\t\nUJ\u0012\u001f\u001e'v1sֆgڿ\u00125z\u0004aG\u0019JlW\u0018\u0001q8'%62YݍKnWaI+f9\u0012\u0004C\u001dS\u001bt!ig&t%\u001ddw\u007f:aHMN^\fi=\u001c\r\u001fl\u0018)28w\u00065{\u001fB/%e^\u007fق Ƞ\u0006JJ|\u0005\u001b)\u0001a\u0003jHn:\u001f\u001cE<!\u000epC\u0013\u001c2ăUг0\u0013S5b!F\u0016!<twj<kƂMћlkpik'm=tUqn\u001a\u0017\u001e\u0081]ۋ9Si.oqG.M;z\u0007nexRB_3̭$ĘLt\u0018y\u0002C\\\f+4Er*6|I'`-H1!xFSȉa˖l\u001a\u0007V9(\u0011n<v\u000f\u0007^cA\u001cu\u0004a@\rb2-oZE!6[2jD|Q\u0010-}\u0016F\u0016T}QCֽwʀ\u007f*\u001e\u001c?\\=I+\u0011\u00056@\u0010"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^%}\u0014,MQIA", "0nSF", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc\u000fb+R", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "", "1`[9G6MO m~f,", "\u0018", "5dc\u0010T3EB#\u000eve\u001b\u0001\u0011/", "u(9", "", "", "", "@db=b5LS{~v],\n\u0017", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u001fX:I]\"\rzA,x\b/r\u000e", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", ">/", ">0", ">1", "1n_F", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001c1|,WK\u0005zBg\u0013rn9\u0015b2\u0018e\u00150L]>f_x*\u0014 e\u0018W9\rCGQ\"lDE-]", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001c1\u0007", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "\""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Success<T> implements TSNetworkResponse<T> {
        private final T body;
        private final long callTotalTime;
        private final Map<String, List<String>> responseHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public Success(T t2, Map<String, ? extends List<String>> map, long j2) {
            this.body = t2;
            this.responseHeaders = map;
            this.callTotalTime = j2;
        }

        public /* synthetic */ Success(Object obj, Map map, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : map, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, Map map, long j2, int i2, Object obj2) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                obj = success.body;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                map = success.responseHeaders;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                j2 = success.callTotalTime;
            }
            return success.copy(obj, map, j2);
        }

        public final T component1() {
            return this.body;
        }

        public final Map<String, List<String>> component2() {
            return this.responseHeaders;
        }

        public final long component3() {
            return this.callTotalTime;
        }

        public final Success<T> copy(T t2, Map<String, ? extends List<String>> map, long j2) {
            return new Success<>(t2, map, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.body, success.body) && Intrinsics.areEqual(this.responseHeaders, success.responseHeaders) && this.callTotalTime == success.callTotalTime;
        }

        public final T getBody() {
            return this.body;
        }

        public final long getCallTotalTime() {
            return this.callTotalTime;
        }

        public final Map<String, List<String>> getResponseHeaders() {
            return this.responseHeaders;
        }

        public int hashCode() {
            T t2 = this.body;
            int iHashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
            Map<String, List<String>> map = this.responseHeaders;
            return ((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + Long.hashCode(this.callTotalTime);
        }

        public String toString() {
            return "Success(body=" + this.body + ", responseHeaders=" + this.responseHeaders + ", callTotalTime=" + this.callTotalTime + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fs{B#aҝwYП\u0006 \u000e$\u0019O|z\u0016\u0001\u000bg\u001bG\u001d\u000b.x\u0019+֒Yzc\"\u001dC\u000b}M7eok8'Ӣ7ӯ$4(<\b\bI28N(v)ŏ{\u0012\u00180NuRR;LKݍ\u0011ĂB\"\u0007$jn\u0017NVvu:],3oPS?aF{{\u0015\rĭ(˼zc$5NB}#3`\u001b\u0007\u0001g\u0006Ƹ>џA\u0007n459\u0012\u0002eEp\u007fB\u0014q͕\fǁv(b\u0014_c\\?9O{K~\r^|QԐ\u000fʀ\b\u0018\u000e)N.;\u001b~\n\u00145\u0003u"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[uA\\CHt0%}hpK\u0011p2.\u00044QY$", "", "3qa<e", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0005\u001c6CJ}>+\u001bUaG\u0012m5\\ve6:.?kR\u007fF\u0010\u0019C\u000e]=\u0017\u0012_!1{NDt", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class TSExternalNetworkError implements TSNetworkResponse {
        private final String error;

        public TSExternalNetworkError(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public static /* synthetic */ TSExternalNetworkError copy$default(TSExternalNetworkError tSExternalNetworkError, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = tSExternalNetworkError.error;
            }
            return tSExternalNetworkError.copy(str);
        }

        public final String component1() {
            return this.error;
        }

        public final TSExternalNetworkError copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TSExternalNetworkError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TSExternalNetworkError) && Intrinsics.areEqual(this.error, ((TSExternalNetworkError) obj).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "TSExternalNetworkError(error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN.ZS8\u001bs{:&c$\bCCU(|(ޣUdʴ\u0018tZ\\\u001bC=\u001bD\r+9YY\u0007b*\u000f`AņC5S\u0002KL)\u0003D\t82P7@ۖ\u0002ʀ.J\u0016z\tF\u0014$ 6Xphĥ=S\u000b\u001a \u000bV /\u001d#ʩMɇLnc@=*K\u0002PX?_^\u0006}\u0013TY?\u000f\r`L3\u0007̑6չ)U\t\u0011`f\b\u0011M~U\u0005\u00173mȹHָ[8^\r\"#s]\u001bm\u000b&\u000b\u0014\u0018Ը\u000bˏ/Qi[^\u001fx\u0010\t{%<2\r<,\u001f͛/բj\u0012\u00165zraAh\u0004dD\u000e}"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^&[~.\\UEx:}\"ukF\\", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "3qa<e", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "5dc\u0012e9H`", "u(;7T=:\u001d\u001d\tDB\u0016\\\u001c-e\u000b7\u007fJ\nl", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ}Ey\u0016\u0006\u00063~W\b-7{\u00154\u00172)T4-'rn?sc:Y\u00010UL\r\u001bJ;rL&\u001cg\u0014.8\u001a\u000ff\u0017", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ\b", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class TSNetworkError implements TSNetworkResponse {
        private final IOException error;

        public TSNetworkError(IOException iOException) {
            Intrinsics.checkNotNullParameter(iOException, "");
            this.error = iOException;
        }

        public static /* synthetic */ TSNetworkError copy$default(TSNetworkError tSNetworkError, IOException iOException, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                iOException = tSNetworkError.error;
            }
            return tSNetworkError.copy(iOException);
        }

        public final IOException component1() {
            return this.error;
        }

        public final TSNetworkError copy(IOException iOException) {
            Intrinsics.checkNotNullParameter(iOException, "");
            return new TSNetworkError(iOException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TSNetworkError) && Intrinsics.areEqual(this.error, ((TSNetworkError) obj).error);
        }

        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "TSNetworkError(error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eJLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN0ZS8\u001bs{:&c$\bCCU(|(ޣUdʴ\u0018tZ\\\u001bC=!D\u0013+GY]~] \u001aJD\u0006>aL\u007fCGl\r8\u001b\u001f`&أ}\u0007\u000728aX\u0007\tLc\u000e(/no\u0001ŭ\u000ê\t\u001c\u0018\u000fL#I.jqf8^k\f>uޒ\u0004ݦFP-i>\u0005\u00163Ta?\r%ѭN3F7C =U\u0019\u0006\u0001Zo\u000bEqK\u0011\u0001)=*ww\u001eʹWÿ\u0018\u00171\\\u001bk;>j\u0016i`:7[UqVh\u0010>v)\u000bSʴ\u0005؝\n)N?;,/\u0016\u001cF\rr\u0002?\u0017ٳ]۰\u0004|gI%9HA9O3f\u007fv\u0002ТMѼ\u007f\u0007\u001341\u0018?;iT&b+\u001a\u0003v\b6(̽?˓R\u0014a?s\u0004~c\u001a,\n2U\u0003\u007f\u0016\u001f3/'MZg'WpXҎFϼz\u000fhjYn`NX$t\u001dE2"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}^'v\u001c7WUDKA+\u001fu7", "", "1nS2", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "", "3qa<e", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011/\u001b\u001c\u001fp+H\u0015-*X\u0004'UKTuK@[=#$d\u001bT\u0018\r\u0013dK-|Du\u000f\u00112R\fMq`\u0019#\u0018B@", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011/%", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class UnknownError implements TSNetworkResponse {
        private final Integer code;
        private final Throwable error;

        public UnknownError(Integer num, Throwable th) {
            this.code = num;
            this.error = th;
        }

        public /* synthetic */ UnknownError(Integer num, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, th);
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, Integer num, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                num = unknownError.code;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = unknownError.error;
            }
            return unknownError.copy(num, th);
        }

        public final Integer component1() {
            return this.code;
        }

        public final Throwable component2() {
            return this.error;
        }

        public final UnknownError copy(Integer num, Throwable th) {
            return new UnknownError(num, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return Intrinsics.areEqual(this.code, unknownError.code) && Intrinsics.areEqual(this.error, unknownError.error);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Throwable th = this.error;
            return iHashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "UnknownError(code=" + this.code + ", error=" + this.error + ")";
        }
    }
}
