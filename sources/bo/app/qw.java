package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(Class cls, Object obj) {
        super(0);
        this.f1629a = cls;
        this.f1630b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not publishing event class: " + this.f1629a.getName() + " and message: " + this.f1630b + " because events are not allowed to send yet. Adding to replay cache.";
    }
}
