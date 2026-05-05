package a;

import com.cleafy.mobile.detection.agent.AgentDiagnostics;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pair implements AgentDiagnostics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70a = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71b = CollectionsKt.listOf("Agent not initialized.");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f72c = -1;

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final String getDeviceId() {
        return "";
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final List getErrors() {
        return this.f71b;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final int getFailedProbeSubmissions() {
        return 0;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final long getLastConfigurationUpdateTimestamp() {
        return this.f72c;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final List getProbeTraces() {
        return this.f70a;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnostics
    public final int getSuccessfulProbeSubmissions() {
        return 0;
    }
}
