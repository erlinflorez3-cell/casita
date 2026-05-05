package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        long j2 = 0;
        boolean z2 = true;
        boolean z3 = false;
        long j3 = -2147483648L;
        String strCreateString2 = "";
        int i2 = 100;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z4 = true;
        int i3 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        String strCreateString12 = "";
        String strCreateString13 = strCreateString12;
        String strCreateString14 = strCreateString13;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 14:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 24:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j9 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzo(strCreateString, strCreateString3, strCreateString4, strCreateString5, j2, j4, strCreateString6, z2, z3, j3, strCreateString7, j5, j6, i3, z4, z5, strCreateString8, booleanObject, j7, arrayListCreateStringList, strCreateString9, strCreateString2, strCreateString12, strCreateString10, z6, j8, i2, strCreateString13, i4, j9, strCreateString11, strCreateString14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i2) {
        return new zzo[i2];
    }
}
