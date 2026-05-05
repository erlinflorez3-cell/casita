package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яī\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr9FDmHDR[*\u0015k\u00044:[,ڎK;c\u001a\u0006̝\u0011OdgonPZ\u0013C%\u0006\u001eюr,W^\u0001]\u0018\u0013:B}F;Mu>A`\u000b6\r H\"@ц\r\u0001(0PƵ~zYK\u0014\u00126Dx:h\rUĨ\"\u0012\u001c>(\u0001$aoNLHt]@1+\u0003\u007fBV'e2\u0005M#F\\'\u0013zi\u001eA@?5\u001b'[\u0003\u001dRc?\tEy=\u001bh/'1JyVLݙ\u001egE+}\f\u000erT\\=Q4`g~_gYQ&(&|\fCJ\u0007&87Y><Hkڿ\u0012=zxcFV\tnD\u0006\u0001\b>'8\u0010DA8IoЂeE\u001fTG\u0002\u000b\u0014.%\u0007tGed\u0010p\u0015I_&UA[NI`T\u001a[Mm2{\u0011\u000fò\b0U\u000ew\n\u001f[/%efi'/s\u001aHrl=\u0005)na\u0018jHn-5*\u007fB\u0017;rD\u0013\u0010\u001cTb`D\u0011{!\u0005\r\f\u0012+\"rvj*k$\u0017Uv\u001a\u0003M\f\u0015kC/Og \u0004\u000e\u0006D\u000f7C\u0004{\u0010\u0010\u0006=(ά;ϵۖ\\hH\b\u001a\u0010%@0h`j>\n,H\\C+2m*bHв0ǉÅ\u0019J\tWP{E\u001fm\u0016\u0001\u0010-_c(\u0011&<t7>\u0001`~.\u007fxw>CtjMO\u0011M\u0019T\u000eRlB=;\u0007-,0Ku\u000b_L\u001b(<iߡ\u001fچ׀=S5~!QGA@EEEz}\u0016U[I?z+>UOŕ-ԖŰnr2&x\u0011\u0018l%i\u000f^!.8h\u000eByF)\u0011*h¤ZŬϗv\u0005_\u0007\\~ES-i=\u0001\u001e--k;F?O&\t$>Cfԃmy4\u007fr\u0015,{u\u00062i<wrdmCQ7wb˽B,*r\u0013HNq\b\nH\u000fZ\u0017CJQd\u001fafQ;9\fr\u001f2\u001drf[h\u001e\u001e\u000bzB(B\u0002\u0010\u0016\u0014\rNU\u0015[\u0006\u007fm\u001c~#\u001fϠ\u000eϘν\u007f3t_*rh\\e1!04~^6\nApTT\tR?rPP\u0019Q%\u0002\u0006>\u00060Jm`/2pF\u0002j^`\u0007knH3p\u001cǺ#Ǆ\u0005~\u0017ɼn9C4\u001d\"Ve?r`\u0006Ә!\u0013!p_\u0005l,;FZ?A0h\u0014\u001bVsBw\u000b\u0530\bQ/s{u\u0012?(~#H>%IS!_%;t\n\u0004h%Љ\u0003ՆjRVÝy\u000b\t\u000e&<8!aĂ[ζsb5ً\u001f\fEO2\t'F9\u0007:\byEI:\\י9ִMj\u001c՝LcaN\u0016\bN2}\u05f7\u0001ֈ`W\u0016ўZy)O.qDt2\r!d8\u0004\\\\33`ڗ\u0014˩S\b;ø3`_\u0002\u00068\u001199\u0005\u001eBy\u0002/^:ذe߾Y\u000f\u001bh7p\b\n}b+%?S>\u0015hZh/\u0002=/Ҽ\u0002ȗ\u0019&'ߎXn7/gc\u0017\u0011Bϊgá//sˋ2=>s6}M\u001cLå,ķ,\u0015Cۮ\u001eMr\ntlpYеbp0˯\r\u000e/7\u000b#\u0019p\u001f8LF!7\u001b\u0004\u000eض!˝\u0011Kx\t\nkWAq=`f37`)FČx\u05ce\u0007:jߍP8P1\u000b\u0002}+[o+ط&ž]$uѦS:YoPB6WgÃ\u001d͈Y߀օ=[ӭ =Y3OE։\u0001\u001e@\tu߀5ciYS+Iʱ\u0001V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\"gH\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006X21d\u0001$5T\u0012BMP\u001ft5(j", "=v]2e\u001dBS+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">`a2a;%O-~\b", "", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RN\u0011O\u0007\u0016%\u00159s:Gg\u0018\u0011z%~?8lPbmC(QN`9h\u0016hg2}+", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "2qPDa\u001eBb\u001cs", "", "7r32f;K]-~y", "D`[BX", "7r36e;R", "Adc\u0011\\9Mg", "uY\u0018#", ":`h2e\u0010=", "", "5dc\u0019T@>`|}", "u(9", ";`c?\\?\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001cU\u0012 DU\u0012=ZGNI0\u001c\u0018h7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h7", ";tc.g,=4\u001d~\u0002]:", "", "=tc9\\5>@\u0019\r\u0005e=|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001fi\r';v\u0016\u001bMQErE\u001e\">", "5dc\u001cj5>`\n\u0003zp", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", "=v]2e\u001dBS+by", "5dc\u001cj5>`\n\u0003zp\u0010{", "@d]1X9']\u0018~", "AnUAj(KS\u007fz\u000f^9g\u00053n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "\u0018", "1kX=E,GR\u0019\fch+|", "2dbAe6R", "2qPD?(RS&", "7me._0=O(~", "7me2e:>B&z\u0004l-\u0007\u00167", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "7me2e:>B&z\u0004l-\u0007\u00167-Ozx&}\t\u0015", "uZ5uI", "7r8;?(RS&", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7r8;?(RS&F\u0001&z\u0004tyM", "uI\u0018'", ";`_\u000fb<GR'", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "7me2e:>", ";`_\u001cY-LS(", ">nX;g", ";`_\u001cY-LS(FML\u007fml>k", "uIIu=", ";ne2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";ne2 s@g-rWl", "uI\u0018#", "@db6m,", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "@db6m,\u0006].\u0007\u0010S\u0017`", "@dd@X\u0013:g\u0019\f", "BqP;f-H`!", "BqP;f-H`!FJ1)b\u0006!c", "BqX4Z,K@\u0019\nvb5\f", "CoS.g,\u001dW'\n\u0002Z@c\r=t", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "\u0011n\\=T5B]\"", "#mX>h,\u001d`\u0015\u0011~g.`\b\u000bp\u0004tO", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithZ;
    private Function0<Unit> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function2<DeviceRenderNode, Matrix, Unit> getMatrix = new Function2<DeviceRenderNode, Matrix, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };
    private final OutlineResolver outlineResolver = new OutlineResolver();
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        RenderNodeApi23 renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        renderNodeApi23.setClipToBounds(false);
        this.renderNode = renderNodeApi23;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    private final void setDirty(boolean z2) {
        if (z2 != this.isDirty) {
            this.isDirty = z2;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z2);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007fјl˕9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\"gH\u001e\"'QB\u000bo<NU4C^R5^6q\u0019\u001f\u0016'a$", "", "u(E", "5dc\"a0Jc\u0019]\bZ>\u0001\u00121I~", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0<Unit> function0;
        int mutatedFields$ui_release = (-1) - (((-1) - reusableGraphicsLayerScope.getMutatedFields$ui_release()) & ((-1) - this.mutatedFields));
        int i2 = (-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 4096));
        if (i2 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo4367getTransformOriginSzJe1aQ();
        }
        boolean z2 = false;
        boolean z3 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 1)) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((2 & mutatedFields$ui_release) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 4)) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release + 8) - (8 | mutatedFields$ui_release) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((16 & mutatedFields$ui_release) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((32 & mutatedFields$ui_release) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release + 64) - (64 | mutatedFields$ui_release) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m4232toArgb8_81llA(reusableGraphicsLayerScope.mo4363getAmbientShadowColor0d7_KjU()));
        }
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 128)) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m4232toArgb8_81llA(reusableGraphicsLayerScope.mo4366getSpotShadowColor0d7_KjU()));
        }
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 1024)) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 256)) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release + 512) - (512 | mutatedFields$ui_release) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((-1) - (((-1) - mutatedFields$ui_release) | ((-1) - 2048)) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i2 != 0) {
            this.renderNode.setPivotX(TransformOrigin.m4564getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m4565getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z4 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((24576 & mutatedFields$ui_release) != 0) {
            this.renderNode.setClipToOutline(z4);
            this.renderNode.setClipToBounds(reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo5865setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo4364getCompositingStrategyNrFUSI());
        }
        boolean zM5905updateS_szKao = this.outlineResolver.m5905updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z4, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo4365getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z4 && !this.outlineResolver.getOutlineClipSupported()) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && zM5905updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo5797isInLayerk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fM3937getXimpl && fM3937getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= fM3938getYimpl && fM3938getYimpl < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m5904isInOutlinek4lQ0M(j2);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo5800resizeozmzZPI(long j2) {
        int iM6808getWidthimpl = IntSize.m6808getWidthimpl(j2);
        int iM6807getHeightimpl = IntSize.m6807getHeightimpl(j2);
        this.renderNode.setPivotX(TransformOrigin.m4564getPivotFractionXimpl(this.transformOrigin) * iM6808getWidthimpl);
        this.renderNode.setPivotY(TransformOrigin.m4565getPivotFractionYimpl(this.transformOrigin) * iM6807getHeightimpl);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iM6808getWidthimpl, this.renderNode.getTop() + iM6807getHeightimpl)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo5799movegyyYBs(long j2) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int iM6766getXimpl = IntOffset.m6766getXimpl(j2);
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (left == iM6766getXimpl && top == iM6767getYimpl) {
            return;
        }
        if (left != iM6766getXimpl) {
            this.renderNode.offsetLeftAndRight(iM6766getXimpl - left);
        }
        if (top != iM6767getYimpl) {
            this.renderNode.offsetTopAndBottom(iM6767getYimpl - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z2 = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z2;
            if (z2) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, Paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo4033concat58bKbWc(this.matrixCache.m5882calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            final Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
            if (function2 != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new Function1<Canvas, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
                        invoke2(canvas);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Canvas canvas) {
                        function2.invoke(canvas, null);
                    }
                });
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo5798mapOffset8S9VItk(long j2, boolean z2) {
        if (z2) {
            float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this.renderNode);
            return fArrM5881calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m4415mapMKHz9U(fArrM5881calculateInverseMatrixbWbORWo, j2) : Offset.Companion.m3951getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m4415mapMKHz9U(this.matrixCache.m5882calculateMatrixGrdbGEg(this.renderNode), j2);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z2) {
        if (z2) {
            float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this.renderNode);
            if (fArrM5881calculateInverseMatrixbWbORWo == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                androidx.compose.ui.graphics.Matrix.m4417mapimpl(fArrM5881calculateInverseMatrixbWbORWo, mutableRect);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m4417mapimpl(this.matrixCache.m5882calculateMatrixGrdbGEg(this.renderNode), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo5801transform58bKbWc(float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m4426timesAssign58bKbWc(fArr, this.matrixCache.m5882calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo5796inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this.renderNode);
        if (fArrM5881calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m4426timesAssign58bKbWc(fArr, fArrM5881calculateInverseMatrixbWbORWo);
        }
    }

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njG0L͜N\u0093Siճ?k*3d`*qٴ?U(}r']O\u007fy~Lj\u000bq\u0012\u0016\u0018\tjZMezm\u0012=7pq\u0016ݏOڱA9hҚȫ\t&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\"gH\u001e\"'?C\u000fn(Wz1P\"", "", "u(E", "5dc\u001aT;KW,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
