package com.incode.welcome_sdk.data.b;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7611d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7612e = 1;

    public static final IncodeWelcome.OCRData b(ResponseOCRData responseOCRData) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(responseOCRData, "");
        IncodeWelcome.OCRData oCRData = new IncodeWelcome.OCRData(responseOCRData);
        int i3 = f7611d + 33;
        f7612e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return oCRData;
    }
}
