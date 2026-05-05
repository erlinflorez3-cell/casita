package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.HeaderElement;
import cz.msebera.android.httpclient.NameValuePair;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class BasicHeaderValueFormatter implements HeaderValueFormatter {

    @Deprecated
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final BasicHeaderValueFormatter INSTANCE = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public static String formatElements(HeaderElement[] headerElementArr, boolean z2, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatElements(null, headerElementArr, z2).toString();
    }

    public static String formatHeaderElement(HeaderElement headerElement, boolean z2, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatHeaderElement(null, headerElement, z2).toString();
    }

    public static String formatNameValuePair(NameValuePair nameValuePair, boolean z2, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatNameValuePair(null, nameValuePair, z2).toString();
    }

    public static String formatParameters(NameValuePair[] nameValuePairArr, boolean z2, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatParameters(null, nameValuePairArr, z2).toString();
    }

    protected void doFormatValue(CharArrayBuffer charArrayBuffer, String str, boolean z2) {
        if (!z2) {
            for (int i2 = 0; i2 < str.length() && !z2; i2++) {
                z2 = isSeparator(str.charAt(i2));
            }
        }
        if (z2) {
            charArrayBuffer.append('\"');
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (isUnsafe(cCharAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(cCharAt);
        }
        if (z2) {
            charArrayBuffer.append('\"');
        }
    }

    protected int estimateElementsLen(HeaderElement[] headerElementArr) {
        if (headerElementArr == null || headerElementArr.length < 1) {
            return 0;
        }
        int length = (headerElementArr.length - 1) * 2;
        for (HeaderElement headerElement : headerElementArr) {
            length += estimateHeaderElementLen(headerElement);
        }
        return length;
    }

    protected int estimateHeaderElementLen(HeaderElement headerElement) {
        if (headerElement == null) {
            return 0;
        }
        int length = headerElement.getName().length();
        String value = headerElement.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i2 = 0; i2 < parameterCount; i2++) {
                length += estimateNameValuePairLen(headerElement.getParameter(i2)) + 2;
            }
        }
        return length;
    }

    protected int estimateNameValuePairLen(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    protected int estimateParametersLen(NameValuePair[] nameValuePairArr) {
        if (nameValuePairArr == null || nameValuePairArr.length < 1) {
            return 0;
        }
        int length = (nameValuePairArr.length - 1) * 2;
        for (NameValuePair nameValuePair : nameValuePairArr) {
            length += estimateNameValuePairLen(nameValuePair);
        }
        return length;
    }

    @Override // cz.msebera.android.httpclient.message.HeaderValueFormatter
    public CharArrayBuffer formatElements(CharArrayBuffer charArrayBuffer, HeaderElement[] headerElementArr, boolean z2) {
        Args.notNull(headerElementArr, "Header element array");
        int iEstimateElementsLen = estimateElementsLen(headerElementArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateElementsLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateElementsLen);
        }
        for (int i2 = 0; i2 < headerElementArr.length; i2++) {
            if (i2 > 0) {
                charArrayBuffer.append(", ");
            }
            formatHeaderElement(charArrayBuffer, headerElementArr[i2], z2);
        }
        return charArrayBuffer;
    }

    @Override // cz.msebera.android.httpclient.message.HeaderValueFormatter
    public CharArrayBuffer formatHeaderElement(CharArrayBuffer charArrayBuffer, HeaderElement headerElement, boolean z2) {
        Args.notNull(headerElement, "Header element");
        int iEstimateHeaderElementLen = estimateHeaderElementLen(headerElement);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateHeaderElementLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateHeaderElementLen);
        }
        charArrayBuffer.append(headerElement.getName());
        String value = headerElement.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            doFormatValue(charArrayBuffer, value, z2);
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i2 = 0; i2 < parameterCount; i2++) {
                charArrayBuffer.append("; ");
                formatNameValuePair(charArrayBuffer, headerElement.getParameter(i2), z2);
            }
        }
        return charArrayBuffer;
    }

    @Override // cz.msebera.android.httpclient.message.HeaderValueFormatter
    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z2) {
        Args.notNull(nameValuePair, "Name / value pair");
        int iEstimateNameValuePairLen = estimateNameValuePairLen(nameValuePair);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateNameValuePairLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateNameValuePairLen);
        }
        charArrayBuffer.append(nameValuePair.getName());
        String value = nameValuePair.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            doFormatValue(charArrayBuffer, value, z2);
        }
        return charArrayBuffer;
    }

    @Override // cz.msebera.android.httpclient.message.HeaderValueFormatter
    public CharArrayBuffer formatParameters(CharArrayBuffer charArrayBuffer, NameValuePair[] nameValuePairArr, boolean z2) {
        Args.notNull(nameValuePairArr, "Header parameter array");
        int iEstimateParametersLen = estimateParametersLen(nameValuePairArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateParametersLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateParametersLen);
        }
        for (int i2 = 0; i2 < nameValuePairArr.length; i2++) {
            if (i2 > 0) {
                charArrayBuffer.append("; ");
            }
            formatNameValuePair(charArrayBuffer, nameValuePairArr[i2], z2);
        }
        return charArrayBuffer;
    }

    protected boolean isSeparator(char c2) {
        return SEPARATORS.indexOf(c2) >= 0;
    }

    protected boolean isUnsafe(char c2) {
        return UNSAFE_CHARS.indexOf(c2) >= 0;
    }
}
