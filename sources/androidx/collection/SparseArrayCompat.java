package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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
/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&˛\bDR{|İI\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nj?2LeVAZS0\u000fs{B3c$\u007fّCU }*\t]Nogtgb\u000bQ\u001b\u000e\u0016~j2]kތ\u0006\u0014\u0015˰Pno3{o}HfyF\u000b&209\u0012\u0005/\u001cݵL\u0010\u0005}\ff\u001a\"H@\u001fK\u0003\u0011[\u00172\u00124@P\u0005,o\u007fNlԟ3qƠ3#\u0011}\u000bT5tH|{\u001e\rho\u0019\u0005w61P9E\u0015[م1ޗ\u0019o\b\u0011M\tU\u0005\u0017,W/W\u0006o6\u0007\u0002Z)sb\u001bu\u000b&\u000b\n\u0002d\u001a:CO\u001a֟\u0017\"߭{z\n&\u0005\u0012\u001c ?H\\>Jj\u0016 Kt!U\u0007eJtP\u001b\u0013cL\u0016[Įc/G-~Q\u0010=_ע7߉\t\r,?I\n/vl\u000e\u0017ٽKX\u0006cIQn?xR\u0018vUm:͏)\u0016ò\b0U\u001ew\n\u001fM/%e]i'/}\u001aHri=\u0019){a\njHn$\u001f\u001aE=!\f\u0011ե+\u0019\u07fbTTfMYS*Z\u001f}6\u0018fp@J/G(N}j\u001an[\u0001\"%]h}m7\u0007\u001c{Q^aF\u0002g\u001esjvBAlf\u0013k~B\nێ!p͈&2V~X\u000e\nif\fACo}*ZD9)`\u001bG\u0013\u001exˆ+ȁ&n1-\r{K&\u0019hZڏ9\u0005^n\to\u0016zy0\u000bs:-wٛ{-łY\"vRE1\u0015'\f\u007fux|KZ~.u\u0004}f*bQ_WU\u0013=\u0004Y6\u0010?]L!g\u0002S :\u0013~\u0010\u000eivt{Px~Uxjx`\u0005\u001b0\u001avrQ\n+\u0014BwT%_c\u0003\u001c\fBW\u0016\u001bYjPh\u0001\u0013*6%/qh\u0011}JQR5\u0018\u000e\u0013e֒\u0012aw\u0002Fy\u0011\u0011Vxs\u0017DcL˱)eЄ6;Fg\"\"LM<l1Gxn\u0006\u001aZ\tb\u000fcLO\u0011\tVnԇ;3\f\u0014\u001f,Cߞ\u001doǈ\u0017o\fbvz8#[}Bos)\u001fpkg\u001co{`\u0019]'\nA֊w\u0003݁ =.j h\u0017;\u001esF8\bO+\u000bJ9<4ZmN\u001f\fgw8(z6ʋ\u0010\u0013%UZsiXThܢ`VV!1Un%B\u0001-\u0014iͨ7߶\b܌yܑX/kѢQb+\u000f3j}\u0004\u001djŠHXQ\u001d._\u000f\u0013\u0016mQR\u001a62Q_Ԗ*ƑbՆ$Ԡ!B Ç\na\u001fj\u000f0\r\r\f̤\rІMԥrŽR\"1ͦK\u0017\u001cH\"\u0017\u001b\u001d_t\u0006a[Z|\u0005mƑX݅mׯ5ܰ\u0010~kF)<ދ9`"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\"\u0013T}\u000e\u0018\u000421m[*?x\u0012=#", "\u0013", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5`a/T.>", "", "7r4:c;R", "5dc\u0016f\fF^(\u0013", "u(I", "9dh@", "", "Ahi2", "D`[BX:", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/o_2a+", "", "9dh", "D`[BX", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "1kT.e", "1k^;X", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "2d[2g,", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "2dU.h3MD\u0015\u0006\u000b^", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "7mS2k\u0016?9\u0019\u0013", "7mS2k\u0016?D\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "9dh\u000eg", "7mS2k", ">tc", ">tc\u000e_3", "=sW2e", ">tc\u0016Y\b;a\u0019\b\n", "@d\\<i,", "@d\\<i,\u001ab", "@d\\<i,\u001ab\u0006z\u0004`,", "@d_9T*>", "=kS#T3NS", "<df#T3NS", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00118", "Adc#T3NSt\u000e", "BnBAe0GU", "", "D`[BX\bM", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public SparseArrayCompat(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    public /* synthetic */ SparseArrayCompat(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 10 : i2);
    }

    /* JADX INFO: renamed from: clone */
    public SparseArrayCompat<E> m371clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i2) {
        return (E) SparseArrayCompatKt.commonGet(this, i2);
    }

    public E get(int i2, E e2) {
        return (E) SparseArrayCompatKt.commonGet(this, i2, e2);
    }

    @Deprecated(message = "\u0004R\u00056\u00054\u001bfj\u0007:\u007f]$BS$U\u0017;M6", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    @InterfaceC1492Gx
    public void delete(int i2) {
        remove(i2);
    }

    public void remove(int i2) {
        SparseArrayCompatKt.commonRemove(this, i2);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public boolean remove(int i2, Object obj) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int i2) {
        if (this.values[i2] != SparseArrayCompatKt.DELETED) {
            this.values[i2] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i2, int i3) {
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            removeAt(i2);
            i2++;
        }
    }

    public E replace(int i2, E e2) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e3 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e2;
        return e3;
    }

    public boolean replace(int i2, E e2, E e3) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(this.values[iIndexOfKey], e2)) {
            return false;
        }
        this.values[iIndexOfKey] = e3;
        return true;
    }

    public void put(int i2, E e2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e2;
            return;
        }
        int i3 = ~iBinarySearch;
        if (i3 < this.size && this.values[i3] == SparseArrayCompatKt.DELETED) {
            this.keys[i3] = i2;
            this.values[i3] = e2;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i5 = this.size;
        if (i5 - i3 != 0) {
            int[] iArr = this.keys;
            int i6 = i3 + 1;
            ArraysKt.copyInto(iArr, iArr, i6, i3, i5);
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i6, i3, this.size);
        }
        this.keys[i3] = i2;
        this.values[i3] = e2;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = other.keyAt(i2);
            E eValueAt = other.valueAt(i2);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 < this.size && this.values[i3] == SparseArrayCompatKt.DELETED) {
                    this.keys[i3] = iKeyAt;
                    this.values[i3] = eValueAt;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i4 = this.size;
                    if (i4 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        this.values = objArrCopyOf;
                    }
                    int i5 = this.size;
                    if (i5 - i3 != 0) {
                        int[] iArr = this.keys;
                        int i6 = i3 + 1;
                        ArraysKt.copyInto(iArr, iArr, i6, i3, i5);
                        Object[] objArr = this.values;
                        ArraysKt.copyInto(objArr, objArr, i6, i3, this.size);
                    }
                    this.keys[i3] = iKeyAt;
                    this.values[i3] = eValueAt;
                    this.size++;
                }
            }
        }
    }

    public E putIfAbsent(int i2, E e2) {
        E e3 = (E) SparseArrayCompatKt.commonGet(this, i2);
        if (e3 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = e2;
            } else {
                int i3 = ~iBinarySearch;
                if (i3 < this.size && this.values[i3] == SparseArrayCompatKt.DELETED) {
                    this.keys[i3] = i2;
                    this.values[i3] = e2;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
                    }
                    int i4 = this.size;
                    if (i4 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        this.values = objArrCopyOf;
                    }
                    int i5 = this.size;
                    if (i5 - i3 != 0) {
                        int[] iArr = this.keys;
                        int i6 = i3 + 1;
                        ArraysKt.copyInto(iArr, iArr, i6, i3, i5);
                        Object[] objArr = this.values;
                        ArraysKt.copyInto(objArr, objArr, i6, i3, this.size);
                    }
                    this.keys[i3] = i2;
                    this.values[i3] = e2;
                    this.size++;
                }
            }
        }
        return e3;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i2];
    }

    public E valueAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return (E) this.values[i2];
    }

    public void setValueAt(int i2, E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i2] = e2;
    }

    public int indexOfKey(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
    }

    public int indexOfValue(E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.values[i3] == e2) {
                return i3;
            }
        }
        return -1;
    }

    public boolean containsKey(int i2) {
        return indexOfKey(i2) >= 0;
    }

    public boolean containsValue(E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i2 = this.size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (this.values[i3] == e2) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
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

    public void append(int i2, E e2) {
        int i3 = this.size;
        if (i3 != 0 && i2 <= this.keys[i3 - 1]) {
            put(i2, e2);
            return;
        }
        if (this.garbage && i3 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i4] = i2;
        this.values[i4] = e2;
        this.size = i4 + 1;
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
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }
}
