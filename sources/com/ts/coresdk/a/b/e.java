package com.ts.coresdk.a.b;

import android.content.Context;
import com.ts.coresdk.TSCall;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends CallAdapter.Factory {
    private final Context cG;
    private final List<String> cH;

    public e(Context context, List<String> list) {
        Intrinsics.checkNotNullParameter(context, "");
        this.cG = context;
        this.cH = list;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(type), TSCall.class)) {
            return new a(this.cG, String.class);
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        return parameterUpperBound != null ? new d(this.cG, parameterUpperBound, this.cH) : new a(this.cG, String.class);
    }
}
