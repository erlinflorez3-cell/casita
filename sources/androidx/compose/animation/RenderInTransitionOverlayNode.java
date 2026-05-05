package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: RenderInTransitionOverlayNodeElement.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeV7Zݷ2\u000fy\u0001<řc$\bCCU0}*\teNog\u0005Jb\u000bI\u0013\u000e\u0016\u000fj4I[ye\u0012%2JģG3coE9f\u0005>\u0005.2*8\u007f\u0005\t\u001a@H\u0018v\u0001CQÈ(ؓpphQ=M3\u001aB\u0006l!9\u001d\u000e(\fFLz_R/Q\u0006yL\\+w6\rO\u001dF\u0003-;{q\"9GO5C-c\u001b\u0015[sS\u0013A\u0002=3s7);I\"cF\\\u0010\u0016+*}\u001a\f|͉`\u0005_nT-9{{K~;n\fC\u0002\u001bj\u001c\u000e4T\u000fBu$t7&3# {@~2%VP'o?/9\u00105;9IqacK\u0019|C\f\t\u001d 9\u007f\u001d.\n^dֲ!ôX\u0004YĸiBCW\\\u001ay?s\u0015~tR;\u0012C_\u0002Ez?BMiھ_=;#q\u0017VZ8\t\u0013w\u0001Y\u007fQvXrnDճ\u0001¡\u0018ʑHd\rߘ!efE)O2S5\u0018>Wء`{T#++\\k9\bxQu\u001051v7\bt\u001a\u0013.ޱjۋ9]k߄yT|1MZ\u0003\u0007^\u0006Ps\\rj*:2vmfǵ\bΌR\u0018\u001bԵWs\"U:S9^\u001bk\u0011B\u0013j\u000b\u0010wZ\u0017\u0018/XAI\u001biR|?E\u000f!Gטήxͅ0\rh$3k_`1([Hv[\u001d%\r'\u0002)ġk~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%>X}-\u001bv\u0005;ILIoC\"\u001fqKJ\u0007p3J\u000b\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u001fge:\u000bc97\u0001&G\"", "AgP?X+,Q#\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007G4Y}|", "@d]1X9\"\\\u0003\u0010zk3x\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "HH]1X?\"\\\u0003\u0010zk3x\u001d", "", "1kX=<5(d\u0019\f\u0002Z@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012c\u0010V\u0002.\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`c\u0016QvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d>n^Y", "5dc\u0010_0I7\"h\f^9\u0004\u0005C", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010_0I7\"h\f^9\u0004\u0005C", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "5dc\u0019T@>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc9$", ":`h2e\u001eBb\u001ckzg+|\u0016/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%>X}-\u001bv\u0005;ILIoC\"\u001fqKJ\u0007p3J\u000b\u0010QKNjCN\u0007=!\u0004^\u001dQ\u0018\r\u000eXA1nQ\r", ">`a2a;,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "5dc\u001dT9>\\(l\nZ;|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "5dc\u001fX5=S&b\u0004H=|\u00166a\u0014", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001fX5=S&b\u0004H=|\u00166a\u0014", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc [(KS\u0018lxh7|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,2~2N\"", "Adc [(KS\u0018lxh7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012c\u0010V\u0002.\u001d\u0010?", "\nrTA \u0006\u0017", "5dc'<5=S,b\u0004H=|\u00166a\u0014", "u(5", "Adc'<5=S,b\u0004H=|\u00166a\u0014", "uE\u0018#", "HH]1X?\"\\\u0003\u0010zk3x\u001dmd\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "=m0Ag(<V", "", "=m32g(<V", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "\u001a`h2e\u001eBb\u001ckzg+|\u0016/r", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private Function2<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlay;
    private LayerWithRenderer layerWithRenderer;
    private Function0<Boolean> renderInOverlay;
    private SharedTransitionScopeImpl sharedScope;
    private final MutableFloatState zIndexInOverlay$delegate;

    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    public final void setSharedScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    public final Function0<Boolean> getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final void setRenderInOverlay(Function0<Boolean> function0) {
        this.renderInOverlay = function0;
    }

    public final Function2<LayoutDirection, Density, Path> getClipInOverlay() {
        return this.clipInOverlay;
    }

    public final void setClipInOverlay(Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        this.clipInOverlay = function2;
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0<Boolean> function0, float f2, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = function0;
        this.clipInOverlay = function2;
        this.zIndexInOverlay$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay$delegate.getFloatValue();
    }

    public final void setZIndexInOverlay(float f2) {
        this.zIndexInOverlay$delegate.setFloatValue(f2);
    }

    public final SharedElementInternalState getParentState() {
        return (SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState());
    }

    /* JADX INFO: compiled from: RenderInTransitionOverlayNodeElement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lkA0RjP.XT2\u000fy{<řc$\bCC٥ ԅ$\u001fѧ~g\u0016m\u000be\u001bG\u001d\u0006.x\u0019-֒Yxk\u0014W@P|W3{}m=n\u0004N\u0005NBhLJ\u0014\u000f\u001aBH>wټGQ\u0014۵HBv=`\u0011\u001e\u0019(\u0017\u001e@6\u007fLb\u001e#\rԶnҺ>3;\u0005oI\\/0B\u000bV%F\u00031CK8ӳ-Ë;9-'Y\u000e\u0015^âC\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%>X}-\u001bv\u0005;ILIoC\"\u001fqKJ\u0007p3J\u000b\u0010QKNjCN\u0007=!\u0004^\u001dQ\u0018\r\u000eXA1nQ\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!IY\u000b\r7v\u0015.ZCHA", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00125b| DQ\u001f\u001dZ?Dy8-\u0019rj#\u0018c9Ur;0VM,29nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0004Hd\f\u000f\u001a\fC4w>j\u0010TCv\u0003=4kJWm`CUEo\u007f(|", "5dc\u0019T@>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc9$", ">`a2a;,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "5dc\u001dT9>\\(l\nZ;|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "HH]1X?", "", "5dc'<5=S,", "u(5", "2qPD<5(d\u0019\f\u0002Z@", "", "2qPDF*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class LayerWithRenderer implements LayerRenderer {
        private final GraphicsLayer layer;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        public final GraphicsLayer getLayer() {
            return this.layer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public SharedElementInternalState getParentState() {
            return RenderInTransitionOverlayNode.this.getParentState();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public float getZIndex() {
            return RenderInTransitionOverlayNode.this.getZIndexInOverlay();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public void drawInOverlay(DrawScope drawScope) {
            if (RenderInTransitionOverlayNode.this.getRenderInOverlay().invoke().booleanValue()) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                RenderInTransitionOverlayNode renderInTransitionOverlayNode2 = renderInTransitionOverlayNode;
                long jMo5523localPositionOfR5De75A = renderInTransitionOverlayNode.getSharedScope().getRoot$animation_release().mo5523localPositionOfR5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode2), Offset.Companion.m3953getZeroF1C5BW0());
                float fM3937getXimpl = Offset.m3937getXimpl(jMo5523localPositionOfR5De75A);
                float fM3938getYimpl = Offset.m3938getYimpl(jMo5523localPositionOfR5De75A);
                Path pathInvoke = renderInTransitionOverlayNode.getClipInOverlay().invoke(drawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(renderInTransitionOverlayNode2));
                if (pathInvoke != null) {
                    int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
                    DrawContext drawContext = drawScope.getDrawContext();
                    long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo4657clipPathmtrdDE(pathInvoke, iM4167getIntersectrtfAjoo);
                        drawScope.getDrawContext().getTransform().translate(fM3937getXimpl, fM3938getYimpl);
                        try {
                            GraphicsLayerKt.drawLayer(drawScope, this.layer);
                            drawScope.getDrawContext().getTransform().translate(-fM3937getXimpl, -fM3938getYimpl);
                            return;
                        } finally {
                        }
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                    }
                }
                drawScope.getDrawContext().getTransform().translate(fM3937getXimpl, fM3938getYimpl);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, this.layer);
                } finally {
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        GraphicsLayer layer = getLayer();
        if (layer == null) {
            throw new IllegalArgumentException("Error: layer never initialized".toString());
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.m4732recordJVtK1S4$default(contentDrawScope2, layer, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.RenderInTransitionOverlayNode.draw.1
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
                contentDrawScope.drawContent();
            }
        }, 1, null);
        if (this.renderInOverlay.invoke().booleanValue()) {
            return;
        }
        GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
    }

    public final GraphicsLayer getLayer() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            return layerWithRenderer.getLayer();
        }
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.sharedScope.onLayerRendererCreated$animation_release(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.onLayerRendererRemoved$animation_release(layerWithRenderer);
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layerWithRenderer.getLayer());
        }
    }
}
