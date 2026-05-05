package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0LeN5ZS8\u0018s{:$c$\u007fIC٥\"}0\u0015WȞm˨t`ҙ;C=\u0005V\u001cz@WU\u0011m\"\u0011BB\u001eAaNXCIb\u000563\"\u0011%H}\u0013\u00052*v\u0015ͯ~CY\u0012ZGN{Rb\u001dO\u0015\u001a@\bl!i$li^6vn<=uޑ\u00042I\\3w0+RSцUo8\u0005n6+nʺe++S\u0011\u0007jkO\u0005Oqk\u0007\u0017(\u00101Yug6\u0007\u0002r\u0018[U\u0013]\u0001*t\u0005\u007feR˳*\u0018tY^&(&\n,\u0013J\u0014&\b=G\\,`Ȩ\tV:\u0003\u0004k@~\u0014%ܤ~ChD*=\u007fa?\u007fԬe\"\u0006I\u0019fG\f\u0007\u001d\u001eQ\u0003\u001d\"DZ\u001eb%\u001b\u0003y04\bD\u0014ʸP̆]CuՎ\td\b1\u00128\u0018\u0014=\u007f).E*m_\u0010\u0602#Ƞ\u0006NLϙ\u000f\u0007fqasʖLU"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.y\u0010\u001c\b%>h\\\u001cFik", "", "3uT;g:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.y\u0010\u001c\b%>hS", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "AsPAf0@;\u0019\u000ev](\f\u0005", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOV}\u0015QwWJ\u0006!Dg\u0002\"\u0001i\u001f-ZM?jB\u001d\u001b2OH\u0003r:Rx\u000fG[J+Xan\u0013W\u0003", "5dc\u0012i,Gb'", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "5dc g(Ma\u001d\u0001b^;x\b+t{", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kr4C]\u007f\b7|\u0012-IR7A", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class LogEventData {

    @SerializedName(alternate = {}, value = "\f\u001c\n\u0012\u0017\u0015")
    @InterfaceC1492Gx
    private final ArrayList<LogEvent> events;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0016\u000b\bl\u0004\u0012}\u007f{\u000ey")
    @InterfaceC1492Gx
    private final StatsigMetadata statsigMetadata;

    public LogEventData(ArrayList<LogEvent> events, StatsigMetadata statsigMetadata) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(statsigMetadata, "statsigMetadata");
        this.events = events;
        this.statsigMetadata = statsigMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogEventData copy$default(LogEventData logEventData, ArrayList arrayList, StatsigMetadata statsigMetadata, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            arrayList = logEventData.events;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            statsigMetadata = logEventData.statsigMetadata;
        }
        return logEventData.copy(arrayList, statsigMetadata);
    }

    public final ArrayList<LogEvent> component1() {
        return this.events;
    }

    public final StatsigMetadata component2() {
        return this.statsigMetadata;
    }

    public final LogEventData copy(ArrayList<LogEvent> events, StatsigMetadata statsigMetadata) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(statsigMetadata, "statsigMetadata");
        return new LogEventData(events, statsigMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventData)) {
            return false;
        }
        LogEventData logEventData = (LogEventData) obj;
        return Intrinsics.areEqual(this.events, logEventData.events) && Intrinsics.areEqual(this.statsigMetadata, logEventData.statsigMetadata);
    }

    public final ArrayList<LogEvent> getEvents() {
        return this.events;
    }

    public final StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public int hashCode() {
        return (this.events.hashCode() * 31) + this.statsigMetadata.hashCode();
    }

    public String toString() {
        return "LogEventData(events=" + this.events + ", statsigMetadata=" + this.statsigMetadata + ')';
    }
}
