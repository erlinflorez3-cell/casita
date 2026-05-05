package bo.app;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bj0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(File file, String str) {
        super(0);
        this.f289a = file;
        this.f290b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Error during unpack of zip file ").append(this.f289a.getAbsolutePath()).append(" to "), this.f290b, '.');
    }
}
