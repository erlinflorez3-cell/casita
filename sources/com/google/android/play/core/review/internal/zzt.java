package com.google.android.play.core.review.internal;

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
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public final class zzt {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzi zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzt.zzj(this.zza);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    private final WeakReference zzj = new WeakReference(null);

    public zzt(Context context, zzi zziVar, String str, Intent intent, com.google.android.play.core.review.zze zzeVar, zzo zzoVar) {
        this.zzb = context;
        this.zzc = zziVar;
        this.zzi = intent;
    }

    public static /* synthetic */ void zzj(zzt zztVar) {
        zztVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzo zzoVar = (zzo) zztVar.zzj.get();
        if (zzoVar != null) {
            zztVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzoVar.zza();
        } else {
            zztVar.zzc.zzc("%s : Binder has died.", zztVar.zzd);
            Iterator it = zztVar.zze.iterator();
            while (it.hasNext()) {
                ((zzj) it.next()).zzc(zztVar.zzv());
            }
            zztVar.zze.clear();
        }
        synchronized (zztVar.zzg) {
            zztVar.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(final zzt zztVar, final TaskCompletionSource taskCompletionSource) {
        zztVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzl
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzt(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void zzp(zzt zztVar, zzj zzjVar) throws Throwable {
        if (zztVar.zzn != null || zztVar.zzh) {
            if (!zztVar.zzh) {
                zzjVar.run();
                return;
            } else {
                zztVar.zzc.zzc(Ig.wd("'\u0001\u001b>T$\u0001\u0002/&T=\u0019\u0018y[rW`\u001dy\u001fG\u0017qZAb>\u0013?", (short) (C1499aX.Xd() ^ (-18080))), new Object[0]);
                zztVar.zze.add(zzjVar);
                return;
            }
        }
        zztVar.zzc.zzc(C1561oA.yd("|!\u001b%!\u0018*\u001aK\r\u0013\u0017\u0014\u0018\u001c\u0014c71`</+d/ ,/)\"#j", (short) (C1499aX.Xd() ^ (-29465))), new Object[0]);
        zztVar.zze.add(zzjVar);
        zzr zzrVar = new zzr(zztVar, null);
        zztVar.zzm = zzrVar;
        zztVar.zzh = true;
        Context context = zztVar.zzb;
        Intent intent = zztVar.zzi;
        Class<?> cls = Class.forName(C1561oA.Yd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (Od.Xd() ^ (-23504))));
        Class<?>[] clsArr = new Class[3];
        short sXd = (short) (OY.Xd() ^ 32379);
        short sXd2 = (short) (OY.Xd() ^ 30332);
        int[] iArr = new int["P^Udb]Y$Zggn`jq,Hnugqx".length()];
        QB qb = new QB("P^Udb]Y$Zggn`jq,Hnugqx");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        short sXd3 = (short) (FB.Xd() ^ 7666);
        short sXd4 = (short) (FB.Xd() ^ 22464);
        int[] iArr2 = new int["\n6\u0012>!J+\u0013.(N.I<l\u0001PLCa7WGKU{iFbU}e\u0007".length()];
        QB qb2 = new QB("\n6\u0012>!J+\u0013.(N.I<l\u0001PLCa7WGKU{iFbU}e\u0007");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        clsArr[2] = Integer.TYPE;
        Object[] objArr = {intent, zzrVar, 1};
        Method method = cls.getMethod(ZO.xd("X\fAL5\u0005mq\b;E", (short) (OY.Xd() ^ 22970), (short) (OY.Xd() ^ 13975)), clsArr);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(context, objArr)).booleanValue()) {
                return;
            }
            zztVar.zzc.zzc(C1626yg.Ud("xA:\u000bwCK\u0019A]`\u001dET\u0007H[VcU\"\u0004\u0011yof:p\u0006l", (short) (OY.Xd() ^ 15380), (short) (OY.Xd() ^ 29795)), new Object[0]);
            zztVar.zzh = false;
            Iterator it = zztVar.zze.iterator();
            while (it.hasNext()) {
                ((zzj) it.next()).zzc(new zzu());
            }
            zztVar.zze.clear();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* bridge */ /* synthetic */ void zzq(zzt zztVar) {
        zztVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zztVar.zzn.asBinder().linkToDeath(zztVar.zzk, 0);
        } catch (RemoteException e2) {
            zztVar.zzc.zzb(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzt zztVar) {
        zztVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zztVar.zzn.asBinder().unlinkToDeath(zztVar.zzk, 0);
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

    public final void zzs(zzj zzjVar, TaskCompletionSource taskCompletionSource) {
        zzm zzmVar = new zzm(this, zzjVar.zzb(), taskCompletionSource, zzjVar);
        Handler handlerZzc = zzc();
        short sXd = (short) (ZN.Xd() ^ 477);
        int[] iArr = new int["\tf0\u0019\b.7S_q,fNW3[)\"".length()];
        QB qb = new QB("\tf0\u0019\b.7S_q,fNW3[)\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1607wl.Xd() ^ 14149);
        int[] iArr2 = new int["0&:$o-!-%j\u000e0('\u0019\u0019\"\u001a".length()];
        QB qb2 = new QB("0&:$o-!-%j\u000e0('\u0019\u0019\"\u001a");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {zzmVar};
        Method method = cls.getMethod(C1593ug.zd("HHMO", (short) (ZN.Xd() ^ 9481), (short) (ZN.Xd() ^ 17757)), clsArr);
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

    public final void zzu(TaskCompletionSource taskCompletionSource) throws Throwable {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzn zznVar = new zzn(this);
        Handler handlerZzc = zzc();
        Class<?> cls = Class.forName(C1561oA.od("y\u0006z\b\u0004|v?\u007f\u0003<Umynumy", (short) (FB.Xd() ^ 27355)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 1796);
        int[] iArr = new int["<4J6\u0004C9GA\t.RLMACNH".length()];
        QB qb = new QB("<4J6\u0004C9GA\t.RLMACNH");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {zznVar};
        Method method = cls.getMethod(Wg.Zd("r\u0007gF", (short) (ZN.Xd() ^ 11820), (short) (ZN.Xd() ^ 16107)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
