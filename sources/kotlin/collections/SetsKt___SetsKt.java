package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,\n\bDJe|\u0004O\u00158é6B\r<4\u0012\u000e\u0007nj?2\\\u0010V\u008cjY:\u0011{{z$\n#\u0012EA٥(}J\u000f_Pwg5J\t\ns\u0013\u0014\u0017\u0011jrI\u001cޓ]ܫ\u00132PqWe[ڎU?pvF\u0005f2P7\u001a\u0007\u0007ɝ8H8|\u000bE[\fX0noj^\u001bP\u001d\"\"\nD\u001f\u0011\u001e#g|:\u000fǔ]Ơ3#\u0011nZy5ڿH\u0003]\u000fVTm\r%`>-FʺC\u0015MY\u0013\tb[\u0006\u0003mpm\u000fv*?1Yug6\u001f\u007fB\u001bq̄\ru\u001e4ؘ\u001dWp\u000e7+\u0016cyO.*}\u07be\n\rd\n\u001e\b7Ht-He8\u0018Aw\u000bYPR\u0012^\t\u007f)h|Д%\u0018]9A3lacK\u0019\u00157*\u0004- )Ч|!\u0004Z\u001eb%\u001b\u001bw\u007f0\u0002DKIf\n =4ՖvĊ\u0006*\u00122_*=\u0005)4''G[\u007f#Oj\"JJϙ\u0005\u0005\tnckbH\u0007\"\u001d\u0015g.\u0017\rrD+\u00052³Tг0\u0011[\u001el9\f\u0011+&lyL!k\u0010|N\tkpܔk\nM5v9in2\u000e\u00068\u000f?CT{\u0018qV|\u0013O<)\u0005\u0007j\tʹ\fȺ`(07`\u0016\u001e\u0001\u0014J^\u000e#2\u0006qJ3L3\u001f¢#H+$RC\r\t&Z\u0017\u000f/^A'\u001bo4v\u0019\u0001\u0017\\\u001fu.յID(n+EGa7)&\u001c\"\u00173\u001d%\rѨ\u0002\u007fom\\I\\l\\u\u0004zP (<i5M\u0015\u001f~o204\fɪr}{[\u001c?\u0001\r{\u001f;/.\u0016\u0007\u000br2ߌxJwZ'$\u0007^9#6c0}oG\u0013G*TQϽDϗv\u0003g>ҧ<\b"}, d2 = {";h]Bf", "", "\"", "3kT:X5M", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruzT\u001b*^?\u0005{C\"\u001c2O9\u00169", "3kT:X5Ma", "", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005[f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1|3IT75D-\u0019o+'\u0007r\u0002", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ";h]Bf\fES!~\u0004m", ">kd@", ">kd@83>[\u0019\b\n", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0013$20\u0007/")
public class SetsKt___SetsKt extends SetsKt__SetsKt {
    public static final <T> Set<T> minus(Set<? extends T> set, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionConvertToListIfNotCollection = CollectionsKt.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return CollectionsKt.toSet(set);
        }
        if (!(collectionConvertToListIfNotCollection instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionConvertToListIfNotCollection);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t2 : set) {
            if (!collectionConvertToListIfNotCollection.contains(t2)) {
                linkedHashSet2.add(t2);
            }
        }
        return linkedHashSet2;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T t2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size()));
        boolean z2 = false;
        for (T t3 : set) {
            boolean z3 = true;
            if (!z2 && Intrinsics.areEqual(t3, t2)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(t3);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    private static final <T> Set<T> minusElement(Set<? extends T> set, T t2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return SetsKt.minus(set, t2);
    }

    public static final <T> Set<T> plus(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer numCollectionSizeOrNull = CollectionsKt.collectionSizeOrNull(elements);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(size));
        linkedHashSet.addAll(set);
        CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T t2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t2);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.mapCapacity(set.size() + elements.length));
        linkedHashSet.addAll(set);
        CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    private static final <T> Set<T> plusElement(Set<? extends T> set, T t2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return SetsKt.plus(set, t2);
    }
}
