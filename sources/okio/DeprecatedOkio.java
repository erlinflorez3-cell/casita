package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
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
/* JADX INFO: loaded from: classes6.dex */
@Deprecated(message = "&N|Cxy\u0019\u0017aUgi[\u001e;\u000e.\u001a!")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:X]xs\u0012\u00172HoG3coE9ft<Ԕ HĲhy3\u007fZ/N\u0010ͯ~CY\fZ>NqRR;O5\u001e \tV /\"#l\u0017<Vqu:]%In\u000b\\5eH|{\u0014vX5\u0015\u000faL-\u0007<}#3Y\u001b\u0007\u0001do\u0007M{U\u0005\u00172m0\u0012\u0002e>p\u007fB\u0017[S\u001b`\u000b&\u000b\t\u0018eT59W{K~\u0010X{\t\b%<2\u001bL,\u0011<;\"~\b<5%vaNh\u0002\rQF\u007f*]%-\u00183Y;Kj_qS\u0019|H,\u0015\u001b0;\t~%aS\u001e`C/\u0003\u000bq1\u007fT\u0004Mݳ\u000eYK\u0003L~p\fB\u0004^R03\n\u0014F\u0017S;\">k/y\f`D\u0016\u00025dvi\u0002RvWhs^E8\u0013$Zro5o^bp,?\\bYO%\u0016\u001d8\\&GQ)\u001e^gh\u0018{}m\u00187GnG]tj\u001eWgraHqc>u\u0019{݀C<p\u001d׃j["}, d2 = {"\u001anZ6bu\u00062\u0019\n\b^*x\u0018/di.\u007fJV", "", "u(E", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001aiPCTuB]b_~e,R", "0kP0^/HZ\u0019", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "And?V,", "\u001anZ6bu,])\fx^\u0002", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "AnR8X;", "\u001aiPCTuGS(Hhh*\u0003\t>;", ">`c5", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "=oc6b5L", "", "\u001aiPCTuGW#H{b3|R\u0019p\u007f1eK\u0010\u001b!PE", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ6Tz1\u0011:R5b(", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ6Tz1\u0011:X<iPr\u0013", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @InterfaceC1492Gx
    public final Sink appendingSink(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio.appendingSink(file);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @InterfaceC1492Gx
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @InterfaceC1492Gx
    public final BufferedSink buffer(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return Okio.buffer(sink);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    @InterfaceC1492Gx
    public final BufferedSource buffer(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return Okio.buffer(source);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    @InterfaceC1492Gx
    public final Sink sink(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @InterfaceC1492Gx
    public final Sink sink(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    @InterfaceC1492Gx
    public final Sink sink(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return Okio.sink(socket);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @InterfaceC1492Gx
    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    @InterfaceC1492Gx
    public final Source source(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio.source(file);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    @InterfaceC1492Gx
    public final Source source(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    @InterfaceC1492Gx
    public final Source source(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return Okio.source(socket);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    @InterfaceC1492Gx
    public final Source source(java.nio.file.Path path, OpenOption... options) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
