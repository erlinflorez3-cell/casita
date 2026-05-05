package kotlin.collections;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<;!&i\u0016DLc\u000b\u0004I\u00066\u000e6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥B((\u000e]Ȟ\u007fitϺh\nc\u0015\u0016\u0018\tjrH\u0004x\u000e\u0018\u001f4Ro\u00062{o}CfuF\u000b&42:\u007f\u000b'\u001dR\u0005\u0016{\tGc\u000e\u0018ؓNuRT\u0013L\u0013 2\u0012N\"\u0011\u001e#l^8Xl$@]*3uRP7_v\u0002]\u000fVTm\u0013%h^5F8E\u001b+U\u0013\tXae\u0006g\u001cC\nv/?-O֕e5x\u0006$\u0017;OS\\!/\r\u000bab\u001c'qN\u0012T\u0011\u0018.x\u000b\u0002\u0013>\u0014\u0010\f-n1UVl\r\u001c=\rtYó^\u0007vD\u0006yo<71\u00105;9akacK\u0019\u0015=*\u0010=*3\u0003~!\"Y\u001eb%\u001b\u001b}\u007f<\u0012JCI^\u0010_?}\u0006vh(-,ZM\u0005=\b)0\u001d¦EZY)1m\u0012H\u000bf%\u0012\u0011nckbH\u0007!\u001d#w4\u000f\rjJj\u0007{RZ^R\u0014u4Z\f\f\u00163 \u000b\u0007l!S\u001f\u000fYnjzSc\f51l=\u007fq±\u0012g"}, d2 = {"\u000fqa.l\u0013Ba(", "\u0013", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0007\u0003\u0004\\,b\u0013>l\u00041Q", "Dda@\\6G", "~- ", "\u0016`b5@(I", "\u0019", "$", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u0016`b5F,M", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001ah]8X+!O'\u0002bZ7", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "\u001ah]8X+!O'\u0002h^;", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCn\u0017&\u001d", " `]1b4\u001aQ\u0017~\tl", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TypeAliasesKt {
    public static /* synthetic */ void ArrayList$annotations() {
    }

    public static /* synthetic */ void HashMap$annotations() {
    }

    public static /* synthetic */ void HashSet$annotations() {
    }

    public static /* synthetic */ void LinkedHashMap$annotations() {
    }

    public static /* synthetic */ void LinkedHashSet$annotations() {
    }

    public static /* synthetic */ void RandomAccess$annotations() {
    }
}
