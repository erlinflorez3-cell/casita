package com.dynatrace.agent.communication.api;

import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.hS2\u000fq{:\u0003qҕ\"CiTb\u001a0\tgN\u0016h\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0017U̗\u0001ņC3[u\u0006Mn{N\u0005N3R<\b\r\u0019\u001aXQVͳ9ŲO\f :ϴtE"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003J0\\\u0006'PL[\u0002", "", "=m2<a-BU)\fvm0\u0007\u0012\u001fp~$\u000b@", "", "/fT;g\u001aMO(~", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.N`\u0015\u000e~h5mW", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r\u0017m4'$Vp5\u0016c\u00025t1O\u0016M@eN\u0002J\u0010\u0010ZWJ-\r\u000eh\u000b2}ND\u001b\n,\u0013\rHh\u0002\f#\u000e>hp\fD\u0010T\u000b\u0015\u0003\u001f3qG]a\nT=Tf4m|.rC@D3\u001bu\"dfZ;\u0014\fb\u0015{R\b1EQ\"\n<-NijJOx+\u007f[,\u001b\\wA\u0019.avt^*\t4(E:", "=m2<a-BU)\fvm0\u0007\u0012 3o3z<\u0010\u0017", "1n]3\\.N`\u0015\u000e~h5mV", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0007!\u0001[\u0016;^CHI>'\u0016lcI\u0014_;R\u00010\u001d3T6kYvF]\u0010d\u001bX;\u001c\tbA28\"A(\u00170R\u00127w\u0005\u0016\u001fcxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface ServerDataListener {
    Object onConfigurationUpdate(AgentState agentState, ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation);

    Object onConfigurationV3Update(ServerConfiguration serverConfiguration, Continuation<? super Unit> continuation);
}
