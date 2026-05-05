package androidx.collection;

import kotlin.Metadata;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,|\bDJd|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0Jk`2`WB\u000f\u001a\u0001L3i*\nCi\\J\u00020\u0011gN\u0016n5ϻ`#G\u001d\u000f.x\u00191aa\u0007f*\u000f`G CAW\b=gg\rJ\u0013)J\"f~5\u0005(4`\u0010%\u0002sO\u001a\u001dH@\u001fAj)[\u000e2\u00124CP\u0005,f\u007fNdO\u001daH:;\u0003\u0018I~+m<\u0015M;Ml7\u001b\u007fy\u001eYEg=#2k\u00035Q{?1F\nA\u0013v?'YL\fcDf\u0018\u0014C.\u007f\u0011k|>\\3Xx 59gcyS>,\u0006\u0005\u0014\rj\u000b>\n5SF-Hm *A\u0003\u000bSnS2bP\n\u0013ad\u001eU\u0004A6Q\u001b\u0015X\u0012?'ZO{3\u001463\u000f|9[\u0003\u0011\u0011\u001d)a\u0010Q_P`=vU*kKЧ\u001cp\u0011\u0001\u0001ʷ2Ͻ\u00045\u0004߾F\u0019+7i:C-y\u0004`D\u0016y[\u009ejרmRP̷ؗr%"}, d2 = {"\u0013l_Al\u0010Gbt\f\bZ@", "", "5dc\u0012`7Mg|\b\n:9\n\u0005C", "u(J\u0016", "\u0013l_Al\u0010Gb\u0007~\n", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "3l_Al\u0010Gb\u0007~\n", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "6`b5", "", "9", "7mc X;(T", "3kT:X5M\u001f", "3kT:X5M ", "3kT:X5M!", "3kT:X5Ma", ";tc.U3>7\"\u000eh^;f\n", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntSetKt {
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf(int i2) {
        return mutableIntSetOf(i2);
    }

    public static final IntSet intSetOf(int i2, int i3) {
        return mutableIntSetOf(i2, i3);
    }

    public static final IntSet intSetOf(int i2, int i3, int i4) {
        return mutableIntSetOf(i2, i3, i4);
    }

    public static final IntSet intSetOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    public static final MutableIntSet mutableIntSetOf(int i2) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i2);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i2, int i3) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i2, int i3, int i4) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        mutableIntSet.plusAssign(i4);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    public static final int hash(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
