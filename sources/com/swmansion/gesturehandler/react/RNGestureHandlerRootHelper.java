package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerOrchestrator;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{B-c$wFCU(}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xk\u0018\u00172HtU\u074ck\rm9\u000fsn\u0005=PbK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb\u001e\u0014M8\u0001Ll\u0018RDY\u0005]hAk\u000fwUf'\u000e:-Q\u001bZl';\f*29VO5C5\u0004\u0007\u0015is?1W\"A\u0013\u0002?'YS<[Dr\u0018\u0014C;\u0018\u0011k\u000e>\\3a)\u00125Ggcy`T(H\u0007\n\rT\u0004<\u0007}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0007\u0001XXV\u0012^H\u0001\u0011`d\u001d{ı5ڢ=\u001bnϟ2I'UO}\u001b\fL+W͜#ƟX\u000ehٽk`\u0006ZIQnG\u001fݓ\u0016ՒAm\f͏3\u00118\u000fHG.2ɨ\u00154\u001f¦O]?//xRTRu\u000f\u0005\u000fr*֢^͕D\"vݫ֜.("}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[1,c]rJi", "", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "EqP=c,=D\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011R0'\u0014uk=\u0006-=Rv9\u0011=R,n4\u007fG$\u001d0Q?", "8r62f;N`\u0019avg+\u0004\t<", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "=qR5X:M`\u0015\u000e\u0005k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014M9Ly'U[[(k\\\u007f\u0013", ">`b@\\5@B#\u000fxa", "", "@n^AI0>e", "5dc\u001fb6MD\u001d~\r", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\"\u000e!'RE", "Ag^B_+\"\\(~\b\\,\b\u0018", "/bc6i(MS\u0002z\nb=|k+n~/{M\u000f", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "3u", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "6`]1_,,S(chK,\u000b\u00149n~(\t", "DhTDG(@", "", "0k^0^\u0015:b\u001d\u0010zK,\u000b\u00149n~(\t", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "BdP?76P\\", "Bqh\u0010T5<S Z\u0002e\u000fx\u0012.l\u007f5\n", "\u0011n\\=T5B]\"", " n^AI0>ez~\tm<\n\t\u0012a\t'\u0003@\u000e", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerRootHelper {
    public static final Companion Companion = new Companion(null);
    private static final float MIN_ALPHA_FOR_TOUCH = 0.1f;
    private final ReactContext context;
    private final GestureHandler<?> jsGestureHandler;
    private final GestureHandlerOrchestrator orchestrator;
    private boolean passingTouch;
    private final ViewGroup rootView;
    private boolean shouldIntercept;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004c(\u0001:\t}R\u0018k|Or\u000bq\u0013L\u0016Iv:Jmx\f\u0014e˳\u0015ņC3Uڎ\u07b2=f"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[1,c]rJRod\u0016Y'\u0016\tcJy", "", "u(E", "\u001bH=,4\u0013)6tx[H\u0019vw\u0019U]\u000b", "", "4h]1E6Hb\n\u0003zp\u001bx\u000b", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "DhTD:9Hc$", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup findRootViewTag(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewGroup parent = viewGroup;
            while (parent != null && !(parent instanceof RootView)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r\"4\u0012}\u0007njO0LeN.Xݸ,%ӆ,>4a4uqП&\u001a,\"7N\u000fj̊rJh\f\f\u0015\u0014\u0018\u0011jZL\u001c\u000b&(\u001d6Zom6}sK>xtd\u000bP60?\u0012\u0005/ pZǞz\u0003"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[1,c]rJR~d\u0018]\u001c\u0011\u0005k#$|SG,\b\u000fE\u000b:o\u0001\u0019k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[1,c]rJi", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~f}\u001c5|_\u001b6%;yC.\"hD5\u0010b3N\u0004\u0014QV]\u000f\\Y}=!g\u001e~", "=m2.a*>Z", "", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public final class RootViewGestureHandler extends GestureHandler<RootViewGestureHandler> {
        public RootViewGestureHandler() {
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        protected void onCancel() {
            RNGestureHandlerRootHelper.this.shouldIntercept = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.getRootView() instanceof RootView) {
                ((RootView) RNGestureHandlerRootHelper.this.getRootView()).onChildStartedNativeGesture(RNGestureHandlerRootHelper.this.getRootView(), motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        protected void onHandle(MotionEvent event, MotionEvent sourceEvent) {
            GestureHandlerOrchestrator orchestrator;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            if (getState() == 0 && (!RNGestureHandlerRootHelper.this.shouldIntercept || (orchestrator = getOrchestrator()) == null || !orchestrator.isAnyHandlerActive())) {
                begin();
                RNGestureHandlerRootHelper.this.shouldIntercept = false;
            }
            if (event.getActionMasked() == 1) {
                end();
            }
        }
    }

    public RNGestureHandlerRootHelper(ReactContext context, ViewGroup wrappedView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.context = context;
        UiThreadUtil.assertOnUiThread();
        int id = wrappedView.getId();
        if (id < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + wrappedView).toString());
        }
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) context).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupFindRootViewTag = Companion.findRootViewTag(wrappedView);
        this.rootView = viewGroupFindRootViewTag;
        String str = "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupFindRootViewTag;
        GestureHandlerOrchestrator gestureHandlerOrchestrator = new GestureHandlerOrchestrator(wrappedView, registry, new RNViewConfigurationHelper());
        gestureHandlerOrchestrator.setMinimumAlphaForTraversal(0.1f);
        this.orchestrator = gestureHandlerOrchestrator;
        RootViewGestureHandler rootViewGestureHandler = new RootViewGestureHandler();
        rootViewGestureHandler.setTag(-id);
        RootViewGestureHandler rootViewGestureHandler2 = rootViewGestureHandler;
        this.jsGestureHandler = rootViewGestureHandler2;
        registry.registerHandler(rootViewGestureHandler2);
        registry.attachHandlerToView(rootViewGestureHandler2.getTag(), id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetJSResponder$lambda$6(RNGestureHandlerRootHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tryCancelAllHandlers();
    }

    private final void tryCancelAllHandlers() {
        GestureHandler<?> gestureHandler = this.jsGestureHandler;
        if (gestureHandler == null || gestureHandler.getState() != 2) {
            return;
        }
        gestureHandler.activate();
        gestureHandler.end();
    }

    public final void activateNativeHandlers(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        if (gestureHandlerOrchestrator != null) {
            gestureHandlerOrchestrator.activateNativeHandlersForView(view);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.passingTouch = true;
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        Intrinsics.checkNotNull(gestureHandlerOrchestrator);
        gestureHandlerOrchestrator.onTouchEvent(ev);
        this.passingTouch = false;
        return this.shouldIntercept;
    }

    public final ViewGroup getRootView() {
        return this.rootView;
    }

    public final void handleSetJSResponder(int i2, boolean z2) {
        if (z2) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RNGestureHandlerRootHelper.handleSetJSResponder$lambda$6(this.f$0);
                }
            });
        }
    }

    public final void requestDisallowInterceptTouchEvent() {
        if (this.orchestrator == null || this.passingTouch) {
            return;
        }
        tryCancelAllHandlers();
    }

    public final void tearDown() {
        String str = "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.rootView;
        ReactContext reactContext = this.context;
        Intrinsics.checkNotNull(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        GestureHandler<?> gestureHandler = this.jsGestureHandler;
        Intrinsics.checkNotNull(gestureHandler);
        registry.dropHandler(gestureHandler.getTag());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
