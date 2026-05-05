package com.incode.welcome_sdk.ui.aes;

import android.net.Uri;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.aes.AESScreenState;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class AESUiState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f10925b = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AESUiState f10926k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f10927n = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f10928q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f10929s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f10930t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10931a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<DocumentState> f10933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AESScreenState f10934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f10936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f10938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Uri f10939j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RequestBody f10941m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10942o;

    public AESUiState(AESScreenState aESScreenState, List<DocumentState> list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, String str, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(aESScreenState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f10934e = aESScreenState;
        this.f10933d = list;
        this.f10932c = z2;
        this.f10931a = z3;
        this.f10938i = z4;
        this.f10937h = z5;
        this.f10935f = z6;
        this.f10939j = uri;
        this.f10936g = str;
        this.f10941m = requestBody;
        this.f10940l = z2 && z3 && z4;
        this.f10942o = true ^ Intrinsics.areEqual(uri, Uri.EMPTY);
    }

    public static final /* synthetic */ AESUiState access$getInitial$cp() {
        int i2 = 2 % 2;
        int i3 = f10927n + 35;
        int i4 = i3 % 128;
        f10930t = i4;
        int i5 = i3 % 2;
        AESUiState aESUiState = f10926k;
        int i6 = i4 + 45;
        f10927n = i6 % 128;
        int i7 = i6 % 2;
        return aESUiState;
    }

    public final AESScreenState getAesScreenState() {
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 69;
        f10927n = i4 % 128;
        int i5 = i4 % 2;
        AESScreenState aESScreenState = this.f10934e;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10927n = i6 % 128;
        if (i6 % 2 == 0) {
            return aESScreenState;
        }
        throw null;
    }

    public final List<DocumentState> getPdfDocuments() {
        int i2 = 2 % 2;
        int i3 = f10930t + 85;
        f10927n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10933d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isCheckedTermsAndConditions() {
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 69;
        f10927n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10932c;
        int i6 = i3 + 11;
        f10927n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isCheckedSignGenerateCertificate() {
        int i2 = 2 % 2;
        int i3 = f10930t + 15;
        f10927n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10931a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isCheckedSignLegalBinding() {
        int i2 = 2 % 2;
        int i3 = f10930t + 75;
        int i4 = i3 % 128;
        f10927n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10938i;
        int i6 = i4 + 11;
        f10930t = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return z2;
    }

    public final boolean getUploadDocument() {
        int i2 = 2 % 2;
        int i3 = f10930t + 69;
        f10927n = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f10937h;
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        return z2;
    }

    public final boolean getDownloadDocument() {
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 15;
        f10927n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10935f;
        int i6 = i3 + 21;
        f10927n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final Uri getPdfToUpload() {
        int i2 = 2 % 2;
        int i3 = f10927n + 61;
        f10930t = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10939j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPresignedUploadUrl() {
        int i2 = 2 % 2;
        int i3 = f10930t + 93;
        int i4 = i3 % 128;
        f10927n = i4;
        int i5 = i3 % 2;
        String str = this.f10936g;
        int i6 = i4 + 31;
        f10930t = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RequestBody getRequestBody() {
        int i2 = 2 % 2;
        int i3 = f10930t + 35;
        int i4 = i3 % 128;
        f10927n = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RequestBody requestBody = this.f10941m;
        int i5 = i4 + 81;
        f10930t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return requestBody;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10943b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10944c = 1;

        private Companion() {
        }

        public final AESUiState getInitial() {
            int i2 = 2 % 2;
            int i3 = f10943b + 91;
            f10944c = i3 % 128;
            int i4 = i3 % 2;
            AESUiState aESUiStateAccess$getInitial$cp = AESUiState.access$getInitial$cp();
            int i5 = f10943b + 91;
            f10944c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 74 / 0;
            }
            return aESUiStateAccess$getInitial$cp;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AESScreenState.FetchingUnsignedDocuments fetchingUnsignedDocuments = AESScreenState.FetchingUnsignedDocuments.f10880b;
        List listEmptyList = CollectionsKt.emptyList();
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "");
        f10926k = new AESUiState(fetchingUnsignedDocuments, listEmptyList, false, false, false, false, false, uri, "", null);
        int i2 = f10929s + 83;
        f10928q = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean isContinueButtonEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 81;
        f10927n = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.f10940l;
            int i5 = 61 / 0;
        } else {
            z2 = this.f10940l;
        }
        int i6 = i3 + 93;
        f10927n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isAesUploadContinueBtnEnabled() {
        int i2 = 2 % 2;
        int i3 = f10930t + 117;
        int i4 = i3 % 128;
        f10927n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10942o;
        int i6 = i4 + 69;
        f10930t = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 19;
        f10927n = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AESUiState)) {
            int i6 = i3 + 103;
            f10927n = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        AESUiState aESUiState = (AESUiState) obj;
        if (!Intrinsics.areEqual(this.f10934e, aESUiState.f10934e)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f10933d, aESUiState.f10933d)) {
            int i8 = f10930t + 95;
            f10927n = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f10932c != aESUiState.f10932c) {
            return false;
        }
        if (this.f10931a != aESUiState.f10931a) {
            int i10 = f10927n + 25;
            f10930t = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.f10938i != aESUiState.f10938i || this.f10937h != aESUiState.f10937h) {
            return false;
        }
        if (this.f10935f != aESUiState.f10935f) {
            int i12 = f10930t + 41;
            f10927n = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f10939j, aESUiState.f10939j)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f10936g, aESUiState.f10936g)) {
            return Intrinsics.areEqual(this.f10941m, aESUiState.f10941m);
        }
        int i13 = f10927n + 39;
        f10930t = i13 % 128;
        return i13 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f10930t + 73;
        f10927n = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((((((((((((this.f10934e.hashCode() * 31) + this.f10933d.hashCode()) * 31) + Boolean.hashCode(this.f10932c)) * 31) + Boolean.hashCode(this.f10931a)) * 31) + Boolean.hashCode(this.f10938i)) * 31) + Boolean.hashCode(this.f10937h)) * 31) + Boolean.hashCode(this.f10935f)) * 31) + this.f10939j.hashCode()) * 31) + this.f10936g.hashCode()) * 31;
        RequestBody requestBody = this.f10941m;
        if (requestBody == null) {
            int i5 = f10927n + 87;
            f10930t = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = requestBody.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f10930t + 33;
        f10927n = i3 % 128;
        int i4 = i3 % 2;
        String str = "AESUiState(aesScreenState=" + this.f10934e + ", pdfDocuments=" + this.f10933d + ", isCheckedTermsAndConditions=" + this.f10932c + ", isCheckedSignGenerateCertificate=" + this.f10931a + ", isCheckedSignLegalBinding=" + this.f10938i + ", uploadDocument=" + this.f10937h + ", downloadDocument=" + this.f10935f + ", pdfToUpload=" + this.f10939j + ", presignedUploadUrl=" + this.f10936g + ", requestBody=" + this.f10941m + ")";
        int i5 = f10927n + 67;
        f10930t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AESUiState copy$default(AESUiState aESUiState, AESScreenState aESScreenState, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, String str, RequestBody requestBody, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f10930t + 111;
            f10927n = i4 % 128;
            int i5 = i4 % 2;
            aESScreenState = aESUiState.f10934e;
        }
        if ((i2 & 2) != 0) {
            int i6 = f10927n + 57;
            f10930t = i6 % 128;
            int i7 = i6 % 2;
            list = aESUiState.f10933d;
        }
        if ((i2 & 4) != 0) {
            z2 = aESUiState.f10932c;
            int i8 = f10930t + 25;
            f10927n = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i2 & 8) != 0) {
            z3 = aESUiState.f10931a;
        }
        if ((i2 & 16) != 0) {
            z4 = aESUiState.f10938i;
        }
        if ((i2 & 32) != 0) {
            int i10 = f10930t + 19;
            f10927n = i10 % 128;
            if (i10 % 2 != 0) {
                boolean z7 = aESUiState.f10937h;
                throw null;
            }
            z5 = aESUiState.f10937h;
        }
        if ((i2 & 64) != 0) {
            z6 = aESUiState.f10935f;
            int i11 = f10930t + 69;
            f10927n = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i2 & 128) != 0) {
            uri = aESUiState.f10939j;
        }
        if ((i2 & 256) != 0) {
            int i13 = f10930t + 49;
            f10927n = i13 % 128;
            int i14 = i13 % 2;
            str = aESUiState.f10936g;
        }
        if ((i2 & 512) != 0) {
            requestBody = aESUiState.f10941m;
        }
        return aESUiState.copy(aESScreenState, list, z2, z3, z4, z5, z6, uri, str, requestBody);
    }

    public final AESUiState copy(AESScreenState aESScreenState, List<DocumentState> list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, String str, RequestBody requestBody) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aESScreenState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        AESUiState aESUiState = new AESUiState(aESScreenState, list, z2, z3, z4, z5, z6, uri, str, requestBody);
        int i3 = f10927n + 85;
        f10930t = i3 % 128;
        int i4 = i3 % 2;
        return aESUiState;
    }

    public final RequestBody component10() {
        int i2 = 2 % 2;
        int i3 = f10930t + 99;
        int i4 = i3 % 128;
        f10927n = i4;
        int i5 = i3 % 2;
        RequestBody requestBody = this.f10941m;
        int i6 = i4 + 19;
        f10930t = i6 % 128;
        if (i6 % 2 != 0) {
            return requestBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f10927n + 81;
        int i4 = i3 % 128;
        f10930t = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f10936g;
        int i5 = i4 + 79;
        f10927n = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Uri component8() {
        Uri uri;
        int i2 = 2 % 2;
        int i3 = f10930t + 81;
        int i4 = i3 % 128;
        f10927n = i4;
        if (i3 % 2 != 0) {
            uri = this.f10939j;
            int i5 = 59 / 0;
        } else {
            uri = this.f10939j;
        }
        int i6 = i4 + 111;
        f10930t = i6 % 128;
        if (i6 % 2 != 0) {
            return uri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component7() {
        int i2 = 2 % 2;
        int i3 = f10930t + 83;
        int i4 = i3 % 128;
        f10927n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10935f;
        int i6 = i4 + 61;
        f10930t = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f10927n;
        int i4 = i3 + 65;
        f10930t = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10937h;
        int i6 = i3 + 75;
        f10930t = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f10927n;
        int i4 = i3 + 107;
        f10930t = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f10938i;
        int i5 = i3 + 47;
        f10930t = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f10930t;
        int i4 = i3 + 29;
        f10927n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10931a;
        int i6 = i3 + 83;
        f10927n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i2 = 2 % 2;
        int i3 = f10927n + 47;
        int i4 = i3 % 128;
        f10930t = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10932c;
        int i6 = i4 + 51;
        f10927n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return z2;
    }

    public final List<DocumentState> component2() {
        int i2 = 2 % 2;
        int i3 = f10930t + 45;
        f10927n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10933d;
        }
        throw null;
    }

    public final AESScreenState component1() {
        int i2 = 2 % 2;
        int i3 = f10927n;
        int i4 = i3 + 71;
        f10930t = i4 % 128;
        int i5 = i4 % 2;
        AESScreenState aESScreenState = this.f10934e;
        int i6 = i3 + 121;
        f10930t = i6 % 128;
        if (i6 % 2 != 0) {
            return aESScreenState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
