package bo.app;

import android.content.SharedPreferences;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class rd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f1678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1680e;

    public rd0(int i2, int i3, SharedPreferences storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f1676a = i2;
        this.f1677b = i3;
        this.f1678c = storage;
        this.f1679d = storage.getLong("last_call_at_ms", 0L);
        this.f1680e = storage.getFloat("current_token_count", (float) a());
    }

    public final double a() {
        return RangesKt.coerceAtLeast(this.f1676a, 1);
    }

    public final double a(long j2) {
        return Math.min((((j2 - this.f1679d) / ((double) RangesKt.coerceAtLeast(this.f1677b, 1))) / ((double) 1000)) + this.f1680e, RangesKt.coerceAtLeast(this.f1676a, 1));
    }

    public final void b() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f1680e = a(jNowInMilliseconds);
        this.f1679d = jNowInMilliseconds;
        this.f1678c.edit().putLong("last_call_at_ms", this.f1679d).putFloat("current_token_count", (float) this.f1680e).apply();
        double d2 = this.f1680e;
        if (d2 < 1.0d) {
            return;
        }
        this.f1680e = d2 - ((double) 1);
    }

    public final long c() {
        this.f1680e = a(DateTimeUtils.nowInMilliseconds());
        this.f1678c.edit().putLong("last_call_at_ms", this.f1679d).putFloat("current_token_count", (float) this.f1680e).apply();
        double d2 = this.f1680e;
        if (d2 >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((((double) 1) - d2) * ((double) RangesKt.coerceAtLeast(this.f1677b, 1)) * ((double) 1000)));
    }

    public final String toString() {
        return "(capacity=" + RangesKt.coerceAtLeast(this.f1676a, 1) + ", refillRate=" + RangesKt.coerceAtLeast(this.f1677b, 1) + ", lastCallAt='" + DateTimeUtils.formatDateFromMillis$default(this.f1679d, null, null, 3, null) + "', currentTokenCount=" + a(DateTimeUtils.nowInMilliseconds()) + ')';
    }
}
