package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public final class ContextUtil {
    public static Context getApplicationContext(Context context) {
        int deviceId;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\".#0,%\u001fg\u001c'%*\u001a\"'_s\u001f\u001d\"\u0012$\u001f", (short) (C1633zX.Xd() ^ (-15808)))).getMethod(C1561oA.yd("PM[']\\WSTQcWdb6agl\\nq", (short) (C1580rY.Xd() ^ (-9886))), new Class[0]);
        try {
            method.setAccessible(true);
            Context contextCreateDeviceContext = (Context) method.invoke(context, objArr);
            if (Build.VERSION.SDK_INT >= 34 && (deviceId = Api34Impl.getDeviceId(context)) != Api34Impl.getDeviceId(contextCreateDeviceContext)) {
                contextCreateDeviceContext = Api34Impl.createDeviceContext(contextCreateDeviceContext, deviceId);
            }
            if (Build.VERSION.SDK_INT < 30) {
                return contextCreateDeviceContext;
            }
            String attributionTag = Api30Impl.getAttributionTag(context);
            return !Objects.equals(attributionTag, Api30Impl.getAttributionTag(contextCreateDeviceContext)) ? Api30Impl.createAttributionContext(contextCreateDeviceContext, attributionTag) : contextCreateDeviceContext;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Application getApplicationFromContext(Context context) {
        for (Context applicationContext = getApplicationContext(context); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private ContextUtil() {
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static Context createAttributionContext(Context context, String str) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Yd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (C1633zX.Xd() ^ (-19807))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-12013));
            short sXd2 = (short) (C1499aX.Xd() ^ (-24580));
            int[] iArr = new int["`XnZ(g]ke-Sutlrl".length()];
            QB qb = new QB("`XnZ(g]ke-Sutlrl");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {str};
            short sXd3 = (short) (C1607wl.Xd() ^ 14556);
            short sXd4 = (short) (C1607wl.Xd() ^ 113);
            int[] iArr2 = new int["@\u0012N\tkJ\u0001gB.t,\tJ;\u000fLp\u0007h\u001aYj6".length()];
            QB qb2 = new QB("@\u0012N\tkJ\u0001gB.t,\tJ;\u000fLp\u0007h\u001aYj6");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                return (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static String getAttributionTag(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("u/C\n]Zc*=!\u0019/!es/Fy\u001f\u001f\u0002MG", (short) (OY.Xd() ^ 19683), (short) (OY.Xd() ^ 30015))).getMethod(C1626yg.Ud("\u0005[?~g(a6\u007fY]\">`\n]_", (short) (Od.Xd() ^ (-32176)), (short) (Od.Xd() ^ (-15470))), new Class[0]);
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static Context createDeviceContext(Context context, int i2) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Qd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1499aX.Xd() ^ (-26235))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            short sXd = (short) (C1607wl.Xd() ^ 25710);
            short sXd2 = (short) (C1607wl.Xd() ^ 32162);
            int[] iArr = new int["_oc`tfFhznilKxx\u007fq\u0006\u0003".length()];
            QB qb = new QB("_oc`tfFhznilKxx\u007fq\u0006\u0003");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                return (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static int getDeviceId(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\", (short) (C1633zX.Xd() ^ (-18707)))).getMethod(C1561oA.Kd("on~Oq\u0004wruZv", (short) (OY.Xd() ^ 15095)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(context, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
