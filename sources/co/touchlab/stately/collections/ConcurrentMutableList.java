package co.touchlab.stately.collections;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
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
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDZc|\u0004O%8\u000b4B\u0007\":ߚ\u007f\u0007|jA0JfP.`S2şs{B*c$wDCU(\u0007*ޛWNu\u0004vJ`\fK\u000f\u001c\u0016\u0001j2N]xk;\u00172HtU\u074cuqCʠnsf\u000b0428@\u0004/\u001aZN x\u000bC\u0012\u000b@1\u0001u@fҫQ\u0005(\u0014Fa&ҵ.huQNP\u0003\\h3\f\u0005\u007fA-,o:\u000bS%Ld)\u001dv\u0018ӜYA˝9\u00153ZK\"`cW\u0003mzm\tv1?+w~\b:f\f,\u0015a˽Sqę*\\\u0013^)(59gcy_>,\u0006\u0005\u0014\rj\u000f>\u00105XF3*h\u0018\u000eiο!d\u0007dJ\bP\u0012\u0013a|*E\u00029*G.\u0017goO1`G\u0004\u0015\u0013.%\u0011nWż\u0003\u000fp\u0017+T>d_f͘AH\\ \"Q{\u001b\tb8Ï44U\nG{?9]½7٦=#/\u0004J[R\u0001\u000f\u0005\u000fs\u0004m`TX\"%ݫ}>Á\u0010ZR~M~^op,?XLX\u0015\n \u0013Vο>PƼ)\u0010\\i1uxiu\u001051v7\u0010ʤ\u001a+\u001eM'GCm{\u0016qT\u0007\u0014uֺ\u0011\"\tjP]$Z\u000b3hF\u0011}\u001e\u0016\u0014D\u0005ۼC6M{44Z<_pČL\u0003,Z\n\u0019\u0017~rhFз\u000572\r\u0002$#\u00141Tj|\bg/̢rʠ`Ę1A_UaBcC\u0001:\r%\u0017~*Òuh|KZ\u000f.u\u0004\u0007P\u001a(\\i/k\u001eU\u0013yD\u00103]R\u0003gaMH\u05fd)}Pһ=ÿ2g\u0010ξҚ0\u0005"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\u0013R\u00056\u001d", "\u0013", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\nX}.GJ]0f[H", "", "u(E", "@n^A49@", "", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG\u000eKv\u00141ZMDoI\u001a\u0012oa\u000f", "2d[", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\r1\u0007", "/cS", "", "7mS2k", "", "3kT:X5M", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "", "3kT:X5Ma", "", "0k^0^", Global.BLANK, "4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,\u001ab", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ConcurrentMutableList<E> extends ConcurrentMutableCollection<E> implements List<E>, KMutableList {
    private final List<E> del;

    public ConcurrentMutableList() {
        this(null, new ArrayList());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentMutableList(Object obj, List<E> del) {
        super(obj, del);
        Intrinsics.checkNotNullParameter(del, "del");
        this.del = del;
    }

    @Override // java.util.List
    public void add(final int i2, final E e2) {
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.add.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((ConcurrentMutableList) this.this$0).del.add(i2, e2);
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            function0.invoke();
        }
    }

    @Override // java.util.List
    public boolean addAll(final int i2, final Collection<? extends E> elements) {
        Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.addAll.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableList) this.this$0).del.addAll(i2, elements));
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    public final <R> R block(final Function1<? super List<E>, ? extends R> f2) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(f2, "f");
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<R> function0 = new Function0<R>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.block.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final R invoke() {
                MutableListWrapper mutableListWrapper = new MutableListWrapper(((ConcurrentMutableList) this.this$0).del);
                R rInvoke2 = f2.invoke(mutableListWrapper);
                mutableListWrapper.setList$stately_concurrent_collections(new ArrayList());
                return rInvoke2;
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }

    @Override // java.util.List
    public E get(final int i2) {
        E eInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.get.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) ((ConcurrentMutableList) this.this$0).del.get(i2);
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public int indexOf(final Object obj) {
        Integer numInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.indexOf.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableList) this.this$0).del.indexOf(obj));
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.List
    public int lastIndexOf(final Object obj) {
        Integer numInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.lastIndexOf.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableList) this.this$0).del.lastIndexOf(obj));
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        ConcurrentMutableListIterator<E> concurrentMutableListIteratorInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<ConcurrentMutableListIterator<E>> function0 = new Function0<ConcurrentMutableListIterator<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.listIterator.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableListIterator<E> invoke() {
                ConcurrentMutableList<E> concurrentMutableList = this.this$0;
                return new ConcurrentMutableListIterator<>(concurrentMutableList, ((ConcurrentMutableList) concurrentMutableList).del.listIterator());
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            concurrentMutableListIteratorInvoke = function0.invoke();
        }
        return concurrentMutableListIteratorInvoke;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(final int i2) {
        ConcurrentMutableListIterator<E> concurrentMutableListIteratorInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<ConcurrentMutableListIterator<E>> function0 = new Function0<ConcurrentMutableListIterator<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.listIterator.2
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableListIterator<E> invoke() {
                ConcurrentMutableList<E> concurrentMutableList = this.this$0;
                return new ConcurrentMutableListIterator<>(concurrentMutableList, ((ConcurrentMutableList) concurrentMutableList).del.listIterator(i2));
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            concurrentMutableListIteratorInvoke = function0.invoke();
        }
        return concurrentMutableListIteratorInvoke;
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i2) {
        return removeAt(i2);
    }

    public E removeAt(final int i2) {
        E eInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.removeAt.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) ((ConcurrentMutableList) this.this$0).del.remove(i2);
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public E set(final int i2, final E e2) {
        E eInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.set.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) ((ConcurrentMutableList) this.this$0).del.set(i2, e2);
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public List<E> subList(final int i2, final int i3) {
        ConcurrentMutableList<E> concurrentMutableListInvoke;
        Object syncTarget$stately_concurrent_collections = getSyncTarget$stately_concurrent_collections();
        Function0<ConcurrentMutableList<E>> function0 = new Function0<ConcurrentMutableList<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList.subList.1
            final /* synthetic */ ConcurrentMutableList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableList<E> invoke() {
                ConcurrentMutableList<E> concurrentMutableList = this.this$0;
                return new ConcurrentMutableList<>(concurrentMutableList, ((ConcurrentMutableList) concurrentMutableList).del.subList(i2, i3));
            }
        };
        synchronized (syncTarget$stately_concurrent_collections) {
            concurrentMutableListInvoke = function0.invoke();
        }
        return concurrentMutableListInvoke;
    }
}
