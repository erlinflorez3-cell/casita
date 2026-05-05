package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableCollection;
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
/* JADX INFO: compiled from: ImmutableCollection.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDZc|\u0004G\t8\u000b<^\u0007Ӭ4\u0012\u000e\u0007nj?2Le^.ZS8\u0018s{:%a\u0003\bّcY Ԃ0\bmM\u0018m~Lj\u000b\n\u000e4\u00161i<\u0012n\u0007^*\u0015BD\u007f?iݹ\u001eމid\u00038\u001d hĲ~\u001eڱ\u0005\u001a8KX\u0011\tGc\u0012\"2Pppĥ;˟5$ \u000bV&\u0011 lg\u0005Ȥvr$^w/\u0011pZT7a@|\u0004εt\\m1?m,4X=E\u00175S9ޗ\u0001¹\u0006'\b\u000bK\u000f\u0001-7-Ys\u000e̬\u0007ÜD\u00199Q%])̦#)Ōd\f5.\u0018\u0004Y[&.\b|\f\rrǉ<ͺWX<92r\u0018\u0010Ct)ԟPR\u0012^p\u000e)n|;m\u001aA6Q!vSq;O\u05cbeަ5\u0017,(\u0019t1]d\u000e\u0017ٽIZ>uykNL`T\u001a[Mm:͏\u0011̣Z\u000e>L\u00185\f\u0013>\u0017[ڛ\n?iEɶ\u0001ֶ҆gz\rbnr\u0018Q͛D3ă\u001a6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u0015)\u000f3I\u007fJl\u000b\u0015k", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n\"A&\u000f,G\u0011?r\na", "/cS", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u0001\u000eBxtPe\u0010P\tr\u007fH0hDhc\u0004P\u0017", "/cS\u000e_3", "3kT:X5Ma", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u0015)\u000f3I\u007fJl\u000b\u0015TjEnwAV\u001d\u001d", "1kT.e", "@d\\<i,", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "@dc.\\5\u001aZ ", "\u0010tX9W,K", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* JADX INFO: compiled from: ImmutableCollection.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&˛\bDR\u0001|İI\u0006F\u000b6Ȑ\u0005\u0007Bߚ \tliG/tkX0bSp\u000e\u001a{|0i%\nIKW*}X\b}P.\fŪIҙŒC\u0013\u000e\u0018~\nZHǪ|`݉\u00131"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u0015)\u000f3I\u007fJl\u000b\u0015TjEnwAV\u001d\u001d", "\u0013", "", "0tX9W", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u0015)\u000f3I\u007fJl\u000b\u0015k", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Builder<E> extends Collection<E>, KMutableCollection {
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    PersistentCollection<E> add(E e2);

    @Override // java.util.Collection
    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.Collection
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    PersistentCollection<E> remove(E e2);

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    PersistentCollection<E> removeAll(Function1<? super E, Boolean> function1);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}
