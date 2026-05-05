package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcd implements ServiceConnection {
    final /* synthetic */ zzce zza;
    private volatile boolean zzb;
    private volatile zzfa zzc;

    protected zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.zza.zzI("Service connected with null binder");
                    return;
                }
                zzfa zzfaVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        zzfaVar = iInterfaceQueryLocalInterface instanceof zzfa ? (zzfa) iInterfaceQueryLocalInterface : new zzfa(iBinder);
                        this.zza.zzN("Bound to IAnalyticsService interface");
                    } else {
                        this.zza.zzJ("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.zza.zzI("Service connect failed to get IAnalyticsService");
                }
                if (zzfaVar == null) {
                    try {
                        ConnectionTracker.getInstance().unbindService(this.zza.zzo(), this.zza.zza);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else if (this.zzb) {
                    this.zzc = zzfaVar;
                } else {
                    this.zza.zzQ("onServiceConnected received after the timeout limit");
                    this.zza.zzq().zzi(new zzcb(this, zzfaVar));
                }
            } finally {
                notifyAll();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().zzi(new zzcc(this, componentName));
    }

    public final zzfa zza() {
        com.google.android.gms.analytics.zzr.zzh();
        Intent intent = new Intent(hg.Vd("\u001b&#b\u001b\"!\u0018\u001c\u0014[\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\f\u0011\u0016O\u0002\u000e\u007f\n\u0016\u0010\u0004|\fE\nz\u0007\n{tu=aaM]^", (short) (FB.Xd() ^ 6872), (short) (FB.Xd() ^ 25706)));
        String strUd = C1561oA.ud("1<9x187.2*q$0%2.'!i\"',", (short) (ZN.Xd() ^ 5777));
        short sXd = (short) (OY.Xd() ^ 10448);
        int[] iArr = new int["\\ih*dmng]W!UcZigRN\u0019SZa\u001dQOCO]YOJ[\u0007M@NSGBE~\u0013A5AOKA,=\u001e1?D83&".length()];
        QB qb = new QB("\\ih*dmng]W!UcZigRN\u0019SZa\u001dQOCO]YOJ[\u0007M@NSGBE~\u0013A5AOKA,=\u001e1?D83&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        intent.setComponent(new ComponentName(strUd, new String(iArr, 0, i2)));
        Context contextZzo = this.zza.zzo();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("IWN][VR\u001dS``gYcj%;hhoaur", (short) (C1607wl.Xd() ^ 10068))).getMethod(Xg.qd("ZYiFX[d[baK_le", (short) (C1607wl.Xd() ^ 18223), (short) (C1607wl.Xd() ^ 29488)), new Class[0]);
        try {
            method.setAccessible(true);
            intent.putExtra(Jg.Wd("*g*L ?\u0005?v1m\u0019dYW\u0010", (short) (C1633zX.Xd() ^ (-5719)), (short) (C1633zX.Xd() ^ (-537))), (String) method.invoke(contextZzo, objArr));
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            synchronized (this) {
                this.zzc = null;
                this.zzb = true;
                boolean zBindService = connectionTracker.bindService(contextZzo, intent, this.zza.zza, 129);
                this.zza.zzO(ZO.xd("m\f0`H2\u0019t\u000bdNm\nM5bGX#\u0015&\u0003wAz", (short) (C1633zX.Xd() ^ (-16327)), (short) (C1633zX.Xd() ^ (-16741))), Boolean.valueOf(zBindService));
                if (!zBindService) {
                    this.zzb = false;
                    return null;
                }
                try {
                    this.zza.zzw();
                    wait(((Long) zzew.zzL.zzb()).longValue());
                } catch (InterruptedException unused) {
                    this.zza.zzQ(C1626yg.Ud("nK\u0007uT{{I\u001di/[,x\u000f?R\b#+k;e\u0017m\u0010}P\u001b}H:nZH\nh`.d", (short) (C1633zX.Xd() ^ (-1222)), (short) (C1633zX.Xd() ^ (-23976))));
                }
                this.zzb = false;
                zzfa zzfaVar = this.zzc;
                this.zzc = null;
                if (zzfaVar == null) {
                    this.zza.zzI(Ig.wd("%\u0018a<K$RC/dlUL\u000b\nh,\n+J\u0003TT@z\u001d+P\u0003H9e\u0003E5c\u001a/?X&C\"-xeS\u0016Sp!FnqW40\u000fBKJ-\f[\u000fd\u000eI84\u0006", (short) (Od.Xd() ^ (-14981))));
                }
                return zzfaVar;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
