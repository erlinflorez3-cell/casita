package co.touchlab.stately.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0006DLc\u0003'I\u00066\f6B\rC4\u0012\u0006,nj?6LeV4ZS0\u0010s{BAc$wDCU(}*ޛWNupvJ`\u0014K\u000f\u00148\u0001j2I[ތs܈74HģM2uqC8ntf\u00110428@\u0004\u0011\u001c:HVv)D\f#\"@NrR^\u001dO\u0015\u001aHßN\"\u0011\u001e\u0013f|7Ղp]H2k\twXf'\u000eGCaUYb?%v\u00107[DEO-%\nΈMfÜC\u0003M\r\u0006\u0018vC?+w\r\b:f\u001d,\u0015aNSqę*\\\u0013l)\"5IgeaOD'(~\n'T\u0004Dͺmε.ǉ\u001ef\u0016-{z\u0001sXP0w\t\u0014C~D8=\u0002I*o\u001a\u0017UoU1Nmަ5\u0011,@\u0019nWZ\u001b\"\u05ce\u0019\u001bb\u001a\u001aM_cUH|!\nO{(\tp\u0012.\n/W\u007feɅ!0'%mZgHg\u007fJ]R\u000e\u000f\u0007vg\nh\u0003LN<\u0007\u0016mѧO ʑHd\u0013\u000b!xf0)_,b\u0017\n\u0018\u00150\\.˓1' N\u0006g\u0018p{b@y\u0006Ϡ9֍ro&Y?eA=\"{\u001ejj|$ALb;֚\u0015G\n`1ٹ*ϒ6L\u0003\u0012}\u0006RV\\7@A\n(D.A\u0019\u0013éX\u0005.Bw{7`1ӑ\u001cњX?,Ѱ\u0002&z\u0014\u000f\\|rut\u0007L|\u000fn0EA\u007fDOz,ȿjط\u0001'\u001f\u0001y\u0010Ux\u001d_Z~.{e}0\u0016P8\u007fBsgeɆ+ɨ\u00061]Nxy_bɥ+\""}, d2 = {"\u001ab^{g6NQ\u001c\u0006v[u\u000b\u0018+t\u007f/\u0010\n~!\u001eNo\fKz/>gG\bG|\u0012+TC#g?\u0010\"dlD\u0007p\u0002", "\u0019", "$", "", ";`_", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", "5dc\u001aT7|a(z\n^3\u0011\u0003-o\t&\fM\u000e\u0017 Vi\fF},5W\r$Av$", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u001aT7|a(z\n^3\u0011\u0003-o\t&\fM\u000e\u0017 Vi\fF},5W\r$Av$", "Ahi2", "", "5dc \\A>", "u(8", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "1kT.e", "", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "7r4:c;R", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", "", "@d\\<i,", "AsPAX3R\u001b\u0017\t\u0004\\<\n\u0016/n\u000foyJ\b\u001e\u0017E~\u0012F\u007f3"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MutableMapWrapper<K, V> implements Map<K, V>, KMutableMap {
    private Map<K, V> map;

    public MutableMapWrapper(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.map.entrySet();
    }

    public Set<K> getKeys() {
        return this.map.keySet();
    }

    public final Map<K, V> getMap$stately_concurrent_collections() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    public Collection<V> getValues() {
        return this.map.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K k2, V v2) {
        return this.map.put(k2, v2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.map.putAll(from);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.map.remove(obj);
    }

    public final void setMap$stately_concurrent_collections(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
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
