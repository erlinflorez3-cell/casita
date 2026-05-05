package kotlin.collections;

import com.dynatrace.android.agent.Global;
import defpackage.Architecture;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,\f\bDJd|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007nj?2LeV7ZS0\u0010s{BGc$wDCU(\u0004*\tUOog\u0005Jb\u000bY\u000f\u000e\u0016~rD֎T\u0007ز*\u001bBD\u007f?yM\u007f?I`;73\u001fR$>ц\u0013\u0003:,N\u000f\u0005zcM\u0012\u0012>A\u0019Fb\u000f]\u0005`\u0014\u0016@0\u0001d\\\u0016Qf)zaR\f3\u0014yQ\u0015'ۢ4\u0007S\u0013VZ-\u0014\u0007c$1f?E(5d\u0019\u0006\u0019\\ύ\u0007IwC\u0015n-.;Ky]\\a\u0010%%:\u0016\u000fǁv0b\u000baf\u0012.;QiQv\u00188\t\u000b\u000b;GǬ\u0012\u0010-N>3 m\u0018\u00109z\u0019_PR\u0012^\t\u0001)f|Е+Ƨ2ٿQԍe_nS\u0019\u0015E\u001c\u0007\u0013̔1\u0003\u000f#aS\u001c`5\u001dZw_2qTCI\\\u0018\u0002K}\bvç\u0012*J0W\u0002?{W/E4_gI%1kHJTi\u0007\u0005'h\u0002l\u0003LN2\u0007\u0016}89lhH|a{adgr\u0011ܖ ^\r\u0004\u0018\u0019&c\b>'+6V_{y{c\\P&çjA_t{\u0014]@n5;W\n\u0019qc\u0007#\u0006>И\tblHc\u0012`c8$8N\u0011\u001a\b\rT]:\u001e\u0558C{\":<7\u001fc%J\t$hM\r\u000boZ/\u0011-Yyɼ\tɦ#ڏ֊\u0005Pj\u0002\b/\u0007[D|'0MCWځ'(u$n3\u000b#'\u0013y\u007fUutU\\p\u001c߯e{f\u0016*;a/k&=\u000eQ>\u0012/UL9gaO\"'A|(\u0012kl<w j7:'oߝST%6\u000fݥq1\u001d|\f\ncVz\u000ecd\rk>\u0010s1X\\P>و\u0013!>'\u0007n0|U/I'+\u0017  ?\u0017q]0q>{r\u000flt\u0014\u0007\\\u0018$\u0006z\u0002mCKG\u0010Y˽B,*r\u0013HNq\b\nH\u000fZ\u0015CYQs7XиQ\u00155\u0004v\r2\u0014\u0001Xa@9y\u000e6>_ptq\u0015D(Q))\u0013cx}|\u0012\\\u05c8N\u0019\u0010\u0011\f7t\u0019,?&\\}j\u0019A\u0016\u0003^7װ?l\u000bB\u0019*:3L\n\u0011Izr\u0016!\u000b\u000f\raʸ\u001b<HyK\\\u0014[\t^\\N+jUb1*G\u007f=Kdֵ;Ά\u0004և^R=xJ\rc\u001f\u0019\u001b1O\u000fh5+\u000bUg\u001aHZ\u0007ՊS_cK\b5\u0012GIoqo\u001a9@\t-D(\u001b\u007fS!a\u00070%\u000b\u0004g~h\u0005+~R\u0015#Y3\t\u0001&l\u001a \u001b(\u0016sƚf7RT\b=I!\u0011\u0019J/-\u0015\rtV*s\b\u05f91GOp$-\u0002^c=\u0004\u000eF*7\u0006\u0005!#X<}P܉!Ǧ\u0015ފїf\u0002\u0017-hݙ\u0003<e\rrP<(8U\u05ceA\u00043`_j\u0006!`)1l\u0014Ck|~\u000bqz\f|e\u000f\tϟAV@n=R-\tmN\\\"\u0001fJ\u0013c \u001f\u0013\u0010\u0016%&e66eY\u0014]s\u0001p2]\fA9E\u0004ZqB@ad}ψ}\u007f\n0d.\u001bBfODj/d|Sg\u001d%l܍h~\u0012/$\u0003\u0005On\u0013\u0019:l|.f?7_ \n$w*\u0015\b]\u000f62Aa\u0006\u001bσ6\u0015u.\u0007\u0017\tArv\u00060h\u0011\u0003\u0011w;sGÊA$-_4sj\n6MK>h\u0011<\"\u001e u\\ߣ$Hb ,AW:Q\u001b\u0017\u0007;B\u0016q\u0017\u0019{k\u007fkk݁\u0007Ю\u007f\u008dק}1yV\fٖq1J'oae\u0007=+˟sNG\u000e\bdX~me\\\u000fo-iIK\u001f\bch\u000e\u001a#*ڎ\u0016ui\u007fU3X*&]ne\u001cc\u0014(:65F3I|x:\nZlHwrky4\b\tD\u001dRWB-3\bu\u0002v}#t\u001dV$FU\u0007Ԡ7!\u0003\u0016_wF2YtS5\u0003fL$\u0004\u0013\u00014ݦ:\u0004MFi0\f4\"Vip\u0011waa 8X\u000e;\u001b>٢Xы~у\u0099\u001c'Y\u0014^թ[\u0007kYn\u001bB\u001f$%.R\u000e\u001b\u0006\\Mv\u0016\"\u007fP߷#2SMy@U\u0014~{g<1]+\u00063g\u0013SOW\u0002X\u0004;C\r}J\u001f5\u0014_5\u001f/O|p%\u0011z:tGݭB$0^\u0016\u0014KkX\u0012J~j0}A@?\u0017\u001e\u0082Gg\u0007\"/C[\u001cu\u00018h]dt\";F\u001epדY-3~\u0012\t\u0016H)\u0015\u0011$yCB%\u0004\rw]* #Ż[¦l۞(Ú`XAG\u0006\u0006=aMrɟs^9]E}\u001a\"O$L2Ddm\u0013w\u000eBs\tMDdQV[]\u0017ޯRjUz\u0005\u000e>\f~t4L.\u001dr\u001eE;&B<0\u0001\t\u000eO\u0019~Zi}v\rY\u0014S[?'BI7!t_nZnӐ`bD\u001dg,F\u001a\u0012\u001c#,\b\u0004X:@&\u001c\u0003ݺn}Zf!_:r@f\u007fx\rmNtNK\u000fnæjY\u0004!aJh\u0010prNG6l|.76\u000f\nG\u0019Gɠgã\u0013εޑz#uT\u05fe\"f*Vcեwx\u0005ªn\u0004"}, d2 = {"/fV?X.:b\u0019", "", "\u0019", Global.BLANK, "\"", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\"\u000e!'Rs\u0017>L", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "9dh", "/bRB`<EO(\t\b", "3kT:X5M", "", "4ha@g", "/fV?X.:b\u0019m\u0005", "\u001b", "", "2dbA\\5:b\u001d\t\u0004", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137&=QJ\u0005S0)jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0006tK\u0013N}LdJ\u001c%\u0012<4X>ae", "3`R566N\\(m\u0005", "", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137&=QJ\u0005S0)j,H>\u0003t(\u0018\u00076KS\u0018\u0014X]H", "4n[1", "7mXA\\(ED\u0015\u0006\u000b^\u001a|\u0010/c\u000f2\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "7mXA\\(ED\u0015\u0006\u000b^", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137\u001d*VE\u0005U1#\u0015fp\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011x\u001fE\"m|\u001d\u0012WEytI wC\u0005j", "4n[1G6", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137&=QJ\u0005S0)jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u001b\u001f=4qR_\u000eV}\u001f~OrIVb]\tKKN0\u007f(rd\u0019m6\u00044#u dPL9_", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137&=QJ\u0005S0)jOf5\u0018_uUr0I\u00168)aRpLix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014OX\\F%yB#o\tKH\u000fJ&oa", "@dSBV,", "!", "@dSBV,-]", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\nb$!Wz\u0012Exz\u001c^y137&=QJ\u0005S0)jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0005tK\u0013N}LdJ\u001c%\u0012<4X>ae", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u00071-2,$( \u0003+")
class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R> Map<K, R> aggregate(Grouping<T, ? extends K> grouping, Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            Architecture architecture = (Object) linkedHashMap.get(objKeyOf);
            linkedHashMap.put(objKeyOf, operation.invoke(objKeyOf, architecture, next, Boolean.valueOf(architecture == null && !linkedHashMap.containsKey(objKeyOf))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(Grouping<T, ? extends K> grouping, M destination, Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            Architecture architecture = (Object) destination.get(objKeyOf);
            destination.put(objKeyOf, operation.invoke(objKeyOf, architecture, next, Boolean.valueOf(architecture == null && !destination.containsKey(objKeyOf))));
        }
        return destination;
    }

    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(Grouping<T, ? extends K> grouping, M destination) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = grouping.keyOf(itSourceIterator.next());
            Object obj = destination.get(kKeyOf);
            if (obj == null && !destination.containsKey(kKeyOf)) {
                obj = 0;
            }
            destination.put(kKeyOf, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R> Map<K, R> fold(Grouping<T, ? extends K> grouping, R r2, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = grouping.keyOf(next);
            Architecture architecture = (Object) linkedHashMap.get(kKeyOf);
            if (architecture == null && !linkedHashMap.containsKey(kKeyOf)) {
                architecture = (Object) r2;
            }
            linkedHashMap.put(kKeyOf, operation.invoke(architecture, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R> Map<K, R> fold(Grouping<T, ? extends K> grouping, Function2<? super K, ? super T, ? extends R> initialValueSelector, Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            R rInvoke = (Object) linkedHashMap.get(objKeyOf);
            if (rInvoke == null && !linkedHashMap.containsKey(objKeyOf)) {
                rInvoke = initialValueSelector.invoke(objKeyOf, next);
            }
            linkedHashMap.put(objKeyOf, operation.invoke(objKeyOf, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(Grouping<T, ? extends K> grouping, M destination, R r2, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            K kKeyOf = grouping.keyOf(next);
            Architecture architecture = (Object) destination.get(kKeyOf);
            if (architecture == null && !destination.containsKey(kKeyOf)) {
                architecture = (Object) r2;
            }
            destination.put(kKeyOf, operation.invoke(architecture, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(Grouping<T, ? extends K> grouping, M destination, Function2<? super K, ? super T, ? extends R> initialValueSelector, Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(initialValueSelector, "initialValueSelector");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<T> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            ?? next = itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(next);
            R rInvoke = (Object) destination.get(objKeyOf);
            if (rInvoke == null && !destination.containsKey(objKeyOf)) {
                rInvoke = initialValueSelector.invoke(objKeyOf, next);
            }
            destination.put(objKeyOf, operation.invoke(objKeyOf, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K> Map<K, S> reduce(Grouping<T, ? extends K> grouping, Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (Object) itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(sInvoke);
            Architecture architecture = (Object) linkedHashMap.get(objKeyOf);
            if (!(architecture == null && !linkedHashMap.containsKey(objKeyOf))) {
                sInvoke = operation.invoke(objKeyOf, architecture, sInvoke);
            }
            linkedHashMap.put(objKeyOf, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(Grouping<T, ? extends K> grouping, M destination, Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(grouping, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            S sInvoke = (Object) itSourceIterator.next();
            Object objKeyOf = grouping.keyOf(sInvoke);
            Architecture architecture = (Object) destination.get(objKeyOf);
            if (!(architecture == null && !destination.containsKey(objKeyOf))) {
                sInvoke = operation.invoke(objKeyOf, architecture, sInvoke);
            }
            destination.put(objKeyOf, sInvoke);
        }
        return destination;
    }
}
