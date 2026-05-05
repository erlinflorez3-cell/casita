package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0011s{BBc$\bCC٥\"}0\u0012WNmgvJp\u000bK\u000f\f\u0017~IBկ\u0006x\f\u0011WVPoW3{pm=nvN\u0005N5R<\b\t\u0019\u001aXM@z\tIc\f@7\u0007¨xň\u0011M\u0013\"Z@L)\u0019\u001e\u000bh~:Vvu:]&3mPR?_^\u0002}\u0017T_?\u0013\u0007c.+nDc!UW\u0011\rj[m\nouK\u0013\u0001'U:\u0010ּ\u0016͏\\\u007f\"%s\\\u001bn\u000b&\u000b\u0017\u0018\u0005В+-UvYd˔,\r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016<XMDy4\t\"r_9\u0015q6[L", "", "6`]1_,\u001c]\"\u007f~`\u0019|\u0017:o\t6{", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "1n]3\\.+S'\n\u0005g:|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "B`a4X;\u001e\\\u0018\n\u0005b5\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "@dc?l\u0014:\\\u0015\u0001zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016=ZW#g=\u001a\u0017hn\u000f", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]\u0001s\u0003cImmX@\u001b\u00179E\u007f;2|\u000e\u0016\u0017D4~Q`\u001dC{\u0015?@&2&b^dQENq\u000em\rirC8D,]p-$d_;\u0006ySZnTypv\u0011\u0017\u0005@,Nv_DA~YF}p\fK\u000b\u0005&\u001aT}'v-\u0011\n\u0011<n\u0014Rk!\b\\\u0003\"6lP+/6J\\\u001dUl\u0005pG\u001ed.e\u0012\u00178x\u0018\u001eav_\u0012\u0016\u0003f\u0019%\u001f^d\u00015a[", "6`]1_,\u001dO(zg^:\b\u00138s\u007f", "2`c.E,L^#\b\t^", "Ad]A7(MO", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", ";na27(MO\u0004~\u0004]0\u0006\u000b", "", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\"hoD\u0011l:N@\u0014GZY6e`r*\u0014 j\u0015]\u0001s\u0003cImmX@\u001b\u00179E\u007f;2|\u000e\u0016\u0017D4~Q`\u001dC{\u0015?@&2&b^dQENq\u000em\rirC?65\u0010;)*lWwp\u007fa H9wqo\u0011\u0018\u000fA MzWDE9Q>t0.\u0015y\u0002\u001a:h}/r)\u001384?.qKv%RFt\u001e(^A4{+#\u0019IZjyu\b\fr,k\u0018\u001df>1'/CmQ\u001e\u000bf'WDei\n\r\u0016lCE\u0001\u0011pMzK]C~\u0006\f$kt\u001f", "/fT\u001cY\u0013:a(\\\u0005g-\u0001\u000b", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "/fT\u001cY\u0013:a(\\\u0005g-\u0001\u000bvU\u0012<e\u0013\f\u0015", "u(9", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface ResponseProcessor {
    /* JADX INFO: renamed from: ageOfLastConfig-UwyO8pc, reason: not valid java name */
    long mo7106ageOfLastConfigUwyO8pc();

    Object handleConfigResponse(ResponseResult responseResult, EndPointInfo endPointInfo, RetryManager retryManager, Continuation<? super CommunicationContext> continuation);

    Object handleDataResponse(ResponseResult responseResult, EndPointInfo endPointInfo, List<EventRecord> list, RetryManager retryManager, boolean z2, Continuation<? super CommunicationContext> continuation);
}
