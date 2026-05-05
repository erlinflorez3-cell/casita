package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;
    private final int zza;
    private final ProtocolVersion zzb;
    private final byte[] zzc;
    private final String zzd;

    RegisterRequest(int i2, String str, byte[] bArr, String str2) {
        this.zza = i2;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public RegisterRequest(ProtocolVersion protocolVersion, byte[] bArr, String str) {
        this.zza = 1;
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(bArr.length == 65, "invalid challengeValue length for V1");
        }
        this.zzd = str;
    }

    public static RegisterRequest parseFromJson(JSONObject jSONObject) throws Throwable {
        String strXd = C1561oA.Xd("\"\u0012 \"\u0019  ", (short) (ZN.Xd() ^ 28797));
        try {
            ProtocolVersion protocolVersionFromString = ProtocolVersion.fromString(jSONObject.has(strXd) ? jSONObject.getString(strXd) : null);
            String string = jSONObject.getString(Wg.vd("ae]gnfnf[", (short) (C1633zX.Xd() ^ (-25281))));
            try {
                Class<?> cls = Class.forName(Qg.kd("\u0001\r\u0002\u000f\u000b\u0004}F\r\u000b~\u0001ATr\u0004tDA", (short) (C1580rY.Xd() ^ (-21451)), (short) (C1580rY.Xd() ^ (-2519))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (OY.Xd() ^ 20641);
                short sXd2 = (short) (OY.Xd() ^ 20065);
                int[] iArr = new int["XNbL\u0018UIUM\u00137WTJNF".length()];
                QB qb = new QB("XNbL\u0018UIUM\u00137WTJNF");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {string, 8};
                Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("eebmaa", (short) (OY.Xd() ^ 9801)), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                    short sXd3 = (short) (C1633zX.Xd() ^ (-580));
                    int[] iArr2 = new int["'54\f&".length()];
                    QB qb2 = new QB("'54\f&");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    try {
                        return new RegisterRequest(protocolVersionFromString, bArr, jSONObject.has(str) ? jSONObject.getString(str) : null);
                    } catch (IllegalArgumentException e2) {
                        throw new JSONException(e2.getMessage());
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (IllegalArgumentException e4) {
                throw new JSONException(e4.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e5) {
            throw new JSONException(e5.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        String str = this.zzd;
        if (str == null) {
            if (registerRequest.zzd != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.zzd)) {
            return false;
        }
        return true;
    }

    public String getAppId() {
        return this.zzd;
    }

    public byte[] getChallengeValue() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.zzc) + 31) * 31) + this.zzb.hashCode();
        String str = this.zzd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public JSONObject toJson() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C1561oA.Yd("#\u0013!#\u001a!!", (short) (ZN.Xd() ^ 458)), this.zzb.toString());
            String strQd = Xg.qd("GMGSTNXRQ", (short) (C1580rY.Xd() ^ (-13296)), (short) (C1580rY.Xd() ^ (-24686)));
            Object[] objArr = {this.zzc, 11};
            Method declaredMethod = Class.forName(Jg.Wd("L\u001c9Mq\u0002D4~%0ya|2g \u0018\u001d", (short) (ZN.Xd() ^ 10801), (short) (ZN.Xd() ^ 8748))).getDeclaredMethod(ZO.xd("4\u0019la$vT\u001f\u0015\u0010z^\u0002v", (short) (C1633zX.Xd() ^ (-24301)), (short) (C1633zX.Xd() ^ (-27355))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                jSONObject.put(strQd, (String) declaredMethod.invoke(null, objArr));
                String str = this.zzd;
                if (str != null) {
                    jSONObject.put(C1626yg.Ud(")Or\u0006\f", (short) (C1633zX.Xd() ^ (-20742)), (short) (C1633zX.Xd() ^ (-11046))), str);
                }
                return jSONObject;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zzb.toString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
