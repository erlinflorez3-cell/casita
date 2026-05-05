package f1;

import com.cleafy.mobile.detection.agent.AgentDiagnostics;
import com.cleafy.mobile.detection.agent.AgentDiagnosticsProvider;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class apparatus implements AgentDiagnosticsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.apparatus f18521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final superior f18522b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18527g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18523c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18524d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f18525e = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18528h = -1;

    public apparatus(r0.apparatus apparatusVar, superior superiorVar) {
        this.f18521a = apparatusVar;
        this.f18522b = superiorVar;
    }

    @Override // com.cleafy.mobile.detection.agent.AgentDiagnosticsProvider
    public final AgentDiagnostics getAgentDiagnostics() {
        return new pair(this.f18521a.f28259a, CollectionsKt.toList(this.f18523c), CollectionsKt.toList(this.f18524d), this.f18526f, this.f18527g, this.f18528h);
    }
}
