package androidx.compose.ui.text.caches;

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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0006DLc\u0003İIي8\u000b<H\u0007\"2\u0018\u007f\u0007t}AӄLeV=ZS0\u0012s{B$cҕyCI^\"}(.WNusvJ`\u000bIƤ\u001cǝ!l2կcw\u0006\u0014\u00151Poo3{p}Hf\nF\u000b&20:\u0012\u0005/\u001dݵL\u0010\u0005~\u0004f\u0012&@R~?j\u001b]\u0007*\u0012<̄0\u0003.\\\u001eMLG\u001bҗƠ3#\u0011o\u000bR5rH|{!\u000fe5\"\u000faLAp;C,=S9ޗқ_?\u0011W:N\u0013\u0002?'Y_$[Dr\u0018\u0014K*̠\u0011]\u0001>%\u0011_{$'Yc\u0014O^*@w)~UM\u0012+\u001e'vD] t&&5\u000bq\u0002A\u0017س^\u000b\u0016\t\u0001N\u0019;~i*i\u001fthy;O\u05cb}ޭ\u0005ڟ\"#\u000f\u000fitb/x\u0015QS(U?hX=~ݐ:]K\u0010\u001cp\u0019\u0001ò\b0U#w\u0002\u001fR/%e^\u007f7i\u0002\u0010m\\g%\b\u0011la\u0001jHn#\u001f\u001aEP!\f\tG+\u00074^b\u007fD\u0011{\u001f\u0005\r\f\u001f+\"rvj\"m\u0016\\w\u0001i\u0019P$\fmDt`qn\u001a\u0011\b=lMMQ\u001a\u000f(\u05ecλ\u0018AB\r\u0013\u0004/Fa8r\\V8zYx=\u0010{z\u0088<\u0017@m\n\u001cb/֞\u001d\\#wK9Pq\u0015\u000buY\u001f\u000f/XA;\u001biZڏ9\u0005^v\to\u001ewͅ0|nEu]_f1&\u00046\u0019H\u000bU\u001f\u000f\u0004\u0004Mf\\G\u0003˾&y[z0\u0016P8\u007fǽ\u0006.\u001d2A4\u0018,{K#i_d*'1۠*\u0013I\u0003Fg>iҔ0`xm\u0018g%V\u000f`\t\">c0}o]\u0013G\u001aҺߏ_>W\u0013KrJ\u0003P|35N)\u000f\u0007:|kԆs++0\u0010\u0014e\u0014˸ai}cBu\u001d\\\rg\u001a+\u001a\u0015 f_\fJ;fL˕\u0003>0S5\u001eP\u007f\u0003y\u001eA?3=7VX|p\rЕ}\u000f=\u0018~\u0007b\f\u0080Z[H68\u001fBew*\"Y.\u0018lZ=\u0011\u0004ω\u0018q{\u0004t\u000b\u0001\u000e:\u000f\nj\u0007\u0012R<֕ZWpCx\u001f\u0002SNAqa5@\u0017RL,j\u000b;Gb\u0004\u001e\u00101~ʮc\u000f%n\u000byI\u0014&T'\u001b\u001d\\MqS 9*7}?7,'M13pܑX/qaQk+\u00103j}\u0002=ތ7\u05ffXE#ιp\u0003\u0011MkLi\u0004<\u000eU->w}\u0017P\u0018+)\u0019ȳ'ʦU\u0011gڻ\u0001t\u0019b|Vtz\"hhMP*-\tSɝH\u009f\u0013\r!O\u0001~3BZ^\u00107q\u001d7\\ؐ-\u0011\u001c~iW)?\u001e73MWs͈+<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\f8t(5gG\u000e;u!5M\u001fHx02|dl\u000f", "\u0019", "$", "", "1`_.V0Mg", "", "uH\u0018#", ";`_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W:r#8Y\fi%q\u001e9TC\u0017xA\u001a)P]D\\'\u001d", "-rXGX", "5dc,f0SS", "u(8", "Adc,f0SS", "6`b5X:", "", "9dh#T3NS'", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ahi2", "Ahi2\u0017(G\\#\u000evm0\u0007\u0012=", "u(E", "1kT.e", "", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "3mbBe,\u001cO$zxb;\u0011", ";h]6`<F1\u0015\nv\\0\f\u001d", "3pd._:", "=sW2e", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "6`b566=S", "7mS2k\u0016?", "6`b5", "7mS2k\u0016?9\u0019\u0013", "7mS2k\u0016?<)\u0006\u0002", "7mS2k\u0016?D\u0015\u0006\u000b^", "7mS2k\u0016?D\u0015\u0006\u000b^j\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "9dh\u000eg", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ">tc", ">tc\u000e_3", "/qa.l", ">tc\u0016Y\b;a\u0019\b\n", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "@d\\<i,\u001ab", "@d_9T*>", "=kS#T3NS", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010C", "Adc#T3NSt\u000e", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "BnBAe0GU", "", "D`[BX\bM", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SimpleArrayMap<K, V> {
    public static final int $stable = 8;
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    protected final int get_size() {
        return this._size;
    }

    protected final void set_size(int i2) {
        this._size = i2;
    }

    public final int size() {
        return this._size;
    }

    protected final int indexOf(Object obj, int i2) {
        int i3 = this._size;
        if (i3 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i3, i2);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(obj, this.keyValues[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i4 = iBinarySearchInternal + 1;
        while (i4 < i3 && this.hashes[i4] == i2) {
            if (Intrinsics.areEqual(obj, this.keyValues[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iBinarySearchInternal - 1; i5 >= 0 && this.hashes[i5] == i2; i5--) {
            if (Intrinsics.areEqual(obj, this.keyValues[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    protected final int indexOfNull() {
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i2, 0);
        if (iBinarySearchInternal < 0 || this.keyValues[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i3 = iBinarySearchInternal + 1;
        while (i3 < i2 && this.hashes[i3] == 0) {
            if (this.keyValues[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchInternal - 1; i4 >= 0 && this.hashes[i4] == 0; i4--) {
            if (this.keyValues[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public SimpleArrayMap(int i2) {
        if (i2 == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i2];
            this.keyValues = new Object[i2 << 1];
        }
        this._size = 0;
    }

    public /* synthetic */ SimpleArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int i2) {
        int i3 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i2 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
        }
        if (this._size != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K k2) {
        return indexOfKey(k2) >= 0;
    }

    public final int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public final int indexOfValue$ui_text_release(V v2) {
        int i2 = this._size << 1;
        Object[] objArr = this.keyValues;
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

    public final boolean containsValue(V v2) {
        return indexOfValue$ui_text_release(v2) >= 0;
    }

    public final V get(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return (V) this.keyValues[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k2, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        return iIndexOfKey >= 0 ? (V) this.keyValues[(iIndexOfKey << 1) + 1] : v2;
    }

    public final K keyAt(int i2) {
        return (K) this.keyValues[i2 << 1];
    }

    public final V valueAt(int i2) {
        return (V) this.keyValues[(i2 << 1) + 1];
    }

    public final V setValueAt(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.keyValues;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    public final V put(K k2, V v2) {
        int iHashCode;
        int iIndexOf;
        int i2 = this._size;
        if (k2 == null) {
            iIndexOf = indexOfNull();
            iHashCode = 0;
        } else {
            iHashCode = k2.hashCode();
            iIndexOf = indexOf(k2, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i3 = (iIndexOf << 1) + 1;
            Object[] objArr = this.keyValues;
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
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i5 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i2 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.hashes;
            int i6 = i4 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.keyValues;
            ArraysKt.copyInto(objArr2, objArr2, i6 << 1, i4 << 1, this._size << 1);
        }
        int i7 = this._size;
        if (i2 == i7) {
            int[] iArr3 = this.hashes;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i8 = i4 << 1;
                objArr3[i8] = k2;
                objArr3[i8 + 1] = v2;
                this._size = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i2 = simpleArrayMap._size;
        ensureCapacity(this._size + i2);
        if (this._size != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(simpleArrayMap.keyAt(i3), simpleArrayMap.valueAt(i3));
            }
        } else if (i2 > 0) {
            ArraysKt.copyInto(simpleArrayMap.hashes, this.hashes, 0, 0, i2);
            ArraysKt.copyInto(simpleArrayMap.keyValues, this.keyValues, 0, 0, i2 << 1);
            this._size = i2;
        }
    }

    public final V putIfAbsent(K k2, V v2) {
        V v3 = get(k2);
        return v3 == null ? put(k2, v2) : v3;
    }

    public final V remove(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public final boolean remove(K k2, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(v2, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final V removeAt(int i2) {
        Object[] objArr = this.keyValues;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this._size;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.hashes;
            if (iArr.length > 8 && i4 < iArr.length / 3) {
                int i6 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] iArr2 = new int[i6];
                this.hashes = iArr2;
                this.keyValues = new Object[i6 << 1];
                if (i2 > 0) {
                    ArraysKt.copyInto(iArr, iArr2, 0, 0, i2);
                    ArraysKt.copyInto(objArr, this.keyValues, 0, 0, i3);
                }
                if (i2 < i5) {
                    int i7 = i2 + 1;
                    ArraysKt.copyInto(iArr, this.hashes, i2, i7, i4);
                    ArraysKt.copyInto(objArr, this.keyValues, i3, i7 << 1, i4 << 1);
                }
            } else {
                if (i2 < i5) {
                    int i8 = i2 + 1;
                    ArraysKt.copyInto(iArr, iArr, i2, i8, i4);
                    Object[] objArr2 = this.keyValues;
                    ArraysKt.copyInto(objArr2, objArr2, i3, i8 << 1, i4 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            }
            if (i4 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i5;
        }
        return v2;
    }

    public final V replace(K k2, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v2);
        }
        return null;
    }

    public final boolean replace(K k2, V v2, V v3) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != v2) {
            return false;
        }
        setValueAt(iIndexOfKey, v3);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i2 = this._size;
                if (i2 != simpleArrayMap._size) {
                    return false;
                }
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
            if (!(obj instanceof Map) || this._size != ((Map) obj).size()) {
                return false;
            }
            int i4 = this._size;
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
        Object[] objArr = this.keyValues;
        int i2 = this._size;
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
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i3);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i3);
            if (vValueAt == this) {
                sb.append("(this Map)");
            } else {
                sb.append(vValueAt);
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
