package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.core.CloseableReferenceFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`\\2şs{J$c$\bCC٥\"}0\u000fWNmgvJp\u000bK\u000f\f\u0017~oBկs\u000b\u000e\u0012=1znQsh\u007fAG`\r63!B&F{\u001d\u0001H-X\u0014\u0005~[K:\u0017ضDpHXUq\u0013#*\fN\"\u0011\u001e\u000br|@xpkFG#1vrR5mH|{\u001avX5\u001c\u000faL;\u0007L}93d\u001b\rb]O\u0003m|k\u000f\u0019+57as\u0006C\t\u0004\"#CO;j#*j\u0014i`:7qO4W^\u0012@w)\u0001cɠ\u0006؝\n'P͓}&t\u000f&3#z*ö\\ؿbB\bЭ2B%%\u00183Y:qƛSň?\u0019VљL\u0011\u001b ;\u0001\u001d$2٭\u0010\u05ce\u0019\u001b\\ȭά5d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7x8VCOi>&\u0012EeH\u000f_7/r%VV[@2", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "8oT4:,GS&z\nh9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7u6XROP?\u001e\u0017JaB\u0007p(]\u00014\u001d", ">ta4X(;Z\u0019]z\\6{\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002,1h~*Du_\u0019T?Jl>+\u001dGa7\u0011b,[L", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\tw>\u0010!$[", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG}>w$.I@Bk!\u001e\u0016hn9\u0010a,/r%VV[@2", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@\"9h\u0006\u001cB{_\u000eUNJ\u007f\u0019)\u0015jC9\u0010c9J\u00061T\"5*fZ<>\u0010\u0010Z\u000bX5\u0013N]I pDB#\u0013,P\u0006DhJ\u0017\u001d\nDkzO^Y2\u0001\u0011\u0005B3uN8_wQ@Eo\u007fK\ni%&;6\"\u0014n#%n\u001a2\u0012wU\u0011}V\u0005gnK\"z\u0002\"Hz[\u0010#v_Jt#\u001cR{d\u00123X\u0002+}+\u0004\u0015&4s\u000fX{m\u0002O", "7l\\Bg(;Z\u0019[~m4x\u0014\u0010a\u0007/x<~\u001d", "", "1qT.g,\u001bW(\u0007vi\u0010\u0006\u0018/r\t$\u0003", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "EhSA[", "", "6dX4[;", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "1qT.g,\u001fO \u0006wZ*\u0003e3t\b$\u0007", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HoneycombBitmapFactory extends PlatformBitmapFactory {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "HoneycombBitmapFactory";
    private final CloseableReferenceFactory closeableReferenceFactory;
    private boolean immutableBitmapFallback;
    private final EmptyJpegGenerator jpegGenerator;
    private final PlatformDecoder purgeableDecoder;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00058i%\nKYXB\u007f8\b}P\u0016iEϽ\\ŲG\u000f\u000eǝѷn0"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7x8VCOi>&\u0012EeH\u000f_7/r%VV[@\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "\"@6", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HoneycombBitmapFactory(EmptyJpegGenerator jpegGenerator, PlatformDecoder purgeableDecoder, CloseableReferenceFactory closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(jpegGenerator, "jpegGenerator");
        Intrinsics.checkNotNullParameter(purgeableDecoder, "purgeableDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.jpegGenerator = jpegGenerator;
        this.purgeableDecoder = purgeableDecoder;
        this.closeableReferenceFactory = closeableReferenceFactory;
    }

    private final CloseableReference<Bitmap> createFallbackBitmap(int i2, int i3, Bitmap.Config config) {
        CloseableReference<Bitmap> closeableReferenceCreate = this.closeableReferenceFactory.create(Bitmap.createBitmap(i2, i3, config), SimpleBitmapReleaser.getInstance());
        Intrinsics.checkNotNullExpressionValue(closeableReferenceCreate, "closeableReferenceFactor…apReleaser.getInstance())");
        return closeableReferenceCreate;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    public CloseableReference<Bitmap> createBitmapInternal(int i2, int i3, Bitmap.Config bitmapConfig) throws Throwable {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        if (this.immutableBitmapFallback) {
            return createFallbackBitmap(i2, i3, bitmapConfig);
        }
        CloseableReference<PooledByteBuffer> closeableReferenceGenerate = this.jpegGenerator.generate((short) i2, (short) i3);
        Intrinsics.checkNotNullExpressionValue(closeableReferenceGenerate, "jpegGenerator.generate(w…hort(), height.toShort())");
        try {
            EncodedImage encodedImage = new EncodedImage(closeableReferenceGenerate);
            encodedImage.setImageFormat(DefaultImageFormats.JPEG);
            try {
                CloseableReference<Bitmap> closeableReferenceDecodeJPEGFromEncodedImage = this.purgeableDecoder.decodeJPEGFromEncodedImage(encodedImage, bitmapConfig, null, closeableReferenceGenerate.get().size());
                if (closeableReferenceDecodeJPEGFromEncodedImage == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (closeableReferenceDecodeJPEGFromEncodedImage.get().isMutable()) {
                    closeableReferenceDecodeJPEGFromEncodedImage.get().setHasAlpha(true);
                    closeableReferenceDecodeJPEGFromEncodedImage.get().eraseColor(0);
                    return closeableReferenceDecodeJPEGFromEncodedImage;
                }
                CloseableReference.closeSafely(closeableReferenceDecodeJPEGFromEncodedImage);
                this.immutableBitmapFallback = true;
                FLog.wtf(TAG, "Immutable bitmap returned by decoder");
                return createFallbackBitmap(i2, i3, bitmapConfig);
            } finally {
                EncodedImage.closeSafely(encodedImage);
            }
        } finally {
            closeableReferenceGenerate.close();
        }
    }
}
