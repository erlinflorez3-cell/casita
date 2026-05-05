package n;

import com.cleafy.mobile.detection.agent.configuration.EmulatorDebugAnalysis;
import kotlin.Lazy;
import kotlin.LazyKt;

/* JADX INFO: loaded from: classes6.dex */
public final class slide {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apparatus f19882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final taste f19883b;

    public slide(c.civilian civilianVar, s.apparatus apparatusVar) {
        Lazy lazy = LazyKt.lazy(misplace.f19880a);
        this.f19882a = civilianVar.f2448b.f2794f == EmulatorDebugAnalysis.ADVANCED ? new apparatus(civilianVar.f2449c, (gregarious) lazy.getValue()) : null;
        this.f19883b = new taste(civilianVar.f2448b.f2794f != EmulatorDebugAnalysis.NONE, (gregarious) lazy.getValue(), new fabricate(civilianVar.f2449c), apparatusVar.f28277a);
    }
}
