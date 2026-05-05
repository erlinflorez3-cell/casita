package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
final class ad implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f3461a;

    /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f3461a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        this.f3461a.f3464c.d(C1561oA.Xd("EXfk_Z]<iijbasippLqur5ww]p~\u0004wruT\u0002\u0002\u0003zy\f}}B@\u0010F", (short) (Od.Xd() ^ (-1725))), componentName);
        aa aaVar = new aa(this, iBinder);
        Handler handlerC = this.f3461a.c();
        Object[] objArr = {aaVar};
        Method method = Class.forName(Wg.vd("GUL[QLH\u0013]b\u001e9KYPY[i", (short) (C1607wl.Xd() ^ 32097))).getMethod(hg.Vd(")'**", (short) (C1633zX.Xd() ^ (-4835)), (short) (C1633zX.Xd() ^ (-6205))), Class.forName(Qg.kd("8.B,w5)5-r\u001680/!!*\"", (short) (FB.Xd() ^ 8055), (short) (FB.Xd() ^ 11226))));
        try {
            method.setAccessible(true);
            method.invoke(handlerC, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        this.f3461a.f3464c.d(C1561oA.ud("@Q]`RKL)TRQGDTHMK%HJE\u0006FD(9EH:34\u00126?.976,)9)'ie3g", (short) (ZN.Xd() ^ 14837)), componentName);
        ab abVar = new ab(this);
        Handler handlerC = this.f3461a.c();
        Object[] objArr = {abVar};
        Method method = Class.forName(C1561oA.yd("\u000e\u001a\u000f\u001c \u0019\u0013[\u0014\u0017Pi\n\u0016\u000b\u0012\".", (short) (FB.Xd() ^ 248))).getMethod(Xg.qd("__df", (short) (C1499aX.Xd() ^ (-30395)), (short) (C1499aX.Xd() ^ (-21473))), Class.forName(C1561oA.Yd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSx\u001d\u0017\u0018\f\u000e\u0019\u0013", (short) (FB.Xd() ^ 9461))));
        try {
            method.setAccessible(true);
            method.invoke(handlerC, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
