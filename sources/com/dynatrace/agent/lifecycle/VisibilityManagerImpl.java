package com.dynatrace.agent.lifecycle;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.lifecycle.model.VisibilityStatus;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`t2\u000fy\u0002<řc$\u007fLC٥\"}8\tWȞog|Jb\u000bI\u0015\fǝ\u000f̓\\I\u0004w\u001e/\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXMǘz|IQ\u001a\u0019xN~Ij\r{\u0015J\u0016\u0014O8\u0001Lf.b~VzoR/Q\u0013\u001aF\\8w0+WSZ\u001d=\u001b\ny\u001eYPg9#6k\u00035\\\fC\u0011S\n=3tm;sO\u0002lNX.\"[?\u0018\u001bk\t>\\3a\u0011\u00105Bgcy^T(H\u0007\n\rT\u0004<\u0007}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001UXP0a\u0019Ș|ˋ:\u0017-Į\u00047G\u001f~Q\u0010@o\u05ce9߉\t\r&ŀQ\u0001/cl\u0014p\u0017+T&[_Z\u0017׃Jݳ\u000eYEЧT|p\rB\u0004^SV߿\b 2\u0017-ڛ,E1.\u0004\u0002vR>ϻ\u0011¾lSqɭ͛D:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~J\u0002.;j\u001a5QROS0'\u0011jaFjk7UL", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~J\u0002.;j\u001a5QROS0'\u0011jaF\\", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u0018E@49a}i&q\u001e.8PE|8\u001d\u0015u7 \u0005m4\u0018u;PH]9XPr\u0007\u0010\u0014Z\u0017]ty\u0015a!5nMF}\f:T}Jf\u0004\f#c\u001chzJ \u000f[\u0003\u0011\u0005N%fF#[{GJT,)hUM\u001djH>.\u001dU\"\u001cr]6\u0006\u000bW\u001b{=\u0007qxK\u0018zEy\u0002^", "/o_\u000eV;Bd\u001d\u000e~^:`\b=", "", "", "1gP;Z0GUv\t\u0004_0~\u0019<a\u000f,\u0006I", "", "Dhb6U0EW(\u0013hm(\f\u0019=", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\u001fQQ?h8%\u0019wu'\u0016_;^\u0005|", "=m00g0OW(\u0013hm(\n\u0018/d", "", "/bc6i0Mg|}", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013hm6\b\u0014/d", "7r25T5@W\"\u0001Xh5}\r1", "5dc#\\:BP\u001d\u0006~m@j\u0018+t\u00106", "BqP0^", "Dhb6U0EW(\u0013", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class VisibilityManagerImpl implements VisibilityManager {
    private final Set<Integer> appActivitiesIds;
    private boolean changingConfiguration;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private VisibilityStatus visibilityStatus;

    public VisibilityManagerImpl(TimeProvider timeProvider, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.appActivitiesIds = new LinkedHashSet();
        this.visibilityStatus = VisibilityStatus.BACKGROUND;
    }

    private final void track(VisibilityStatus visibilityStatus) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event cannot be tracked, session is disabled");
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "visibility event shouldn't be collected, because of data collection is disabled");
            return;
        }
        RumEventDispatcher rumEventDispatcher = this.rumEventDispatcher;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_VISIBILITY_CHANGE, true);
        jSONObject.put(EventKeys.VISIBILITY.STATE, visibilityStatus.getKeyValue());
        rumEventDispatcher.dispatchEvent(jSONObject, this.timeProvider.millisSinceEpoch(), 0L, sessionInformationMetricsCollectSessionInfo, false, null);
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public VisibilityStatus getVisibilityStatus() {
        return this.visibilityStatus;
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityPaused(int i2) {
        this.appActivitiesIds.add(Integer.valueOf(i2));
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityStarted(int i2) throws JSONException {
        this.appActivitiesIds.add(Integer.valueOf(i2));
        if (this.appActivitiesIds.size() != 1 || this.changingConfiguration) {
            return;
        }
        this.visibilityStatus = VisibilityStatus.FOREGROUND;
        track(VisibilityStatus.FOREGROUND);
    }

    @Override // com.dynatrace.agent.lifecycle.VisibilityManager
    public void onActivityStopped(int i2, boolean z2) throws JSONException {
        this.changingConfiguration = z2;
        this.appActivitiesIds.remove(Integer.valueOf(i2));
        if (!this.appActivitiesIds.isEmpty() || this.changingConfiguration) {
            return;
        }
        this.visibilityStatus = VisibilityStatus.BACKGROUND;
        track(VisibilityStatus.BACKGROUND);
    }
}
