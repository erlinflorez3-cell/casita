package com.dynatrace.android.agent;

import com.dynatrace.android.agent.model.AppStartMeasurement;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG<LeN.Xݷ@ş\u001c{b#\u001c1\u0002IIU2\u007f8\b}O˗knX\\SI\u001d\t.x\u00190\u0010UAc \u0014JB\u001eEya8CGg\r63$x\"ة}\r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.)NFYC\u001a\"wIC\u0006s3NL", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "4kd@[\u0014>O'\u000f\b^4|\u0012>s", "", "5dc\u001bT4>", "", "AdcBc\u0010Gb\u0019\f\u0004Z3c\r=t\u007f1{M", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceAppStartModule extends ReactContextBaseJavaModule {
    public DynatraceAppStartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        setupInternalListener();
    }

    private final void flushMeasurements() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator it = DynatraceAppStartModuleKt.buffer.iterator();
        while (it.hasNext()) {
            writableMapCreateMap.putDouble(((AppStartMeasurement) it.next()).getName(), r0.getTimestamp());
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("dynatraceAppStartMeasurements", writableMapCreateMap);
    }

    private final void setupInternalListener() {
        ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: com.dynatrace.android.agent.DynatraceAppStartModule$$ExternalSyntheticLambda0
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2) {
                DynatraceAppStartModule.setupInternalListener$lambda$0(this.f$0, reactMarkerConstants, str, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupInternalListener$lambda$0(DynatraceAppStartModule this$0, ReactMarkerConstants name, String str, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == ReactMarkerConstants.CONTENT_APPEARED) {
            this$0.flushMeasurements();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DynatraceAppStartModule";
    }
}
