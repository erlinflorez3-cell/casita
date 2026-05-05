package w;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import b0.taste;
import kotlin.Unit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ apparatus f28373a;

    public tongue(apparatus apparatusVar) {
        this.f28373a = apparatusVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        taste tasteVar = this.f28373a.f28367c;
        if (tasteVar != null) {
            synchronized (tasteVar.f148g) {
                tasteVar.f148g.remove(activity);
                tasteVar.f149h.remove(activity);
                tasteVar.f150i.remove(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        taste tasteVar = this.f28373a.f28367c;
        if (tasteVar != null) {
            synchronized (tasteVar.f148g) {
                tasteVar.f148g.put(activity, Boolean.FALSE);
                Long l2 = (Long) tasteVar.f150i.get(activity);
                if ((l2 != null ? l2.longValue() : 0L) > System.currentTimeMillis()) {
                    BuildersKt__Builders_commonKt.launch$default(tasteVar.f145d, null, null, new b0.civilian(tasteVar, null), 3, null);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        taste tasteVar = this.f28373a.f28367c;
        if (tasteVar != null) {
            synchronized (tasteVar.f148g) {
                tasteVar.f148g.put(activity, Boolean.TRUE);
                Window window = activity.getWindow();
                Window.Callback callback = window.getCallback();
                if (!(callback instanceof b0.superior)) {
                    b0.apparatus apparatusVar = new b0.apparatus(callback, tasteVar, activity);
                    window.setCallback(apparatusVar);
                    tasteVar.f151j.put(activity, apparatusVar);
                }
                tasteVar.f150i.put(activity, Long.valueOf(System.currentTimeMillis() + ((long) 2000)));
                Unit unit = Unit.INSTANCE;
            }
        }
        y.superior superiorVar = this.f28373a.f28368d;
        if (superiorVar != null) {
            superiorVar.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
