package f1;

import com.cleafy.mobile.detection.agent.AgentDiagnostics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pair implements AgentDiagnostics {

    /* JADX INFO: renamed from: a */
    public final String f18534a;

    /* JADX INFO: renamed from: b */
    public final List f18535b;

    /* JADX INFO: renamed from: c */
    public final List f18536c;

    /* JADX INFO: renamed from: d */
    public final int f18537d;

    /* JADX INFO: renamed from: e */
    public final int f18538e;

    /* JADX INFO: renamed from: f */
    public final long f18539f;

    public pair(String str, List list, List list2, int i2, int i3, long j2) {
        this.f18534a = str;
        this.f18535b = list;
        this.f18536c = list2;
        this.f18537d = i2;
        this.f18538e = i3;
        this.f18539f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f18534a, pairVar.f18534a) && Intrinsics.areEqual(this.f18535b, pairVar.f18535b) && Intrinsics.areEqual(this.f18536c, pairVar.f18536c) && this.f18537d == pairVar.f18537d && this.f18538e == pairVar.f18538e && this.f18539f == pairVar.f18539f;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final String getDeviceId() {
        return this.f18534a;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final List getErrors() {
        return this.f18536c;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final int getFailedProbeSubmissions() {
        return this.f18538e;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final long getLastConfigurationUpdateTimestamp() {
        return this.f18539f;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final List getProbeTraces() {
        return this.f18535b;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final int getSuccessfulProbeSubmissions() {
        return this.f18537d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18539f) + ((Integer.hashCode(this.f18538e) + ((Integer.hashCode(this.f18537d) + ((this.f18536c.hashCode() + ((this.f18535b.hashCode() + (this.f18534a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AgentDiagnosticsImpl(deviceId=" + this.f18534a + ", probeTraces=" + this.f18535b + ", errors=" + this.f18536c + ", successfulProbeSubmissions=" + this.f18537d + ", failedProbeSubmissions=" + this.f18538e + ", lastConfigurationUpdateTimestamp=" + this.f18539f + ")";
    }
}
