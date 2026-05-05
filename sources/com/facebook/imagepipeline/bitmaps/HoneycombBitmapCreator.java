package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.memory.PoolFactory;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B*c$wCCU0}*\tUN}˧\rX\u000b\u000bq\u000e>\u0015\u0007+7YY\u0007]*\u000f`CņC3[q\u0006Wn{N\u0005N:R<\b\u000e\u0019\u001aXR@z\tNc\f@:ptH^%M3'X\u001a\u000f,\u000f!tg|:\u001fǐ_Ơ3#\u000b݃\u0013Z5dH|{\u0013\u001dÙ)˼za&ѨÑ;D"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7x8VCOi>&\u0012EeH\u000f_7,\u0004'C[X92", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9j@\u0006-1d[-7i%8Z\u0019", ">n^99(<b#\f\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T$7iC(\"|7", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@-5a\b-K7\u00018WJ\u001cg2-\u001fuu\u000fJT", "4kTE5@MSt\f\bZ@g\u00139l", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001N\u001d.` Oz4y\"u]Mqm6UL", "8oT4:,GS&z\nh9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7u6XROP?\u001e\u0017JaB\u0007p(]\u00014\u001d", "1qT.g,'O\u001f~y;0\f\u0011+p", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "EhSA[", "", "6dX4[;", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HoneycombBitmapCreator implements BitmapCreator {
    public static final Companion Companion = new Companion(null);
    private final FlexByteArrayPool flexByteArrayPool;
    private final EmptyJpegGenerator jpegGenerator;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\toЩ7T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7x8VCOi>&\u0012EeH\u000f_7,\u0004'C[X9\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "5dc\u000f\\;FO$_v\\;\u0007\u0016CO\u000b7\u007fJ\n%", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"(k\fK\u00012I\u0018g+Fq 7[\u0019", "A`\\=_,,W.~", "", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapFactory.Options getBitmapFactoryOptions(int i2, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i2;
            options.inMutable = true;
            return options;
        }
    }

    public HoneycombBitmapCreator(PoolFactory poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        this.jpegGenerator = new EmptyJpegGenerator(poolFactory.getPooledByteBufferFactory());
        FlexByteArrayPool flexByteArrayPool = poolFactory.getFlexByteArrayPool();
        Intrinsics.checkNotNullExpressionValue(flexByteArrayPool, "poolFactory.flexByteArrayPool");
        this.flexByteArrayPool = flexByteArrayPool;
    }

    @Override // com.facebook.common.webp.BitmapCreator
    public Bitmap createNakedBitmap(int i2, int i3, Bitmap.Config bitmapConfig) throws Throwable {
        EncodedImage encodedImage;
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        CloseableReference<PooledByteBuffer> closeableReferenceGenerate = this.jpegGenerator.generate((short) i2, (short) i3);
        Intrinsics.checkNotNullExpressionValue(closeableReferenceGenerate, "jpegGenerator.generate(w…hort(), height.toShort())");
        try {
            encodedImage = new EncodedImage(closeableReferenceGenerate);
            try {
                encodedImage.setImageFormat(DefaultImageFormats.JPEG);
                BitmapFactory.Options bitmapFactoryOptions = Companion.getBitmapFactoryOptions(encodedImage.getSampleSize(), bitmapConfig);
                int size = closeableReferenceGenerate.get().size();
                PooledByteBuffer pooledByteBuffer = closeableReferenceGenerate.get();
                Intrinsics.checkNotNullExpressionValue(pooledByteBuffer, "jpgRef.get()");
                CloseableReference<byte[]> closeableReference = this.flexByteArrayPool.get(size + 2);
                byte[] bArr = closeableReference.get();
                Intrinsics.checkNotNullExpressionValue(bArr, "encodedBytesArrayRef.get()");
                byte[] bArr2 = bArr;
                pooledByteBuffer.read(0, bArr2, 0, size);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, size, bitmapFactoryOptions);
                if (bitmapDecodeByteArray == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                bitmapDecodeByteArray.setHasAlpha(true);
                bitmapDecodeByteArray.eraseColor(0);
                CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(closeableReferenceGenerate);
                return bitmapDecodeByteArray;
            } catch (Throwable th) {
                th = th;
                CloseableReference.closeSafely((CloseableReference<?>) null);
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(closeableReferenceGenerate);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            encodedImage = null;
        }
    }
}
