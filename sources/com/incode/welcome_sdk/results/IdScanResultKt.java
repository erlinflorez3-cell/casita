package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScanResultKt {
    public static final boolean isScanStatusOk(IdScanResult idScanResult) {
        Intrinsics.checkNotNullParameter(idScanResult, "<this>");
        return idScanResult.scanStatus == 0;
    }
}
