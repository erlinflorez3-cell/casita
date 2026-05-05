package com.google.common.net;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String host, int port, boolean hasBracketlessColons) {
        this.host = host;
        this.port = port;
        this.hasBracketlessColons = hasBracketlessColons;
    }

    public static HostAndPort fromHost(String host) {
        HostAndPort hostAndPortFromString = fromString(host);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", host);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String host, int port) {
        Preconditions.checkArgument(isValidPort(port), "Port out of range: %s", port);
        HostAndPort hostAndPortFromString = fromString(host);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", host);
        return new HostAndPort(hostAndPortFromString.host, port, hostAndPortFromString.hasBracketlessColons);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r7) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.lang.String r0 = "["
            boolean r0 = r7.startsWith(r0)
            r6 = -1
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L37
            java.lang.String[] r0 = getHostAndPortFromBracketedHost(r7)
            r3 = r0[r4]
            r2 = r0[r5]
        L16:
            r0 = r4
        L17:
            boolean r1 = com.google.common.base.Strings.isNullOrEmpty(r2)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "+"
            boolean r1 = r2.startsWith(r1)
            if (r1 != 0) goto L35
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.ascii()
            boolean r1 = r1.matchesAllOf(r2)
            if (r1 == 0) goto L35
        L2f:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r1, r7)
            goto L58
        L35:
            r5 = r4
            goto L2f
        L37:
            r0 = 58
            int r2 = r7.indexOf(r0)
            if (r2 < 0) goto L50
            int r1 = r2 + 1
            int r0 = r7.indexOf(r0, r1)
            if (r0 != r6) goto L50
            java.lang.String r3 = r7.substring(r4, r2)
            java.lang.String r2 = r7.substring(r1)
            goto L16
        L50:
            if (r2 < 0) goto L56
            r0 = r5
        L53:
            r2 = 0
            r3 = r7
            goto L17
        L56:
            r0 = r4
            goto L53
        L58:
            int r6 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L5d
            goto L72
        L5d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unparseable port number: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r7)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L72:
            boolean r2 = isValidPort(r6)
            java.lang.String r1 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r7)
        L7b:
            com.google.common.net.HostAndPort r1 = new com.google.common.net.HostAndPort
            r1.<init>(r3, r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    private static String[] getHostAndPortFromBracketedHost(String hostPortString) {
        Preconditions.checkArgument(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int iIndexOf = hostPortString.indexOf(58);
        int iLastIndexOf = hostPortString.lastIndexOf(93);
        Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", hostPortString);
        String strSubstring = hostPortString.substring(1, iLastIndexOf);
        int i2 = iLastIndexOf + 1;
        if (i2 == hostPortString.length()) {
            return new String[]{strSubstring, ""};
        }
        Preconditions.checkArgument(hostPortString.charAt(i2) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i3 = iLastIndexOf + 2;
        for (int i4 = i3; i4 < hostPortString.length(); i4++) {
            Preconditions.checkArgument(Character.isDigit(hostPortString.charAt(i4)), "Port must be numeric: %s", hostPortString);
        }
        return new String[]{strSubstring, hostPortString.substring(i3)};
    }

    private static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    public boolean equals(@CheckForNull Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) other;
        return Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int defaultPort) {
        return hasPort() ? this.port : defaultPort;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.host, Integer.valueOf(this.port));
    }

    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.host).append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(AbstractJsonLexerKt.COLON).append(this.port);
        }
        return sb.toString();
    }

    public HostAndPort withDefaultPort(int defaultPort) {
        Preconditions.checkArgument(isValidPort(defaultPort));
        return hasPort() ? this : new HostAndPort(this.host, defaultPort, this.hasBracketlessColons);
    }
}
