package org.greenrobot.eventbus.android;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.HandlerPoster;
import org.greenrobot.eventbus.MainThreadSupport;
import org.greenrobot.eventbus.Poster;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAndroidMainThreadSupport implements MainThreadSupport {
    @Override // org.greenrobot.eventbus.MainThreadSupport
    public Poster createPoster(EventBus eventBus) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("DRIXVQM\u0018Z_\u001b:^_aWe", (short) (FB.Xd() ^ 32536))).getDeclaredMethod(Xg.qd("kjzTirxW{|~t\u0003", (short) (C1633zX.Xd() ^ (-20248)), (short) (C1633zX.Xd() ^ (-2605))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return new HandlerPoster(eventBus, (Looper) declaredMethod.invoke(null, objArr), 10);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.greenrobot.eventbus.MainThreadSupport
    public boolean isMainThread() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("n\u000f\u001c-7HfG&-~0p\b\f\u0016B", (short) (C1580rY.Xd() ^ (-20507)), (short) (C1580rY.Xd() ^ (-17776)))).getDeclaredMethod(ZO.xd("%\u0017\u001dXM>\u000bb\u0019\u001f#\u007fa", (short) (C1633zX.Xd() ^ (-3422)), (short) (C1633zX.Xd() ^ (-28039))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)) == Looper.myLooper();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
