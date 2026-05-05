package com.google.android.play.core.splitinstall.internal;

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
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class zzaf {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzu zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final com.google.android.play.core.splitinstall.zzak zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzaf.zzj(this.zza);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "SplitInstallService";
    private final WeakReference zzj = new WeakReference(null);

    public zzaf(Context context, zzu zzuVar, String str, Intent intent, com.google.android.play.core.splitinstall.zzak zzakVar, zzaa zzaaVar) {
        this.zzb = context;
        this.zzc = zzuVar;
        this.zzi = intent;
        this.zzo = zzakVar;
    }

    public static /* synthetic */ void zzj(zzaf zzafVar) {
        zzafVar.zzc.zzd("reportBinderDeath", new Object[0]);
        zzaa zzaaVar = (zzaa) zzafVar.zzj.get();
        if (zzaaVar != null) {
            zzafVar.zzc.zzd("calling onBinderDied", new Object[0]);
            zzaaVar.zza();
        } else {
            zzafVar.zzc.zzd("%s : Binder has died.", zzafVar.zzd);
            Iterator it = zzafVar.zze.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zzb(zzafVar.zzv());
            }
            zzafVar.zze.clear();
        }
        synchronized (zzafVar.zzg) {
            zzafVar.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(final zzaf zzafVar, final TaskCompletionSource taskCompletionSource) {
        zzafVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.splitinstall.internal.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzt(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void zzp(zzaf zzafVar, zzv zzvVar) throws Throwable {
        if (zzafVar.zzn != null || zzafVar.zzh) {
            if (!zzafVar.zzh) {
                zzvVar.run();
                return;
            }
            zzu zzuVar = zzafVar.zzc;
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 2475);
            int[] iArr = new int["(3<H>D>wMIz>FLC\u007fUQ\u0003XMK\u0007[N\\aUPS\u001d".length()];
            QB qb = new QB("(3<H>D>wMIz>FLC\u007fUQ\u0003XMK\u0007[N\\aUPS\u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            zzuVar.zzd(new String(iArr, 0, i2), objArr);
            zzafVar.zze.add(zzvVar);
            return;
        }
        zzafVar.zzc.zzd(C1561oA.Xd("Kqmyoh|n*mu{rx~x2\b\u00045\u000b\u007f}9\u000e\u0001\u000f\u0014\b\u0003\u0006O", (short) (C1607wl.Xd() ^ 4644)), new Object[0]);
        zzafVar.zze.add(zzvVar);
        zzae zzaeVar = new zzae(zzafVar, null);
        zzafVar.zzm = zzaeVar;
        zzafVar.zzh = true;
        Context context = zzafVar.zzb;
        Intent intent = zzafVar.zzi;
        short sXd2 = (short) (C1607wl.Xd() ^ 20643);
        int[] iArr2 = new int["`napje](jwszhru0R\u007f{\u0003p\u0005}".length()];
        QB qb2 = new QB("`napje](jwszhru0R\u007f{\u0003p\u0005}");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr2 = {intent, zzaeVar, 1};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.ud(".48-\u001b,8;-&'", (short) (FB.Xd() ^ 13645)), Class.forName(Qg.kd("LXMZVOI\u0012FQOTDLQ\n$HM=EJ", (short) (C1499aX.Xd() ^ (-20861)), (short) (C1499aX.Xd() ^ (-25264)))), Class.forName(hg.Vd("1=2?;4.v+649)16n\u0013$03%\u001e\u001f{'%$\u001a\u0017'\u001b \u001e", (short) (Od.Xd() ^ (-7140)), (short) (Od.Xd() ^ (-17924)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr2)).booleanValue()) {
                return;
            }
            zzafVar.zzc.zzd(C1561oA.yd("+ELNFD~R\\\fMSWL\u0007ZDsG:6oB3ORD=>\u0006", (short) (Od.Xd() ^ (-7774))), new Object[0]);
            zzafVar.zzh = false;
            Iterator it = zzafVar.zze.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zzb(new zzag());
            }
            zzafVar.zze.clear();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* bridge */ /* synthetic */ void zzq(zzaf zzafVar) {
        zzafVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzafVar.zzn.asBinder().linkToDeath(zzafVar.zzk, 0);
        } catch (RemoteException e2) {
            zzafVar.zzc.zzc(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzaf zzafVar) {
        zzafVar.zzc.zzd("unlinkToDeath", new Object[0]);
        zzafVar.zzn.asBinder().unlinkToDeath(zzafVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzv zzvVar, TaskCompletionSource taskCompletionSource) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        zzy zzyVar = new zzy(this, zzvVar.zza(), taskCompletionSource, zzvVar);
        Handler handlerZzc = zzc();
        Class<?> cls = Class.forName(Xg.qd("%3*972.x;@{\u00171?6?9G", (short) (Od.Xd() ^ (-7562)), (short) (Od.Xd() ^ (-724))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 22349);
        short sXd2 = (short) (ZN.Xd() ^ 31142);
        int[] iArr = new int["|+Y#\u0003\u001e-\u0012$L\u007f\u0005\u0014O\u0017:\u0014.".length()];
        QB qb = new QB("|+Y#\u0003\u001e-\u0012$L\u007f\u0005\u0014O\u0017:\u0014.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {zzyVar};
        short sXd3 = (short) (C1580rY.Xd() ^ (-31513));
        short sXd4 = (short) (C1580rY.Xd() ^ (-17379));
        int[] iArr2 = new int["VTLd".length()];
        QB qb2 = new QB("VTLd");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzz zzzVar = new zzz(this);
        Handler handlerZzc = zzc();
        short sXd = (short) (FB.Xd() ^ 9878);
        short sXd2 = (short) (FB.Xd() ^ 17862);
        int[] iArr = new int["n\b9\u0013DFCU \u001cg9T\u001bfg\u0015Y".length()];
        QB qb = new QB("n\b9\u0013DFCU \u001cg9T\u001bfg\u0015Y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(Ig.wd("S\u0018?B\u007f\ta7\t[}G\u0015\u000f}%qd", (short) (C1499aX.Xd() ^ (-2720))))};
        Object[] objArr = {zzzVar};
        short sXd3 = (short) (C1499aX.Xd() ^ (-7615));
        int[] iArr2 = new int["(oG/".length()];
        QB qb2 = new QB("(oG/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
