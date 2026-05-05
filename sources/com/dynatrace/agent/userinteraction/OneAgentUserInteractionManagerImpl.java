package com.dynatrace.agent.userinteraction;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandler;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactory;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjG0L͜P.hS2şs{J$c$wECU0}*ޛWNu\u0006vϺb\u000bQ\u001b\u000eǝ~̓Bկ\u0006x\f\u0011O?RsM3eok:žx8\u000b\"@%\u0001\u0010\u0013\u00072*v\u0017'~QS$\u0012^I!>`\u0017e\u0005H\u001dLRh\u000f,h\u007fNdO\u001daH<;\u0003\u0018K\u0015;(`\u000b[%F\u0003.=zo-C@eEE/a\u0014\u001fXkA\u0013? M3zW79\\\fcF`\u0010\u001a%-_\r\f\u0007Tn3c' w7]gcP<-N߁}Ɂ@\u0004\u0016ͺϒLC"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_\u0018VC\u0017m4'$Xo9\u0014G5]v4CJ]0f[Z9\u001d\u000e\\\u000e[\u000f\u0015\u0010`\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_\u0018VC\u0017m4'$Xo9\u0014G5]v4CJ]0f[Z9\u001d\u000e\\\u000e[\u0001", "CrT?<5MS&zxm0\u0007\u0012\u0012a\t'\u0003@\u000ew\u0013E~\u0018I\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[\f\t\u0003hK1\u0003\u001a", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ'%G|\u0012E\u0006%BU{/;w\u001fwP?Dj;\u001e\"2QG\u0007p\u0010W\u0006'THL;`\\{ \u0010\u001bY\u0015N8m\u0001WP.{X\rbx", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005#| \u0016No\u001b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^WkI\u0005f\u001c\\v4+U],iNpL\u0018\u001ccpJ4\f\fYNy", "=m<<g0H\\x\u0010zg;", "", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=mE6X>\u001cZ\u001d|\u0001", "DhTD", "=m2<`7Ha\u0019a~m", "6hc\u000ee,:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=uT?_(I^\u0019}Vk,x\u0017", "", "Ad`BX5MW\u0015\u0006ab:\f", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentUserInteractionManagerImpl implements OneAgentUserInteractionManager {
    private final TouchUserInteractionHandler touchUserInteractionHandler;

    public OneAgentUserInteractionManagerImpl(UserInteractionHandlerFactory userInteractionHandlerFactory) {
        Intrinsics.checkNotNullParameter(userInteractionHandlerFactory, "userInteractionHandlerFactory");
        UserInteractionHandler userInteractionHandlerCreate = userInteractionHandlerFactory.create(UserInteractionHandler.Type.TOUCH);
        Intrinsics.checkNotNull(userInteractionHandlerCreate, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler");
        this.touchUserInteractionHandler = (TouchUserInteractionHandler) userInteractionHandlerCreate;
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onComposeHit(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        Intrinsics.checkNotNullParameter(hitArea, "hitArea");
        Intrinsics.checkNotNullParameter(overlappedAreas, "overlappedAreas");
        Intrinsics.checkNotNullParameter(sequentialList, "sequentialList");
        this.touchUserInteractionHandler.onComposeHit$com_dynatrace_agent_release(hitArea, overlappedAreas, sequentialList);
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onMotionEvent(View rootView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(event, "event");
        this.touchUserInteractionHandler.onMotionEvent$com_dynatrace_agent_release(rootView, event);
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onViewClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.touchUserInteractionHandler.onViewClick$com_dynatrace_agent_release(view);
    }
}
