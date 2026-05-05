package kotlin.jvm.optionals;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u0003İI\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?3LeVKZS0\u0010s{BBcҕyCIu\"Ԃ:+]Ȟ\u007fm~Lj\u000b\n\u000f4\u0015\u0019p2կcx\u0006\u0012=3jwO7SnM9'td\u0007f7:b\b\b\u0019\u001apH0x\u0001ŏY\f::Pv@Q\u001dO\u000b\u001aX\u0006l\"1\"jkf6\u000fl$?Ȼ\"ɅݦFN5dH1[\u0013^Tm\r\u0017c$ѨN7]\u001f5Y\t\u0006b]E\u0003\u0006qk\u0007\u001915/ayg8h\u007fZ\u0015YVSƦxΟ[\u0004Ƣ_ϯˏ/OqSh/6\u0001\u0013}#;J\u000e&-N͓;\u001a\u000f\b<4\u001dxcB`\u0002%B.|(;а)\u007fA5QTt\\y;_ZW\u0002\u000bټ,#)nO\\t\u001cf\u0014)` YAUF׀XNPYkz,vr\u0004:\u0004vG.1,\u0015<%=7\"Ei&Ƞ\u0006HRv\u000f'nxkobJP\"5\u0016e;)\u0012`եr\u0005\u0014P\u0003YT\u0019] Z\u0006\u000e\bY \u000by\u0003&=2\\a\u0001ozOm\nk/\u0015Jytqލe9\u00073cR\f\u0018qV|\u0013O<)\u0005\u0007h\tXۑZe0\"8\u007fr\u0013}ԕt|\u000bƷ6S"}, d2 = {"/rB2d<>\\\u0017~", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\"", "", "\u001aiPCTuNb\u001d\u0006DH7\f\r9n{/Q", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bc(\u0003\u0002(\u0016\b\u00183o\t$\u0003\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(\u0016\b\u00183o\t$\u0003\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u0019Lj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "5dc\u001ce\u0015NZ ", "uKY.i(\bc(\u0003\u0002(\u0016\b\u00183o\t$\u0003\u0016D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "Bn2<_3>Q(\u0003\u0005g", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bc(\u0003\u0002(\u0016\b\u00183o\t$\u0003\u0016g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\na{m]J\u0003-<]z.\u0011*X3cRpL\u0018\u001ccc", "Bn;6f;", "", "BnB2g", "", "9nc9\\5\u0006a(}\u0002b)D\u000e.kR"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OptionalsKt {
    public static final <T> Sequence<T> asSequence(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? SequencesKt.sequenceOf(optional.get()) : SequencesKt.emptySequence();
    }

    public static final <T> T getOrDefault(Optional<? extends T> optional, T t2) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : t2;
    }

    public static final <T> T getOrElse(Optional<? extends T> optional, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }

    public static final <T> T getOrNull(Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Optional<T> optional, C destination) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (optional.isPresent()) {
            T t2 = optional.get();
            Intrinsics.checkNotNullExpressionValue(t2, "get(...)");
            destination.add(t2);
        }
        return destination;
    }

    public static final <T> List<T> toList(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? CollectionsKt.listOf(optional.get()) : CollectionsKt.emptyList();
    }

    public static final <T> Set<T> toSet(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? SetsKt.setOf(optional.get()) : SetsKt.emptySet();
    }
}
