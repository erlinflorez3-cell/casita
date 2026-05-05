package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ud0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f1935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(File file) {
        super(0);
        this.f1935a = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Deleting obsolete asset '" + this.f1935a.getPath() + "' from filesystem.";
    }
}
