package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        long j2 = 0;
        Bitmap bitmap = null;
        String strCreateString2 = null;
        WalletCardIntent[] walletCardIntentArr = null;
        CardIconMessage[] cardIconMessageArr = null;
        String strCreateString3 = null;
        long j3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    bitmap = (Bitmap) SafeParcelReader.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    walletCardIntentArr = (WalletCardIntent[]) SafeParcelReader.createTypedArray(parcel, header, WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (CardIconMessage[]) SafeParcelReader.createTypedArray(parcel, header, CardIconMessage.CREATOR);
                    break;
                case 6:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new QuickAccessWalletCard(strCreateString, bitmap, strCreateString2, walletCardIntentArr, cardIconMessageArr, j2, j3, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new QuickAccessWalletCard[i2];
    }
}
