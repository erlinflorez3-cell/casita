package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;
import com.swmansion.rnscreens.events.StackFinishTransitioningEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP.XS2\u000f\u0002{<řc$\u007fIC٥\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[ze\u0012\u001dUJoM?UoKʠht<\u0006(20A\u0002\u0005\u0007\u001a2H&v\u0003CQ\r\u00185V\u0081Xt=S\u0015\u001c\"\u0006l /\u001d\rm^8Xl\f:]$;hd\u000f*ۢ4|[\u000f\u000fr5\u0012\u000faL1p;C\u001c=S1\u0007\u0003_M\u000bWqk\u000e\u0019+55as\u0006A\u001f\u0014\\#9[%]!3\r\t_n$'Y^*_\u0019\u001c6\b\u0013{;<4\u0012\u00148`.[,-\u001aVI\u0003\u0006k@~\u000b\u000fF\u000e\u0002y6E%079C3f\u007fl\u0002-\u0017E\n\u0019%\u001eQ\f\u001f%i[&`C\u001b\u001b\f\u001a=_UUN^\fi=\u001c\u0004\u001ffH<LBU\u0016G\b!0'%esI%1k0ar~=\u0019)na\u0004jHn:5*\u007f0\u0017'rD\u0013\u000b2d\u001d^:-e\u001c\u0003$D\u001c[0j\u0016T!S\u0016~Uv\t\u0003Os\tSO-7\"\u0005y/o9\r9eUq\u0017yR%\u0014o@p\u000fpfp^Rn-:05`p y\fD|\fA6\u0016ڧ\u001eٜ01!¢ĒL&"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5s\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r [\u0004,ZC;t\"-\u0011fg!\u0003l(Pv4+U],iSn;\u0014g", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS#\\,P", "", ">`a2a;", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "1qT.g,,V\u0015}\u0005p\u0015\u0007\b/I\t6\u000b<\n\u0015\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cU\u0012*G|\u00041IBE}\u001d(\u0014h7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0010[0ERt\u000e", "5dc\u0010[0ERv\t\u000bg;", "5dc\u0011X3>U\u0015\u000ez", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", "7me._0=O(~", "<dT1f\nNa(\t\u0003E(\u0011\u0013?t`2\t\u001e\u0004\u001b\u001eF|\u000eE", "", ">qT=T9>=)\u000eik(\u0006\u00173t\u00042\u0005", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "@d\\<i,/W\u0019\u0011Vm", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0011\u0010\u001f-\u001f\u001e&\n*\u0016\u0017\u001e")
public final class ScreenStackViewManager extends ViewGroupManager<ScreenStack> implements RNSScreenStackManagerInterface<ScreenStack> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final ViewManagerDelegate<ScreenStack> delegate = new RNSScreenStackManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5s\u00072MU#g=\u001a\u0017hnwdm4Yr0KVW\u0002", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void prepareOutTransition(Screen screen) {
        if (screen != null) {
            screen.startRemovalTransition();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenStack parent, View child, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!(child instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen".toString());
        }
        Screen screen = (Screen) child;
        NativeProxy.Companion.addScreenToMap(screen.getId(), screen);
        parent.addScreen(screen, i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ScreensShadowNode(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenStack createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStack(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenStack parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenAt(i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenStack parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ScreenStack> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(StackFinishTransitioningEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        NativeProxy.Companion.clearMapOnInvalidate();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenStack parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Screen screenAt = parent.getScreenAt(i2);
        prepareOutTransition(screenAt);
        parent.removeScreenAt(i2);
        NativeProxy.Companion.removeScreenFromMap(screenAt.getId());
    }
}
