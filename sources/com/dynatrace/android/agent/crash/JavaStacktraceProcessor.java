package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class JavaStacktraceProcessor implements StacktraceProcessor {
    private static final String AT = "\tat ";
    private final int maxLength;
    private final int maxLines;
    private final int maxReasonLength;
    private final int maxStacktraceLength;
    private final Throwable throwable;

    public JavaStacktraceProcessor(Throwable th, int i2) {
        this(th, i2, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH, 1000, 250);
    }

    JavaStacktraceProcessor(Throwable th, int i2, int i3, int i4, int i5) {
        this.throwable = th;
        this.maxLines = i2;
        this.maxStacktraceLength = i3;
        this.maxReasonLength = i4;
        this.maxLength = i5;
    }

    private String generateStackTrace() {
        int length = "\nCaused by: ".length();
        StringBuilder sb = new StringBuilder();
        Throwable cause = this.throwable;
        int length2 = 0;
        int length3 = 0;
        int i2 = 0;
        while (true) {
            if (cause == null || length2 >= this.maxLines || length3 > this.maxStacktraceLength) {
                break;
            }
            if (length2 > 0) {
                sb.append("\nCaused by: ");
                length3 += length;
            }
            String strTrimStackTraceReason = trimStackTraceReason(cause.toString(), i2, length2 > 0);
            String[] strArrSplit = strTrimStackTraceReason.split("\n");
            if (strArrSplit.length > this.maxLines - length2) {
                int i3 = 0;
                while (length2 < this.maxLines) {
                    if (i3 > 0) {
                        sb.append("\n");
                    }
                    sb.append(strArrSplit[i3]);
                    length3 = sb.length();
                    length2++;
                    i3++;
                }
            } else {
                sb.append(strTrimStackTraceReason);
                length3 = sb.length();
                length2 += strArrSplit.length;
                int length4 = sb.length();
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if (stackTrace != null) {
                    int iMin = Math.min(stackTrace.length, this.maxLines - length2);
                    int i4 = 0;
                    while (true) {
                        i2 = length3;
                        length3 = length4;
                        if (i4 >= iMin || length3 >= this.maxStacktraceLength) {
                            break;
                        }
                        sb.append("\n").append(AT).append(stackTrace[i4]);
                        length4 = sb.length();
                        length2++;
                        i4++;
                    }
                } else {
                    i2 = length3;
                    length3 = length4;
                }
                cause = cause.getCause();
            }
        }
        return length3 > this.maxStacktraceLength ? sb.substring(0, i2).trim() : sb.toString().trim();
    }

    private String trimStackTraceReason(String str, int i2, boolean z2) {
        if (str == null) {
            return "";
        }
        int iMin = Math.min(Math.max(0, (this.maxStacktraceLength - i2) - (z2 ? 12 : 0)), this.maxReasonLength);
        return str.length() > iMin ? str.substring(0, iMin) : str;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        return new StacktraceData(Utility.truncateString(this.throwable.getClass().getName(), this.maxLength), Utility.truncateString(this.throwable.toString(), this.maxReasonLength), generateStackTrace(), PlatformType.JAVA);
    }
}
