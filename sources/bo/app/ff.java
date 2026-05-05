package bo.app;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ff extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Activity activity) {
        super(0);
        this.f668a = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Opened session with activity: " + this.f668a.getLocalClassName();
    }
}
