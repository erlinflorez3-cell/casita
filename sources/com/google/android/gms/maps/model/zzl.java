package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f2 = 0.0f;
        LatLng latLng = null;
        boolean z2 = false;
        float f3 = 1.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString3 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    f2 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 14:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f8 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 16:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 17:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    f9 = SafeParcelReader.readFloat(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MarkerOptions(latLng, strCreateString, strCreateString2, iBinder, f2, f5, z2, z3, z4, f6, f4, f7, f3, f8, i2, iBinder2, i3, strCreateString3, f9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new MarkerOptions[i2];
    }
}
