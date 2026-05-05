package com.ts.coresdk.a.a;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements HttpLoggingInterceptor.Logger {
    private final Context cs;
    private final ITSModuleInfo ct;

    public b(Context context, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        this.cs = context;
        this.ct = iTSModuleInfo;
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void log(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TSLog.d(this.cs, this.ct, "Server " + str);
    }
}
