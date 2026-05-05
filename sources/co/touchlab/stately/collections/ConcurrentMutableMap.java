package co.touchlab.stately.collections;

import com.dynatrace.android.agent.Global;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0006DLc\u0003İI\u0006F\u000b6B\rE4\u0012}\nnjGQLeVSZS0\u0012s{B*c$wECU(\u001b*\tUQog\u0005Jb\u000bI\u000f\u000e\u0016\u0007j4I[|e\u0012\u001d;JoE;UoK[ht<\u00056݅J:\u007fڎ\u000f\u0019RJ\u0016u\tC{\u0010@1)p\u0019T=Y\u0015\u001c\"\u0006\u0005\u001f\u0011 lg\u00156vo\u001e?57ɨmB\\+ [\u0003ձ\u001dTZ'\u001b{y&A?e6}'i\u0002eTkO\u0011E\nI\u0015j7'aɞ\u0004YFX6\u0013C.̠\u0011]\u0001-%4_x$'qh\u0004MV\u000e6\u0011+\u0018\u001bV\u001c&\u00165X:=\u001cv\bDޗ\u0005tc@\u0007\u0001\rE\u0010|q6]>.Nڢ=\u001btm*A'kO{3+d7I\u0018/zl\u000e\u0017\u0014KX\u0006qIQv׀x^\u0018zUy\u0014rr\u0002`ʶ@I\u0010/2\u0010\\2k<٦=%'\u000e\u0010k\rz\u0005)xh\u0002\u000f\u0003LNB\u0007\u0016mѧO ʑHd\u0013\u0012\u0019gfS)MJy7\u0002\u0016;8\\.;g9ŎROv\u00103ck3=1|6\u0010m\u001c\u0012eYv3kȡ*ߛa؏z\u0014Mf+\u000bf\u0012ZS:\u007f#<jOV\u0017(y\u0012C\u0005\u000bC6M\u001244bջI`#p\u001b\u001ex@C\u001dރ^h\u001e,\u001dO21\u0002$#'1bj \bu\tM2{p\"cۋa7)&\f!\u0017dC7O\u0014\u00021_ibF\u0003kFyc\u001c8\u0016Pߙ\u0018Cˮ\u0017\u000f\rS\u0003\u001a;Kd~uS]\u0012]ϕ\r{\u001f;\u001f-\u0016\u000bAѴ.߯nJWܷgF\u0005f\u000b5\u0018r\u0010\u0006qH\u000bG\u001aҺ\u001b]NI)\u0002\bF|A3YuǞ'˽s&\u001573N5)f\u0010\"<-gmk\u007f.0ʬ=/+:ZБe݁sfi_8IFU*\u0011L1<l1R~?NٻDީ8\u0011KJGu~h\t]\u0019B\u0016j5-up5]\u0011ܧqϻ8.g͈D[\f(vI5\u0013]S\u001el\u001c`\u0013_!ؑ\fν\u007f5\u0007\u0014\"S.m͙f;"}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG}Av\u0014>ZP;tC\u0006%w]6\u000ec\u0014J\u0002|", "\u0019", "$", "", "\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~! E\u007f\u001bIv.3mG\u000eKv\u00141ZMDoI\u001a\u0012oa\u000f", "", "u(E", "@n^A49@", "2d[", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tuz^", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", "Ahi2", "", "5dc \\A>", "u(8", "Ax]0G(KU\u0019\u000e", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "0k^0^", Global.BLANK, "4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1kT.e", "", "1n\\=h;>7\u001aZwl,\u0006\u0018", "9dh", "2dU.h3MD\u0015\u0006\u000b^", "A`U266F^)\u000ezB-X\u0006=e\t7", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "1n]AT0Ga~~\u000f", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "7r4:c;R", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", "", "@d\\<i,", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ConcurrentMutableMap<K, V> implements Map<K, V>, KMutableMap {
    private final Map<K, V> del;
    private final Object syncTarget;

    public ConcurrentMutableMap() {
        this(null, new LinkedHashMap());
    }

    public ConcurrentMutableMap(Object obj, Map<K, V> del) {
        Intrinsics.checkNotNullParameter(del, "del");
        this.del = del;
        this.syncTarget = obj == null ? this : obj;
    }

    public /* synthetic */ ConcurrentMutableMap(Object obj, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : obj, map);
    }

    public final <R> R block(final Function1<? super Map<K, V>, ? extends R> f2) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(f2, "f");
        Object obj = this.syncTarget;
        Function0<R> function0 = new Function0<R>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.block.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final R invoke() {
                MutableMapWrapper mutableMapWrapper = new MutableMapWrapper(((ConcurrentMutableMap) this.this$0).del);
                R rInvoke2 = f2.invoke(mutableMapWrapper);
                mutableMapWrapper.setMap$stately_concurrent_collections(new LinkedHashMap());
                return rInvoke2;
            }
        };
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }

    @Override // java.util.Map
    public void clear() {
        Object obj = this.syncTarget;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.clear.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

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
                ((ConcurrentMutableMap) this.this$0).del.clear();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(final Object obj) {
        Boolean boolInvoke;
        Object obj2 = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.containsKey.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableMap) this.this$0).del.containsKey(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public boolean containsValue(final Object obj) {
        Boolean boolInvoke;
        Object obj2 = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.containsValue.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableMap) this.this$0).del.containsValue(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(final Object obj) {
        V vInvoke;
        Object obj2 = this.syncTarget;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.get.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) ((ConcurrentMutableMap) this.this$0).del.get(obj);
            }
        };
        synchronized (obj2) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        ConcurrentMutableSet<Map.Entry<K, V>> concurrentMutableSetInvoke;
        Object obj = this.syncTarget;
        Function0<ConcurrentMutableSet<Map.Entry<K, V>>> function0 = new Function0<ConcurrentMutableSet<Map.Entry<K, V>>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$entries$1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableSet<Map.Entry<K, V>> invoke() {
                ConcurrentMutableMap<K, V> concurrentMutableMap = this.this$0;
                return new ConcurrentMutableSet<>(concurrentMutableMap, ((ConcurrentMutableMap) concurrentMutableMap).del.entrySet());
            }
        };
        synchronized (obj) {
            concurrentMutableSetInvoke = function0.invoke();
        }
        return concurrentMutableSetInvoke;
    }

    public Set<K> getKeys() {
        ConcurrentMutableSet<K> concurrentMutableSetInvoke;
        Object obj = this.syncTarget;
        Function0<ConcurrentMutableSet<K>> function0 = new Function0<ConcurrentMutableSet<K>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$keys$1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableSet<K> invoke() {
                ConcurrentMutableMap<K, V> concurrentMutableMap = this.this$0;
                return new ConcurrentMutableSet<>(concurrentMutableMap, ((ConcurrentMutableMap) concurrentMutableMap).del.keySet());
            }
        };
        synchronized (obj) {
            concurrentMutableSetInvoke = function0.invoke();
        }
        return concurrentMutableSetInvoke;
    }

    public int getSize() {
        Integer numInvoke;
        Object obj = this.syncTarget;
        Function0<Integer> function0 = new Function0<Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.size.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(((ConcurrentMutableMap) this.this$0).del.size());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    public Collection<V> getValues() {
        ConcurrentMutableCollection<V> concurrentMutableCollectionInvoke;
        Object obj = this.syncTarget;
        Function0<ConcurrentMutableCollection<V>> function0 = new Function0<ConcurrentMutableCollection<V>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.values.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentMutableCollection<V> invoke() {
                ConcurrentMutableMap<K, V> concurrentMutableMap = this.this$0;
                return new ConcurrentMutableCollection<>(concurrentMutableMap, ((ConcurrentMutableMap) concurrentMutableMap).del.values());
            }
        };
        synchronized (obj) {
            concurrentMutableCollectionInvoke = function0.invoke();
        }
        return concurrentMutableCollectionInvoke;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Boolean boolInvoke;
        Object obj = this.syncTarget;
        Function0<Boolean> function0 = new Function0<Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.isEmpty.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(((ConcurrentMutableMap) this.this$0).del.isEmpty());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(final K k2, final V v2) {
        V vInvoke;
        Object obj = this.syncTarget;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.put.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) ((ConcurrentMutableMap) this.this$0).del.put(k2, v2);
            }
        };
        synchronized (obj) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    @Override // java.util.Map
    public void putAll(final Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object obj = this.syncTarget;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.putAll.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                ((ConcurrentMutableMap) this.this$0).del.putAll(from);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Map
    public V remove(final Object obj) {
        V vInvoke;
        Object obj2 = this.syncTarget;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap.remove.1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                return (V) ((ConcurrentMutableMap) this.this$0).del.remove(obj);
            }
        };
        synchronized (obj2) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    public final V safeComputeIfAbsent(final K k2, final Function1<? super K, ? extends V> defaultValue) {
        V vInvoke;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.syncTarget;
        Function0<V> function0 = new Function0<V>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableMap$computeIfAbsent$1
            final /* synthetic */ ConcurrentMutableMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final V invoke() {
                V v2 = (V) ((ConcurrentMutableMap) this.this$0).del.get(k2);
                if (v2 != null) {
                    return v2;
                }
                V vInvoke2 = defaultValue.invoke(k2);
                ((ConcurrentMutableMap) this.this$0).del.put(k2, vInvoke2);
                return vInvoke2;
            }
        };
        synchronized (obj) {
            vInvoke = function0.invoke();
        }
        return vInvoke;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
