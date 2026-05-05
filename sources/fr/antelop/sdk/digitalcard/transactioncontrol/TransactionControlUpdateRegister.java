package fr.antelop.sdk.digitalcard.transactioncontrol;

import android.content.Context;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import o.ex.d;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionControlUpdateRegister {
    private final d innerTransactionControlUpdateRegister;

    /* JADX INFO: renamed from: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdateRegister$1 */
    class AnonymousClass1 implements DefaultCustomerAuthenticatedProcessCallback {
        final /* synthetic */ OperationCallback val$callback;

        AnonymousClass1(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
        public CustomerAuthenticationPrompt buildCustomerAuthenticationPrompt(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPromptBuilder customerAuthenticationPromptBuilder) {
            return customerAuthenticationPromptBuilder.build();
        }

        @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
        public void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
        }

        @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
        public void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            operationCallback.onError(antelopError);
        }

        @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
        public void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
        }

        @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
        public void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            operationCallback.onSuccess(null);
        }
    }

    public TransactionControlUpdateRegister(d dVar) {
        this.innerTransactionControlUpdateRegister = dVar;
    }

    public final TransactionControlUpdateRegister add(TransactionControlUpdate<?> transactionControlUpdate) {
        this.innerTransactionControlUpdateRegister.b(transactionControlUpdate.getInner());
        return this;
    }

    public final void commit(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        if (this.innerTransactionControlUpdateRegister.e().isEmpty()) {
            return;
        }
        new SecureTransactionControlUpdateCommit(this.innerTransactionControlUpdateRegister.b()).launch(context, new DefaultCustomerAuthenticatedProcessCallback() { // from class: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdateRegister.1
            final /* synthetic */ OperationCallback val$callback;

            AnonymousClass1(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public CustomerAuthenticationPrompt buildCustomerAuthenticationPrompt(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPromptBuilder customerAuthenticationPromptBuilder) {
                return customerAuthenticationPromptBuilder.build();
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                operationCallback.onSuccess(null);
            }
        });
    }

    public final SecureTransactionControlUpdateCommit getSecureTransactionControlUpdateCommit() throws WalletValidationException {
        if (this.innerTransactionControlUpdateRegister.e().isEmpty()) {
            return null;
        }
        return new SecureTransactionControlUpdateCommit(this.innerTransactionControlUpdateRegister.b());
    }
}
