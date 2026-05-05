package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDR{|İI\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nʑA0RyP.XS2\u000fy\u000b<$iҕyCAU\"}0\tWȞog|Qb\u000bI-\u000e\u0016\u0007v4I[yc&%˰jqE\u074c[nm9\u000ftv\u0014&72>\u007f\u0005\u000f\u001bBH>xټGK\u001a\u0015x[~Gj\r{\u0013J\u0016\u0014M8\u0001Ll\u0018RDY\u0005]pǂi\u0017ݦFN5qx\u0003[ ^TU\u001b=uf7NKM\u001b5U\u0013\u0007\t¹mš\u0006\u0006\u0006\u0013v<?+wx\b:f\u000f,\u0015Y_Sq;9j\u001bi`:,[Sq\\h\u000e^»A\u0010Ɂ@\u0004\u001c\u001doV<E2f6\u001ccx\u0001bXP0n\t\u0015CwD0=\u0002I*oӕ\u0017UoJ1Ne\fKړ\u001eţ\u0005n/u\u001d)n.3T.\u0383aUNL`N8imq\u0012\fz\u0002`ʶv[Ĭ3{\u001fJ_3ExQ#Om2LRv\u000f\u0005\u000fx\u001a}\u001b[N@\u0007\u0016e,9\u0010hU|\u0005\"¬\u001bl¯\u0015M*sO\u0004\u001638\\&Ag9X\\]\n\u0002j{m:)=\tOY\u001dmTk\u0002yAXic>o\u0003z\"NTb3h\u0017Fa\u001dr\\^ίx\\н\u0014w\nV\u0017\"!VWqJB\\='\u0002-P\u0013\"H@\r\t\u0016ʳ\u0017ɭEh{A\u0011\u0010<v\u001f\u007f\u0007ʔ!su\ba,+pR1ObM\u0019\\Şh|ط\u0001#\u0015\u001b<\u000eU\u000fdGzzFyc\u000b8\u0016HI\u0018C\u0006.\u001d&A202uP\u0001tiM@7+\u0001\b ShdԖN~Ҕ0`xr\u0018b%K\u000f^!18h\u000e\u001cyF)I*hSxLs\u000b\u0005o;\u0005˻-\t--=\u0001\u001e2-9;T?\u001dLߐZCֵe]w\fv\u001dp9>t\u0014\t\\g$~zQ\fBk<W\u0005\u0017>Xغ\u001d\u0007Pt\u0003w>ȷOH٢7HO\u00129qF{#/,t70\u001b\u0013n[h\u0015 \u0002B?w**ʕD(ڎG%\u001f|\u001cm{uc\\9LU\u001eS\u0002?\u001f*\u001ckQ\u001dk+\u001c>8\f\u0018l\u05cdkf\u0013^!$b.\u0003\u001cդGTw9`\u000b\u000eJw\u000fE7xƽyٙd\u058c\u0005חZH\rݺ\u0016p/0\u0019~=:T֭s̍[։Rߟ3c:ܬ$-\u0017#\u0003O-h[Ľ\u0003Ǵ\u0010Ћ4\u0092\u0005\u000bM؏\u0014c\u0010?\u001cO9q{q\"7F\bKLNÇwܱg٥\u0003ҍb\r]d\\pʣ\u0016\u001b"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "\u0013", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5`a/T.>", "", "9dh@", "", "Ahi2", "D`[BX:", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/o_2a+", "", "9dh", "", "D`[BX", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "1kT.e", "1k^;X", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "2d[2g,", "5dc", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "2dU.h3MD\u0015\u0006\u000b^", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "7mS2k\u0016?9\u0019\u0013", "7mS2k\u0016?D\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "9dh\u000eg", "7mS2k", ">tc", ">tc\u000e_3", "=sW2e", ">tc\u0016Y\b;a\u0019\b\n", "@d\\<i,", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "@d\\<i,\u001ab", "@d_9T*>", "=kS#T3NS", "<df#T3NS", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00118", "Adc#T3NSt\u000e", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "BnBAe0GU", "", "D`[BX\bM", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public LongSparseArray(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i2);
            this.keys = new long[iIdealLongArraySize];
            this.values = new Object[iIdealLongArraySize];
        }
    }

    public /* synthetic */ LongSparseArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 10 : i2);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m370clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) objClone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[iBinarySearch];
    }

    public E get(long j2, E e2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
        return (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) ? e2 : (E) this.values[iBinarySearch];
    }

    @Deprecated(message = "\u0004R\u00056\u00054\u001bfj\u0007(\rU\";da\u0014\u0014,\u001e1\f ", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    @InterfaceC1492Gx
    public void delete(long j2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void remove(long j2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public boolean remove(long j2, E e2) {
        int iIndexOfKey = indexOfKey(j2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(e2, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int i2) {
        if (this.values[i2] != LongSparseArrayKt.DELETED) {
            this.values[i2] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public E replace(long j2, E e2) {
        int iIndexOfKey = indexOfKey(j2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e3 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e2;
        return e3;
    }

    public boolean replace(long j2, E e2, E e3) {
        int iIndexOfKey = indexOfKey(j2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(this.values[iIndexOfKey], e2)) {
            return false;
        }
        this.values[iIndexOfKey] = e3;
        return true;
    }

    public void put(long j2, E e2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e2;
            return;
        }
        int i2 = ~iBinarySearch;
        if (i2 < this.size && this.values[i2] == LongSparseArrayKt.DELETED) {
            this.keys[i2] = j2;
            this.values[i2] = e2;
            return;
        }
        if (this.garbage) {
            int i3 = this.size;
            long[] jArr = this.keys;
            if (i3 >= jArr.length) {
                Object[] objArr = this.values;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = objArr[i5];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr[i4] = obj;
                            objArr[i5] = null;
                        }
                        i4++;
                    }
                }
                this.garbage = false;
                this.size = i4;
                i2 = ~ContainerHelpersKt.binarySearch(this.keys, i4, j2);
            }
        }
        int i6 = this.size;
        if (i6 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i6 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i7 = this.size;
        if (i7 - i2 != 0) {
            long[] jArr2 = this.keys;
            int i8 = i2 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i8, i2, i7);
            Object[] objArr2 = this.values;
            ArraysKt.copyInto(objArr2, objArr2, i8, i2, this.size);
        }
        this.keys[i2] = j2;
        this.values[i2] = e2;
        this.size++;
    }

    public void putAll(LongSparseArray<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    public E putIfAbsent(long j2, E e2) {
        E e3 = get(j2);
        if (e3 == null) {
            put(j2, e2);
        }
        return e3;
    }

    public int size() {
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i2) {
        if (!(i2 >= 0 && i2 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (this.garbage) {
            int i3 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
        }
        return this.keys[i2];
    }

    public E valueAt(int i2) {
        if (!(i2 >= 0 && i2 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (this.garbage) {
            int i3 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
        }
        return (E) this.values[i2];
    }

    public void setValueAt(int i2, E e2) {
        if (!(i2 >= 0 && i2 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        if (this.garbage) {
            int i3 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
        }
        this.values[i2] = e2;
    }

    public int indexOfKey(long j2) {
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j2);
    }

    public int indexOfValue(E e2) {
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.values[i6] == e2) {
                return i6;
            }
        }
        return -1;
    }

    public boolean containsKey(long j2) {
        return indexOfKey(j2) >= 0;
    }

    public boolean containsValue(E e2) {
        return indexOfValue(e2) >= 0;
    }

    public void clear() {
        int i2 = this.size;
        Object[] objArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(long j2, E e2) {
        int i2 = this.size;
        if (i2 != 0 && j2 <= this.keys[i2 - 1]) {
            put(j2, e2);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                Object[] objArr = this.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
            }
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i5] = j2;
        this.values[i5] = e2;
        this.size = i5 + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i3));
            sb.append('=');
            E eValueAt = valueAt(i3);
            if (eValueAt != sb) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
