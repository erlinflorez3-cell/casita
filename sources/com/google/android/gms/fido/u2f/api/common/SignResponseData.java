package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    @Deprecated
    public SignResponseData(byte[] bArr, String str, byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.zza, signResponseData.zza) && Objects.equal(this.zzb, signResponseData.zzb) && Arrays.equals(this.zzc, signResponseData.zzc) && Arrays.equals(this.zzd, signResponseData.zzd);
    }

    public String getClientDataString() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public JSONObject toJsonObject() throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            String strQd = Xg.qd("\u001b\u0016+z\u0015#\u001a#\u001d", (short) (ZN.Xd() ^ 26108), (short) (ZN.Xd() ^ 16868));
            byte[] bArr = this.zza;
            short sXd = (short) (ZN.Xd() ^ 25752);
            short sXd2 = (short) (ZN.Xd() ^ 9882);
            int[] iArr = new int["\u007fuwo(%\f!bL\u0015\u0006A )?n*2".length()];
            QB qb = new QB("\u007fuwo(%\f!bL\u0015\u0006A )?n*2");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {bArr, 11};
            Method declaredMethod = cls.getDeclaredMethod(ZO.xd("\u0006R^p\u0019@7=O<ZL\u001f8", (short) (C1499aX.Xd() ^ (-838)), (short) (C1499aX.Xd() ^ (-31862))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                jSONObject.put(strQd, (String) declaredMethod.invoke(null, objArr));
                String strUd = C1626yg.Ud("JqPG\u0005_e|x6", (short) (ZN.Xd() ^ FujifilmMakernoteDirectory.TAG_MAX_APERTURE_AT_MIN_FOCAL), (short) (ZN.Xd() ^ 3513));
                Object[] objArr2 = {this.zzb.getBytes(), 11};
                Method declaredMethod2 = Class.forName(Ig.wd("\u0010U9\u001f\u0003Py2.ODgYq;m\n^\u0013", (short) (ZN.Xd() ^ 9994))).getDeclaredMethod(EO.Od("sLQ\u0003\u001bA\u001a\u001f:|~\u000e}n", (short) (C1580rY.Xd() ^ (-31365))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod2.setAccessible(true);
                    jSONObject.put(strUd, (String) declaredMethod2.invoke(null, objArr2));
                    String strQd2 = C1561oA.Qd("j_\\bTffbT2N`L", (short) (C1607wl.Xd() ^ 17807));
                    Object[] objArr3 = {this.zzc, 11};
                    Method declaredMethod3 = Class.forName(C1593ug.zd("s\u0002x\b\u0006\u0001|G\u0010\u0010\u0006\nLa\u0002\u0015\bYX", (short) (FB.Xd() ^ 16513), (short) (FB.Xd() ^ 22332))).getDeclaredMethod(C1561oA.od("19-8,,\u001a4\u001774*.&", (short) (C1580rY.Xd() ^ (-22286))), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod3.setAccessible(true);
                        jSONObject.put(strQd2, (String) declaredMethod3.invoke(null, objArr3));
                        return jSONObject;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (JSONException e5) {
            throw new RuntimeException(e5);
        }
    }

    public String toString() {
        zzaj zzajVarZza = zzak.zza(this);
        zzbf zzbfVarZzd = zzbf.zzd();
        byte[] bArr = this.zza;
        zzajVarZza.zzb(JSON_RESPONSE_DATA_KEY_HANDLE, zzbfVarZzd.zze(bArr, 0, bArr.length));
        zzajVarZza.zzb("clientDataString", this.zzb);
        zzbf zzbfVarZzd2 = zzbf.zzd();
        byte[] bArr2 = this.zzc;
        zzajVarZza.zzb(JSON_RESPONSE_DATA_SIGNATURE_DATA, zzbfVarZzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzbfVarZzd3 = zzbf.zzd();
        byte[] bArr3 = this.zzd;
        zzajVarZza.zzb("application", zzbfVarZzd3.zze(bArr3, 0, bArr3.length));
        return zzajVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeString(parcel, 3, getClientDataString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getSignatureData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
