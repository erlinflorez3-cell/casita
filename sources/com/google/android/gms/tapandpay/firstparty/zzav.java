package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i2 = 0;
        String strCreateString = null;
        long j2 = 0;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        String strCreateString15 = null;
        String strCreateString16 = null;
        String strCreateString17 = null;
        String strCreateString18 = null;
        String strCreateString19 = null;
        String strCreateString20 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 12:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 15:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 16:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    strCreateString15 = SafeParcelReader.createString(parcel, header);
                    break;
                case 18:
                    strCreateString16 = SafeParcelReader.createString(parcel, header);
                    break;
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 20:
                    strCreateString17 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    strCreateString18 = SafeParcelReader.createString(parcel, header);
                    break;
                case 22:
                    strCreateString19 = SafeParcelReader.createString(parcel, header);
                    break;
                case 23:
                    strCreateString20 = SafeParcelReader.createString(parcel, header);
                    break;
                case 24:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzau(strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, strCreateString7, strCreateString8, strCreateString9, strCreateString10, strCreateString11, strCreateString12, strCreateString13, j2, strCreateString14, strCreateString15, strCreateString16, strCreateString17, strCreateString18, strCreateString19, strCreateString20, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzau[i2];
    }
}
