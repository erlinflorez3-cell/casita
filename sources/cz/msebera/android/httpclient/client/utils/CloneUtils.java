package cz.msebera.android.httpclient.client.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class CloneUtils {
    private CloneUtils() {
    }

    public static Object clone(Object obj) throws CloneNotSupportedException {
        return cloneObject(obj);
    }

    public static <T> T cloneObject(T t2) throws Throwable {
        if (t2 == null) {
            return null;
        }
        if (!(t2 instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return (T) t2.getClass().getMethod(C1561oA.od(">FHF<", (short) (ZN.Xd() ^ 2197)), null).invoke(t2, null);
            } catch (IllegalAccessException e2) {
                throw new IllegalAccessError(e2.getMessage());
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                Object[] objArr = {C1561oA.Kd("Smeyrhgykk(n\u0003nq}\u0003x\u007f\u007f", (short) (C1633zX.Xd() ^ (-5678))), cause};
                Constructor<?> constructor = Class.forName(Wg.Zd("=\n2BCe \u0011=(S$Ij\u0002", (short) (C1607wl.Xd() ^ 16270), (short) (C1607wl.Xd() ^ 21646))).getConstructor(Class.forName(C1561oA.Xd("zr\ttB\u0002w\u0006\u007fGm\u0010\u000f\u0007\r\u0007", (short) (Od.Xd() ^ (-10658)))), Class.forName(Wg.vd("\t~\u0013|H\u0006y\u0006\u000eSx\f\u0015\u0011\u0018\u0001pyq", (short) (Od.Xd() ^ (-4163)))));
                try {
                    constructor.setAccessible(true);
                    throw ((Error) constructor.newInstance(objArr));
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
        } catch (NoSuchMethodException e5) {
            throw new NoSuchMethodError(e5.getMessage());
        }
    }
}
