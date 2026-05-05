package bo.app;

import com.braze.images.DefaultBrazeImageLoader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jp extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DefaultBrazeImageLoader f1028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        super(0);
        this.f1027a = str;
        this.f1028b = defaultBrazeImageLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got bitmap from mem cache for key " + this.f1027a + "\nMemory cache stats: " + this.f1028b.getMemoryCache();
    }
}
