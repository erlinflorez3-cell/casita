package bo.app;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oa extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f1431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(Intent intent) {
        super(0);
        this.f1431a = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "BrazeFlushPushDeliveryReceiver received intent: " + this.f1431a.getAction();
    }
}
