package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PushTokenizeExtraOptions pushTokenizeExtraOptionsDefaultOptions = PushTokenizeExtraOptions.defaultOptions();
        byte[] bArrCreateByteArray = null;
        int i2 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        UserAddress userAddress = null;
        int[] iArrCreateIntArray = null;
        IBinder iBinder = null;
        CobadgedTokenInfo cobadgedTokenInfo = null;
        SupervisedUserInfo supervisedUserInfo = null;
        String[] strArrCreateStringArray = null;
        int i3 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 5:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    userAddress = (UserAddress) SafeParcelReader.createParcelable(parcel, header, UserAddress.CREATOR);
                    break;
                case 8:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 10:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 11:
                    cobadgedTokenInfo = (CobadgedTokenInfo) SafeParcelReader.createParcelable(parcel, header, CobadgedTokenInfo.CREATOR);
                    break;
                case 12:
                    supervisedUserInfo = (SupervisedUserInfo) SafeParcelReader.createParcelable(parcel, header, SupervisedUserInfo.CREATOR);
                    break;
                case 13:
                    strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header);
                    break;
                case 14:
                    pushTokenizeExtraOptionsDefaultOptions = (PushTokenizeExtraOptions) SafeParcelReader.createParcelable(parcel, header, PushTokenizeExtraOptions.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PushTokenizeRequest(i2, i3, bArrCreateByteArray, strCreateString, strCreateString2, userAddress, z2, iArrCreateIntArray, iBinder, cobadgedTokenInfo, supervisedUserInfo, strArrCreateStringArray, pushTokenizeExtraOptionsDefaultOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new PushTokenizeRequest[i2];
    }
}
