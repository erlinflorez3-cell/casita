package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ea extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(File file) {
        super(0);
        this.f557a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot delete SharedPreferences that does not exist. Path: " + this.f557a.getAbsolutePath();
    }
}
