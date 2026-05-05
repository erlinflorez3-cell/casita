package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<;\"&i\u0016DLc\u0003&I\u00066\r6B\r+4\u0012\u0006*nj?1\\%V\u008cjSp\u000e\f\u0003:ři$ڱG;[\u001b\u001e$\u000fN\\f\u0010|Z^\u0011B\u001f\u0006\\xz.YU?\\@\u0011bF}BKM6=id\u0003:\u001d x!~ю\u000bв\u001e*V\u0015\u000fAQQ$\u0012^G\u0011AX҈[\u0005ܨ\u0016\u0006D!!%bf\\5Ղp]@0K\u0013yFT&o0CM\u001dJZ&\u001dv(\u001dYHg9#(k\u0003MR\fC\u0011H\n=Kgmݘ1ʁwWDbą\u0018 "}, d2 = {"5dc\u001ce\u000b>T\u0015\u000f\u0002m", "$", "\u0019", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/i1\u0003Td \"W~|P\u0002%C/", "", "9dh", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "@d\\<i,", "", "", "D`[BX", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u001c", "9nc9\\5\u0006a(}\u0002b)D\u000e.kR"}, k = 2, mv = {1, 9, 0}, pn = "\u0003U^{\u001at\u0006\u001dlzr\u0010]re\u0013gT", xi = 48, xs = "")
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k2, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k2, v2);
    }

    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k2, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return TypeIntrinsics.asMutableMap(map).remove(k2, v2);
    }
}
