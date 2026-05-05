package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
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
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,s\bDRi|\u0004G\n8\u000b<K\u0007\"2\u0014\u007f\u0007tvA0Je`8`ݷB\u000f\u001az\\$\n$8HSg(Ԃ:\t}M\u0010g\u001dJ\u000b\u000fQ\u0010\u001e\u0016'jrNm\u0003k\u0014'2pog3{n\u0004>x\u0007D\u000782P8\"\u0005/\u0019ZL\u001ew\u0013Cy\fX5X\u0002HU%O\u001b\u0019@\u0006f /\u001d#lߑ:HzaRH1\u0006\u0002Dd&\u000e0%M;E\u0005+\u001bwy\u001eY@}:չ)S\u0011\fjuM\tWqk\f\u0011'U*ywe>p\u007fB\u0014[U\u0013]\u0001/t\u0005\u007fg$/9Y{K~\u0015Pw)z%O\u0012\u0019\u001e'v:U\u001a\u0015\u0007>7\u0003zk@~\u000e%ە\b\u0013kD$=\u007fa7a\u001b\u0015P(@ϳRE"}, d2 = {"2hV6g\u001bH1\u001cz\b", "", "", "@`S6k", "2hV6g\u001bH7\"\u000e", "2hV6g\u001bH7\"\u000edk\u0015\r\u00106", "uB\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "uB8u?1:d\u0015H\u0002Z5~R\u0013n\u000f(}@\u000el", "3pd._:", "", "=sW2e", "7f]<e,\u001cO'~", "7rBBe9HU\u0015\u000ez", ">kd@", "", "Bhc9X*:a\u0019", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\n.&66\r5")
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public static final char digitToChar(int i2) {
        if (new IntRange(0, 9).contains(i2)) {
            return (char) (i2 + 48);
        }
        throw new IllegalArgumentException("Int " + i2 + " is not a decimal digit");
    }

    public static final char digitToChar(int i2, int i3) {
        if (!new IntRange(2, 36).contains(i3)) {
            throw new IllegalArgumentException("Invalid radix: " + i3 + ". Valid radix values are in range 2..36");
        }
        if (i2 < 0 || i2 >= i3) {
            throw new IllegalArgumentException("Digit " + i2 + " does not represent a valid digit in radix " + i3);
        }
        return (char) (i2 < 10 ? i2 + 48 : ((char) (i2 + 65)) - '\n');
    }

    public static final int digitToInt(char c2) {
        int iDigitOf = CharsKt.digitOf(c2, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static final int digitToInt(char c2, int i2) {
        Integer numDigitToIntOrNull = CharsKt.digitToIntOrNull(c2, i2);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=" + i2);
    }

    public static final Integer digitToIntOrNull(char c2) {
        Integer numValueOf = Integer.valueOf(CharsKt.digitOf(c2, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final Integer digitToIntOrNull(char c2, int i2) {
        CharsKt.checkRadix(i2);
        Integer numValueOf = Integer.valueOf(CharsKt.digitOf(c2, i2));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c2, char c3, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return CharsKt.equals(c2, c3, z2);
    }

    public static final boolean isSurrogate(char c2) {
        return new CharRange((char) 55296, (char) 57343).contains(c2);
    }

    private static final String plus(char c2, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c2 + other;
    }

    public static final String titlecase(char c2) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c2);
    }
}
