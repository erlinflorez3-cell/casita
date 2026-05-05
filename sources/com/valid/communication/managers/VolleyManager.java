package com.valid.communication.managers;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocketFactory;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class VolleyManager {
    private static Context mCtx = null;
    private static VolleyManager mInstance = null;
    private RequestQueue mRequestQueue;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    private VolleyManager(Context context) {
        mCtx = context;
        this.mRequestQueue = getRequestQueue();
    }

    public static synchronized VolleyManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new VolleyManager(context);
        }
        return mInstance;
    }

    public void addToRequestQueue(Request request) {
        try {
            getRequestQueue().add(request);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public RequestQueue getRequestQueue() throws Throwable {
        if (this.mRequestQueue == null) {
            newRequestQueue();
        }
        return this.mRequestQueue;
    }

    public void newRequestQueue() throws Throwable {
        BasicNetwork basicNetwork;
        int i2;
        RequestQueue requestQueue;
        try {
            Context context = mCtx;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("lxmzvoi2fqotdlq*>igl\\ni", (short) (C1580rY.Xd() ^ (648130107 ^ (-648135590))))).getMethod(C1561oA.yd("\u0005\u0004\u0010_\u0003\u0006\b\u0006i\u0010\u0016", (short) (OY.Xd() ^ (962789109 ^ 962784127))), new Class[0]);
            try {
                method.setAccessible(true);
                DiskBasedCache diskBasedCache = new DiskBasedCache((File) method.invoke(context, objArr), (1184796281 ^ 1884759952) ^ 912894441);
                VolleyManager volleyManager = null;
                if (Integer.parseInt(C1561oA.Yd("\u0002", (short) (C1607wl.Xd() ^ (1922060318 ^ 1922048272)))) != 0) {
                    i2 = 1354976788 ^ 1354976798;
                    diskBasedCache = null;
                    basicNetwork = null;
                } else {
                    basicNetwork = new BasicNetwork((HttpStack) new HurlStack());
                    i2 = 14;
                }
                if (i2 != 0) {
                    requestQueue = new RequestQueue(diskBasedCache, basicNetwork);
                    volleyManager = this;
                } else {
                    requestQueue = null;
                }
                volleyManager.mRequestQueue = requestQueue;
                this.mRequestQueue.start();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) throws Throwable {
        if (sSLSocketFactory == null) {
            newRequestQueue();
            return;
        }
        Context context = mCtx;
        int iXd = C1607wl.Xd() ^ (741164358 ^ (-1114204326));
        int iXd2 = FB.Xd() ^ (-1609513349);
        short sXd = (short) (C1633zX.Xd() ^ iXd);
        short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
        int[] iArr = new int["\n".length()];
        QB qb = new QB("\n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context, (HttpStack) (Integer.parseInt(new String(iArr, 0, i2)) == 0 ? new HurlStack(null, sSLSocketFactory) : null));
        this.mRequestQueue = requestQueueNewRequestQueue;
        requestQueueNewRequestQueue.start();
    }
}
