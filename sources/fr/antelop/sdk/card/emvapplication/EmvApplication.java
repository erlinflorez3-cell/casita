package fr.antelop.sdk.card.emvapplication;

import android.content.Context;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.Product;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface EmvApplication {
    List<EmvApplicationActivationMethod> getActivationMethods();

    String getCardId();

    String getEmvApplicationGroupId();

    String getId();

    Product getProduct();

    EmvApplicationActivationMethod getSelectedActivationMethod();

    EmvApplicationStatus getStatus();

    EmvApplicationType getType();

    @Deprecated
    void selectActivationMethod(Context context, String str, AntelopCallback antelopCallback) throws WalletValidationException;

    void selectActivationMethod(Context context, String str, OperationCallback<Void> operationCallback) throws WalletValidationException;

    @Deprecated
    void submitActivationCode(Context context, String str, AntelopCallback antelopCallback) throws WalletValidationException;

    void submitActivationCode(Context context, String str, OperationCallback<Void> operationCallback) throws WalletValidationException;
}
