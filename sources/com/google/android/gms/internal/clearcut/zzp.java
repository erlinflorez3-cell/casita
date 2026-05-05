package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.clearcut.zzgw;
import com.google.android.gms.phenotype.Phenotype;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp implements ClearcutLogger.zza {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final zzao zzaq;
    private static final zzao zzar;
    private static final ConcurrentHashMap<String, zzae<zzgw.zza>> zzas;
    private static final HashMap<String, zzae<String>> zzat;
    private static Boolean zzau = null;
    private static Long zzav = null;
    private static final zzae<Boolean> zzaw;
    private final Context zzh;

    static {
        zzao zzaoVarZzd = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        zzaq = zzaoVarZzd;
        zzar = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        zzas = new ConcurrentHashMap<>();
        zzat = new HashMap<>();
        zzau = null;
        zzav = null;
        zzaw = zzaoVarZzd.zzc("enable_log_sampling_rules", false);
    }

    public zzp(Context context) {
        this.zzh = context;
        if (context != null) {
            zzae.maybeInit(context);
        }
    }

    private static long zza(String str, long j2) {
        if (str == null || str.isEmpty()) {
            return zzk.zza(ByteBuffer.allocate(8).putLong(j2).array());
        }
        byte[] bytes = str.getBytes(UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j2);
        return zzk.zza(byteBufferAllocate.array());
    }

    private static zzgw.zza.zzb zza(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
            i2 = iIndexOf + 1;
        } else {
            strSubstring = "";
        }
        int iIndexOf2 = str.indexOf(47, i2);
        if (iIndexOf2 <= 0) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "Failed to parse the rule: ".concat(strValueOf);
            } else {
                new String("Failed to parse the rule: ");
            }
            return null;
        }
        try {
            long j2 = Long.parseLong(str.substring(i2, iIndexOf2));
            long j3 = Long.parseLong(str.substring(iIndexOf2 + 1));
            if (j2 >= 0 && j3 >= 0) {
                return zzgw.zza.zzb.zzfz().zzn(strSubstring).zzr(j2).zzs(j3).zzbh();
            }
            new StringBuilder(72).append("negative values not supported: ").append(j2).append(RemoteSettings.FORWARD_SLASH_STRING).append(j3).toString();
            return null;
        } catch (NumberFormatException e2) {
            String strValueOf2 = String.valueOf(str);
            if (strValueOf2.length() != 0) {
                "parseLong() failed while parsing: ".concat(strValueOf2);
            } else {
                new String("parseLong() failed while parsing: ");
            }
            return null;
        }
    }

    private static boolean zzb(long j2, long j3, long j4) {
        if (j3 < 0 || j4 <= 0) {
            return true;
        }
        return ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) >= 0 ? j2 % j4 : (((Long.MAX_VALUE % j4) + 1) + (((j2 + Long.MAX_VALUE) - (j2 | Long.MAX_VALUE)) % j4)) % j4) < j3;
    }

    private static boolean zzc(Context context) {
        if (zzau == null) {
            zzau = Boolean.valueOf(Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzau.booleanValue();
    }

    private static long zzd(Context context) throws Throwable {
        if (zzav == null) {
            long j2 = 0;
            if (context == null) {
                return 0L;
            }
            if (zzc(context)) {
                short sXd = (short) (Od.Xd() ^ (-5185));
                short sXd2 = (short) (Od.Xd() ^ (-26155));
                int[] iArr = new int["\nHyGe9d\u0003q%%/s~5j\\0\u0012K\u00118m".length()];
                QB qb = new QB("\nHyGe9d\u0003q%%/s~5j\\0\u0012K\u00118m");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("P\t\b5>\u001887\r\tj\u001aUY|\"Ha", (short) (FB.Xd() ^ 14084)), new Class[0]);
                try {
                    method.setAccessible(true);
                    ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
                    short sXd3 = (short) (C1499aX.Xd() ^ (-31601));
                    int[] iArr2 = new int[")f>1m,OZ7\u0003".length()];
                    QB qb2 = new QB(")f>1m,OZ7\u0003");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    j2 = zzy.getLong(contentResolver, new String(iArr2, 0, i3), 0L);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            zzav = Long.valueOf(j2);
        }
        return zzav.longValue();
    }

    @Override // com.google.android.gms.clearcut.ClearcutLogger.zza
    public final boolean zza(com.google.android.gms.clearcut.zze zzeVar) throws Throwable {
        List<zzgw.zza.zzb> listZzfs;
        zzae<zzgw.zza> zzaeVarPutIfAbsent;
        String strValueOf = zzeVar.zzag.zzj;
        int i2 = zzeVar.zzag.zzk;
        int i3 = zzeVar.zzaa != null ? zzeVar.zzaa.zzbji : 0;
        String str = null;
        if (!zzaw.get().booleanValue()) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i2 >= 0 ? String.valueOf(i2) : null;
            }
            if (strValueOf == null) {
                return true;
            }
            Context context = this.zzh;
            if (context != null && zzc(context)) {
                HashMap<String, zzae<String>> map = zzat;
                zzae<String> zzaeVarZza = map.get(strValueOf);
                if (zzaeVarZza == null) {
                    zzaeVarZza = zzar.zza(strValueOf, null);
                    map.put(strValueOf, zzaeVarZza);
                }
                str = zzaeVarZza.get();
            }
            zzgw.zza.zzb zzbVarZza = zza(str);
            if (zzbVarZza != null) {
                return zzb(zza(zzbVarZza.zzfw(), zzd(this.zzh)), zzbVarZza.zzfx(), zzbVarZza.zzfy());
            }
            return true;
        }
        if (strValueOf == null || strValueOf.isEmpty()) {
            strValueOf = i2 >= 0 ? String.valueOf(i2) : null;
        }
        if (strValueOf == null) {
            return true;
        }
        if (this.zzh == null) {
            listZzfs = Collections.emptyList();
        } else {
            ConcurrentHashMap<String, zzae<zzgw.zza>> concurrentHashMap = zzas;
            zzae<zzgw.zza> zzaeVarZza2 = concurrentHashMap.get(strValueOf);
            if (zzaeVarZza2 == null && (zzaeVarPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, (zzaeVarZza2 = zzaq.zza(strValueOf, zzgw.zza.zzft(), zzq.zzax)))) != null) {
                zzaeVarZza2 = zzaeVarPutIfAbsent;
            }
            listZzfs = zzaeVarZza2.get().zzfs();
        }
        for (zzgw.zza.zzb zzbVar : listZzfs) {
            if (!zzbVar.zzfv() || zzbVar.getEventCode() == 0 || zzbVar.getEventCode() == i3) {
                if (!zzb(zza(zzbVar.zzfw(), zzd(this.zzh)), zzbVar.zzfx(), zzbVar.zzfy())) {
                    return false;
                }
            }
        }
        return true;
    }
}
