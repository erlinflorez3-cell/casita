package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<;!&i\u0016DLш|\u0004Oي8é6B\u0015\"4\u0012}\u0007njO0LeN.ZS8\u000fs{J$c$wCCU0}*\tUN\u007f\u001a|Ϻr\u000b\n\u000e&\u0018~̓:H}~m\u0014\u001f2\tnm3}uK:xvL\u0004N4R@\b\b\u0019\u001e:H\u0016w)G\u0012Ð\u001aضDpHW%\n\u0013܅*\u0006\u0005\u001f! bɡ\\<hnc9=\"+uRP7_v\u0003]\u000fVTm\f%hN/N8M\u0015kY3\u000f`^W\u0007OqC\u0006\u0017+mǪQָ[6f\b,O9X%]!0|\u0007WӠ\u001a&SUsM`\u000env)\u0007=B\u0012\u000f\u001e)^-[\u001c\u0017\u0010\u001c6\rvc@V\u0003\rF0~oB/%F2qݕ#ƻUaI&f{\n\u000e%\u001eQ\u000b\u000f#a٪\u001cf5\u001dZv_0yLMJ^\n C}\u0006\u0001bH)2>w\u0004=|).]+gcG&9o\u0012HJh%\t\u0011laujH\u0007!5ݳ?Ҋ\r\fhS\u0087\t{"}, d2 = {"5dc#T3NS", "$", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[:c", "BgX@E,?", "", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "uKZ<g3B\\b\fz_3|\u0007>/e\u0013\tJ\f\u0017$V\u0004X\u0012]*1jyi>i\u001f0\u0017-8p4\u001c$>H?\u0011r3R\u007fpTLO3\\P\u0002\u0007y|g\u0018Y+\u001a\u0014m\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "\"", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[;c", "uKZ<g3B\\b\fz_3|\u0007>/e\u0013\tJ\f\u0017$V\u0004Y\u0012]*1jyi>i\u001f0\u0017-8p4\u001c$>H?\u0011r3R\u007fpTLO3\\P\u0002\u0007y|g\u0018Y+\u001a\u0014m\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "Adc#T3NS", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmHu", "D`[BX", "uKZ<g3B\\b\fz_3|\u0007>/e\u0010\fO|\u0014\u001eGZ\u001bF\u0002%Bh\u0012j\rT\u001b*^?\u0005r0'\u00172K6\fc*]L\u000eMV]3`[<J\u0014\u0013a\u000eL:VjDN.yDD.\u001c\u00020\u00077y|U\u001d\n>l:,S\u0015Gw$K\u0005\u001a", "\u001aj^A_0G\u001d&~{e,z\u0018xKg8\u000b<}\u001e\u00172|\u0018Gv2DmIu", "uKZ<g3B\\b\fz_3|\u0007>/e\u0010\fO|\u0014\u001eGZ\u001bF\u0002%Bh\u0012k\rT\u001b*^?\u0005r0'\u00172K6\fc*]L\u000eMV]3`[<J\u0014\u0013a\u000eL:VjDN.yDD.\u001c\u00020\u00077y|U\u001d\n>l:,S\u0015Gw$K\u0005\u001a", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PropertyReferenceDelegatesKt {
    private static final <V> V getValue(KProperty0<? extends V> kProperty0, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(kProperty0, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return kProperty0.get();
    }

    private static final <T, V> V getValue(KProperty1<T, ? extends V> kProperty1, T t2, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return kProperty1.get(t2);
    }

    private static final <V> void setValue(KMutableProperty0<V> kMutableProperty0, Object obj, KProperty<?> property, V v2) {
        Intrinsics.checkNotNullParameter(kMutableProperty0, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        kMutableProperty0.set(v2);
    }

    private static final <T, V> void setValue(KMutableProperty1<T, V> kMutableProperty1, T t2, KProperty<?> property, V v2) {
        Intrinsics.checkNotNullParameter(kMutableProperty1, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        kMutableProperty1.set(t2, v2);
    }
}
