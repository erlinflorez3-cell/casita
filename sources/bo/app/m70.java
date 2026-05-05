package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class m70 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(String str, Ref.ObjectRef objectRef) {
        super(0);
        this.f1262a = str;
        this.f1263b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbAppend = new StringBuilder("Could not find ").append(this.f1262a).append(" on ");
        Class cls = (Class) this.f1263b.element;
        return sbAppend.append(cls != null ? cls.getName() : null).toString();
    }
}
