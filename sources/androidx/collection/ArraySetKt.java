package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\u000b6B\r14\u0012}\u0007njG0LeN.ZS8\u0018sڔ<$i@yCAa\"}0ޛWNmrvJh\u0017K\u000f\f\u0016\u0011}:Im~m\u0014\u001f2\tqm4mqCʠnv|ӓ&JKFy\u001d\u0007*,X\u0010=|qL,\u00146ϋ~<\u0003\u001d[\b2\u001a\u0016B&\u007f.\\.PdL\r]\u00011ݭ\u0007iPS?\u0007>\u0003e\rt[G\u000f|ѭ,3h=E\u00175SI\u000f\u0001\\o\u000fMzU\rx+-*Ys\u001e>\u0007\u0001ZƄ1g2kx>\\3[\u0001\u000e-˃]ksV\u001e*\bzB\u0015j\u0005>\u00105SF3*h\u0018\u000ey|!_\u0007Б\bvf\u000e\by6E/ 51ݍ)nygK\u001b^7B\r;\u001fS\u0005|/sTTh[ÒZɐU1_OUf\\\u001aq=\u001c\u000b\u0011d\bÏ\u00128o\u0006?}!.]-e\\i'/|\u001aHrf=ݓx\u0007a{jHn!\u000f\u0018=ѧ\u0017\u0014\u0003Jt\u0007{P\u001b`Z\u0012} b\u001a\u0016\bA\u001f#ɼT83$fO\u0017p\u000bOc܃37\u000f=ip{\u000e\u001eA\r4{Ȣi(\u0007`\f,?jl%Zl̻a\u0014\u0003b8$BH1\u0018&|tX\u001a\u001eJE\u0002\u001eD,w!\u000b!\u000fҒ$Ze\u000b\u001fwZ\u0017\u001a\u001fV9ɴ\u0011qLz\u0019\u0003`\\7w\u0016yy0\u000bn:-\bY{Ө,Ɓ&hB\f;&\r\u000b\u0018G\u0016SgNrֵ\u0004]$&&\u001cIQuEA\u0010/-@\u001aEEzq,ʹS*H\t\u0016\u0012\u000firNi\u000eξ~4\tpZQd\u0017h~\rsS\u000er\u001a\u0012c\\yu~\u001bޭaV`\u0001\u001fq<|7\u001d\u0007%Ǉ3\t\u0018(\r7=Cm%DxZ٭\u001by\u0006w\rFy\u0011\u000eFvkֽ:k>urSm2\u0002@wZ/D0B\u0005\u0005XG\u0019\u00138F\u0017G%3v@+ݥnY[*G}\u0015\u0006L\u000fv£iB;u\u000e6>_p{q~DdQC)Oif\u001c\t\u0012ō\u0011b%\u0018+\u00141\u001d\u0011<?&݈ej16\u0016u(6\bC\u0011\u0006\u0003ɿ<K:] \u000bq^\n\b\u0016ÿ\u000eN\b\u0015'4Rs\u0002^<U?ֵ\\`,ngx!X\u000b\u001f\u00119ͨ\u0007=Y\u000b}Hd/*:/TM\u0015)sg\u0007v)1Cd9a0\u0007\u0002QԶc[n\u0010X\u001cGWw\fq\u0012Մ&\u0005EH(\u001dIQWg%1\u000f\u0015cofj\u0007\u0014vR\u0015*W\u000bAՅ\u0014T.\u001d.1O9w\u0003/Rϕ\u0006?k \u0011\u0019T)M\u0014+dv\u001f;*M-kH1̠-ٖ[SI# D.M\u001ctOfw\u0010lŊk#b\u001c\u0002\u0018r\u0002O\u001b~!42X\u0003\u000b\nt\u0010|П\bג\u0006\u0013lh\u0004\u001d/g?+\u001b\u0010bMnǍ\u0018k\u0015i~W\u001b\u0003-9\u0005z\u001f7^(!-]0#X!B?_fǆ\u0017\u0018+#N766\fI\u0012Uɪvx\u0014Uk\u000f;/22\u00102vܽ$\u0016C\b \u001c*\u001b05=\\צLl1b|Dg\u000e%rVe%\u001078\u0015~v]WӃ:лv\u001erTW%-ʺ%G\u000f\u0006Zف\u001c±%1Z̈\u05f6;]"}, d2 = {"\u000fQA\u000eL&,3\bxW:\u001a\\\u0003\u001dIt\b", "", "/qa.l\u001a>b\u0003\u007f", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006z", "\"", "D`[BX:", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u0010+\"du'\u0007r\u0002", "/cS\u000e_3\"\\(~\bg(\u0004", "", "\u0013", "/qa.l", "", "3kT:X5Ma", "", "/cS\u0016a;>`\"z\u0002", "3kT:X5M", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJr$Tk\"*v4\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\'!", "/k[<V\bK`\u0015\u0013\t", "Ahi2", "0h].e@,S\u0015\fxa\u0010\u0006\u0018/r\t$\u0003", "6`b5", "1kT.e\u0010Gb\u0019\f\u0004Z3", "1n]AT0Gat\u0006\u0002B5\f\t<n{/", "1n]AT0Ga|\b\n^9\u0006\u00056", "3mbBe,\u001cO$zxb;\u0011l8t\u007f5\u0005<\b", ";h]6`<F1\u0015\nv\\0\f\u001d", "3pd._:\"\\(~\bg(\u0004", "=sW2e", "", "6`b566=S|\b\n^9\u0006\u00056", "7mS2k\u0016?", "9dh", "7mS2k\u0016?7\"\u000ezk5x\u0010", "7mS2k\u0016?<)\u0006\u0002", "7r4:c;R7\"\u000ezk5x\u0010", "@d\\<i,\u001aZ b\u0004m,\n\u0012+l", "@d\\<i,\u001ab|\b\n^9\u0006\u00056", "7mS2k", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJr$Tk\"*v4\u000b=A\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002", "@d\\<i,\"\\(~\bg(\u0004", "@dc.\\5\u001aZ b\u0004m,\n\u0012+l", "BnBAe0GU|\b\n^9\u0006\u00056", "", "D`[BX\bM7\"\u000ezk5x\u0010", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t2 : values) {
            arraySet.add(t2);
        }
        return arraySet;
    }

    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i2);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i3 = arraySet.get_size$collection();
        if (i3 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(arraySet, i2);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(obj, arraySet.getArray$collection()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i4 = iBinarySearchInternal + 1;
        while (i4 < i3 && arraySet.getHashes$collection()[i4] == i2) {
            if (Intrinsics.areEqual(obj, arraySet.getArray$collection()[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iBinarySearchInternal - 1; i5 >= 0 && arraySet.getHashes$collection()[i5] == i2; i5--) {
            if (Intrinsics.areEqual(obj, arraySet.getArray$collection()[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i2]);
        arraySet.setArray$collection(new Object[i2]);
    }

    public static final <E> void clearInternal(ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i3 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i2) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i2);
            if (arraySet.get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, (Object) null);
            }
        }
        if (arraySet.get_size$collection() != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsInternal(ArraySet<E> arraySet, E e2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return arraySet.indexOf(e2) >= 0;
    }

    public static final <E> int indexOfInternal(ArraySet<E> arraySet, Object obj) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> E valueAtInternal(ArraySet<E> arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i2];
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> boolean addInternal(ArraySet<E> arraySet, E e2) {
        int iHashCode;
        int iIndexOf;
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i2 = arraySet.get_size$collection();
        if (e2 == null) {
            iIndexOf = indexOfNull(arraySet);
            iHashCode = 0;
        } else {
            iHashCode = e2.hashCode();
            iIndexOf = indexOf(arraySet, e2, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= arraySet.getHashes$collection().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i4);
            if (i2 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(arraySet.getHashes$collection().length == 0)) {
                ArraysKt.copyInto$default(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                ArraysKt.copyInto$default(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            ArraysKt.copyInto(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i5, i3, i2);
            ArraysKt.copyInto(arraySet.getArray$collection(), arraySet.getArray$collection(), i5, i3, i2);
        }
        if (i2 != arraySet.get_size$collection() || i3 >= arraySet.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes$collection()[i3] = iHashCode;
        arraySet.getArray$collection()[i3] = e2;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void addAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i2);
        if (arraySet.get_size$collection() != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                arraySet.add(array.valueAt(i3));
            }
            return;
        }
        if (i2 > 0) {
            ArraysKt.copyInto$default(array.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i2, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i2, 6, (Object) null);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i2);
        }
    }

    public static final <E> boolean removeInternal(ArraySet<E> arraySet, E e2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int iIndexOf = arraySet.indexOf(e2);
        if (iIndexOf < 0) {
            return false;
        }
        arraySet.removeAt(iIndexOf);
        return true;
    }

    public static final <E> E removeAtInternal(ArraySet<E> arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i3 = arraySet.get_size$collection();
        E e2 = (E) arraySet.getArray$collection()[i2];
        if (i3 <= 1) {
            arraySet.clear();
        } else {
            int i4 = i3 - 1;
            if (arraySet.getHashes$collection().length > 8 && arraySet.get_size$collection() < arraySet.getHashes$collection().length / 3) {
                int i5 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
                int[] hashes$collection = arraySet.getHashes$collection();
                Object[] array$collection = arraySet.getArray$collection();
                allocArrays(arraySet, i5);
                if (i2 > 0) {
                    ArraysKt.copyInto$default(hashes$collection, arraySet.getHashes$collection(), 0, 0, i2, 6, (Object) null);
                    ArraysKt.copyInto$default(array$collection, arraySet.getArray$collection(), 0, 0, i2, 6, (Object) null);
                }
                if (i2 < i4) {
                    int i6 = i2 + 1;
                    ArraysKt.copyInto(hashes$collection, arraySet.getHashes$collection(), i2, i6, i3);
                    ArraysKt.copyInto(array$collection, arraySet.getArray$collection(), i2, i6, i3);
                }
            } else {
                if (i2 < i4) {
                    int i7 = i2 + 1;
                    ArraysKt.copyInto(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i2, i7, i3);
                    ArraysKt.copyInto(arraySet.getArray$collection(), arraySet.getArray$collection(), i2, i7, i3);
                }
                arraySet.getArray$collection()[i4] = null;
            }
            if (i3 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i4);
        }
        return e2;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = array.get_size$collection();
        int i3 = arraySet.get_size$collection();
        for (int i4 = 0; i4 < i2; i4++) {
            arraySet.remove(array.valueAt(i4));
        }
        return i3 != arraySet.get_size$collection();
    }

    public static final <E> boolean equalsInternal(ArraySet<E> arraySet, Object obj) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = arraySet.get_size$collection();
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) obj).contains(arraySet.valueAt(i3))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i2 = arraySet.get_size$collection();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += hashes$collection[i4];
        }
        return i3;
    }

    public static final <E> String toStringInternal(ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(arraySet.get_size$collection() * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = arraySet.get_size$collection();
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            E eValueAt = arraySet.valueAt(i3);
            if (eValueAt != arraySet) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final <E> boolean addAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        ?? r1 = 0;
        while (it.hasNext()) {
            int i2 = (-1) - (((-1) - r1) & ((-1) - (arraySet.add(it.next()) ? 1 : 0)));
            r1 = 1;
            if (i2 != 1) {
                r1 = 0;
            }
        }
        return r1;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= arraySet.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        for (int i2 = arraySet.get_size$collection() - 1; -1 < i2; i2--) {
            if (!CollectionsKt.contains(elements, arraySet.getArray$collection()[i2])) {
                arraySet.removeAt(i2);
                z2 = true;
            }
        }
        return z2;
    }
}
