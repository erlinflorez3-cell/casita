package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,i\bӵLc\u0003#I\u00066\r6B\u0015\"4ߚ\u007f\u0007twAӄLe^.ZS8\u0015sڔ<$q$yCQU\"}(\tgru˧\u0007J\t\nc\u0011\fǝ\u0007jTOezm\u0012U2ppo7[qU9't|Ӕ&ݨ&8\b\b\u001918L(v)Bk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l!GȮb\u007fmDL\u0005]h.C\u0005oĩ\\'\b6\rO\u001dF\u001b';w\u0012\"9EO5C+\u001aΐ\rjyM\nWqk\u0004\t3-ǢWs\u007f<h\u0002$\u0015qO;e\u001b,l\u0007a`R'YP{\u007f^\u0015@w)z->\n\u05fa\u0014'p4=\u001cv\bT3#s\u0004V^\u000bvT\u0010|q6]%\u00105;9afacK\u0019|B*\u000fS̜)Ҡmďs\b\u001cg-\u001b\u0003vq3W̵KHv\u0010i?}\u00047b0+4HU\fG\u0010!2\u001d¦G[\u007f#OxjPTk|ݓph\u001ai1V\u0007̖t.g8\u0018$Zrc%mVӹf,9S,V\u0017}N\u0013N](T/1(b_loҔ]]P%]s a~o\u0014ãI^y50q߇aW~\u0017Eה\u00133WڑFc"}, d2 = {"4h[9", "", "\"", "", "D`[BX", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1\u0007", "Agd3Y3>", "@`]1b4", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9mU", "AnaA", "", "1n\\=T9Ba#\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "AnaAJ0MV", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    private static final <T> void fill(List<T> list, T t2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.fill(list, t2);
    }

    private static final <T> void shuffle(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.shuffle(list);
    }

    private static final <T> void shuffle(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        Collections.shuffle(list, random);
    }

    public static final <T extends Comparable<? super T>> void sort(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t\u0005\u0004'kOP<\u0003\u0018\u0018;[lM\u001b(\u0019w\u001e\u001b6O|}by%j6", replaceWith = @ReplaceWith(expression = "this.sortWith(comparator)", imports = {}))
    @InterfaceC1492Gx
    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t\u0005\u0004'kOP<\u0003\u0018w;[lM\u001b(\u0019w\u001e\u001ayU{zO\u0007-ywZ-\u000b\revLZ#4>_", replaceWith = @ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @InterfaceC1492Gx
    private static final <T> void sort(List<T> list, Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    public static final <T> void sortWith(List<T> list, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
