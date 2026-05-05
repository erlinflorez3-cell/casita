package fr.antelop.sdk.exception;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletValidationException extends Exception {
    private final WalletValidationErrorCode code;
    private final String domain;

    public WalletValidationException(WalletValidationErrorCode walletValidationErrorCode, String str) {
        this.domain = str;
        this.code = walletValidationErrorCode;
    }

    public WalletValidationException(WalletValidationErrorCode walletValidationErrorCode, String str, String str2) {
        super(str2);
        this.domain = str;
        this.code = walletValidationErrorCode;
    }

    public WalletValidationException(WalletValidationErrorCode walletValidationErrorCode, String str, Throwable th) {
        super(th.getMessage() != null ? th.getMessage() : th.toString());
        this.domain = str;
        this.code = walletValidationErrorCode;
    }

    public final WalletValidationErrorCode getCode() {
        return this.code;
    }

    public final String getDomain() {
        return this.domain;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return getMessage();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return message != null ? message : new StringBuilder().append(getDomain()).append(" - ").append(getCode().name()).toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return new StringBuilder("WalletValidationException{domain='").append(this.domain).append("', code=").append(this.code).append(super.getMessage() != null ? new StringBuilder(", message=").append(super.getMessage()).toString() : "").append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
