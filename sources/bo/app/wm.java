package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wm extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(String str) {
        super(0);
        this.f2158a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Server card is marked as removed. Removing from card storage with id: " + this.f2158a;
    }
}
