package okhttp3.internal;

import com.dynatrace.android.agent.Global;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
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
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!,r\bӵLc\u0003\u0010Iي8\u000b<H\u0007\"2\u0012\u007f\u0007tzA0JeP.hS2\u000fq}LRiҕ\nCiTJ\u00020\tgN\u0016h\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0015?6PtW3{um=n{N\u0005N5h8\u0012%\u000f\"BJ&u)L{\u0010 0XphS=Q\u0013\u001c*\u0006l#1\"jkf6vo$:G1\u0011sZNU``\u0001[\u0012^TU\u0013=a65NBM\u0015SR+\u0007\u0001\\\u0006\u0003W{K\u0011\u0001)=*wt\u007f6\u0007\u0001Е\u00198"}, d2 = {"2dR<W,\"^*Mhn-}\rB", "", "7m_Bg", "", ">nb", "", ":h\\6g", "/cS?X:L", "", "/cS?X:L=\u001a\u007f\t^;", "2dR<W,\"^*O", "\u001aiPCTuGS(H^g,\fd.d\r(\nNV", "7mTA)\b=R&~\tl\u001b\u0007d=c\u0004,", "1n]AT0Ga|\b\fZ3\u0001\b\u0012o\u000e7\u0005<\t\u0017rUm\u0012@T/4Y\f", "Bn2.a6GW\u0017z\u0002A6\u000b\u0018", "=jWAg7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r0 == 16) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r3 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        r5 = r0 - r3;
        java.lang.System.arraycopy(r1, r3, r1, 16 - r5, r5);
        java.util.Arrays.fill(r1, r3, (16 - r0) + r3, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r18, int r19, int r20) {
        /*
            r14 = r19
            r2 = 16
            byte[] r1 = new byte[r2]
            r5 = -1
            r3 = r5
            r6 = r3
            r0 = 0
        La:
            r11 = 0
            r4 = r20
            if (r14 >= r4) goto L5c
            if (r0 != r2) goto L12
            return r11
        L12:
            int r9 = r14 + 2
            r7 = r18
            if (r9 > r4) goto L29
            r16 = 4
            r17 = 0
            java.lang.String r13 = "::"
            r15 = 0
            r12 = r7
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L29
            if (r3 == r5) goto L57
            return r11
        L29:
            if (r0 == 0) goto L3b
            r16 = 4
            r17 = 0
            java.lang.String r13 = ":"
            r15 = 0
            r12 = r7
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L3d
            int r14 = r14 + 1
        L3b:
            r6 = r14
            goto L63
        L3d:
            r16 = 4
            r17 = 0
            java.lang.String r13 = "."
            r15 = 0
            r12 = r7
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L9c
            int r8 = r0 + (-2)
            boolean r4 = decodeIpv4Suffix(r7, r6, r4, r1, r8)
            if (r4 != 0) goto L54
            return r11
        L54:
            int r0 = r0 + 2
            goto L5c
        L57:
            int r0 = r0 + 2
            if (r9 != r4) goto L61
            r3 = r0
        L5c:
            if (r0 == r2) goto Laa
            if (r3 != r5) goto L9d
            return r11
        L61:
            r6 = r9
            r3 = r0
        L63:
            r14 = r6
            r10 = 0
        L65:
            if (r14 >= r4) goto L77
            char r8 = r7.charAt(r14)
            int r8 = okhttp3.internal.Util.parseHexDigit(r8)
            if (r8 == r5) goto L77
            int r10 = r10 << 4
            int r10 = r10 + r8
            int r14 = r14 + 1
            goto L65
        L77:
            int r7 = r14 - r6
            if (r7 == 0) goto L7e
            r4 = 4
            if (r7 <= r4) goto L7f
        L7e:
            return r11
        L7f:
            int r9 = r0 + 1
            int r8 = r10 >>> 8
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r8 + r7
            r8 = r8 | r7
            int r4 = r4 - r8
            byte r4 = (byte) r4
            r1[r0] = r4
            int r0 = r0 + 2
            r4 = 255(0xff, float:3.57E-43)
            int r7 = (-1) - r10
            int r4 = (-1) - r4
            r7 = r7 | r4
            int r4 = (-1) - r7
            byte r4 = (byte) r4
            r1[r9] = r4
            goto La
        L9c:
            return r11
        L9d:
            int r5 = r0 - r3
            int r4 = 16 - r5
            java.lang.System.arraycopy(r1, r3, r1, r4, r5)
            int r2 = r2 - r0
            int r2 = r2 + r3
            r0 = 0
            java.util.Arrays.fill(r1, r3, r2, r0)
        Laa:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        Buffer buffer = new Buffer();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                buffer.writeByte(58);
                i3 += i5;
                if (i3 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i3 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i3], 255) << 8) | Util.and(bArr[i3 + 1], 255));
                i3 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) Global.COLON, false, 2, (Object) null)) {
            InetAddress inetAddressDecodeIpv6 = (StringsKt.startsWith$default(str, "[", false, 2, (Object) null) && StringsKt.endsWith$default(str, "]", false, 2, (Object) null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                Intrinsics.checkNotNullExpressionValue(address, "address");
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
