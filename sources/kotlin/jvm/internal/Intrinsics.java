package kotlin.jvm.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public class Intrinsics {

    public static class Kotlin {
        private Kotlin() {
        }
    }

    private Intrinsics() {
    }

    public static boolean areEqual(double d2, Double d3) {
        return d3 != null && d2 == d3.doubleValue();
    }

    public static boolean areEqual(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean areEqual(Double d2, double d3) {
        return d2 != null && d2.doubleValue() == d3;
    }

    public static boolean areEqual(Double d2, Double d3) {
        if (d2 == null) {
            if (d3 == null) {
                return true;
            }
        } else if (d3 != null && d2.doubleValue() == d3.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean areEqual(Float f2, Float f3) {
        if (f2 == null) {
            if (f3 == null) {
                return true;
            }
        } else if (f3 != null && f2.floatValue() == f3.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
        }
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e2)));
        }
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e2)));
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str + " must not be null")));
        }
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
        }
    }

    public static int compare(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int compare(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    private static String createParameterIsNullExceptionMessage(String str) throws Throwable {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i2 = 0;
        while (true) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            short sXd = (short) (C1633zX.Xd() ^ (-18350));
            int[] iArr = new int["\r\u0005\u001b\u0007T\u0014\n\u0018\u0012Y\u007f\"\u0010\u0013\u001c\u0006%\u0015\u0018\u001b{$\u001e' *1".length()];
            QB qb = new QB("\r\u0005\u001b\u0007T\u0014\n\u0018\u0012Y\u007f\"\u0010\u0013\u001c\u0006%\u0015\u0018\u001b{$\u001e' *1");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Xg.qd(":9I\u0019C9LM)=JC", (short) (OY.Xd() ^ 10545), (short) (OY.Xd() ^ 19242)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((String) method.invoke(stackTraceElement, objArr)).equals(name)) {
                    break;
                }
                i2++;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        while (true) {
            StackTraceElement stackTraceElement2 = stackTrace[i2];
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("!i<hrs&t+\u0004'I48>(D\u0005\u0005\te\u000f\u0006\u0010\u0005\u007f$", (short) (C1607wl.Xd() ^ 7164), (short) (C1607wl.Xd() ^ 13525))).getMethod(ZO.xd("\u0012k\fU\u0007\u001d~+)/'\"", (short) (FB.Xd() ^ 12506), (short) (FB.Xd() ^ 5018)), new Class[0]);
            try {
                method2.setAccessible(true);
                if (!((String) method2.invoke(stackTraceElement2, objArr2)).equals(name)) {
                    break;
                }
                i2++;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        StackTraceElement stackTraceElement3 = stackTrace[i2];
        Object[] objArr3 = new Object[0];
        Method method3 = Class.forName(C1626yg.Ud("3akZ\u00024[\u0019Li2{`[\f.\f$7h/<c'Y~]", (short) (FB.Xd() ^ 1716), (short) (FB.Xd() ^ 18681))).getMethod(Ig.wd("\u0004V5i\b(d\n\"+;\u000f", (short) (FB.Xd() ^ 29036)), new Class[0]);
        try {
            method3.setAccessible(true);
            String str2 = (String) method3.invoke(stackTraceElement3, objArr3);
            Class<?> cls = Class.forName(EO.Od("_\u001dBRxd;:\u0012;\\]\u0015\u0017xF1\u0014`x\u0017\u0019y\b^!\b", (short) (FB.Xd() ^ 31663)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr4 = new Object[0];
            short sXd2 = (short) (Od.Xd() ^ (-8273));
            int[] iArr2 = new int[".+9\u0011(6)/#\f\u001e) ".length()];
            QB qb2 = new QB(".+9\u0011(6)/#\f\u001e) ");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            Method method4 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method4.setAccessible(true);
                return C1593ug.zd("k}\u0010\u007f\r\u0006\u0016\b\u0016D\u0019\u0017\r\f\u0013\u0011\u0015\u0012\u0012N\u0011$Q!##b%-%&Z%0]-5-.|c2+;08.j", (short) (ZN.Xd() ^ 25800), (short) (ZN.Xd() ^ 15702)) + str2 + C1561oA.od("$", (short) (ZN.Xd() ^ 23630)) + ((String) method4.invoke(stackTraceElement3, objArr4)) + C1561oA.Kd("sh:,>.;4D6Dr", (short) (FB.Xd() ^ 23236)) + str;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i2, String str) {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i2, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t2) {
        return (T) sanitizeStackTrace(t2, Intrinsics.class.getName());
    }

    static <T extends Throwable> T sanitizeStackTrace(T t2, String str) throws Throwable {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            Class<?> cls = Class.forName(Wg.Zd("#wh/YsD-s\u0016\u0017\u0016^< fP\u001bzX\u0014\u0017mQ\u0015{]", (short) (Od.Xd() ^ (-21614)), (short) (Od.Xd() ^ (-17836))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 25304);
            int[] iArr = new int["IHX(RH[\\8LYR".length()];
            QB qb = new QB("IHX(RH[\\8LYR");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                if (str.equals((String) method.invoke(stackTraceElement, objArr))) {
                    i2 = i3;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        t2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t2;
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwJavaNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

    public static void throwNpe() {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException()));
    }

    public static void throwNpe(String str) {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException(str)));
    }

    private static void throwParameterIsNullIAE(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void throwUninitializedProperty(String str) {
        throw ((UninitializedPropertyAccessException) sanitizeStackTrace(new UninitializedPropertyAccessException(str)));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }
}
