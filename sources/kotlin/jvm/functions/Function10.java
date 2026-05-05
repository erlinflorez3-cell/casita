package kotlin.jvm.functions;

import com.dynatrace.android.agent.Global;
import kotlin.Function;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0006MLc\u000b\u0004I\u00066\u00164'\u0015ӬT\u0016}јtiWӄliN-`SHş\u0014\u007f:$i%\u0010ّcY ~0\u000bmȞ\u0010ktLh\u000eaƤ.\u001a~m:Msތ\u0006\u0016\u00156Pt]\u074cusC>nzTӌH6(>\b\f\u001fɝRL\u0016}\tKiÈ:4FxH[+L5 \"\bN G'\u000bq\u0017\u0013Vwu:e+3mPZ?_fŧ}\u0011Ta?\r-`N/NEM\u0015[S3\u000b`jW\u0003urm\tv7?+\u007fu\b:f\u0011,\u0015aR=a\u00018t\u0005\bd<+9b{K\u0007\u0013X{\t\u0010%<:\u00146+VCE\u001a\u001d\u000fT\u07betɤW@^\u0018\u07b2F\u0017"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0001$S", "\u001e0", "\u001e1", "\u001e2", "\u001e3", "\u001e4", "\u001e5", "\u001e6", "\u001e7", "\u001e8", "\u001e0\u001f", Global.BLANK, "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u00138;", "7me<^,", ">0", ">1", ">2", ">3", ">4", ">5", ">6", ">7", ">8", ">0\u001f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018=\u0015C\u000b\u0011?H%qH#IvLACq\u007fK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)wwN\u000bc1N\u0015\u0004:m(j`FC~+#y#0GE~\u000e;Z>\u0015q2\u000429\fK\nGx\u0014\bet\u001e.&+$+6:\"\u0015\u000fJzhO\n2&]\u0011\u0010,\u001f.\u001eecr\u001e", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface Function10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> extends Function<R> {
    R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10);
}
