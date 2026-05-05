package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ib0 {
    public static int a() {
        return vb0.f2032f;
    }

    public static String a(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        return "com.braze.storage.server_config." + apiKey;
    }

    public static int b() {
        return vb0.f2031e;
    }
}
