package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\rnj?0LeV=ZS8şs{:+c$\u007fCCU \u0004*\t]Wo˧vJh1K\u000f\f\u001c~jBկ}zc܈\u001d1ruO5]o\u00048\u000ftf\tN3\u000b8X\u0007A'0\\ z\tFc\f@4Ϯt:`\u0012\u000e *\u001e\u0014D8\t.`wPLG\u001beh63\u0007wKf'\u000e4ƊQ\rT^o\u001e\u0005r6+nIe\u00193f\u001b\u0007\t¹ύ\u0007?\u007fQMz5<CO\u0004YFX6ϬCۀ\u007f\u0011k\t>\\3U) 5Bgc\u0002ִ>,\u0006\u0013\u0014\rj\bTΑ'ρ2-(\u007fP\u0012A\u000f\u000bSnkJkP\u001c\u0013gF\u00195\u007fiٿg8-϶a\u0004%\\U\u0014\u0005;0S\u0005|@sT<d].b\u0018i9aDMJd\t\bE\u001c\u000b7t͆.\u0004>hHT\n1F\u001d59k9i \u001a\thFmu\u0013_\u0019]wt`F2p&7p\b:a\u000bvʰoPb{t$[@l\u0007,\f; \u000b{l%3/fO\u0017m1ܗcZ;=lOa~o\u001eYO]a=\u007fjfУTλ\u0018ADb\u0013c7Na\u000fr\\V&\tʎlݻ{{L\u0088\\/@L\n\u001cb0a\u001dj!`\u0003LF\u007fM_ݷfӳ\u0014\u0005\\՜<\u0005o2\u0003\u0018Q\\j\u0001\bg'M\u0003ʌlĘ1AYځԐ*z"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-\u0005 \u0019$\u007f\u000f=v2\u000b", "\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "1`_.V0Mg", "", "uH\u0018#", "0tU3X9", "", "", "4h[9X+,W.~", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\b", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "u(8", "AsP?g\u0010GR\u0019\u0012", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "3w_.a+>R", ";`g\u0010T7:Q\u001d\u000e\u000f", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7r5B_3", "", "7sT?T;H`", "", "@d\\<i,\u001fW&\r\n", "<", "Bn0?e(R", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "/qa.l", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "4naDT9=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(int i2) {
        this(new Object[i2], 0);
    }

    public RingBuffer(Object[] buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i2 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i2).toString());
        }
        if (i2 > buffer.length) {
            throw new IllegalArgumentException(("ring buffer filled size: " + i2 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        this.capacity = buffer.length;
        this.size = i2;
    }

    private final int forward(int i2, int i3) {
        return (i2 + i3) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t2) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = t2;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int i2) {
        Object[] array;
        int i3 = this.capacity;
        int iCoerceAtMost = RangesKt.coerceAtMost(i3 + (i3 >> 1) + 1, i2);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        return (T) this.buffer[(this.startIndex + i2) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                this.this$0 = this;
                this.count = this.size();
                this.index = ((RingBuffer) this).startIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected void computeNext() {
                if (this.count == 0) {
                    done();
                    return;
                }
                setNext(((RingBuffer) this.this$0).buffer[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i2).toString());
        }
        if (i2 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i2 + ", size = " + size()).toString());
        }
        if (i2 > 0) {
            int i3 = this.startIndex;
            int i4 = (i3 + i2) % this.capacity;
            if (i3 > i4) {
                ArraysKt.fill(this.buffer, (Object) null, i3, this.capacity);
                ArraysKt.fill(this.buffer, (Object) null, 0, i4);
            } else {
                ArraysKt.fill(this.buffer, (Object) null, i3, i4);
            }
            this.startIndex = i4;
            this.size = size() - i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = this.startIndex; i3 < size && i4 < this.capacity; i4++) {
            objArr[i3] = this.buffer[i4];
            i3++;
        }
        while (i3 < size) {
            objArr[i3] = this.buffer[i2];
            i3++;
            i2++;
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size, objArr);
    }
}
