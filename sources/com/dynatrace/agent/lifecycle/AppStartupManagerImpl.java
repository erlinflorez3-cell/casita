package com.dynatrace.agent.lifecycle;

import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import com.dynatrace.agent.lifecycle.model.AppStartupPhaseWithTiming;
import com.dynatrace.agent.lifecycle.model.AppStartupType;
import com.dynatrace.agent.lifecycle.model.VisibilityStatus;
import com.dynatrace.agent.lifecycle.util.AppStartupLogger;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yCAV\"}0(WN}gvϺb\u000bQ\u0018\u000eǝ\u0001j:g]xs\u0012\u0017˰JoM3UoC:htL\u0005(2(:\u007fڎ\u0017ɝZH>u;v[\u0010 0XphS\u001dQ\u0013\u001c*\u0006l#\u0011\"jkf6vqm>=)\u001bipU7i>\u0005e\u0013VV7\r%kL4Ë;7\u001b0a\u000fO`iT\u001b? S5l5>CI\"k|lH\u001a#Cg\r\f\u0004l\\MYn%?-ebyjT(@\u0001\n(T\u0004<\u001cmHv;(\u0003 \u000ea\u000b#WNm\u001a^p\u001aAa\u0007#3\u007fK+g\u001c=Ϣcޅ\u001dN?ަU\u0019,%\u0019nO^+טbڠ\u001fT\u007f\u0383\u0002]NA`N8^\u0014Ъ\u0006Ͳf\u00022ʶ\u0001S\u000e5\u0014\u0011\\\u001e{ڞ]ޠ'!sȵ\u0019Vu~\u001dfxUyRvJPwlն,Á\u0010ZLߟU}^ap2!O,T5\r6!vςy˶%%\u0018ʚ twze]86\u0006όC֍rk\u0016ã\npAGii cbvBSju[֝h͞W\fb٢͎&P"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~5\t+%|\u0012;\\SFS0'\u0011jaFjk7UL", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~5\t+%|\u0012;\\SFS0'\u0011jaF\\", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "/o_ g(Kb)\nah.~\t<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~i\r$>7q9X1JgA-%sHC\te,[L", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxu?MLJJ8, dp7\nc9$", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "Dhb6U0EW(\u0013hm(\f\u0019=P\r2\rD\u007f\u0017$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\u001fQQ?h8%\u0019wu'\u0016_;^\u0005|", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u0018E@49a}i&q\u001e.8PE|8\u001d\u0015u7 \u0005m4\u0018u;PH]9XPr\u0007\u0010\u0014Z\u0017]t\u0014\tZA\"\u0003B>\u001fQ<X\u0006B2\\\u0017!{Df}Qf\u001b.\u0004\u0017wA6>-Wi\u0002\u0011@Yk&s\u0019[\u001b\\\u00046&\u0014z(dRY.e}S\u001a\u0002@\tctV)\u0006\u00185>vj%I}`8\u0004%\"K\tMx0b|tsA\r09C`\u0003K1\u0014@^\u0002$u[Ep\u00146J!CUlYu?\u0018u']\u0017\u0012l>\u001c&ovgG\u000f\u00143}a?pf\u0005@\u001c\u000bOQ9\u00167O|Q_\u0004\u001e\u0017P\u0005}nGR\u001f^\ndF\b\u0013", ">gP@X:", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:Nh+VO=0dV{?i", "7r??b*>a'\u0003\u0004`\u001a\f\u0005<t\u00103", "", ">gP@X:(`\u0018~\b", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:NL", "=mBAT9Mc$i}Z:|", "", "AsP?g<I>\u001cz\t^", "1`]\u001de6<S'\rea(\u000b\t", "5dc g(Kb)\nir7|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl(\u001bn,$", ">q^0X:LA(z\bm<\bs2a\u000e(\n", "=mBAT9Mc$^\u0004]", "/o_ g(Kb)\nir7|", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AppStartupManagerImpl implements AppStartupManager {
    private final AppStartupLogger appStartupLogger;
    private boolean isProcessingStartup;
    private final List<AppStartupPhaseWithTiming> phases;
    private final List<AppStartupPhase> phasesOrder;
    private final OneAgentStartupEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private final Function0<VisibilityStatus> visibilityStatusProvider;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppStartupPhase.values().length];
            try {
                iArr[AppStartupPhase.APPLICATION_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppStartupManagerImpl(TimeProvider timeProvider, AppStartupLogger appStartupLogger, OneAgentStartupEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, Function0<? extends VisibilityStatus> visibilityStatusProvider) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(appStartupLogger, "appStartupLogger");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(visibilityStatusProvider, "visibilityStatusProvider");
        this.timeProvider = timeProvider;
        this.appStartupLogger = appStartupLogger;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.visibilityStatusProvider = visibilityStatusProvider;
        this.phases = new ArrayList();
        this.phasesOrder = CollectionsKt.listOf((Object[]) new AppStartupPhase[]{AppStartupPhase.APPLICATION_CREATE, AppStartupPhase.ACTIVITY_CREATE, AppStartupPhase.ACTIVITY_START, AppStartupPhase.ACTIVITY_RESUMED});
    }

    private final boolean canProcessPhase() {
        if (this.visibilityStatusProvider.invoke() == VisibilityStatus.BACKGROUND) {
            this.isProcessingStartup = true;
        }
        return this.isProcessingStartup;
    }

    private final AppStartupType getStartupType() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[((AppStartupPhaseWithTiming) CollectionsKt.first((List) this.phases)).getPhase().ordinal()];
        if (i2 == 1) {
            return AppStartupType.COLD;
        }
        if (i2 == 2) {
            return AppStartupType.WARM;
        }
        if (i2 == 3) {
            return AppStartupType.HOT;
        }
        if (i2 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void onStartupEnd(AppStartupType appStartupType) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "startup event cannot be tracked, isGrailEventsCanBeCaptured == false");
            this.phases.clear();
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "startup event cannot be tracked, session is disabled");
            this.phases.clear();
            return;
        }
        long start = ((AppStartupPhaseWithTiming) CollectionsKt.first((List) this.phases)).getStart();
        long start2 = ((AppStartupPhaseWithTiming) CollectionsKt.last((List) this.phases)).getStart();
        this.appStartupLogger.logApplicationStartup(appStartupType, start, start2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_APP_START, true);
        jSONObject.put(EventKeys.APPSTART.TYPE, appStartupType.getValue());
        int i2 = 0;
        for (Object obj : this.phases) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) obj;
            AppStartupPhaseWithTiming appStartupPhaseWithTiming2 = (AppStartupPhaseWithTiming) CollectionsKt.getOrNull(this.phases, i3);
            if (appStartupPhaseWithTiming2 != null) {
                long start3 = appStartupPhaseWithTiming2.getStart();
                if (appStartupPhaseWithTiming.getPhase() != AppStartupPhase.ACTIVITY_RESUMED) {
                    jSONObject.put(EventKeys.APPSTART.NAMESPACE + appStartupPhaseWithTiming.getPhase().getValue() + ".start_time", appStartupPhaseWithTiming.getStart() - start);
                    jSONObject.put(EventKeys.APPSTART.NAMESPACE + appStartupPhaseWithTiming.getPhase().getValue() + ".end_time", start3 - start);
                }
            }
            i2 = i3;
        }
        this.rumEventDispatcher.dispatchNativeEvent(jSONObject, start, start2 - start, sessionInformationMetricsCollectSessionInfo);
        this.phases.clear();
    }

    private final void processStartupPhases() throws JSONException {
        AppStartupType startupType = getStartupType();
        if (startupType == null) {
            return;
        }
        if (this.phases.size() == 1) {
            this.appStartupLogger.logApplicationStartupBegin(startupType, ((AppStartupPhaseWithTiming) CollectionsKt.first((List) this.phases)).getStart());
            return;
        }
        if (this.phases.size() > 1) {
            this.appStartupLogger.logPhase(startupType, this.phases.get(r1.size() - 2).getPhase(), this.phases.get(r1.size() - 2).getStart(), ((AppStartupPhaseWithTiming) CollectionsKt.last((List) this.phases)).getStart());
            if (((AppStartupPhaseWithTiming) CollectionsKt.last((List) this.phases)).getPhase() == AppStartupPhase.ACTIVITY_RESUMED) {
                this.isProcessingStartup = false;
                onStartupEnd(startupType);
            }
        }
    }

    @Override // com.dynatrace.agent.lifecycle.AppStartupManager
    public void onStartupPhase(AppStartupPhase startupPhase) throws JSONException {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(startupPhase, "startupPhase");
        if (canProcessPhase()) {
            if (!this.phases.isEmpty() && (iIndexOf = this.phasesOrder.indexOf(((AppStartupPhaseWithTiming) CollectionsKt.last((List) this.phases)).getPhase())) != CollectionsKt.getLastIndex(this.phasesOrder) && this.phasesOrder.get(iIndexOf + 1) != startupPhase) {
                AppStartupType startupType = getStartupType();
                if (startupType != null) {
                    this.appStartupLogger.logApplicationStartupCancel(startupType);
                }
                this.phases.clear();
            }
            this.phases.add(new AppStartupPhaseWithTiming(startupPhase, this.timeProvider.millisSinceEpoch()));
            processStartupPhases();
        }
    }
}
