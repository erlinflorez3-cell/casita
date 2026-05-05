package com.dynatrace.agent.api;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.hS2\u000fq}<$q$yّCU(\u001c*ޛWNusvϺ`ŏYƤ6\u0016'ilVe|k\u0012'2ppУ7Ou?Gc=L\u0013$J\"f~5\u0005(0`\u0010%\u0002sO\u001a\u001aH@\u001fC\u0019!\u0016\u0013(\u001c\u001e>N\u0006N`uYNH\u001bd\u0001Ck3wNf'\u000e5-Q\u001bSl';\u0005\u0012(9OO;%'c\u00035`\nO3O\u007fN\u001dt7/;O\u0004YFX.&C;}\u001d$\u0007vh\u0013Qx\fU,&ҭMח\u0012(\u007f\u07beԱ\u0011O"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011Y\u0017<R'5b\r\u0010Em#\u0012VR;x0\u001c$lkBn_5Jx'T)[0[Tr!\u001c\u001dac", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@5CY\u000b\u001c5|\u001a8V\r%t4y\u0017hjHvq,[Z0VL[(ZavG\u001dyV\u0017J-\r\u00126N(mF7t", "=mT\u000eZ,Gb\t\rzk\u0010\u0006\u0018/r{&\u000bD\u000b ~Cx\n>v2", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_\u0018VC\u0017m4'$Xo9\u0014G5]v4CJ]0f[Z9\u001d\u000e\\\u000e[\u0001", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ'%G|\u0012E\u0006%BU{/;w\u001fw7L;G6\u001e\u001ewQG\u0007p\u0010W\u0006'THL;`\\{%\u0010\u001bV\u0010N8bHJ", "=m<<g0H\\x\u0010zg;", "", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=mE6X>\u001cZ\u001d|\u0001", "DhTD", "=m2<`7Ha\u0019a~m", "6hc\u000ee,:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=uT?_(I^\u0019}Vk,x\u0017", "", "Ad`BX5MW\u0015\u0006ab:\f", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentUserInteractionManagerBridgeImpl implements OneAgentUserInteractionManagerBridge {
    private final OneAgentUserInteractionManager oneAgentUserInteractionManager;

    public OneAgentUserInteractionManagerBridgeImpl(OneAgentUserInteractionManager oneAgentUserInteractionManager) {
        Intrinsics.checkNotNullParameter(oneAgentUserInteractionManager, "oneAgentUserInteractionManager");
        this.oneAgentUserInteractionManager = oneAgentUserInteractionManager;
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onComposeHit(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        Intrinsics.checkNotNullParameter(hitArea, "hitArea");
        Intrinsics.checkNotNullParameter(overlappedAreas, "overlappedAreas");
        Intrinsics.checkNotNullParameter(sequentialList, "sequentialList");
        this.oneAgentUserInteractionManager.onComposeHit(hitArea, overlappedAreas, sequentialList);
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onMotionEvent(View rootView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(event, "event");
        this.oneAgentUserInteractionManager.onMotionEvent(rootView, event);
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onViewClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.oneAgentUserInteractionManager.onViewClick(view);
    }
}
