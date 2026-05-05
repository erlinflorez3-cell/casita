package io.invertase.firebase.common;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import yg.C1499aX;
import yg.C1561oA;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class UniversalFirebaseModule {
    private final Context context;
    private final TaskExecutorService executorService = new TaskExecutorService(getName());
    private final String serviceName;

    protected UniversalFirebaseModule(Context context, String str) {
        this.context = context;
        this.serviceName = str;
    }

    public Context getApplicationContext() throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(C1561oA.Xd("[i`omhd/erryku|7Mzz\u0002s\b\u0005", (short) (C1499aX.Xd() ^ (-23315))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 16813);
        int[] iArr = new int["\n\t\u0015b\u0017\u0018\u0011\u000f\u000e\r\u001d\u0013\u001e\u001eo\u001d!(\u0016*+".length()];
        QB qb = new QB("\n\t\u0015b\u0017\u0018\u0011\u000f\u000e\r\u001d\u0013\u001e\u001eo\u001d!(\u0016*+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public Context getContext() {
        return this.context;
    }

    protected ExecutorService getExecutor() {
        return this.executorService.getExecutor();
    }

    public String getName() {
        return "Universal" + this.serviceName + "Module";
    }

    @OverridingMethodsMustInvokeSuper
    public void onTearDown() {
        this.executorService.shutdown();
    }
}
