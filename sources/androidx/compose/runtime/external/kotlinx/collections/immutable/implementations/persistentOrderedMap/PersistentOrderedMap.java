package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import com.dynatrace.android.agent.Global;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PersistentOrderedMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":ߚ\u007f\u0007ljA0ZeP.hS2\u000fq{<$q$yCIy\"}(\u0011WNumvJ`\fK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HoG3[xE9fw>\u0005.R*8\u007f\b\t\u001a8j\u0018v\u0001EQÈ(ؓ^\"bT\u0013˟\u0013\u0019:\bD\u001f\u000f\u001e\rs^8Xl$9?%\u0013i\tNU``\t]\u000fVTm\f\u0007c.+\u00077c\u0017]R4G\u0004kE\u0011B\n?\u001bgU+;O\u0002\\NZ\u0016\u0013C/_#kx>n\u0015Sp\f]˃_k[V\u001e*\bz2\fj\f<\rόL.;#/\u001a\u001cQ\r~cB`\u0002\u0015ۍ\u0010|q6M$.RqMcx_\u0002S%^9\f\u0005C̔3\u0003~!\u0012S<b[/\u001d\u000b_Ri@kj~\u000eg`\u0006\u0004'çH>˙4G\u000eSD)<<=IkG3-{\u0004XD\u001eϸ\u0015bxS QvLPy\\7r\u001f\u001a\u0001\\f\u001bj\u0007S\t0\u001fp4T=âNˍ Ϣ{</LXf]u\u0002|]k\u001a1?hGY%\u0088\u001eYI^i4\u007fo>\n\u0019u\\fJ\f\u001ddvDc\f\u0011٢8$BH!\u000f&ӻtR\u001a6J?(ʉd0?Ct\u0015~\u0002dV˩\u0001\tm\u000618\r\u0001K0\u0013k4t?ɖ`^\u0001o\u001eww.-r0ZY_E\u001d,T2hjê3\t\u000fs6F\u0016z\u000e`55\u0004\u0005\u0014,&\u001cIQeˋ#\u0011\u000f)h\u0001[զ|vste\u0012]ϕC\u000eӛ?h<\u0018P\u0012~[xvZQd\u0017XԮnt3\b\u001b~(ӓv~U\u0007l\u000b\u0012Ŭyv\u0011\u0004TNn{K3Ǫ)\u0001}MMY;M?/&\u0006$;%cmi&Ѓ\nd\u001f&+d28\u0012!&7(ϸ4֑<Mq\u0001D/2zSVVm\u0010\nX\bb\u0011\nǦCяt\\@ԇ#1\u0004u\u0015<]\u0015daR%\u007f\u007fD.\u0016͈\u0004K\u000e\u001anE5\u0011\u0004R\u0016u\u001cR3֦L؝\u000e\u0011\u0004ς\u0007\u0014\"N.h(z\u0017C\u001ey(8Q;\u0019ŝj\u0014Z\t\u0003ћ\nդGX\u0002\b\u0016\u000f\u000eT0#%7ZuQU<XOֵX߃\tfMǷ9,\u0007\u0014\u001dCn\u000bCG\u001dmtke8\t݃U\u009b\r\u001f\u0003Q\u0005~3D\u0015lG5@^\u0011\rU]yH0Q:\u001c\u007fԭmƴ\u0010<0~#^&8ʬUC"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s&", "\u0019", "$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^!@/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013\u0002", "4ha@g\u0012>g", "", ":`bA>,R", "6`b5@(I", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u00175", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#F}PGEa\u001b`\u0013o\u001d2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]\u0012m\u001dN8\u0016\u0001`\u000b*xS>#\u0011?\u0013\u007fEo\b\f\u0014\u001d9tyP \u0014O\u0002%\u0005=&oF#c\u0002RHEj*m\u001b[,`DC2]u!#x_*\u0007\u0003Sxn]CRgT'~F3>vj)A}X$p2t\u000fl", "3mc?\\,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n27.]", "", "5dc\u0012a;KW\u0019\r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018\u000f\u0015\riP kK7\r\b;\u001f", "5dc\u0013\\9Lb~~\u000f\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0015T:A;\u0015\n9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^`A6vJgnyPP(^8gs[(2", "9dh@", "5dc\u0018X@L", "5dc\u0019T:M9\u0019\u00139k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "Ahi2", "", "5dc \\A>", "u(8", "D`[BX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$qV3\u001d\u0014U>+n\"A&\u000f,G\u0011?r\na", "5dc#T3NS'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018\u000f\u0015\riP kK7|\u00123P\u00029w\u0005\u0016\u001fc", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001f\u001b\u0013j&\u0012?o\u007f\f#c", "1kT.e", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1qT.g,\u001e\\(\f~^:", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[Z!]+\u001a\u000eUHmtNF&\f5\\K9r\b\u0013\u0016\fDnzKdYK\u0002\u001d\u0006P%eMY)}OLLb2d\u0015n\u0019k>D-\";$\u001bu^2\u0018\u000bS\u001a\u0002<\u0007fgT\u0019y  I7FFR}YJ\u0004'(Ze\u0005\u00112et*\\)\u000f\n", ">tc\u000e_3", Global.SEMICOLON, "", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0016@qpJV\u0019Vu$yK2v\u0010d_\u0007UESq*m\u001bI*[:G$\u0013Y\u0015&2;.\u0017\nW\u001f\u0002R\u0003vQT\u0018zE$=UWQ\u001b", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentOrderedMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    private final Object firstKey;
    private final PersistentHashMap<K, LinkedValue<V>> hashMap;
    private final Object lastKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentOrderedMap EMPTY = new PersistentOrderedMap(EndOfChain.INSTANCE, EndOfChain.INSTANCE, PersistentHashMap.Companion.emptyOf$runtime_release());

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap<K, LinkedValue<V>> persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentOrderedMapValues(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMap.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> put(K k2, V v2) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k2, k2, this.hashMap.put((Object) k2, new LinkedValue<>(v2)));
        }
        LinkedValue<V> linkedValue = this.hashMap.get(k2);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v2) {
                return this;
            }
            return new PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((Object) k2, linkedValue.withValue(v2)));
        }
        Object obj = this.lastKey;
        LinkedValue<V> linkedValue2 = this.hashMap.get((K) obj);
        Intrinsics.checkNotNull(linkedValue2);
        return new PersistentOrderedMap<>(this.firstKey, k2, this.hashMap.put((Object) obj, linkedValue2.withNext(k2)).put((Object) k2, new LinkedValue<>(v2, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> remove(K k2) {
        LinkedValue<V> linkedValue = this.hashMap.get(k2);
        if (linkedValue == null) {
            return this;
        }
        PersistentHashMap<K, LinkedValue<V>> persistentHashMapRemove = this.hashMap.remove((Object) k2);
        ?? r3 = persistentHashMapRemove;
        if (linkedValue.getHasPrevious()) {
            Object obj = persistentHashMapRemove.get(linkedValue.getPrevious());
            Intrinsics.checkNotNull(obj);
            r3 = (PersistentHashMap<K, LinkedValue<V>>) persistentHashMapRemove.put(linkedValue.getPrevious(), ((LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        ?? Put = r3;
        if (linkedValue.getHasNext()) {
            Object obj2 = ((Map) r3).get(linkedValue.getNext());
            Intrinsics.checkNotNull(obj2);
            Put = r3.put(linkedValue.getNext(), ((LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, Put);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> remove(K k2, V v2) {
        LinkedValue<V> linkedValue = this.hashMap.get(k2);
        if (linkedValue != null && Intrinsics.areEqual(linkedValue.getValue(), v2)) {
            return remove((Object) k2);
        }
        return this;
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map) {
        PersistentOrderedMap<K, V> persistentOrderedMap = this;
        Intrinsics.checkNotNull(persistentOrderedMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builderBuilder2 = persistentOrderedMap.builder2();
        builderBuilder2.putAll(map);
        return builderBuilder2.build2();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: builder */
    public PersistentMap.Builder<K, V> builder2() {
        return new PersistentOrderedMapBuilder(this);
    }

    /* JADX INFO: compiled from: PersistentOrderedMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4\u0012}\nlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:fIY2\n2\u000b_N.l~Lj\u000b\n\u00154\u0018\u0019l2Ic}}\u0014\u00153Pu\u0006\u074cޜs=?gEN\u0013!J.H{\u0015\u0001H-X\u0012\u0007zqN:\u0014\u0007ώrĐV\rUĨܮ\u0016\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s\u000f\f\u0014\u0004^\r{V\u0004p=", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WKFh\u000e\u001a\u001a\u001cDjyQ@\u001dFy\"u@\u0011dQ#JyTOIp9d\u0015n\u0007i9:1\u0014p\u0001\u0017s&", "", "3l_Al\u0016?", "\u0019", "$", "3l_Al\u0016?\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime_release() {
            PersistentOrderedMap<K, V> persistentOrderedMap = PersistentOrderedMap.EMPTY;
            Intrinsics.checkNotNull(persistentOrderedMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap;
        }
    }
}
