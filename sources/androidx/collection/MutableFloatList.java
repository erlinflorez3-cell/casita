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
/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007fјnjG5LeV.ZS0\u0010s{B6c$wRQ٥J}P\b\u0010[wmtJh\u000b[\u000f4\u0017ѱn,WWAi \u0015JB\u001eFcQ}EQ`#?M6@(Py3\u000bJ0N\u000f\u0005\u0006[K:\u0013`D~Bj\r{\u000eb\u001e\u0014J8\u0001Lc\u0018RDU\u0005]h.k\u000fwNf'\u000e7-Q\u001bSl';\u0005*49LO5C,\u0004\t\rQiJ\u001b? >5l54CI\"V~n\u000e -+}\u0014\u000ex,[\u0013\\x\fU,\u007fgY]&(&\tD\u0011J\u0013&\u0006URv9(v \u000ea~#WNS\u001a^p\u0001CpD(=\u007fa5i\u001ft^y;GM}ޭ\u0005U-1\u0012\u0007!\n^>d##lw\u007f:\u0018̼E\u0011]\u0018jUm2z\u0013\u00068\u0011HG.=B\u0084._4EmQ#Ou2LRt\u000f\u0005\u000fg\u001a֦R\u0011O0\u0001.7X\u0013<^Rl\u001dk~]\u001f\u0093\u0019\u0016+b\u0019\u0016\bA*\r{J.=\u0010|]/Ȑj\u0016i\u00188Gfe`\u001fo\u001c_Q^a>\u001ao\u001eujvBFlf\u0013e~B\u0002\u000b#h66JH\u0019\u0017(\u007fR[$\u0013`M:*BAI\u0019\u000b\u001ex\t$AO\b!_\tiX\u0017bI<\u0003\u0018.%\u000f\u0007Oj\b\bg'J\\\u0003f!;Yi5G'\u001e.vM\u0015#5\u0006$\u0004UtdGzk^\u0002c\u00158\u0016H@\u00023K '~W@JFSf\u000be\u007fVB-\u0001{\b\u001aSh\\h8n~4xjxX\u001bϦ\"?b\u0001> d.\u0004*J\tc{T9e\u0007W\u0001 q<|B-\u000b%\u001e3\u001f\b\"+6}S5 .wB0K̜]ɳs2\u0012d\u0015*\u0003jצ0\u0003"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u0007;{%\u0004", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "/cS", "", "3kT:X5M", "", "", "7mS2k", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "3mbBe,\u001cO$zxb;\u0011", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,+O\"\u0001z", "AsP?g", "3mS", "@dc.\\5\u001aZ ", "Adc", "AnaA", "AnaA7,LQ\u0019\byb5~", "BqX:", ";h]\u0010T7:Q\u001d\u000e\u000f", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 16 : i2);
    }

    public MutableFloatList(int i2) {
        super(i2, null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(float f2) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = f2;
        this._size++;
        return true;
    }

    public final void add(int i2, float f2) {
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(fArr, fArr, i2 + 1, i2, this._size);
        }
        fArr[i2] = f2;
        this._size++;
    }

    public final boolean addAll(int i2, float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(fArr, fArr, elements.length + i2, i2, this._size);
        }
        ArraysKt.copyInto$default(elements, fArr, i2, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int i2, FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        float[] fArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(fArr, fArr, elements._size + i2, i2, this._size);
        }
        ArraysKt.copyInto(elements.content, fArr, i2, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = mutableFloatList._size;
        }
        mutableFloatList.trim(i2);
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        if (this.content.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public final void ensureCapacity(int i2) {
        float[] fArr = this.content;
        if (fArr.length < i2) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i2, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public final void plusAssign(float f2) {
        add(f2);
    }

    public final void minusAssign(float f2) {
        remove(f2);
    }

    public final boolean remove(float f2) {
        int iIndexOf = indexOf(f2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        for (float f2 : elements) {
            remove(f2);
        }
        return i2 != this._size;
    }

    public final boolean removeAll(FloatList elements) {
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

    public final float removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        float[] fArr = this.content;
        float f2 = fArr[i2];
        if (i2 != this._size - 1) {
            ArraysKt.copyInto(fArr, fArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return f2;
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

    public final boolean retainAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        float[] fArr = this.content;
        int i3 = this._size - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                break;
            }
            float f2 = fArr[i3];
            int length = elements.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (elements[i5] == f2) {
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

    public final boolean retainAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        float[] fArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!elements.contains(fArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final float set(int i2, float f2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i2 + " must be between 0 .. " + (this._size - 1));
        }
        float[] fArr = this.content;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
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

    public final void minusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f2 : elements) {
            remove(f2);
        }
    }

    public final void minusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(fArr[i3]);
        }
    }
}
