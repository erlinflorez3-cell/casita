package com.dynatrace.agent.metrics;

import android.location.Location;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import com.dynatrace.android.agent.util.Utility;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU \u007f*\teNo˧vJp\u000bK\u000f\f\u001a\u0001j:I]xc\u0013\u00172XoG3SoE9vt>\u0005&7(\u0600\u0010ڎ\u001f@ZH>u3BqLI@D~:j\r{\u0006*\u0016\u0014@8\u0001L_wRDL\u0005]h43\u0007wHf'\u000e7\rS\u0013Fb/%v\u0010';DE?-%\u0002\u000e\u07baV]E\u000fM~\u0006\u0010v??+w\r\u001e̬ݼ\u0004\u0014\u001bE\u0018\u001bk\u000e>\\3j\u0011\u00125GgeaO<E@\t\n+T\u0004<\u001fWN<L2h\u001e\ra\u0015;^Nq\u001a^p\u0019Aʨي\u001b%\u0006Us?)\niai+\u00157D\u0011\u001bB;\u0001\u001d:\"٭L\u05ce\u0019\u001bb\u001d\"=_@UH|\u000b0Ơoձtb\nÏT<U\u0002G{?1m©9٦=#)ǽRTRk\u000f\u0005\u000fm*֢T͕D\"vݫ\b6\u0017\u0012rD\u0013\fB¯Vг0\u0011Uȼ%\u0015\f\u0010+ \u000b\u0001\u0013Ɯ'ŎRQpix[.\u001639~7\byBސYߍb3=ȡ4\u001eoa\u000f\u0016U;\u0011\u0015/٫Nΐ\u0010Zd̥rNV}(w*V~\u0010!CWqJFjqo©!Ƞ\u0007$Jˆ\u0015\u000benv%OtA:\u001bk:s7\u0013\u0001b~\u0001\u007fz_++r`m\u0018٢AԊ*[*ֻL~)\u001e\r\tûK\u000f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "", ";dc?\\*L2\u0015\u000evL6\r\u0016-e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u000bq2-r6C:X<iPr\u0013", "Adb@\\6G>&\t\fb+|\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "=mT\u000eZ,Gb\u0001~\nk0z\u0017\u001ar\n9\u007f?\u0001$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u000f>YY\"7v%\u0016MRHo2,\u007fukJ\u000bb,[L", "AdR<a+ S\"fzm9\u0001\u0007=P\r2\rD\u007f\u0017$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u00135W\b)6O\u001675CJx8\u001c#SnC\u0018g+N\u0004|", "7mc2e=:Z", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn@f}!7z\u00167KC\u0005S4-\"l_Geg:TU#VH<6l_p=ixX\u0018Vt\f\u0019b=3{@5\u001fQ(K\u0002DwJ\u000b\u001aW#j~PZ\u001aP]\u001evK6pBhc\u0004P,Rl;h\u000b_*2!8.\u001c;\u0018/qL=\u0017wQ\u0011<N{gpVb\u000383KqYT\u000fY^<P)\u001fT\u000b_\u0012Aex)\u0003\u0018\u0011>;:c\u0005X=~<h\u0001^+pJ#5C8\u0011?\u0015_wlG\u001d2'a\u0017\u001bf3?bSeaR\u0018\u0006?\u0017d\u001dan\u000e;P\u0014)Vy&+E~O1^{\u000f\u00113tiRVdR\u000b'zT1c\u001a\u0003\u00110u&; Mh\u0013q*M5W\u001e\t>\u001f\u0012\u0006hJ\u0019y\u0012\u0015~S<_`~$C\u0002\rPj\u0012K=rbJ~m =\u000f\u001a\f-qxL\u0007\u001e\u000f2+=f\u000e&Q", "\u0018", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "D`[BX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "1`R5X+&S(\f~\\:", "5dc\u0010T*AS\u0018fzm9\u0001\u0007=", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\u001c\u001e$ue7\u0015B(]r|", ";dc?\\*L4&\t\u0003I9|\u001a3o\u00106i@\u000f%\u001bQx", "5dc\u001aX;KW\u0017\r[k6\u0005s<e\u0011,\u0006P\u000f\u0005\u0017U}\u0012F\u007f", "@t]\u001dX9B]\u0018\u0003xF,\f\u00163c\u000e\u0018\u0007?|&\u0017", "", "@t]\u001dX9B]\u0018\u0003xF,\f\u00163c\u000e\u0018\u0007?|&\u0017\u0006m\u0018Dp$Iby/Di\u0014.G?=k=-\u000fua@\u0007_:N", "CoS.g,,Q&~zg\u0014|\u0018<i}6", "Aba2X5&S(\f~\\:", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u000f>YY\"7v%\u001cKP;k=\u0006\u0015wn=\u0005q\u0002", "CoS.g,%]\u0017z\nb6\u0006p/t\r,yN", ":nR.g0H\\", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxc", "As^=", "As^=\u0017*H[\u0013}\u000fg(\f\u0016+c\u007f\"wB\u0001 &A|\u000eCv!CY", "7mXA\\(EW.~b^;\n\r-s", "CoS.g,&S(\f~\\:", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MetricsRepository {
    private static final Companion Companion = new Companion(null);
    private static final int UNKNOWN_SCREEN_DIMENSION = -1;
    private volatile MetricsData cachedMetrics;
    private final CoroutineScope coroutineScope;
    private final long interval;
    private Job job;
    private final MetricsDiskDataSource metricsDataSource;
    private volatile MetricsData metricsFromPreviousSession;
    private final OneAgentMetricsProvider oneAgentMetricsProvider;
    private final SecondGenMetricsProvider secondGenMetricsProvider;
    private final SessionInformationProvider sessionProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.metrics.MetricsRepository$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MetricsRepository.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MetricsRepository metricsRepository;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                metricsRepository = MetricsRepository.this;
                this.L$0 = metricsRepository;
                this.label = 1;
                obj = metricsRepository.metricsDataSource.getMetrics(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                metricsRepository = (MetricsRepository) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            metricsRepository.metricsFromPreviousSession = (MetricsData) obj;
            return Unit.INSTANCE;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116Ȑ\u0005ӯ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"| \u0017\u0011k7J\u007f+QU$", "", "\nh]6g\u0005", "u(E", "#M:\u001bB\u001e'M\u0007\\g>\fe\u0003\u000eIg\bd.d\u0001\u007f", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MetricsRepository(MetricsDiskDataSource metricsDataSource, SessionInformationProvider sessionProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j2, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(metricsDataSource, "metricsDataSource");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(oneAgentMetricsProvider, "oneAgentMetricsProvider");
        Intrinsics.checkNotNullParameter(secondGenMetricsProvider, "secondGenMetricsProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.metricsDataSource = metricsDataSource;
        this.sessionProvider = sessionProvider;
        this.oneAgentMetricsProvider = oneAgentMetricsProvider;
        this.secondGenMetricsProvider = secondGenMetricsProvider;
        this.interval = j2;
        this.coroutineScope = coroutineScope;
        this.cachedMetrics = initializeMetrics();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetricsRepository(MetricsDiskDataSource metricsDiskDataSource, SessionInformationProvider sessionInformationProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j2, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long duration = j2;
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            Duration.Companion companion = Duration.Companion;
            duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
        }
        this(metricsDiskDataSource, sessionInformationProvider, oneAgentMetricsProvider, secondGenMetricsProvider, duration, coroutineScope, null);
    }

    public /* synthetic */ MetricsRepository(MetricsDiskDataSource metricsDiskDataSource, SessionInformationProvider sessionInformationProvider, OneAgentMetricsProvider oneAgentMetricsProvider, SecondGenMetricsProvider secondGenMetricsProvider, long j2, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(metricsDiskDataSource, sessionInformationProvider, oneAgentMetricsProvider, secondGenMetricsProvider, j2, coroutineScope);
    }

    private final MetricsData initializeMetrics() throws Throwable {
        int iDeviceOrientation = this.oneAgentMetricsProvider.deviceOrientation();
        String manufacturer = this.oneAgentMetricsProvider.getManufacturer();
        String model = this.oneAgentMetricsProvider.getModel();
        boolean zIsDeviceRooted = this.oneAgentMetricsProvider.isDeviceRooted();
        String osVersion = this.oneAgentMetricsProvider.getOsVersion();
        String strPackageName = this.oneAgentMetricsProvider.packageName();
        String strNetworkState = this.oneAgentMetricsProvider.networkState();
        return new MetricsData(0, 0, iDeviceOrientation, this.secondGenMetricsProvider.batteryLevel(), null, null, manufacturer, model, zIsDeviceRooted, null, osVersion, strPackageName, this.secondGenMetricsProvider.appVersion(), null, null, strNetworkState, false, false, 221747, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateMetrics(Continuation<? super Unit> continuation) {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionProvider.collectSessionInfo();
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, 0, 0, this.oneAgentMetricsProvider.deviceOrientation(), this.secondGenMetricsProvider.batteryLevel(), null, null, null, null, false, null, null, null, null, sessionInformationMetricsCollectSessionInfo.getInstanceId(), sessionInformationMetricsCollectSessionInfo.getSessionId(), this.oneAgentMetricsProvider.networkState(), sessionInformationMetricsCollectSessionInfo.getCrashReporting(), sessionInformationMetricsCollectSessionInfo.getSessionActive(), 8179, null);
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "updated and stored metrics");
        Object metrics = this.metricsDataSource.setMetrics(this.cachedMetrics, continuation);
        return metrics == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? metrics : Unit.INSTANCE;
    }

    public final MetricsData getCachedMetrics() {
        return this.cachedMetrics;
    }

    public final MetricsData getMetricsFromPreviousSession() {
        return this.metricsFromPreviousSession;
    }

    public final void runPeriodicMetricsUpdate$com_dynatrace_agent_release() {
        stop$com_dynatrace_agent_release();
        this.job = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new MetricsRepository$runPeriodicMetricsUpdate$1(this, null), 3, null);
    }

    public final void stop$com_dynatrace_agent_release() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    public final void updateLocationMetrics(Location location) {
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, 0, 0, 0, 0, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, null, null, false, null, null, null, null, null, null, null, false, false, 262095, null);
    }

    public final void updateScreenMetrics(OneAgentScreenMetrics oneAgentScreenMetrics) {
        this.cachedMetrics = MetricsData.copy$default(this.cachedMetrics, oneAgentScreenMetrics != null ? oneAgentScreenMetrics.getScreenWidth() : -1, oneAgentScreenMetrics != null ? oneAgentScreenMetrics.getScreenHeight() : -1, 0, 0, null, null, null, null, false, null, null, null, null, null, null, null, false, false, 262140, null);
    }
}
