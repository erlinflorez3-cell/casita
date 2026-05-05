package com.swmansion.rnscreens;

import com.swmansion.rnscreens.ScreenFragment;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007tjA0JeP.hS2\u000fq|<$i)yCAV b8ޛ\u007fN\u0016f7Xh\u000b[\u000f4\u0017)n:Kmx\f\u0015UV\u000buM7eok>'\u0019~\u001b.8:8(\n1\u001e8J(v)F{\u0010 7XphZSqM( \u000fV /#\rk\\8`l\f=uGK\u007fPX?_^\u0002}\u0011T_?\r%mN/NDM\u0015STI+\u001biM\u0011Wqk\n\u0019+5-as\u00069\u001f$Е\u0019:"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>9\u000f @|t2[N7z2!\u0015u7", "", "1`]\u0011\\:IO(|}E0}\t-y}/{ \u0012\u0017 V", "", "3uT;g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\\u0002)iA\u001e\u0015qH=\bc*bt.G,_,eaH", "2hb=T;<V{~v],\ne+c\u0006\u0005\fO\u0010! %v\u0012:|%49\u000f @|", "", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010", "4qP4`,Gb\u000b\fvi7|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "2hb=T;<V\u007f\u0003{^*\u0011\u00076e_9{I\u0010z %r\u0012Cu\u0003?b\r\u001c;v\u0016;[", "2hb=T;<V\b\fvg:\u0001\u00183o\t\u0013\tJ\u0003$\u0017U}mMv.D", "/k_5T", "", "1k^@\\5@", "CoS.g,%O'\u000eZo,\u0006\u0018\u000ei\u000e3wO~\u001a\u0017F", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ScreenEventDispatcher {
    boolean canDispatchLifecycleEvent(ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);

    void dispatchHeaderBackButtonClickedEvent();

    void dispatchLifecycleEvent(ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent, ScreenFragmentWrapper screenFragmentWrapper);

    void dispatchLifecycleEventInChildContainers(ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);

    void dispatchTransitionProgressEvent(float f2, boolean z2);

    void updateLastEventDispatched(ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);
}
