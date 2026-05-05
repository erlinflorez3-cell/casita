package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.incode.welcome_sdk.modules.DynamicForms;

/* JADX INFO: loaded from: classes5.dex */
public interface FormsInputUiState<T> {
    T getAnswer();

    DynamicForms.InputType getFormInputType();

    String getId();

    String getQuestionText();

    boolean hasAnswer();

    boolean isValid();
}
