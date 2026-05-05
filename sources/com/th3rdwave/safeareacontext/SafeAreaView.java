package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmhvJh\u0014KƤ\u000e\u0016\u0007j4I[\u0002s܈?2pno3{o}FpzD\u00068487(\u0007в\u001e*V\u0013?\u0001QY$\u0012^K7:\u001b\u0013[\u00142\u0014\u001c=N\u000efbu^NH\u001bn\u0001/k\twTf'\u000eCC_ULb;%v\u00101qR\u007f;#:k\u00035c\"SKK\u007fS\u001dhU:[M\u0002nNX.\u0019]7]%urTo5Un%?+}l\u0014^\u001cB\u0010z* l\n\u001c!?JD,HsP\u0014A\u0011\u000bSncH^\u000b\u0006\t~N\u0017S\u0013y+\n)tUy=/Me\u0001[ٿ*ţ\u0005n)ż%\u001cn\u001b3V\u000eP_X\u0017׃Tݳ\u000eYEЧT|p\nB\u0004^PV߿\b 2\u0017-ڛ,G1+\u0004\u0004^C\u0016\u0002[\u009etרmRPؗr|$CB\u000b\"Yrq[ߛ\\Ԝ\\,\u0019۳ɥX%"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kFs", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u000bDmt;IU\"oB-\u0015qaF\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";DS4X:", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF}\u0014jaG\\", ";H]@X;L", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", ";L^1X", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0006\u001fga\u000f", ";Oa<i0=S&o~^>", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ";Rc.g,0`\u0015\n\u0006^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "4h]1C9Hd\u001d}zk", "5dc g(MS\u000b\fvi7|\u0016", ";`h/X\u001cIR\u0015\u000ezB5\u000b\t>s", "", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m??X\u000bKO+", "Adc\u0012W.>a", "3cV2f", "Adc\u001ab+>", ";nS2", "Adc g(MS\u000b\fvi7|\u0016", "AsPAX\u001eKO$\nzk", "CoS.g,\"\\'~\nl", "E`XA96K@\u0019zxm\u0013x\u001d9u\u000f", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaView extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {
    private SafeAreaViewEdges mEdges;
    private EdgeInsets mInsets;
    private SafeAreaViewMode mMode;
    private View mProviderView;
    private StateWrapper mStateWrapper;

    public SafeAreaView(Context context) {
        super(context);
        this.mMode = SafeAreaViewMode.PADDING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View findProvider() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof SafeAreaProvider) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean maybeUpdateInsets() {
        EdgeInsets safeAreaInsets;
        View view = this.mProviderView;
        if (view == null || (safeAreaInsets = SafeAreaUtilsKt.getSafeAreaInsets(view)) == null || Intrinsics.areEqual(this.mInsets, safeAreaInsets)) {
            return false;
        }
        this.mInsets = safeAreaInsets;
        updateInsets();
        return true;
    }

    private final void updateInsets() {
        EdgeInsets edgeInsets = this.mInsets;
        if (edgeInsets != null) {
            SafeAreaViewEdges safeAreaViewEdges = this.mEdges;
            if (safeAreaViewEdges == null) {
                safeAreaViewEdges = new SafeAreaViewEdges(SafeAreaViewEdgeModes.ADDITIVE, SafeAreaViewEdgeModes.ADDITIVE, SafeAreaViewEdgeModes.ADDITIVE, SafeAreaViewEdgeModes.ADDITIVE);
            }
            StateWrapper stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", SerializationUtilsKt.edgeInsetsToJsMap(edgeInsets));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            SafeAreaViewLocalData safeAreaViewLocalData = new SafeAreaViewLocalData(edgeInsets, this.mMode, safeAreaViewEdges);
            ReactContext reactContext = UIManagerHelperCompatKt.getReactContext(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), safeAreaViewLocalData);
                reactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.SafeAreaView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SafeAreaView.updateInsets$lambda$0(uIManagerModule);
                    }
                });
                waitForReactLayout();
            }
        }
    }

    public static final void updateInsets$lambda$0(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().dispatchViewUpdates(-1);
    }

    private final void waitForReactLayout() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        UIManagerHelperCompatKt.getReactContext(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.SafeAreaView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SafeAreaView.waitForReactLayout$lambda$2(reentrantLock, booleanRef, conditionNewCondition);
            }
        });
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        long jNanoTime2 = 0;
        while (!booleanRef.element && jNanoTime2 < 500000000) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    booleanRef.element = true;
                }
                jNanoTime2 += System.nanoTime() - jNanoTime;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        reentrantLock2.unlock();
        if (jNanoTime2 >= 500000000) {
        }
    }

    public static final void waitForReactLayout$lambda$2(ReentrantLock lock, Ref.BooleanRef done, Condition condition) {
        Intrinsics.checkNotNullParameter(lock, "$lock");
        Intrinsics.checkNotNullParameter(done, "$done");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!done.element) {
                done.element = true;
                condition.signal();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewFindProvider = findProvider();
        this.mProviderView = viewFindProvider;
        if (viewFindProvider != null && (viewTreeObserver = viewFindProvider.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        maybeUpdateInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.mProviderView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.mProviderView = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zMaybeUpdateInsets = maybeUpdateInsets();
        if (zMaybeUpdateInsets) {
            requestLayout();
        }
        return !zMaybeUpdateInsets;
    }

    public final void setEdges(SafeAreaViewEdges edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.mEdges = edges;
        updateInsets();
    }

    public final void setMode(SafeAreaViewMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mMode = mode;
        updateInsets();
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }
}
