package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.transition.Transition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Xg;

/* JADX INFO: loaded from: classes3.dex */
public final class PreloadTarget<Z> extends CustomTarget<Z> {
    private static final Handler HANDLER;
    private static final int MESSAGE_CLEAR = 1;
    private final RequestManager requestManager;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("]kbqojf1sx4Swxzp~", (short) (C1633zX.Xd() ^ (-6688)))).getDeclaredMethod(Xg.qd("\n\t\u0019r\b\u0011\u0017u\u001a\u001b\u001d\u0013!", (short) (C1499aX.Xd() ^ (-18201)), (short) (C1499aX.Xd() ^ (-14459))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            HANDLER = new Handler((Looper) declaredMethod.invoke(null, objArr), new Handler.Callback() { // from class: com.bumptech.glide.request.target.PreloadTarget.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message.what != 1) {
                        return false;
                    }
                    ((PreloadTarget) message.obj).clear();
                    return true;
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private PreloadTarget(RequestManager requestManager, int i2, int i3) {
        super(i2, i3);
        this.requestManager = requestManager;
    }

    public static <Z> PreloadTarget<Z> obtain(RequestManager requestManager, int i2, int i3) {
        return new PreloadTarget<>(requestManager, i2, i3);
    }

    void clear() {
        this.requestManager.clear(this);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(Z z2, Transition<? super Z> transition) {
        HANDLER.obtainMessage(1, this).sendToTarget();
    }
}
