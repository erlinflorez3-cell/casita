package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjx {
    public static double zza(zzqz zzqzVar) {
        double dZzb = zzb(zzqzVar);
        if (Double.isNaN(dZzb)) {
            return 0.0d;
        }
        return (dZzb == 0.0d || dZzb == 0.0d || Double.isInfinite(dZzb)) ? dZzb : Math.signum(dZzb) * Math.floor(Math.abs(dZzb));
    }

    public static double zzb(zzqz zzqzVar) {
        Preconditions.checkArgument(zzqzVar != null);
        if (zzqzVar == zzrd.zze) {
            return Double.NaN;
        }
        if (zzqzVar == zzrd.zzd) {
            return 0.0d;
        }
        if (zzqzVar instanceof zzra) {
            return ((zzra) zzqzVar).zzi().booleanValue() ? 1.0d : 0.0d;
        }
        if (zzqzVar instanceof zzrb) {
            return ((zzrb) zzqzVar).zzi().doubleValue();
        }
        if (zzqzVar instanceof zzrg) {
            zzrg zzrgVar = (zzrg) zzqzVar;
            if (zzrgVar.zzk().isEmpty()) {
                return 0.0d;
            }
            if (zzrgVar.zzk().size() == 1) {
                return zzb(new zzrk(zzd(zzrgVar.zzi(0))));
            }
        } else if (zzqzVar instanceof zzrk) {
            zzrk zzrkVar = (zzrk) zzqzVar;
            if (zzrkVar.zzk().isEmpty()) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(zzrkVar.zzk());
            } catch (NumberFormatException unused) {
                return Double.NaN;
            }
        }
        if (zzj(zzqzVar)) {
            throw new IllegalArgumentException(zzk(zzqzVar, "Illegal type given to numberEquivalent: "));
        }
        return Double.NaN;
    }

    public static double zzc(zzqz zzqzVar, zzqz zzqzVar2) {
        Preconditions.checkArgument(zzqzVar != null);
        Preconditions.checkArgument(zzqzVar2 != null);
        double dZzb = zzb(zzqzVar);
        double dZzb2 = zzb(zzqzVar2);
        if (Double.isNaN(dZzb) || Double.isNaN(dZzb2)) {
            return Double.NaN;
        }
        if ((dZzb == Double.POSITIVE_INFINITY && dZzb2 == Double.NEGATIVE_INFINITY) || (dZzb == Double.NEGATIVE_INFINITY && dZzb2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        return (!Double.isInfinite(dZzb) || Double.isInfinite(dZzb2)) ? (Double.isInfinite(dZzb) || !Double.isInfinite(dZzb2)) ? dZzb + dZzb2 : dZzb2 : dZzb;
    }

    public static String zzd(zzqz zzqzVar) {
        Preconditions.checkArgument(zzqzVar != null);
        if (zzqzVar == zzrd.zze) {
            return "undefined";
        }
        if (zzqzVar == zzrd.zzd) {
            return "null";
        }
        if (zzqzVar instanceof zzra) {
            return true != ((zzra) zzqzVar).zzi().booleanValue() ? Constants.CASEFIRST_FALSE : "true";
        }
        if (!(zzqzVar instanceof zzrb)) {
            if (zzqzVar instanceof zzrc) {
                zzjw zzjwVarZzi = ((zzrc) zzqzVar).zzi();
                if (zzjwVarZzi instanceof zzjv) {
                    return ((zzjv) zzjwVarZzi).zzb();
                }
            } else {
                if (zzqzVar instanceof zzrg) {
                    ArrayList arrayList = new ArrayList();
                    for (zzqz zzqzVar2 : ((zzrg) zzqzVar).zzk()) {
                        if (zzqzVar2 == zzrd.zzd || zzqzVar2 == zzrd.zze) {
                            arrayList.add("");
                        } else {
                            arrayList.add(zzd(zzqzVar2));
                        }
                    }
                    return TextUtils.join(",", arrayList);
                }
                if (zzqzVar instanceof zzrh) {
                    return "[object Object]";
                }
                if (zzqzVar instanceof zzrk) {
                    return ((zzrk) zzqzVar).zzk();
                }
            }
            throw new IllegalArgumentException(zzj(zzqzVar) ? zzk(zzqzVar, "Illegal type given to stringEquivalent: ") : "Unknown type in stringEquivalent.");
        }
        String string = Double.toString(((zzrb) zzqzVar).zzi().doubleValue());
        int iIndexOf = string.indexOf(ExifInterface.LONGITUDE_EAST);
        if (iIndexOf <= 0) {
            if (!string.endsWith(".0")) {
                return string;
            }
            String strSubstring = string.substring(0, string.length() - 2);
            return strSubstring.equals("-0") ? AdkSettings.PLATFORM_TYPE_MOBILE : strSubstring;
        }
        int i2 = Integer.parseInt(string.substring(iIndexOf + 1, string.length()));
        if (i2 >= 0) {
            if (i2 >= 21) {
                return string.replace(ExifInterface.LONGITUDE_EAST, "e+");
            }
            String strReplace = string.substring(0, iIndexOf).replace(".", "");
            int length = strReplace.length() - (strReplace.startsWith(Global.HYPHEN) ? 1 : 0);
            StringBuilder sb = new StringBuilder();
            int i3 = (i2 + 1) - length;
            if (i3 < 0) {
                int length2 = strReplace.length() + i3;
                sb.append(strReplace.substring(0, length2));
                sb.append(".");
                sb.append(strReplace.substring(length2, strReplace.length()));
            } else {
                sb.append(strReplace);
                while (i3 > 0) {
                    sb.append(AdkSettings.PLATFORM_TYPE_MOBILE);
                    i3--;
                }
            }
            return sb.toString();
        }
        if (i2 <= -7) {
            return string.replace(ExifInterface.LONGITUDE_EAST, "e");
        }
        String strReplace2 = string.substring(0, iIndexOf).replace(".", "");
        StringBuilder sb2 = new StringBuilder("0.");
        while (true) {
            i2++;
            if (i2 >= 0) {
                sb2.append(strReplace2);
                return sb2.toString();
            }
            sb2.append(AdkSettings.PLATFORM_TYPE_MOBILE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zze(com.google.android.gms.internal.gtm.zzqz r12, com.google.android.gms.internal.gtm.zzqz r13) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzjx.zze(com.google.android.gms.internal.gtm.zzqz, com.google.android.gms.internal.gtm.zzqz):boolean");
    }

    public static boolean zzf(zzqz zzqzVar, zzqz zzqzVar2) {
        Preconditions.checkArgument(zzqzVar != null);
        Preconditions.checkArgument(zzqzVar2 != null);
        if (zzj(zzqzVar)) {
            throw new IllegalArgumentException(zzk(zzqzVar, "Illegal type given to abstractRelationalCompare: "));
        }
        if (zzj(zzqzVar2)) {
            throw new IllegalArgumentException(zzk(zzqzVar2, "Illegal type given to abstractRelationalCompare: "));
        }
        if ((zzqzVar instanceof zzrh) || (zzqzVar instanceof zzrg) || (zzqzVar instanceof zzrc)) {
            zzqzVar = new zzrk(zzd(zzqzVar));
        }
        if ((zzqzVar2 instanceof zzrh) || (zzqzVar2 instanceof zzrg) || (zzqzVar2 instanceof zzrc)) {
            zzqzVar2 = new zzrk(zzd(zzqzVar2));
        }
        if ((zzqzVar instanceof zzrk) && (zzqzVar2 instanceof zzrk)) {
            return ((zzrk) zzqzVar).zzk().compareTo(((zzrk) zzqzVar2).zzk()) < 0;
        }
        double dZzb = zzb(zzqzVar);
        double dZzb2 = zzb(zzqzVar2);
        if (Double.isNaN(dZzb) || Double.isNaN(dZzb2) || ((dZzb == 0.0d && dZzb2 == 0.0d) || ((dZzb == 0.0d && dZzb2 == 0.0d) || dZzb == Double.POSITIVE_INFINITY))) {
            return false;
        }
        if (dZzb2 == Double.POSITIVE_INFINITY) {
            return true;
        }
        if (dZzb2 == Double.NEGATIVE_INFINITY) {
            return false;
        }
        return dZzb == Double.NEGATIVE_INFINITY || Double.compare(dZzb, dZzb2) < 0;
    }

    public static boolean zzg(zzqz zzqzVar) {
        Preconditions.checkArgument(zzqzVar != null);
        if (zzqzVar == zzrd.zze || zzqzVar == zzrd.zzd) {
            return false;
        }
        if (zzqzVar instanceof zzra) {
            return ((zzra) zzqzVar).zzi().booleanValue();
        }
        if (zzqzVar instanceof zzrb) {
            zzrb zzrbVar = (zzrb) zzqzVar;
            if (zzrbVar.zzi().doubleValue() == 0.0d || zzrbVar.zzi().doubleValue() == 0.0d || Double.isNaN(zzrbVar.zzi().doubleValue())) {
                return false;
            }
        } else if (zzqzVar instanceof zzrk) {
            if (((zzrk) zzqzVar).zzk().isEmpty()) {
                return false;
            }
        } else if (zzj(zzqzVar)) {
            throw new IllegalArgumentException(zzk(zzqzVar, "Illegal type given to isTruthy: "));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzh(com.google.android.gms.internal.gtm.zzqz r7, com.google.android.gms.internal.gtm.zzqz r8) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzjx.zzh(com.google.android.gms.internal.gtm.zzqz, com.google.android.gms.internal.gtm.zzqz):boolean");
    }

    private static String zzi(zzqz zzqzVar) {
        return zzqzVar == zzrd.zze ? "Undefined" : zzqzVar == zzrd.zzd ? "Null" : zzqzVar instanceof zzra ? "Boolean" : zzqzVar instanceof zzrb ? "Number" : zzqzVar instanceof zzrk ? "String" : "Object";
    }

    private static boolean zzj(zzqz zzqzVar) {
        if (zzqzVar instanceof zzri) {
            return true;
        }
        if (!(zzqzVar instanceof zzrd) || zzqzVar == zzrd.zze) {
            return false;
        }
        return zzqzVar != zzrd.zzd;
    }

    private static /* synthetic */ String zzk(zzqz zzqzVar, String str) {
        return str + zzqzVar.zzc() + ".";
    }
}
