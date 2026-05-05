package y;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import z.tongue;

/* JADX INFO: loaded from: classes2.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tongue f28463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28464b = "";

    public superior(tongue tongueVar) {
        this.f28463a = tongueVar;
    }

    public final void a(Activity activity) {
        String name = activity.getClass().getName();
        if (Intrinsics.areEqual(this.f28464b, name)) {
            return;
        }
        String str = "Updated location to " + name;
        this.f28464b = name;
        tongue tongueVar = this.f28463a;
        BuildersKt__Builders_commonKt.launch$default(tongueVar.f28503d, null, null, new z.superior(tongueVar, name, null), 3, null);
    }
}
