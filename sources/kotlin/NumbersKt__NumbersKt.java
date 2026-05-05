package kotlin;

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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDRf|\u0004O\u000e8\u000b4H\u0017-:ߚ\u0010\u0007\u0015ia0re\u000f\u0094Xk5\u001dӆ\u00144RZLqq<\u001cۄ\u0004:\u0014]P\u007fg\u001dI\u0003\u000bq\u000fLǥ~\u00037WW\u0011]@\u000eZB\u001e@yށuUDnwN\u0005N1J8(\u0005Gɥ0`\u001b\u0005}[K:\u0011X@\u001f;\u0019ҐS\u001d, \nV /\u001e\u0005g|6xpk?G#1h\tS?q>\u0001e\rtUO\r%bN/N<M\u0015SRI\fjmM\tWqk\u0005\u0011'U+ywe;p\u007fB\u0014qT%o\u0001,t\u0005\u007fa4'YP\u0014O^\u0013@w)zSA\u001c\u0019\u0014.`.[\u001a\u000f\b<3;ɉYX[\u0010eZ\u007f)b^\u0017S\u0001yڇ?3q_iS\u0019|7$\u0005;\u001eiЯt9fb\u0016x\u0015IU Q_R\u0007\u05c8Nݹ\u000eb"}, d2 = {"1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n", "", "", "", "1nd;g\u0016GSu\u0003\nl", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bN", "@nc.g,%S\u001a\u000e", "0hc\u0010b<Gb", "@nc.g,+W\u001b\u0002\n", "B`Z2;0@V\u0019\r\nH5|e3t", "B`Z2?6PS'\u000edg,Y\r>", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u001a@7+-99\u00108")
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    private static final int countLeadingZeroBits(byte b2) {
        return Integer.numberOfLeadingZeros((b2 + 255) - (b2 | 255)) - 24;
    }

    private static final int countLeadingZeroBits(short s2) {
        return Integer.numberOfLeadingZeros((-1) - (((-1) - s2) | ((-1) - 65535))) - 16;
    }

    private static final int countOneBits(byte b2) {
        return Integer.bitCount(b2 & 255);
    }

    private static final int countOneBits(short s2) {
        return Integer.bitCount(s2 & 65535);
    }

    private static final int countTrailingZeroBits(byte b2) {
        return Integer.numberOfTrailingZeros((b2 + 256) - (b2 & 256));
    }

    private static final int countTrailingZeroBits(short s2) {
        return Integer.numberOfTrailingZeros((-1) - (((-1) - s2) & ((-1) - 65536)));
    }

    public static final byte rotateLeft(byte b2, int i2) {
        int i3 = i2 & 7;
        return (byte) ((((b2 + 255) - (b2 | 255)) >>> (8 - i3)) | (b2 << i3));
    }

    public static final short rotateLeft(short s2, int i2) {
        int i3 = (i2 + 15) - (i2 | 15);
        return (short) ((-1) - (((-1) - (((-1) - (((-1) - s2) | ((-1) - 65535))) >>> (16 - i3))) & ((-1) - (s2 << i3))));
    }

    public static final byte rotateRight(byte b2, int i2) {
        int i3 = (-1) - (((-1) - i2) | ((-1) - 7));
        int i4 = b2 << (8 - i3);
        int i5 = ((b2 + 255) - (b2 | 255)) >>> i3;
        return (byte) ((i5 + i4) - (i5 & i4));
    }

    public static final short rotateRight(short s2, int i2) {
        int i3 = (-1) - (((-1) - i2) | ((-1) - 15));
        int i4 = s2 << (16 - i3);
        int i5 = ((s2 + 65535) - (s2 | 65535)) >>> i3;
        return (short) ((i5 + i4) - (i5 & i4));
    }

    private static final byte takeHighestOneBit(byte b2) {
        return (byte) Integer.highestOneBit((-1) - (((-1) - b2) | ((-1) - 255)));
    }

    private static final short takeHighestOneBit(short s2) {
        return (short) Integer.highestOneBit(s2 & 65535);
    }

    private static final byte takeLowestOneBit(byte b2) {
        return (byte) Integer.lowestOneBit(b2);
    }

    private static final short takeLowestOneBit(short s2) {
        return (short) Integer.lowestOneBit(s2);
    }
}
