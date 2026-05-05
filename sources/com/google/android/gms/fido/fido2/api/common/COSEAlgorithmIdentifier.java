package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();
    private final Algorithm zza;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i2) {
            super("Algorithm with COSE value " + i2 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    public static COSEAlgorithmIdentifier fromCoseValue(int i2) throws UnsupportedAlgorithmIdentifierException {
        Algorithm algorithm;
        if (i2 == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            algorithm = RSAAlgorithm.RS1;
        } else {
            Algorithm[] algorithmArrValues = RSAAlgorithm.values();
            int length = algorithmArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Algorithm[] algorithmArrValues2 = EC2Algorithm.values();
                    int length2 = algorithmArrValues2.length;
                    for (int i4 = 0; i4 < length2; i4++) {
                        algorithm = algorithmArrValues2[i4];
                        if (algorithm.getAlgoValue() != i2) {
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(i2);
                }
                algorithm = algorithmArrValues[i3];
                if (algorithm.getAlgoValue() == i2) {
                    break;
                }
                i3++;
            }
        }
        return new COSEAlgorithmIdentifier(algorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
