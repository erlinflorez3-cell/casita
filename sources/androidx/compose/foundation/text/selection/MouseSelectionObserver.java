package androidx.compose.foundation.text.selection;

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
/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`S2\u000fq\u0003:\u0003qҕ\"CiTb\u001e0\tgN\u0016h\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0017UVֈnЀݯQqC?n{~\u000b.::8(\u000eG>r`\u001e\u0001\u0013Cy\rB4N{RR;PK>ǀ\u0005̄ŋ\u0005 bs\\C\u0011\u0005kHG#1jrR5aH|{\u0010\rxބ\fǸҐ\"-FFC\"ms\u0011\u0017j[m\u0004ouK\u0010\u0001'U.ywe:p\u007fB\u001aqs\u05ce\\ö͉`\u0007Wq\u001a.̼Nb֢P\u00190z\u0001Ԫ)j\u0003\u0016\b-g\\,ըj\u001aՅ7s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|rqG\u0007Q,Uv%VPX5FO\u0001=!#Z\u001b$", "", "=m3?T.", "", "2qP4C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "=m3?T.\u0006!\u0001\u0007zF|\u0003", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P(M1l`\u0002E\u0014\u001bic\u0012 ", "=m3?T.\u001d]\"~", "", "=m4Eg,GR", "2nf;C6LW(\u0003\u0005g", "=m4Eg,GR`\u0005B-3hS\u0017", "uI\u0018'", "=m4Eg,GRw\fv`", "=m4Eg,GRw\fv`s\u0003P}lkrc", "=mBAT9M", "=mBAT9M\u001bff\u0003^\u0014M\u000f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface MouseSelectionObserver {
    /* JADX INFO: renamed from: onDrag-3MmeM6k */
    boolean mo1610onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment);

    void onDragDone();

    /* JADX INFO: renamed from: onExtend-k-4lQ0M */
    boolean mo1611onExtendk4lQ0M(long j2);

    /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
    boolean mo1612onExtendDragk4lQ0M(long j2);

    /* JADX INFO: renamed from: onStart-3MmeM6k */
    boolean mo1613onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment);
}
