package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zp extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(String str) {
        super(0);
        this.f2422a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to render url into view. Url: " + this.f2422a;
    }
}
