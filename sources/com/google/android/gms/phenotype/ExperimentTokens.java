package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    private static final byte[][] zzn;
    private static final ExperimentTokens zzo;
    private final String zzp;
    private final byte[] zzq;
    private final byte[][] zzr;
    private final byte[][] zzs;
    private final byte[][] zzt;
    private final byte[][] zzu;
    private final int[] zzv;
    private final byte[][] zzw;
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new zzh();
    private static final zza zzx = new zzd();
    private static final zza zzy = new zze();
    private static final zza zzz = new zzf();
    private static final zza zzaa = new zzg();

    /* JADX INFO: Access modifiers changed from: private */
    interface zza {
    }

    static {
        byte[][] bArr = new byte[0][];
        zzn = bArr;
        zzo = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    private static List<Integer> zza(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> zza(byte[][] bArr) throws Throwable {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            Object[] objArr = {bArr2, 3};
            Method declaredMethod = Class.forName(C1561oA.ud("UaVc_XR\u001ba_SU\u0016)GXI\u0019\u0016", (short) (C1499aX.Xd() ^ (-10622)))).getDeclaredMethod(C1561oA.yd("\u007f\n\u007f\r\u0003\u0005t\u0011e\b\u0007~\u0005~", (short) (C1633zX.Xd() ^ (-3197))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                arrayList.add((String) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zza(StringBuilder sb, String str, byte[][] bArr) throws Throwable {
        String strQd;
        sb.append(str);
        short sXd = (short) (C1607wl.Xd() ^ 25881);
        int[] iArr = new int[ExifInterface.GPS_DIRECTION_TRUE.length()];
        QB qb = new QB(ExifInterface.GPS_DIRECTION_TRUE);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        sb.append(new String(iArr, 0, i2));
        if (bArr == null) {
            strQd = Xg.qd("\u000f\u0017\u000f\u0010", (short) (C1633zX.Xd() ^ (-6350)), (short) (C1633zX.Xd() ^ (-28832)));
        } else {
            sb.append(Jg.Wd("[", (short) (C1499aX.Xd() ^ (-15078)), (short) (C1499aX.Xd() ^ (-14313))));
            int length = bArr.length;
            boolean z2 = true;
            int i3 = 0;
            while (i3 < length) {
                byte[] bArr2 = bArr[i3];
                if (!z2) {
                    sb.append(ZO.xd("%:", (short) (C1580rY.Xd() ^ (-5870)), (short) (C1580rY.Xd() ^ (-9753))));
                }
                String strUd = C1626yg.Ud("\u0010", (short) (FB.Xd() ^ 24276), (short) (FB.Xd() ^ 882));
                sb.append(strUd);
                Object[] objArr = {bArr2, 3};
                Method declaredMethod = Class.forName(Ig.wd("?\u001d%VKpS\u0005\n<7TCQ\u0015D]@\u0006", (short) (C1607wl.Xd() ^ 23909))).getDeclaredMethod(EO.Od("h7\u007fr\"OH>l0.A\u0015\n", (short) (C1580rY.Xd() ^ (-7348))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    sb.append((String) declaredMethod.invoke(null, objArr));
                    sb.append(strUd);
                    i3++;
                    z2 = false;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            strQd = C1561oA.Qd("\u000b", (short) (FB.Xd() ^ 20927));
        }
        sb.append(strQd);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (zzn.equals(this.zzp, experimentTokens.zzp) && Arrays.equals(this.zzq, experimentTokens.zzq) && zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && zzn.equals(zza(this.zzw), zza(experimentTokens.zzw))) {
                return true;
            }
        }
        return false;
    }

    public String toString() throws Throwable {
        short sXd = (short) (FB.Xd() ^ 22782);
        short sXd2 = (short) (FB.Xd() ^ 8022);
        int[] iArr = new int["J~wm{sxq{\u0003c\u007f|w\u0002\b".length()];
        QB qb = new QB("J~wm{sxq{\u0003c\u007f|w\u0002\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        StringBuilder sb = new StringBuilder(new String(iArr, 0, i2));
        String strOd = C1561oA.od("'", (short) (C1633zX.Xd() ^ (-27653)));
        sb.append(strOd);
        String str = this.zzp;
        String strKd = C1561oA.Kd("4<45", (short) (Od.Xd() ^ (-11901)));
        String strZd = Wg.Zd("\u0007", (short) (C1499aX.Xd() ^ (-29541)), (short) (C1499aX.Xd() ^ (-25640)));
        sb.append(str == null ? strKd : new StringBuilder(String.valueOf(str).length() + 2).append(strZd).append(str).append(strZd).toString());
        short sXd3 = (short) (FB.Xd() ^ 6586);
        int[] iArr2 = new int["$\u0019^dnbas=".length()];
        QB qb2 = new QB("$\u0019^dnbas=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        sb.append(new String(iArr2, 0, i3));
        byte[] bArr = this.zzq;
        if (bArr == null) {
            sb.append(strKd);
        } else {
            sb.append(strZd);
            Object[] objArr = {bArr, 3};
            Method declaredMethod = Class.forName(Wg.vd("z\t{\u000b\r\b\u007fJ\u0017\u0017\t\rSh\u0005\u0018n@;", (short) (ZN.Xd() ^ 21245))).getDeclaredMethod(Qg.kd("4<0;//\u001d7\u001a:7-1)", (short) (ZN.Xd() ^ 21582), (short) (ZN.Xd() ^ 4597)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                sb.append((String) declaredMethod.invoke(null, objArr));
                sb.append(strZd);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        String strVd = hg.Vd("?2", (short) (C1607wl.Xd() ^ 30233), (short) (C1607wl.Xd() ^ 27649));
        sb.append(strVd);
        zza(sb, C1561oA.ud("\u000e\u0007\u000e\u0005", (short) (C1633zX.Xd() ^ (-608))), this.zzr);
        sb.append(strVd);
        zza(sb, C1561oA.yd("fhYhV`", (short) (C1607wl.Xd() ^ 18693)), this.zzs);
        sb.append(strVd);
        short sXd4 = (short) (C1499aX.Xd() ^ (-18304));
        int[] iArr3 = new int["IUaLe`".length()];
        QB qb3 = new QB("IUaLe`");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
            i4++;
        }
        zza(sb, new String(iArr3, 0, i4), this.zzt);
        sb.append(strVd);
        zza(sb, Xg.qd(")/$\"0", (short) (FB.Xd() ^ 21803), (short) (FB.Xd() ^ 19289)), this.zzu);
        sb.append(strVd);
        int[] iArr4 = this.zzv;
        short sXd5 = (short) (C1633zX.Xd() ^ (-18974));
        short sXd6 = (short) (C1633zX.Xd() ^ (-18073));
        int[] iArr5 = new int["}\u0004+&".length()];
        QB qb4 = new QB("}\u0004+&");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr5[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd6) ^ sXd5));
            i5++;
        }
        sb.append(new String(iArr5, 0, i5));
        short sXd7 = (short) (C1607wl.Xd() ^ 15903);
        short sXd8 = (short) (C1607wl.Xd() ^ 27888);
        int[] iArr6 = new int["^".length()];
        QB qb5 = new QB("^");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr6[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd8) + sXd7)));
            i6++;
        }
        sb.append(new String(iArr6, 0, i6));
        String strUd = C1626yg.Ud(">", (short) (C1607wl.Xd() ^ 27887), (short) (C1607wl.Xd() ^ 15468));
        if (iArr4 == null) {
            sb.append(strKd);
        } else {
            sb.append(strOd);
            int length = iArr4.length;
            boolean z2 = true;
            int i7 = 0;
            while (i7 < length) {
                int i8 = iArr4[i7];
                if (!z2) {
                    sb.append(strVd);
                }
                sb.append(i8);
                i7++;
                z2 = false;
            }
            sb.append(strUd);
        }
        sb.append(strVd);
        zza(sb, Ig.wd("m%\u001cn\u001c\u0001\u001c", (short) (ZN.Xd() ^ 14601)), this.zzw);
        sb.append(strUd);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
