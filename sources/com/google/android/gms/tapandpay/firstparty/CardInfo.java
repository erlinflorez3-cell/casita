package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.tapandpay.zzbz;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzh();
    final boolean zzA;
    final long zzB;
    final long zzC;
    final boolean zzD;
    final long zzE;
    final String zzF;
    final String zzG;
    final zzi zzH;
    final int zzI;
    final boolean zzJ;
    final String zzK;
    final int zzL;
    final boolean zzM;
    final long zzN;
    final String zzO;
    final int zzP;
    final List zzQ;
    final zzbf zzR;
    final String zzS;
    final String zzT;
    final String zzU;
    final long zzV;
    final int zzW;
    final int zzX;
    final int zzY;
    final byte[] zzZ;
    final String zza;
    final String zzb;
    final byte[] zzc;
    final String zzd;
    final String zze;
    final int zzf;
    final TokenStatus zzg;
    final String zzh;
    final Uri zzi;
    final int zzj;
    final int zzk;
    final zzau zzl;
    final String zzm;
    final zzbo zzn;
    final String zzo;
    final byte[] zzp;
    final int zzq;
    final int zzr;
    final int zzs;
    final zzaq zzt;
    final zzao zzu;
    final String zzv;
    final zzay[] zzw;
    final boolean zzx;
    final List zzy;
    final boolean zzz;

    static {
        zzbz.zzf(10, 9);
    }

    CardInfo(String str, String str2, byte[] bArr, String str3, String str4, int i2, TokenStatus tokenStatus, String str5, Uri uri, int i3, int i4, zzau zzauVar, String str6, zzbo zzboVar, String str7, byte[] bArr2, int i5, int i6, int i7, zzaq zzaqVar, zzao zzaoVar, String str8, zzay[] zzayVarArr, boolean z2, List list, boolean z3, boolean z4, long j2, long j3, boolean z5, long j4, String str9, String str10, zzi zziVar, int i8, boolean z6, String str11, int i9, boolean z7, long j5, String str12, int i10, List list2, zzbf zzbfVar, String str13, String str14, String str15, long j6, int i11, int i12, int i13, byte[] bArr3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = i2;
        this.zzg = tokenStatus;
        this.zzh = str5;
        this.zzi = uri;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzauVar;
        this.zzm = str6;
        this.zzn = zzboVar;
        this.zzo = str7;
        this.zzp = bArr2;
        this.zzq = i5;
        this.zzr = i6;
        this.zzs = i7;
        this.zzt = zzaqVar;
        this.zzu = zzaoVar;
        this.zzv = str8;
        this.zzw = zzayVarArr;
        this.zzx = z2;
        this.zzy = list;
        this.zzz = z3;
        this.zzA = z4;
        this.zzB = j2;
        this.zzC = j3;
        this.zzD = z5;
        this.zzE = j4;
        this.zzF = str9;
        this.zzG = str10;
        this.zzH = zziVar;
        this.zzI = i8;
        this.zzJ = z6;
        this.zzK = str11;
        this.zzL = i9;
        this.zzM = z7;
        this.zzN = j5;
        this.zzO = str12;
        this.zzP = i10;
        this.zzQ = list2;
        this.zzR = zzbfVar;
        this.zzS = str13;
        this.zzT = str14;
        this.zzU = str15;
        this.zzV = j6;
        this.zzW = i11;
        this.zzX = i12;
        this.zzY = i13;
        this.zzZ = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (Objects.equal(this.zza, cardInfo.zza) && Objects.equal(this.zzb, cardInfo.zzb) && Arrays.equals(this.zzc, cardInfo.zzc) && Objects.equal(this.zzd, cardInfo.zzd) && Objects.equal(this.zze, cardInfo.zze) && this.zzf == cardInfo.zzf && Objects.equal(this.zzg, cardInfo.zzg) && Objects.equal(this.zzh, cardInfo.zzh) && Objects.equal(this.zzi, cardInfo.zzi) && this.zzj == cardInfo.zzj && this.zzk == cardInfo.zzk && Objects.equal(this.zzl, cardInfo.zzl) && Objects.equal(this.zzm, cardInfo.zzm) && Objects.equal(this.zzn, cardInfo.zzn) && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && this.zzs == cardInfo.zzs && Objects.equal(this.zzt, cardInfo.zzt) && Objects.equal(this.zzu, cardInfo.zzu) && Objects.equal(this.zzv, cardInfo.zzv) && Arrays.equals(this.zzw, cardInfo.zzw) && this.zzx == cardInfo.zzx && Objects.equal(this.zzy, cardInfo.zzy) && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzB == cardInfo.zzB && this.zzD == cardInfo.zzD && this.zzE == cardInfo.zzE && Objects.equal(this.zzF, cardInfo.zzF) && Objects.equal(this.zzG, cardInfo.zzG) && Objects.equal(this.zzH, cardInfo.zzH) && this.zzI == cardInfo.zzI && this.zzJ == cardInfo.zzJ && this.zzL == cardInfo.zzL && this.zzM == cardInfo.zzM && this.zzP == cardInfo.zzP && this.zzN == cardInfo.zzN && Objects.equal(this.zzO, cardInfo.zzO) && Objects.equal(this.zzQ, cardInfo.zzQ) && Objects.equal(this.zzR, cardInfo.zzR) && Objects.equal(this.zzS, cardInfo.zzS) && Objects.equal(this.zzT, cardInfo.zzT) && Objects.equal(this.zzU, cardInfo.zzU) && this.zzV == cardInfo.zzV && this.zzW == cardInfo.zzW && this.zzX == cardInfo.zzX && this.zzY == cardInfo.zzY && Arrays.equals(this.zzZ, cardInfo.zzZ)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(this.zzf), this.zzg, this.zzh, this.zzi, Integer.valueOf(this.zzj), Integer.valueOf(this.zzk), this.zzm, this.zzn, Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), Integer.valueOf(this.zzs), this.zzt, this.zzu, this.zzv, this.zzw, Boolean.valueOf(this.zzx), this.zzy, Boolean.valueOf(this.zzz), Boolean.valueOf(this.zzA), Long.valueOf(this.zzB), Boolean.valueOf(this.zzD), Long.valueOf(this.zzE), this.zzF, this.zzG, this.zzH, Integer.valueOf(this.zzI), Boolean.valueOf(this.zzJ), Integer.valueOf(this.zzL), Boolean.valueOf(this.zzM), Long.valueOf(this.zzN), this.zzO, Integer.valueOf(this.zzP), this.zzQ, this.zzR, this.zzS, this.zzT, this.zzU, Long.valueOf(this.zzV), Integer.valueOf(this.zzW), Integer.valueOf(this.zzX), Integer.valueOf(this.zzY), this.zzZ);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.zza).add("auxClientTokenId", this.zzb);
        byte[] bArr = this.zzc;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardholderName", this.zzd).add("displayName", this.zze).add("cardNetwork", Integer.valueOf(this.zzf)).add("tokenStatus", this.zzg).add("panLastDigits", this.zzh).add("cardImageUrl", this.zzi).add("cardColor", Integer.valueOf(this.zzj)).add("overlayTextColor", Integer.valueOf(this.zzk));
        zzau zzauVar = this.zzl;
        Objects.ToStringHelper toStringHelperAdd3 = toStringHelperAdd2.add("issuerInfo", zzauVar == null ? null : zzauVar.toString()).add("tokenLastDigits", this.zzm).add("transactionInfo", this.zzn).add("issuerTokenId", this.zzo);
        byte[] bArr2 = this.zzp;
        Objects.ToStringHelper toStringHelperAdd4 = toStringHelperAdd3.add("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2)).add("cachedEligibility", Integer.valueOf(this.zzq)).add("paymentProtocol", Integer.valueOf(this.zzr)).add("tokenType", Integer.valueOf(this.zzs)).add("inStoreCvmConfig", this.zzt).add("inAppCvmConfig", this.zzu).add("tokenDisplayName", this.zzv);
        zzay[] zzayVarArr = this.zzw;
        Objects.ToStringHelper toStringHelperAdd5 = toStringHelperAdd4.add("onlineAccountCardLinkInfos", zzayVarArr == null ? null : Arrays.toString(zzayVarArr)).add("allowAidSelection", Boolean.valueOf(this.zzx));
        String strJoin = TextUtils.join(", ", this.zzy);
        StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
        sb.append("[");
        sb.append(strJoin);
        sb.append("]");
        Objects.ToStringHelper toStringHelperAdd6 = toStringHelperAdd5.add("badges", sb.toString()).add("upgradeAvailable", Boolean.valueOf(this.zzz)).add("requiresSignature", Boolean.valueOf(this.zzA)).add("googleTokenId", Long.valueOf(this.zzB)).add("isTransit", Boolean.valueOf(this.zzD)).add("googleWalletId", Long.valueOf(this.zzE)).add("devicePaymentMethodId", this.zzF).add("cloudPaymentMethodId", this.zzG).add("auxiliaryGoogleTokenId", Long.valueOf(this.zzN)).add("auxiliaryIssuerTokenId", this.zzO).add("auxiliaryNetwork", Integer.valueOf(this.zzP));
        List list = this.zzQ;
        return toStringHelperAdd6.add("cobadgedDefaultOrderOfPaymentNetwork", list != null ? list.toString() : null).add("seInfo", this.zzR).add("rawPrevPanLastDigits", this.zzS).add("prevPanDisplayName", this.zzT).add("cardDisplayName", this.zzU).add("BillingCustomerNumber", Long.valueOf(this.zzV)).add("applicationPriorityIndicatorOverride", Integer.valueOf(this.zzW)).add("auxiliaryApplicationPriorityIndicatorOverride", Integer.valueOf(this.zzX)).add("tokenizationMethod", Integer.valueOf(this.zzY)).add("financialAccountDetailsBytes", this.zzZ).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i2, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i2, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i2, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i2, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 20, this.zzr);
        SafeParcelWriter.writeInt(parcel, 21, this.zzs);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzt, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzu, i2, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeTypedArray(parcel, 25, this.zzw, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzx);
        SafeParcelWriter.writeTypedList(parcel, 27, this.zzy, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzz);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzA);
        SafeParcelWriter.writeLong(parcel, 30, this.zzB);
        SafeParcelWriter.writeLong(parcel, 31, this.zzC);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzD);
        SafeParcelWriter.writeLong(parcel, 33, this.zzE);
        SafeParcelWriter.writeString(parcel, 34, this.zzF, false);
        SafeParcelWriter.writeString(parcel, 35, this.zzG, false);
        SafeParcelWriter.writeParcelable(parcel, 36, this.zzH, i2, false);
        SafeParcelWriter.writeInt(parcel, 37, this.zzI);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzJ);
        SafeParcelWriter.writeString(parcel, 39, this.zzK, false);
        SafeParcelWriter.writeInt(parcel, 40, this.zzL);
        SafeParcelWriter.writeBoolean(parcel, 41, this.zzM);
        SafeParcelWriter.writeLong(parcel, 42, this.zzN);
        SafeParcelWriter.writeString(parcel, 43, this.zzO, false);
        SafeParcelWriter.writeInt(parcel, 44, this.zzP);
        SafeParcelWriter.writeString(parcel, 45, this.zzb, false);
        SafeParcelWriter.writeIntegerList(parcel, 47, this.zzQ, false);
        SafeParcelWriter.writeParcelable(parcel, 48, this.zzR, i2, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzS, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzT, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzU, false);
        SafeParcelWriter.writeLong(parcel, 52, this.zzV);
        SafeParcelWriter.writeInt(parcel, 53, this.zzW);
        SafeParcelWriter.writeInt(parcel, 54, this.zzX);
        SafeParcelWriter.writeInt(parcel, 55, this.zzY);
        SafeParcelWriter.writeByteArray(parcel, 56, this.zzZ, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
