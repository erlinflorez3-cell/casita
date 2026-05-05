package com.google.common.net;

import com.dynatrace.android.agent.Global;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class InetAddresses {
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final int IPV6_PART_COUNT = 8;
    private static final char IPV4_DELIMITER = '.';
    private static final CharMatcher IPV4_DELIMITER_MATCHER = CharMatcher.is(IPV4_DELIMITER);
    private static final CharMatcher IPV6_DELIMITER_MATCHER = CharMatcher.is(':');
    private static final Inet4Address LOOPBACK4 = (Inet4Address) forString("127.0.0.1");
    private static final Inet4Address ANY4 = (Inet4Address) forString("0.0.0.0");

    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(@CheckForNull Inet4Address server, @CheckForNull Inet4Address client, int port, int flags) {
            Preconditions.checkArgument(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            Preconditions.checkArgument(flags >= 0 && flags <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.server = (Inet4Address) MoreObjects.firstNonNull(server, InetAddresses.ANY4);
            this.client = (Inet4Address) MoreObjects.firstNonNull(client, InetAddresses.ANY4);
            this.port = port;
            this.flags = flags;
        }

        public Inet4Address getClient() {
            return this.client;
        }

        public int getFlags() {
            return this.flags;
        }

        public int getPort() {
            return this.port;
        }

        public Inet4Address getServer() {
            return this.server;
        }
    }

    private InetAddresses() {
    }

    private static InetAddress bytesToInetAddress(byte[] addr) {
        try {
            return InetAddress.getByAddress(addr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static int coerceToInteger(InetAddress ip) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(ip).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] hextets) {
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < hextets.length + 1; i5++) {
            if (i5 >= hextets.length || hextets[i5] != 0) {
                if (i4 >= 0) {
                    int i6 = i5 - i4;
                    if (i6 > i2) {
                        i3 = i4;
                        i2 = i6;
                    }
                    i4 = -1;
                }
            } else if (i4 < 0) {
                i4 = i5;
            }
        }
        if (i2 >= 2) {
            Arrays.fill(hextets, i3, i2 + i3, -1);
        }
    }

    @CheckForNull
    private static String convertDottedQuadToHex(String ipString) {
        int iLastIndexOf = ipString.lastIndexOf(58) + 1;
        String strSubstring = ipString.substring(0, iLastIndexOf);
        byte[] bArrTextToNumericFormatV4 = textToNumericFormatV4(ipString.substring(iLastIndexOf));
        if (bArrTextToNumericFormatV4 == null) {
            return null;
        }
        int i2 = (bArrTextToNumericFormatV4[0] & 255) << 8;
        int i3 = (-1) - (((-1) - bArrTextToNumericFormatV4[1]) | ((-1) - 255));
        return strSubstring + Integer.toHexString((i2 + i3) - (i2 & i3)) + Global.COLON + Integer.toHexString(((-1) - (((-1) - bArrTextToNumericFormatV4[3]) | ((-1) - 255))) | (((-1) - (((-1) - bArrTextToNumericFormatV4[2]) | ((-1) - 255))) << 8));
    }

    public static InetAddress decrement(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return bytesToInetAddress(address2);
    }

    public static InetAddress forString(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes != null) {
            return bytesToInetAddress(bArrIpStringToBytes);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", ipString);
    }

    public static InetAddress forUriString(String hostAddr) {
        InetAddress inetAddressForUriStringNoThrow = forUriStringNoThrow(hostAddr);
        if (inetAddressForUriStringNoThrow != null) {
            return inetAddressForUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", hostAddr);
    }

    @CheckForNull
    private static InetAddress forUriStringNoThrow(String hostAddr) {
        int i2;
        Preconditions.checkNotNull(hostAddr);
        if (hostAddr.startsWith("[") && hostAddr.endsWith("]")) {
            hostAddr = hostAddr.substring(1, hostAddr.length() - 1);
            i2 = 16;
        } else {
            i2 = 4;
        }
        byte[] bArrIpStringToBytes = ipStringToBytes(hostAddr);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != i2) {
            return null;
        }
        return bytesToInetAddress(bArrIpStringToBytes);
    }

    private static IllegalArgumentException formatIllegalArgumentException(String format, Object... args) {
        return new IllegalArgumentException(String.format(Locale.ROOT, format, args));
    }

    private static InetAddress fromBigInteger(BigInteger address, boolean isIpv6) {
        Preconditions.checkArgument(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i2 = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i2];
        int iMax = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - iMax;
        int i3 = i2 - length;
        for (int i4 = 0; i4 < iMax; i4++) {
            if (byteArray[i4] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i2), address);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i3, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger address) {
        return (Inet4Address) fromBigInteger(address, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger address) {
        return (Inet6Address) fromBigInteger(address, true);
    }

    public static Inet4Address fromInteger(int address) {
        return getInet4Address(Ints.toByteArray(address));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] addr) throws UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i2 = 0; i2 < addr.length; i2++) {
            bArr[i2] = addr[(addr.length - i2) - 1];
        }
        return InetAddress.getByAddress(bArr);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(is6to4Address(ip), "Address '%s' is not a 6to4 address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress ip) {
        boolean z2;
        if (ip instanceof Inet4Address) {
            return (Inet4Address) ip;
        }
        byte[] address = ip.getAddress();
        int i2 = 0;
        while (true) {
            if (i2 >= 15) {
                z2 = true;
                break;
            }
            if (address[i2] != 0) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (z2 && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z2 && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) ip;
        int iAsInt = Hashing.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt();
        int i3 = (iAsInt - 536870912) - (iAsInt & (-536870912));
        if (i3 == -1) {
            i3 = -2;
        }
        return getInet4Address(Ints.toByteArray(i3));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(isCompatIPv4Address(ip), "Address '%s' is not IPv4-compatible.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address ip) {
        if (isCompatIPv4Address(ip)) {
            return getCompatIPv4Address(ip);
        }
        if (is6to4Address(ip)) {
            return get6to4IPv4Address(ip);
        }
        if (isTeredoAddress(ip)) {
            return getTeredoInfo(ip).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(ip));
    }

    private static Inet4Address getInet4Address(byte[] bytes) {
        Preconditions.checkArgument(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (Inet4Address) bytesToInetAddress(bytes);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address ip) {
        Preconditions.checkArgument(isIsatapAddress(ip), "Address '%s' is not an ISATAP address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address ip) {
        Preconditions.checkArgument(isTeredoAddress(ip), "Address '%s' is not a Teredo address.", toAddrString(ip));
        byte[] address = ip.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        short s2 = ByteStreams.newDataInput(address, 8).readShort();
        int i2 = (s2 + 65535) - (s2 | 65535);
        int i3 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) (~bArrCopyOfRange[i4]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(bArrCopyOfRange), i3, i2);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address ip) {
        return isCompatIPv4Address(ip) || is6to4Address(ip) || isTeredoAddress(ip);
    }

    private static String hextetsToIPv6String(int[] hextets) {
        StringBuilder sb = new StringBuilder(39);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < hextets.length) {
            boolean z3 = hextets[i2] >= 0;
            if (z3) {
                if (z2) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(hextets[i2]));
            } else if (i2 == 0 || z2) {
                sb.append("::");
            }
            i2++;
            z2 = z3;
        }
        return sb.toString();
    }

    public static InetAddress increment(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return bytesToInetAddress(address2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r5 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r6 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r9 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r9 = r9.substring(0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r6 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r7 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        return null;
     */
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] ipStringToBytes(java.lang.String r9) {
        /*
            r8 = 0
            r7 = r8
            r6 = r7
            r5 = r6
        L4:
            int r0 = r9.length()
            r4 = 0
            r3 = -1
            if (r7 >= r0) goto L22
            char r2 = r9.charAt(r7)
            r0 = 46
            r1 = 1
            if (r2 != r0) goto L19
            r6 = r1
        L16:
            int r7 = r7 + 1
            goto L4
        L19:
            r0 = 58
            if (r2 != r0) goto L24
            if (r6 == 0) goto L20
            return r4
        L20:
            r5 = r1
            goto L16
        L22:
            r7 = r3
            goto L28
        L24:
            r0 = 37
            if (r2 != r0) goto L33
        L28:
            if (r5 == 0) goto L47
            if (r6 == 0) goto L3c
            java.lang.String r9 = convertDottedQuadToHex(r9)
            if (r9 != 0) goto L3c
            return r4
        L33:
            r0 = 16
            int r0 = java.lang.Character.digit(r2, r0)
            if (r0 != r3) goto L16
            return r4
        L3c:
            if (r7 == r3) goto L42
            java.lang.String r9 = r9.substring(r8, r7)
        L42:
            byte[] r0 = textToNumericFormatV6(r9)
            return r0
        L47:
            if (r6 == 0) goto L51
            if (r7 == r3) goto L4c
            return r4
        L4c:
            byte[] r0 = textToNumericFormatV4(r9)
            return r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.ipStringToBytes(java.lang.String):byte[]");
    }

    public static boolean is6to4Address(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address ip) {
        byte b2;
        if (!ip.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b2 = address[15]) == 0 || b2 == 1)) ? false : true;
    }

    public static boolean isInetAddress(String ipString) {
        return ipStringToBytes(ipString) != null;
    }

    public static boolean isIsatapAddress(Inet6Address ip) {
        if (isTeredoAddress(ip)) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != 16) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 10) {
                for (int i3 = 10; i3 < 12; i3++) {
                    if (bArrIpStringToBytes[i3] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrIpStringToBytes[i2] != 0) {
                return false;
            }
            i2++;
        }
    }

    public static boolean isMaximum(InetAddress address) {
        for (byte b2 : address.getAddress()) {
            if (b2 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String ipString) {
        return forUriStringNoThrow(ipString) != null;
    }

    private static short parseHextet(String ipString, int start, int end) {
        int i2 = end - start;
        if (i2 <= 0 || i2 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (start < end) {
            iDigit = (iDigit << 4) | Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) iDigit;
    }

    private static byte parseOctet(String ipString, int start, int end) {
        int i2 = end - start;
        if (i2 <= 0 || i2 > 3) {
            throw new NumberFormatException();
        }
        if (i2 > 1 && ipString.charAt(start) == '0') {
            throw new NumberFormatException();
        }
        int i3 = 0;
        while (start < end) {
            int i4 = i3 * 10;
            int iDigit = Character.digit(ipString.charAt(start), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i3 = i4 + iDigit;
            start++;
        }
        if (i3 <= 255) {
            return (byte) i3;
        }
        throw new NumberFormatException();
    }

    @CheckForNull
    private static byte[] textToNumericFormatV4(String ipString) {
        if (IPV4_DELIMITER_MATCHER.countIn(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int iIndexOf = ipString.indexOf(46, i2);
            if (iIndexOf == -1) {
                iIndexOf = ipString.length();
            }
            try {
                bArr[i3] = parseOctet(ipString, i2, iIndexOf);
                i2 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @CheckForNull
    private static byte[] textToNumericFormatV6(String ipString) {
        int iIndexOf;
        int iCountIn = IPV6_DELIMITER_MATCHER.countIn(ipString);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i2 = iCountIn + 1;
            int i3 = 8 - i2;
            boolean z2 = false;
            for (int i4 = 0; i4 < ipString.length() - 1; i4++) {
                if (ipString.charAt(i4) == ':' && ipString.charAt(i4 + 1) == ':') {
                    if (z2) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == ipString.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z2 = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
                return null;
            }
            if (z2 && i3 <= 0) {
                return null;
            }
            if (!z2 && i2 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                for (int i6 = ipString.charAt(0) != ':' ? 0 : 1; i6 < ipString.length(); i6 = iIndexOf + 1) {
                    iIndexOf = ipString.indexOf(58, i6);
                    if (iIndexOf == -1) {
                        iIndexOf = ipString.length();
                    }
                    if (ipString.charAt(i6) == ':') {
                        for (int i7 = 0; i7 < i3; i7++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(parseHextet(ipString, i6, iIndexOf));
                    }
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress ip) {
        Preconditions.checkNotNull(ip);
        if (ip instanceof Inet4Address) {
            return ip.getHostAddress();
        }
        Preconditions.checkArgument(ip instanceof Inet6Address);
        byte[] address = ip.getAddress();
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 2;
            iArr[i2] = Ints.fromBytes((byte) 0, (byte) 0, address[i3], address[i3 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    public static BigInteger toBigInteger(InetAddress address) {
        return new BigInteger(1, address.getAddress());
    }

    public static String toUriString(InetAddress ip) {
        return ip instanceof Inet6Address ? "[" + toAddrString(ip) + "]" : toAddrString(ip);
    }
}
