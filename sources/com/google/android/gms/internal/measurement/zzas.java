package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i2;
        int i3;
        String str2 = str;
        if (!"charAt".equals(str2) && !"concat".equals(str2) && !"hasOwnProperty".equals(str2) && !"indexOf".equals(str2) && !"lastIndexOf".equals(str2) && !"match".equals(str2) && !"replace".equals(str2) && !"search".equals(str2) && !"slice".equals(str2) && !"split".equals(str2) && !"substring".equals(str2) && !"toLowerCase".equals(str2) && !"toLocaleLowerCase".equals(str2) && !"toString".equals(str2) && !"toUpperCase".equals(str2)) {
            str2 = str2;
            if (!"toLocaleUpperCase".equals(str2) && !"trim".equals(str2)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str2));
            }
        }
        str2.hashCode();
        byte b2 = -1;
        switch (str2.hashCode()) {
            case -1789698943:
                if (str2.equals("hasOwnProperty")) {
                    b2 = 0;
                }
                break;
            case -1776922004:
                if (str2.equals("toString")) {
                    b2 = 1;
                }
                break;
            case -1464939364:
                if (str2.equals("toLocaleLowerCase")) {
                    b2 = 2;
                }
                break;
            case -1361633751:
                if (str2.equals("charAt")) {
                    b2 = 3;
                }
                break;
            case -1354795244:
                if (str2.equals("concat")) {
                    b2 = 4;
                }
                break;
            case -1137582698:
                if (str2.equals("toLowerCase")) {
                    b2 = 5;
                }
                break;
            case -906336856:
                if (str2.equals("search")) {
                    b2 = 6;
                }
                break;
            case -726908483:
                if (str2.equals("toLocaleUpperCase")) {
                    b2 = 7;
                }
                break;
            case -467511597:
                if (str2.equals("lastIndexOf")) {
                    b2 = 8;
                }
                break;
            case -399551817:
                if (str2.equals("toUpperCase")) {
                    b2 = 9;
                }
                break;
            case 3568674:
                if (str2.equals("trim")) {
                    b2 = 10;
                }
                break;
            case 103668165:
                if (str2.equals("match")) {
                    b2 = Ascii.VT;
                }
                break;
            case 109526418:
                if (str2.equals("slice")) {
                    b2 = Ascii.FF;
                }
                break;
            case 109648666:
                if (str2.equals("split")) {
                    b2 = Ascii.CR;
                }
                break;
            case 530542161:
                if (str2.equals("substring")) {
                    b2 = Ascii.SO;
                }
                break;
            case 1094496948:
                if (str2.equals("replace")) {
                    b2 = Ascii.SI;
                }
                break;
            case 1943291465:
                if (str2.equals("indexOf")) {
                    b2 = 16;
                }
                break;
        }
        switch (b2) {
            case 0:
                zzg.zza("hasOwnProperty", 1, list);
                String str3 = this.zza;
                zzaq zzaqVarZza = zzhVar.zza(list.get(0));
                if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(zzaqVarZza.zzf())) {
                    return zzag.zzh;
                }
                double dDoubleValue = zzaqVarZza.zze().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i3 = (int) dDoubleValue) < 0 || i3 >= str3.length()) ? zzag.zzi : zzag.zzh;
            case 1:
                zzg.zza("toString", 0, list);
                return this;
            case 2:
                zzg.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 3:
                zzg.zzc("charAt", 1, list);
                int iZza = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                String str4 = this.zza;
                return (iZza < 0 || iZza >= str4.length()) ? zzaq.zzj : new zzas(String.valueOf(str4.charAt(iZza)));
            case 4:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    sb.append(zzhVar.zza(list.get(i4)).zzf());
                }
                return new zzas(sb.toString());
            case 5:
                zzg.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.zzc("search", 1, list);
                return Pattern.compile(!list.isEmpty() ? zzhVar.zza(list.get(0)).zzf() : zzaq.zzc.zzf()).matcher(this.zza).find() ? new zzai(Double.valueOf(r1.start())) : new zzai(Double.valueOf(-1.0d));
            case 7:
                zzg.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case 8:
                zzg.zzc("lastIndexOf", 2, list);
                String str5 = this.zza;
                String strZzf = list.size() <= 0 ? zzaq.zzc.zzf() : zzhVar.zza(list.get(0)).zzf();
                return new zzai(Double.valueOf(str5.lastIndexOf(strZzf, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.zza(list.get(1)).zze().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.zza(r1)))));
            case 9:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 10:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            case 11:
                zzg.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzhVar.zza(list.get(0)).zzf()).matcher(this.zza);
                return matcher.find() ? new zzaf(new zzas(matcher.group())) : zzaq.zzd;
            case 12:
                zzg.zzc("slice", 2, list);
                String str6 = this.zza;
                double dZza = zzg.zza(!list.isEmpty() ? zzhVar.zza(list.get(0)).zze().doubleValue() : 0.0d);
                int iMax = (int) (dZza < 0.0d ? Math.max(((double) str6.length()) + dZza, 0.0d) : Math.min(dZza, str6.length()));
                double dZza2 = zzg.zza(list.size() > 1 ? zzhVar.zza(list.get(1)).zze().doubleValue() : str6.length());
                return new zzas(str6.substring(iMax, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str6.length()) + dZza2, 0.0d) : Math.min(dZza2, str6.length()))) - iMax) + iMax));
            case 13:
                zzg.zzc("split", 2, list);
                String str7 = this.zza;
                if (str7.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzf2 = zzhVar.zza(list.get(0)).zzf();
                    long jZzc = list.size() > 1 ? zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) : 2147483647L;
                    if (jZzc == 0) {
                        return new zzaf();
                    }
                    String[] strArrSplit = str7.split(Pattern.quote(strZzf2), ((int) jZzc) + 1);
                    int length = strArrSplit.length;
                    if (!strZzf2.isEmpty() || strArrSplit.length <= 0) {
                        i2 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i2 = zIsEmpty;
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            length = strArrSplit.length - 1;
                            i2 = zIsEmpty;
                        }
                    }
                    if (strArrSplit.length > jZzc) {
                        length--;
                    }
                    while (i2 < length) {
                        arrayList.add(new zzas(strArrSplit[i2]));
                        i2++;
                    }
                }
                return new zzaf(arrayList);
            case 14:
                zzg.zzc("substring", 2, list);
                String str8 = this.zza;
                int iZza2 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                int iZza3 = list.size() > 1 ? (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()) : str8.length();
                int iMin = Math.min(Math.max(iZza2, 0), str8.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str8.length());
                return new zzas(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                zzg.zzc("replace", 2, list);
                String strZzf3 = zzaq.zzc.zzf();
                zzaq zzaqVarZza2 = zzaq.zzc;
                if (!list.isEmpty()) {
                    strZzf3 = zzhVar.zza(list.get(0)).zzf();
                    if (list.size() > 1) {
                        zzaqVarZza2 = zzhVar.zza(list.get(1));
                    }
                }
                String str9 = this.zza;
                int iIndexOf = str9.indexOf(strZzf3);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzaqVarZza2 instanceof zzal) {
                    zzaqVarZza2 = ((zzal) zzaqVarZza2).zza(zzhVar, Arrays.asList(new zzas(strZzf3), new zzai(Double.valueOf(iIndexOf)), this));
                }
                return new zzas(str9.substring(0, iIndexOf) + zzaqVarZza2.zzf() + str9.substring(iIndexOf + strZzf3.length()));
            case 16:
                zzg.zzc("indexOf", 2, list);
                return new zzai(Double.valueOf(this.zza.indexOf(list.size() <= 0 ? zzaq.zzc.zzf() : zzhVar.zza(list.get(0)).zzf(), (int) zzg.zza(list.size() >= 2 ? zzhVar.zza(list.get(1)).zze().doubleValue() : 0.0d))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }
}
