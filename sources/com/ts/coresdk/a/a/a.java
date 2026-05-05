package com.ts.coresdk.a.a;

import com.biocatch.client.android.sdk.core.Constants;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Interceptor {
    private final boolean cp;
    private final Map<String, String> cq;

    /* JADX INFO: renamed from: com.ts.coresdk.a.a.a$a */
    public static final class C0314a extends RequestBody {
        final /* synthetic */ RequestBody cr;

        C0314a(RequestBody requestBody) {
            this.cr = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.cr.contentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Intrinsics.checkNotNullParameter(bufferedSink, "");
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(bufferedSink));
            this.cr.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
        }
    }

    public a(boolean z2, Map<String, String> map) {
        this.cp = z2;
        this.cq = map;
    }

    private final RequestBody a(RequestBody requestBody) {
        return new C0314a(requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Intrinsics.checkNotNullExpressionValue(request, "");
        if (request.body() == null || request.header("Content-Encoding") != null) {
            Response responseProceed = chain.proceed(request);
            Intrinsics.checkNotNullExpressionValue(responseProceed, "");
            return responseProceed;
        }
        Request.Builder builderHeader = request.newBuilder().header("Accept", Constants.WUP_CONTENT_TYPE).header("Content-Type", Constants.WUP_CONTENT_TYPE);
        String property = System.getProperty("http.agent");
        if (property != null) {
            Intrinsics.checkNotNullExpressionValue(property, "");
            builderHeader.header("User-Agent", property);
        }
        if (this.cp) {
            Request.Builder builderHeader2 = builderHeader.header("Content-Encoding", "gzip").header("Accept-Encoding", "gzip, deflate, br");
            String strMethod = request.method();
            RequestBody requestBodyBody = request.body();
            Intrinsics.checkNotNull(requestBodyBody);
            builderHeader2.method(strMethod, a(requestBodyBody));
        }
        Map<String, String> map = this.cq;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderHeader.header(entry.getKey(), entry.getValue());
            }
        }
        Request requestBuild = builderHeader.build();
        Intrinsics.checkNotNullExpressionValue(requestBuild, "");
        Response responseProceed2 = chain.proceed(requestBuild);
        Intrinsics.checkNotNullExpressionValue(responseProceed2, "");
        return responseProceed2;
    }
}
