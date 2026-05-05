package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000b<e\u0007Ӭ4\u0012\u000e\u0007njO0LeN0ZS80s{BIc$wHCU(\u0004*\tUOog|gb\u000bI\u0010\u000e\u0016\u0007j4կ]xk\u001b\u00172HrG3[ڎE9f{>\u0005.T*8\u007f\u0005\t\u001a8T\u0018͌\u0001CaÈ:2F\u0081HQ5O\u000b\u0019 \u0006n,\u0011 lg\u00155Xnm:u#1j\u0003\t7o>~e\u0019VV7\r-ѭ.-P7k\u0014SV\u0013&`_W\u001eO\u0003M\u0014\u001fѧݳ/Sy]F^\u0006\u001b%-U\u0013\u0004z6^\u0015Q\u0017\u000bU0յgK^\u0017p}\t\u0017%<2*L;\u0011A;7~\b<Q%vaHh\u0002\u0015ۍF\u000fˋ:\u00173\u001f{>G;~Q\u0010YIRE\u001d\u001d\rT\"G\u0003Ĳ_T\u001c\u007f],b\u001ai1\u007f^mN\\-q?\u0004\u0003\u001f\u0007Hæ\u0004x]\u000eT\u0014\u0013D\u0016[6\f=1)\u0004\u0002~ֳ.Џ\u0005¾lSwx\u0011S0\u0016.7`\b<^Rl\u001dk\u0007ӹ\u001f@ҭQ\u001cb-F\u000e!Htwj5k$\u0017Uv\u0013\u0003M\f(kC/Tg\u0019\u0004\u0010m8\u00152eUq\u0018yR-ܝo@p&pfxRRnڅ,\"@s3,\u0006(\\N:/bQ\u007fIL:A\u001db\u0014X\u0003TՓQ~\u0019_\u0011g>-\u001bGl\u0018wS\r\u000b\u0017O\u0013o k\u0007QD|\u0017õsUپ9\u00194{jnB-;\u0007-%F[8sUP\u00051\u0006f\f/L֝\u07fcU9C\u0019\u001f\u0005/9\u0012/KR\u0019maO\"'1{(\u0014\u0012ß0Թ\fjxݚ1\u000fXYl)2\u0005n~3\nt\u007f0ӓV|Wc\u000b\n\nJw}9.\u0013ҕ:٫\t#6'\u0007|0\u000b\u0006EQ65\u001c\b\u0016?\u0015\u0018Ӡ\u0018zdN9Ϟ(܌i\bDe\u001c\u007fp_.PI:ae\u000f@2$#×RJzw>A77cΠJыhv^Еe\r5\u000ft\u0019|\u001f~is:A\u00044\t\u0005ʕ,ϵG\u0002,`I:\u001fc$\u007f{\u0005cb\u001bL\u001f\nAz_\u0007Hp\u0014։X͓f\rH\by1D[ގf7"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E(\u0011&\u0013Dv\u000e$r0']\r#\u0016m\u0017*]JJO<)\u001c>", "\u0019", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E(\u0011&\u0013Dv\u000e$r0']\r#\u0016m\u0017*]JJA", ";`_", "", "2dU.h3M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "9dh", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJT", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", "5dc\u001aT7", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Ahi2", "", "5dc \\A>", "u(8", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "1kT.e", "", "1n]AT0Ga~~\u000f", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "3pd._:", "=sW2e", "", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u001ce\u0010F^ \u0003xb;[\t0a\u0010/\u000b", "6`b566=S", "7r4:c;R", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", "", "@d\\<i,", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final Function1<K, V> f67default;
    private final Map<K, V> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(Map<K, V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.map = map;
        this.f67default = function1;
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getMap().get(obj);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    public Set<K> getKeys() {
        return getMap().keySet();
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    public Map<K, V> getMap() {
        return this.map;
    }

    @Override // kotlin.collections.MapWithDefault
    public V getOrImplicitDefault(K k2) {
        Map<K, V> map = getMap();
        V v2 = map.get(k2);
        return (v2 != null || map.containsKey(k2)) ? v2 : this.f67default.invoke(k2);
    }

    public int getSize() {
        return getMap().size();
    }

    public Collection<V> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K k2, V v2) {
        return getMap().put(k2, v2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return getMap().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
