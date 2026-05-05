package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f2379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(File file) {
        super(0);
        this.f2379a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Retrieving image from local path: " + this.f2379a.getAbsolutePath();
    }
}
