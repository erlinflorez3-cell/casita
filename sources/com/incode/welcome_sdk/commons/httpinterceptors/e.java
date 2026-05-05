package com.incode.welcome_sdk.commons.httpinterceptors;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public final class e implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5205b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5206d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Application f5207c;

    @Inject
    public e(Application application) {
        this.f5207c = application;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        int i2 = 2 % 2;
        int i3 = f5206d + 95;
        f5205b = i3 % 128;
        if (i3 % 2 == 0) {
            if (!c(this.f5207c)) {
                throw new NoConnectivityException();
            }
            try {
                Response responseProceed = chain.proceed(chain.request().newBuilder().build());
                int i4 = f5206d + 31;
                f5205b = i4 % 128;
                int i5 = i4 % 2;
                return responseProceed;
            } catch (SocketTimeoutException unused) {
                throw new NoConnectivityException();
            }
        }
        c(this.f5207c);
        throw null;
    }

    public static boolean c(Context context) {
        int i2 = 2 % 2;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int i3 = f5206d + 109;
            f5205b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f5206d + 17;
        f5205b = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
