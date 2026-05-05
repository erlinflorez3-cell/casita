package com.dynatrace.agent.lifecycle.model;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4\u0012}\u000fnjG9LeN.ZS8\u0015sڔ<$i0yّA٦ \u0014̝9O|f(\u0004Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FqE7[t\u0006@n~N\u0005N3hهzM\b(5`\u0010%}\nƾ\rZKN|RR;˟5 \u0018\u0006L \u0019\u001e\u000bh~<Nlk<G#1l\tľ&(A\u000bZ%F\u00035=|o-CBM4C$\u001aϟ\b\u001bbM\u0013Wqk\u0016/Ҿ&sP\u0002iNX.'[ܗN]l\u0001&t\u0005\u007faВ+1WҪcR\u0014.\u0006\u0002L\u001cJ\u0006&\u0006UKͶ1 nڜ&5zzaIй\u0006r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:Nh+VO=0dV{?i", "", ">gP@X", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:NL", "AsP?g", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u001e\u001bHo\fPt,5#\u0006*6m\u001dw)NFYC\u001a\"wqDqf(\\v|,\u0010?", "5dc\u001d[(LS", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u001eKp\u000e:\u000b#<YG(Al\u00165\u0017\u001fFv\"-\u0011upI\u0012N/J\u0005'\u001d", "5dc g(Kb", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AppStartupPhaseWithTiming {
    private final AppStartupPhase phase;
    private final long start;

    public AppStartupPhaseWithTiming(AppStartupPhase phase, long j2) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        this.phase = phase;
        this.start = j2;
    }

    public static /* synthetic */ AppStartupPhaseWithTiming copy$default(AppStartupPhaseWithTiming appStartupPhaseWithTiming, AppStartupPhase appStartupPhase, long j2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            appStartupPhase = appStartupPhaseWithTiming.phase;
        }
        if ((i2 & 2) != 0) {
            j2 = appStartupPhaseWithTiming.start;
        }
        return appStartupPhaseWithTiming.copy(appStartupPhase, j2);
    }

    public final AppStartupPhase component1() {
        return this.phase;
    }

    public final long component2() {
        return this.start;
    }

    public final AppStartupPhaseWithTiming copy(AppStartupPhase phase, long j2) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        return new AppStartupPhaseWithTiming(phase, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStartupPhaseWithTiming)) {
            return false;
        }
        AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) obj;
        return this.phase == appStartupPhaseWithTiming.phase && this.start == appStartupPhaseWithTiming.start;
    }

    public final AppStartupPhase getPhase() {
        return this.phase;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.phase.hashCode() * 31) + Long.hashCode(this.start);
    }

    public String toString() {
        return "AppStartupPhaseWithTiming(phase=" + this.phase + ", start=" + this.start + ')';
    }
}
