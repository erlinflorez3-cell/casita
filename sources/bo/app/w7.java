package bo.app;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w7 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(Intent intent) {
        super(0);
        this.f2108a = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unknown intent " + this.f2108a + " received. Doing nothing.";
    }
}
