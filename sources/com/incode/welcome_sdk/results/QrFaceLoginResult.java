package com.incode.welcome_sdk.results;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class QrFaceLoginResult extends BaseResult {
    public static final int $stable = 8;
    public final long id;
    public final boolean isBlocklisted;
    public final boolean isFaceMatched;
    public final Map<String, String> qrData;
    public final String selfieBase64;
    public final long timestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode) {
        this(resultCode, null, 0L, false, false, null, 0L, null, 254, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, 0L, false, false, null, 0L, null, 252, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2) {
        this(resultCode, th, j2, false, false, null, 0L, null, 248, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2) {
        this(resultCode, th, j2, z2, false, null, 0L, null, 240, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2, boolean z3) {
        this(resultCode, th, j2, z2, z3, null, 0L, null, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2, boolean z3, Map<String, String> map) {
        this(resultCode, th, j2, z2, z3, map, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2, boolean z3, Map<String, String> map, long j3) {
        this(resultCode, th, j2, z2, z3, map, j3, null, 128, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2, boolean z3, Map map, long j3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? z3 : false, (i2 & 32) != 0 ? null : map, (i2 & 64) == 0 ? j3 : 0L, (i2 & 128) == 0 ? str : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrFaceLoginResult(ResultCode resultCode, Throwable th, long j2, boolean z2, boolean z3, Map<String, String> map, long j3, String str) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.id = j2;
        this.isFaceMatched = z2;
        this.isBlocklisted = z3;
        this.qrData = map;
        this.timestamp = j3;
        this.selfieBase64 = str;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "QrFaceLoginResult(id=" + this.id + ", isFaceMatched=" + this.isFaceMatched + ", isBlocklisted=" + this.isBlocklisted + ", qrData=" + this.qrData + ", timestamp=" + this.timestamp + ", selfieBase64=" + this.selfieBase64 + ")";
    }
}
