package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
public class Volley {
    private static final String DEFAULT_CACHE_DIR = "volley";

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, (BaseHttpStack) null);
    }

    private static RequestQueue newRequestQueue(Context context, Network network) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Mxv{k}x", (short) (C1633zX.Xd() ^ (-21432))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-17362));
        int[] iArr = new int["RQa/_`][VUi_ff<iipbvs".length()];
        QB qb = new QB("RQa/_`][VUi_ff<iipbvs");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new DiskBasedCache.FileSupplier() { // from class: com.android.volley.toolbox.Volley.1
                private File cacheDir = null;

                @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
                public File get() throws Throwable {
                    if (this.cacheDir == null) {
                        Context context3 = context2;
                        Class<?> cls2 = Class.forName(C1626yg.Ud("S<Ruyx[\u0017~-3\f\u001fqE \u0007\u0012\b\u0017,y\u0010", (short) (C1633zX.Xd() ^ (-22293)), (short) (C1633zX.Xd() ^ (-20945))));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd2 = (short) (OY.Xd() ^ 4175);
                        int[] iArr2 = new int["@\u0019y%B~\u001cITN]".length()];
                        QB qb2 = new QB("@\u0019y%B~\u001cITN]");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                            i3++;
                        }
                        Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                        try {
                            method2.setAccessible(true);
                            this.cacheDir = new File((File) method2.invoke(context3, objArr2), EO.Od("S\"/IK5", (short) (OY.Xd() ^ 16854)));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    return this.cacheDir;
                }
            }), network);
            requestQueue.start();
            return requestQueue;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        return newRequestQueue(context, baseHttpStack == null ? new BasicNetwork((BaseHttpStack) new HurlStack()) : new BasicNetwork(baseHttpStack));
    }

    @Deprecated
    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        if (httpStack != null) {
            return newRequestQueue(context, new BasicNetwork(httpStack));
        }
        return newRequestQueue(context, (BaseHttpStack) null);
    }
}
