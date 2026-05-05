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
/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bDJd|\u0004O\r8\u000b4C\u0007\":&\u007fјnjO0L͜`2`SB\u000f\u001azL(i%\nCiT2\n0\ngN\u0016f\u001fNh\r[\u000f4\u0019\u0011~:Jmx\f\u0011?6PqW3{rm=nxN\u0005N5:T\b\u0006\u0019\u001aXG@z\tEc\f@3ptHV%M3\u001dB\nL%\u0019\u001e\u000bjfFVmu:]\"3qPT?_^\u0004m\rtW?\u0014\u0005i6+n@{՝+k\u000f\u0015Zs?1H\"A\u0013j?'YL\fkD`\u0018\u0014C4\u007f\u0011kt>\\3T\u0011\u00105/gcyS&D\u0006\u0003\u0014\rj\r>\n5JF-Hi8\u0012Ax\u000bSnS2bP\u0005\u0013ad\u001a=\u0013A3Q\u001b\u0015Z\u0012C'TO{3\u0014>#/qgƃZ.l#Ñlw\u007f0(̸?˓R\naƝѐ\bz"}, d2 = {"\u0013l_Al\u0013H\\\u001be~l;", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0012J\u0006z", "3l_Al\u0013H\\\u001be~l;", ":n]4?0Lb\u0003\u007f", "3kT:X5M\u001f", "", "3kT:X5M ", "3kT:X5M!", "3kT:X5Ma", "", ";tc.U3>:#\b|E0\u000b\u0018\u0019f", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[d$E|k", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongListKt {
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    public static final LongList longListOf() {
        return EmptyLongList;
    }

    public static final LongList longListOf(long j2) {
        return mutableLongListOf(j2);
    }

    public static final LongList longListOf(long j2, long j3) {
        return mutableLongListOf(j2, j3);
    }

    public static final LongList longListOf(long j2, long j3, long j4) {
        return mutableLongListOf(j2, j3, j4);
    }

    public static final LongList longListOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.plusAssign(elements);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    public static final MutableLongList mutableLongListOf(long j2) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j2);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j2, long j3) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j2, long j3, long j4) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        mutableLongList.add(j4);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.plusAssign(elements);
        return mutableLongList;
    }
}
