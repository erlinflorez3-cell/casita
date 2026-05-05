package com.ts.coresdk.a.b;

import android.content.Context;
import com.ts.coresdk.TSCall;
import com.ts.coresdk.TSCallback;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.TSNetworkResponse;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class f<T> implements TSCall<T> {
    private final Context cI;
    private final Call<T> cJ;
    private final long cK;

    public static final class a implements Callback<T> {
        final /* synthetic */ TSCallback<T> cL;
        final /* synthetic */ f<T> cM;

        a(TSCallback<T> tSCallback, f<T> fVar) {
            this.cL = tSCallback;
            this.cM = fVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.cL.error(th instanceof IOException ? new TSNetworkResponse.TSNetworkError((IOException) th) : new TSNetworkResponse.UnknownError(null, th, 1, null));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            try {
                this.cL.success(this.cM.a(response));
            } catch (Throwable th) {
                this.cL.error(new TSNetworkResponse.UnknownError(null, th, 1, null));
            }
        }
    }

    public f(Context context, Call<T> call, long j2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(call, "");
        this.cI = context;
        this.cJ = call;
        this.cK = j2;
    }

    private final TSNetworkResponse a(Throwable th) {
        TSLog.d(this.cI, com.ts.coresdk.logger.c.a.INSTANCE, th + ".message");
        return th instanceof IOException ? new TSNetworkResponse.TSNetworkError((IOException) th) : new TSNetworkResponse.UnknownError(null, th);
    }

    public final TSNetworkResponse<T> a(Response<T> response) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.cK;
        T tBody = response.body();
        int iCode = response.code();
        ResponseBody responseBodyErrorBody = response.errorBody();
        try {
            return response.isSuccessful() ? new TSNetworkResponse.Success(tBody, response.headers().toMultimap(), jCurrentTimeMillis) : responseBodyErrorBody != null ? new TSNetworkResponse.ApiError(responseBodyErrorBody, iCode) : new TSNetworkResponse.UnknownError(Integer.valueOf(iCode), null);
        } catch (Throwable th) {
            return new TSNetworkResponse.UnknownError(Integer.valueOf(iCode), th);
        }
    }

    @Override // com.ts.coresdk.TSCall
    public void cancel() {
        this.cJ.cancel();
    }

    @Override // com.ts.coresdk.TSCall
    public TSCall<T> clone() {
        return new f(this.cI, this.cJ, System.currentTimeMillis());
    }

    @Override // com.ts.coresdk.TSCall
    public void enqueue(TSCallback<T> tSCallback) {
        Intrinsics.checkNotNullParameter(tSCallback, "");
        try {
            this.cJ.enqueue(new a(tSCallback, this));
        } catch (Throwable th) {
            tSCallback.error(a(th));
        }
    }

    @Override // com.ts.coresdk.TSCall
    public TSNetworkResponse<T> execute() {
        try {
            Response<T> responseExecute = this.cJ.execute();
            Intrinsics.checkNotNullExpressionValue(responseExecute, "");
            return a(responseExecute);
        } catch (Throwable th) {
            return a(th);
        }
    }

    @Override // com.ts.coresdk.TSCall
    public boolean isCanceled() {
        return this.cJ.isCanceled();
    }

    @Override // com.ts.coresdk.TSCall
    public boolean isExecuted() {
        return this.cJ.isExecuted();
    }

    @Override // com.ts.coresdk.TSCall
    public Request request() {
        Request request = this.cJ.request();
        Intrinsics.checkNotNullExpressionValue(request, "");
        return request;
    }
}
