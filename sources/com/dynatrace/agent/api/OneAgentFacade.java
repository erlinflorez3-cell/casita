package com.dynatrace.agent.api;

import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.api.internal.HttpRequestEventBuilderInternal;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.view.ViewContextManager;
import com.dynatrace.agent.view.ViewContextManagerApi;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`S2şs{B0cҕyCQU\"}(\nWN}gvϺ`ŏYƤ6\u0016'ilfe|k\u0012'2ppO7[qU9\u000fwF\t.6:8(\nв\u001e,N\u0016\u0005\u0002\f[\u001a\u001aH@\u001fC\u0003\u0013[\u000f2\u0014\u001c=N\fdp0\\DP\u0005]h8S\u0007wNf'\u000e=CaULb5%v\u0010'qT\u007fA#4k\u00035[\fC\u0011O\n=3yw39I\fWdYVϯ\u0017ۣS\reövh\u0013Sx\fU.&ҭMח\u0012(\u007f\u07beL\u0019J\b&\u0006UM\u0005Ʃ\u001cǴ\f\u000e;οɪWR"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011Y\u0017<R'5b\r\u00013k\u0012-M\u0019", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011`\u0012<\t\u0003?b\r J|q9Q\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "DhTD66Gb\u0019\u0012\nF(\u0006\u00051e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0016IL7m4+j", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0005FY\u0007/\u0016q$9IR9n4+j", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0016\u001b\u0011]\u000eJ\u0005)?ba)8w#6IR?u=\t\"rr=\u0006c9$]%QT\u0018+p[nL!\u000eX\u000e\u0018'\u000f\u0005bPm\u007fH71Q\u001dM\u0002MF\u000b\u0015%\u000eHyX>_\fIy\"K('rN#^\u000eP=To&b\f)\u0019^:C3][\"\u001bDR.\u0013\u000b3\"r[\tFkU$vG\"Amh\u001c\t`", "AsP?g\u001dBS+", "", "<`\\2", "", "4hT9W:", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "As^=I0>e", "Ad]1;;M^\u0006~\u0007n,\u000b\u0018\u000fv\u007f1\u000b", "6sc=E,Jc\u0019\r\n>=|\u0012>B\u0010,\u0003?\u0001$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011R\u001dK\u0002\u00125e\u000e E|u?MLJHD\"\u001cgaF\\", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentFacade implements ViewContextApi {
    private final OneAgentEventDispatcher eventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final ViewContextManager viewContextManager;

    public OneAgentFacade(SessionInformationProvider sessionInformationProvider, ViewContextManager viewContextManager, OneAgentEventDispatcher eventDispatcher) {
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(viewContextManager, "viewContextManager");
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.sessionInformationProvider = sessionInformationProvider;
        this.viewContextManager = viewContextManager;
        this.eventDispatcher = eventDispatcher;
    }

    public final void sendHttpRequestEvent(HttpRequestEventBuilder httpRequestEventBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestEventBuilder, "httpRequestEventBuilder");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isActiveGrailSession() || !sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendHttpRequestEvent: event cannot be sent on this session, sessionInfo: " + sessionInformationMetricsCollectSessionInfo);
            return;
        }
        HttpRequestEventBuilderInternal.HttpRequestEvent httpRequestEventBuild = httpRequestEventBuilder.build();
        if (httpRequestEventBuild != null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "sendHttpRequestEvent with request: " + httpRequestEventBuild.getRequest() + " and properties: " + httpRequestEventBuild.getEventProperties());
            this.eventDispatcher.dispatchEventWithRestrictions(httpRequestEventBuild.getEventProperties(), httpRequestEventBuild.getRequest(), sessionInformationMetricsCollectSessionInfo, null);
        }
    }

    @Override // com.dynatrace.agent.api.ViewContextApi
    public void startView(String str) {
        String str2;
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isActiveGrailSession() || (str2 = str) == null || str2.length() == 0 || !sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "start view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo + " name: " + str);
        } else {
            ViewContextManagerApi.DefaultImpls.storeContext$default(this.viewContextManager, str, null, 2, null);
        }
    }

    @Override // com.dynatrace.agent.api.ViewContextApi
    public void startView(JSONObject fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        boolean z2 = (fields.opt(EventKeys.VIEW.NAME) == null && fields.opt(EventKeys.VIEW.DETECTED_NAME) == null) ? false : true;
        if (sessionInformationMetricsCollectSessionInfo.isActiveGrailSession() && z2 && sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            this.viewContextManager.storeContext(fields);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "start view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo + " fields: " + fields);
        }
    }

    @Override // com.dynatrace.agent.api.ViewContextApi
    public void stopView() {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (sessionInformationMetricsCollectSessionInfo.isActiveGrailSession() && sessionInformationMetricsCollectSessionInfo.getEventReporting()) {
            this.viewContextManager.clearContext();
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "stop view can't be executed, sessionInfo: " + sessionInformationMetricsCollectSessionInfo);
        }
    }
}
