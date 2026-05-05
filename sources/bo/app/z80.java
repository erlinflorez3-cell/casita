package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a90 f2366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f2368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2370h;

    public z80(l00 request, long j2, long j3, a90 state, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2363a = request;
        this.f2364b = j2;
        this.f2365c = j3;
        this.f2366d = state;
        this.f2367e = i2;
        this.f2368f = num;
        this.f2369g = j3;
    }

    public final l00 a() {
        return this.f2363a;
    }

    public final String a(long j2) {
        return StringsKt.trimMargin$default("\n            |RequestInfo for " + this.f2363a.hashCode() + " \n            | at " + j2 + "\n            | request.target = " + ((tg) this.f2363a).e() + "\n            | nextAdvance = " + (this.f2364b - j2) + "\n            | createdAt = " + (this.f2365c - j2) + "\n            | state = " + this.f2366d + "\n            | lastStateMovedAt = " + (this.f2369g - j2) + "\n            | timesMovedToRetry = " + this.f2370h + "\n        ", null, 1, null);
    }

    public final void a(long j2, a90 newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f2366d != newState) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new x80(this, newState, j2), 2, (Object) null);
            this.f2369g = j2;
            this.f2366d = newState;
            if (newState == a90.PENDING_RETRY) {
                this.f2370h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new y80(j2, this), 2, (Object) null);
            }
        }
    }
}
