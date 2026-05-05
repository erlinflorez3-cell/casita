package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        float f4 = -1.0f;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        zza[] zzaVarArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    f2 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f5 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) SafeParcelReader.createTypedArray(parcel, header, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f8 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f9 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    zzaVarArr = (zza[]) SafeParcelReader.createTypedArray(parcel, header, zza.CREATOR);
                    break;
                case 14:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new FaceParcel(i2, i3, f2, f5, f6, f7, f3, f11, f12, landmarkParcelArr, f8, f9, f10, zzaVarArr, f4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i2) {
        return new FaceParcel[i2];
    }
}
