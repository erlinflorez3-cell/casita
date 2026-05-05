package com.ts.coresdk.a.b;

import android.content.Context;
import com.ts.coresdk.TSCall;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements CallAdapter<T, TSCall<T>> {
    private final Context cD;
    private final Type cE;
    private final List<String> cF;

    public d(Context context, Type type, List<String> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(type, "");
        this.cD = context;
        this.cE = type;
        this.cF = list;
    }

    @Override // retrofit2.CallAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TSCall<T> adapt(Call<T> call) {
        Intrinsics.checkNotNullParameter(call, "");
        String string = call.request().url().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        List<String> list = this.cF;
        if (list != null) {
            for (String str : list) {
                if (str.length() > 0 && StringsKt.contains$default((CharSequence) string, (CharSequence) str, false, 2, (Object) null)) {
                    return new c(this.cD, call);
                }
            }
        }
        return new f(this.cD, call, System.currentTimeMillis());
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.cE;
    }
}
