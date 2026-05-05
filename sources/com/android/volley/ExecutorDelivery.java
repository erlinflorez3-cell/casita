package com.android.volley;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1580rY;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorDelivery implements ResponseDelivery {
    private final Executor mResponsePoster;

    /* JADX INFO: loaded from: classes2.dex */
    private static class ResponseDeliveryRunnable implements Runnable {
        private final Request mRequest;
        private final Response mResponse;
        private final Runnable mRunnable;

        public ResponseDeliveryRunnable(Request request, Response response, Runnable runnable) {
            this.mRequest = request;
            this.mResponse = response;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("canceled-at-delivery");
                return;
            }
            if (this.mResponse.isSuccess()) {
                this.mRequest.deliverResponse(this.mResponse.result);
            } else {
                this.mRequest.deliverError(this.mResponse.error);
            }
            if (this.mResponse.intermediate) {
                this.mRequest.addMarker("intermediate-response");
            } else {
                this.mRequest.finish("done");
            }
            Runnable runnable = this.mRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExecutorDelivery(final Handler handler) {
        this.mResponsePoster = new Executor() { // from class: com.android.volley.ExecutorDelivery.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) throws Throwable {
                Handler handler2 = handler;
                Class<?> cls = Class.forName(Jg.Wd("CY\u0014+ux8\u000b\u0019i%\u0005/\t\u007fL\u001a0", (short) (C1580rY.Xd() ^ (-2747)), (short) (C1580rY.Xd() ^ (-4237))));
                Class<?>[] clsArr = {Class.forName(ZO.xd("h@[}U_)u\u001c}dX&\u000f\u0005R&^", (short) (ZN.Xd() ^ 1527), (short) (ZN.Xd() ^ 11412)))};
                Object[] objArr = {runnable};
                short sXd = (short) (C1580rY.Xd() ^ (-29539));
                short sXd2 = (short) (C1580rY.Xd() ^ (-24881));
                int[] iArr = new int["WjB\b".length()];
                QB qb = new QB("WjB\b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler2, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        };
    }

    public ExecutorDelivery(Executor executor) {
        this.mResponsePoster = executor;
    }

    @Override // com.android.volley.ResponseDelivery
    public void postError(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.mResponsePoster.execute(new ResponseDeliveryRunnable(request, Response.error(volleyError), null));
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request<?> request, Response<?> response) {
        postResponse(request, response, null);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.mResponsePoster.execute(new ResponseDeliveryRunnable(request, response, runnable));
    }
}
