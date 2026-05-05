package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public class LoadingActionNameGenerator implements ActionNameCustomizer {
    @Override // com.dynatrace.android.useraction.ActionNameCustomizer
    public String customize(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        return Global.LOADING + str;
    }
}
