package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.RequestLine;
import cz.msebera.android.httpclient.StatusLine;
import cz.msebera.android.httpclient.protocol.HTTP;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class BasicLineParser implements LineParser {

    @Deprecated
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    public static final BasicLineParser INSTANCE = new BasicLineParser();
    protected final ProtocolVersion protocol;

    public BasicLineParser() {
        this(null);
    }

    public BasicLineParser(ProtocolVersion protocolVersion) {
        this.protocol = protocolVersion == null ? HttpVersion.HTTP_1_1 : protocolVersion;
    }

    public static Header parseHeader(String str, LineParser lineParser) throws ParseException {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseHeader(charArrayBuffer);
    }

    public static ProtocolVersion parseProtocolVersion(String str, LineParser lineParser) throws ParseException {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseProtocolVersion(charArrayBuffer, parserCursor);
    }

    public static RequestLine parseRequestLine(String str, LineParser lineParser) throws ParseException {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseRequestLine(charArrayBuffer, parserCursor);
    }

    public static StatusLine parseStatusLine(String str, LineParser lineParser) throws ParseException {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseStatusLine(charArrayBuffer, parserCursor);
    }

    protected ProtocolVersion createProtocolVersion(int i2, int i3) {
        return this.protocol.forVersion(i2, i3);
    }

    protected RequestLine createRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    protected StatusLine createStatusLine(ProtocolVersion protocolVersion, int i2, String str) {
        return new BasicStatusLine(protocolVersion, i2, str);
    }

    @Override // cz.msebera.android.httpclient.message.LineParser
    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (pos < 0) {
            pos = (charArrayBuffer.length() - 4) - length;
        } else if (pos == 0) {
            while (pos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                pos++;
            }
        }
        int i2 = pos + length;
        if (i2 + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z2 = true;
        for (int i3 = 0; z2 && i3 < length; i3++) {
            z2 = charArrayBuffer.charAt(pos + i3) == protocol.charAt(i3);
        }
        if (z2) {
            return charArrayBuffer.charAt(i2) == '/';
        }
        return z2;
    }

    @Override // cz.msebera.android.httpclient.message.LineParser
    public Header parseHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // cz.msebera.android.httpclient.message.LineParser
    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        skipWhitespace(charArrayBuffer, parserCursor);
        int pos2 = parserCursor.getPos();
        int i2 = pos2 + length;
        if (i2 + 4 > upperBound) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        boolean z2 = true;
        for (int i3 = 0; z2 && i3 < length; i3++) {
            z2 = charArrayBuffer.charAt(pos2 + i3) == protocol.charAt(i3);
        }
        if (z2) {
            z2 = charArrayBuffer.charAt(i2) == '/';
        }
        if (!z2) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        int i4 = pos2 + length + 1;
        int iIndexOf = charArrayBuffer.indexOf(46, i4, upperBound);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid protocol version number: " + charArrayBuffer.substring(pos, upperBound));
        }
        try {
            int i5 = Integer.parseInt(charArrayBuffer.substringTrimmed(i4, iIndexOf));
            int i6 = iIndexOf + 1;
            int iIndexOf2 = charArrayBuffer.indexOf(32, i6, upperBound);
            if (iIndexOf2 == -1) {
                iIndexOf2 = upperBound;
            }
            try {
                int i7 = Integer.parseInt(charArrayBuffer.substringTrimmed(i6, iIndexOf2));
                parserCursor.updatePos(iIndexOf2);
                return createProtocolVersion(i5, i7);
            } catch (NumberFormatException unused) {
                throw new ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(pos, upperBound));
            }
        } catch (NumberFormatException unused2) {
            throw new ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    @Override // cz.msebera.android.httpclient.message.LineParser
    public RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        try {
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int iIndexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
            if (iIndexOf < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String strSubstringTrimmed = charArrayBuffer.substringTrimmed(pos2, iIndexOf);
            parserCursor.updatePos(iIndexOf);
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos3 = parserCursor.getPos();
            int iIndexOf2 = charArrayBuffer.indexOf(32, pos3, upperBound);
            if (iIndexOf2 < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String strSubstringTrimmed2 = charArrayBuffer.substringTrimmed(pos3, iIndexOf2);
            parserCursor.updatePos(iIndexOf2);
            ProtocolVersion protocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
            skipWhitespace(charArrayBuffer, parserCursor);
            if (parserCursor.atEnd()) {
                return createRequestLine(strSubstringTrimmed, strSubstringTrimmed2, protocolVersion);
            }
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
    
        r1 = java.lang.Integer.parseInt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0044, code lost:
    
        if (r6 >= r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0047, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        r0 = r9.substringTrimmed(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0052, code lost:
    
        return createStatusLine(r7, r1, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    @Override // cz.msebera.android.httpclient.message.LineParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cz.msebera.android.httpclient.StatusLine parseStatusLine(cz.msebera.android.httpclient.util.CharArrayBuffer r9, cz.msebera.android.httpclient.message.ParserCursor r10) throws cz.msebera.android.httpclient.ParseException {
        /*
            r8 = this;
            java.lang.String r0 = "Char array buffer"
            cz.msebera.android.httpclient.util.Args.notNull(r9, r0)
            java.lang.String r0 = "Parser cursor"
            cz.msebera.android.httpclient.util.Args.notNull(r10, r0)
            int r4 = r10.getPos()
            int r3 = r10.getUpperBound()
            cz.msebera.android.httpclient.ProtocolVersion r7 = r8.parseProtocolVersion(r9, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r8.skipWhitespace(r9, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            int r1 = r10.getPos()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r0 = 32
            int r6 = r9.indexOf(r0, r1, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            if (r6 >= 0) goto L26
            r6 = r3
        L26:
            java.lang.String r5 = r9.substringTrimmed(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r2 = 0
        L2b:
            int r0 = r5.length()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.String r1 = "Status line contains invalid status code: "
            if (r2 >= r0) goto L40
            char r0 = r5.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            if (r0 == 0) goto L6e
            int r2 = r2 + 1
            goto L2b
        L40:
            int r1 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L53 java.lang.IndexOutOfBoundsException -> L89
            if (r6 >= r3) goto L47
            goto L4a
        L47:
            java.lang.String r0 = ""
            goto L4e
        L4a:
            java.lang.String r0 = r9.substringTrimmed(r6, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L89
        L4e:
            cz.msebera.android.httpclient.StatusLine r0 = r8.createStatusLine(r7, r1, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            return r0
        L53:
            cz.msebera.android.httpclient.ParseException r2 = new cz.msebera.android.httpclient.ParseException     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r0.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.String r0 = r9.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r2.<init>(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            throw r2     // Catch: java.lang.IndexOutOfBoundsException -> L89
        L6e:
            cz.msebera.android.httpclient.ParseException r2 = new cz.msebera.android.httpclient.ParseException     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r0.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.String r0 = r9.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L89
            r2.<init>(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L89
            throw r2     // Catch: java.lang.IndexOutOfBoundsException -> L89
        L89:
            cz.msebera.android.httpclient.ParseException r2 = new cz.msebera.android.httpclient.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid status line: "
            r1.<init>(r0)
            java.lang.String r0 = r9.substring(r4, r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.message.BasicLineParser.parseStatusLine(cz.msebera.android.httpclient.util.CharArrayBuffer, cz.msebera.android.httpclient.message.ParserCursor):cz.msebera.android.httpclient.StatusLine");
    }

    protected void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}
