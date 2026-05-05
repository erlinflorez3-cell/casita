package bo.app;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f2003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(Map.Entry entry, long j2) {
        super(0);
        this.f2003a = entry;
        this.f2004b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Evicting push id key " + this.f2003a + " based on cutoff: " + this.f2004b;
    }
}
