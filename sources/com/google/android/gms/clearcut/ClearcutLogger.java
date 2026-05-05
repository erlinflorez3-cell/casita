package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zzge;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzj;
import com.google.android.gms.internal.clearcut.zzp;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.TimeZone;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class ClearcutLogger {

    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API;
    private static final Api.AbstractClientBuilder<zzj, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final Api.ClientKey<zzj> CLIENT_KEY;
    private static final ExperimentTokens[] zze;
    private static final String[] zzf;
    private static final byte[][] zzg;
    private final String packageName;
    private final Context zzh;
    private final int zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private final boolean zzn;
    private zzge.zzv.zzb zzo;
    private final com.google.android.gms.clearcut.zzb zzp;
    private final Clock zzq;
    private zzc zzr;
    private final zza zzs;

    public class LogEventBuilder {
        private final zzha zzaa;
        private boolean zzab;
        private String zzj;
        private int zzk;
        private String zzl;
        private String zzm;
        private zzge.zzv.zzb zzo;
        private final zzb zzt;
        private ArrayList<Integer> zzu;
        private ArrayList<String> zzv;
        private ArrayList<Integer> zzw;
        private ArrayList<ExperimentTokens> zzx;
        private ArrayList<byte[]> zzy;
        private boolean zzz;

        private LogEventBuilder(ClearcutLogger clearcutLogger, byte[] bArr) {
            this(bArr, (zzb) null);
        }

        private LogEventBuilder(byte[] bArr, zzb zzbVar) {
            this.zzk = ClearcutLogger.this.zzk;
            this.zzj = ClearcutLogger.this.zzj;
            this.zzl = ClearcutLogger.this.zzl;
            this.zzm = null;
            this.zzo = ClearcutLogger.this.zzo;
            this.zzu = null;
            this.zzv = null;
            this.zzw = null;
            this.zzx = null;
            this.zzy = null;
            this.zzz = true;
            zzha zzhaVar = new zzha();
            this.zzaa = zzhaVar;
            this.zzab = false;
            this.zzl = ClearcutLogger.this.zzl;
            this.zzm = null;
            zzhaVar.zzbkc = zzaa.zze(ClearcutLogger.this.zzh);
            zzhaVar.zzbjf = ClearcutLogger.this.zzq.currentTimeMillis();
            zzhaVar.zzbjg = ClearcutLogger.this.zzq.elapsedRealtime();
            zzc unused = ClearcutLogger.this.zzr;
            zzhaVar.zzbju = TimeZone.getDefault().getOffset(zzhaVar.zzbjf) / 1000;
            if (bArr != null) {
                zzhaVar.zzbjp = bArr;
            }
            this.zzt = null;
        }

        /* synthetic */ LogEventBuilder(ClearcutLogger clearcutLogger, byte[] bArr, com.google.android.gms.clearcut.zza zzaVar) {
            this(clearcutLogger, bArr);
        }

        public void log() {
            if (this.zzab) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.zzab = true;
            zze zzeVar = new zze(new zzr(ClearcutLogger.this.packageName, ClearcutLogger.this.zzi, this.zzk, this.zzj, this.zzl, this.zzm, ClearcutLogger.this.zzn, this.zzo), this.zzaa, null, null, ClearcutLogger.zzb((ArrayList) null), null, ClearcutLogger.zzb((ArrayList) null), null, null, this.zzz);
            if (ClearcutLogger.this.zzs.zza(zzeVar)) {
                ClearcutLogger.this.zzp.zzb(zzeVar);
            } else {
                PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, (GoogleApiClient) null);
            }
        }

        public LogEventBuilder setEventCode(int i2) {
            this.zzaa.zzbji = i2;
            return this;
        }
    }

    public interface zza {
        boolean zza(zze zzeVar);
    }

    public interface zzb {
        byte[] zza();
    }

    public static class zzc {
    }

    static {
        Api.ClientKey<zzj> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.clearcut.zza zzaVar = new com.google.android.gms.clearcut.zza();
        CLIENT_BUILDER = zzaVar;
        API = new Api<>("ClearcutLogger.API", zzaVar, clientKey);
        zze = new ExperimentTokens[0];
        zzf = new String[0];
        zzg = new byte[0][];
    }

    private ClearcutLogger(Context context, int i2, String str, String str2, String str3, boolean z2, com.google.android.gms.clearcut.zzb zzbVar, Clock clock, zzc zzcVar, zza zzaVar) throws Throwable {
        this.zzk = -1;
        this.zzo = zzge.zzv.zzb.DEFAULT;
        this.zzh = context;
        short sXd = (short) (C1499aX.Xd() ^ (-15731));
        int[] iArr = new int["JXKZTOG\u0012DQMTBLO\n\u001cIEL:NG".length()];
        QB qb = new QB("JXKZTOG\u0012DQMTBLO\n\u001cIEL:NG");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Qg.kd("85C\u001e./6+0-\u0015'2)", (short) (C1499aX.Xd() ^ (-25853)), (short) (C1499aX.Xd() ^ (-19709))), new Class[0]);
        try {
            method.setAccessible(true);
            this.packageName = (String) method.invoke(context, objArr);
            this.zzi = zza(context);
            this.zzk = -1;
            this.zzj = str;
            this.zzl = str2;
            this.zzm = null;
            this.zzn = z2;
            this.zzp = zzbVar;
            this.zzq = clock;
            this.zzr = new zzc();
            this.zzo = zzge.zzv.zzb.DEFAULT;
            this.zzs = zzaVar;
            if (z2) {
                Preconditions.checkArgument(str2 == null, hg.Vd("74@wDn02k,886@3496a8)3&\\\u001d)Y.(#%\u0016\u0018R\u0013\u0014\u0013\u001e#\u001b ", (short) (C1607wl.Xd() ^ 31630), (short) (C1607wl.Xd() ^ 18955)));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ClearcutLogger(Context context, String str, @Nullable String str2) {
        this(context, -1, str, str2, null, false, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), null, new zzp(context));
    }

    public static ClearcutLogger anonymousLogger(Context context, String str) {
        return new ClearcutLogger(context, -1, str, null, null, true, com.google.android.gms.internal.clearcut.zze.zzb(context), DefaultClock.getInstance(), null, new zzp(context));
    }

    private static int zza(Context context) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1561oA.ud("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (C1499aX.Xd() ^ (-11363))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-8600));
            int[] iArr = new int["\u0017\u0014\"|\u0015\u0016\u001d\u0012\u001f\u001c\u0003\u0016*\u001c!\u001e2".length()];
            QB qb = new QB("\u0017\u0014\"|\u0015\u0016\u001d\u0012\u001f\u001c\u0003\u0016*\u001c!\u001e2");
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
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Yd("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c", (short) (C1633zX.Xd() ^ (-20207)))).getMethod(Xg.qd("\u0002\u0001\u0011m\u007f\u0003\f\u0003\n\tr\u0007\u0014\r", (short) (C1633zX.Xd() ^ (-31556)), (short) (C1633zX.Xd() ^ (-10954))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    short sXd2 = (short) (Od.Xd() ^ (-19148));
                    short sXd3 = (short) (Od.Xd() ^ (-23313));
                    int[] iArr2 = new int["\u0006mz+CU0\u0014d\u0011'\n\u001c;b8\u0014oI\b:R6Mk\u000b\rz(4Ts\u0019".length()];
                    QB qb2 = new QB("\u0006mz+CU0\u0014d\u0011'\n\u001c;b8\u0014oI\b:R6Mk\u000b\rz(4Ts\u0019");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                        i3++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(ZO.xd("\u0016NoWfiE^z\u001f\u001e\u0016\u001c\u001a\u001e\u0002", (short) (OY.Xd() ^ 18021), (short) (OY.Xd() ^ 23687)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(C1626yg.Ud("iC0od')S\u0010IX)<T", (short) (FB.Xd() ^ 15073), (short) (FB.Xd() ^ 24359)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        return ((PackageInfo) method3.invoke(packageManager, objArr3)).versionCode;
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
            Ig.wd(",/8RJmYG_\u0005\u0001\u001do|", (short) (C1633zX.Xd() ^ (-21565)));
            short sXd4 = (short) (Od.Xd() ^ (-160));
            int[] iArr3 = new int[":}3Wv\u0007RR51\\Elw\u001e3p<".length()];
            QB qb3 = new QB(":}3Wv\u0007RR51\\Elw\u001e3p<");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                i4++;
            }
            new String(iArr3, 0, i4);
            return 0;
        }
    }

    private static int[] zza(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Integer num = arrayList.get(i2);
            i2++;
            iArr[i3] = num.intValue();
            i3++;
        }
        return iArr;
    }

    static /* synthetic */ int[] zzb(ArrayList arrayList) {
        return zza((ArrayList<Integer>) null);
    }

    public final LogEventBuilder newEvent(@Nullable byte[] bArr) {
        return new LogEventBuilder(this, bArr, (com.google.android.gms.clearcut.zza) null);
    }
}
