package com.swmansion.rnscreens;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r+4\u0012}\bnjO0Le^.ZS0\u0010s{J$c$\bCCU }*\t]NogtKb\u000bY\u000f\u000e\u0016~q4Ikxe\u0012\u00153HŪ?Iݹ =g_%63 r'>yڱ\u0005\u001a8IX\u0003\tRc\f@@ptHc%M3\u0019Z\u000eL2\u0019 rf|>\u000fl&P=6\u001bipbWc>\u0012e\rt\\W\u0011\u0005w6+nK{)mY\u0011\u001ej[m\u0013\u0006\u0006\u0006\u000bv??+w\u0004\u001eJ!\u0006\".CO;m9:%\u0011_z$'YR\u0014O^)@w)\u0004UH\u0012*\u001e'v>]\u001et%&3#\u0011\u001cL^!vB.\u000b\u0012:%6\u00183Y8cj_\u0002S\u0019|GL\u0017\u001b ;\u0001\u001d$\u0012\u0015d֮\u0017ôX{i3WDKM\u001f\u001cgC\u0006\n\u0001d\u0012*28u\u0007\u0006Ɉ\u001dѧ\u001b%?ك\n//t\u001aHrjMݖlĈWiZ̲\u0011.| O*7\u000f1ըpʰoP\\А|-['l\u0017\u000e\n# \u000bvj-\u000e\u0016^Qxi\u0019L<\u0017{ÇhƠ]nsލ(ElAMQ\u0012\u00138ׯ\u0003݀C<jڳ׃jc"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011S\u0017Jv4CCz.7z'.Z.HuG2j", "\u001a`]1e6BR,Hxh9|R@i\u007f:E*\nr\"Rv\".z.4c\u0010\u0004@{\u0016=[*?yC\u001e\u001ehn\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "u(E", "/k[<j\u0019>U\u001d\r\nk(\f\r9n", "", "5dc\u000e_3He\u0006~|b:\f\u0016+t\u00042\u0005", "u(I", "3uT;g\u001aHc&|zO0|\u001b", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "6`b\u000fX,G@\u0019\u0001~l;|\u0016/d", "7r>/f,Kd\u001d\b|<6\u0006\u0018/x\u000f\u000f\u007fA\u0001&\u001bOo", ":hbAX5>`'", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Ag^B_+\u001f]&\u0011vk+`\u0012=e\u000f6jJq\u001b\u0017Y", "/cS\u001ca\bI^ \u0013lb5{\u0013AI\t6{O\u000f}\u001bU~\u000eEv2", "", ":hbAX5>`", "5dc\u001cU:>`*~yO0|\u001b", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "D", "7mb2g:", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "@dV6f;>`\u0003\bkb,\u000f", "DhTD", "@dV6f;>`\u000b\u0003\na\n\u0007\u0012>e\u00137", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "@d\\<i,(\\t\n\u0006e@n\r8d\n:_I\u000f\u0017&UV\u0012J\u0006%>Y\u000b", "Cma2Z0Lb\u0019\f", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InsetsObserverProxy implements OnApplyWindowInsetsListener, LifecycleEventListener {
    private static boolean hasBeenRegistered = false;
    private static boolean isObservingContextLifetime = false;
    public static final InsetsObserverProxy INSTANCE = new InsetsObserverProxy();
    private static final ArrayList<OnApplyWindowInsetsListener> listeners = new ArrayList<>();
    private static WeakReference<View> eventSourceView = new WeakReference<>(null);
    private static boolean shouldForwardInsetsToView = true;

    private InsetsObserverProxy() {
    }

    private final boolean getAllowRegistration() {
        return !hasBeenRegistered || eventSourceView.get() == null;
    }

    private final View getObservedView() {
        return eventSourceView.get();
    }

    public final void addOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v2, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = shouldForwardInsetsToView ? ViewCompat.onApplyWindowInsets(v2, insets) : insets;
        Intrinsics.checkNotNull(windowInsetsCompatOnApplyWindowInsets);
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            windowInsetsCompatOnApplyWindowInsets = ((OnApplyWindowInsetsListener) it.next()).onApplyWindowInsets(v2, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnApplyWindowInsets, "onApplyWindowInsets(...)");
        }
        return windowInsetsCompatOnApplyWindowInsets;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View observedView = getObservedView();
        if (hasBeenRegistered && observedView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(observedView, null);
            hasBeenRegistered = false;
            eventSourceView.clear();
        }
        isObservingContextLifetime = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public final boolean registerOnView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!getAllowRegistration()) {
            return false;
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, this);
        eventSourceView = new WeakReference<>(view);
        hasBeenRegistered = true;
        return true;
    }

    public final void registerWithContext(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isObservingContextLifetime) {
        }
        isObservingContextLifetime = true;
        context.addLifecycleEventListener(this);
    }

    public final void removeOnApplyWindowInsetsListener(OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    public final void unregister() {
        View observedView = getObservedView();
        if (observedView != null) {
            if (!hasBeenRegistered) {
                observedView = null;
            }
            if (observedView != null) {
                ViewCompat.setOnApplyWindowInsetsListener(observedView, null);
            }
        }
    }
}
