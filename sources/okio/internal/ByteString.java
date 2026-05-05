package okio.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import org.msgpack.core.MessagePack;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-ByteString */
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
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,\u0001\bDJf|\u0004O\f8é6B\r24\u0012}\u0007njO0LeN/ZS8\u0019sڔ<$i0yCAW\"}0\tWNmmvJh\u0014K\u000f\f\u0016\u0001j:կ]ތe\u0012\u001d5JoEHUoS9hҚN\u001b.6:8(\n1\u001e8N(v)J{\u0010 8XphWSM\u001d) \u000fV /(\rk\\A`l\fAu\u074b\t\u0002P\\3w0+R=Jb4%v\u0010,q@O@#4k\u00035b\u0004?1I8ܶ\u000b\u000125<as\u0006F\u0001\u007fB\u001fq˾\u0013u\u00064n\u001dQ\u000f\u0011O+}m{T\u001c;\u0010z*\u0017\u0003Ǌ\u0014\u001eRVBE\u001a\u0015\u001d63#|\u0004D^\u0018vB.\u007f\u0012:%<\u00183Y@Kj_yS\u0019|<,\t\u001b7;\u0001\u001d&\"٫\u0014x\")n\u0010SGPnGpN8i\u0004Ш\n\tm\u0010E\u001c0u\nW{?>]§=sD1=\u0004\u0002vN\u0010v3p/׆oj[N?\u0007\u0016eH1\f\tN\u0015\tyolXZ\u0018\u0014ȽZ\u001f\u0011\u001608\\&ZI%>X\u007flw\ne]8/uϊ=q\u0004y.o9\rQ]Q\u0012\u001a\u0012X\u0005'W>x\u0004\u0007\b\tͮ\u0012ro6DJH\u00193 {rX<\u0017@c\n\u001cb1wǊb-S\u0011CZA+\u000e\bZ\u0017\u001aEԟ9<\u000ewJ\r\t/U\u0005p\u001eq?̣2\u0015k0TYQc)NUPrzë)\u001f\u001a\u0002(_gzLtlD\u007f\u0006\u007f.)29\u007f6m\u0017\u001d(A202\fɤx}\\[<?z+\u00017;\u00178.Ŏp\tGn\u0016bO\u0003\u001cJv\r|S\fr\u0013\u0012at\u0002wgb4s>wwIʜBfS\u000b07\u001eS\u0006\u0018\"+?]G50.wB9Eek\u0013\b.(gUկz}/:\u0010.o\u0011o\u00062iBy]\rT:$\u001b\brLx\u000b B7;=7Vn|p\u0005=}\u000f=\u0017~\u0007Z\u00127¤aR>}*L.\u000eH\u001cC,\u001e\u000fG3'eS\u0016r\u001eOj\u001eb\u000f8\u0015,5|?4=N[\bf\u0017I\u001esF;\bݦh\u001dO\u0017RL,j&3C\u0003s6\u0014\t/^_=\u001ex\u0000ySi\u001c\u0003\u0011\\\u0005f-`sjQ.\u000f.'3L\u0003{̎\u000b\u0006ab_{2/]E\tIt\u007f\u0003tVCD\u0003>K,f3#E\fH\u0010ͺ<\u001cR7!\u0004o:B@|KL^È?i\u001cm+H^9_\rN\u0013\u0001XקXf-74\u0013|<C2\u000f9#\u0016ΔuzHZ\u0005\u00107q$)\u0017r07\u0010\u000by^\u001b[\u000be1Kb\u0003\u0014U\u0001\u001eĘA\u0016\u0013.W?\u0004#1\u0005W<pP܂!R!\u007fNz\u00027#x 28\u0011Ɣx\"P\u0016og\u0002a\u0017;^\bu(%NaCl4}{l\u0007 {l\u0012s\u0006\u000f\u0011\u007fIV(ssǠ=#5ӍF\u0013\u0007YpÎ*ݲZӜ\u0004 \u001dұ/8\u000eb7\u0011genryRܩ\u0011g"}, d2 = {"\u0016DG,7\u0010 7\bxXA\biv", "", "5dc\u00158\u001f82|`^M&Zk\u000bRmfwI\n!&C~\u0012F\u007f3", "u(E", "5dc\u00158\u001f82|`^M&Zk\u000bRm", "u(J\u0010", "1nS2C6B\\(b\u0004],\u0010w9C\u0003$\t$\n\u0016\u0017Z", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "1nS2C6B\\(\\\u0005n5\f", "1n\\:b5(T", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "2`c.", "2dR<W,!S,]~`0\f", "1", "", "1n\\:b5\u001bO'~K-", "", "1n\\:b5\u001bO'~K-\u001c\n\u0010", "1n\\:b5\u001c]!\nvk,k\u0013", "=sW2e", "1n\\:b5\u001c]$\u0013^g;\u0007", "", "=eU@X;", "B`a4X;", "B`a4X;(T\u001a\rzm", "0xc266N\\(", "1n\\:b5\u001dS\u0017\ty^\tx\u0017/6N", "1n\\:b5\u001dS\u0017\ty^\u000f|\u001c", "1n\\:b5\u001e\\\u0017\ty^\u001c\f\n\u0002", "1n\\:b5\u001e\\\u0018\rlb;\u007f", "", "AtU3\\?", "1n\\:b5\u001e_)z\u0002l", "", "1n\\:b5 S([\u000fm,", "", ">nb", "1n\\:b5 S(l~s,", "1n\\:b5!O'\u0002Xh+|", "1n\\:b5!S,", "1n\\:b5\"\\\u0018~\u000eH-", "4q^:<5=S,", "1n\\:b5\"\\(~\bg(\u0004d<r{<", "1n\\:b5%O'\u000e^g+|\u001c\u0019f", "1n\\:b5+O\"\u0001z>8\r\u00056s", "=sW2e\u0016?T'~\n", "1n\\:b5,b\u0015\f\nl\u001e\u0001\u00182", ">qT3\\?", "1n\\:b5,c\u0016\r\nk0\u0006\u000b", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "1n\\:b5-]t\rxb0c\u0013Ae\r&wN\u0001", "1n\\:b5-]t\rxb0l\u0014:e\r&wN\u0001", "1n\\:b5-]u\u0013\n^\b\n\u0016+y", "1n\\:b5-]u\u0013\n^\u001a\f\u00163n\u0002", "1n\\:b5-]\u0007\u000e\bb5~", "1n\\:b5.b\u001aQ", "1n\\:b50`\u001d\u000ez", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int codePointIndexToCharIndex(byte[] bArr, int i2) {
        byte b2;
        int i3;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (i4 < length) {
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                int i7 = i6 + 1;
                if (i6 == i2) {
                    return i5;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (127 <= b3 && b3 < 160))) || b3 == 65533) {
                    return -1;
                }
                i5 += b3 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b2 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 != i2) {
                            if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                                break loop0;
                            }
                            i5 += b2 < 65536 ? 1 : 2;
                        } else {
                            return i5;
                        }
                    } else {
                        break;
                    }
                }
                return -1;
            }
            if ((b3 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length <= i8) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                byte b4 = bArr[i8];
                if ((b4 + MessagePack.Code.NIL) - (192 | b4) != 128) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                int i9 = (b3 << 6) ^ (b4 ^ 3968);
                if (i9 < 128) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                int i10 = i6 + 1;
                if (i6 == i2) {
                    return i5;
                }
                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                    return -1;
                }
                i5 += i9 < 65536 ? 1 : 2;
                Unit unit = Unit.INSTANCE;
                i4 += 2;
                i6 = i10;
            } else {
                if ((b3 >> 4) == -2) {
                    int i11 = i4 + 2;
                    if (length <= i11) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b5 = bArr[i4 + 1];
                    if ((-1) - (((-1) - b5) | ((-1) - 192)) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i11];
                    if ((192 & b6) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i12 = (b3 << Ascii.FF) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                    if (i12 < 2048) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (55296 <= i12 && i12 < 57344) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    i3 = i6 + 1;
                    if (i6 == i2) {
                        return i5;
                    }
                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                        return -1;
                    }
                    i5 += i12 < 65536 ? 1 : 2;
                    Unit unit2 = Unit.INSTANCE;
                    i4 += 3;
                } else {
                    if ((b3 >> 3) != -2) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i13 = i4 + 3;
                    if (length <= i13) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i4 + 1];
                    if ((192 & b7) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i4 + 2];
                    if ((192 & b8) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i13];
                    if ((b9 + MessagePack.Code.NIL) - (192 | b9) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i14 = (b3 << Ascii.DC2) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << Ascii.FF));
                    if (i14 > 1114111) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (55296 <= i14 && i14 < 57344) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (i14 < 65536) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    i3 = i6 + 1;
                    if (i6 == i2) {
                        return i5;
                    }
                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                        return -1;
                    }
                    i5 += i14 < 65536 ? 1 : 2;
                    Unit unit3 = Unit.INSTANCE;
                    i4 += 4;
                }
                i6 = i3;
            }
        }
        return i5;
    }

    public static final String commonBase64(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString other) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = byteString.getByte(i2) & 255;
            byte b2 = other.getByte(i2);
            int i4 = (b2 + 255) - (b2 | 255);
            if (i3 != i4) {
                return i3 < i4 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i2, byte[] target, int i3, int i4) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(byteString.getData$okio(), target, i3, i2, i4 + i2);
    }

    public static final okio.ByteString commonDecodeBase64(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final okio.ByteString commonDecodeHex(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((decodeHexDigit(str.charAt(i3)) << 4) + decodeHexDigit(str.charAt(i3 + 1)));
        }
        return new okio.ByteString(bArr);
    }

    public static final okio.ByteString commonEncodeUtf8(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio()[i2];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        byte[] data$okio = byteString.getData$okio();
        int i2 = 0;
        for (byte b2 : data$okio) {
            int i3 = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[(-1) - (((-1) - (b2 >> 4)) | ((-1) - 15))];
            i2 += 2;
            cArr[i3] = getHEX_DIGIT_CHARS()[(b2 + Ascii.SI) - (b2 | Ascii.SI)];
        }
        return StringsKt.concatToString(cArr);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i2);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i2), byteString.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final okio.ByteString commonOf(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i2, okio.ByteString other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i3, byteString.getData$okio(), i2, i4);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i2, byte[] other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return i2 >= 0 && i2 <= byteString.getData$okio().length - i4 && i3 >= 0 && i3 <= other.length - i4 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i2, other, i3, i4);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        if (iResolveDefaultParameter - i2 >= 0) {
            return (i2 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new okio.ByteString(ArraysKt.copyOfRange(byteString.getData$okio(), i2, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i2] = (byte) (b2 + MessagePack.Code.NEGFIXINT_PREFIX);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArrCopyOf[i3] = (byte) (b3 + MessagePack.Code.NEGFIXINT_PREFIX);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i3);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, iResolveDefaultParameter);
        return new okio.ByteString(ArraysKt.copyOfRange(bArr, i2, iResolveDefaultParameter + i2));
    }

    public static final String commonToString(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            return iCodePointIndexToCharIndex < strUtf8.length() ? "[size=" + byteString.getData$okio().length + " text=" + strReplace$default + "…]" : "[text=" + strReplace$default + AbstractJsonLexerKt.END_LIST;
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sbAppend = new StringBuilder("[size=").append(byteString.getData$okio().length).append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new okio.ByteString(ArraysKt.copyOfRange(byteString.getData$okio(), 0, iResolveDefaultParameter));
        }
        return sbAppend.append(byteString.hex()).append("…]").toString();
    }

    public static final String commonUtf8(okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i2, i3);
    }

    public static final int decodeHexDigit(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            throw new IllegalArgumentException("Unexpected hex digit: " + c2);
        }
        return c2 - '7';
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }
}
