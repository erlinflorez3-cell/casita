package com.ts.coresdk.a.b;

import android.content.Context;
import com.ts.coresdk.TSCall;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements CallAdapter<T, TSCall<T>> {
    private final Context cv;
    private final Type cw;

    public a(Context context, Type type) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(type, "");
        this.cv = context;
        this.cw = type;
    }

    @Override // retrofit2.CallAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TSCall<T> adapt(Call<T> call) {
        Intrinsics.checkNotNullParameter(call, "");
        return new b(this.cv, call);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.cw;
    }
}
