package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017k\u00124,[:qK;[\u001a\u0006\"\u001fOVʴonXZ\u0013¼\u0017\u0006,xr,OU\u0001] \u0014:BuC;M\u0006=Aś|6\u001b :Ĳ@y\u0013\n\"*N\u0016~zQR\u0014\u00126Bx:h\rU\u0005 \u0012\u000e>6\u0001&\\mO>H\u0003]Bǂ+\u0003wHVϋg0\u0013M\u0015FZ+\u0015vw\u001e3@=9\u001d%i\u0003\u000fRaA\u000b?\b=\rh-)3I\nW>X\u0006\u0018\u001d+e\rer,e\rQv\f/+UhSP$(\u007fz\u0002\u000fBǉ$ͺE5^-He8\u000eat#SnQ:^/m;=F\u001b3\u0002K+g\u001evUo?1Ne\u0001\u0015C,)\u0019!1ld\u001d\u000f\u001dôX\u0002W:aFCR^\f_C\u0014\u000f\u0001u\u0012;\u001a/u\f\u009e\u007f\u001b4 5=aC3#q\bnQwx\u0015`\u0017a\u0018YXJ0}.=:\u000b\u001cZrr3{ÏXX:\"\u0016\"bC\u0016\bA.#\f\u0005/3MfO\u0017w\u001bQk\u0015=/\u0015u \u00014&exv3c_\u0014\u0014o]\u000f\u0014mD\u0013\u000bfsZU\"Y\u000b4hF\u0011p\u001e8\u0014D|\u001aYF\bw*uD1Gz[\\K$P\u0004\u0015\t\u000eh/$GlAg\u001biR\u00039\u0005^!\to\u0016>\u0010@̂_õέES;_4\u001dj\u0001BE;\u0007-\u00120Ku\u0016_L\u001b`<iߡ\u001fچ׀=S5\t![G?@OEEz\u0001\u0016U[`?z+I??v~\u007f\b\u0019\u000frt3j]&/\"%)#'\u00167\u0018y\u0010\u0011+Kq%#[lg9\u0017̔;Ѿ̞\u0001\u0007%q3U8:\u000b\u000bECU+F{\"x-a\f@6Bՙaχ֑xg\n\u0004qn8\u0011_7J;fW\n\u0003L|<l1`xn\u0006cZ\tbBcLOA\tVf\u0003;3\fD\u001f,;&\u0007_Hq\b}bc&<<I\fsvCS\u001f\u0014S0\u0006{,t\u000bx\u001d:\u000f\n\u0013\u0007\u0012J fjΩa־ޘ\nu\u001e\u001aO\u0014+SJm<4ZJ8AQZ\u00028 \f\u0010U\u000e\u0017ł6LyDf\u0014Z\u0003lXN\u000b\u0007Pp4:\u0012\u0015\u000ea*א9;\u000bvVZ5mB\u0003Y#/(zQ\u000ffS9r[i%6g\u0019\u0011U_SI0D2Wo\u00024\b\u001a\u001e0|KPH\u001fG\u0016)_%u%\u001fۖc̯Щz\u0014l9\\iq\u0005\td&<8\u001dQ-\u0018\u0001}KEL|\u0006gG(j/DWqR\u0011,L)\u0019\u001e5[K\u0010jdI\nkk;,\u001bP$5\u0016\r!\u000bjD+H\"qŴ\"ޭ\u001al\u001a\u000b\u0019e.\u001aNLz\n\u0018FXB]\u001bK\u0002Ax0Řy̝D'3ˊVPY\u0004\u0011\fyk\u0012\u000b,̆\u000fЂ5V\u0002ҧ}\\+&?M\\1/ŗFñW `ҹP##*766gЍ\u0014Uk֬\tmUz\u001bK\u007f,8gIdb/\u000e.(}ą.^.\u001eK\\SHt\u000bbrhb\u001eqz9zs:5ِ\u0001\tNg!\u0019:P\u0003 j5]&/]\u001dG\u000f\u0015\u001aDw-wܓ^̫\u001f7:У@4\u00052\u001b:\u0011\u0013VˢN֟v\u007foƨ}ZbL2/i&}d14aDfR^Ϸ\u001dã\u0015/b߀p`j<4;\u007fQq\u001d\u001f\u0013-84\u000eEY\fվ]ƽ)6\tε\u0019\u000fE\u001c?\u000fZu=\u00171T_\u0002)}~;S\\<ͮ)ڧ\u0006kRӭee\\7oU\u001aASH\u0012Un\u001e`٭0ڱ\nu+Ǉ\u0016EVUw\\n\u0003Jӕ\u0010܈)ޟ͍C\"ؼpz{\n:\u0017h\br\ny6WyBHz~\u0001˸nخIQ\u0001{\u0011t\u001bvdI\u001d8A9'~ O ?Y|Iٌ1ۺa<\u001bŎTF@\u0016Nyuu0إ\u0012Я\u0016TkÅ;y_\u0016(8@DcՀyٽV`\bуm'5M\u000fFd_ܱQGjޑX\u0011*\u0017<{\\\u001d\u0014PFHE)4\u001f7ş\u0015чKwYI\u0018\u0012\nJ͛\u0011d-\t+ڂ\u0007u>]q^\\٣7y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u001ei*.Z\u0019", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006X21d\u0001$5T\u0012BMP\u001ft5(j", "=v]2e\u001dBS+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "1n]AT0GS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014fy2\u0015p\u001a5L!EtC\u001a\u0019qaF\\", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">`a2a;%O-~\b", "", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#L+jS8)\u00154\u0013`Hd\u0013i\u0019\u0012<iNL_\u001fC}\u001euN~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001fONmQ(\u0002<-\brlN\u000fpeEr6#U\u0005\u0006[\u0013h})\u00041\u000e=t\f(u", "D`[BX", "", "1`\\2e(\u001dW'\u000evg*|sB", "5dc\u0010T4>`\u0015]~l;x\u0012-ej;", "u(5", "Adc\u0010T4>`\u0015]~l;x\u0012-ej;", "uE\u0018#", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1kX=56N\\\u0018\rXZ*\u007f\t", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "1kX=G6\u001b])\byl", "", "5dc\u0010b5MO\u001d\bzk", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#\\-3\u007fs1QJ:I>'$deB\u0007p\u0002", "2qPDa\u001eBb\u001cs", "7r8;i(EW\u0018z\n^+", "u(I", "Adc\u0016a=:Z\u001d}vm,{", "uY\u0018#", ":`h2e\u0010=", "", "5dc\u0019T@>`|}", "u(9", ";GP@B=>` z\u0006i0\u0006\u000b\u001ce\t'{M\u0005 \u0019", ";Sa.a:?]&\u0007dk0~\r8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "\u0018", ";`]BT3\u001cZ\u001d\neZ;\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "5dc\u001aT5NO \\\u0002b7g\u0005>h", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpk", ";`c?\\?\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001cU\u0012 DU\u0012=ZGNI0\u001c\u0018h7", ";tc.g,=4\u001d~\u0002]:", "", "=tc9\\5>@\u0019\r\u0005e=|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001fi\r';v\u0016\u001bMQErE\u001e\">", "5dc\u001cj5>`\n\u0003zp", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", "=v]2e\u001dBS+by", "5dc\u001cj5>`\n\u0003zp\u0010{", "2dbAe6R", "2hb=T;<Vw\fvp", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPD?(RS&", "4na0X\u0013:g#\u000f\n", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", "7me._0=O(~", "7me2e:>B&z\u0004l-\u0007\u00167", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "7me2e:>B&z\u0004l-\u0007\u00167-Ozx&}\t\u0015", "uZ5uI", "7r8;?(RS&", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7r8;?(RS&F\u0001&z\u0004tyM", "uI\u0018'", ";`_\u000fb<GR'", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "7me2e:>", ";`_\u001cY-LS(", ">nX;g", ";`_\u001cY-LS(FML\u007fml>k", "uIIu=", ";ne2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";ne2 s@g-rWl", "uI\u0018#", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "@db2g\nEW$[\u0005n5{\u0017", "@db6m,", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "@db6m,\u0006].\u0007\u0010S\u0017`", "@dd@X\u0013:g\u0019\f", "BqP;f-H`!", "BqP;f-H`!FJ1)b\u0006!c", "CoS.g,\u001dW'\n\u0002Z@c\r=t", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "CoS.g,(c(\u0006~g,i\t=o\u00079{M", "\u0011n\\=T5B]\"", "#mX>h,\u001d`\u0015\u0011~g.`\b\u000bp\u0004tO", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod = false;
    private static Field recreateDisplayList = null;
    private static boolean shouldUseDispatchDraw = false;
    private static Method updateDisplayListIfDirtyMethod = null;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithZ;
    private Function0<Unit> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function2<View, Matrix, Unit> getMatrix = new Function2<View, Matrix, Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            invoke2(view, matrix);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline androidOutline = ((ViewLayer) view).outlineResolver.getAndroidOutline();
            Intrinsics.checkNotNull(androidOutline);
            outline.set(androidOutline);
        }
    };

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.isInvalidated) {
            this.isInvalidated = z2;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z2);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007fјl˕9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u001ei*.Z\u0002+t8*%h@F\u0003u0Wx\u000bF(Y0)&H", "", "u(E", "5dc\"a0Jc\u0019]\bZ>\u0001\u00121I~", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0<Unit> function0;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release();
        int i2 = this.mutatedFields;
        int i3 = (mutatedFields$ui_release + i2) - (mutatedFields$ui_release & i2);
        if ((4096 & i3) != 0) {
            long jMo4367getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo4367getTransformOriginSzJe1aQ();
            this.mTransformOrigin = jMo4367getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m4564getPivotFractionXimpl(jMo4367getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m4565getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((1 & i3) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((2 & i3) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1024)) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((i3 + 512) - (512 | i3) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((i3 + 2048) - (2048 | i3) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z2 = false;
        boolean z3 = getManualClipPath() != null;
        boolean z4 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((i3 + 24576) - (24576 | i3) != 0) {
            this.clipToBounds = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z4);
        }
        boolean zM5905updateS_szKao = this.outlineResolver.m5905updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z4, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo4365getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z5 = getManualClipPath() != null;
        if (z3 != z5 || (z5 && zM5905updateS_szKao)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((7963 & i3) != 0) {
            this.matrixCache.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if ((64 & i3) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m4232toArgb8_81llA(reusableGraphicsLayerScope.mo4363getAmbientShadowColor0d7_KjU()));
            }
            if ((i3 + 128) - (128 | i3) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m4232toArgb8_81llA(reusableGraphicsLayerScope.mo4366getSpotShadowColor0d7_KjU()));
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 + i3) - (131072 | i3) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((i3 + 32768) - (i3 | 32768) != 0) {
            int iMo4364getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo4364getCompositingStrategyNrFUSI();
            if (CompositingStrategy.m4263equalsimpl0(iMo4364getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m4269getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m4263equalsimpl0(iMo4364getCompositingStrategyNrFUSI, CompositingStrategy.Companion.m4268getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z2;
            } else {
                setLayerType(0, null);
            }
            z2 = true;
            this.mHasOverlappingRendering = z2;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo5797isInLayerk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        if (this.clipToBounds) {
            return 0.0f <= fM3937getXimpl && fM3937getXimpl < ((float) getWidth()) && 0.0f <= fM3938getYimpl && fM3938getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m5904isInOutlinek4lQ0M(j2);
        }
        return true;
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getAndroidOutline() != null ? OutlineProvider : null);
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo5800resizeozmzZPI(long j2) {
        int iM6808getWidthimpl = IntSize.m6808getWidthimpl(j2);
        int iM6807getHeightimpl = IntSize.m6807getHeightimpl(j2);
        if (iM6808getWidthimpl == getWidth() && iM6807getHeightimpl == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m4564getPivotFractionXimpl(this.mTransformOrigin) * iM6808getWidthimpl);
        setPivotY(TransformOrigin.m4565getPivotFractionYimpl(this.mTransformOrigin) * iM6807getHeightimpl);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + iM6808getWidthimpl, getTop() + iM6807getHeightimpl);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo5799movegyyYBs(long j2) {
        int iM6766getXimpl = IntOffset.m6766getXimpl(j2);
        if (iM6766getXimpl != getLeft()) {
            offsetLeftAndRight(iM6766getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (iM6767getYimpl != getTop()) {
            offsetTopAndBottom(iM6767getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z2 = getElevation() > 0.0f;
        this.drawnWithZ = z2;
        if (z2) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z2;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z2 = true;
        }
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(androidCanvas, null);
        }
        if (z2) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo5798mapOffset8S9VItk(long j2, boolean z2) {
        if (z2) {
            float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this);
            return fArrM5881calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m4415mapMKHz9U(fArrM5881calculateInverseMatrixbWbORWo, j2) : Offset.Companion.m3951getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m4415mapMKHz9U(this.matrixCache.m5882calculateMatrixGrdbGEg(this), j2);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z2) {
        if (z2) {
            float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this);
            if (fArrM5881calculateInverseMatrixbWbORWo != null) {
                androidx.compose.ui.graphics.Matrix.m4417mapimpl(fArrM5881calculateInverseMatrixbWbORWo, mutableRect);
                return;
            } else {
                mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m4417mapimpl(this.matrixCache.m5882calculateMatrixGrdbGEg(this), mutableRect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m4569getCenterSzJe1aQ();
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo5801transform58bKbWc(float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m4426timesAssign58bKbWc(fArr, this.matrixCache.m5882calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo5796inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM5881calculateInverseMatrixbWbORWo = this.matrixCache.m5881calculateInverseMatrixbWbORWo(this);
        if (fArrM5881calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m4426timesAssign58bKbWc(fArr, fArrM5881calculateInverseMatrixbWbORWo);
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njO0Le^.ZS8\u000fsڔ<$i-yCAW\"}8\tWNmjvJp\u000bK\u000f\f\u0017~̚-_ǁ)]@\u000erGu?ݯQoK9)\u0003D\u001c82PA*\t\u000f2BH>}AH\u001c\u001b 1XphTҫQ\u000b\"Ň\u001e@&\u0004,`8lDM\u0005oJ13\u0003\u0018I^)o0+U\u001dHd';\u007f\u0010$\u0002«9߱\u0019%[ΈWniK\u001b? H5l51CI\"bt\u0019Vϳ!ۣS\u0013eö>^\u000b^n\u001aw9]rcR$'&\u000bRȡHǬ\u0012\u0006/Ξ~O(w \u000ea\u007f#WNZ\u001a^p\u000b9 \rД1ő77Aӕ~SgM'\\W}\u000b ,7Q|/pl\u0010v\u0014IjNΆ=ҨD=Pݐ̌]V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u001ei*.Z\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u001dtc9\\5>>&\t\fb+|\u0016", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0012\fO\b\u001b GZ\u001bF\b)4Y\u000bu", "5dc\u001ch;EW\"~ek6\u000e\r.e\r", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e*\u0011&\u001eKx\u000e'\u0004/F]| DC", "5dc\u001aT;KW,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "", "\nrTA \u0006\u0017", "", "6`b\u001fX;KW\u0019\u0010z]\u0014|\u00182o~", "5dc\u0015T:+S(\f~^=|\b\u0017e\u000f+\u0006?", "u(I", "@dR?X(MSw\u0003\ti3x\u001d\u0016i\u000e7", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "Ag^B_+.a\u0019]~l7x\u0018-h^5wR", "5dc [6NZ\u0018n\t^\u000b\u0001\u0017:a\u000f&~\u001f\u000e\u0013)", "Adc [6NZ\u0018n\t^\u000b\u0001\u0017:a\u000f&~\u001f\u000e\u0013)\u0006\u007f\u00126\u0004%<Yy.7", "uY\u0018#", "CoS.g,\u001dW'\n\u0002Z@c\r=tc)ZD\u000e&+/o\u001d?\u0001$", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "CoS.g,\u001dW'\n\u0002Z@c\r=t", "DhTD", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z2) {
            ViewLayer.shouldUseDispatchDraw = z2;
        }

        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }
}
