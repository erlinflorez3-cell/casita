package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fa extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(File file) {
        super(0);
        this.f630a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "SharedPreferences file is expected to end in .xml. Path: " + this.f630a.getAbsolutePath();
    }
}
