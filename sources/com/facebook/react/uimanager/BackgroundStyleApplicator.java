package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.drawable.CSSBackgroundDrawable;
import com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable;
import com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawable;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.BoxShadow;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCI[\"}(\nWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cUoK>ht<\f(20V\u0002\u0005\u0017\u001a2H\u0016\u007f\u0003Ca\f\u001a0VpBR\u0013M\r\u001a(\u0006FĨ\u0007ɭ\\}ޮfH\u001b\\z4)\u0003ݦFN5_x\u0013[\u000e^TU\u000f'e,.X7c\u0019UW\u0011\fj[m\t\u0006v\u0006\u0013v.?+w{\b:f\u0003,\u0015YSS];4j\u000ei`:1[SqNh\u000eV{A{UQ\u0012\u0019\u001e)^-[&\u0017\f\u001c6\rr\u0002D\u0017\u0007ެF\u007f\tn~43\u000eK-O\u001a\u0015]\u0012?'QO{3\u0011N'\u000f}9[\u0003\u001e'\u001aôXw_B\u001aXKZf\fo<\u001c\u0017!f\u0010-\u001c0u\u0004_\u007f\u001fB/%ep\u007f(i{\u0010^\\i\r\u0004\u000f\u007f\u0004m`KX\"\u001d\u001a}/Q)h\\|\u0007\u0002O\u0003q\\\u0015[\u001fl\u0007,\fC$j\u0007T!S \u0015TŹmj[wR5=\u0002O[\u0005j<_ibA8ic>e\u0019v\\OJ~\u001dZ|A\u0002\u0016\u000b`6%JH\u0019\u0014>{\r\\\u001a0J? \u001ed0?\u001ct\u0015v\u0007dG\n\u001c\u0017}rh>\u0001\u000572\u0006\u0002$#\r1Xbo}\u0007\u0011KB{\u000f.sFپ9\u00194uj\u0007B\u001e;\u0007-u0KuO_L\u001b\u001a&a\nB.\"IS?=A3\u0015(`%sJ\u0015\u001asve\u0012U|-}\u001d>\u0001.\u0016\f\u001bt:o\u0003J}dG*|]\u0001B f\u0016x\u0010RALϭX\u000bid\u0012\u0013\u0011\u0001TNf~5#,(\u0019oP\u0001e1Q;5\u0016&)_\u001bo\u0006\u0002qDx\u0011\"ly.\u001c:\r.o\u0011S\u000e6I;aY-BR*z-ZJ\u0001v6YO9UXVl|p\u0005:}\u000f=\u0001~\u0007Z\u0011!ZiI+o,D^e8 [\u007f*]q>WRϬkm{x%#X=\"\u000b*3\u001f\u0016*@8V\u0006f96\u0014#08W:\u00115\u0003\u000elP:j \u000bqV\u001a\n\u001e}\u0018F\u000e\u0013G<P#S\\\u001eV\t\\\u0005y3\u0004\feiB\u000f1'3Lze5\u0013p^T]gb\u0007aP!\u001d\u0001N-\u001bk0\u0605Xn"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0012U{&9z >VB)zH%\u0015DlD\u000eg*J\u00061T\"", "", "u(E", "1kX=G6)O\u0018}~g.Y\u0013B", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "3mbBe,\u001cA\u0007[v\\2~\u00169u\t'", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017!)Y\u0011\u001a\u0013ncF\u0011s5MU4C^J)cRH", "3mbBe,\u001c]!\n\u0005l0\f\t\fa}.}M\u000b' FN\u001b8\t!2`}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4fy23j\u001d.\u0017!Es?(#lp9c_*Tx4Q\\W+;_nO\u0010\u000fa\u000e$", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004g\u001c\u0013XkWCr.7#a)Fm\u0018.Z\u0019", "5dc\u000fb9=S&\\\u0005e6\n", "3cV2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77|8OG9g;}\u0014ja\u000f", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\rKo<\u001a\u001edc9\u0014-:]\u000b.G\u001656^Vp9\u001bqY\u0010N\u0001Pk^=5j\u000e>\u001b\u0011.\u0013eDw\u0001\u000e\u0016\u001b\u000b", "5dc\u000fb9=S&kv]0\r\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cY\u0007\"Fp\u0001.ZA;tC\u001a\u0017h7", "1na;X9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGqp6YL", "5dc\u000fb9=S&l\nr3|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x\"-)oa\u000f", "5dc\u000fb9=S&p~];\u007f", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\rKo<\u001a\u001edc9\u0014-:]\u000b.G\u001656^Vp9\u001bqY\u0010N\u0001Pk^=5j\u000e>\u001b\u0011.\u0013bBr|\u001bk", "5dc\u0010F\u001a\u001bO\u0017\u0005|k6\r\u0012.", "5dc\u0010b4I]'\u0003\n^\tx\u00075g\r2\fI\u007fu$C\u0002\n9}%", "@db2g", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "1n[<e", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#\u0007,", "Adc\u000fT*DU&\t\u000bg+`\u0011+g\u007f", "0`R8Z9Hc\"}^f(~\t\u0016a\u0014(\tN", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r*KI=x>.\u001egEA\u0003e,5r;GY$", "Adc\u000fb9=S&\\\u0005e6\n", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\rKo<\u001a\u001edc9\u0014-:]\u000b.G\u001656^Vp9\u001bqY\u0010N\u0001s\nUR 8K3(\nu-\u000bJh\u0003\f#cx[", "Adc\u000fb9=S&kv]0\r\u0017", "@`S6h:", "Adc\u000fb9=S&l\nr3|", "0na1X9,b-\u0006z", "Adc\u000fb9=S&p~];\u007f", "EhSA[", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011p\n:v\"?c\u0004iDm\u0012,\\\rKo<\u001a\u001edc9\u0014-:]\u000b.G\u001656^Vp9\u001bqY\u0010N\u0001s\nUR 8K3(\nu*\tEd\u0010aY~", "Adc\u000fb?,V\u0015}\u0005p", "AgP1b>L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8`1>g3('>", "Adc\u0013X,=P\u0015|\u0001N5{\t<l{<", "2qPDT)ES", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BackgroundStyleApplicator {
    public static final BackgroundStyleApplicator INSTANCE = new BackgroundStyleApplicator();

    private BackgroundStyleApplicator() {
    }

    @JvmStatic
    public static final void clipToPaddingBox(View view, Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null) {
            canvas.clipRect(rect);
            return;
        }
        Path paddingBoxPath = cSSBackground.getPaddingBoxPath();
        if (paddingBoxPath != null) {
            paddingBoxPath.offset(rect.left, rect.top);
            canvas.clipPath(paddingBoxPath);
        } else {
            RectF paddingBoxRect = cSSBackground.getPaddingBoxRect();
            Intrinsics.checkNotNullExpressionValue(paddingBoxRect, "getPaddingBoxRect(...)");
            paddingBoxRect.offset(rect.left, rect.top);
            canvas.clipRect(paddingBoxRect);
        }
    }

    private final CSSBackgroundDrawable ensureCSSBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getCssBackground() != null) {
            return compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getCssBackground();
        }
        CSSBackgroundDrawable cSSBackgroundDrawable = new CSSBackgroundDrawable(view.getContext());
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewCssBackground(cSSBackgroundDrawable));
        return cSSBackgroundDrawable;
    }

    private final CompositeBackgroundDrawable ensureCompositeBackgroundDrawable(View view) {
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (CompositeBackgroundDrawable) background;
        }
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(view.getBackground(), null, null, null, null, 30, null);
        view.setBackground(compositeBackgroundDrawable);
        return compositeBackgroundDrawable;
    }

    @JvmStatic
    public static final Integer getBackgroundColor(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground != null) {
            return Integer.valueOf(cSSBackground.getColor());
        }
        return null;
    }

    @JvmStatic
    public static final Integer getBorderColor(View view, LogicalEdge edge) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground != null) {
            return Integer.valueOf(cSSBackground.getBorderColor(edge.toSpacingType()));
        }
        return null;
    }

    @JvmStatic
    public static final LengthPercentage getBorderRadius(View view, BorderRadiusProp corner) {
        BorderRadiusStyle borderRadius;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null || (borderRadius = cSSBackground.getBorderRadius()) == null) {
            return null;
        }
        return borderRadius.get(corner);
    }

    @JvmStatic
    public static final BorderStyle getBorderStyle(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground != null) {
            return cSSBackground.getBorderStyle();
        }
        return null;
    }

    @JvmStatic
    public static final Float getBorderWidth(View view, LogicalEdge edge) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        Float borderWidth = cSSBackground != null ? cSSBackground.getBorderWidth(edge.toSpacingType()) : null;
        if (borderWidth == null || Float.isNaN(borderWidth.floatValue())) {
            return null;
        }
        return Float.valueOf(PixelUtil.INSTANCE.pxToDp(borderWidth.floatValue()));
    }

    private final CSSBackgroundDrawable getCSSBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getCssBackground();
        }
        return null;
    }

    private final CompositeBackgroundDrawable getCompositeBackgroundDrawable(View view) {
        Drawable background = view.getBackground();
        if (background instanceof CompositeBackgroundDrawable) {
            return (CompositeBackgroundDrawable) background;
        }
        return null;
    }

    @JvmStatic
    public static final void reset(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((CompositeBackgroundDrawable) background).getOriginalBackground());
        }
    }

    @JvmStatic
    public static final void setBackgroundColor(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof CompositeBackgroundDrawable)) {
            return;
        }
        INSTANCE.ensureCSSBackground(view).setColor(num != null ? num.intValue() : 0);
    }

    @JvmStatic
    public static final void setBackgroundImage(View view, List<BackgroundImageLayer> list) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureCSSBackground(view).setBackgroundImage(list);
    }

    @JvmStatic
    public static final void setBorderColor(View view, LogicalEdge edge, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        INSTANCE.ensureCSSBackground(view).setBorderColor(edge.toSpacingType(), num);
    }

    @JvmStatic
    public static final void setBorderRadius(View view, BorderRadiusProp corner, LengthPercentage lengthPercentage) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        backgroundStyleApplicator.ensureCSSBackground(view).setBorderRadius(corner, lengthPercentage);
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        if (Build.VERSION.SDK_INT >= 28) {
            for (Drawable drawable : compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOuterShadows()) {
                if (drawable instanceof OutsetBoxShadowDrawable) {
                    OutsetBoxShadowDrawable outsetBoxShadowDrawable = (OutsetBoxShadowDrawable) drawable;
                    BorderRadiusStyle borderRadius = outsetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius == null) {
                        borderRadius = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    outsetBoxShadowDrawable.setBorderRadius(borderRadius);
                    BorderRadiusStyle borderRadius2 = outsetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius2 != null) {
                        borderRadius2.set(corner, lengthPercentage);
                    }
                    drawable.invalidateSelf();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            for (Drawable drawable2 : compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows()) {
                if (drawable2 instanceof InsetBoxShadowDrawable) {
                    InsetBoxShadowDrawable insetBoxShadowDrawable = (InsetBoxShadowDrawable) drawable2;
                    BorderRadiusStyle borderRadius3 = insetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius3 == null) {
                        borderRadius3 = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    insetBoxShadowDrawable.setBorderRadius(borderRadius3);
                    BorderRadiusStyle borderRadius4 = insetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius4 != null) {
                        borderRadius4.set(corner, lengthPercentage);
                    }
                    drawable2.invalidateSelf();
                }
            }
        }
    }

    @JvmStatic
    public static final void setBorderStyle(View view, BorderStyle borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureCSSBackground(view).setBorderStyle(borderStyle);
    }

    @JvmStatic
    public static final void setBorderWidth(View view, LogicalEdge edge, Float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        backgroundStyleApplicator.ensureCSSBackground(view).setBorderWidth(edge.toSpacingType(), f2 != null ? PixelUtil.INSTANCE.dpToPx(f2.floatValue()) : Float.NaN);
        if (Build.VERSION.SDK_INT >= 29) {
            CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
            BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
            if (borderInsets == null) {
                borderInsets = new BorderInsets();
            }
            compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderInsets(borderInsets);
            BorderInsets borderInsets2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
            if (borderInsets2 != null) {
                borderInsets2.setBorderWidth(edge, f2);
            }
            for (Drawable drawable : compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows()) {
                Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                ((InsetBoxShadowDrawable) drawable).setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
                drawable.invalidateSelf();
            }
        }
    }

    @JvmStatic
    public static final void setBoxShadow(View view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (readableArray == null) {
            setBoxShadow(view, (List<BoxShadow>) CollectionsKt.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            BoxShadow boxShadow = BoxShadow.Companion.parse(readableArray.getMap(i2));
            if (boxShadow == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            arrayList.add(boxShadow);
        }
        setBoxShadow(view, arrayList);
    }

    @JvmStatic
    public static final void setBoxShadow(View view, List<BoxShadow> shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shadows, "shadows");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BorderInsets borderInsets = INSTANCE.ensureCompositeBackgroundDrawable(view).getBorderInsets();
        for (BoxShadow boxShadow : shadows) {
            float offsetX = boxShadow.getOffsetX();
            float offsetY = boxShadow.getOffsetY();
            Integer color = boxShadow.getColor();
            int iIntValue = color != null ? color.intValue() : ViewCompat.MEASURED_STATE_MASK;
            Float blurRadius = boxShadow.getBlurRadius();
            float fFloatValue = blurRadius != null ? blurRadius.floatValue() : 0.0f;
            Float spreadDistance = boxShadow.getSpreadDistance();
            float fFloatValue2 = spreadDistance != null ? spreadDistance.floatValue() : 0.0f;
            Boolean inset = boxShadow.getInset();
            boolean zBooleanValue = inset != null ? inset.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList2.add(new InsetBoxShadowDrawable(context, INSTANCE.ensureCSSBackground(view).getBorderRadius(), borderInsets, iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2));
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList.add(new OutsetBoxShadowDrawable(context2, INSTANCE.ensureCSSBackground(view).getBorderRadius(), iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2));
            }
        }
        view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewShadows(arrayList, arrayList2));
    }

    @JvmStatic
    public static final void setFeedbackUnderlay(View view, Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewFeedbackUnderlay(drawable));
    }
}
