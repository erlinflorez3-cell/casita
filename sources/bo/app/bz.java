package bo.app;

import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bz extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(Task task) {
        super(0);
        this.f304a = task;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + this.f304a.getException();
    }
}
