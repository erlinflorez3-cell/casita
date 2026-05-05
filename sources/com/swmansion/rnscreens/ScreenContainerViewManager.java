package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenContainerManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenContainerManagerInterface;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ReP.XS2\u000f\u0002{<řc$\u007fIC٥\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[ze\u0012\u001d>JģG3[xE9fv<\n6݅@T*\u000b\u0011\u001c:H>v)B{\u0012\"2PphR;N=\u0019.FAŋ\u0005\u001eji\u0017TVqu:])3mPU?_^|}\u0011T\\?\r%jN/NAM\u0015S^I\u001b\u001biM\u000fWqk\u0012\u0019+59as\u0006E\u001f\u0014\\#9_%]!&\r\t_q$'Ya*]\u0019$6\u000b\u0013{;E4\u0012\u0014.`.[\u001a\u0017\f\u001c=\rr\u0002K\u0017\u0016'P\u000e\u000fy6E0079@3f\u007fa\u0002-\u0017C\n\u001a%$3\u0003~!\nT<d[-\u001d}_Gi@k_\u0015\u001e\"C{\u001c\tb0CJD\u0010\u000e=\u0016).E+g_G*9k0H\u000b{?\u001bn\u0004ki\u0001Np&|\u001dO*7\f\u000bHr\u000f\u0004P\u0003cr%\u001e.b\n\u0016\u000e#\"lwj!S\u0014%лjȬnMe܃ʁ3\u0004"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP,o40|dj5\tc9$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r [\u0004,ZC;t\u0012(\u001ew]=\u0010c96r0CNN9@[\u0002=!\u0013V\fN\u0001", "u(E", "2d[2Z(MS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "/cS#\\,P", "", ">`a2a;", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "1qT.g,,V\u0015}\u0005p\u0015\u0007\b/I\t6\u000b<\n\u0015\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001cU\u0012*G|\u00041IBE}\u001d(\u0014h7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0010[0ERt\u000e", "5dc\u0010[0ERv\t\u000bg;", "5dc\u0011X3>U\u0015\u000ez", "5dc\u001bT4>", "", "<dT1f\nNa(\t\u0003E(\u0011\u0013?t`2\t\u001e\u0004\u001b\u001eF|\u000eE", "", "@d\\<i,\u001aZ o~^>\u000b", "@d\\<i,/W\u0019\u0011Vm", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0011\u0010\u001f-\u001f\u001e&y%#(\u0014\u001b\u001f\u0015!")
public final class ScreenContainerViewManager extends ViewGroupManager<ScreenContainer> implements RNSScreenContainerManagerInterface<ScreenContainer> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final ViewManagerDelegate<ScreenContainer> delegate = new RNSScreenContainerManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP,o40|dj5\tc9\rT1OWJ5`\\{\u0013", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenContainer parent, View child, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!(child instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
        }
        parent.addScreen((Screen) child, i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ScreensShadowNode(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenContainer createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenContainer(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenContainer parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenAt(i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenContainer parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ScreenContainer> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(ScreenContainer parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeAllScreens();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenContainer parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeScreenAt(i2);
    }
}
