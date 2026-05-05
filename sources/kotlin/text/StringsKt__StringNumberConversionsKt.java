package kotlin.text;

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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,h\bӵLc\u0003\u0010Iي8\u000b<E\u0007\"2\u0012\u007f\u0007tpA0JhP.`Z2\u000fq|<$i,yCAV2\f0ޛgN\u0016f\u001fNh\u000b[\u000f4\u0017?̓DZczu\u0014%1prg3{p\u0004>žx6\u0013$J;F{\u001d\u00030)v\u0013\u001fzqL<\u0016>E\t:\u0001\u0013\u0014\nܨ\u0016\u0006L'\u0019/jof8^k\f@W#1j\tSϮc0\u000bV%_b/%xw\u001dYF_5C&\u0004\u0007\u0015Ws?1E8Bݾl'55a\u0005eAp\u0002*\u0014Y[5]!'#\nŌd\f58g|Y[&*\u000ey*\u0019d\u0004<\u0007WL<22f6\u0014yyɤW@^\u0010vS\u000e\ny8-$.CS9Ig\u0018fޅ\u001dNE\r\u001d&,2\u0019p7Z\u0003\u001e\t\u0015IU(U?VX=vTP^ǀq\u0004~t͌.\u0017"}, d2 = {"<t\\/X9\u001f]&\u0007vm\f\n\u00169r", "", "7m_Bg", "", "Bn1Fg,(`\u0002\u000f\u0002e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~6\u0012/7C", "@`S6k", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004g\u001c\u0013XkWCr.7#Z4Fmk", "Bn8;g\u0016K<)\u0006\u0002", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004g\u001c\u0013XkWCr.7#a)Fm\u0018.Z\u0019", "Bn;<a.(`\u0002\u000f\u0002e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004g\u001c\u0013XkWCr.7#d*@ok", "BnB5b9M=&g\u000be3", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\u0001*D|k", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004g\u001c\u0013XkWCr.7#k#Az%\u0004", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static final Byte toByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toByteOrNull(str, 10);
    }

    public static final Byte toByteOrNull(String str, int i2) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt.toIntOrNull(str, i2);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    public static final Integer toIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toIntOrNull(str, 10);
    }

    public static final Integer toIntOrNull(String str, int i2) {
        boolean z2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        int i6 = -2147483647;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i6 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
            }
        } else {
            z2 = false;
            i3 = 0;
        }
        int i7 = -59652323;
        while (i3 < length) {
            int iDigitOf = CharsKt.digitOf(str.charAt(i3), i2);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / i2))) || (i4 = i5 * i2) < i6 + iDigitOf) {
                return null;
            }
            i5 = i4 - iDigitOf;
            i3++;
        }
        return z2 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
    }

    public static final Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toLongOrNull(str, 10);
    }

    public static final Long toLongOrNull(String str, int i2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j2 = Long.MIN_VALUE;
                i3 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
                i3 = 1;
            }
        } else {
            z2 = false;
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i3 < length) {
            int iDigitOf = CharsKt.digitOf(str.charAt(i3), i2);
            if (iDigitOf < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 == j3) {
                    j5 = j2 / ((long) i2);
                    if (j4 < j5) {
                    }
                }
                return null;
            }
            long j6 = j4 * ((long) i2);
            long j7 = iDigitOf;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i3++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }

    public static final Short toShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toShortOrNull(str, 10);
    }

    public static final Short toShortOrNull(String str, int i2) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt.toIntOrNull(str, i2);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
