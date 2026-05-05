package com.facebook.imageutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Pair;
import androidx.core.util.Pools;
import com.facebook.common.memory.DecodeBufferHelper;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007njO0LeN1ZS8\u0014s{:'c$\u007fLCU }*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xk\"\u0017˰JoU3UoC9htL\u0005(2(;\u0002\u0005\u0017\u001a2H\u0016v\u0003CY\f\u001a0Fq@Ŭ\rcĨJ\u00124=`\u0006$\\ʄR6Vl&B=7\u001bkXMUfv|\u0016)Ti?\u001b\u0007c.+n9E\u00175S1\thZm\u0019ouK\u001c\u0001'UC\u0010x Tf\u0015,#;Q\u001d]!(l\u0007a`:)AN\u0012a\u0001\u00146\u0011\u0013}#;2(L,\u0011L;/~\u0016\u001e5\u0005r\u0002B`\u0004nB.|w5E;099T3hg`i5\u0015<D\u0015\u001b;;\u0001\u001d?\fZ\u001cy-\u001djv\u007fK\u0018E\u0006X\\)q=\u001c\u0006!h\u0010J\u001c2]~]\u001dW3_EE}Q#Om2LR\u000b\u000f\u0005\u000fj\u0004m`lX\"\u001d\u0018g0\u0017,rFz\u0004\u001aq\u001b]t![Al\u0007,\nC&j\u001eT#;\u000f|v/n3Sk2=/\u0015> n4\u001cebv3c{\u0014\u0014o}\u000f\u0014mC)\u0005!tP\u007f$Z\u000bRR6V|(w*W\u0015\u0011c>Mr44Z3o©gȠ\u0007\u001eJˆM\u0015m]\u0001\u0010-V\nɻUȐ(t\u0011ɖ!h~s\u007fxw.SʧtέEQ=ӧvv0mL\u00053\u000b\u000fu\u0016F\u0016SuR#VLɠݭ ک\u001eCY1C\u001d\u001d\nA4\b5SUCq_Y*')\nPҿ\u000eÿ2g\u0010ξA8nxbO\u0003\u0019xԱ1ѓ'\blрJmT\n_c\u0003\r2ų\u001c\u03a2\u0007YDѾ\t\t\u0013/6%/qxģ\bԩG'%ȶH =&y]\u0018q\u0005ӧ5Ϫ*tmֽ|o$\u0002zQ\fE\u0012ͲU˕\u0003>*غр\u0007o"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011L\u0012K~!@I\r$>C", "", "u(E", "\u000fK?\u00154&\u0011Muri>\u001avs\u000fRy\u0013_3`}", "", "\u000fQ6\u000fRz\r\"gxWR\u001b\\v)P_\u0015u+d\nv.", "\u000fQ6\u000fR~\u0011&kxWR\u001b\\v)P_\u0015u+d\nv.", "\u0012D2\u001c7\f80\t_[>\u0019j", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "5dc\u00118\n(2xxWN\r]h\u001cS", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//\u00107\u007fGJ\u0002!Qv\u001czd9>W\u0001-Av\u001aCMB&u>%j", "\u0012D2\u001c7\f80\t_[>\u0019jG.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001b@G,5\u0010-;titL\u0010qh", "", "\u001eN>\u0019R\u001a\"Hx", " F1\u000eRw\t\u001fcJE+&Y|\u001eEm\"f m\u0011\u0002+bm#", " F1\u000eR\r\n$\u0013[nM\fj\u0003\u001aEl\"f$sv}", " F1,(|\u000eMuri>\u001avs\u000fRy\u0013_3`}", "CrT\u0011X*HR\u0019[\u000b_-|\u0016\u0012e\u00073{M", "", "/b`B\\9>0-\u000ez;<}\n/r", "2dR<W,\u001dW!~\u0004l0\u0007\u0012=", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "0xc2f", "", "2dR<W,\u001dW!~\u0004l0\u0007\u0012=A\t'YJ\b!$5z\n:v", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\fO\u0005\u001e%\u0011S\u00168x%\u001dY\r\u001c\u0016i%*#", "5dc\u001d\\?>Z\u0007\u0003\u0010^\r\u0007\u0016\fi\u000f0wK^! Hs\u0010", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "5dc \\A>7\"[\u000fm,]\u0013<B\u00047\u0004<\f", "EhSA[", "6dX4[;", "5dc \\A>7\"[\u000fm,\u000b", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "=ac.\\5\u001bg(~Wn-}\t<", "@d[2T:>0-\u000ez;<}\n/r", "", "0xc25<?T\u0019\f", "Adc\"f,\u001dS\u0017\ty^\t\r\n0e\r\u000b{G\f\u0017$", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapUtil {
    public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
    public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
    public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final float MAX_BITMAP_SIZE = 2048.0f;
    private static final int POOL_SIZE = 12;
    public static final int RGBA_1010102_BYTES_PER_PIXEL = 4;
    public static final int RGBA_F16_BYTES_PER_PIXEL = 8;
    public static final int RGB_565_BYTES_PER_PIXEL = 2;
    private static boolean useDecodeBufferHelper = false;
    public static final BitmapUtil INSTANCE = new BitmapUtil();
    private static final Lazy DECODE_BUFFERS$delegate = LazyKt.lazy(new Function0<Pools.SynchronizedPool<ByteBuffer>>() { // from class: com.facebook.imageutils.BitmapUtil$DECODE_BUFFERS$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Pools.SynchronizedPool<ByteBuffer> invoke() {
            return new Pools.SynchronizedPool<>(12);
        }
    });

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BitmapUtil() {
    }

    private final ByteBuffer acquireByteBuffer() {
        return useDecodeBufferHelper ? DecodeBufferHelper.INSTANCE.acquire() : getDECODE_BUFFERS().acquire();
    }

    @JvmStatic
    public static final Pair<Integer, Integer> decodeDimensions(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    @JvmStatic
    public static final Pair<Integer, Integer> decodeDimensions(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        BitmapUtil bitmapUtil = INSTANCE;
        ByteBuffer byteBufferObtainByteBuffer = bitmapUtil.obtainByteBuffer();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferObtainByteBuffer.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            bitmapUtil.releaseByteBuffer(byteBufferObtainByteBuffer);
            return pair;
        } catch (Throwable th) {
            INSTANCE.releaseByteBuffer(byteBufferObtainByteBuffer);
            throw th;
        }
    }

    @JvmStatic
    public static final Pair<Integer, Integer> decodeDimensions(byte[] bArr) {
        return decodeDimensions(new ByteArrayInputStream(bArr));
    }

    @JvmStatic
    public static final ImageMetaData decodeDimensionsAndColorSpace(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        BitmapUtil bitmapUtil = INSTANCE;
        ByteBuffer byteBufferObtainByteBuffer = bitmapUtil.obtainByteBuffer();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferObtainByteBuffer.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            ImageMetaData imageMetaData = new ImageMetaData(options.outWidth, options.outHeight, options.outColorSpace);
            bitmapUtil.releaseByteBuffer(byteBufferObtainByteBuffer);
            return imageMetaData;
        } catch (Throwable th) {
            INSTANCE.releaseByteBuffer(byteBufferObtainByteBuffer);
            throw th;
        }
    }

    private final Pools.SynchronizedPool<ByteBuffer> getDECODE_BUFFERS() {
        return (Pools.SynchronizedPool) DECODE_BUFFERS$delegate.getValue();
    }

    @JvmStatic
    public static final int getPixelSizeForBitmapConfig(Bitmap.Config config) {
        switch (config == null ? -1 : WhenMappings.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    @JvmStatic
    public static final int getSizeInByteForBitmap(int i2, int i3, Bitmap.Config config) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i2).toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i3).toString());
        }
        int pixelSizeForBitmapConfig = getPixelSizeForBitmapConfig(config);
        int i4 = i2 * i3 * pixelSizeForBitmapConfig;
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i4 + ", width: " + i2 + ", height: " + i3 + ", pixelSize: " + pixelSizeForBitmapConfig).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    @JvmStatic
    public static final int getSizeInBytes(Bitmap bitmap) {
        if (bitmap == 0) {
            return 0;
        }
        try {
            bitmap = bitmap.getAllocationByteCount();
            return bitmap;
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer obtainByteBuffer() {
        ByteBuffer byteBufferAcquireByteBuffer = acquireByteBuffer();
        if (byteBufferAcquireByteBuffer != null) {
            return byteBufferAcquireByteBuffer;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(DecodeBufferHelper.getRecommendedDecodeBufferSize());
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(DecodeBufferHel…mendedDecodeBufferSize())");
        return byteBufferAllocate;
    }

    private final void releaseByteBuffer(ByteBuffer byteBuffer) {
        if (useDecodeBufferHelper) {
            return;
        }
        getDECODE_BUFFERS().release(byteBuffer);
    }

    @JvmStatic
    public static final void setUseDecodeBufferHelper(boolean z2) {
        useDecodeBufferHelper = z2;
    }
}
