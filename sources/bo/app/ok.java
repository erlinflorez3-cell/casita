package bo.app;

import com.braze.enums.NotificationSubscriptionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ok extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f1450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(NotificationSubscriptionType notificationSubscriptionType) {
        super(0);
        this.f1450a = notificationSubscriptionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set push notification subscription to: " + this.f1450a;
    }
}
