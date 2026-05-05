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
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0006WLc\u000b\u0004I\u00066 4'\u0015ӬT\u0016}јtiWӄliN-`SHş\u0014\u007f:$i%\u0010ّcY ~0\u000bmȞ\u0010ktLh\u000eaƤ.\u001a~m:Msތ\u0006\u0016\u00156Pt]\u074cusC>nzTӌH6(>\b\f\u001fɝRL\u0016}\tKiÈ:4FxH[+˟-\u001e\u0018\u000fL*\u001fȦ\u0005kT@Vw{ŽW'\ttPZEڿX\u0001S\u0019TaE˙\u001fe$8NESՖMW\t\u0015`j]šguC\u0014v7EǢqw]Ff\u00112ƃSS\u0013n\u00018zӤyd\u001299b\u0002J\u0001\u00148y\u000b{SO2\"NϘG<B2f> cx\u0001iXP8މr\u0004\txN\u0017[~c/G3~Q\u0018;IRE\u0015\u001d\rT$1r/ul\u000e\u0017\u0017KX\u0006lIQv@xR\u0018uUm:t\u0013\u00068!HG64,\u0015<5=7\u0012?S%y!`D\u001e}5dvs\u0002R~HRr$XB\tBcth\u0013\u000ehT\u000f6AQ*w\u001f}>\u001eP`\u0006`9%FZ\u007flw\u0010e]@2_jE\u007f\u0007kDeibA\\icFp\u0003z\"gTb;h\u0017Fa5r\\^3xʲjݻ{{Rxܥ\u0017]"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002$S", "\u001e0", "\u001e1", "\u001e2", "\u001e3", "\u001e4", "\u001e5", "\u001e6", "\u001e7", "\u001e8", "\u001e0\u001f", "\u001e0 ", "\u001e0!", "\u001e0\"", "\u001e0#", "\u001e0$", "\u001e0%", "\u001e0&", "\u001e0'", "\u001e0(", "\u001e1\u001f", Global.BLANK, "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u00138;", "7me<^,", ">0", ">1", ">2", ">3", ">4", ">5", ">6", ">7", ">8", ">0\u001f", ">0 ", ">0!", ">0\"", ">0#", ">0$", ">0%", ">0&", ">0'", ">0(", ">1\u001f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPyUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018=\u0015C\u000b\u0011?H%qH#IvLACq\u007fK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)wwN\u000bc1N\u0015\u0004:m(j`FC~+#y#0GE~\u000e;Z>\u0015q2\u000429\fK\nGx\u0014\bet\u001e.&+$+6:\"\u00152hq}:Wo\u001bj\nWL26\u0019ct9/\u0014\u0003n\u0013%<]h\u0003\u0001<\u0003CIm$|-\u0004>lu^\u0010\u0003-o/3@ T~)F+'[\"~Lm\u0014%0_'V\u0014h(n\r4\u0018\u0005y4U\u0003UL\u0017:2\rrKpj-V)2\n\r\u0013(/T>@<@t\u0010\u0014CVq\u0004\u0019\u0005e\f\u00012\u001c'n'V=b^>`NX\u001e*c\u0002#\u001b63K<=s^u6jd\u0013d\u000e\u0011'E4\u000b5\u000b3g'<aZZ#_N!(\u0017\u001c+iv_,Xx5H}cCj0t$\u0018u-qP!1\u0005,k\f\n\u0019E", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface Function20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> extends Function<R> {
    R invoke(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17, P18 p18, P19 p19, P20 p20);
}
