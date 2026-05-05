package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class et extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        super(0);
        this.f590a = objectRef;
        this.f591b = objectRef2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Handling full event on blank line. lastEventType: '").append((String) this.f590a.element).append("' \ndata: '"), (String) this.f591b.element, '\'');
    }
}
