package com.incode.welcome_sdk.commons.httpinterceptors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a */
    private static int f5256a = 1;

    /* JADX INFO: renamed from: b */
    private static int f5257b = 0;

    /* JADX INFO: renamed from: d */
    private final CallAdapter.Factory f5258d;

    public o(CallAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "");
        this.f5258d = factory;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f5256a + 31;
        f5257b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(annotationArr, "");
            Intrinsics.checkNotNullParameter(retrofit, "");
            this.f5258d.get(type, annotationArr, retrofit);
            throw null;
        }
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        CallAdapter<?, ?> callAdapter = this.f5258d.get(type, annotationArr, retrofit);
        if (callAdapter != null) {
            return new c(callAdapter);
        }
        int i4 = f5256a + 47;
        f5257b = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
