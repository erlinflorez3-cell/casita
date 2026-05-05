package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
class ResourceRecycler {
    private final Handler handler;
    private boolean isRecycling;

    private static final class ResourceRecyclerCallback implements Handler.Callback {
        static final int RECYCLE_RESOURCE = 1;

        ResourceRecyclerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    ResourceRecycler() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("#1(7-($n9>y\u0019568.$", (short) (FB.Xd() ^ 9752))).getDeclaredMethod(Qg.kd("\u0014\u0011\u001fv\n\u0011\u0015q\u0014\u0013\u0013\u0007\u0013", (short) (Od.Xd() ^ (-13984)), (short) (Od.Xd() ^ (-26685))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr), new ResourceRecyclerCallback());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    synchronized void recycle(Resource<?> resource, boolean z2) {
        if (this.isRecycling || z2) {
            this.handler.obtainMessage(1, resource).sendToTarget();
        } else {
            this.isRecycling = true;
            resource.recycle();
            this.isRecycling = false;
        }
    }
}
