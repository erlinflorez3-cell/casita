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
/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007fјnjG0LeN/ZS8\"s{:3qҕ\"CiTZ\u000b2\u000fUNug\u0007J\t\fß\u0013\u0006$z38W[\u0011]@\u0016bF}GKM\u001e>\u0002v\u0003<\u001d `+h\u007f\u000b\u007f(4`\u0010%{sO\u001a\u001aH@\u001f;\u001b\u0019[\u00102\u00124EP\u0005,h\u007fNdG5sH:;\u0003\u0018I~-e/\u000bW%F\u0003(=zo*C@e4];a\u000e\u001fR\nF3Ew<\u0013r?'YJ$[Dd\u0018\u0014C8\u0018\u0019k}>\\3X\u0011\u001057gcy]V,\u0006\t\u0014\rj\rV\u00125WF-Ho8\u0012Aw\u000bSnQJmP\u0010\u0013ad U\u0004A7Q\u001b\u0015P(ݩ\u0019\u0017F\n\u0015%\u001eQ\n\u001f%i\\&`C\u001c\u001bȴYy`NM`N8bmq\u0012|z\u0002X\u0011vϡ\u007fw\u000b\u001f?/%edi'/w\u001aHrf=ݚ`1bwc`@PwF;8\u0011$ZreKߟX\u001dg:\"e\u001c\u0003\u0010.\f!,twj.kĲN\u0018tw|e]8,_jEa\u0007k<X\u0002jAHic>h\u0003z\"KTb3W/Na\u001fr\\V)bLx\u001c\u0010{r[T!@S\n\u001cb-a\u001fb\u0014V\r6Bo}Qwh}(~\u0003<T\to#\u0003\u001f\u0019P\u000bq m~H:\u0014x\"[B\u001aA'>m\"\u0017;-'\u0015\u000b\f\u007fuf\u0015SZ\u0005.u\u0004\u0003P\u001a(Ei/k W\u00187K\u001a-sM#kWL 1\u0013|(\u0010kl<o j\u001f-'ʋJ\u0018X%<\u000f^!,Ph\u000e\u0015yF)P,b\u0019wVI!\f\nBT8\u000b\"7\u001eS\u0002@2\u000b8ECU\u001eL\u0096\u0014ڏ\u0019euku2\bgϰ*\u0013"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\u0002.FC", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "/cS", "", "3kT:X5M", "", "7mS2k", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "3mbBe,\u001cO$zxb;\u0011", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,+O\"\u0001z", "AsP?g", "3mS", "@dc.\\5\u001aZ ", "Adc", "AnaA", "AnaA7,LQ\u0019\byb5~", "BqX:", ";h]\u0010T7:Q\u001d\u000e\u000f", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 16 : i2);
    }

    public MutableIntList(int i2) {
        super(i2, null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(int i2) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = i2;
        this._size++;
        return true;
    }

    public final void add(int i2, int i3) {
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(iArr, iArr, i2 + 1, i2, this._size);
        }
        iArr[i2] = i3;
        this._size++;
    }

    public final boolean addAll(int i2, int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(iArr, iArr, elements.length + i2, i2, this._size);
        }
        ArraysKt.copyInto$default(elements, iArr, i2, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int i2, IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        int[] iArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(iArr, iArr, elements._size + i2, i2, this._size);
        }
        ArraysKt.copyInto(elements.content, iArr, i2, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = mutableIntList._size;
        }
        mutableIntList.trim(i2);
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        if (this.content.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final void ensureCapacity(int i2) {
        int[] iArr = this.content;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final void plusAssign(int i2) {
        add(i2);
    }

    public final void minusAssign(int i2) {
        remove(i2);
    }

    public final boolean remove(int i2) {
        int iIndexOf = indexOf(i2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        for (int i3 : elements) {
            remove(i3);
        }
        return i2 != this._size;
    }

    public final boolean removeAll(IntList elements) {
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

    public final int removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        int[] iArr = this.content;
        int i3 = iArr[i2];
        if (i2 != this._size - 1) {
            ArraysKt.copyInto(iArr, iArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return i3;
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

    public final boolean retainAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        int[] iArr = this.content;
        int i3 = this._size - 1;
        while (true) {
            int i4 = -1;
            if (-1 >= i3) {
                break;
            }
            int i5 = iArr[i3];
            int length = elements.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == i5) {
                    i4 = i6;
                    break;
                }
                i6++;
            }
            if (i4 < 0) {
                removeAt(i3);
            }
            i3--;
        }
        return i2 != this._size;
    }

    public final boolean retainAll(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        int[] iArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!elements.contains(iArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final int set(int i2, int i3) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i2 + " must be between 0 .. " + (this._size - 1));
        }
        int[] iArr = this.content;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
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

    public final void minusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i2 : elements) {
            remove(i2);
        }
    }

    public final void minusAssign(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(iArr[i3]);
        }
    }
}
