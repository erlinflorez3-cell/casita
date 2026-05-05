package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecIDScanResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecIDScanResult> CREATOR = new Parcelable.Creator<FaceTecIDScanResult>() { // from class: com.facetec.sdk.FaceTecIDScanResult.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceTecIDScanResult createFromParcel(Parcel parcel) {
            return new FaceTecIDScanResult(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceTecIDScanResult[] newArray(int i2) {
            return new FaceTecIDScanResult[i2];
        }
    };
    private String B;
    private final FaceTecIDScanStatus Code;
    private ArrayList<String> I;
    private byte[] V;
    private ArrayList<String> Z;

    private FaceTecIDScanResult(Parcel parcel) {
        this.I = new ArrayList<>();
        this.Z = new ArrayList<>();
        this.Code = (FaceTecIDScanStatus) parcel.readSerializable();
        this.I = (ArrayList) ab.B(parcel);
        this.Z = (ArrayList) ab.B(parcel);
        this.V = (byte[]) ab.B(parcel);
        this.B = (String) ab.B(parcel);
    }

    /* synthetic */ FaceTecIDScanResult(Parcel parcel, byte b2) {
        this(parcel);
    }

    FaceTecIDScanResult(FaceTecIDScanStatus faceTecIDScanStatus) {
        this.I = new ArrayList<>();
        this.Z = new ArrayList<>();
        this.Code = faceTecIDScanStatus;
    }

    final void B(byte[] bArr) {
        this.V = bArr;
    }

    final void B(byte[][] bArr) throws Throwable {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                ArrayList<String> arrayList = this.I;
                Object[] objArr = {bArr2, 2};
                Method declaredMethod = Class.forName(C1561oA.Kd("o}t\u0004\u0002|xC\f\f\u0002\u0006H]}\u0011\u0004UT", (short) (C1580rY.Xd() ^ (-15659)))).getDeclaredMethod(Wg.Zd("JS\rXI\u000b;V\u0007gi\u001f_\u0019", (short) (OY.Xd() ^ 6290), (short) (OY.Xd() ^ 17393)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    arrayList.add((String) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    final void I(byte[][] bArr) throws Throwable {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                ArrayList<String> arrayList = this.Z;
                Object[] objArr = {bArr2, 2};
                Method declaredMethod = Class.forName(C1561oA.Xd("p~u\u0005\u0003}yD\r\r\u0003\u0007I^~\u0012\u0005VU", (short) (C1499aX.Xd() ^ (-10014)))).getDeclaredMethod(Wg.vd("fnbmaaOiLli_c[", (short) (C1580rY.Xd() ^ (-19167))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    arrayList.add((String) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    final void Z(String str) {
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ArrayList<String> getBackImagesCompressedBase64() {
        return this.Z;
    }

    public final ArrayList<String> getFrontImagesCompressedBase64() {
        return this.I;
    }

    public final byte[] getIDScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.V;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final String getIDScanBase64() throws Throwable {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.V;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        Object[] objArr = {bArr, 2};
        Method declaredMethod = Class.forName(Qg.kd("t\u0001u\u0003~wq:\u0001~rt5Hfwh85", (short) (C1607wl.Xd() ^ 20015), (short) (C1607wl.Xd() ^ 15548))).getDeclaredMethod(yg.hg.Vd("x\u0001t\u007fssa{^~{qum", (short) (Od.Xd() ^ (-8171)), (short) (Od.Xd() ^ (-24965))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String getSessionId() {
        return this.B;
    }

    public final FaceTecIDScanStatus getStatus() {
        return this.Code;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.Code);
        ab.V(this.I, parcel);
        ab.V(this.Z, parcel);
        ab.V(this.V, parcel);
        ab.V(this.B, parcel);
    }
}
