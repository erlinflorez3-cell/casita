package com.facebook.imageformat;

import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Throwables;
import com.facebook.imageformat.ImageFormat;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4Zݷ2\u000f\u0002{<řc$\bCC٥\"}0\tWNmh\u0005Ϻx\u001as\u000f4\u00151i;\nZ~]ܫ\u00132Po\b?[wU9\u000f}f\t.<:8(\u0010I.8T(v)P{\u0018 1XxJT\u001dM3\u001d(\u0005l\"I$juf6vy$:\u007f7\u0011jZV7a@|{\u0010\\SU\u000fMѰ*ҋD7=Ֆu_\u0011\u000bj[m\b\u0016п?ݾl'/Ǣ\u001a\u007fe<p\u007fB\u001c\u0002̀\u0019ǁv&dӤŒd\u001c"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\fPC9q4+j", "", "u(E", "1tbAb4\"[\u0015\u0001z?6\n\u0011+t]+{>\u0007\u0017$U", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%l.MHs0-rka7\rc9$", "2dU.h3M4#\f\u0003Z;Z\f/c\u0006(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9l<w!E`\r\u0004?i\u0018..MHs0-rka7\rc9$", ";`g\u0015X(=S&ezg.\f\f", "", "2dc2e4B\\\u0019b\u0003Z.|i9r\b$\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7r", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "Adc\u0010h:M]!b\u0003Z.|i9r\b$\u000b\u001e\u0004\u0017\u0015Mo\u001bJ", "", "CoS.g,&O,azZ+|\u0016\u0016e\t*\u000bC", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageFormatChecker {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<ImageFormatChecker> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ImageFormatChecker>() { // from class: com.facebook.imageformat.ImageFormatChecker$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageFormatChecker invoke() {
            return new ImageFormatChecker(null);
        }
    });
    private List<? extends ImageFormat.FormatChecker> customImageFormatCheckers;
    private final DefaultImageFormatChecker defaultFormatChecker;
    private int maxHeaderLength;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u001bs{:$c$\u007fICU }*\t]^o˧tЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b}M:eokA\u0011xD\u000e82PB@\nI*8O(v)K{\u0012 ;XrPQ;YK\u001fZ\u0014L-\u0019\u001e\u000bo~:Vuu:]-In\u000bl5mH|{\u001cvX5\u001d\u000faL:p;C\u001e=S1\u0011\u0003_M\u0014Wqk\u0017/'wDWto6\u0007\u0002JZ\u0002̄՚]ę*f\rSf\u001151geQS\u001c,ä~\u000f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\fPC9q4+SFkA\u0012_5R\u00010\u001d", "", "u(E", "7mbAT5<S", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\fPC9q4+j", "5dc\u0016a:MO\"|z", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\u0002!$Ok\u001d\u0006Z-1[}\u0001Az\u001e*\\!>k2$\u0015u7", "7mbAT5<SW}ze,~\u0005>e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u0016`(@Sy\t\bf(\f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7r", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "4h[2a(FS", "", "5dc\u0016`(@Sy\t\bf(\f\u0003!r{3_*`*\u0015Gz\u001d@\u0001.", "@dP1;,:R\u0019\f[k6\u0005v>r\u007f$\u0004", "", ";`g\u0015X(=S&ezg.\f\f", "7lP4X\u000f>O\u0018~\b;@\f\t=", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int readHeaderFromStream(int i2, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!inputStream.markSupported()) {
                return ByteStreams.read(inputStream, bArr, 0, i2);
            }
            try {
                inputStream.mark(i2);
                return ByteStreams.read(inputStream, bArr, 0, i2);
            } finally {
                inputStream.reset();
            }
        }

        @JvmStatic
        public final ImageFormat getImageFormat(InputStream is) throws IOException {
            Intrinsics.checkNotNullParameter(is, "is");
            return getInstance().determineImageFormat(is);
        }

        @JvmStatic
        public final ImageFormat getImageFormat(String str) throws Throwable {
            ImageFormat imageFormat;
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        imageFormat = getImageFormat(fileInputStream2);
                        Closeables.closeQuietly(fileInputStream2);
                    } catch (IOException unused) {
                        fileInputStream = fileInputStream2;
                        imageFormat = ImageFormat.UNKNOWN;
                        Closeables.closeQuietly(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        Closeables.closeQuietly(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused2) {
            }
            return imageFormat;
        }

        @JvmStatic
        public final ImageFormat getImageFormat_WrapIOException(InputStream is) throws Throwable {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return getImageFormat(is);
            } catch (IOException e2) {
                RuntimeException runtimeExceptionPropagate = Throwables.propagate(e2);
                Intrinsics.checkNotNullExpressionValue(runtimeExceptionPropagate, "propagate(ioe)");
                throw runtimeExceptionPropagate;
            }
        }

        @JvmStatic
        public final ImageFormatChecker getInstance() {
            return (ImageFormatChecker) ImageFormatChecker.instance$delegate.getValue();
        }
    }

    private ImageFormatChecker() {
        this.defaultFormatChecker = new DefaultImageFormatChecker();
        updateMaxHeaderLength();
    }

    public /* synthetic */ ImageFormatChecker(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final ImageFormat getImageFormat(InputStream inputStream) throws IOException {
        return Companion.getImageFormat(inputStream);
    }

    @JvmStatic
    public static final ImageFormat getImageFormat(String str) {
        return Companion.getImageFormat(str);
    }

    @JvmStatic
    public static final ImageFormat getImageFormat_WrapIOException(InputStream inputStream) {
        return Companion.getImageFormat_WrapIOException(inputStream);
    }

    @JvmStatic
    public static final ImageFormatChecker getInstance() {
        return Companion.getInstance();
    }

    private final void updateMaxHeaderLength() {
        this.maxHeaderLength = this.defaultFormatChecker.getHeaderSize();
        List<? extends ImageFormat.FormatChecker> list = this.customImageFormatCheckers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            Iterator<? extends ImageFormat.FormatChecker> it = list.iterator();
            while (it.hasNext()) {
                this.maxHeaderLength = Math.max(this.maxHeaderLength, it.next().getHeaderSize());
            }
        }
    }

    public final ImageFormat determineImageFormat(InputStream is) throws IOException {
        Intrinsics.checkNotNullParameter(is, "is");
        int i2 = this.maxHeaderLength;
        byte[] bArr = new byte[i2];
        int headerFromStream = Companion.readHeaderFromStream(i2, is, bArr);
        ImageFormat imageFormatDetermineFormat = this.defaultFormatChecker.determineFormat(bArr, headerFromStream);
        if (imageFormatDetermineFormat != ImageFormat.UNKNOWN) {
            return imageFormatDetermineFormat;
        }
        List<? extends ImageFormat.FormatChecker> list = this.customImageFormatCheckers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ImageFormat imageFormatDetermineFormat2 = ((ImageFormat.FormatChecker) it.next()).determineFormat(bArr, headerFromStream);
                if (imageFormatDetermineFormat2 != ImageFormat.UNKNOWN) {
                    return imageFormatDetermineFormat2;
                }
            }
        }
        return ImageFormat.UNKNOWN;
    }

    public final void setCustomImageFormatCheckers(List<? extends ImageFormat.FormatChecker> list) {
        this.customImageFormatCheckers = list;
        updateMaxHeaderLength();
    }
}
