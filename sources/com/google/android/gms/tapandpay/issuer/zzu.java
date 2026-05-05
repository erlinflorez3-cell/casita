package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ServerPushProvisionRequest.ExtraOptions extraOptionsDefaultOptions = ServerPushProvisionRequest.ExtraOptions.defaultOptions();
        PushProvisionSessionContext pushProvisionSessionContext = null;
        String strCreateString = null;
        UserAddress userAddress = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                pushProvisionSessionContext = (PushProvisionSessionContext) SafeParcelReader.createParcelable(parcel, header, PushProvisionSessionContext.CREATOR);
            } else if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                userAddress = (UserAddress) SafeParcelReader.createParcelable(parcel, header, UserAddress.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                extraOptionsDefaultOptions = (ServerPushProvisionRequest.ExtraOptions) SafeParcelReader.createParcelable(parcel, header, ServerPushProvisionRequest.ExtraOptions.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ServerPushProvisionRequest(pushProvisionSessionContext, strCreateString, userAddress, extraOptionsDefaultOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ServerPushProvisionRequest[i2];
    }
}
