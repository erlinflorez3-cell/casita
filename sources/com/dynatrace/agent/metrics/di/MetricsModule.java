package com.dynatrace.agent.metrics.di;

import android.content.Context;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.OneAgentMetricsProvider;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{J$c$wCA٥0ԂR\t}M(\r~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015\u001f6PsW3{tM=nzN\u0005N9ŕ<{\u000b\t(3\u0011\u001b\u0005\u0005[K:\u001dvϋ¤>R\u0013YU& \u0006V /\u001f3ɤPɇLleŽ\u007f/\u0011kZNUb\u0007ŪOϘJT/˙Gm,/X7c\u001a{و\u0005\u07baV[Gš\u0010}K\u000b\u0001'U2 ֘Y͏\\\u007f\u001cƃ۩S\u001a"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@$9#e Fz\u001a,[+EjD%\u0015>", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AdR<a+ S\"lzk=\u0001\u0007/L\n&wO\u000b$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\fF\u007f$\u0017Y\u0007\u000e7z'2KC\"u2\u001a$rn\u000f", ";dc?\\*L2\u0015\u000evL6\r\u0016-e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u000bq2-r6C:X<iPr\u0013", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~X\u0012)3|#*KC\u0005g6\u001e\u001ew+8\u000b-\u001aNt1PK0,e@rJ%\u0016X\u000e55\u000b\u0001hK1D+5)\u0010uH\u0016Dd\u0010\u0019\u0012\f54lDV\u0019VC#\u0005K6dHY)\u0005TAFb7d\u0015]\u001d&\":3!u\u0017)GT<\u0010ZO n@\u0004wtE\u0019P\u001f*H|bJN\u0003\u001f:~4)[\u000b{\u001b2f>\t~:\u000eD9:m\u00059e\"I^NX\u001d", ">q^C\\+>;\u0019\u000e\bb*\u000bu/p\n6\u007fO\u000b$+", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", ">q^C\\+>;\u0019\u000e\bb*\u000bu/p\n6\u007fO\u000b$+\u0006m\u0018Dp$Iby/Di\u0014.G?=k=-\u000fua@\u0007_:N", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MetricsModule {
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final MetricsDiskDataSource metricsDataSource;
    private final SecondGenServiceLocator secondGenServiceLocator;

    public MetricsModule(Context context, SecondGenServiceLocator secondGenServiceLocator, MetricsDiskDataSource metricsDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(secondGenServiceLocator, "secondGenServiceLocator");
        Intrinsics.checkNotNullParameter(metricsDataSource, "metricsDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.context = context;
        this.secondGenServiceLocator = secondGenServiceLocator;
        this.metricsDataSource = metricsDataSource;
        this.coroutineScope = coroutineScope;
    }

    public final MetricsRepository provideMetricsRepository$com_dynatrace_agent_release() {
        return new MetricsRepository(this.metricsDataSource, this.secondGenServiceLocator.locateSessionInformationProvider(), new OneAgentMetricsProvider(new NetworkConnectivityCheckerImpl(this.context, this.coroutineScope), this.context, null, 4, null), this.secondGenServiceLocator.locateMetricsProvider(), 0L, this.coroutineScope, 16, null);
    }
}
