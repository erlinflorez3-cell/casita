package okhttp3;

import com.google.common.base.Ascii;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.XS2\u000fy\b<$a$yCI\\\"}(\nWNumvJ`\u0013K\u000f\u001c\u0016\u0001̓4Ic\u0002e܈\u00172PoG3SqSʠ~\u0016f\u0005N1Z9\u001a&#ZMNƵ\u0007~QK$\u0012^A\u0001>`\u000fe\u0005H\u0015\u0016H.\u00056bwPFH\u001bch4ݭ\u0007iPUoj>\u0005e\rt]m\u0012țe\u001e1S\u007f;#0k\u00035^\"SKE\u007fJ\u001dhU*q]<cDl\u0018\u0014C1\u007f\u0011k\b>\\3a)\u001d5/gi[R\u001e(&\u0001*\u0012\u0003\t؝\n'NDu%t\u0017&3#\u0003\u001aEг\u0006^H\u0017ClD\u0019=\u007fa.\u007f ƻUaA1\u0017O\n\u001e%\u001eQ\r\u001f'in&b+\u001a\u0003\u0013\u00025_\\UH|' =6\u0012~\u0001\u001a*2Ow\u0004=\u0016).E@}o\n2/s\u001aHrp-J¾lW\u0002TNH0xfC8\t$Zre[ߛRԜ\\,\u0019۳l`\u0015\t \u0013NhN˖-ٚ\u0014NWŖ:v[j\"%]i\u000eխp«\u0012WAӔ\u0004L_g(gbx$?jh3]\u001dGΐ\u0010`d̥:4Nn\u001e\u0006LS\\\u001b+2m\u0002RyϜ5\u001dt\u0017N\u0012,S\u0012\u000e\u0017arh>\u0002\u000b8ʗ\u0007o,ڏ!\u0003V^~\u0002ψ|l"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015l", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "0nd;W(Kgu\u0013\n^\u001a\f\u00163n\u0002", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "Bx_2", "\u001anZ5g;I!bfz]0xwCp\u007f}", ">`aAf", "", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001d\u0012", "uK^8\\6\b0-\u000ezL;\n\r8gU\u000f\u0006F\u0004&&R=W$v$9Ul4Bmk\u0015R?Lg}.$lh\u0003mg:]Lj8", "0nd;W(Kg", "", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n]AX5M:\u0019\b|m/", "", "1n]AX5MB-\nz", "u(;7T=:\u001d)\u000e~euc\r=tU", "Ahi2", "", "u(8", "u(;<^/Mb$LDF,{\r+T\u00143{\u0016", "zcT=e,<O(~yX)\u0007\u00198d{5\u0010", ">`aA", "7mS2k", "zcT=e,<O(~yX7x\u0016>s", "zcT=e,<O(~yX:\u0001\u001e/", "zcT=e,<O(~yX;\u0011\u0014/", "EqXAX\u0016K1#\u000f\u0004m\t\u0011\u0018/s", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "1nd;g\tRb\u0019\r", "", "EqXAX\u001bH", "", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u001e`aA", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultipartBody extends RequestBody {
    private final ByteString boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;
    public static final Companion Companion = new Companion(null);
    public static final MediaType MIXED = MediaType.Companion.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.Companion.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.Companion.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.Companion.get("multipart/parallel");
    public static final MediaType FORM = MediaType.Companion.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {Ascii.CR, 10};
    private static final byte[] DASHDASH = {45, 45};

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007t\nA0ZeP\u008cZS@\u000fs{:'c$\bCCU }*\teNogtJb\u000bY\u000f\u000e\u0016~jBկ\u0006x\f\u0011OAHtO9SoK9xtd\u0006ڶ6\"F{M\u0015(3`\u0010%ٙsO\u001a\u001cH@\u001f;\u0003\u0011[\u00102\u00124?h\u001f,e\u007fNdԟ\u001daH9;\u0003\u0018C~-m<\u0015O#E\u0003(=zo+C@eC];a\u0012\u001fR\nΪ3E\u007fM\u001dj=&YZ$[De\u0018\u0014C9\u0018\u0019k\u0002>\\3ĩ\u0011\u00105=gcyVV4\u0006\n\u0014\rjǉ>\n5UF-HtP\u0012A\b\u000bSndJjP\u0015\u0013adЍU\u0004A2Q\u001b\u0015Y2G'NO{3\u0010tŃ\u0003ͼ%[\\ו1')X\u0010WASP=vT8^\u0014Ъ\u0006Ͳf\u00022ʶ\u0001S\u000e6\u0014\u0011\\\u001f{ڞgޠ'!sȵүH}"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015UsWs\u0015;v2\u000b", "", "0nd;W(Kg", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", ">`aAf", "", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001d\u0012", "Bx_2", "\u001anZ5g;I!bfz]0xwCp\u007f}", "/cS\u0013b9F2\u0015\u000evI(\n\u0018", "<`\\2", "D`[BX", "4h[2a(FS", "0nSF", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "/cS\u001dT9M", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", ">`aA", "0tX9W", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015l", "Adc!l7>", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.boundary = ByteString.Companion.encodeUtf8(boundary);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }

        public final Builder addFormDataPart(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            addPart(Part.Companion.createFormData(name, value));
            return this;
        }

        public final Builder addFormDataPart(String name, String str, RequestBody body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.Companion.createFormData(name, str, body));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.Companion.create(headers, body));
            return this;
        }

        public final Builder addPart(Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        public final Builder addPart(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.Companion.create(body));
            return this;
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
        }

        public final Builder setType(MediaType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.areEqual(type.type(), "multipart")) {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
            this.type = type;
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\"\u007f\u0007loA0ReP.hS2\u000f\u0002{<řc$\u007fOCU }(ޢPdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u0014k\u001d'2p{g7{|&9?\u0003f\t.A:8(\u0015GɝݵL\u0010|\f\u0014Y\u001a\u0013H@\u001f<\t\u0011$İ\u001cŪ\n>(ҵnhuQNH\u001ba\u0011ǅ%ɨmBVϋ0<\u000bR%F\u0003+cǻcӿ/@?ߎe1a\t\u001fR\nCYӍsݘ\th/ݐ{W\u0002^NX.\u0016K/&՝_ę*\\\rĩ1\u001a53gcyRD,N߆}Ɂ@\u0004\u0016ͺwV<62f6\u0010ixIԧBг\u0006^JȕKoD!=\u007fa-o\u001f=ϧcޅ\u001dN?ަ̅\u00110"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015UtQw\u00198\u007f)?bS", "", "u(E", "\u000fKC\u0012E\u0015\u001aB|oZ", "\u001anZ5g;I!bfz]0xwCp\u007f}", "\u0011N;\u001cA\u001a)/v^", "", "\u0011Q;\u0013", "\u0012@B\u00157\b,6", "\u0012H6\u0012F\u001b", "\u0014NA\u001a", "\u001bHG\u00127", "\u001e@A\u000e?\u0013\u001e:", "/o_2a+*c#\u000ez]\u001a\f\u00163n\u0002", "", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "9dh", "", "/o_2a+*c#\u000ez]\u001a\f\u00163n\u0002f\u0006F\u0004&&R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String key) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append('\"');
            int length = key.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = key.charAt(i2);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\f|ʑW9tev-\u000bR3O\u0003\u000244a2q[=k\u0019,#\u0019S\\i\u007fnx]ŲG\u000f\u0014\u001aAu:Kmx\f\u0015U7Բs?9T8JG`\r8\u001b\u001f`#~~ڱ\u0005\u001a0P`\b\tEc\f@3vuĐV\u0013UĨ2\u0014\f@.\u0006nouNNJ\u0003\\h0Y\bݦFT/ڿH~S\rTZܴ\u0011\u0001"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001d\u0012", "", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "0nSF", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "uK^8[;M^fH]^({\t<sU\u000f\u0006F\u0004&&R=W)v1EY\f/\u0014w\u0015B#\u0007,", "u(;<^/Mb$LDK,\t\u0019/s\u000f\u0005\u0006?\u0015l", "u(;<^/Mb$LDA,x\b/r\u000e}", "zcT=e,<O(~yX)\u0007\bC", "zcT=e,<O(~yX/|\u0005.e\r6", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u001bs{:%aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f'\u0014\u0017\u0011jZK\u0006~k\u0015'4Xnm7}sK>xtd\u000bf7jF\b\u0006\u0019\u001aXJ@z\tHc\f@6\u0007u\u0003h\u001bT\u001d\u001a@\bn$\u000f&tg|?xpkDG#1r\tSo\u007f>\u0004e\rtVW\u0011\u0005i6+n@e\u001b3^\u001b\thZm\fouK\n\u0001'U1\u0010xɷ:d"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001dzT/=dy);w\u001f\u0004", "", "u(E", "1qT.g,", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0005\u0006?\u0015U\u0002C|\u001d\u0012", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "0nSF", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1qT.g,\u001f]&\u0007YZ;x", "<`\\2", "", "D`[BX", "4h[2a(FS", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Part create(Headers headers, RequestBody body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            public final Part create(RequestBody body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return create(null, body);
            }

            @JvmStatic
            public final Part createFormData(String name, String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.Companion, value, (MediaType) null, 1, (Object) null));
            }

            @JvmStatic
            public final Part createFormData(String name, String str, RequestBody body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                MultipartBody.Companion.appendQuotedString$okhttp(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    MultipartBody.Companion.appendQuotedString$okhttp(sb, str);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), body);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @JvmStatic
        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        @JvmStatic
        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m10742deprecated_body() {
            return this.body;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m10743deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    public MultipartBody(ByteString boundaryByteString, MediaType type, List<Part> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = MediaType.Companion.get(type + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    private final long writeOrCountBytes(BufferedSink bufferedSink, boolean z2) throws IOException {
        Buffer buffer;
        if (z2) {
            buffer = new Buffer();
            bufferedSink = buffer;
        } else {
            buffer = null;
        }
        int size = this.parts.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Part part = this.parts.get(i2);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.write(DASHDASH);
            bufferedSink.write(this.boundaryByteString);
            bufferedSink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    bufferedSink.writeUtf8(headers.name(i3)).write(COLONSPACE).writeUtf8(headers.value(i3)).write(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(mediaTypeContentType.toString()).write(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(CRLF);
            } else if (z2) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink.write(bArr);
            if (z2) {
                j2 += jContentLength;
            } else {
                requestBodyBody.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        Intrinsics.checkNotNull(bufferedSink);
        byte[] bArr2 = DASHDASH;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.boundaryByteString);
        bufferedSink.write(bArr2);
        bufferedSink.write(CRLF);
        if (!z2) {
            return j2;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j2 + buffer.size();
        buffer.clear();
        return size3;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m10738deprecated_boundary() {
        return boundary();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m10739deprecated_parts() {
        return this.parts;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = RRWebVideoEvent.JsonKeys.SIZE, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m10740deprecated_size() {
        return size();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m10741deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j2 = this.contentLength;
        if (j2 != -1) {
            return j2;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i2) {
        return this.parts.get(i2);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
