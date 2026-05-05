package com.incode.welcome_sdk.data.local.model.delayed_onboarding.d;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.aes.AESViewModel;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8782i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8783j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentType f8786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8788e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f8789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8790h;

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~(i8 | i4);
        int i10 = ~(i3 | i4);
        int i11 = i8 | (~i4);
        int i12 = i10 | (~(i11 | i7));
        int i13 = (~i7) | i11;
        int i14 = i3 + i4 + i5 + (770105990 * i6) + ((-157043368) * i2);
        int i15 = i14 * i14;
        int i16 = ((315592168 * i3) - 1432092672) + ((-1000312294) * i4) + ((-1315904462) * i9) + ((-657952231) * i12) + (657952231 * i13) + ((-342360064) * i5) + ((-2121269248) * i6) + (1950351360 * i2) + ((-66846720) * i15);
        int i17 = (i3 * 105828664) + 1394048361 + (i4 * 105827886) + (i9 * (-778)) + (i12 * (-389)) + (i13 * 389) + (i5 * 105828275) + (i6 * (-227623502)) + (i2 * 619312264) + (i15 * 1925971968);
        return i16 + ((i17 * i17) * 261881856) != 1 ? c(objArr) : d(objArr);
    }

    public c(long j2, long j3, boolean z2, DocumentType documentType, Map<String, String> map, Map<String, String> map2, String str) {
        this.f8788e = 0L;
        this.f8787d = j3;
        this.f8785b = z2;
        this.f8786c = documentType;
        this.f8784a = map;
        this.f8789g = map2;
        this.f8790h = str;
    }

    public /* synthetic */ c(long j2, DocumentType documentType, String str) {
        this(0L, j2, false, documentType, null, null, str);
    }

    public final long b() {
        int i2 = 2 % 2;
        int i3 = f8783j;
        int i4 = i3 + 99;
        f8782i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        long j2 = this.f8788e;
        int i5 = i3 + 101;
        f8782i = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final long a() {
        int i2 = 2 % 2;
        int i3 = f8783j + 125;
        int i4 = i3 % 128;
        f8782i = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j2 = this.f8787d;
        int i5 = i4 + 85;
        f8783j = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8783j;
        int i4 = i3 + 93;
        f8782i = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f8785b;
        int i6 = i3 + 65;
        f8782i = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final DocumentType c() {
        int i2 = 2 % 2;
        int i3 = f8782i + 111;
        f8783j = i3 % 128;
        int i4 = i3 % 2;
        DocumentType documentType = this.f8786c;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        return documentType;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8782i;
        int i4 = i3 + 35;
        f8783j = i4 % 128;
        int i5 = i4 % 2;
        Map<String, String> map = cVar.f8784a;
        int i6 = i3 + 27;
        f8783j = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8783j + 45;
        f8782i = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = cVar.f8789g;
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        return map;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f8782i + 65;
        int i4 = i3 % 128;
        f8783j = i4;
        int i5 = i3 % 2;
        String str = this.f8790h;
        int i6 = i4 + 57;
        f8782i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            int i3 = f8783j + 21;
            f8782i = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        c cVar = (c) obj;
        if (this.f8788e != cVar.f8788e) {
            return false;
        }
        if (this.f8787d != cVar.f8787d) {
            int i5 = f8782i + 19;
            int i6 = i5 % 128;
            f8783j = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 65;
            f8782i = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.f8785b != cVar.f8785b || this.f8786c != cVar.f8786c) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8784a, cVar.f8784a)) {
            int i9 = f8783j + 69;
            f8782i = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f8789g, cVar.f8789g)) {
            int i11 = f8782i + 91;
            f8783j = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.f8790h, cVar.f8790h))) {
            return true;
        }
        int i13 = f8782i + 7;
        f8783j = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int iHashCode3 = ((((Long.hashCode(this.f8788e) * 31) + Long.hashCode(this.f8787d)) * 31) + Boolean.hashCode(this.f8785b)) * 31;
        DocumentType documentType = this.f8786c;
        int iHashCode4 = 0;
        if (documentType == null) {
            int i3 = f8783j + 23;
            f8782i = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = documentType.hashCode();
        }
        int i5 = (iHashCode3 + iHashCode) * 31;
        Map<String, String> map = this.f8784a;
        if (map == null) {
            int i6 = f8783j + 109;
            f8782i = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 5;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = map.hashCode();
        }
        int i8 = (i5 + iHashCode2) * 31;
        Map<String, String> map2 = this.f8789g;
        int iHashCode5 = (i8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.f8790h;
        if (str == null) {
            int i9 = f8782i + 71;
            f8783j = i9 % 128;
            if (i9 % 2 != 0) {
                iHashCode4 = 1;
            }
        } else {
            iHashCode4 = str.hashCode();
        }
        return iHashCode5 + iHashCode4;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8783j + 51;
        f8782i = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "DocumentScanResultEntity(id=" + this.f8788e + ", documentScanId=" + this.f8787d + ", isSuccess=" + this.f8785b + ", documentType=" + this.f8786c + ", documentScanOcrData=" + this.f8784a + ", documentScanExtendedOcrData=" + this.f8789g + ", error=" + this.f8790h + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "DocumentScanResultEntity(id=" + this.f8788e + ", documentScanId=" + this.f8787d + ", isSuccess=" + this.f8785b + ", documentType=" + this.f8786c + ", documentScanOcrData=" + this.f8784a + ", documentScanExtendedOcrData=" + this.f8789g + ", error=" + this.f8790h + ")";
        int i4 = f8783j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8782i = i4 % 128;
        if (i4 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public final Map<String, String> g() {
        int iC = AESViewModel.l.c();
        return (Map) b(new Object[]{this}, AESViewModel.l.c(), 1460091836, -1460091836, AESViewModel.l.c(), AESViewModel.l.c(), iC);
    }

    public final Map<String, String> e() {
        int iC = AESViewModel.l.c();
        return (Map) b(new Object[]{this}, AESViewModel.l.c(), 1179719868, -1179719867, AESViewModel.l.c(), AESViewModel.l.c(), iC);
    }
}
