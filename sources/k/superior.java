package k;

import android.app.Application;
import androidx.core.app.NotificationManagerCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class superior extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f19827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(Application application) {
        super(0);
        this.f19827a = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return NotificationManagerCompat.getEnabledListenerPackages(this.f19827a);
    }
}
