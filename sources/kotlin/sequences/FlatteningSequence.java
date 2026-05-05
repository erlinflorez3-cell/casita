package kotlin.sequences;

import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0006ELc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007t\u0011A0JeN\u008chݷR\u0011qڔB#\u0004&wBIUB\u007f(\t]O\u0018m~Lj\u000b\n\u00104\u00189*<Sc{u\u0018\u001f4Rou\u074c{qMInxN\u001104280ڎ\u0011\u001c:HFu)H[\" 6X\u0003JT\u001dM;\u0019\"\u000eN&\u0011 lg\u00056vs\f?ǥ'\u0003wJ\u00174m6\u0015S\u001dHd'Cv\u0010%q¿7\u000633Y\u001b\u0019b]O\u0003upM\rx-7-Ys\u000e6\u0007\u0007B\u001a\u0002̀\u000fǁv&dӤ\"r\u001a*CUsM`\u000e^»)}cɠ\u0006؝\n'P͓}2t\f&?\u0005tc@\u0007\u061cnD\u0010z\u00185E*VĔ-ݰ\u001ffYĥދ\u001dW"}, d2 = {"\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\t\u0003<\u0010&\u0017Ps\u0017>d%Ai})5mk", "\"", Global.BLANK, "\u0013", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "Ad`BX5<S", "BqP;f-H`!~\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7sT?T;H`", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5((YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000e,S8", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FlatteningSequence<T, R, E> implements Sequence<E> {
    private final Function1<R, Iterator<E>> iterator;
    private final Sequence<T> sequence;
    private final Function1<T, R> transformer;

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0017\u001d̉=!,\u0010\bDJi|\u0004O\u000f8\u000b4D'!ܥ\u0018\u007f\u001d߿\u001b?@FuHdɟ\u0002)Wq\n;<[Ry\n;\u001e!\f+!O|o.ĈJ#\u0017Q\u0019\u001e\u0016/̓rֆUޯa\u0012\u001d=\u0013\u0010M3ewM;ptlӌ61P7Pڕ\rʀ.T\u0018͌\u0013EQ\r 2`r@U\u001bQU/ \u000bV&\u0011 lg\u00055vkҺ>5+Ʌ\u0002DT-m2ƐQ\u0019"}, d2 = {"9nc9\\5\ba\u0019\u000b\u000b^5z\t=/`/wO\u0010\u0017 Kx\u0010*v1EY\u0007\u001e7,\u001a=MP7z>+S4", "", "7sT:<;>`\u0015\u000e\u0005k", "5dc\u0016g,F7(~\bZ;\u0007\u0016", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "Adc\u0016g,F7(~\bZ;\u0007\u0016", "uKY.i(\bc(\u0003\u0002(\u0010\f\t<a\u000f2\t\u0016D\b", "7sT?T;H`", "5dc\u0016g,KO(\t\b", "3mbBe,\"b\u0019\u0007^m,\n\u0005>o\r", "", "6`b\u001bX?M", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<E>, KMappedMarker {
        private Iterator<? extends E> itemIterator;
        private final Iterator<T> iterator;
        final /* synthetic */ FlatteningSequence<T, R, E> this$0;

        AnonymousClass1(FlatteningSequence<T, R, E> flatteningSequence) {
            this.this$0 = flatteningSequence;
            this.iterator = ((FlatteningSequence) flatteningSequence).sequence.iterator();
        }

        private final boolean ensureItemIterator() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && !it.hasNext()) {
                this.itemIterator = null;
            }
            while (true) {
                if (this.itemIterator != null) {
                    break;
                }
                if (!this.iterator.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) ((FlatteningSequence) this.this$0).iterator.invoke(((FlatteningSequence) this.this$0).transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    break;
                }
            }
            return true;
        }

        public final Iterator<E> getItemIterator() {
            return this.itemIterator;
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ensureItemIterator();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!ensureItemIterator()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.itemIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(Iterator<? extends E> it) {
            this.itemIterator = it;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transformer, Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }
}
