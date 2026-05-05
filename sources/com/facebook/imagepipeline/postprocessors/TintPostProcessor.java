package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import androidx.core.graphics.ColorUtils;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r'4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$i0yCAU\"}0\tWȞog\u0005JbŏYƤ6\u0016'ilne~c\u0011\u001d2Zom4]wC9nvN\u000761P;\n\r\u0007\u001a8L(x\u0011By\u0011ܘ4@~@\u001b\u0013[\u000f2\u00124If\u0015fbuZNH\u001be\u0001Ck\u0011wOf'\u000e>-Q\u001bUl';\u0007(2{LE<-%\u0002\u000b]ѻ]ύ\u0007?yܵUv5+CK\nVd]Vϯ\u0017ۣS\reövj\u0013Zx\fU,\u0006c\"ָ\u0010߭{z\u0004Ȟʆ\b\u001f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002/Ch\t-Ak\u0016<[MHy}\r\u0019qp$\u0011q;9\u00041EL\\:f_H", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7r*[C&uB- uk7\u0007q:X\u0004|", "1n[<e", "", "/k_5T\u0017>`\u0017~\u0004m", "", ">naAX9\u001dc\u001a\u007fbh+|", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006M\u0010\u0017$&\u007f\u000f=5\r?X}u", "uH;7T=:\u001d z\u0004`u]\u00109a\u000f}b<\n\u0016$Qs\r\u0006x21d\u0001$5{_\u0019WPJkA|%ibwnm+NLj8", "1`R5X\u0012>g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "Bh]A66E]&", "5dc\u001bT4>", "", "5dc\u001db:M^&\tx^:\u000b\u0013<C{&~@f\u0017+", ">q^0X:L", "", "And?V,\u001bW(\u0007vi", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TintPostProcessor extends BasePostprocessor {
    private final CacheKey cacheKey;
    private final PorterDuff.Mode porterDuffMode;
    private final int tintColor;

    public TintPostProcessor(int i2, Float f2, PorterDuff.Mode mode) {
        this.porterDuffMode = mode;
        i2 = f2 != null ? ColorUtils.setAlphaComponent(i2, RangesKt.coerceIn((int) (f2.floatValue() * 255), 0, 255)) : i2;
        this.tintColor = i2;
        this.cacheKey = new SimpleCacheKey("Tint. tintColor=" + i2 + ", mode=" + mode);
    }

    public /* synthetic */ TintPostProcessor(int i2, Float f2, PorterDuff.Mode mode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (2 & i3) != 0 ? null : f2, (i3 + 4) - (i3 | 4) != 0 ? null : mode);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        return Reflection.getOrCreateKotlinClass(TintPostProcessor.class).toString();
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        return this.cacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap sourceBitmap) {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        if (this.porterDuffMode == null) {
            new Canvas(sourceBitmap).drawColor(this.tintColor);
        } else {
            new Canvas(sourceBitmap).drawColor(this.tintColor, this.porterDuffMode);
        }
    }
}
