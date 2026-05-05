package com.dynatrace.agent.userinteraction.model;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.`q2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJp\u000bKƤ\fǝ\u000f̓\\I\u0004w\u001e'\u001f6PoW3{pM=nvN\u0005N5ŕ<{\u000b\u0005(/\u00118\u0005\u0001[M\"\u0011^G!D`\u0015e\u000b*\u0014\u0016>N\u000bLe\u0018RDS\u0005]h;S\twOf)u/+[SZ\u001dG\u001b\u0006y A?e<E/a\u000b\u001fXkA\u0013? G3qW-9Y\fYLW.%[? \u0019kr>\\3R7ϲ)˦ScSִ^4\u0006|\u0014\rj\u0007dͽ)ρ2-\"Ǒۅ\u0012E"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dsZ\u0017N8\t\u0014cN\bvO>t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dsZ\u0017N8\t\u0014cNy", "<`c6i, S\"~\bZ;\u0007\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dzV\u001dR<\rfYJ${@F)\u0015\u0002", "1n\\=b:>5\u0019\bzk(\f\u0013<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dod\u0016Y5\u001b\u0005;A-nQ3.\u00129\u001f", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ'%G|\u0012E\u0006%BU{/;w\u001fwUM:k;g\u0004rq7\nS:N\u0004\u000bP[N9XP\u0002A\u001e\u001bC\n]/\u001e\u0005;A-nQ3.\u00129\u001fh9r\tU\u0015\">f\u007fOR\u000eGC\u0011wA2w\u0010imyTENq*q\b],`DCm\u001c{\u0018\u001bo\u001a\u001d\u0014\fQ\u0014b`ytKP(zE <|_PNM_D\u007f1-K]w\u001b2ep:~:Yw\u001b", "5d]2e(MS\u0002z\nb=|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", "Bnd0[\u0013Ba(", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "7mc2e(<b\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5d]2e(MSv\t\u0003i6\u000b\t", "1n\\=b:>6\u001d\u000eZo,\u0006\u0018", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}{\u001fplC\u0015c\u000fR\u0006\u0007XLW;2", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionGeneratorImpl implements TouchUserInteractionGenerator {
    private final TouchUserInteractionComposeGenerator composeGenerator;
    private final TouchUserInteractionNativeGenerator nativeGenerator;

    public TouchUserInteractionGeneratorImpl(TouchUserInteractionNativeGenerator nativeGenerator, TouchUserInteractionComposeGenerator composeGenerator) {
        Intrinsics.checkNotNullParameter(nativeGenerator, "nativeGenerator");
        Intrinsics.checkNotNullParameter(composeGenerator, "composeGenerator");
        this.nativeGenerator = nativeGenerator;
        this.composeGenerator = composeGenerator;
    }

    @Override // com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator
    public TouchUserInteraction generateCompose(List<TouchEvent> touchList, ComposeHitEvent composeHitEvent) {
        Intrinsics.checkNotNullParameter(touchList, "touchList");
        return this.composeGenerator.generate$com_dynatrace_agent_release(touchList, composeHitEvent);
    }

    @Override // com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator
    public TouchUserInteraction generateNative(List<TouchEvent> touchList, ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(touchList, "touchList");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        return this.nativeGenerator.generate$com_dynatrace_agent_release(touchList, rootView, view);
    }
}
