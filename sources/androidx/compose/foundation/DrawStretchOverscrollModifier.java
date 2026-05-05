package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fy{<$q$yCAU\"}8\tWNmivJh\u0014KƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG3SuE9ny>\u0005&4*8\u0010\u0005\tɝ0I&͌+Cy\u000bB0npz~\u001dQ\u0013\u001b*\u0006l\"\u0011\"jjf6vpmO=(\u001bzRP7_^\u0004]\u000fVTU\u0015%gӿ/@=>չ)S\u0011\u0011\u001buM\u0013Wqk\u0016\u0019+5=as\u0006I\t\b\")CS;r[&;\u001b\u0018`TA9f{K~\u001fX{\t\u0014%<2!6/VBE\u001e\u0015\u001dv3S\t\u001a@\u0019\u001cl[\u0018z\u0010GG)\u000eMC9Iy\u0002iI-f;*\u001au\u001e\u0002\u00175!$n\u001c{-\u001b\u0003\t\u00025_\\UH|\u001d\nE{\u0018\tf0?l0&\u0016u{YP%BO[g4Qo\u0010f\\g%$\u0011la\njHn5\u001f\u001eE>!\u0010\tYM\u0005Jf\u001bXt\u0017[=l\u0007,\u0019Y %}JC=\u0010|`/i3Wk-=/\u0015?\u0002n\u001a2\u001eM/AC\\{\u0012wQ% \u0016ֽnۖ\\fJͭ\\fj+:2vnfǱ}ΌR\f\u001bԵ\u0010}*5D1G^kȀ\u0005ٿFA\u0005ȁ0lv\u001d\u0017Ta09*zڒ\u000bɹT`\tqm\u0007W;ʲdG"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0004BU\u0010\u000eFz\u0016=KF%|4+#fnC\u000ej\u0014Xu+HPN92", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\u001dc|$8q\u0016;#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z47rD\u001exqbC\\", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;lu-OC\u001bl5\u001e\u0013wKJ\u0007p:L\u00041NS.-]RpLi", "3cV28-?S\u0017\u000elk(\b\u0014/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00054[}\u007f8n\u0016,\\5Hg?)\u0015u7", "7mb=X*M]&b\u0004_6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u0011b|-Aq\u0015\u000eLE;K5\u001f\u0015fp#\u0018c9\\t4QSU\f]Sr;#gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005i\u000b\u001c\u001f\r1ytL_Y'x\u0017u!*iFWnkT=Pm*qaF#fIA(\u001d;\u001e,p\u001a/\u001a\u0005Q v\\\u0003u1()\u000463Bwd\u0012\u001b3F", "-qT;W,K<#}z", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$0y\r<L", "@d]1X9']\u0018~", "5dc\u001fX5=S&g\u0005],", "u(;.a+K]\u001d}D`9x\u00142i}6E-\u0001 \u0016G|vFu%\u000b", "2qPD56Mb#\u0007hm9|\u0018-h", "", "0ncAb4", "\u001a`]1e6BRb\u0011~].|\u0018xE~*{ \u0002\u0018\u0017E~c", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms*VT7y\n", "2qPD?,?b\u0007\u000e\b^;z\f", ":dUA", "2qPDE0@V(l\nk,\f\u00072", "@hV5g", "2qPDG6IA(\fzm*\u007f", "Bn_", "2qPDJ0MV\u0006\t\nZ;\u0001\u00138", "@nc.g0H\\w~|k,|\u0017", "", "3cV28-?S\u0017\u000e", "Ag^B_+\u001d`\u0015\u0011]h9\u0001\u001e9n\u000f$\u0003.\u0010$\u0017Vm\u0011", "Ag^B_+\u001d`\u0015\u0011k^9\f\r-a\u0007\u0016\u000bM\u0001&\u0015J", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DrawStretchOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private RenderNode _renderNode;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawStretchOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
    }

    private final RenderNode getRenderNode() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNode2;
        return renderNode2;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        boolean zDrawLeftStretch;
        float f2;
        float f3;
        this.overscrollEffect.m557updateSizeuvyYCjk$foundation_release(contentDrawScope.mo4734getSizeNHjbRc());
        if (Size.m4008isEmptyimpl(contentDrawScope.mo4734getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        float f4 = contentDrawScope.mo710toPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean zShouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean zShouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (!zShouldDrawVerticalStretch || !zShouldDrawHorizontalStretch) {
            if (zShouldDrawVerticalStretch) {
                getRenderNode().setPosition(0, 0, nativeCanvas.getWidth() + (MathKt.roundToInt(f4) * 2), nativeCanvas.getHeight());
            } else if (zShouldDrawHorizontalStretch) {
                getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (MathKt.roundToInt(f4) * 2));
            } else {
                contentDrawScope.drawContent();
                return;
            }
        } else {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = getRenderNode().beginRecording();
        if (edgeEffectWrapper.isLeftNegationStretched()) {
            EdgeEffect orCreateLeftEffectNegation = edgeEffectWrapper.getOrCreateLeftEffectNegation();
            drawRightStretch(orCreateLeftEffectNegation, recordingCanvasBeginRecording);
            orCreateLeftEffectNegation.finish();
        }
        if (edgeEffectWrapper.isLeftAnimating()) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            zDrawLeftStretch = drawLeftStretch(orCreateLeftEffect, recordingCanvasBeginRecording);
            if (edgeEffectWrapper.isLeftStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateLeftEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect), 1 - Offset.m3938getYimpl(this.overscrollEffect.m556displacementF1C5BW0$foundation_release()));
            }
        } else {
            zDrawLeftStretch = false;
        }
        if (edgeEffectWrapper.isTopNegationStretched()) {
            EdgeEffect orCreateTopEffectNegation = edgeEffectWrapper.getOrCreateTopEffectNegation();
            drawBottomStretch(orCreateTopEffectNegation, recordingCanvasBeginRecording);
            orCreateTopEffectNegation.finish();
        }
        if (edgeEffectWrapper.isTopAnimating()) {
            EdgeEffect orCreateTopEffect = edgeEffectWrapper.getOrCreateTopEffect();
            zDrawLeftStretch = drawTopStretch(orCreateTopEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isTopStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateTopEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect), Offset.m3937getXimpl(this.overscrollEffect.m556displacementF1C5BW0$foundation_release()));
            }
        }
        if (edgeEffectWrapper.isRightNegationStretched()) {
            EdgeEffect orCreateRightEffectNegation = edgeEffectWrapper.getOrCreateRightEffectNegation();
            drawLeftStretch(orCreateRightEffectNegation, recordingCanvasBeginRecording);
            orCreateRightEffectNegation.finish();
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            EdgeEffect orCreateRightEffect = edgeEffectWrapper.getOrCreateRightEffect();
            zDrawLeftStretch = drawRightStretch(orCreateRightEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isRightStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateRightEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect), Offset.m3938getYimpl(this.overscrollEffect.m556displacementF1C5BW0$foundation_release()));
            }
        }
        if (edgeEffectWrapper.isBottomNegationStretched()) {
            EdgeEffect orCreateBottomEffectNegation = edgeEffectWrapper.getOrCreateBottomEffectNegation();
            drawTopStretch(orCreateBottomEffectNegation, recordingCanvasBeginRecording);
            orCreateBottomEffectNegation.finish();
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
            boolean z2 = drawBottomStretch(orCreateBottomEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isBottomStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateBottomEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect), 1 - Offset.m3937getXimpl(this.overscrollEffect.m556displacementF1C5BW0$foundation_release()));
            }
            zDrawLeftStretch = z2;
        }
        if (zDrawLeftStretch) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
        float f5 = zShouldDrawHorizontalStretch ? 0.0f : f4;
        if (zShouldDrawVerticalStretch) {
            f4 = 0.0f;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(recordingCanvasBeginRecording);
        long j2 = contentDrawScope.mo4734getSizeNHjbRc();
        Density density = contentDrawScope2.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope2.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = contentDrawScope2.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer = contentDrawScope2.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo4656setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(null);
        Canvas.save();
        try {
            contentDrawScope2.getDrawContext().getTransform().translate(f5, f4);
            try {
                contentDrawScope.drawContent();
                Canvas.restore();
                DrawContext drawContext2 = contentDrawScope2.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                getRenderNode().endRecording();
                int iSave = nativeCanvas.save();
                nativeCanvas.translate(f2, f3);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(iSave);
            } finally {
                contentDrawScope2.getDrawContext().getTransform().translate(-f5, -f4);
            }
        } catch (Throwable th) {
            Canvas.restore();
            DrawContext drawContext3 = contentDrawScope2.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    private final boolean shouldDrawVerticalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isTopAnimating() || edgeEffectWrapper.isTopNegationStretched() || edgeEffectWrapper.isBottomAnimating() || edgeEffectWrapper.isBottomNegationStretched();
    }

    private final boolean shouldDrawHorizontalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isLeftAnimating() || edgeEffectWrapper.isLeftNegationStretched() || edgeEffectWrapper.isRightAnimating() || edgeEffectWrapper.isRightNegationStretched();
    }

    private final boolean drawLeftStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(270.0f, edgeEffect, canvas);
    }

    private final boolean drawTopStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(0.0f, edgeEffect, canvas);
    }

    private final boolean drawRightStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(90.0f, edgeEffect, canvas);
    }

    private final boolean drawBottomStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(180.0f, edgeEffect, canvas);
    }

    private final boolean drawWithRotation(float f2, EdgeEffect edgeEffect, Canvas canvas) {
        if (f2 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f2);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
