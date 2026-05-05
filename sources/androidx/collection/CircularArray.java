package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0016nj?7LeV.ZS0\u0016s{B-c$wHQ٥B\u007f(ޛ]M\u0018g\u001dJ\u001b\u001aI\u0014\u0016\u001c~j:Jmx\f\u0014Ƥ6B}B{^}LQ`#F5$@3Py;Џʀ.H\u001e\tCTY\u001f*0n\u0001jV\u001b^\u001d\u001aHß̧$\u0001,n0RD\\\u0005]h?k\twWf'\u000e@CMUZb=%v\u0018Ӝ[DEL-%\u0002\u0005Mѿ[ύ\u0007?\u007fUMl5@CI\"q~a\u000e/-+\u0006Օǁv&j\u000f\u001ai\u001aCCO\u001a֟ח\u0012(\u0006\u0005D\u0019J!&\u0006UX^1(\u0005 \u000eav;_No\u001a^p\u0010+eD5=\u007fa-\u0002\u001ftqy;GP\b\b\u0013\u00116#/pwſ`\u05f8d\u0015#ƘHg?VXEXR\u001a[Sl:͏\u0011\b\u0001ʹ<Ͻ\u00041\u0004\u0011<\u001euFiA;!\"ȵ~\tϼz\txjYr`R\u0011.|!O*7\u000e1ըpʰoP\\А| [(l\u00074ܱIdϢ{@9'\u0016[]r:v[k\"%]h\u000eխz«\u0012WAӔۑ9r"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n^\u001b$E\u007f\u00158\u0004\u0001Bfy4\r", "\u0013", "", ";h]\u0010T7:Q\u001d\u000e\u000f", "", "uH\u0018#", "1`_.V0Mgu\u0003\nf(\u000b\u000f", "3kT:X5Ma", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "4ha@g", "5dc\u0013\\9Lb", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "6dP1", ":`bA", "5dc\u0019T:M", "B`X9", "/cS\u0013\\9Lb", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "/cS\u0019T:M", "1kT.e", "2nd/_,\u001cO$zxb;\u0011", "5dc", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7r4:c;R", "", ">n_\u0013\\9Lb", ">n_\u0019T:M", "@d\\<i,\u001f`#\u0007Zg+", "1nd;g", "@d\\<i,\u001f`#\u0007hm(\n\u0018", "Ahi2", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, null);
    }

    public CircularArray(int i2) {
        if (!(i2 >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i2 <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.capacityBitmask = i2 - 1;
        this.elements = (E[]) new Object[i2];
    }

    public /* synthetic */ CircularArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 8 : i2);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i2 = this.head;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i4];
        ArraysKt.copyInto(eArr, eArr2, 0, i2, length);
        ArraysKt.copyInto(this.elements, eArr2, i3, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i4 - 1;
    }

    public final void addFirst(E e2) {
        int i2 = (-1) - (((-1) - (this.head - 1)) | ((-1) - this.capacityBitmask));
        this.head = i2;
        this.elements[i2] = e2;
        if (i2 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e2) {
        E[] eArr = this.elements;
        int i2 = this.tail;
        eArr[i2] = e2;
        int i3 = (-1) - (((-1) - this.capacityBitmask) | ((-1) - (i2 + 1)));
        this.tail = i3;
        if (i3 == this.head) {
            doubleCapacity();
        }
    }

    public final E popFirst() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e2 = eArr[i2];
        eArr[i2] = null;
        int i3 = i2 + 1;
        int i4 = this.capacityBitmask;
        this.head = (i3 + i4) - (i3 | i4);
        return e2;
    }

    public final E popLast() {
        int i2 = this.head;
        int i3 = this.tail;
        if (i2 == i3) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = (-1) - (((-1) - this.capacityBitmask) | ((-1) - (i3 - 1)));
        E[] eArr = this.elements;
        E e2 = eArr[i4];
        eArr[i4] = null;
        this.tail = i4;
        return e2;
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i3 = this.head;
        if (i2 < length - i3) {
            length = i3 + i2;
        }
        while (i3 < length) {
            this.elements[i3] = null;
            i3++;
        }
        int i4 = this.head;
        int i5 = length - i4;
        int i6 = i2 - i5;
        this.head = (-1) - (((-1) - this.capacityBitmask) | ((-1) - (i4 + i5)));
        if (i6 > 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                this.elements[i7] = null;
            }
            this.head = i6;
        }
    }

    public final void removeFromEnd(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.tail;
        int i4 = i2 < i3 ? i3 - i2 : 0;
        for (int i5 = i4; i5 < i3; i5++) {
            this.elements[i5] = null;
        }
        int i6 = this.tail;
        int i7 = i6 - i4;
        int i8 = i2 - i7;
        this.tail = i6 - i7;
        if (i8 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i9 = length - i8;
            for (int i10 = i9; i10 < length; i10++) {
                this.elements[i10] = null;
            }
            this.tail = i9;
        }
    }

    public final E getFirst() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[i2];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final E getLast() {
        int i2 = this.head;
        int i3 = this.tail;
        if (i2 == i3) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[(i3 - 1) & this.capacityBitmask];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final E get(int i2) {
        if (i2 < 0 || i2 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[(-1) - (((-1) - this.capacityBitmask) | ((-1) - (this.head + i2)))];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }
}
