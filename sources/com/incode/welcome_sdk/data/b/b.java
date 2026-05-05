package com.incode.welcome_sdk.data.b;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.beans.bg;
import com.incode.welcome_sdk.results.PaymentProofInfoResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7609d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7610e = 0;

    public static final PaymentProofInfoResult a(bg bgVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bgVar, "");
        String strE = bgVar.e();
        String strC = bgVar.c();
        int iD = IncodeWelcome.cm.d();
        String str = (String) bg.c(new Object[]{bgVar}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), -2109765290, IncodeWelcome.cm.d(), iD, 2109765292);
        String strA = bgVar.a();
        String strB = bgVar.b();
        String strJ = bgVar.j();
        String strG = bgVar.g();
        int iD2 = IncodeWelcome.cm.d();
        String str2 = (String) bg.c(new Object[]{bgVar}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), 426568383, IncodeWelcome.cm.d(), iD2, -426568383);
        String strF = bgVar.f();
        String strH = bgVar.h();
        int iD3 = IncodeWelcome.cm.d();
        PaymentProofInfoResult paymentProofInfoResult = new PaymentProofInfoResult(strE, strC, str, strA, strB, strJ, strG, str2, strF, strH, (String) bg.c(new Object[]{bgVar}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), -917271363, IncodeWelcome.cm.d(), iD3, 917271364), bgVar.k(), bgVar.n());
        int i3 = f7610e + 103;
        f7609d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
        return paymentProofInfoResult;
    }
}
