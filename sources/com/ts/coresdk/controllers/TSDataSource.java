package com.ts.coresdk.controllers;

import com.ts.coresdk.ITSModuleInfo;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDZc|İI\u0006>\u000b6B\u0005\"4\u0012\u0006%nj?1LeV7ZS0\u0010s{B*c$wCCU(Ԃ*ޛU4}˧\u0017L`ŏQ 6\u0016'ztfc{u\u0012=4rsM2eosʠ\u0011xD\u000682P8@)в\u001e,N\u0013\u0005~\fn\u001a\u0015H@\u001f<\u0003\u0017[\u00042\u0018\u0016@0\u0001Tձ\u0016SfLz^R/Q\u00030fĚ+a6\u007f[\u0013\u000fo5\u0014\u000fg.-P7kՖSX3\u000b`ZW\u0003mq\u0004*ص+)1P\u0002_~m\u000e\u001e-+}\u0016\u000ev4[\u001dQ\u000f\fmOյgMV\u00186\u0003C\u0011\u001bH\u001c\u000e40x2;\u0019~\b<3;\u0017ՂDR\bjP\u000bCvD%=\u007fa8i\u001ftPy;GN} ˿\u0011 )\u000f|0"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%w&;KC\u0011", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "", "/cS\u0011T;:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`V}W:\u000125g|&\u0001Q\u0005\u001c5M:{;\u001exqbC\\'\u001d", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f&\u0006HJ&%\u0011m\u0018Iv34_G\u0004&[}8LSBk\u0018'\u0016r7|w", "4dc0[\bGR\u0006~\u0003h=|", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b\u001dd%3~\u0012w]R?r}\u0005\u0019vp\u000f", "", "7r4:c;R", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b\u001dr", "7r=<g\fF^(\u0013", "", "Ahi2", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b\u001da", "", "\""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface TSDataSource<T> {
    void addData(T t2, ITSModuleInfo iTSModuleInfo);

    void addData(List<? extends T> list, ITSModuleInfo iTSModuleInfo);

    List<T> fetchAndRemove(ITSModuleInfo iTSModuleInfo);

    boolean isEmpty(ITSModuleInfo iTSModuleInfo);

    boolean isNotEmpty(ITSModuleInfo iTSModuleInfo);

    int size(ITSModuleInfo iTSModuleInfo);
}
