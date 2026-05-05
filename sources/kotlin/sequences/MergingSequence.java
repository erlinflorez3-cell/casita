package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0006ELc\u000b\u0004I\u00066\f6B\u0015\"4\u0012}\u0007njGVL͜N\u008chݷR\u0011qڔB#\u0004&wBIUB\u007f(\t]O\u0018m~Lj\u000b\n\u00104\u00189$<Sc{u\u0018\u001f4Rou\u074c{qMCnxN\u000b04280\u0004/\u001c:^\u001e{\u0013U[\u000e\"0v\u0081JT\u001dM;\u0019\"\bN 7\u001e\u000bmߑ:Hzd\u0003<1\u000b\u0002H^)o03M;O\u001bܢ\rGs,.X=E\u00175S9ޗ\u0001]\u0016ŤAџA\u0005pѧw=Wwo<h\u0002$\u0015aN;_I̩^ԇU`\u0014ʬ{mqPh 8y\u000b{Cɝ\u0014\u0010\u0016'~-=\u001cv\bD3#x*öRؿbB\bЭˑ:!"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0010{M\u0003\u001b I]\u000eH\u0007%>W}u", "\"0", "\"1", "$", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "Ad`BX5<Sd", "Ad`BX5<Se", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]+?h\u0005$@7$.YS;t2\u001e#2O9\u0013s,Wt'\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015bcx[", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MergingSequence<T1, T2, V> implements Sequence<V> {
    private final Sequence<T1> sequence1;
    private final Sequence<T2> sequence2;
    private final Function2<T1, T2, V> transform;

    /* JADX INFO: renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0017\u001d̉=!,\u0010\bDJg|\u0004O\u000f8\u000b4C'!ܥ\u0018\u007f\u001d߿\u001b?@FuHdɟ\u0002)Wr\n9<[Rw\nжUb\n0\u0010gN\u001e˧5БZŲG\u000f\u0014\u001eI\u007f:Im~m\u0014\u001f2xnm2ޜsCAś\r8\u000b!@$\t\u000f\u0013\u000420X\u0012\u0007zyJ:\u0011ضDvBĥ%O\u000b\u001e \b̭$\n"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/g(\tB\u0005 \u00195o\u001aLv.3Y<$Fm#*\\MH*\u007f", "", "7sT?T;H`d", "5dc\u0016g,KO(\t\b*", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "7sT?T;H`e", "5dc\u0016g,KO(\t\b+", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<V>, KMappedMarker {
        private final Iterator<T1> iterator1;
        private final Iterator<T2> iterator2;
        final /* synthetic */ MergingSequence<T1, T2, V> this$0;

        AnonymousClass1(MergingSequence<T1, T2, V> mergingSequence) {
            this.this$0 = mergingSequence;
            this.iterator1 = ((MergingSequence) mergingSequence).sequence1.iterator();
            this.iterator2 = ((MergingSequence) mergingSequence).sequence2.iterator();
        }

        public final Iterator<T1> getIterator1() {
            return this.iterator1;
        }

        public final Iterator<T2> getIterator2() {
            return this.iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((MergingSequence) this.this$0).transform.invoke(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(Sequence<? extends T1> sequence1, Sequence<? extends T2> sequence2, Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }
}
