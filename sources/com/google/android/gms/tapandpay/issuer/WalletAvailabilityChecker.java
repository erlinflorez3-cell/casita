package com.google.android.gms.tapandpay.issuer;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public interface WalletAvailabilityChecker {
    Future<Boolean> isAvailable(String str);
}
