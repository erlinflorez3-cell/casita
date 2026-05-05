package kotlin.sequences;

import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u0006\rnj?0LeVTZݷ0ş\u0002ڔ\\&aҕ\u007fBcW |0\t\u007fTwi~J!\u000bq\u0010FA\tt:Km~m\u0014\u001f2xģm4]\u0006K<x\u0007F\u000702P=\n\u0007\u0011\u001a`Ϻ x\u000bC\u0002\u000b@4Ϯt:`\u0013\u0016\u0012(\u0019\u001eD0\u0003.\\\u001eMdP3Ү:\u007f5\u0011kZT7a@|\u0004εtU}˜xҐ\"+Hʺ\u000633V\u001b\u0019b]O\u0003mvM\u0007x']ǢYug6\u000f~B\u0019\u0002̀\u000fǁv&dӤŒd\u0015"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0017\t<\n%\u0018Q|\u0016@\u007f'\u0019b| Jm\u0015\u001cMOKk=\u001c\u0015>", "\"", Global.BLANK, "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "Ad`BX5<S", "BqP;f-H`!~\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)(6.", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {
    private final Sequence<T> sequence;
    private final Function2<Integer, T, R> transformer;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingIndexedSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!,\u0010\bӵLc\u0003\nI\u00066\u00116B\r+4\u0012}\b\u000fiˎ6L{߉^Xc,\u001fk2éRZlxQDm\u001a,,OѾN0s|Ur\u000byƤLǴx̶0Ic\u0005.*\u001d2Zom4$ڕI˃d\u0001>ӌ84(:\b\b!\u001c0L\u001e{KXY\u0012*6PrJRCL3\u0019Ū\nD(ҵ6^mUDPǶaG"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/n5wI\u000f\u0018!Tw\u0012Ex\t>X}37l\u0004.YS;t2\u001eSlp9\u0014_;X\u0004e\u0013", "", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "7sT?T;H`", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<R>, KMappedMarker {
        private int index;
        private final Iterator<T> iterator;
        final /* synthetic */ TransformingIndexedSequence<T, R> this$0;

        AnonymousClass1(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
            this.this$0 = transformingIndexedSequence;
            this.iterator = ((TransformingIndexedSequence) transformingIndexedSequence).sequence.iterator();
        }

        public final int getIndex() {
            return this.index;
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            Function2 function2 = ((TransformingIndexedSequence) this.this$0).transformer;
            int i2 = this.index;
            this.index = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return (R) function2.invoke(Integer.valueOf(i2), this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingIndexedSequence(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> iterator() {
        return new AnonymousClass1(this);
    }
}
