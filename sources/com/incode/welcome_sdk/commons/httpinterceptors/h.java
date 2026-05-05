package com.incode.welcome_sdk.commons.httpinterceptors;

import com.incode.welcome_sdk.data.remote.e;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Interceptor {

    /* JADX INFO: renamed from: a */
    private static int f5228a = 0;

    /* JADX INFO: renamed from: b */
    private static int f5229b = 1;

    /* JADX INFO: renamed from: d */
    private e.InterfaceC0239e f5230d;

    public h(e.InterfaceC0239e interfaceC0239e) {
        this.f5230d = interfaceC0239e;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String strHeader;
        int i2 = 2 % 2;
        int i3 = f5229b + 5;
        f5228a = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0 ? (strHeader = chain.request().header("internal_request_id")) != null : (strHeader = chain.request().header("internal_request_id")) != null) {
            try {
                i4 = Integer.parseInt(strHeader);
                int i5 = f5229b + 53;
                f5228a = i5 % 128;
                int i6 = i5 % 2;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        Response responseProceed = chain.proceed(chain.request().newBuilder().removeHeader("internal_request_id").build());
        return responseProceed.newBuilder().body(new com.incode.welcome_sdk.data.remote.e(responseProceed.body(), i4, this.f5230d)).build();
    }
}
