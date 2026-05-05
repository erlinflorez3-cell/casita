package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpo {
    final Map zza;
    private final Context zzb;
    private final zzqa zzc;
    private final Clock zzd;
    private final Map zze;

    public zzpo(Context context) throws Throwable {
        HashMap map = new HashMap();
        zzqa zzqaVar = new zzqa(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zza = new HashMap();
        Class<?> cls = Class.forName(Wg.Zd("]:}Y(f/JM\u001enB\u0001R&-\u0010\u0006Q%g@\t", (short) (FB.Xd() ^ 3724), (short) (FB.Xd() ^ 14156)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 11661);
        int[] iArr = new int[",+;\t9:750/C9@@\u0016CCJ<PM".length()];
        QB qb = new QB(",+;\t9:750/C9@@\u0016CCJ<PM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.zzb = (Context) method.invoke(context, objArr);
            this.zzd = defaultClock;
            this.zzc = zzqaVar;
            this.zze = map;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final void zzb(zzpt zzptVar, List list, int i2, zzpl zzplVar, zzgu zzguVar) {
        int i3 = i2;
        if (i3 == 0) {
            zzho.zzd("Starting to fetch a new resource");
            i3 = 0;
        }
        if (i3 >= list.size()) {
            String strConcat = "There is no valid resource for the container: ".concat(String.valueOf(zzptVar.zza().zzb()));
            zzho.zzd(strConcat);
            zzplVar.zza(new zzpv(new Status(16, strConcat), ((Integer) list.get(i3 - 1)).intValue(), null, null));
            return;
        }
        int iIntValue = ((Integer) list.get(i3)).intValue();
        if (iIntValue == 0) {
            zzph zzphVarZza = zzptVar.zza();
            zzpn zzpnVar = (zzpn) this.zza.get(zzphVarZza.zzb());
            if (!zzptVar.zza().zzg()) {
                if ((zzpnVar != null ? zzpnVar.zza() : this.zzc.zza(zzphVarZza.zzb())) + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS >= this.zzd.currentTimeMillis()) {
                    zzb(zzptVar, list, i3 + 1, zzplVar, zzguVar);
                    return;
                }
            }
            zzqg zzqgVar = (zzqg) this.zze.get(zzptVar.zzc());
            if (zzqgVar == null) {
                zzqgVar = new zzqg();
                this.zze.put(zzptVar.zzc(), zzqgVar);
            }
            zzho.zzd("Attempting to fetch container " + zzphVarZza.zzb() + " from network");
            zzqgVar.zza(this.zzb, zzptVar, 0L, new zzpm(this, 0, zzptVar, zzps.zza, list, i3, zzplVar, zzguVar));
            return;
        }
        if (iIntValue == 1) {
            zzph zzphVarZza2 = zzptVar.zza();
            zzho.zzd("Attempting to fetch container " + zzphVarZza2.zzb() + " from a saved resource");
            this.zzc.zze(zzphVarZza2.zzd(), new zzpm(this, 1, zzptVar, zzps.zza, list, i3, zzplVar, null));
            return;
        }
        if (iIntValue != 2) {
            throw new UnsupportedOperationException("Unknown fetching source: " + i3);
        }
        zzph zzphVarZza3 = zzptVar.zza();
        zzho.zzd("Attempting to fetch container " + zzphVarZza3.zzb() + " from the default resource");
        this.zzc.zzc(zzphVarZza3.zzd(), zzphVarZza3.zzc(), new zzpm(this, 2, zzptVar, zzps.zza, list, i3, zzplVar, null));
    }

    public final void zzc(String str, String str2, String str3, List list, zzpl zzplVar, zzgu zzguVar) {
        Preconditions.checkArgument(!list.isEmpty());
        zzpt zzptVar = new zzpt();
        zzhv zzhvVarZza = zzhv.zza();
        zzptVar.zzb(new zzph(str, str2, str3, zzhvVarZza.zzd() && str.equals(zzhvVarZza.zzc()), zzhv.zza().zzb(), ""));
        zzb(zzptVar, Collections.unmodifiableList(list), 0, zzplVar, zzguVar);
    }

    final void zzd(Status status, zzpu zzpuVar) {
        String strZzb = zzpuVar.zzb().zzb();
        Map map = this.zza;
        zzqj zzqjVarZzc = zzpuVar.zzc();
        if (!map.containsKey(strZzb)) {
            this.zza.put(strZzb, new zzpn(status, zzqjVarZzc, this.zzd.currentTimeMillis()));
            return;
        }
        zzpn zzpnVar = (zzpn) this.zza.get(strZzb);
        zzpnVar.zzc(this.zzd.currentTimeMillis());
        if (status == Status.RESULT_SUCCESS) {
            zzpnVar.zzd(status);
            zzpnVar.zzb(zzqjVarZzc);
        }
    }
}
