package bo.app;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f1037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(Class cls, HashSet hashSet) {
        super(0);
        this.f1036a = cls;
        this.f1037b = hashSet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Triggering " + this.f1036a.getName() + " on " + this.f1037b.size() + " subscribers.";
    }
}
