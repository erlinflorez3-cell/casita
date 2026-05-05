package io.cobrowse;

import android.os.Handler;
import android.os.Looper;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
final class ThreadUtils {
    private static final Handler handler;

    static {
        short sXd = (short) (C1499aX.Xd() ^ (-1379));
        short sXd2 = (short) (C1499aX.Xd() ^ (-1172));
        int[] iArr = new int["r~s\u0001|uo8x{5Rtssgs".length()];
        QB qb = new QB("r~s\u0001|uo8x{5Rtssgs");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1580rY.Xd() ^ (-2475));
        short sXd4 = (short) (C1580rY.Xd() ^ (-31305));
        int[] iArr2 = new int["C@N&9@D!CBB6B".length()];
        QB qb2 = new QB("C@N&9@D!CBB6B");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    ThreadUtils() {
    }

    static <TError extends Error, TArg> void invoke(Callback<TError, TArg> callback, TError terror) {
        invoke(callback, terror, null);
    }

    static <TError extends Error, TArg> void invoke(final Callback<TError, TArg> callback, final TError terror, final TArg targ) {
        if (callback == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("myn{wpj3sv0Monnbn", (short) (C1607wl.Xd() ^ 30204))).getDeclaredMethod(C1561oA.yd("ts\u0004]r{\u0002`tuwm{", (short) (Od.Xd() ^ (-12915))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                if (terror != null) {
                    callback.call(terror, targ);
                    return;
                } else {
                    if (targ != null) {
                        callback.call(null, targ);
                        return;
                    }
                    return;
                }
            }
            if (terror == null) {
                if (targ != null) {
                    Handler handler2 = handler;
                    Runnable runnable = new Runnable() { // from class: io.cobrowse.ThreadUtils$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            callback.call(null, targ);
                        }
                    };
                    Class<?> cls = Class.forName(ZO.xd("\u0007Fa\u001d(\u0018fi\u0018;,\u001d\u0003;h#BJ", (short) (OY.Xd() ^ 30669), (short) (OY.Xd() ^ 555)));
                    Class<?>[] clsArr = {Class.forName(C1626yg.Ud("\b*Y\u0007u\u001c(0\"\u000fd]!a\u00151N.", (short) (ZN.Xd() ^ 837), (short) (ZN.Xd() ^ 1092)))};
                    Object[] objArr2 = {runnable};
                    short sXd = (short) (FB.Xd() ^ 32463);
                    int[] iArr = new int["\u0011@6\u000f".length()];
                    QB qb = new QB("\u0011@6\u000f");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler2, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return;
            }
            Handler handler3 = handler;
            Runnable runnable2 = new Runnable() { // from class: io.cobrowse.ThreadUtils$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    callback.call(terror, targ);
                }
            };
            Class<?> cls2 = Class.forName(C1561oA.Yd("GUL[YTP\u001b]b\u001e9SaXa[i", (short) (C1607wl.Xd() ^ 7912)));
            Class<?>[] clsArr2 = new Class[1];
            short sXd2 = (short) (FB.Xd() ^ 11044);
            short sXd3 = (short) (FB.Xd() ^ 5412);
            int[] iArr2 = new int["}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n".length()];
            QB qb2 = new QB("}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr3 = {runnable2};
            short sXd4 = (short) (OY.Xd() ^ 26947);
            short sXd5 = (short) (OY.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagUnknownBlock4);
            int[] iArr3 = new int["`)\r=".length()];
            QB qb3 = new QB("`)\r=");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                i4++;
            }
            Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(handler3, objArr3);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static <TError extends Error, TArg> void invoke(Callback<Error, TArg> callback, TArg targ) {
        invoke(callback, null, targ);
    }

    static void invokeAndWait(final Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (OY.Xd() ^ 542);
        int[] iArr = new int["I\u0006*`N|S\u0016}6r+x~$3|".length()];
        QB qb = new QB("I\u0006*`N|S\u0016}6r+x~$3|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-14214));
        int[] iArr2 = new int["?<J\"5<@\u001d?>>2>".length()];
        QB qb2 = new QB("?<J\"5<@\u001d?>>2>");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                runnable.run();
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler handler2 = handler;
            Object[] objArr2 = {new Runnable() { // from class: io.cobrowse.ThreadUtils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtils.lambda$invokeAndWait$0(runnable, countDownLatch);
                }
            }};
            Method method = Class.forName(C1593ug.zd("P^Udb]Y$fk'B\\jajdr", (short) (C1580rY.Xd() ^ (-7812)), (short) (C1580rY.Xd() ^ (-23300)))).getMethod(C1561oA.Kd("]]bd", (short) (C1607wl.Xd() ^ 20390)), Class.forName(C1561oA.od("\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTw\u001a\u0012\u0011\u0003\u0003\f\u0004", (short) (OY.Xd() ^ 2381))));
            try {
                method.setAccessible(true);
                method.invoke(handler2, objArr2);
                try {
                    countDownLatch.await();
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(Wg.Zd("m\u0019\u0011P/\u0006fDJ\u001d~{2\tXm8U~;1\u0013\nlHZkV8o\u0012mQ\u00142Yfl\u000f|9\u0016|wh@", (short) (Od.Xd() ^ (-175)), (short) (Od.Xd() ^ (-18026))), e2);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static /* synthetic */ void lambda$invokeAndWait$0(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }
}
