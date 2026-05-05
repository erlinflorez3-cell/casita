package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzsx extends zzsq implements Set {

    @CheckForNull
    private transient zzst zza;

    zzsx() {
    }

    static int zzf(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzsx zzi(Object obj, Object obj2, Object obj3) {
        return zzl(3, "", AdkSettings.PLATFORM_TYPE_MOBILE, Constants.CASEFIRST_FALSE);
    }

    public static zzsx zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "GET", "HEAD", HttpPost.METHOD_NAME, "PUT");
    }

    private static zzsx zzl(int i2, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return zztf.zza;
        }
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            return new zzth(obj);
        }
        int iZzf = zzf(i2);
        Object[] objArr2 = new Object[iZzf];
        int i3 = iZzf - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArrCopyOf[i6];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i6);
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzsp.zza(iHashCode);
            while (true) {
                int i7 = (-1) - (((-1) - iZza) | ((-1) - i3));
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArrCopyOf[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArrCopyOf, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArrCopyOf[0];
            obj4.getClass();
            return new zzth(obj4);
        }
        if (zzf(i5) < iZzf / 2) {
            return zzl(i5, objArrCopyOf);
        }
        int length = objArrCopyOf.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
        }
        return new zztf(objArrCopyOf, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsx) && zzk() && ((zzsx) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zztg.zza(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzsq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzti iterator();

    public final zzst zzg() {
        zzst zzstVar = this.zza;
        if (zzstVar != null) {
            return zzstVar;
        }
        zzst zzstVarZzh = zzh();
        this.zza = zzstVarZzh;
        return zzstVarZzh;
    }

    zzst zzh() {
        Object[] array = toArray();
        int i2 = zzst.zzd;
        return zzst.zzg(array, array.length);
    }

    boolean zzk() {
        return false;
    }
}
