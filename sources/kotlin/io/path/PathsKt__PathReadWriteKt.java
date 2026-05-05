package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яĉ\u0014D߬)\u001ew\u007fLDyt\fǻ\u000e0\u0019>J~(,\u001aw\u0015\u0001r9>Om߉6Ri*\u0017k\u00124,[*rK;k\u001a\u0006̝\u0011O\\moñRZ\u0019R\u0017\u0006,xr,OU\u0001](\u000f:Bu@;M\u0006=A`\u0003B\r H\"@y\u000b\u0002\"*^\u0010~zIK\u0014\u0012F@x:X\u000eU\u0005(0\u000e>&\u0001&\\}N>HrhB/9\u0003qBT'wC\u000bձ%F\u0003&5v\u0010\u001e[DE6-%\u0002\u0005MҀaW&MtU\u0005\u0017'O+ws\b@f\u0004,\u001b;Q\u001d]!,\u000b\n\u0002f\u0012'9V{K~\u0016nÃ\u0001\u00140J\u0007&\u0006UHV-Hf8\u0018Ax\u000bYPR\u0012^p\u0006)jf\u001d+\u007fA2Q\u001b\u0015Y(ݪ\u001ffS\n\u000f%\u001eQ\u007f\u0017!\nT>d#&lw\u007f7\u0002FCH\\\u0011q=\u001c\f7g\u001ab\u0012<_\u007f]\t9.E%ga?#/r\u001aHro'\u000bfhawjHn1\u001f&E:!\u0014jHj\u0004{P\u0003jZ\"m\u001c\u0003\u0019Dܹ\u0019ء`wJ4=H\\c\u0001i\u0019b\u0006\nS/\u0017=_ny\u0015o9\r;eWi\u0010o`\u000f\u0014mK\u0013\u0015fvZ[\u001c^b'22v|>\t\u001cD|\u001eYԽEۇ 4:G1\u0018#_\u001b\u001ep@%\t\u000eZ\u0019\u0016\u0005TA+\u001biR|9 ^t\t\u000bw\nY;+zĘ1KWP),[>x6\u0003)-\u001c\u0004\u0002WgzFz\u0006\\߷[ߡ\u001fچ2]_MU\u0013=\u001eQ20-u\\\u0001uiU\"+\u0001{\n\u000fiz\\x(j\u001f>'ʌPׅX\u00170\u0017v\u00171)|\u007f(\u0004nzuc\u0005\u001biNaz\u0013]BMH|31L6!oP\u000f{ԎIے!\u0016\u00067G o\u0002\u0002o\\{\u000b\u000fTt,ׅ2{1}\bicB=HI\b\u0019lHLl1Bxp}\bP\u0010L\raP\bдvnL[2G}\u0015!T\r\u001fV\f@\u0019o\f;F_X{\n\u0003,\rQM)M\u0002\u0011\u0016my\\;P\u0015\n\u0019\u0003In@$m0dgz\u0011@\ny\u0017FAit3M)$b>\u0003ޒ\u0011ͲXi\u0014:\u0013=T\u000b'\u0017xn\u0014=\\Օb%\u0005Vv\u0005\u0011Kf!8\b\u0017\u000fa&)K?2\u0006Xd7s8\u0011U-\tI\u0005}\bv';D\u001beIA\u001fۦ\u0011֮\\ŝ͕\u00066\u0012uA\u001ay\u001f$8F{EBF\u001biU\u001f`\u000f0\r\r\u0006t\\t\u000f\u001avVT!9~)\u000f<M*\u000f9+\u0016Λuܑ1L\\(O\u007f(2/DW\u00074|\u0012FK7\u00149ECYl$'*]\u0002@.\u000e& 5\u000b\r!\u000b_>v\u0018m3B&u\u001ca\u0012\tAbN\u0015NJ#\u0005Pڜ\u000e˩S\u0002A4+\u001bg\u001d\u0010!n'Sl4B{r\u0007\u000e{rspe\u000b1l__*t3P+\u0010?M\\\u001b\tjH!k(h\u0015\u0006\u0013%&MH6sI\u0010}u/ҼqϪ_\r9b\u0004_oeHRL|Gy$\u0004ZX6 SV{D\u0015\u000fblP^&^\u00190\u0015\u0005\u001a9,\u0005\u000fLd\u0010#4t\u0005LuO7G1\"\u0012Ӵd\u0007\u0012zaT/gj?InZ\u000b\u001e('\u0017\t:p{\u0018*p\u0011#\u0010u<ENdA &i$\u001cv17kEfTNϼ\u0017ã\u0015/hpԏ>a\"\u001fAǵco\u0018֯\u0005N"}, d2 = {"/o_2a+\u001bg(~\t", "", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "/qa.l", "", "/o_2a+%W\"~\t", ":h]2f", "", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "/o_2a+-S,\u000e", "BdgA", "0tU3X9>R\u0006~v],\n", "\u001aiPCTuB]b[\u000b_-|\u0016/dl(w?\u0001$l", "0tU3X9,W.~", "", "=oc6b5L", "", "\u001aiPCTuGW#H{b3|R\u0019p\u007f1eK\u0010\u001b!PE", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~W\u0001\u001cD{\u0016=\u0017!>gA,\u0015w7\u001d|J1J\b#\u0011UR6&SvD\u0014[D\u0019N4v\u0010hE.w\u001az\u0006\r(Z}\u0005l\u000bUr\u001e6kpOV\u000f4y\u0011tA6>", "0tU3X9>R\u000b\f~m,\n", "\u001aiPCTuB]b[\u000b_-|\u0016/dq5\u007fO\u0001$l", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~W\u0001\u001cD{\u0016=\u0017!>gA,\u0015w7\u001d|J1J\b#\u0011UR6&SvD\u0014[D\u0019N4v\u0010hE.w\u001az\u0006\r(Z}\u0005l\u000bUr\u001e6kpOV\u000f9\u0007\u0019\u0005A6>", "4na\u0012T*A:\u001d\bz", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":h]2", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ1J\b#\u0011PXu@[}M#\u007fi\u001bN'\u0015Z", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0018XCDU?-\u0019rj\u000fJJ1J\b#\u0011PXuFb\u0002H$!H\u001d[+\t\r/", "@dP15@MS'", "@dP1?0GS'", "", "@dP1G,Qb", "@dP1X9", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004-\u0001\u0013\u0016G|c", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~W\u0001\u001cD{\u0016=\u0017!>gA,\u0015w7/mh(_rpPPXu]Vy=]{e\u000eW\u0015\u0018\u0014]K-D\b\u001e$\u0004=EK?rJo\u001f\u0019Ey^Qc\u0010C\u0002\u0002u=(hS/", "CrT\u0019\\5>a", "\"", "0k^0^", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~W\u0001\u001cD{\u0016=\u0017!>gA,\u0015w7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "EqXAX\tRb\u0019\r", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016vs\r.t\nMrn>]\bi8q\u001d.\u0017-Fk=\b weC\u00109o?", "EqXAX\u0013B\\\u0019\r", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#a/7z\u0012+TC\u0011R9\u001a&d+B\u000bmuLy#TZN;&0u9! Z\u001d$!s\nUR 8M;)Q-M\t;2j\u0017\u0016\u0017\u001fu\u007fF`\u0019\u001d={z=:d\u0010bc\u0004\u0011BIi*.v[,_\u0010", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001d!Vv\u0012E@35e\u000e @k\u0016<\u00171;wD\u001e\u001efa\u000fmh(_rpPPXuZUnJ\"\u0012iW,.\t\u0012gA3D:\u001e$\u0004=EKDl\u000bU\u0017\u0012<j:,a\u0010Pc \u0005E3q\u001c\u001dF~CRA,3h\u0016)\u001e`A:m~m(\u001e>", "EqXAX\u001b>f(", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#[#3z\u0004.YS;t2\u001ejOf5\u0018_uWz1\u0011JQ(i`rL]o]\n[9\r\u0014/7\u000bs@H\u001bQ5M\f\u0005i\u0005\u0013\u0016W\u001fupK@\u001bV}\u001f~\u0017lY", "EqXAX9", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHr$\u001bVo\u001b\u0012", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~W\u0001\u001cD{\u0016=\u0017!>gA,\u0015w7/mh(_rpPPXu]Vy=]{e\u000eW\u0015\u0018\u0014]K-D\b\u001e$\u0004=EK?rJu&\u001d@z\u007f0e\u001dGu\u001dgN-wFf5", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{5:x9);.s\u0014$6)3\n2")
class PathsKt__PathReadWriteKt {
    private static final void appendBytes(Path path, byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Files.write(path, array, StandardOpenOption.APPEND);
    }

    private static final Path appendLines(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final Path appendLines(Path path, Sequence<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, SequencesKt.asIterable(lines), charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path appendLines$default(Path path, Iterable lines, Charset charset, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path appendLines$default(Path path, Sequence lines, Charset charset, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, SequencesKt.asIterable(lines), charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    public static final void appendText(Path path, CharSequence text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            CloseableKt.closeFinally(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            charset = Charsets.UTF_8;
        }
        PathsKt.appendText(path, charSequence, charset);
    }

    private static final BufferedReader bufferedReader(Path path, Charset charset, int i2, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(Path path, Charset charset, int i2, OpenOption[] options, int i3, Object obj) throws IOException {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    private static final BufferedWriter bufferedWriter(Path path, Charset charset, int i2, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(Path path, Charset charset, int i2, OpenOption[] options, int i3, Object obj) throws IOException {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    private static final void forEachLine(Path path, Charset charset, Function1<? super String, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
        try {
            Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ void forEachLine$default(Path path, Charset charset, Function1 action, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
        try {
            Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final InputStream inputStream(Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return inputStreamNewInputStream;
    }

    private static final OutputStream outputStream(Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return outputStreamNewOutputStream;
    }

    private static final byte[] readBytes(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        Intrinsics.checkNotNullExpressionValue(allBytes, "readAllBytes(...)");
        return allBytes;
    }

    private static final List<String> readLines(Path path, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    static /* synthetic */ List readLines$default(Path path, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    public static final String readText(Path path, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String text = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return PathsKt.readText(path, charset);
    }

    private static final InputStreamReader reader(Path path, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ InputStreamReader reader$default(Path path, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    private static final <T> T useLines(Path path, Charset charset, Function1<? super Sequence<String>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
            Intrinsics.checkNotNull(bufferedReader);
            T tInvoke = block.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ Object useLines$default(Path path, Charset charset, Function1 block, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            BufferedReader bufferedReader = bufferedReaderNewBufferedReader;
            Intrinsics.checkNotNull(bufferedReader);
            Object objInvoke = block.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final void writeBytes(Path path, byte[] array, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    private static final Path writeLines(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    private static final Path writeLines(Path path, Sequence<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, SequencesKt.asIterable(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path writeLines$default(Path path, Iterable lines, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (i2 | 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path writeLines$default(Path path, Sequence lines, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (i2 | 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, SequencesKt.asIterable(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    public static final void writeText(Path path, CharSequence text, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            CloseableKt.closeFinally(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            charset = Charsets.UTF_8;
        }
        PathsKt.writeText(path, charSequence, charset, openOptionArr);
    }

    private static final OutputStreamWriter writer(Path path, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(Path path, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }
}
