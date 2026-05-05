package com.dynatrace.agent;

import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%yCI^\"}(\nWN}gvϺb\u000bY\u000f\u000e\u0016~j4Ikxe܈\u00172PoG3SsE9n\u0013>\u0005.>*8\u007f\t\u0007ɝ@Ϻ@v)B\f;\"6FpHR%M3\u001b\"\nL\"\u0019\u001e\u000bj^:Vpu:](\u0013mPT?_^\u0004]\u0011T\\?\r%jӿ/B=?#0\u001c'\u0015is?1W\"A\u0013\u0002?'YZ$[Dr\u0018\u0014C,\u007f\u0011k\u000e>\\3R\u0011\u00105GgcyfVJ\u0006\u0018\u0014\rj\u001c>\n5aF-Hw8\u0012A\u0011\u000bSnf2hP\u001e\u0013gF\u00195\u007faKg:/Uo\\1Ne\u0014M#,E\u0019nOs\u0005\u0012n.3T&baUNY`N8o\u0004mL|p%B\u0004^_F\u0082: 2\u00173[$?1F\u0004\u0002v\\.vUlvS\u0002RvAxÅ\u0018֖.\t\u0014ɮ\u0015p\u0013ohT\u00071g۶\u001eΤ\u000b}\u0010ʶph\u0006B9%>U&řkҷQ]\u0012ɘ\u007frEa\u0007k<`\u0010ӗ5̳Uc\u0018Р#\u0006\"KTb3eڋFY\u0014ȗt*(@Vy`\u0006\nTf\u000e)1m\u0003rؼ8֞\u001d\\\u001dǽS,PS\u0015\u000buY\u0017#Uԡ?ʗ\u0007i,ڏY\r^p\to\u0016\u0006 ؖ\t˃&-Iٛ\u0006'4j:jJ{Q\u001dU͡\fěkLOƂ̧\u001a\u001c"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxu?MLJJ8, dp7\nc9$", "", "1`R5X\u001bB[\u0019f~e3\u0001\u0017", "", "=mT\u000eZ,Gbv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2hb=T;<V\u0019\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Ad[3@6GW(\t\bb5~", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u0015=^/>]\r*Dq\u001f0+MCv>'\u0015qp\u000f", "\nh]6g\u0005", "uI;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0001Poi>v.D7\b)8q\u0018>Z?Jo>'jOgC\u0016j0W\npEV[6lavF\u0014 $kX8\u0017\u0015hE-n25)\u0013,\u001fh9r\tU\u0015\">f\u007fOR\u000eGC\u0011wA2w\u0010Fo\u0002'REk9C\u0010m(XI8'\u0014~n\u0002fZ6Szg\u001ana\u0007ceGbv:$G|%EI9C<{(\u0007U\u0005{!<ex4v\u000b\u000e<5@m\u0005Tvm\u0002O", "@d`B\\9>a\u0001~\b`,{d:pm7wM\u0010", "", "5dc\u001fX8NW&~\tF,\n\u000b/d[3\u0007.\u0010\u0013$V", "u(I", ">d]1\\5@3*~\u0004m", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ">d]1\\5@8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "7r56e:MA(z\bm<\bh@e\t7ZD\u000f\"\u0013Vm\u0011<u", "1`R5X+&S(\f~\\:", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u00135g\f$Avy7NMHs0-\u0019rj!\u0007r9Rt5\u001d", "2hb=T;<V\u0002z\nb=|h@e\t7", "", "8r^;B)CS\u0017\u000e", "AsP?g\u001bB[\u0019\r\nZ4\b", "2ta.g0H\\", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0010{O\u000e\u001b\u0015U", "2hb=T;<Vv\f\u0005l:g\u0010+t\u00012\tH`(\u0017P~", "1o:2l:", "", "", "4na0X\u000bBa$z\n\\/\u0001\u00121E\u0011(\u0005Od\u0018vZs\u001cK\u0005", "Dda6Y@\u001dO(zek0\u000e\u0005-y[1z.\u0001 \u0016'\u0001\u000eE\u0006", "AgdAW6P\\", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@db2g\u0017>\\\u0018\u0003\u0004`\f\u000e\t8t", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentStartupEventDispatcher {
    private final long cacheTimeMillis;
    private SessionInformationMetrics cachedMetrics;
    private final RumEventDispatcher dispatcher;
    private boolean isFirstStartupEventDispatched;
    private JSONObject pendingEvent;
    private Job pendingJob;
    private final boolean requiresMergedAppStart;
    private final CoroutineScope scope;
    private final SelfMonitoringComponent selfMonitoring;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentationFlavor.values().length];
            try {
                iArr[InstrumentationFlavor.REACT_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentationFlavor.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OneAgentStartupEventDispatcher.this.shutdown(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupEventDispatcher$verifyDataPrivacyAndSendEvent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $jsonObject;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11151(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Continuation<? super C11151> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.$sessionInformationMetrics = sessionInformationMetrics;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OneAgentStartupEventDispatcher.this.new C11151(this.$jsonObject, this.$sessionInformationMetrics, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OneAgentStartupEventDispatcher.this.dispatcher.dispatchEvent(this.$jsonObject, this.$sessionInformationMetrics, null);
            return Unit.INSTANCE;
        }
    }

    public OneAgentStartupEventDispatcher(long j2, OneAgentConfiguration oneAgentConfiguration, CoroutineScope scope, RumEventDispatcher dispatcher, SelfMonitoringComponent selfMonitoring) {
        Intrinsics.checkNotNullParameter(oneAgentConfiguration, "oneAgentConfiguration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(selfMonitoring, "selfMonitoring");
        this.cacheTimeMillis = j2;
        this.scope = scope;
        this.dispatcher = dispatcher;
        this.selfMonitoring = selfMonitoring;
        int i2 = WhenMappings.$EnumSwitchMapping$0[oneAgentConfiguration.getInstrumentationFlavor().ordinal()];
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        this.requiresMergedAppStart = z2;
    }

    public /* synthetic */ OneAgentStartupEventDispatcher(long j2, OneAgentConfiguration oneAgentConfiguration, CoroutineScope coroutineScope, RumEventDispatcher rumEventDispatcher, SelfMonitoringComponent selfMonitoringComponent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? 10000L : j2, oneAgentConfiguration, coroutineScope, rumEventDispatcher, selfMonitoringComponent);
    }

    public final void resetPendingEvent() {
        this.pendingEvent = null;
        this.pendingJob = null;
        this.cachedMetrics = null;
    }

    public final void verifyDataPrivacyAndSendEvent(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics) {
        if (sessionInformationMetrics.getEventReporting()) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C11151(jSONObject, sessionInformationMetrics, null), 3, null);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "startup shouldn't be collected, DataCollectionLevel is Off");
        }
    }

    public final void dispatchCrossPlatformEvent(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, List<String> cpKeys) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        Intrinsics.checkNotNullParameter(cpKeys, "cpKeys");
        Object objOpt = jsonObject.opt(EventKeys.START_TIME);
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Invalid start_time in JSON: " + jsonObject);
            return;
        }
        if (!(objOpt2 instanceof Long) && !(objOpt2 instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Invalid duration in JSON: " + jsonObject);
            return;
        }
        synchronized (this) {
            Job job = this.pendingJob;
            JSONObject mergedStartupEventOrNative = null;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            JSONObject jSONObject = this.pendingEvent;
            if (jSONObject != null) {
                try {
                    mergedStartupEventOrNative = JsonObjectExtensionsKt.getMergedStartupEventOrNative(jSONObject, jsonObject, cpKeys, this.selfMonitoring);
                } catch (Exception e2) {
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "CP event merge failed: " + e2.getMessage());
                }
                if (mergedStartupEventOrNative != null) {
                    verifyDataPrivacyAndSendEvent(mergedStartupEventOrNative, sessionInformationMetrics);
                }
                resetPendingEvent();
                Unit unit = Unit.INSTANCE;
            } else {
                resetPendingEvent();
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void dispatchNativeEvent(JSONObject jsonObject, long j2, long j3, SessionInformationMetrics sessionInformationMetrics) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(sessionInformationMetrics, "sessionInformationMetrics");
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(jsonObject);
        jSONObjectDeepCopy.put(EventKeys.START_TIME, j2);
        jSONObjectDeepCopy.put("duration", j3);
        synchronized (this) {
            if (!this.requiresMergedAppStart || this.isFirstStartupEventDispatched) {
                verifyDataPrivacyAndSendEvent(jSONObjectDeepCopy, sessionInformationMetrics);
            } else {
                this.isFirstStartupEventDispatched = true;
                this.cachedMetrics = sessionInformationMetrics;
                this.pendingEvent = jSONObjectDeepCopy;
                this.pendingJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1(this, sessionInformationMetrics, null), 3, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void forceDispatchingEventIfExists() {
        SessionInformationMetrics sessionInformationMetrics;
        synchronized (this) {
            Job job = this.pendingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            try {
                JSONObject jSONObject = this.pendingEvent;
                if (jSONObject == null || (sessionInformationMetrics = this.cachedMetrics) == null) {
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Event cannot be forced, pendingEvent: " + this.pendingEvent + " and cachedMetrics: " + this.cachedMetrics);
                } else {
                    this.isFirstStartupEventDispatched = true;
                    Intrinsics.checkNotNull(jSONObject);
                    Intrinsics.checkNotNull(sessionInformationMetrics);
                    verifyDataPrivacyAndSendEvent(jSONObject, sessionInformationMetrics);
                }
            } catch (Exception unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Not possible to force native event to be send: " + this.pendingEvent + ", " + this.cachedMetrics);
            }
            resetPendingEvent();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean getRequiresMergedAppStart() {
        return this.requiresMergedAppStart;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shutdown(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.dynatrace.agent.OneAgentStartupEventDispatcher.AnonymousClass1
            if (r0 == 0) goto L43
            r4 = r6
            com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1 r4 = (com.dynatrace.agent.OneAgentStartupEventDispatcher.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L43
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L49
            java.lang.Object r1 = r4.L$0
            com.dynatrace.agent.OneAgentStartupEventDispatcher r1 = (com.dynatrace.agent.OneAgentStartupEventDispatcher) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            r0 = 0
            r1.pendingEvent = r0
            r1.pendingJob = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.Job r0 = r5.pendingJob
            if (r0 == 0) goto L41
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = kotlinx.coroutines.JobKt.cancelAndJoin(r0, r4)
            if (r0 != r2) goto L41
            return r2
        L41:
            r1 = r5
            goto L27
        L43:
            com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1 r4 = new com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1
            r4.<init>(r6)
            goto L13
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.OneAgentStartupEventDispatcher.shutdown(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
