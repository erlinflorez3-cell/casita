package o.by;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
final class f extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21846b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21847c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.en.b f21848a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f21849d;

    f(Context context, o.en.b bVar) {
        this.f21849d = context;
        this.f21848a = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = f21847c;
        int i4 = ((121 | i3) << 1) - (i3 ^ 121);
        f21846b = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = {this.f21848a};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i5 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i5;
            ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime, objArr, iUptimeMillis, 568976490, priority, i5)).e().a(this.f21849d);
            int i6 = 56 / 0;
        } else {
            Object[] objArr2 = {this.f21848a};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int priority2 = Thread.currentThread().getPriority();
            int i7 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i7;
            ((o.fm.g) o.en.b.a(-568976488, elapsedCpuTime2, objArr2, iUptimeMillis2, 568976490, priority2, i7)).e().a(this.f21849d);
        }
        int i8 = f21847c + 121;
        f21846b = i8 % 128;
        int i9 = i8 % 2;
    }
}
