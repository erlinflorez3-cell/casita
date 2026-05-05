package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u0003\u001aI\u0006F\u000b6B\r24\u0012\u000e\u0007njGGLe^.ZS8 s{J$c$\u007fUCU0}*\t]aog\u0005Jb\u000bQ#\u000e\u0016\u000fj4Ic\u000ee܈'>PģW3{nm=ntN\u0005N3:D\bڎ\u0019\u001aXJ@z\tCc\f@3X|Hĥ%M3\u001eB\nL \u0019\u001e\u000blfBVǍu:])3mPN?_^\u0004e\u0019TÖ?\r%iN/N7M\u0015S\\\u001b\u0013`¹W\u0003m{m\tv'?+w~oBfÜ,\u0015Y[=a\u0001&t\u0005\u007fm$39Ւ{K~\u001cX{\t{%<2\u001dΣ+X"}, d2 = {"7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001d\u000b!\u001eGk\u0017 \u0006%BU\r*DC", "/qa.l", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001d\u0015&\u0017+~\u000eIr4?fS", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001e\u0004\u0013$+~\u000eIr4?fS", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001f\u000b'\u0014NoqKv21h\b-\r", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E!\b!\u0013VS\u001d<\u0004!Dc\u000bu", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n&zVo\u001b8\u0006/B/", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u000b \u0019+~\u000eIr4?fS", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E.\u0004!$VS\u001d<\u0004!Dc\u000bu", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ArrayIteratorsKt {
    public static final BooleanIterator iterator(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayBooleanIterator(array);
    }

    public static final ByteIterator iterator(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayByteIterator(array);
    }

    public static final CharIterator iterator(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayCharIterator(array);
    }

    public static final DoubleIterator iterator(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayDoubleIterator(array);
    }

    public static final FloatIterator iterator(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayFloatIterator(array);
    }

    public static final IntIterator iterator(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIntIterator(array);
    }

    public static final LongIterator iterator(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayLongIterator(array);
    }

    public static final ShortIterator iterator(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayShortIterator(array);
    }
}
