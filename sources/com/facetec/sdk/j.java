package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
final class j {
    static boolean V = false;

    j() {
    }

    static void Z() {
        String str;
        if (!FaceTecSDK.V.f2854e.containsKey("ac_cpngi") || (str = FaceTecSDK.V.f2854e.get("ac_cpngi")) == null) {
            return;
        }
        V = str.equals("040dfacf-ed9b-403e-81c2-564d932de5da");
    }
}
