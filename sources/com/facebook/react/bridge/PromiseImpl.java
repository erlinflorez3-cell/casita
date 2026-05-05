package com.facebook.react.bridge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class PromiseImpl implements Promise {
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
    private static final String ERROR_MAP_KEY_CODE = "code";
    private static final String ERROR_MAP_KEY_MESSAGE = "message";
    private static final String ERROR_MAP_KEY_NAME = "name";
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;
    private static final String STACK_FRAME_KEY_CLASS = "class";
    private static final String STACK_FRAME_KEY_FILE = "file";
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    private Callback mReject;
    private Callback mResolve;

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    @Deprecated
    public void reject(String str) throws Throwable {
        reject(null, str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, WritableMap writableMap) throws Throwable {
        reject(str, null, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) throws Throwable {
        reject(str, str2, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, WritableMap writableMap) throws Throwable {
        reject(str, str2, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th) throws Throwable {
        reject(str, str2, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th, WritableMap writableMap) throws Throwable {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String strYd = C1561oA.yd("VaYY", (short) (C1607wl.Xd() ^ 10067));
        if (str == null) {
            short sXd = (short) (C1633zX.Xd() ^ (-30953));
            int[] iArr = new int["\b\u0019\u0013\u0019\u0017\r\f\u0013\u0011\u0015\u0012\u0012".length()];
            QB qb = new QB("\b\u0019\u0013\u0019\u0017\r\f\u0013\u0011\u0015\u0012\u0012");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            writableNativeMap.putString(strYd, new String(iArr, 0, i2));
        } else {
            writableNativeMap.putString(strYd, str);
        }
        short sXd2 = (short) (OY.Xd() ^ 4666);
        short sXd3 = (short) (OY.Xd() ^ 25545);
        int[] iArr2 = new int["|u\u0005\u0006t{z".length()];
        QB qb2 = new QB("|u\u0005\u0006t{z");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        String str3 = new String(iArr2, 0, i3);
        if (str2 != null) {
            writableNativeMap.putString(str3, str2);
        } else if (th != null) {
            String message = th.getMessage();
            if (message == null || message.isEmpty()) {
                message = th.getClass().getCanonicalName();
            }
            writableNativeMap.putString(str3, message);
        } else {
            short sXd4 = (short) (C1633zX.Xd() ^ (-27449));
            short sXd5 = (short) (C1633zX.Xd() ^ (-3543));
            int[] iArr3 = new int["o0w\u0004NK!q\u001e\u001d8D\u0001N[(R\u001ehA".length()];
            QB qb3 = new QB("o0w\u0004NK!q\u001e\u001d8D\u0001N[(R\u001ehA");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                i4++;
            }
            writableNativeMap.putString(str3, new String(iArr3, 0, i4));
        }
        String strXd = ZO.xd("s\u00132eK?K\u0002", (short) (Od.Xd() ^ (-10191)), (short) (Od.Xd() ^ (-32141)));
        if (writableMap != null) {
            writableNativeMap.putMap(strXd, writableMap);
        } else {
            writableNativeMap.putNull(strXd);
        }
        short sXd6 = (short) (FB.Xd() ^ 12782);
        short sXd7 = (short) (FB.Xd() ^ 24137);
        int[] iArr4 = new int["6#a\u000e\\N?{\u000b@L$`eC;\u0002]".length()];
        QB qb4 = new QB("6#a\u000e\\N?{\u000b@L$`eC;\u0002]");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
            i5++;
        }
        String str4 = new String(iArr4, 0, i5);
        if (th != null) {
            writableNativeMap.putString(Ig.wd(",T\u0013\"", (short) (C1580rY.Xd() ^ (-26055))), th.getClass().getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i6 = 0; i6 < stackTrace.length && i6 < 50; i6++) {
                StackTraceElement stackTraceElement = stackTrace[i6];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                String strOd = EO.Od("+\u0005\bBq", (short) (FB.Xd() ^ 32713));
                short sXd8 = (short) (C1607wl.Xd() ^ 23559);
                int[] iArr5 = new int["pfzd0mame+Oo[\\cKhVWX7]U\\S[`".length()];
                QB qb5 = new QB("pfzd0mame+Oo[\\cKhVWX7]U\\S[`");
                int i7 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i7] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i7 + xuXd5.CK(iKK5));
                    i7++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr5, 0, i7)).getMethod(C1593ug.zd("IHX(RH[\\8LYR", (short) (C1633zX.Xd() ^ (-4347)), (short) (C1633zX.Xd() ^ (-6560))), new Class[0]);
                try {
                    method.setAccessible(true);
                    writableNativeMap2.putString(strOd, (String) method.invoke(stackTraceElement, objArr));
                    String strOd2 = C1561oA.od("moqi", (short) (FB.Xd() ^ 12979));
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Kd("1)?+x8.<6}$F47@*I9<? HBKDNU", (short) (C1607wl.Xd() ^ 19125))).getMethod(Wg.Zd("Pi\u0014\u0001?[os\"IZ", (short) (ZN.Xd() ^ 12942), (short) (ZN.Xd() ^ 32492)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        writableNativeMap2.putString(strOd2, (String) method2.invoke(stackTraceElement, objArr2));
                        String strXd2 = C1561oA.Xd("4280\u001aB;15C", (short) (C1633zX.Xd() ^ (-74)));
                        Class<?> cls = Class.forName(Wg.vd("\u0012\b\u001c\u0006Y\u0017\u000b\u0017\u0017\\\u0001!\u0015\u0016\u001d\u0005\nwxy`\u0007~\u0006\u0005\r\u0012", (short) (C1633zX.Xd() ^ (-25209))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr3 = new Object[0];
                        short sXd9 = (short) (Od.Xd() ^ (-20865));
                        short sXd10 = (short) (Od.Xd() ^ (-26236));
                        int[] iArr6 = new int["52@\u001737-\u0015;2&(4".length()];
                        QB qb6 = new QB("52@\u001737-\u0015;2&(4");
                        int i8 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i8] = xuXd6.fK(((sXd9 + i8) + xuXd6.CK(iKK6)) - sXd10);
                            i8++;
                        }
                        Method method3 = cls.getMethod(new String(iArr6, 0, i8), clsArr);
                        try {
                            method3.setAccessible(true);
                            writableNativeMap2.putInt(strXd2, ((Integer) method3.invoke(stackTraceElement, objArr3)).intValue());
                            String strVd = hg.Vd("\u0018\u000f\u001d\u0010\u0016\nr\u0005\u0010\u0007", (short) (C1580rY.Xd() ^ (-30122)), (short) (C1580rY.Xd() ^ (-7514)));
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(C1561oA.ud("\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0003\u0004\u000br\u0010}~\u007f^\u0005|\u0004z\u0003\b", (short) (C1499aX.Xd() ^ (-20722)))).getMethod(C1561oA.yd("CBN(EUFNH3CPM", (short) (FB.Xd() ^ 13073)), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                writableNativeMap2.putString(strVd, (String) method4.invoke(stackTraceElement, objArr4));
                                writableNativeArray.pushMap(writableNativeMap2);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            writableNativeMap.putArray(str4, writableNativeArray);
        } else {
            writableNativeMap.putArray(str4, new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th) throws Throwable {
        reject(str, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th, WritableMap writableMap) throws Throwable {
        reject(str, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th) throws Throwable {
        reject(null, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th, WritableMap writableMap) throws Throwable {
        reject(null, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }
}
