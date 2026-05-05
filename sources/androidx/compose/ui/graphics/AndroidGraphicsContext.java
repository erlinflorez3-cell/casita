package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.ui.graphics.layer.LayerManager;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
    	... 5 more
    */
/* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9L͜P.hS2şs{Břc$wCCU0}*ޛWN}gvϺb\u000bQ\u0016\u000eǝ\u0001jBI]xc\u0013\u00172PoG\u074cUoS9ht<\t&28\u0600\u0018\"1\u001aXGHv\u0018a\f\u0017\"4NpRR;Nŋ\u001e\u0012\u0014@h\u0007,j\u007fNdW3q\u0003=1\u0013\u0002B|8\u00104\u000b_%F\u0003:Sv*\"9TO5C+\u001c\u0011\u0015gs?1L\"A\u0013h?'YJ:W~f\u000e*-+}$\u000ev4t\u001dQ\u000f%m+\u0018qYj&(&\u0012,\u0011J\u001f&\u0006UWtAbt\u0016*Kt!jpT\u0010vZ\u007f)z|\u0017u\u000eA.Q\u001d|P\u0010?o\u05ce9߉\t\r&ŀQz/`l\u000e\u000f\u001bqƛ\u0004Φ5QH׀\u0019\\\u0018`Uo\u001ao\u0011\n\u0001ʹ2Ͻ\u0004/\u0004߾~#3@s9Q+BȸJזkv\r\u009b9_wR`@Polն,Á\u0010ZLߟUw^_p,?Sr΄\u0013ą\f\u0013(οHJ/1(Peg\u0018w$έ\u0016ɻ3f?ժˍo-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0010Z?Fn8\u001c#FkB\u0016c?]L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "=v]2e\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3~", "1n\\=b5>\\(\\ve3y\u0005-k", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&E:k", "1n\\=b5>\\(\\ve3y\u0005-kl(}D\u000f&\u0017To\r", "", ":`h2e\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7|*aCHS0'\u0011jaF\\", ":nR8", "", ">qT1e(P:\u001d\r\n^5|\u0016\u001ce\u0002,\nO\u0001$\u0017F", "DhTD?(RS&\\\u0005g;x\r8e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7'2MU\u0005JA\u001a'Fd=\u000eb\nX\u007f6CPW,i(", "1qT.g, `\u0015\n}b*\u000bo+y\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "5dc\"a0Jc\u0019]\bZ>\u0001\u00121I~", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7r;.l,K;\u0015\bv`,\nl8i\u000f,wG\u0005,\u0017F", "=ac.\\5/W\u0019\u0011aZ@|\u0016\ro\t7wD\n\u0017$", "@dV6f;>`v\t\u0003i6\u0006\t8t]$\u0003G}\u0013\u0015M", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@d[2T:>5&z\u0006a0z\u0017\u0016a\u0014(\t", ":`h2e", "Cma2Z0Lb\u0019\fXh4\b\u00138e\t7Y<\b\u001e\u0014Cm\u0014", "\u0011n\\=T5B]\"", "#mX>h,\u001d`\u0015\u0011~g.`\b\u000bp\u0004tO", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AndroidGraphicsContext implements GraphicsContext {
    public static final boolean enableLayerPersistence = false;
    private boolean componentCallbackRegistered;
    private final ViewGroup ownerView;
    private boolean predrawListenerRegistered;
    private DrawChildContainer viewLayerContainer;
    public static final Companion Companion = new Companion(null);
    private static boolean isRenderNodeCompatible = true;
    private final Object lock = new Object();
    private final LayerManager layerManager = null;
    private final ComponentCallbacks2 componentCallback = null;

    public AndroidGraphicsContext(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007tpAӄld߉4Ziճ?k*3li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011nSI\u001d\n.x\u0019-\u0010iAk \u0014JB\u001e@cQ}CQ`#=K4ݮ&@"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EB\u000e\u0013\"Js\fJ@\u0001>X\u000b*;lw;IN>o2,rrjH\u0007v;\rB", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0004K\u000b \u0017P~k8},2U{&E:k", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "", "<df\u0010b5?W\u001b", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^! Hs\u0010L\u0004!D]\b)\r", "=m;<j\u0014>[#\f\u000f", "=mC?\\4&S!\t\br", ":de2_", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        AnonymousClass1() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
            if (i2 < 40 || AndroidGraphicsContext.this.predrawListenerRegistered) {
                return;
            }
            AndroidGraphicsContext.this.layerManager.destroy();
            ViewTreeObserver viewTreeObserver = AndroidGraphicsContext.this.ownerView.getViewTreeObserver();
            final AndroidGraphicsContext androidGraphicsContext = AndroidGraphicsContext.this;
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext$1$onTrimMemory$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    androidGraphicsContext.layerManager.updateLayerPersistence();
                    androidGraphicsContext.ownerView.getViewTreeObserver().removeOnPreDrawListener(this);
                    androidGraphicsContext.predrawListenerRegistered = false;
                    return true;
                }
            });
            AndroidGraphicsContext.this.predrawListenerRegistered = true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qܱ\u00137"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EB\u000e\u0013\"Js\fJ@\u0001>X\u000b*;lw;IN>o2,rrjH\u0007v;\rC", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "", "D", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) throws Throwable {
            AndroidGraphicsContext.this.registerComponentCallback(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) throws Throwable {
            AndroidGraphicsContext.this.unregisterComponentCallback(view.getContext());
            AndroidGraphicsContext.this.layerManager.destroy();
        }
    }

    public final boolean isLayerManagerInitialized() {
        LayerManager layerManager = this.layerManager;
        if (layerManager != null) {
            return layerManager.hasImageReader();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerComponentCallback(Context context) throws Throwable {
        if (this.componentCallbackRegistered) {
            return;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (C1607wl.Xd() ^ 1927))).getMethod(Wg.Zd("\n8eBlhxl\u0001\rCFd^Ckiy\r+=", (short) (C1607wl.Xd() ^ 23184), (short) (C1607wl.Xd() ^ 23951)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            ComponentCallbacks2 componentCallbacks2 = this.componentCallback;
            Class<?> cls = Class.forName(C1561oA.Xd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (ZN.Xd() ^ 5546)));
            Class<?>[] clsArr = {Class.forName(Wg.vd("COHUMFD\r=HJO;CL\u0005\u0015@AC=;5=>\f-72')*-4", (short) (FB.Xd() ^ 17137)))};
            Object[] objArr2 = {componentCallbacks2};
            short sXd = (short) (ZN.Xd() ^ 24615);
            short sXd2 = (short) (ZN.Xd() ^ 4636);
            int[] iArr = new int["#\u0015\u0016\u0017  \u0010\u001ck\u0017\u0014\u0016\u0014\u0012\b\u0010\u0015b\u007f\n\t}{|\u0004\u000b".length()];
            QB qb = new QB("#\u0015\u0016\u0017  \u0010\u001ck\u0017\u0014\u0016\u0014\u0012\b\u0010\u0015b\u007f\n\t}{|\u0004\u000b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
                this.componentCallbackRegistered = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterComponentCallback(Context context) throws Throwable {
        if (this.componentCallbackRegistered) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H\\\b\u0006\u000bz\r\b", (short) (C1499aX.Xd() ^ (-11884)), (short) (C1499aX.Xd() ^ (-16916)))).getMethod(C1561oA.ud("\u0014\u0011\u001fj\u0019\u0018\u0013\u000f\b\u0005\u0017\u000b\u0010\u000ea\r\u000b\u0010\u007f\u0012\r", (short) (OY.Xd() ^ 19364)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = {this.componentCallback};
                Method method2 = Class.forName(C1561oA.yd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (FB.Xd() ^ 21235))).getMethod(Xg.qd("jdi]`cnpbpBonrrrjt{Kjvwnnqz\u0004", (short) (C1580rY.Xd() ^ (-10311)), (short) (C1580rY.Xd() ^ (-4818))), Class.forName(C1561oA.Yd("\u0016$\u001b*(#\u001fi --4&07q\b548880:A\u00110<=447@I", (short) (C1580rY.Xd() ^ (-30399)))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(context2, objArr2);
                    this.componentCallbackRegistered = false;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsViewLayer graphicsViewLayer;
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            long uniqueDrawingId = getUniqueDrawingId(this.ownerView);
            if (Build.VERSION.SDK_INT >= 29) {
                graphicsViewLayer = new GraphicsLayerV29(uniqueDrawingId, null, null, 6, null);
            } else if (isRenderNodeCompatible) {
                try {
                    graphicsViewLayer = new GraphicsLayerV23(this.ownerView, uniqueDrawingId, null, null, 12, null);
                } catch (Throwable unused) {
                    isRenderNodeCompatible = false;
                    graphicsViewLayer = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), uniqueDrawingId, null, null, 12, null);
                }
            } else {
                graphicsViewLayer = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), uniqueDrawingId, null, null, 12, null);
            }
            graphicsLayer = new GraphicsLayer(graphicsViewLayer, this.layerManager);
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        synchronized (this.lock) {
            graphicsLayer.release$ui_graphics_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final DrawChildContainer obtainViewLayerContainer(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.viewLayerContainer;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.viewLayerContainer = viewLayerContainer;
        return viewLayerContainer;
    }

    private final long getUniqueDrawingId(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(view);
        }
        return -1L;
    }

    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005%2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?bh\u000e[\u000f4\u0018O̚8֒Y\u0005e܈'4HrM7mqC>nzȫ\t'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0010Z?Fn8\u001c#FkB\u0016c?]5\u0005QTY(eV|Fi", "", "u(E", "3mP/_,%O-~\bI,\n\u00173s\u000f(\u0005>\u0001", "", "7rA2a+>`\u0002\ty^\n\u0007\u0011:a\u000f,xG\u0001", "u(I", "Adc\u001fX5=S&g\u0005],Z\u00137p{7\u007f=\b\u0017", "uY\u0018#", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isRenderNodeCompatible() {
            return AndroidGraphicsContext.isRenderNodeCompatible;
        }

        public final void setRenderNodeCompatible(boolean z2) {
            AndroidGraphicsContext.isRenderNodeCompatible = z2;
        }
    }

    /* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007fјl˕9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0010Z?Fn8\u001c#FkB\u0016c?]5\u0017PPZ<\\1\u007f9&\u0016c\u00102*h\u0010]\u000ewD", "", "u(E", "5dc\"a0Jc\u0019]\bZ>\u0001\u00121I~", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }
}
