package com.incode.welcome_sdk.ui.camera.id_validation.helper;

import com.incode.welcome_sdk.data.remote.beans.e;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.IdScanResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScanResultHelperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11867a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11868c = 0;

    public static /* synthetic */ IdScanResult createIdScanResultFromIdSummary$default(e eVar, boolean z2, Boolean bool, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f11867a + 93;
        int i5 = i4 % 128;
        f11868c = i5;
        int i6 = i2 & 4;
        if (i4 % 2 == 0 ? i6 != 0 : i6 != 0) {
            int i7 = i5 + 85;
            int i8 = i7 % 128;
            f11867a = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 105;
            f11868c = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 4;
            }
            bool = null;
        }
        return createIdScanResultFromIdSummary(eVar, z2, bool);
    }

    public static final IdScanResult createIdScanResultFromIdSummary(e eVar, boolean z2, Boolean bool) {
        int i2;
        Intrinsics.checkNotNullParameter(eVar, "");
        if (eVar.e()) {
            i2 = !eVar.c() ? 8 : 0;
        } else {
            i2 = 1;
        }
        return new IdScanResult(null, null, i2, z2 ? IdScan.IdType.PASSPORT : IdScan.IdType.ID, null, null, false, bool != null ? bool.booleanValue() : false, null, null, null, null, null, false, null, null, 65395, null);
    }

    public static final IdScanResult createIdScanResultFromIdSummary(e eVar, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11867a + 105;
        f11868c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVar, "");
        Object obj = null;
        IdScanResult idScanResultCreateIdScanResultFromIdSummary$default = createIdScanResultFromIdSummary$default(eVar, z2, null, 4, null);
        int i5 = f11868c + 41;
        f11867a = i5 % 128;
        if (i5 % 2 != 0) {
            return idScanResultCreateIdScanResultFromIdSummary$default;
        }
        obj.hashCode();
        throw null;
    }
}
