package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lpA0R\fP.XS0ş\u0002ڔ\\&aҕ\u007fBk[*\u007f2\t\u0016M\u0016g\u001fPj\rS\u000fL\u0015'klje\u0003k\u0014'8RqO3\u0004ڎk9pxD\b82P<\n\t\u000f\u001fBH>zټGK\u001a\u0018xT~Dj\u0013]\u0007*\u0012<̄N\u0001N`uYNH\u001ba\u0001Ck\u0010wNf-o2\rMCϿ\u00034Sȏaf?NEM\u001b5U\u0013\u0007\t¹m\u0003ouK\u0010\u0001'U/\u0010\b(Hf\u0007,\u0015YSC\u001eI̩^ԇUd$)1WqT!\u001a6|\u0013{;@Z\u05fd\bόL.5Կ7\u001a\u001c5\rxcB`\u0002\u0015ۍ.z8ت\u0019Ӿ\u000433ݍkr_dS\u0019|;R˟\u000f̷'\u0001vďƥX\u001d"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016\f=n\u0017#Wo\u0017:vz", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0007\tJ\f\u0006\u0013Mo{<\u000355b{ \r", "Ad`BX5<S", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012Z\txJ", "1nd;g", "5dc\u0010b<Gb", "u(8", "2q^=", "<", "7sT?T;H`", "", "B`Z2", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int endIndex;
    private final Sequence<T> sequence;
    private final int startIndex;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0010\bDJe|\u0004O\f8\u000b4E\u0007\":\u0012\u007fјnjG9LeN/zRճ\u0015s\u0012éTa4sS;\fڼ,!QU\\p\u007fnxdQCW\r$\u0004\u0003,wa?ى\u0012W>P|W3\u0004ڎ\u0004ʷ`ҽ:\u0005.@rM\b\u0005\u0019 :J v1ŏy\u000bܘ4Fxíj\u000fS\u0006(\u0014VV.\u00046\\\u0016R\rԦxҺ>;+Ʌ\u0002DT,m6\u001dO\u0013Mb/̂zp"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/m8x.\u0001#'Gx\f<5)DY\u000b\u001cFw#l\u0019", "", "7sT?T;H`", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", ">nb6g0H\\", "", "5dc\u001db:Bb\u001d\t\u0004", "u(8", "Adc\u001db:Bb\u001d\t\u0004", "uH\u0018#", "2q^=", "", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private final Iterator<T> iterator;
        private int position;
        final /* synthetic */ SubSequence<T> this$0;

        AnonymousClass1(SubSequence<T> subSequence) {
            this.this$0 = subSequence;
            this.iterator = ((SubSequence) subSequence).sequence.iterator();
        }

        private final void drop() {
            while (this.position < ((SubSequence) this.this$0).startIndex && this.iterator.hasNext()) {
                this.iterator.next();
                this.position++;
            }
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.position < ((SubSequence) this.this$0).endIndex && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            if (this.position >= ((SubSequence) this.this$0).endIndex) {
                throw new NoSuchElementException();
            }
            this.position++;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i2) {
            this.position = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(Sequence<? extends T> sequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = i2;
        this.endIndex = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i2).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i3).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i3 + " < " + i2).toString());
        }
    }

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> drop(int i2) {
        return i2 >= getCount() ? SequencesKt.emptySequence() : new SubSequence(this.sequence, this.startIndex + i2, this.endIndex);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int i2) {
        if (i2 >= getCount()) {
            return this;
        }
        Sequence<T> sequence = this.sequence;
        int i3 = this.startIndex;
        return new SubSequence(sequence, i3, i2 + i3);
    }
}
