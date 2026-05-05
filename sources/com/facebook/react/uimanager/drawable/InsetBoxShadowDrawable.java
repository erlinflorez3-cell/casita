package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u0001<$a0yCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u0007j4կ]xs\u0012\u00172HvG3coEʠfsLӌP2P7:P\u0011\u001e8H(v)D[\u0014\u00180NrRT#L3\u001d\"\u000eD \u000f\"tid5vqm>=)\u001bipU7c>\u0005e\rt]7\u0011\u0005k6+n@E\u00193^\u001b\u0007\u0001dO\u0007M}U\u0005\u00170ݳ/I\u0002d~`\u000e---e\f\f\rl\\MYn'?-ebylT(@\t\n*T\u0004<$WL<L2f6.y\t;YNq\u001a^p\u0007Au~43\"K+g$\u0017Uo^1Ne\u00055\u0013,G\u0019p7Z\u0003\u0017'\u0015ôXw_V\u001aNKnf\n\b[\u001e\b~\n\u001a*27\u000e\u0014w\f\u001fV/%eyi)/\u0015\u001aJZf%/'|$u`SX\"\u001d\u001f\u000eѪ\u000bɔ^Dlʍ<vb\\D\u0013c\u001b\u0003\f.\u000e!.tyR S\u0015\r\u0014?Ȑvܷa\u0016-Ä~9_}y\u001ew;dDCc46oT\u000f\u0016U;\u0011\b\tlPa$\\r'P5\u0007/fǵ\bΌR\u0018\u001bԵWs\"G:E9^\u001b]\u00114\u0013M\u000b\twZ\u0017\u0011Uԡ5ʗ\u0007i,ڏY\r^d\to\u0016\u0002 ؖ~˃&-Iٛ\u0006%4_:hb\u0006yȗ\u0001\u0381\u0004Goն\u0018Xz\u001c\u000eU*'l֠;ֺ3=\u001bÁO5@\u0019EEz\u000b<ʻOɟ+z\u0005Ȫ_Gv:\u007f\b\u0019y\u0003ߏlߝST\u001fǱ\u0557b\u001e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017'Dy4-qrt'\n_+X\t\u0006TH`(YYr\u0013", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0na1X9+O\u0018\u0003\u000bl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGtr@Uv|", "0na1X9\"\\'~\nl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x\u0018'#hpG\\", "AgP1b>\u001c] \t\b", "", "=eU@X;1", "", "=eU@X;2", "0kd?E(=W)\r", "Aoa2T+", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~Zy\u001e7j 8S\rHk0\u001c$2q=\u000f_5Jx'T\u0016\\;pYr\u0007p\u001cg\rN8y\u0001XE4|2F3\u000f,\u001fh9r\tU\u0017\n3jmL`\u0016\u0011\u0007\u0015q?82V]guP=Gb7.\u001an1c:\u0004\u0001\u001e~\u0018\u001bu47\u0018{b\u001fH6ZHH(\\k", "D`[BX", "5dc\u000fb9=S&b\u0004l,\f\u0017", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#\f/Kt\u0016w*MHj4+xqo9\u0016q\u0002", "Adc\u000fb9=S&b\u0004l,\f\u0017", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\u000bWP:kA\u0002\u001evaH\u00159o?", "5dc\u000fb9=S&kv]0\r\u0017", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#\f/Kt\u0016w*MHj4+\u0002d`=\u0017q\u001a]\u000b.G\"", "Adc\u000fb9=S&kv]0\r\u0017", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\u000bWP:kA\u000b\u0011geI\u0015Q;b}'\u001d\u0010?", "AgP1b>)O\u001d\b\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "1n\\=h;>0#\fy^9`\u0012=e\u000f6", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "1n\\=h;>0#\fy^9i\u0005.i\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ$", "2qPD", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "5dc\u001cc(<W(\u0013", "7m]2e\u0019:R\u001d\u000f\t", "@`S6h:", "0na1X9\"\\'~\n", "uE;7T=:\u001d z\u0004`u]\u00109a\u000f}?!", "Adc\u000e_7AO", "/k_5T", "Adc\u0010b3H`y\u0003\u0002m,\n", "1n[<e\rBZ(~\b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;
    private final Paint shadowPaint;
    private final float spread;

    public InsetBoxShadowDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i2, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shadowColor = i2;
        this.offsetX = f2;
        this.offsetY = f3;
        this.blurRadius = f4;
        this.spread = f5;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        Paint paint = new Paint();
        paint.setColor(i2);
        if (f4 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f4 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }

    public /* synthetic */ InsetBoxShadowDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i2, float f2, float f3, float f4, float f5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? null : borderRadiusStyle, (-1) - (((-1) - i3) | ((-1) - 4)) == 0 ? borderInsets : null, i2, f2, f3, f4, f5);
    }

    private final RectF computeBorderInsets() {
        RectF rectFResolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (rectFResolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return null;
        }
        return new RectF(PixelUtil.INSTANCE.dpToPx(rectFResolve.left), PixelUtil.INSTANCE.dpToPx(rectFResolve.top), PixelUtil.INSTANCE.dpToPx(rectFResolve.right), PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom));
    }

    private final ComputedBorderRadius computeBorderRadii() {
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        ComputedBorderRadius computedBorderRadiusResolve = borderRadiusStyle != null ? borderRadiusStyle.resolve(getLayoutDirection(), this.context, PixelUtil.INSTANCE.pxToDp(getBounds().width()), PixelUtil.INSTANCE.pxToDp(getBounds().height())) : null;
        if (computedBorderRadiusResolve == null || !computedBorderRadiusResolve.hasRoundedBorders()) {
            return null;
        }
        return new ComputedBorderRadius(new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
    }

    private final float innerRadius(float f2, Float f3) {
        return RangesKt.coerceAtLeast(f2 - (f3 != null ? f3.floatValue() : 0.0f), 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ComputedBorderRadius computedBorderRadiusComputeBorderRadii = computeBorderRadii();
        RectF rectFComputeBorderInsets = computeBorderInsets();
        RectF rectF = new RectF(getBounds().left + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.left : 0.0f), getBounds().top + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.top : 0.0f), getBounds().right - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.right : 0.0f), getBounds().bottom - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.bottom : 0.0f));
        float[] fArr = computedBorderRadiusComputeBorderRadii != null ? new float[]{innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null)} : null;
        float fDpToPx = PixelUtil.INSTANCE.dpToPx(this.offsetX);
        float fDpToPx2 = PixelUtil.INSTANCE.dpToPx(this.offsetY);
        float fDpToPx3 = PixelUtil.INSTANCE.dpToPx(this.spread);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fDpToPx3, fDpToPx3);
        rectF2.offset(fDpToPx, fDpToPx2);
        float fSigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(this.blurRadius);
        RectF rectF3 = new RectF(rectF2);
        float f2 = -fSigmaToRadius$ReactAndroid_release;
        rectF3.inset(f2, f2);
        if (fDpToPx3 < 0.0f) {
            rectF3.inset(fDpToPx3, fDpToPx3);
        }
        RectF rectF4 = new RectF(rectF3);
        rectF4.offset(-fDpToPx, -fDpToPx2);
        rectF3.union(rectF4);
        int iSave = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f3 : fArr) {
                arrayList.add(Float.valueOf(BoxShadowBorderRadiusKt.adjustRadiusForSpread(f3, -fDpToPx3)));
            }
            canvas.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, CollectionsKt.toFloatArray(arrayList), this.shadowPaint);
        } else {
            canvas.clipRect(rectF);
            canvas.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, InsetBoxShadowDrawableKt.ZERO_RADII, this.shadowPaint);
        }
        canvas.restoreToCount(iSave);
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return MathKt.roundToInt(((this.shadowPaint.getAlpha() / 255.0f) / (Color.alpha(this.shadowColor) / 255.0f)) * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.shadowPaint.setAlpha(MathKt.roundToInt((i2 / 255.0f) * (Color.alpha(this.shadowColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        if (Intrinsics.areEqual(borderInsets, this.borderInsets)) {
            return;
        }
        this.borderInsets = borderInsets;
        invalidateSelf();
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        if (Intrinsics.areEqual(borderRadiusStyle, this.borderRadius)) {
            return;
        }
        this.borderRadius = borderRadiusStyle;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
