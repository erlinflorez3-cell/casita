package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import io.reactivex.functions.Predicate;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class BaseValidationPresenter$$ExternalSyntheticLambda25 implements Predicate {
    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        return ((ResponseSuccess) obj).isSuccess();
    }
}
