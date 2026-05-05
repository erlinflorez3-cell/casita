package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new zzk();
    private static final Comparator<zzi> zzai = new zzj();
    public final String name;
    private final long zzab;
    private final boolean zzac;
    private final double zzad;
    private final String zzae;
    private final byte[] zzaf;
    private final int zzag;
    public final int zzah;

    public zzi(String str, long j2, boolean z2, double d2, String str2, byte[] bArr, int i2, int i3) {
        this.name = str;
        this.zzab = j2;
        this.zzac = z2;
        this.zzad = d2;
        this.zzae = str2;
        this.zzaf = bArr;
        this.zzag = i2;
        this.zzah = i3;
    }

    private static int compare(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzi zziVar) {
        zzi zziVar2 = zziVar;
        int iCompareTo = this.name.compareTo(zziVar2.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = compare(this.zzag, zziVar2.zzag);
        if (iCompare != 0) {
            return iCompare;
        }
        int i2 = this.zzag;
        if (i2 == 1) {
            long j2 = this.zzab;
            long j3 = zziVar2.zzab;
            if (j2 < j3) {
                return -1;
            }
            return j2 == j3 ? 0 : 1;
        }
        if (i2 == 2) {
            boolean z2 = this.zzac;
            if (z2 == zziVar2.zzac) {
                return 0;
            }
            return z2 ? 1 : -1;
        }
        if (i2 == 3) {
            return Double.compare(this.zzad, zziVar2.zzad);
        }
        if (i2 == 4) {
            String str = this.zzae;
            String str2 = zziVar2.zzae;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i2 != 5) {
            throw new AssertionError(new StringBuilder(31).append("Invalid enum value: ").append(this.zzag).toString());
        }
        byte[] bArr = this.zzaf;
        byte[] bArr2 = zziVar2.zzaf;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i3 = 0; i3 < Math.min(this.zzaf.length, zziVar2.zzaf.length); i3++) {
            int i4 = this.zzaf[i3] - zziVar2.zzaf[i3];
            if (i4 != 0) {
                return i4;
            }
        }
        return compare(this.zzaf.length, zziVar2.zzaf.length);
    }

    public final boolean equals(Object obj) {
        int i2;
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (zzn.equals(this.name, zziVar.name) && (i2 = this.zzag) == zziVar.zzag && this.zzah == zziVar.zzah) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return this.zzac == zziVar.zzac;
                    }
                    if (i2 == 3) {
                        return this.zzad == zziVar.zzad;
                    }
                    if (i2 == 4) {
                        return zzn.equals(this.zzae, zziVar.zzae);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.zzaf, zziVar.zzaf);
                    }
                    throw new AssertionError(new StringBuilder(31).append("Invalid enum value: ").append(this.zzag).toString());
                }
                if (this.zzab == zziVar.zzab) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() throws Throwable {
        String str;
        StringBuilder sb = new StringBuilder(C1561oA.od("Inbg'", (short) (Od.Xd() ^ (-28835))));
        sb.append(this.name);
        String strKd = C1561oA.Kd(".#", (short) (C1607wl.Xd() ^ 23477));
        sb.append(strKd);
        int i2 = this.zzag;
        if (i2 == 1) {
            sb.append(this.zzab);
        } else if (i2 == 2) {
            sb.append(this.zzac);
        } else if (i2 != 3) {
            String strZd = Wg.Zd("P", (short) (C1499aX.Xd() ^ (-12119)), (short) (C1499aX.Xd() ^ (-20962)));
            if (i2 == 4) {
                sb.append(strZd);
                str = this.zzae;
            } else {
                if (i2 != 5) {
                    String str2 = this.name;
                    int i3 = this.zzag;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                    short sXd = (short) (C1580rY.Xd() ^ (-20066));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-19416));
                    int[] iArr = new int["\n.5\u001f)%\u001fY-1'\u001bnS".length()];
                    QB qb = new QB("\n.5\u001f)%\u001fY-1'\u001bnS");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
                        i4++;
                    }
                    throw new AssertionError(sb2.append(new String(iArr, 0, i4)).append(str2).append(strKd).append(i3).toString());
                }
                if (this.zzaf == null) {
                    sb.append(C1561oA.Xd("\u001c$\u001c\u001d", (short) (ZN.Xd() ^ 19639)));
                } else {
                    sb.append(strZd);
                    Object[] objArr = {this.zzaf, 3};
                    Method declaredMethod = Class.forName(Wg.vd("<J=LNIA\fXXJN\u0015*FY0\u0002|", (short) (OY.Xd() ^ 25509))).getDeclaredMethod(Qg.kd("\u0005\r\u0001\f\u007f\u007fm\bj\u000b\b}\u0002y", (short) (ZN.Xd() ^ 31297), (short) (ZN.Xd() ^ 19713)), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        str = (String) declaredMethod.invoke(null, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            sb.append(str);
            sb.append(strZd);
        } else {
            sb.append(this.zzad);
        }
        sb.append(strKd);
        sb.append(this.zzag);
        sb.append(strKd);
        sb.append(this.zzah);
        short sXd3 = (short) (ZN.Xd() ^ 16184);
        int[] iArr2 = new int["]".length()];
        QB qb2 = new QB("]");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(sXd3 + i5 + xuXd2.CK(iKK2));
            i5++;
        }
        sb.append(new String(iArr2, 0, i5));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzab);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzac);
        SafeParcelWriter.writeDouble(parcel, 5, this.zzad);
        SafeParcelWriter.writeString(parcel, 6, this.zzae, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzaf, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zzag);
        SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
