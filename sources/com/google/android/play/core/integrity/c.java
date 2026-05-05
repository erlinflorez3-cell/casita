package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f3424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f3425b;

    c() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i2) {
        this.f3425b = (byte) ((-1) - (((-1) - this.f3425b) & ((-1) - 2)));
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f3425b == 3) {
            return new e(this.f3424a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        byte b2 = this.f3425b;
        if ((b2 + 1) - (b2 | 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        byte b3 = this.f3425b;
        if ((b3 + 2) - (b3 | 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j2) {
        this.f3424a = j2;
        this.f3425b = (byte) ((-1) - (((-1) - this.f3425b) & ((-1) - 1)));
        return this;
    }
}
