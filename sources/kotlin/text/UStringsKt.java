package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,u\bDZc|İI\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?0Le^.ZS0\u000fs{J$c$wTSn(Ԃ:\t}M\u0010g\u001dJ\u000b\u000fQ\u0010\u001e\u0016'lrNǤ|_\u0018\u0012@F\bXAݹ\b=g_\u001d63%b&Fz\u001d\u0001H,\u000f\u0015ͯ~EQ\u0012 7X\nHĥ%M3\u0019:\u0006l(1\"jhf6vn$?ǥ'\u0005oK\\1wI\u000bձ%F\u0003&5v\u0010)[DE6-%\u0002\u0005MWÜC\u0005E}K\u0012\u0001659as\u00066\u0001\u007fB\u0014qTոar4k\u001dhn\u001a?+}csP<'(~\n\u000eT\u0004<\bmMͶ1\u001at\u0018&?\u0003\u0004kBf\u0001\rB(z\u00105]*\u0018G9J3hg`i\u0019v7*\u0004=\"1\u0002\u0007!\nVTe-*b\ni1\u007fEeH|\t Bъ\bpp\u0015B\u001b>Y\u0018/*\u0016V\u0017S6\f=1\"\u0004\u0002vF.{ݶdha}jTN7\u0007\u0018M)7\u0011\u0003D\u0013\u00042Ull:&e\u001ej\u0006,\r; \u000bvl%3\u0011fO\u0017k1Ru\u00193E~7\bv\u0014\u000e\u00068%8̳Uc\u001exj\u000e\"UTb3`\u000fB\u0002\u000b\u000b`6#JH\u0019\u0012>\u0001ΌR\f!JW}*MD3/[CP+\u001ep@C\u000ewnv)\u0017VI#1qLt7\u007f\u0001`~p\u007fxw.Ce:<OkM\u0019T`Jhb{i\fҋw\u007fU\u0003d^Z\u0007.u\u0004\u0007H\u0016H8\u00023K\u0014'~W4H2։Prsme\u001e5\u0018\u0015{%:\u00179\u0010\b\u0019ore\u0003^]q/$\r]!.0d.x\u0012J\tH{T9]\u0005NΨ\u0007w"}, d2 = {"BnBAe0GU", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "@`S6k", "", "BnBAe0GU`e\u000eg\u0015\u0006u}", "uA8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "BnBAe0GU`oLq\tK|}", "uH8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u001aj^A_0G\u001d\te\u0005g.R", "BnBAe0GU`chP6^Wy", "uI8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "\u001aj^A_0G\u001d\tl}h9\f^", "BnBAe0GU`\t\u0002O\te\u001c}", "uR8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "BnD\u000fl;>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?\u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004]", "BnD\u000fl;>=&g\u000be3", "BnD\u0016a;", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?$", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004d", "BnD\u0016a;(`\u0002\u000f\u0002e", "BnD\u0019b5@", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?%", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004e", "BnD\u0019b5@=&g\u000be3", "BnD [6Kb", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004n", "BnD [6Kb\u0003\fcn3\u0004", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m10292toStringJSWoG40(long j2, int i2) {
        return UnsignedKt.ulongToString(j2, CharsKt.checkRadix(i2));
    }

    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m10293toStringLxnNnR4(byte b2, int i2) {
        String string = Integer.toString((-1) - (((-1) - b2) | ((-1) - 255)), CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m10294toStringV7xB4Y4(int i2, int i3) {
        long j2 = i2;
        String string = Long.toString((j2 + 4294967295L) - (j2 | 4294967295L), CharsKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m10295toStringolVBNx4(short s2, int i2) {
        String string = Integer.toString(s2 & 65535, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m9048unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final byte toUByte(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i2);
        if (uByteOrNull != null) {
            return uByteOrNull.m9048unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final UByte toUByteOrNull(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i2);
        if (uIntOrNull == null) {
            return null;
        }
        int iM9127unboximpl = uIntOrNull.m9127unboximpl();
        if (Integer.compareUnsigned(iM9127unboximpl, UInt.m9075constructorimpl(255)) > 0) {
            return null;
        }
        return UByte.m8992boximpl(UByte.m8998constructorimpl((byte) iM9127unboximpl));
    }

    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m9127unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final int toUInt(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i2);
        if (uIntOrNull != null) {
            return uIntOrNull.m9127unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final UInt toUIntOrNull(String str, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int iM9075constructorimpl = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i3 = 0;
        }
        int iM9075constructorimpl2 = UInt.m9075constructorimpl(i2);
        int iDivideUnsigned = 119304647;
        while (i3 < length) {
            int iDigitOf = CharsKt.digitOf(str.charAt(i3), i2);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compareUnsigned(iM9075constructorimpl, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iM9075constructorimpl2);
                    if (Integer.compareUnsigned(iM9075constructorimpl, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iM9075constructorimpl3 = UInt.m9075constructorimpl(iM9075constructorimpl * iM9075constructorimpl2);
            iM9075constructorimpl = UInt.m9075constructorimpl(UInt.m9075constructorimpl(iDigitOf) + iM9075constructorimpl3);
            if (Integer.compareUnsigned(iM9075constructorimpl, iM9075constructorimpl3) < 0) {
                return null;
            }
            i3++;
        }
        return UInt.m9069boximpl(iM9075constructorimpl);
    }

    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m9206unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final long toULong(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i2);
        if (uLongOrNull != null) {
            return uLongOrNull.m9206unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final ULong toULongOrNull(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM9154constructorimpl = ULong.m9154constructorimpl(i2);
        long jM9154constructorimpl2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i3 < length) {
            int iDigitOf = CharsKt.digitOf(str.charAt(i3), i2);
            if (iDigitOf < 0) {
                return null;
            }
            if (Long.compareUnsigned(jM9154constructorimpl2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jM9154constructorimpl);
                    if (Long.compareUnsigned(jM9154constructorimpl2, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jM9154constructorimpl3 = ULong.m9154constructorimpl(jM9154constructorimpl2 * jM9154constructorimpl);
            long jM9075constructorimpl = UInt.m9075constructorimpl(iDigitOf);
            jM9154constructorimpl2 = ULong.m9154constructorimpl(ULong.m9154constructorimpl((jM9075constructorimpl + 4294967295L) - (jM9075constructorimpl | 4294967295L)) + jM9154constructorimpl3);
            if (Long.compareUnsigned(jM9154constructorimpl2, jM9154constructorimpl3) < 0) {
                return null;
            }
            i3++;
        }
        return ULong.m9148boximpl(jM9154constructorimpl2);
    }

    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m9311unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final short toUShort(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i2);
        if (uShortOrNull != null) {
            return uShortOrNull.m9311unboximpl();
        }
        StringsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final UShort toUShortOrNull(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i2);
        if (uIntOrNull == null) {
            return null;
        }
        int iM9127unboximpl = uIntOrNull.m9127unboximpl();
        if (Integer.compareUnsigned(iM9127unboximpl, UInt.m9075constructorimpl(65535)) > 0) {
            return null;
        }
        return UShort.m9255boximpl(UShort.m9261constructorimpl((short) iM9127unboximpl));
    }
}
