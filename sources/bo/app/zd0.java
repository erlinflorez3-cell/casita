package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class zd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd0(String str, Ref.ObjectRef objectRef) {
        super(0);
        this.f2386a = objectRef;
        this.f2387b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Using file extension " + ((String) this.f2386a.element) + " for remote asset url: " + this.f2387b;
    }
}
