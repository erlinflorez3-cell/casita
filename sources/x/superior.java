package x;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import c0.misplace;
import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;

/* JADX INFO: loaded from: classes2.dex */
public final class superior implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ apparatus f28420a;

    public superior(apparatus apparatusVar) {
        this.f28420a = apparatusVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        apparatus apparatusVar = this.f28420a;
        if (apparatusVar.f28417f) {
            if (apparatusVar.f28412a == AutomaticUpdateAnalysis.FOREGROUND) {
                misplace misplaceVar = apparatusVar.f28415d;
                r0.apparatus apparatusVar2 = misplaceVar.f2466a;
                String str = (String) apparatusVar2.f28260b.invoke();
                apparatusVar2.f28262d = str;
                if (str == null) {
                    str = (String) apparatusVar2.f28260b.invoke();
                }
                apparatusVar2.f28263e = str;
                misplaceVar.a(new k0.pair(apparatusVar2.f28261c, apparatusVar2.f28262d, str, apparatusVar2.f28264f, apparatusVar2.f28259a));
            }
            p.tongue tongueVar = this.f28420a.f28414c.f19854b;
            if (tongueVar != null) {
                tongueVar.f28236a.a();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        apparatus apparatusVar = this.f28420a;
        apparatusVar.f28417f = true;
        p.tongue tongueVar = apparatusVar.f28414c.f19854b;
        if (tongueVar != null) {
            tongueVar.f28236a.b();
        }
    }
}
