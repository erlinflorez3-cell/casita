package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new zzp();
    final int zza;
    final int zzb;
    final byte[] zzc;
    final String zzd;
    final String zze;
    final UserAddress zzf;
    final boolean zzg;
    final int[] zzh;
    final IBinder zzi;
    final CobadgedTokenInfo zzj;
    final SupervisedUserInfo zzk;
    final String[] zzl;
    final PushTokenizeExtraOptions zzm;

    public static class Builder {
        private int zza;
        private int zzb;
        private byte[] zzc;
        private String zzd;
        private String zze;
        private UserAddress zzf;
        private boolean zzg;
        private Executor zzh;
        private WalletAvailabilityChecker zzi;
        private PaymentCredentialsGenerator zzj;
        private CobadgedTokenInfo zzk;
        private SupervisedUserInfo zzl;
        private PushTokenizeExtraOptions zzm;

        public PushTokenizeRequest build() throws Throwable {
            PushTokenizeCallbacks pushTokenizeCallbacksTryCreate = PushTokenizeCallbacks.tryCreate(this.zzh, this.zzi, this.zzj, this.zzk);
            int i2 = this.zza;
            int i3 = this.zzb;
            byte[] bArr = this.zzc;
            String str = this.zzd;
            String str2 = this.zze;
            UserAddress userAddress = this.zzf;
            boolean z2 = this.zzg;
            int[] supportedCallbackRequestTypes = pushTokenizeCallbacksTryCreate == null ? new int[0] : pushTokenizeCallbacksTryCreate.getSupportedCallbackRequestTypes();
            if (pushTokenizeCallbacksTryCreate == null) {
                pushTokenizeCallbacksTryCreate = null;
            }
            CobadgedTokenInfo cobadgedTokenInfo = this.zzk;
            SupervisedUserInfo supervisedUserInfo = this.zzl;
            PaymentCredentialsGenerator paymentCredentialsGenerator = this.zzj;
            String[] strArr = paymentCredentialsGenerator == null ? new String[0] : (String[]) paymentCredentialsGenerator.getSupportedTokenRequestorIds().toArray(new String[0]);
            PushTokenizeExtraOptions pushTokenizeExtraOptionsDefaultOptions = this.zzm;
            if (pushTokenizeExtraOptionsDefaultOptions == null) {
                pushTokenizeExtraOptionsDefaultOptions = PushTokenizeExtraOptions.defaultOptions();
            }
            return new PushTokenizeRequest(i2, i3, bArr, str, str2, userAddress, z2, supportedCallbackRequestTypes, pushTokenizeCallbacksTryCreate, cobadgedTokenInfo, supervisedUserInfo, strArr, pushTokenizeExtraOptionsDefaultOptions);
        }

        public Builder setCallbackRequestExecutor(Executor executor) {
            this.zzh = executor;
            return this;
        }

        public Builder setCobadgedTokenInfo(CobadgedTokenInfo cobadgedTokenInfo) {
            this.zzk = cobadgedTokenInfo;
            return this;
        }

        public Builder setDisplayName(String str) {
            this.zze = str;
            return this;
        }

        public Builder setIsTransit(boolean z2) {
            this.zzg = z2;
            return this;
        }

        public Builder setLastDigits(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setNetwork(int i2) {
            this.zza = i2;
            return this;
        }

        public Builder setOpaquePaymentCard(byte[] bArr) {
            this.zzc = bArr;
            return this;
        }

        public Builder setPaymentCredentialsGenerator(PaymentCredentialsGenerator paymentCredentialsGenerator) {
            this.zzj = paymentCredentialsGenerator;
            return this;
        }

        public Builder setPushTokenizeExtraOptions(PushTokenizeExtraOptions pushTokenizeExtraOptions) {
            this.zzm = pushTokenizeExtraOptions;
            return this;
        }

        public Builder setSupervisedUserInfo(SupervisedUserInfo supervisedUserInfo) {
            this.zzl = supervisedUserInfo;
            return this;
        }

        public Builder setTokenServiceProvider(int i2) {
            this.zzb = i2;
            return this;
        }

        public Builder setUserAddress(UserAddress userAddress) {
            this.zzf = userAddress;
            return this;
        }

        public Builder setWalletAvailabilityChecker(WalletAvailabilityChecker walletAvailabilityChecker) {
            this.zzi = walletAvailabilityChecker;
            return this;
        }
    }

    PushTokenizeRequest(int i2, int i3, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z2, int[] iArr, IBinder iBinder, CobadgedTokenInfo cobadgedTokenInfo, SupervisedUserInfo supervisedUserInfo, String[] strArr, PushTokenizeExtraOptions pushTokenizeExtraOptions) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = bArr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = userAddress;
        this.zzg = z2;
        this.zzh = iArr;
        this.zzi = iBinder;
        this.zzj = cobadgedTokenInfo;
        this.zzk = supervisedUserInfo;
        this.zzl = strArr;
        this.zzm = pushTokenizeExtraOptions;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushTokenizeRequest) {
            PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) obj;
            if (this.zza == pushTokenizeRequest.zza && this.zzb == pushTokenizeRequest.zzb && Arrays.equals(this.zzc, pushTokenizeRequest.zzc) && Objects.equal(this.zzd, pushTokenizeRequest.zzd) && Objects.equal(this.zze, pushTokenizeRequest.zze) && Objects.equal(this.zzf, pushTokenizeRequest.zzf) && this.zzg == pushTokenizeRequest.zzg && Arrays.equals(this.zzh, pushTokenizeRequest.zzh) && Objects.equal(this.zzi, pushTokenizeRequest.zzi) && Objects.equal(this.zzj, pushTokenizeRequest.zzj) && Objects.equal(this.zzk, pushTokenizeRequest.zzk) && Arrays.equals(this.zzl, pushTokenizeRequest.zzl) && Objects.equal(this.zzm, pushTokenizeRequest.zzm)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, Boolean.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, this.zzj, this.zzk, Integer.valueOf(Arrays.hashCode(this.zzl)), this.zzm);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("network", Integer.valueOf(this.zza)).add("tokenServiceProvider", Integer.valueOf(this.zzb)).add("opaquePaymentCard", Arrays.toString(this.zzc)).add("lastDigits", this.zzd).add("displayName", this.zze).add("userAddress", this.zzf).add("isTransit", Boolean.valueOf(this.zzg)).add("supportedCallbackRequestTypes", Arrays.toString(this.zzh)).add("pushTokenizeCallbacksBinder", this.zzi).add("cobadgedTokenInfo", this.zzj).add("supervisedUserInfo", this.zzk).add("supportedTokenRequestorIds", Arrays.toString(this.zzl)).add("pushTokenizeExtraOptions", this.zzm).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i3);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeIntArray(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i2, false);
        SafeParcelWriter.writeStringArray(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
