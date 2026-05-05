package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: GraphicsLayerOwnerLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŇ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u00044:[,qY;]\u001a\u0004#\u0011O\\goñRZ!C\u0017\u0006\u001cxr,_U\u0001ز\u001a\u000f@KwЀ;M\u0006=A`z;\r @)@y\u000b\u0002\"*^\u0010~zIK\u0014\u0012>FxíZ\rc\u0005\"\u0012\f?(\u00014\\oNLHt]P/+ɅqBd'gܞ\u0005M#F\\'\u0013vi\u001eA@?ߎ\u001d%i\u0003\u000fѸc?\u0019?y=\u000bu/'AI{W<Z\b\u0014++W\rcv.\\\u001bQh\f-3WcaP\u0016(}{\u0002ȞRǉ>\u0006UG^-HfHsCx\u0001TXP0`R\u0006\tdN\u0019;~a/I\u001ftVy;GTG2\u0013\u00146U\u0011\u007f1j\u0003\u0017\u05ce\u0019%Z\u0002a7WKMJT\u0010\u007fI}\u0017\u0001s\u0018)22Ͻ\u00049\u0002\u001b>\u001d+Bk;)'\u0012\u000fXFwv3n\u0017[y\\VO:t&9:\t:hrtʰoPbit\u001f[Vl\u0007,\u0016C$j\u0004T!S\u0019\u0015O1ox\tu\nS=-K\"\u0007yJo9\rAeUq\u001cyR%\u001doBp\u0012phXR:\\#<jGV((y\u0012C|#Y2Ǧp\u001bڲ+ջǬ`\u0017NA,\u0002\n\u0010\u0017 rh>\u0016\u001b3˭\u0002h̾sէɹT^v1u8\u00122\u000b#:-o_{-nm0,L|Q\u0015/w\u000e\f\u007fLuc3*çTݨ°\u001a\u001c?\u0017=\u0004['\rpJ\u0002[Z|vs\u001ae\u0012UDC\u000eԱ:Ü\u05cek\np;:,3`]!/\"%l#'\u00162\u0018y\u0010\u0015+Kq$#[l^9\u0017\"\\\\\t\u0015\u0005MgU\u0005}s\u00155[\rW!$G,/Cv$}ݩ-Ӡˏ\u0013(z8\u0012\u007f,.}7i]`IhMgGV\"RBIVَi̫ڇF\u000b:cA \n|~/PM9=.j\u0015]%p\u0005\u000e\u0001'\u0383|Үˀc,y\u001d\fk'\u00123keS\u0016{\u001e\u0002j\u0012bA\u001a\u001c\f@\u001d\u001bεA*\\ar\u000f6\u0011\u0004\u001a<Gan\u0015O\u00195J+j\nդG^o\u0010 \u0001\u0006Qo\u0011\u001d8h\u0001KX\u001eT'j\u0005P5jSo90\u0011\u0001\u001f3L\u0007cAK\u0002\u000fl=?J\u0001\u0002+9\u001fx\u0014\u0017fSB\u000bhܜ\u001aι\u0092\u0005\rK:Q\u0010J<\u0012%Am\u001a}R8`\u0003+!0\u001bg_Ws?>ljmd|r'\u0016t\u0002f\"W_A\u0011VB\u0018p#\u0019}\u00016buR\\ZOCH\u000f]Dy\u0015\u001a\u007f{H1,49\u0004֔Kހ\u0018'\u0004ߺ$G\f\u001a8 U\u0017Kըh߉\u0012f\u0012܁kz$x.\u0017\u0012\u001a#_N\r̛N~x\u0014>\u000e<Z\u00125\b\u0019\u0005e{\u000b1Q=*\u001b\b\u05ffOr~\u0014sriye\r\tlWc\np=PK\u0017=L\\\u001b/ŗFñW `ҹP #:766w\u007fք[ʍlpsχ,\u001990\u0004*\u00103\u0007ܿ*ݼ#y}âzh6$S^]@t\t\u000bzXV<nAۭpé\u0010)\u001cΙO^l'+6\\qL{\u0006б%\u074bZƬՊ_\u0006ʺIK.!?j\u0010'EK#oV\fgܞFŪx\u007f2ХY\u000f\u000e\u0003D-tim\u001e5s<m\u0013\u0018d\f\u001cвNݭ0\u0017\u0016ıO\\><Lyj.IoKAG07i\u000fۤq߁\u001d9\u0003SYE8\"M\r\u001ba\u00121\u001a]Jم~ܯ3\u000fwߦ(zIIMez>b֎g۽}\u07b7\u0087U\u000eˋ0K=E,\u0012&L\u000e/7$R,L\u0081\fӽ5H2أ-Nd\u001bo\u0006<)d\u0017\u001bïSـ|s\u0012\u07bf:$\u0002isabGQ߰\u001bܵB*5ìWW[\u0012\u0012\u000br,{h\u000eʫ\bԠ7\u001b\u0015\u0012U\u001cNL\u001a\u0010[ZtnL\u0015\u0004\u0004h_q8\nGngX2Я\u0016Ti\u0019A҆S̼\u00148\u001aԔ]\u0010\u0006`j`.\u0011sȄ)ֲzF>˧IaO\u0014#@=V5ܾNֶ\nʏß-Gǩ\u0006\u007fR`#F\u0004U\u0002u_\u0014lzORg؆1͘)grޯ\u0010c\u007f\u000fU;I\n\u001c\u0002/˅qۇ\tU)ɿ5?#8\u0003+\\\u0001-Ð&åWƙۿDcэ\u0014F\u0001D6!Ӫ09X\u0002`\u05cey/\u001b'=[4א\u0003\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0017fy+:q\u0014<4?OkA\b'qaFm_@N\u0004|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006X21d\u0001$5T\u0012BMP\u001ft5(j", "5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "1n]AX?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "=v]2e\u001dBS+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`]CT:", ">`a2a;%O-~\b", "", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b&{@B\"\f*WK\u001du|\u0017\u0019\u00123xNL_\u001fG\r$K(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]| \u0017wQ8\u0017\u0004\u001dl{Q\u0007qkFv\u0005@/H{[7Iog\u0012[-)Z\u0003{\u001b{]\u00063>.\u0014=(Eh\u000fTua\u001fn\u0002\u0013;`K0r\f#\u0019IZjyu\b\u0013y'+\t\u001ek3@\u001donq\u0012o\u0017f\u0015j9khK\r\u0016v", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2qPDa\u001eBb\u001c^\u0004Z)\u0004\t.Z", "", "7me2e:>;\u0015\u000e\bb?Z\u0005-h\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", "7r32f;K]-~y", "D`[BX", "7r36e;R", "Adc\u0011\\9Mg", "uY\u0018#", ":`h2e\u0010=", "", "5dc\u0019T@>`|}", "u(9", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ";`c?\\?\u001cO\u0017\u0002z", ";tc.g,=4\u001d~\u0002]:", "", "=tc9\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "=v]2e\u001dBS+by", "5dc\u001cj5>`\n\u0003zp\u0010{", "@dR<e+%O!{yZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0018", "AnUAj(KS\u007fz\u000f^9g\u00053n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "Bl_\u001dT;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "1kX=@(Gc\u0015\u0006\u0002r", "2dbAe6R", "2qPD?(RS&", "5dc\u0016a=>`'~bZ;\n\rB", "5dc\u0016a=>`'~bZ;\n\rB-M,O\u0013c\t)", "u(J\u0013", "5dc\u001aT;KW,", "5dc\u001aT;KW,F\tJ\u0012h\u000e3Q", "7me._0=O(~", "7me2e:>B&z\u0004l-\u0007\u00167", ";`c?\\?", "7me2e:>B&z\u0004l-\u0007\u00167-Ozx&}\t\u0015", "uZ5uI", "7r8;?(RS&", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7r8;?(RS&F\u0001&z\u0004tyM", "uI\u0018'", ";`_\u000fb<GR'", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "7me2e:>", ";`_\u001cY-LS(", ">nX;g", ";`_\u001cY-LS(FML\u007fml>k", "uIIu=", ";ne2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";ne2 s@g-rWl", "uI\u0018#", "@db6m,", "@db6m,\u0006].\u0007\u0010S\u0017`", "@dd@X\u0013:g\u0019\f", "BqP;f-H`!", "BqP;f-H`!FJ1)b\u0006!c", "BqX4Z,K@\u0019\nvb5\f", "CoS.g,\u001dW'\n\u0002Z@c\r=t", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "CoS.g,&O(\f~q", "CoS.g,(c(\u0006~g,", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private Function0<Unit> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private Paint softwareLayerPaint;
    private Path tmpPath;
    private long size = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final float[] matrixCache = Matrix.m4409constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
    private final Function1<DrawScope, Unit> recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    private final void setDirty(boolean z2) {
        if (z2 != this.isDirty) {
            this.isDirty = z2;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z2);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        boolean z2;
        int iM4815getModulateAlphake2Ky5w;
        Function0<Unit> function0;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release();
        int i2 = this.mutatedFields;
        int i3 = (mutatedFields$ui_release + i2) - (mutatedFields$ui_release & i2);
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui_release();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui_release();
        int i4 = (i3 + 4096) - (4096 | i3);
        if (i4 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo4367getTransformOriginSzJe1aQ();
        }
        if ((i3 + 1) - (1 | i3) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((8 & i3) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((16 & i3) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((i3 + 32) - (32 | i3) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            this.graphicsLayer.m4829setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo4363getAmbientShadowColor0d7_KjU());
        }
        if ((128 & i3) != 0) {
            this.graphicsLayer.m4835setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo4366getSpotShadowColor0d7_KjU());
        }
        if ((1024 & i3) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((256 & i3) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((i3 + 2048) - (2048 | i3) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i4 != 0) {
            if (TransformOrigin.m4563equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m4569getCenterSzJe1aQ())) {
                this.graphicsLayer.m4832setPivotOffsetk4lQ0M(Offset.Companion.m3952getUnspecifiedF1C5BW0());
            } else {
                this.graphicsLayer.m4832setPivotOffsetk4lQ0M(OffsetKt.Offset(TransformOrigin.m4564getPivotFractionXimpl(this.transformOrigin) * IntSize.m6808getWidthimpl(this.size), TransformOrigin.m4565getPivotFractionYimpl(this.transformOrigin) * IntSize.m6807getHeightimpl(this.size)));
            }
        }
        if ((16384 & i3) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i3)) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 + i3) - (32768 | i3) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            int iMo4364getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo4364getCompositingStrategyNrFUSI();
            if (CompositingStrategy.m4263equalsimpl0(iMo4364getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m4267getAutoNrFUSI())) {
                iM4815getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4814getAutoke2Ky5w();
            } else if (CompositingStrategy.m4263equalsimpl0(iMo4364getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m4269getOffscreenNrFUSI())) {
                iM4815getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4816getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m4263equalsimpl0(iMo4364getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m4268getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM4815getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m4815getModulateAlphake2Ky5w();
            }
            graphicsLayer.m4831setCompositingStrategyWpw9cng(iM4815getModulateAlphake2Ky5w);
        }
        if (!Intrinsics.areEqual(this.outline, reusableGraphicsLayerScope.getOutline$ui_release())) {
            this.outline = reusableGraphicsLayerScope.getOutline$ui_release();
            updateOutline();
            z2 = true;
        } else {
            z2 = false;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
        if (i3 != 0 || z2) {
            triggerRepaint();
        }
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    private final void updateOutline() {
        Function0<Unit> function0;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo5797isInLayerk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fM3937getXimpl, fM3938getYimpl, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo5799movegyyYBs(long j2) {
        this.graphicsLayer.m4836setTopLeftgyyYBs(j2);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo5800resizeozmzZPI(long j2) {
        if (IntSize.m6806equalsimpl0(j2, this.size)) {
            return;
        }
        this.size = j2;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
            DrawContext drawContext = this.scope.getDrawContext();
            drawContext.setCanvas(canvas);
            drawContext.setGraphicsLayer(graphicsLayer);
            GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
            return;
        }
        float fM6766getXimpl = IntOffset.m6766getXimpl(this.graphicsLayer.m4827getTopLeftnOccac());
        float fM6767getYimpl = IntOffset.m6767getYimpl(this.graphicsLayer.m4827getTopLeftnOccac());
        float fM6808getWidthimpl = fM6766getXimpl + IntSize.m6808getWidthimpl(this.size);
        float fM6807getHeightimpl = fM6767getYimpl + IntSize.m6807getHeightimpl(this.size);
        if (this.graphicsLayer.getAlpha() < 1.0f) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(this.graphicsLayer.getAlpha());
            nativeCanvas.saveLayer(fM6766getXimpl, fM6767getYimpl, fM6808getWidthimpl, fM6807getHeightimpl, Paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(fM6766getXimpl, fM6767getYimpl);
        canvas.mo4033concat58bKbWc(m5878getMatrixsQKQjiQ());
        if (this.graphicsLayer.getClip()) {
            clipManually(canvas);
        }
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.restore();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m4563equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m4569getCenterSzJe1aQ()) && !IntSize.m6806equalsimpl0(this.graphicsLayer.m4825getSizeYbymL2g(), this.size)) {
                this.graphicsLayer.m4832setPivotOffsetk4lQ0M(OffsetKt.Offset(TransformOrigin.m4564getPivotFractionXimpl(this.transformOrigin) * IntSize.m6808getWidthimpl(this.size), TransformOrigin.m4565getPivotFractionYimpl(this.transformOrigin) * IntSize.m6807getHeightimpl(this.size)));
            }
            this.graphicsLayer.m4828recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo5798mapOffset8S9VItk(long j2, boolean z2) {
        if (z2) {
            float[] fArrM5877getInverseMatrix3i98HWw = m5877getInverseMatrix3i98HWw();
            return fArrM5877getInverseMatrix3i98HWw != null ? Matrix.m4415mapMKHz9U(fArrM5877getInverseMatrix3i98HWw, j2) : Offset.Companion.m3951getInfiniteF1C5BW0();
        }
        return Matrix.m4415mapMKHz9U(m5878getMatrixsQKQjiQ(), j2);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z2) {
        if (z2) {
            float[] fArrM5877getInverseMatrix3i98HWw = m5877getInverseMatrix3i98HWw();
            if (fArrM5877getInverseMatrix3i98HWw == null) {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                Matrix.m4417mapimpl(fArrM5877getInverseMatrix3i98HWw, mutableRect);
                return;
            }
        }
        Matrix.m4417mapimpl(m5878getMatrixsQKQjiQ(), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.graphicsLayer.isReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        this.transformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo5801transform58bKbWc(float[] fArr) {
        Matrix.m4426timesAssign58bKbWc(fArr, m5878getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo5796inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM5877getInverseMatrix3i98HWw = m5877getInverseMatrix3i98HWw();
        if (fArrM5877getInverseMatrix3i98HWw != null) {
            Matrix.m4426timesAssign58bKbWc(fArr, fArrM5877getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m5878getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m5877getInverseMatrix3i98HWw() {
        float[] fArrM5878getMatrixsQKQjiQ = m5878getMatrixsQKQjiQ();
        float[] fArrM4409constructorimpl$default = this.inverseMatrixCache;
        if (fArrM4409constructorimpl$default == null) {
            fArrM4409constructorimpl$default = Matrix.m4409constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM4409constructorimpl$default;
        }
        if (InvertMatrixKt.m5879invertToJiSxe2E(fArrM5878getMatrixsQKQjiQ, fArrM4409constructorimpl$default)) {
            return fArrM4409constructorimpl$default;
        }
        return null;
    }

    private final void updateMatrix() {
        long jM4824getPivotOffsetF1C5BW0;
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(graphicsLayer.m4824getPivotOffsetF1C5BW0())) {
            jM4824getPivotOffsetF1C5BW0 = SizeKt.m4016getCenteruvyYCjk(IntSizeKt.m6820toSizeozmzZPI(this.size));
        } else {
            jM4824getPivotOffsetF1C5BW0 = graphicsLayer.m4824getPivotOffsetF1C5BW0();
        }
        Matrix.m4418resetimpl(this.matrixCache);
        float[] fArr = this.matrixCache;
        float[] fArrM4409constructorimpl$default = Matrix.m4409constructorimpl$default(null, 1, null);
        Matrix.m4429translateimpl$default(fArrM4409constructorimpl$default, -Offset.m3937getXimpl(jM4824getPivotOffsetF1C5BW0), -Offset.m3938getYimpl(jM4824getPivotOffsetF1C5BW0), 0.0f, 4, null);
        Matrix.m4426timesAssign58bKbWc(fArr, fArrM4409constructorimpl$default);
        float[] fArr2 = this.matrixCache;
        float[] fArrM4409constructorimpl$default2 = Matrix.m4409constructorimpl$default(null, 1, null);
        Matrix.m4429translateimpl$default(fArrM4409constructorimpl$default2, graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, 4, null);
        Matrix.m4419rotateXimpl(fArrM4409constructorimpl$default2, graphicsLayer.getRotationX());
        Matrix.m4420rotateYimpl(fArrM4409constructorimpl$default2, graphicsLayer.getRotationY());
        Matrix.m4421rotateZimpl(fArrM4409constructorimpl$default2, graphicsLayer.getRotationZ());
        Matrix.m4423scaleimpl$default(fArrM4409constructorimpl$default2, graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, 4, null);
        Matrix.m4426timesAssign58bKbWc(fArr2, fArrM4409constructorimpl$default2);
        float[] fArr3 = this.matrixCache;
        float[] fArrM4409constructorimpl$default3 = Matrix.m4409constructorimpl$default(null, 1, null);
        Matrix.m4429translateimpl$default(fArrM4409constructorimpl$default3, Offset.m3937getXimpl(jM4824getPivotOffsetF1C5BW0), Offset.m3938getYimpl(jM4824getPivotOffsetF1C5BW0), 0.0f, 4, null);
        Matrix.m4426timesAssign58bKbWc(fArr3, fArrM4409constructorimpl$default3);
    }

    private final void clipManually(Canvas canvas) {
        if (this.graphicsLayer.getClip()) {
            Outline outline = this.graphicsLayer.getOutline();
            if (outline instanceof Outline.Rectangle) {
                Canvas.m4151clipRectmtrdDE$default(canvas, ((Outline.Rectangle) outline).getRect(), 0, 2, null);
                return;
            }
            if (outline instanceof Outline.Rounded) {
                Path Path = this.tmpPath;
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                    this.tmpPath = Path;
                }
                Path.reset();
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                Canvas.m4149clipPathmtrdDE$default(canvas, Path, 0, 2, null);
                return;
            }
            if (outline instanceof Outline.Generic) {
                Canvas.m4149clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
    }
}
