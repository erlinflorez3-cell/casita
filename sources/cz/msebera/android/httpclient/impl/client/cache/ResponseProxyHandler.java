package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.HttpResponse;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
class ResponseProxyHandler implements InvocationHandler {
    private static final Method CLOSE_METHOD;
    private final HttpResponse original;

    static {
        try {
            CLOSE_METHOD = Closeable.class.getMethod(hg.Vd("JRTWH", (short) (C1580rY.Xd() ^ (-28831)), (short) (C1580rY.Xd() ^ (-18444))), new Class[0]);
        } catch (NoSuchMethodException e2) {
            Object[] objArr = {e2};
            Constructor<?> constructor = Class.forName(C1561oA.ud("I?S=\tF:F>\u0004\u001aFEAC", (short) (C1633zX.Xd() ^ (-9126)))).getConstructor(Class.forName(C1561oA.yd("PH^J\u0010OESE\r4ILJS>8C=", (short) (ZN.Xd() ^ 31404))));
            try {
                constructor.setAccessible(true);
                throw ((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    ResponseProxyHandler(HttpResponse httpResponse) {
        this.original = httpResponse;
    }

    public void close() throws IOException {
        IOUtils.consume(this.original.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.equals(CLOSE_METHOD)) {
            close();
            return null;
        }
        try {
            return method.invoke(this.original, objArr);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e2;
        }
    }
}
