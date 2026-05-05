package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes5.dex */
public class RotationListener {
    private RotationCallback callback;
    private int lastRotation;
    private OrientationEventListener orientationEventListener;
    private WindowManager windowManager;

    public void listen(Context context, RotationCallback rotationCallback) {
        stop();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("gshuqjd-aljo_gl%9dbgWid", (short) (FB.Xd() ^ 2944))).getMethod(C1593ug.zd("\u0015\u0014$q\"# \u001e\u0019\u0018,\"))~,,3%96", (short) (Od.Xd() ^ (-15489)), (short) (Od.Xd() ^ (-1375))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.callback = rotationCallback;
            Object[] objArr2 = {C1561oA.od("PAE:DK", (short) (FB.Xd() ^ 31258))};
            Method method2 = Class.forName(C1561oA.Kd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (FB.Xd() ^ 9913))).getMethod(C1561oA.Xd("NM]=d_aS\\CVdi]X[", (short) (FB.Xd() ^ 13469)), Class.forName(Wg.Zd("^*qO0a\tj\u0016O\u0007\u001dM7P<", (short) (C1499aX.Xd() ^ (-24329)), (short) (C1499aX.Xd() ^ (-2692)))));
            try {
                method2.setAccessible(true);
                this.windowManager = (WindowManager) method2.invoke(context2, objArr2);
                OrientationEventListener orientationEventListener = new OrientationEventListener(context2, 3) { // from class: com.journeyapps.barcodescanner.RotationListener.1
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int i2) {
                        int rotation;
                        WindowManager windowManager = RotationListener.this.windowManager;
                        RotationCallback rotationCallback2 = RotationListener.this.callback;
                        if (RotationListener.this.windowManager == null || rotationCallback2 == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == RotationListener.this.lastRotation) {
                            return;
                        }
                        RotationListener.this.lastRotation = rotation;
                        rotationCallback2.onRotationChanged(rotation);
                    }
                };
                this.orientationEventListener = orientationEventListener;
                orientationEventListener.enable();
                this.lastRotation = this.windowManager.getDefaultDisplay().getRotation();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.orientationEventListener = null;
        this.windowManager = null;
        this.callback = null;
    }
}
