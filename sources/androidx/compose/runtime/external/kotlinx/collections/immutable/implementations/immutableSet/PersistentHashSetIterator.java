package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: PersistentHashSetIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDR\n|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\u0010nj?1LeVMZS@\u000fs{:%c$\u007fICU \u0003*\t]NogtL`\u0019YƤ.\u0018~̓:H\u0006~m\u0014\u001f2\tnm3\u000e\u0001MCnuN\u000b04280ڎ/\u001cݵL\u0010\u0005}\fV\u001a%H@'í\u0019\u000f̂\t\u001a \u001a\u0007&\u000f3tg|L\u000fl&A='\u001bipSmۖ0E[\u001b]l';\u0005\u0012\"9XO5C3\u001a\u0003O^iX\u001b?(ܵKة'ݳ/I\u0002k\u0007n\u000e\u0018-+}\u0012\u0014rd\\[ĭlВ+1WҪ[R\u0014.\u0006\u0002L+J\f&\u00127P>3*h\u0018\u000eiο!]nYXގDȸ~g>Ѝ=\u000296G'7ioH1Ne\n[ځ*ţ\u0005z)żl\u0010f$)d\u0018S7bNO˙R$"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001bC,\\G63\u001e~n", "\u0013", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwBD\u0010VC\u0004\u0003E)QPX_O\u000b2", "6`b\u001bX?M", "", "5dc\u0015T:'S,\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", ">`c5", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEYC\tGNAq4qa", "5dc\u001dT;A", "u(;7T=:\u001d)\u000e~euc\r=tU", ">`c5?(Lb|\by^?", "", "5dc\u001dT;A:\u0015\r\nB5{\tB", "u(8", "Adc\u001dT;A:\u0015\r\nB5{\tB", "uH\u0018#", "1ta?X5M3 ~\u0003^5\f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3mbBe,'S,\u000eZe,\u0005\t8tc6h@|\u0016+", "", ";ne2G6'S,\u000ech+|z3t\u0003\u0007wO|", ">`c5<5=S,", "<dgA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {
    public static final int $stable = 8;
    private boolean hasNext;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    private static /* synthetic */ void getHasNext$annotations() {
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> listMutableListOf = CollectionsKt.mutableListOf(new TrieNodeIterator());
        this.path = listMutableListOf;
        this.hasNext = true;
        TrieNodeIterator.reset$default(listMutableListOf.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    protected final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void setPathLastIndex(int i2) {
        this.pathLastIndex = i2;
    }

    private final int moveToNextNodeWithData(int i2) {
        if (this.path.get(i2).hasNextElement()) {
            return i2;
        }
        if (!this.path.get(i2).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> trieNodeCurrentNode = this.path.get(i2).currentNode();
        int i3 = i2 + 1;
        if (i3 == this.path.size()) {
            this.path.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(this.path.get(i3), trieNodeCurrentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i3);
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i2 = this.pathLastIndex; -1 < i2; i2--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            if (iMoveToNextNodeWithData == -1 && this.path.get(i2).hasNextCell()) {
                this.path.get(i2).moveToNextCell();
                iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            }
            if (iMoveToNextNodeWithData != -1) {
                this.pathLastIndex = iMoveToNextNodeWithData;
                return;
            }
            if (i2 > 0) {
                this.path.get(i2 - 1).moveToNextCell();
            }
            this.path.get(i2).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E eNextElement = this.path.get(this.pathLastIndex).nextElement();
        ensureNextElementIsReady();
        return eNextElement;
    }

    protected final E currentElement() {
        CommonFunctionsKt.m3763assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }
}
