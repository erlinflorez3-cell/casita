package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,o\bӵLc\u0003&I\u00066\f6B\rE4\u0012}\bnjO0LeV.ZS@\u000fs{:'c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u0014%\u0001̓4Ic\u0006e\u0012\u00152JoU3UoC9htL\u0005(2(8\u0002\u0005\u0017\u001a2H\u001e\u0003\u0003CQ\u000e*bNpR^\u001dO\u0015\u001aX\bN\"\u0011\u001e#j|7hncŽ=%#kHM5b`\r[\u0011^`7\u000f\u0007ad-P9E\u0015kV1\f\u0019ZWRMwU\u0011x)7+\u0010ug8h\u007fZ\u0018YP-_x̦j\u0007qb\u0012&9R\u0014O^\u0015@w)z=]\u0012\u0016\u001eDX<=&v\n\u001e3;tcB`\u0002%E.\u007fq8'%.=YBӸjQgF_\u05cd=\u009e\u0004ټ6j\u000ft9gd\u0010p\u0015aV\bSAQ\u0007@vO*[CЧ\u0012r\u0003\u00040\u0003>J0P\n\u0019F45EkE3#{\u0002\u000fFwx\u0015`/V\u0018WXB2nDAX\u0012ɔ^Dj\u00102®Z҉+Ҋe:b\u0013\u0016\u0014#\"lw\u0003#5\u0012^O/l\u0019R}\f+Ät9ypq\re<%2Mwq\u001cy^\u0007\u0016O<)\u0007hhRSR]\u000b-B4NК\u001ey\u001cFT\u000b!5ou*;D1G[[G\u001b,PN\u0015\t\u000eY\u0019\u0014\rbK$1hjs!1^k\t{wzY,Cb2/QQ{\u001cTVBj:ê1\t\u001fu\u0006FuOw\\z&\u000ea\f\"&\u001a\u007fS??#\u000fE,`\u0013E%Z\u0005}]]\u00147zC{\u001f=x..\u000b\u0019\u0004Lbp\u07ba]V7$|]\u0001&8p\u000e\u000eyN\u000bKiҺ\u001b[\u0005K!\u0018\nd\\N\u0015\u0019/.+\u007f\u007f.\r7=Cm\u001f&y$/[d\fz\u001eE\u001an\u001f(\u0005eJ.s\u0018\u007fb\u0018``L~N˕\u0003>0<\u0005ZPZ\u0003\u0004\u0018D\u00194S5XCtp\u001d;{\u001eO\nl߿:\u000f\u0019\\k<#oD6\\xJuI|\"asM\u001fck{}}Q[\u001bV\u001f\f\u001b{wp\"\u001eM \u001dZ\u0011\u001a^\u001d\u0014$FCKbK>\u0019&D,\u0003\u000b9TҰm\u0006\u001e\u0015\u0018\bm*/2\tv[X\u0014֊\u0007^vJ\u000b_ScI6\u0011\u0001\u001f3dzE3\u0015m\rW]\u007fb\u0005a:!\u001b1Q/p3I\\ZI\u001d8XG\u000es|\n̹\bֆ\u0003ڛԆqk},P/\u000b>Z\u0018I[y\u001dox@^9xtPtv@\n\u0001OhĞ\u0005\u0013-\u001c`\"\u001b\u001b\u001b_r6d=N^w}FH\u00027F/܍\u001a~\u0004H!,\u00148UKYn\u001a&\fW\u001a=\u000e\n0 m\u0007#\"#ަ&\u0016\u0018\u00033F&s&bH\u000b#R0\u0004tM#s*0\u000eˆ]\u0004S\u0004\u0019]gn -P);lLD[j\t\n*o\u0012o\u001c̅\t~id \u00079`\u001f\u0019'\u00140#Zj:WVNk1\f\u001aݻ4!^\u000er+ O*j\u001f\u0005o]\u0013*=nRoA4X\u001d\u000e\u001f@w\u0014,d([>\u0005NV#\u0017\u0003\u0005Ng\u0010njnf\u0005\u000e9\u0014C\u0002vq1\u0015:И\u0001 \u00051=\u0018-^5Up\u000b\nDY&g3bA+7x\u000e\u001e)'\u001d\u0011Nz|\u0010.Hռ\u0003\u007f..[[tI(śq$\u001ccYͼ\u001eԺ<B\u0010ϴֹ\u000e\u00167]>Ԧn\u000b\u0019̊?x"}, d2 = {"\u0017MC,@\b1M\u0004hl>\u0019vr\u0010_n\u001ae", "", "0tX9W", "", "\u0019", "$", "0tX9W,K", "", "0tX9W\u0014:^|\b\n^9\u0006\u00056", "1`_.V0Mg", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1qT.g,&O$[\u000bb3{\t<", ";`_\u0010T7:Q\u001d\u000e\u000f", "3w_2V;>R\u0007\u0003\u0010^", ";`_\u001cY", ">`X?", "\u001aj^A_0G\u001d\u0004z~k\u0002", "AnaAX+&O$h{", "\u001aiPCTuNb\u001d\u0006DL6\n\u0018/dg$\u0007\u0016", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", ">`X?f", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u0011:a\r$\u000bJ\u000el\r.u\u0018K})>#h\u001c;zkq4H7|0g%we@PQ6[\u0006'F4J72", "", "uZ;8b;EW\"HeZ0\n^rL\u0005$\r<J'&KvW*\u00012DY|\b3xk", "5dc\u001ce\u0017Nb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>he\u001cBC", "9dh", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tQx\fL\u000425b\r\b3xk\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`cxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "Bn??b7>`(\u0003zl", "\u001aiPCTuNb\u001d\u0006DI9\u0007\u0014/r\u000f,{NV", "", "BnB6a.ES(\t\u0004F(\b", "BnB6a.ES(\t\u0004F(\br<S\u007f/|", "BnB<e;>R\u0001z\u0006", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\r .0\u0007/")
public class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    private static final int INT_MAX_POWER_OF_TWO = 1073741824;

    public static final <K, V> Map<K, V> build(Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((MapBuilder) builder).build();
    }

    private static final <K, V> Map<K, V> buildMapInternal(int i2, Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(i2);
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final <K, V> Map<K, V> buildMapInternal(Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    public static final <K, V> Map<K, V> createMapBuilder() {
        return new MapBuilder();
    }

    public static final <K, V> Map<K, V> createMapBuilder(int i2) {
        return new MapBuilder(i2);
    }

    public static final <K, V> V getOrPut(ConcurrentMap<K, V> concurrentMap, K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(concurrentMap, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = concurrentMap.get(k2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k2, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    public static final int mapCapacity(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K, V> SortedMap<K, V> sortedMapOf(Comparator<? super K> comparator, Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        MapsKt.putAll(treeMap, pairs);
        return treeMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        MapsKt.putAll(treeMap, pairs);
        return treeMap;
    }

    private static final Properties toProperties(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    public static final <K, V> Map<K, V> toSingletonMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return MapsKt.toSingletonMap(map);
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    public static final <K, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
