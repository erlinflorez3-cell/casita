package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4C\u0007\":\u0012\u007fјnjO0LeN.X8@ş\u001c{b#\u0014#y\fUc\u001a\u0016\"7P~mupb\\!B=\u0005F~x/aW\u000f\\@\u000exf8MAQ\b=ge%:\u0013&J\"f\u0001K%˖)ϺƸv~KM\u00121^?ª>[ӉQ\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000b|", "", "/qT\u0010b4IO(\u0003we,", "", "Ak^A<+", "@dd@T)ES\u0007\u0006\u0005m\u0010{", "5dc _6Ma\b\tg^;x\r8", "", "Ak^A<+L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000be5SX;@Q\u0001+\u0014!0", "!k^A<+LA\u0019\u000e", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000e`Lc\u0003İIي8\u000b<c\u0007\"2\u0012\u007f\u0007tpA0JfP.`\\2\u000fq|<$i$yCAY\"}00WNmhvJp\u000bK\u000f\f\u0017~oBկ\u0006\u0001m\u0016\u001f4Xnm3{n}PfҚF\u0013&209\u0012\r\u0011\u001e:J&u)Cy\u000eܘ4@~=\u001b\"[\r2\u00124GP\u0007,f\u007fPLG\u001b]\u0001ǂݭ\u0007iHYoc>\te\rtao\u001e\u0005o6+n@e\u001b3b\u001b\thZm\u0003\u0006ѓ>M\u007f57CI\"`fd\u000e%-3_\u0011mt<[3Q\u000f\u000bm˚N,R^ @w)\u0005Sɴ\u0003V\u00155[F5*j\u0018\u0010Is!SndHޠBH\toK/%.<[?)picQ\u0018|7D\u001f\u001b4;\u0001\u001d*\ff\u001cw-)d{a3g?kH^\fi=\u001c\r\u001fzJ>\u0012F_\u007f]\u0005A:%>OcI'1m\u0018Grg%\u0004)\u0003a\u0004jHn+\u001f(EA!\u001ajHt\u0007\u0002O\u0003X<\u0013]\u001c\u0003\u0010, [4j\u0012T!S\u0019~[v\u0003\u0003Um\u000e51|6\bn\u001a\r(Ml4MYs\u0014qT\r\u0013m<\u0011\u0007/٫Dΐ\u0010Zd̥rBVn(w*I%ܓ\u0016\u0558Cu4627'cĒL\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000be5SX;@Q\u0001+\u0014!0", "", "", "Adc", "", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005)p", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "Ak^A<+", "/cSph08`\u0019\u0006zZ:|", "1kT.e", "", "1n]AT0Ga", "3kT:X5M", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ak^A<+L", "@dc.\\5\u001aZ ", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {
        public static final int $stable = 8;
        private final Set<Object> set;

        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.set.containsAll(collection);
        }

        public int getSize() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        public SlotIdsSet(Set<Object> set) {
            this.set = set;
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public /* synthetic */ SlotIdsSet(LinkedHashSet linkedHashSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (i2 | 1) != 0 ? new LinkedHashSet() : linkedHashSet);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.set.remove(collection);
        }

        public final boolean removeAll(Function1<Object, Boolean> function1) {
            return CollectionsKt.removeAll(this.set, function1);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.set.retainAll(collection);
        }

        public final boolean retainAll(Function1<Object, Boolean> function1) {
            return CollectionsKt.retainAll(this.set, function1);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }
    }
}
