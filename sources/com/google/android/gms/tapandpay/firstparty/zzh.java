package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        int i2 = 0;
        long j2 = 0;
        String strCreateString2 = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        TokenStatus tokenStatus = null;
        String strCreateString5 = null;
        Uri uri = null;
        zzau zzauVar = null;
        String strCreateString6 = null;
        zzbo zzboVar = null;
        String strCreateString7 = null;
        byte[] bArrCreateByteArray2 = null;
        zzaq zzaqVar = null;
        zzao zzaoVar = null;
        String strCreateString8 = null;
        zzay[] zzayVarArr = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        zzi zziVar = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        zzbf zzbfVar = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        String strCreateString15 = null;
        byte[] bArrCreateByteArray3 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, header, TokenStatus.CREATOR);
                    break;
                case 8:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 10:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 11:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    zzauVar = (zzau) SafeParcelReader.createParcelable(parcel, header, zzau.CREATOR);
                    break;
                case 13:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                case 19:
                case 46:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 15:
                    zzboVar = (zzbo) SafeParcelReader.createParcelable(parcel, header, zzbo.CREATOR);
                    break;
                case 16:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 22:
                    zzaqVar = (zzaq) SafeParcelReader.createParcelable(parcel, header, zzaq.CREATOR);
                    break;
                case 23:
                    zzaoVar = (zzao) SafeParcelReader.createParcelable(parcel, header, zzao.CREATOR);
                    break;
                case 24:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    zzayVarArr = (zzay[]) SafeParcelReader.createTypedArray(parcel, header, zzay.CREATOR);
                    break;
                case 26:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzf.CREATOR);
                    break;
                case 28:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 31:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 32:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 34:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 35:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    zziVar = (zzi) SafeParcelReader.createParcelable(parcel, header, zzi.CREATOR);
                    break;
                case 37:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 38:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 41:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 42:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 43:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 44:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 45:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 47:
                    arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 48:
                    zzbfVar = (zzbf) SafeParcelReader.createParcelable(parcel, header, zzbf.CREATOR);
                    break;
                case 49:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 50:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 51:
                    strCreateString15 = SafeParcelReader.createString(parcel, header);
                    break;
                case 52:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 53:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 54:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 55:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 56:
                    bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardInfo(strCreateString, strCreateString2, bArrCreateByteArray, strCreateString3, strCreateString4, i2, tokenStatus, strCreateString5, uri, i3, i4, zzauVar, strCreateString6, zzboVar, strCreateString7, bArrCreateByteArray2, i5, i6, i7, zzaqVar, zzaoVar, strCreateString8, zzayVarArr, z2, arrayListCreateTypedList, z3, z4, j2, j3, z5, j4, strCreateString9, strCreateString10, zziVar, i8, z6, strCreateString11, i9, z7, j5, strCreateString12, i10, arrayListCreateIntegerList, zzbfVar, strCreateString13, strCreateString14, strCreateString15, j6, i11, i12, i13, bArrCreateByteArray3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new CardInfo[i2];
    }
}
