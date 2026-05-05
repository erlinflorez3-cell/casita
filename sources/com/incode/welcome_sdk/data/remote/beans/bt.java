package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.j;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bt {

    /* JADX INFO: renamed from: f */
    private static int f9562f = 0;

    /* JADX INFO: renamed from: h */
    private static int f9563h = 1;

    /* JADX INFO: renamed from: a */
    public final boolean f9564a;

    /* JADX INFO: renamed from: b */
    private final f f9565b;

    /* JADX INFO: renamed from: c */
    private final IdCategory f9566c;

    /* JADX INFO: renamed from: d */
    private final File f9567d;

    /* JADX INFO: renamed from: e */
    private final int f9568e;

    /* JADX INFO: renamed from: g */
    private final Integer f9569g;

    /* JADX INFO: renamed from: i */
    private final j.b f9570i;

    /* JADX INFO: renamed from: j */
    private final s f9571j;

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = i2 | i7 | i5;
        int i9 = (~((~i5) | i7)) | i2;
        int i10 = ~((~i2) | i7);
        int i11 = i2 + i7 + i6 + (1132004924 * i4) + ((-2047965933) * i3);
        int i12 = i11 * i11;
        int i13 = ((1650805025 * i2) - 289800192) + ((-1513965855) * i7) + ((-565098208) * i8) + (i9 * 565098208) + (565098208 * i10) + ((-2079064064) * i6) + (1823473664 * i4) + (830210048 * i3) + ((-1143341056) * i12);
        int i14 = ((i2 * (-767560105)) - 1188649921) + (i7 * (-767559017)) + (i8 * (-544)) + (i9 * 544) + (i10 * 544) + (i6 * (-767559561)) + (i4 * 1544553956) + (i3 * (-1468578859)) + (i12 * (-2108293120));
        return i13 + ((i14 * i14) * (-2075787264)) != 1 ? c(objArr) : b(objArr);
    }

    public bt(File file, IdCategory idCategory, f fVar, int i2, j.b bVar, Integer num, s sVar) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(idCategory, "");
        Intrinsics.checkNotNullParameter(fVar, "");
        this.f9567d = file;
        this.f9566c = idCategory;
        this.f9565b = fVar;
        this.f9568e = i2;
        this.f9570i = bVar;
        this.f9569g = num;
        this.f9571j = sVar;
        this.f9564a = idCategory == IdCategory.SECOND;
    }

    public /* synthetic */ bt(File file, IdCategory idCategory, f fVar) {
        this(file, idCategory, fVar, 0, null, null, null);
    }

    public final File b() {
        int i2 = 2 % 2;
        int i3 = f9562f;
        int i4 = i3 + 15;
        f9563h = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        File file = this.f9567d;
        int i5 = i3 + 107;
        f9563h = i5 % 128;
        if (i5 % 2 != 0) {
            return file;
        }
        obj.hashCode();
        throw null;
    }

    public final IdCategory d() {
        int i2 = 2 % 2;
        int i3 = f9562f + 67;
        f9563h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9566c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        bt btVar = (bt) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9563h;
        int i4 = i3 + 85;
        f9562f = i4 % 128;
        int i5 = i4 % 2;
        f fVar = btVar.f9565b;
        int i6 = i3 + 13;
        f9562f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return fVar;
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f9563h + 31;
        int i4 = i3 % 128;
        f9562f = i4;
        int i5 = i3 % 2;
        int i6 = this.f9568e;
        int i7 = i4 + 79;
        f9563h = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final j.b e() {
        j.b bVar;
        int i2 = 2 % 2;
        int i3 = f9563h;
        int i4 = i3 + 101;
        f9562f = i4 % 128;
        if (i4 % 2 != 0) {
            bVar = this.f9570i;
            int i5 = 81 / 0;
        } else {
            bVar = this.f9570i;
        }
        int i6 = i3 + 95;
        f9562f = i6 % 128;
        if (i6 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        bt btVar = (bt) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9563h + 117;
        f9562f = i3 % 128;
        int i4 = i3 % 2;
        Integer num = btVar.f9569g;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return num;
    }

    public final s j() {
        int i2 = 2 % 2;
        int i3 = f9563h + 81;
        f9562f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9571j;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9562f + 53;
            f9563h = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        if (!Intrinsics.areEqual(this.f9567d, btVar.f9567d)) {
            return false;
        }
        if (this.f9566c != btVar.f9566c) {
            int i5 = f9563h;
            int i6 = i5 + 71;
            f9562f = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 117;
            f9562f = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f9565b != btVar.f9565b || this.f9568e != btVar.f9568e) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9570i, btVar.f9570i)) {
            return Intrinsics.areEqual(this.f9569g, btVar.f9569g) && Intrinsics.areEqual(this.f9571j, btVar.f9571j);
        }
        int i10 = f9563h + 13;
        f9562f = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = ((((((this.f9567d.hashCode() * 31) + this.f9566c.hashCode()) * 31) + this.f9565b.hashCode()) * 31) + Integer.hashCode(this.f9568e)) * 31;
        j.b bVar = this.f9570i;
        int iHashCode3 = 0;
        if (bVar == null) {
            iHashCode = 0;
        } else {
            iHashCode = bVar.hashCode();
            int i3 = f9562f + 33;
            f9563h = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = (iHashCode2 + iHashCode) * 31;
        Integer num = this.f9569g;
        int iHashCode4 = (i5 + (num == null ? 0 : num.hashCode())) * 31;
        s sVar = this.f9571j;
        if (sVar == null) {
            int i6 = f9563h + 25;
            f9562f = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = sVar.hashCode();
        }
        return iHashCode4 + iHashCode3;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9562f + 45;
        f9563h = i3 % 128;
        int i4 = i3 % 2;
        String str = "UploadIdScanRequest(file=" + this.f9567d + ", idCategory=" + this.f9566c + ", captureType=" + this.f9565b + ", requestId=" + this.f9568e + ", progressListener=" + this.f9570i + ", glare=" + this.f9569g + ", metadata=" + this.f9571j + ")";
        int i5 = f9562f + 5;
        f9563h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return str;
    }

    public final Integer g() {
        int iB = IncodeWelcome.a.b();
        int iB2 = IncodeWelcome.a.b();
        int iB3 = IncodeWelcome.a.b();
        return (Integer) e(-951383871, IncodeWelcome.a.b(), iB3, iB, iB2, new Object[]{this}, 951383871);
    }

    public final f c() {
        int iB = IncodeWelcome.a.b();
        int iB2 = IncodeWelcome.a.b();
        int iB3 = IncodeWelcome.a.b();
        return (f) e(-1494803683, IncodeWelcome.a.b(), iB3, iB, iB2, new Object[]{this}, 1494803684);
    }
}
