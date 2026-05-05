package com.dynatrace.agent.events.enrichment;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0007\":0\u007f\u0007|jAӄJ͜^\u008c\u0003SX\u000e,\tD(i$\nCiV۟\u0002$\u000fQ\\j0zX`#I\u001f\b&x\u00194w\\?qb\u001e@B\b?aNڱA?hҚN\u0007&60=ѯ\t\n"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u00172?s4\u0006\u0015wn=\u0005q\u001a^\u00022NPN92", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9ts7Y}+GY$", ";dc?\\*L", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u00172?s4\u0006\u0015wn=\u0005q\u0002", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@%>f\u0002\u001e:u\u00167\\\r*o<\u001e|hpF\u000ba:$:\u0018", "5dc\u001aX;KW\u0017\r", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0017Xo\u0017K\u0005n5b\u000b$5p\u001e.VR\u0005Z8&\u0015PaH\u0014g*\\L", "At_=_@", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TimeMetricsSupplier implements AttributeSupplier {
    private final TimeMetrics metrics;

    public TimeMetricsSupplier(TimeMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    public final TimeMetrics getMetrics() {
        return this.metrics;
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        AttributeSupplierKt.addAttribute(listCreateListBuilder, EventKeys.START_TIME, Long.valueOf(this.metrics.getStartTime()));
        AttributeSupplierKt.addAttribute(listCreateListBuilder, "duration", Long.valueOf(Duration.m10324getInWholeMillisecondsimpl(this.metrics.m7120getDurationUwyO8pc())));
        return CollectionsKt.build(listCreateListBuilder);
    }
}
