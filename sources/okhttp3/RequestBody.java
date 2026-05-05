package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007fјnjG9LeN.ZS8\u000fsڔ<$q$yCAU \"8ޛmZ\u0018g\u001dI\u0013\nOO\tȀ|j:I\u001e~k\u0013'2pq\u0006G\u0016wK<xvL\u0004N6h\\B\u000b\u000f\u001fBH>|AW\u0014\u0012 7XphXSaM( \u000eV /'\rk\\@`l\fEuGɮmO"}, d2 = {"\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "", "u(E", "1n]AX5M:\u0019\b|m/", "", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "7r3Bc3>f", "", "7r>;X\u001aA](", "EqXAX\u001bH", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`c2şs{B*cҕyCIa\"}8\tWNmhtЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\bM4eok;\u0011zD\b8487(\t1\u001e8M(v)I\u0012\u0011Z\\NqRR;O5  \tV\"\u0017\u001d\u000bk~:Vsu:]+3oHN5hH|{\u0017vZ-\r\u0005l6+nA{\u001amk\u0011\bj[m\u0005owK\b\u0001)=*ww\b:f\u0007,\u0015Y[Sb;>j\u0006i`:)[UqNh\u0010>v)\u007f=@\u0012\u0015\u001e'v;s\u001f/#\u001cA\rr\u0002Bx\u0002\rH0\u0003g6%(\u00185A8Ij\u0018fޅ\u001dN=|M<,2\u0019nO]|\u000e\u000f\u001dK\\}Q?TX?^M8]ms\npp\u000bB\u0004^Q05\u0002\u0011<\"=7\nCi&Ƞ\u0006HJh? nwki\u0001Jh\"\u001d\"g2\u000f\fhG|\u0007\u0002O\u0003\\r\u0016ܖ T\r~P..k\u0010<O'8N}u\u001arS]\u0018(GhMX\u001doT\\ߍb3;RӘ\u0014q"}, d2 = {"\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010~^!\u001fRk\u0017@\u0001.\u000b", "", "u(E", "1qT.g,", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "4h[2", "\u001aiPCTuB]b_~e,R", "1n]AX5M", "", "=eU@X;", "", "0xc266N\\(", "", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "/rA2d<>a([\u0005]@", "BnA2d<>a([\u0005]@", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((4 & i4) != 0) {
                i2 = 0;
            }
            if ((i4 + 8) - (i4 | 8) != 0) {
                i3 = bArr.length;
            }
            return companion.create(mediaType, bArr, i2, i3);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, int i3, int i4, Object obj) {
            if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                mediaType = null;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return companion.create(bArr, mediaType, i2, i3);
        }

        @JvmStatic
        public final RequestBody create(final File file, final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    Source source = Okio.source(file);
                    try {
                        sink.writeAll(source);
                        CloseableKt.closeFinally(source, null);
                    } finally {
                    }
                }
            };
        }

        @JvmStatic
        public final RequestBody create(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charsetCharset$default = Charsets.UTF_8;
            if (mediaType != null && (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = Charsets.UTF_8;
                mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
            }
            byte[] bytes = str.getBytes(charsetCharset$default);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#nBR#yy\u0013hS\u000f/]VO%D=$\u001f[SX*6:\u000b\u000bKY82L", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return create(file, mediaType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, byte[] content, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create$default(this, mediaType, content, i2, 0, 8, (Object) null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final RequestBody create(MediaType mediaType, byte[] content, int i2, int i3) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType, i2, i3);
        }

        @JvmStatic
        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        @JvmStatic
        public final RequestBody create(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(byte[] bArr, MediaType mediaType, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, mediaType, i2, 0, 4, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i2, final int i3) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i2, i3);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i3;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.write(bArr, i2, i3);
                }
            };
        }
    }

    @JvmStatic
    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#nBR#yy\u0013hS\u000f/]VO%D=$\u001f[SX*6:\u000b\u000bKY82L", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i2) {
        return Companion.create(mediaType, bArr, i2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i2, int i3) {
        return Companion.create(mediaType, bArr, i2, i3);
    }

    @JvmStatic
    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    @JvmStatic
    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i2) {
        return Companion.create(bArr, mediaType, i2);
    }

    @JvmStatic
    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i2, int i3) {
        return Companion.create(bArr, mediaType, i2, i3);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;
}
