package com.dynatrace.agent.communication.preprocessing;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.RetryManager;
import com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapper;
import com.dynatrace.agent.communication.network.datasource.DataRequest;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.hS2şs{J$cҕyCI[\"}(\tUȞ}˧\u001fJ\t\n\u0004$\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6ޜs??d\u0003;MC@(Py3\bJ.V\u0018\u000fzqT<\u0016>J\t:\u0001\u0018}\u000b(\u001e\u001e@6\u007fLiʄR6Vz.F=#\u001bipO}ۂ2ƊQ\rNÖw\u0019\u0005c6+n:\fՙ'٨\u0007\u0007Z¹ϓ\u0007N"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PR6-r6C9N8lR\u0001L{\u000ee\u0019N8b", "", "@d`BX:M0#}\u000fF(\b\u0014/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001u\u00129XCH5\u0013\u001b\u0002h_C\u0014b:=\u0001\u0014GX^,jaOG\u0013&B\nY6\r\u0012/", "@dc?l\u0014:\\\u0015\u0001zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016=ZW#g=\u001a\u0017hn\u000f", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001e*XN;x}|\u0012Ua7\u0011p+\\e14LZ<\\`\u0002\u001a\u001e\u0011nuJ6\u0018\u0005f\u0017\u000blN?h\u0007@R}Ju|\n\u0016W1lpKeYE\u0004\u001d}Q2lDUn}QJ\u000fO*s\u0019s\u0005XC6&\u0014~n^Y", "4q^:", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp&H](IR~M\u0014 ic", "2hb=T;<V\u0015{\u0002^\u000bx\u0018+", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PB0\\\u0002#VJQ(YYr\u001c\u0010!Vc", "AdaCX9\u001dO(z", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "AdaCX9\"R", "", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7!;MNHu2\u001e#veB\t-\u000bR\u00052C[L/XOy=r\u000ei\n$\u0012\u000b\u000fa\u000b#\u0003M3.\u0015(G\u0002\u0005d\u0003\f\u001f\u001d~hzJ^ P}\u0013qP-rO#F\u0004E=LP*q\u001d_*;6I iX\u001e\u0017yLw\u0011w\\\u0013<6\u0003vgI\u0019\b\u000eg%keN\u000fniEp6,Gyw[.Zt4\u0004v\u0002>2>t\u000eOe\u0014Mb\u0003\u001eueA68@I\u0019\tJ_\u0005hL\u0018x,_\bWA1@\u0015ReoX\u000f\u0015ll", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ToDataRequestMapper {
    private final DbRecordsToRequestBodyMapper requestBodyMapper;
    private final RetryManager retryManager;

    public ToDataRequestMapper(DbRecordsToRequestBodyMapper requestBodyMapper, RetryManager retryManager) {
        Intrinsics.checkNotNullParameter(requestBodyMapper, "requestBodyMapper");
        Intrinsics.checkNotNullParameter(retryManager, "retryManager");
        this.requestBodyMapper = requestBodyMapper;
        this.retryManager = retryManager;
    }

    public final DataRequest from(DispatchableData dispatchableData, LocalServerData serverData, Integer num) {
        Intrinsics.checkNotNullParameter(dispatchableData, "dispatchableData");
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new DataRequest(dispatchableData.getEndPoint(), this.requestBodyMapper.map(dispatchableData.getData()), dispatchableData.isPriorityData(), serverData, this.retryManager.get(dispatchableData.getEndPoint()), num);
    }
}
