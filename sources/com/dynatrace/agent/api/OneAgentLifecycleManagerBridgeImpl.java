package com.dynatrace.agent.api;

import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007f\u0007lj?ӄZ͜x.\u0001Rj\u001c{\u007fB$s$ DтY\u001c\u0004$\u0017R\u0017murbZ9HU\u001a^~x2aU'bX#\u0003N}?KM\u001e>\u0010Şvȥ\t :Ĳة}\f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011Y\u0017<R'5b\r\u0007;n\u0016,aABk\u001c\u001a\u001edc9\u0014@9Ru)G0V7c(", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@,9Z}\u001eKk\u001d.\u0017-Dk\u0010 \u0015qp \u000bd,L\u000b%NL6(eNt=!ng\u0012M-\rZ", "=mT\u000eZ,Gb\u007f\u0003{^*\u0011\u00076eg$\u0005<\u0003\u0017$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~C\u0007 \u0013o\u00167\\*?l4\u001c)fh9n_5Jx'T\"", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u001e\u001bHo\fPt,5#g)7I\u0018.VR\"o5\u001e\u0013|_@\u0007K(Wr)GY$oM", "=m0=c\u001aMO&\u000e", "", "=m04X5MA\u001c\u000f\n]6\u000f\u0012", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentLifecycleManagerBridgeImpl implements OneAgentLifecycleManagerBridge {
    private final OneAgentLifecycleManager oneAgentLifecycleManager;

    public OneAgentLifecycleManagerBridgeImpl(OneAgentLifecycleManager oneAgentLifecycleManager) {
        Intrinsics.checkNotNullParameter(oneAgentLifecycleManager, "oneAgentLifecycleManager");
        this.oneAgentLifecycleManager = oneAgentLifecycleManager;
    }

    @Override // com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge
    public void onAgentShutdown() {
        Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "stop OneAgent, unregister lifecycle callbacks");
        this.oneAgentLifecycleManager.onAgentShutdown();
    }

    @Override // com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge
    public void onAppStart() throws Throwable {
        Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "onAppStart");
        this.oneAgentLifecycleManager.onAppStart();
    }
}
