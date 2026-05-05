package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.internal.ResourceFileSystem;
import yg.InterfaceC1492Gx;

/* JADX INFO: Access modifiers changed from: package-private */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001e\u007f\u007fLDit\fA\u00149\u0013.X~*,(w\u000ffp98D{H6Ri*\u0017ӆ\u00044:[,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :Ĳ@y\u001b\u0001\"*N\u0010~zYK\u0014\u0012F@x:h\rUĨ\"\u0012\u0014M(\u00014\\oN<Ht]P/+\u0003oBf/m6\u0015M;M|';~y&9IO5C/{\u00035]sO\u0011K\n=3uO'YP$[Df\u0018\u0014C:g\u001dk\u0003>\\3b\t\fU=\u007fgY^&(&\n\u0014\u001dJ\u0017&\u0006U\\V-Hm8\u0012A\n\u000bSnf\u001anP\u0013\u0013ad+M\u007fa2i\u001fthy;GfO\f\u0013&6#/\tI[\u0003 \u0011\u0019)i\u0010Q_gXMVg\"Yk\b,p\u0011\u0014Z\b>^\u0018/*)F+3Rs9Q(\u0014\u0002vL\u0018|\u000b`vo\u0002RvBhs.?8$$Zrk-k~qp4\u001fh4T5\u00050\u0013Nz\u0010]/@(N}o\u0012j{|:5=\u0007Oa~o\u0014VI^aW\u007f\u00050a\u0001\u0019݀C<p(pnPw$Z\u000b:J2vr(\u007f\nhf\fADgqJYD9'\u0001-H10jA+'w{v4\u0017Ta6+iR\u00149\u0011^|\tww|O+\r`POorU\u0019Twɋl4\u000bI'\u0013\u0002Ò_ojGtn,t\u0004zN\u0015pߜSȠA\u0013\u0017ȯIL\u0010.]L!gyQ@*c|X\u0013q'\u0005ԗ\nϡt0xlPPb\u001cȚz\u0006"}, d2 = {":nV4X9", "\u001aiPCTuNb\u001d\u0006De6~\u000b3n\u0002qbJ\u0003\u0019\u0017TE", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7r0;W9HW\u0018`zm:\u0007\u00075n{0{ \u000e$!T", "", "\u001aiPCTuEO\"\u0001D::\u000b\t<t\u00042\u0005 \u000e$!TE", "\u001aj^A_0G\u001dt\r\t^9\f\r9n_5\tJ\u000el", "uKY.i(\bZ\u0015\b|(\b\u000b\u0017/r\u000f,\u0006I`$$Q|c\u007fk", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "\u001aiPCTuB]b_~e,R", "/rA2f6N`\u0017~[b3|vCs\u000f(\u0004", "\u001anZ6bu\u001fW ~hr:\f\t7;", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "1h_5X9,W\"\u0005", "\u001anZ6bu\u001cW$\u0002zk\u001a\u0001\u00125;", "1h_5X9", "\u001aiPCT?\bQ&\u0013\u0006m6Ff3p\u0003(\t\u0016", "1h_5X9,])\fx^", "\u001anZ6bu\u001cW$\u0002zk\u001a\u0007\u0019<c\u007f}", "\u001anZ6bu,])\fx^\u0002", "6`b5\\5@A\u001d\b\u0001", "\u001anZ6bu!O'\u0002~g.j\r8kU", "2hV2f;", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u0017e\u000e6wB\u0001u\u001bIo\u001cKL", ";`R", "\u001aiPCT?\bQ&\u0013\u0006m6Fp+cU", "6`b5\\5@A#\u000f\b\\,", "\u001anZ6bu!O'\u0002~g.j\u0013?r}(Q", "Ah]8", "/o_2a+", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "\u001aiPCTuGS(Hhh*\u0003\t>;", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "=oc6b5L", "", "\u001aiPCTuGW#H{b3|R\u0019p\u007f1eK\u0010\u001b!PE", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ6Tz1\u0011:R5b(", "And?V,", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ6Tz1\u0011:X<iPr\u0013", "=jX<"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 48, xs = "B=:?}\u001d85:")
public final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest digest) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSink(sink, digest);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest digest) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSource(source, digest);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static final Sink sink(File file, boolean z2) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z2));
    }

    public static final Sink sink(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Sink sink(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z2, int i2, Object obj) throws FileNotFoundException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        return Okio.sink(file, z2);
    }

    public static final Source source(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Source source(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Source source(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }
}
