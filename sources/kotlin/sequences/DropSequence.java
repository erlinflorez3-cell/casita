package kotlin.sequences;

import java.util.Iterator;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007llA0R\fP.XS0ş\u0002ڔ\\&aҕ\u007fBk[*\u007f2\t\u0016M\u0016g\u001fPj\rS\u000fL\u0015'klbe\u0003k\u0014'8RqO3\u0004ڎk9pxD\b82P<ѩ\t\u0001(/\u0011$\u0005\u0001[Q\u001c\u0014@@'í\u0001\r}\t(\u0019\u001e>N\u0005dp0[DP\u0005cJ13\u0003 ĩ|0&ܵ|\u0016!T^?\u0013\u0007c.+vʺc\u0015UW\u0011\u000ej[m\u0007\u0006\u0006\u000e\u0011v*?+ww.̯Zÿ\u0018\u00153˽]o\u0001(t\u000bab\u001c'aՒ\u0012K'ʮ*Þ~{\u0015ɝǲ\u0012\u0011"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0007\tJ\f\u0005\u0017S\u007f\u000eEt%\u000b", "\"", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0007\tJ\f\u0006\u0013Mo{<\u000355b{ \r", "Ad`BX5<S", "1nd;g", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012Zh&", "2q^=", "<", "7sT?T;H`", "", "B`Z2", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int count;
    private final Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0010\bDJe|\u0004O\f8\u000b4E\u0007\":\u0012\u007fјnjG9LeN/zRճ\u0015s\u0012éTa4sS;\fڼ,!QU\\p\u007fnxdQCW\r$\u0004\u0003,wa?ى\u0012W>P|W3\u0004ڎ\u0004ʷ`ҽ:\u0005.@rM\b\u0005\u0019 :J v1ŏy\u000bܘ4Fxíj\u000fS\u0006(\u0014VV.\u00046\\\u0016R\rԦxҺ>;+Ʌ\u0002DT,m6\u001dO\u0013Mb/̂zp"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/^5\u0006Kn\u0017#Wo\u0017:vc9h}-3| ;\f\u000f", "", "7sT?T;H`", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", ":dUA", "", "5dc\u0019X-M", "u(8", "Adc\u0019X-M", "uH\u0018#", "2q^=", "", "6`b\u001bX?M", "", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private final Iterator<T> iterator;
        private int left;

        AnonymousClass1(DropSequence<T> dropSequence) {
            this.iterator = ((DropSequence) dropSequence).sequence.iterator();
            this.left = ((DropSequence) dropSequence).count;
        }

        private final void drop() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getLeft() {
            return this.left;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i2) {
            this.left = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(Sequence<? extends T> sequence, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> drop(int i2) {
        int i3 = this.count + i2;
        return i3 < 0 ? new DropSequence(this, i2) : new DropSequence(this.sequence, i3);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int i2) {
        int i3 = this.count + i2;
        return i3 < 0 ? new TakeSequence(this, i2) : new SubSequence(this.sequence, this.count, i3);
    }
}
