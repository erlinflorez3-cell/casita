package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class be0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f273a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(String str) {
        super(0);
        this.f273a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Encountered unexpected exception while parsing stored triggered action local assets on remote asset '"), this.f273a, '\'');
    }
}
