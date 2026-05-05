package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class ClearCacheRequest extends Request<Object> {
    private final Cache mCache;
    private final Runnable mCallback;

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, null, null);
        this.mCache = cache;
        this.mCallback = runnable;
    }

    @Override // com.android.volley.Request
    protected void deliverResponse(Object obj) {
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    @Override // com.android.volley.Request
    public boolean isCanceled() throws Throwable {
        this.mCache.clear();
        if (this.mCallback == null) {
            return true;
        }
        Class<?> cls = Class.forName(C1626yg.Ud("\u0011wq\u007fq*\u001eRNtTf\u0017}R\u000eo", (short) (ZN.Xd() ^ 32596), (short) (ZN.Xd() ^ 24175)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 15814);
        int[] iArr = new int["\u0004*'s~bwta50n,".length()];
        QB qb = new QB("\u0004*'s~bwta50n,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {this.mCallback};
            Method method = Class.forName(EO.Od("A{eML$=\b%f!\u001b\u0004\u001d\tp\u000f(", (short) (C1580rY.Xd() ^ (-21280)))).getMethod(C1593ug.zd("kkpr@tGtrryUmY~o\u0001q", (short) (ZN.Xd() ^ 20894), (short) (ZN.Xd() ^ 7444)), Class.forName(C1561oA.Qd("UK_I\u0015RFRJ\u00103UML>>G?", (short) (ZN.Xd() ^ 18020))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.android.volley.Request
    protected Response<Object> parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }
}
