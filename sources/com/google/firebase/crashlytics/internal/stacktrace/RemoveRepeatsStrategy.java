package com.google.firebase.crashlytics.internal.stacktrace;

import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;

/* JADX INFO: loaded from: classes7.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    public RemoveRepeatsStrategy(int i2) {
        this.maxRepetitions = i2;
    }

    private static boolean isRepeatingSequence(StackTraceElement[] stackTraceElementArr, int i2, int i3) throws Throwable {
        int i4 = i3 - i2;
        if (i3 + i4 > stackTraceElementArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2 + i5];
            Object[] objArr = {stackTraceElementArr[i3 + i5]};
            Method method = Class.forName(C1561oA.ud("D:N8\u0004A5A9~#C/07\u001f<*+,\u000b1)0'/4", (short) (C1499aX.Xd() ^ (-11652)))).getMethod(C1561oA.Yd("\r\u001a\u001f\f\u0018 ", (short) (C1633zX.Xd() ^ (-10566))), Class.forName(C1561oA.yd("'\u001f5!f&\u001c*\u001cc\u0006\u001a\u001b\u0017\u0016(", (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_SHARPNESS))));
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(stackTraceElement, objArr)).booleanValue()) {
                    return false;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return true;
    }

    private static StackTraceElement[] trimRepeats(StackTraceElement[] stackTraceElementArr, int i2) {
        int i3;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i4 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i4];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !isRepeatingSequence(stackTraceElementArr, num.intValue(), i4)) {
                stackTraceElementArr2[i5] = stackTraceElementArr[i4];
                i5++;
                i6 = 1;
                i3 = i4;
            } else {
                int iIntValue = i4 - num.intValue();
                if (i6 < i2) {
                    System.arraycopy(stackTraceElementArr, i4, stackTraceElementArr2, i5, iIntValue);
                    i5 += iIntValue;
                    i6++;
                }
                i3 = (iIntValue - 1) + i4;
            }
            map.put(stackTraceElement, Integer.valueOf(i4));
            i4 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i5];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i5);
        return stackTraceElementArr3;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrTrimRepeats = trimRepeats(stackTraceElementArr, this.maxRepetitions);
        return stackTraceElementArrTrimRepeats.length < stackTraceElementArr.length ? stackTraceElementArrTrimRepeats : stackTraceElementArr;
    }
}
