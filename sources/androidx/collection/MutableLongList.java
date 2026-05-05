package androidx.collection;

import java.util.Arrays;
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
/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4E\u0007\":\u0012\u007f\u0007ljA0RlP.`\\2\u000fq{<$i8yCAd0ԂR\t}M(t~P`\u000bQ\u000f\u001e\u0016'k߽MU\u0007_Z%@H\b?aT C?_\u0003>\u001d `#h}\u0013\n2*v\u001a?\u0007QQ$\u0012^K!>`\u0016e\u0005H\u001cNJ.\r6\\\u0016YfLzjR/Q\u00022X\\3w0+X=LZ&\u001b~y\u001eYAg9#2k\u00035Q$U\u0011K\n=3sW-1H\u0002_NX.\u0015E/]\u001aurTjM]n\u0018?+}n{T\u001c5\u0010z*\u001b\u0005\b\u001c\u0015?H\\4br\u0016\u001eKt!ZpT\u0010aZ\u007f)b~&3\u0011K+g\"\u0017UoH1NezKڃ\u001ek\u0010|2sT<gE\u001fb\u0001i1\u007fJ\u0004ʷVRhK~\u001cp\u0011\tZ\b>T\u0018/*\u001ftϖ%\u007fjG59k0Otk\u0005\u0012xh\u0002h\u0019̹@j}$IB\t:ath\u0013thT\u00076Wۺ$\u001d\u0016\f\u001a+ \u000b~l%3\u001dfO\u0017w1ܛ]R1=yOY\u001dv>[GgK5\u007fmXm`\u000b,?jm5\\tOk\f\t[p.@\\\u0003\u0010&\u0007tR\u001a J? *|:?.t\u0015v\rNHG{\u0017grh>\u007f\u001dK2\u0019\u0002$#\u00101Vbo}~\u0011IZ}\u0011(3@_M1&\u0004#1@\u000b<\u001f~\"\u000bwkZTdlDt\u001e\b./29\u007f:m\u0017\u001d\fA20;\u000ee\u0001\u007fiM@1+\u0003\u007f\u000eIpFg6k!0nsbO\u0003!hԵ^;'\u0016\u007f\u0018y\u0010MCKqp#[lP;\u0011gYf8+\fO$+\u0001}@\u00155[Dw-$z,/Cb\u0014ʗoЦ}f'(zi\u00121Ќ\u001a\u000f"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[d$E|k", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0012J\u0006z", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "/cS", "", "7mS2k", "3kT:X5M", "", "", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "3mbBe,\u001cO$zxb;\u0011", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,+O\"\u0001z", "AsP?g", "3mS", "@dc.\\5\u001aZ ", "Adc", "AnaA", "AnaA7,LQ\u0019\byb5~", "BqX:", ";h]\u0010T7:Q\u001d\u000e\u000f", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public MutableLongList(int i2) {
        super(i2, null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(long j2) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = j2;
        this._size++;
        return true;
    }

    public final void add(int i2, long j2) {
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(jArr, jArr, i2 + 1, i2, this._size);
        }
        jArr[i2] = j2;
        this._size++;
    }

    public final boolean addAll(int i2, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(jArr, jArr, elements.length + i2, i2, this._size);
        }
        ArraysKt.copyInto$default(elements, jArr, i2, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int i2, LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        long[] jArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(jArr, jArr, elements._size + i2, i2, this._size);
        }
        ArraysKt.copyInto(elements.content, jArr, i2, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = mutableLongList._size;
        }
        mutableLongList.trim(i2);
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        if (this.content.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final void ensureCapacity(int i2) {
        long[] jArr = this.content;
        if (jArr.length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i2, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final void plusAssign(long j2) {
        add(j2);
    }

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final boolean remove(long j2) {
        int iIndexOf = indexOf(j2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        for (long j2 : elements) {
            remove(j2);
        }
        return i2 != this._size;
    }

    public final boolean removeAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        int i3 = elements._size - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                remove(elements.get(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2 != this._size;
    }

    public final long removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        long[] jArr = this.content;
        long j2 = jArr[i2];
        if (i2 != this._size - 1) {
            ArraysKt.copyInto(jArr, jArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return j2;
    }

    public final void removeRange(int i2, int i3) {
        if (i2 < 0 || i2 > this._size || i3 < 0 || i3 > this._size) {
            throw new IndexOutOfBoundsException("Start (" + i2 + ") and end (" + i3 + ") must be in 0.." + this._size);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("Start (" + i2 + ") is more than end (" + i3 + ')');
        }
        if (i3 != i2) {
            if (i3 < this._size) {
                ArraysKt.copyInto(this.content, this.content, i2, i3, this._size);
            }
            this._size -= i3 - i2;
        }
    }

    public final boolean retainAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        long[] jArr = this.content;
        int i3 = this._size - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                break;
            }
            long j2 = jArr[i3];
            int length = elements.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (elements[i5] == j2) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            if (i4 < 0) {
                removeAt(i3);
            }
            i3--;
        }
        return i2 != this._size;
    }

    public final boolean retainAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        long[] jArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!elements.contains(jArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final long set(int i2, long j2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i2 + " must be between 0 .. " + (this._size - 1));
        }
        long[] jArr = this.content;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    public final void sort() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void minusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j2 : elements) {
            remove(j2);
        }
    }

    public final void minusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }
}
