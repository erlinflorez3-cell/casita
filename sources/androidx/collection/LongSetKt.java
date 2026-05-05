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
/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,}\bDJd|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpAӄLeV5ZS0\u0014\u0004\u007fB(s$ HSd(\u0004:\t}U\u0018k|Rr\u000bq\u0018LǞ~\u00030W_\u0011]@\u0014JN}IKM\u001eBid\u0003A\u001d `+P\u000e\u0013\u000b2*v\u0015'~QV$\u0012^I!>`\u0019e\u0005H\u001b\u001eZ.\u000b6\\\u0016SfLzhR/Q\f\u001aF\\3w0+V=Jb4%v\u0010'CPE?-%\u0002\b7ZiM\u001b? <%hU0CM\u0002fNX.\u0017-7]\u001curT_5Un\u0017?+}lcd\u001c7\u0010z*\u0010l\b\u001c\u0011?H\\6Jj\u0016\u001aKt!\\Xl\u0010mZ\u007f)df\u001b3\u000bK+g$\u0017UoG1Ne\u00055\u0011,0\u0019nOdl\u001en$3T&TaYNK`N8X]m2y\u0003\u00148ʶHG..R߿0ϲ)=cݽ;#q\u0002VE\b\u0003\u0013b\u0001S\u0018U\u001fؚ$å\u001a72\u009eɚ^T"}, d2 = {"\u0013l_Al\u0013H\\\u001bZ\bk(\u0011", "", "5dc\u0012`7Mg\u007f\t\u0004`\b\n\u0016+y", "u(J\u0017", "\u0013l_Al\u0013H\\\u001blzm", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[k FC", "3l_Al\u0013H\\\u001blzm", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u000eKL", "6`b5", "", "9", "", ":n]4F,M=\u001a", "3kT:X5M\u001f", "3kT:X5M ", "3kT:X5M!", "3kT:X5Ma", ";tc.U3>:#\b|L,\fr0", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf(long j2) {
        return mutableLongSetOf(j2);
    }

    public static final LongSet longSetOf(long j2, long j3) {
        return mutableLongSetOf(j2, j3);
    }

    public static final LongSet longSetOf(long j2, long j3, long j4) {
        return mutableLongSetOf(j2, j3, j4);
    }

    public static final LongSet longSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final MutableLongSet mutableLongSetOf(long j2) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j2);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j2, long j3) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j2, long j3, long j4) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        mutableLongSet.plusAssign(j4);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    public static final int hash(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
