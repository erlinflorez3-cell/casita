package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006#nj?0LeV=ZS8şs{:)c$\u007fLCU }*\t]NogtYb\u000bY\u000f\u000e\u0016~s4Ikxe\u0012%2JoELStSʠ~C^\u0007&݅07*\u000b\u0011\u001c:HVu)C\u0004\u000b`pMvNb\u0011[\u00062\u00124@ŋ\u0005\u001ejj\u000f;N\u0001Һ>/1\u0007*UT;o:\u000bR%Ld)\u001dv\u0018ӜYF˝9\u00153ZK\u001a`lW\u0003m\u0004m\tv:?+\u007f֕\u001eJݼ\u0004\u0014#?\u0018(k\u0004>\\3f\u0011\u00105AgcyR>,\u0006\u000e\u0014\rrǉT\u001aόL.;1/$\u001cK\rr\u0002R\u0001\u0006lX\u0018z\u00108G/\u000e8C?+haaqϊ|=B\u0019U21\u0019\u0007!\nf>j# l}a3a@sʰ|\u0010 Q6\u0015~{\u001a*2Ew\u0004=\u000f).M¦ھ_91;4\u0013V_\u007fv3u\u0019Wwe`@XÂގ;*\u0017&#Jr!\u0004P\u0003mr%\u00160b$\u0016\bA2\r{J4=\u0010\u0005и/Ƞjܷa\n3C/Sg\r\u0004\u000e\u0006N\u000f7Cp{\u0010\u0010T'\u001eMAz\u000bhhRSBȗ\u000b.h2\u0011x\u001e\u0018\u0014D|!C6M\u001344Z3_\\]V\u0011@ZA+\u000b\u0010^v&\u0017Ta&Iil\u0003\u0017$h\\\u001f\u0005\u0018|WP\u0015`P/\bQ}44z:hb\u000fS\u0017\r\u001a\u0018SwNWL#ֵ\u0006W\f D,gxuˎ\u0019W\b7Z\u001a-{ɣȌiQ[;o\u0006\u000b$'=~-\u001eōϡt,n\u0014\u0013cbB:v\u0015аS\fr\u0016\u0012at|\u000eϡTߏ_>W\u001fKgJ{P|3!N)\u000f\u0006:|c/\n'e)\u0006BG\u0015\u0010_\u001as<\rz\u000f\\۩,\u0018Нg\u0016}\u0012\u001aq@kPI\u0010˚n&2\f\u001bBvl>٨Hީ8\rAt\ns~uPM91.j\u0015B%p\u0005]\u0001ܨuF\u007f<\u0011Bsq\u0013D\u001bQW)\u0006cx}|y^\u05c8N\u0019\u0010?\f7tG,?&\\}n\u0019I\u0016\u000b(:Q=x\u0004j\u0013R=ʙ@\u0012\u0011wdo\fE\u000b\u0002Le5\u001cBD\u0004;\u0005#\u0003,#Ƈ߃\t`K\u0017i0\u000f6'3L\u000b{EMvT\rGchܬӘ!\t)\u0014\u0018\u0012t^CD\u0003;K,f\u0014#E\u0014ŝ\u0010\u0016\u0530\bG7\u001d4z\u001ar0~3ANÇʦU\u0011m xl\u0019\u0011|N\u0013xBj`d:)-|C\u000e\u0005\u0018\u001dG1O!q\u00131Zd\u00107q\u001cG\u0017\r<\u0015I\u0015ct-]\nC@UI!̟m\u0010\u009cW;\f\u001ch45B\r!\u000bi>p\u0018b3@&s&b8ƁAVf\u0018v]\u00032\".>ˆ\u007f\u0006A\u0018+^\bm>5͛++z2\u000bTv9\"c#̙߾Y\u000b\u0011\u0010ya\b0ER3\b]Ӎܻ\u0017XhcY\\.\u001b)\u007fJݻӔ#6\u0016\fq\u001b]'\u0001r\u0002N\u0012¾Į3k8\u000byD`b\u0016\u001f(\b44b--AfONd?Ϟ\u001bH\u001e\"'\u00076*\r\f_ح-\u0003Vt)\u0013bH#\"rBO\u0019UʺSӨ`ԥ\bEWliF`\u00073?B\u000f\u007f*\r\u00101D\u0011}F˟ш\rt\u00060:v\u000f{Ka?_4ot\u0003l\u0016sAb\n2\u0010\u001c[_dFkVb*\u001eKQy\fG\u001aǴƬ\nq\raC7\u001af3w\u0019\u0005\u0011\u0011O{Gjh}e{iCތs\u001be0\u0004JC3d-\u001c\u0004uJE\u0018\u0012_/c2HC\u0010N\u0004c\f\u0018\u0010/&4\u0006<m.Nw\\\u008dc\\N#Dm\u0012.B>~H3I\u0003w\"\u0014Zrnĸpպe6Iz\"$\u0015J89\u0005\u0007sO?ݢ\u0017ް\u0011E\u001cɞ_\"7A/|>Q\"D9V\u000bM]^\u001c\riť\u0010΄6g>̖_B_9\u0014=ÃX3"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7T\u001a<\\\u0019", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "u(E", "3kT:X5Ma", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ8", "3kT:X5M2\u0015\u000ev", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "6dP1", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "/cS\u0013\\9Lb", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "/cS\u0019T:M", "1kT.e", "1n]AT0Ga", "1n_F66EZ\u0019|\nb6\u0006h6e\b(\u0005O\u000f", "7mc2e5:Z|\by^?", "1n_F83>[\u0019\b\nl", "<df\u0010T7:Q\u001d\u000e\u000f", "2dR?X4>\\(~y", "3mbBe,\u001cO$zxb;\u0011", ";h]\u0010T7:Q\u001d\u000e\u000f", "4h[AX9\"\\\u0004\u0006v\\,", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4ha@g", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "4ha@g\u0016K<)\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mR?X4>\\(~y", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7mc2e5:Zz~\n", "7mc2e5:Z\u0007\u000e\bn*\f\u0019<e", "AsaBV;N`\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mc2e5:Z\u0007\u000e\bn*\f\u0019<e>.\u0006O\b\u001b A}\u001d;})2", "7r4:c;R", ":`bA", ":`bA<5=S,h{", ":`bAB9'c \u0006", "<dV.g0OS\u0001\ty", ">nb6g0OS\u0001\ty", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,\u001fW&\r\n", "@d\\<i,\u001fW&\r\nH9e\u00196l", "@d\\<i,%O'\u000e", "@d\\<i,%O'\u000edk\u0015\r\u00106", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "BdbAG6\u001a`&z\u000f", "BdbAG6\u001a`&z\u000f\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "\"", "/qa.l", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "Bn0?e(R", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private Object[] elementData;
    private int head;
    private int size;
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":!\u007f\u0007lj?ӅE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV,\u0007mDQe|m\u0014%1pnm7$ڑ?˃dv>\u0005.7ś<\u007f"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%s7\b(Bi\u001f2WL\u0011", "", "u(E", "2dU.h3M;\u001d\bXZ7x\u00073t\u0014", "", "3l_Al\fES!~\u0004m\u000bx\u0018+", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = emptyElementData;
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i2);
            }
            objArr = new Object[i2];
        }
        this.elementData = objArr;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void copyCollectionElements(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i2 < length && it.hasNext()) {
            this.elementData[i2] = it.next();
            i2++;
        }
        int i3 = this.head;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.elementData[i4] = it.next();
        }
        this.size = size() + collection.size();
    }

    private final void copyElements(int i2) {
        Object[] objArr = new Object[i2];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i3 = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i3, 0, i3);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i2) {
        return i2 == 0 ? ArraysKt.getLastIndex(this.elementData) : i2 - 1;
    }

    private final void ensureCapacity(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i2, 10)];
        } else {
            copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, i2));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        int iPositiveMod;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i2 = this.head;
            if (i2 < iPositiveMod2) {
                iPositiveMod = i2;
                while (i2 < iPositiveMod2) {
                    Object obj = this.elementData[i2];
                    if (function1.invoke(obj).booleanValue()) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (function1.invoke(obj2).booleanValue()) {
                        this.elementData[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iPositiveMod = positiveMod(i3);
                for (int i4 = 0; i4 < iPositiveMod2; i4++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (function1.invoke(obj3).booleanValue()) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z2;
    }

    private final int incremented(int i2) {
        if (i2 == ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i2 + 1;
    }

    private final E internalGet(int i2) {
        return (E) this.elementData[i2];
    }

    private final int internalIndex(int i2) {
        return positiveMod(this.head + i2);
    }

    private final int negativeMod(int i2) {
        return i2 < 0 ? i2 + this.elementData.length : i2;
    }

    private final int positiveMod(int i2) {
        Object[] objArr = this.elementData;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, size());
        if (i2 == size()) {
            addLast(e2);
            return;
        }
        if (i2 == 0) {
            addFirst(e2);
            return;
        }
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + i2);
        if (i2 < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i3 = this.head;
            if (iDecremented >= i3) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i3];
                ArraysKt.copyInto(objArr, objArr, i3, i3 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = e2;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = e2;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + i2);
        int size = elements.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.head;
            int length = i3 - size;
            if (iPositiveMod2 < i3) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, length, i3, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, length, i3, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i4 = iPositiveMod2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    ArraysKt.copyInto(objArr6, objArr6, length, i3, iPositiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, length, i3, i3 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i5 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i6 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i6 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i5, iPositiveMod2, iPositiveMod);
                } else if (i5 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i5 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i6 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i5, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i5 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i5 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i5, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E e2) {
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = e2;
        this.size = size() + 1;
    }

    public final void addLast(E e2) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = e2;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iPositiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            ArraysKt.fill(this.elementData, (Object) null, i2, iPositiveMod);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.fill(objArr, (Object) null, this.head, objArr.length);
            ArraysKt.fill(this.elementData, (Object) null, 0, iPositiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        return (E) this.elementData[positiveMod(this.head + i2)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i2;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[length])) {
                    i2 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iPositiveMod; i3++) {
                    if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                        length = i3 + this.elementData.length;
                        i2 = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.elementData[length])) {
                i2 = this.head;
                break;
            }
            length++;
        }
        return length - i2;
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        int i2;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i2 = this.head) < positiveMod(this.head + size())) ? this.head : i2 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i2;
        int iPositiveMod = positiveMod(this.head + size());
        int i3 = this.head;
        if (i3 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i3 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i3) {
                        lastIndex--;
                    }
                }
                i2 = this.head;
                return lastIndex - i2;
            }
            return -1;
        }
        if (i3 > iPositiveMod) {
            int i4 = iPositiveMod - 1;
            while (true) {
                if (-1 >= i4) {
                    lastIndex = ArraysKt.getLastIndex(this.elementData);
                    int i5 = this.head;
                    if (i5 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                            if (lastIndex != i5) {
                                lastIndex--;
                            }
                        }
                        i2 = this.head;
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.elementData[i4])) {
                        lastIndex = i4 + this.elementData.length;
                        i2 = this.head;
                        break;
                    }
                    i4--;
                }
            }
            return lastIndex - i2;
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i2 = this.head;
            if (i2 < iPositiveMod2) {
                iPositiveMod = i2;
                while (i2 < iPositiveMod2) {
                    Object obj = this.elementData[i2];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i2++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.elementData[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iPositiveMod = positiveMod(i3);
                for (int i4 = 0; i4 < iPositiveMod2; i4++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        ArrayDeque<E> arrayDeque = this;
        if (i2 == CollectionsKt.getLastIndex(arrayDeque)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int iPositiveMod = positiveMod(this.head + i2);
        E e2 = (E) this.elementData[iPositiveMod];
        if (i2 < (size() >> 1)) {
            int i3 = this.head;
            if (iPositiveMod >= i3) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i3 + 1, i3, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.head;
                ArraysKt.copyInto(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i5 = this.head;
            objArr4[i5] = null;
            this.head = incremented(i5);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(arrayDeque));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.elementData;
        int i2 = this.head;
        E e2 = (E) objArr[i2];
        objArr[i2] = null;
        this.head = incremented(i2);
        this.size = size() - 1;
        return e2;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iPositiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e2 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e2;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i2 = this.head;
            if (i2 < iPositiveMod2) {
                iPositiveMod = i2;
                while (i2 < iPositiveMod2) {
                    Object obj = this.elementData[i2];
                    if (elements.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iPositiveMod = positiveMod(i3);
                for (int i4 = 0; i4 < iPositiveMod2; i4++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, size());
        int iPositiveMod = positiveMod(this.head + i2);
        Object[] objArr = this.elementData;
        E e3 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = e2;
        return e3;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        Object[] array = tArr;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = ArraysKt.arrayOfNulls(array, size());
        }
        int iPositiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            ArraysKt.copyInto$default(this.elementData, array, 0, i2, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size(), array);
    }
}
