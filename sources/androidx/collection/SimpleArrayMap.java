package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0006DLc\u0003İI\u00066\f6B\r(4\u0012}\u0007njG?LeN.ZS8\"s{:$c$\u007fCC٥\"}0\u0012WNm\u000fvJh\u0017K\u000f\f\u0016~~Bկ}zc܈\u001d1jqE2[om9\u000fuv$&F2N\b\u0007\u0019,:L\u0016u\u000bC\u0002È\"4FoJRCL\u001b\u0019@ß̧$\u0001,_(]<M|c@/1\u0007\u0002B|,ۢ4|[\u0013\u000fZ5\u001a\u000faL9\u0007K}(3b\u001b\u0007\u0001ko\u0007M\u0003U\u0005\u001fѧm?ʁwWDjH'#>g\r\f\u0003V`\u0013ex\f]*\u0016wׂT\u000e6\nC\n\u001bQ\u001c\u000e45x2;0~\b<8;\u0007\u001cQ^\u0019vB.\u000b\u0012<%=\u00185A8Ig\u0018ļ;adE\u0015\u001d\u000f4\"7mQ_b\u001fx\u0015QƘ>Κ1ҨD=VhRvK\t\u001cp\u0019\u0001Z\n>X\u00181\u0012\u0010\\\u0018U;iU;!\"\u0001\u000fXϼz\u0005n\u0006\u001c\u0014`fX\"55W2\u000f\fhc\r\u0007\u0002O\u000bW\\\u0017[-l\t\u0014\u0007A!\r{J==\u0010\u0015n/Ȍpܷa\n3L/=g\u000f\u0004\u000e\u0006>%G}lq1yR%\u0019o@p\u0016pfxͭ<^jJ:2voVwԞHN\u001a6zR\u007f@L,_\u001e\r\u0019V\u00146BwґOs˖l\u0010\ry{*\u0011\u0010<t7\u0006\u0017\\9\u0005u a,+eR1OeM\u0019\\Thgط\u0001%\r'\u0002%\u0010mZpdlD\u0006\u001c\u0010h)(ci/sП?\u00037]\u001a-sQ9y˛Q\u00125'E\u0017\u001dh\u00010}\u0007!o\\dx[gTMǱ'b\u00017 d6x(ZیKcb($\\W!\u001bYj\\h\u0011\u0013!65\u0011s({E-yگ-\u001a}\u0013?\u0015\u0018\\\u0018۰t\u000e+,4$}\u0006BbLn\u0013UkCS8\u007fʲ/B08\u0005\u0003xG1\fڇF\tB*{]O\u0015\tXNLA..j\u0015=%p\rܪ\u0001'̭\u00024<yr\u000fQ.,^q5AQax\u0006m\u0002Ō;N\u001d\u001e#{gmX0ݞ$Ve\u0014QC\u0014&06w:\u0013\tJ4<4ZAN\u001fͲXi\u0014<C\u001dT\u0013'\u0019HA*:\u0007\u0012b\ntV~γ\u0011In5B\u00015\u000ey2א91\u0013\u000b\u000fw=\u0017J\u0001\u0002-9\u001fx`\u0017f[ĽtXGO@X7\nuaQ~\u001a6:Fo\u0002Ãs\fFNE8PO39\b\u0010\u0010z>\n#U\u0013S\u0015z zjNX(E\u000fէ\u0012<\u0018GS\u001f]~\bb[Q\u0015\f\u007fI(:/DWAR\u0011,Y)h\u001e5c<yn\"R\u0014W\u0002@D\u001cÙ$'\u0012!qre\u0015~\u0012m\u001fJ\u0018\b\u0015\u0011\u00037\u001b'܃\u0010̛Nvz\n<\u0011\u0007[\u0010=\u001a\u0013\rdBկ-͛++tݩ\u0013Wv\u0005\"c\u001bhEά\u0017өj1^ҳӐ1\r"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u001b\u001fRv\u000e\u0018\u000421me\u001cBC", "\u0019", "$", "", ";`_", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\u001bOz\u0015<R2BU\u0012\b3xkq>", "1`_.V0Mg", "", "uH\u0018#", "/qa.l", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "6`b5X:", "", "Ahi2", "1kT.e", "", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "3mbBe,\u001cO$zxb;\u0011", ";h]6`<F1\u0015\nv\\0\f\u001d", "3pd._:", "=sW2e", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u001ce\u000b>T\u0015\u000f\u0002m\u0010\u0006\u0018/r\t$\u0003", "\"", "6`b566=S", "7mS2k\u0016?", "6`b5", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004d", "7mS2k\u0016?9\u0019\u0013", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7mS2k\u0016?<)\u0006\u0002", "7mS2k\u0016?D\u0015\u0006\u000b^", "-^a2f;KW\u0017\u000ez]j\u0001\u0012.e\u0013\u0012|1|\u001e'G", "7r4:c;R", "9dh\u000eg", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ">tc", ">tc\u000e_3", ">tc\u0016Y\b;a\u0019\b\n", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "@d\\<i,\u001ab", "@d_9T*>", "=kS#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010C", "Adc#T3NSt\u000e", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "BnBAe0GU", "", "D`[BX\bM", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public SimpleArrayMap(int i2) {
        int[] iArr;
        Object[] objArr;
        if (i2 == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i2];
        }
        this.hashes = iArr;
        if (i2 == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i2 << 1];
        }
        this.array = objArr;
    }

    public /* synthetic */ SimpleArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private final int indexOf(K k2, int i2) {
        int i3 = this.size;
        if (i3 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i3, i2);
        if (iBinarySearch < 0 || Intrinsics.areEqual(k2, this.array[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i4 = iBinarySearch + 1;
        while (i4 < i3 && this.hashes[i4] == i2) {
            if (Intrinsics.areEqual(k2, this.array[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iBinarySearch - 1; i5 >= 0 && this.hashes[i5] == i2; i5--) {
            if (Intrinsics.areEqual(k2, this.array[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    private final int indexOfNull() {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i2, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i3 = iBinarySearch + 1;
        while (i3 < i2 && this.hashes[i3] == 0) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearch - 1; i4 >= 0 && this.hashes[i4] == 0; i4--) {
            if (this.array[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int i2) {
        int i3 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i2 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
        }
        if (this.size != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k2) {
        return indexOfKey(k2) >= 0;
    }

    public int indexOfKey(K k2) {
        return k2 == null ? indexOfNull() : indexOf(k2, k2.hashCode());
    }

    public final int __restricted$indexOfValue(V v2) {
        int i2 = this.size * 2;
        Object[] objArr = this.array;
        if (v2 != null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (Intrinsics.areEqual(v2, objArr[i3])) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (objArr[i4] == null) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V v2) {
        return __restricted$indexOfValue(v2) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t2) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (T) this.array[(iIndexOfKey << 1) + 1] : t2;
    }

    public K keyAt(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        return (K) this.array[i2 << 1];
    }

    public V valueAt(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        return (V) this.array[(i2 << 1) + 1];
    }

    public V setValueAt(int i2, V v2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.array;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V put(K k2, V v2) {
        int i2 = this.size;
        int iHashCode = k2 != null ? k2.hashCode() : 0;
        int iIndexOf = k2 != null ? indexOf(k2, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i3 = (iIndexOf << 1) + 1;
            Object[] objArr = this.array;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i5 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.hashes;
            int i6 = i4 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.array;
            ArraysKt.copyInto(objArr2, objArr2, i6 << 1, i4 << 1, this.size << 1);
        }
        int i7 = this.size;
        if (i2 == i7) {
            int[] iArr3 = this.hashes;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.array;
                int i8 = i4 << 1;
                objArr3[i8] = k2;
                objArr3[i8 + 1] = v2;
                this.size = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i2 = map.size;
        ensureCapacity(this.size + i2);
        if (this.size != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(map.keyAt(i3), map.valueAt(i3));
            }
        } else if (i2 > 0) {
            ArraysKt.copyInto(map.hashes, this.hashes, 0, 0, i2);
            ArraysKt.copyInto(map.array, this.array, 0, 0, i2 << 1);
            this.size = i2;
        }
    }

    public V putIfAbsent(K k2, V v2) {
        V v3 = get(k2);
        return v3 == null ? put(k2, v2) : v3;
    }

    public V remove(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public boolean remove(K k2, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(v2, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public V removeAt(int i2) {
        if (!(i2 >= 0 && i2 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        Object[] objArr = this.array;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this.size;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.hashes;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                int i6 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                this.hashes = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.array, i6 << 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.array = objArrCopyOf;
                if (i4 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    ArraysKt.copyInto(iArr, this.hashes, 0, 0, i2);
                    ArraysKt.copyInto(objArr, this.array, 0, 0, i3);
                }
                if (i2 < i5) {
                    int i7 = i2 + 1;
                    ArraysKt.copyInto(iArr, this.hashes, i2, i7, i4);
                    ArraysKt.copyInto(objArr, this.array, i3, i7 << 1, i4 << 1);
                }
            } else {
                if (i2 < i5) {
                    int i8 = i2 + 1;
                    ArraysKt.copyInto(iArr, iArr, i2, i8, i4);
                    Object[] objArr2 = this.array;
                    ArraysKt.copyInto(objArr2, objArr2, i3, i8 << 1, i4 << 1);
                }
                Object[] objArr3 = this.array;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            }
            if (i4 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i5;
        }
        return v2;
    }

    public V replace(K k2, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v2);
        }
        return null;
    }

    public boolean replace(K k2, V v2, V v3) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(v2, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, v3);
        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i2 = this.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    K kKeyAt = keyAt(i3);
                    V vValueAt = valueAt(i3);
                    Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 == null && simpleArrayMap.containsKey(kKeyAt)) {
                        }
                        return false;
                    }
                    if (!Intrinsics.areEqual(vValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.size;
            for (int i5 = 0; i5 < i4; i5++) {
                K kKeyAt2 = keyAt(i5);
                V vValueAt2 = valueAt(i5);
                Object obj3 = ((Map) obj).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj3 == null && ((Map) obj).containsKey(kKeyAt2)) {
                    }
                    return false;
                }
                if (!Intrinsics.areEqual(vValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i2 = this.size;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i3);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i3);
            if (vValueAt == sb) {
                sb.append("(this Map)");
            } else {
                sb.append(vValueAt);
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public V get(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return (V) this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v2) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : v2;
    }
}
