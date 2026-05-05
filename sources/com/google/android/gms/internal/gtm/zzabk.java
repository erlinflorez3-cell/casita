package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzabk implements zzxx {
    RT_DEFAULT(0),
    RT_OBSOLETE(1),
    RT_WEEK(10),
    RT_MONTH(20),
    RT_5_WEEKS(21),
    RT_QUARTER(30),
    RT_HALF_A_YEAR(40),
    RT_YEAR(50),
    RT_16_MONTHS(58),
    RT_YEAR_AND_A_HALF(60),
    RT_2_YEARS(70),
    RT_3_YEARS(80),
    RT_ARCHIVAL(1000);

    private static final zzxy zzn = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzabi
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i2) {
            return zzabk.zzb(i2);
        }
    };
    private final int zzp;

    zzabk(int i2) {
        this.zzp = i2;
    }

    public static zzabk zzb(int i2) {
        if (i2 == 0) {
            return RT_DEFAULT;
        }
        if (i2 == 1) {
            return RT_OBSOLETE;
        }
        if (i2 == 10) {
            return RT_WEEK;
        }
        if (i2 == 30) {
            return RT_QUARTER;
        }
        if (i2 == 40) {
            return RT_HALF_A_YEAR;
        }
        if (i2 == 50) {
            return RT_YEAR;
        }
        if (i2 == 58) {
            return RT_16_MONTHS;
        }
        if (i2 == 60) {
            return RT_YEAR_AND_A_HALF;
        }
        if (i2 == 70) {
            return RT_2_YEARS;
        }
        if (i2 == 80) {
            return RT_3_YEARS;
        }
        if (i2 == 1000) {
            return RT_ARCHIVAL;
        }
        if (i2 == 20) {
            return RT_MONTH;
        }
        if (i2 != 21) {
            return null;
        }
        return RT_5_WEEKS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzp);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzp;
    }
}
