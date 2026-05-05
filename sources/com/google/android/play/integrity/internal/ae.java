package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class ae {

    /* JADX INFO: renamed from: a */
    private static final Map f3462a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Context f3463b;

    /* JADX INFO: renamed from: c */
    private final s f3464c;

    /* JADX INFO: renamed from: d */
    private final String f3465d;

    /* JADX INFO: renamed from: h */
    private boolean f3469h;

    /* JADX INFO: renamed from: i */
    private final Intent f3470i;

    /* JADX INFO: renamed from: j */
    private final z f3471j;

    /* JADX INFO: renamed from: n */
    private ServiceConnection f3475n;

    /* JADX INFO: renamed from: o */
    private IInterface f3476o;

    /* JADX INFO: renamed from: e */
    private final List f3466e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Set f3467f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Object f3468g = new Object();

    /* JADX INFO: renamed from: l */
    private final IBinder.DeathRecipient f3473l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(this.f3488a);
        }
    };

    /* JADX INFO: renamed from: m */
    private final AtomicInteger f3474m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private final WeakReference f3472k = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, y yVar) {
        this.f3463b = context;
        this.f3464c = sVar;
        this.f3465d = str;
        this.f3470i = intent;
        this.f3471j = zVar;
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f3464c.d("reportBinderDeath", new Object[0]);
        y yVar = (y) aeVar.f3472k.get();
        if (yVar != null) {
            aeVar.f3464c.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            aeVar.f3464c.d("%s : Binder has died.", aeVar.f3465d);
            Iterator it = aeVar.f3466e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(aeVar.w());
            }
            aeVar.f3466e.clear();
        }
        synchronized (aeVar.f3468g) {
            aeVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f3467f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f3489a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) throws Throwable {
        if (aeVar.f3476o != null || aeVar.f3469h) {
            if (!aeVar.f3469h) {
                tVar.run();
                return;
            } else {
                aeVar.f3464c.d(C1593ug.zd("dox\u0005z\u0001z4\n\u00067z\u0003\t\u007f<\u0012\u000e?\u0015\n\bC\u0018\u000b\u0019\u001e\u0012\r\u0010Y", (short) (C1499aX.Xd() ^ (-7884)), (short) (C1499aX.Xd() ^ (-24160))), new Object[0]);
                aeVar.f3466e.add(tVar);
                return;
            }
        }
        aeVar.f3464c.d(Jg.Wd("2)\b3\f\u0006\u000e#?\u0004l\u0017\u0001GnI%?l\u0001u-O{3%\u0016=\u0014\"\u0006p", (short) (Od.Xd() ^ (-10214)), (short) (Od.Xd() ^ (-31975))), new Object[0]);
        aeVar.f3466e.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f3475n = adVar;
        aeVar.f3469h = true;
        Context context = aeVar.f3463b;
        Intent intent = aeVar.f3470i;
        short sXd = (short) (C1499aX.Xd() ^ (-12536));
        short sXd2 = (short) (C1499aX.Xd() ^ (-22635));
        int[] iArr = new int["v&Bo<k0\f\u0010\u0005Y}74<%\u00040\\\u0018J1?".length()];
        QB qb = new QB("v&Bo<k0\f\u0010\u0005Y}74<%\u00040\\\u0018J1?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {intent, adVar, 1};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("3a\u00196=-\u0016a0--", (short) (ZN.Xd() ^ 31777)), Class.forName(C1626yg.Ud("J\u001eeOD\u0003:lbP\u000b5MujdF\u0005#g6\u001b", (short) (ZN.Xd() ^ 4738), (short) (ZN.Xd() ^ 30367))), Class.forName(Ig.wd("lT\u001a\u0002\u001cAjQDBE+IJVk8b5S\u0004W=\u0019\u000f[7yWT7\u001bs", (short) (FB.Xd() ^ 14956))), Integer.TYPE);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                return;
            }
            aeVar.f3464c.d(C1561oA.Qd("A[bd\\Z\u0015hb\u0012SY]R\r`Z\n]PL\u0006XIUXJCD\f", (short) (Od.Xd() ^ (-32171))), new Object[0]);
            aeVar.f3469h = false;
            Iterator it = aeVar.f3466e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(new af());
            }
            aeVar.f3466e.clear();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f3464c.d("linkToDeath", new Object[0]);
        try {
            aeVar.f3476o.asBinder().linkToDeath(aeVar.f3473l, 0);
        } catch (RemoteException e2) {
            aeVar.f3464c.c(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f3464c.d("unlinkToDeath", new Object[0]);
        aeVar.f3476o.asBinder().unlinkToDeath(aeVar.f3473l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f3465d).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f3467f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f3467f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f3462a;
        synchronized (map) {
            if (!map.containsKey(this.f3465d)) {
                HandlerThread handlerThread = new HandlerThread(this.f3465d, 10);
                handlerThread.start();
                map.put(this.f3465d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f3465d);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f3476o;
    }

    public final void t(t tVar, TaskCompletionSource taskCompletionSource) throws Throwable {
        w wVar = new w(this, tVar.c(), taskCompletionSource, tVar);
        Handler handlerC = c();
        Object[] objArr = {wVar};
        Method method = Class.forName(C1561oA.od(":F;HD=7\u007f@C|\u0016.:/6.:", (short) (C1499aX.Xd() ^ (-15376)))).getMethod(Wg.Zd("O\u00145\u001b", (short) (C1633zX.Xd() ^ (-4616)), (short) (C1633zX.Xd() ^ (-27739))), Class.forName(C1561oA.Kd("0(>*w7-;5|\"F@A57B<", (short) (C1580rY.Xd() ^ (-9697)))));
        try {
            method.setAccessible(true);
            method.invoke(handlerC, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f3468g) {
            this.f3467f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f3468g) {
            this.f3467f.remove(taskCompletionSource);
        }
        x xVar = new x(this);
        Handler handlerC = c();
        Class<?> cls = Class.forName(C1561oA.Xd("/=4CA<8\u0003EJ\u0006!;I@ICQ", (short) (C1607wl.Xd() ^ 25267)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 25091);
        int[] iArr = new int[" \u0016*\u0014_\u001d\u0011\u001d\u0015Z} \u0018\u0017\t\t2*".length()];
        QB qb = new QB(" \u0016*\u0014_\u001d\u0011\u001d\u0015Z} \u0018\u0017\t\t2*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {xVar};
        Method method = cls.getMethod(Qg.kd("USVV", (short) (C1580rY.Xd() ^ (-25478)), (short) (C1580rY.Xd() ^ (-9878))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerC, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
