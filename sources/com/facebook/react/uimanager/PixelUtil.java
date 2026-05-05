package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005#4\u0012\u0006\u000bnj?3JΣHDɟ\u0004*=j<9*[ҸuCIUb\u00040\ngN\u0016i5O#\u0019Q\u0012\u001e\u0016'l\\Mc|u\u0012=4\tt\bA[tU9\u000fvf\t.6:8(\u000bG\u001frV\u001e{\u0013Cy\u000eB4NtRR;OK\u001fZ\u0014L'\u0019\u001e\u000bi~:Vpu:])In\u000bf5fH|{\u000fvX5\u0011\u000faL-p=;\u00153[\u001b\u0007\u0001]\u0006\b\byK\u000e\u0001'U-qs\u0006<!\b\"\u001eCO;_\u001b&\u000b\u0007\u001ah\u001a1CO\u0012Mx\u000eV}C\u0004\u001bF\u001c\u000e4)p.[\u001cǺ\f\u0019"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n ]\u0011 >]%2T\u0019", "", "u(E", "5dc\u0011\\:IZ\u0015\u0013b^;\n\r-D\u007f1\nD\u0010+", "", "Bn3\u0016C\rK]!i~q,\u0004", "D`[BX", "Bn?6k,E4&\t\u0003=\u0010g", "", "Bn?6k,E4&\t\u0003L\u0017", ";`g\u0013b5MA\u0017z\u0002^", "2oC<C?", ">wC<77", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PixelUtil {
    public static final PixelUtil INSTANCE = new PixelUtil();

    private PixelUtil() {
    }

    @JvmStatic
    public static final float getDisplayMetricDensity() {
        return DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    @JvmStatic
    public static final float toDIPFromPixel(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        return f2 / DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    @JvmStatic
    public static final float toPixelFromDIP(double d2) {
        return toPixelFromDIP((float) d2);
    }

    @JvmStatic
    public static final float toPixelFromDIP(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f2, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    @JvmStatic
    public static final float toPixelFromSP(double d2) {
        return toPixelFromSP$default((float) d2, 0.0f, 2, null);
    }

    @JvmStatic
    public static final float toPixelFromSP(float f2) {
        return toPixelFromSP$default(f2, 0.0f, 2, null);
    }

    @JvmStatic
    public static final float toPixelFromSP(float f2, float f3) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        DisplayMetrics windowDisplayMetrics = DisplayMetricsHolder.getWindowDisplayMetrics();
        float fApplyDimension = TypedValue.applyDimension(2, f2, windowDisplayMetrics);
        return f3 >= 1.0f ? Math.min(fApplyDimension, f2 * windowDisplayMetrics.density * f3) : fApplyDimension;
    }

    public static /* synthetic */ float toPixelFromSP$default(float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Float.NaN;
        }
        return toPixelFromSP(f2, f3);
    }

    public final float dpToPx(double d2) {
        return toPixelFromDIP(d2);
    }

    public final float dpToPx(float f2) {
        return toPixelFromDIP(f2);
    }

    public final float pxToDp(double d2) {
        return toDIPFromPixel((float) d2);
    }

    public final float pxToDp(float f2) {
        return toDIPFromPixel(f2);
    }
}
