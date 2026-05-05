package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
final class zzc extends BroadcastReceiver {
    final /* synthetic */ RemoteModelDownloadManager zza;
    private final long zzb;
    private final TaskCompletionSource zzc;

    /* synthetic */ zzc(RemoteModelDownloadManager remoteModelDownloadManager, long j2, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.zza = remoteModelDownloadManager;
        this.zzb = j2;
        this.zzc = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context applicationContext;
        Object[] objArr;
        Method method;
        short sXd = (short) (C1580rY.Xd() ^ (-25432));
        int[] iArr = new int["\u001f10-\u001f\u001c$.)\u001f \"\u0017\u0019\u0017 .".length()];
        QB qb = new QB("\u001f10-\u001f\u001c$.)\u001f \"\u0017\u0019\u0017 .");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        long longExtra = intent.getLongExtra(new String(iArr, 0, i2), -1L);
        if (longExtra != this.zzb) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.zza;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                applicationContext = this.zza.zze.getApplicationContext();
                Class<?> cls = Class.forName(C1561oA.Yd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (C1607wl.Xd() ^ 15780)));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1633zX.Xd() ^ (-5775));
                short sXd3 = (short) (C1633zX.Xd() ^ (-17936));
                int[] iArr2 = new int["\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^s%#\u0016\u001a\u001a\u0019,.\r! #(6&4".length()];
                QB qb2 = new QB("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^s%#\u0016\u001a\u001a\u0019,.\r! #(6&4");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                objArr = new Object[]{this};
                method = cls.getMethod(Jg.Wd("\u000bIcD\u001c\u00102)kj\\c+?9\u0014x\u001a", (short) (ZN.Xd() ^ 29710), (short) (ZN.Xd() ^ 30038)), clsArr);
            } catch (IllegalArgumentException e2) {
                RemoteModelDownloadManager.zza.w(ZO.xd("\u000f&)\u0011<s6nZ'!8\u001a4l=Pg\u0002/", (short) (OY.Xd() ^ 15153), (short) (OY.Xd() ^ 20724)), C1626yg.Ud("\u0001qeo\u0019Q\u001b9\u000f\u000bps\u001e,T\u0014cY c-B\u007fq\u0012#\u001cHz\u001dB\u0016\f9;\u0006cTfi\u0016\u000fnEy]FFE'_&Wf'DJPf\u007fq \u0013\u00126Fwd-%(H)fhz^C\u0010a\u000eJk", (short) (C1633zX.Xd() ^ (-20621)), (short) (C1633zX.Xd() ^ (-120))), e2);
            }
            try {
                method.setAccessible(true);
                method.invoke(applicationContext, objArr);
                this.zza.zzc.remove(this.zzb);
                this.zza.zzd.remove(this.zzb);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.zza;
                zzsh zzshVar = remoteModelDownloadManager2.zzi;
                zzry zzryVarZzg = zzsk.zzg();
                RemoteModel remoteModel = remoteModelDownloadManager2.zzg;
                Long lValueOf = Long.valueOf(longExtra);
                zzshVar.zze(zzryVarZzg, remoteModel, false, remoteModelDownloadManager2.getFailureReason(lValueOf));
                this.zzc.setException(this.zza.zzl(lValueOf));
                return;
            }
            if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.zza;
                zzsh zzshVar2 = remoteModelDownloadManager3.zzi;
                zzry zzryVarZzg2 = zzsk.zzg();
                RemoteModel remoteModel2 = remoteModelDownloadManager3.zzg;
                zzsi zzsiVarZzh = zzsj.zzh();
                zzsiVarZzh.zzb(zzmu.NO_ERROR);
                zzsiVarZzh.zze(true);
                zzsiVarZzh.zzd(this.zza.zzg.getModelType());
                zzsiVarZzh.zza(zzna.SUCCEEDED);
                zzshVar2.zzg(zzryVarZzg2, remoteModel2, zzsiVarZzh.zzh());
                this.zzc.setResult(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.zza;
        remoteModelDownloadManager4.zzi.zze(zzsk.zzg(), remoteModelDownloadManager4.zzg, false, 0);
        this.zzc.setException(new MlKitException(Ig.wd("l]$\u0001\u0007uJ\r>51\u0016=J;&r)7&wV)$", (short) (ZN.Xd() ^ 25108)), 13));
    }
}
