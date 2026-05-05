package com.incode.welcome_sdk.commons.httpinterceptors;

import com.incode.welcome_sdk.commons.exceptions.IncodeHttpException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5251a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5252e = 0;

    public static final /* synthetic */ Throwable c(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5252e + 51;
        f5251a = i3 % 128;
        if (i3 % 2 != 0) {
            return a(th);
        }
        a(th);
        throw null;
    }

    private static final Throwable a(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5251a;
        int i4 = i3 + 55;
        f5252e = i4 % 128;
        int i5 = i4 % 2;
        if (th instanceof HttpException) {
            return new IncodeHttpException(((HttpException) th).response());
        }
        int i6 = i3 + 41;
        f5252e = i6 % 128;
        if (i6 % 2 == 0) {
            return th;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
