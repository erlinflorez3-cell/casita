package x;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import c0.misplace;
import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;
import kotlin.Lazy;
import kotlin.LazyKt;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutomaticUpdateAnalysis f28412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.tongue f28414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final misplace f28415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LifecycleOwner f28416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f28418g;

    public apparatus(AutomaticUpdateAnalysis automaticUpdateAnalysis, boolean z2, l.tongue tongueVar, misplace misplaceVar) {
        LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.Companion.get();
        this.f28412a = automaticUpdateAnalysis;
        this.f28413b = z2;
        this.f28414c = tongueVar;
        this.f28415d = misplaceVar;
        this.f28416e = lifecycleOwner;
        this.f28418g = LazyKt.lazy(new tongue(this));
    }
}
