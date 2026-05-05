package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: i */
    private static int f10072i = 0;

    /* JADX INFO: renamed from: m */
    private static int f10073m = 1;

    /* JADX INFO: renamed from: a */
    private double f10074a;

    /* JADX INFO: renamed from: b */
    private boolean f10075b;

    /* JADX INFO: renamed from: c */
    private Boolean f10076c;

    /* JADX INFO: renamed from: d */
    private double f10077d;

    /* JADX INFO: renamed from: e */
    private boolean f10078e;

    /* JADX INFO: renamed from: f */
    private int f10079f;

    /* JADX INFO: renamed from: g */
    private boolean f10080g;

    /* JADX INFO: renamed from: h */
    private boolean f10081h;

    /* JADX INFO: renamed from: j */
    private boolean f10082j;

    public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i5;
        int i10 = (~(i8 | i3)) | (~(i8 | i9));
        int i11 = ~i3;
        int i12 = (~(i5 | i11 | i7)) | i10;
        int i13 = ~(i9 | i11);
        int i14 = i3 + i7 + i4 + ((-1228711472) * i6) + ((-141981132) * i2);
        int i15 = i14 * i14;
        int i16 = (((-639131287) * i3) - 2072313856) + (1118068377 * i7) + (i12 * (-1268883816)) + ((-1757199664) * i10) + ((-1268883816) * i13) + ((-1908015104) * i4) + ((-287309824) * i6) + ((-1573388288) * i2) + ((-2138374144) * i15);
        int i17 = ((i3 * (-646461497)) - 273503129) + (i7 * (-646460521)) + (i12 * 488) + (i10 * (-976)) + (i13 * 488) + (i4 * (-646461009)) + (i6 * 1623110960) + (i2 * (-2035004020)) + (i15 * 33882112);
        if (i16 + (i17 * i17 * (-1051394048)) == 1) {
            v vVar = (v) objArr[0];
            int i18 = 2 % 2;
            int i19 = f10073m;
            int i20 = i19 + 53;
            f10072i = i20 % 128;
            int i21 = i20 % 2;
            boolean z2 = vVar.f10082j;
            int i22 = i19 + 29;
            f10072i = i22 % 128;
            int i23 = i22 % 2;
            return Boolean.valueOf(z2);
        }
        v vVar2 = (v) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i24 = 2 % 2;
        int i25 = f10072i + 3;
        int i26 = i25 % 128;
        f10073m = i26;
        int i27 = i25 % 2;
        vVar2.f10079f = iIntValue;
        vVar2.f10080g = true;
        int i28 = i26 + 95;
        f10072i = i28 % 128;
        int i29 = i28 % 2;
        return null;
    }

    public v() {
        this.f10075b = true;
        this.f10077d = -1.0d;
        this.f10074a = 0.0d;
    }

    public v(Throwable th) {
        this.f10077d = -1.0d;
        this.f10074a = 0.0d;
        this.f10075b = true;
        this.f10079f = com.incode.welcome_sdk.commons.utils.n.b(th);
    }

    private v(double d2, double d3, boolean z2, boolean z3, Boolean bool, boolean z4, boolean z5) {
        this.f10077d = d2;
        this.f10074a = d3;
        this.f10078e = z2;
        this.f10075b = z3;
        this.f10076c = bool;
        this.f10081h = z4;
        this.f10082j = z5;
    }

    public final double b() {
        int i2 = 2 % 2;
        int i3 = f10072i;
        int i4 = i3 + 25;
        f10073m = i4 % 128;
        int i5 = i4 % 2;
        double d2 = this.f10077d;
        int i6 = i3 + 3;
        f10073m = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return d2;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f10073m;
        int i4 = i3 + 67;
        f10072i = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10080g;
        int i6 = i3 + 53;
        f10072i = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f10073m + 57;
        int i4 = i3 % 128;
        f10072i = i4;
        int i5 = i3 % 2;
        int i6 = this.f10079f;
        int i7 = i4 + 95;
        f10073m = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f10073m + 25;
        int i4 = i3 % 128;
        f10072i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10078e;
        int i6 = i4 + 85;
        f10073m = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f10073m + 123;
        f10072i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10075b;
        }
        throw null;
    }

    public final boolean h() {
        int i2 = 2 % 2;
        Boolean bool = this.f10076c;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        int i3 = f10072i;
        int i4 = i3 + 101;
        f10073m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 113;
        f10073m = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final Boolean j() {
        Boolean bool;
        int i2 = 2 % 2;
        int i3 = f10073m + 117;
        int i4 = i3 % 128;
        f10072i = i4;
        if (i3 % 2 != 0) {
            bool = this.f10076c;
            int i5 = 16 / 0;
        } else {
            bool = this.f10076c;
        }
        int i6 = i4 + 19;
        f10073m = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }

    public final boolean g() {
        int i2 = 2 % 2;
        int i3 = f10073m + 107;
        int i4 = i3 % 128;
        f10072i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10081h;
        int i6 = i4 + 5;
        f10073m = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return z2;
    }

    public final void e(double d2) {
        int i2 = 2 % 2;
        int i3 = f10072i;
        int i4 = i3 + 75;
        f10073m = i4 % 128;
        int i5 = i4 % 2;
        this.f10077d = d2;
        int i6 = i3 + 79;
        f10073m = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseAddFace{confidence=").append(this.f10077d).append(", blurriness=").append(this.f10074a).append(", hasLenses=").append(this.f10078e).append(", isBright=").append(this.f10075b).append(", isError=").append(this.f10080g).append(", errorCode=").append(this.f10079f).append(", hasFaceMask=").append(this.f10076c).append(", hasClosedEyes=").append(this.f10081h).append(", hasHeadCover=").append(this.f10082j).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f10072i + 95;
        f10073m = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static v c(ResponseBody responseBody) throws JSONException, IOException {
        Boolean boolValueOf;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        double dOptDouble = jSONObject.optDouble("confidence");
        double dOptDouble2 = jSONObject.optDouble("blurriness");
        boolean zOptBoolean = jSONObject.optBoolean("hasLenses");
        boolean zOptBoolean2 = jSONObject.optBoolean("isBright", true);
        if (!jSONObject.has("hasFaceMask")) {
            boolValueOf = null;
        } else {
            int i3 = f10072i + 35;
            f10073m = i3 % 128;
            int i4 = i3 % 2;
            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("hasFaceMask"));
        }
        v vVar = new v(dOptDouble, dOptDouble2, zOptBoolean, zOptBoolean2, boolValueOf, jSONObject.optBoolean("hasClosedEyes"), jSONObject.optBoolean("hasHeadCover"));
        int i5 = f10072i + 33;
        f10073m = i5 % 128;
        int i6 = i5 % 2;
        return vVar;
    }

    public final boolean f() {
        int iD = IdCaptureViewModel.l.d();
        int iD2 = IdCaptureViewModel.l.d();
        int iD3 = IdCaptureViewModel.l.d();
        return ((Boolean) d(IdCaptureViewModel.l.d(), new Object[]{this}, 112187359, iD2, iD, iD3, -112187358)).booleanValue();
    }

    public final void d(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        int iD = IdCaptureViewModel.l.d();
        d(IdCaptureViewModel.l.d(), objArr, -1826971148, IdCaptureViewModel.l.d(), iD, IdCaptureViewModel.l.d(), 1826971148);
    }
}
