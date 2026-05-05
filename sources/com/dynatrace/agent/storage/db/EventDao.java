package com.dynatrace.agent.storage.db;

import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njGNLeN/ZS8\u0016s{:+c$\bCC٥\"}0\u0012WȞog|Pb\u000bI\u0010\fu\u000f̓\\I\u0004w&&\u001d2Zom4}sK;xtd\bfݭ`أ}\u0005\u000f\u001erZ\u001e{\u0013I[\u000e\"0nshXṠCܨ\u0016\u0006L'I:jof6vm\u000e>=,\u001bipXWc>\be\rt^ḿ5Ґ\"+NC}!3`\u001b\u0007\u0001\\\u0006Ɖ}џA\u0005v.oEW\u0002o6\u0007\u0001D\u001f9^%c\u0003(l\u0005\u007fc:-qպ\"ׂT\u000e6\bC\u0016\u001bM\u001c\u000e4(x8;,~\u000e\u001e5\u0005r\u0002J~\b%۵>ѐe6%5HU9L3lacK\u0019|K*\u000b=\"1\u0016\u0007!\nj>d#2lw\u007fI\u0018͝{˓R\ngV6$~|\u001a0\u00142W\u007f]~?4G/EmQ)1m\u0012Hrq%\u000b'č\u0012ׂVHN2ë\u001aR"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIM\u0011", "", ">tc", "", "3uT;g\u0019>Q#\fy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007fHm\u001f=:C9uA\u001djOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "5dc\u000e_3", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "2d[2g,(c(}vm,{", "<nf", "", "@dc2a;B]\"m~f,", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "2d[2g,\u001aZ ", "2d[2g,", "3uT;g\u0019>Q#\fyl", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011m\u0018I\u00015D]\u0007 E7s8VR?tD\u001a$lkB\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "2d[2g,\u001bg|}", "@dR<e+\"R'", "4dc0[\fOS\"\u000eb^;x\b+t{", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u0016MR7j0-\u0011>", "7r??\\6KW(\u0013", "", ":h\\6g\u0019He'", "", "uY8\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "4dc0[\fOS\"\u000eg^*\u0007\u0016.B\u0014\fzN", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface EventDao {
    Object delete(List<EventRecord> list, Continuation<? super Unit> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteById(List<Long> list, Continuation<? super Unit> continuation);

    Object deleteOutdated(long j2, long j3, Continuation<? super Unit> continuation);

    Object fetchEventMetadata(boolean z2, int i2, Continuation<? super List<EventMetadata>> continuation);

    Object fetchEventRecordByIds(List<Long> list, Continuation<? super List<EventRecord>> continuation);

    Object getAll(Continuation<? super List<EventRecord>> continuation);

    Object put(EventRecord eventRecord, Continuation<? super Unit> continuation);
}
