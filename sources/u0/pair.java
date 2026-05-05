package u0;

import f.superior;
import java.io.IOException;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import v.civilian;

/* JADX INFO: loaded from: classes2.dex */
public final class pair implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final civilian f28335a;

    public pair(civilian civilianVar) {
        this.f28335a = civilianVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        for (Map.Entry entry : this.f28335a.a().f19694f.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2.length() > 0) {
                builderNewBuilder.addHeader(str, str2);
            }
        }
        Request requestBuild = builderNewBuilder.build();
        Response responseProceed = chain.proceed(requestBuild);
        try {
            ResponseBody responseBodyPeekBody = responseProceed.body() != null ? responseProceed.peekBody(Long.MAX_VALUE) : null;
            civilian civilianVar = this.f28335a;
            civilianVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(civilianVar.f28341e, null, null, new v.pair(civilianVar, new superior(requestBuild, responseProceed, responseBodyPeekBody), null), 3, null);
        } catch (Exception unused) {
        }
        return responseProceed;
    }
}
