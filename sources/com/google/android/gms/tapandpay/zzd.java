package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tapandpay.TapAndPay;

/* JADX INFO: loaded from: classes8.dex */
final class zzd implements ListenerHolder.Notifier {
    zzd() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((TapAndPay.DataChangedListener) obj).onDataChanged();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
