package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я\\\u001d̉=!4i\bDZc|İI\u0006>\u00116B\u0015\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*\t]Zo˧vJh\u0012K\u000f\f\u0016\u0001j:Y]xc\u0013\u00172XoG3SpE9vt>ӌ(288\u0002ڎ\u0019/8Ϻ(v)Bs\f@0pv@R\u001bN\u001d\u001a@\b\u0005İ\u00076quޮNH\u001b`b/Q\u0007\u001aHT'm1\u0015M;H\u001bܓ\u0013\u000fv,0X7c\u001bMS1\u0007\u0003aE\u0003MxU\u0005\u0017/mǪO\flDa\u0018\u0014C5w\r\fvVb\u000bQn\u0013?+}k\u0012ּ\u0014@\r\t\u0007%<2\u001a.'v;] l\b\u001c:\rr\u0002H\u0017ؤdZ\u001a\toN\u0017S\u000f[+g\u001b\u0017UoK1Ne\u007f5\u0013$#\u000fo9[\u0003\u0010x )e\u0010Q_]h=v`PԷC\u0006\u001f~s\u001a*2<o\u007f]\u000eA2%8O[g%Qo\u0010\\\\g%\u0007'íY\u0002]VU:nDMR\t:Y\u000bߦ\u0005\u0004ZboD\u0011{.|\u0007,\bY%t\fJ8=\u0010|a\u0011i\u0019M\u000e\u0010+/tOqn\u001a\u0010\u001e>vHCj{\u0010\u0010l\u001f\u0014m<\u0013\u000b^fPZ$Z\u000b0hýN\u0003%\u0006\u0017\\N:/Z?  d27\u0019j\u001c`\u0003LJ\bҙ\u000fމ^\u0006"}, d2 = {"0tU3X9>R", "\u001aiPCTuB]b[\u000b_-|\u0016/dc1\u0007P\u0010\u0005&To\nDL", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "0tU3X9,W.~", "", "\u001aiPCTuB]b[\u000b_-|\u0016/di8\u000bK\u0011&\u0005V|\u000e8~z", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "0tU3X9>R\u0006~v],\n", "\u001aiPCTuB]b[\u000b_-|\u0016/dl(w?\u0001$l", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "0tU3X9>R\u000b\f~m,\n", "\u001aiPCTuB]b[\u000b_-|\u0016/dq5\u007fO\u0001$l", "0xc2<5Ic(l\nk,x\u0011", "\u001aiPCTuB]b[\u000fm,X\u0016<a\u0014\f\u0005K\u0011&\u0005V|\u000e8~z", "", "1n_FG6", "", "=tc", "7m_Bg\u001aM`\u0019z\u0003", "", "=eU@X;", ":d]4g/", "7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001d\u0015&\u0017+~\u000eIr4?fS", "@dP15@MS'", "3rc6`(MS\u0018l~s,", "@dP1X9", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004-\u0001\u0013\u0016G|c", "EqXAX9", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHr$\u001bVo\u001b\u0012", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ByteStreamsKt {

    /* JADX INFO: renamed from: kotlin.io.ByteStreamsKt$iterator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я)\u001d̉=!4i\bӵLc\u0003\rI\u00066\u000e6B\r(4\u0012}\rnjG3L͜P.`S2ş\u0014zé*c:ڎs;\u0004\u0019F)\u0017^fg\u0016o\u0011Ұ\u000b\f\u0015\u0014\u001c\u0011jZY\u001c\r&\u0018\u001dCZomE\u0014o\u000eQntN\u0005N3x؇\u0006ڱ\u0005&2Ϻ(x\u0001EY\u000f22FtHW]e\u0013 *\u0006l'WȭhʄRBPǍu<5+\u0011rbP-i>\b\u001e%T`?\r%btѯL˝9!-م\u001b\tXhM\u0006_sC\u0013v,ݹ/\\"}, d2 = {"9nc9\\5\bW#HWr;|v>r\u007f$\u0004Nf&UK~\u000eIr4?f<k", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001d\u0015&\u0017+~\u000eIr4?fS", "4h]6f/>R", "", "5dc\u0013\\5Ba\u001c~y", "u(I", "Adc\u0013\\5Ba\u001c~y", "uY\u0018#", "<dgA5@MS", "", "5dc\u001bX?M0-\u000ez", "u(8", "Adc\u001bX?M0-\u000ez", "uH\u0018#", "<dgAC9>^\u0015\fz]", "5dc\u001bX?M>&~\u0006Z9|\b", "Adc\u001bX?M>&~\u0006Z9|\b", "6`b\u001bX?M", "", ">qT=T9><\u0019\u0012\n", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends ByteIterator {
        final /* synthetic */ BufferedInputStream $this_iterator;
        private boolean finished;
        private int nextByte = -1;
        private boolean nextPrepared;

        AnonymousClass1(BufferedInputStream bufferedInputStream) {
            bufferedInputStream = bufferedInputStream;
        }

        private final void prepareNext() throws IOException {
            if (this.nextPrepared || this.finished) {
                return;
            }
            int i2 = bufferedInputStream.read();
            this.nextByte = i2;
            this.nextPrepared = true;
            this.finished = i2 == -1;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final int getNextByte() {
            return this.nextByte;
        }

        public final boolean getNextPrepared() {
            return this.nextPrepared;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            prepareNext();
            return !this.finished;
        }

        @Override // kotlin.collections.ByteIterator
        public byte nextByte() throws IOException {
            prepareNext();
            if (this.finished) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b2 = (byte) this.nextByte;
            this.nextPrepared = false;
            return b2;
        }

        public final void setFinished(boolean z2) {
            this.finished = z2;
        }

        public final void setNextByte(int i2) {
            this.nextByte = i2;
        }

        public final void setNextPrepared(boolean z2) {
            this.nextPrepared = z2;
        }
    }

    private static final BufferedInputStream buffered(InputStream inputStream, int i2) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }

    private static final BufferedOutputStream buffered(OutputStream outputStream, int i2) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 8192;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }

    static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long copyTo(InputStream inputStream, OutputStream out, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            out.write(bArr, 0, i3);
            j2 += (long) i3;
            i3 = inputStream.read(bArr);
        }
        return j2;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 8192;
        }
        return copyTo(inputStream, outputStream, i2);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    private static final ByteArrayInputStream inputStream(byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i2, i3);
    }

    public static final ByteIterator iterator(BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt.iterator.1
            final /* synthetic */ BufferedInputStream $this_iterator;
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            AnonymousClass1(BufferedInputStream bufferedInputStream2) {
                bufferedInputStream = bufferedInputStream2;
            }

            private final void prepareNext() throws IOException {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int i2 = bufferedInputStream.read();
                this.nextByte = i2;
                this.nextPrepared = true;
                this.finished = i2 == -1;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final int getNextByte() {
                return this.nextByte;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            @Override // java.util.Iterator
            public boolean hasNext() throws IOException {
                prepareNext();
                return !this.finished;
            }

            @Override // kotlin.collections.ByteIterator
            public byte nextByte() throws IOException {
                prepareNext();
                if (this.finished) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                byte b2 = (byte) this.nextByte;
                this.nextPrepared = false;
                return b2;
            }

            public final void setFinished(boolean z2) {
                this.finished = z2;
            }

            public final void setNextByte(int i2) {
                this.nextByte = i2;
            }

            public final void setNextPrepared(boolean z2) {
                this.nextPrepared = z2;
            }
        };
    }

    public static final byte[] readBytes(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0004y\u0016[:`<\u007fc\\t\u000ekb\u000e9\u0011w\rV6]w~V\u00049z(QwVViiMK\"&C,[\f\n#jIHjR9$", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "", warningSince = "\u000bc>")
    public static final byte[] readBytes(InputStream inputStream, int i2) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i2, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 8192;
        }
        return readBytes(inputStream, i2);
    }

    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
