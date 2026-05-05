package bo.app;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(List list) {
        super(0);
        this.f756a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Removing non-string keys from map. Removed keys: " + this.f756a;
    }
}
