package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationResult extends BaseResult {
    public static final int $stable = 8;
    public final IncodeWelcome.AddressFields addressFields;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeolocationResult(ResultCode resultCode) {
        this(resultCode, null, null, 0.0d, 0.0d, 30, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeolocationResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, 0.0d, 0.0d, 28, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeolocationResult(ResultCode resultCode, Throwable th, IncodeWelcome.AddressFields addressFields) {
        this(resultCode, th, addressFields, 0.0d, 0.0d, 24, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeolocationResult(ResultCode resultCode, Throwable th, IncodeWelcome.AddressFields addressFields, double d2) {
        this(resultCode, th, addressFields, d2, 0.0d, 16, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ GeolocationResult(ResultCode resultCode, Throwable th, IncodeWelcome.AddressFields addressFields, double d2, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) == 0 ? addressFields : null, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) == 0 ? d3 : 0.0d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeolocationResult(ResultCode resultCode, Throwable th, IncodeWelcome.AddressFields addressFields, double d2, double d3) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.addressFields = addressFields;
        this.latitude = d2;
        this.longitude = d3;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "GeolocationResult{addressFields=" + this.addressFields + ", latitude=" + this.latitude + ", longitude=" + this.longitude + "}";
    }
}
