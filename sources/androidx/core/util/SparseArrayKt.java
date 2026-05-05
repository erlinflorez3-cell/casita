package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\f6B\r+4\u0012}\u000bnjG0L͜P.hS2\u000f\u0002{<$a'yCQU\"}(\u000bWN}gvJ`\u0011K\u000f\u0014<\u0001̓Dhc|u\u0012=7bqE\u074c[oe?pvF\u0005f2P9*\t\u000f BH>uAŖS$1>G\t:\u0001\u0012m\u0007 Ň\u0014>H\u0007.^wN|H\u001b^j31\t\u0002B|&&ܥ\u0003e1T\\?\r%f>-FʺC\u0015MY\u0013\tb[\u0006\u0003mrm\tv0?+\u0010s\u001e̳^ÿ\u0018\u00159Y%-\u00011t\u0005\u007fl,)1ՒqKx\u00148y\u000b{S<2\u000f6[V;EJv\u0019\u001eB#qՂDZ\bmR\u0006\u0001qF\u0019+\u0006Y1I,v`(;ϭRA\u0002\u0014\u001d$)\u0011~#aZ4i%\u001ddw\u007f=\u007fN\u0004ʷT\"\u0006K~\u001cp)\u0002J\u00066Ϛ\u000e/$\u0017>\u001957\"9Q\"\u001c\u0006VJ\u007fv3_\u0019Wwd`@hn\\պ0Á\u0010ZRw\u001d\u001e^hp,WM<V\râ\u0016\u0013Hb\b>1%VN}i\u001an[c\"%]egc|}&]I`C5\u0018c>v\u0019Ο\u001a͖@b\u0013n~Ya#r\\V'RJpݘ\u0006{lT\u001c\u0015B?8\u001cb-wǐb-_\u00116ZA+\u000e\u007f\\nɭ\rT[*\u0013k4tO\u0001~]7טm\u0011]:\u0016x\"[[q7\u001fğc\"\u0011:\r%\u0017~:\u007fuhdrZ\b.{e}0\u0016`9\u007f0]\u0015\u0015ȯ72*3UN\u0003e\u0018M@(+\u0007\b+Sn>i\u0018j7,\u000fk\u0011֩T/D\u0005{\u000b#6p {g¿\tG\fZ\u001b]NI9\u0003\b=~B\u000b!7$5\u0003\u007f\"C5[D?F$\u0016,/Cf}kuЃ\bb7,\u0005g\u0014,*\u0016\u001ec\u0002a@API\b}n&2u\u001bB\u000fj͎\fB\u0017S%_Va|p\u0005Dm\r5̎t\u0007T\u0013\u0001Xk:Yo,5^c8y[}B]s)\u001fVkg4m\u0012œ\u0013Ί\u0013\n\u0019\u001dI\t >U&fYr\tv\u0006\";VCAؠ\u0013<1*D.L\bQC\u0003j&0\tĔ^_=\u0016RDyĩd\u000e|~lXX\u0005'E\u000f\"`݇~ܓ7\"\u001177\u0007{Iߥ3\b"}, d2 = {"Ahi2", "", "\"", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "5dc \\A>", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c\u007fZ", "1n]AT0Ga", "", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c#{!FUG'3v\u0018w7@@k2-j,V", "4na\u0012T*A", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c ]*1jyi>i\u001f0\u0017-8p4\u001c$>% \f_=J@.CUPuFOw=\u0012!0", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c ]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5'(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "7r4:c;R", "7r=<g\fF^(\u0013", "9dh\u0016g,KO(\t\b", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n&zVo\u001b8\u0006/B/", ">kd@", "=sW2e", ">tc\u000e_3", "@d\\<i,", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c ]*1jyi>i\u001f0\u0017-8p4\u001c$>%.", "Adc", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c ]*1jyi>i\u001f0\u0017-8p4\u001c$>%*", "D`[BX\u0010MS&z\nh9", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SparseArrayKt {
    public static final <T> int getSize(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i2, T t2) {
        sparseArray.put(i2, t2);
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t2) {
        return sparseArray.indexOfValue(t2) >= 0;
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i2, T t2) {
        T t3 = sparseArray.get(i2);
        return t3 == null ? t2 : t3;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i2, Function0<? extends T> function0) {
        T t2 = sparseArray.get(i2);
        return t2 == null ? function0.invoke() : t2;
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i2, T t2) {
        int iIndexOfKey = sparseArray.indexOfKey(i2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(t2, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, Function2<? super Integer, ? super T, Unit> function2) {
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            function2.invoke(Integer.valueOf(sparseArray.keyAt(i2)), sparseArray.valueAt(i2));
        }
    }

    public static final <T> IntIterator keyIterator(final SparseArray<T> sparseArray) {
        return new IntIterator() { // from class: androidx.core.util.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseArray2.keyAt(i2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!,\u0010\bӵLc\u0003\nI\u00066\u000e6B\r+4\u0012}\t\u000fiˎ6L{߉^Xc,\u001fk2éRZlxQAm\u001a,)OѾN0{|Rr\u0013a\u0018.\u0018\u000fibկ\fތ$ܟ\u000f̓FoM=\u001e\bK9xtd\u0006v\u074c.أ}\u0011\tɝBJ\u0016x\tFk\u000e\u00184NuĖV\u0018"}, d2 = {"/mS?b0=fb|\u0005k,F\u0019>i\u0007qiK|$%GK\u001bIr9\u001bh<13t&.1R;x0-\u001fu \u0005", "", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C07901<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ SparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C07901(SparseArray<T> sparseArray) {
            this.$this_valueIterator = sparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.$this_valueIterator;
            int i2 = this.index;
            this.index = i2 + 1;
            return sparseArray.valueAt(i2);
        }
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        return new C07901(sparseArray);
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
        }
    }
}
