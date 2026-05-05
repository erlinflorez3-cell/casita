package bo.app;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f1566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(String str, Set set, boolean z2) {
        super(0);
        this.f1565a = str;
        this.f1566b = set;
        this.f1567c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Checking event key [" + this.f1565a + "] against ephemeral event list " + this.f1566b + " and got match?: " + this.f1567c;
    }
}
