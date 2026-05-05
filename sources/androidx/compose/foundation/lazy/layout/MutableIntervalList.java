package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004G\u00068\u000bDB\u0007\"B\u0012\u007f\u0007ljA0RkP.XU2\u000fy{<$a*yCQU\"}(\u000bWNupvϺ`\u0010YƤ.\u0018~̓:H\u0006~m\u0014\u001f2\tnm3\u000erެ=`\u00037M9@-Py3\rJ.V\u0018\u000fzqR<\u0016>M\t:\t҈̂\t\u001a \u0014\u0007.\u000f-tg|BxpkJG#1p\tNo\u0010>\u000ee\rt`W\u0011\u0005s6+n>e\u00193f\u001b\u0007\u0001bo\u0019M\u0006U\u0017x/71Yug6\u000fÜB\u0019;Q\u001d]!2\u000b\u001a\u0018tT<9e{Q`\u00108w1Ԉ;@4\u0012\u00147`.[!-ڳ\u000e{\t\u0001jXV\u0012`R\u007f1ʨd\u001bU\u0004ACQ\u001b\u0015X(;afE\u0015\u001d\rL=)t1]d\u000e\u0017ٽIX(U?aX=vUPY\u000e\u0006\u0012rz\u000e:\f@M\u00101\f\u0011dϏS;\n<yܬmɘLDoϸUtvX\u0002ZXB2nLճ@\b:^\u001bߢ\u0011\u07fbTT`\u008cai*\\\u001f}6\u001aP`\u0006B9%>U\u000e9@ҫYύ\u000e+7ωO[tt\u001caߓbN"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005SD-\u0011eh9jl;N\u00048CS50jaH", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006|", "u(E", "7mc2e=:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006e+U],icnDi", ":`bA<5MS&\u0010ve", "\nrTA \u0006\u0017", "", "Ahi2", "5dc \\A>", "u(8", "/cS\u0016a;>`*z\u0002", "", "D`[BX", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "1gT0^\u0010GR\u0019\u0012Wh<\u0006\b=", "7mS2k", "4na\u0012T*A", "4q^:<5=S,", "Bn8;W,Q", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc", "5dc\u0016a;>`*z\u0002?6\nl8d\u007f;", "7sT:<5=S,", "1n]AT0Ga", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }

    public final void addInterval(int i2, T t2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i2).toString());
        }
        if (i2 == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i2, t2);
        this.size = getSize() + i2;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i2, int i3, Function1<? super IntervalList.Interval<? extends T>, Unit> function1) {
        checkIndexBounds(i2);
        checkIndexBounds(i3);
        if (i3 >= i2) {
            int iBinarySearch = IntervalListKt.binarySearch(this.intervals, i2);
            int startIndex = this.intervals.getContent()[iBinarySearch].getStartIndex();
            while (startIndex <= i3) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[iBinarySearch];
                function1.invoke(interval);
                startIndex += interval.getSize();
                iBinarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i3 + ") should be not smaller than fromIndex (" + i2 + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i2) {
        checkIndexBounds(i2);
        return getIntervalForIndex(i2);
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i2) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval == null || !contains(interval, i2)) {
            MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
            IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[IntervalListKt.binarySearch(mutableVector, i2)];
            this.lastInterval = interval2;
            return interval2;
        }
        return interval;
    }

    private final void checkIndexBounds(int i2) {
        if (i2 < 0 || i2 >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + i2 + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i2) {
        return i2 < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i2;
    }
}
