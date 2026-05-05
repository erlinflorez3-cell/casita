package com.incode.welcome_sdk.commons.extensions;

import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class ThrowableExtensionsKt {
    private static final int HTTP_ERROR_400 = 400;

    /* JADX INFO: renamed from: b */
    private static int f5092b = 1;

    /* JADX INFO: renamed from: e */
    private static int f5093e = 0;

    public static final boolean isNoConnectivityException(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5093e + 15;
        f5092b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            boolean z2 = th instanceof NoConnectivityException;
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof NoConnectivityException) {
            return true;
        }
        int i4 = f5093e + 107;
        f5092b = i4 % 128;
        int i5 = i4 % 2;
        if (th.getCause() instanceof NoConnectivityException) {
            return true;
        }
        int i6 = f5093e + 73;
        f5092b = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final boolean isSocketOrDnsError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5092b + 111;
        f5093e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            boolean z2 = th instanceof UnknownHostException;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof UnknownHostException) {
            return true;
        }
        int i4 = f5093e + 35;
        f5092b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
            if (th instanceof ConnectException) {
                return true;
            }
        } else if (th instanceof ConnectException) {
            return true;
        }
        return th instanceof SocketTimeoutException;
    }

    public static final boolean isHttpError(Throwable th, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof HttpException) {
            int i4 = f5092b + 117;
            f5093e = i4 % 128;
            HttpException httpException = (HttpException) th;
            if (i4 % 2 != 0) {
                httpException.code();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (httpException.code() == i2) {
                return true;
            }
        }
        int i5 = f5093e + 59;
        f5092b = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static final boolean isBadRequestError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5092b + 73;
        f5093e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (!(th instanceof HttpException) || ((HttpException) th).code() != 400) {
            return false;
        }
        int i5 = f5093e + 49;
        f5092b = i5 % 128;
        return i5 % 2 != 0;
    }

    public static final String getStackTraceAsString(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f5092b + 79;
        f5093e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        String strJoinToString$default = CollectionsKt.joinToString$default(ArraysKt.take(stackTrace, 5), "] [", "[", "]", 0, null, null, 56, null);
        int i5 = f5092b + 73;
        f5093e = i5 % 128;
        int i6 = i5 % 2;
        return strJoinToString$default;
    }
}
