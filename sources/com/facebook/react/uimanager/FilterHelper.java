package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0017\u007f\u0007ljA0ZeP.X\\2\u000fy\u0002<$a/yCI^\"Ԃ*\teNogtJb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0014\u0015̲B\u0006ЀcM\u001e<yez6ӯ$208B\u001f\u000f\u001bBJ&u)E{\u0010 3XphV=U\u000b\u001a \u000bV\"\u0017\u001d\u000bi\u0017DVru:]*3mPV?_^\u0001\u0014\r\u000fl5\u0016\u000faL-p;C\u001d=S1\u000b\u0003cE\u0003MvU\u0007~&U-\u0012\u000ee@p\u007fB\u0017[S\u001bh\u000b&\u000b\f\u0002h\u0012'9T{Mf\rVyA{UJ\u0012\u001a\u001e'v5]\u001et\u0010&3#v\u001a@\u0019\u001alO\u0018z\u00108G)\u000e;C9Ij\u0002iA\u0019\\<\u0014\u0007#\u001dQ\u00037Qib&`C\u001d\u0005{_@i@kL~\u000egM\u0006\u0004\u001ff2.\u0012A_\u007f]\u007fA2%7O[g6Qs\bHRl\u000f\u0007vg\u0002k\u001bVN6\u0007\u0016e19\u0010hL|\u0005\u001aT\u001bXt)[1l\u0007,\nC$j\u007fT!S\u0014~WnixRu\f;.\u00159\"|y$o9\r:eUq\u0018yR%\u0018\u0006<+\u001df}ZS:\\\r,0:`j>{,LT\f!7Ws23Z3aj#`\u001b\u001epH-\rmb\u0001\u0010-Xy$K\u00022\u000e!\u0001~^!su\u0001a,+dR5GQC\u001e>W8gb~k\u0013\r\u000e\u0018G\u0016SwPz\u001e\u000eU*$^2GlG=A\u0011/-@\nEEzv\u0016YS\u00125\u007f\u0015{%:\u001700\u0016x\rD`\u0019Q\u007fX%*\u000f^!'NdH\u0012oc\u0013G\u0012V;_LQ\u000b\u0003\b@~@\u0003\u0005-#=\u0003\u0006!+7uQ5;.wB6Eekq\b.(fU&=}\u0012K{\u0016\u001ed\u0002a@CPI\b\u0003n**l\u0011G`l\u000e\u0007p\u000b|\u001dAhYd\u001fwhS\u0019Q\u0016h\u001d+;\u0014\u001d`\u0003+}\"L.\u000e,$G\f9vCS7}[mm{Pt\r`\u000e8\rDC|94?6U\u0006\u000b96\u0014\u001608W:\u0011(\u0003\u000elF:e \rYS\u0018\b@\u0001\u000ehw\u0011-1p\u0017\u0002[Vg\u0007\u0007nH3dud/-\u0019~=7d֭\u00985\u0005sqߥ3\u0010"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0016]\u0005/7zx.TN;x\n", "", "u(E", "1qT.g,\u001bZ)\fZ_-|\u0007>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$'p\u000f<t4\u000b", "AhV:T", "", "1gP6a,=3\u001a\u007fz\\;\u000b", "1qT.g,\u001b`\u001d\u0001}m5|\u0017=C\n/\u0006Mh\u0013&Ts!", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$~C~\u001b@\nz", "/l^Ba;", "1qT.g,\u001b`\u001d\u0001}m5|\u0017=E\u0001){>\u0010", "1qT.g,\u001c] \t\bF(\f\u00163x_)|@~&", "1n[<e\u0014:b&\u0003\u000e", "1qT.g,\u001c]\"\u000e\bZ:\ff9l\n5c<\u0010$\u001bZ", "1qT.g,\u001c]\"\u000e\bZ:\fh0f\u007f&\u000b", "1qT.g,\u001d`#\nha({\u0013AE\u0001){>\u0010", "=eU@X;1", "=eU@X;2", "0kd?E(=W)\r", "1n[<e", "", "1qT.g, `\u0015\u0013\t\\(\u0004\t\ro\u00072\t(|&$K\u0003", "1qT.g, `\u0015\u0013\t\\(\u0004\t\u000ff\u0001(yO", "1qT.g,!c\u0019k\u0005m(\f\t\ro\u00072\t(|&$K\u0003", "1qT.g,!c\u0019k\u0005m(\f\t\u000ff\u0001(yO", "1qT.g,\"\\*~\bm\n\u0007\u00109rg$\u000bM\u0005*", "1qT.g,\"\\*~\bm\f}\n/c\u000f", "1qT.g,(^\u0015|~m@Z\u00136o\r\u0010wO\u000e\u001b*", "1qT.g,(^\u0015|~m@\\\n0e}7", "1qT.g,,O(\u000f\bZ;|f9l\n5c<\u0010$\u001bZ", "1qT.g,,O(\u000f\bZ;|h0f\u007f&\u000b", "1qT.g,,S$\u0003v<6\u0004\u0013<M{7\tD\u0014", "1qT.g,,S$\u0003v>-}\t-t", "7r>;_@\u001c] \t\bF(\f\u00163x`,\u0003O\u0001$%", "", "4h[AX9L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", ">`a@X\bGRv\fzZ;|g<o\u000b\u0016~<\u007f!)'p\u000f<t4", "4h[AX9/O \u000fzl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ">`a@X\nHZ#\fbZ;\n\rBF\u0004/\u000b@\u000e%", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$~C~\u001b@\n\u0003?`\b-\u0018q\u001d=MP\u0011", ">`a@X\rBZ(~\bl", "AhV:T\u001bH@\u0015}~n:", "AhV:T\u001bH@\u0015}~n:;u/a}7WI\u007f$!Kn\bIv,5U\f ", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FilterHelper {
    public static final FilterHelper INSTANCE = new FilterHelper();

    private FilterHelper() {
    }

    public static /* synthetic */ RenderEffect createBlurEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBlurEffect(f2, renderEffect);
    }

    private final ColorMatrix createBrightnessColorMatrix(float f2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(f2, f2, f2, 1.0f);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createBrightnessEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBrightnessEffect(f2, renderEffect);
    }

    private final RenderEffect createColorMatrixEffect(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            Intrinsics.checkNotNull(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        Intrinsics.checkNotNull(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    static /* synthetic */ RenderEffect createColorMatrixEffect$default(FilterHelper filterHelper, ColorMatrix colorMatrix, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createColorMatrixEffect(colorMatrix, renderEffect);
    }

    private final ColorMatrix createContrastColorMatrix(float f2) {
        float f3 = 255 * ((-(f2 / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, f3, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f2, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createContrastEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createContrastEffect(f2, renderEffect);
    }

    public static /* synthetic */ RenderEffect createDropShadowEffect$default(FilterHelper filterHelper, float f2, float f3, float f4, int i2, RenderEffect renderEffect, int i3, Object obj) {
        if ((i3 + 16) - (i3 | 16) != 0) {
            renderEffect = null;
        }
        return filterHelper.createDropShadowEffect(f2, f3, f4, i2, renderEffect);
    }

    private final ColorMatrix createGrayscaleColorMatrix(float f2) {
        float f3 = 1 - f2;
        float f4 = 0.7152f - (f3 * 0.7152f);
        float f5 = 0.0722f - (f3 * 0.0722f);
        float f6 = 0.2126f - (f3 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f3) + 0.2126f, f4, f5, 0.0f, 0.0f, f6, (0.2848f * f3) + 0.7152f, f5, 0.0f, 0.0f, f6, f4, (f3 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createGrayscaleEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createGrayscaleEffect(f2, renderEffect);
    }

    private final ColorMatrix createHueRotateColorMatrix(float f2) {
        double radians = Math.toRadians(f2);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f3 = 0.715f - (fCos * 0.715f);
        float f4 = fSin * 0.715f;
        float f5 = 0.072f - (fCos * 0.072f);
        float f6 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f3 - f4, (fSin * 0.928f) + f5, 0.0f, 0.0f, (0.143f * fSin) + f6, (0.285f * fCos) + 0.715f + (0.14f * fSin), f5 - (0.283f * fSin), 0.0f, 0.0f, f6 - (0.787f * fSin), f3 + f4, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createHueRotateEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createHueRotateEffect(f2, renderEffect);
    }

    private final ColorMatrix createInvertColorMatrix(float f2) {
        float f3 = 1 - (2 * f2);
        float f4 = f2 * 255;
        return new ColorMatrix(new float[]{f3, 0.0f, 0.0f, 0.0f, f4, 0.0f, f3, 0.0f, 0.0f, f4, 0.0f, 0.0f, f3, 0.0f, f4, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createInvertEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createInvertEffect(f2, renderEffect);
    }

    public static /* synthetic */ RenderEffect createOpacityEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createOpacityEffect(f2, renderEffect);
    }

    private final ColorMatrix createSaturateColorMatrix(float f2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f2);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createSaturateEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSaturateEffect(f2, renderEffect);
    }

    private final ColorMatrix createSepiaColorMatrix(float f2) {
        float f3 = 1 - f2;
        return new ColorMatrix(new float[]{(0.607f * f3) + 0.393f, 0.769f - (f3 * 0.769f), 0.189f - (f3 * 0.189f), 0.0f, 0.0f, 0.349f - (f3 * 0.349f), (0.314f * f3) + 0.686f, 0.168f - (f3 * 0.168f), 0.0f, 0.0f, 0.272f - (f3 * 0.272f), 0.534f - (f3 * 0.534f), (f3 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createSepiaEffect$default(FilterHelper filterHelper, float f2, RenderEffect renderEffect, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSepiaEffect(f2, renderEffect);
    }

    @JvmStatic
    public static final boolean isOnlyColorMatrixFilters(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            String key = readableArray.getMap(i2).getEntryIterator().next().getKey();
            if (Intrinsics.areEqual(key, "blur") || Intrinsics.areEqual(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ RenderEffect parseAndCreateDropShadowEffect$default(FilterHelper filterHelper, ReadableMap readableMap, RenderEffect renderEffect, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            renderEffect = null;
        }
        return filterHelper.parseAndCreateDropShadowEffect(readableMap, renderEffect);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    public static final ColorMatrixColorFilter parseColorMatrixFilters(ReadableArray readableArray) {
        ColorMatrix colorMatrixCreateHueRotateColorMatrix;
        if (readableArray == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry<String, Object> next = readableArray.getMap(i2).getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createSaturateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createOpacityColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createInvertColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createGrayscaleColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createContrastColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createSepiaColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createBrightnessColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateHueRotateColorMatrix = INSTANCE.createHueRotateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateHueRotateColorMatrix);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    public static final RenderEffect parseFilters(ReadableArray readableArray) {
        RenderEffect andCreateDropShadowEffect = null;
        if (readableArray == null) {
            return null;
        }
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry<String, Object> next = readableArray.getMap(i2).getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper = INSTANCE;
                    Object value = next.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper.createSaturateEffect((float) ((Double) value).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper2 = INSTANCE;
                    Object value2 = next.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper2.createOpacityEffect((float) ((Double) value2).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper3 = INSTANCE;
                    Object value3 = next.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper3.createInvertEffect((float) ((Double) value3).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper4 = INSTANCE;
                    Object value4 = next.getValue();
                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper4.createGrayscaleEffect((float) ((Double) value4).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper5 = INSTANCE;
                    Object value5 = next.getValue();
                    Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper5.createContrastEffect((float) ((Double) value5).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper6 = INSTANCE;
                    Object value6 = next.getValue();
                    Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper6.createBlurEffect((float) ((Double) value6).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper7 = INSTANCE;
                    Object value7 = next.getValue();
                    Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper7.createSepiaEffect((float) ((Double) value7).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper8 = INSTANCE;
                    Object value8 = next.getValue();
                    Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper8.createBrightnessEffect((float) ((Double) value8).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper9 = INSTANCE;
                    Object value9 = next.getValue();
                    Intrinsics.checkNotNull(value9, "null cannot be cast to non-null type kotlin.Double");
                    andCreateDropShadowEffect = filterHelper9.createHueRotateEffect((float) ((Double) value9).doubleValue(), andCreateDropShadowEffect);
                    break;
                    break;
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper10 = INSTANCE;
                    Object value10 = next.getValue();
                    Intrinsics.checkNotNull(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    andCreateDropShadowEffect = filterHelper10.parseAndCreateDropShadowEffect((ReadableMap) value10, andCreateDropShadowEffect);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return andCreateDropShadowEffect;
    }

    public final RenderEffect createBlurEffect(float f2, RenderEffect renderEffect) {
        if (f2 <= 0.5d) {
            return null;
        }
        float fSigmaToRadius$ReactAndroid_release = sigmaToRadius$ReactAndroid_release(f2);
        return renderEffect == null ? RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, renderEffect, Shader.TileMode.DECAL);
    }

    public final RenderEffect createBrightnessEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createBrightnessColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createContrastEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createContrastColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createDropShadowEffect(float f2, float f3, float f4, int i2, RenderEffect renderEffect) {
        RenderEffect renderEffectCreateOffsetEffect;
        RenderEffect renderEffectCreateOffsetEffect2;
        if (renderEffect == null) {
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(f2, f3);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "createOffsetEffect(...)");
        } else {
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f, renderEffect);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(f2, f3, renderEffect);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "createOffsetEffect(...)");
        }
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(i2, BlendMode.SRC_IN), renderEffectCreateOffsetEffect2);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.DECAL);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateOffsetEffect, BlendMode.SRC_OVER);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public final RenderEffect createGrayscaleEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createGrayscaleColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createHueRotateEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createHueRotateColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createInvertEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createInvertColorMatrix(f2), renderEffect);
    }

    public final ColorMatrix createOpacityColorMatrix(float f2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, f2);
        return colorMatrix;
    }

    public final RenderEffect createOpacityEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createOpacityColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createSaturateEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createSaturateColorMatrix(f2), renderEffect);
    }

    public final RenderEffect createSepiaEffect(float f2, RenderEffect renderEffect) {
        return createColorMatrixEffect(createSepiaColorMatrix(f2), renderEffect);
    }

    public final RenderEffect parseAndCreateDropShadowEffect(ReadableMap filterValues, RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        return createDropShadowEffect(PixelUtil.INSTANCE.dpToPx(filterValues.getDouble("offsetX")), PixelUtil.INSTANCE.dpToPx(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? sigmaToRadius$ReactAndroid_release((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey("color") ? filterValues.getInt("color") : ViewCompat.MEASURED_STATE_MASK, renderEffect);
    }

    public final float sigmaToRadius$ReactAndroid_release(float f2) {
        return (PixelUtil.toPixelFromDIP(f2) - 0.5f) / 0.57735f;
    }
}
