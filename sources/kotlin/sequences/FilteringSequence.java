package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&˛\bDZc|\u0004G\u00068\u000b<K\u0007Ӭ4\u0012\u000e\u0007nj?0LeVTZݷ0ş\u0002ڔ\\&aҕ\u007fBk[*\u007f2\t\u0016M\u0016g/yj\u0015Q\u0010\u001e\u001c\tl<I\fތ\f\u0012\u001f8HoM5eok<p\u0005D\t8>2:\n\u00057ɝ:J v)Fy\u0011ܘ4@~@\u001b\u001a[\f2\u0018\u0016@0\u0001Tձ\u0016V|Զl.R='\u001buRP7_fŧ]\u000fVTU\u0010%ftѫB˝9\u0015-مS\u0013`]W\u0003mt\u0014ݞjҊ++Q֕(Hf\u0001,\u001b;Q\u001d])̦\u000b\u0005(ӣ\u000eˏ/Ok֟ם\u00121"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\t\u007fG\u0010\u0017$Kx\u0010*v1EY\u0007\u001e7C", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "Ad`BX5<S", "Ad]1J/>\\", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012k\f;c\r';v_3^K\u0005lD'\u0013weC\u0010qu/\u00070E[R6e\u001eH\u0001\u0005", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FilteringSequence<T> implements Sequence<T> {
    private final Function1<T, Boolean> predicate;
    private final boolean sendWhen;
    private final Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.FilteringSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0010\bDJk|\u0004O\f8\u000b4E\u0007\":\u0012\u007fјnjG9LeN.zRճ\u0015s\u0012éTa4sS;\fڼ,!QU\\v\u007fnxjQCW\r$\n\u0003,wg?ى\u0012W>P\u0003W3\u0004ڎ\u0004ʷ`ҽ:\u0005.7rM\b\u0005\u0019 :J v1ŏy\u000bܘ4Fxíj\u000fS\u0006(\u0014VZ.\u00046^}MlԟCҞFǥ'\u0011qB\\/w2\u0003Q\u001bKt)\u0013|o%{XE>-%\u0002\r]ѿgύ\u0007Kyܵ\u001dj-29U\u0014Y<e\u000e\"Ƭ/c"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/`,\u0003O\u0001$\u001bPq{<\u000355b{ uq%.Z?JuA\\`", "", "7sT?T;H`", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "<dgA<;>[", "5dc\u001bX?M7(~\u0003", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001bX?M7(~\u0003", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "<dgAF;:b\u0019", "", "5dc\u001bX?MA(z\n^", "u(8", "Adc\u001bX?MA(z\n^", "uH\u0018#", "1`[0A,Qb", "", "6`b\u001bX?M", "", "<dgA", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private final Iterator<T> iterator;
        private T nextItem;
        private int nextState = -1;
        final /* synthetic */ FilteringSequence<T> this$0;

        AnonymousClass1(FilteringSequence<T> filteringSequence) {
            this.this$0 = filteringSequence;
            this.iterator = ((FilteringSequence) filteringSequence).sequence.iterator();
        }

        private final void calcNext() {
            while (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (((Boolean) ((FilteringSequence) this.this$0).predicate.invoke(next)).booleanValue() == ((FilteringSequence) this.this$0).sendWhen) {
                    this.nextItem = next;
                    this.nextState = 1;
                    return;
                }
            }
            this.nextState = 0;
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final T getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState == -1) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t2 = this.nextItem;
            this.nextItem = null;
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
    public FilteringSequence(Sequence<? extends T> sequence, boolean z2, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.sendWhen = z2;
        this.predicate = predicate;
    }

    public /* synthetic */ FilteringSequence(Sequence sequence, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i2 & 2) != 0 ? true : z2, function1);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
