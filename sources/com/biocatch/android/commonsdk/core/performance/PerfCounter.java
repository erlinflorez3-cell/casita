package com.biocatch.android.commonsdk.core.performance;

import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fy\b<$i+yّCU(}*\tUO}˧\u001fJ\t\n\u0004*\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\nڶ6\"F\u007fM\r(5`\u0010%\u0007sO\u001a\u001fH@\u001fC\u001b\u0019[\u00132\u00124JP\u0005,i\u007fNdQ=uH6;\u000fyD^'\u000e9\rO\u001dF\u00031;~8ӟ-Ë;5\u001dǬ$\u000f\u0015Vs?1DHܸ\u0007ص+'3ɞDcDX\u0018\u0014C,&\u0558_ę*\\\rĩ1\u00185-gcySdߍyߡ\u007f\rDǉأ\n6"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_H", "", ">daA66N\\(~\b>5\f\u0016CF{&\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_RF#\u001fnnJ)\u001c\u000ffUy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ":nV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6s", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016wXCHl>+\u001ddj7\u0007-\u0017N\u0004(%V^5kR\u007f\u001d\u001d!g\"/'\u000b\u0014cN8D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyzo##2M2\u0014yO pUCcpF&\u0005<#\bkeNMy^Js-hR\u0006y\u00146avt[7\u0006\nm'", "1nd;g,Ka", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "", "", "AsP?g\nHc\"\u000ezk", "", "<`\\2", "As^=66N\\(~\b", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PerfCounter {
    private final ConcurrentHashMap<String, Long> counters;
    private final Log log;
    private final PerfCounterEntryFactory pertCounterEntryFactory;
    private final Utils utils;

    public PerfCounter(PerfCounterEntryFactory pertCounterEntryFactory, Utils utils, Log log) {
        Intrinsics.checkNotNullParameter(pertCounterEntryFactory, "pertCounterEntryFactory");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(log, "log");
        this.pertCounterEntryFactory = pertCounterEntryFactory;
        this.utils = utils;
        this.log = log;
        this.counters = new ConcurrentHashMap<>();
    }

    public final void startCounter(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Log.Companion.getLogger().debug("PerfCounter:startCounter " + name);
        this.counters.put(name, Long.valueOf(this.utils.currentTimeMillis()));
    }

    public final void stopCounter(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Log.Companion.getLogger().debug("PerfCounter:stopCounter " + name);
        Long lRemove = this.counters.remove(name);
        if (lRemove != null) {
            try {
                this.log.logPerfCounter(this.pertCounterEntryFactory.getPerfCounterEntry(name, this.utils.currentTimeMillis() - lRemove.longValue()));
            } catch (JSONException e2) {
                Log.Companion.getLogger().error("Failed create a PerfCounterEntry: ", e2);
            }
        }
    }
}
