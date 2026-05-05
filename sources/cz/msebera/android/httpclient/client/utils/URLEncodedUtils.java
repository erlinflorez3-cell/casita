package cz.msebera.android.httpclient.client.utils;

import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.Consts;
import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HeaderElement;
import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.NameValuePair;
import cz.msebera.android.httpclient.entity.ContentType;
import cz.msebera.android.httpclient.message.BasicNameValuePair;
import cz.msebera.android.httpclient.message.ParserCursor;
import cz.msebera.android.httpclient.protocol.HTTP;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* JADX INFO: loaded from: classes5.dex */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final BitSet PATHSAFE;
    private static final char PATH_SEPARATOR = '/';
    private static final BitSet PATH_SEPARATORS;
    private static final BitSet PATH_SPECIAL;
    private static final BitSet PUNCT;
    private static final char QP_SEP_A = '&';
    private static final char QP_SEP_S = ';';
    private static final int RADIX = 16;
    private static final BitSet RESERVED;
    private static final BitSet UNRESERVED;
    private static final BitSet URIC;
    private static final BitSet URLENCODER;
    private static final BitSet USERINFO;

    static {
        BitSet bitSet = new BitSet(256);
        PATH_SEPARATORS = bitSet;
        bitSet.set(47);
        UNRESERVED = new BitSet(256);
        PUNCT = new BitSet(256);
        USERINFO = new BitSet(256);
        PATHSAFE = new BitSet(256);
        URIC = new BitSet(256);
        RESERVED = new BitSet(256);
        URLENCODER = new BitSet(256);
        PATH_SPECIAL = new BitSet(256);
        for (int i2 = 97; i2 <= 122; i2++) {
            UNRESERVED.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            UNRESERVED.set(i3);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            UNRESERVED.set(i4);
        }
        BitSet bitSet2 = UNRESERVED;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        URLENCODER.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(126);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        BitSet bitSet3 = PUNCT;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = USERINFO;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = PATHSAFE;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = PATH_SPECIAL;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = RESERVED;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        BitSet bitSet8 = URIC;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    private static List<NameValuePair> createEmptyList() {
        return new ArrayList(0);
    }

    private static String decodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlDecode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, true);
    }

    private static String decodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlDecode(str, charset, true);
    }

    static String encPath(String str, Charset charset) {
        return urlEncode(str, charset, PATH_SPECIAL, false);
    }

    static String encUric(String str, Charset charset) {
        return urlEncode(str, charset, URIC, false);
    }

    static String encUserInfo(String str, Charset charset) {
        return urlEncode(str, charset, USERINFO, false);
    }

    private static String encodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlEncode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, URLENCODER, true);
    }

    private static String encodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlEncode(str, charset, URLENCODER, true);
    }

    public static String format(Iterable<? extends NameValuePair> iterable, char c2, Charset charset) {
        Args.notNull(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String strEncodeFormFields = encodeFormFields(nameValuePair.getName(), charset);
            String strEncodeFormFields2 = encodeFormFields(nameValuePair.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c2);
            }
            sb.append(strEncodeFormFields);
            if (strEncodeFormFields2 != null) {
                sb.append("=");
                sb.append(strEncodeFormFields2);
            }
        }
        return sb.toString();
    }

    public static String format(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return format(iterable, '&', charset);
    }

    public static String format(List<? extends NameValuePair> list, char c2, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String strEncodeFormFields = encodeFormFields(nameValuePair.getName(), str);
            String strEncodeFormFields2 = encodeFormFields(nameValuePair.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c2);
            }
            sb.append(strEncodeFormFields);
            if (strEncodeFormFields2 != null) {
                sb.append("=");
                sb.append(strEncodeFormFields2);
            }
        }
        return sb.toString();
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        return format(list, '&', str);
    }

    public static String formatSegments(Iterable<String> iterable, Charset charset) {
        Args.notNull(iterable, "Segments");
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(PATH_SEPARATOR).append(urlEncode(it.next(), charset, PATHSAFE, false));
        }
        return sb.toString();
    }

    public static String formatSegments(String... strArr) {
        return formatSegments(Arrays.asList(strArr), Consts.UTF_8);
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "HTTP entity");
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length > 0) {
                return elements[0].getName().equalsIgnoreCase(CONTENT_TYPE);
            }
        }
        return false;
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) throws IOException {
        Args.notNull(httpEntity, "HTTP entity");
        ContentType contentType = ContentType.get(httpEntity);
        if (contentType == null || !contentType.getMimeType().equalsIgnoreCase(CONTENT_TYPE)) {
            return createEmptyList();
        }
        long contentLength = httpEntity.getContentLength();
        Args.check(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset charset = contentType.getCharset() != null ? contentType.getCharset() : HTTP.DEF_CONTENT_CHARSET;
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return createEmptyList();
        }
        try {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
            char[] cArr = new char[1024];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    break;
                }
                charArrayBuffer.append(cArr, 0, i2);
            }
            content.close();
            return charArrayBuffer.isEmpty() ? createEmptyList() : parse(charArrayBuffer, charset, '&');
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<cz.msebera.android.httpclient.NameValuePair> parse(cz.msebera.android.httpclient.util.CharArrayBuffer r9, java.nio.charset.Charset r10, char... r11) {
        /*
            java.lang.String r0 = "Char array buffer"
            cz.msebera.android.httpclient.util.Args.notNull(r9, r0)
            cz.msebera.android.httpclient.message.TokenParser r6 = cz.msebera.android.httpclient.message.TokenParser.INSTANCE
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            int r3 = r11.length
            r2 = 0
            r1 = r2
        Lf:
            if (r1 >= r3) goto L19
            char r0 = r11[r1]
            r5.set(r0)
            int r1 = r1 + 1
            goto Lf
        L19:
            cz.msebera.android.httpclient.message.ParserCursor r7 = new cz.msebera.android.httpclient.message.ParserCursor
            int r0 = r9.length()
            r7.<init>(r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L27:
            boolean r0 = r7.atEnd()
            if (r0 != 0) goto L7e
            r2 = 61
            r5.set(r2)
            java.lang.String r8 = r6.parseToken(r9, r7, r5)
            boolean r0 = r7.atEnd()
            if (r0 != 0) goto L7c
            int r0 = r7.getPos()
            char r1 = r9.charAt(r0)
            int r0 = r7.getPos()
            int r0 = r0 + 1
            r7.updatePos(r0)
            if (r1 != r2) goto L7c
            r5.clear(r2)
            java.lang.String r3 = r6.parseToken(r9, r7, r5)
            boolean r0 = r7.atEnd()
            if (r0 != 0) goto L65
            int r0 = r7.getPos()
            int r0 = r0 + 1
            r7.updatePos(r0)
        L65:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L27
            cz.msebera.android.httpclient.message.BasicNameValuePair r2 = new cz.msebera.android.httpclient.message.BasicNameValuePair
            java.lang.String r1 = decodeFormFields(r8, r10)
            java.lang.String r0 = decodeFormFields(r3, r10)
            r2.<init>(r1, r0)
            r4.add(r2)
            goto L27
        L7c:
            r3 = 0
            goto L65
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.client.utils.URLEncodedUtils.parse(cz.msebera.android.httpclient.util.CharArrayBuffer, java.nio.charset.Charset, char[]):java.util.List");
    }

    public static List<NameValuePair> parse(String str, Charset charset) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, '&', QP_SEP_S);
    }

    public static List<NameValuePair> parse(String str, Charset charset, char... cArr) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, cArr);
    }

    @Deprecated
    public static List<NameValuePair> parse(URI uri, String str) {
        return parse(uri, str != null ? Charset.forName(str) : null);
    }

    public static List<NameValuePair> parse(URI uri, Charset charset) {
        Args.notNull(uri, "URI");
        String rawQuery = uri.getRawQuery();
        return (rawQuery == null || rawQuery.isEmpty()) ? createEmptyList() : parse(rawQuery, charset);
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        parse(list, scanner, "[&;]", str);
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        String strDecodeFormFields;
        String strDecodeFormFields2;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String next = scanner.next();
            int iIndexOf = next.indexOf("=");
            if (iIndexOf != -1) {
                strDecodeFormFields = decodeFormFields(next.substring(0, iIndexOf).trim(), str2);
                strDecodeFormFields2 = decodeFormFields(next.substring(iIndexOf + 1).trim(), str2);
            } else {
                strDecodeFormFields = decodeFormFields(next.trim(), str2);
                strDecodeFormFields2 = null;
            }
            list.add(new BasicNameValuePair(strDecodeFormFields, strDecodeFormFields2));
        }
    }

    public static List<String> parsePathSegments(CharSequence charSequence) {
        return parsePathSegments(charSequence, Consts.UTF_8);
    }

    public static List<String> parsePathSegments(CharSequence charSequence, Charset charset) {
        Args.notNull(charSequence, "Char sequence");
        List<String> listSplitPathSegments = splitPathSegments(charSequence);
        for (int i2 = 0; i2 < listSplitPathSegments.size(); i2++) {
            listSplitPathSegments.set(i2, urlDecode(listSplitPathSegments.get(i2), charset != null ? charset : Consts.UTF_8, false));
        }
        return listSplitPathSegments;
    }

    static List<String> splitPathSegments(CharSequence charSequence) {
        return splitSegments(charSequence, PATH_SEPARATORS);
    }

    static List<String> splitSegments(CharSequence charSequence, BitSet bitSet) {
        ParserCursor parserCursor = new ParserCursor(0, charSequence.length());
        if (parserCursor.atEnd()) {
            return Collections.emptyList();
        }
        if (bitSet.get(charSequence.charAt(parserCursor.getPos()))) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (!parserCursor.atEnd()) {
            char cCharAt = charSequence.charAt(parserCursor.getPos());
            if (bitSet.get(cCharAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(cCharAt);
            }
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    private static String urlDecode(String str, Charset charset, boolean z2) {
        if (str == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c2 = charBufferWrap.get();
            if (c2 == '%' && charBufferWrap.remaining() >= 2) {
                char c3 = charBufferWrap.get();
                char c4 = charBufferWrap.get();
                int iDigit = Character.digit(c3, 16);
                int iDigit2 = Character.digit(c4, 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    byteBufferAllocate.put((byte) 37);
                    byteBufferAllocate.put((byte) c3);
                    byteBufferAllocate.put((byte) c4);
                } else {
                    byteBufferAllocate.put((byte) ((iDigit << 4) + iDigit2));
                }
            } else if (z2 && c2 == '+') {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put((byte) c2);
            }
        }
        byteBufferAllocate.flip();
        return charset.decode(byteBufferAllocate).toString();
    }

    private static String urlEncode(String str, Charset charset, BitSet bitSet, boolean z2) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b2 = byteBufferEncode.get();
            int i2 = (-1) - (((-1) - b2) | ((-1) - 255));
            if (bitSet.get(i2)) {
                sb.append((char) i2);
            } else if (z2 && i2 == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i2 >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b2 & Ascii.SI, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }
}
