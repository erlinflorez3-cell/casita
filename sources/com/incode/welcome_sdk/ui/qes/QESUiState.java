package com.incode.welcome_sdk.ui.qes;

import android.net.Uri;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.qes.QESScreenState;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class QESUiState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f17125c = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final QESUiState f17126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f17127n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f17128r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f17129s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f17130t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DocumentState> f17132b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QESScreenState f17133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f17137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f17138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f17139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f17140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RequestBody f17141l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f17142o;

    public QESUiState(QESScreenState qESScreenState, List<DocumentState> list, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, String str, String str2, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(qESScreenState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f17133d = qESScreenState;
        this.f17132b = list;
        this.f17131a = z2;
        this.f17134e = z3;
        this.f17135f = z4;
        this.f17139j = z5;
        this.f17137h = uri;
        this.f17136g = str;
        this.f17138i = str2;
        this.f17141l = requestBody;
        this.f17140k = !Intrinsics.areEqual(uri, Uri.EMPTY);
        this.f17142o = z2 && z3;
    }

    public static final /* synthetic */ QESUiState access$getInitial$cp() {
        int i2 = 2 % 2;
        int i3 = f17127n;
        int i4 = i3 + 47;
        f17129s = i4 % 128;
        int i5 = i4 % 2;
        QESUiState qESUiState = f17126m;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17129s = i6 % 128;
        int i7 = i6 % 2;
        return qESUiState;
    }

    public final QESScreenState getQesScreenState() {
        int i2 = 2 % 2;
        int i3 = f17129s + 3;
        f17127n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17133d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DocumentState> getPdfDocuments() {
        int i2 = 2 % 2;
        int i3 = f17129s + 39;
        f17127n = i3 % 128;
        int i4 = i3 % 2;
        List<DocumentState> list = this.f17132b;
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
        return list;
    }

    public final boolean isCheckedTermsAndConditions() {
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + 81;
        f17127n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f17131a;
        int i6 = i3 + 27;
        f17127n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isCheckedSignGenerateCertificate() {
        int i2 = 2 % 2;
        int i3 = f17129s + 113;
        f17127n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17134e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getDownloadDocument() {
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17127n = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f17135f;
        int i5 = i3 + 47;
        f17127n = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean getUploadDocument() {
        int i2 = 2 % 2;
        int i3 = f17127n;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17129s = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f17139j;
        int i5 = i3 + 101;
        f17129s = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final Uri getPdfToUpload() {
        Uri uri;
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + 37;
        f17127n = i4 % 128;
        if (i4 % 2 != 0) {
            uri = this.f17137h;
            int i5 = 97 / 0;
        } else {
            uri = this.f17137h;
        }
        int i6 = i3 + 23;
        f17127n = i6 % 128;
        if (i6 % 2 == 0) {
            return uri;
        }
        throw null;
    }

    public final String getDownloadUrl() {
        String str;
        int i2 = 2 % 2;
        int i3 = f17129s + 79;
        int i4 = i3 % 128;
        f17127n = i4;
        if (i3 % 2 != 0) {
            str = this.f17136g;
            int i5 = 98 / 0;
        } else {
            str = this.f17136g;
        }
        int i6 = i4 + 21;
        f17129s = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getPresignedUploadUrl() {
        int i2 = 2 % 2;
        int i3 = f17127n;
        int i4 = i3 + 65;
        f17129s = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f17138i;
        int i6 = i3 + 63;
        f17129s = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final RequestBody getRequestBody() {
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + 123;
        f17127n = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        RequestBody requestBody = this.f17141l;
        int i5 = i3 + 107;
        f17127n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return requestBody;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17143a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17144e = 0;

        private Companion() {
        }

        public final QESUiState getInitial() {
            int i2 = 2 % 2;
            int i3 = f17143a + 115;
            f17144e = i3 % 128;
            int i4 = i3 % 2;
            QESUiState qESUiStateAccess$getInitial$cp = QESUiState.access$getInitial$cp();
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
            return qESUiStateAccess$getInitial$cp;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        QESScreenState.FetchingUnsignedDocuments fetchingUnsignedDocuments = QESScreenState.FetchingUnsignedDocuments.f17081c;
        List listEmptyList = CollectionsKt.emptyList();
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "");
        f17126m = new QESUiState(fetchingUnsignedDocuments, listEmptyList, false, false, false, false, uri, "", "", null);
        int i2 = f17128r + 27;
        f17130t = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    public final boolean isQesUploadContinueBtnEnabled() {
        int i2 = 2 % 2;
        int i3 = f17129s + 99;
        f17127n = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f17140k;
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        return z2;
    }

    public final boolean isContinueButtonEnabled() {
        int i2 = 2 % 2;
        int i3 = f17129s + 43;
        int i4 = i3 % 128;
        f17127n = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f17142o;
        int i5 = i4 + 97;
        f17129s = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f17127n + 33;
        int i4 = i3 % 128;
        f17129s = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 55;
            f17127n = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof QESUiState)) {
            return false;
        }
        QESUiState qESUiState = (QESUiState) obj;
        if (!Intrinsics.areEqual(this.f17133d, qESUiState.f17133d) || !Intrinsics.areEqual(this.f17132b, qESUiState.f17132b)) {
            return false;
        }
        if (this.f17131a != qESUiState.f17131a) {
            int i7 = f17129s + 13;
            f17127n = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.f17134e != qESUiState.f17134e || this.f17135f != qESUiState.f17135f || this.f17139j != qESUiState.f17139j || !Intrinsics.areEqual(this.f17137h, qESUiState.f17137h)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f17136g, qESUiState.f17136g)) {
            return Intrinsics.areEqual(this.f17138i, qESUiState.f17138i) && Intrinsics.areEqual(this.f17141l, qESUiState.f17141l);
        }
        int i9 = f17127n + 121;
        f17129s = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f17127n + 57;
        f17129s = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((((((((((((this.f17133d.hashCode() * 31) + this.f17132b.hashCode()) * 31) + Boolean.hashCode(this.f17131a)) * 31) + Boolean.hashCode(this.f17134e)) * 31) + Boolean.hashCode(this.f17135f)) * 31) + Boolean.hashCode(this.f17139j)) * 31) + this.f17137h.hashCode()) * 31) + this.f17136g.hashCode()) * 31) + this.f17138i.hashCode()) * 31;
        RequestBody requestBody = this.f17141l;
        if (requestBody == null) {
            int i5 = f17129s + 63;
            f17127n = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = requestBody.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f17129s + 13;
        f17127n = i3 % 128;
        int i4 = i3 % 2;
        String str = "QESUiState(qesScreenState=" + this.f17133d + ", pdfDocuments=" + this.f17132b + ", isCheckedTermsAndConditions=" + this.f17131a + ", isCheckedSignGenerateCertificate=" + this.f17134e + ", downloadDocument=" + this.f17135f + ", uploadDocument=" + this.f17139j + ", pdfToUpload=" + this.f17137h + ", downloadUrl=" + this.f17136g + ", presignedUploadUrl=" + this.f17138i + ", requestBody=" + this.f17141l + ")";
        int i5 = f17129s + 107;
        f17127n = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QESUiState copy$default(QESUiState qESUiState, QESScreenState qESScreenState, List list, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, String str, String str2, RequestBody requestBody, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f17129s;
        int i5 = i4 + 75;
        f17127n = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 25;
            f17127n = i7 % 128;
            if (i7 % 2 != 0) {
                qESScreenState = qESUiState.f17133d;
                int i8 = 19 / 0;
            } else {
                qESScreenState = qESUiState.f17133d;
            }
        }
        if ((i2 & 2) != 0) {
            list = qESUiState.f17132b;
        }
        if ((i2 & 4) != 0) {
            z2 = qESUiState.f17131a;
        }
        if ((i2 & 8) != 0) {
            z3 = qESUiState.f17134e;
        }
        if ((i2 & 16) != 0) {
            z4 = qESUiState.f17135f;
        }
        Object obj2 = null;
        if ((i2 & 32) != 0) {
            int i9 = f17127n + 27;
            f17129s = i9 % 128;
            if (i9 % 2 == 0) {
                boolean z6 = qESUiState.f17139j;
                obj2.hashCode();
                throw null;
            }
            z5 = qESUiState.f17139j;
        }
        if ((i2 & 64) != 0) {
            uri = qESUiState.f17137h;
        }
        if ((i2 & 128) != 0) {
            str = qESUiState.f17136g;
        }
        if ((i2 & 256) != 0) {
            int i10 = f17127n + 63;
            f17129s = i10 % 128;
            if (i10 % 2 == 0) {
                String str3 = qESUiState.f17138i;
                throw null;
            }
            str2 = qESUiState.f17138i;
        }
        if ((i2 & 512) != 0) {
            requestBody = qESUiState.f17141l;
        }
        return qESUiState.copy(qESScreenState, list, z2, z3, z4, z5, uri, str, str2, requestBody);
    }

    public final QESUiState copy(QESScreenState qESScreenState, List<DocumentState> list, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, String str, String str2, RequestBody requestBody) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(qESScreenState, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        QESUiState qESUiState = new QESUiState(qESScreenState, list, z2, z3, z4, z5, uri, str, str2, requestBody);
        int i3 = f17129s + 93;
        f17127n = i3 % 128;
        int i4 = i3 % 2;
        return qESUiState;
    }

    public final RequestBody component10() {
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + 97;
        f17127n = i4 % 128;
        int i5 = i4 % 2;
        RequestBody requestBody = this.f17141l;
        int i6 = i3 + 73;
        f17127n = i6 % 128;
        int i7 = i6 % 2;
        return requestBody;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f17129s + 31;
        f17127n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17138i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i2 = 2 % 2;
        int i3 = f17129s + 17;
        int i4 = i3 % 128;
        f17127n = i4;
        int i5 = i3 % 2;
        String str = this.f17136g;
        int i6 = i4 + 19;
        f17129s = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Uri component7() {
        int i2 = 2 % 2;
        int i3 = f17127n;
        int i4 = i3 + 49;
        f17129s = i4 % 128;
        int i5 = i4 % 2;
        Uri uri = this.f17137h;
        int i6 = i3 + 85;
        f17129s = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return uri;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f17129s + 33;
        int i4 = i3 % 128;
        f17127n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f17139j;
        int i6 = i4 + 101;
        f17129s = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f17127n + 73;
        int i4 = i3 % 128;
        f17129s = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f17135f;
        int i6 = i4 + 53;
        f17127n = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f17129s;
        int i4 = i3 + 9;
        f17127n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f17134e;
        int i6 = i3 + 15;
        f17127n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component3() {
        int i2 = 2 % 2;
        int i3 = f17129s + 109;
        int i4 = i3 % 128;
        f17127n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f17131a;
        int i6 = i4 + 85;
        f17129s = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final List<DocumentState> component2() {
        int i2 = 2 % 2;
        int i3 = f17129s + 83;
        f17127n = i3 % 128;
        int i4 = i3 % 2;
        List<DocumentState> list = this.f17132b;
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        return list;
    }

    public final QESScreenState component1() {
        int i2 = 2 % 2;
        int i3 = f17129s + 31;
        int i4 = i3 % 128;
        f17127n = i4;
        int i5 = i3 % 2;
        QESScreenState qESScreenState = this.f17133d;
        int i6 = i4 + 55;
        f17129s = i6 % 128;
        int i7 = i6 % 2;
        return qESScreenState;
    }
}
