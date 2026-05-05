package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class XamarinStacktraceProcessor implements StacktraceProcessor {
    private static final String EXCEPTION_MSG_DELIMITER = " ---> ";
    private static final String XAMARIN_AT = "  at ";
    private final String exception;
    private final int maxLength;
    private final int maxLines;
    private final int maxReasonLength;
    private final int maxStacktraceSize;

    public XamarinStacktraceProcessor(String str, int i2) {
        this(str, i2, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 1000, 250);
    }

    XamarinStacktraceProcessor(String str, int i2, int i3, int i4, int i5) {
        this.exception = str;
        this.maxLines = i2;
        this.maxStacktraceSize = i3;
        this.maxReasonLength = i4;
        this.maxLength = i5;
    }

    public static String convertToXamarinOrNull(Throwable th) {
        while (th != null) {
            String message = th.getMessage();
            if (message != null && isXamarin(message)) {
                return message;
            }
            th = th.getCause();
        }
        return null;
    }

    private String generateReason(String[] strArr, int i2) {
        StringBuilder sb = new StringBuilder();
        int iIndexOf = strArr[0].indexOf(EXCEPTION_MSG_DELIMITER);
        if (iIndexOf < 0) {
            sb.append(strArr[0]);
            int i3 = 1;
            while (true) {
                if (i3 < strArr.length && !strArr[i3].startsWith(XAMARIN_AT) && sb.length() < i2) {
                    sb.append("\n");
                    int iIndexOf2 = strArr[i3].indexOf(EXCEPTION_MSG_DELIMITER);
                    if (iIndexOf2 >= 0) {
                        sb.append(strArr[i3].substring(0, iIndexOf2));
                        break;
                    }
                    sb.append(strArr[i3]);
                    i3++;
                } else {
                    break;
                }
            }
        } else {
            sb.append(strArr[0].substring(0, iIndexOf));
        }
        return sb.length() > i2 ? sb.substring(0, i2) : sb.toString();
    }

    private String generateStackTrace(String[] strArr) {
        if (strArr.length <= this.maxLines && this.exception.length() <= this.maxStacktraceSize) {
            return this.exception;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int length = 0;
        while (i2 < Math.min(strArr.length, this.maxLines)) {
            int i3 = i2 == 0 ? 0 : 1;
            if (strArr[i2].length() + length + i3 > this.maxStacktraceSize) {
                break;
            }
            if (i3 > 0) {
                sb.append("\n");
            }
            sb.append(strArr[i2]);
            length += strArr[i2].length() + i3;
            i2++;
        }
        return sb.toString();
    }

    private static boolean isXamarin(String str) {
        for (String str2 : str.split("\n")) {
            if (str2.startsWith(XAMARIN_AT)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        String[] strArrSplit = this.exception.split("\n");
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("no lines");
        }
        if (strArrSplit[0].startsWith(XAMARIN_AT)) {
            throw new IllegalArgumentException("no reason message available");
        }
        int iIndexOf = strArrSplit[0].indexOf(Global.COLON);
        if (iIndexOf >= 0) {
            return new StacktraceData(Utility.truncateString(strArrSplit[0].substring(0, iIndexOf), this.maxLength), generateReason(strArrSplit, this.maxReasonLength), generateStackTrace(strArrSplit), PlatformType.XAMARIN);
        }
        throw new IllegalArgumentException("no exception name available");
    }
}
