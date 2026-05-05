package com.google.android.gms.internal.measurement;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> itZzg = zzafVar.zzg();
        while (itZzg.hasNext()) {
            int iIntValue = itZzg.next().intValue();
            if (zzafVar.zzc(iIntValue)) {
                zzaq zzaqVarZza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(iIntValue), new zzai(Double.valueOf(iIntValue)), zzafVar));
                if (zzaqVarZza.zzd().equals(bool)) {
                    return zzafVar2;
                }
                if (bool2 == null || zzaqVarZza.zzd().equals(bool2)) {
                    zzafVar2.zzb(iIntValue, zzaqVarZza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z2) {
        zzaq zzaqVarZza;
        zzg.zzb("reduce", 1, list);
        zzg.zzc("reduce", 2, list);
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
        if (!(zzaqVarZza2 instanceof zzal)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaqVarZza = zzhVar.zza(list.get(1));
            if (zzaqVarZza instanceof zzaj) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzafVar.zzb() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaqVarZza = null;
        }
        zzal zzalVar = (zzal) zzaqVarZza2;
        int iZzb = zzafVar.zzb();
        int i2 = z2 ? 0 : iZzb - 1;
        int i3 = z2 ? iZzb - 1 : 0;
        int i4 = z2 ? 1 : -1;
        if (zzaqVarZza == null) {
            zzaqVarZza = zzafVar.zza(i2);
            i2 += i4;
        }
        while ((i3 - i2) * i4 >= 0) {
            if (zzafVar.zzc(i2)) {
                zzaqVarZza = zzalVar.zza(zzhVar, Arrays.asList(zzaqVarZza, zzafVar.zza(i2), new zzai(Double.valueOf(i2)), zzafVar));
                if (zzaqVarZza instanceof zzaj) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i4;
            } else {
                i2 += i4;
            }
        }
        return zzaqVarZza;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzaq zza(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        zzal zzalVar;
        String strZzf;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    b2 = 0;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b2 = 1;
                }
                break;
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    b2 = 2;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b2 = 3;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b2 = 4;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b2 = 5;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b2 = 6;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b2 = 7;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b2 = 8;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b2 = 9;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b2 = 10;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b2 = Ascii.VT;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b2 = Ascii.FF;
                }
                break;
            case 3536286:
                if (str.equals(Constants.SORT)) {
                    b2 = Ascii.CR;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    b2 = Ascii.SO;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b2 = Ascii.SI;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b2 = 16;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b2 = 17;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b2 = 19;
                }
                break;
        }
        double dZzb = 0.0d;
        switch (b2) {
            case 0:
                zzg.zza("toString", 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar2 = (zzaf) zzafVar.zzc();
                if (!list.isEmpty()) {
                    Iterator<zzaq> it = list.iterator();
                    while (it.hasNext()) {
                        zzaq zzaqVarZza = zzhVar.zza(it.next());
                        if (zzaqVarZza instanceof zzaj) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iZzb = zzafVar2.zzb();
                        if (zzaqVarZza instanceof zzaf) {
                            zzaf zzafVar3 = (zzaf) zzaqVarZza;
                            Iterator<Integer> itZzg = zzafVar3.zzg();
                            while (itZzg.hasNext()) {
                                Integer next = itZzg.next();
                                zzafVar2.zzb(next.intValue() + iZzb, zzafVar3.zza(next.intValue()));
                            }
                        } else {
                            zzafVar2.zzb(iZzb, zzaqVarZza);
                        }
                    }
                }
                return zzafVar2;
            case 2:
                zzg.zza(ViewProps.FILTER, 1, list);
                zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
                if (!(zzaqVarZza2 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zza() == 0) {
                    return new zzaf();
                }
                zzaf zzafVar4 = (zzaf) zzafVar.zzc();
                zzaf zzafVarZza = zza(zzafVar, zzhVar, (zzar) zzaqVarZza2, null, true);
                zzaf zzafVar5 = new zzaf();
                Iterator<Integer> itZzg2 = zzafVarZza.zzg();
                while (itZzg2.hasNext()) {
                    zzafVar5.zza(zzafVar4.zza(itZzg2.next().intValue()));
                }
                return zzafVar5;
            case 3:
                return zza(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int iZza = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (iZza < 0) {
                    iZza = Math.max(0, iZza + zzafVar.zzb());
                } else if (iZza > zzafVar.zzb()) {
                    iZza = zzafVar.zzb();
                }
                int iZzb2 = zzafVar.zzb();
                zzaf zzafVar6 = new zzaf();
                if (list.size() <= 1) {
                    while (iZza < iZzb2) {
                        zzafVar6.zza(zzafVar.zza(iZza));
                        zzafVar.zzb(iZza, null);
                        iZza++;
                    }
                    return zzafVar6;
                }
                int iMax = Math.max(0, (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()));
                if (iMax > 0) {
                    for (int i2 = iZza; i2 < Math.min(iZzb2, iZza + iMax); i2++) {
                        zzafVar6.zza(zzafVar.zza(iZza));
                        zzafVar.zzb(iZza);
                    }
                }
                if (list.size() > 2) {
                    for (int i3 = 2; i3 < list.size(); i3++) {
                        zzaq zzaqVarZza3 = zzhVar.zza(list.get(i3));
                        if (zzaqVarZza3 instanceof zzaj) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        zzafVar.zza((iZza + i3) - 2, zzaqVarZza3);
                    }
                }
                return zzafVar6;
            case 5:
                zzg.zza("forEach", 1, list);
                zzaq zzaqVarZza4 = zzhVar.zza(list.get(0));
                if (!(zzaqVarZza4 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zza() == 0) {
                    return zzaq.zzc;
                }
                zza(zzafVar, zzhVar, (zzar) zzaqVarZza4);
                return zzaq.zzc;
            case 6:
                zzg.zzc("lastIndexOf", 2, list);
                zzaq zzaqVarZza5 = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVarZza5 = zzhVar.zza(list.get(0));
                }
                double dZzb2 = zzafVar.zzb() - 1;
                if (list.size() > 1) {
                    zzaq zzaqVarZza6 = zzhVar.zza(list.get(1));
                    dZzb2 = Double.isNaN(zzaqVarZza6.zze().doubleValue()) ? zzafVar.zzb() - 1 : zzg.zza(zzaqVarZza6.zze().doubleValue());
                    if (dZzb2 < 0.0d) {
                        dZzb2 += (double) zzafVar.zzb();
                    }
                }
                if (dZzb2 < 0.0d) {
                    return new zzai(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(zzafVar.zzb(), dZzb2); iMin >= 0; iMin--) {
                    if (zzafVar.zzc(iMin) && zzg.zza(zzafVar.zza(iMin), zzaqVarZza5)) {
                        return new zzai(Double.valueOf(iMin));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar7 = new zzaf();
                    Iterator<zzaq> it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaq zzaqVarZza7 = zzhVar.zza(it2.next());
                        if (zzaqVarZza7 instanceof zzaj) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzafVar7.zza(zzaqVarZza7);
                    }
                    int iZzb3 = zzafVar7.zzb();
                    Iterator<Integer> itZzg3 = zzafVar.zzg();
                    while (itZzg3.hasNext()) {
                        Integer next2 = itZzg3.next();
                        zzafVar7.zzb(next2.intValue() + iZzb3, zzafVar.zza(next2.intValue()));
                    }
                    zzafVar.zzj();
                    Iterator<Integer> itZzg4 = zzafVar7.zzg();
                    while (itZzg4.hasNext()) {
                        Integer next3 = itZzg4.next();
                        zzafVar.zzb(next3.intValue(), zzafVar7.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case 8:
                zzg.zza("map", 1, list);
                zzaq zzaqVarZza8 = zzhVar.zza(list.get(0));
                if (zzaqVarZza8 instanceof zzar) {
                    return zzafVar.zzb() == 0 ? new zzaf() : zza(zzafVar, zzhVar, (zzar) zzaqVarZza8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 9:
                zzg.zza("pop", 0, list);
                int iZzb4 = zzafVar.zzb();
                if (iZzb4 == 0) {
                    return zzaq.zzc;
                }
                int i4 = iZzb4 - 1;
                zzaq zzaqVarZza9 = zzafVar.zza(i4);
                zzafVar.zzb(i4);
                return zzaqVarZza9;
            case 10:
                zzg.zzc("join", 1, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (list.isEmpty()) {
                    strZzf = ",";
                } else {
                    zzaq zzaqVarZza10 = zzhVar.zza(list.get(0));
                    strZzf = ((zzaqVarZza10 instanceof zzao) || (zzaqVarZza10 instanceof zzax)) ? "" : zzaqVarZza10.zzf();
                }
                return new zzas(zzafVar.zzb(strZzf));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<zzaq> it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzafVar.zza(zzhVar.zza(it3.next()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case 12:
                zzg.zza("some", 1, list);
                zzaq zzaqVarZza11 = zzhVar.zza(list.get(0));
                if (!(zzaqVarZza11 instanceof zzal)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zzb() != 0) {
                    zzal zzalVar2 = (zzal) zzaqVarZza11;
                    Iterator<Integer> itZzg5 = zzafVar.zzg();
                    while (itZzg5.hasNext()) {
                        int iIntValue = itZzg5.next().intValue();
                        if (zzafVar.zzc(iIntValue) && zzalVar2.zza(zzhVar, Arrays.asList(zzafVar.zza(iIntValue), new zzai(Double.valueOf(iIntValue)), zzafVar)).zzd().booleanValue()) {
                            return zzaq.zzh;
                        }
                    }
                }
                return zzaq.zzi;
            case 13:
                zzg.zzc(Constants.SORT, 1, list);
                if (zzafVar.zzb() >= 2) {
                    List<zzaq> listZzi = zzafVar.zzi();
                    if (list.isEmpty()) {
                        zzalVar = null;
                    } else {
                        zzaq zzaqVarZza12 = zzhVar.zza(list.get(0));
                        if (!(zzaqVarZza12 instanceof zzal)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzalVar = (zzal) zzaqVarZza12;
                    }
                    Collections.sort(listZzi, new zzbh(zzalVar, zzhVar));
                    zzafVar.zzj();
                    Iterator<zzaq> it4 = listZzi.iterator();
                    int i5 = 0;
                    while (it4.hasNext()) {
                        zzafVar.zzb(i5, it4.next());
                        i5++;
                    }
                }
                return zzafVar;
            case 14:
                zzg.zza("every", 1, list);
                zzaq zzaqVarZza13 = zzhVar.zza(list.get(0));
                if (zzaqVarZza13 instanceof zzar) {
                    return (zzafVar.zzb() == 0 || zza(zzafVar, zzhVar, (zzar) zzaqVarZza13, false, true).zzb() == zzafVar.zzb()) ? zzaq.zzh : zzaq.zzi;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                zzg.zza("shift", 0, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zzaqVarZza14 = zzafVar.zza(0);
                zzafVar.zzb(0);
                return zzaqVarZza14;
            case 16:
                zzg.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzafVar.zzc();
                }
                double dZzb3 = zzafVar.zzb();
                double dZza = zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                double dMax = dZza < 0.0d ? Math.max(dZza + dZzb3, 0.0d) : Math.min(dZza, dZzb3);
                if (list.size() == 2) {
                    double dZza2 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    dZzb3 = dZza2 < 0.0d ? Math.max(dZzb3 + dZza2, 0.0d) : Math.min(dZzb3, dZza2);
                }
                zzaf zzafVar8 = new zzaf();
                for (int i6 = (int) dMax; i6 < dZzb3; i6++) {
                    zzafVar8.zza(zzafVar.zza(i6));
                }
                return zzafVar8;
            case 17:
                return zza(zzafVar, zzhVar, list, false);
            case 18:
                zzg.zza("reverse", 0, list);
                int iZzb5 = zzafVar.zzb();
                if (iZzb5 != 0) {
                    for (int i7 = 0; i7 < iZzb5 / 2; i7++) {
                        if (zzafVar.zzc(i7)) {
                            zzaq zzaqVarZza15 = zzafVar.zza(i7);
                            zzafVar.zzb(i7, null);
                            int i8 = (iZzb5 - 1) - i7;
                            if (zzafVar.zzc(i8)) {
                                zzafVar.zzb(i7, zzafVar.zza(i8));
                            }
                            zzafVar.zzb(i8, zzaqVarZza15);
                        }
                    }
                }
                return zzafVar;
            case 19:
                zzg.zzc("indexOf", 2, list);
                zzaq zzaqVarZza16 = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVarZza16 = zzhVar.zza(list.get(0));
                }
                if (list.size() > 1) {
                    double dZza3 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    if (dZza3 >= zzafVar.zzb()) {
                        return new zzai(Double.valueOf(-1.0d));
                    }
                    dZzb = dZza3 < 0.0d ? ((double) zzafVar.zzb()) + dZza3 : dZza3;
                }
                Iterator<Integer> itZzg6 = zzafVar.zzg();
                while (itZzg6.hasNext()) {
                    int iIntValue2 = itZzg6.next().intValue();
                    double d2 = iIntValue2;
                    if (d2 >= dZzb && zzg.zza(zzafVar.zza(iIntValue2), zzaqVarZza16)) {
                        return new zzai(Double.valueOf(d2));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
