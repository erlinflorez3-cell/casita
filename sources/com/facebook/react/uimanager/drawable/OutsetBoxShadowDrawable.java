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
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpAӄLeV3ZS0\u0017s{J$cҕyCIU\"Ԃ*\teNogtJb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00155JoU3UڎC8vҚf\u0005N1bw\n\t\u000f\u001aBH>w\u000bKQ\f 2XrPQ;P\u0015\u001e \nV /#lk\\<`l\fA?'\u0011qZNUf@\u0001[\u0016^TU\u0014\u0007e,5X7c\u001cȏW\u0003\u0015]$M\u0011R\n=3|W+9^\fWdnF(]A]$urTp5Un!?+}y{T\u001c@\u0010z*&\u0003\u0004V,5bF-Hz8\u0012A\n\u000bSnf2bP\u0018\u0013ad0U\u0004AFQ\u001b\u0015X\u0012?'jO{3*d#It/yl\u000e\u000f\u001aah@_?pX=vb:]K\u000e\u001cp\u0011\u0007p\u0018xW\u000eP\u0014\u0011\\+U=i[;#\u0002\u0001vg.\u000bUlv\\\u0002RvGxÅ\u0018֖.\t\u0014ɮ\u0015\u000b\u0013mhVn+?PLZ\u0015\n \u00156[&?_ifʡ[ŹmvUΪ\"'5sEg\u000fm\u0014fGn\u0004A_c(a\u0001wj̶>И\tXn̻$\u0018hb@\"`OAݛyԞHN\u0014Ǝ\u0003K\u007f$L,_ 3ìJҴ\"BIґYkhl(~\u00038zѳk˨x\t\tˆ-|}x\u0011IZ\u000f7ø/ۮU5!ğ&.v>\u0015#5\u0006JÕIѨPGT˾מyy"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017-KzB\u001e$EkLtf(M\u00019&YJ>XOy=i", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0na1X9+O\u0018\u0003\u000bl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGtr@Uv|", "AgP1b>\u001c] \t\b", "", "=eU@X;1", "", "=eU@X;2", "0kd?E(=W)\r", "Aoa2T+", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~Zy\u001e7j 8S\rHk0\u001c$2q=\u000f_5Jx'T\u0016\\;pYr\u0007p\u001cg\rN8y\u0001XE4|2F3\u000f,\u001fe\u001cIalY~", "D`[BX", "5dc\u000fb9=S&kv]0\r\u0017", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#\f/Kt\u0016w*MHj4+\u0002d`=\u0017q\u001a]\u000b.G\"", "Adc\u000fb9=S&kv]0\r\u0017", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\u000bWP:kA\u000b\u0011geI\u0015Q;b}'\u001d\u0010?", "AgP1b>)O\u001d\b\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "2qPD", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPDF/:R#\u0011g^*\f", "AgP1b>+S\u0017\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "2qPDF/:R#\u0011gh<\u0006\b\u001ce}7", "Aoa2T+\u001ef(~\u0004m", "1n\\=h;>Ru\t\b],\nu+d\u0004,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ$", "5dc\u001cc(<W(\u0013", "Adc\u000e_7AO", "/k_5T", "Adc\u0010b3H`y\u0003\u0002m,\n", "1n[<e\rBZ(~\b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OutsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;
    private final Paint shadowPaint;
    private final float spread;

    public OutsetBoxShadowDrawable(Context context, BorderRadiusStyle borderRadiusStyle, int i2, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shadowColor = i2;
        this.offsetX = f2;
        this.offsetY = f3;
        this.blurRadius = f4;
        this.spread = f5;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i2);
        if (f4 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f4 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }

    public /* synthetic */ OutsetBoxShadowDrawable(Context context, BorderRadiusStyle borderRadiusStyle, int i2, float f2, float f3, float f4, float f5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 + 2) - (i3 | 2) != 0 ? null : borderRadiusStyle, i2, f2, f3, f4, f5);
    }

    private final void drawShadowRect(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(rectF, this.shadowPaint);
    }

    private final void drawShadowRoundRect(Canvas canvas, RectF rectF, float f2, ComputedBorderRadius computedBorderRadius) {
        RectF rectF2 = new RectF(getBounds());
        rectF2.inset(0.4f, 0.4f);
        Path path = new Path();
        path.addRoundRect(rectF2, new float[]{computedBorderRadius.getTopLeft().getHorizontal(), computedBorderRadius.getTopLeft().getVertical(), computedBorderRadius.getTopRight().getHorizontal(), computedBorderRadius.getTopRight().getVertical(), computedBorderRadius.getBottomRight().getHorizontal(), computedBorderRadius.getBottomRight().getVertical(), computedBorderRadius.getBottomLeft().getHorizontal(), computedBorderRadius.getBottomLeft().getVertical()}, Path.Direction.CW);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(rectF, new float[]{BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getTopLeft().getHorizontal(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getTopLeft().getVertical(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getTopRight().getHorizontal(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getTopRight().getVertical(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getBottomRight().getHorizontal(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getBottomRight().getVertical(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getBottomLeft().getHorizontal(), f2), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadius.getBottomLeft().getVertical(), f2)}, Path.Direction.CW);
        canvas.drawPath(path2, this.shadowPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusResolve;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fPxToDp = PixelUtil.INSTANCE.pxToDp(getBounds().width());
        float fPxToDp2 = PixelUtil.INSTANCE.pxToDp(getBounds().height());
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        ComputedBorderRadius computedBorderRadius = (borderRadiusStyle == null || (computedBorderRadiusResolve = borderRadiusStyle.resolve(getLayoutDirection(), this.context, fPxToDp, fPxToDp2)) == null) ? null : new ComputedBorderRadius(new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), PixelUtil.INSTANCE.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
        float fDpToPx = PixelUtil.INSTANCE.dpToPx(this.spread);
        RectF rectF = new RectF(getBounds());
        float f2 = -fDpToPx;
        rectF.inset(f2, f2);
        rectF.offset(PixelUtil.INSTANCE.dpToPx(this.offsetX), PixelUtil.INSTANCE.dpToPx(this.offsetY));
        int iSave = canvas.save();
        if (computedBorderRadius == null || !computedBorderRadius.hasRoundedBorders()) {
            drawShadowRect(canvas, rectF);
        } else {
            drawShadowRoundRect(canvas, rectF, fDpToPx, computedBorderRadius);
        }
        canvas.restoreToCount(iSave);
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
