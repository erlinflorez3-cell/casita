package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP.XY2\u000f\u0002{<řc$\bCCU0}*\t]Nog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4կ]xs\u0012\u00172HpG3coE9ft>\u000562*8\u007f\t\t\u001a8N\u0018v\u0001IQÈ(ؓ^!jR;L=\u0019BF]0\u0005,\\\u007fNdG|c@/1\u0004\u0002B|)o6\u0003M\u001bIl';zҐ\"+N<}#3s\u001b\u0007\u0001oo\u0007M\u0013U\u0005\u0017Im=\u0012yeYp\u007fB)qcUc\u0001Jt\u0005\u007fgR;sUqph\u000eV\fA\u0010Uj\u00124\u001e'vB]\u001et/&3#y\u0004D^*vB.$\u0012:%O\u00183YbKj_\rS\u0019|`,\t\u001bJ;\u0001\u001dJ\"fV\u0018#Hlw\u007fE\u0002DKWf\n\bM\u001e\b~|\u001a*2Kw\u0006=\u001a)0-$ezi8/|\u001aYTi\u0007\u0005\u000f{ckbHn6\u001d(֖.\t\u0012o\rr\u0013\u001ahT\u00073AS*\u0004\u001f\u007f\u001e\u0012NuH^/-(N}o\u001an[c\"%]mu\u0018E\u0089\u001aĆ=j;̐ie\u0016j`\u00014ABm\u0013d7Na\u000fr\\V&\tʎlݻ{{L\u0088\\\"@@\n\u001cb.֞\u001db\u001dǽ\u001b HN\u000b\u00170fv\u001f\u0017Ta4Yǰ0ڲ\r\u0001XʔA\ru\na=\rb2-odE\u001b6UP|b\u000fɠ\u000b~y\u0015\u001eшXܤPl\u001e߯&\u0014.,29\u007f6\u0014Ц\u001bɒ->\nΏ]Nx{_W2)\u0001\u0014\b\u001b\fv<\u007f l\u0007+\u000f\u0004!֥`Ђ&vfаs\u0014r\u001a\u0012at\u0016\u001eύ`ߏ_>QͿShJNP|3\u001eǪ)\u0007wܲ\u001573_5:f\u0006\"M-csh\u001eMPʯ\u001b֑xe\fϺЌ\u001a!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7\u00072MU\"gH\u001e\">", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=v]2e\u001dBS+", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1`]CT:\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005mA\u001a ke7\u0015-\nJ\u007f8CZ16cQrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dYF\u0007\u0011\bO'rQY)WCJV^8C\u0019[/J8D/\u0014G\\\f", "D`[BX", "", "1`]\"f,\u001c]!\n\u0005l0\f\r8gf$\u0010@\u000e", "5dc\u0010T5.a\u0019\\\u0005f7\u0007\u00173t\u00041}'|+\u0017T.\u001e@p'BU\t#;k$(ZCBk0,\u0015", "u(I", "Adc\u0010T5.a\u0019\\\u0005f7\u0007\u00173t\u00041}'|+\u0017T.\u001e@p'BU\t#;k$(ZCBk0,\u0015", "uY\u0018#", "5dc\u0010T5OO'a\u0005e+|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[\u001c@~\u0012<0MBj4+j", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7r8;i(EW\u0018z\n^+", "Adc\u0016a=:Z\u001d}vm,{", ":`h2e\u0016Nb \u0003\u0004^", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001cj5>`\n\u0003zp", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", ">`a2a;%O-~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "2hb=T;<Vw\fvp", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "4na0X\u0013:g#\u000f\n", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", "7me._0=O(~", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "", "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "Adc\u0011e(P>\u0015\fvf:", "Adc\u0019T@>`\u0003\u000f\ne0\u0006\t", "=tc9\\5>", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewLayer extends View {
    public static final Companion Companion = new Companion(null);
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    };
    private boolean canUseCompositingLayer;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private Density density;
    private Function1<? super DrawScope, Unit> drawBlock;
    private boolean isInvalidated;
    private Outline layerOutline;
    private LayoutDirection layoutDirection;
    private final View ownerView;
    private GraphicsLayer parentLayer;

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    public /* synthetic */ ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (2 & i2) != 0 ? new CanvasHolder() : canvasHolder, (i2 + 4) - (i2 | 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public final void setInvalidated(boolean z2) {
        this.isInvalidated = z2;
    }

    public final boolean setLayerOutline(Outline outline) {
        this.layerOutline = outline;
        return OutlineUtils.INSTANCE.rebuildOutline(this);
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.canUseCompositingLayer;
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.canUseCompositingLayer != z2) {
            this.canUseCompositingLayer = z2;
            invalidate();
        }
    }

    public final void setDrawParams(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = function1;
        this.parentLayer = graphicsLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        long jSize = SizeKt.Size(getWidth(), getHeight());
        GraphicsLayer graphicsLayer = this.parentLayer;
        Function1<? super DrawScope, Unit> function1 = this.drawBlock;
        Density density2 = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = canvasDrawScope.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(androidCanvas);
        drawContext.mo4656setSizeuvyYCjk(jSize);
        drawContext.setGraphicsLayer(graphicsLayer);
        androidCanvas.save();
        try {
            function1.invoke(canvasDrawScope);
            androidCanvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.isInvalidated = false;
        } catch (Throwable th) {
            androidCanvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density2);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00056i%\nCiWpԃ$\u07beSTo˧\u0007L`\u000eQ\u0013َ\u001a}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7\u00072MU\"gH\u001e\"'?C\u000fn(Wz1P\"", "", "u(E", "\u001a`h2e\u0016Nb \u0003\u0004^\u0017\n\u0013@i~(\t", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0012\fO\b\u001b GZ\u001bF\b)4Y\u000bu", "5dc\u0019T@>`\u0003\u000f\ne0\u0006\t\u001ar\n9\u007f?\u0001$UWs\b>\u0004!@\\\u0002\u001eEg#.TC7y4", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e*\u0011&\u001eKx\u000e'\u0004/F]| DC", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics_release() {
            return ViewLayer.LayerOutlineProvider;
        }
    }
}
