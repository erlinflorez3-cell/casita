package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzt implements ServiceConnection {
    int state;
    final Messenger zzch;
    zzy zzci;
    final Queue<zzz<?>> zzcj;
    final SparseArray<zzz<?>> zzck;
    final /* synthetic */ zzr zzcl;

    private zzt(zzr zzrVar) throws Throwable {
        this.zzcl = zzrVar;
        this.state = 0;
        short sXd = (short) (C1607wl.Xd() ^ 30250);
        int[] iArr = new int["\u001faI/t2Y\"5\u0015UQJ<!sd".length()];
        QB qb = new QB("\u001faI/t2Y\"5\u0015UQJ<!sd");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(EO.Od("q8\u001bY\u0017\\{\u0003aST%a", (short) (C1607wl.Xd() ^ 11091)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzch = new Messenger(new com.google.android.gms.internal.gcm.zzj((Looper) declaredMethod.invoke(null, objArr), new Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu
                private final zzt zzcm;

                {
                    this.zzcm = this;
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.zzcm.zzd(message);
                }
            }));
            this.zzcj = new ArrayDeque();
            this.zzck = new SparseArray<>();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void zzt() {
        this.zzcl.zzce.execute(new Runnable(this) { // from class: com.google.android.gms.iid.zzw
            private final zzt zzcm;

            {
                this.zzcm = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                final zzt zztVar = this.zzcm;
                while (true) {
                    synchronized (zztVar) {
                        if (zztVar.state != 2) {
                            return;
                        }
                        if (zztVar.zzcj.isEmpty()) {
                            zztVar.zzu();
                            return;
                        }
                        final zzz<?> zzzVarPoll = zztVar.zzcj.poll();
                        zztVar.zzck.put(zzzVarPoll.zzcp, zzzVarPoll);
                        zztVar.zzcl.zzce.schedule(new Runnable(zztVar, zzzVarPoll) { // from class: com.google.android.gms.iid.zzx
                            private final zzt zzcm;
                            private final zzz zzcn;

                            {
                                this.zzcm = zztVar;
                                this.zzcn = zzzVarPoll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzcm.zzg(this.zzcn.zzcp);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable(C1561oA.Qd("\u001e5BA2:2/;\u00117)\b0,'/4", (short) (Od.Xd() ^ (-24572))), 3)) {
                            short sXd = (short) (C1607wl.Xd() ^ 26037);
                            short sXd2 = (short) (C1607wl.Xd() ^ 1927);
                            int[] iArr = new int["1JYZMWQP^6^R3][Xbi".length()];
                            QB qb = new QB("1JYZMWQP^6^R3][Xbi");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                                i2++;
                            }
                            new String(iArr, 0, i2);
                            String strValueOf = String.valueOf(zzzVarPoll);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                            short sXd3 = (short) (OY.Xd() ^ 16509);
                            int[] iArr2 = new int["\u0005\u0016\u001e\u0013\u0017\u001b\u0013J".length()];
                            QB qb2 = new QB("\u0005\u0016\u001e\u0013\u0017\u001b\u0013J");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                                i3++;
                            }
                            sb.append(new String(iArr2, 0, i3)).append(strValueOf).toString();
                        }
                        Context context = zztVar.zzcl.zzl;
                        Messenger messenger = zztVar.zzch;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = zzzVarPoll.what;
                        messageObtain.arg1 = zzzVarPoll.zzcp;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(C1561oA.Kd("WWOBMf", (short) (ZN.Xd() ^ 15390)), zzzVarPoll.zzw());
                        String strZd = Wg.Zd("Nf\u001f", (short) (C1607wl.Xd() ^ 9449), (short) (C1607wl.Xd() ^ 20722));
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(C1561oA.Xd("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d", (short) (ZN.Xd() ^ 31090))).getMethod(Wg.vd("ebtO[\\g\\]ZFX_V", (short) (C1580rY.Xd() ^ (-13229))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            bundle.putString(strZd, (String) method.invoke(context, objArr));
                            bundle.putBundle(Qg.kd("nj|h", (short) (Od.Xd() ^ (-21242)), (short) (Od.Xd() ^ (-6984))), zzzVarPoll.zzcr);
                            messageObtain.setData(bundle);
                            try {
                                zzy zzyVar = zztVar.zzci;
                                if (zzyVar.zzad != null) {
                                    zzyVar.zzad.send(messageObtain);
                                } else {
                                    if (zzyVar.zzco == null) {
                                        throw new IllegalStateException(hg.Vd("[\b\f~5\u0002x\u0006\u0005u}ur~~*jzl&syon", (short) (C1607wl.Xd() ^ 16952), (short) (C1607wl.Xd() ^ 1130)));
                                    }
                                    zzyVar.zzco.send(messageObtain);
                                }
                            } catch (RemoteException e2) {
                                zztVar.zzd(2, e2.getMessage());
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.zzci = new zzy(iBinder);
            this.state = 2;
            zzt();
        } catch (RemoteException e2) {
            zzd(0, e2.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        zzd(2, "Service disconnected");
    }

    final synchronized void zzd(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "Disconnected: ".concat(strValueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i3 = this.state;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                this.state = 4;
                return;
            } else {
                if (i3 == 4) {
                    return;
                }
                throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.state).toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.state = 4;
        ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
        zzaa zzaaVar = new zzaa(i2, str);
        Iterator<zzz<?>> it = this.zzcj.iterator();
        while (it.hasNext()) {
            it.next().zzd(zzaaVar);
        }
        this.zzcj.clear();
        for (int i4 = 0; i4 < this.zzck.size(); i4++) {
            this.zzck.valueAt(i4).zzd(zzaaVar);
        }
        this.zzck.clear();
    }

    final boolean zzd(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(41).append("Received response to request: ").append(i2).toString();
        }
        synchronized (this) {
            zzz<?> zzzVar = this.zzck.get(i2);
            if (zzzVar == null) {
                new StringBuilder(50).append("Received response for unknown request: ").append(i2).toString();
                return true;
            }
            this.zzck.remove(i2);
            zzu();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzzVar.zzd(new zzaa(4, "Not supported by GmsCore"));
            } else {
                zzzVar.zzh(data);
            }
            return true;
        }
    }

    final synchronized boolean zze(zzz zzzVar) {
        int i2 = this.state;
        if (i2 == 0) {
            this.zzcj.add(zzzVar);
            Preconditions.checkState(this.state == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
            }
            this.state = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (ConnectionTracker.getInstance().bindService(this.zzcl.zzl, intent, this, 1)) {
                this.zzcl.zzce.schedule(new Runnable(this) { // from class: com.google.android.gms.iid.zzv
                    private final zzt zzcm;

                    {
                        this.zzcm = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzcm.zzv();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zzd(0, "Unable to bind to service");
            }
            return true;
        }
        if (i2 == 1) {
            this.zzcj.add(zzzVar);
            return true;
        }
        if (i2 == 2) {
            this.zzcj.add(zzzVar);
            zzt();
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.state).toString());
    }

    final synchronized void zzg(int i2) {
        zzz<?> zzzVar = this.zzck.get(i2);
        if (zzzVar != null) {
            new StringBuilder(31).append("Timing out request: ").append(i2).toString();
            this.zzck.remove(i2);
            zzzVar.zzd(new zzaa(3, "Timed out waiting for response"));
            zzu();
        }
    }

    final synchronized void zzu() {
        if (this.state == 2 && this.zzcj.isEmpty() && this.zzck.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
            }
            this.state = 3;
            ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
        }
    }

    final synchronized void zzv() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }
}
