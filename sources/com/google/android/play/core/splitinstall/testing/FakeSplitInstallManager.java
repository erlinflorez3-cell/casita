package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public class FakeSplitInstallManager implements SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private final Handler zzc;
    private final Context zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final zzby zzf;
    private final zzbs zzg;
    private final com.google.android.play.core.splitinstall.internal.zzt zzh;
    private final com.google.android.play.core.splitinstall.internal.zzt zzi;
    private final Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final File zzl;
    private final AtomicReference zzm;
    private final Set zzn;
    private final Set zzo;
    private final AtomicBoolean zzp;
    private final zzj zzq;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public FakeSplitInstallManager(Context context, File file) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (ZN.Xd() ^ 568))).getMethod(Wg.vd("\u001c\u001b'\u0004\u0012\u0015\u001a\u0011$#\t\u001d&\u001f", (short) (C1633zX.Xd() ^ (-9470))), new Class[0]);
        try {
            method.setAccessible(true);
            this(context, file, new com.google.android.play.core.splitinstall.zzs(context, (String) method.invoke(context, objArr)), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zze
                @Override // com.google.android.play.core.splitinstall.internal.zzby
                public final Object zza() {
                    int i2 = FakeSplitInstallManager.zza;
                    return zzv.zza;
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    FakeSplitInstallManager(Context context, File file, com.google.android.play.core.splitinstall.zzs zzsVar, zzby zzbyVar) throws Throwable {
        Executor executorZza = com.google.android.play.core.splitcompat.zzd.zza();
        zzbs zzbsVar = new zzbs(context);
        zzj zzjVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.zzj
        };
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("s\u007ft\u0002}vp9y|6Suttht", (short) (C1633zX.Xd() ^ (-22557)), (short) (C1633zX.Xd() ^ (-17233)))).getDeclaredMethod(hg.Vd("1.<\u0014'.2\u000f100$0", (short) (C1580rY.Xd() ^ (-22011)), (short) (C1580rY.Xd() ^ (-27087))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzc = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.zzm = new AtomicReference();
            this.zzn = Collections.synchronizedSet(new HashSet());
            this.zzo = Collections.synchronizedSet(new HashSet());
            this.zzp = new AtomicBoolean(false);
            this.zzd = context;
            this.zzl = file;
            this.zze = zzsVar;
            this.zzf = zzbyVar;
            this.zzj = executorZza;
            this.zzg = zzbsVar;
            this.zzq = zzjVar;
            this.zzi = new com.google.android.play.core.splitinstall.internal.zzt();
            this.zzh = new com.google.android.play.core.splitinstall.internal.zzt();
            this.zzk = com.google.android.play.core.splitinstall.zzo.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final Task zzk(final int i2) {
        zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                int i3 = i2;
                int i4 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i3, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return Tasks.forException(new SplitInstallException(i2));
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() throws Throwable {
        try {
            Context context = this.zzd;
            Class<?> cls = Class.forName(C1561oA.ud("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (Od.Xd() ^ (-14783))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 19554);
            int[] iArr = new int["{z\u0007cy|\u0002xsrWl~rut\u0017".length()];
            QB qb = new QB("{z\u0007cy|\u0002xsrWl~rut\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.zzd;
                short sXd2 = (short) (ZN.Xd() ^ 11488);
                int[] iArr2 = new int["~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(".length()];
                QB qb2 = new QB("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (ZN.Xd() ^ 4464);
                short sXd4 = (short) (ZN.Xd() ^ 16705);
                int[] iArr3 = new int["\u0015\u0014$\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0006\u001a' ".length()];
                QB qb3 = new QB("\u0015\u0014$\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0006\u001a' ");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    Class<?> cls3 = Class.forName(Jg.Wd("2v%j\u001eP\u0003\u0005t\u0018O\u000e4u4%\"WoH\u0012K\f<y0Py?j(`&", (short) (C1580rY.Xd() ^ (-23586)), (short) (C1580rY.Xd() ^ (-1269))));
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Class.forName(ZO.xd("\u000e|JxA2\u001e\u0003\u00135!\n;\nQG", (short) (ZN.Xd() ^ 31075), (short) (ZN.Xd() ^ 19403)));
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls3.getMethod(C1626yg.Ud("(\u0019O|=XxFb`$T[<", (short) (Od.Xd() ^ (-1449)), (short) (Od.Xd() ^ (-14621))), clsArr3);
                    try {
                        method3.setAccessible(true);
                        com.google.android.play.core.splitinstall.zzk zzkVarZza = this.zze.zza(((PackageInfo) method3.invoke(packageManager, objArr3)).applicationInfo.metaData);
                        if (zzkVarZza != null) {
                            return zzkVarZza;
                        }
                        throw new IllegalStateException(Ig.wd("=!\u007fP>e\u007f5\u0019^a?}\u000bQ+\u0012\u0001N% ;%'w+Hf8M\u000bq\u001b}\u001dZ\u0001\u001clF:\u000eNhCg\u0013En\b@\\4\u0019\bk|\u0010\u001bd,\u0003BO.x1d~U7\n[\u0010\u0013\u000b>.\u0014tq\u001c\u0007s_YRj~~2*3\u0017#\u007f\u0012\u0004nY6LD]M\u0012\t2vm_xF\u001fI<`^5tN\u000b+\u0004F\"8.YB%\\ \u0010q<flh9@g/'\u0013Vv[\\*\u0004x#", (short) (C1580rY.Xd() ^ (-20987))));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            short sXd5 = (short) (C1633zX.Xd() ^ (-22370));
            int[] iArr4 = new int["H*\\' ws2^\u0013<%]]~\u0012\u0003Z\u0007dP\t]a2(\t9\u001b\u001bmR8$".length()];
            QB qb4 = new QB("H*\\' ws2^\u0013<%]]~\u0012\u0003Z\u0007dP\t]a2(\t9\u001b\u001bmR8$");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd4.CK(iKK4));
                i5++;
            }
            throw new IllegalStateException(new String(iArr4, 0, i5), e5);
        }
    }

    private final SplitInstallSessionState zzm() {
        return (SplitInstallSessionState) this.zzm.get();
    }

    private final synchronized SplitInstallSessionState zzn(zzr zzrVar) {
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        SplitInstallSessionState splitInstallSessionStateZza = zzrVar.zza(splitInstallSessionStateZzm);
        AtomicReference atomicReference = this.zzm;
        while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, splitInstallSessionStateZzm, splitInstallSessionStateZza)) {
            if (atomicReference.get() != splitInstallSessionStateZzm) {
                return null;
            }
        }
        return splitInstallSessionStateZza;
    }

    private static String zzo(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(List list, List list2, List list3, long j2, boolean z2) {
        this.zzk.zza().zzd(list, new zzq(this, list2, list3, j2, z2, list));
    }

    private final void zzq(final SplitInstallSessionState splitInstallSessionState) throws Throwable {
        Handler handler = this.zzc;
        Object[] objArr = {new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(splitInstallSessionState);
            }
        }};
        Method method = Class.forName(C1561oA.Qd("LXMZVOI\u0012RU\u000f(@LAH@L", (short) (FB.Xd() ^ 18826))).getMethod(C1561oA.od("\u0005\u0003\u0006\u0006", (short) (C1580rY.Xd() ^ (-21869))), Class.forName(C1593ug.zd("ph~j8wm{u=b\u0007\u0001\u0002uw\u0003|", (short) (OY.Xd() ^ 12936), (short) (OY.Xd() ^ 13265))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzr(List list, List list2, long j2) throws Throwable {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        Long lValueOf = Long.valueOf(j2);
        zzs(5, 0, lValueOf, lValueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzs(final int i2, final int i3, final Long l2, final Long l3, final List list, final Integer num, final List list2) throws Throwable {
        SplitInstallSessionState splitInstallSessionStateZzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                Integer num2 = num;
                int i4 = i2;
                int i5 = i3;
                Long l4 = l2;
                Long l5 = l3;
                List<String> listModuleNames = list;
                List<String> listLanguages = list2;
                int i6 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    splitInstallSessionState = SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                int iSessionId = num2 == null ? splitInstallSessionState.sessionId() : num2.intValue();
                long jBytesDownloaded = l4 == null ? splitInstallSessionState.bytesDownloaded() : l4.longValue();
                long jLongValue = l5 == null ? splitInstallSessionState.totalBytesToDownload() : l5.longValue();
                if (listModuleNames == null) {
                    listModuleNames = splitInstallSessionState.moduleNames();
                }
                if (listLanguages == null) {
                    listLanguages = splitInstallSessionState.languages();
                }
                return SplitInstallSessionState.create(iSessionId, i4, i5, jBytesDownloaded, jLongValue, listModuleNames, listLanguages);
            }
        });
        if (splitInstallSessionStateZzn == null) {
            return false;
        }
        zzq(splitInstallSessionStateZzn);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(final int i2) throws Throwable {
        try {
            SplitInstallSessionState splitInstallSessionStateZzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzh
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final int i3 = i2;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzo
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            int iStatus;
                            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
                            int i4 = i3;
                            int i5 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 != null && i4 == splitInstallSessionState2.sessionId() && ((iStatus = splitInstallSessionState2.status()) == 1 || iStatus == 2 || iStatus == 8 || iStatus == 9 || iStatus == 7)) {
                                return SplitInstallSessionState.create(i4, 7, splitInstallSessionState2.errorCode(), splitInstallSessionState2.bytesDownloaded(), splitInstallSessionState2.totalBytesToDownload(), splitInstallSessionState2.moduleNames(), splitInstallSessionState2.languages());
                            }
                            throw new SplitInstallException(-3);
                        }
                    });
                }
            });
            if (splitInstallSessionStateZzn != null) {
                zzq(splitInstallSessionStateZzn);
            }
            return Tasks.forResult(null);
        } catch (zzbx e2) {
            return Tasks.forException(e2.zzb(SplitInstallException.class));
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        if (this.zze.zzd() != null) {
            hashSet.addAll(this.zze.zzd());
        }
        hashSet.addAll(this.zzo);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.zze.zzc());
        hashSet.addAll(this.zzn);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i2) {
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        return (splitInstallSessionStateZzm == null || splitInstallSessionStateZzm.sessionId() != i2) ? Tasks.forException(new SplitInstallException(-4)) : Tasks.forResult(splitInstallSessionStateZzm);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        return Tasks.forResult(splitInstallSessionStateZzm != null ? Collections.singletonList(splitInstallSessionStateZzm) : Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z2) {
        this.zzp.set(z2);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i2) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(final com.google.android.play.core.splitinstall.SplitInstallRequest r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.gms.tasks.Task");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zzb(splitInstallStateUpdatedListener);
    }

    final File zzc() {
        return this.zzl;
    }

    final /* synthetic */ void zzf(final long j2, final List list, final List list2, final List list3) throws Throwable {
        long jMin = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            jMin = Math.min(j2, jMin + (j2 / 3));
            zzs(2, 0, Long.valueOf(jMin), Long.valueOf(j2), null, null, null);
            SystemClock.sleep(zzb);
            SplitInstallSessionState splitInstallSessionStateZzm = zzm();
            if (splitInstallSessionStateZzm.status() == 9 || splitInstallSessionStateZzm.status() == 7 || splitInstallSessionStateZzm.status() == 6) {
                return;
            }
        }
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzh(list, list2, list3, j2);
            }
        });
    }

    final /* synthetic */ void zzg(SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    final /* synthetic */ void zzh(List list, List list2, List list3, long j2) throws Throwable {
        if (this.zzp.get()) {
            zzs(6, -6, null, null, null, null, null);
        } else if (this.zzk.zza() != null) {
            zzp(list, list2, list3, j2, false);
        } else {
            zzr(list2, list3, j2);
        }
    }

    final /* synthetic */ void zzi(List list, final List list2) throws Throwable {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strZza = zzbw.zza(file);
            Uri uriFromFile = Uri.fromFile(file);
            short sXd = (short) (C1580rY.Xd() ^ (-22259));
            int[] iArr = new int["GUL[YTP\u001bW]dV`g\"VYkahh)RFCV".length()];
            QB qb = new QB("GUL[YTP\u001bW]dV`g\"VYkahh)RFCV");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Intent intent = new Intent(new String(iArr, 0, i2));
            Context context = this.zzd;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("\u001dOR\fUs\\\u0013TD\u0010c!N`F\b\u001aeWT\\&", (short) (ZN.Xd() ^ 5404), (short) (ZN.Xd() ^ 2755))).getMethod(C1561oA.Xd("\u000e\r\u001dl\u001a\u001a!\u0013\u001d$\u0003\u0017&#!,\u001c*", (short) (C1633zX.Xd() ^ (-2431))), new Class[0]);
            try {
                method.setAccessible(true);
                intent.setDataAndType(uriFromFile, ((ContentResolver) method.invoke(context, objArr)).getType(uriFromFile));
                intent.addFlags(1);
                intent.putExtra(Wg.vd("]^Rb`XQ_ITK", (short) (C1580rY.Xd() ^ (-24891))), zzo(strZza));
                intent.putExtra(Qg.kd("\u000f\u000b\u0006\u0002\fu~x", (short) (C1499aX.Xd() ^ (-27700)), (short) (C1499aX.Xd() ^ (-6013))), strZza);
                arrayList.add(intent);
                arrayList2.add(zzo(zzbw.zza(file)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        if (splitInstallSessionStateZzm == null) {
            return;
        }
        final long j2 = splitInstallSessionStateZzm.totalBytesToDownload();
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzf(j2, arrayList, arrayList2, list2);
            }
        });
    }
}
