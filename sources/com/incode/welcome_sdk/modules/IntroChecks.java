package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public enum IntroChecks {
    ID(R.string.onboard_sdk_intro_check_id),
    PASSPORT(R.string.onboard_sdk_intro_check_passport),
    ID_OR_PASSPORT(R.string.onboard_sdk_intro_check_id_or_passport),
    PROOF_OF_ADDRESS(R.string.onboard_sdk_intro_check_address),
    SELFIE(R.string.onboard_sdk_intro_check_selfie),
    MEDICAL_DOC(R.string.onboard_sdk_intro_check_medical_doc),
    OTHER_DOC(R.string.onboard_sdk_intro_check_other_doc);

    private final int introCheckResId;

    IntroChecks(int i2) {
        this.introCheckResId = i2;
    }

    public final int getIntroCheckResId() {
        return this.introCheckResId;
    }
}
