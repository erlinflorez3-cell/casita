package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.ScalingUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`Y2\u000fq{<$i)yCAW\"}0\u0015WNmgtϺpŏa 6\u0016'idHf9`ܫ\u00132Po\by[pU9\u000fvf\t.5:8(\t1\u001e8M(v)I{\u0010 7XphZ=Q\u0013#*\u0006l(1\"jqf6vw\u000e>=/\u001bipYWc>\ne\rt_W\u0011\u0005o6+nB{)mY\u0011\u0016j[m\u0013\u0006\u0006ݞ\tz"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#k\u001e3t\u0016\u001daN;YC\u001a\"wEB\u0015g+NL", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn#Wy';v\u0018\u001e\\GByry\u0012vpF\u0003a;<t#NL=@gRH", "u(E", "5dc!e(Ga\u001a\t\bf\u0010\u0005\u00146", "", "=tc!e(Ga\u001a\t\bf", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", ">`a2a;+S\u0017\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "1gX9W\u001eBR(\u0002", "", "1gX9W\u000f>W\u001b\u0002\n", "4nRBf\u001f", "", "4nRBf ", "AbP9X\u001f", "AbP9X ", "BnBAe0GU", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScaleTypeStartInside extends ScalingUtils.AbstractScaleType {
    public static final Companion Companion = new Companion(null);
    private static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeStartInside();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#k\u001e3t\u0016\u001daN;YC\u001a\"wEB\u0015g+N5\u0005QTY(eV|Fi", "", "u(E", "\u0017MB!4\u0015\u001c3", "\u001ab^:\"-:Q\u0019{\u0005h2F\b<a\u0012({\n\u007f$\u0013Yk\u000bCvn#Wy';v\u0018\u001e\\GByr\f\u0013dh9uw7NL", "5dc\u0016A\u001a-/\u0002\\Z", "u(;0b4\bT\u0015|z[6\u0007\u000fxd\r$\u000e@\u0001`\u0016Tk 8s,5#k\u001e3t\u001a7O3Jo;,SV_5\u000ec\u001bb\u0002'\u001d", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScalingUtils.ScaleType getINSTANCE() {
            return ScaleTypeStartInside.INSTANCE;
        }
    }

    @Override // com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
    public void getTransformImpl(Matrix outTransform, Rect parentRect, int i2, int i3, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float fCoerceAtMost = RangesKt.coerceAtMost(Math.min(f4, f5), 1.0f);
        float f6 = parentRect.left;
        float f7 = parentRect.top;
        outTransform.setScale(fCoerceAtMost, fCoerceAtMost);
        outTransform.postTranslate(Math.round(f6), Math.round(f7));
    }

    public String toString() {
        return "start_inside";
    }
}
