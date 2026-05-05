package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoh extends zzjy {
    private static final void zzb(Set set, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            set.add(Character.valueOf(str.charAt(i2)));
        }
    }

    private static final String zzc(String str, int i2, Set set) {
        if (i2 == 1) {
            try {
                return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }
        if (i2 != 2) {
            return str;
        }
        String strReplace = str.replace("\\", "\\\\");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String string = ((Character) it.next()).toString();
            strReplace = strReplace.replace(string, "\\".concat(String.valueOf(string)));
        }
        return strReplace;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        zzqz zzqzVar2;
        boolean z2 = true;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqz zzqzVar3 = zzqzVarArr[0];
        zzqz zzqzVar4 = length > 1 ? zzqzVarArr[1] : zzrd.zze;
        int i2 = 2;
        String strZzd = (length <= 2 || (zzqzVar2 = zzqzVarArr[2]) == zzrd.zze) ? "" : zzjx.zzd(zzqzVar2);
        String strZzd2 = "=";
        if (length > 3 && (zzqzVar = zzqzVarArr[3]) != zzrd.zze) {
            strZzd2 = zzjx.zzd(zzqzVar);
        }
        HashSet hashSet = null;
        if (zzqzVar4 != zzrd.zze) {
            Preconditions.checkArgument(zzqzVar4 instanceof zzrk);
            if ("url".equals(zzqzVar4.zzc())) {
                i2 = 1;
            } else {
                if (!"backslash".equals(zzqzVar4.zzc())) {
                    return new zzrk("");
                }
                hashSet = new HashSet();
                zzb(hashSet, strZzd);
                zzb(hashSet, strZzd2);
                hashSet.remove('\\');
            }
        } else {
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (zzqzVar3 instanceof zzrg) {
            for (zzqz zzqzVar5 : ((zzrg) zzqzVar3).zzk()) {
                if (!z2) {
                    sb.append(strZzd);
                }
                sb.append(zzc(zzjx.zzd(zzqzVar5), i2, hashSet));
                z2 = false;
            }
        } else if (zzqzVar3 instanceof zzrh) {
            Map mapZzi = ((zzrh) zzqzVar3).zzi();
            for (String str : mapZzi.keySet()) {
                if (!z2) {
                    sb.append(strZzd);
                }
                String strZzd3 = zzjx.zzd((zzqz) mapZzi.get(str));
                sb.append(zzc(str, i2, hashSet));
                sb.append(strZzd2);
                sb.append(zzc(strZzd3, i2, hashSet));
                z2 = false;
            }
        } else {
            sb.append(zzc(zzjx.zzd(zzqzVar3), i2, hashSet));
        }
        return new zzrk(sb.toString());
    }
}
