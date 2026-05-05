package com.dynatrace.android.agent.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.dynatrace.android.agent.Global;
import com.google.firebase.FirebaseError;
import io.sentry.protocol.Gpu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class Utility {
    public static final int GLOBAL_CHAR_LIMIT = 250;
    private static final String LOGTAG = Global.LOG_PREFIX + "Utility";
    private static AtomicInteger eventSeqNumber = new AtomicInteger(1);
    private static AtomicLong nextTagId = new AtomicLong(0);

    public static void devLog(String logTag, String logMessage) {
        if (Global.DEBUG) {
            zlogD(logTag, logMessage);
        }
    }

    public static void devLog(String logTag, String logMessage, Throwable e2) {
        if (Global.DEBUG) {
            zlogD(logTag, logMessage, e2);
        }
    }

    public static int getAppTargetSdk(Context context) throws Throwable {
        ApplicationInfo applicationInfo;
        Object obj;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                short sXd = (short) (C1607wl.Xd() ^ 4792);
                short sXd2 = (short) (C1607wl.Xd() ^ 32289);
                int[] iArr = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
                QB qb = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\u0010\r\u001bu\u0006\u0007\u000e\u0003\b\u0005k~\u000b|\u0002~\u000b", (short) (C1580rY.Xd() ^ (-8166)), (short) (C1580rY.Xd() ^ (-18839))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("P\\Q^ZSM\u0016JUSXHPU\u000e\"MKP@RM", (short) (C1633zX.Xd() ^ (-12888)))).getMethod(C1561oA.yd("-*<\u0017#$/$52\u001e07.", (short) (C1580rY.Xd() ^ (-3084))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str = (String) method2.invoke(context, objArr2);
                        PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(0L);
                        Class<?> cls = Class.forName(C1561oA.Yd("\u0018&\u001d,*%!k\"//6(29s75v\u001a,/8/65\u001e3A5<;I", (short) (C1607wl.Xd() ^ 11130)));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(Xg.qd("bZp\\*i_mg/Uwvntn", (short) (C1580rY.Xd() ^ (-7715)), (short) (C1580rY.Xd() ^ (-26820))));
                        clsArr[1] = Class.forName(Jg.Wd("\u001b\u0007*k\u0016\u0004,)\r\u000b9p\u0011\fA\u0019/y\f= qKQ)t0Q2\u00039h%H\u0013u#\u0013>k\u0017\u001c@g6_X]:^VZ2\u000f", (short) (Od.Xd() ^ (-4038)), (short) (Od.Xd() ^ (-20499))));
                        Object[] objArr3 = {str, applicationInfoFlagsOf};
                        short sXd3 = (short) (OY.Xd() ^ FirebaseError.ERROR_WRONG_PASSWORD);
                        short sXd4 = (short) (OY.Xd() ^ 16862);
                        int[] iArr2 = new int["\u0017&\u0018R_G\u000b\u0005_#d~D/V\u0019\u0001\u001f".length()];
                        QB qb2 = new QB("\u0017&\u0018R_G\u000b\u0005_#d~D/V\u0019\u0001\u001f");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                            i3++;
                        }
                        Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            method3.setAccessible(true);
                            applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                Class<?> cls2 = Class.forName(C1626yg.Ud("\"\u0013B~\n-\u0017\u0004C<[VkO-$x8$\u000bS+Z", (short) (FB.Xd() ^ 32137), (short) (FB.Xd() ^ 28502)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr4 = new Object[0];
                short sXd5 = (short) (OY.Xd() ^ 29801);
                int[] iArr3 = new int["c9VN(L<#I\fu(eNt|`".length()];
                QB qb3 = new QB("c9VN(L<#I\fu(eNt|`");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                    i4++;
                }
                Method method4 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method4.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method4.invoke(context, objArr4);
                    Object[] objArr5 = new Object[0];
                    Method method5 = Class.forName(EO.Od("\u0006B\u001c\u0011\u0010NkGO.E/NKOq+o\u0019U\tZ:", (short) (FB.Xd() ^ 2960))).getMethod(C1561oA.Qd("# .\t\u0019\u001a!\u0016\u001b\u0018\u007f\u0012\u001d\u0014", (short) (OY.Xd() ^ 1866)), new Class[0]);
                    try {
                        method5.setAccessible(true);
                        String str2 = (String) method5.invoke(context, objArr5);
                        short sXd6 = (short) (FB.Xd() ^ 25777);
                        short sXd7 = (short) (FB.Xd() ^ 25932);
                        int[] iArr4 = new int["\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j.,m\u0011#&/&-,\u0015*8,32@".length()];
                        QB qb4 = new QB("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j.,m\u0011#&/&-,\u0015*8,32@");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
                            i5++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                        Class<?>[] clsArr3 = new Class[2];
                        short sXd8 = (short) (FB.Xd() ^ 21039);
                        int[] iArr5 = new int["<2F0{9-91v\u001b;8.2*".length()];
                        QB qb5 = new QB("<2F0{9-91v\u001b;8.2*");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(sXd8 + sXd8 + i6 + xuXd5.CK(iKK5));
                            i6++;
                        }
                        clsArr3[0] = Class.forName(new String(iArr5, 0, i6));
                        clsArr3[1] = Integer.TYPE;
                        Object[] objArr6 = {str2, 0};
                        Method method6 = cls3.getMethod(C1561oA.Kd("%$4\u0002230.)(<299\u0015;4>", (short) (C1633zX.Xd() ^ (-27898))), clsArr3);
                        try {
                            method6.setAccessible(true);
                            applicationInfo = (ApplicationInfo) method6.invoke(packageManager2, objArr6);
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
        } catch (Exception unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return 0;
        }
        short sXd9 = (short) (ZN.Xd() ^ 25949);
        short sXd10 = (short) (ZN.Xd() ^ 15162);
        int[] iArr6 = new int["{I\nhPz_\u001bxW_(R]>\u0018U2-\u0001:l1\u001e`1.sC#X>0{".length()];
        QB qb6 = new QB("{I\nhPz_\u001bxW_(R]>\u0018U2-\u0001:l1\u001e`1.sC#X>0{");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK(((i7 * sXd10) ^ sXd9) + xuXd6.CK(iKK6));
            i7++;
        }
        String str3 = new String(iArr6, 0, i7);
        String strXd = C1561oA.Xd("R@RHGW7IQ=M[]T[[", (short) (C1607wl.Xd() ^ 15706));
        try {
            Class<?> cls4 = Class.forName(str3);
            Field field = 1 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(applicationInfo);
        } catch (Throwable th) {
            obj = null;
        }
        return ((Integer) obj).intValue();
    }

    public static String getCPUInfo() throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        int i2;
        Process processStart;
        String[] strArrSplit;
        String str = "";
        Process process = null;
        inputStream = null;
        InputStream inputStream3 = null;
        Process process2 = null;
        try {
            try {
                i2 = 0;
                processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            } catch (IOException unused) {
                inputStream2 = null;
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
            try {
                inputStream3 = processStart.getInputStream();
                byte[] bArr = new byte[1024];
                String str2 = "";
                while (inputStream3.read(bArr) != -1) {
                    str2 = str2 + new String(bArr).trim();
                }
                strArrSplit = str2.split("\n");
            } catch (IOException unused2) {
                inputStream2 = inputStream3;
                process2 = processStart;
                if (process2 != null) {
                    process2.destroy();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream3;
                process = processStart;
                if (process != null) {
                    process.destroy();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
        if (strArrSplit != null && strArrSplit.length >= 1) {
            int length = strArrSplit.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String cpuInfo = parseCpuInfo(strArrSplit[i2]);
                if (cpuInfo != null) {
                    str = cpuInfo;
                    break;
                }
                i2++;
            }
            if (processStart != null) {
                processStart.destroy();
            }
            if (inputStream3 != null) {
                inputStream3.close();
            }
            return str;
        }
        if (processStart != null) {
            processStart.destroy();
        }
        if (inputStream3 != null) {
            try {
                inputStream3.close();
            } catch (IOException unused5) {
            }
        }
        return "";
    }

    public static long getCurrentThreadId() {
        return Build.VERSION.SDK_INT >= 36 ? Thread.currentThread().threadId() : Thread.currentThread().getId();
    }

    public static int getEventSeqNum() {
        return eventSeqNumber.getAndIncrement();
    }

    public static long getNextTagId() {
        return nextTagId.incrementAndGet();
    }

    public static long getThreadId(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    private static String getThreadId() {
        return String.format("#%d.", Long.valueOf(getCurrentThreadId()));
    }

    public static boolean isIsolatedProcess() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        try {
            return ((Boolean) Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Exception e2) {
            if (!Global.DEBUG) {
                return true;
            }
            zlogD(LOGTAG, "Error occurred determining process isolation state", e2);
            return true;
        }
    }

    public static boolean isValidEventName(String eventName, int maxLen) {
        int length;
        return eventName != null && (length = eventName.trim().length()) >= 1 && length <= maxLen;
    }

    private static String parseCpuInfo(String line) {
        String[] strArrSplit;
        String str;
        String str2;
        if (line == null || (strArrSplit = line.split(Global.COLON)) == null || strArrSplit.length <= 1 || (str = strArrSplit[0]) == null) {
            return null;
        }
        if (str.startsWith("Processor")) {
            String str3 = strArrSplit[1];
            if (str3 == null) {
                return null;
            }
            return str3.replaceAll(" Processor ", Global.BLANK).trim();
        }
        if (!strArrSplit[0].startsWith(Gpu.JsonKeys.VENDOR_ID) || (str2 = strArrSplit[1]) == null) {
            return null;
        }
        return str2.trim();
    }

    public static Float parseFloat(String floatName, String floatStr, float lowerLimit, float upperLimit) {
        Float fValueOf;
        if (floatStr == null) {
            return null;
        }
        try {
            fValueOf = Float.valueOf(Float.valueOf(floatStr.trim()).floatValue());
        } catch (NumberFormatException e2) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, floatName, e2);
            }
            fValueOf = null;
        }
        if (fValueOf == null || (fValueOf.floatValue() >= lowerLimit && fValueOf.floatValue() <= upperLimit)) {
            return fValueOf;
        }
        if (!Global.DEBUG) {
            return null;
        }
        zlogD(LOGTAG, String.format("%s value of %s is not within the range of %s and %s", floatName, floatStr, Float.valueOf(lowerLimit), Float.valueOf(upperLimit)));
        return null;
    }

    public static int parseInt(String debugName, String value, int lowerLimit, int upperLimit, int defaultValue) {
        return parseInt(debugName, value, lowerLimit, upperLimit, defaultValue, false);
    }

    public static int parseInt(String debugName, String value, int lowerLimit, int upperLimit, int defaultValue, boolean useDefaultValueForExceededLimit) {
        if (value != null && !value.isEmpty()) {
            try {
                int i2 = Integer.parseInt(value);
                if (i2 < lowerLimit) {
                    if (Global.DEBUG) {
                        zlogD(LOGTAG, String.format("%s value of %s is not within the range of %s and %s", debugName, value, Integer.valueOf(lowerLimit), Integer.valueOf(upperLimit)));
                    }
                    return useDefaultValueForExceededLimit ? defaultValue : lowerLimit;
                }
                if (i2 <= upperLimit) {
                    return i2;
                }
                if (Global.DEBUG) {
                    zlogD(LOGTAG, String.format("%s value of %s is not within the range of %s and %s", debugName, value, Integer.valueOf(lowerLimit), Integer.valueOf(upperLimit)));
                }
                return useDefaultValueForExceededLimit ? defaultValue : upperLimit;
            } catch (NumberFormatException e2) {
                if (Global.DEBUG) {
                    zlogE(LOGTAG, debugName, e2);
                }
            }
        }
        return defaultValue;
    }

    public static int parseInt(Map<String, String> map, String key, int lowerLimit, int upperLimit, int defaultValue) {
        return parseInt(key, map.get(key), lowerLimit, upperLimit, defaultValue);
    }

    public static int parseInt(Map<String, String> map, String key, int lowerLimit, int upperLimit, int defaultValue, boolean useDefaultValueForExceededLimit) {
        return parseInt(key, map.get(key), lowerLimit, upperLimit, defaultValue, useDefaultValueForExceededLimit);
    }

    public static Map<String, String> parseKeyValueString(String keyValueString) {
        HashMap map = new HashMap();
        for (String str : keyValueString.split("&")) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length != 2) {
                return null;
            }
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    public static Long parseLong(String longName, String longStr, long lowerLimit, long upperLimit) {
        if (longStr == null) {
            return null;
        }
        try {
            Long lValueOf = Long.valueOf(longStr.trim());
            if (lValueOf.longValue() >= lowerLimit && lValueOf.longValue() <= upperLimit) {
                return lValueOf;
            }
            if (!Global.DEBUG) {
                return null;
            }
            zlogD(LOGTAG, String.format("%s value of %s is not within the range of %s and %s", longName, longStr, Long.valueOf(lowerLimit), Long.valueOf(upperLimit)));
            return null;
        } catch (NumberFormatException e2) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, longName, e2);
            }
            return null;
        }
    }

    public static byte[] readStream(InputStream is) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = is.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static void resetEventSeqNum() {
        eventSeqNumber.set(1);
    }

    public static String truncateString(String value, int maxLen) {
        if (value == null) {
            return null;
        }
        return value.length() > maxLen ? value.substring(0, maxLen) : value;
    }

    public static String truncateWebRequest(String url) {
        if (url == null) {
            return null;
        }
        int iIndexOf = url.indexOf(Global.QUESTION);
        if (iIndexOf < 0 || 250 < iIndexOf) {
            iIndexOf = 250;
        }
        return url.length() > iIndexOf ? url.substring(0, iIndexOf) : url;
    }

    public static String urlEncode(String data) {
        if (data == null) {
            return null;
        }
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            if (Global.DEBUG) {
                zlogE(LOGTAG, e2.toString());
            }
            return data.replaceAll("&", "%26").replaceAll("=", "%3D");
        }
    }

    public static void zlogD(String logTag, String logMessage) {
        String str = getThreadId() + logMessage;
        int length = (str.length() - 1) / 4000;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 4000;
            i2++;
            str.substring(i3, i2 * 4000);
        }
        str.substring(i2 * 4000);
    }

    public static void zlogD(String logTag, String logMessage, Throwable e2) {
        String str = getThreadId() + logMessage;
    }

    public static void zlogE(String logTag, String logMessage) {
        String str = getThreadId() + logMessage;
    }

    public static void zlogE(String logTag, String logMessage, Throwable e2) {
        String str = getThreadId() + logMessage;
    }

    public static void zlogI(String logTag, String logMessage) {
        String str = getThreadId() + logMessage;
    }

    public static void zlogW(String logTag, String logMessage) {
        String str = getThreadId() + logMessage;
    }
}
