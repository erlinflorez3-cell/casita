package bo.app;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f307a = (int) TimeUnit.SECONDS.toMillis(5);

    public static final o40 a() {
        return new o40(new b00(f307a));
    }
}
