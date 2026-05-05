package com.facetec.sdk;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
final class hs extends hv {
    private final Method B;
    private final Class<?> Code;
    private final Class<?> I;
    private final Method V;
    private final Method Z;

    static class Code implements InvocationHandler {
        boolean B;
        String Code;
        private final List<String> Z;

        Code(List<String> list) {
            this.Z = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = gg.V;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.B = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.Z;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.Z.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.Code = str;
                            return str;
                        }
                    }
                    String str2 = this.Z.get(0);
                    this.Code = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.Code = (String) objArr[0];
            return null;
        }
    }

    private hs(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.Z = method;
        this.V = method2;
        this.B = method3;
        this.Code = cls;
        this.I = cls2;
    }

    public static hv I() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new hs(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.facetec.sdk.hv
    public final void V(SSLSocket sSLSocket) {
        try {
            this.B.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw gg.I("unable to remove alpn", e2);
        }
    }

    @Override // com.facetec.sdk.hv
    public final void V(SSLSocket sSLSocket, String str, List<fx> list) {
        try {
            this.Z.invoke(null, sSLSocket, Proxy.newProxyInstance(hv.class.getClassLoader(), new Class[]{this.Code, this.I}, new Code(B(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw gg.I("unable to set alpn", e2);
        }
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    public final String Z(SSLSocket sSLSocket) {
        try {
            Code code = (Code) Proxy.getInvocationHandler(this.V.invoke(null, sSLSocket));
            if (!code.B && code.Code == null) {
                hv.B().Code(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (code.B) {
                return null;
            }
            return code.Code;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw gg.I("unable to get selected protocol", e2);
        }
    }
}
