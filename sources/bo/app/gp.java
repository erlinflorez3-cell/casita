package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gp extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(File file) {
        super(0);
        this.f769a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Deleting lru image cache directory at: " + this.f769a.getAbsolutePath();
    }
}
