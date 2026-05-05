package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`y2şq{Jř\u0004*wّITB}P\t\u007fTwi~J!\nq\u0010F?\tv:Km\u0001m\u0016\u001f4Xnu\u074c{rMKnxN\u001304280ڎ\u0011\u001e:J&u1ŏy\u0011ܘ4@~@\u001b\u001a[\f2\u0018\u0016@0\u0001Tձ\u0016V|Զl.N=%\u001bqRR7aF{\u0004εtW}˜xҐ\"+Hʺ\u0006/3W\u001b\u0015b]O\u0003uмM\tx)=*\u007f֕\u0006;/ß\u0016Ʀ/O\u0015ƞğ*e"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\n{I\u0001$\u0013Vy\u001b*v1EY\u0007\u001e7C", "\"", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "5dc\u0016a0MW\u0015\u0006kZ3\r\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dc\u001bX?MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0Q?", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class GeneratorSequence<T> implements Sequence<T> {
    private final Function0<T> getInitialValue;
    private final Function1<T, T> getNextValue;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0010\bDJh|\u0004O\f8\u000b4E\u0007\":\u0012\u007fјnjG9LeN.zRճ\u0015s\u0012éTa4sS;\fڼ,!QU\\s\u007fnxgQCW\r$\u0007\u0003,wd?ى\u0012W>P\u007fW3\u0004ڎ\u0004ʷ`ҽ:\u0005.4rT\b\u0005\u0019\u001c@GF͌QŖWë\u0016>HpHW%O\u000b\u001b \b^\"\u0007!jk\u001fNVru:]*Y݊NĚ+k8ŧe\u000fL\\5\u0016\u0017c$5NB߷\u00196"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/a(\u0005@\u000e\u0013&Q|{<\u000355b{ uq%.Z?JuA\\`", "", "<dgA<;>[", "5dc\u001bX?M7(~\u0003", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001bX?M7(~\u0003", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "<dgAF;:b\u0019", "", "5dc\u001bX?MA(z\n^", "u(8", "Adc\u001bX?MA(z\n^", "uH\u0018#", "1`[0A,Qb", "", "6`b\u001bX?M", "", "<dgA", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private T nextItem;
        private int nextState = -2;
        final /* synthetic */ GeneratorSequence<T> this$0;

        AnonymousClass1(GeneratorSequence<T> generatorSequence) {
            this.this$0 = generatorSequence;
        }

        private final void calcNext() {
            T t2;
            if (this.nextState == -2) {
                t2 = (T) ((GeneratorSequence) this.this$0).getInitialValue.invoke();
            } else {
                Function1 function1 = ((GeneratorSequence) this.this$0).getNextValue;
                T t3 = this.nextItem;
                Intrinsics.checkNotNull(t3);
                t2 = (T) function1.invoke(t3);
            }
            this.nextItem = t2;
            this.nextState = t2 == null ? 0 : 1;
        }

        public final T getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState < 0) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.nextItem;
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.nextState = -1;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(T t2) {
            this.nextItem = t2;
        }

        public final void setNextState(int i2) {
            this.nextState = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(Function0<? extends T> getInitialValue, Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
