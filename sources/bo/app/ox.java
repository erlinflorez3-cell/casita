package bo.app;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ox {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1465g = (int) TimeUnit.SECONDS.toMillis(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f1470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1471f;

    public /* synthetic */ ox(int i2, int i3, int i4) {
        this(i2, f1465g, i3, i4);
    }

    public ox(int i2, int i3, int i4, int i5) {
        this.f1466a = i2;
        this.f1467b = i3;
        this.f1468c = i4;
        this.f1469d = i5;
        this.f1470e = RandomKt.Random(SystemClock.uptimeMillis());
    }

    public final String toString() {
        return "ExponentialBackoffStateProvider(maxSleepDurationMs=" + this.f1466a + ", defaultNormalFlushIntervalMs=" + this.f1467b + ", minSleepDurationMs=" + this.f1468c + ", scaleFactor=" + this.f1469d + ", randomSleepDurationGenerator=" + this.f1470e + ", lastSleepDurationMs=" + this.f1471f + ", isBackingOff=" + (this.f1471f != 0) + ')';
    }
}
