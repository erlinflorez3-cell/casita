package androidx.compose.foundation.layout;

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
/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lq?\u0016Z͜x.\u0001Rz%y{L$\n%Hٸ=۞\u0019ԂΖ\bNɁkk\u0007L`\rQ\u0012V,\u0007nDI\u0004}4ܯ\u0011ͩAģѹ2LڱA=xv<\u000b.9rN\b\r\u0019\u001aXMfͳ|ǈJÈݮ/?¤>V%O\u000b# \r\u000f6\u000f(tg|;\u001fǴ_Ƕ.݊ʾhAĚ+cH~S\u0018T[w#\u0005m6+n<\fս'ھ\u0002ޗӱZ>ƄCuU\u0007n452˗rW̯X\u000f\u001c\u00181̟)\fq.\\\u000bph\u000e-J}b\u05c8T\u001c\u008a{y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`5?z7{\u001fqoH\u0014_0W\u000655JX7\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`19u?\u001ej", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", ";`g\u0015X0@V(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u001aT?!S\u001d\u0001}ms[\\\u000fjO)c", "u(5", ";`g$\\+MV", "5dc\u001aT?0W\u0018\u000e}&\u000bPh45\u0001\u0010", ";h]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", ";h]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface BoxWithConstraintsScope extends BoxScope {
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    long mo925getConstraintsmsEJaDk();

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo926getMaxHeightD9Ej5fM();

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo927getMaxWidthD9Ej5fM();

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    float mo928getMinHeightD9Ej5fM();

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    float mo929getMinWidthD9Ej5fM();
}
