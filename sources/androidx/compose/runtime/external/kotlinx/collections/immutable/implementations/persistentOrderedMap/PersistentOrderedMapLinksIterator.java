package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0006DLc\u0003*I\u0006F\u000b6Ȑ\u0007\":ߚ\u007fјnjGRLeN.ZS8\u0015s{:+c$\u007fLCU }(\u0017eȞ\u0010itϺh\nk\u0011\f\u0015\u0007j\\Ue\u0001m\u0018\u001f4Ro\u00063{qk:!\u001cF\u000b.5::\u0010\u0004/\u001e:^\u001e{\u0013U[\u000e\"0v\u0081JZ\u001dS\u0015\u001c\"\u0006t\u001f/ \u000bmߑ:Hzd\u000361\u0015\u0002B|:&ܵ|\u0016\u001aTh?\u0013\u0007c.+v6c\u0017kٜ\u0003WpiD\u001bQ\u0002?\u0015h]ݐ;Q\u0004]FZ\u0010\u0014K*}\u000f\fx|؛\u0007Ōd\f/˃ {YX&(&\u0004RȟHǬ\u0012\u0012/ΞF/ p\u0016\u0019Svx_N]RxP\u0003\u0013cL\u0016S\u0004\nڀEӸj]iݢ1P=\n\u0013\u001c>%\u0007~/lړ\u0012u"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s72\u0013\u0002at\u0002R\u0007cvQ&P", "\u0019", "$", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#F}PGEa\u001b`\u0013o\u001d2", "<dgA>,R", "", "6`b5@(I", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tuz^", "7mS2k", "", "5dc\u0016a+>fW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(8", "Adc\u0016a+>fW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "uH\u0018#", "5dc\u001bX?M9\u0019\u00139k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001bX?M9\u0019\u00139k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b\u001bX?M", "", "<dgA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    public static final int $stable = 8;
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;
    private Object nextKey;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentOrderedMapLinksIterator(Object obj, Map<K, LinkedValue<V>> map) {
        this.nextKey = obj;
        this.hashMap = map;
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    public final void setNextKey$runtime_release(Object obj) {
        this.nextKey = obj;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final void setIndex$runtime_release(int i2) {
        this.index = i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.hashMap.size();
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        LinkedValue<V> linkedValue = this.hashMap.get(this.nextKey);
        if (linkedValue == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        LinkedValue<V> linkedValue2 = linkedValue;
        this.index++;
        this.nextKey = linkedValue2.getNext();
        return linkedValue2;
    }
}
