package com.facebook.imagepipeline.postprocessors;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.filter.IterativeBoxBlurFilter;
import com.facebook.imagepipeline.filter.RenderScriptBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4\u0012}\nnjO0LeN1ZS8\u000fsڔ<$q$yCAW0Ԃ@\u001d\u007fN\u0016f'InKb\u0015\u000b&|x,aU'^\"\u0013@D\b?aP\u007fC?`\u0003:\u001d `#أ}\u0005\u000f\u001frN\u001e\u0004\u0013Cy\u0015XD\t~H`%M3)B\nL0\u0019\u001e\u000bx\u0015J\u0011\u0003kHG#1xrR5qH|{\u001evX5 \u000faL<\u0007K\u0006$3S\u001b\u0007\u0001\\ύ\u0007Eyܵ\u001dj--9PDcD`\u0018\u0014C4&\u0558_ę*\\\rĩ1\u001b5-gcySˎ,}\u0003Ԉ%>\n\u0018\u00142\u0019=;\u001e~\b<4ϢvYHА\u001a`H\f\thِ\u001b:"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002/Ch\t-Ak\u0016<[MHy}z\u001cxn$\u0011q;9\u00041EL\\:f_H", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7r*[C&uB- uk7\u0007q:X\u0004|", "0kd?E(=W)\r", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7sT?T;B]\"\r", "uH;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c :\u0016", "5dc\u000f_<K@\u0015}~n:", "u(8", "1`R5X\u0012>g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "5dc\u0016g,KO(\u0003\u0005g:", "5dc\u001db:M^&\tx^:\u000b\u0013<C{&~@f\u0017+", ">q^0X:L", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "2dbA50M[\u0015\n", "And?V,\u001bW(\u0007vi", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BlurPostProcessor extends BasePostprocessor {
    private static final int DEFAULT_ITERATIONS = 3;
    private final int blurRadius;
    private final CacheKey cacheKey;
    private final Context context;
    private final int iterations;
    public static final Companion Companion = new Companion(null);
    private static final boolean canUseRenderScript = RenderScriptBlurFilter.canUseRenderScript();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001b\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޏ_ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002/Ch\t-Ak\u0016<[MHy}z\u001cxn$\u0011q;9\u00041EL\\:f_1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "\u0012D5\u000eH\u0013-M|mZK\bkl\u0019Nm", "", "1`]\"f,+S\"}zk\u001az\u00163p\u000f", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurPostProcessor(int i2, Context context) {
        this(i2, context, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public BlurPostProcessor(int i2, Context context, int i3) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        this.blurRadius = i2;
        this.context = context;
        this.iterations = i3;
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0 && i2 <= 25));
        Preconditions.checkArgument(Boolean.valueOf(i3 > 0));
        if (canUseRenderScript) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(null, "IntrinsicBlur;%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format(null, "IterativeBoxBlur;%d;%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        }
        this.cacheKey = new SimpleCacheKey(str);
    }

    public /* synthetic */ BlurPostProcessor(int i2, Context context, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, context, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? 3 : i3);
    }

    public final int getBlurRadius() {
        return this.blurRadius;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getIterations() {
        return this.iterations;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        return this.cacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        IterativeBoxBlurFilter.boxBlurBitmapInPlace(bitmap, this.iterations, this.blurRadius);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap destBitmap, Bitmap sourceBitmap) throws Throwable {
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        if (canUseRenderScript) {
            RenderScriptBlurFilter.blurBitmap(destBitmap, sourceBitmap, this.context, this.blurRadius);
        } else {
            super.process(destBitmap, sourceBitmap);
        }
    }
}
