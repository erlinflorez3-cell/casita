package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecSessionResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecSessionResult> CREATOR = new Parcelable.Creator<FaceTecSessionResult>() { // from class: com.facetec.sdk.FaceTecSessionResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceTecSessionResult createFromParcel(Parcel parcel) {
            return new FaceTecSessionResult(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceTecSessionResult[] newArray(int i2) {
            return new FaceTecSessionResult[i2];
        }
    };
    private final byte[][] B;
    private String Code;
    private final byte[] I;
    private final FaceTecSessionStatus V;
    private final byte[][] Z;

    private FaceTecSessionResult(Parcel parcel) {
        this.V = FaceTecSessionStatus.valueOf(parcel.readString());
        this.Code = parcel.readString();
        this.Z = (byte[][]) ab.B(parcel);
        this.B = (byte[][]) ab.B(parcel);
        this.I = (byte[]) ab.B(parcel);
    }

    /* synthetic */ FaceTecSessionResult(Parcel parcel, byte b2) {
        this(parcel);
    }

    FaceTecSessionResult(FaceTecSessionStatus faceTecSessionStatus, byte[][] bArr, byte[][] bArr2, byte[] bArr3) {
        this.V = faceTecSessionStatus;
        this.Z = bArr;
        this.B = bArr2;
        this.I = bArr3;
    }

    final void I(String str) {
        this.Code = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String[] getAuditTrailCompressedBase64() throws Throwable {
        byte[][] bArr = this.Z;
        int i2 = 0;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        while (true) {
            byte[][] bArr2 = this.Z;
            if (i2 >= bArr2.length) {
                return strArr;
            }
            byte[] bArr3 = bArr2[i2];
            short sXd = (short) (Od.Xd() ^ (-5564));
            int[] iArr = new int["R^S`\\UO\u0018^\\PR\u0013&DUF\u0016\u0013".length()];
            QB qb = new QB("R^S`\\UO\u0018^\\PR\u0013&DUF\u0016\u0013");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr = {bArr3, 2};
            Method declaredMethod = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(C1561oA.yd(".8.;)+\u001b7$FE=;5", (short) (Od.Xd() ^ (-24991))), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                strArr[i2] = (String) declaredMethod.invoke(null, objArr);
                i2++;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final byte[] getFaceScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.I;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final String getFaceScanBase64() throws Throwable {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.I;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        short sXd = (short) (FB.Xd() ^ 9861);
        int[] iArr = new int["AOFUSNJ\u0015]]SW\u001a/ObU'&".length()];
        QB qb = new QB("AOFUSNJ\u0015]]SW\u001a/ObU'&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = {bArr, 2};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("\r\u0017\r\u001a\u0010\u0012\u0002\u001e\u0003%$\u001c\"\u001c", (short) (ZN.Xd() ^ 20705), (short) (ZN.Xd() ^ 21919)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String[] getLowQualityAuditTrailCompressedBase64() throws Throwable {
        byte[][] bArr = this.B;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.B;
            if (i2 >= bArr2.length) {
                return strArr;
            }
            Object[] objArr = {bArr2[i2], 0};
            Method declaredMethod = Class.forName(Jg.Wd("@Px\u0012A\u0016_\u0010\n\u0014K\u0019I\b6bG^O", (short) (C1499aX.Xd() ^ (-5089)), (short) (C1499aX.Xd() ^ (-4042)))).getDeclaredMethod(ZO.xd("46d?)MsE$Cf\n.\u0001", (short) (ZN.Xd() ^ 22156), (short) (ZN.Xd() ^ 15445)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                strArr[i2] = (String) declaredMethod.invoke(null, objArr);
                i2++;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final String getSessionId() {
        return this.Code;
    }

    public final FaceTecSessionStatus getStatus() {
        return this.V;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.V.name());
        parcel.writeString(this.Code);
        ab.V(this.Z, parcel);
        ab.V(this.B, parcel);
        ab.V(this.I, parcel);
    }
}
