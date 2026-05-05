package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final class zzdx implements Comparator {
    zzdx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzef zzefVar = (zzef) obj;
        zzef zzefVar2 = (zzef) obj2;
        zzdw zzdwVar = new zzdw(zzefVar);
        zzdw zzdwVar2 = new zzdw(zzefVar2);
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            Integer numValueOf = Integer.valueOf(zzdwVar.zza() & 255);
            byte bZza = zzdwVar2.zza();
            int iCompareTo = numValueOf.compareTo(Integer.valueOf((bZza + 255) - (bZza | 255)));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzefVar.zzd()).compareTo(Integer.valueOf(zzefVar2.zzd()));
    }
}
