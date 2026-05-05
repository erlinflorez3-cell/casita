package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`c2\u000fq{<$q$yّCU(}*\tUNog|ϺbŏK\u000f\u001c\u0016\u0001jBI]ތe\u0012\u001d8JoE3UoK@hҚ>\u000562*8\u007f\u0005\t\u001a8T\u0018v\u0001DQ0(ؓ^\u0010jR;L=\u001a0%~#Ә\"\\uN~Lz`R/Q\u00072F\\,w0+SUJb.%v\u0010&sDE>-%\u0002\u0005OXiI\u001b? HKho-9U\fWdeF(]i]\u001burlk%Wfϯ5:wcy`>8\u0006\f\u0014\u0019L\u0006\u001e\u0006U[>/*fN\u001da\u0007#cNd\u001ajR\u0002\u000ba|&5\u0002C+g0\u0015c(ݥ\u001f\u05ee;{\u0013#f)\u000f\u00069[\u0003&'9c\\\u0006jISV<vhP}\u0006s\u0012\fz\u0002X\u0017vkH3\n-F\u0017ST,G1\"\u0004\u0004^C\u0016x[\u009etרmRP̷ؗr6"}, d2 = {"\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "u(E", "@dP1X9", "\u001aiPCTuB]bkzZ+|\u0016\u0005", "0xc2F;KS\u0015\u0007", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "0xc2F;KW\"\u0001", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "0xc2f", "", "1gP?F;KS\u0015\u0007", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "1k^@X", "", "1n]@h4>A#\u000f\b\\,", "\"", "", "1n]@h4>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "Ahi2@(I^\u0019\f", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "1n]AX5M:\u0019\b|m/", "", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "And?V,", "Asa6a.", "", "\u0010n\\\u000ej(KS\u0006~v],\n", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN.ZS8\u000fsڔ<$i*yّCU(\u0015*\tUOm˧\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M&@*Py3\n`>\u0011.\u0005\u0005[K:\u001d`D~Fj\r{\u0012J\u0016\u0014L8\u0001Lg\u0018RDW\u0005]h:i\u0017:N\\)w0+PcЂVܮ\u0011viӜ{LE:-%\u0002\t]ѻgύ\u0007?yܵUv5.CK\nVdWVϯ!ۣS\reövh\u0013Qx\fU,&ҭMח\u0012(\u007f\u07beԱ\u0011L"}, d2 = {"\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zT?s!OK 8\u0004%\"Yy\u001f7zk", "\u001aiPCTuB]bkzZ+|\u0016\u0005", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@V}\u001cC\u0001\n\u0006\u007f)?#{#3z$.\\\r\u0019n0+#hp\u000fJT", "1k^@X+", "", "2d[2Z(MS", "1k^@X", "", "@dP1", "", "1ad3", "", "=eU", ":d]", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i2, int i3) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i2, i3);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG@L͜P.`Z2\u000f\u0002{<$i0yCQU\"}(\nUȥh}ñzZ9BO\u000b\u001cx̶0Icx&*\u001d3Zom5}uK<xvL\u0004N6R<\b\n\u0019\u001aXNV{CcY\r*0nrjX\u001bP\u001d\u001c(\u0005l$1\"jnf6vt\u000e>=(\u001bipWmdx\u0015[\u000e^TU\u000f'g,.X9K\u0014SW3\u000b``W\u0003m{\u0004\n1?5,as\u00068\t\u0006\"\u0018CQ#\\!*\r\t_e$'YZ*P\u001936\u0004\u0013{;>,\u000e40x63\u001at\u000b&5\u000bq\u0002D\u0001\bdB\u000e\u0002y6E-F8ڢ=\u001blR*V'[O{3\u000fF#/tQcZ\u000en\u00183V\u000eP_U\u0007B˓R\n_>6\u001f~o\u001a*22o\u007f]\u0006A6\u001d%E^Q%7j0L\u000blЛ\t`nT2mVM:nD9R\t:etl\u000bk^Wp.'LJXM\u0003ݔ\u0017 bx˼%3"}, d2 = {"\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zT?t!Oz\nEz/>/", "", "u(E", "1qT.g,", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "1n]AX5M", "", "1n]AX5M:\u0019\b|m/", "", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "/rA2f7H\\'~Wh+\u0011", "BnA2f7H\\'~Wh+\u0011", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j2, int i2, Object obj) {
            if ((1 & i2) != 0) {
                mediaType = null;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                j2 = -1;
            }
            return companion.create(bufferedSource, mediaType, j2);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charsetCharset$default = Charsets.UTF_8;
            if (mediaType != null && (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = Charsets.UTF_8;
                mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charsetCharset$default);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ResponseBody create(MediaType mediaType, long j2, BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType, j2);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ResponseBody create(MediaType mediaType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ResponseBody create(MediaType mediaType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ResponseBody create(MediaType mediaType, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j2) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j2;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        @JvmStatic
        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        @JvmStatic
        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charset;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super BufferedSource, ? extends T> function1, Function1<? super T, Integer> function12) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            T tInvoke = function1.invoke(bufferedSourceSource);
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedSourceSource, null);
            InlineMarker.finallyEnd(1);
            int iIntValue = function12.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    @JvmStatic
    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ResponseBody create(MediaType mediaType, long j2, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j2, bufferedSource);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0010U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|8\u000ed9z(`lG\r#kHT28H&\u001d\fz4_]HjLHQ\u0012P&W/6H\u00112\u0012xO[5~\u0012^", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @JvmStatic
    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j2) {
        return Companion.create(bufferedSource, mediaType, j2);
    }

    @JvmStatic
    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    @JvmStatic
    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            BufferedSource bufferedSource = bufferedSourceSource;
            String string = bufferedSource.readString(Util.readBomAsCharset(bufferedSource, charset()));
            CloseableKt.closeFinally(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }
}
