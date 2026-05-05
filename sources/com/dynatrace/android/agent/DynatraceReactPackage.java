package com.dynatrace.android.agent;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B0cҕyCQU\"Ԃ8ޛ\u007fN\u0016f/MҼ\u000fC\u001d\u0006^\rx-a[\t_\"\u000f`E\u001eAcQ}AQ`#;K4z>F\u007f\u001d\u000f*4X\u0018\u0007zIL\u001c\u00126A\u001fA\u0001\u000f}\t(\u0016\u001e>N\u0006dp0fDP\u0005_P.Q\u0006\u001aF\\0w0+W=Jb+%v\u0010#qT\u007f;#0k\u00035^\"SƊC~"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.:C7iC\t\u0011fg5\tc\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E/\u0011$\u0014Q\\\u000e8t4 U{&3o\u0016\u0004", "u(E", "1qT.g,'O(\u0003\f^\u0014\u0007\b?l\u007f6", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\bAl&5M\u0019", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "1qT.g,/W\u0019\u0011bZ5x\u000b/r\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHA", "5dc\u001ab+NZ\u0019", "<`\\2", "", "5dc\u001fX(<b\u0001\tyn3|l8f\n\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'NoWD\u0001$5`G\r7i\u0014=5M:{;\u001exqbCqp6_z&GY$", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceReactPackage extends TurboReactPackage {
    public DynatraceReactPackage() {
        DynatraceAppStartModuleKt.setupAppStartListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0(Map moduleInfos) {
        Intrinsics.checkNotNullParameter(moduleInfos, "$moduleInfos");
        return moduleInfos;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        DynatraceInternalModule dynatraceInternalModule = new DynatraceInternalModule(reactContext);
        List<NativeModule> listAsList = Arrays.asList(new DynatraceRNBridge(reactContext, dynatraceInternalModule), dynatraceInternalModule, new DynatraceAppStartModule(reactContext));
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.emptyList();
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (!Intrinsics.areEqual(name, DynatraceRNBridgeImplKt.BRIDGE_NAME)) {
            return null;
        }
        new DynatraceAppStartModule(reactContext);
        return new DynatraceRNBridge(reactContext, new DynatraceInternalModule(reactContext));
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        map.put(DynatraceRNBridgeImplKt.BRIDGE_NAME, new ReactModuleInfo(DynatraceRNBridgeImplKt.BRIDGE_NAME, DynatraceRNBridgeImplKt.BRIDGE_NAME, false, false, true, false, false));
        return new ReactModuleInfoProvider() { // from class: com.dynatrace.android.agent.DynatraceReactPackage$$ExternalSyntheticLambda0
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return DynatraceReactPackage.getReactModuleInfoProvider$lambda$0(map);
            }
        };
    }
}
