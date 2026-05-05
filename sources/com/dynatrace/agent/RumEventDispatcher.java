package com.dynatrace.agent;

import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.storage.preference.MetricsData;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u0007njG0L͜P.hS2şs{J$c$wCCU(\r*\tUQog|Qb\u000bI\u0011\u000e\u0016\u000fj4կ[Ws܈?2pn\bA[oU9\u000fuf\t.4:8(\bG>rV\u001ez\u0013Cy\rB4NrRR;PK>Z\u001cL%\u0019\u001e\u000bm~:Vsu:]+3mPW?_^\u0007\u00141\u000f\u00025\u0018\u000faL1p;C\u001c=S1\u000f\u0003_M\fWqk\u000f\u0019557a}g:h\u0002*\u0014YN#\\!3#)Ōd\f59\u0018\u0019Y[&(&\u0001,\u0011J\u000b&\u0006UP^1(u \u000ea|#WNY\u001a^p\n+oD#=\nC/I\u001d|P\u0010:/Me\tK1̷'\u0001|1$\u001a\u001cq-\u001b\u0003}\u00025_GUH|\u0012\nA{\u0016\tb0=44U\u0014G{?AG)EdQ#Ou2LR|\u000f\u0005\u000fi\u0004w`TX,~\u001aG,\u001f\u000b\tCz\u0004\u001a]\u001b|¯\u0015M*jO+\u0016$8\\&BQ)\u001eUgh\u0018r}a\u0018.Gfec\u001fy\u001ccQhC9ae&`\u0001u*>joK|ڋFS\u001ah%N0C`j>},H\\\u0013+2myL8:C1\\C[3\"PJ\u0015\t\u000ed\u0019\u0014\rkK$1\u0002j\u0019\u0590\u0005i"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "", "/cS\u0012i,Gb\u0001\tyb-\u0001\t<", "", "3uT;g\u0014HR\u001d\u007f~^9", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\bAl\u001a/QCHA", "@d\\<i,\u001ed\u0019\b\nF6{\r0i\u007f5", "2hb=T;<V\u0007~\tl0\u0007\u0012\u001ar\n3{M\u0010\u001b\u0017Ua\u0012Ky\u00125g\r-;k%2WLI", "", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0010{O\u000e\u001b\u0015U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u00135g\f$Avy7NMHs0-\u0019rj!\u0007r9Rt5\u001d", "2hb=T;<Vx\u0010zg;n\r>hl(\nO\u000e\u001b\u0015Vs\u0018E\u0005", "3uT;g\nH\\(~\u000em", "", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0015QwW;\u000b.1h\u000b\u001c5m_*OCDz}&\u0015wn=\u0005qu<v5UPX5@[sG!\u001aV\u001dR5\u0016lYP1rBEt}\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj92", "/fT;g\u0011L]\"", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\n\u0005\u0013ri\u0003\u0006w5J\u00064CJNuXTrF#[b\u000e]8\u0011\u0003g\u000b\u0012nRE#\u00125-\u000b<r\u000e\u0014\u0012\u001d9ty*V\u001fT}\u0013\u0004\u0017\u001fOKUpu\u0011HAk,.u\\\"\\8IyWb", "2hb=T;<Vx\u0010zg;", "AsP?g\u001bB[\u0019\r\nZ4\b", "", "2ta.g0H\\", "7r0=\\\u0019>^#\f\n^+", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV{{.m\u0018D@$Iby/Di\u0014.\u0017?=k=-^paH\u0014g*\\@\u0015GZ\\0f[VF\u0015\u001cg\u0016J:\u0011\u000fb)$}Q;\u001d\u0016\u0002>w\"m|\u001d\u0012W<fyD yD~\u0015sP~,7", ";dc?\\*L2\u0015\u000ev", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface RumEventDispatcher {
    boolean addEventModifier(EventModifier eventModifier);

    void dispatchEvent(JSONObject jSONObject, long j2, long j3, SessionInformationMetrics sessionInformationMetrics, boolean z2, Object[] objArr);

    void dispatchEvent(JSONObject jSONObject, long j2, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData);

    void dispatchEvent(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchEventWithRestrictions(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchEventWithRestrictions(JSONObject jSONObject, JSONObject jSONObject2, SessionInformationMetrics sessionInformationMetrics, Object[] objArr);

    void dispatchSessionPropertiesWithRestrictions(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics);

    boolean removeEventModifier(EventModifier eventModifier);
}
