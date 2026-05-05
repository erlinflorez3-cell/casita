package com.google.android.gms.internal.gtm;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final class zztv implements Comparator {
    zztv() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzud zzudVar = (zzud) obj;
        zzud zzudVar2 = (zzud) obj2;
        zztu zztuVar = new zztu(zzudVar);
        zztu zztuVar2 = new zztu(zzudVar2);
        while (zztuVar.hasNext() && zztuVar2.hasNext()) {
            int iCompareTo = Integer.valueOf((-1) - (((-1) - zztuVar.zza()) | ((-1) - 255))).compareTo(Integer.valueOf(zztuVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzudVar.zzd()).compareTo(Integer.valueOf(zzudVar2.zzd()));
    }
}
