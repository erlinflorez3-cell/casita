package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,\n\bDJc|\u0004O\f8é6B\u0015\"4\u0012\u0006(njG0Le^.ZS0\u0010s{J$c$\bCC٥\"}0\u0018WNmgvJp\u000bK\u000f\u001c\u0016\u0001j2L]xk܈\u00172HrW\u007f[ڎU?pvF\u0005f2P7\u001a\u0007\u0007ɝ8H@z\tDc\f@2p\u000e@Q\u001bP\u001d1\"\u000eN&\u0011 lg\u00156vqm<?#1opRϮc0\u0003TSЇZބ\fǸѰ\u001e3H=;\u00145S\u0011\u0007pZWGMмU\u000bx)7+\u0010s\u00065x\u0002\u001aƃ9O=zx%j\biw\u001c/;UsM`\u000enw)\u0001\u001d>\u0014\u000e4-v2ǉ\u001ef\u000e\u0015yχx֘?А؟^J\b\u0001g5'%\u000e2I83v_iS\u001f^9\f\u0005S'Q\u007f\u000f#a٪\u001ci-8b\u0002iAaBMH\u0015\u0013\bHV\n\u0001d\u0012*J9&\fO}\u0017ф%.}ً?;Ty\f`Twx\u0015`/\\\u0018]1F2p&7p\u0012jfdf\u000bߘ^]\t<\u001fZ4\\\u0017\u0002\u000e\u00120\\>EO30N\u0016qȬnMk\u0019=LtGq~{\u0010g9%<cbL\u0016qT\u0007\u0014\u0006EA\u0017xhHͭ\u001ac#̭(J{x \u0010\fTP\u001c\u0013xH -\u001d2A\u001bl\u0015\u000f\f|Ta~\u000fݠhq@\u000fb@<\u000by(z\b\u0011P#y\u001eu\u0019Ir\u0006˃&-OdM,4i:nD~3\u0007E|.L\bNMƂz\u001f<ɥ\u00028?(Mi5M\u0015\u001f~o;02eNxό_VB7\t\n\u0012\u0017Kl4f\u0018j75\u000fxjO\u001b Ȕz^\u00018 w\u000e\u0010yL\u000bIsTQdlH\u0013\u0005_ߢ\\ACĆ%6N\u000f\u0006:\u0003E/S'c\u001f&\u0013O\u0017gӠwx^\np\u001c>|u\b2b&o)Z\f@[8\u0010b˽B\"2\u0002\u001bgV\u0002\u0010\u000eR\u000bD\ryQoc\u0011\\>ԇ\u00198&f5D=vdtR\u0015\u0006|z7&/ϵG}\"x[X\u001fdkm}o[\\QS=\t+\u00027ޫ %e \u0005o\u0013\u001d>\u0013\f\"FGAa\u0015>\u001f#z5j\u0016+EjhL\u0019A\u0005ʮc\u000f%GZ\u0010Iq&Z\t^fHKis_A,\u0007ϓ\u001d<F~E3\u0015m\r]]bxܬk<\u00177\u0003U\u000fh5+\u000b]g\u001aHZ\u0007ՊSfkQ\u00128\u0014Gov\u0002n:7^ԅ#°\u0018 AT\u0017ٽ'^]πY\u0002"}, d2 = {"0tX9W\u001a>b", "", "\u0013", "1`_.V0Mg", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3l_Al\u001a>b", "\"", "6`b5F,M=\u001a", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#`\u001cEp\u0004.\\\u0019", ":h]8X+,S(h{", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCn\u0017&\u001d", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(#Y\ru", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#d$@s\u0016-0?In\"\u001e$>", ";tc.U3>A\u0019\u000ed_", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#k FC", "Adc\u001cY", "Adc\u001cY\u0015Hb\u0002\u000f\u0002e", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~G}/\r", "=oc6`0SS\u0006~v]\u0016\u0006\u0010CS\u007f7", "=q4:c;R", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0013$20\u0007/")
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    private static final <E> Set<E> buildSet(int i2, Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt.createSetBuilder(i2);
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    private static final <E> Set<E> buildSet(Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    public static final <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt.toCollection(elements, new HashSet(MapsKt.mapCapacity(elements.length)));
    }

    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt.mapCapacity(elements.length)));
    }

    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    public static final <T> Set<T> mutableSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt.mapCapacity(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : SetsKt.setOf(set.iterator().next()) : SetsKt.emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        return set == 0 ? SetsKt.emptySet() : set;
    }

    private static final <T> Set<T> setOf() {
        return SetsKt.emptySet();
    }

    public static final <T> Set<T> setOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt.toSet(elements) : SetsKt.emptySet();
    }

    public static final <T> Set<T> setOfNotNull(T t2) {
        return t2 != null ? SetsKt.setOf(t2) : SetsKt.emptySet();
    }

    public static final <T> Set<T> setOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
