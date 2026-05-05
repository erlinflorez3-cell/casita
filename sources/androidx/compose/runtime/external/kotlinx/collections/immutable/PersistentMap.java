package androidx.compose.runtime.external.kotlinx.collections.immutable;

import com.dynatrace.android.agent.Global;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: ImmutableMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0017\u007f\u0007t\rA0JgN\rhݷR\u0011qڔB#\u0004(wBIU8|R\u0015_Pwg5Ij\rS\u000fL\u0016'kdHcAo \u0011JN\u007fACM&މIb\u00056;\u001f`%~\u001eM\u0013(.`\u001c\u0007|SKB۵@B\u0001:\t\f{Ĩ`6Ne.\u00066hwPFH#җJ13\u0003 A|ϋ\u00104\u000bS%F\u000b܋=zo%C@m4[I٨\u0007\u0007`c\b+MzU\u0011x)7+\u007f֕g8h\u007fJ\u0014Y˽=o\u00010t\u0013ad\u0012&;O\u001a֟`\u00108w1z;GJ2NFV:E&v\n\u001e3+ɁcB`\u0002\u0015A.Э\u0012:%+\u00183aݍa\u000bЂe;'[\u007f#\u0013\u00196/\u0011p1[\u000bוp\u0017+T.P_҅pAVT\"YsЧ4tp\tB\u0004fFFSɨ\u0015.%-ܔZݽ\u05fd!o\nJJ\u0007%\u0004ÄlbנVG"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013\u0002", "\u0019", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n,3*]", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013j&\u0012?o\u007f\f#c", "1kT.e", ">tc", "9dh", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[Z!]+\u001a\u000eUHmtNF&\f5\\K9r\b\u0013\u0016\fDnzKdYK\u0002\u001d\u0006P%eMY)dGNSf8s\fh,D6Ey", ">tc\u000e_3", Global.SEMICOLON, "", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\t|qL~", "\u0010tX9W,K", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: compiled from: ImmutableMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0006DLc\u0003'Iي8\u000bDB\u0007Ӭ2v\u000eј\u000fl?0Rdp0XT8\u000f\u001c\bD&k$8BKW*}h\t}O0y|Lr\u0017S\u0011\u0016\u0016/j<Kex\u0014\u0013=5\t\u0014ѹ2ݹڑ==hv<$N1ś<}ۏ\u0005\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013j&\u0012?o\u007f\f#c", "\u0019", "$", "", "0tX9W", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013\u0002", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Builder<K, V> extends Map<K, V>, KMutableMap {
        /* JADX INFO: renamed from: build */
        PersistentMap<K, V> build2();
    }

    /* JADX INFO: renamed from: builder */
    Builder<K, V> builder2();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k2, V v2);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k2);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k2, V v2);
}
