package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();
    String zza;
    private final KeyHandle zzb;
    private final String zzc;

    public RegisteredKey(KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        this.zzb = (KeyHandle) Preconditions.checkNotNull(keyHandle);
        this.zza = str;
        this.zzc = str2;
    }

    public static RegisteredKey parseFromJson(JSONObject jSONObject) throws JSONException {
        return new RegisteredKey(KeyHandle.parseFromJson(jSONObject), jSONObject.has(ClientData.KEY_CHALLENGE) ? jSONObject.getString(ClientData.KEY_CHALLENGE) : null, jSONObject.has("appId") ? jSONObject.getString("appId") : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.zza;
        if (str == null) {
            if (registeredKey.zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.zza)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        String str2 = this.zzc;
        if (str2 == null) {
            if (registeredKey.zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.zzc)) {
            return false;
        }
        return true;
    }

    public String getAppId() {
        return this.zzc;
    }

    public String getChallengeValue() {
        return this.zza;
    }

    public KeyHandle getKeyHandle() {
        return this.zzb;
    }

    public int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.zzb.hashCode();
        String str2 = this.zzc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.zza;
            if (str != null) {
                jSONObject.put(ClientData.KEY_CHALLENGE, str);
            }
            JSONObject jSONObjectZza = this.zzb.zza();
            Iterator<String> itKeys = jSONObjectZza.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectZza.get(next));
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            String strXd = C1561oA.Xd("pk\u0001Pjxoxr", (short) (C1607wl.Xd() ^ 29935));
            byte[] bytes = this.zzb.getBytes();
            Class<?> cls = Class.forName(Wg.vd(":H;JLG?\nVVHL\u0013(DWN \u001b", (short) (Od.Xd() ^ (-28344))));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {bytes, 11};
            short sXd = (short) (C1607wl.Xd() ^ 328);
            short sXd2 = (short) (C1607wl.Xd() ^ 15997);
            int[] iArr = new int["19-8,,\u001a4\u001774*.&".length()];
            QB qb = new QB("19-8,,\u001a4\u001774*.&");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                jSONObject.put(strXd, (String) declaredMethod.invoke(null, objArr));
                if (this.zzb.getProtocolVersion() != ProtocolVersion.UNKNOWN) {
                    short sXd3 = (short) (C1499aX.Xd() ^ (-8276));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-2217));
                    int[] iArr2 = new int["\u000bx\u0005\u0005y~|".length()];
                    QB qb2 = new QB("\u000bx\u0005\u0005y~|");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                        i3++;
                    }
                    jSONObject.put(new String(iArr2, 0, i3), this.zzb.getProtocolVersion().toString());
                }
                if (this.zzb.getTransports() != null) {
                    jSONObject.put(C1561oA.ud("\u001f\u001c\n\u0016\u001a\u0016\u0014\u0016\u0017\u0015", (short) (Od.Xd() ^ (-26725))), this.zzb.getTransports().toString());
                }
                String str = this.zza;
                if (str != null) {
                    short sXd5 = (short) (C1633zX.Xd() ^ (-13665));
                    int[] iArr3 = new int["[a[g`Zd^e".length()];
                    QB qb3 = new QB("[a[g`Zd^e");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 ^ i4));
                        i4++;
                    }
                    jSONObject.put(new String(iArr3, 0, i4), str);
                }
                String str2 = this.zzc;
                if (str2 != null) {
                    jSONObject.put(C1561oA.Yd("!12\f(", (short) (C1580rY.Xd() ^ (-6890))), str2);
                }
                return jSONObject.toString();
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
        SafeParcelWriter.writeParcelable(parcel, 2, getKeyHandle(), i2, false);
        SafeParcelWriter.writeString(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
