package com.swmansion.gesturehandler;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;
import yg.Kl;

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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\rD4\u0012\u0006\u0013njO0LeN1ZS@\u000fsڔ<$q$yCAU\"}0'WȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xk1\u0017˰Xģo3{nm9\u000ftv\bڶ6\"FzM%(4`\u001a\u0007zIL\u001c\u00126A\u00079\u0001\u0018}\u000b(\u001e\u001e@6\u007fLi\u0018TDV\u0005_P.Q\u00070V\u0017Cm?\u0015[\u001dPd/\u001dvg\u001f;@=6C0\u0002\u00137ViK\u001b? JK|o?9Z\fYLW.&E/] urT`5Un\u0018?+}p\u0012dV.\u0006\u000f\u0014\rj\u0019T\u001ao^<C2l\u0018\u0010Ct!Wn`2dP\f\u0013cL\u0016S\ry?\u00021tWyA)PG{3\u0012L:1t/gl\u0010v\u0014Ia>c\u0002vN?`Z\u001a[Mm2tr\u0004:\u0004^L.22Q\u0005ϒ«7٦=-)m\bPRp\u000f\u0007fnapʖLX"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n\"B_ E|&;M&7t3%\u0015uL5\u0005i(Pv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E\u001d|%\u00174o\n:\u0006\u00101W\u0004\u001c9mk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E1\u0005\u0017)/k\u00178x%BC\u0007~7u\u00127L0;g2-\u007fd_?\u0003e,$", "u(E", "DhTD@(GO\u001b~\bl", "", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW$\u0001$E`}\u000eBm\u0014\u0004", "5dc#\\,P;\u0015\bv`,\n\u0017", "u(;7T=:\u001d)\u000e~eud\u0005:;", "DhTD@(GO\u001b~\blj{\t6e\u0002$\u000b@", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1qT.g,/W\u0019\u0011bZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHA", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "DhTD@(GO\u001b~\bG(\u0005\t", "1qT.g,/W\u0019\u0011bZ5x\u000b/r\u000e", "", "5dc\u001ab+NZ\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "<`\\2", "5dc\u001fX(<b\u0001\tyn3|l8f\n\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'NoWD\u0001$5`G\r7i\u0014=5M:{;\u001exqbCqp6_z&GY$", "5dc#\\,P;\u0015\bv`,\nq+m\u007f6", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {
    private final Lazy viewManagers$delegate = LazyKt.lazy(RNGestureHandlerPackage$viewManagers$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        Annotation annotationKd = Kl.Kd(RNGestureHandlerModule.class, ReactModule.class);
        Intrinsics.checkNotNull(annotationKd);
        ReactModule reactModule = (ReactModule) annotationKd;
        String strName = reactModule.name();
        String name = RNGestureHandlerModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return MapsKt.mutableMapOf(TuplesKt.to("RNGestureHandlerModule", new ReactModuleInfo(strName, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true)));
    }

    private final Map<String, ModuleSpec> getViewManagers() {
        return (Map) this.viewManagers$delegate.getValue();
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager<?, ?> createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider<? extends NativeModule> provider;
        ModuleSpec moduleSpec = getViewManagers().get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) ? null : provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.listOf((Object[]) new ViewManager[]{new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager()});
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (ReactModuleInfoProvider) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$$ExternalSyntheticLambda0
                @Override // com.facebook.react.module.model.ReactModuleInfoProvider
                public final Map getReactModuleInfos() {
                    return RNGestureHandlerPackage.getReactModuleInfoProvider$lambda$0();
                }
            };
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e3);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return CollectionsKt.toList(getViewManagers().keySet());
    }

    @Override // com.facebook.react.BaseReactPackage
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return CollectionsKt.toMutableList((Collection) getViewManagers().values());
    }
}
