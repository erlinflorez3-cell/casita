package okio.internal;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
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
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,y\bDRo|\u0004G\u00068\u000b<H\u0007\"2\u0012\u0010\u000ftʑQ0rdp.\u0001SB+y|L$\n$\u001aCiTJ\u0004(\t]P\u007fg\u001dM\u000b\u0011I\u000f\u0014\u001a\u0011jZLǪ|b"}, d2 = {"1n\\:b5\u001aa\t\u000e{1\u001b\u0007eCt\u007f\u0004\tM|+", "", "", "1n\\:b5-]\t\u000e{1\u001a\f\u00163n\u0002", "0dV6a\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i2;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt2 = str.charAt(i3);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) cCharAt3;
                        i3++;
                        while (true) {
                            i4 = i5;
                            if (i3 >= length2 || Intrinsics.compare((int) str.charAt(i3), 128) >= 0) {
                                break;
                            }
                            i5 = i4 + 1;
                            bArr[i4] = (byte) str.charAt(i3);
                            i3++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i4] = (byte) ((cCharAt3 >> 6) | 192);
                            int i6 = (cCharAt3 + '?') - (cCharAt3 | '?');
                            i4 += 2;
                            bArr[i4 + 1] = (byte) ((i6 + 128) - (i6 & 128));
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i4] = (byte) ((cCharAt3 >> '\f') | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
                            int i7 = cCharAt3 >> 6;
                            bArr[i4 + 1] = (byte) ((-1) - (((-1) - ((i7 + 63) - (i7 | 63))) & ((-1) - 128)));
                            i4 += 3;
                            bArr[i4 + 2] = (byte) (((-1) - ((65535 - cCharAt3) | ((-1) - 63))) | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (cCharAt = str.charAt(i2)) || cCharAt >= 57344) {
                            bArr[i4] = Utf8.REPLACEMENT_BYTE;
                            i3++;
                            i4++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i2)) - 56613888;
                            int i8 = iCharAt >> 18;
                            bArr[i4] = (byte) ((i8 + 240) - (i8 & 240));
                            int i9 = iCharAt >> 12;
                            bArr[i4 + 1] = (byte) (((i9 + 63) - (i9 | 63)) | 128);
                            int i10 = (iCharAt >> 6) & 63;
                            bArr[i4 + 2] = (byte) ((i10 + 128) - (i10 & 128));
                            i4 += 4;
                            bArr[i4 + 3] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - iCharAt) | ((-1) - 63)))) & ((-1) - 128)));
                            i3 += 2;
                        }
                        i3++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i3] = (byte) cCharAt2;
            i3++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x006e, code lost:
    
        if ((r15[r0] & org.msgpack.core.MessagePack.Code.NIL) == 128) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0094, code lost:
    
        if ((r15[r0] & org.msgpack.core.MessagePack.Code.NIL) == 128) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String commonToUtf8String(byte[] r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        return commonToUtf8String(bArr, i2, i3);
    }
}
