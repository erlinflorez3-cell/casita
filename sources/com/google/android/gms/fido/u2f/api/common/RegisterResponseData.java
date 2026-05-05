package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
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
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();
    private final byte[] zza;
    private final ProtocolVersion zzb;
    private final String zzc;

    public RegisterResponseData(byte[] bArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = ProtocolVersion.V1;
        this.zzc = null;
    }

    public RegisterResponseData(byte[] bArr, ProtocolVersion protocolVersion, String str) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        Preconditions.checkArgument(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion != ProtocolVersion.V1) {
            this.zzc = (String) Preconditions.checkNotNull(str);
        } else {
            Preconditions.checkArgument(str == null);
            this.zzc = null;
        }
    }

    RegisterResponseData(byte[] bArr, String str, String str2) {
        this.zza = bArr;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.equal(this.zzb, registerResponseData.zzb) && Arrays.equals(this.zza, registerResponseData.zza) && Objects.equal(this.zzc, registerResponseData.zzc);
    }

    public String getClientDataString() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public byte[] getRegisterData() {
        return this.zza;
    }

    public int getVersionCode() {
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        int iOrdinal = this.zzb.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                return -1;
            }
        }
        return i2;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(Arrays.hashCode(this.zza)), this.zzc);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public JSONObject toJsonObject() throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            short sXd = (short) (C1499aX.Xd() ^ (-16904));
            int[] iArr = new int["Qu(DM)|B\u001e13ZDij<".length()];
            QB qb = new QB("Qu(DM)|B\u001e13ZDij<");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            Object[] objArr = {this.zza, 11};
            Method declaredMethod = Class.forName(EO.Od("\th0\u001a\u0006=XAD3&\u000b{\u001aa\u0011H\u0017l", (short) (OY.Xd() ^ 14753))).getDeclaredMethod(C1561oA.Qd("?G;F::(B%EB8<4", (short) (C1499aX.Xd() ^ (-4088))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                jSONObject.put(str, (String) declaredMethod.invoke(null, objArr));
                jSONObject.put(C1593ug.zd(" \u0010\u001e \u0017\u001e\u001e", (short) (Od.Xd() ^ (-16894)), (short) (Od.Xd() ^ (-9154))), this.zzb.toString());
                String str2 = this.zzc;
                if (str2 != null) {
                    short sXd2 = (short) (C1499aX.Xd() ^ (-29597));
                    int[] iArr2 = new int["rzvqy~Mi{g".length()];
                    QB qb2 = new QB("rzvqy~Mi{g");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str3 = new String(iArr2, 0, i3);
                    Object[] objArr2 = {str2.getBytes(), 11};
                    Method declaredMethod2 = Class.forName(C1561oA.Kd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z##\u0019\u001d_t\u0015(\u001blk", (short) (FB.Xd() ^ 1097))).getDeclaredMethod(Wg.Zd("}Qaw(e\u007fu\u0004@\u001b=<0", (short) (Od.Xd() ^ (-16443)), (short) (Od.Xd() ^ (-22996))), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod2.setAccessible(true);
                        jSONObject.put(str3, (String) declaredMethod2.invoke(null, objArr2));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return jSONObject;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        zzaj zzajVarZza = zzak.zza(this);
        zzajVarZza.zzb("protocolVersion", this.zzb);
        zzbf zzbfVarZzd = zzbf.zzd();
        byte[] bArr = this.zza;
        zzajVarZza.zzb("registerData", zzbfVarZzd.zze(bArr, 0, bArr.length));
        String str = this.zzc;
        if (str != null) {
            zzajVarZza.zzb("clientDataString", str);
        }
        return zzajVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getRegisterData(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb.toString(), false);
        SafeParcelWriter.writeString(parcel, 4, getClientDataString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
