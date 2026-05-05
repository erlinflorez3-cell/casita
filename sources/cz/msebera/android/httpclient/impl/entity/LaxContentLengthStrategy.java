package cz.msebera.android.httpclient.impl.entity;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HeaderElement;
import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpMessage;
import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.ProtocolException;
import cz.msebera.android.httpclient.entity.ContentLengthStrategy;
import cz.msebera.android.httpclient.protocol.HTTP;
import cz.msebera.android.httpclient.util.Args;

/* JADX INFO: loaded from: classes5.dex */
public class LaxContentLengthStrategy implements ContentLengthStrategy {
    public static final LaxContentLengthStrategy INSTANCE = new LaxContentLengthStrategy();
    private final int implicitLen;

    public LaxContentLengthStrategy() {
        this(-1);
    }

    public LaxContentLengthStrategy(int i2) {
        this.implicitLen = i2;
    }

    @Override // cz.msebera.android.httpclient.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        long j2;
        Args.notNull(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            try {
                HeaderElement[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(firstHeader.getValue()) && length > 0 && HTTP.CHUNK_CODING.equalsIgnoreCase(elements[length + (-1)].getName())) ? -2L : -1L;
            } catch (ParseException e2) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e2);
            }
        }
        if (httpMessage.getFirstHeader("Content-Length") == null) {
            return this.implicitLen;
        }
        Header[] headers = httpMessage.getHeaders("Content-Length");
        int length2 = headers.length - 1;
        while (true) {
            if (length2 < 0) {
                j2 = -1;
                break;
            }
            try {
                j2 = Long.parseLong(headers[length2].getValue());
                break;
            } catch (NumberFormatException unused) {
                length2--;
            }
        }
        if (j2 >= 0) {
            return j2;
        }
        return -1L;
    }
}
