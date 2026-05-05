package androidx.compose.foundation.lazy.layout;

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
/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?1Le^.ZS@\u000fs{:%c$\bCC٥ s8ޛwRm˧|Ix\ns\u000f4\u00161i:\u0012\n\u0007b*\u000f`H E9M}DQ`#85&8\"F\u0002\u001d\u0001H,x&\u0005\u0004[]\u001c\u001a@F\u0001<b\r\u0004ĨH\u001d\u0016@0\u0001Lb\u0016X|l5rH;;\tyD^'\u0016ܞ+X=Jb4%v\u0010 qÏ7\u0006%3T\u001b\u0007\u0001]\u0016ƈAџA\t\u0001)-.Wwɑ5W\u000fѥ\u0014ۀ̀\raz(b$\u007f_И+;֓gJ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006|", "\"", "", "Ahi2", "", "5dc \\A>", "u(8", "4na\u0012T*A", "", "4q^:<5=S,", "Bn8;W,Q", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006e+U],icnDi", "5dc", "7mS2k", "\u0017mc2e=:Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005SD-\u0011eh9jl;N\u00048CS50jaH", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IntervalList<T> {
    void forEach(int i2, int i3, Function1<? super Interval<? extends T>, Unit> function1);

    Interval<T> get(int i2);

    int getSize();

    static /* synthetic */ void forEach$default(IntervalList intervalList, int i2, int i3, Function1 function1, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i2, i3, function1);
    }

    /* JADX INFO: compiled from: IntervalList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005*2\u0017\u000eј\u000fn?/Rdf-\u0003SX\u000f,\u0019:řk(\u007fDSUH\u007f2\r]Q\u007fg\u001dLj\u000fQ\u0013\u001e\u0016/i߽MU\u0007bb\u001e@E\b?aOڱA?hҚN\u0007&80?J\u0014\u000f\u001bBH>xټGQ\u0014۵HBvB`\u0014\u001e\u0016(\u0016\u001e>V\u007fɉ`oV6Vwu<5,\u0011sŒR3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006e+U],icnDi", "\"", "", "AsP?g\u0010GR\u0019\u0012", "", "Ahi2", "D`[BX", "uH8\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\b", "5dc \\A>", "u(8", "5dc g(Kb|\by^?", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i2, int i3, T t2) {
            this.startIndex = i2;
            this.size = i3;
            this.value = t2;
            if (i2 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i2).toString());
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException(("size should be >0, but was " + i3).toString());
            }
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final int getSize() {
            return this.size;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
