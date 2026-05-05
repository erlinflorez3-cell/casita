package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import com.facebook.react.JSEngineResolutionAlgorithm;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007llA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\u000bI3\u001cǝ)jZH\u0016\u0006c\u0014\u001f6PoW3{pެ=`\u00038M(@*P{\u001b\u007fH3\u000f\"?\u0003QU$\u0014F?\u001fE\u0019\u001f\u0016\r(\u001e\u001e@6\u007fLi.`~[zkR/Q\u0012\u001aF\\7w0+^SEù+\r|sn?N:M\u0017;R1\u000b\t.\u0016ŶAџA\t\u0001)-.Wx(Hf\u0006,\u0015YSC0I̻^ԇUd$)1UqRם\u0012;"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0003.IAJT0-\u0019ya\u001c\u0011q;$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VX\nKz65<\b.FC", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEQ-", "7r72e4>ax\bv[3|\b", "", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "7r=2j\bKQ\u001c^\u0004Z)\u0004\t.", "u(I", "5dc\u0017F\fGU\u001d\bzK,\u000b\u00136u\u000f,\u0006I\\\u001e\u0019Q|\u0012Ky-", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E%nv Is\u0017<c%Cc\u00050Fq 7)J=uA\"$ki\u000f", "5dc\u001fX(<b\u0004zxd(~\t\u001eu\r%\u0006(\u000b\u0016'Nou8\u007f!7Y\u000b~7t\u00160IR;HD\"\u001cgaF", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7Yl0Dj \u0016WBKr4\u0006\u0011q];\u0007p\u000bN}'IH],\u001b/\u0003A\u001b\u0011Z\u001b$", "5dc\"<\u0014:\\\u0015\u0001zk\u0017\n\u0013@i~(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7z\u0001;WT?j4+j", "BnA2T*M6#\r\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VR\u0018J\u0006z", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "BnA2T*M6#\r\n\u001d\u0019|\u0005-t[1zM\u000b\u001b\u0016A|\u000eCv!CY", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class DefaultReactNativeHost extends ReactNativeHost {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DefaultReactNativeHost(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager getUIManagerProvider$lambda$0(final DefaultReactNativeHost this$0, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new FabricUIManagerProviderImpl(componentFactory, ReactNativeConfig.DEFAULT_CONFIG, this$0.getLazyViewManagersEnabled() ? new ViewManagerRegistry(new ViewManagerResolver() { // from class: com.facebook.react.defaults.DefaultReactNativeHost$getUIManagerProvider$1$viewManagerRegistry$1
            @Override // com.facebook.react.uimanager.ViewManagerResolver
            public ViewManager getViewManager(String viewManagerName) {
                Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
                return this.this$0.getReactInstanceManager().createViewManager(viewManagerName);
            }

            @Override // com.facebook.react.uimanager.ViewManagerResolver
            public Collection<String> getViewManagerNames() {
                return this.this$0.getReactInstanceManager().getViewManagerNames();
            }
        }) : new ViewManagerRegistry(this$0.getReactInstanceManager().getOrCreateViewManagers(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    @Override // com.facebook.react.ReactNativeHost
    protected JSEngineResolutionAlgorithm getJSEngineResolutionAlgorithm() {
        Boolean boolIsHermesEnabled = isHermesEnabled();
        if (Intrinsics.areEqual((Object) boolIsHermesEnabled, (Object) true)) {
            return JSEngineResolutionAlgorithm.HERMES;
        }
        if (Intrinsics.areEqual((Object) boolIsHermesEnabled, (Object) false)) {
            return JSEngineResolutionAlgorithm.JSC;
        }
        if (boolIsHermesEnabled == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.ReactNativeHost
    protected ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        if (isNewArchEnabled()) {
            return new DefaultTurboModuleManagerDelegate.Builder();
        }
        return null;
    }

    @Override // com.facebook.react.ReactNativeHost
    protected UIManagerProvider getUIManagerProvider() {
        if (isNewArchEnabled()) {
            return new UIManagerProvider() { // from class: com.facebook.react.defaults.DefaultReactNativeHost$$ExternalSyntheticLambda0
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return DefaultReactNativeHost.getUIManagerProvider$lambda$0(this.f$0, reactApplicationContext);
                }
            };
        }
        return null;
    }

    protected Boolean isHermesEnabled() {
        return null;
    }

    protected boolean isNewArchEnabled() {
        return false;
    }

    @UnstableReactNativeAPI
    public final ReactHost toReactHost$ReactAndroid_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ReactPackage> packages = getPackages();
        Intrinsics.checkNotNullExpressionValue(packages, "getPackages(...)");
        String jSMainModuleName = getJSMainModuleName();
        Intrinsics.checkNotNullExpressionValue(jSMainModuleName, "getJSMainModuleName(...)");
        String bundleAssetName = getBundleAssetName();
        if (bundleAssetName == null) {
            bundleAssetName = FirebaseAnalytics.Param.INDEX;
        }
        String jSBundleFile = getJSBundleFile();
        Boolean boolIsHermesEnabled = isHermesEnabled();
        return DefaultReactHost.getDefaultReactHost$default(context, packages, jSMainModuleName, bundleAssetName, jSBundleFile, boolIsHermesEnabled != null ? boolIsHermesEnabled.booleanValue() : true, getUseDeveloperSupport(), null, 128, null);
    }
}
