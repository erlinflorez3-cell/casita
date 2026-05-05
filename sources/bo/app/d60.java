package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(int i2) {
        super(0);
        this.f463a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Notification permission request count is " + this.f463a + ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'";
    }
}
