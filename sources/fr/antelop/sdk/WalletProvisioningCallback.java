package fr.antelop.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletProvisioningCallback {
    void onCheckEligibilityError(AntelopError antelopError, Object obj);

    void onDeviceEligible(boolean z2, List<Product> list, Object obj);

    void onDeviceNotEligible(EligibilityDenialReason eligibilityDenialReason, Object obj, String str);

    void onInitializationError(AntelopError antelopError, Object obj);

    void onInitializationSuccess(Object obj);

    @Deprecated
    default void onPermissionNotGranted(String[] strArr, Object obj) {
    }

    void onProvisioningError(AntelopError antelopError, Object obj);

    void onProvisioningPending(Object obj);

    void onProvisioningSuccess(Object obj);
}
