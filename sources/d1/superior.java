package d1;

import android.app.Application;
import i1.muscle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class superior extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f18438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(Application application) {
        super(0);
        this.f18438a = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return muscle.a(this.f18438a);
    }
}
