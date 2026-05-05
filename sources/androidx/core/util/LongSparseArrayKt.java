package androidx.core.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.LongIterator;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,o\bӵLc\u000b\u0004I\u00066\f6B\r+4ߚ\u007f\u0007tqA0JhP.`S2şs{J$c$\bCCU \u0001*\teNogtLb\u000bY\u000f\u000e\u0016~p4Ic\u001fe܈'QPsW3{t];fҚD\u0005H82:\n\u0005G\u001aXI@z\tIc\f@7\u0007\u0088Bj,[\r2\u00124C@\u0003$ձuN^N|_J/i\u0003\u0018C~+m6\u0015M;M\u001bܒ\u0013\u000f\u0006,4X7c\u001aEU\tޗ`[g\tOsM\u0005/'U,ywe@p\u007fZ\u0015q̄\u0013ǁv&j\u0010i0\u001a3CO\u0012Xp\u0010.»\t{5B\u0014\u0010\u0016'\u000f.[\u001b\u0017<\u001cA\r#cQ`\u0011\rIȸ~k<'5\u00069<I\u001dlW\bA)_G\u000bK\r̷'\u000bt1kZ\u0014q%\u001dZ}w;aBMH|\u0017\bL4Օvz.8\u0016HGF/\u001c\u00134Ϗ37\u0004?3#{\u0002\u000fD\u0016w5dvY\u0002RvGRr$JB\tRZ\u000bߦ\u000b\u07fbTTf@)\u007f*i\u001f}N\u0013@^}˓/%8T_jyj\u0014]8&_jE_\u0007k<^ihAHii cbvZ?jxK֡l͞W\fhs@9@`\u0003\u0010&\u0001dP\u0012Ǝ@?\u001a\"D.A\u0019#\u0015v\u0004d՚G\u0015 ms\u0001\u0010-YS&\tǭ2t1\u0007`^\u0001o.xw-Cʧ(EU_O1&\u0004=\t6\u0003Ƚ\u0015~\u001c\u0006Wi\\G\u0013lDvm'.22?a1M\u0013U~W3\"/Kɣ\u0001eyS\")\u000b|@\u000fii^q\u0016\b\t2plZO\u001b\u0017Pw%з# \u0007\u000e\u0018yF)T\u0004V\u0011ϵLI\u001b\ti>^8C\u0005M\u001fU\u000b}?\u0015;=E7\u001d\\wB0-\u000bk\t\b.(g/(zЁ\u0012,\f\u001c\u007fda]x;fJ\n\u0003L(<l1Ixn\u0006\u0012Z\tz\rάLAr\u0011nd[,G}\u0015\u0014L\u000fv£i:;u\u000e6>_psq~DbQ+)M\u0002n\u001eqYf#JU\nQ֑9ߎ\u0016\u001cKBnqp,H\f\u0004\u001aFA\u0002b3`)&:ɶJ\b3Idk\u0016\u0010A\u007ft`/7@߿\f;\u0005\rtzbƇV\u0005\tKp#:\u0001E\u000fa\u001f/¼1ܭqJl1i4\u000fV¡\r@"}, d2 = {"Ahi2", "", "\"", "\u001a`]1e6BRb\u000f\nb3Fo9n\u0002\u0016\u0007<\u000e%\u0017#|\u001b8\u000bz", "5dc \\A>", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b\u001da", "1n]AT0Ga", "", "9dh", "", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\'!", "4na\u0012T*A", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b>d%3~\u0012wT?Dm}\b\u0012ma7\u00169o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b>d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^g\u001etS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>", "7r4:c;R", "7r=<g\fF^(\u0013", "9dh\u0016g,KO(\t\b", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u000b \u0019+~\u000eIr4?fS", ">kd@", "=sW2e", ">tc\u000e_3", "@d\\<i,", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b>d%3~\u0012wT?Dm}\b\u0012ma7\u00169oC", "Adc", "uKP;W9HW\u0018H\u000bm0\u0004R\u0016o\t*iK|$%GK\u001bIr9\u000b>d%3~\u0012wT?Dm}\b\u0012ma7\u00169o?", "D`[BX\u0010MS&z\nh9", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongSparseArrayKt {
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j2) {
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j2, T t2) {
        longSparseArray.put(j2, t2);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j2) {
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t2) {
        return longSparseArray.indexOfValue(t2) >= 0;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j2, T t2) {
        T t3 = longSparseArray.get(j2);
        return t3 == null ? t2 : t3;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j2, Function0<? extends T> function0) {
        T t2 = longSparseArray.get(j2);
        return t2 == null ? function0.invoke() : t2;
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j2, T t2) {
        int iIndexOfKey = longSparseArray.indexOfKey(j2);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(t2, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Function2<? super Long, ? super T, Unit> function2) {
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            function2.invoke(Long.valueOf(longSparseArray.keyAt(i2)), longSparseArray.valueAt(i2));
        }
    }

    public static final <T> LongIterator keyIterator(final LongSparseArray<T> longSparseArray) {
        return new LongIterator() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.LongIterator
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i2 = this.index;
                this.index = i2 + 1;
                return longSparseArray2.keyAt(i2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!,\u0010\bӵLc\u0003\nI\u00066\u000e6B\r+4\u0012}\t\u000fiˎ6L{߉^Xc,\u001fk2éRZlxQAm\u001a,)OѾN0{|Rr\u0013a\u0018.\u0018\u000fibկ\fތ$ܟ\u000f̓FoM=\u001e\bK9xtd\u0006v\u074c.أ}\u0011\tɝBJ\u0016x\tFk\u000e\u00184NuĖV\u0018"}, d2 = {"/mS?b0=fb|\u0005k,F\u0019>i\u0007qbJ\n\u0019\u0005Rk\u001bJv\u0001Bfy4\u001d|T?IJKk\u0018-\u0015u]H\u0011pj\u001a", "", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C07891<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C07891(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i2 = this.index;
            this.index = i2 + 1;
            return longSparseArray.valueAt(i2);
        }
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new C07891(longSparseArray);
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            longSparseArray.put(longSparseArray2.keyAt(i2), longSparseArray2.valueAt(i2));
        }
    }
}
