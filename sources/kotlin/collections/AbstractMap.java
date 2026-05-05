package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0006DLc\u0003&I\u00066\u000b6B\rB4ߚ\u007f\u0007t\u0007A0JgP.`Y2\u000fq\u007f<$i-yّCU(\"*\tUTog|Ϻb\u000bI\u0014\u000e\u0016\u0007v4I[yc7%˰`\u0017g5SڎK8\tx<\u0004.2@7*\u0011\u0011\u001c:HVu\u000bE[\fX0nqrQ4\u000e\n \u0014ĂB \u000f %\u0005\\G`l\fL_1\u0011|ZX7_6}]\rLU=\f%udѨË;5\u001b:\u001c\u0016\u0015hs?1Q\"A\u0013\u007f?'aɞ:k͏\\\u007f\"-sb\u001bv\u000b&\u000b\u0017\u0002d\u001aACO\u001aJ\u0017\"߭{z\n%\u0005\u0015\u001c!?H\\?Jl\u0016*Kv\tRnmHޠBH\u0011oT/'\u00162a8Kj_xS\u0019\u0005љB˳\r̷'\u0001|@$Z\u001c\u0001-\u001b\u0003\u0003\u0018E\u001aaKif\u0018i?}\u0004'ç\u0012,\u00140}~Ez?BG)ErQ#WǽHHזkv\u0013\u00031Ywu`@P\u0001\\Kr\u000f\u001a~\\d3\u0011\u0017h!<\u001fq4T5#8\u0019.\u0003\u0010>7$>k\u0016h2\u0005[\u0002\"%]\fgi|~&cI`C5\bү cbvJ>jvK^7Va\u000frd8$BH!ݘ\u000ezrRbƑ>Ɛu\u001c<ι\u0002-j\u001a`\u000b.DQ|?^pg>\u0005+ե0ғm$|էQhjw\bm\tK<|\u0017õ[E\b\noĶWɋl8\u0015%\r\u0007\u0002\t\u0018yZQdlD\u0001\fPvڝ\u001c\u07fcU3U\u0015\u0015\u000b7?RESZ\u000bkaO\"'1{(\u0015q=\u0005ԭ\nϡt0xlP^b'Țz\u0007"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^!@/", "\u0019", "$", "", "u(E", "-jTFf", "", "-uP9h,L", "", "9dh@", "5dc\u0018X@L", "u(;7T=:\u001d)\u000e~euj\t>;", "Ahi2", "", "5dc \\A>", "u(8", "D`[BX:", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "1n]AT0Gax\b\nk@", "", "3mc?l", "", "1n]AT0Gax\b\nk@;\u000f9t\u0007,\u0005:\u000f&\u0016Ns\u000b", "1n]AT0Ga~~\u000f", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "3pd._:", "=sW2e", "", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "6`b566=S", "7l_990GRx\b\nk@", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~Ay+uM\u001f=ZW\u0011", "7r4:c;R", "BnBAe0GU", "", "=", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":6\u007f\u0007lkA0RkP.XS2\u000fy\b<$a$wْ<kڼ.\"7N\u000flmnН^\u000bQ\u000fN;\u0007kDI\u0004z\u000e\u001e\u001d5ZwO3SpM9fud\tP80=\u0012\u0007\u0017\u0019XGV͌ټGK\u0012\u0018x[~Aj\r{\rJ\u001e\u0014A8\t.\\mOFHr^h3iɅݦFN-hx\u0018[\u0017^TU\u0018'm,.X?E\u0015+T\u0013\u0007X\\m\u0007\u0006мݘ\th-3ȋM\u0001"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^!@\u0018[*?x\u00127QMDA", "", "u(E", "3mc?l\fJc\u0015\u0006\t", "", ExifInterface.GPS_MEASUREMENT_3D, "", "=sW2e", "3mc?l\fJc\u0015\u0006\t\u001d2\u0007\u00186i\t\"\nO\u007f\u001e\u001bD", "3mc?l\u000f:a\u001c\\\u0005],", "", "3mc?l\u000f:a\u001c\\\u0005],;\u000f9t\u0007,\u0005:\u000f&\u0016Ns\u000b", "3mc?l\u001bHA(\f~g.", "", "3mc?l\u001bHA(\f~g.;\u000f9t\u0007,\u0005:\u000f&\u0016Ns\u000b", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean entryEquals$kotlin_stdlib(Map.Entry<?, ?> e2, Object obj) {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.areEqual(e2.getKey(), entry.getKey()) && Intrinsics.areEqual(e2.getValue(), entry.getValue());
        }

        public final int entryHashCode$kotlin_stdlib(Map.Entry<?, ?> e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Object key = e2.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = e2.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        public final String entryToString$kotlin_stdlib(Map.Entry<?, ?> e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            return new StringBuilder().append(e2.getKey()).append('=').append(e2.getValue()).toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.AbstractMap$toString$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,t\bDJd|\u0004O*8é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0diN-`TH\u000e\u001c\fB&s0\u0002EKU`}2\u000b_N.h\u001dM!\u0013ß\u0013\u0006\u001c|"}, d2 = {"\n`]<a@F])\rS", "", "\u0019", "$", "7s", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Map.Entry<? extends K, ? extends V>, CharSequence> {
        final /* synthetic */ AbstractMap<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AbstractMap<K, ? extends V> abstractMap) {
            super(1);
            this.this$0 = abstractMap;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<? extends K, ? extends V> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.this$0.toString((Map.Entry) it);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.AbstractMap$values$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я#\u001d̉=!4i\bӵLc\u0003\nI\u00066\f6B\r+4\u0012}\bnjGVL͜p-ɟY2%ӆ,:4]4qyП\u0004\u0019F6\u0017Sfg\u0016sz^\u0019I'\u0006Lю1߱IǤ|] \u0016zO}GKS\u007f?I`+Ȃ3)xŉ8J\u0017\u000f\u001aBH>w1\u0018\"ß\u0014ضDtRT\u0013O\u0013\u001dŰ\nH"}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eqW=\u000f&$Cm\u001d$r0sjy'Gm$l\u0019", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fKT/<`}\u001eFq 7#", "Ahi2", "", "5dc \\A>", "u(8", "1n]AT0Ga", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C13401 extends AbstractCollection<V> {
        final /* synthetic */ AbstractMap<K, V> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        C13401(AbstractMap<K, ? extends V> abstractMap) {
            this.this$0 = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.this$0.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.this$0.size();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new AbstractMap$values$1$iterator$1(this.this$0.entrySet().iterator());
        }
    }

    protected AbstractMap() {
    }

    private final Map.Entry<K, V> implFindEntry(K k2) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getKey(), k2)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + '=' + toString(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        AbstractMap<K, V> abstractMap = this;
        Intrinsics.checkNotNull(abstractMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v2 = abstractMap.get(key);
        if (!Intrinsics.areEqual(value, v2)) {
            return false;
        }
        if (v2 != null) {
            return true;
        }
        Intrinsics.checkNotNull(abstractMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return abstractMap.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> entryImplFindEntry = implFindEntry(obj);
        if (entryImplFindEntry != null) {
            return entryImplFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new AbstractSet<K>(this) { // from class: kotlin.collections.AbstractMap$keys$1
                final /* synthetic */ AbstractMap<K, V> this$0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.this$0 = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object obj) {
                    return this.this$0.containsKey(obj);
                }

                @Override // kotlin.collections.AbstractCollection
                public int getSize() {
                    return this.this$0.size();
                }

                @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public Iterator<K> iterator() {
                    return new AbstractMap$keys$1$iterator$1(this.this$0.entrySet().iterator());
                }
            };
        }
        Set<? extends K> set = this._keys;
        Intrinsics.checkNotNull(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new AbstractCollection<V>(this) { // from class: kotlin.collections.AbstractMap.values.1
                final /* synthetic */ AbstractMap<K, V> this$0;

                /* JADX WARN: Multi-variable type inference failed */
                C13401(AbstractMap<K, ? extends V> this) {
                    this.this$0 = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object obj) {
                    return this.this$0.containsValue(obj);
                }

                @Override // kotlin.collections.AbstractCollection
                public int getSize() {
                    return this.this$0.size();
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public Iterator<V> iterator() {
                    return new AbstractMap$values$1$iterator$1(this.this$0.entrySet().iterator());
                }
            };
        }
        Collection<? extends V> collection = this._values;
        Intrinsics.checkNotNull(collection);
        return collection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k2, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new Function1<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap.toString.1
            final /* synthetic */ AbstractMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(AbstractMap<K, ? extends V> this) {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Map.Entry<? extends K, ? extends V> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.toString((Map.Entry) it);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
