package com.facebook.react.views.imagehelper;

import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0R\u0004P.hS2şs{B(c$wCAڬ\u001a\u0014̝9O|f mU\u001b\u0010I\u000fو\u001axx,\u0012y\u0007^*\u000f`D CAP\b=gd%:\u0013%J\"f}5\u000b(0`\u0016\u0007|SK:\u001a^G7?\u001b9[\u00062\u00124@P\u0005,_\u007fNdL\u001daH4;\u0003\u0018F~1m6\u0015S\u001dHd';~\u0010%[DE>-%\u0002\rMWâC\u000f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w5SBz8\f\u001fxn7\u0007F,U\u0002'T\"", "", "u(E", "5dc\u000fX:MA#\u000f\b\\,]\u0013<S\u0004={", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w5SBz8\f\u001fxn7\u0007F,U\u0002'T\u000b6<cav+\u001e\"g\fN\u0018\r\u0013iH3D", "EhSA[", "", "6dX4[;", "And?V,L", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u00079", ";t[A\\7EW\u0019\f", "", "\u001bt[A\\\u001aHc&|zK,\u000b\u00196t", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MultiSourceHelper {
    public static final MultiSourceHelper INSTANCE = new MultiSourceHelper();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0015Ӭ\\\u0012&\u0006'\u0002I6Re`0hRX\u0010{\u0002B&s&\bBiV۟\u0002\"\u0017R\u001fwunb\\!B=\u0007L|AߢKǤ|]\u001aƁ\u0003R}AKO\u0006<ga+:[ڛ4ŕ<y\rЏʆ.L"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w5SBz8\f\u001fxn7\u0007F,U\u0002'T\u000b6<cav+\u001e\"g\fN\u0018\r\u0013iH3D", "", "0dbAE,Lc \u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5\\}'Bm#w1K7m4\f\u001fxn7\u00079", "0dbAE,Lc \u000e^g\nx\u00072e", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}W@~!7Y\u0001 >x\u0016;\u0017'Cg6\u001e\u0003rqF\u0005c\u00025t1O\u0016O(ZRoG\u001e\u0018$\u001bN'\u000b\u0014#R(nVEh\f4E\u0004;k\u0001\u0013!\u000eB4TJR\u0012Gg\u001f\u0006N'h\u001c\u001dP", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class MultiSourceResult {
        public final ImageSource bestResult;
        public final ImageSource bestResultInCache;

        public MultiSourceResult(ImageSource imageSource, ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }
    }

    private MultiSourceHelper() {
    }

    @JvmStatic
    public static final MultiSourceResult getBestSourceForSize(int i2, int i3, List<? extends ImageSource> sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return getBestSourceForSize(i2, i3, sources, 1.0d);
    }

    @JvmStatic
    public static final MultiSourceResult getBestSourceForSize(int i2, int i3, List<? extends ImageSource> sources, double d2) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (sources.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (sources.size() == 1) {
            return new MultiSourceResult(sources.get(0), null);
        }
        if (i2 <= 0 || i3 <= 0) {
            return new MultiSourceResult(null, null);
        }
        ImagePipeline imagePipeline = ImagePipelineFactory.getInstance().getImagePipeline();
        Intrinsics.checkNotNullExpressionValue(imagePipeline, "getImagePipeline(...)");
        double d3 = ((double) (i2 * i3)) * d2;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        ImageSource imageSource = null;
        ImageSource imageSource2 = null;
        for (ImageSource imageSource3 : sources) {
            double dAbs = Math.abs(1.0d - (imageSource3.getSize() / d3));
            if (dAbs < d4) {
                imageSource2 = imageSource3;
                d4 = dAbs;
            }
            if (dAbs < d5 && (imagePipeline.isInBitmapMemoryCache(imageSource3.getUri()) || imagePipeline.isInDiskCacheSync(imageSource3.getUri()))) {
                imageSource = imageSource3;
                d5 = dAbs;
            }
        }
        return new MultiSourceResult(imageSource2, (imageSource == null || imageSource2 == null || !Intrinsics.areEqual(imageSource.getSource(), imageSource2.getSource())) ? imageSource : null);
    }
}
