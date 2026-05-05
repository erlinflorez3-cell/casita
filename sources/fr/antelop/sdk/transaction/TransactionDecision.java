package fr.antelop.sdk.transaction;

import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionDecision {
    private byte[] discretionaryData;
    private List<CustomerAuthenticationMethodType> extraAuthenticationMethods;
    private final TransactionOutcome outcome;

    public enum TransactionOutcome {
        Proceed,
        Decline,
        TryAgain
    }

    public TransactionDecision(TransactionOutcome transactionOutcome) {
        this(transactionOutcome, null);
    }

    public TransactionDecision(TransactionOutcome transactionOutcome, byte[] bArr) {
        this.outcome = transactionOutcome;
        this.discretionaryData = bArr;
    }

    public final byte[] getDiscretionaryData() {
        return this.discretionaryData;
    }

    public final List<CustomerAuthenticationMethodType> getExtraAuthenticationMethods() {
        return this.extraAuthenticationMethods;
    }

    public final TransactionOutcome getOutcome() {
        return this.outcome;
    }

    public final void setDiscretionaryData(byte[] bArr) {
        this.discretionaryData = bArr;
    }

    public final void setExtraAuthenticationMethods(List<CustomerAuthenticationMethodType> list) {
        this.extraAuthenticationMethods = list;
    }

    public final String toString() {
        return new StringBuilder("TransactionDecision{outcome=").append(this.outcome).append(", discretionaryData=").append(Arrays.toString(this.discretionaryData)).append(", extraAuthenticationMethods=").append(this.extraAuthenticationMethods).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
