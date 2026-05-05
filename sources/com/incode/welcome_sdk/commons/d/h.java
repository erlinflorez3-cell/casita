package com.incode.welcome_sdk.commons.d;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.incode.model_face_recognition.R;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.welcome_sdk.IncodeWelcome$getWrappedDelayedOnboardingListener$1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4794b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4795c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecogKitAndroid f4796d;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = ~i6;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = (~(i6 | i5)) | (~(i8 | i10));
        int i13 = ~(i10 | i3 | i5);
        int i14 = i3 + i5 + i4 + ((-194346734) * i7) + (9035316 * i2);
        int i15 = i14 * i14;
        int i16 = (((-787818500) * i3) - 443744256) + ((-1492047866) * i5) + (352114683 * i11) + (i12 * (-352114683)) + ((-352114683) * i13) + ((-1139933184) * i4) + (1190920192 * i7) + (1456996352 * i2) + ((-1774911488) * i15);
        int i17 = (i3 * 1174986172) + 1294669563 + (i5 * 1174986598) + (i11 * (-213)) + (i12 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i13 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i4 * 1174986385) + (i7 * (-1060063438)) + (i2 * 107475828) + (i15 * 168099840);
        return i16 + ((i17 * i17) * 40566784) != 1 ? c(objArr) : e(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = f4794b + 123;
        f4795c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {hVar, str, Integer.valueOf(iIntValue)};
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        h hVar2 = (h) c(IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1819308863, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -1819308862, iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), objArr2);
        int i5 = f4795c + 63;
        f4794b = i5 % 128;
        if (i5 % 2 == 0) {
            return hVar2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final /* synthetic */ g c(int i2) {
        int i3 = 2 % 2;
        int i4 = f4794b + 43;
        f4795c = i4 % 128;
        h hVarA = a(i2, i4 % 2 == 0 ? 1 : 0);
        int i5 = f4794b + 111;
        f4795c = i5 % 128;
        int i6 = i5 % 2;
        return hVarA;
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final /* synthetic */ g e(String str) {
        int i2 = 2 % 2;
        int i3 = f4795c + 91;
        f4794b = i3 % 128;
        return c(str, i3 % 2 != 0);
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final String e() {
        int i2 = 2 % 2;
        int i3 = f4795c;
        int i4 = i3 + 101;
        f4794b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i3 + 37;
        f4794b = i5 % 128;
        if (i5 % 2 == 0) {
            return "incode_fr_v2.encnnmodelv2";
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f4795c;
        int i4 = i3 + 89;
        f4794b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 7;
        f4794b = i6 % 128;
        int i7 = i6 % 2;
        return "e0597110062fc2d0f7ca2a36990a5452099802d9520bec93d76e1cb385cfeeb2";
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final int d() {
        int i2 = 2 % 2;
        int i3 = f4794b + 109;
        f4795c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.raw.incode_fr_v2;
        int i6 = f4795c + 23;
        f4794b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private h c(String str, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4796d = new RecogKitAndroid(str, false);
        int i3 = f4795c + 77;
        f4794b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        return this;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws RecogKitProcessException {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        RecogKitAndroid recogKitAndroid = null;
        try {
            RecogKitAndroid recogKitAndroid2 = hVar.f4796d;
            if (recogKitAndroid2 == null) {
                int i3 = f4794b + 69;
                f4795c = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = 22 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                recogKitAndroid2 = null;
            }
            recogKitAndroid2.createTemplateSet(str, iIntValue);
        } catch (Exception unused) {
            RecogKitAndroid recogKitAndroid3 = hVar.f4796d;
            if (recogKitAndroid3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f4794b + 95;
                f4795c = i5 % 128;
                int i6 = i5 % 2;
            } else {
                recogKitAndroid = recogKitAndroid3;
            }
            recogKitAndroid.clear(str);
        }
        return hVar;
    }

    private h a(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f4794b + 25;
        f4795c = i5 % 128;
        RecogKitAndroid recogKitAndroid = null;
        if (i5 % 2 != 0) {
            RecogKitAndroid recogKitAndroid2 = this.f4796d;
            if (recogKitAndroid2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = f4795c + 65;
                f4794b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                recogKitAndroid = recogKitAndroid2;
            }
            recogKitAndroid.setNumThreads(i2, 0);
            return this;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final RecogKitAndroid a() {
        int i2 = 2 % 2;
        RecogKitAndroid recogKitAndroid = this.f4796d;
        if (recogKitAndroid == null) {
            int i3 = f4795c + 39;
            f4794b = i3 % 128;
            int i4 = i3 % 2;
            recogKitAndroid = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 != 0) {
                throw null;
            }
        }
        int i5 = f4794b + 21;
        f4795c = i5 % 128;
        int i6 = i5 % 2;
        return recogKitAndroid;
    }

    @Override // com.incode.welcome_sdk.commons.d.g
    public final /* synthetic */ g c(String str, int i2) {
        Object[] objArr = {this, str, Integer.valueOf(i2)};
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        return (g) c(IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -65099975, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 65099975, iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), objArr);
    }

    private h b(String str, int i2) {
        Object[] objArr = {this, str, Integer.valueOf(i2)};
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        return (h) c(IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1819308863, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -1819308862, iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), objArr);
    }
}
