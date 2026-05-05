package bo.app;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f1997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(ComponentName componentName, Intent intent) {
        super(0);
        this.f1996a = componentName;
        this.f1997b = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Sent intent with component " + this.f1996a + " and explicit intent " + this.f1997b;
    }
}
