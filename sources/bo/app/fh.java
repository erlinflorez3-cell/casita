package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(String str) {
        super(0);
        this.f672a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Processing server response payload for user with id: " + this.f672a;
    }
}
