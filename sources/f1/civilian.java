package f1;

import com.cleafy.mobile.detection.agent.ProbeTrace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class civilian implements ProbeTrace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18533e;

    public civilian(long j2, String str, String str2, String str3, int i2) {
        this.f18529a = j2;
        this.f18530b = str;
        this.f18531c = str2;
        this.f18532d = str3;
        this.f18533e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civilian)) {
            return false;
        }
        civilian civilianVar = (civilian) obj;
        return this.f18529a == civilianVar.f18529a && Intrinsics.areEqual(this.f18530b, civilianVar.f18530b) && Intrinsics.areEqual(this.f18531c, civilianVar.f18531c) && Intrinsics.areEqual(this.f18532d, civilianVar.f18532d) && this.f18533e == civilianVar.f18533e;
    }

    @Override // com.cleafy.mobile.detection.agent.ProbeTrace
    public final String getEventId() {
        return this.f18531c;
    }

    @Override // com.cleafy.mobile.detection.agent.ProbeTrace
    public final String getProbeType() {
        return this.f18532d;
    }

    @Override // com.cleafy.mobile.detection.agent.ProbeTrace
    public final String getSessionId() {
        return this.f18530b;
    }

    @Override // com.cleafy.mobile.detection.agent.ProbeTrace
    public final int getStatusCode() {
        return this.f18533e;
    }

    @Override // com.cleafy.mobile.detection.agent.ProbeTrace
    public final long getTimestamp() {
        return this.f18529a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18533e) + d0.superior.a(this.f18532d, d0.superior.a(this.f18531c, d0.superior.a(this.f18530b, Long.hashCode(this.f18529a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ProbeTraceImpl(timestamp=" + this.f18529a + ", sessionId=" + this.f18530b + ", eventId=" + this.f18531c + ", probeType=" + this.f18532d + ", statusCode=" + this.f18533e + ")";
    }
}
