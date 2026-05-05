package co.touchlab.stately.collections;

import com.dynatrace.android.agent.Global;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&˛\bDRш|\u0004W\u00068\u000b<_\u0007\"2\u0014\u007f\u0007tpA0JiP.`\\2\u000fq}<$i@yCAV\"}8\tWNmgvJh\u000bK\u000f\f\u0018\u0001j:p]xc\u0014\u0015FXģg5SڎK8\u0011xd\u0005\t2\u00019*\u000b\u0011\u001c:HVu)E\f1\u0018ؓP~@R\u001bP\u001d\"(\u0005l i rf-7Xvk>G)\u0013kRN]ڿ^~֔\u0011Fb,U\no+C@eCE)a\u0012\u001fR\u0012ΪISџA\u0005v7o?W\u0005o6\u0007\u000eD\u001f9a%c\u0003(l\u0005\bӠ::qc,t^\"@wA\u0011->\n\r\u0014<xD;0~\u001a\u001e;\u0005xcB`\u0002\u0015ۍ.|q8'%FHYPӸjQoSaTE\u0015\u001d\rL=G\u0003iob)x\u0015Ib(U?`X=~ݐPՆ=ъ\bpp\u0012r\u0018>c\u0018/*\u001f^!3Is?3#{\u0002~ֳ\u0016\nKt1Ywo`@P|\\Kr\u0016\u001ax\\j\u0015m`T\u000f\u008c?lbΘ\u0007F\u001b!@twj/U\u0014\\^\u0001i!ܔ$\u001eɻ3fEi7\u007f\u001cxQ^aC\u0002m\u001esj|$ALb;֚\u0015U\u001a #p6DJH\u0019\u001e(\u0006R`$\u0019BA\u0002\u001cjι_,#)\u0019\u0015,FY\u0003\u0019ajhFз\u00035zѳk˨x\t\tˆ-\u0003}m\u0011IZ\u0004\u0017v\u0004ۢSڤ\u001d*m$n<\u000b,W\u0015\u0002\n_kzG5ltv,ݩ\"ک\u001e?YǽU\u0015\u0015\n7>ı1h"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\nX}.GJ]0f[H", "\u0013", "", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG\u000eKv\u00141ZMDoI\u001a\u0012oa\u000f", "", "@n^A49@", "2d[", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u0013c\u0005'7k%2WL\u0011/%", "Ahi2", "", "5dc \\A>", "u(8", "Ax]0G(KU\u0019\u000e", "5dc l5<B\u0015\f|^;;\u0017>a\u000f(\u0003Tz\u0015!Pm\u001eI\u0004%>hw\u001eAt\u001d.KR?u=,", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "", "0k^0^\nHZ ~xm0\u0007\u0012", Global.BLANK, "4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1kT.e", "", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ConcurrentMutableCollection<E> implements Collection<E>, KMutableCollection {
    private final Collection<E> del;
    private final Object syncTarget;

    public ConcurrentMutableCollection(Object obj, Collection<E> del) {
        Intrinsics.checkNotNullParameter(del, "del");
        this.del = del;
        this.syncTarget = obj == null ? this : obj;
    }

    public /* synthetic */ ConcurrentMutableCollection(Object obj, Collection collection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : obj, collection);
    }

    @Override // java.util.Collection
    public boolean add(final E e2) {
        Boolean boolInvoke;
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.add.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.add(e2));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean addAll(final Collection<? extends E> elements) {
        Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.addAll.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.addAll(elements));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    public final <R> R blockCollection(final Function1<? super Collection<E>, ? extends R> f2) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(f2, "f");
        Object obj = this.syncTarget;
        Function0<R> function0 = new Function0<R>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.blockCollection.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final R invoke() {
                MutableCollectionWrapper mutableCollectionWrapper = new MutableCollectionWrapper(((ConcurrentMutableCollection) this.this$0).del);
                R rInvoke2 = f2.invoke(mutableCollectionWrapper);
                mutableCollectionWrapper.set_coll$stately_concurrent_collections(null);
                return rInvoke2;
            }
        };
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }

    @Override // java.util.Collection
    public void clear() {
        Object obj = this.syncTarget;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.clear.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

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
                ((ConcurrentMutableCollection) this.this$0).del.clear();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Collection
    public boolean contains(final Object obj) {
        Boolean boolInvoke;
        Object obj2 = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.contains.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.contains(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean containsAll(final Collection<? extends Object> elements) {
        Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.containsAll.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.containsAll(elements));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    public int getSize() {
        Integer numInvoke;
        Object obj = this.syncTarget;
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.size.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableCollection) this.this$0).del.size());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    public final Object getSyncTarget$stately_concurrent_collections() {
        return this.syncTarget;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        Boolean boolInvoke;
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.isEmpty.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.isEmpty());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        ConcurrentMutableIterator<E> concurrentMutableIteratorInvoke;
        Object obj = this.syncTarget;
        Function0<ConcurrentMutableIterator<E>> function0 = new Function0<ConcurrentMutableIterator<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.iterator.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableIterator<E> invoke() {
                return new ConcurrentMutableIterator<>(this.this$0.getSyncTarget$stately_concurrent_collections(), ((ConcurrentMutableCollection) this.this$0).del.iterator());
            }
        };
        synchronized (obj) {
            concurrentMutableIteratorInvoke = function0.invoke();
        }
        return concurrentMutableIteratorInvoke;
    }

    @Override // java.util.Collection
    public boolean remove(final Object obj) {
        Boolean boolInvoke;
        Object obj2 = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.remove.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.remove(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean removeAll(final Collection<? extends Object> elements) {
        Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.removeAll.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.removeAll(elements));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean retainAll(final Collection<? extends Object> elements) {
        Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection.retainAll.1
            final /* synthetic */ ConcurrentMutableCollection<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableCollection) this.this$0).del.retainAll(elements));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
