package kotlin.text;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!,|\bӵLc\u0003\u0010I\u00066\u000b6B\r)4\u0012}\u0007njG6LeN>ZS8\u000fs{:%c$\u007fLCU ~*\t]Qo˧vJp\u000bKƤ\u000e\u0016\u0007z4I[ze\u0012\u001d:JoE5e\u000eK<xtd\tP60=\u0012\u0005/\u001eZL\u001e|\u0013Cy\u0013B4NxRR;TK\u001a*DL)\u0019\u001e\u000bn~:Vvu:]*3mPY?_^\u0004}\u0011T`?\r%hN/NDM\u0015SZ3\u000b`iW\u0003mxm\tv6?+wz\b:f\u0010,\u0015YVSƞ\u000bdj\u0016i`:.[Sq]h\u000eV~+\u007f\u001bG\u001c\u000e4.x2;&~\b<:%vaMh\u0002\rI0~oD/%.:[=)uiai ~;\n\u0015%\u001eQ\b5ďsr\u001cs-\u001b\u0003{\u00025_CUH|\u000e\nA{\t\tb0.44U\bG{?5]%O\u0006G79k0Olg%\u0006\u0011la~jHn#\u001f\u001aE@!\f\tK\u0015\tyglXZ\u0018} b\u001f\u0016\bA!#wTK3)fO\u0017\u0004\u0013M\f\u000bU3tRqn\u001a\u0015\b=lJMQ\u0012\u0017\u0012V\u00050W<\u0011\f\tjPp$Z\u000bFh2`\u0005\u001e\u0017\u0014D|\u0013;2mrL8:G1\\CO3\"PX\u0015\t\u000ea/\u0010\u0017fAD\u001biR{1\u0001~]!su\u000fa,+gh-YyC:>UP\u000b\\|Q\b/y\u0006Gug_L\u001b\u001d&[\u0002 $1QQ]DC\u0015\u0005)@%EEz\u0017,Re&5\u001c\u0015y=]\u0011.\u0016\t\u001bv2`xmgTEF=c\u000bK\u0016\n\u0018y\u0010l#G\u0012U;aDI\u0001\u001eq<|?-\u000b%\u001e3\u0018\b\"+<]I-\u001d$\u001b,/C\u0006$j\bB\b\b'&#\f,,\u0012\u0017 hW]@^PI\b#\u0005'<\u0015\u0011i`j&\u000fj\tb\u000ecNGd~qPM96.l\r,\u001b\bn[h\u001a \u0004:.mM\fC,8%D=%[z\u007fm\u001cR\u0005\u000bx\u0010:\u0011\u00021|54=Nz\u001eg!X\u0014\u001c06o?\u000b\u0005j\nT:2<\u0016&[T\u0018\r@\u0001\u0006Fm&/2pzk\\\u0014T\u0007\u007fnH3\u0005\fa9>\u000f''3L|]13nvZ5c@$k\u001d7?1T\u0017\u00153T\\Tg\u001fPX/\fucII\u0010Q\u001cGWt\u001cu\u00128&\u00145BF\"iU\u001f\u0003\u000f0\r/\u0006h\\\u0001\u000f\u0012\u0015Y\u0015#A'\t'&<8:3\u0019}s h3L\\\u0013OCH\bGJ/\u0007\u001a\u0014{FI46;3=W\u000e,'*{\u001a<\u0016\u001c.J?\u0004#L\u0005W<g:c!:$\u0015.b0-YU8\u0018<v\rr8/06}$c\b\u0019^g\u000f\u0010!nKqq\u001ejY\u0015\u0011\n\u0012m\fn\u000413l7V\b\nEPK\u0010WS4\u0013fqR\u0011\u0002'\t\u0017\u0006\u0014#I766\u0007o\u0015gwv\u001d\u0004O\n\u000eS/\u001aP\u001276R,!7y$(pY@)I\u0003e>\u0013\n\u0005lp^>dp(r\u0018$)B!EMv%!`^rLeW7G#\f\u0013M`\u0015']ITEwWW/E^#oVw9\u0003h\u000e%\u00060B\u0017\u0016\u0018gZQ\rYU45\u0007<m\u0013\u0004NKs<r\f:4&\u0011]~h$L\u000b2\u001ciXyB9\u001d\u000f́P\u0006\u001e\u0006oƽlܱW%2ʈ\u001d\r\u001b?\u00121\u001a;JمEܯ3\u000fwߦwrI'Mez(b֎8ڧ\u0003MkǾֈe["}, d2 = {"\u0016DG,7\u0010 7\bltM\u0016vg\u000fCc\u0010W'", "", "\u001aNF\u0012E&\u001c/\u0007^tA\fo\u0003\u000eIa\fj.", "", "#O?\u0012E&\u001c/\u0007^tA\fo\u0003\u000eIa\fj.", "1gP?f\u0017>`\u0007~\n", "", "1gP?f\u0017>`x\u0006zf,\u0006\u0018", "3kT:X5Ma\u0004~\bL,\f", "", "3kT:X5MA\u0019\nvk(\f\u0013<L\u007f1}O\u0004", "4na:T;MS\u0018l\nk0\u0006\u000b\u0016e\t*\u000bC", "Bnc._\tRb\u0019\r", "0xc2f\u0017>`\u007f\u0003\u0004^", "0xc2f\u0017>`z\f\u0005n7", "5q^Bc\u001a>^\u0015\fvm6\no/n\u00027~", "0xc2F,IO&z\nh9c\t8g\u000f+", "0xc2C9>T\u001d\u0012a^5~\u00182", "0xc2F<?T\u001d\u0012a^5~\u00182", ">`a@X+\u001bg(~Vk9x\u001d\u0017a\u0013\u0016\u007fU\u0001", "Asa6a.%S\"\u0001\na", "Eg^9X\fES!~\u0004m:g\t<S\u007f7", "1gT0^\nH\\(z~g:X\u0018", ">`aA", "7mS2k", "3mS\u0016a+>f", ">`aAA(FS", "1gT0^\u000f>f\u007f~\u0004`;\u007f", "", "AsP?g\u0010GR\u0019\u0012", ";`g\u0011\\.Bb'", "@d`B\\9>;\u0015\u0012a^5~\u00182", "", "1gT0^\u0015>e\u007f\u0003\u0004^\b\f", "2dR6`(E4&\t\u0003A,\u0010g3g\u00047WO", "6dg!b\tRb\u0019", "", "4na:T;", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010l", "6dg!b\tRb\u0019Z\bk(\u0011", "", "6dg!b\u0010Gb", "6dg!b\u0013H\\\u001b", "6dg!b\u0013H\\\u001bb\u0003i3", "6dg!b\u001aA]&\u000e", "", "Bn72k\u001aM`\u001d\b|", "Bn72k\u001aM`\u001d\b|B4\b\u0010", "0hc@", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[128];
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            iArr[i3] = -1;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            iArr[str.charAt(i4)] = i5;
            i4++;
            i5++;
        }
        int i6 = 0;
        while (i2 < str.length()) {
            iArr[str.charAt(i2)] = i6;
            i2++;
            i6++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr;
    }

    private static final long charsPerSet(long j2, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j3 = i2;
        return (j2 * j3) + (((long) i3) * (j3 - 1));
    }

    private static final int checkContainsAt(String str, String str2, int i2, int i3, String str3) {
        int length = str2.length() + i2;
        if (length <= i3 && StringsKt.regionMatches(str, i2, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sbAppend = new StringBuilder("Expected ").append(str3).append(" \"").append(str2).append("\" at index ").append(i2).append(", but was ");
        int iCoerceAtMost = RangesKt.coerceAtMost(length, i3);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException(sbAppend.append(strSubstring).toString());
    }

    private static final void checkHexLength(String str, int i2, int i3, int i4, boolean z2) {
        int i5 = i3 - i2;
        if (z2) {
            if (i5 == i4) {
                return;
            }
        } else if (i5 <= i4) {
            return;
        }
        String str2 = z2 ? "exactly" : "at most";
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + TokenParser.SP + i4 + " hexadecimal digits at index " + i2 + ", but was " + strSubstring + " of length " + i5);
    }

    private static final int checkNewLineAt(String str, int i2, int i3) {
        if (str.charAt(i2) == '\r') {
            int i4 = i2 + 1;
            return (i4 >= i3 || str.charAt(i4) != '\n') ? i4 : i2 + 2;
        }
        if (str.charAt(i2) == '\n') {
            return i2 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i2 + ", but was " + str.charAt(i2));
    }

    private static final int decimalFromHexDigitAt(String str, int i2) {
        int i3;
        char cCharAt = str.charAt(i2);
        if (cCharAt > 127 || (i3 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
            throw new NumberFormatException("Expected a hexadecimal digit at index " + i2 + ", but was " + str.charAt(i2));
        }
        return i3;
    }

    public static final int formattedStringLength(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i9 = i2 - 1;
        int i10 = i9 / i3;
        int i11 = (i3 - 1) / i4;
        int i12 = i2 % i3;
        if (i12 != 0) {
            i3 = i12;
        }
        int i13 = (i11 * i10) + ((i3 - 1) / i4);
        long j2 = ((long) i10) + (((long) i13) * ((long) i5)) + (((long) ((i9 - i10) - i13)) * ((long) i6)) + (((long) i2) * (((long) i7) + 2 + ((long) i8)));
        if (RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), j2)) {
            return (int) j2;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m9200toStringimpl(ULong.m9154constructorimpl(j2))));
    }

    private static final byte hexToByte(String str, int i2, int i3, HexFormat hexFormat) {
        return (byte) hexToLongImpl(str, i2, i3, hexFormat, 2);
    }

    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    static /* synthetic */ byte hexToByte$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((2 & i4) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    private static final byte[] hexToByteArray(String str, int i2, int i3, HexFormat hexFormat) {
        int iCheckContainsAt = i2;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(iCheckContainsAt, i3, str.length());
        if (iCheckContainsAt == i3) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        int i4 = parsedByteArrayMaxSize(i3 - iCheckContainsAt, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (iCheckContainsAt < i3) {
            if (i6 == bytesPerLine) {
                iCheckContainsAt = checkNewLineAt(str, iCheckContainsAt, i3);
                i6 = 0;
            } else if (i7 == bytesPerGroup) {
                iCheckContainsAt = checkContainsAt(str, groupSeparator, iCheckContainsAt, i3, "group separator");
            } else {
                if (i7 != 0) {
                    iCheckContainsAt = checkContainsAt(str, byteSeparator, iCheckContainsAt, i3, "byte separator");
                }
                i6++;
                i7++;
                int iCheckContainsAt2 = checkContainsAt(str, bytePrefix, iCheckContainsAt, i3, "byte prefix");
                checkHexLength(str, iCheckContainsAt2, RangesKt.coerceAtMost(iCheckContainsAt2 + 2, i3), 2, true);
                int iDecimalFromHexDigitAt = decimalFromHexDigitAt(str, iCheckContainsAt2) << 4;
                bArr[i5] = (byte) (iDecimalFromHexDigitAt | decimalFromHexDigitAt(str, iCheckContainsAt2 + 1));
                iCheckContainsAt = checkContainsAt(str, byteSuffix, iCheckContainsAt2 + 2, i3, "byte suffix");
                i5++;
            }
            i7 = 0;
            i6++;
            i7++;
            int iCheckContainsAt22 = checkContainsAt(str, bytePrefix, iCheckContainsAt, i3, "byte prefix");
            checkHexLength(str, iCheckContainsAt22, RangesKt.coerceAtMost(iCheckContainsAt22 + 2, i3), 2, true);
            int iDecimalFromHexDigitAt2 = decimalFromHexDigitAt(str, iCheckContainsAt22) << 4;
            bArr[i5] = (byte) (iDecimalFromHexDigitAt2 | decimalFromHexDigitAt(str, iCheckContainsAt22 + 1));
            iCheckContainsAt = checkContainsAt(str, byteSuffix, iCheckContainsAt22 + 2, i3, "byte suffix");
            i5++;
        }
        if (i5 == i4) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i3 = str.length();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    private static final int hexToInt(String str, int i2, int i3, HexFormat hexFormat) {
        return (int) hexToLongImpl(str, i2, i3, hexFormat, 8);
    }

    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    static /* synthetic */ int hexToInt$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = str.length();
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    private static final long hexToLong(String str, int i2, int i3, HexFormat hexFormat) {
        return hexToLongImpl(str, i2, i3, hexFormat, 16);
    }

    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    static /* synthetic */ long hexToLong$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((2 & i4) != 0) {
            i3 = str.length();
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    private static final long hexToLongImpl(String str, int i2, int i3, HexFormat hexFormat, int i4) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        if (prefix.length() + suffix.length() >= i3 - i2) {
            StringBuilder sbAppend = new StringBuilder("Expected a hexadecimal number with prefix \"").append(prefix).append("\" and suffix \"").append(suffix).append("\", but was ");
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            throw new NumberFormatException(sbAppend.append(strSubstring).toString());
        }
        int iCheckContainsAt = checkContainsAt(str, prefix, i2, i3, "prefix");
        int length = i3 - suffix.length();
        checkContainsAt(str, suffix, length, i3, "suffix");
        checkHexLength(str, iCheckContainsAt, length, i4, false);
        long jDecimalFromHexDigitAt = 0;
        while (iCheckContainsAt < length) {
            jDecimalFromHexDigitAt = (-1) - (((-1) - (jDecimalFromHexDigitAt << 4)) & ((-1) - ((long) decimalFromHexDigitAt(str, iCheckContainsAt))));
            iCheckContainsAt++;
        }
        return jDecimalFromHexDigitAt;
    }

    static /* synthetic */ long hexToLongImpl$default(String str, int i2, int i3, HexFormat hexFormat, int i4, int i5, Object obj) {
        if ((i5 + 1) - (1 | i5) != 0) {
            i2 = 0;
        }
        if ((i5 + 2) - (i5 | 2) != 0) {
            i3 = str.length();
        }
        return hexToLongImpl(str, i2, i3, hexFormat, i4);
    }

    private static final short hexToShort(String str, int i2, int i3, HexFormat hexFormat) {
        return (short) hexToLongImpl(str, i2, i3, hexFormat, 4);
    }

    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    static /* synthetic */ short hexToShort$default(String str, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((2 & i4) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    public static final int parsedByteArrayMaxSize(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jCharsPerSet;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = ((long) i7) + 2 + ((long) i8);
        long jCharsPerSet2 = charsPerSet(j2, i4, i6);
        if (i3 <= i4) {
            jCharsPerSet = charsPerSet(j2, i3, i6);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i3 / i4, i5);
            int i9 = i3 % i4;
            if (i9 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i5) + charsPerSet(j2, i9, i6);
            }
        }
        long j3 = i2;
        long jWholeElementsPerSet = wholeElementsPerSet(j3, jCharsPerSet, 1);
        long j4 = j3 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j4, jCharsPerSet2, i5);
        long j5 = j4 - ((jCharsPerSet2 + ((long) i5)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j5, j2, i6);
        return (int) ((jWholeElementsPerSet * ((long) i3)) + (jWholeElementsPerSet2 * ((long) i4)) + jWholeElementsPerSet3 + ((long) (j5 - ((j2 + ((long) i6)) * jWholeElementsPerSet3) > 0 ? 1 : 0)));
    }

    public static final String toHexString(byte b2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(b2, format, 8);
    }

    public static final String toHexString(int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(i2, format, 32);
    }

    public static final String toHexString(long j2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(j2, format, 64);
    }

    public static final String toHexString(short s2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(s2, format, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String toHexString(byte[] r14, int r15, int r16, kotlin.text.HexFormat r17) {
        /*
            r9 = r15
            java.lang.String r0 = "<this>"
            r10 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "format"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r1 = kotlin.collections.AbstractList.Companion
            int r0 = r10.length
            r8 = r16
            r1.checkBoundsIndexes$kotlin_stdlib(r9, r8, r0)
            if (r9 != r8) goto L1b
            java.lang.String r0 = ""
            return r0
        L1b:
            boolean r0 = r2.getUpperCase()
            if (r0 == 0) goto La3
            java.lang.String r7 = "0123456789ABCDEF"
        L23:
            kotlin.text.HexFormat$BytesHexFormat r0 = r2.getBytes()
            int r6 = r0.getBytesPerLine()
            int r5 = r0.getBytesPerGroup()
            java.lang.String r4 = r0.getBytePrefix()
            java.lang.String r3 = r0.getByteSuffix()
            java.lang.String r2 = r0.getByteSeparator()
            java.lang.String r1 = r0.getGroupSeparator()
            int r11 = r8 - r9
            int r14 = r1.length()
            int r15 = r2.length()
            int r16 = r4.length()
            int r17 = r3.length()
            r13 = r5
            r12 = r6
            int r13 = formattedStringLength(r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            r14 = 0
            r11 = 0
        L5e:
            if (r9 >= r8) goto La7
            r16 = r10[r9]
            r0 = 255(0xff, float:3.57E-43)
            int r15 = r16 + r0
            r0 = r16 | r0
            int r15 = r15 - r0
            if (r14 != r6) goto L9d
            r0 = 10
            r12.append(r0)
            r14 = 0
        L71:
            r11 = 0
        L72:
            if (r11 == 0) goto L77
            r12.append(r2)
        L77:
            r12.append(r4)
            int r0 = r15 >> 4
            char r0 = r7.charAt(r0)
            r12.append(r0)
            r0 = 15
            int r15 = (-1) - r16
            int r0 = (-1) - r0
            r15 = r15 | r0
            int r0 = (-1) - r15
            char r0 = r7.charAt(r0)
            r12.append(r0)
            r12.append(r3)
            int r11 = r11 + 1
            int r14 = r14 + 1
            int r9 = r9 + 1
            goto L5e
        L9d:
            if (r11 != r5) goto L72
            r12.append(r1)
            goto L71
        La3:
            java.lang.String r7 = "0123456789abcdef"
            goto L23
        La7:
            int r0 = r12.length()
            if (r13 != r0) goto Lb7
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.toHexString(byte[], int, int, kotlin.text.HexFormat):java.lang.String");
    }

    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte b2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i2, int i3, HexFormat hexFormat, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = bArr.length;
        }
        if ((i4 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i2, i3, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    private static final String toHexStringImpl(long j2, HexFormat hexFormat, int i2) {
        if ((-1) - (((-1) - i2) | ((-1) - 3)) != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        int length = prefix.length() + (i2 >> 2) + suffix.length();
        boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
        StringBuilder sb = new StringBuilder(length);
        sb.append(prefix);
        while (i2 > 0) {
            i2 -= 4;
            int i3 = (int) ((j2 >> i2) & 15);
            removeLeadingZeros = removeLeadingZeros && i3 == 0 && i2 > 0;
            if (!removeLeadingZeros) {
                sb.append(str.charAt(i3));
            }
        }
        sb.append(suffix);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final long wholeElementsPerSet(long j2, long j3, int i2) {
        if (j2 <= 0 || j3 <= 0) {
            return 0L;
        }
        long j4 = i2;
        return (j2 + j4) / (j3 + j4);
    }
}
