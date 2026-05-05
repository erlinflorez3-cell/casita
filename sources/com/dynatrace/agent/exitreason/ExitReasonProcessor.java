package com.dynatrace.agent.exitreason;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.exitreason.convertor.ExitReasonConverter;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV5Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u0014\u001f\u0001j2K]xk\u0012\u00172HpG3[\u000eE9vt>ӌ(288\u0002\u0005\u0007\u001c2H&v\u0003CQ\f\u0018ؓV\u0081jR;L=\u00195F\u00140\u0005,\\\u007fNdI|aH1;\u0003\u0018E^+m4\u0015M;Kd+\u001b|y\u001eYGG9#-k\u00035[kC\u0011I\n=3s7+9U\fWde\u0010\u0018#9g\r\f\u00026`\u0013ax\fU<_gYb&(&\fԫ\u0011>\n!\u0014;\u0011:;/~\b<I;ɉ\u0012ĖT\u0002lYH\u001doN/%.I[C)\u007figK\u001b^7* ;8S\u0005|=sT<}[Õ\u0013ɐU1_^\u0006V\\)q=\u001c\u0015!f\u0010J\u001c0u\u001bu|Y>%FO]O\"O\u000e2LR\b\u000f\u0005\u000f\u0004\u001aj#TN\"\u0007\u0016e+_ȴ\\ֈh\u0005s¬%d:\u0013e\u001c\u0003\nTܴ\u0015ء`wDƙu\u001c\\S\u0001i\u0019R4܆'çj7aʤ<\u001ae?v3cX:߇c؏z\u0014Gֺ3\u0011fnZS:c3̨$ĘLj\u0018ǮLP\\\u0016+2m|rؼ.֞\u001d\\\u001dǽS*PM\u0015\t\u000eg?ɰ\u0001Ձ7$\u000bǭt\u0001\u0017\u000fh\\\u001f~>ձKض\u0001`*Ί\u0012]C)>UPy\u000bí%ȷ\u0003s\bø8XU^\u0005\u0016$fR\u0090\u0018׀=Q7ˋш\u0013#"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9$", "", "3wXAE,:a#\bZo,\u0006\u0018\ro\t9{M\u0010!$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#{*@~\u0016;\\MH5\u00141\u0019wN9\u0003q6WT1P]N9kR\u007f\u0013", "3wXAE,:a#\bib4|\u0017>a\b3Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001agC\u001a\u0003wkF\u0007C?R\u0006\u0014GH\\6eAvE\u0014 i\nV6k\u0001h=\u0012xTD\u001d\b\u0002", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "@dc2a;B]\"m~f,", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", ";dc?\\*L@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "7r=.g0OSv\fvl/i\t:o\r7\u007fI\u0003v Cl\u0015<u", "", "7r0;e\u0019>^#\f\nb5~h8a|/{?", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017*K~\u001b<r3?bG\u001eAv'.ZREx}}(lp&\u0007_:X\u007f\u0005QU_,iarJixX\u0018Vt\f\u0019b=3{@5\u001fQ(K\u0002DwJ\u001a%\u0018BfrB \u001bTy\u0016uN)qDY)XCPAP9n\u0019_|o>I\u0011\u0014m'%q?2\u0012{a nZ\u0005FcV\u0015hB4Kk[\u001c,m_D>&3Tw\u0007\u001f.Vttp/\u0004=9\u007fb\u000fSo\"G(\b\u00194\\\u000b\u0016*><}LUtyk>\u001b>\u0004H\u0004\u0017aB;\u001dd/aR\u0018\u0016] j~?i\nFR\u0019M\u001fV\u00131NHAo\u0003\u0011\u0018\u0014 ke\u0013?\u001dT\n):12gp\u0014\u0003o'z2$HU\u001ef-_D#y\u0007r@UzmL\u0011\u007fU\fkK<WYo-EB\u0010Mj!KJ\u0005VMxs\u001f5\u000b\u0018\u0007\u0019\u0003mL\u0003! /6AX8o6\u0016\tq[k\u0018{A\u0018.:-\u007fR\nj`w0$G\u0016h\f\"a<FK\u001bAXw&:q8\u0005Gd`\u0014;W\"C6i\u000b\u0006L", ">q^0X:L", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ">q^0X:L3,\u0003\nK,x\u00179n\u000e", "3wXAE,:a#\b\t", "", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! '\u0003\u0012KZ.6cS", ";dc?\\*L2\u0015\u000ev", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f&\u0006HJ\u0016+Pk\u001dIr#5#y\"7v%w[REx0 \u00152lF\u0007d,[v0EL\u0018\u0014\\a\u007fA\u0012 9\n]'bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "Ag^B_+\u001bS\u0004\f\u0005\\,\u000b\u0017/d", "/o_9\\*:b\u001d\t\u0004>?\u0001\u0018\u0013n\u00012", "0tX9W\fOS\"\u000edk\u0015\r\u00106", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9\rV8GU]\u001e`au,\u0018\u001aZ\u001c]'\u0015\u0010/", "\u0013uT;g\u001eBb\u001cm~f,\u000b\u0018+m\u000b", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ExitReasonProcessor {
    private final Context context;
    private final ExitReasonConverter exitReasonEventConvertor;
    private final DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource;
    private final boolean isAnrReportingEnabled;
    private final boolean isNativeCrashReportingEnabled;
    private final MetricsRepository metricsRepository;
    private final long retentionTime;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4\u0012}\u000fnjG9LeN.ZS8\u0015sڔ<$i0yّA٨ \u0014̝9O|f(\u0004Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FqE7[t\u0006@n~N\u0005N3hهzM\b(5`\u0010%}\nƾ\rZKN|RR;˟5 \u0018\u0006L \u0019\u001e\u000bh~<Nlk<G#1l\tľ&(A\u000bZ%F\u00035=|o-CBM4C$\u001aϟ\b\u001bbM\u0013Wqk\u0016/Ҿ&sP\u0002iNX.'[ܗN]l\u0001&t\u0005\u007faВ+1WҪcR\u0014.\u0006\u0002L\u001cJ\u0006&\u0006UKͶ1 nڜ&5zzaIй\u0006r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9\rV8GU]\u001e`au,\u0018\u001aZ\u001c]'\u0015\u0010/", "", "3uT;g", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "Bh\\2f;:[$", "", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV{Z8", "5dc\u0012i,Gb", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc!\\4>a(z\u0003i", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class EventWithTimestamp {
        private final JSONObject event;
        private final long timestamp;

        public EventWithTimestamp(JSONObject event, long j2) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
            this.timestamp = j2;
        }

        public static /* synthetic */ EventWithTimestamp copy$default(EventWithTimestamp eventWithTimestamp, JSONObject jSONObject, long j2, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                jSONObject = eventWithTimestamp.event;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                j2 = eventWithTimestamp.timestamp;
            }
            return eventWithTimestamp.copy(jSONObject, j2);
        }

        public final JSONObject component1() {
            return this.event;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final EventWithTimestamp copy(JSONObject event, long j2) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new EventWithTimestamp(event, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventWithTimestamp)) {
                return false;
            }
            EventWithTimestamp eventWithTimestamp = (EventWithTimestamp) obj;
            return Intrinsics.areEqual(this.event, eventWithTimestamp.event) && this.timestamp == eventWithTimestamp.timestamp;
        }

        public final JSONObject getEvent() {
            return this.event;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return (this.event.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "EventWithTimestamp(event=" + this.event + ", timestamp=" + this.timestamp + ')';
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.exitreason.ExitReasonProcessor$processExitReasons$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExitReasonProcessor.this.processExitReasons(null, null, this);
        }
    }

    public ExitReasonProcessor(ExitReasonConverter exitReasonEventConvertor, DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource, TimeProvider timeProvider, long j2, Context context, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(exitReasonEventConvertor, "exitReasonEventConvertor");
        Intrinsics.checkNotNullParameter(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.exitReasonEventConvertor = exitReasonEventConvertor;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.timeProvider = timeProvider;
        this.retentionTime = j2;
        this.context = context;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.isNativeCrashReportingEnabled = z2;
        this.isAnrReportingEnabled = z3;
    }

    private final EventWithTimestamp buildEventOrNull(ApplicationExitInfo applicationExitInfo) {
        int reason = applicationExitInfo.getReason();
        JSONObject jSONObjectConvertAnr = reason != 5 ? reason != 6 ? null : this.exitReasonEventConvertor.convertAnr(applicationExitInfo) : this.exitReasonEventConvertor.convertNativeCrash(applicationExitInfo);
        if (jSONObjectConvertAnr != null) {
            return new EventWithTimestamp(jSONObjectConvertAnr, applicationExitInfo.getTimestamp());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processExitReasons(java.util.List<android.app.ApplicationExitInfo> r22, com.dynatrace.agent.storage.preference.MetricsData r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.exitreason.ExitReasonProcessor.processExitReasons(java.util.List, com.dynatrace.agent.storage.preference.MetricsData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean shouldBeProcessed(ApplicationExitInfo applicationExitInfo) {
        int reason = applicationExitInfo.getReason();
        if (reason == 5) {
            return this.isNativeCrashReportingEnabled;
        }
        if (reason != 6) {
            return false;
        }
        return this.isAnrReportingEnabled;
    }

    public final Object process(Continuation<? super Unit> continuation) throws Throwable {
        MetricsData metricsFromPreviousSession = this.metricsRepository.getMetricsFromPreviousSession();
        if (metricsFromPreviousSession == null) {
            Utility.devLog(C1561oA.ud("6EH\"B.>?\u001d=77", (short) (OY.Xd() ^ 24341)), C1561oA.yd("0>?\u000eLZM\neYi_iY\u0011UQAPFzN>JVZYOQK\u0001Fx\u0004npwqm*y}xw\t\bv2ve\u001dbj\u001cgi{(mgyi!o\u0014$\u001f\u0017\u000e\u001fH\u0010)'\"U#&\u0016(\b\u000f\u0012\u0011:\u000f}\r\u001a\u0011\u0014\u0014", (short) (Od.Xd() ^ (-8317))));
            return Unit.INSTANCE;
        }
        boolean zIsGrailEventsCanBeCaptured = this.sessionInformationProvider.collectSessionInfo().isGrailEventsCanBeCaptured();
        boolean z2 = (this.isNativeCrashReportingEnabled || this.isAnrReportingEnabled) && zIsGrailEventsCanBeCaptured;
        Context context = this.context;
        String strYd = C1561oA.Yd(">ASIWKW]", (short) (C1499aX.Xd() ^ (-27197)));
        short sXd = (short) (ZN.Xd() ^ 23513);
        short sXd2 = (short) (ZN.Xd() ^ 4554);
        int[] iArr = new int["=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif".length()];
        QB qb = new QB("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = {strYd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("\u001ck~q\u001f[\u001c\"Qo\u001cE\u0015\u001b\u001f6", (short) (C1607wl.Xd() ^ 11874), (short) (C1607wl.Xd() ^ 1040)), Class.forName(Jg.Wd("B\u0019xv\u000e_?\u001f#,\\p9C\u0013\u001f", (short) (C1580rY.Xd() ^ (-7385)), (short) (C1580rY.Xd() ^ (-8802)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            short sXd3 = (short) (Od.Xd() ^ (-23970));
            short sXd4 = (short) (Od.Xd() ^ (-19631));
            int[] iArr2 = new int["~\u007f\u007f\u0004\u000fp'bWX.`Cva\u000fk\u007f[\u001f\u0003\u000fuv@\u001e/7@ks%\u0004/f| MMhf0IWC\"'\u001b_\u0002q0Oq\t\u0007Z\u0017+6y\b&\u0011".length()];
            QB qb2 = new QB("~\u007f\u007f\u0004\u000fp'bWX.`Cva\u000fk\u007f[\u001f\u0003\u000fuv@\u001e/7@ks%\u0004/f| MMhf0IWC\"'\u001b_\u0002q0Oq\t\u0007Z\u0017+6y\b&\u0011");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            Intrinsics.checkNotNull(objInvoke, new String(iArr2, 0, i3));
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) objInvoke).getHistoricalProcessExitReasons(null, 0, 0);
            Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, Ig.wd("?\u0012-\"Q~m^\u0003+%G\u0004[04\u007fe9\u0003\u0016\u000f(1$e\u0001jb\u0011D\"\nmt'", (short) (C1580rY.Xd() ^ (-8032))));
            boolean zIsEmpty = historicalProcessExitReasons.isEmpty();
            String strOd = EO.Od("\u000bm?r\u0012UC\u0011Cuf\u0003UUF", (short) (C1580rY.Xd() ^ (-10993)));
            if (zIsEmpty) {
                Utility.devLog(strOd, C1561oA.Qd("\u0004vr~p*jzl&ss#gyis\u001eoa\\mhfj", (short) (ZN.Xd() ^ 27297)));
                return Unit.INSTANCE;
            }
            if (!z2) {
                Utility.devLog(strOd, Wg.Zd("\u0004+WF\"0N+4(cy!\u0011sX\"\u0011Lc4\u0007#P\t\f7NleG.kv\u000f1SMvSNRz\u001aFEaW?KO\u0003/&\\k\u00034L~\rx5`\u001a&HV}\u007f}`u\u007f*<]?", (short) (C1607wl.Xd() ^ 13867), (short) (C1607wl.Xd() ^ 15654)) + this.isNativeCrashReportingEnabled + C1561oA.Xd("~s>I\u0018FK,@LLPSIOI(RFHSMM'", (short) (Od.Xd() ^ (-7631))) + this.isAnrReportingEnabled + Wg.vd("+ipEuejn<nZdoo<[]2R1TdegYMI#", (short) (Od.Xd() ^ (-14064))) + zIsGrailEventsCanBeCaptured);
                Object objSaveCrashTimestamp = this.exitReasonTimestampDataSource.saveCrashTimestamp(this.timeProvider.millisSinceEpoch(), continuation);
                return objSaveCrashTimestamp == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveCrashTimestamp : Unit.INSTANCE;
            }
            if (metricsFromPreviousSession.getSessionActive() && metricsFromPreviousSession.getCrashReportingOptIn()) {
                Utility.devLog(strOd, C1593ug.zd("{}k}\u0001-~\u0002\u007ftw\u0007\b~\u0005~8~\u0013\u0005\u0011=\u0011\u0005\u0002\u0015\u0012\u0012\u0018", (short) (OY.Xd() ^ 2136), (short) (OY.Xd() ^ 7745)));
                Object objProcessExitReasons = processExitReasons(historicalProcessExitReasons, metricsFromPreviousSession, continuation);
                return objProcessExitReasons == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objProcessExitReasons : Unit.INSTANCE;
            }
            Utility.devLog(strOd, C1561oA.od("2>Aa\r[]\nWI[O[I\u0003ESARFBOz;K=vDDHrD6@>@A1/i+-*':7(a12$4&+0-X+\u001c)(\u001d\" P#\u0017\u001d\"\u0018\u000fI\u0017\u0017\u001bE\b\u0005\u0013\u0016\u0016\u0012\u0004=\u0006\u0010T9\f|\n\t}\u0003\u0001Rs\u0004w\u0004qH", (short) (C1607wl.Xd() ^ 6117)) + metricsFromPreviousSession.getSessionActive() + C1561oA.Kd("/$hxh{q\\p||\u0001\u0004y\u007fyb\u0005\n_\u0006U", (short) (C1633zX.Xd() ^ (-5998))) + metricsFromPreviousSession.getCrashReportingOptIn());
            Object objSaveCrashTimestamp2 = this.exitReasonTimestampDataSource.saveCrashTimestamp(this.timeProvider.millisSinceEpoch(), continuation);
            return objSaveCrashTimestamp2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveCrashTimestamp2 : Unit.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
