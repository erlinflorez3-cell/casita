package com.dynatrace.agent.userinteraction.util;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`S2şs{J$c$wCA٥0ԂR\t}M(\u0005~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015\u001f6PsW3{tެ=bz<\u0013'z5F\u0002\u001d\u0001H3x\u0014\u0005\u0005[K:\u001dvϋ¤>R\u0013YU& \u0006V /\u001f3ɤPɇLleŽ\u007f/\u0011kZNUb\u0007ŪOϘJT/˙Gm,/X7c\u001a{و\u0005\u07baV[GšӳuJ"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u001biNpC\u0014\u001f0", "", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0004'OO\u001f<\u007f4\u0014]\f+3|\u00141MP\u0011R2(\u001d2`M\u0010_;[r%G\u0016J.\\[\u0002\u0007\u0013\u0016${N9\u001b\tcJ\bwEA,\u0010(X\u0006Eqk\u0019 \u001f9ipO,vE\u0004\u001d?@=qBhluEA\u000f^,d\u0015nfZDB,\u001ezb*lX.SjW\u0019r=\u0007qxK\u0018zEy\u0002^", "BqP0^", "", "CrT?<5MS&zxm0\u0007\u0012\u0014s\n1", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "BqP0^j<]!xyr5x\u0018<a}(u<\u0003\u0017 Vi\u001b<}%1g}", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionTracker {
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public UserInteractionTracker(RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.timeProvider = timeProvider;
    }

    public final void track$com_dynatrace_agent_release(JSONObject userInteractionJson) {
        Intrinsics.checkNotNullParameter(userInteractionJson, "userInteractionJson");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction cannot be tracked, session is disabled");
        } else if (sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            this.rumEventDispatcher.dispatchEvent(userInteractionJson, this.timeProvider.millisSinceEpoch(), 0L, sessionInformationMetricsCollectSessionInfo, false, null);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "User Interaction event shouldn't be collected, because of data collection is disabled");
        }
    }
}
