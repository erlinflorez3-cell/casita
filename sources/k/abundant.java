package k;

import android.app.Application;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class abundant extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f19810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abundant(Application application) {
        super(2);
        this.f19810a = application;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(j.gregarious.a((e0.pair) obj, this.f19810a, (String) obj2));
    }
}
