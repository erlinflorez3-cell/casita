package kotlin.collections;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,\u0004\bDJc|\u0004W\u00068\u000b<h\u0007Ӭ4\u0012\u0006\rnj?2LeVLZݷ2\u000f\u0002{<$a$\noI٥2\u00042\u000b_N.g\u001dIz\rIƤ\u0014\u0016)|2Kcyu\u001e\u001f:RuO5]o\u00049\u000fwd\u0007fݍ(ٹxڎ\u001988L(v)Hk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l\u001f1\"jmf6vq$9G@\u0011pZP=^^\u0002m\u000fLÖ5\r\u001fg.-P7{\u0015SRI\u0006қ_?\u0011G\n]\u0013q?-;K\u0004W|X.\u001e5-UՕkrNh\u0015Yp\u00127-_c\u0012P<'&y\u0014KJ\u000f&\u001e7P>3*h\u0018\u000eyt!]PX\u0012dR\u0002\u000ba|$S\na7Y\u001dlϟo;9P=z\u0013\u001aF5\u0011|1gd\u0010p\u0015aT\bSAQ\u0007JvZ8XƠm\txe\bé4^FĲ3\n"}, d2 = {"\u0017sT?T)ES", "", "\"", "7sT?T;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1n[9X*MW#\bhbA|r<D\u007f)wP\b&", "", "2dU.h3M", "1n[9X*MW#\bhbA|r<N\u0010/\u0003", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G\u0004@|\u00160MP\u0011", "4kPAg,G", "", "Cmi6c", "\u001aj^A_0G\u001d\u0004z~k\u0002", Global.BLANK, "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {

    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IterablesKt$Iterable$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!,\u0004\bӵLc\u0003*IيX\nǞH\u00078ܥB}\u0017hz9fǏ\u0014Gv_a*'q\f64[Zڎq<\u001cۓ}͆\rQ"}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eqYJ\b\u001e\u0017E~\u0012F\u007f3\u001bhw\u001a\u001b|\u0016;I@BkB\u0004$'EH\u0007p(K}'\u0006\u0018", "", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Function0<Iterator<T>> $iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends Iterator<? extends T>> function0) {
            this.$iterator = function0;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.$iterator.invoke();
        }
    }

    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new AnonymousClass1(iterator);
    }

    public static final <T> int collectionSizeOrDefault(Iterable<? extends T> iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
