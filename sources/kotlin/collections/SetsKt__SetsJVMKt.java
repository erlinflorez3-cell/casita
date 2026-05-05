package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.SetBuilder;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!,\n\bDJc|\u0004O'8\u000b4B\u0007\":\u0018\u007fјnjO0LeV.ZS@\u000fs{:(c$\bCC٥\"}0\u0018WNmgvJp\u000bK\u000f\u001c\u0016\u0001j2Im\u0019k܈'8RqO3\u0014ok8\u0001v<ӌ.2RB\b\u0006\u0019 :J vACy\u000eX/X.HU%S\u0015\u001c\"\u0006\u0005 /\u001d|iTȤVl\u000e>='\u001bipSWz>\u0003e$V\\7\u0013\u0007c.+\u00077c\u00175U\u0013\u0007\u0001cm\nӭu=\u000bqmݒ1˗rɎN\u000e\u000e\u0017-1_\u000fmrl\\3P\u0001\u000e-˃]c{k\u001c.\u0010\u0012\f\u0015L\n\u001e\b7Ht-Hh\u0018\u0010Ct![nWؿbB\u0006\u0004(ة\u001dՔ~đCK)pigK\u001b^7B\u0005; C\u0003tďiTT_-5b\u0002i7aBMH\u0015\n\b?\u000e\u0006vç\u0010*44U\u0004G{?3]$OxG.9q\u0012JTg=\u0011\u000fgskX̲N.\u001f\u001aE7!\f!P\u0081\tk^bpU\u001f\\4Z\u0017\u007f\u0018\u0013fh&LA'\u0016ʚ]t\u001az[n\"-?j=X~kTcgpS5\u0018oߧeR\u0005'W\u0002p\u0014plRU\u001cZ#4PBhl\u0016Ǯ\nP~$!FW\u0006,82ջ)\\[T13+I\r\reʳx\u0010E`\u0012:3y2\u0006!\t``vnwx\u00108+rB-\b]ڤ\u001d&c9־4\u0002+\n\u0005\u03780uf֟Kd"}, d2 = {"0tX9W", "", "\u0013", "0tX9W,K", "", "0tX9W\u001a>b|\b\n^9\u0006\u00056", "1`_.V0Mg", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1qT.g,,S([\u000bb3{\t<", "Adc\u001cY", "\"", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~G}/\r", "AnaAX+,S(h{", "\u001aiPCTuNb\u001d\u0006DM9|\t\u001de\u000f}", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#l-7m\u0004.\\\u0019", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bc(\u0003\u0002(\n\u0007\u0011:a\r$\u000bJ\u000el\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0005\u001adr5Ps;R}p6YN,JR\u0002\u0013", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0013$20\u0007/")
public class SetsKt__SetsJVMKt {
    public static final <E> Set<E> build(Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    private static final <E> Set<E> buildSetInternal(int i2, Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt.createSetBuilder(i2);
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    private static final <E> Set<E> buildSetInternal(Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    public static final <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    public static final <E> Set<E> createSetBuilder(int i2) {
        return new SetBuilder(i2);
    }

    public static final <T> Set<T> setOf(T t2) {
        Set<T> setSingleton = Collections.singleton(t2);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final <T> TreeSet<T> sortedSetOf(Comparator<? super T> comparator, T... elements) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt.toCollection(elements, new TreeSet(comparator));
    }

    public static final <T> TreeSet<T> sortedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt.toCollection(elements, new TreeSet());
    }
}
