package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.HeaderIterator;
import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.TokenIterator;
import cz.msebera.android.httpclient.util.Args;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    protected String createToken(String str, int i2, int i3) {
        return str.substring(i2, i3);
    }

    protected int findNext(int i2) throws ParseException {
        int iFindTokenSeparator;
        if (i2 >= 0) {
            iFindTokenSeparator = findTokenSeparator(i2);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            iFindTokenSeparator = 0;
        }
        int iFindTokenStart = findTokenStart(iFindTokenSeparator);
        if (iFindTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int iFindTokenEnd = findTokenEnd(iFindTokenStart);
        this.currentToken = createToken(this.currentHeader, iFindTokenStart, iFindTokenEnd);
        return iFindTokenEnd;
    }

    protected int findTokenEnd(int i2) {
        Args.notNegative(i2, "Search position");
        int length = this.currentHeader.length();
        do {
            i2++;
            if (i2 >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i2)));
        return i2;
    }

    protected int findTokenSeparator(int i2) {
        int iNotNegative = Args.notNegative(i2, "Search position");
        int length = this.currentHeader.length();
        boolean z2 = false;
        while (!z2 && iNotNegative < length) {
            char cCharAt = this.currentHeader.charAt(iNotNegative);
            if (isTokenSeparator(cCharAt)) {
                z2 = true;
            } else {
                if (!isWhitespace(cCharAt)) {
                    if (isTokenChar(cCharAt)) {
                        throw new ParseException("Tokens without separator (pos " + iNotNegative + "): " + this.currentHeader);
                    }
                    throw new ParseException("Invalid character after token (pos " + iNotNegative + "): " + this.currentHeader);
                }
                iNotNegative++;
            }
        }
        return iNotNegative;
    }

    protected int findTokenStart(int i2) {
        int iNotNegative = Args.notNegative(i2, "Search position");
        boolean z2 = false;
        while (!z2) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z2 && iNotNegative < length) {
                char cCharAt = this.currentHeader.charAt(iNotNegative);
                if (isTokenSeparator(cCharAt) || isWhitespace(cCharAt)) {
                    iNotNegative++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(iNotNegative))) {
                        throw new ParseException("Invalid character before token (pos " + iNotNegative + "): " + this.currentHeader);
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    iNotNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z2) {
            return iNotNegative;
        }
        return -1;
    }

    @Override // cz.msebera.android.httpclient.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    protected boolean isHttpSeparator(char c2) {
        return HTTP_SEPARATORS.indexOf(c2) >= 0;
    }

    protected boolean isTokenChar(char c2) {
        if (Character.isLetterOrDigit(c2)) {
            return true;
        }
        return (Character.isISOControl(c2) || isHttpSeparator(c2)) ? false : true;
    }

    protected boolean isTokenSeparator(char c2) {
        return c2 == ',';
    }

    protected boolean isWhitespace(char c2) {
        return c2 == '\t' || Character.isSpaceChar(c2);
    }

    @Override // java.util.Iterator
    public final Object next() throws ParseException, NoSuchElementException {
        return nextToken();
    }

    @Override // cz.msebera.android.httpclient.TokenIterator
    public String nextToken() throws ParseException, NoSuchElementException {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
