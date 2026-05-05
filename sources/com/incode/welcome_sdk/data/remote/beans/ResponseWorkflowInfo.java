package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseWorkflowInfo {
    public static final int $stable = 0;
    public static final e Companion = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9176a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9177b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9178c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9179d = 1;
    private final boolean addContinueToDesktop;
    private final boolean ageAssurance;
    private final boolean autoCreateIdentityIfSuccessful;
    private final boolean disableLaunchScreen;
    private final boolean disableSmsOption;
    private final boolean enableSardineRisk;
    private final String id;
    private final boolean mergeSessionRecordings;
    private final String name;
    private final boolean redirectDesktopToMobile;

    public ResponseWorkflowInfo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, String str2, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.addContinueToDesktop = z2;
        this.ageAssurance = z3;
        this.autoCreateIdentityIfSuccessful = z4;
        this.disableLaunchScreen = z5;
        this.disableSmsOption = z6;
        this.enableSardineRisk = z7;
        this.id = str;
        this.mergeSessionRecordings = z8;
        this.name = str2;
        this.redirectDesktopToMobile = z9;
    }

    public final boolean getAddContinueToDesktop() {
        int i2 = 2 % 2;
        int i3 = f9177b + 9;
        int i4 = i3 % 128;
        f9179d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.addContinueToDesktop;
        int i5 = i4 + 77;
        f9177b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean getAgeAssurance() {
        int i2 = 2 % 2;
        int i3 = f9179d;
        int i4 = i3 + 21;
        f9177b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.ageAssurance;
        int i6 = i3 + 83;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getAutoCreateIdentityIfSuccessful() {
        int i2 = 2 % 2;
        int i3 = f9177b + 91;
        f9179d = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.autoCreateIdentityIfSuccessful;
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        return z2;
    }

    public final boolean getDisableLaunchScreen() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9177b + 57;
        int i4 = i3 % 128;
        f9179d = i4;
        if (i3 % 2 == 0) {
            z2 = this.disableLaunchScreen;
            int i5 = 40 / 0;
        } else {
            z2 = this.disableLaunchScreen;
        }
        int i6 = i4 + 115;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getDisableSmsOption() {
        int i2 = 2 % 2;
        int i3 = f9179d;
        int i4 = i3 + 15;
        f9177b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.disableSmsOption;
        int i6 = i3 + 5;
        f9177b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getEnableSardineRisk() {
        int i2 = 2 % 2;
        int i3 = f9177b;
        int i4 = i3 + 77;
        f9179d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.enableSardineRisk;
        int i6 = i3 + 99;
        f9179d = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f9179d + 23;
        f9177b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        if (i4 != 0) {
            int i5 = 29 / 0;
        }
        return str;
    }

    public final boolean getMergeSessionRecordings() {
        int i2 = 2 % 2;
        int i3 = f9179d + 19;
        int i4 = i3 % 128;
        f9177b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.mergeSessionRecordings;
        int i6 = i4 + 107;
        f9179d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String getName() {
        int i2 = 2 % 2;
        int i3 = f9177b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f9179d = i4;
        int i5 = i3 % 2;
        String str = this.name;
        int i6 = i4 + 31;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean getRedirectDesktopToMobile() {
        int i2 = 2 % 2;
        int i3 = f9177b + 87;
        f9179d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.redirectDesktopToMobile;
        }
        throw null;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9180a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9181b = 0;

        private e() {
        }

        @JvmStatic
        public static ResponseWorkflowInfo b(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            boolean zOptBoolean = jSONObject.optBoolean("addContinueToDesktop");
            boolean zOptBoolean2 = jSONObject.optBoolean("ageAssurance");
            boolean zOptBoolean3 = jSONObject.optBoolean("autoCreateIdentityIfSuccessful");
            boolean zOptBoolean4 = jSONObject.optBoolean("disableLaunchScreen");
            boolean zOptBoolean5 = jSONObject.optBoolean("disableSmsOption");
            boolean zOptBoolean6 = jSONObject.optBoolean("enableSardineRisk");
            String strOptString = jSONObject.optString("id");
            boolean zOptBoolean7 = jSONObject.optBoolean("mergeSessionRecordings");
            String strOptString2 = jSONObject.optString("name");
            boolean zOptBoolean8 = jSONObject.optBoolean("redirectDesktopToMobile");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            ResponseWorkflowInfo responseWorkflowInfo = new ResponseWorkflowInfo(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, strOptString, zOptBoolean7, strOptString2, zOptBoolean8);
            int i3 = f9180a + 111;
            f9181b = i3 % 128;
            int i4 = i3 % 2;
            return responseWorkflowInfo;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9176a + 41;
        f9178c = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ResponseWorkflowInfo parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9177b + 9;
        f9179d = i3 % 128;
        int i4 = i3 % 2;
        ResponseWorkflowInfo responseWorkflowInfoB = e.b(responseBody);
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        int i6 = f9179d + 29;
        f9177b = i6 % 128;
        if (i6 % 2 == 0) {
            return responseWorkflowInfoB;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9177b;
        int i4 = i3 + 103;
        f9179d = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseWorkflowInfo)) {
            int i6 = i3 + 85;
            f9179d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ResponseWorkflowInfo responseWorkflowInfo = (ResponseWorkflowInfo) obj;
        if (this.addContinueToDesktop != responseWorkflowInfo.addContinueToDesktop || this.ageAssurance != responseWorkflowInfo.ageAssurance || this.autoCreateIdentityIfSuccessful != responseWorkflowInfo.autoCreateIdentityIfSuccessful || this.disableLaunchScreen != responseWorkflowInfo.disableLaunchScreen || this.disableSmsOption != responseWorkflowInfo.disableSmsOption || this.enableSardineRisk != responseWorkflowInfo.enableSardineRisk) {
            return false;
        }
        if (Intrinsics.areEqual(this.id, responseWorkflowInfo.id)) {
            return this.mergeSessionRecordings == responseWorkflowInfo.mergeSessionRecordings && Intrinsics.areEqual(this.name, responseWorkflowInfo.name) && this.redirectDesktopToMobile == responseWorkflowInfo.redirectDesktopToMobile;
        }
        int i8 = f9177b + 95;
        f9179d = i8 % 128;
        return i8 % 2 == 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9179d + 7;
        f9177b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((((((Boolean.hashCode(this.addContinueToDesktop) * 31) + Boolean.hashCode(this.ageAssurance)) * 31) + Boolean.hashCode(this.autoCreateIdentityIfSuccessful)) * 31) + Boolean.hashCode(this.disableLaunchScreen)) * 31) + Boolean.hashCode(this.disableSmsOption)) * 31) + Boolean.hashCode(this.enableSardineRisk)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.mergeSessionRecordings)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.redirectDesktopToMobile);
        int i5 = f9179d + 19;
        f9177b = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9179d + 37;
        f9177b = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseWorkflowInfo(addContinueToDesktop=" + this.addContinueToDesktop + ", ageAssurance=" + this.ageAssurance + ", autoCreateIdentityIfSuccessful=" + this.autoCreateIdentityIfSuccessful + ", disableLaunchScreen=" + this.disableLaunchScreen + ", disableSmsOption=" + this.disableSmsOption + ", enableSardineRisk=" + this.enableSardineRisk + ", id=" + this.id + ", mergeSessionRecordings=" + this.mergeSessionRecordings + ", name=" + this.name + ", redirectDesktopToMobile=" + this.redirectDesktopToMobile + ")";
        int i5 = f9177b + 27;
        f9179d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ ResponseWorkflowInfo copy$default(ResponseWorkflowInfo responseWorkflowInfo, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, String str2, boolean z9, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            z2 = responseWorkflowInfo.addContinueToDesktop;
        }
        if ((i2 & 2) != 0) {
            z3 = responseWorkflowInfo.ageAssurance;
        }
        if ((i2 & 4) != 0) {
            z4 = responseWorkflowInfo.autoCreateIdentityIfSuccessful;
        }
        if ((i2 & 8) != 0) {
            z5 = responseWorkflowInfo.disableLaunchScreen;
        }
        if ((i2 & 16) != 0) {
            z6 = responseWorkflowInfo.disableSmsOption;
        }
        if ((i2 & 32) != 0) {
            int i4 = f9179d + 115;
            f9177b = i4 % 128;
            int i5 = i4 % 2;
            z7 = responseWorkflowInfo.enableSardineRisk;
        }
        if ((i2 & 64) != 0) {
            str = responseWorkflowInfo.id;
            int i6 = f9179d + 79;
            f9177b = i6 % 128;
            int i7 = i6 % 2;
        }
        Object obj2 = null;
        if ((i2 & 128) != 0) {
            int i8 = f9179d + 95;
            f9177b = i8 % 128;
            if (i8 % 2 != 0) {
                boolean z10 = responseWorkflowInfo.mergeSessionRecordings;
                obj2.hashCode();
                throw null;
            }
            z8 = responseWorkflowInfo.mergeSessionRecordings;
        }
        if ((i2 & 256) != 0) {
            int i9 = f9177b + 13;
            f9179d = i9 % 128;
            if (i9 % 2 == 0) {
                String str3 = responseWorkflowInfo.name;
                obj2.hashCode();
                throw null;
            }
            str2 = responseWorkflowInfo.name;
        }
        if ((i2 & 512) != 0) {
            z9 = responseWorkflowInfo.redirectDesktopToMobile;
        }
        return responseWorkflowInfo.copy(z2, z3, z4, z5, z6, z7, str, z8, str2, z9);
    }

    public final ResponseWorkflowInfo copy(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, String str2, boolean z9) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ResponseWorkflowInfo responseWorkflowInfo = new ResponseWorkflowInfo(z2, z3, z4, z5, z6, z7, str, z8, str2, z9);
        int i3 = f9179d + 97;
        f9177b = i3 % 128;
        if (i3 % 2 == 0) {
            return responseWorkflowInfo;
        }
        throw null;
    }

    public final boolean component10() {
        int i2 = 2 % 2;
        int i3 = f9177b + 21;
        int i4 = i3 % 128;
        f9179d = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.redirectDesktopToMobile;
        int i5 = i4 + 93;
        f9177b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f9177b;
        int i4 = i3 + 31;
        f9179d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i5 = i3 + 71;
        f9179d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final boolean component8() {
        int i2 = 2 % 2;
        int i3 = f9179d + 87;
        int i4 = i3 % 128;
        f9177b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.mergeSessionRecordings;
        int i6 = i4 + 43;
        f9179d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component7() {
        int i2 = 2 % 2;
        int i3 = f9177b + 113;
        int i4 = i3 % 128;
        f9179d = i4;
        int i5 = i3 % 2;
        String str = this.id;
        int i6 = i4 + 53;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f9177b + 13;
        int i4 = i3 % 128;
        f9179d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.enableSardineRisk;
        int i6 = i4 + 15;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f9179d;
        int i4 = i3 + 5;
        f9177b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.disableSmsOption;
        int i6 = i3 + 79;
        f9177b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f9179d + 117;
        f9177b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.disableLaunchScreen;
        }
        throw null;
    }

    public final boolean component3() {
        int i2 = 2 % 2;
        int i3 = f9177b;
        int i4 = i3 + 59;
        f9179d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.autoCreateIdentityIfSuccessful;
        int i6 = i3 + 23;
        f9179d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 98 / 0;
        }
        return z2;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f9177b + 9;
        int i4 = i3 % 128;
        f9179d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.ageAssurance;
        int i6 = i4 + 13;
        f9177b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component1() {
        int i2 = 2 % 2;
        int i3 = f9177b;
        int i4 = i3 + 109;
        f9179d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.addContinueToDesktop;
        int i5 = i3 + 33;
        f9179d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return z2;
    }
}
