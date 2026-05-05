package com.dynatrace.agent.exitreason.di;

import android.content.Context;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.exitreason.convertor.ExitReasonConverter;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tqAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog|Sb\u000bI\u0011\u000e\u0016\u000fj4I[xc܈%˰rom2\u000e?M=ntN\u0005N32<\b\u0007\u0019\u001aXK |\u0001CY\u0010*0nuJV\u001bS\u001d\u001a@\rN$\u000f&tg|?XpkDG#1tRR5kH|{\u001aVX5\u001b\u000faL:P;C%=S1\u0016қ_A\tP\u007fOMs5:CI\"k|ݙÿ\u0018\u00151d]i\u0001&t\u0005\u007fabʯ-յgKXʫx\u0004\t}%<2\u0011\\άJͶ1\u001anڜ^?\u0003vk@~\u00075ې\u0002ѐe6\u001fӛP?9?3f\u007fh\u0012ύPѼ\u007f\u0005\u0015̔s\r|)sT<ikÔVɐU1Y̵\u000eT\\\u0014q=\u001c\u000fGê\u0004ò\b0Oĉ\u007f\b\u001f:/%eh\u0010\u05fd#Ƞ\u0006HLϙG\u0011nvki\u0001W\u0017̑pގ;*\u0011ȱ+Pr\u0015\u0004P\u0003g\u0003ҍOɟX\u0007\u0006ܱ˟$r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#|$\u0001M)2\\0;gB(\u001ePk8\u0017j,$", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "@dc2a;B]\"m~f,", "", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", ";dc?\\*L@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "3wXAE,:a#\bib4|\u0017>a\b3Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001agC\u001a\u0003wkF\u0007C?R\u0006\u0014GH\\6eAvE\u0014 i\nV6k\u0001h=\u0012xTD\u001d\b\u0002", "7r=.g0OSv\fvl/i\t:o\r7\u007fI\u0003v Cl\u0015<u", "", "7r0;e\u0019>^#\f\nb5~h8a|/{?", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~X\u0012)3|#*KC\u0005g6\u001e\u001ew+7\u0011k4X\u007fpVPV,&AvE\u0014|g\u0018_/\f\u0005f\u0017\tUBA'Q+]\u000b7w\u000e\b\u0014\u000e~frB_\u001f\u0011f%}!:hOh>}ULAq(g\flrC8D,]p-$d_;\u0006ySZnTypv\u0011\u0018~\u0002\u0012>{iJOx9Eu1,Sw\u0007\u0016<a_8~>\b3*C:kIq \b]\r\u001e(kN#$6\u0006\u000fAKl\u00056F\u000ew,e\u0006\u001c,\u001d1(riaV{\u0007h!i9pi\u000eK(l<Sw^&Z\b>j\u0007\u0011\u0007\u0007migIL*\u001e\u000f)zQ\u001ea\u0011L\u000es\u0018\u001d.#=b\rhs>3\\\u000fvwB\u0019{9V\u0019\u007f5\u0010iY|dFs,6\u0007 E)>*8\u0006N1y #2\u0001`s\u00127Z", ">q^C\\+>3,\u0003\nK,x\u00179nj5\u0006>\u0001%%Q|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9$", ">q^C\\+>3,\u0003\nK,x\u00179nj5\u0006>\u0001%%Q|L:\u0001-/X\u0012)3|#*KC5g6\u001e\u001ew[F\u0007j,J\u0005'", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ExitReasonModule {
    private final Context context;
    private final DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource;
    private final boolean isAnrReportingEnabled;
    private final boolean isNativeCrashReportingEnabled;
    private final MetricsRepository metricsRepository;
    private final long retentionTime;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public ExitReasonModule(Context context, TimeProvider timeProvider, long j2, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        Intrinsics.checkNotNullParameter(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        this.context = context;
        this.timeProvider = timeProvider;
        this.retentionTime = j2;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.isNativeCrashReportingEnabled = z2;
        this.isAnrReportingEnabled = z3;
    }

    public /* synthetic */ ExitReasonModule(Context context, TimeProvider timeProvider, long j2, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, DataStoreExitReasonTimestampDataSource dataStoreExitReasonTimestampDataSource, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, timeProvider, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? 540000L : j2, rumEventDispatcher, sessionInformationProvider, metricsRepository, dataStoreExitReasonTimestampDataSource, z2, z3);
    }

    public final ExitReasonProcessor provideExitReasonProcessor$com_dynatrace_agent_release() {
        return new ExitReasonProcessor(new ExitReasonConverter(), this.exitReasonTimestampDataSource, this.timeProvider, this.retentionTime, this.context, this.rumEventDispatcher, this.sessionInformationProvider, this.metricsRepository, this.isNativeCrashReportingEnabled, this.isAnrReportingEnabled);
    }
}
