package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();
    private final int zza;
    private final byte[] zzb;
    private final ProtocolVersion zzc;
    private final List zzd;

    KeyHandle(int i2, byte[] bArr, String str, List list) {
        this.zza = i2;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public KeyHandle(byte[] bArr, ProtocolVersion protocolVersion, List<Transport> list) {
        this.zza = 1;
        this.zzb = bArr;
        this.zzc = protocolVersion;
        this.zzd = list;
    }

    public static KeyHandle parseFromJson(JSONObject jSONObject) throws Throwable {
        String strQd = Xg.qd("9)79077", (short) (FB.Xd() ^ 3249), (short) (FB.Xd() ^ 11568));
        try {
            ProtocolVersion protocolVersionFromString = ProtocolVersion.fromString(jSONObject.has(strQd) ? jSONObject.getString(strQd) : null);
            String string = jSONObject.getString(Jg.Wd("3\u0003\u000f=NC1\u0019\f", (short) (FB.Xd() ^ 13246), (short) (FB.Xd() ^ 11996)));
            try {
                Class<?> cls = Class.forName(ZO.xd("En17)-R\u0018T\u0012\u0006\u001cuAb-\u0005;Y", (short) (OY.Xd() ^ 7633), (short) (OY.Xd() ^ 987)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1626yg.Ud(";Ks|x!HeBek8\u000b>\u001e>", (short) (Od.Xd() ^ (-32263)), (short) (Od.Xd() ^ (-9267))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {string, 8};
                Method declaredMethod = cls.getDeclaredMethod(Ig.wd("t%\u0011\t\u000f;", (short) (FB.Xd() ^ 1934)), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                    String strOd = EO.Od("M&V@\\.E`%\u0005", (short) (C1607wl.Xd() ^ 27269));
                    return new KeyHandle(bArr, protocolVersionFromString, jSONObject.has(strOd) ? Transport.parseTransports(jSONObject.getJSONArray(strOd)) : null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalArgumentException e3) {
                throw new JSONException(e3.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e4) {
            throw new JSONException(e4.toString());
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && keyHandle.zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.zzd) != null && list2.containsAll(list) && keyHandle.zzd.containsAll(this.zzd);
    }

    public byte[] getBytes() {
        return this.zzb;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    public List<Transport> getTransports() {
        return this.zzd;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd);
    }

    public JSONObject toJson() {
        return zza();
    }

    public String toString() {
        List list = this.zzd;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", Base64Utils.encode(this.zzb), this.zzc, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeByteArray(parcel, 2, getBytes(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc.toString(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.zzb;
            if (bArr != null) {
                String strQd = C1561oA.Qd("OH[)AMBIA", (short) (ZN.Xd() ^ 29490));
                Object[] objArr = {bArr, 11};
                Method declaredMethod = Class.forName(C1593ug.zd("[i`omhd/wwmq4Ii|oA@", (short) (OY.Xd() ^ 7937), (short) (OY.Xd() ^ 23251))).getDeclaredMethod(C1561oA.od("!)\u001d(\u001c\u001c\n$\u0007'$\u001a\u001e\u0016", (short) (FB.Xd() ^ 29913)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    jSONObject.put(strQd, (String) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            ProtocolVersion protocolVersion = this.zzc;
            if (protocolVersion != null) {
                short sXd = (short) (Od.Xd() ^ (-26355));
                int[] iArr = new int["\\LZ\\SZZ".length()];
                QB qb = new QB("\\LZ\\SZZ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                jSONObject.put(new String(iArr, 0, i2), protocolVersion.toString());
            }
            if (this.zzd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).toString());
                }
                jSONObject.put(Wg.Zd("(\u0016_Gg#xRoA", (short) (C1633zX.Xd() ^ (-32047)), (short) (C1633zX.Xd() ^ (-14948))), jSONArray);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}
