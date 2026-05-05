package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(String str, Object obj) {
        super(0);
        this.f2403a = str;
        this.f2404b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Using runtime override value for key: '" + this.f2403a + "' and value: '" + this.f2404b + '\'';
    }
}
