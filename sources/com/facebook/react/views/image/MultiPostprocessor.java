package com.facebook.react.views.image;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.MultiCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004O$8\u000b4B\u0007\":\u001e\u007fјnjO0L͜P.hS2\u000f\u0002{<$a$yCQU\"}(\teȞ\u0006t\u001fJ\t\n{\u000e\u0013V\fp,Y_\u0007]*\u0015BD\u007f?aL\u001e>˃dtD\u0007h80;\u0012\u0005/\u001ep\\X|\tHc\f@6\u0007\u0005\u0003n\u001bT\u001d \"\bN /'\u000bo~:Vvu:],3mPY?_^\t\u0014!\u0017f5\r\u000fg.-P7c\u0014STYޚTÜC\u0003Gмݞ\tv"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#e0>|\u001a\u0019WQJvA(\u0013hoG\u0011p\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7\u00018[RFx>\u001c\u0015voC\u00149", ">nbAc9HQ\u0019\r\th9\u000b", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u001bT4>", "", "5dc\u001db:M^&\tx^:\u000b\u0013<C{&~@f\u0017+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", ">q^0X:L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "And?V,\u001bW(\u0007vi", "0hc:T7\u001fO\u0017\u000e\u0005k@", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MultiPostprocessor implements Postprocessor {
    public static final Companion Companion = new Companion(null);
    private final List<Postprocessor> postprocessors;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":0\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:YIV2\u007f8\b}P\u0018q|Mr\u0011S\u0011\u0016\u0016'lZM\u001c}ٛ\u0016\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#e0>|\u001a\u0019WQJvA(\u0013hoG\u0011pj,\u0001/RHW0f[H", "", "u(E", "4q^:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7\u00018[RFx>\u001c\u0015voC\u00149", ">nbAc9HQ\u0019\r\th9\u000b", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Postprocessor from(List<? extends Postprocessor> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new MultiPostprocessor(postprocessors, defaultConstructorMarker) : postprocessors.get(0);
            }
            return null;
        }
    }

    private MultiPostprocessor(List<? extends Postprocessor> list) {
        this.postprocessors = new LinkedList(list);
    }

    public /* synthetic */ MultiPostprocessor(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @JvmStatic
    public static final Postprocessor from(List<? extends Postprocessor> list) {
        return Companion.from(list);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
        return "MultiPostProcessor (" + CollectionsKt.joinToString$default(this.postprocessors, ",", null, null, 0, null, null, 62, null) + ")";
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        List<Postprocessor> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Postprocessor) it.next()).getPostprocessorCacheKey());
        }
        return new MultiCacheKey(arrayList);
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap sourceBitmap, PlatformBitmapFactory bitmapFactory) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        CloseableReference<Bitmap> closeableReferenceProcess = null;
        try {
            CloseableReference<Bitmap> closeableReferenceMo7166clone = null;
            for (Postprocessor postprocessor : this.postprocessors) {
                if (closeableReferenceMo7166clone == null || (bitmap = closeableReferenceMo7166clone.get()) == null) {
                    bitmap = sourceBitmap;
                }
                closeableReferenceProcess = postprocessor.process(bitmap, bitmapFactory);
                CloseableReference.closeSafely(closeableReferenceMo7166clone);
                closeableReferenceMo7166clone = closeableReferenceProcess.mo7166clone();
            }
            if (closeableReferenceProcess == null) {
                throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
            }
            CloseableReference<Bitmap> closeableReferenceMo7166clone2 = closeableReferenceProcess.mo7166clone();
            Intrinsics.checkNotNullExpressionValue(closeableReferenceMo7166clone2, "clone(...)");
            return closeableReferenceMo7166clone2;
        } finally {
            CloseableReference.closeSafely((CloseableReference<?>) null);
        }
    }
}
