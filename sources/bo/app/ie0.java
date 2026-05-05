package bo.app;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ie0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie0(String str, Map map) {
        super(0);
        this.f901a = str;
        this.f902b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not caching " + this.f901a + " due to headers " + this.f902b;
    }
}
