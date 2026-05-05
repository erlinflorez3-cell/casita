package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,i\bӵLc\u0003İI\u0006>\u00146B\r%4\u0012\u0006\u0011njGGLeV2ZS8\u0014s{B*c$\u007fJCU(\u0006*\tUNog|Vb\u000bI\u0010\u001e'\u0007̓DI\u0004w\u000e\u0018\u001d2ZqU2{p\u0004ʨf\rE\u0013ړJ\"fx5\u0005(*`\u0010%|\nſ\u0012*?N\u0081RR;L5\u001e \u0006V /!#ɩTNWzҗR/Q\u0002\u001aF\\'w0+QSЇZ?\u001c\u0005ѭ6+n6e\u00193S\u001b\u0007\u0001`\u0006ũE\nL\u0013ؒ?'YH$[DX\u0018\u0014C1\u0016՝c\u000b5jӤi`:&[SqKh\u000eV~AԐ\u0013T\u0013\u001cͺ?H\\,Jj\u0016\u000eKt![\u0007И\bvQ\u000eЭy6E$07993f\u007fj\u0002ϒTO\u000b\u0013ټ6#/mQ_b\u000ex\u0015I^>\u038b7iGKSf\n\b<4Ֆvz\u00138\u000fHG..,\u0017<\u0017=9q8Q\"2ȽN\\v\u0005\u0010xh\u0002h\u0003LN\"\u0007\u0016e,Oȹ`\\s\u0013vhT\u0007+AQ*T\u001f}6\u0016fχ}T03\u001bfO\u0017h\u001bQk\n=/\u0015; ʬq&fGiK5\u007fb@e`v,?jgK֢lZb\u001aet(P1xn\u001ew\u0014D|\u0012YԽE\n+B7I\u0019\u000b\u0014x\u0007,BY|7f!Ә\u0016\u0017cA/\u001biRs9\u0005^\\\to\u0016\u0001\u0010؛\u0003x1;Li5G%\u0006&v4\u0015#5\b:ÚM\u007f[UW\u0005\u0016$T,$$\u001aQQ]GYÉ\u0005A8\u00109]N\td\u007fZ*-\t\u000b\u0012\u000fiutl r~;xl`N\u0003$h{ݎv3"}, d2 = {">qX;g", "", ";db@T.>", "", "", "", "", "", "", "", "", "", "", ">qX;g3G", "@dP1?0GS", "", "@dP1_5", "@dP1_5(`\u0002\u000f\u0002e", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ConsoleKt {
    private static final void print(byte b2) {
        System.out.print(Byte.valueOf(b2));
    }

    private static final void print(char c2) {
        System.out.print(c2);
    }

    private static final void print(double d2) {
        System.out.print(d2);
    }

    private static final void print(float f2) {
        System.out.print(f2);
    }

    private static final void print(int i2) {
        System.out.print(i2);
    }

    private static final void print(long j2) {
        System.out.print(j2);
    }

    private static final void print(Object obj) {
        System.out.print(obj);
    }

    private static final void print(short s2) {
        System.out.print(Short.valueOf(s2));
    }

    private static final void print(boolean z2) {
        System.out.print(z2);
    }

    private static final void print(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    private static final void println() {
        System.out.println();
    }

    private static final void println(byte b2) {
        System.out.println(Byte.valueOf(b2));
    }

    private static final void println(char c2) {
        System.out.println(c2);
    }

    private static final void println(double d2) {
        System.out.println(d2);
    }

    private static final void println(float f2) {
        System.out.println(f2);
    }

    private static final void println(int i2) {
        System.out.println(i2);
    }

    private static final void println(long j2) {
        System.out.println(j2);
    }

    private static final void println(Object obj) {
        System.out.println(obj);
    }

    private static final void println(short s2) {
        System.out.println(Short.valueOf(s2));
    }

    private static final void println(boolean z2) {
        System.out.println(z2);
    }

    private static final void println(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream in = System.in;
        Intrinsics.checkNotNullExpressionValue(in, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in, charsetDefaultCharset);
    }

    public static final String readln() {
        String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    public static final String readlnOrNull() {
        return readLine();
    }
}
