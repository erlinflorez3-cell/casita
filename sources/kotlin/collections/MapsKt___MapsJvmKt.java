package kotlin.collections;

import com.dynatrace.android.agent.Global;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!,\u000e\bDJd|\u0004O\u00138\u000b<d\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS@\u000fs{:%s\u000b\u007fّSc*\u007f2\t\u0016Nwi~J!\fY\u000e4\u0015\u0019l2կcx}\u0014\u00151Pp_?SoK;\tzF\u000702h:(\b)(:L\u0016u\u000bC\u0012\f\"2Pp\u0001S;Q56 \u000bV8\u0011,ls^8Xl$:?%\u0013i\tOU^@~]\r\rVU\u0013=ѵ$ӡ?ʺM|3Z\u001b\u0015b]O\u0003\u0006qM\u0007x'm,_r\u00065x\u0002\u001aƃ9O-_x%j\u0006yn\u001c+1NsK\u0017\u000e8y\u000b{S=2\u00126WV6EFv\u0018\u0014ޗ\u0005~cB`\u0002%B\u0010|q6]&.2YB\u0004zaqAϊ^C\f\u0007\u001d\u001ei\u0001~#kTTaC\u001a3\u0002\u0018ŀWX$VY\"gMo\u0014p)\u0002:\u0006@GF0\u0012\u0010\\\u0016E9aݽ1!\f\u0004NCuw%lnSwTpF2p&7p\u000b:]lr\u0015oVSh,WM,V\u0017}N\u0014N`(X/*(f_vyv]_\u001a%ufG[~kTXg]C7acVc\u0001|Z̻BѮ\u0004֚~)a\u0018rj8$BH1\u0010\b}TNR\u0014H> \u001bT.7ǉj\u0015h\u0005$AO}1mjl\u0016}d3j\u0003y&\u0005\tGQ\u000bt \u0018\u0007QD)p23ۋaA)(e\"/4\r%\u0017~:\u0001ufzP5\u0001&\u0006[ݨ0\"*;a/\u0004\u0013\u001f\u000192H.sKQo\u0018Rȿ'\u007f\u0005|\u0015ª\u0019\\fŶn}"}, d2 = {";`g\u000fl", "", "\u0019", "$", Global.BLANK, "", "", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", ";h]\u000fl", ";h]$\\;A", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\r .0\u0007/")
class MapsKt___MapsJvmKt extends MapsKt__MapsKt {
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxBy(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            entry = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry = entry2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            entry = null;
        }
        return entry;
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    private static final /* synthetic */ <K, V> Map.Entry<K, V> maxWith(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.maxWithOrNull(map.entrySet(), comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            entry = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry = entry2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            entry = null;
        }
        return entry;
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Map.Entry minWith(Map map, Comparator comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.minWithOrNull(map.entrySet(), comparator);
    }
}
